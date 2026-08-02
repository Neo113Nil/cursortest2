package G9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c AUTO;
    public static final c BYTE;
    public static final c NUMERIC;
    public static final c TEXT;

    static {
        c cVar = new c("AUTO", 0);
        AUTO = cVar;
        c cVar2 = new c("TEXT", 1);
        TEXT = cVar2;
        c cVar3 = new c("BYTE", 2);
        BYTE = cVar3;
        c cVar4 = new c("NUMERIC", 3);
        NUMERIC = cVar4;
        $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
    }

    private c() {
        throw null;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
