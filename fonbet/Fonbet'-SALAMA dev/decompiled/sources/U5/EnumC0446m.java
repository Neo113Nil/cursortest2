package U5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: U5.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0446m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0446m f6550a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC0446m f6551b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0446m f6552c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0446m f6553d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC0446m f6554e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumC0446m[] f6555f;

    static {
        EnumC0446m enumC0446m = new EnumC0446m("CONNECTING", 0);
        f6550a = enumC0446m;
        EnumC0446m enumC0446m2 = new EnumC0446m("READY", 1);
        f6551b = enumC0446m2;
        EnumC0446m enumC0446m3 = new EnumC0446m("TRANSIENT_FAILURE", 2);
        f6552c = enumC0446m3;
        EnumC0446m enumC0446m4 = new EnumC0446m("IDLE", 3);
        f6553d = enumC0446m4;
        EnumC0446m enumC0446m5 = new EnumC0446m("SHUTDOWN", 4);
        f6554e = enumC0446m5;
        f6555f = new EnumC0446m[]{enumC0446m, enumC0446m2, enumC0446m3, enumC0446m4, enumC0446m5};
    }

    public static EnumC0446m valueOf(String str) {
        return (EnumC0446m) Enum.valueOf(EnumC0446m.class, str);
    }

    public static EnumC0446m[] values() {
        return (EnumC0446m[]) f6555f.clone();
    }
}
