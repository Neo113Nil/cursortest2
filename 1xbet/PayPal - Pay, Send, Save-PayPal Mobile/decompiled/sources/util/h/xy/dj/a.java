package util.h.xy.dj;

/* loaded from: classes18.dex */
public final class a extends util.h.xy.dh.mh {
    private static int Camera2StreamConfigurationMap = 0;
    private static short[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getInputFormats = -408873020;
    private static int getInputSizeshNQ4ISI = -759344334;
    private static int getOutputFormats = 1621463591;
    private static byte[] getOutputMinFrameDuration = {7, 2, com.visa.cbp.getEncExpo.IResultReceiver, 82, 87, -60, 107, 6, 114, 57, 117, 125, com.google.common.base.Ascii.ESC, 124, -51, 0, 58, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SI, 6, 2, 108, 111, -40};
    private util.h.xy.dh.rh getHighSpeedVideoSizesFor;
    private util.h.xy.dh.i getOutputMinFrameDurationlomOqCM;
    private util.h.xy.ed.a getOutputSizeshNQ4ISI;

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        util.h.xy.dh.d dVar = new util.h.xy.dh.d(3);
        dVar.m26290(this.getOutputMinFrameDurationlomOqCM);
        dVar.m26290(this.getOutputSizeshNQ4ISI);
        if (this.getHighSpeedVideoSizesFor != null) {
            dVar.m26290(new util.h.xy.dh.mu(false, 0, this.getHighSpeedVideoSizesFor));
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 39) % 128;
        }
        return new util.h.xy.dh.rs(dVar);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.dh.rh m26356() {
        int i = Camera2StreamConfigurationMap + 35;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.dh.rh rhVar = this.getHighSpeedVideoSizesFor;
        Camera2StreamConfigurationMap = (i2 + 49) % 128;
        return rhVar;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.ed.a m26355() {
        int i = getHighSpeedVideoSizes + 65;
        Camera2StreamConfigurationMap = i % 128;
        util.h.xy.ed.a aVar = this.getOutputSizeshNQ4ISI;
        if (i % 2 == 0) {
            return aVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.dh.i m26354() {
        int i = (Camera2StreamConfigurationMap + 81) % 128;
        getHighSpeedVideoSizes = i;
        util.h.xy.dh.i iVar = this.getOutputMinFrameDurationlomOqCM;
        Camera2StreamConfigurationMap = (i + 53) % 128;
        return iVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dj.a m26353(java.lang.Object obj) {
        int i = Camera2StreamConfigurationMap;
        int i2 = i + 67;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!(obj instanceof util.h.xy.dj.a)) {
            if (obj != null) {
                return new util.h.xy.dj.a(util.h.xy.dh.l.m26303(obj));
            }
            return null;
        }
        int i3 = i + 53;
        getHighSpeedVideoSizes = i3 % 128;
        util.h.xy.dj.a aVar = (util.h.xy.dj.a) obj;
        if (i3 % 2 != 0) {
            return aVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ff, code lost:
    
        if (r12 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x010e, code lost:
    
        util.h.xy.dj.a.getHighSpeedVideoFpsRangesFor = (r0 + 109) % 128;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010c, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
    
        if (r12 != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private a(util.h.xy.dh.l lVar) {
        boolean z;
        int i;
        int i2;
        char c;
        int i3;
        if (lVar.mo26286() >= 2) {
            this.getOutputMinFrameDurationlomOqCM = (util.h.xy.dh.i) lVar.mo26287(0);
            this.getOutputSizeshNQ4ISI = util.h.xy.ed.a.m26491(lVar.mo26287(1));
            if (lVar.mo26286() > 2) {
                this.getHighSpeedVideoSizesFor = util.h.xy.dh.rh.m26336((util.h.xy.dh.mm) lVar.mo26287(2), false);
                return;
            }
            return;
        }
        int fadingEdgeLength = android.view.ViewConfiguration.getFadingEdgeLength();
        short doubleTapTimeout = (short) ((-69) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16));
        byte resolveSize = (byte) (108 - android.view.View.resolveSize(0, 0));
        java.lang.Object[] objArr = new java.lang.Object[1];
        int i4 = (-891045098) - (fadingEdgeLength >> 16);
        int offsetBefore = (-4) - android.text.TextUtils.getOffsetBefore("", 0);
        int i5 = (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2029746772;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = offsetBefore + ((int) (getInputFormats ^ (-2689713159175858216L)));
        if (i6 == -1) {
            z = true;
        } else {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 55) % 128;
            z = false;
        }
        if (z) {
            int i7 = getHighSpeedVideoFpsRangesFor;
            int i8 = i7 + 109;
            getHighSpeedVideoFpsRanges = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
            byte[] bArr = getOutputMinFrameDuration;
            if (bArr != null) {
                getHighSpeedVideoFpsRanges = (i7 + 31) % 128;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                int i9 = 0;
                while (i9 < length) {
                    bArr2[i9] = (byte) (bArr[i9] ^ (-2689713159175858216L));
                    i9++;
                    length = length;
                }
                bArr = bArr2;
            }
            i6 = bArr != null ? (byte) (((byte) (getOutputMinFrameDuration[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i4] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L)))) : (short) (((short) (getHighResolutionOutputSizeshNQ4ISI[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i4] ^ (-2689713159175858216L))) + ((int) (getInputFormats ^ (-2689713159175858216L))));
        }
        if (i6 > 0) {
            int i10 = getHighSpeedVideoFpsRanges;
            int i11 = i10 + 9;
            getHighSpeedVideoFpsRangesFor = i11 % 128;
            if (i11 % 2 != 0) {
                i = ((i4 % i6) << 2) * ((int) (getInputSizeshNQ4ISI % (-2689713159175858216L)));
            } else {
                i = ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + ((i4 + i6) - 2);
            }
            meVar.f2647 = i + i2;
            meVar.f2644 = (char) (i5 + ((int) (getOutputFormats ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputMinFrameDuration;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i12 = 0; i12 < length2; i12++) {
                    bArr4[i12] = (byte) (bArr3[i12] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            int i13 = 1;
            while (true) {
                meVar.f2645 = i13;
                if (meVar.f2645 >= i6) {
                    break;
                }
                if (z2) {
                    byte[] bArr5 = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    byte b = (byte) (bArr5[r4] ^ (-2689713159175858216L));
                    c = meVar.f2646;
                    i3 = (byte) (b + doubleTapTimeout);
                } else {
                    short[] sArr = getHighResolutionOutputSizeshNQ4ISI;
                    meVar.f2647 = meVar.f2647 - 1;
                    short s = (short) (sArr[r4] ^ (-2689713159175858216L));
                    c = meVar.f2646;
                    i3 = (short) (s + doubleTapTimeout);
                }
                meVar.f2644 = (char) (c + (i3 ^ resolveSize));
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                i13 = meVar.f2645 + 1;
            }
        }
        java.lang.String obj = sb.toString();
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 93) % 128;
        objArr[0] = obj;
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
    }

    public a(util.h.xy.dh.i iVar, util.h.xy.ed.a aVar, util.h.xy.dh.rh rhVar) {
        this.getOutputMinFrameDurationlomOqCM = iVar;
        this.getOutputSizeshNQ4ISI = aVar;
        this.getHighSpeedVideoSizesFor = rhVar;
    }
}
