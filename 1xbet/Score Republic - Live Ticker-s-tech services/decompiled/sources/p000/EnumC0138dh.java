package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: dh */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0138dh {

    /* JADX INFO: renamed from: j */
    public static final EnumC0138dh f1645j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC0138dh[] f1646k;

    static {
        EnumC0138dh enumC0138dh = new EnumC0138dh("BLOCKING", 0);
        f1645j = enumC0138dh;
        f1646k = new EnumC0138dh[]{enumC0138dh, new EnumC0138dh("FUTURE", 1), new EnumC0138dh("ASYNC", 2)};
    }

    public static EnumC0138dh valueOf(String str) {
        return (EnumC0138dh) Enum.valueOf(EnumC0138dh.class, str);
    }

    public static EnumC0138dh[] values() {
        return (EnumC0138dh[]) f1646k.clone();
    }
}
