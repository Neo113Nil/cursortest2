package Gb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d CROSS_APP;
    public static final d FORCE_LOGIN;
    public static final d INSTANT_LOGIN;
    public static final d LOGIN;

    static {
        d dVar = new d("LOGIN", 0);
        LOGIN = dVar;
        d dVar2 = new d("FORCE_LOGIN", 1);
        FORCE_LOGIN = dVar2;
        d dVar3 = new d("INSTANT_LOGIN", 2);
        INSTANT_LOGIN = dVar3;
        d dVar4 = new d("CROSS_APP", 3);
        CROSS_APP = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = Xc.b.a(dVarArr);
    }

    private d() {
        throw null;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
