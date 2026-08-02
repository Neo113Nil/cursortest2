package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes3.dex */
public interface Aid {
    java.lang.String getAid();

    java.lang.String getLabel();

    com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus getLockStatus();

    void setLockStatus(com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class LockStatus {
        private static int Camera2StreamConfigurationMap = 0;
        public static final com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus LOCKED;
        public static final com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus UNLOCKED;
        private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static int getHighSpeedVideoSizes;
        private static final /* synthetic */ com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus[] getInputSizeshNQ4ISI;
        private static long getOutputMinFrameDuration;
        private java.lang.String getHighSpeedVideoSizesFor;

        public static com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus valueOf(java.lang.String str) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 125) % 128;
            com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus = (com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus) java.lang.Enum.valueOf(com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus.class, str);
            int i = getHighSpeedVideoFpsRangesFor + 101;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                return lockStatus;
            }
            throw new java.lang.ArithmeticException();
        }

        public static com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus[] values() {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 7) % 128;
            com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus[] lockStatusArr = (com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus[]) getInputSizeshNQ4ISI.clone();
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 59) % 128;
            return lockStatusArr;
        }

        static {
            com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus[] lockStatusArr;
            getHighSpeedVideoSizes();
            int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(bitsPerPixel + 7, android.view.KeyEvent.getMaxKeyCode() >> 16, (char) (36404 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), objArr);
            com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus = new com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus(((java.lang.String) objArr[0]).intern(), 0, util.h.xy.al.ma.f260);
            LOCKED = lockStatus;
            int indexOf = android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(indexOf + 9, 6 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 22372), objArr2);
            com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus2 = new com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus(((java.lang.String) objArr2[0]).intern(), 1, util.h.xy.al.ma.f208);
            UNLOCKED = lockStatus2;
            int i = getHighSpeedVideoFpsRangesFor + 11;
            int i2 = i % 128;
            getHighSpeedVideoSizes = i2;
            if (i % 2 != 0) {
                lockStatusArr = new com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus[5];
                lockStatusArr[1] = lockStatus;
                lockStatusArr[0] = lockStatus2;
            } else {
                lockStatusArr = new com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus[]{lockStatus, lockStatus2};
            }
            getInputSizeshNQ4ISI = lockStatusArr;
            getHighSpeedVideoFpsRangesFor = (i2 + 91) % 128;
        }

        private LockStatus(java.lang.String str, int i, java.lang.String str2) {
            this.getHighSpeedVideoSizesFor = str2;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            int i = getHighSpeedVideoSizes + 9;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                return this.getHighSpeedVideoSizesFor;
            }
            throw null;
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
            int i3;
            util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
            long[] jArr = new long[i];
            rbVar.f2651 = 0;
            while (rbVar.f2651 < i) {
                jArr[rbVar.f2651] = (((char) (getHighResolutionOutputSizeshNQ4ISI[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputMinFrameDuration))) ^ c;
                rbVar.f2651++;
            }
            char[] cArr = new char[i];
            rbVar.f2651 = 0;
            int i4 = Camera2StreamConfigurationMap + 59;
            getHighSpeedVideoFpsRanges = i4 % 128;
            int i5 = i4 % 2;
            while (rbVar.f2651 < i) {
                int i6 = getHighSpeedVideoFpsRanges + 61;
                Camera2StreamConfigurationMap = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                    i3 = rbVar.f2651;
                } else {
                    cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                    i3 = rbVar.f2651 + 1;
                }
                rbVar.f2651 = i3;
            }
            objArr[0] = new java.lang.String(cArr);
        }

        static void getHighSpeedVideoSizes() {
            getHighResolutionOutputSizeshNQ4ISI = new char[]{4728, 61189, 59531, 59909, 59273, 57606, 52160, 13989, 12581, 13216, 15918, 14504, 15140, 9635};
            getOutputMinFrameDuration = 7554828326989947263L;
        }
    }
}
