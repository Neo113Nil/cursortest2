package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l30 implements InterfaceC0254gm {

    /* JADX INFO: renamed from: j */
    public static final l30 f4655j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ l30[] f4656k;

    static {
        l30 l30Var = new l30("INSTANCE", 0);
        f4655j = l30Var;
        f4656k = new l30[]{l30Var};
    }

    public static l30 valueOf(String str) {
        return (l30) Enum.valueOf(l30.class, str);
    }

    public static l30[] values() {
        return (l30[]) f4656k.clone();
    }

    @Override // p000.InterfaceC0254gm
    public final void accept(Object obj) {
        ((ib1) obj).request(Long.MAX_VALUE);
    }
}
