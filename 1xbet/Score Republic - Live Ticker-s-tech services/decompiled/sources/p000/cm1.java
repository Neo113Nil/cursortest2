package p000;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Process;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cm1 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1294j;

    /* JADX INFO: renamed from: k */
    public final Object f1295k;

    public cm1(zk1 zk1Var, C0678s3 c0678s3) {
        this.f1294j = 0;
        Objects.requireNonNull(zk1Var);
        this.f1295k = c0678s3;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0274  */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        int i2 = 0;
        int i3 = 1;
        switch (this.f1294j) {
            case 0:
                throw null;
            case 1:
                ri1 ri1Var = (ri1) this.f1295k;
                synchronized (ri1Var.f6846a) {
                    try {
                        if (ri1Var.m4354b()) {
                            Log.e("WakeLock", String.valueOf(ri1Var.f6855j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            ri1Var.m4356d();
                            if (ri1Var.m4354b()) {
                                ri1Var.f6848c = 1;
                                ri1Var.m4357e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                if (((qc1) this.f1295k).m4062c(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 3:
                qt1 qt1Var = (qt1) this.f1295k;
                try {
                    SQLiteDatabase sQLiteDatabaseM4191r0 = qt1Var.m4191r0();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseM4191r0.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e) {
                    ky1 ky1Var = ((f02) qt1Var.f7192j).f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4600o.m5313b(e, "Failed to remove elapsed times from raw events table");
                    return;
                }
            case 4:
                vy1 vy1Var = (vy1) this.f1295k;
                synchronized (vy1Var.f8301l) {
                    try {
                        hu0 hu0Var = (hu0) vy1Var.f8302m;
                        if (hu0Var != null) {
                            hu0Var.mo307c();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 5:
                ((xy1) this.f1295k).f9106a.m5545N();
                return;
            case 6:
                v42 v42Var = ((q42) this.f1295k).f6377l;
                v42Var.m5064L(new ComponentName(((f02) v42Var.f7192j).f2242j, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 7:
                v42 v42Var2 = ((q42) ((f31) this.f1295k).f2293k).f6377l;
                a02 a02Var = ((f02) v42Var2.f7192j).f2248p;
                f02.m1560m(a02Var);
                a02Var.m6J(new o42(v42Var2, i2));
                return;
            case 8:
                k52 k52Var = (k52) this.f1295k;
                s52 s52Var = (s52) k52Var.f4293l.f64l;
                s52Var.mo11z();
                f02 f02Var = (f02) s52Var.f7192j;
                ky1 ky1Var2 = f02Var.f2247o;
                Context context = f02Var.f2242j;
                f02.m1560m(ky1Var2);
                ky1Var2.f4607v.m5312a("Application going to the background");
                fz1 fz1Var = f02Var.f2246n;
                f02.m1558k(fz1Var);
                fz1Var.f2542B.m5853b(true);
                s52Var.mo11z();
                s52Var.f7033m = true;
                bt1 bt1Var = f02Var.f2245m;
                if (!bt1Var.m774P()) {
                    long j = k52Var.f4292k;
                    q52 q52Var = s52Var.f7035o;
                    q52Var.m4038a(false, false, j);
                    q52Var.f6389c.m4404c();
                }
                long j2 = k52Var.f4291j;
                f02.m1560m(ky1Var2);
                ky1Var2.f4606u.m5313b(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
                v22 v22Var = f02Var.f2254v;
                f02.m1559l(v22Var);
                v22Var.mo11z();
                f02 f02Var2 = (f02) v22Var.f7192j;
                v22Var.m3446B();
                v42 v42VarM1573p = f02Var2.m1573p();
                v42VarM1573p.mo11z();
                v42VarM1573p.m3446B();
                if (v42VarM1573p.m5060H()) {
                    f72 f72Var = ((f02) v42VarM1573p.f7192j).f2250r;
                    f02.m1558k(f72Var);
                    if (f72Var.m1731m0() >= 242600) {
                        v42 v42VarM1573p2 = f02Var2.m1573p();
                        v42VarM1573p2.mo11z();
                        v42VarM1573p2.m3446B();
                        v42VarM1573p2.m5067O(new v32(v42VarM1573p2, v42VarM1573p2.m5069Q(true), 2));
                    }
                } else {
                    v42 v42VarM1573p3 = f02Var2.m1573p();
                    v42VarM1573p3.mo11z();
                    v42VarM1573p3.m3446B();
                    v42VarM1573p3.m5067O(new v32(v42VarM1573p3, v42VarM1573p3.m5069Q(true), 2));
                }
                if (bt1Var.m770L(null, jx1.f4139N0)) {
                    f72 f72Var2 = f02Var.f2250r;
                    f02.m1558k(f72Var2);
                    long jM767I = f72Var2.m1726g0(context.getPackageName(), bt1Var.f983l) ? 1000L : bt1Var.m767I(context.getPackageName(), jx1.f4120E);
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4608w.m5313b(Long.valueOf(jM767I), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    f02.m1557j(f02Var.f2231D);
                    f02Var.f2231D.m587E(jM767I);
                    return;
                }
                return;
            case 9:
                x62 x62Var = (x62) this.f1295k;
                x62Var.mo1564c().mo11z();
                x62Var.f8831t = new iz1(x62Var);
                qt1 qt1Var2 = new qt1(x62Var);
                qt1Var2.m2989C();
                x62Var.f8823l = qt1Var2;
                sz1 sz1Var = x62Var.f8821j;
                bt1 bt1VarM5560f0 = x62Var.m5560f0();
                p80.m3863h(sz1Var);
                bt1VarM5560f0.f984m = sz1Var;
                y42 y42Var = new y42(x62Var);
                y42Var.m2989C();
                x62Var.f8829r = y42Var;
                qo1 qo1Var = new qo1(x62Var);
                qo1Var.m2989C();
                x62Var.f8826o = qo1Var;
                ry1 ry1Var = new ry1(x62Var, i3);
                ry1Var.m2989C();
                x62Var.f8828q = ry1Var;
                a62 a62Var = new a62(x62Var);
                a62Var.m2989C();
                x62Var.f8825n = a62Var;
                x62Var.f8824m = new xy1(x62Var);
                if (x62Var.f8802A != x62Var.f8803B) {
                    x62Var.mo1563b().f4600o.m5314c(Integer.valueOf(x62Var.f8802A), Integer.valueOf(x62Var.f8803B), "Not all upload components initialized");
                }
                x62Var.f8833v.set(true);
                x62Var.mo1563b().f4608w.m5312a("UploadController is now fully initialized");
                x62Var.mo1564c().mo11z();
                qt1 qt1Var3 = x62Var.f8823l;
                x62.m5533U(qt1Var3);
                qt1Var3.m4160K();
                qt1 qt1Var4 = x62Var.f8823l;
                x62.m5533U(qt1Var4);
                qt1Var4.mo11z();
                qt1Var4.m2988B();
                if (qt1Var4.m4186l0()) {
                    ix1 ix1Var = jx1.f4215u0;
                    if (((Long) ix1Var.m2715a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseM4191r1 = qt1Var4.m4191r0();
                        f02 f02Var3 = (f02) qt1Var4.f7192j;
                        f02Var3.f2252t.getClass();
                        int iDelete = sQLiteDatabaseM4191r1.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(ix1Var.m2715a(null))});
                        if (iDelete > 0) {
                            ky1 ky1Var3 = f02Var3.f2247o;
                            f02.m1560m(ky1Var3);
                            ky1Var3.f4608w.m5313b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (x62Var.f8829r.f9151q.m821a() == 0) {
                    bz1 bz1Var = x62Var.f8829r.f9151q;
                    x62Var.mo1567f().getClass();
                    bz1Var.m822b(System.currentTimeMillis());
                }
                x62Var.m5545N();
                return;
            case 10:
                throw new RuntimeException(((ExecutionException) this.f1295k).getCause());
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                try {
                    k70.m2991b((ListenableFuture) this.f1295k);
                    return;
                } catch (ExecutionException e2) {
                    n80.m3503l().post(new cm1(10, e2));
                    return;
                }
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                try {
                    k70.m2991b((a40) this.f1295k);
                    return;
                } catch (Exception e3) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e3);
                    return;
                }
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                if (((Boolean) ((q72) this.f1295k).f6400c.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 14:
                try {
                    k70.m2991b((b40) this.f1295k);
                    return;
                } catch (Exception e4) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e4);
                        return;
                    }
                    return;
                }
            case 15:
                f02 f02Var4 = (f02) ((C0680s5) this.f1295k).f7030b;
                f02.m1557j(f02Var4.f2231D);
                f02Var4.f2231D.m587E(((Long) jx1.f4118D.m2715a(null)).longValue());
                return;
            default:
                f02 f02Var5 = (f02) this.f1295k;
                f72 f72Var3 = f02Var5.f2250r;
                v22 v22Var2 = f02Var5.f2254v;
                f02.m1558k(f72Var3);
                f72Var3.mo11z();
                if (f72Var3.m1722Y() != 1) {
                    ky1 ky1Var4 = f02Var5.f2247o;
                    f02.m1560m(ky1Var4);
                    ky1Var4.f4603r.m5312a("registerTrigger called but app not eligible");
                    return;
                }
                f02.m1559l(v22Var2);
                v22Var2.mo11z();
                t12 t12Var = v22Var2.f8019u;
                if (t12Var != null) {
                    t12Var.m4404c();
                }
                f02.m1559l(v22Var2);
                new Thread(new s12(v22Var2, i)).start();
                return;
        }
    }

    public /* synthetic */ cm1(int i, Object obj) {
        this.f1294j = i;
        this.f1295k = obj;
    }

    public cm1(xy1 xy1Var, boolean z) {
        this.f1294j = 5;
        this.f1295k = xy1Var;
    }

    public cm1(x62 x62Var, C0186et c0186et) {
        this.f1294j = 9;
        this.f1295k = x62Var;
    }
}
