package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: nn */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0513nn {

    /* JADX INFO: renamed from: j */
    public static final EnumC0513nn f5459j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0513nn[] f5460k;

    static {
        EnumC0513nn enumC0513nn = new EnumC0513nn("COROUTINE_SUSPENDED", 0);
        f5459j = enumC0513nn;
        f5460k = new EnumC0513nn[]{enumC0513nn, new EnumC0513nn("UNDECIDED", 1), new EnumC0513nn("RESUMED", 2)};
    }

    public static EnumC0513nn valueOf(String str) {
        return (EnumC0513nn) Enum.valueOf(EnumC0513nn.class, str);
    }

    public static EnumC0513nn[] values() {
        return (EnumC0513nn[]) f5460k.clone();
    }
}
