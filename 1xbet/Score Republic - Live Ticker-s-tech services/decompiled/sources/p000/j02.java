package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j02 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3765j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ z72 f3766k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ b12 f3767l;

    public /* synthetic */ j02(b12 b12Var, z72 z72Var, int i) {
        this.f3765j = i;
        this.f3766k = z72Var;
        this.f3767l = b12Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f3765j;
        z72 z72Var = this.f3766k;
        b12 b12Var = this.f3767l;
        switch (i) {
            case 0:
                b12Var.f681b.m5550W();
                b12Var.f681b.m5553Z(z72Var);
                break;
            case 1:
                b12Var.f681b.m5550W();
                x62 x62Var = b12Var.f681b;
                x62Var.mo1564c().mo11z();
                x62Var.m5574m0();
                p80.m3863h(z72Var);
                String str = z72Var.f9655j;
                p80.m3860e(str);
                int i2 = 0;
                if (x62Var.m5560f0().m770L(null, jx1.f4223y0)) {
                    x62Var.mo1567f().getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int iM768J = x62Var.m5560f0().m768J(null, jx1.f4186h0);
                    x62Var.m5560f0();
                    long jLongValue = jCurrentTimeMillis - ((Long) jx1.f4176e.m2715a(null)).longValue();
                    while (i2 < iM768J && x62Var.m5540I(null, jLongValue)) {
                        i2++;
                    }
                } else {
                    x62Var.m5560f0();
                    long jIntValue = ((Integer) jx1.f4196l.m2715a(null)).intValue();
                    while (i2 < jIntValue && x62Var.m5540I(str, 0L)) {
                        i2++;
                    }
                }
                if (x62Var.m5560f0().m770L(null, jx1.f4225z0)) {
                    x62Var.mo1564c().mo11z();
                    x62Var.m5539H();
                }
                o62 o62Var = x62Var.f8830s;
                int iM2768c = j11.m2768c(z72Var.f9653N);
                o62Var.mo11z();
                if (iM2768c == 2 && !o62.m3630D(str)) {
                    sz1 sz1Var = o62Var.f1566k.f8821j;
                    x62.m5533U(sz1Var);
                    by1 by1VarM4617M = sz1Var.m4617M(str);
                    if (by1VarM4617M != null && by1VarM4617M.m808H() && !by1VarM4617M.m809I().m3450u().isEmpty()) {
                        x62Var.mo1563b().f4608w.m5313b(str, "[sgtm] Going background, trigger client side upload. appId");
                        x62Var.mo1567f().getClass();
                        x62Var.m5583r(str, System.currentTimeMillis());
                        break;
                    }
                }
                break;
            case 2:
                b12Var.f681b.m5550W();
                x62 x62Var2 = b12Var.f681b;
                x62Var2.mo1564c().mo11z();
                x62Var2.m5574m0();
                p80.m3860e(z72Var.f9655j);
                x62Var2.m5558d0(z72Var);
                break;
            case 3:
                b12Var.f681b.m5550W();
                x62 x62Var3 = b12Var.f681b;
                if (x62Var3.f8809H != null) {
                    ArrayList arrayList = new ArrayList();
                    x62Var3.f8810I = arrayList;
                    arrayList.addAll(x62Var3.f8809H);
                }
                qt1 qt1Var = x62Var3.f8823l;
                x62.m5533U(qt1Var);
                f02 f02Var = (f02) qt1Var.f7192j;
                String str2 = z72Var.f9655j;
                p80.m3863h(str2);
                p80.m3860e(str2);
                qt1Var.mo11z();
                qt1Var.m2988B();
                try {
                    SQLiteDatabase sQLiteDatabaseM4191r0 = qt1Var.m4191r0();
                    String[] strArr = {str2};
                    int iDelete = sQLiteDatabaseM4191r0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("events", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseM4191r0.delete("upload_queue", "app_id=?", strArr);
                    if (f02Var.f2245m.m770L(null, jx1.f4172c1)) {
                        iDelete += sQLiteDatabaseM4191r0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int iDelete2 = iDelete + sQLiteDatabaseM4191r0.delete("diagnostic_signals", "app_id=?", strArr);
                    if (iDelete2 > 0) {
                        ky1 ky1Var = f02Var.f2247o;
                        f02.m1560m(ky1Var);
                        ky1Var.f4608w.m5314c(str2, Integer.valueOf(iDelete2), "Reset analytics data. app, records");
                    }
                } catch (SQLiteException e) {
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5314c(ky1.m3106I(str2), e, "Error resetting analytics data. appId, error");
                }
                if (z72Var.f9662q) {
                    x62Var3.m5553Z(z72Var);
                }
                break;
            case 4:
                b12Var.f681b.m5550W();
                x62 x62Var4 = b12Var.f681b;
                x62Var4.mo1564c().mo11z();
                x62Var4.m5574m0();
                p80.m3860e(z72Var.f9655j);
                x62Var4.m5576n0(z72Var);
                x62Var4.m5578o0(z72Var);
                break;
            case 5:
                x62 x62Var5 = b12Var.f681b;
                x62Var5.m5550W();
                x62Var5.m5578o0(z72Var);
                break;
            default:
                x62 x62Var6 = b12Var.f681b;
                x62Var6.m5550W();
                x62Var6.m5576n0(z72Var);
                break;
        }
    }
}
