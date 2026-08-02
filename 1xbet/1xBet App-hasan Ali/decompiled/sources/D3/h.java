package D3;

import O4.C0276w;
import Q2.A0;
import Q2.C0;
import Q2.C0379q;
import Q2.Z0;
import Q2.r;
import T2.G;
import T2.I;
import a3.BinderC0468l;
import a3.C0457a;
import a3.u;
import a3.z;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.gms.internal.ads.AbstractC0790b8;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.C0552Ad;
import com.google.android.gms.internal.ads.C0802bc;
import com.google.android.gms.internal.ads.C0995fr;
import com.google.android.gms.internal.ads.C1482ql;
import com.google.android.gms.internal.ads.C1639u7;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Kk;
import com.google.android.gms.internal.ads.Mw;
import com.google.android.gms.internal.ads.R4;
import com.google.android.gms.internal.ads.Xq;
import e2.C1930k;
import g3.C1984b;
import h2.C1992a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import k0.C2023c;
import k3.InterfaceC2035c;
import l3.C2055b;
import l3.C2057d;
import m.MenuC2070h;
import m2.AbstractC2087d;
import m3.AbstractBinderC2091a;
import m3.v;
import n.C2132f;
import n.C2140j;
import org.json.JSONException;
import org.json.JSONObject;
import p2.ExecutorC2251i;
import p4.AbstractC2277q;
import p4.AbstractC2282w;
import p4.C2268h;
import q.BinderC2290e;
import q4.C2313c;
import r0.AbstractC2346c;
import s3.BinderC2361b;
import s3.InterfaceC2360a;

