package util.h.xy.bv;

/* loaded from: classes5.dex */
public class rb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = -1231763823;
    private final int getHighSpeedVideoSizesFor;
    private util.h.xy.bv.rb.ra getInputFormats;
    private int getInputSizeshNQ4ISI;
    private final util.h.xy.bv.rb.b getOutputFormats;
    private java.util.Map<java.lang.String, java.lang.String> getOutputMinFrameDuration;
    private final java.util.Map<java.lang.String, java.lang.String> getOutputMinFrameDurationlomOqCM;
    private java.lang.String getOutputSizeshNQ4ISI;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class ra {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static long getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ util.h.xy.bv.rb.ra[] getHighSpeedVideoFpsRangesFor;
        private static int getHighSpeedVideoSizes;
        private static int getOutputFormats;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final util.h.xy.bv.rb.ra f1061;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.bv.rb.ra f1062;

        private ra(java.lang.String str, int i) {
        }

        public static util.h.xy.bv.rb.ra valueOf(java.lang.String str) {
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 109) % 128;
            util.h.xy.bv.rb.ra raVar = (util.h.xy.bv.rb.ra) java.lang.Enum.valueOf(util.h.xy.bv.rb.ra.class, str);
            int i = getOutputFormats + 29;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return raVar;
            }
            throw null;
        }

        public static util.h.xy.bv.rb.ra[] values() {
            getOutputFormats = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
            util.h.xy.bv.rb.ra[] raVarArr = (util.h.xy.bv.rb.ra[]) getHighSpeedVideoFpsRangesFor.clone();
            int i = getOutputFormats + 85;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 != 0) {
                return raVarArr;
            }
            throw null;
        }

        static {
            util.h.xy.bv.rb.ra[] raVarArr;
            getHighSpeedVideoFpsRanges();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("뜗⚝摭띄귧윿Ꟁࡁゎ伝⿴", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
            util.h.xy.bv.rb.ra raVar = new util.h.xy.bv.rb.ra(((java.lang.String) objArr[0]).intern(), 0);
            f1062 = raVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("剃酅믔刅욫烳硳挂헚\uf8d2", 1 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr2);
            util.h.xy.bv.rb.ra raVar2 = new util.h.xy.bv.rb.ra(((java.lang.String) objArr2[0]).intern(), 1);
            f1061 = raVar2;
            int i = getOutputFormats + 47;
            int i2 = i % 128;
            getHighResolutionOutputSizeshNQ4ISI = i2;
            if (i % 2 == 0) {
                raVarArr = new util.h.xy.bv.rb.ra[3];
                raVarArr[1] = raVar;
                raVarArr[1] = raVar2;
            } else {
                raVarArr = new util.h.xy.bv.rb.ra[]{raVar, raVar2};
            }
            getHighSpeedVideoFpsRangesFor = raVarArr;
            int i3 = i2 + 91;
            getOutputFormats = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
        }

        private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2 = Camera2StreamConfigurationMap;
            getHighSpeedVideoSizes = (i2 + 87) % 128;
            int i3 = i2 + 97;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            char[] charArray = str.toCharArray();
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoFpsRanges ^ 7817488252581312552L, charArray, i);
            aVar.f2623 = 4;
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 5) % 128;
            while (aVar.f2623 < m27721.length) {
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoFpsRanges ^ 7817488252581312552L)));
                aVar.f2623++;
            }
            objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
        }

        static void getHighSpeedVideoFpsRanges() {
            getHighSpeedVideoFpsRanges = 7289007492909898207L;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static final /* synthetic */ util.h.xy.bv.rb.b[] getHighSpeedVideoFpsRanges;
        private static int getHighSpeedVideoFpsRangesFor;
        private static long getHighSpeedVideoSizes;
        private static int getInputSizeshNQ4ISI;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.bv.rb.b f1059;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.bv.rb.b f1060;

        private b(java.lang.String str, int i) {
        }

        public static util.h.xy.bv.rb.b valueOf(java.lang.String str) {
            getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 77) % 128;
            util.h.xy.bv.rb.b bVar = (util.h.xy.bv.rb.b) java.lang.Enum.valueOf(util.h.xy.bv.rb.b.class, str);
            int i = Camera2StreamConfigurationMap + 71;
            getInputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                return bVar;
            }
            throw null;
        }

        public static util.h.xy.bv.rb.b[] values() {
            Camera2StreamConfigurationMap = (getInputSizeshNQ4ISI + 61) % 128;
            util.h.xy.bv.rb.b[] bVarArr = (util.h.xy.bv.rb.b[]) getHighSpeedVideoFpsRanges.clone();
            getInputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 75) % 128;
            return bVarArr;
        }

        static {
            util.h.xy.bv.rb.b[] bVarArr;
            getHighSpeedVideoSizes();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("몢\ue141뫡㷍⋇鬬菁", android.view.ViewConfiguration.getDoubleTapTimeout() >> 16, objArr);
            util.h.xy.bv.rb.b bVar = new util.h.xy.bv.rb.b(((java.lang.String) objArr[0]).intern(), 0);
            f1059 = bVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ⷙᥚ\u2d98엕瑒춧㤘", android.text.TextUtils.indexOf("", ""), objArr2);
            util.h.xy.bv.rb.b bVar2 = new util.h.xy.bv.rb.b(((java.lang.String) objArr2[0]).intern(), 1);
            f1060 = bVar2;
            int i = Camera2StreamConfigurationMap + 73;
            int i2 = i % 128;
            getInputSizeshNQ4ISI = i2;
            if (i % 2 != 0) {
                bVarArr = new util.h.xy.bv.rb.b[5];
                bVarArr[0] = bVar;
                bVarArr[1] = bVar2;
            } else {
                bVarArr = new util.h.xy.bv.rb.b[]{bVar, bVar2};
            }
            Camera2StreamConfigurationMap = (i2 + 97) % 128;
            getHighSpeedVideoFpsRanges = bVarArr;
            int i3 = i2 + 111;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
        }

        private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 23;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            char[] charArray = str.toCharArray();
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoSizes ^ 7817488252581312552L, charArray, i);
            aVar.f2623 = 4;
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 107) % 128;
            while (aVar.f2623 < m27721.length) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoSizes ^ 7817488252581312552L)));
                aVar.f2623++;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 47) % 128;
            }
            objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
        }

        static void getHighSpeedVideoSizes() {
            getHighSpeedVideoSizes = 6277507204923008244L;
        }
    }

    public rb(int i) {
        this(i, util.h.xy.bv.rb.b.f1059);
    }

    public rb(int i, util.h.xy.bv.rb.b bVar) {
        this.getHighSpeedVideoSizesFor = i;
        this.getOutputFormats = bVar;
        this.getOutputMinFrameDurationlomOqCM = new java.util.HashMap();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public java.util.Map<java.lang.String, java.lang.String> m25747() {
        int i = (getHighSpeedVideoFpsRanges + 89) % 128;
        Camera2StreamConfigurationMap = i;
        java.util.Map<java.lang.String, java.lang.String> map = this.getOutputMinFrameDurationlomOqCM;
        getHighSpeedVideoFpsRanges = (i + 113) % 128;
        return map;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public int m25751() {
        int i = Camera2StreamConfigurationMap + 105;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            return this.getHighSpeedVideoSizesFor;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public util.h.xy.bv.rb.ra m25745() {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 39;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.bv.rb.ra raVar = this.getInputFormats;
        getHighSpeedVideoFpsRanges = (i + 15) % 128;
        return raVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public int m25749() {
        int i = getHighSpeedVideoFpsRanges + 97;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return this.getInputSizeshNQ4ISI;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public java.lang.String m25742() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 71) % 128;
        java.lang.String str = this.getOutputSizeshNQ4ISI;
        int i2 = i + 111;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public util.h.xy.bv.rb.b m25752() {
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 19) % 128;
        util.h.xy.bv.rb.b bVar = this.getOutputFormats;
        Camera2StreamConfigurationMap = (i + 73) % 128;
        return bVar;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public java.util.Map<java.lang.String, java.lang.String> m25750() {
        int i = getHighSpeedVideoFpsRanges + 33;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return this.getOutputMinFrameDuration;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m25744(util.h.xy.bv.rb.ra raVar) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        this.getInputFormats = raVar;
        getHighSpeedVideoFpsRanges = (i + 35) % 128;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 73;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 51) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getHighSpeedVideoSizes ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 55) % 128;
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

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m25743(int i) {
        int i2 = Camera2StreamConfigurationMap + 21;
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRanges = i3;
        if (i2 % 2 == 0) {
            this.getInputSizeshNQ4ISI = i;
            int i4 = i3 + 47;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getInputSizeshNQ4ISI = i;
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public void m25748(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges + 1;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            this.getOutputSizeshNQ4ISI = str;
        } else {
            this.getOutputSizeshNQ4ISI = str;
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public void m25746(java.util.Map<java.lang.String, java.lang.String> map) {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = i + 13;
        Camera2StreamConfigurationMap = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputMinFrameDuration = map;
            int i3 = i + 67;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.getOutputMinFrameDuration = map;
        throw null;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0014\u0001\u0012\u0007\u0005\u0014\ufff3\u0005\u0012\u0016\u0005\u0012ￌ\uffc0\b\u0014\u0014\u0010\ufff3\u0014\u0001\u0014\u0015\u0013ￌ\uffc0\u0013\u0014\u0001\u0014\u0015\u0013ￌ\uffc0\u0013\u0014\u0001\u0014\u0015\u0013￭\u0013\u0007ￌ\uffc0\u0013\u0014\u0001\u0014\u0015\u0013\ufff2\u0005\u0001\u0013\u000f\u000e\uffc9\uffc8", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 58, 59 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 103 - (android.view.ViewConfiguration.getTapTimeout() >> 16), false, objArr);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(((java.lang.String) objArr[0]).intern());
        sb.append(this.getOutputFormats);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0000", (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), android.view.KeyEvent.getDeadChar(0, 0) + 51, true, objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(this.getHighSpeedVideoSizesFor);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0000", 1 - android.view.View.combineMeasuredStates(0, 0), -(android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 51 - android.text.TextUtils.getOffsetAfter("", 0), true, objArr3);
        sb.append(((java.lang.String) objArr3[0]).intern());
        sb.append(this.getInputFormats);
        java.lang.Object[] objArr4 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0000", android.text.TextUtils.getOffsetBefore("", 0) + 1, 1 - android.text.TextUtils.getOffsetBefore("", 0), 51 - android.graphics.Color.argb(0, 0, 0, 0), true, objArr4);
        sb.append(((java.lang.String) objArr4[0]).intern());
        sb.append(this.getOutputSizeshNQ4ISI);
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI("\u0000", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1, 51 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), true, objArr5);
        sb.append(((java.lang.String) objArr5[0]).intern());
        sb.append(this.getInputSizeshNQ4ISI);
        java.lang.String obj = sb.toString();
        int i = getHighSpeedVideoFpsRanges + 7;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return obj;
        }
        throw null;
    }
}
