package R0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l CornerExtraLarge;
    public static final l CornerExtraLargeTop;
    public static final l CornerExtraSmall;
    public static final l CornerExtraSmallTop;
    public static final l CornerFull;
    public static final l CornerLarge;
    public static final l CornerLargeEnd;
    public static final l CornerLargeTop;
    public static final l CornerMedium;
    public static final l CornerNone;
    public static final l CornerSmall;

    static {
        l lVar = new l("CornerExtraLarge", 0);
        CornerExtraLarge = lVar;
        l lVar2 = new l("CornerExtraLargeTop", 1);
        CornerExtraLargeTop = lVar2;
        l lVar3 = new l("CornerExtraSmall", 2);
        CornerExtraSmall = lVar3;
        l lVar4 = new l("CornerExtraSmallTop", 3);
        CornerExtraSmallTop = lVar4;
        l lVar5 = new l("CornerFull", 4);
        CornerFull = lVar5;
        l lVar6 = new l("CornerLarge", 5);
        CornerLarge = lVar6;
        l lVar7 = new l("CornerLargeEnd", 6);
        CornerLargeEnd = lVar7;
        l lVar8 = new l("CornerLargeTop", 7);
        CornerLargeTop = lVar8;
        l lVar9 = new l("CornerMedium", 8);
        CornerMedium = lVar9;
        l lVar10 = new l("CornerNone", 9);
        CornerNone = lVar10;
        l lVar11 = new l("CornerSmall", 10);
        CornerSmall = lVar11;
        $VALUES = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11};
    }

    private l() {
        throw null;
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }
}
