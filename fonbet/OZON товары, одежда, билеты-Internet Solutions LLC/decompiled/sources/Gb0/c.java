package Gb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FORCE_LOGOUT;
    public static final c LOGOUT;

    static {
        c cVar = new c("LOGOUT", 0);
        LOGOUT = cVar;
        c cVar2 = new c("FORCE_LOGOUT", 1);
        FORCE_LOGOUT = cVar2;
        c[] cVarArr = {cVar, cVar2};
        $VALUES = cVarArr;
        $ENTRIES = Xc.b.a(cVarArr);
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
