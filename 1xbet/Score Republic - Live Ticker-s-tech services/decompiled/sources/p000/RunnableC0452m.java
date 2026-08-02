package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: m */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0452m implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4934j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f4935k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f4936l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f4937m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f4938n;

    public RunnableC0452m(v22 v22Var, AtomicReference atomicReference, String str, String str2) {
        this.f4934j = 8;
        this.f4935k = atomicReference;
        this.f4936l = str;
        this.f4937m = str2;
        Objects.requireNonNull(v22Var);
        this.f4938n = v22Var;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0443  */
    /* JADX WARN: Code duplicated, block: B:126:0x0458 A[LOOP:1: B:124:0x0452->B:126:0x0458, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x04a8 A[Catch: mp1 -> 0x0511, LOOP:2: B:129:0x049e->B:131:0x04a8, LOOP_END, TryCatch #8 {mp1 -> 0x0511, blocks: (B:128:0x0491, B:129:0x049e, B:131:0x04a8, B:132:0x04de, B:134:0x04f9), top: B:190:0x0491 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x04f9 A[Catch: mp1 -> 0x0511, TRY_LEAVE, TryCatch #8 {mp1 -> 0x0511, blocks: (B:128:0x0491, B:129:0x049e, B:131:0x04a8, B:132:0x04de, B:134:0x04f9), top: B:190:0x0491 }] */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        e62 e62Var;
        b02 b02Var;
        int i;
        long jElapsedRealtime = 0;
        byte[] bArrMo572m = null;
        switch (this.f4934j) {
            case 0:
                ((kt0) this.f4938n).m3080e((ja1) this.f4935k, (EnumC0544oh) this.f4936l, (np0) this.f4937m);
                return;
            case 1:
                ViewOnKeyListenerC0431lf viewOnKeyListenerC0431lf = (ViewOnKeyListenerC0431lf) ((nu1) this.f4938n).f5551k;
                rn0 rn0Var = (rn0) this.f4936l;
                C0394kf c0394kf = (C0394kf) this.f4935k;
                if (c0394kf != null) {
                    viewOnKeyListenerC0431lf.f4780I = true;
                    c0394kf.f4361b.m3707c(false);
                    viewOnKeyListenerC0431lf.f4780I = false;
                }
                if (rn0Var.isEnabled() && rn0Var.hasSubMenu()) {
                    ((on0) this.f4937m).m3713q(rn0Var, null, 4);
                    return;
                }
                return;
            case 2:
                ((C0112cs) this.f4938n).f1443j.mo1035g((ja1) this.f4935k, (EnumC0544oh) this.f4936l, (np0) this.f4937m);
                return;
            case 3:
                zk0 zk0Var = (zk0) this.f4938n;
                zk0Var.f9827I = true;
                zk0Var.f9822D.mo1035g((ja1) this.f4935k, (EnumC0544oh) this.f4936l, (np0) this.f4937m);
                return;
            case 4:
                synchronized (((r71) this.f4938n)) {
                    try {
                        if (((p71) this.f4935k).f6005b == 0) {
                            try {
                                ((q71) this.f4936l).mo154b(this.f4937m);
                                ((r71) this.f4938n).f6724a.remove((q71) this.f4936l);
                                if (((r71) this.f4938n).f6724a.isEmpty()) {
                                    ((r71) this.f4938n).f6726c.shutdown();
                                    ((r71) this.f4938n).f6726c = null;
                                }
                            } catch (Throwable th) {
                                ((r71) this.f4938n).f6724a.remove((q71) this.f4936l);
                                if (((r71) this.f4938n).f6724a.isEmpty()) {
                                    ((r71) this.f4938n).f6726c.shutdown();
                                    ((r71) this.f4938n).f6726c = null;
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 5:
                b12 b12Var = (b12) this.f4935k;
                String str = (String) this.f4936l;
                g62 g62Var = (g62) this.f4937m;
                tx1 tx1Var = (tx1) this.f4938n;
                x62 x62Var = b12Var.f681b;
                x62Var.m5550W();
                x62Var.mo1564c().mo11z();
                x62Var.m5574m0();
                qt1 qt1Var = x62Var.f8823l;
                x62.m5533U(qt1Var);
                List<z62> listM4150F = qt1Var.m4150F(str, g62Var, ((Integer) jx1.f4114B.m2715a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (z62 z62Var : listM4150F) {
                    String str2 = z62Var.f9616c;
                    long j = z62Var.f9621h;
                    long j2 = z62Var.f9614a;
                    if (x62Var.m5585s(str, str2)) {
                        int i2 = z62Var.f9622i;
                        if (i2 > 0) {
                            if (i2 <= ((Integer) jx1.f4224z.m2715a(bArrMo572m)).intValue()) {
                                long jMin = Math.min(((Long) jx1.f4220x.m2715a(bArrMo572m)).longValue() * (1 << (i2 - 1)), ((Long) jx1.f4222y.m2715a(bArrMo572m)).longValue());
                                x62Var.mo1567f().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : z62Var.f9617d.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    e62Var = new e62(z62Var.f9614a, z62Var.f9615b.m1274a(), z62Var.f9616c, bundle, z62Var.f9618e.f1946j, z62Var.f9620g, "");
                                    try {
                                        b02Var = (b02) a72.m58l0(e02.m1329A(), e62Var.f1974k);
                                        for (i = 0; i < ((e02) b02Var.f9011k).m1339u(); i++) {
                                            g02 g02Var = (g02) ((e02) b02Var.f9011k).m1340v(i).m5969k();
                                            x62Var.mo1567f().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            g02Var.m5681b();
                                            ((i02) g02Var.f9011k).m2463j0(jCurrentTimeMillis);
                                            b02Var.m5681b();
                                            ((e02) b02Var.f9011k).m1331C(i, (i02) g02Var.m5683d());
                                        }
                                        e62Var.f1974k = ((e02) b02Var.m5683d()).m1274a();
                                        if (Log.isLoggable(x62Var.mo1563b().m3114K(), 2)) {
                                            a72 a72Var = x62Var.f8827p;
                                            x62.m5533U(a72Var);
                                            e62Var.f1979p = a72Var.m70b0((e02) b02Var.m5683d());
                                        }
                                        arrayList.add(e62Var);
                                    } catch (mp1 unused) {
                                        x62Var.mo1563b().f4603r.m5313b(str, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            x62Var.mo1563b().f4608w.m5315d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j2), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r6.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            e62Var = new e62(z62Var.f9614a, z62Var.f9615b.m1274a(), z62Var.f9616c, bundle, z62Var.f9618e.f1946j, z62Var.f9620g, "");
                            b02Var = (b02) a72.m58l0(e02.m1329A(), e62Var.f1974k);
                            while (i < ((e02) b02Var.f9011k).m1339u()) {
                                g02 g02Var2 = (g02) ((e02) b02Var.f9011k).m1340v(i).m5969k();
                                x62Var.mo1567f().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                g02Var2.m5681b();
                                ((i02) g02Var2.f9011k).m2463j0(jCurrentTimeMillis2);
                                b02Var.m5681b();
                                ((e02) b02Var.f9011k).m1331C(i, (i02) g02Var2.m5683d());
                            }
                            e62Var.f1974k = ((e02) b02Var.m5683d()).m1274a();
                            if (Log.isLoggable(x62Var.mo1563b().m3114K(), 2)) {
                                a72 a72Var2 = x62Var.f8827p;
                                x62.m5533U(a72Var2);
                                e62Var.f1979p = a72Var2.m70b0((e02) b02Var.m5683d());
                            }
                            arrayList.add(e62Var);
                        }
                        bArrMo572m = null;
                    } else {
                        x62Var.mo1563b().f4608w.m5315d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j2), z62Var.f9616c);
                    }
                }
                try {
                    tx1Var.mo4419t(new j62(arrayList));
                    x62Var.mo1563b().f4608w.m5314c(str, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e) {
                    x62Var.mo1563b().f4600o.m5314c(str, e, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 6:
                v42 v42VarM1573p = ((AppMeasurementDynamiteService) this.f4938n).f1351b.m1573p();
                gv1 gv1Var = (gv1) this.f4935k;
                fu1 fu1Var = (fu1) this.f4936l;
                String str3 = (String) this.f4937m;
                v42VarM1573p.mo11z();
                v42VarM1573p.m3446B();
                f02 f02Var = (f02) v42VarM1573p.f7192j;
                f72 f72Var = f02Var.f2250r;
                f02.m1558k(f72Var);
                if (i90.f3485b.m2575b(((f02) f72Var.f7192j).f2242j, 12451000) == 0) {
                    v42VarM1573p.m5067O(new RunnableC0452m(v42VarM1573p, fu1Var, str3, gv1Var, 12));
                    return;
                }
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5312a("Not bundling data. Service unavailable or out of date");
                f72 f72Var2 = f02Var.f2250r;
                f02.m1558k(f72Var2);
                f72Var2.m1736r0(gv1Var, new byte[0]);
                return;
            case 7:
                b12 b12Var2 = (b12) this.f4935k;
                Bundle bundle2 = (Bundle) this.f4936l;
                String str4 = (String) this.f4937m;
                z72 z72Var = (z72) this.f4938n;
                boolean zIsEmpty = bundle2.isEmpty();
                x62 x62Var2 = b12Var2.f681b;
                if (zIsEmpty) {
                    qt1 qt1Var2 = x62Var2.f8823l;
                    x62.m5533U(qt1Var2);
                    qt1Var2.mo11z();
                    qt1Var2.m2988B();
                    try {
                        qt1Var2.m4191r0().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e2) {
                        ky1 ky1Var2 = ((f02) qt1Var2.f7192j).f2247o;
                        f02.m1560m(ky1Var2);
                        ky1Var2.f4600o.m5313b(e2, "Error clearing default event params");
                        return;
                    }
                }
                qt1 qt1Var3 = x62Var2.f8823l;
                x62.m5533U(qt1Var3);
                f02 f02Var2 = (f02) qt1Var3.f7192j;
                qt1Var3.mo11z();
                qt1Var3.m2988B();
                bu1 bu1Var = new bu1((f02) qt1Var3.f7192j, "", str4, "dep", 0L, 0L, 0L, bundle2);
                a72 a72Var3 = qt1Var3.f1566k.f8827p;
                x62.m5533U(a72Var3);
                byte[] bArrM1274a = a72Var3.m69a0(bu1Var).m1274a();
                ky1 ky1Var3 = f02Var2.f2247o;
                f02.m1560m(ky1Var3);
                ky1Var3.f4608w.m5314c(str4, Integer.valueOf(bArrM1274a.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", bArrM1274a);
                try {
                    if (qt1Var3.m4191r0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        f02.m1560m(ky1Var3);
                        ky1Var3.f4600o.m5313b(ky1.m3106I(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e3) {
                    f02.m1560m(ky1Var3);
                    ky1Var3.f4600o.m5314c(ky1.m3106I(str4), e3, "Error storing default event parameters. appId");
                }
                qt1 qt1Var4 = x62Var2.f8823l;
                x62.m5533U(qt1Var4);
                long j3 = z72Var.f9652M;
                try {
                    if (qt1Var4.m4173X("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j3)}, 0L) <= 0 && qt1Var4.m4173X("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j3)}, 0L) > 0) {
                        qt1 qt1Var5 = x62Var2.f8823l;
                        x62.m5533U(qt1Var5);
                        qt1Var5.m4169T(str4, Long.valueOf(j3), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e4) {
                    ky1 ky1Var4 = ((f02) qt1Var4.f7192j).f2247o;
                    f02.m1560m(ky1Var4);
                    ky1Var4.f4600o.m5313b(e4, "Error checking backfill conditions");
                    return;
                }
            case 8:
                String str5 = (String) this.f4936l;
                String str6 = (String) this.f4937m;
                v42 v42VarM1573p2 = ((f02) ((v22) this.f4938n).f7192j).m1573p();
                AtomicReference atomicReference = (AtomicReference) this.f4935k;
                v42VarM1573p2.mo11z();
                v42VarM1573p2.m3446B();
                v42VarM1573p2.m5067O(new u21(v42VarM1573p2, atomicReference, str5, str6, v42VarM1573p2.m5069Q(false), 2));
                return;
            case 9:
                g71 g71Var = (g71) this.f4935k;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f4936l;
                Context context = (Context) this.f4937m;
                i22 i22Var = (i22) this.f4938n;
                if ((g71Var.f2977j instanceof C0674s) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(i22Var);
                        return;
                    } catch (IllegalArgumentException e5) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e5);
                        return;
                    }
                }
                return;
            case 10:
                b90 b90Var = j32.f3811a;
                Level level = (Level) this.f4935k;
                sq1 sq1Var = (sq1) b90Var.f793k;
                boolean zMo727r = sq1Var.mo727r(level);
                String str7 = (String) sq1Var.f7192j;
                ((xm1) sm1.f7153a).getClass();
                cn1.f1298b.mo977a(str7, level, zMo727r);
                ((qa2) ((qa2) (!zMo727r ? b90.f791r : new ra2(b90Var, level)).mo914a((Throwable) this.f4936l)).mo915b()).mo916c((String) this.f4937m, (Object[]) this.f4938n);
                return;
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                v42 v42VarM1573p3 = ((AppMeasurementDynamiteService) this.f4938n).f1351b.m1573p();
                gv1 gv1Var2 = (gv1) this.f4935k;
                String str8 = (String) this.f4936l;
                String str9 = (String) this.f4937m;
                v42VarM1573p3.mo11z();
                v42VarM1573p3.m3446B();
                v42VarM1573p3.m5067O(new u21(v42VarM1573p3, str8, str9, v42VarM1573p3.m5069Q(false), gv1Var2, 3));
                return;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                gv1 gv1Var3 = (gv1) this.f4937m;
                v42 v42Var = (v42) this.f4938n;
                try {
                    try {
                        nx1 nx1Var = v42Var.f8065m;
                        if (nx1Var != null) {
                            bArrMo572m = nx1Var.mo572m((String) this.f4936l, (fu1) this.f4935k);
                            v42Var.m5066N();
                            f72 f72Var3 = ((f02) v42Var.f7192j).f2250r;
                            f02.m1558k(f72Var3);
                            f72Var3.m1736r0(gv1Var3, bArrMo572m);
                            return;
                        }
                        f02 f02Var3 = (f02) v42Var.f7192j;
                        ky1 ky1Var5 = f02Var3.f2247o;
                        f02.m1560m(ky1Var5);
                        ky1Var5.f4600o.m5312a("Discarding data. Failed to send event to service to bundle");
                        f72 f72Var4 = f02Var3.f2250r;
                        f02.m1558k(f72Var4);
                        f72Var4.m1736r0(gv1Var3, null);
                        return;
                    } catch (Throwable th3) {
                        f72 f72Var5 = ((f02) v42Var.f7192j).f2250r;
                        f02.m1558k(f72Var5);
                        f72Var5.m1736r0(gv1Var3, null);
                        throw th3;
                    }
                } catch (RemoteException e6) {
                    ky1 ky1Var6 = ((f02) v42Var.f7192j).f2247o;
                    f02.m1560m(ky1Var6);
                    ky1Var6.f4600o.m5313b(e6, "Failed to send event to the service to bundle");
                }
                break;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                v42 v42Var2 = (v42) this.f4935k;
                AtomicReference atomicReference2 = (AtomicReference) this.f4936l;
                z72 z72Var2 = (z72) this.f4937m;
                Bundle bundle3 = (Bundle) this.f4938n;
                synchronized (atomicReference2) {
                    try {
                        nx1 nx1Var2 = v42Var2.f8065m;
                        if (nx1Var2 != null) {
                            nx1Var2.mo574p(z72Var2, bundle3, new q32(v42Var2, atomicReference2));
                            v42Var2.m5066N();
                            return;
                        } else {
                            ky1 ky1Var7 = ((f02) v42Var2.f7192j).f2247o;
                            f02.m1560m(ky1Var7);
                            ky1Var7.f4600o.m5312a("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e7) {
                        ky1 ky1Var8 = ((f02) v42Var2.f7192j).f2247o;
                        f02.m1560m(ky1Var8);
                        ky1Var8.f4600o.m5313b(e7, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case 14:
                v42 v42Var3 = (v42) this.f4935k;
                AtomicReference atomicReference3 = (AtomicReference) this.f4936l;
                z72 z72Var3 = (z72) this.f4937m;
                g62 g62Var2 = (g62) this.f4938n;
                synchronized (atomicReference3) {
                    try {
                        nx1 nx1Var3 = v42Var3.f8065m;
                        if (nx1Var3 != null) {
                            nx1Var3.mo557B(z72Var3, g62Var2, new s32(v42Var3, atomicReference3));
                            v42Var3.m5066N();
                            return;
                        } else {
                            ky1 ky1Var9 = ((f02) v42Var3.f7192j).f2247o;
                            f02.m1560m(ky1Var9);
                            ky1Var9.f4600o.m5312a("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e8) {
                        ky1 ky1Var10 = ((f02) v42Var3.f7192j).f2247o;
                        f02.m1560m(ky1Var10);
                        ky1Var10.f4600o.m5313b(e8, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                }
                break;
            default:
                x62 x62Var3 = ((t62) this.f4938n).f7326j;
                f72 f72VarM5572l0 = x62Var3.m5572l0();
                x62Var3.mo1567f().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (x62Var3.m5560f0().m770L(null, jx1.f4178e1)) {
                    x62Var3.mo1567f().getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                }
                Bundle bundle4 = (Bundle) this.f4937m;
                String str10 = (String) this.f4936l;
                String str11 = (String) this.f4935k;
                fu1 fu1VarM1728i0 = f72VarM5572l0.m1728i0(str10, bundle4, "auto", jCurrentTimeMillis3, jElapsedRealtime, false);
                p80.m3863h(fu1VarM1728i0);
                x62Var3.m5563h(str11, fu1VarM1728i0);
                return;
        }
    }

    public /* synthetic */ RunnableC0452m(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.f4934j = i;
        this.f4935k = obj;
        this.f4936l = obj2;
        this.f4937m = obj3;
        this.f4938n = obj4;
    }

    public /* synthetic */ RunnableC0452m(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f4934j = i;
        this.f4938n = obj;
        this.f4935k = obj2;
        this.f4936l = obj3;
        this.f4937m = obj4;
    }
}
