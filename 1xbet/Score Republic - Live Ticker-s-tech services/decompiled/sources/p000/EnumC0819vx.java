package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: vx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0819vx {

    /* JADX INFO: renamed from: j */
    public static final EnumC0819vx f8278j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0819vx f8279k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0819vx f8280l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ EnumC0819vx[] f8281m;

    static {
        EnumC0819vx enumC0819vx = new EnumC0819vx("NOT_RUN", 0);
        f8278j = enumC0819vx;
        EnumC0819vx enumC0819vx2 = new EnumC0819vx("CANCELLED", 1);
        f8279k = enumC0819vx2;
        EnumC0819vx enumC0819vx3 = new EnumC0819vx("STARTED", 2);
        f8280l = enumC0819vx3;
        f8281m = new EnumC0819vx[]{enumC0819vx, enumC0819vx2, enumC0819vx3};
    }

    public static EnumC0819vx valueOf(String str) {
        return (EnumC0819vx) Enum.valueOf(EnumC0819vx.class, str);
    }

    public static EnumC0819vx[] values() {
        return (EnumC0819vx[]) f8281m.clone();
    }
}
