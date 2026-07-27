package d5;

import a.AbstractC0169a;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import e5.h;
import e5.k;
import e5.m;
import e5.n;
import g4.AbstractC0464i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a extends e implements d {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5484e;

    /* renamed from: c, reason: collision with root package name */
    public Context f5485c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5486d;

    static {
        f5484e = Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList T2 = AbstractC0464i.T(new n[]{Build.VERSION.SDK_INT >= 29 ? new e5.a() : null, new m(e5.e.f5533e), new m(k.f5540a), new m(h.f5538a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = T2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f5486d = arrayList;
    }

    @Override // d5.d
    public final void a(Context context) {
        this.f5485c = context;
    }

    @Override // d5.d
    public final Context b() {
        return this.f5485c;
    }

    @Override // d5.e
    public final AbstractC0169a c(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        i.e(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        e5.b bVar = x509TrustManagerExtensions != null ? new e5.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.c(trustManager);
    }

    @Override // d5.e
    public final h5.d d(X509TrustManager trustManager) {
        i.e(trustManager, "trustManager");
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(trustManager);
    }

    @Override // d5.e
    public final void e(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        i.e(protocols, "protocols");
        Iterator it = this.f5486d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((n) obj).b(sSLSocket)) {
                    break;
                }
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, protocols);
        }
    }

    @Override // d5.e
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f5486d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((n) obj).b(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar.a(sSLSocket);
        }
        return null;
    }

    @Override // d5.e
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard f3 = C0.e.f();
        f3.open("response.body().close()");
        return f3;
    }

    @Override // d5.e
    public final boolean i(String hostname) {
        i.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // d5.e
    public final void j(String message, int i2, Throwable th) {
        i.e(message, "message");
        if (i2 == 5) {
            boolean z = c.f5489e;
            Log.w("OkHttp", message, th);
        } else {
            boolean z5 = c.f5489e;
            Log.i("OkHttp", message, th);
        }
    }

    @Override // d5.e
    public final void k(Object obj, String message) {
        i.e(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, message);
        } else {
            i.c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            C0.e.g(obj).warnIfOpen();
        }
    }

    @Override // d5.e
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
