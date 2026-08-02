package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: pc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0576pc {

    /* JADX INFO: renamed from: j */
    public static final EnumC0576pc f6080j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0576pc f6081k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0576pc f6082l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ EnumC0576pc[] f6083m;

    static {
        EnumC0576pc enumC0576pc = new EnumC0576pc("SUSPEND", 0);
        f6080j = enumC0576pc;
        EnumC0576pc enumC0576pc2 = new EnumC0576pc("DROP_OLDEST", 1);
        f6081k = enumC0576pc2;
        EnumC0576pc enumC0576pc3 = new EnumC0576pc("DROP_LATEST", 2);
        f6082l = enumC0576pc3;
        f6083m = new EnumC0576pc[]{enumC0576pc, enumC0576pc2, enumC0576pc3};
    }

    public static EnumC0576pc valueOf(String str) {
        return (EnumC0576pc) Enum.valueOf(EnumC0576pc.class, str);
    }

    public static EnumC0576pc[] values() {
        return (EnumC0576pc[]) f6083m.clone();
    }
}
