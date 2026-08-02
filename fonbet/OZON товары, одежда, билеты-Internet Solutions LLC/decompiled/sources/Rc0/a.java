package Rc0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a Entry;
    public static final a Otp;

    static {
        a aVar = new a("Entry", 0);
        Entry = aVar;
        a aVar2 = new a("Otp", 1);
        Otp = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = Xc.b.a(aVarArr);
    }

    private a() {
        throw null;
    }

    @NotNull
    public static Xc.a<a> a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
