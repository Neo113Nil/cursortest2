package util.h.xy.dh;

/* loaded from: classes5.dex */
final class ru extends java.io.InputStream {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char[] getHighSpeedVideoFpsRangesFor = {42317, 42352, 42251, 42286, 42291, 42248, 42254, 42303, 42293, 42261, 42271, 42292, 42284, 42287, 42295, 42270, 42263, 42281, 42294, 42268, 42363, 42260, 42295, 42294, 42288, 42286, 42286, 42286, 42291, 42296, 42268, 42271, 42297, 42292, 42295, 42293, 42295, 42299, 42266, 42253, 42289, 42289, 42294, 42292, 42266, 42271, 42297, 42289, 42294, 42297, 42295, 42281, 42291, 42345, 42291, 42286, 42286, 42286, 42288, 42294, 42295, 42270, 42268, 42303, 42298, 42266, 42265, 42297, 42294, 42288, 42271, 42261, 42293, 42303, 42297, 42299, 42294, 42295, 42294, 42291, 42288, 42287, 42257, 42263, 42291, 42299, 42271, 42267, 42299, 42295, 42286, 42263, 42266, 42292, 42289, 42286, 42289, 42297, 42271, 42268, 42258, 42438, 42443, 42443, 42437, 42432, 42433, 42284, 42284, 42447, 42445, 42444, 42451, 42440, 42281, 42289, 42446, 42447, 42446, 42433, 42438, 42438, 42443, 42440, 42440, 42451, 42276, 42250};
    private static int getHighSpeedVideoSizes;
    private util.h.xy.dh.mb getInputFormats;
    private java.io.InputStream getOutputFormats;
    private final util.h.xy.dh.rm getOutputMinFrameDuration;
    private boolean getHighSpeedVideoSizesFor = true;
    private int getOutputSizeshNQ4ISI = 0;
    private final boolean getInputSizeshNQ4ISI = false;

    private static void getHighSpeedVideoSizes(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int length;
        char[] cArr;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr2 = getHighSpeedVideoFpsRangesFor;
        if (cArr2 != null) {
            int i5 = getHighSpeedVideoFpsRanges + 53;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i6 = 0; i6 < length; i6++) {
                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
                cArr[i6] = (char) (cArr2[i6] ^ (-8125198844289309347L));
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i2];
        java.lang.System.arraycopy(cArr2, i, cArr3, 0, i2);
        if (bytes != null) {
            char[] cArr4 = new char[i2];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i2) {
                if (bytes[maVar.f2631] == 1) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 27) % 128;
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i7 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i7, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr3, 0, i7);
        }
        if (z) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr3[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 87) % 128;
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    private util.h.xy.dh.mb getHighSpeedVideoFpsRanges() throws java.io.IOException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 103) % 128;
        util.h.xy.dh.c m26346 = this.getOutputMinFrameDuration.m26346();
        if (m26346 != null) {
            if (!(m26346 instanceof util.h.xy.dh.mb)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(false, new int[]{100, 28, 42, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000", objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(m26346.getClass());
                throw new java.io.IOException(sb.toString());
            }
            if (this.getOutputSizeshNQ4ISI == 0) {
                util.h.xy.dh.mb mbVar = (util.h.xy.dh.mb) m26346;
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 17) % 128;
                return mbVar;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(false, new int[]{53, 47, 0, 25}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000", objArr2);
            throw new java.io.IOException(((java.lang.String) objArr2[0]).intern());
        }
        int i = Camera2StreamConfigurationMap + 85;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (!this.getInputSizeshNQ4ISI) {
            return null;
        }
        Camera2StreamConfigurationMap = (i2 + 49) % 128;
        if (this.getOutputSizeshNQ4ISI == 0) {
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoSizes(true, new int[]{0, 53, 0, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", objArr3);
        sb2.append(((java.lang.String) objArr3[0]).intern());
        sb2.append(this.getOutputSizeshNQ4ISI);
        throw new java.io.IOException(sb2.toString());
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.getOutputFormats == null) {
            int i = getHighSpeedVideoSizes + 41;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            if (!this.getHighSpeedVideoSizesFor) {
                return -1;
            }
            util.h.xy.dh.mb highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            this.getInputFormats = highSpeedVideoFpsRanges;
            if (highSpeedVideoFpsRanges == null) {
                int i2 = Camera2StreamConfigurationMap + 91;
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 == 0) {
                    return -1;
                }
                throw null;
            }
            this.getHighSpeedVideoSizesFor = false;
            this.getOutputFormats = highSpeedVideoFpsRanges.mo26282();
        }
        while (true) {
            int read = this.getOutputFormats.read();
            if (read >= 0) {
                return read;
            }
            this.getOutputSizeshNQ4ISI = this.getInputFormats.mo26281();
            util.h.xy.dh.mb highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges();
            this.getInputFormats = highSpeedVideoFpsRanges2;
            if (highSpeedVideoFpsRanges2 == null) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 7) % 128;
                this.getOutputFormats = null;
                return -1;
            }
            this.getOutputFormats = highSpeedVideoFpsRanges2.mo26282();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 15) % 128;
        int i3 = 0;
        if (this.getOutputFormats == null) {
            if (!this.getHighSpeedVideoSizesFor) {
                return -1;
            }
            util.h.xy.dh.mb highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            this.getInputFormats = highSpeedVideoFpsRanges;
            if (highSpeedVideoFpsRanges == null) {
                return -1;
            }
            this.getHighSpeedVideoSizesFor = false;
            this.getOutputFormats = highSpeedVideoFpsRanges.mo26282();
        }
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 15) % 128;
        while (true) {
            int read = this.getOutputFormats.read(bArr, i + i3, i2 - i3);
            if (read >= 0) {
                i3 += read;
                if (i3 == i2) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 33) % 128;
                    break;
                }
            } else {
                this.getOutputSizeshNQ4ISI = this.getInputFormats.mo26281();
                util.h.xy.dh.mb highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges();
                this.getInputFormats = highSpeedVideoFpsRanges2;
                if (highSpeedVideoFpsRanges2 == null) {
                    int i4 = Camera2StreamConfigurationMap;
                    getHighSpeedVideoSizes = (i4 + 25) % 128;
                    this.getOutputFormats = null;
                    if (i3 <= 0) {
                        return -1;
                    }
                    getHighSpeedVideoSizes = (i4 + 99) % 128;
                } else {
                    this.getOutputFormats = highSpeedVideoFpsRanges2.mo26282();
                }
            }
        }
        return i3;
    }

    final int getHighSpeedVideoFpsRangesFor() {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoSizes = (i + 111) % 128;
        int i2 = this.getOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 81) % 128;
        return i2;
    }

    ru(util.h.xy.dh.rm rmVar) {
        this.getOutputMinFrameDuration = rmVar;
    }
}
