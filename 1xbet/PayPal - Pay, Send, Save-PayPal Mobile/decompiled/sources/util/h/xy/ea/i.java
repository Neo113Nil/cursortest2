package util.h.xy.ea;

/* loaded from: classes18.dex */
public abstract class i implements util.h.xy.ea.j {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges;
    private static char[] getHighSpeedVideoFpsRangesFor = {42284, 42475, 42479, 42372, 42378, 42372, 42368, 42376, 42386, 42373, 42372, 42480, 42437, 42393, 42375, 42382, 42477, 42472, 42369, 42377, 42378, 42369, 42372, 42377, 42481, 42483, 42376, 42379, 42378, 42374, 42382, 42377};
    private static int getHighSpeedVideoSizes;
    private byte[] getOutputFormats;
    private util.h.xy.dj.rc getOutputMinFrameDuration;

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final util.h.xy.ew.a f1906;

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
    
        if (r4[r9.f2631] == 1) goto L38;
     */
    @Override // util.h.xy.ea.j
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final util.h.xy.dj.h mo26483(util.h.xy.ew.rc rcVar) throws util.h.xy.ea.d {
        int i;
        int i2;
        int i3;
        int i4 = getHighSpeedVideoFpsRanges + 119;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                this.f1906.mo26721(rcVar);
                throw null;
            }
            byte[] bArr = this.f1906.mo26721(rcVar);
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 117) % 128;
            return new util.h.xy.dj.h(new util.h.xy.dj.rd(this.getOutputMinFrameDuration != null ? new util.h.xy.dj.g(this.getOutputMinFrameDuration) : new util.h.xy.dj.g((util.h.xy.dh.rh) new util.h.xy.dh.mz(this.getOutputFormats)), this.f1906.m26723(), new util.h.xy.dh.mz(bArr)));
        } catch (util.h.xy.ew.c e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int[] iArr = {0, 32, 107, 11};
            java.lang.Object[] objArr = new java.lang.Object[1];
            int i5 = getHighSpeedVideoSizes + 71;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            byte[] bytes = "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001".getBytes("ISO-8859-1");
            util.h.xz.b.ma maVar = new util.h.xz.b.ma();
            int i6 = iArr[0];
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[3];
            char[] cArr = getHighSpeedVideoFpsRangesFor;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i10 = 0;
                while (i10 < length) {
                    cArr2[i10] = (char) (cArr[i10] ^ (-8125198844289309347L));
                    i10++;
                    cArr = cArr;
                    length = length;
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i7];
            java.lang.System.arraycopy(cArr, i6, cArr3, 0, i7);
            if (bytes != null) {
                char[] cArr4 = new char[i7];
                maVar.f2631 = 0;
                char c = 0;
                while (maVar.f2631 < i7) {
                    int i11 = getHighSpeedVideoSizes + 121;
                    Camera2StreamConfigurationMap = i11 % 128;
                    if (i11 % 2 == 0) {
                        if (bytes[maVar.f2631] == 0) {
                            i3 = 1;
                            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 45) % 128;
                            cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + i3) - c);
                        }
                        cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                    } else {
                        i3 = 1;
                    }
                    c = cArr4[maVar.f2631];
                    maVar.f2631++;
                }
                i = 1;
                cArr3 = cArr4;
            } else {
                i = 1;
            }
            if (i9 > 0) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + i) % 128;
                char[] cArr5 = new char[i7];
                i2 = 0;
                java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i7);
                int i12 = i7 - i9;
                java.lang.System.arraycopy(cArr5, 0, cArr3, i12, i9);
                java.lang.System.arraycopy(cArr5, i9, cArr3, 0, i12);
            } else {
                i2 = 0;
            }
            char[] cArr6 = new char[i7];
            while (true) {
                maVar.f2631 = i2;
                if (maVar.f2631 >= i7) {
                    break;
                }
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 49) % 128;
                cArr6[maVar.f2631] = cArr3[(i7 - maVar.f2631) - 1];
                i2 = maVar.f2631 + 1;
            }
            if (i8 > 0) {
                getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 97) % 128;
                int i13 = 0;
                while (true) {
                    maVar.f2631 = i13;
                    if (maVar.f2631 >= i7) {
                        break;
                    }
                    cArr6[maVar.f2631] = (char) (cArr6[maVar.f2631] - iArr[2]);
                    i13 = maVar.f2631 + 1;
                }
            }
            objArr[0] = new java.lang.String(cArr6);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.ea.d(sb.toString(), e);
        }
    }

    public i(byte[] bArr, util.h.xy.ew.a aVar) {
        this.getOutputFormats = bArr;
        this.f1906 = aVar;
    }
}
