package util.h.xy.g;

/* loaded from: classes5.dex */
public final class ra {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizes = 1;
    private util.h.xy.g.ra.EnumC0269ra Camera2StreamConfigurationMap;
    private byte[] getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private java.lang.String getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ᐝ' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: util.h.xy.g.ra$ra, reason: collision with other inner class name */
    public static final class EnumC0269ra {
        private static int Camera2StreamConfigurationMap = 0;
        private static char[] getHighResolutionOutputSizeshNQ4ISI = null;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static final /* synthetic */ util.h.xy.g.ra.EnumC0269ra[] getHighSpeedVideoFpsRangesFor;
        private static int getHighSpeedVideoSizes = 1;
        private static int getOutputMinFrameDuration;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.g.ra.EnumC0269ra f2218;

        /* renamed from: ˎ, reason: contains not printable characters */
        public static final util.h.xy.g.ra.EnumC0269ra f2219;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.g.ra.EnumC0269ra f2220;
        private java.lang.String getInputFormats;

        public static util.h.xy.g.ra.EnumC0269ra valueOf(java.lang.String str) {
            int i = getHighSpeedVideoFpsRanges + 13;
            getOutputMinFrameDuration = i % 128;
            util.h.xy.g.ra.EnumC0269ra enumC0269ra = (util.h.xy.g.ra.EnumC0269ra) java.lang.Enum.valueOf(util.h.xy.g.ra.EnumC0269ra.class, str);
            if (i % 2 == 0) {
                return enumC0269ra;
            }
            throw null;
        }

