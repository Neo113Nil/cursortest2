package D6;

import C0.C0083b;
import E5.C0183a;
import F.AbstractC0212h;
import F.C0211g;
import F2.C0252s;
import F2.C0254t;
import F2.O0;
import F2.S0;
import F2.T0;
import K4.C0318e;
import K4.C0319f;
import K4.C0321h;
import P2.BinderC0386l;
import P2.C0375a;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.RemoteException;
import android.os.SystemClock;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzfs;
import com.google.android.gms.internal.ads.zzaup;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbby;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbdw;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzdmf;
import com.google.android.gms.internal.ads.zzdqq;
import com.google.android.gms.internal.ads.zzfbe;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import d6.C0977k;
import e4.AbstractC1039m;
import f1.C1067a;
import f4.C1096h;
import f4.C1098j;
import f4.InterfaceC1089a;
import h4.ExecutorC1207j;
import i6.C1293j;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.Message;
import j1.AbstractC1301b;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import k1.AbstractC1332d;
import l4.C1403n;
import n4.C1473g;
import n4.C1479m;
import o3.BinderC1507b;
import o3.InterfaceC1506a;
import org.json.JSONException;
import org.json.JSONObject;
import w1.C1759x1;

/* loaded from: classes2.dex */
public final class y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1890a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1891b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1892c;

    public /* synthetic */ y0() {
        this.f1890a = 21;
    }

    private final void a() {
        try {
            b();
        } catch (Error e7) {
            synchronized (((ExecutorC1207j) this.f1892c).f13558b) {
                ((ExecutorC1207j) this.f1892c).f13559c = 1;
                throw e7;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0052, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        ((java.lang.Runnable) r10.f1891b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        r10.f1891b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        h4.ExecutorC1207j.f13556f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f1891b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        boolean z4 = false;
        boolean z7 = false;
        while (true) {
            try {
                synchronized (((ExecutorC1207j) this.f1892c).f13558b) {
                    if (!z4) {
                        ExecutorC1207j executorC1207j = (ExecutorC1207j) this.f1892c;
                        if (executorC1207j.f13559c != 4) {
                            executorC1207j.f13560d++;
                            executorC1207j.f13559c = 4;
                            z4 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((ExecutorC1207j) this.f1892c).f13558b.poll();
                    this.f1891b = runnable;
                    if (runnable == null) {
                        ((ExecutorC1207j) this.f1892c).f13559c = 1;
                    }
                }
                if (z7) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            } finally {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        I6.i iVar;
        String jSONObject;
        String str;
        zzfbe zzfbeVar;
        final int i7 = 1;
        final int i8 = 0;
        switch (this.f1890a) {
            case 0:
                ((C0130m) this.f1892c).B((Z) this.f1891b);
                return;
            case 1:
                E2.o.f1952C.j.getClass();
                C0083b.H((zzdqq) this.f1891b, "cld_r", SystemClock.elapsedRealtime() - ((Long) this.f1892c).longValue());
                return;
            case 2:
                ((C0130m) this.f1892c).B((E6.e) this.f1891b);
                return;
            case 3:
                ((C0211g) this.f1891b).f2429a = this.f1892c;
                return;
            case 4:
                ((Application) this.f1891b).unregisterActivityLifecycleCallbacks((C0211g) this.f1892c);
                return;
            case 5:
                try {
                    Method method = AbstractC0212h.f2438d;
                    Object obj = this.f1892c;
                    Object obj2 = this.f1891b;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0212h.f2439e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e7) {
                    if (e7.getClass() == RuntimeException.class && e7.getMessage() != null && e7.getMessage().startsWith("Unable to stop")) {
                        throw e7;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 6:
                ((O0) this.f1891b).f2626l.addView((View) BinderC1507b.t0((InterfaceC1506a) this.f1892c));
                return;
            case 7:
                ((H2.j) ((H2.h) this.f1891b).f3244b).f3259a.getWindow().setBackgroundDrawable((BitmapDrawable) this.f1892c);
                return;
            case 8:
                I2.M m7 = (I2.M) this.f1891b;
                SharedPreferences sharedPreferences = ((Context) this.f1892c).getSharedPreferences("admob", 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                try {
                    synchronized (m7.f3551a) {
                        try {
                            m7.f3556f = sharedPreferences;
                            m7.f3557g = edit;
                            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                            m7.f3558h = m7.f3556f.getBoolean("use_https", m7.f3558h);
                            m7.f3570u = m7.f3556f.getBoolean("content_url_opted_out", m7.f3570u);
                            m7.f3559i = m7.f3556f.getString("content_url_hashes", m7.f3559i);
                            m7.f3560k = m7.f3556f.getBoolean("gad_idless", m7.f3560k);
                            m7.f3571v = m7.f3556f.getBoolean("content_vertical_opted_out", m7.f3571v);
                            m7.j = m7.f3556f.getString("content_vertical_hashes", m7.j);
                            m7.f3567r = m7.f3556f.getInt(ProfilingTraceData.JsonKeys.VERSION_CODE, m7.f3567r);
                            if (((Boolean) zzbdq.zzg.zze()).booleanValue() && C0254t.f2723d.f2726c.zze()) {
                                m7.f3563n = new zzbyk("", 0L);
                            } else {
                                m7.f3563n = new zzbyk(m7.f3556f.getString("app_settings_json", m7.f3563n.zzc()), m7.f3556f.getLong("app_settings_last_update_ms", m7.f3563n.zza()));
                            }
                            m7.f3564o = m7.f3556f.getLong("app_last_background_time_ms", m7.f3564o);
                            m7.f3566q = m7.f3556f.getInt("request_in_session_count", m7.f3566q);
                            m7.f3565p = m7.f3556f.getLong("first_ad_req_time_ms", m7.f3565p);
                            m7.f3568s = m7.f3556f.getStringSet("never_pool_slots", m7.f3568s);
                            m7.f3572w = m7.f3556f.getString("display_cutout", m7.f3572w);
                            m7.f3548B = m7.f3556f.getInt("app_measurement_npa", m7.f3548B);
                            m7.f3549C = m7.f3556f.getInt("sd_app_measure_npa", m7.f3549C);
                            m7.f3550D = m7.f3556f.getLong("sd_app_measure_npa_ts", m7.f3550D);
                            m7.f3573x = m7.f3556f.getString("inspector_info", m7.f3573x);
                            m7.f3574y = m7.f3556f.getBoolean("linked_device", m7.f3574y);
                            m7.f3575z = m7.f3556f.getString("linked_ad_unit", m7.f3575z);
                            m7.f3547A = m7.f3556f.getString("inspector_ui_storage", m7.f3547A);
                            m7.f3561l = m7.f3556f.getString("IABTCF_TCString", m7.f3561l);
                            m7.f3562m = m7.f3556f.getInt("gad_has_consent_for_cookies", m7.f3562m);
                            try {
                                m7.f3569t = new JSONObject(m7.f3556f.getString("native_advanced_settings", "{}"));
                            } catch (JSONException e8) {
                                int i9 = I2.J.f3546b;
                                J2.j.h("Could not convert native advanced settings to json object", e8);
                            }
                            m7.m();
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    E2.o.f1952C.f1961g.zzw(th2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
                    I2.J.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
                    return;
                }
            case 9:
                break;
            case 10:
                ((A5.s) ((C1759x1) this.f1892c).f17927d).a("onAdEvent", (HashMap) this.f1891b, null);
                return;
            case 11:
                final Context context = (Context) this.f1891b;
                L5.U u4 = (L5.U) this.f1892c;
                final T0 e9 = T0.e();
                synchronized (e9.f2634a) {
                    try {
                        if (e9.f2636c) {
                            e9.f2635b.add(u4);
                            return;
                        }
                        if (e9.f2637d) {
                            u4.a(e9.d());
                            return;
                        }
                        e9.f2636c = true;
                        e9.f2635b.add(u4);
                        if (context == null) {
                            throw new IllegalArgumentException("Context cannot be null.");
                        }
                        synchronized (e9.f2638e) {
                            try {
                                e9.c(context);
                                e9.f2639f.zzs(new S0(e9));
                                e9.f2639f.zzo(new zzbok());
                                y2.u uVar = e9.f2641h;
                                if (uVar.f18178a != -1 || uVar.f18179b != -1) {
                                    try {
                                        e9.f2639f.zzu(new zzfs(uVar));
                                    } catch (RemoteException e10) {
                                        J2.j.e("Unable to set request configuration parcel.", e10);
                                    }
                                }
                            } catch (RemoteException e11) {
                                J2.j.h("MobileAdsSettingManager initialization failed", e11);
                            }
                            zzbby.zza(context);
                            if (((Boolean) zzbdw.zza.zze()).booleanValue()) {
                                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlg)).booleanValue()) {
                                    J2.j.b("Initializing on bg thread");
                                    J2.b.f3803a.execute(new Runnable() { // from class: F2.P0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i8) {
                                                case 0:
                                                    T0 t02 = e9;
                                                    Context context2 = context;
                                                    synchronized (t02.f2638e) {
                                                        t02.b(context2);
                                                    }
                                                    return;
                                                default:
                                                    T0 t03 = e9;
                                                    Context context3 = context;
                                                    synchronized (t03.f2638e) {
                                                        t03.b(context3);
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                }
                            }
                            if (((Boolean) zzbdw.zzb.zze()).booleanValue()) {
                                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlg)).booleanValue()) {
                                    J2.b.f3804b.execute(new Runnable() { // from class: F2.P0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i7) {
                                                case 0:
                                                    T0 t02 = e9;
                                                    Context context2 = context;
                                                    synchronized (t02.f2638e) {
                                                        t02.b(context2);
                                                    }
                                                    return;
                                                default:
                                                    T0 t03 = e9;
                                                    Context context3 = context;
                                                    synchronized (t03.f2638e) {
                                                        t03.b(context3);
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                }
                            }
                            J2.j.b("Initializing on calling thread");
                            e9.b(context);
                        }
                        return;
                    } finally {
                    }
                }
            case 12:
                C0321h c0321h = (C0321h) ((A1.x0) this.f1891b).f613b;
                if (c0321h != null) {
                    c0321h.e((Typeface) this.f1892c);
                    return;
                }
                return;
            case 13:
                ((M.c) this.f1891b).accept(this.f1892c);
                return;
            case 14:
                zzdmf zzdmfVar = ((zzdmf[]) this.f1892c)[0];
                if (zzdmfVar != null) {
                    ((BinderC0386l) this.f1891b).f5519e.zzb(zzgbc.zzh(zzdmfVar));
                    return;
                }
                return;
            case 15:
                P2.w wVar = (P2.w) this.f1891b;
                P2.v vVar = (P2.v) this.f1892c;
                P2.o oVar = wVar.f5571a;
                String str2 = wVar.f5573c;
                oVar.getClass();
                if (TextUtils.isEmpty(str2) || oVar.b()) {
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(Message.JsonKeys.PARAMS, vVar.f5563a);
                    jSONObject3.put("signal_dictionary", C0252s.f2717f.f2718a.j(vVar.f5568f));
                    jSONObject2.put("sr", jSONObject3);
                    str = vVar.f5565c;
                } catch (JSONException e12) {
                    E2.o.f1952C.f1961g.zzw(e12, "DiskCachingManager.createStringToWrite");
                }
                if (TextUtils.isEmpty(str)) {
                    jSONObject = "";
                    if (TextUtils.isEmpty(jSONObject)) {
                        P2.A a2 = oVar.f5539b;
                        a2.e();
                        synchronized (a2.f5403d) {
                            a2.f5401b.putString(str2, jSONObject).commit();
                        }
                        return;
                    }
                    return;
                }
                jSONObject2.put("rs", Base64.encodeToString(P2.o.a(str).getBytes(StandardCharsets.UTF_8), 10));
                E2.o.f1952C.j.getClass();
                jSONObject2.put("ts_ms", System.currentTimeMillis());
                jSONObject = jSONObject2.toString();
                if (TextUtils.isEmpty(jSONObject)) {
                }
                break;
            case 16:
                C0375a c0375a = (C0375a) this.f1891b;
                Uri parse = Uri.parse((String) this.f1892c);
                try {
                    parse = (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlX)).booleanValue() || (zzfbeVar = c0375a.f5463d) == null) ? c0375a.f5462c.zza(parse, c0375a.f5460a, c0375a.f5461b, null) : zzfbeVar.zza(parse, c0375a.f5460a, c0375a.f5461b, null);
                } catch (zzaup e13) {
                    int i10 = I2.J.f3546b;
                    J2.j.c("Failed to append the click signal to URL: ", e13);
                    E2.o.f1952C.f1961g.zzw(e13, "TaggingLibraryJsInterface.recordClick");
                }
                c0375a.f5468i.zzd(parse.toString(), null, null);
                return;
            case 17:
                ((V5.a) this.f1892c).f6677f.unregisterNetworkCallback((C0318e) this.f1891b);
                return;
            case 18:
                ((V5.a) this.f1892c).f6676e.unregisterReceiver((C0319f) this.f1891b);
                return;
            case 19:
                com.google.firebase.storage.A a4 = (com.google.firebase.storage.A) this.f1892c;
                String B7 = Q0.a.B(a4.f11987q);
                String A7 = Q0.a.A(a4.f11988r);
                Y3.i iVar2 = a4.f11982l.f12045b.f12012a;
                iVar2.b();
                ((T4.f) this.f1891b).n(iVar2.f7663a, B7, A7);
                return;
            case 20:
                ((E5.U) this.f1891b).a((FirebaseAuth) this.f1892c);
                return;
            case zzbbd.zzt.zzm /* 21 */:
                ((AbstractC1039m) this.f1891b).onVerificationFailed((Y3.j) this.f1892c);
                return;
            case 22:
                ((C0183a) this.f1891b).a((FirebaseAuth) this.f1892c);
                return;
            case 23:
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f1891b;
                Iterator it = firebaseAuth.f11851c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1089a) it.next()).a((O4.b) this.f1892c);
                }
                Iterator it2 = firebaseAuth.f11850b.iterator();
                while (it2.hasNext()) {
                    ((E5.U) it2.next()).a(firebaseAuth);
                }
                return;
            case 24:
                d1.n d7 = d1.n.d();
                String str3 = C1067a.f12766d;
                m1.i iVar3 = (m1.i) this.f1891b;
                d7.b(str3, w1.L.i("Scheduling work ", iVar3.f15216a), new Throwable[0]);
                ((C1067a) this.f1892c).f12767a.e(iVar3);
                return;
            case 25:
                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f((String) this.f1891b));
                FirebaseUser firebaseUser = firebaseAuth2.f11854f;
                if (firebaseUser != null) {
                    Task h6 = firebaseAuth2.h(firebaseUser, true);
                    C1096h.f12937f.e("Token refreshing started", new Object[0]);
                    h6.addOnFailureListener(new C1098j(this, i8));
                    return;
                }
                return;
            case 26:
                a();
                return;
            case 27:
                C0977k c0977k = (C0977k) this.f1892c;
                C1479m c1479m = (C1479m) c0977k.f12441b;
                C1473g c1473g = (C1473g) c0977k.f12442c;
                q4.j jVar = (q4.j) ((q4.e) this.f1891b).f15858b;
                l4.s sVar = c1479m.f15449c;
                ArrayList l7 = c1473g.l();
                n4.M m8 = new n4.M(c1479m, c1473g, jVar);
                if (sVar.a()) {
                    sVar.n("oc", l7, null, m8);
                } else {
                    sVar.f14995m.add(new C1403n("oc", l7, null, m8));
                }
                sVar.c();
                return;
            case 28:
                throw new RuntimeException((String) this.f1891b, (Throwable) this.f1892c);
            default:
                Iterator it3 = ((ArrayList) this.f1891b).iterator();
                while (it3.hasNext()) {
                    AbstractC1301b abstractC1301b = (AbstractC1301b) it3.next();
                    Object obj3 = ((AbstractC1332d) this.f1892c).f14668e;
                    abstractC1301b.f14547b = obj3;
                    abstractC1301b.d(abstractC1301b.f14549d, obj3);
                }
                return;
        }
        do {
            try {
                ((Runnable) this.f1891b).run();
            } catch (Throwable th3) {
                E.k(C1293j.f14068a, th3);
            }
            iVar = (I6.i) this.f1892c;
            Runnable f7 = iVar.f();
            if (f7 == null) {
                return;
            }
            this.f1891b = f7;
            i8++;
        } while (i8 < 16);
        K6.k kVar = iVar.f3735c;
        kVar.getClass();
        kVar.d(iVar, this);
    }

    public String toString() {
        switch (this.f1890a) {
            case 26:
                Runnable runnable = (Runnable) this.f1891b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i7 = ((ExecutorC1207j) this.f1892c).f13559c;
                sb.append(i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ y0(int i7, Object obj, Object obj2) {
        this.f1890a = i7;
        this.f1891b = obj;
        this.f1892c = obj2;
    }

    public /* synthetic */ y0(int i7, Object obj, Object obj2, boolean z4) {
        this.f1890a = i7;
        this.f1892c = obj;
        this.f1891b = obj2;
    }

    public /* synthetic */ y0(C0083b c0083b, zzdqq zzdqqVar, Long l7) {
        this.f1890a = 1;
        this.f1891b = zzdqqVar;
        this.f1892c = l7;
    }

    public y0(C1096h c1096h, String str) {
        this.f1890a = 25;
        this.f1892c = c1096h;
        com.google.android.gms.common.internal.D.e(str);
        this.f1891b = str;
    }

    public y0(ExecutorC1207j executorC1207j) {
        this.f1890a = 26;
        this.f1892c = executorC1207j;
    }
}
