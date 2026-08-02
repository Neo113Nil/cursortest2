package util.h.xy.ct;

/* loaded from: classes5.dex */
public interface a {
    /* renamed from: ˎ, reason: contains not printable characters */
    void mo26029() throws util.h.xy.ct.mc;

    /* renamed from: ˏ, reason: contains not printable characters */
    boolean mo26030();

    /* renamed from: ᐝ, reason: contains not printable characters */
    java.util.Map<util.h.xy.ct.a.b, byte[]> mo26031() throws util.h.xy.ct.mc;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRanges;
        private static int getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ util.h.xy.ct.a.b[] getHighSpeedVideoSizes;
        private static int getInputSizeshNQ4ISI;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.ct.a.b f1122;

        private b(java.lang.String str) {
        }

        public static util.h.xy.ct.a.b valueOf(java.lang.String str) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
            util.h.xy.ct.a.b bVar = (util.h.xy.ct.a.b) java.lang.Enum.valueOf(util.h.xy.ct.a.b.class, str);
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 59) % 128;
            return bVar;
        }

        public static util.h.xy.ct.a.b[] values() {
            int i = getHighResolutionOutputSizeshNQ4ISI + 3;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            util.h.xy.ct.a.b[] bVarArr = (util.h.xy.ct.a.b[]) getHighSpeedVideoSizes.clone();
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 107;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 == 0) {
                return bVarArr;
            }
            throw null;
        }

        static {
            getHighResolutionOutputSizeshNQ4ISI();
            int trimmedLength = android.text.TextUtils.getTrimmedLength("") + 7;
            int jumpTapTimeout = (android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 1;
            int scrollBarFadeDuration = 80 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16);
            int i = Camera2StreamConfigurationMap + 117;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            char[] charArray = "\u0005\u0002\ufff3\u0004\ufff3\uffff\u0011".toCharArray();
            util.h.xz.b.ra raVar = new util.h.xz.b.ra();
            char[] cArr = new char[trimmedLength];
            raVar.f2649 = 0;
            while (raVar.f2649 < trimmedLength) {
                raVar.f2650 = charArray[raVar.f2649];
                cArr[raVar.f2649] = (char) (raVar.f2650 + scrollBarFadeDuration);
                int i2 = raVar.f2649;
                cArr[i2] = (char) (cArr[i2] - ((int) (getInputSizeshNQ4ISI ^ (-4839292868003314026L))));
                raVar.f2649++;
            }
            if (jumpTapTimeout > 0) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 95) % 128;
                raVar.f2648 = jumpTapTimeout;
                char[] cArr2 = new char[trimmedLength];
                java.lang.System.arraycopy(cArr, 0, cArr2, 0, trimmedLength);
                java.lang.System.arraycopy(cArr2, 0, cArr, trimmedLength - raVar.f2648, raVar.f2648);
                java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, trimmedLength - raVar.f2648);
            }
            util.h.xy.ct.a.b bVar = new util.h.xy.ct.a.b(new java.lang.String(cArr).intern());
            f1122 = bVar;
            int i3 = (getHighSpeedVideoFpsRanges + 89) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i3;
            getHighSpeedVideoFpsRanges = (i3 + 91) % 128;
            getHighSpeedVideoSizes = new util.h.xy.ct.a.b[]{bVar};
            getHighSpeedVideoFpsRanges = (i3 + 71) % 128;
        }

        static void getHighResolutionOutputSizeshNQ4ISI() {
            getInputSizeshNQ4ISI = -1231763820;
        }
    }
}
