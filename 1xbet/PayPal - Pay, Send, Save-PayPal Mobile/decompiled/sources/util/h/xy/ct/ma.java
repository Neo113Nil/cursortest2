package util.h.xy.ct;

/* loaded from: classes5.dex */
public interface ma {
    /* renamed from: ˊ */
    void mo26032(byte[] bArr, byte[] bArr2, java.util.Map<util.h.xy.ct.ma.b, byte[]> map) throws util.h.xy.ct.mc;

    /* renamed from: ˋ */
    void mo26033(byte[] bArr) throws util.h.xy.ct.mc;

    /* renamed from: ˋ */
    boolean mo26034(java.lang.String str) throws util.h.xy.ct.mc;

    /* renamed from: ˏ */
    java.util.Map<util.h.xy.ct.ma.b, byte[]> mo26035(byte[] bArr, byte[] bArr2, int i) throws util.h.xy.ct.mc;

    /* renamed from: ˏ */
    void mo26036() throws util.h.xy.ct.mc;

    /* renamed from: ᐝ */
    void mo26037(byte[] bArr) throws util.h.xy.ct.mc;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {
        private static char Camera2StreamConfigurationMap = 0;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static int getHighSpeedVideoSizes = 1;
        private static char[] getInputSizeshNQ4ISI;
        private static final /* synthetic */ util.h.xy.ct.ma.b[] getOutputMinFrameDuration;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.ct.ma.b f1123;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.ct.ma.b f1124;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final util.h.xy.ct.ma.b f1125;

        /* renamed from: ˏ, reason: contains not printable characters */
        public static final util.h.xy.ct.ma.b f1126;
        private final int getOutputFormats;

        public static util.h.xy.ct.ma.b valueOf(java.lang.String str) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 25) % 128;
            util.h.xy.ct.ma.b bVar = (util.h.xy.ct.ma.b) java.lang.Enum.valueOf(util.h.xy.ct.ma.b.class, str);
            int i = getHighSpeedVideoFpsRangesFor + 27;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                return bVar;
            }
            throw null;
        }

        public static util.h.xy.ct.ma.b[] values() {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 29) % 128;
            util.h.xy.ct.ma.b[] bVarArr = (util.h.xy.ct.ma.b[]) getOutputMinFrameDuration.clone();
            int i = getHighSpeedVideoFpsRangesFor + 33;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                return bVarArr;
            }
            throw null;
        }

        static {
            getHighSpeedVideoFpsRanges();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (125 - android.graphics.Color.green(0)), "\u0001\u0007\n\u000f\b\f\b\u0006\u0006\u0001\u0003\u000e\n\u0005\f\u000b\u0003\f\t\u0002\f\u000f", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 23, objArr);
                util.h.xy.ct.ma.b bVar = new util.h.xy.ct.ma.b(((java.lang.String) objArr[0]).intern(), 0, 256);
                f1123 = bVar;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 4), "\u0001\t\n\u000f\b\f\u000f\u000e\u000b\u0003㗗", 11 - android.view.View.resolveSizeAndState(0, 0, 0), objArr2);
                util.h.xy.ct.ma.b bVar2 = new util.h.xy.ct.ma.b(((java.lang.String) objArr2[0]).intern(), 1, 1);
                f1126 = bVar2;
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (android.view.View.getDefaultSize(0, 0) + 3), "\u0001\t\n\u000f\b\f\u000f\u000e\u000b\u0003\n\t\u0003\f\t\u0002\f\u000f", android.view.Gravity.getAbsoluteGravity(0, 0) + 18, objArr3);
                util.h.xy.ct.ma.b bVar3 = new util.h.xy.ct.ma.b(((java.lang.String) objArr3[0]).intern(), 2, 16);
                f1124 = bVar3;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((byte) (20 - android.text.TextUtils.indexOf("", "", 0)), "\u0002\u0001㗥", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 3, objArr4);
                util.h.xy.ct.ma.b bVar4 = new util.h.xy.ct.ma.b(((java.lang.String) objArr4[0]).intern(), 3, 4096);
                f1125 = bVar4;
                int i = getHighSpeedVideoFpsRangesFor;
                getHighResolutionOutputSizeshNQ4ISI = (i + 21) % 128;
                util.h.xy.ct.ma.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
                int i2 = i + 57;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    getOutputMinFrameDuration = bVarArr;
                    return;
                }
                throw null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private b(java.lang.String str, int i, int i2) {
            this.getOutputFormats = i2;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final int m26043() {
            int i = getHighResolutionOutputSizeshNQ4ISI + 71;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                return this.getOutputFormats;
            }
            throw null;
        }

        private static void getHighSpeedVideoFpsRanges(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
            int i2;
            int length;
            char[] cArr;
            int i3;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 41) % 128;
            char[] charArray = str.toCharArray();
            util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
            char[] cArr2 = getInputSizeshNQ4ISI;
            if (cArr2 != null) {
                int i4 = getHighSpeedVideoFpsRanges + 39;
                getHighSpeedVideoSizes = i4 % 128;
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
                    getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 51) % 128;
                    cArr[i3] = (char) (cArr2[i3] ^ 4042185467053315654L);
                    i3++;
                }
                cArr2 = cArr;
            }
            char c = (char) (4042185467053315654L ^ Camera2StreamConfigurationMap);
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i5 = getHighSpeedVideoSizes + 27;
                getHighSpeedVideoFpsRanges = i5 % 128;
                if (i5 % 2 != 0) {
                    mcVar.f2638 = 1;
                } else {
                    mcVar.f2638 = 0;
                }
                getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 69) % 128;
                while (mcVar.f2638 < i2) {
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
                            mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                            mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                            int i6 = mcVar.f2639;
                            int i7 = mcVar.f2640;
                            int i8 = mcVar.f2637;
                            int i9 = mcVar.f2635;
                            cArr3[mcVar.f2638] = cArr2[(i6 * c) + i7];
                            cArr3[mcVar.f2638 + 1] = cArr2[(i8 * c) + i9];
                        } else if (mcVar.f2639 == mcVar.f2637) {
                            mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                            mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                            int i10 = mcVar.f2639;
                            int i11 = mcVar.f2640;
                            int i12 = mcVar.f2637;
                            int i13 = mcVar.f2635;
                            cArr3[mcVar.f2638] = cArr2[(i10 * c) + i11];
                            cArr3[mcVar.f2638 + 1] = cArr2[(i12 * c) + i13];
                        } else {
                            int i14 = mcVar.f2639;
                            int i15 = mcVar.f2635;
                            int i16 = mcVar.f2637;
                            int i17 = mcVar.f2640;
                            cArr3[mcVar.f2638] = cArr2[(i14 * c) + i15];
                            cArr3[mcVar.f2638 + 1] = cArr2[(i16 * c) + i17];
                        }
                    }
                    mcVar.f2638 += 2;
                }
            }
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 53) % 128;
            for (int i18 = 0; i18 < i; i18++) {
                cArr3[i18] = (char) (cArr3[i18] ^ 13722);
            }
            java.lang.String str2 = new java.lang.String(cArr3);
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 9) % 128;
            objArr[0] = str2;
        }

        static void getHighSpeedVideoFpsRanges() {
            getInputSizeshNQ4ISI = new char[]{41871, 41870, 41872, 41880, 41876, 41885, 41883, 41879, 41859, 41874, 41887, 41865, 41868, 41875, 41864, 41881};
            Camera2StreamConfigurationMap = (char) 38466;
        }
    }
}
