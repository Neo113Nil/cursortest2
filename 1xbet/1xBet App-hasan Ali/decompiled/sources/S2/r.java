package S2;

import A0.J0;
import T2.G;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1131iu;
import com.google.android.gms.internal.ads.C0775au;
import com.google.android.gms.internal.ads.C0802bc;
import com.google.android.gms.internal.ads.C0908du;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.InterfaceC0677Re;
import com.google.android.gms.internal.ads.Qs;
import com.google.android.gms.internal.ads.RunnableC1043gu;
import com.google.android.gms.internal.ads.RunnableC1362o;
import com.google.android.gms.internal.ads.Yt;
import java.util.Arrays;
import java.util.HashMap;
import k3.InterfaceC2035c;
import l3.C2055b;
import l3.C2057d;
import m3.InterfaceC2094d;
import m3.v;

/* loaded from: classes.dex */
public final class r implements InterfaceC2094d {

    /* renamed from: k, reason: collision with root package name */
    public boolean f5350k;

    /* renamed from: l, reason: collision with root package name */
    public Object f5351l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5352m;

    /* renamed from: n, reason: collision with root package name */
    public Object f5353n;

    /* renamed from: o, reason: collision with root package name */
    public Object f5354o;

    /* renamed from: p, reason: collision with root package name */
    public Object f5355p;

    @Override // m3.InterfaceC2094d
    public void a(j3.b bVar) {
        ((C2057d) this.f5355p).f17798w.post(new D3.h(19, this, bVar));
    }

    public void b(j3.b bVar) {
        l3.m mVar = (l3.m) ((C2057d) this.f5355p).f17795t.get((C2055b) this.f5352m);
        if (mVar != null) {
            v.b(mVar.f17818w.f17798w);
            InterfaceC2035c interfaceC2035c = mVar.f17807l;
            String name = interfaceC2035c.getClass().getName();
            String valueOf = String.valueOf(bVar);
            StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            interfaceC2035c.f(sb.toString());
            mVar.l(bVar, null);
        }
    }

    public void c(String str, HashMap hashMap) {
        AbstractC0613Id.f.execute(new q(this, str, hashMap, 0));
    }

    public void d(String str, String str2) {
        G.m(str);
        if (((InterfaceC0677Re) this.f5353n) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            c("onError", hashMap);
        }
    }

    public void e(InterfaceC0677Re interfaceC0677Re, Yt yt) {
        if (interfaceC0677Re == null) {
            d("adWebview missing", "onLMDShow");
            return;
        }
        this.f5353n = interfaceC0677Re;
        if (!this.f5350k && !f(interfaceC0677Re.getContext())) {
            d("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        boolean booleanValue = ((Boolean) Q2.r.f5053d.f5056c.a(F7.bb)).booleanValue();
        String str = yt.f12371b;
        if (booleanValue) {
            this.f5352m = str;
        }
        if (((J0) this.f5355p) == null) {
            this.f5355p = new J0(this);
        }
        Qs qs = (Qs) this.f5354o;
        if (qs != null) {
            J0 j02 = (J0) this.f5355p;
            C0908du c0908du = (C0908du) qs.f11279l;
            C0802bc c0802bc = c0908du.f13200a;
            if (c0802bc == null) {
                C0908du.f13198c.a("error: %s", "Play Store not found.");
            } else if (C0908du.c(j02, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, str))) {
                c0802bc.l(new RunnableC1043gu(c0802bc, new RunnableC1362o(c0908du, yt, j02, 8), 1));
            }
        }
    }

    public synchronized boolean f(Context context) {
        if (!AbstractC1131iu.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f5354o = new Qs(1, new C0908du(context));
        } catch (NullPointerException e3) {
            G.m("Error connecting LMD Overlay service");
            P2.o.f4767B.f4774g.i("LastMileDeliveryOverlay.bindLastMileDeliveryService", e3);
        }
        if (((Qs) this.f5354o) == null) {
            this.f5350k = false;
            return false;
        }
        if (((J0) this.f5355p) == null) {
            this.f5355p = new J0(this);
        }
        this.f5350k = true;
        return true;
    }

    public C0775au g() {
        String str;
        String str2 = null;
        if (!((Boolean) Q2.r.f5053d.f5056c.a(F7.bb)).booleanValue() || TextUtils.isEmpty((String) this.f5352m)) {
            String str3 = (String) this.f5351l;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                d("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        } else {
            str = (String) this.f5352m;
        }
        return new C0775au(str2, str);
    }
}
