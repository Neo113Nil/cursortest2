package Cd;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class L {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ L[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final L IGNORE;
    public static final L STRICT;
    public static final L WARN;

    @NotNull
    private final String description;

    public static final class a {
    }

    static {
        L l11 = new L("IGNORE", 0, "ignore");
        IGNORE = l11;
        L l12 = new L("WARN", 1, "warn");
        WARN = l12;
        L l13 = new L("STRICT", 2, "strict");
        STRICT = l13;
        L[] lArr = {l11, l12, l13};
        $VALUES = lArr;
        $ENTRIES = Xc.b.a(lArr);
        Companion = new a();
    }

    private L(String str, int i11, String str2) {
        this.description = str2;
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.description;
    }
}
