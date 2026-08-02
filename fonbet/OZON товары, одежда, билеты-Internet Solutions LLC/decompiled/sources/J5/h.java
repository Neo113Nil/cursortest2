package J5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h ADD;
    public static final h COLOR;
    public static final h COLOR_BURN;
    public static final h COLOR_DODGE;
    public static final h DARKEN;
    public static final h DIFFERENCE;
    public static final h EXCLUSION;
    public static final h HARD_LIGHT;
    public static final h HARD_MIX;
    public static final h HUE;
    public static final h LIGHTEN;
    public static final h LUMINOSITY;
    public static final h MULTIPLY;
    public static final h NORMAL;
    public static final h OVERLAY;
    public static final h SATURATION;
    public static final h SCREEN;
    public static final h SOFT_LIGHT;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f14026a;

        static {
            int[] iArr = new int[h.values().length];
            f14026a = iArr;
            try {
                iArr[h.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14026a[h.SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14026a[h.OVERLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14026a[h.DARKEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14026a[h.LIGHTEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14026a[h.ADD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14026a[h.MULTIPLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14026a[h.COLOR_DODGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14026a[h.COLOR_BURN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14026a[h.HARD_LIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14026a[h.SOFT_LIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14026a[h.DIFFERENCE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14026a[h.EXCLUSION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14026a[h.HUE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14026a[h.SATURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14026a[h.COLOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f14026a[h.LUMINOSITY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14026a[h.HARD_MIX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    static {
        h hVar = new h("NORMAL", 0);
        NORMAL = hVar;
        h hVar2 = new h("MULTIPLY", 1);
        MULTIPLY = hVar2;
        h hVar3 = new h("SCREEN", 2);
        SCREEN = hVar3;
        h hVar4 = new h("OVERLAY", 3);
        OVERLAY = hVar4;
        h hVar5 = new h("DARKEN", 4);
        DARKEN = hVar5;
        h hVar6 = new h("LIGHTEN", 5);
        LIGHTEN = hVar6;
        h hVar7 = new h("COLOR_DODGE", 6);
        COLOR_DODGE = hVar7;
        h hVar8 = new h("COLOR_BURN", 7);
        COLOR_BURN = hVar8;
        h hVar9 = new h("HARD_LIGHT", 8);
        HARD_LIGHT = hVar9;
        h hVar10 = new h("SOFT_LIGHT", 9);
        SOFT_LIGHT = hVar10;
        h hVar11 = new h("DIFFERENCE", 10);
        DIFFERENCE = hVar11;
        h hVar12 = new h("EXCLUSION", 11);
        EXCLUSION = hVar12;
        h hVar13 = new h("HUE", 12);
        HUE = hVar13;
        h hVar14 = new h("SATURATION", 13);
        SATURATION = hVar14;
        h hVar15 = new h("COLOR", 14);
        COLOR = hVar15;
        h hVar16 = new h("LUMINOSITY", 15);
        LUMINOSITY = hVar16;
        h hVar17 = new h("ADD", 16);
        ADD = hVar17;
        h hVar18 = new h("HARD_MIX", 17);
        HARD_MIX = hVar18;
        $VALUES = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14, hVar15, hVar16, hVar17, hVar18};
    }

    private h() {
        throw null;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final androidx.core.graphics.a a() {
        int i11 = a.f14026a[ordinal()];
        if (i11 == 2) {
            return androidx.core.graphics.a.SCREEN;
        }
        if (i11 == 3) {
            return androidx.core.graphics.a.OVERLAY;
        }
        if (i11 == 4) {
            return androidx.core.graphics.a.DARKEN;
        }
        if (i11 == 5) {
            return androidx.core.graphics.a.LIGHTEN;
        }
        if (i11 != 6) {
            return null;
        }
        return androidx.core.graphics.a.PLUS;
    }
}
