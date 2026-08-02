package p000;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class az0 {

    /* JADX INFO: renamed from: j */
    public static final az0 f658j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ az0[] f659k;

    static {
        az0 az0Var = new az0("DEFAULT", 0);
        f658j = az0Var;
        az0 az0Var2 = new az0("UNMETERED_ONLY", 1);
        az0 az0Var3 = new az0("UNMETERED_OR_DAILY", 2);
        az0 az0Var4 = new az0("FAST_IF_RADIO_AWAKE", 3);
        az0 az0Var5 = new az0("NEVER", 4);
        az0 az0Var6 = new az0("UNRECOGNIZED", 5);
        f659k = new az0[]{az0Var, az0Var2, az0Var3, az0Var4, az0Var5, az0Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, az0Var);
        sparseArray.put(1, az0Var2);
        sparseArray.put(2, az0Var3);
        sparseArray.put(3, az0Var4);
        sparseArray.put(4, az0Var5);
        sparseArray.put(-1, az0Var6);
    }

    public static az0 valueOf(String str) {
        return (az0) Enum.valueOf(az0.class, str);
    }

    public static az0[] values() {
        return (az0[]) f659k.clone();
    }
}
