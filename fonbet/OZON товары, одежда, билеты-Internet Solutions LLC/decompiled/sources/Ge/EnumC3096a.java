package Ge;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ge.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class EnumC3096a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC3096a[] $VALUES;
    public static final EnumC3096a FIRST;
    public static final EnumC3096a FIRST_OR_DEFAULT;
    public static final EnumC3096a LAST;
    public static final EnumC3096a SINGLE;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final String f10079s;

    static {
        EnumC3096a enumC3096a = new EnumC3096a("FIRST", 0, "awaitFirst");
        FIRST = enumC3096a;
        EnumC3096a enumC3096a2 = new EnumC3096a("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");
        FIRST_OR_DEFAULT = enumC3096a2;
        EnumC3096a enumC3096a3 = new EnumC3096a("LAST", 2, "awaitLast");
        LAST = enumC3096a3;
        EnumC3096a enumC3096a4 = new EnumC3096a("SINGLE", 3, "awaitSingle");
        SINGLE = enumC3096a4;
        EnumC3096a[] enumC3096aArr = {enumC3096a, enumC3096a2, enumC3096a3, enumC3096a4};
        $VALUES = enumC3096aArr;
        $ENTRIES = Xc.b.a(enumC3096aArr);
    }

    private EnumC3096a(String str, int i11, String str2) {
        this.f10079s = str2;
    }

    public static EnumC3096a valueOf(String str) {
        return (EnumC3096a) Enum.valueOf(EnumC3096a.class, str);
    }

    public static EnumC3096a[] values() {
        return (EnumC3096a[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        return this.f10079s;
    }
}
