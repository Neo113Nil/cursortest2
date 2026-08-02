package Gh0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d DELIVERY;
    public static final d OPEN;
    private final int status;

    static {
        d dVar = new d("DELIVERY", 0, 0);
        DELIVERY = dVar;
        d dVar2 = new d("OPEN", 1, 1);
        OPEN = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = Xc.b.a(dVarArr);
    }

    private d(String str, int i11, int i12) {
        this.status = i12;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final int a() {
        return this.status;
    }
}
