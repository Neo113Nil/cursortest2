package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: hh */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0286hh {

    /* JADX INFO: renamed from: j */
    public static final EnumC0286hh f3208j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0286hh[] f3209k;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0286hh EF0;

    static {
        EnumC0286hh enumC0286hh = new EnumC0286hh("UNKNOWN", 0);
        EnumC0286hh enumC0286hh2 = new EnumC0286hh("ANDROID_FIREBASE", 1);
        f3208j = enumC0286hh2;
        f3209k = new EnumC0286hh[]{enumC0286hh, enumC0286hh2};
    }

    public static EnumC0286hh valueOf(String str) {
        return (EnumC0286hh) Enum.valueOf(EnumC0286hh.class, str);
    }

    public static EnumC0286hh[] values() {
        return (EnumC0286hh[]) f3209k.clone();
    }
}
