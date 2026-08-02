package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: kn */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0402kn {

    /* JADX INFO: renamed from: j */
    public static final EnumC0402kn f4454j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0402kn f4455k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0402kn f4456l;

    /* JADX INFO: renamed from: m */
    public static final EnumC0402kn f4457m;

    /* JADX INFO: renamed from: n */
    public static final EnumC0402kn f4458n;

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ EnumC0402kn[] f4459o;

    static {
        EnumC0402kn enumC0402kn = new EnumC0402kn("CPU_ACQUIRED", 0);
        f4454j = enumC0402kn;
        EnumC0402kn enumC0402kn2 = new EnumC0402kn("BLOCKING", 1);
        f4455k = enumC0402kn2;
        EnumC0402kn enumC0402kn3 = new EnumC0402kn("PARKING", 2);
        f4456l = enumC0402kn3;
        EnumC0402kn enumC0402kn4 = new EnumC0402kn("DORMANT", 3);
        f4457m = enumC0402kn4;
        EnumC0402kn enumC0402kn5 = new EnumC0402kn("TERMINATED", 4);
        f4458n = enumC0402kn5;
        f4459o = new EnumC0402kn[]{enumC0402kn, enumC0402kn2, enumC0402kn3, enumC0402kn4, enumC0402kn5};
    }

    public static EnumC0402kn valueOf(String str) {
        return (EnumC0402kn) Enum.valueOf(EnumC0402kn.class, str);
    }

    public static EnumC0402kn[] values() {
        return (EnumC0402kn[]) f4459o.clone();
    }
}
