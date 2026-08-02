package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0739m {
    private static final /* synthetic */ EnumC0739m[] $VALUES;
    public static final C0737k Companion;
    public static final EnumC0739m ON_ANY;
    public static final EnumC0739m ON_CREATE;
    public static final EnumC0739m ON_DESTROY;
    public static final EnumC0739m ON_PAUSE;
    public static final EnumC0739m ON_RESUME;
    public static final EnumC0739m ON_START;
    public static final EnumC0739m ON_STOP;

    static {
        EnumC0739m enumC0739m = new EnumC0739m("ON_CREATE", 0);
        ON_CREATE = enumC0739m;
        EnumC0739m enumC0739m2 = new EnumC0739m("ON_START", 1);
        ON_START = enumC0739m2;
        EnumC0739m enumC0739m3 = new EnumC0739m("ON_RESUME", 2);
        ON_RESUME = enumC0739m3;
        EnumC0739m enumC0739m4 = new EnumC0739m("ON_PAUSE", 3);
        ON_PAUSE = enumC0739m4;
        EnumC0739m enumC0739m5 = new EnumC0739m("ON_STOP", 4);
        ON_STOP = enumC0739m5;
        EnumC0739m enumC0739m6 = new EnumC0739m("ON_DESTROY", 5);
        ON_DESTROY = enumC0739m6;
        EnumC0739m enumC0739m7 = new EnumC0739m("ON_ANY", 6);
        ON_ANY = enumC0739m7;
        $VALUES = new EnumC0739m[]{enumC0739m, enumC0739m2, enumC0739m3, enumC0739m4, enumC0739m5, enumC0739m6, enumC0739m7};
        Companion = new C0737k();
    }

    public static EnumC0739m valueOf(String str) {
        return (EnumC0739m) Enum.valueOf(EnumC0739m.class, str);
    }

    public static EnumC0739m[] values() {
        return (EnumC0739m[]) $VALUES.clone();
    }

    public final EnumC0740n a() {
        switch (AbstractC0738l.f9625a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0740n.f9628c;
            case 3:
            case 4:
                return EnumC0740n.f9629d;
            case 5:
                return EnumC0740n.f9630e;
            case 6:
                return EnumC0740n.f9626a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
