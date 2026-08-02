package J1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a Indeterminate;
    public static final a Off;
    public static final a On;

    static {
        a aVar = new a("On", 0);
        On = aVar;
        a aVar2 = new a("Off", 1);
        Off = aVar2;
        a aVar3 = new a("Indeterminate", 2);
        Indeterminate = aVar3;
        $VALUES = new a[]{aVar, aVar2, aVar3};
    }

    private a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
