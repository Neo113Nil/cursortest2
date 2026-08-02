package androidx.lifecycle;

import d4.C1917b;
import d4.InterfaceC1916a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0486o {
    private static final /* synthetic */ InterfaceC1916a $ENTRIES;
    private static final /* synthetic */ EnumC0486o[] $VALUES;
    public static final C0484m Companion;
    public static final EnumC0486o ON_ANY;
    public static final EnumC0486o ON_CREATE;
    public static final EnumC0486o ON_DESTROY;
    public static final EnumC0486o ON_PAUSE;
    public static final EnumC0486o ON_RESUME;
    public static final EnumC0486o ON_START;
    public static final EnumC0486o ON_STOP;

    static {
        EnumC0486o enumC0486o = new EnumC0486o("ON_CREATE", 0);
        ON_CREATE = enumC0486o;
        EnumC0486o enumC0486o2 = new EnumC0486o("ON_START", 1);
        ON_START = enumC0486o2;
        EnumC0486o enumC0486o3 = new EnumC0486o("ON_RESUME", 2);
        ON_RESUME = enumC0486o3;
        EnumC0486o enumC0486o4 = new EnumC0486o("ON_PAUSE", 3);
        ON_PAUSE = enumC0486o4;
        EnumC0486o enumC0486o5 = new EnumC0486o("ON_STOP", 4);
        ON_STOP = enumC0486o5;
        EnumC0486o enumC0486o6 = new EnumC0486o("ON_DESTROY", 5);
        ON_DESTROY = enumC0486o6;
        EnumC0486o enumC0486o7 = new EnumC0486o("ON_ANY", 6);
        ON_ANY = enumC0486o7;
        EnumC0486o[] enumC0486oArr = {enumC0486o, enumC0486o2, enumC0486o3, enumC0486o4, enumC0486o5, enumC0486o6, enumC0486o7};
        $VALUES = enumC0486oArr;
        $ENTRIES = new C1917b(enumC0486oArr);
        Companion = new C0484m();
    }

    public static EnumC0486o valueOf(String str) {
        return (EnumC0486o) Enum.valueOf(EnumC0486o.class, str);
    }

    public static EnumC0486o[] values() {
        return (EnumC0486o[]) $VALUES.clone();
    }

    public final EnumC0487p a() {
        switch (AbstractC0485n.f7057a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0487p.f7060m;
            case 3:
            case 4:
                return EnumC0487p.f7061n;
            case 5:
                return EnumC0487p.f7062o;
            case 6:
                return EnumC0487p.f7058k;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                throw new D2.e();
        }
    }
}
