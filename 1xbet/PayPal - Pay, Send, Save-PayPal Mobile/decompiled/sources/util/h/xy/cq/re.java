package util.h.xy.cq;

/* loaded from: classes5.dex */
class re extends java.io.InputStream {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private boolean Camera2StreamConfigurationMap = false;
    private java.io.ByteArrayInputStream getHighResolutionOutputSizeshNQ4ISI;
    private final java.io.InputStream getHighSpeedVideoSizes;
    private byte[] getInputSizeshNQ4ISI;
    private final util.h.xy.cq.me getOutputFormats;

    static {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 15) + ((i & 15) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public re(java.io.InputStream inputStream, util.h.xy.cq.me meVar, byte[] bArr) {
        this.getHighSpeedVideoSizes = inputStream;
        this.getOutputFormats = meVar;
        if (bArr != null) {
            this.getInputSizeshNQ4ISI = java.util.Arrays.copyOf(bArr, bArr.length);
        }
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        int identityHashCode = java.lang.System.identityHashCode(this);
        int i = ~identityHashCode;
        int i2 = ~((i & (-2134363820)) | (i ^ (-2134363820)));
        int i3 = ((i2 ^ 822151208) | (i2 & 822151208)) * 98;
        int i4 = ~((i ^ (-1324808084)) | (i & (-1324808084)));
        int i5 = (i4 ^ (-2134363820)) | (i4 & (-2134363820));
        int i6 = ~((1324808083 ^ identityHashCode) | (identityHashCode & 1324808083));
        int i7 = (((i3 & 941034475) + (i3 | 941034475)) - (~(((i5 ^ i6) | (i5 & i6)) * (-49)))) - 1;
        int i8 = ~((identityHashCode ^ (-2134363820)) | (identityHashCode & (-2134363820)));
        int i9 = ((i8 ^ (-2146959292)) | (i8 & (-2146959292))) * 49;
        int i10 = ~java.lang.System.identityHashCode(this);
        int i11 = (i10 & (-674206942)) | (i10 ^ (-674206942));
        int i12 = (~((i11 ^ (-2037895947)) | (i11 & (-2037895947)))) * (-783);
        int i13 = (i12 ^ (-1740630828)) + ((i12 & (-1740630828)) << 1);
        int i14 = ((~((i10 ^ (-2037895947)) | (i10 & (-2037895947)))) | (-674206942)) * 783;
        if ((i7 & i9) + (i9 | i7) > ((i13 | i14) << 1) - (i14 ^ i13)) {
            getHighResolutionOutputSizeshNQ4ISI();
            return this.getHighResolutionOutputSizeshNQ4ISI.read();
        }
        getHighResolutionOutputSizeshNQ4ISI();
        this.getHighResolutionOutputSizeshNQ4ISI.read();
        throw null;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (((i | 85) << 1) - (i ^ 85)) % 128;
        getHighResolutionOutputSizeshNQ4ISI();
        int read = this.getHighResolutionOutputSizeshNQ4ISI.read(bArr);
        int i2 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i2 & 5) + (i2 | 5)) % 128;
        return read;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        int i = (getHighSpeedVideoFpsRangesFor + 101) % 128;
        getHighSpeedVideoFpsRanges = i;
        java.io.ByteArrayInputStream byteArrayInputStream = this.getHighResolutionOutputSizeshNQ4ISI;
        if (byteArrayInputStream != null) {
            getHighSpeedVideoFpsRangesFor = ((i & 5) + (i | 5)) % 128;
            byteArrayInputStream.close();
            int i2 = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (((i2 | 85) << 1) - (i2 ^ 85)) % 128;
        }
        int i3 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i3 ^ com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) + ((i3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) << 1)) % 128;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 75) % 128;
        getHighResolutionOutputSizeshNQ4ISI();
        int read = this.getHighResolutionOutputSizeshNQ4ISI.read(bArr, i, i2);
        int i3 = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i3 ^ 101) + ((i3 & 101) << 1)) % 128;
        return read;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i ^ 101) + ((i & 101) << 1)) % 128;
        boolean markSupported = this.getHighResolutionOutputSizeshNQ4ISI.markSupported();
        int i2 = getHighSpeedVideoFpsRanges;
        int i3 = (i2 ^ 57) + ((i2 & 57) << 1);
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            return markSupported;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = (i2 ^ 33) + ((i2 & 33) << 1);
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 != 0) {
            this.getHighResolutionOutputSizeshNQ4ISI.mark(i);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.mark(i);
            throw null;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI() throws java.io.IOException {
        java.lang.Throwable th;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        synchronized (this) {
            int i = getHighSpeedVideoFpsRanges + 69;
            int i2 = i % 128;
            getHighSpeedVideoFpsRangesFor = i2;
            if (i % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            if (this.getInputSizeshNQ4ISI == null) {
                throw new java.io.IOException(util.h.xy.al.ra.f549);
            }
            if (!this.Camera2StreamConfigurationMap) {
                int i3 = (i2 & 27) + (i2 | 27);
                getHighSpeedVideoFpsRanges = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                try {
                    if (this.getHighSpeedVideoSizes != null) {
                        try {
                            byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        } catch (util.h.xy.cm.ma e) {
                            e = e;
                        } catch (util.h.xy.ct.mc e2) {
                            e = e2;
                        }
                        try {
                            byte[] bArr = new byte[16384];
                            int read = this.getHighSpeedVideoSizes.read(bArr, 0, 16384);
                            while (read != -1) {
                                int i4 = getHighSpeedVideoFpsRanges;
                                getHighSpeedVideoFpsRangesFor = ((i4 ^ 33) + ((i4 & 33) << 1)) % 128;
                                byteArrayOutputStream.write(bArr, 0, read);
                                read = this.getHighSpeedVideoSizes.read(bArr, 0, 16384);
                            }
                            byteArrayOutputStream.flush();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            if (!getHighSpeedVideoFpsRangesFor(byteArray)) {
                                throw new java.io.IOException(util.h.xy.al.ra.f552);
                            }
                            this.getHighResolutionOutputSizeshNQ4ISI = new java.io.ByteArrayInputStream(byteArray);
                            getHighSpeedVideoFpsRanges(byteArrayOutputStream);
                            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
                            int i5 = getHighSpeedVideoFpsRanges;
                            int i6 = ((i5 | 33) << 1) - (i5 ^ 33);
                            int i7 = i6 % 128;
                            getHighSpeedVideoFpsRangesFor = i7;
                            if (i6 % 2 != 0) {
                                int i8 = 3 / 2;
                            }
                            this.Camera2StreamConfigurationMap = true;
                            getHighSpeedVideoFpsRanges = (i7 + 85) % 128;
                        } catch (util.h.xy.cm.ma e3) {
                            e = e3;
                            throw new java.io.IOException(e);
                        } catch (util.h.xy.ct.mc e4) {
                            e = e4;
                            throw new java.io.IOException(e);
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            getHighSpeedVideoFpsRanges(byteArrayOutputStream);
                            getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    byteArrayOutputStream = null;
                }
            }
            int i9 = getHighSpeedVideoFpsRangesFor + 117;
            getHighSpeedVideoFpsRanges = i9 % 128;
            if (i9 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
    }

    private static void getHighSpeedVideoFpsRanges(java.io.OutputStream outputStream) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = ((i | 1) << 1) - (i ^ 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (outputStream != null) {
            getHighSpeedVideoFpsRanges = ((i ^ 91) + ((i & 91) << 1)) % 128;
            try {
                outputStream.close();
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 55) % 128;
            } catch (java.io.IOException unused) {
            }
        }
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = (i3 & 65) + (i3 | 65);
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(java.io.InputStream inputStream) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (i + 79) % 128;
        if (inputStream != null) {
            int i2 = i + 115;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    inputStream.close();
                } else {
                    inputStream.close();
                    throw new java.lang.NullPointerException();
                }
            } catch (java.io.IOException unused) {
            }
        }
        int i3 = getHighSpeedVideoFpsRangesFor;
        int i4 = ((i3 | 33) << 1) - (i3 ^ 33);
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    private boolean getHighSpeedVideoFpsRangesFor(byte[] bArr) throws util.h.xy.ct.mc, java.io.UnsupportedEncodingException, util.h.xy.cm.ma {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 27) % 128;
        byte[] bArr5 = null;
        try {
            byte[] m25933 = util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1107);
            byte[] m259332 = util.h.xy.ci.ra.m25931().m25933(util.h.xy.ci.mb.f1104);
            byte[] bArr6 = util.h.xy.ct.rc.m26047().mo26035(m25933, this.getOutputFormats.m26006(), util.h.xy.ct.ma.b.f1124.m26043()).get(util.h.xy.ct.ma.b.f1124);
            try {
                bArr3 = util.h.xy.cv.ra.m26072(m259332, util.h.xy.al.ra.f683.getBytes(util.h.xy.al.ra.f459), util.h.xy.cv.ma.m26064(bArr6).getBytes(util.h.xy.al.ra.f846));
                try {
                    bArr4 = java.lang.String.valueOf(this.getOutputFormats.m26016()).getBytes(util.h.xy.al.ra.f459);
                    try {
                        bArr5 = util.h.xy.cv.ra.m26072(bArr4, bArr);
                        boolean m25966 = util.h.xy.cm.mb.m25966(bArr3, bArr5, this.getInputSizeshNQ4ISI);
                        util.h.xy.cv.ra.m26068(bArr6, bArr3, bArr5, bArr4);
                        int i = getHighSpeedVideoFpsRanges;
                        getHighSpeedVideoFpsRangesFor = ((i & 83) + (i | 83)) % 128;
                        return m25966;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        bArr2 = bArr5;
                        bArr5 = bArr6;
                        util.h.xy.cv.ra.m26068(bArr5, bArr3, bArr2, bArr4);
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    bArr4 = null;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                bArr3 = null;
                bArr4 = null;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr2 = null;
            bArr3 = null;
            bArr4 = null;
        }
    }
}
