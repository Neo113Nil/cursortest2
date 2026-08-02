package Qe;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class o {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o LIST;
    public static final o MAP;
    public static final o OBJ;
    public static final o POLY_OBJ;
    public final char begin;
    public final char end;

    static {
        o oVar = new o("OBJ", 0, '{', '}');
        OBJ = oVar;
        o oVar2 = new o("LIST", 1, '[', ']');
        LIST = oVar2;
        o oVar3 = new o("MAP", 2, '{', '}');
        MAP = oVar3;
        o oVar4 = new o("POLY_OBJ", 3, '[', ']');
        POLY_OBJ = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        $VALUES = oVarArr;
        $ENTRIES = Xc.b.a(oVarArr);
    }

    private o(String str, int i11, char c11, char c12) {
        this.begin = c11;
        this.end = c12;
    }

    @NotNull
    public static Xc.a<o> a() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