        public static util.h.xy.g.ra.EnumC0269ra[] values() {
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 89) % 128;
            util.h.xy.g.ra.EnumC0269ra[] enumC0269raArr = (util.h.xy.g.ra.EnumC0269ra[]) getHighSpeedVideoFpsRangesFor.clone();
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 21) % 128;
            return enumC0269raArr;
        }

        static {
            getHighSpeedVideoFpsRangesFor();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{0, 7, 93, 0}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000", objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{0, 7, 93, 0}, "\u0000\u0001\u0001\u0000\u0000\u0001\u0000", objArr2);
            util.h.xy.g.ra.EnumC0269ra enumC0269ra = new util.h.xy.g.ra.EnumC0269ra(intern, 0, ((java.lang.String) objArr2[0]).intern());
            f2220 = enumC0269ra;
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{7, 9, 161, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", objArr3);
            java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{7, 9, 161, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", objArr4);
            util.h.xy.g.ra.EnumC0269ra enumC0269ra2 = new util.h.xy.g.ra.EnumC0269ra(intern2, 1, ((java.lang.String) objArr4[0]).intern());
            f2219 = enumC0269ra2;
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{16, 10, 87, 7}, null, objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{16, 10, 87, 7}, null, objArr6);
            util.h.xy.g.ra.EnumC0269ra enumC0269ra3 = new util.h.xy.g.ra.EnumC0269ra(intern3, 2, ((java.lang.String) objArr6[0]).intern());
            f2218 = enumC0269ra3;
            int i = getOutputMinFrameDuration;
            getHighSpeedVideoFpsRanges = (i + 21) % 128;
            int i2 = (i + 121) % 128;
            getHighSpeedVideoFpsRanges = i2;
            getHighSpeedVideoFpsRangesFor = new util.h.xy.g.ra.EnumC0269ra[]{enumC0269ra, enumC0269ra2, enumC0269ra3};
            int i3 = i2 + 91;
            getOutputMinFrameDuration = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
        }

        private EnumC0269ra(java.lang.String str, int i, java.lang.String str2) {
            this.getInputFormats = str2;
        }

        @Override // java.lang.Enum
        public final java.lang.String toString() {
            int i = (getHighSpeedVideoFpsRanges + 21) % 128;
            getOutputMinFrameDuration = i;
            java.lang.String str = this.getInputFormats;
            int i2 = i + 51;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        private static void Camera2StreamConfigurationMap(int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
            int i;
            java.lang.String str2 = str;
            byte[] bArr = str2;
            if (str2 != null) {
                bArr = str2.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            util.h.xz.b.ma maVar = new util.h.xz.b.ma();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
            if (cArr != null) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 125) % 128;
                int length = cArr.length;
                char[] cArr2 = new char[length];
                for (int i6 = 0; i6 < length; i6++) {
                    cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
                }
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 19) % 128;
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr2 != null) {
                char[] cArr4 = new char[i3];
                maVar.f2631 = 0;
                char c = 0;
                while (maVar.f2631 < i3) {
                    int i7 = Camera2StreamConfigurationMap + 101;
                    getHighSpeedVideoSizes = i7 % 128;
                    if (i7 % 2 != 0 ? bArr2[maVar.f2631] != 1 : bArr2[maVar.f2631] != 1) {
                        cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                    } else {
                        cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                    }
                    c = cArr4[maVar.f2631];
                    maVar.f2631++;
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                int i8 = getHighSpeedVideoSizes + 27;
                Camera2StreamConfigurationMap = i8 % 128;
                if (i8 % 2 != 0) {
                    char[] cArr5 = new char[i3];
                    java.lang.System.arraycopy(cArr3, 0, cArr5, 1, i3);
                    int i9 = i3 - i5;
                    java.lang.System.arraycopy(cArr5, 1, cArr3, i9, i5);
                    java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i9);
                } else {
                    char[] cArr6 = new char[i3];
                    java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i3);
                    int i10 = i3 - i5;
                    java.lang.System.arraycopy(cArr6, 0, cArr3, i10, i5);
                    java.lang.System.arraycopy(cArr6, i5, cArr3, 0, i10);
                }
            }
            char[] cArr7 = new char[i3];
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr7[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 45) % 128;
            if (i4 > 0) {
                maVar.f2631 = 0;
                while (maVar.f2631 < i3) {
                    int i11 = Camera2StreamConfigurationMap + 115;
                    getHighSpeedVideoSizes = i11 % 128;
                    if (i11 % 2 == 0) {
                        cArr7[maVar.f2631] = (char) (cArr7[maVar.f2631] << iArr[5]);
                        i = maVar.f2631 >>> 1;
                    } else {
                        cArr7[maVar.f2631] = (char) (cArr7[maVar.f2631] - iArr[2]);
                        i = maVar.f2631 + 1;
                    }
                    maVar.f2631 = i;
                }
            }
            java.lang.String str3 = new java.lang.String(cArr7);
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 113) % 128;
            objArr[0] = str3;
        }

        static void getHighSpeedVideoFpsRangesFor() {
            getHighResolutionOutputSizeshNQ4ISI = new char[]{42246, 42479, 42491, 42489, 42485, 42487, 42483, 42286, 42416, 42422, 42421, 42412, 42417, 42416, 42412, 42426, 42491, 42493, 42486, 42493, 42438, 42438, 42437, 42494, 42437, 42488};
        }
    }

    protected ra(util.h.xy.g.ra.ma maVar) {
        this.Camera2StreamConfigurationMap = util.h.xy.g.ra.ma.getHighSpeedVideoFpsRangesFor(maVar);
        this.getHighSpeedVideoSizesFor = util.h.xy.g.ra.ma.getHighResolutionOutputSizeshNQ4ISI(maVar);
        this.getInputSizeshNQ4ISI = util.h.xy.g.ra.ma.Camera2StreamConfigurationMap(maVar);
        this.getOutputFormats = util.h.xy.g.ra.ma.getHighSpeedVideoSizesFor(maVar);
        this.getHighSpeedVideoFpsRangesFor = util.h.xy.g.ra.ma.getHighSpeedVideoFpsRanges(maVar);
        this.getInputFormats = util.h.xy.g.ra.ma.getHighSpeedVideoSizes(maVar);
        this.getHighSpeedVideoFpsRanges = util.h.xy.g.ra.ma.getOutputFormats(maVar);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.g.ra.ma m26873() {
        util.h.xy.g.ra.ma maVar = new util.h.xy.g.ra.ma();
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = ((i & 59) + (i | 59)) % 128;
        return maVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.g.ra.EnumC0269ra m26875() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 29;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return this.Camera2StreamConfigurationMap;
        }
        throw null;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.lang.String m26877() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (((i | 33) << 1) - (i ^ 33)) % 128;
        java.lang.String str = this.getHighSpeedVideoSizesFor;
        getHighSpeedVideoSizes = (i + 33) % 128;
        return str;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus m26879() {
        int i = (getHighSpeedVideoSizes + 99) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus = this.getInputSizeshNQ4ISI;
        int i2 = ((i | 17) << 1) - (i ^ 17);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return lockStatus;
        }
        throw null;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.lang.String m26876() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 125;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return this.getOutputFormats;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final java.lang.String m26880() {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 71;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = ((i ^ 113) + ((i & 113) << 1)) % 128;
        return str;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final java.lang.String m26874() {
        int i = (getHighSpeedVideoSizes + 25) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        java.lang.String str = this.getInputFormats;
        int i2 = i + 47;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final byte[] m26878() {
        int i = getHighSpeedVideoSizes;
        int i2 = (i ^ 101) + ((i & 101) << 1);
        int i3 = i2 % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = (i3 + 91) % 128;
        return bArr;
    }

    public static final class ma {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoSizes = 1;
        private com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus Camera2StreamConfigurationMap;
        private byte[] getHighSpeedVideoFpsRanges;
        private java.lang.String getHighSpeedVideoFpsRangesFor;
        private java.lang.String getInputFormats;
        private util.h.xy.g.ra.EnumC0269ra getInputSizeshNQ4ISI;
        private java.lang.String getOutputFormats;
        private java.lang.String getOutputMinFrameDuration;

        static /* synthetic */ com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus Camera2StreamConfigurationMap(util.h.xy.g.ra.ma maVar) {
            int i = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = (i + 117) % 128;
            com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus = maVar.Camera2StreamConfigurationMap;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 97) + (i | 97)) % 128;
            return lockStatus;
        }

        static /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI(util.h.xy.g.ra.ma maVar) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = ((i & 105) + (i | 105)) % 128;
            java.lang.String str = maVar.getInputFormats;
            int i2 = (i & 109) + (i | 109);
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        static /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges(util.h.xy.g.ra.ma maVar) {
            int i = getHighSpeedVideoSizes;
            int i2 = (i & 55) + (i | 55);
            int i3 = i2 % 128;
            getHighResolutionOutputSizeshNQ4ISI = i3;
            java.lang.String str = maVar.getHighSpeedVideoFpsRangesFor;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            getHighSpeedVideoSizes = ((i3 & 45) + (i3 | 45)) % 128;
            return str;
        }

        static /* synthetic */ util.h.xy.g.ra.EnumC0269ra getHighSpeedVideoFpsRangesFor(util.h.xy.g.ra.ma maVar) {
            int i = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = (i + 27) % 128;
            util.h.xy.g.ra.EnumC0269ra enumC0269ra = maVar.getInputSizeshNQ4ISI;
            int i2 = i + 93;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                return enumC0269ra;
            }
            throw new java.lang.ArithmeticException();
        }

        static /* synthetic */ java.lang.String getHighSpeedVideoSizes(util.h.xy.g.ra.ma maVar) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = (i ^ 73) + ((i & 73) << 1);
            getHighSpeedVideoSizes = i2 % 128;
            java.lang.String str = maVar.getOutputFormats;
            if (i2 % 2 != 0) {
                return str;
            }
            throw null;
        }

        static /* synthetic */ java.lang.String getHighSpeedVideoSizesFor(util.h.xy.g.ra.ma maVar) {
            int i = getHighSpeedVideoSizes;
            int i2 = ((i ^ 61) + ((i & 61) << 1)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i2;
            java.lang.String str = maVar.getOutputMinFrameDuration;
            getHighSpeedVideoSizes = (i2 + 111) % 128;
            return str;
        }

        static /* synthetic */ byte[] getOutputFormats(util.h.xy.g.ra.ma maVar) {
            int i = getHighSpeedVideoSizes;
            int i2 = ((i ^ 91) + ((i & 91) << 1)) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i2;
            byte[] bArr = maVar.getHighSpeedVideoFpsRanges;
            int i3 = ((i2 | 63) << 1) - (i2 ^ 63);
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                return bArr;
            }
            throw new java.lang.ArithmeticException();
        }

        protected ma() {
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final util.h.xy.g.ra.ma m26882(util.h.xy.g.ra.EnumC0269ra enumC0269ra) {
            int i = getHighSpeedVideoSizes;
            int i2 = ((i | 13) << 1) - (i ^ 13);
            int i3 = i2 % 128;
            getHighResolutionOutputSizeshNQ4ISI = i3;
            if (i2 % 2 == 0) {
                this.getInputSizeshNQ4ISI = enumC0269ra;
                int i4 = i3 + 67;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 != 0) {
                    return this;
                }
                throw new java.lang.ArithmeticException();
            }
            this.getInputSizeshNQ4ISI = enumC0269ra;
            throw new java.lang.ArithmeticException();
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final util.h.xy.g.ra.ma m26884(java.lang.String str) {
            int i = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = (i + 97) % 128;
            this.getInputFormats = str;
            getHighResolutionOutputSizeshNQ4ISI = (((i | 7) << 1) - (i ^ 7)) % 128;
            return this;
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public final util.h.xy.g.ra.ma m26883(com.gemalto.mfs.mwsdk.dcm.Aid.LockStatus lockStatus) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            int i2 = ((i ^ 73) + ((i & 73) << 1)) % 128;
            getHighSpeedVideoSizes = i2;
            this.Camera2StreamConfigurationMap = lockStatus;
            int i3 = (i2 & 33) + (i2 | 33);
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ˏ, reason: contains not printable characters */
        public final util.h.xy.g.ra.ma m26886(java.lang.String str) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = (((i | 47) << 1) - (i ^ 47)) % 128;
            this.getOutputMinFrameDuration = str;
            getHighSpeedVideoSizes = (((i | 67) << 1) - (i ^ 67)) % 128;
            return this;
        }

        /* renamed from: ˊ, reason: contains not printable characters */
        public final util.h.xy.g.ra.ma m26881(java.lang.String str) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = ((i ^ 15) + ((i & 15) << 1)) % 128;
            this.getHighSpeedVideoFpsRangesFor = str;
            getHighSpeedVideoSizes = (i + 125) % 128;
            return this;
        }

        /* renamed from: ᐝ, reason: contains not printable characters */
        public final util.h.xy.g.ra.ma m26887(java.lang.String str) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = (i + 55) % 128;
            this.getOutputFormats = str;
            int i2 = (i ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1);
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public final util.h.xy.g.ra.ma m26885(byte[] bArr) {
            int i = getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = (i + 103) % 128;
            this.getHighSpeedVideoFpsRanges = bArr;
            getHighResolutionOutputSizeshNQ4ISI = (i + 35) % 128;
            return this;
        }

        final util.h.xy.g.ra getHighSpeedVideoSizes() {
            util.h.xy.g.ra raVar = new util.h.xy.g.ra(this);
            int i = getHighResolutionOutputSizeshNQ4ISI + 9;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0) {
                return raVar;
            }
            throw null;
        }
    }
}
