package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: aq */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0034aq {

    /* JADX INFO: renamed from: j */
    public static final EnumC0034aq f592j;

    /* JADX INFO: renamed from: k */
    public static final EnumC0034aq f593k;

    /* JADX INFO: renamed from: l */
    public static final EnumC0034aq f594l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ EnumC0034aq[] f595m;

    static {
        EnumC0034aq enumC0034aq = new EnumC0034aq("PREFER_ARGB_8888", 0);
        f592j = enumC0034aq;
        EnumC0034aq enumC0034aq2 = new EnumC0034aq("PREFER_RGB_565", 1);
        f593k = enumC0034aq2;
        f595m = new EnumC0034aq[]{enumC0034aq, enumC0034aq2};
        f594l = enumC0034aq;
    }

    public static EnumC0034aq valueOf(String str) {
        return (EnumC0034aq) Enum.valueOf(EnumC0034aq.class, str);
    }

    public static EnumC0034aq[] values() {
        return (EnumC0034aq[]) f595m.clone();
    }
}
