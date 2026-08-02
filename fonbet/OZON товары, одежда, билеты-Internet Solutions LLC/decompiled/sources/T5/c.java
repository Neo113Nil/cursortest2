package T5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c NONE;
    public static final c SOURCE;
    public static final c TRANSFORMED;

    static {
        c cVar = new c("SOURCE", 0);
        SOURCE = cVar;
        c cVar2 = new c("TRANSFORMED", 1);
        TRANSFORMED = cVar2;
        c cVar3 = new c("NONE", 2);
        NONE = cVar3;
        $VALUES = new c[]{cVar, cVar2, cVar3};
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
