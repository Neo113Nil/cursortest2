package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vp0 {

    /* JADX INFO: renamed from: j */
    public static final vp0 f8244j;

    /* JADX INFO: renamed from: k */
    public static final vp0 f8245k;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ vp0[] f8246l;

    static {
        vp0 vp0Var = new vp0("UNARY", 0);
        f8244j = vp0Var;
        vp0 vp0Var2 = new vp0("CLIENT_STREAMING", 1);
        vp0 vp0Var3 = new vp0("SERVER_STREAMING", 2);
        f8245k = vp0Var3;
        f8246l = new vp0[]{vp0Var, vp0Var2, vp0Var3, new vp0("BIDI_STREAMING", 3), new vp0("UNKNOWN", 4)};
    }

    public static vp0 valueOf(String str) {
        return (vp0) Enum.valueOf(vp0.class, str);
    }

    public static vp0[] values() {
        return (vp0[]) f8246l.clone();
    }
}
