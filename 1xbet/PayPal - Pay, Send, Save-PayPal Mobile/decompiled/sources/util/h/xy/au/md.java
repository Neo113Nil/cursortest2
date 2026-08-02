package util.h.xy.au;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˋ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class md {
    private static int Camera2StreamConfigurationMap = 0;
    private static final /* synthetic */ util.h.xy.au.md[] getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getInputFormats = 1;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.au.md f865;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.au.md f866;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.au.md f867;

    private md(java.lang.String str, int i) {
    }

    public static util.h.xy.au.md valueOf(java.lang.String str) {
        getHighSpeedVideoSizes = (getInputFormats + 41) % 128;
        util.h.xy.au.md mdVar = (util.h.xy.au.md) java.lang.Enum.valueOf(util.h.xy.au.md.class, str);
        int i = getInputFormats + 31;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return mdVar;
        }
        throw null;
    }

    public static util.h.xy.au.md[] values() {
        getInputFormats = (getHighSpeedVideoSizes + 89) % 128;
        util.h.xy.au.md[] mdVarArr = (util.h.xy.au.md[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        getHighSpeedVideoSizes = (getInputFormats + 105) % 128;
        return mdVarArr;
    }

    static {
        getHighSpeedVideoFpsRanges();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0004\b\ufff6", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 4, (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2, android.widget.ExpandableListView.getPackedPositionChild(0L) + 241, true, objArr);
        util.h.xy.au.md mdVar = new util.h.xy.au.md(((java.lang.String) objArr[0]).intern(), 0);
        f865 = mdVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0012\u0005\ufff8\u0001\ufff8\n\ufff4\uffff\u0006\ufff7\ufffe", 11 - android.view.View.getDefaultSize(0, 0), 8 - android.widget.ExpandableListView.getPackedPositionType(0L), (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 238, false, objArr2);
        util.h.xy.au.md mdVar2 = new util.h.xy.au.md(((java.lang.String) objArr2[0]).intern(), 1);
        f866 = mdVar2;
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0000\u0003\ufff5\ufff8\u0013\u0004\u0006\u0003\ufffa�\u0000\ufff9", 12 - android.text.TextUtils.getOffsetBefore("", 0), 11 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (android.view.KeyEvent.getMaxKeyCode() >> 16) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, false, objArr3);
        util.h.xy.au.md mdVar3 = new util.h.xy.au.md(((java.lang.String) objArr3[0]).intern(), 2);
        f867 = mdVar3;
        int i = (getHighSpeedVideoSizes + 47) % 128;
        getInputFormats = i;
        getHighSpeedVideoSizes = (i + 91) % 128;
        getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.au.md[]{mdVar, mdVar2, mdVar3};
        int i2 = i + 53;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: util.h.xy.au.md$2, reason: invalid class name */
    static final /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizes = 1;

        static {
            int[] iArr = new int[util.h.xy.au.md.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[util.h.xy.au.md.f865.ordinal()] = 1;
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 87) % 128;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.au.md.f866.ordinal()] = 2;
                int i = getHighSpeedVideoSizes;
                getHighSpeedVideoFpsRangesFor = (((i | 105) << 1) - (i ^ 105)) % 128;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[util.h.xy.au.md.f867.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int i2 = getHighSpeedVideoFpsRangesFor + 57;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.lang.String m25167() {
        int i = util.h.xy.au.md.AnonymousClass2.getHighSpeedVideoFpsRanges[ordinal()];
        if (i == 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\u0004\b\ufff6", (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 2, android.view.View.getDefaultSize(0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, true, objArr);
            return ((java.lang.String) objArr[0]).intern();
        }
        if (i == 2) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("\u0012\u0005\ufff8\u0001\ufff8\n\ufff4\uffff\u0006\ufff7\ufffe", 11 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 8, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 238, false, objArr2);
            java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
            getHighSpeedVideoSizes = (getInputFormats + 35) % 128;
            return intern;
        }
        if (i != 3) {
            return null;
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0000\u0003\ufff5\ufff8\u0013\u0004\u0006\u0003\ufffa�\u0000\ufff9", (android.view.ViewConfiguration.getTapTimeout() >> 16) + 12, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 13, 237 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), false, objArr3);
        java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
        int i2 = getHighSpeedVideoSizes + 29;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            return intern2;
        }
        throw null;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i4 + 93) % 128;
        getHighSpeedVideoFpsRangesFor = (i4 + 33) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (Camera2StreamConfigurationMap ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 39) % 128;
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void getHighSpeedVideoFpsRanges() {
        Camera2StreamConfigurationMap = -1231763913;
    }
}
