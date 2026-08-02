package util.h.xy.et;

/* loaded from: classes5.dex */
public final class a extends util.h.xy.ef.b {
    private static int Camera2StreamConfigurationMap = 0;
    private static short[] getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = -408873054;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = -376684450;
    private static byte[] getOutputFormats = {113, 97, 44, -43, 33, -47, 33, -108, 116, 39, -35, -38, -35, -111, 99, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -43, 45, -53, 34, -38, 47, -106, 103, com.visa.cbp.getEncExpo.registerForActivityResult, 99, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -51, 33, -112, 116, -107, 97, -43, -58, 69, -38, -37, -33, 45, -117, 105, -40, 35, -116, 118, -43, 39, -40, 41, -53, -102, 116, 39, -35, 36, 39, -34, 113, 39, -34, 45, -36, 47, -33, -41, 38, -39, -100, 106, -35, -111, 99, 41, -41, 33, 36, -37, 38, -44, 45, -35, -111, 109, -48, 44, -37, -46, -102, 116, -39, -54, 45};
    private static int getOutputMinFrameDuration = 283156670;
    util.h.xy.et.ra getHighSpeedVideoFpsRanges;

    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int length;
        byte[] bArr;
        int i4;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L)));
        int i6 = i5 == -1 ? 1 : 0;
        if (i6 != 0) {
            byte[] bArr2 = getOutputFormats;
            if (bArr2 != null) {
                int i7 = Camera2StreamConfigurationMap + 89;
                getHighSpeedVideoFpsRangesFor = i7 % 128;
                if (i7 % 2 == 0) {
                    length = bArr2.length;
                    bArr = new byte[length];
                    i4 = 1;
                } else {
                    length = bArr2.length;
                    bArr = new byte[length];
                    i4 = 0;
                }
                while (i4 < length) {
                    int i8 = getHighSpeedVideoFpsRangesFor + 77;
                    Camera2StreamConfigurationMap = i8 % 128;
                    if (i8 % 2 != 0) {
                        bArr[i4] = (byte) (bArr2[i4] % (-2689713159175858216L));
                        i4 >>= 1;
                    } else {
                        bArr[i4] = (byte) (bArr2[i4] ^ (-2689713159175858216L));
                        i4++;
                    }
                }
                bArr2 = bArr;
            }
            if (bArr2 != null) {
                int i9 = Camera2StreamConfigurationMap + 125;
                getHighSpeedVideoFpsRangesFor = i9 % 128;
                i5 = (byte) (i9 % 2 == 0 ? ((byte) (getOutputFormats[i << ((int) (getInputSizeshNQ4ISI & (-2689713159175858216L)))] * (-2689713159175858216L))) << ((int) (getHighSpeedVideoSizes - 2689713159175858216L)) : ((byte) (getOutputFormats[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
            } else {
                i5 = (short) (((short) (getHighResolutionOutputSizeshNQ4ISI[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
            }
        }
        if (i5 > 0) {
            meVar.f2647 = ((i + i5) - 2) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i6;
            meVar.f2644 = (char) (i3 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputFormats;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    bArr4[i10] = (byte) (bArr3[i10] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 93) % 128;
                z = true;
            } else {
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                if (z) {
                    byte[] bArr5 = getOutputFormats;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighResolutionOutputSizeshNQ4ISI;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    @Override // util.h.xy.ef.b
    /* renamed from: ᐝ */
    public final int mo26539(byte[] bArr, int i) throws util.h.xy.ef.mc, java.lang.IllegalStateException, util.h.xy.ef.md {
        int i2;
        int mo26554 = this.f2145.mo26554();
        if (!this.f2144) {
            if (this.f2148 != mo26554) {
                m26540();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes((android.view.KeyEvent.getMaxKeyCode() >> 16) - 237852492, (short) (android.graphics.Color.rgb(0, 0, 0) + 16777216), (byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (-123) - android.text.TextUtils.indexOf("", "", 0, 0), (android.view.KeyEvent.getMaxKeyCode() >> 16) + 146688262, objArr);
                throw new util.h.xy.ef.mc(((java.lang.String) objArr[0]).intern());
            }
            int mo26555 = this.f2145.mo26555(this.f2146, 0, this.f2146, 0);
            this.f2148 = 0;
            try {
                int mo26709 = mo26555 - this.getHighSpeedVideoFpsRanges.mo26709(this.f2146);
                java.lang.System.arraycopy(this.f2146, 0, bArr, i, mo26709);
                m26540();
                return mo26709;
            } catch (java.lang.Throwable th) {
                m26540();
                throw th;
            }
        }
        if (this.f2148 != mo26554) {
            i2 = 0;
        } else {
            if ((mo26554 * 2) + i > bArr.length) {
                m26540();
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes((-237852514) - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() - 122, (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 146688265, objArr2);
                    throw new util.h.xy.ef.f(((java.lang.String) objArr2[0]).intern());
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            }
            i2 = this.f2145.mo26555(this.f2146, 0, bArr, i);
            this.f2148 = 0;
        }
        this.getHighSpeedVideoFpsRanges.mo26710(this.f2146, this.f2148);
        int mo265552 = this.f2145.mo26555(this.f2146, 0, bArr, i + i2);
        m26540();
        return i2 + mo265552;
    }

    @Override // util.h.xy.ef.b
    /* renamed from: ˋ */
    public final int mo26536(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws util.h.xy.ef.mc, java.lang.IllegalStateException {
        int i4 = i;
        int i5 = i2;
        int i6 = 0;
        try {
            if (i5 < 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes((-237852550) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (byte) (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) - 123, 146688221 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            int m26534 = m26534();
            int mo26538 = mo26538(i5);
            if (mo26538 > 0 && mo26538 + i3 > bArr2.length) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoSizes(android.view.View.MeasureSpec.getMode(0) - 237852515, (short) (android.view.ViewConfiguration.getEdgeSlop() >> 16), (byte) (android.view.ViewConfiguration.getTapTimeout() >> 16), (-122) - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), android.widget.ExpandableListView.getPackedPositionType(0L) + 146688265, objArr2);
                throw new util.h.xy.ef.f(((java.lang.String) objArr2[0]).intern());
            }
            int length = this.f2146.length - this.f2148;
            if (i5 > length) {
                java.lang.System.arraycopy(bArr, i4, this.f2146, this.f2148, length);
                int mo26555 = this.f2145.mo26555(this.f2146, 0, bArr2, i3);
                this.f2148 = 0;
                i5 -= length;
                i4 += length;
                i6 = mo26555;
                while (i5 > this.f2146.length) {
                    i6 += this.f2145.mo26555(bArr, i4, bArr2, i3 + i6);
                    i5 -= m26534;
                    i4 += m26534;
                }
            }
            java.lang.System.arraycopy(bArr, i4, this.f2146, this.f2148, i5);
            this.f2148 += i5;
            return i6;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // util.h.xy.ef.b
    /* renamed from: ˎ */
    public final int mo26538(int i) {
        int i2 = i + this.f2148;
        int length = i2 % this.f2146.length;
        if (length != 0) {
            return i2 - length;
        }
        getHighSpeedVideoSizesFor = (getInputFormats + 73) % 128;
        int max = java.lang.Math.max(0, i2 - this.f2146.length);
        int i3 = getInputFormats + 99;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return max;
        }
        throw null;
    }

    @Override // util.h.xy.ef.b
    /* renamed from: ˋ */
    public final int mo26535(int i) {
        int i2;
        int length;
        int i3 = getInputFormats + 25;
        getHighSpeedVideoSizesFor = i3 % 128;
        if (i3 % 2 != 0 ? (length = (i2 = i + this.f2148) % this.f2146.length) != 0 : (length = this.f2146.length + (i2 = i * this.f2148)) != 0) {
            return (i2 - length) + this.f2146.length;
        }
        getInputFormats = (getHighSpeedVideoSizesFor + 11) % 128;
        if (!this.f2144) {
            return i2;
        }
        int length2 = this.f2146.length;
        int i4 = getHighSpeedVideoSizesFor + 7;
        getInputFormats = i4 % 128;
        if (i4 % 2 == 0) {
            return i2 + length2;
        }
        throw null;
    }

    @Override // util.h.xy.ef.b
    /* renamed from: ˋ */
    public final void mo26537(boolean z, util.h.xy.ef.mb mbVar) throws java.lang.IllegalArgumentException {
        this.f2144 = z;
        m26540();
        if (!(mbVar instanceof util.h.xy.ep.me)) {
            this.f2145.mo26556(z, mbVar);
            return;
        }
        int i = getInputFormats + 87;
        getHighSpeedVideoSizesFor = i % 128;
        util.h.xy.ep.me meVar = (util.h.xy.ep.me) mbVar;
        meVar.m26667();
        if (i % 2 == 0) {
            this.f2145.mo26556(z, meVar.m26666());
            throw new java.lang.ArithmeticException();
        }
        this.f2145.mo26556(z, meVar.m26666());
        getInputFormats = (getHighSpeedVideoSizesFor + 11) % 128;
    }

    public a(util.h.xy.ef.ra raVar, util.h.xy.et.ra raVar2) {
        this.f2145 = raVar;
        this.getHighSpeedVideoFpsRanges = raVar2;
        this.f2146 = new byte[raVar.mo26554()];
        this.f2148 = 0;
    }
}
