package R0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class t {
    private static final /* synthetic */ t[] $VALUES;
    public static final t BodyLarge;
    public static final t BodyMedium;
    public static final t BodySmall;
    public static final t DisplayLarge;
    public static final t DisplayMedium;
    public static final t DisplaySmall;
    public static final t HeadlineLarge;
    public static final t HeadlineMedium;
    public static final t HeadlineSmall;
    public static final t LabelLarge;
    public static final t LabelMedium;
    public static final t LabelSmall;
    public static final t TitleLarge;
    public static final t TitleMedium;
    public static final t TitleSmall;

    static {
        t tVar = new t("BodyLarge", 0);
        BodyLarge = tVar;
        t tVar2 = new t("BodyMedium", 1);
        BodyMedium = tVar2;
        t tVar3 = new t("BodySmall", 2);
        BodySmall = tVar3;
        t tVar4 = new t("DisplayLarge", 3);
        DisplayLarge = tVar4;
        t tVar5 = new t("DisplayMedium", 4);
        DisplayMedium = tVar5;
        t tVar6 = new t("DisplaySmall", 5);
        DisplaySmall = tVar6;
        t tVar7 = new t("HeadlineLarge", 6);
        HeadlineLarge = tVar7;
        t tVar8 = new t("HeadlineMedium", 7);
        HeadlineMedium = tVar8;
        t tVar9 = new t("HeadlineSmall", 8);
        HeadlineSmall = tVar9;
        t tVar10 = new t("LabelLarge", 9);
        LabelLarge = tVar10;
        t tVar11 = new t("LabelMedium", 10);
        LabelMedium = tVar11;
        t tVar12 = new t("LabelSmall", 11);
        LabelSmall = tVar12;
        t tVar13 = new t("TitleLarge", 12);
        TitleLarge = tVar13;
        t tVar14 = new t("TitleMedium", 13);
        TitleMedium = tVar14;
        t tVar15 = new t("TitleSmall", 14);
        TitleSmall = tVar15;
        $VALUES = new t[]{tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10, tVar11, tVar12, tVar13, tVar14, tVar15};
    }

    private t() {
        throw null;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
