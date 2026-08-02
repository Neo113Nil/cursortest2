package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ob2 {

    /* JADX INFO: renamed from: a */
    public rz1 f5693a;

    /* JADX INFO: renamed from: b */
    public Long f5694b;

    /* JADX INFO: renamed from: c */
    public long f5695c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qo1 f5696d;

    public /* synthetic */ ob2(qo1 qo1Var) {
        this.f5696d = qo1Var;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f8 A[PHI: r6 r16 r17
      0x00f8: PHI (r6v4 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v6 android.database.Cursor) binds: [B:61:0x0123, B:46:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r16v5 rz1) = (r16v3 rz1), (r16v9 rz1) binds: [B:61:0x0123, B:46:0x00f1] A[DONT_GENERATE, DONT_INLINE]
      0x00f8: PHI (r17v4 long) = (r17v2 long), (r17v7 long) binds: [B:61:0x0123, B:46:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01ea  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX INFO: renamed from: a */
    public final rz1 m3667a(String str, rz1 rz1Var) {
        ?? r5;
        rz1 rz1Var2;
        long j;
        Cursor cursorRawQuery;
        ?? r0;
        Object obj;
        Pair pair;
        String strM4464y = rz1Var.m4464y();
        List listM4461v = rz1Var.m4461v();
        qo1 qo1Var = this.f5696d;
        x62 x62Var = qo1Var.f1566k;
        x62 x62Var2 = qo1Var.f1566k;
        f02 f02Var = (f02) qo1Var.f7192j;
        x62Var.m5570k0();
        wz1 wz1VarM44K = a72.m44K("_eid", rz1Var);
        Long l = (Long) (wz1VarM44K == null ? null : a72.m50S(wz1VarM44K));
        if (l != null) {
            if (strM4464y.equals("_ep")) {
                x62Var.m5570k0();
                wz1 wz1VarM44K2 = a72.m44K("_en", rz1Var);
                String str2 = (String) (wz1VarM44K2 == null ? null : a72.m50S(wz1VarM44K2));
                if (TextUtils.isEmpty(str2)) {
                    ky1 ky1Var = f02Var.f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4601p.m5313b(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (this.f5693a == null || this.f5694b == null || l.longValue() != this.f5694b.longValue()) {
                    qt1 qt1Var = x62Var.f8823l;
                    x62.m5533U(qt1Var);
                    f02 f02Var2 = (f02) qt1Var.f7192j;
                    qt1Var.mo11z();
                    qt1Var.m2988B();
                    try {
                        try {
                            cursorRawQuery = qt1Var.m4191r0().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    rz1Var2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((rz1) ((qz1) a72.m58l0(rz1.m4439J(), cursorRawQuery.getBlob(0))).m5683d(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair = pairCreate;
                                        } catch (IOException e) {
                                            ky1 ky1Var2 = f02Var2.f2247o;
                                            f02.m1560m(ky1Var2);
                                            j = 0;
                                            try {
                                                ky1Var2.f4600o.m5315d("Failed to merge main event. appId, eventId", ky1.m3106I(str), l, e);
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                ky1 ky1Var3 = f02Var2.f2247o;
                                                f02.m1560m(ky1Var3);
                                                ky1Var3.f4600o.m5313b(e, "Error selecting main event");
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                r0 = rz1Var2;
                                                if (r0 != 0) {
                                                }
                                                ky1 ky1Var4 = f02Var.f2247o;
                                                f02.m1560m(ky1Var4);
                                                ky1Var4.f4601p.m5314c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                                                return rz1Var2;
                                            }
                                            cursorRawQuery.close();
                                            r0 = rz1Var2;
                                        }
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        j = 0;
                                        ky1 ky1Var5 = f02Var2.f2247o;
                                        f02.m1560m(ky1Var5);
                                        ky1Var5.f4600o.m5313b(e, "Error selecting main event");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        r0 = rz1Var2;
                                    }
                                } else {
                                    ky1 ky1Var6 = f02Var2.f2247o;
                                    f02.m1560m(ky1Var6);
                                    ky1Var6.f4608w.m5312a("Main event not found");
                                    cursorRawQuery.close();
                                    pair = null;
                                    rz1Var2 = null;
                                }
                                j = 0;
                                r0 = pair;
                            } catch (SQLiteException e4) {
                                e = e4;
                                rz1Var2 = null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r5 = strM4464y;
                            if (r5 != 0) {
                                r5.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        rz1Var2 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        r5 = 0;
                        if (r5 != 0) {
                            r5.close();
                        }
                        throw th;
                    }
                    if (r0 != 0 || (obj = ((Pair) r0).first) == null) {
                        ky1 ky1Var7 = f02Var.f2247o;
                        f02.m1560m(ky1Var7);
                        ky1Var7.f4601p.m5314c(str2, l, "Extra parameter without existing main event. eventName, eventId");
                        return rz1Var2;
                    }
                    this.f5693a = (rz1) obj;
                    this.f5695c = ((Long) ((Pair) r0).second).longValue();
                    x62Var2.m5570k0();
                    this.f5694b = (Long) a72.m46M("_eid", this.f5693a);
                } else {
                    j = 0;
                }
                long j2 = this.f5695c - 1;
                this.f5695c = j2;
                if (j2 <= j) {
                    qt1 qt1Var2 = x62Var2.f8823l;
                    x62.m5533U(qt1Var2);
                    f02 f02Var3 = (f02) qt1Var2.f7192j;
                    qt1Var2.mo11z();
                    ky1 ky1Var8 = f02Var3.f2247o;
                    f02.m1560m(ky1Var8);
                    ky1Var8.f4608w.m5313b(str, "Clearing complex main event info. appId");
                    try {
                        qt1Var2.m4191r0().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        ky1 ky1Var9 = f02Var3.f2247o;
                        f02.m1560m(ky1Var9);
                        ky1Var9.f4600o.m5313b(e6, "Error clearing complex main event");
                    }
                } else {
                    qt1 qt1Var3 = x62Var2.f8823l;
                    x62.m5533U(qt1Var3);
                    qt1Var3.m4168S(str, l, this.f5695c, this.f5693a);
                }
                ArrayList arrayList = new ArrayList();
                for (wz1 wz1Var : this.f5693a.m4461v()) {
                    x62Var2.m5570k0();
                    if (a72.m44K(wz1Var.m5480u(), rz1Var) == null) {
                        arrayList.add(wz1Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    ky1 ky1Var10 = f02Var.f2247o;
                    f02.m1560m(ky1Var10);
                    ky1Var10.f4601p.m5313b(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listM4461v);
                    listM4461v = arrayList;
                }
                strM4464y = str2;
            } else {
                this.f5694b = l;
                this.f5693a = rz1Var;
                x62Var.m5570k0();
                wz1 wz1VarM44K3 = a72.m44K("_epc", rz1Var);
                Serializable serializableM50S = wz1VarM44K3 == null ? null : a72.m50S(wz1VarM44K3);
                long jLongValue = ((Long) (serializableM50S != null ? serializableM50S : 0L)).longValue();
                this.f5695c = jLongValue;
                if (jLongValue <= 0) {
                    ky1 ky1Var11 = f02Var.f2247o;
                    f02.m1560m(ky1Var11);
                    ky1Var11.f4601p.m5313b(strM4464y, "Complex event with zero extra param count. eventName");
                } else {
                    qt1 qt1Var4 = x62Var.f8823l;
                    x62.m5533U(qt1Var4);
                    qt1Var4.m4168S(str, l, this.f5695c, rz1Var);
                }
            }
        }
        qz1 qz1Var = (qz1) rz1Var.m5969k();
        qz1Var.m4215n(strM4464y);
        qz1Var.m5681b();
        ((rz1) qz1Var.f9011k).m4452N();
        qz1Var.m5681b();
        ((rz1) qz1Var.f9011k).m4451M(listM4461v);
        return (rz1) qz1Var.m5683d();
    }
}
