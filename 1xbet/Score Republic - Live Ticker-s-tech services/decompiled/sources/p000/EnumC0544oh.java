package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: oh */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0544oh {

    /* JADX INFO: renamed from: j */
    public static final EnumC0544oh f5731j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0544oh f5732k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0544oh f5733l;

    /* JADX INFO: renamed from: m */
    public static final EnumC0544oh f5734m;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ EnumC0544oh[] f5735n;

    static {
        EnumC0544oh enumC0544oh = new EnumC0544oh("PROCESSED", 0);
        f5731j = enumC0544oh;
        EnumC0544oh enumC0544oh2 = new EnumC0544oh("REFUSED", 1);
        f5732k = enumC0544oh2;
        EnumC0544oh enumC0544oh3 = new EnumC0544oh("DROPPED", 2);
        f5733l = enumC0544oh3;
        EnumC0544oh enumC0544oh4 = new EnumC0544oh("MISCARRIED", 3);
        f5734m = enumC0544oh4;
        f5735n = new EnumC0544oh[]{enumC0544oh, enumC0544oh2, enumC0544oh3, enumC0544oh4};
    }

    public static EnumC0544oh valueOf(String str) {
        return (EnumC0544oh) Enum.valueOf(EnumC0544oh.class, str);
    }

    public static EnumC0544oh[] values() {
        return (EnumC0544oh[]) f5735n.clone();
    }
}
