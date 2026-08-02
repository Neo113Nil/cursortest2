package com.gemalto.mfs.mwsdk.payment.engine;

/* loaded from: classes8.dex */
public class ProfileUpdatablePaths {

    public static class Visa {
    }

    private ProfileUpdatablePaths() {
    }

    public static class Mastercard {
        public static final java.lang.String APPLICATION_PREFERED_NAME_MAIN_AID;
        private static int Camera2StreamConfigurationMap = 0;
        public static final java.lang.String ISSUER_DYNAMIC_DISCRETIONARY_DATA;
        private static int getHighResolutionOutputSizeshNQ4ISI = 1;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static char getHighSpeedVideoFpsRangesFor;
        private static int getHighSpeedVideoSizes;
        private static char[] getInputFormats;

        private static void Camera2StreamConfigurationMap(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2;
            int length;
            char[] cArr;
            int i3;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 109) % 128;
            char[] charArray = str.toCharArray();
            util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
            char[] cArr2 = getInputFormats;
            if (cArr2 != null) {
                int i4 = getHighSpeedVideoSizes + 61;
                getHighSpeedVideoFpsRanges = i4 % 128;
                if (i4 % 2 == 0) {
                    length = cArr2.length;
                    cArr = new char[length];
                    i3 = 1;
                } else {
                    length = cArr2.length;
                    cArr = new char[length];
                    i3 = 0;
                }
                while (i3 < length) {
                    cArr[i3] = (char) (cArr2[i3] ^ 4042185467053315654L);
                    i3++;
                }
                cArr2 = cArr;
            }
            char c = (char) (4042185467053315654L ^ getHighSpeedVideoFpsRangesFor);
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                mcVar.f2638 = 0;
                while (mcVar.f2638 < i2) {
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 117) % 128;
                    mcVar.f2641 = charArray[mcVar.f2638];
                    mcVar.f2636 = charArray[mcVar.f2638 + 1];
                    if (mcVar.f2641 == mcVar.f2636) {
                        cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                        cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                    } else {
                        mcVar.f2639 = mcVar.f2641 / c;
                        mcVar.f2640 = mcVar.f2641 % c;
                        mcVar.f2637 = mcVar.f2636 / c;
                        mcVar.f2635 = mcVar.f2636 % c;
                        if (mcVar.f2640 == mcVar.f2635) {
                            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 73) % 128;
                            mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                            mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                            int i5 = mcVar.f2639;
                            int i6 = mcVar.f2640;
                            int i7 = mcVar.f2637;
                            int i8 = mcVar.f2635;
                            cArr3[mcVar.f2638] = cArr2[(i5 * c) + i6];
                            cArr3[mcVar.f2638 + 1] = cArr2[(i7 * c) + i8];
                        } else if (mcVar.f2639 == mcVar.f2637) {
                            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 45) % 128;
                            mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                            mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                            int i9 = mcVar.f2639;
                            int i10 = mcVar.f2640;
                            int i11 = mcVar.f2637;
                            int i12 = mcVar.f2635;
                            cArr3[mcVar.f2638] = cArr2[(i9 * c) + i10];
                            cArr3[mcVar.f2638 + 1] = cArr2[(i11 * c) + i12];
                        } else {
                            int i13 = mcVar.f2639;
                            int i14 = mcVar.f2635;
                            int i15 = mcVar.f2637;
                            int i16 = mcVar.f2640;
                            cArr3[mcVar.f2638] = cArr2[(i13 * c) + i14];
                            cArr3[mcVar.f2638 + 1] = cArr2[(i15 * c) + i16];
                        }
                    }
                    mcVar.f2638 += 2;
                }
            }
            for (int i17 = 0; i17 < i; i17++) {
                cArr3[i17] = (char) (cArr3[i17] ^ 13722);
            }
            objArr[0] = new java.lang.String(cArr3);
        }

        static void getHighSpeedVideoSizes() {
            getInputFormats = new char[]{38471, 41965, 41964, 41966};
            getHighSpeedVideoFpsRangesFor = (char) 38468;
        }

        static {
            getHighSpeedVideoSizes();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap((byte) (100 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), "\u0003\u0000\u0003\u0002", 4 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr);
            ISSUER_DYNAMIC_DISCRETIONARY_DATA = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap((byte) (10 - android.view.View.resolveSizeAndState(0, 0, 0)), "\u0003\u0000\u0003\u0000", 4 - android.view.Gravity.getAbsoluteGravity(0, 0), objArr2);
            APPLICATION_PREFERED_NAME_MAIN_AID = ((java.lang.String) objArr2[0]).intern();
            int i = Camera2StreamConfigurationMap + 57;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }
}
