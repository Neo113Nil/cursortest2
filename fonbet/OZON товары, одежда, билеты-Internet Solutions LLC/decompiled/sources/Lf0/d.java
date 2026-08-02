package Lf0;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d Http;
    public static final d Https;
    public static final d Tcp;

    static {
        d dVar = new d("Tcp", 0);
        Tcp = dVar;
        d dVar2 = new d("Http", 1);
        Http = dVar2;
        d dVar3 = new d("Https", 2);
        Https = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = Xc.b.a(dVarArr);
    }

    private d() {
        throw null;
    }

    @NotNull
    public static Xc.a<d> a() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
