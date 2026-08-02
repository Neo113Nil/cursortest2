package W60;

import Xc.b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CBOTTOM;
    public static final a MAIN;
    public static final a TRANSFER;

    @NotNull
    private final String fileName;

    static {
        a aVar = new a("MAIN", 0, "main_data.json");
        MAIN = aVar;
        a aVar2 = new a("TRANSFER", 1, "transfer_data.json");
        TRANSFER = aVar2;
        a aVar3 = new a("CBOTTOM", 2, "cbottom_data.json");
        CBOTTOM = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = b.a(aVarArr);
    }

    private a(String str, int i11, String str2) {
        this.fileName = str2;
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

    @NotNull
    public final String b() {
        return this.fileName;
    }
}
