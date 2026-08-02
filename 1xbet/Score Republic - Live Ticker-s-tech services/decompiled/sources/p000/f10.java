package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f10 {

    /* JADX INFO: renamed from: j */
    public static final f10 f2262j;

    /* JADX INFO: renamed from: k */
    public static final f10 f2263k;

    /* JADX INFO: renamed from: l */
    public static final f10 f2264l;

    /* JADX INFO: renamed from: m */
    public static final f10 f2265m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ f10[] f2266n;

    static {
        f10 f10Var = new f10("UNSPECIFIED_RENDER_ERROR", 0);
        f2262j = f10Var;
        f10 f10Var2 = new f10("IMAGE_FETCH_ERROR", 1);
        f2263k = f10Var2;
        f10 f10Var3 = new f10("IMAGE_DISPLAY_ERROR", 2);
        f2264l = f10Var3;
        f10 f10Var4 = new f10("IMAGE_UNSUPPORTED_FORMAT", 3);
        f2265m = f10Var4;
        f2266n = new f10[]{f10Var, f10Var2, f10Var3, f10Var4};
    }

    public static f10 valueOf(String str) {
        return (f10) Enum.valueOf(f10.class, str);
    }

    public static f10[] values() {
        return (f10[]) f2266n.clone();
    }
}
