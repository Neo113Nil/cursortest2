package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a EXPONENTIAL;
    public static final a LINEAR;

    static {
        a aVar = new a("EXPONENTIAL", 0);
        EXPONENTIAL = aVar;
        a aVar2 = new a("LINEAR", 1);
        LINEAR = aVar2;
        $VALUES = new a[]{aVar, aVar2};
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