/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f949k;

    /* renamed from: l, reason: collision with root package name */
    public Object f950l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f951m;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.f949k = i;
        this.f951m = obj;
        this.f950l = obj2;
    }

    private final void a() {
        synchronized (((i) this.f951m).f955n) {
            try {
                d dVar = (d) ((i) this.f951m).f953l;
                if (dVar != null) {
                    Exception a5 = ((o) this.f950l).a();
                    v.e(a5);
                    dVar.b(a5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((j) this.f951m).f958m) {
            try {
                i iVar = ((j) this.f951m).f959n;
                if (iVar != null) {
                    ((o) iVar.f953l).f(((o) this.f950l).b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        I i = (I) this.f950l;
        Context context = (Context) this.f951m;
        i.getClass();
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (i.f5644a) {
                try {
                    i.f = sharedPreferences;
                    i.f5649g = edit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    i.f5650h = i.f.getBoolean("use_https", i.f5650h);
                    i.f5662u = i.f.getBoolean("content_url_opted_out", i.f5662u);
                    i.i = i.f.getString("content_url_hashes", i.i);
                    i.f5652k = i.f.getBoolean("gad_idless", i.f5652k);
                    i.f5663v = i.f.getBoolean("content_vertical_opted_out", i.f5663v);
                    i.f5651j = i.f.getString("content_vertical_hashes", i.f5651j);
                    i.f5659r = i.f.getInt("version_code", i.f5659r);
                    if (((Boolean) AbstractC0790b8.f12770g.s()).booleanValue() && r.f5053d.f5056c.f8174j) {
                        i.f5655n = new C0552Ad("", 0L);
                    } else {
                        i.f5655n = new C0552Ad(i.f.getString("app_settings_json", i.f5655n.f7598e), i.f.getLong("app_settings_last_update_ms", i.f5655n.f));
                    }
                    i.f5656o = i.f.getLong("app_last_background_time_ms", i.f5656o);
                    i.f5658q = i.f.getInt("request_in_session_count", i.f5658q);
                    i.f5657p = i.f.getLong("first_ad_req_time_ms", i.f5657p);
                    i.f5660s = i.f.getStringSet("never_pool_slots", i.f5660s);
                    i.f5664w = i.f.getString("display_cutout", i.f5664w);
                    i.f5641B = i.f.getInt("app_measurement_npa", i.f5641B);
                    i.f5642C = i.f.getInt("sd_app_measure_npa", i.f5642C);
                    i.f5643D = i.f.getLong("sd_app_measure_npa_ts", i.f5643D);
                    i.f5665x = i.f.getString("inspector_info", i.f5665x);
                    i.f5666y = i.f.getBoolean("linked_device", i.f5666y);
                    i.f5667z = i.f.getString("linked_ad_unit", i.f5667z);
                    i.f5640A = i.f.getString("inspector_ui_storage", i.f5640A);
                    i.f5653l = i.f.getString("IABTCF_TCString", i.f5653l);
                    i.f5654m = i.f.getInt("gad_has_consent_for_cookies", i.f5654m);
                    try {
                        i.f5661t = new JSONObject(i.f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e3) {
                        U2.j.j("Could not convert native advanced settings to json object", e3);
                    }
                    i.p();
                } finally {
                }
            }
        } catch (Throwable th) {
            P2.o.f4767B.f4774g.i("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread", th);
            G.n("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    private final void d() {
        BinderC0468l binderC0468l = (BinderC0468l) this.f950l;
        binderC0468l.getClass();
        Kk kk = ((Kk[]) this.f951m)[0];
        if (kk != null) {
            Mw c02 = AbstractC1400ot.c0(kk);
            C0995fr c0995fr = binderC0468l.f6572p;
            synchronized (c0995fr) {
                c0995fr.f13508a.addFirst(c02);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void e() {
        String jSONObject;
        String str;
        a3.v vVar = (a3.v) this.f950l;
        u uVar = (u) this.f951m;
        a3.o oVar = vVar.f6627k;
        String str2 = vVar.f6629m;
        oVar.getClass();
        if (TextUtils.isEmpty(str2) || oVar.b()) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("params", uVar.f6620a);
            jSONObject3.put("signal_dictionary", C0379q.f.f5048a.f(uVar.f));
            jSONObject2.put("sr", jSONObject3);
            str = uVar.f6622c;
        } catch (JSONException e3) {
            P2.o.f4767B.f4774g.i("DiskCachingManager.createStringToWrite", e3);
        }
        if (TextUtils.isEmpty(str)) {
            jSONObject = "";
            if (TextUtils.isEmpty(jSONObject)) {
                z zVar = oVar.f6598b;
                zVar.h();
                synchronized (zVar.f6644d) {
                    zVar.f6642b.putString(str2, jSONObject).commit();
                }
                return;
            }
            return;
        }
        jSONObject2.put("rs", Base64.encodeToString(a3.o.a(str).getBytes(StandardCharsets.UTF_8), 10));
        P2.o.f4767B.f4776j.getClass();
        jSONObject2.put("ts_ms", System.currentTimeMillis());
        jSONObject = jSONObject2.toString();
        if (TextUtils.isEmpty(jSONObject)) {
        }
    }

    private final void f() {
        synchronized (((ConstraintTrackingWorker) this.f951m).f7125q) {
            if (((ConstraintTrackingWorker) this.f951m).f7126r) {
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f951m;
                constraintTrackingWorker.f7127s.j(new f2.j());
            } else {
                ((ConstraintTrackingWorker) this.f951m).f7127s.l((E3.a) this.f950l);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Xq xq;
        m3.i iVar;
        Set set;
        C2023c c2023c;
        m3.i iVar2 = null;
        switch (this.f949k) {
            case 0:
                if (((o) this.f950l).f969d) {
                    ((o) ((i) this.f951m).f953l).g();
                    return;
                }
                try {
                    ((o) ((i) this.f951m).f953l).f(((a) ((i) this.f951m).f955n).q((o) this.f950l));
                    return;
                } catch (e e3) {
                    if (e3.getCause() instanceof Exception) {
                        ((o) ((i) this.f951m).f953l).e((Exception) e3.getCause());
                        return;
                    } else {
                        ((o) ((i) this.f951m).f953l).e(e3);
                        return;
                    }
                } catch (Exception e5) {
                    ((o) ((i) this.f951m).f953l).e(e5);
                    return;
                }
            case 1:
                i iVar3 = (i) this.f951m;
                try {
                    o oVar = (o) ((C2023c) iVar3.f955n).q((o) this.f950l);
                    if (oVar == null) {
                        iVar3.b(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    m mVar = g.f948b;
                    j jVar = new j(mVar, iVar3, 1);
                    l lVar = oVar.f967b;
                    lVar.e(jVar);
                    oVar.i();
                    lVar.e(new i(mVar, iVar3));
                    oVar.i();
                    lVar.e(new j(mVar, iVar3, 0));
                    oVar.i();
                    return;
                } catch (e e6) {
                    if (e6.getCause() instanceof Exception) {
                        ((o) iVar3.f953l).e((Exception) e6.getCause());
                        return;
                    } else {
                        ((o) iVar3.f953l).e(e6);
                        return;
                    }
                } catch (Exception e7) {
                    ((o) iVar3.f953l).e(e7);
                    return;
                }
            case 2:
                synchronized (((i) this.f951m).f955n) {
                    ((c) ((i) this.f951m).f953l).b((o) this.f950l);
                }
                return;
            case 3:
                a();
                return;
            case 4:
                b();
                return;
            case 5:
                o oVar2 = (o) this.f950l;
                try {
                    oVar2.f(((Callable) this.f951m).call());
                    return;
                } catch (Exception e8) {
                    oVar2.e(e8);
                    return;
                } catch (Throwable th) {
                    oVar2.e(new RuntimeException(th));
                    return;
                }
            case 6:
                A0 a02 = (A0) this.f951m;
                J2.f fVar = (J2.f) this.f950l;
                fVar.getClass();
                try {
                    fVar.f2710b.Z0(Z0.a(fVar.f2709a, a02));
                    return;
                } catch (RemoteException e9) {
                    U2.j.g("Failed to load ad.", e9);
                    return;
                }
            case 7:
                J2.l lVar2 = (J2.l) this.f950l;
                try {
                    lVar2.f2723k.j(((J2.h) this.f951m).f2711a);
                    return;
                } catch (IllegalStateException e10) {
                    C0802bc.a(lVar2.getContext()).b("BaseAdView.loadAd", e10);
                    return;
                }
            case 8:
                AbstractC2346c.v((C0276w) this.f950l).resumeWith(G4.l.p((Throwable) this.f951m));
                return;
            case 9:
                P2.o.f4767B.f4776j.getClass();
                E4.a.l((C1482ql) this.f950l, "cld_r", SystemClock.elapsedRealtime() - ((Long) this.f951m).longValue());
                return;
            case 10:
                C0 c02 = (C0) this.f950l;
                c02.getClass();
                ((J2.l) c02.f4910k).addView((View) BinderC2361b.t1((InterfaceC2360a) this.f951m));
                return;
            case 11:
                ((S2.d) ((S2.i) this.f950l).f5328c).f5298l.getWindow().setBackgroundDrawable((BitmapDrawable) this.f951m);
                return;
            case 12:
                c();
                return;
            case 13:
                d();
                return;
            case 14:
                e();
                return;
            case 15:
                C0457a c0457a = (C0457a) this.f950l;
                Uri parse = Uri.parse((String) this.f951m);
                try {
                    boolean booleanValue = ((Boolean) r.f5053d.f5056c.a(F7.Cb)).booleanValue();
                    WebView webView = c0457a.f6518b;
                    Context context = c0457a.f6517a;
                    parse = (!booleanValue || (xq = c0457a.f6520d) == null) ? c0457a.f6519c.a(parse, context, webView, null) : xq.a(parse, context, webView, null);
                } catch (R4 e11) {
                    U2.j.e("Failed to append the click signal to URL: ", e11);
                    P2.o.f4767B.f4774g.i("TaggingLibraryJsInterface.recordClick", e11);
                }
                c0457a.i.b(parse.toString(), null, null);
                return;
            case 16:
                f2.m d5 = f2.m.d();
                String str = C1992a.f17205d;
                o2.i iVar4 = (o2.i) this.f950l;
                d5.a(str, L1.a.m("Scheduling work ", iVar4.f18633a), new Throwable[0]);
                ((C1992a) this.f951m).f17206a.d(iVar4);
                return;
            case 17:
                M0.e eVar = (M0.e) ((C1930k) this.f950l).f16910l;
                if (eVar != null) {
                    eVar.k((Typeface) this.f951m);
                    return;
                }
                return;
            case 18:
                ((k1.f) this.f950l).accept(this.f951m);
                return;
            case 19:
                S2.r rVar = (S2.r) this.f951m;
                l3.m mVar2 = (l3.m) ((C2057d) rVar.f5355p).f17795t.get((C2055b) rVar.f5352m);
                if (mVar2 == null) {
                    return;
                }
                j3.b bVar = (j3.b) this.f950l;
                if ((bVar.f17502l == 0 ? 1 : 0) == 0) {
                    mVar2.l(bVar, null);
                    return;
                }
                rVar.f5350k = true;
                InterfaceC2035c interfaceC2035c = (InterfaceC2035c) rVar.f5351l;
                if (interfaceC2035c.m()) {
                    if (!rVar.f5350k || (iVar = (m3.i) rVar.f5353n) == null) {
                        return;
                    }
                    interfaceC2035c.b(iVar, (Set) rVar.f5354o);
                    return;
                }
                try {
                    interfaceC2035c.b(null, interfaceC2035c.d());
                    return;
                } catch (SecurityException e12) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e12);
                    interfaceC2035c.f("Failed to get service from broker.");
                    mVar2.l(new j3.b(10), null);
                    return;
                }
            case 20:
                C3.f fVar2 = (C3.f) this.f950l;
                j3.b bVar2 = fVar2.f846l;
                boolean z3 = bVar2.f17502l == 0;
                l3.u uVar = (l3.u) this.f951m;
                if (z3) {
                    m3.r rVar2 = fVar2.f847m;
                    v.e(rVar2);
                    j3.b bVar3 = rVar2.f18098m;
                    if (bVar3.f17502l != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(bVar3)), new Exception());
                        uVar.f17843r.b(bVar3);
                        uVar.f17842q.l();
                        return;
                    }
                    S2.r rVar3 = uVar.f17843r;
                    IBinder iBinder = rVar2.f18097l;
                    if (iBinder != null) {
                        int i = AbstractBinderC2091a.f18021l;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        iVar2 = queryLocalInterface instanceof m3.i ? (m3.i) queryLocalInterface : new m3.G(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                    }
                    rVar3.getClass();
                    if (iVar2 == null || (set = uVar.f17840o) == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        rVar3.b(new j3.b(4));
                    } else {
                        rVar3.f5353n = iVar2;
                        rVar3.f5354o = set;
                        if (rVar3.f5350k) {
                            ((InterfaceC2035c) rVar3.f5351l).b(iVar2, set);
                        }
                    }
                } else {
                    uVar.f17843r.b(bVar2);
                }
                uVar.f17842q.l();
                return;
            case C1639u7.zzm /* 21 */:
                ArrayList arrayList = (ArrayList) this.f950l;
                int size = arrayList.size();
                while (r2 < size) {
                    Object obj = arrayList.get(r2);
                    r2++;
                    l2.b bVar4 = (l2.b) obj;
                    Object obj2 = ((AbstractC2087d) this.f951m).f17988e;
                    bVar4.f17766b = obj2;
                    bVar4.d(bVar4.f17768d, obj2);
                }
                return;
            case 22:
                C2140j c2140j = (C2140j) this.f951m;
                MenuC2070h menuC2070h = c2140j.f18262m;
                if (menuC2070h != null && (c2023c = menuC2070h.f17909e) != null) {
                    c2023c.w(menuC2070h);
                }
                ActionMenuView actionMenuView = c2140j.f18266q;
                if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                    C2132f c2132f = (C2132f) this.f950l;
                    if (!c2132f.b()) {
                        if (c2132f.f17956e != null) {
                            c2132f.d(0, 0, false, false);
                        }
                    }
                    c2140j.f18255B = c2132f;
                }
                c2140j.f18257D = null;
                return;
            case 23:
                ExecutorC2251i executorC2251i = (ExecutorC2251i) this.f950l;
                try {
                    ((Runnable) this.f951m).run();
                    return;
                } finally {
                    executorC2251i.b();
                }
            case 24:
                ((BinderC2290e) this.f951m).f18850l.d((Bundle) this.f950l);
                return;
            case 25:
                ((C2268h) this.f950l).B((C2313c) this.f951m);
                return;
            case 26:
                f();
                return;
            case 27:
                break;
            default:
                v3.e eVar2 = (v3.e) this.f950l;
                Context context2 = (Context) eVar2.f20432l;
                String string = v3.e.S(context2).getString("app_set_id", null);
                long j5 = v3.e.S((Context) eVar2.f20432l).getLong("app_set_id_last_used_time", -1L);
                long j6 = j5 != -1 ? 33696000000L + j5 : -1L;
                o oVar3 = ((f) this.f951m).f946a;
                if (string == null || System.currentTimeMillis() > j6) {
                    string = UUID.randomUUID().toString();
                    try {
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putString("app_set_id", string).commit()) {
                            String valueOf = String.valueOf(context2.getPackageName());
                            Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                            throw new v3.d("Failed to store the app set ID.");
                        }
                        v3.e.T(context2);
                        if (!context2.getSharedPreferences("app_set_id_storage", 0).edit().putLong("app_set_id_creation_time", System.currentTimeMillis()).commit()) {
                            String valueOf2 = String.valueOf(context2.getPackageName());
                            Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                            throw new v3.d("Failed to store the app set ID creation time.");
                        }
                    } catch (v3.d e13) {
                        oVar3.e(e13);
                        return;
                    }
                } else {
                    try {
                        v3.e.T(context2);
                    } catch (v3.d e14) {
                        oVar3.e(e14);
                        return;
                    }
                }
                oVar3.f(new C1984b(string, 1));
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f950l).run();
            } catch (Throwable th2) {
                AbstractC2282w.l(a4.i.f6649k, th2);
            }
            u4.g gVar = (u4.g) this.f951m;
            Runnable H5 = gVar.H();
            if (H5 == null) {
                return;
            }
            this.f950l = H5;
            r2++;
            if (r2 >= 16) {
                AbstractC2277q abstractC2277q = gVar.f20093n;
                if (abstractC2277q.F(gVar)) {
                    abstractC2277q.E(gVar, this);
                    return;
                }
            }
        }
    }

    public /* synthetic */ h(int i, Object obj, Object obj2, boolean z3) {
        this.f949k = i;
        this.f950l = obj;
        this.f951m = obj2;
    }
}
