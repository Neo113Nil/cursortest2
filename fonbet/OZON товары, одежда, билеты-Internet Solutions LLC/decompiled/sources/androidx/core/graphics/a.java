package androidx.core.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a CLEAR;
    public static final a COLOR;
    public static final a COLOR_BURN;
    public static final a COLOR_DODGE;
    public static final a DARKEN;
    public static final a DIFFERENCE;
    public static final a DST;
    public static final a DST_ATOP;
    public static final a DST_IN;
    public static final a DST_OUT;
    public static final a DST_OVER;
    public static final a EXCLUSION;
    public static final a HARD_LIGHT;
    public static final a HUE;
    public static final a LIGHTEN;
    public static final a LUMINOSITY;
    public static final a MODULATE;
    public static final a MULTIPLY;
    public static final a OVERLAY;
    public static final a PLUS;
    public static final a SATURATION;
    public static final a SCREEN;
    public static final a SOFT_LIGHT;
    public static final a SRC;
    public static final a SRC_ATOP;
    public static final a SRC_IN;
    public static final a SRC_OUT;
    public static final a SRC_OVER;
    public static final a XOR;

    static {
        a aVar = new a("CLEAR", 0);
        CLEAR = aVar;
        a aVar2 = new a("SRC", 1);
        SRC = aVar2;
        a aVar3 = new a("DST", 2);
        DST = aVar3;
        a aVar4 = new a("SRC_OVER", 3);
        SRC_OVER = aVar4;
        a aVar5 = new a("DST_OVER", 4);
        DST_OVER = aVar5;
        a aVar6 = new a("SRC_IN", 5);
        SRC_IN = aVar6;
        a aVar7 = new a("DST_IN", 6);
        DST_IN = aVar7;
        a aVar8 = new a("SRC_OUT", 7);
        SRC_OUT = aVar8;
        a aVar9 = new a("DST_OUT", 8);
        DST_OUT = aVar9;
        a aVar10 = new a("SRC_ATOP", 9);
        SRC_ATOP = aVar10;
        a aVar11 = new a("DST_ATOP", 10);
        DST_ATOP = aVar11;
        a aVar12 = new a("XOR", 11);
        XOR = aVar12;
        a aVar13 = new a("PLUS", 12);
        PLUS = aVar13;
        a aVar14 = new a("MODULATE", 13);
        MODULATE = aVar14;
        a aVar15 = new a("SCREEN", 14);
        SCREEN = aVar15;
        a aVar16 = new a("OVERLAY", 15);
        OVERLAY = aVar16;
        a aVar17 = new a("DARKEN", 16);
        DARKEN = aVar17;
        a aVar18 = new a("LIGHTEN", 17);
        LIGHTEN = aVar18;
        a aVar19 = new a("COLOR_DODGE", 18);
        COLOR_DODGE = aVar19;
        a aVar20 = new a("COLOR_BURN", 19);
        COLOR_BURN = aVar20;
        a aVar21 = new a("HARD_LIGHT", 20);
        HARD_LIGHT = aVar21;
        a aVar22 = new a("SOFT_LIGHT", 21);
        SOFT_LIGHT = aVar22;
        a aVar23 = new a("DIFFERENCE", 22);
        DIFFERENCE = aVar23;
        a aVar24 = new a("EXCLUSION", 23);
        EXCLUSION = aVar24;
        a aVar25 = new a("MULTIPLY", 24);
        MULTIPLY = aVar25;
        a aVar26 = new a("HUE", 25);
        HUE = aVar26;
        a aVar27 = new a("SATURATION", 26);
        SATURATION = aVar27;
        a aVar28 = new a("COLOR", 27);
        COLOR = aVar28;
        a aVar29 = new a("LUMINOSITY", 28);
        LUMINOSITY = aVar29;
        $VALUES = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29};
    }

    private a() {
        throw null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
