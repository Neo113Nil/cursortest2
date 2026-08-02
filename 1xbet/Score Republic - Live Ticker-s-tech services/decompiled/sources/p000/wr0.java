package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wr0 {

    /* JADX INFO: renamed from: j */
    public static final SparseArray f8648j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ wr0[] f8649k;

    /* JADX INFO: Fake field, exist only in values array */
    wr0 EF1;

    static {
        wr0 wr0Var = new wr0("UNKNOWN_MOBILE_SUBTYPE", 0);
        wr0 wr0Var2 = new wr0("GPRS", 1);
        wr0 wr0Var3 = new wr0("EDGE", 2);
        wr0 wr0Var4 = new wr0("UMTS", 3);
        wr0 wr0Var5 = new wr0("CDMA", 4);
        wr0 wr0Var6 = new wr0("EVDO_0", 5);
        wr0 wr0Var7 = new wr0("EVDO_A", 6);
        wr0 wr0Var8 = new wr0("RTT", 7);
        wr0 wr0Var9 = new wr0("HSDPA", 8);
        wr0 wr0Var10 = new wr0("HSUPA", 9);
        wr0 wr0Var11 = new wr0("HSPA", 10);
        wr0 wr0Var12 = new wr0("IDEN", 11);
        wr0 wr0Var13 = new wr0("EVDO_B", 12);
        wr0 wr0Var14 = new wr0("LTE", 13);
        wr0 wr0Var15 = new wr0("EHRPD", 14);
        wr0 wr0Var16 = new wr0("HSPAP", 15);
        wr0 wr0Var17 = new wr0("GSM", 16);
        wr0 wr0Var18 = new wr0("TD_SCDMA", 17);
        wr0 wr0Var19 = new wr0("IWLAN", 18);
        wr0 wr0Var20 = new wr0("LTE_CA", 19);
        f8649k = new wr0[]{wr0Var, wr0Var2, wr0Var3, wr0Var4, wr0Var5, wr0Var6, wr0Var7, wr0Var8, wr0Var9, wr0Var10, wr0Var11, wr0Var12, wr0Var13, wr0Var14, wr0Var15, wr0Var16, wr0Var17, wr0Var18, wr0Var19, wr0Var20, new wr0("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f8648j = sparseArray;
        sparseArray.put(0, wr0Var);
        sparseArray.put(1, wr0Var2);
        sparseArray.put(2, wr0Var3);
        sparseArray.put(3, wr0Var4);
        sparseArray.put(4, wr0Var5);
        sparseArray.put(5, wr0Var6);
        sparseArray.put(6, wr0Var7);
        sparseArray.put(7, wr0Var8);
        sparseArray.put(8, wr0Var9);
        sparseArray.put(9, wr0Var10);
        sparseArray.put(10, wr0Var11);
        sparseArray.put(11, wr0Var12);
        sparseArray.put(12, wr0Var13);
        sparseArray.put(13, wr0Var14);
        sparseArray.put(14, wr0Var15);
        sparseArray.put(15, wr0Var16);
        sparseArray.put(16, wr0Var17);
        sparseArray.put(17, wr0Var18);
        sparseArray.put(18, wr0Var19);
        sparseArray.put(19, wr0Var20);
    }

    public static wr0 valueOf(String str) {
        return (wr0) Enum.valueOf(wr0.class, str);
    }

    public static wr0[] values() {
        return (wr0[]) f8649k.clone();
    }
}
