package P60;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b B2B;
    public static final b B2C;

    @NotNull
    public static final a Companion;

    @NotNull
    private final String schemePrefix;

    public static final class a {
    }

    static {
        b bVar = new b("B2C", 0, "bank");
        B2C = bVar;
        b bVar2 = new b("B2B", 1, "bankb2b");
        B2B = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = Xc.b.a(bVarArr);
        Companion = new a();
    }

    private b(String str, int i11, String str2) {
        this.schemePrefix = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @NotNull
    public final String a() {
        return this.schemePrefix;
    }
}
