package com.fyber.inneractive.sdk.ignite;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.a1;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h implements com.digitalturbine.ignite.authenticator.listeners.api.a, AuthenticationServiceListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f5431a;
    public IIgniteServiceAPI b;
    public long j;
    public String k;
    public d l;
    public com.digitalturbine.ignite.authenticator.listeners.internal.a m;
    public com.fyber.inneractive.sdk.config.global.r n;
    public l o;
    public final Bundle c = new Bundle();
    public boolean e = false;
    public boolean f = false;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public boolean h = false;
    public boolean i = false;
    public final i d = new i(new e(this));

    public final void a(com.fyber.inneractive.sdk.config.global.r rVar) {
        this.n = rVar;
        if (TextUtils.isEmpty(this.k)) {
            return;
        }
        IAlog.a("%s : Ignite installed will init IgniteManager", "IgniteAdapter");
        com.fyber.inneractive.sdk.config.global.features.j jVar = (com.fyber.inneractive.sdk.config.global.features.j) rVar.a(com.fyber.inneractive.sdk.config.global.features.j.class);
        IAlog.a("%s : initializing ignite features", "IgniteAdapter");
        Boolean c = jVar.c("odt");
        this.e = c != null ? c.booleanValue() : false;
        Boolean c2 = jVar.c("flow");
        this.f = c2 != null ? c2.booleanValue() : false;
        Boolean c3 = jVar.c("updates");
        boolean booleanValue = c3 != null ? c3.booleanValue() : false;
        Context context = this.f5431a;
        if (context != null) {
            boolean z = this.e;
            if (z || this.f) {
                if (this.o == null) {
                    this.i = false;
                    l lVar = new l(context, new k(), new com.fyber.inneractive.sdk.ignite.events.wrappers.a(), z, this.f, booleanValue, this);
                    this.o = lVar;
                    lVar.authenticate();
                }
                this.j = TimeUnit.SECONDS.toMillis(IAConfigManager.R.w.f5292a.b.a("igniteInstallTimeOutInSeconds", 15, 1));
            }
        }
    }

    public final void m() {
        d dVar = this.l;
        if (dVar != null) {
            com.fyber.inneractive.sdk.util.r.b.removeCallbacks(dVar);
            this.l = null;
        }
    }

    public final boolean n() {
        l lVar = this.o;
        return lVar != null && lVar.isConnected() && this.o.isAuthenticated();
    }

    public final boolean o() {
        l lVar = this.o;
        return lVar == null || lVar.f5145a.f();
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public final void onCredentialsRequestFailed(String str) {
        l lVar = this.o;
        if (lVar != null) {
            lVar.onCredentialsRequestFailed(str);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.a
    public final void onCredentialsRequestSuccess(String str, String str2) {
        l lVar = this.o;
        if (lVar != null) {
            lVar.onCredentialsRequestSuccess(str, str2);
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onIgniteServiceAuthenticated(String str) {
        this.c.putString("clientToken", str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticated", new Object[0]);
        com.digitalturbine.ignite.authenticator.listeners.internal.a aVar = this.m;
        if (aVar != null) {
            aVar.a();
            this.m = null;
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onIgniteServiceAuthenticationFailed(String str) {
        this.b = null;
        a(j.FAILED_TO_AUTHENTICATE, str);
        IAlog.a("IgniteAdapter: onIgniteServiceAuthenticationFailed : error : %s", str);
        com.digitalturbine.ignite.authenticator.listeners.internal.a aVar = this.m;
        if (aVar != null) {
            aVar.a(str);
            this.m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onIgniteServiceConnected(ComponentName componentName, IBinder iBinder) {
        o newBuilder;
        String str;
        Context context;
        IAlog.a("IgniteAdapter: onIgniteServiceConnected", new Object[0]);
        this.k = componentName.getPackageName();
        this.b = IIgniteServiceAPI.Stub.asInterface(iBinder);
        if (this.i) {
            l lVar = this.o;
            if (lVar != null) {
                lVar.authenticate();
                return;
            }
            return;
        }
        this.i = true;
        byte[] bArr = null;
        try {
            newBuilder = IgniteRequestOuterClass$IgniteRequest.newBuilder();
            String str2 = IAConfigManager.R.c;
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setAppId(str2);
            String packageName = com.fyber.inneractive.sdk.util.o.f5960a.getPackageName();
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setBundle(packageName);
            String version = InneractiveAdManager.getVersion();
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setSdkVersion(version);
            String str3 = this.k;
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setIgnitePackageName(str3);
        } catch (Throwable unused) {
            IAlog.a("Failed to build ignite request", new Object[0]);
        }
        if (!TextUtils.isEmpty(this.k) && (context = this.f5431a) != null) {
            try {
                str = context.getPackageManager().getPackageInfo(this.k, 0).versionName;
            } catch (Exception unused2) {
                IAlog.a("Failed to resolve ignite version", new Object[0]);
            }
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setIgniteVersionName(str);
            String a2 = com.fyber.inneractive.sdk.util.o.a(this.f5431a);
            newBuilder.c();
            ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setAppSignature(a2);
            bArr = ((IgniteRequestOuterClass$IgniteRequest) newBuilder.a()).toByteArray();
            if (bArr == null) {
                IAConfigManager.R.s.a(new a1(new b(this), bArr, this.n));
                return;
            }
            return;
        }
        str = null;
        newBuilder.c();
        ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setIgniteVersionName(str);
        String a22 = com.fyber.inneractive.sdk.util.o.a(this.f5431a);
        newBuilder.c();
        ((IgniteRequestOuterClass$IgniteRequest) newBuilder.b).setAppSignature(a22);
        bArr = ((IgniteRequestOuterClass$IgniteRequest) newBuilder.a()).toByteArray();
        if (bArr == null) {
        }
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onIgniteServiceConnectionFailed(String str) {
        IAlog.a("IgniteAdapter: onIgniteServiceConnectionFailed : error : %s", str);
        a(j.FAILED_TO_BIND_SERVICE, str);
    }

    @Override // com.digitalturbine.ignite.authenticator.listeners.api.AuthenticationServiceListener
    public final void onOdtUnsupported() {
        l lVar;
        IAlog.f("%s: onOdtUnsupported : unsupported ignite version", "IgniteAdapter");
        if (this.f || (lVar = this.o) == null) {
            return;
        }
        lVar.destroy();
        this.o = null;
    }

    public final void a(j jVar, String str) {
        if (this.h) {
            return;
        }
        this.h = true;
        t tVar = t.IGNITE_FLOW_FAILED_TO_START;
        w wVar = new w((com.fyber.inneractive.sdk.response.e) null);
        wVar.b = tVar;
        wVar.f5514a = null;
        wVar.d = null;
        JSONObject jSONObject = new JSONObject();
        String a2 = jVar.a();
        try {
            jSONObject.put("error_code", a2);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "error_code", a2);
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject.put("message", str);
            } catch (Exception unused2) {
                IAlog.f("Got exception adding param to json object: %s, %s", "message", str);
            }
        }
        wVar.f.put(jSONObject);
        wVar.a((String) null);
    }

    public final void a(com.digitalturbine.ignite.authenticator.listeners.internal.a aVar) {
        IAlog.a("IgniteAdapter : reconnectIgnite : with callback : " + aVar, new Object[0]);
        this.m = aVar;
        l lVar = this.o;
        if (lVar != null) {
            lVar.authenticate();
        }
    }

    public final void a(String str, g gVar) {
        String a2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IAlog.a("Starting install timeout with %d", Long.valueOf(this.j));
        d dVar = new d(this);
        this.l = dVar;
        com.fyber.inneractive.sdk.util.r.b.postDelayed(dVar, this.j);
        if (n() && !o() && this.b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", str);
                jSONObject.put("data", jSONObject2);
                IIgniteServiceAPI iIgniteServiceAPI = this.b;
                String jSONObject3 = jSONObject.toString();
                Bundle bundle = this.c;
                Bundle bundle2 = new Bundle();
                i iVar = this.d;
                c cVar = new c(this, gVar);
                iVar.getClass();
                iIgniteServiceAPI.install(jSONObject3, bundle, bundle2, new s((e) iVar.f5432a, cVar));
                return;
            } catch (Exception unused) {
                IAlog.a("Failed to install app", new Object[0]);
                return;
            }
        }
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                if (o()) {
                    a2 = j.SESSION_EXPIRED.a();
                } else {
                    a2 = j.NOT_CONNECTED.a();
                }
                rVar.a((String) null, a2, (String) null);
            }
        }
    }
}
