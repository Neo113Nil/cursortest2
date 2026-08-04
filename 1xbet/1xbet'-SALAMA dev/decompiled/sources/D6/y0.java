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
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p042f4.C0899h;
import p042f4.C0901j;
import p042f4.InterfaceC0892a;
import p098n4.C0934g;
import p098n4.C0940m;
import p155w1.C1050x1;

/* JADX INFO: loaded from: classes2.dex */
public final class y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1892c;

    public /* synthetic */ y0() {
        this.f1890a = 21;
    }

    private final void a() {
        try {
            b();
        } catch (Error e7) {
            synchronized (((p056h4.j) this.f1892c).f13564b) {
                ((p056h4.j) this.f1892c).f13565c = 1;
                throw e7;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r1 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        ((java.lang.Runnable) r10.f1891b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0062, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
    
        p056h4.j.f13562f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f1891b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        r10.f1891b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b() {
        boolean z4 = false;
        boolean zInterrupted = false;
        while (true) {
            try {
                synchronized (((p056h4.j) this.f1892c).f13564b) {
                    if (!z4) {
                        p056h4.j jVar = (p056h4.j) this.f1892c;
                        if (jVar.f13565c != 4) {
                            jVar.f13566d++;
                            jVar.f13565c = 4;
                            z4 = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((p056h4.j) this.f1892c).f13564b.poll();
                    this.f1891b = runnable;
                    if (runnable == null) {
                        ((p056h4.j) this.f1892c).f13565c = 1;
                    }
                }
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
                this.f1891b = null;
            } catch (Throwable th) {
                if (zInterrupted) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0324 A[Catch: all -> 0x02e9, TryCatch #5 {, blocks: (B:114:0x02b5, B:116:0x02d3, B:127:0x02f1, B:129:0x0302, B:131:0x0314, B:138:0x0357, B:132:0x0324, B:134:0x0332, B:136:0x0344, B:137:0x034f, B:118:0x02d7, B:121:0x02e3, B:126:0x02ec), top: B:225:0x02b5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0332 A[Catch: all -> 0x02e9, TryCatch #5 {, blocks: (B:114:0x02b5, B:116:0x02d3, B:127:0x02f1, B:129:0x0302, B:131:0x0314, B:138:0x0357, B:132:0x0324, B:134:0x0332, B:136:0x0344, B:137:0x034f, B:118:0x02d7, B:121:0x02e3, B:126:0x02ec), top: B:225:0x02b5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0344 A[Catch: all -> 0x02e9, TryCatch #5 {, blocks: (B:114:0x02b5, B:116:0x02d3, B:127:0x02f1, B:129:0x0302, B:131:0x0314, B:138:0x0357, B:132:0x0324, B:134:0x0332, B:136:0x0344, B:137:0x034f, B:118:0x02d7, B:121:0x02e3, B:126:0x02ec), top: B:225:0x02b5, inners: #6 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x034f A[Catch: all -> 0x02e9, TryCatch #5 {, blocks: (B:114:0x02b5, B:116:0x02d3, B:127:0x02f1, B:129:0x0302, B:131:0x0314, B:138:0x0357, B:132:0x0324, B:134:0x0332, B:136:0x0344, B:137:0x034f, B:118:0x02d7, B:121:0x02e3, B:126:0x02ec), top: B:225:0x02b5, inners: #6 }] */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        I6.i iVar;
        String string;
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
                ((O0) this.f1891b).f2626l.addView((View) p105o3.b.t0((p105o3.a) this.f1892c));
                return;
            case 7:
                ((H2.j) ((H2.h) this.f1891b).f3244b).f3259a.getWindow().setBackgroundDrawable((BitmapDrawable) this.f1892c);
                return;
            case 8:
                I2.M m7 = (I2.M) this.f1891b;
                SharedPreferences sharedPreferences = ((Context) this.f1892c).getSharedPreferences("admob", 0);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                try {
                    synchronized (m7.f3551a) {
                        try {
                            m7.f3556f = sharedPreferences;
                            m7.f3557g = editorEdit;
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
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    E2.o.f1952C.f1961g.zzw(th3, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
                    I2.J.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th3);
                    return;
                }
            case 9:
                break;
            case 10:
                ((A5.s) ((C1050x1) this.f1892c).f17933d).a("onAdEvent", (HashMap) this.f1891b, null);
                return;
            case 11:
                final Context context = (Context) this.f1891b;
                L5.U u4 = (L5.U) this.f1892c;
                final T0 t0E = T0.e();
                synchronized (t0E.f2634a) {
                    try {
                        if (t0E.f2636c) {
                            t0E.f2635b.add(u4);
                            return;
                        }
                        if (t0E.f2637d) {
                            u4.a(t0E.d());
                            return;
                        }
                        t0E.f2636c = true;
                        t0E.f2635b.add(u4);
                        if (context == null) {
                            throw new IllegalArgumentException("Context cannot be null.");
                        }
                        synchronized (t0E.f2638e) {
                            try {
                                t0E.c(context);
                                t0E.f2639f.zzs(new S0(t0E));
                                t0E.f2639f.zzo(new zzbok());
                                p167y2.u uVar = t0E.f2641h;
                                if (uVar.f18184a != -1 || uVar.f18185b != -1) {
                                    try {
                                        t0E.f2639f.zzu(new zzfs(uVar));
                                    } catch (RemoteException e9) {
                                        J2.j.e("Unable to set request configuration parcel.", e9);
                                    }
                                }
                            } catch (RemoteException e10) {
                                J2.j.h("MobileAdsSettingManager initialization failed", e10);
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
                                                    T0 t7 = t0E;
                                                    Context context2 = context;
                                                    synchronized (t7.f2638e) {
                                                        t7.b(context2);
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    T0 t8 = t0E;
                                                    Context context3 = context;
                                                    synchronized (t8.f2638e) {
                                                        t8.b(context3);
                                                        break;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                } else if (((Boolean) zzbdw.zzb.zze()).booleanValue()) {
                                    J2.j.b("Initializing on calling thread");
                                    t0E.b(context);
                                } else if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlg)).booleanValue()) {
                                    J2.b.f3804b.execute(new Runnable() { // from class: F2.P0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i7) {
                                                case 0:
                                                    T0 t7 = t0E;
                                                    Context context2 = context;
                                                    synchronized (t7.f2638e) {
                                                        t7.b(context2);
                                                        break;
                                                    }
                                                    return;
                                                default:
                                                    T0 t8 = t0E;
                                                    Context context3 = context;
                                                    synchronized (t8.f2638e) {
                                                        t8.b(context3);
                                                        break;
                                                    }
                                                    return;
                                            }
                                        }
                                    });
                                } else {
                                    J2.j.b("Initializing on calling thread");
                                    t0E.b(context);
                                }
                            } else if (((Boolean) zzbdw.zzb.zze()).booleanValue()) {
                                J2.j.b("Initializing on calling thread");
                                t0E.b(context);
                            } else if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlg)).booleanValue()) {
                                J2.b.f3804b.execute(new Runnable() { // from class: F2.P0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i7) {
                                            case 0:
                                                T0 t7 = t0E;
                                                Context context2 = context;
                                                synchronized (t7.f2638e) {
                                                    t7.b(context2);
                                                    break;
                                                }
                                                return;
                                            default:
                                                T0 t8 = t0E;
                                                Context context3 = context;
                                                synchronized (t8.f2638e) {
                                                    t8.b(context3);
                                                    break;
                                                }
                                                return;
                                        }
                                    }
                                });
                            } else {
                                J2.j.b("Initializing on calling thread");
                                t0E.b(context);
                            }
                            break;
                        }
                        return;
                    } catch (Throwable th4) {
                        throw th4;
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
                String str = wVar.f5573c;
                oVar.getClass();
                if (TextUtils.isEmpty(str) || oVar.b()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(Message.JsonKeys.PARAMS, vVar.f5563a);
                    jSONObject2.put("signal_dictionary", C0252s.f2717f.f2718a.j(vVar.f5568f));
                    jSONObject.put("sr", jSONObject2);
                    String str2 = vVar.f5565c;
                    if (TextUtils.isEmpty(str2)) {
                        string = "";
                    } else {
                        jSONObject.put("rs", Base64.encodeToString(P2.o.a(str2).getBytes(StandardCharsets.UTF_8), 10));
                        E2.o.f1952C.j.getClass();
                        jSONObject.put("ts_ms", System.currentTimeMillis());
                        string = jSONObject.toString();
                    }
                } catch (JSONException e11) {
                    E2.o.f1952C.f1961g.zzw(e11, "DiskCachingManager.createStringToWrite");
                }
                if (TextUtils.isEmpty(string)) {
                    return;
                }
                P2.A a2 = oVar.f5539b;
                a2.e();
                synchronized (a2.f5403d) {
                    a2.f5401b.putString(str, string).commit();
                    break;
                }
                return;
            case 16:
                C0375a c0375a = (C0375a) this.f1891b;
                Uri uriZza = Uri.parse((String) this.f1892c);
                try {
                    uriZza = (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzlX)).booleanValue() || (zzfbeVar = c0375a.f5463d) == null) ? c0375a.f5462c.zza(uriZza, c0375a.f5460a, c0375a.f5461b, null) : zzfbeVar.zza(uriZza, c0375a.f5460a, c0375a.f5461b, null);
                    break;
                } catch (zzaup e12) {
                    int i10 = I2.J.f3546b;
                    J2.j.c("Failed to append the click signal to URL: ", e12);
                    E2.o.f1952C.f1961g.zzw(e12, "TaggingLibraryJsInterface.recordClick");
                }
                c0375a.f5468i.zzd(uriZza.toString(), null, null);
                return;
            case 17:
                ((V5.a) this.f1892c).f6677f.unregisterNetworkCallback((C0318e) this.f1891b);
                return;
            case 18:
                ((V5.a) this.f1892c).f6676e.unregisterReceiver((C0319f) this.f1891b);
                return;
            case 19:
                com.google.firebase.storage.A a4 = (com.google.firebase.storage.A) this.f1892c;
                String strB = Q0.a.B(a4.f11987q);
                String strA = Q0.a.A(a4.f11988r);
                Y3.i iVar2 = a4.f11982l.f12045b.f12012a;
                iVar2.b();
                ((T4.f) this.f1891b).n(iVar2.f7663a, strB, strA);
                return;
            case 20:
                ((E5.U) this.f1891b).a((FirebaseAuth) this.f1892c);
                return;
            case zzbbd.zzt.zzm /* 21 */:
                ((p034e4.m) this.f1891b).onVerificationFailed((Y3.j) this.f1892c);
                return;
            case 22:
                ((C0183a) this.f1891b).a((FirebaseAuth) this.f1892c);
                return;
            case 23:
                FirebaseAuth firebaseAuth = (FirebaseAuth) this.f1891b;
                Iterator it = firebaseAuth.f11851c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0892a) it.next()).a((O4.b) this.f1892c);
                }
                Iterator it2 = firebaseAuth.f11850b.iterator();
                while (it2.hasNext()) {
                    ((E5.U) it2.next()).a(firebaseAuth);
                }
                return;
            case 24:
                p023d1.n nVarD = p023d1.n.d();
                String str3 = p039f1.a.f12772d;
                p088m1.i iVar3 = (p088m1.i) this.f1891b;
                nVarD.b(str3, p155w1.L.i("Scheduling work ", iVar3.f15222a), new Throwable[0]);
                ((p039f1.a) this.f1892c).f12773a.e(iVar3);
                return;
            case 25:
                FirebaseAuth firebaseAuth2 = FirebaseAuth.getInstance(Y3.i.f((String) this.f1891b));
                FirebaseUser firebaseUser = firebaseAuth2.f11854f;
                if (firebaseUser != null) {
                    Task taskH = firebaseAuth2.h(firebaseUser, true);
                    C0899h.f12943f.e("Token refreshing started", new Object[0]);
                    taskH.addOnFailureListener(new C0901j(this, i8));
                    return;
                }
                return;
            case 26:
                a();
                return;
            case 27:
                p028d6.k kVar = (p028d6.k) this.f1892c;
                C0940m c0940m = (C0940m) kVar.f12447b;
                C0934g c0934g = (C0934g) kVar.f12448c;
                p120q4.j jVar = (p120q4.j) ((p120q4.e) this.f1891b).f15864b;
                p083l4.s sVar = c0940m.f15455c;
                ArrayList arrayListL = c0934g.l();
                p098n4.M m8 = new p098n4.M(c0940m, c0934g, jVar);
                if (sVar.a()) {
                    sVar.n("oc", arrayListL, null, m8);
                } else {
                    sVar.f15001m.add(new p083l4.n("oc", arrayListL, null, m8));
                }
                sVar.c();
                return;
            case 28:
                throw new RuntimeException((String) this.f1891b, (Throwable) this.f1892c);
            default:
                for (p067j1.b bVar : (ArrayList) this.f1891b) {
                    Object obj3 = ((p072k1.d) this.f1892c).f14674e;
                    bVar.f14553b = obj3;
                    bVar.d(bVar.f14555d, obj3);
                }
                return;
        }
        do {
            try {
                ((Runnable) this.f1891b).run();
            } catch (Throwable th5) {
                E.k(p065i6.j.f14074a, th5);
            }
            iVar = (I6.i) this.f1892c;
            Runnable runnableF = iVar.f();
            if (runnableF == null) {
                return;
            }
            this.f1891b = runnableF;
            i8++;
        } while (i8 < 16);
        K6.k kVar2 = iVar.f3735c;
        kVar2.getClass();
        kVar2.d(iVar, this);
    }

    public String toString() {
        String str;
        switch (this.f1890a) {
            case 26:
                Runnable runnable = (Runnable) this.f1891b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i7 = ((p056h4.j) this.f1892c).f13565c;
                if (i7 == 1) {
                    str = "IDLE";
                } else if (i7 == 2) {
                    str = "QUEUING";
                } else if (i7 != 3) {
                    str = i7 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
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

    public y0(C0899h c0899h, String str) {
        this.f1890a = 25;
        this.f1892c = c0899h;
        com.google.android.gms.common.internal.D.e(str);
        this.f1891b = str;
    }

    public y0(p056h4.j jVar) {
        this.f1890a = 26;
        this.f1892c = jVar;
    }
}
