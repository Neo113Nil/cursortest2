package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class xr0 {

    /* JADX INFO: renamed from: j */
    public static final SparseArray f9043j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ xr0[] f9044k;

    /* JADX INFO: Fake field, exist only in values array */
    xr0 EF1;

    static {
        xr0 xr0Var = new xr0("MOBILE", 0);
        xr0 xr0Var2 = new xr0("WIFI", 1);
        xr0 xr0Var3 = new xr0("MOBILE_MMS", 2);
        xr0 xr0Var4 = new xr0("MOBILE_SUPL", 3);
        xr0 xr0Var5 = new xr0("MOBILE_DUN", 4);
        xr0 xr0Var6 = new xr0("MOBILE_HIPRI", 5);
        xr0 xr0Var7 = new xr0("WIMAX", 6);
        xr0 xr0Var8 = new xr0("BLUETOOTH", 7);
        xr0 xr0Var9 = new xr0("DUMMY", 8);
        xr0 xr0Var10 = new xr0("ETHERNET", 9);
        xr0 xr0Var11 = new xr0("MOBILE_FOTA", 10);
        xr0 xr0Var12 = new xr0("MOBILE_IMS", 11);
        xr0 xr0Var13 = new xr0("MOBILE_CBS", 12);
        xr0 xr0Var14 = new xr0("WIFI_P2P", 13);
        xr0 xr0Var15 = new xr0("MOBILE_IA", 14);
        xr0 xr0Var16 = new xr0("MOBILE_EMERGENCY", 15);
        xr0 xr0Var17 = new xr0("PROXY", 16);
        xr0 xr0Var18 = new xr0("VPN", 17);
        xr0 xr0Var19 = new xr0("NONE", 18);
        f9044k = new xr0[]{xr0Var, xr0Var2, xr0Var3, xr0Var4, xr0Var5, xr0Var6, xr0Var7, xr0Var8, xr0Var9, xr0Var10, xr0Var11, xr0Var12, xr0Var13, xr0Var14, xr0Var15, xr0Var16, xr0Var17, xr0Var18, xr0Var19};
        SparseArray sparseArray = new SparseArray();
        f9043j = sparseArray;
        sparseArray.put(0, xr0Var);
        sparseArray.put(1, xr0Var2);
        sparseArray.put(2, xr0Var3);
        sparseArray.put(3, xr0Var4);
        sparseArray.put(4, xr0Var5);
        sparseArray.put(5, xr0Var6);
        sparseArray.put(6, xr0Var7);
        sparseArray.put(7, xr0Var8);
        sparseArray.put(8, xr0Var9);
        sparseArray.put(9, xr0Var10);
        sparseArray.put(10, xr0Var11);
        sparseArray.put(11, xr0Var12);
        sparseArray.put(12, xr0Var13);
        sparseArray.put(13, xr0Var14);
        sparseArray.put(14, xr0Var15);
        sparseArray.put(15, xr0Var16);
        sparseArray.put(16, xr0Var17);
        sparseArray.put(17, xr0Var18);
        sparseArray.put(-1, xr0Var19);
    }

    public static xr0 valueOf(String str) {
        return (xr0) Enum.valueOf(xr0.class, str);
    }

    public static xr0[] values() {
        return (xr0[]) f9044k.clone();
    }
}
