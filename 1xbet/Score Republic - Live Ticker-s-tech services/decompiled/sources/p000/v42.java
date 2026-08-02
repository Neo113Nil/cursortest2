package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v42 extends mx1 {

    /* JADX INFO: renamed from: l */
    public final q42 f8064l;

    /* JADX INFO: renamed from: m */
    public nx1 f8065m;

    /* JADX INFO: renamed from: n */
    public volatile Boolean f8066n;

    /* JADX INFO: renamed from: o */
    public final a42 f8067o;

    /* JADX INFO: renamed from: p */
    public ScheduledExecutorService f8068p;

    /* JADX INFO: renamed from: q */
    public final C0683s8 f8069q;

    /* JADX INFO: renamed from: r */
    public final ArrayList f8070r;

    /* JADX INFO: renamed from: s */
    public final a42 f8071s;

    public v42(f02 f02Var) {
        super(f02Var);
        this.f8070r = new ArrayList();
        this.f8069q = new C0683s8(f02Var.f2252t);
        this.f8064l = new q42(this);
        this.f8067o = new a42(this, f02Var, 0);
        this.f8071s = new a42(this, f02Var, 1);
    }

    @Override // p000.mx1
    /* JADX INFO: renamed from: D */
    public final boolean mo533D() {
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m5057E(AtomicReference atomicReference) {
        mo11z();
        m3446B();
        m5067O(new RunnableC0702sr(this, atomicReference, m5069Q(false)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX INFO: renamed from: F */
    public final void m5058F(Bundle bundle) {
        boolean z;
        boolean zM537H;
        mo11z();
        m3446B();
        eu1 eu1Var = new eu1(bundle);
        m5065M();
        f02 f02Var = (f02) this.f7192j;
        if (f02Var.f2245m.m770L(null, jx1.f4157W0)) {
            ay1 ay1VarM1572o = f02Var.m1572o();
            f02 f02Var2 = (f02) ay1VarM1572o.f7192j;
            f72 f72Var = f02Var2.f2250r;
            ky1 ky1Var = f02Var2.f2247o;
            f02.m1558k(f72Var);
            byte[] bArrM1693k0 = f72.m1693k0(eu1Var);
            if (bArrM1693k0 == null) {
                f02.m1560m(ky1Var);
                ky1Var.f4601p.m5312a("Null default event parameters; not writing to database");
            } else {
                if (bArrM1693k0.length > 131072) {
                    f02.m1560m(ky1Var);
                    ky1Var.f4601p.m5312a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zM537H = ay1VarM1572o.m537H(4, bArrM1693k0);
                }
                if (zM537H) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zM537H = false;
            if (zM537H) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        m5067O(new z12(this, m5069Q(false), z, eu1Var, bundle));
    }

    /* JADX INFO: renamed from: G */
    public final void m5059G() {
        mo11z();
        m3446B();
        if (m5070R()) {
            return;
        }
        if (m5060H()) {
            q42 q42Var = this.f8064l;
            v42 v42Var = q42Var.f6377l;
            v42Var.mo11z();
            Context context = ((f02) v42Var.f7192j).f2242j;
            synchronized (q42Var) {
                try {
                    if (q42Var.f6375j) {
                        ky1 ky1Var = ((f02) q42Var.f6377l.f7192j).f2247o;
                        f02.m1560m(ky1Var);
                        ky1Var.f4608w.m5312a("Connection attempt already in progress");
                        return;
                    } else {
                        if (q42Var.f6376k != null && (q42Var.f6376k.m3892q() || q42Var.f6376k.m3891p())) {
                            ky1 ky1Var2 = ((f02) q42Var.f6377l.f7192j).f2247o;
                            f02.m1560m(ky1Var2);
                            ky1Var2.f4608w.m5312a("Already awaiting connection attempt");
                            return;
                        }
                        q42Var.f6376k = new ey1(context, Looper.getMainLooper(), j72.m2823a(context), i90.f3485b, 93, q42Var, q42Var, null);
                        ky1 ky1Var3 = ((f02) q42Var.f6377l.f7192j).f2247o;
                        f02.m1560m(ky1Var3);
                        ky1Var3.f4608w.m5312a("Connecting to remote service");
                        q42Var.f6375j = true;
                        p80.m3863h(q42Var.f6376k);
                        q42Var.f6376k.m3886a();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        f02 f02Var = (f02) this.f7192j;
        if (f02Var.f2245m.m762D()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = f02Var.f2242j.getPackageManager().queryIntentServices(new Intent().setClassName(f02Var.f2242j, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            ky1 ky1Var4 = f02Var.f2247o;
            f02.m1560m(ky1Var4);
            ky1Var4.f4600o.m5312a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(f02Var.f2242j, "com.google.android.gms.measurement.AppMeasurementService"));
        q42 q42Var2 = this.f8064l;
        v42 v42Var2 = q42Var2.f6377l;
        v42Var2.mo11z();
        Context context2 = ((f02) v42Var2.f7192j).f2242j;
        b90 b90VarM606u = b90.m606u();
        synchronized (q42Var2) {
            try {
                boolean z = q42Var2.f6375j;
                v42 v42Var3 = q42Var2.f6377l;
                if (z) {
                    ky1 ky1Var5 = ((f02) v42Var3.f7192j).f2247o;
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4608w.m5312a("Connection attempt already in progress");
                } else {
                    ky1 ky1Var6 = ((f02) v42Var3.f7192j).f2247o;
                    f02.m1560m(ky1Var6);
                    ky1Var6.f4608w.m5312a("Using local app measurement service");
                    q42Var2.f6375j = true;
                    b90VarM606u.m623s(context2, intent, v42Var3.f8064l, 129);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m5060H() {
        mo11z();
        m3446B();
        if (this.f8066n == null) {
            mo11z();
            m3446B();
            f02 f02Var = (f02) this.f7192j;
            fz1 fz1Var = f02Var.f2246n;
            f02.m1558k(fz1Var);
            fz1Var.mo11z();
            boolean z = false;
            Boolean boolValueOf = !fz1Var.m1908E().contains("use_service") ? null : Boolean.valueOf(fz1Var.m1908E().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                vx1 vx1VarM1575r = ((f02) this.f7192j).m1575r();
                vx1VarM1575r.m3446B();
                if (vx1VarM1575r.f8295w == 1) {
                    z = true;
                } else {
                    ky1 ky1Var = f02Var.f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4608w.m5312a("Checking service availability");
                    f72 f72Var = f02Var.f2250r;
                    f02.m1558k(f72Var);
                    int iM2575b = i90.f3485b.m2575b(((f02) f72Var.f7192j).f2242j, 12451000);
                    if (iM2575b == 0) {
                        ky1 ky1Var2 = f02Var.f2247o;
                        f02.m1560m(ky1Var2);
                        ky1Var2.f4608w.m5312a("Service available");
                    } else if (iM2575b == 1) {
                        ky1 ky1Var3 = f02Var.f2247o;
                        f02.m1560m(ky1Var3);
                        ky1Var3.f4608w.m5312a("Service missing");
                    } else if (iM2575b != 2) {
                        if (iM2575b != 3) {
                            ky1 ky1Var4 = f02Var.f2247o;
                            if (iM2575b == 9) {
                                f02.m1560m(ky1Var4);
                                ky1Var4.f4603r.m5312a("Service invalid");
                            } else if (iM2575b != 18) {
                                f02.m1560m(ky1Var4);
                                ky1Var4.f4603r.m5313b(Integer.valueOf(iM2575b), "Unexpected service status");
                            } else {
                                f02.m1560m(ky1Var4);
                                ky1Var4.f4603r.m5312a("Service updating");
                            }
                        } else {
                            ky1 ky1Var5 = f02Var.f2247o;
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4603r.m5312a("Service disabled");
                        }
                        z2 = false;
                    } else {
                        ky1 ky1Var6 = f02Var.f2247o;
                        f02.m1560m(ky1Var6);
                        ky1Var6.f4607v.m5312a("Service container out of date");
                        f72 f72Var2 = f02Var.f2250r;
                        f02.m1558k(f72Var2);
                        if (f72Var2.m1731m0() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && f02Var.f2245m.m762D()) {
                    ky1 ky1Var7 = f02Var.f2247o;
                    f02.m1560m(ky1Var7);
                    ky1Var7.f4600o.m5312a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    fz1 fz1Var2 = f02Var.f2246n;
                    f02.m1558k(fz1Var2);
                    fz1Var2.mo11z();
                    SharedPreferences.Editor editorEdit = fz1Var2.m1908E().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.f8066n = Boolean.valueOf(z2);
        }
        return this.f8066n.booleanValue();
    }

    /* JADX INFO: renamed from: I */
    public final void m5061I() {
        mo11z();
        m3446B();
        q42 q42Var = this.f8064l;
        if (q42Var.f6376k != null && (q42Var.f6376k.m3891p() || q42Var.f6376k.m3892q())) {
            q42Var.f6376k.m3887c();
        }
        q42Var.f6376k = null;
        try {
            b90.m606u().m625w(((f02) this.f7192j).f2242j, q42Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f8065m = null;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m5062J() {
        mo11z();
        m3446B();
        if (!m5060H()) {
            return true;
        }
        f72 f72Var = ((f02) this.f7192j).f2250r;
        f02.m1558k(f72Var);
        return f72Var.m1731m0() >= ((Integer) jx1.f4131J0.m2715a(null)).intValue();
    }

    /* JADX INFO: renamed from: K */
    public final boolean m5063K() {
        mo11z();
        m3446B();
        if (!m5060H()) {
            return true;
        }
        f72 f72Var = ((f02) this.f7192j).f2250r;
        f02.m1558k(f72Var);
        return f72Var.m1731m0() >= 241200;
    }

    /* JADX INFO: renamed from: L */
    public final void m5064L(ComponentName componentName) {
        mo11z();
        if (this.f8065m != null) {
            this.f8065m = null;
            ky1 ky1Var = ((f02) this.f7192j).f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4608w.m5313b(componentName, "Disconnected from device MeasurementService");
            mo11z();
            m5059G();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m5065M() {
        ((f02) this.f7192j).getClass();
    }

    /* JADX INFO: renamed from: N */
    public final void m5066N() {
        mo11z();
        C0683s8 c0683s8 = this.f8069q;
        ((wa0) c0683s8.f7048k).getClass();
        c0683s8.f7047j = SystemClock.elapsedRealtime();
        ((f02) this.f7192j).getClass();
        this.f8067o.m4403b(((Long) jx1.f4160Y.m2715a(null)).longValue());
    }

    /* JADX INFO: renamed from: O */
    public final void m5067O(Runnable runnable) {
        mo11z();
        if (m5070R()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f8070r;
        long size = arrayList.size();
        f02 f02Var = (f02) this.f7192j;
        f02Var.getClass();
        if (size >= 1000) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4600o.m5312a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f8071s.m4403b(60000L);
            m5059G();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m5068P() {
        mo11z();
        f02 f02Var = (f02) this.f7192j;
        ky1 ky1Var = f02Var.f2247o;
        f02.m1560m(ky1Var);
        wc1 wc1Var = ky1Var.f4608w;
        ArrayList arrayList = this.f8070r;
        wc1Var.m5313b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                ky1 ky1Var2 = f02Var.f2247o;
                f02.m1560m(ky1Var2);
                ky1Var2.f4600o.m5313b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f8071s.m4404c();
    }

    /* JADX INFO: renamed from: Q */
    public final z72 m5069Q(boolean z) {
        long jAbs;
        Pair pair;
        f02 f02Var = (f02) this.f7192j;
        f02Var.getClass();
        vx1 vx1VarM1575r = f02Var.m1575r();
        String strM286i = null;
        if (z) {
            ky1 ky1Var = f02Var.f2247o;
            f02.m1560m(ky1Var);
            f02 f02Var2 = (f02) ky1Var.f7192j;
            fz1 fz1Var = f02Var2.f2246n;
            f02.m1558k(fz1Var);
            if (fz1Var.f2551n != null) {
                fz1 fz1Var2 = f02Var2.f2246n;
                f02.m1558k(fz1Var2);
                C0593pt c0593pt = fz1Var2.f2551n;
                fz1 fz1Var3 = (fz1) c0593pt.f6251n;
                fz1Var3.mo11z();
                fz1Var3.mo11z();
                long j = ((fz1) c0593pt.f6251n).m1908E().getLong((String) c0593pt.f6248k, 0L);
                if (j == 0) {
                    c0593pt.m3985d();
                    jAbs = 0;
                } else {
                    ((f02) fz1Var3.f7192j).f2252t.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = c0593pt.f6247j;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    c0593pt.m3985d();
                    pair = null;
                } else {
                    String string = fz1Var3.m1908E().getString((String) c0593pt.f6250m, null);
                    long j3 = fz1Var3.m1908E().getLong((String) c0593pt.f6249l, 0L);
                    c0593pt.m3985d();
                    pair = (string == null || j3 <= 0) ? fz1.f2540I : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != fz1.f2540I) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strM286i = AbstractC0024an.m286i(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return vx1VarM1575r.m5217E(strM286i);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m5070R() {
        mo11z();
        m3446B();
        return this.f8065m != null;
    }

    /* JADX WARN: Code duplicated, block: B:258:0x043a A[Catch: all -> 0x0476, TRY_ENTER, TryCatch #52 {all -> 0x0476, blocks: (B:268:0x0466, B:258:0x043a, B:260:0x0440, B:261:0x0443, B:278:0x0487, B:207:0x0371, B:209:0x037b, B:214:0x038c), top: B:395:0x0466 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0452  */
    /* JADX WARN: Code duplicated, block: B:271:0x046d  */
    /* JADX WARN: Code duplicated, block: B:273:0x0472 A[PHI: r4 r6 r23 r24 r26 r36 r37
      0x0472: PHI (r4v15 android.database.sqlite.SQLiteDatabase) = 
      (r4v12 android.database.sqlite.SQLiteDatabase)
      (r4v13 android.database.sqlite.SQLiteDatabase)
      (r4v16 android.database.sqlite.SQLiteDatabase)
     binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x0496  */
    /* JADX WARN: Code duplicated, block: B:285:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:287:0x04af  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:300:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:302:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:304:0x0505  */
    /* JADX WARN: Code duplicated, block: B:305:0x058f  */
    /* JADX WARN: Code duplicated, block: B:316:0x05bc A[Catch: RemoteException -> 0x05ea, TRY_LEAVE, TryCatch #42 {RemoteException -> 0x05ea, blocks: (B:314:0x05b1, B:316:0x05bc), top: B:385:0x05b1 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:337:0x0626  */
    /* JADX WARN: Code duplicated, block: B:339:0x062a  */
    /* JADX WARN: Code duplicated, block: B:341:0x064b  */
    /* JADX WARN: Code duplicated, block: B:347:0x066a  */
    /* JADX WARN: Code duplicated, block: B:353:0x0682  */
    /* JADX WARN: Code duplicated, block: B:361:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:379:0x0657 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x066e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0597 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x049c A[SYNTHETIC] */
    /* JADX INFO: renamed from: S */
    public final void m5071S(nx1 nx1Var, AbstractC0823w0 abstractC0823w0, z72 z72Var) throws Throwable {
        ArrayList arrayList;
        f02 f02Var;
        Context context;
        ky1 ky1Var;
        int i;
        SQLiteDatabase sQLiteDatabaseM536G;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        int i4;
        long j2;
        String string;
        eu1 eu1VarCreateFromParcel;
        int i5;
        hr1 hr1VarCreateFromParcel;
        b72 b72VarCreateFromParcel;
        int size;
        int size2;
        int i6;
        yx1 yx1Var;
        AbstractC0823w0 abstractC0823w1;
        ix1 ix1Var;
        f02 f02Var2;
        Context context2;
        ky1 ky1Var2;
        long jElapsedRealtime;
        long j3;
        long jCurrentTimeMillis;
        String str2;
        mo11z();
        m3446B();
        m5065M();
        f02 f02Var3 = (f02) this.f7192j;
        f02Var3.getClass();
        Context context3 = f02Var3.f2242j;
        bt1 bt1Var = f02Var3.f2245m;
        ky1 ky1Var3 = f02Var3.f2247o;
        wa0 wa0Var = f02Var3.f2252t;
        int i7 = 100;
        z72 z72Var2 = z72Var;
        int i8 = 0;
        for (int i9 = 100; i8 < 1001 && i9 == i7; i9 = size) {
            ArrayList arrayList2 = new ArrayList();
            ay1 ay1VarM1572o = f02Var3.m1572o();
            String str3 = "entry";
            int i10 = i7;
            String str4 = "type";
            String str5 = "rowid";
            wa0 wa0Var2 = wa0Var;
            f02 f02Var4 = (f02) ay1VarM1572o.f7192j;
            ay1VarM1572o.mo11z();
            int i11 = i8;
            if (ay1VarM1572o.f657m) {
                f02Var = f02Var3;
                context = context3;
                ky1Var = ky1Var3;
            } else {
                arrayList = new ArrayList();
                f02Var = f02Var3;
                if (((f02) ay1VarM1572o.f7192j).f2242j.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i12 = 5;
                    context = context3;
                    ky1Var = ky1Var3;
                    int i13 = 0;
                    int i14 = 5;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                sQLiteDatabaseM536G = ay1VarM1572o.m536G();
                                if (sQLiteDatabaseM536G == null) {
                                    try {
                                        try {
                                            ay1VarM1572o.f657m = true;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseM536G != null) {
                                                sQLiteDatabaseM536G.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        try {
                                            SystemClock.sleep(i14);
                                            i14 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM536G != null) {
                                                sQLiteDatabaseM536G.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseM536G != null) {
                                                sQLiteDatabaseM536G.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        ky1 ky1Var4 = f02Var4.f2247o;
                                        f02.m1560m(ky1Var4);
                                        ky1Var4.f4600o.m5313b(e, "Error reading entries from local database");
                                        ay1VarM1572o.f657m = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM536G != null) {
                                            sQLiteDatabaseM536G.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseM536G != null) {
                                            sQLiteDatabaseM536G.endTransaction();
                                        }
                                        ky1 ky1Var5 = f02Var4.f2247o;
                                        f02.m1560m(ky1Var5);
                                        ky1Var5.f4600o.m5313b(e, "Error reading entries from local database");
                                        ay1VarM1572o.f657m = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseM536G != null) {
                                            sQLiteDatabaseM536G.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    }
                                } else {
                                    sQLiteDatabaseM536G.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseM536G.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j4 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i2 = i13;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM536G != null) {
                                                            sQLiteDatabaseM536G.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        ky1 ky1Var6 = f02Var4.f2247o;
                                                        f02.m1560m(ky1Var6);
                                                        ky1Var6.f4600o.m5313b(e, "Error reading entries from local database");
                                                        ay1VarM1572o.f657m = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM536G != null) {
                                                            sQLiteDatabaseM536G.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM536G != null && sQLiteDatabaseM536G.inTransaction()) {
                                                            sQLiteDatabaseM536G.endTransaction();
                                                        }
                                                        ky1 ky1Var7 = f02Var4.f2247o;
                                                        f02.m1560m(ky1Var7);
                                                        ky1Var7.f4600o.m5313b(e, "Error reading entries from local database");
                                                        ay1VarM1572o.f657m = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM536G != null) {
                                                            sQLiteDatabaseM536G.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i3 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM536G != null) {
                                                                sQLiteDatabaseM536G.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            ky1 ky1Var8 = f02Var4.f2247o;
                                                            f02.m1560m(ky1Var8);
                                                            ky1Var8.f4600o.m5313b(e, "Error reading entries from local database");
                                                            ay1VarM1572o.f657m = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM536G != null) {
                                                                sQLiteDatabaseM536G.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseM536G != null) {
                                                                sQLiteDatabaseM536G.endTransaction();
                                                            }
                                                            ky1 ky1Var9 = f02Var4.f2247o;
                                                            f02.m1560m(ky1Var9);
                                                            ky1Var9.f4600o.m5313b(e, "Error reading entries from local database");
                                                            ay1VarM1572o.f657m = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM536G != null) {
                                                                sQLiteDatabaseM536G.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseM536G != null) {
                                                                sQLiteDatabaseM536G.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i13;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str5, str4, str3};
                                                bt1 bt1Var2 = f02Var4.f2245m;
                                                ix1 ix1Var2 = jx1.f4157W0;
                                                str5 = str5;
                                                try {
                                                    try {
                                                        int i15 = 4;
                                                        int i16 = 3;
                                                        if (bt1Var2.m770L(null, ix1Var2)) {
                                                            i4 = 5;
                                                            try {
                                                                strArr2 = new String[]{str5, str4, str3, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM536G != null) {
                                                                    sQLiteDatabaseM536G.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                ky1 ky1Var10 = f02Var4.f2247o;
                                                                f02.m1560m(ky1Var10);
                                                                ky1Var10.f4600o.m5313b(e, "Error reading entries from local database");
                                                                ay1VarM1572o.f657m = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM536G != null) {
                                                                    sQLiteDatabaseM536G.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseM536G != null) {
                                                                    sQLiteDatabaseM536G.endTransaction();
                                                                }
                                                                ky1 ky1Var11 = f02Var4.f2247o;
                                                                f02.m1560m(ky1Var11);
                                                                ky1Var11.f4600o.m5313b(e, "Error reading entries from local database");
                                                                ay1VarM1572o.f657m = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM536G != null) {
                                                                    sQLiteDatabaseM536G.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            i4 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseM536G.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i10));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j4 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i17 = cursorQuery.getInt(1);
                                                                                str4 = str4;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str3 = str3;
                                                                                    try {
                                                                                        if (f02Var4.f2245m.m770L(null, ix1Var2)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i16);
                                                                                                j2 = cursorQuery.getLong(i15);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM536G != null) {
                                                                                                    sQLiteDatabaseM536G.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e9) {
                                                                                                e = e9;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                i3 = 5;
                                                                                                ky1 ky1Var12 = f02Var4.f2247o;
                                                                                                f02.m1560m(ky1Var12);
                                                                                                ky1Var12.f4600o.m5313b(e, "Error reading entries from local database");
                                                                                                ay1VarM1572o.f657m = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM536G != null) {
                                                                                                    sQLiteDatabaseM536G.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseM536G != null) {
                                                                                                    sQLiteDatabaseM536G.endTransaction();
                                                                                                }
                                                                                                ky1 ky1Var13 = f02Var4.f2247o;
                                                                                                f02.m1560m(ky1Var13);
                                                                                                ky1Var13.f4600o.m5313b(e, "Error reading entries from local database");
                                                                                                ay1VarM1572o.f657m = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM536G != null) {
                                                                                                    sQLiteDatabaseM536G.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            j2 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i17 == 0) {
                                                                                            cursorQuery = cursorQuery;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            fu1 fu1VarCreateFromParcel = fu1.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (fu1VarCreateFromParcel != null) {
                                                                                                                arrayList.add(new yx1(fu1VarCreateFromParcel, string, j2));
                                                                                                            }
                                                                                                        } catch (r41 unused6) {
                                                                                                            ky1 ky1Var14 = f02Var4.f2247o;
                                                                                                            f02.m1560m(ky1Var14);
                                                                                                            ky1Var14.f4600o.m5312a("Failed to load event from local database");
                                                                                                            parcelObtain.recycle();
                                                                                                        }
                                                                                                    } catch (Throwable th5) {
                                                                                                        parcelObtain.recycle();
                                                                                                        throw th5;
                                                                                                    }
                                                                                                } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                    sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                    i3 = 5;
                                                                                                    SystemClock.sleep(i14);
                                                                                                    i14 += 20;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM536G != null) {
                                                                                                        sQLiteDatabaseM536G.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteFullException e11) {
                                                                                                    e = e11;
                                                                                                    sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                    i3 = 5;
                                                                                                    ky1 ky1Var15 = f02Var4.f2247o;
                                                                                                    f02.m1560m(ky1Var15);
                                                                                                    ky1Var15.f4600o.m5313b(e, "Error reading entries from local database");
                                                                                                    ay1VarM1572o.f657m = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM536G != null) {
                                                                                                        sQLiteDatabaseM536G.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteException e12) {
                                                                                                    e = e12;
                                                                                                    sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                    i3 = 5;
                                                                                                    if (sQLiteDatabaseM536G != null) {
                                                                                                        sQLiteDatabaseM536G.endTransaction();
                                                                                                    }
                                                                                                    ky1 ky1Var16 = f02Var4.f2247o;
                                                                                                    f02.m1560m(ky1Var16);
                                                                                                    ky1Var16.f4600o.m5313b(e, "Error reading entries from local database");
                                                                                                    ay1VarM1572o.f657m = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM536G != null) {
                                                                                                        sQLiteDatabaseM536G.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                }
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                                sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                cursor = cursorQuery;
                                                                                                if (cursor != null) {
                                                                                                    cursor.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM536G != null) {
                                                                                                    sQLiteDatabaseM536G.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } else {
                                                                                            cursorQuery = cursorQuery;
                                                                                            if (i17 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        b72VarCreateFromParcel = b72.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (Throwable th7) {
                                                                                                        parcelObtain2.recycle();
                                                                                                        throw th7;
                                                                                                    }
                                                                                                } catch (r41 unused8) {
                                                                                                    ky1 ky1Var17 = f02Var4.f2247o;
                                                                                                    f02.m1560m(ky1Var17);
                                                                                                    ky1Var17.f4600o.m5312a("Failed to load user property from local database");
                                                                                                    parcelObtain2.recycle();
                                                                                                    b72VarCreateFromParcel = null;
                                                                                                }
                                                                                                if (b72VarCreateFromParcel != null) {
                                                                                                    arrayList.add(new yx1(b72VarCreateFromParcel, string, j2));
                                                                                                }
                                                                                            } else {
                                                                                                if (i17 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            hr1VarCreateFromParcel = hr1.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (r41 unused9) {
                                                                                                            ky1 ky1Var18 = f02Var4.f2247o;
                                                                                                            f02.m1560m(ky1Var18);
                                                                                                            ky1Var18.f4600o.m5312a("Failed to load conditional user property from local database");
                                                                                                            parcelObtain3.recycle();
                                                                                                            hr1VarCreateFromParcel = null;
                                                                                                        }
                                                                                                        if (hr1VarCreateFromParcel != null) {
                                                                                                            arrayList.add(new yx1(hr1VarCreateFromParcel, string, j2));
                                                                                                        }
                                                                                                    } catch (Throwable th8) {
                                                                                                        parcelObtain3.recycle();
                                                                                                        throw th8;
                                                                                                    }
                                                                                                } else if (i17 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    eu1VarCreateFromParcel = eu1.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                                        i3 = 5;
                                                                                                                        SystemClock.sleep(i14);
                                                                                                                        i14 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM536G != null) {
                                                                                                                            sQLiteDatabaseM536G.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteFullException e13) {
                                                                                                                        e = e13;
                                                                                                                        sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                                        i3 = 5;
                                                                                                                        ky1 ky1Var19 = f02Var4.f2247o;
                                                                                                                        f02.m1560m(ky1Var19);
                                                                                                                        ky1Var19.f4600o.m5313b(e, "Error reading entries from local database");
                                                                                                                        ay1VarM1572o.f657m = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM536G != null) {
                                                                                                                            sQLiteDatabaseM536G.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteException e14) {
                                                                                                                        e = e14;
                                                                                                                        sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                                        i3 = 5;
                                                                                                                        if (sQLiteDatabaseM536G != null) {
                                                                                                                            sQLiteDatabaseM536G.endTransaction();
                                                                                                                        }
                                                                                                                        ky1 ky1Var110 = f02Var4.f2247o;
                                                                                                                        f02.m1560m(ky1Var110);
                                                                                                                        ky1Var110.f4600o.m5313b(e, "Error reading entries from local database");
                                                                                                                        ay1VarM1572o.f657m = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM536G != null) {
                                                                                                                            sQLiteDatabaseM536G.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                } catch (r41 unused11) {
                                                                                                                    ky1 ky1Var20 = f02Var4.f2247o;
                                                                                                                    f02.m1560m(ky1Var20);
                                                                                                                    ky1Var20.f4600o.m5312a("Failed to load default event parameters from local database");
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    eu1VarCreateFromParcel = null;
                                                                                                                }
                                                                                                                if (eu1VarCreateFromParcel != null) {
                                                                                                                    arrayList.add(new yx1(eu1VarCreateFromParcel, string, j2));
                                                                                                                }
                                                                                                                i5 = 3;
                                                                                                            } catch (Throwable th9) {
                                                                                                                th = th9;
                                                                                                                parcelObtain4.recycle();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (r41 unused12) {
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                        i3 = 5;
                                                                                                        SystemClock.sleep(i14);
                                                                                                        i14 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM536G != null) {
                                                                                                            sQLiteDatabaseM536G.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteFullException e15) {
                                                                                                        e = e15;
                                                                                                        sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                        i3 = 5;
                                                                                                        ky1 ky1Var111 = f02Var4.f2247o;
                                                                                                        f02.m1560m(ky1Var111);
                                                                                                        ky1Var111.f4600o.m5313b(e, "Error reading entries from local database");
                                                                                                        ay1VarM1572o.f657m = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM536G != null) {
                                                                                                            sQLiteDatabaseM536G.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteException e16) {
                                                                                                        e = e16;
                                                                                                        sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                                        i3 = 5;
                                                                                                        if (sQLiteDatabaseM536G != null) {
                                                                                                            sQLiteDatabaseM536G.endTransaction();
                                                                                                        }
                                                                                                        ky1 ky1Var112 = f02Var4.f2247o;
                                                                                                        f02.m1560m(ky1Var112);
                                                                                                        ky1Var112.f4600o.m5313b(e, "Error reading entries from local database");
                                                                                                        ay1VarM1572o.f657m = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM536G != null) {
                                                                                                            sQLiteDatabaseM536G.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    }
                                                                                                } else {
                                                                                                    ky1 ky1Var21 = f02Var4.f2247o;
                                                                                                    i5 = 3;
                                                                                                    if (i17 == 3) {
                                                                                                        f02.m1560m(ky1Var21);
                                                                                                        ky1Var21.f4608w.m5312a("Skipping app launch break");
                                                                                                    } else {
                                                                                                        f02.m1560m(ky1Var21);
                                                                                                        ky1Var21.f4600o.m5312a("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i16 = i5;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                ix1Var2 = ix1Var2;
                                                                                                cursorQuery = cursorQuery;
                                                                                                i15 = 4;
                                                                                            }
                                                                                        }
                                                                                        i5 = 3;
                                                                                        i16 = i5;
                                                                                        str4 = str4;
                                                                                        str3 = str3;
                                                                                        ix1Var2 = ix1Var2;
                                                                                        cursorQuery = cursorQuery;
                                                                                        i15 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e17) {
                                                                                        e = e17;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e18) {
                                                                                        e = e18;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                    i3 = 5;
                                                                                    SystemClock.sleep(i14);
                                                                                    i14 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM536G != null) {
                                                                                        sQLiteDatabaseM536G.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteFullException e19) {
                                                                                    e = e19;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                    i3 = 5;
                                                                                    ky1 ky1Var113 = f02Var4.f2247o;
                                                                                    f02.m1560m(ky1Var113);
                                                                                    ky1Var113.f4600o.m5313b(e, "Error reading entries from local database");
                                                                                    ay1VarM1572o.f657m = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM536G != null) {
                                                                                        sQLiteDatabaseM536G.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteException e20) {
                                                                                    e = e20;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                                                    i3 = 5;
                                                                                    if (sQLiteDatabaseM536G != null) {
                                                                                        sQLiteDatabaseM536G.endTransaction();
                                                                                    }
                                                                                    ky1 ky1Var114 = f02Var4.f2247o;
                                                                                    f02.m1560m(ky1Var114);
                                                                                    ky1Var114.f4600o.m5313b(e, "Error reading entries from local database");
                                                                                    ay1VarM1572o.f657m = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM536G != null) {
                                                                                        sQLiteDatabaseM536G.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str4 = str4;
                                                                            } catch (SQLiteFullException e21) {
                                                                                e = e21;
                                                                                str4 = str4;
                                                                            } catch (SQLiteException e22) {
                                                                                e = e22;
                                                                                str4 = str4;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteFullException e23) {
                                                                            e = e23;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused18) {
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteFullException e25) {
                                                                        e = e25;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteException e26) {
                                                                        e = e26;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    }
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    cursorQuery = cursorQuery;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            i = 0;
                                                            sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                            try {
                                                                if (sQLiteDatabaseM536G.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
                                                                    ky1 ky1Var22 = f02Var4.f2247o;
                                                                    f02.m1560m(ky1Var22);
                                                                    ky1Var22.f4600o.m5312a("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseM536G.setTransactionSuccessful();
                                                                sQLiteDatabaseM536G.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseM536G.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i3 = 5;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM536G != null) {
                                                                    sQLiteDatabaseM536G.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e27) {
                                                                e = e27;
                                                                i3 = 5;
                                                                ky1 ky1Var115 = f02Var4.f2247o;
                                                                f02.m1560m(ky1Var115);
                                                                ky1Var115.f4600o.m5313b(e, "Error reading entries from local database");
                                                                ay1VarM1572o.f657m = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM536G != null) {
                                                                    sQLiteDatabaseM536G.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e28) {
                                                                e = e28;
                                                                i3 = 5;
                                                                if (sQLiteDatabaseM536G != null) {
                                                                    sQLiteDatabaseM536G.endTransaction();
                                                                }
                                                                ky1 ky1Var116 = f02Var4.f2247o;
                                                                f02.m1560m(ky1Var116);
                                                                ky1Var116.f4600o.m5313b(e, "Error reading entries from local database");
                                                                ay1VarM1572o.f657m = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM536G != null) {
                                                                    sQLiteDatabaseM536G.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str3 = str3;
                                                            sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                            str4 = str4;
                                                            i3 = i4;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM536G != null) {
                                                                sQLiteDatabaseM536G.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        }
                                                    } catch (SQLiteFullException e29) {
                                                        e = e29;
                                                        str3 = str3;
                                                        sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        ky1 ky1Var117 = f02Var4.f2247o;
                                                        f02.m1560m(ky1Var117);
                                                        ky1Var117.f4600o.m5313b(e, "Error reading entries from local database");
                                                        ay1VarM1572o.f657m = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM536G != null) {
                                                            sQLiteDatabaseM536G.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e30) {
                                                        e = e30;
                                                        str3 = str3;
                                                        sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM536G != null) {
                                                            sQLiteDatabaseM536G.endTransaction();
                                                        }
                                                        ky1 ky1Var118 = f02Var4.f2247o;
                                                        f02.m1560m(ky1Var118);
                                                        ky1Var118.f4600o.m5313b(e, "Error reading entries from local database");
                                                        ay1VarM1572o.f657m = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM536G != null) {
                                                            sQLiteDatabaseM536G.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    str3 = str3;
                                                    sQLiteDatabaseM536G = sQLiteDatabaseM536G;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    SystemClock.sleep(i14);
                                                    i14 += 20;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM536G != null) {
                                                        sQLiteDatabaseM536G.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str5 = str5;
                                            } catch (SQLiteFullException e31) {
                                                e = e31;
                                                str5 = str5;
                                            } catch (SQLiteException e32) {
                                                e = e32;
                                                str5 = str5;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i2 = i13;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i2 = i13;
                                        i3 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM536G = null;
                            } catch (SQLiteFullException e33) {
                                e = e33;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM536G = null;
                            } catch (SQLiteException e34) {
                                e = e34;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM536G = null;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteDatabaseM536G = null;
                            }
                        } else {
                            i = 0;
                            ky1 ky1Var23 = f02Var4.f2247o;
                            f02.m1560m(ky1Var23);
                            ky1Var23.f4603r.m5312a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i13 = i2 + 1;
                        i12 = i3;
                        str4 = str4;
                        str3 = str3;
                        str5 = str5;
                    }
                } else {
                    context = context3;
                    ky1Var = ky1Var3;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (abstractC0823w0 != null && size < i10) {
                    arrayList2.add(new yx1(abstractC0823w0, z72Var2.f9657l, z72Var2.f9664s));
                }
                size2 = arrayList2.size();
                i6 = i;
                while (i6 < size2) {
                    yx1Var = (yx1) arrayList2.get(i6);
                    abstractC0823w1 = yx1Var.f9528a;
                    ix1Var = jx1.f4157W0;
                    if (bt1Var.m770L(null, ix1Var)) {
                        str2 = yx1Var.f9529b;
                        if (!TextUtils.isEmpty(str2)) {
                            z72Var2 = new z72(z72Var2.f9655j, z72Var2.f9656k, str2, yx1Var.f9530c, z72Var2.f9658m, z72Var2.f9659n, z72Var2.f9660o, z72Var2.f9661p, z72Var2.f9662q, z72Var2.f9663r, z72Var2.f9665t, z72Var2.f9666u, z72Var2.f9667v, z72Var2.f9668w, z72Var2.f9669x, z72Var2.f9670y, z72Var2.f9671z, z72Var2.f9640A, z72Var2.f9641B, z72Var2.f9642C, z72Var2.f9643D, z72Var2.f9644E, z72Var2.f9645F, z72Var2.f9646G, z72Var2.f9647H, z72Var2.f9648I, z72Var2.f9649J, z72Var2.f9650K, z72Var2.f9651L, z72Var2.f9652M, z72Var2.f9653N, z72Var2.f9654O);
                        }
                    }
                    if (abstractC0823w1 instanceof fu1) {
                        try {
                            wa0Var2.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                wa0Var2.getClass();
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    try {
                                        nx1Var.mo559D((fu1) abstractC0823w1, z72Var2);
                                        f02.m1560m(ky1Var);
                                        ky1Var2 = ky1Var;
                                        try {
                                            ky1Var2.f4608w.m5312a("Logging telemetry for logEvent from database");
                                            if (oq0.f5837o == null) {
                                                f02Var2 = f02Var;
                                                context2 = context;
                                                try {
                                                    oq0.f5837o = new oq0(context2, f02Var2);
                                                } catch (RemoteException e35) {
                                                    e = e35;
                                                    j3 = jCurrentTimeMillis;
                                                    f02.m1560m(ky1Var2);
                                                    ky1Var2.f4600o.m5313b(e, "Failed to send event to the service");
                                                    if (j3 != 0) {
                                                        if (oq0.f5837o == null) {
                                                            oq0.f5837o = new oq0(context2, f02Var2);
                                                        }
                                                        oq0 oq0Var = oq0.f5837o;
                                                        wa0Var2.getClass();
                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        wa0Var2.getClass();
                                                        oq0Var.m3746s(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                                    }
                                                }
                                            } else {
                                                f02Var2 = f02Var;
                                                context2 = context;
                                            }
                                            oq0 oq0Var2 = oq0.f5837o;
                                            wa0Var2.getClass();
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            wa0Var2.getClass();
                                            oq0Var2.m3746s(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                        } catch (RemoteException e36) {
                                            e = e36;
                                            f02Var2 = f02Var;
                                            context2 = context;
                                        }
                                    } catch (RemoteException e37) {
                                        e = e37;
                                        f02Var2 = f02Var;
                                        context2 = context;
                                        ky1Var2 = ky1Var;
                                        j3 = jCurrentTimeMillis;
                                        f02.m1560m(ky1Var2);
                                        ky1Var2.f4600o.m5313b(e, "Failed to send event to the service");
                                        if (j3 != 0) {
                                            if (oq0.f5837o == null) {
                                                oq0.f5837o = new oq0(context2, f02Var2);
                                            }
                                            oq0 oq0Var3 = oq0.f5837o;
                                            wa0Var2.getClass();
                                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                                            wa0Var2.getClass();
                                            oq0Var3.m3746s(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                        }
                                        i6++;
                                        ky1Var = ky1Var2;
                                        f02Var = f02Var2;
                                        context = context2;
                                        size = size;
                                    }
                                } catch (RemoteException e38) {
                                    e = e38;
                                }
                            } catch (RemoteException e39) {
                                e = e39;
                                f02Var2 = f02Var;
                                context2 = context;
                                ky1Var2 = ky1Var;
                                jElapsedRealtime = 0;
                            }
                        } catch (RemoteException e40) {
                            e = e40;
                            f02Var2 = f02Var;
                            context2 = context;
                            ky1Var2 = ky1Var;
                            jElapsedRealtime = 0;
                            j3 = 0;
                        }
                    } else {
                        f02Var2 = f02Var;
                        context2 = context;
                        ky1Var2 = ky1Var;
                        if (abstractC0823w1 instanceof b72) {
                            try {
                                nx1Var.mo570k((b72) abstractC0823w1, z72Var2);
                            } catch (RemoteException e41) {
                                f02.m1560m(ky1Var2);
                                ky1Var2.f4600o.m5313b(e41, "Failed to send user property to the service");
                            }
                        } else {
                            if (abstractC0823w1 instanceof hr1) {
                                try {
                                    nx1Var.mo558C((hr1) abstractC0823w1, z72Var2);
                                } catch (RemoteException e42) {
                                    f02.m1560m(ky1Var2);
                                    ky1Var2.f4600o.m5313b(e42, "Failed to send conditional user property to the service");
                                }
                            } else if (bt1Var.m770L(null, ix1Var) || !(abstractC0823w1 instanceof eu1)) {
                                f02.m1560m(ky1Var2);
                                ky1Var2.f4600o.m5312a("Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    nx1Var.mo582z(((eu1) abstractC0823w1).m1507e(), z72Var2);
                                } catch (RemoteException e43) {
                                    f02.m1560m(ky1Var2);
                                    ky1Var2.f4600o.m5313b(e43, "Failed to send default event parameters to the service");
                                }
                            }
                            i6++;
                            ky1Var = ky1Var2;
                            f02Var = f02Var2;
                            context = context2;
                            size = size;
                        }
                    }
                    i6++;
                    ky1Var = ky1Var2;
                    f02Var = f02Var2;
                    context = context2;
                    size = size;
                }
                ky1Var3 = ky1Var;
                f02Var3 = f02Var;
                context3 = context;
                wa0Var = wa0Var2;
                i7 = 100;
                i8 = i11 + 1;
            }
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (abstractC0823w0 != null) {
                arrayList2.add(new yx1(abstractC0823w0, z72Var2.f9657l, z72Var2.f9664s));
            }
            size2 = arrayList2.size();
            i6 = i;
            while (i6 < size2) {
                yx1Var = (yx1) arrayList2.get(i6);
                abstractC0823w1 = yx1Var.f9528a;
                ix1Var = jx1.f4157W0;
                if (bt1Var.m770L(null, ix1Var)) {
                    str2 = yx1Var.f9529b;
                    if (!TextUtils.isEmpty(str2)) {
                        z72Var2 = new z72(z72Var2.f9655j, z72Var2.f9656k, str2, yx1Var.f9530c, z72Var2.f9658m, z72Var2.f9659n, z72Var2.f9660o, z72Var2.f9661p, z72Var2.f9662q, z72Var2.f9663r, z72Var2.f9665t, z72Var2.f9666u, z72Var2.f9667v, z72Var2.f9668w, z72Var2.f9669x, z72Var2.f9670y, z72Var2.f9671z, z72Var2.f9640A, z72Var2.f9641B, z72Var2.f9642C, z72Var2.f9643D, z72Var2.f9644E, z72Var2.f9645F, z72Var2.f9646G, z72Var2.f9647H, z72Var2.f9648I, z72Var2.f9649J, z72Var2.f9650K, z72Var2.f9651L, z72Var2.f9652M, z72Var2.f9653N, z72Var2.f9654O);
                    }
                }
                if (abstractC0823w1 instanceof fu1) {
                    wa0Var2.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    wa0Var2.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    nx1Var.mo559D((fu1) abstractC0823w1, z72Var2);
                    f02.m1560m(ky1Var);
                    ky1Var2 = ky1Var;
                    ky1Var2.f4608w.m5312a("Logging telemetry for logEvent from database");
                    if (oq0.f5837o == null) {
                        f02Var2 = f02Var;
                        context2 = context;
                        oq0.f5837o = new oq0(context2, f02Var2);
                    } else {
                        f02Var2 = f02Var;
                        context2 = context;
                    }
                    oq0 oq0Var4 = oq0.f5837o;
                    wa0Var2.getClass();
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    wa0Var2.getClass();
                    oq0Var4.m3746s(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis5);
                } else {
                    f02Var2 = f02Var;
                    context2 = context;
                    ky1Var2 = ky1Var;
                    if (abstractC0823w1 instanceof b72) {
                        nx1Var.mo570k((b72) abstractC0823w1, z72Var2);
                    } else {
                        if (abstractC0823w1 instanceof hr1) {
                            nx1Var.mo558C((hr1) abstractC0823w1, z72Var2);
                        } else if (bt1Var.m770L(null, ix1Var)) {
                            f02.m1560m(ky1Var2);
                            ky1Var2.f4600o.m5312a("Discarding data. Unrecognized parcel type.");
                        } else {
                            f02.m1560m(ky1Var2);
                            ky1Var2.f4600o.m5312a("Discarding data. Unrecognized parcel type.");
                        }
                        i6++;
                        ky1Var = ky1Var2;
                        f02Var = f02Var2;
                        context = context2;
                        size = size;
                    }
                }
                i6++;
                ky1Var = ky1Var2;
                f02Var = f02Var2;
                context = context2;
                size = size;
            }
            ky1Var3 = ky1Var;
            f02Var3 = f02Var;
            context3 = context;
            wa0Var = wa0Var2;
            i7 = 100;
            i8 = i11 + 1;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m5072T(hr1 hr1Var) {
        boolean zM537H;
        mo11z();
        m3446B();
        f02 f02Var = (f02) this.f7192j;
        f02Var.getClass();
        ay1 ay1VarM1572o = f02Var.m1572o();
        f02 f02Var2 = (f02) ay1VarM1572o.f7192j;
        f02.m1558k(f02Var2.f2250r);
        byte[] bArrM1693k0 = f72.m1693k0(hr1Var);
        if (bArrM1693k0.length > 131072) {
            ky1 ky1Var = f02Var2.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4601p.m5312a("Conditional user property too long for local database. Sending directly to service");
            zM537H = false;
        } else {
            zM537H = ay1VarM1572o.m537H(2, bArrM1693k0);
        }
        m5067O(new nt0(this, m5069Q(true), zM537H, new hr1(hr1Var)));
    }
}
