package a10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k REGULAR;
    public static final k SERVER;

    static {
        k kVar = new k("REGULAR", 0);
        REGULAR = kVar;
        k kVar2 = new k("SERVER", 1);
        SERVER = kVar2;
        k[] kVarArr = {kVar, kVar2};
        $VALUES = kVarArr;
        $ENTRIES = Xc.b.a(kVarArr);
    }

    private k() {
        throw null;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
