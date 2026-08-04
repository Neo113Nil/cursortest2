package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0718m {
    private static final /* synthetic */ EnumC0718m[] $VALUES;
    public static final C0716k Companion;
    public static final EnumC0718m ON_ANY;
    public static final EnumC0718m ON_CREATE;
    public static final EnumC0718m ON_DESTROY;
    public static final EnumC0718m ON_PAUSE;
    public static final EnumC0718m ON_RESUME;
    public static final EnumC0718m ON_START;
    public static final EnumC0718m ON_STOP;

    static {
        EnumC0718m enumC0718m = new EnumC0718m("ON_CREATE", 0);
        ON_CREATE = enumC0718m;
        EnumC0718m enumC0718m2 = new EnumC0718m("ON_START", 1);
        ON_START = enumC0718m2;
        EnumC0718m enumC0718m3 = new EnumC0718m("ON_RESUME", 2);
        ON_RESUME = enumC0718m3;
        EnumC0718m enumC0718m4 = new EnumC0718m("ON_PAUSE", 3);
        ON_PAUSE = enumC0718m4;
        EnumC0718m enumC0718m5 = new EnumC0718m("ON_STOP", 4);
        ON_STOP = enumC0718m5;
        EnumC0718m enumC0718m6 = new EnumC0718m("ON_DESTROY", 5);
        ON_DESTROY = enumC0718m6;
        EnumC0718m enumC0718m7 = new EnumC0718m("ON_ANY", 6);
        ON_ANY = enumC0718m7;
        $VALUES = new EnumC0718m[]{enumC0718m, enumC0718m2, enumC0718m3, enumC0718m4, enumC0718m5, enumC0718m6, enumC0718m7};
        Companion = new C0716k();
    }

    public static EnumC0718m valueOf(String str) {
        return (EnumC0718m) Enum.valueOf(EnumC0718m.class, str);
    }

    public static EnumC0718m[] values() {
        return (EnumC0718m[]) $VALUES.clone();
    }

    public final EnumC0719n a() {
        switch (AbstractC0717l.f9625a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0719n.f9628c;
            case 3:
            case 4:
                return EnumC0719n.f9629d;
            case 5:
                return EnumC0719n.f9630e;
            case 6:
                return EnumC0719n.f9626a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
