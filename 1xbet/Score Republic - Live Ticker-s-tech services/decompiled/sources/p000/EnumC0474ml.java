package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ml */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0474ml {

    /* JADX INFO: renamed from: j */
    public static final EnumC0474ml f5071j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0474ml f5072k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0474ml f5073l;

    /* JADX INFO: renamed from: m */
    public static final EnumC0474ml f5074m;

    /* JADX INFO: renamed from: n */
    public static final EnumC0474ml f5075n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ EnumC0474ml[] f5076o;

    static {
        EnumC0474ml enumC0474ml = new EnumC0474ml("CONNECTING", 0);
        f5071j = enumC0474ml;
        EnumC0474ml enumC0474ml2 = new EnumC0474ml("READY", 1);
        f5072k = enumC0474ml2;
        EnumC0474ml enumC0474ml3 = new EnumC0474ml("TRANSIENT_FAILURE", 2);
        f5073l = enumC0474ml3;
        EnumC0474ml enumC0474ml4 = new EnumC0474ml("IDLE", 3);
        f5074m = enumC0474ml4;
        EnumC0474ml enumC0474ml5 = new EnumC0474ml("SHUTDOWN", 4);
        f5075n = enumC0474ml5;
        f5076o = new EnumC0474ml[]{enumC0474ml, enumC0474ml2, enumC0474ml3, enumC0474ml4, enumC0474ml5};
    }

    public static EnumC0474ml valueOf(String str) {
        return (EnumC0474ml) Enum.valueOf(EnumC0474ml.class, str);
    }

    public static EnumC0474ml[] values() {
        return (EnumC0474ml[]) f5076o.clone();
    }
}
