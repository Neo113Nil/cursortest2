package util.h.xy.em;

/* loaded from: classes18.dex */
public final class ra extends java.io.FilterOutputStream {
    private static short[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = -1647178453;
    private static int getHighSpeedVideoFpsRanges = -1170953953;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getHighSpeedVideoSizesFor = -408873039;
    private static int getInputFormats = 0;
    private static int getOutputFormats = 1;
    private static byte[] getOutputMinFrameDuration = {107, -30, -116, -14, 123, 33, -126, -14, -9, -72, -71, 124, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -10, -70, -23, -123, -14, -124, -20, -70, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 121, 33, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -14, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -94, 117, -60, 47, 110, -2, -23, -4, com.google.common.base.Ascii.ESC, 73, -77, -13, 103, -12, 102, com.google.common.base.Ascii.EM, 99, 89, -116, com.google.common.base.Ascii.EM, -1, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.SI};
    private byte[] getInputSizeshNQ4ISI;
    private util.h.xy.eo.mb getOutputMinFrameDurationlomOqCM;
    private util.h.xy.ef.b getOutputSizes;
    private util.h.xy.ef.rg getOutputStallDuration;
    private final byte[] getOutputStallDurationlomOqCM;

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        byte[] bArr;
        boolean z;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
        boolean z2 = i5 == -1;
        if (z2) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 105) % 128;
            byte[] bArr2 = getOutputMinFrameDuration;
            if (bArr2 != null) {
                int length = bArr2.length;
                byte[] bArr3 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr3[i6] = (byte) (bArr2[i6] ^ (-2689713159175858216L));
                }
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 57) % 128;
                bArr2 = bArr3;
            }
            i5 = bArr2 != null ? (byte) (((byte) (getOutputMinFrameDuration[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)))) : (short) (((short) (Camera2StreamConfigurationMap[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
        }
        if (i5 > 0) {
            int i7 = (int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L));
            if (z2) {
                int i8 = getHighSpeedVideoFpsRangesFor + 71;
                getHighSpeedVideoSizes = i8 % 128;
                if (i8 % 2 != 0) {
                    i4 = 1;
                    meVar.f2647 = ((i + i5) - 2) + i7 + i4;
                    meVar.f2644 = (char) (i3 + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    bArr = getOutputMinFrameDuration;
                    if (bArr != null) {
                        int length2 = bArr.length;
                        byte[] bArr4 = new byte[length2];
                        for (int i9 = 0; i9 < length2; i9++) {
                            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 39) % 128;
                            bArr4[i9] = (byte) (bArr[i9] ^ (-2689713159175858216L));
                        }
                        bArr = bArr4;
                    }
                    if (bArr == null) {
                        z = true;
                    } else {
                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 113) % 128;
                        z = false;
                    }
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i5) {
                        int i10 = getHighSpeedVideoFpsRangesFor + 97;
                        getHighSpeedVideoSizes = i10 % 128;
                        if (i10 % 2 == 0) {
                            throw null;
                        }
                        if (z) {
                            byte[] bArr5 = getOutputMinFrameDuration;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        } else {
                            short[] sArr = Camera2StreamConfigurationMap;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                        }
                        sb.append(meVar.f2644);
                        meVar.f2646 = meVar.f2644;
                        meVar.f2645++;
                    }
                }
            }
            i4 = 0;
            meVar.f2647 = ((i + i5) - 2) + i7 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            bArr = getOutputMinFrameDuration;
            if (bArr != null) {
            }
            if (bArr == null) {
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
            }
        }
        objArr[0] = sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|1|(4:2|3|(2:5|(1:7))(2:20|(2:22|(2:24|25))(2:26|(1:28)))|8)|9|10|(2:12|13)(1:15)) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d3, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d6, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws java.io.IOException {
        java.io.IOException maVar;
        java.io.IOException iOException;
        getHighResolutionOutputSizeshNQ4ISI(0, true);
        try {
            util.h.xy.ef.b bVar = this.getOutputSizes;
            if (bVar != null) {
                int mo26539 = bVar.mo26539(this.getInputSizeshNQ4ISI, 0);
                if (mo26539 != 0) {
                    this.out.write(this.getInputSizeshNQ4ISI, 0, mo26539);
                }
            } else {
                util.h.xy.eo.mb mbVar = this.getOutputMinFrameDurationlomOqCM;
                if (mbVar != null) {
                    int i = mbVar.mo26642(this.getInputSizeshNQ4ISI, 0);
                    if (i != 0) {
                        getInputFormats = (getOutputFormats + 119) % 128;
                        this.out.write(this.getInputSizeshNQ4ISI, 0, i);
                    }
                } else {
                    util.h.xy.ef.rg rgVar = this.getOutputStallDuration;
                    if (rgVar != null) {
                        rgVar.mo26570();
                    }
                }
            }
            iOException = null;
        } catch (util.h.xy.ef.md e) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((-1570094792) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (short) (56 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), (byte) ((-97) - android.view.KeyEvent.getDeadChar(0, 0)), (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 107, (-2054363822) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
            maVar = new util.h.xy.em.a(((java.lang.String) objArr[0]).intern(), e);
            iOException = maVar;
            flush();
            this.out.close();
            if (iOException != null) {
            }
        } catch (java.lang.Exception e2) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes((-1570094762) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) ((-116) - android.view.View.resolveSize(0, 0)), (byte) ((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 78), (-106) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), (-2054363822) - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), objArr2);
            maVar = new util.h.xy.em.ma(((java.lang.String) objArr2[0]).intern(), e2);
            iOException = maVar;
            flush();
            this.out.close();
            if (iOException != null) {
            }
        }
        flush();
        this.out.close();
        if (iOException != null) {
            throw iOException;
        }
        getOutputFormats = (getInputFormats + 67) % 128;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws java.io.IOException {
        int i = getOutputFormats + 13;
        getInputFormats = i % 128;
        this.out.flush();
        if (i % 2 != 0) {
            throw null;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(int i, boolean z) {
        int i2 = getInputFormats;
        int i3 = i2 + 89;
        getOutputFormats = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (z) {
            util.h.xy.ef.b bVar = this.getOutputSizes;
            if (bVar != null) {
                i = bVar.mo26535(i);
            } else {
                util.h.xy.eo.mb mbVar = this.getOutputMinFrameDurationlomOqCM;
                if (mbVar != null) {
                    i = mbVar.mo26638(i);
                }
            }
        } else {
            util.h.xy.ef.b bVar2 = this.getOutputSizes;
            if (bVar2 != null) {
                i = bVar2.mo26538(i);
            } else {
                util.h.xy.eo.mb mbVar2 = this.getOutputMinFrameDurationlomOqCM;
                if (mbVar2 != null) {
                    getOutputFormats = (i2 + 31) % 128;
                    i = mbVar2.mo26640(i);
                }
            }
        }
        byte[] bArr = this.getInputSizeshNQ4ISI;
        if (bArr == null || bArr.length < i) {
            this.getInputSizeshNQ4ISI = new byte[i];
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI(i2, false);
        util.h.xy.ef.b bVar = this.getOutputSizes;
        if (bVar != null) {
            int mo26536 = bVar.mo26536(bArr, i, i2, this.getInputSizeshNQ4ISI, 0);
            if (mo26536 != 0) {
                getOutputFormats = (getInputFormats + 21) % 128;
                this.out.write(this.getInputSizeshNQ4ISI, 0, mo26536);
            }
        } else {
            util.h.xy.eo.mb mbVar = this.getOutputMinFrameDurationlomOqCM;
            if (mbVar != null) {
                getInputFormats = (getOutputFormats + 85) % 128;
                int i3 = mbVar.mo26643(bArr, i, i2, this.getInputSizeshNQ4ISI, 0);
                if (i3 != 0) {
                    this.out.write(this.getInputSizeshNQ4ISI, 0, i3);
                }
            } else {
                this.getOutputStallDuration.mo26553(bArr, i, i2, this.getInputSizeshNQ4ISI, 0);
                this.out.write(this.getInputSizeshNQ4ISI, 0, i2);
            }
        }
        getInputFormats = (getOutputFormats + 59) % 128;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws java.io.IOException {
        getInputFormats = (getOutputFormats + 85) % 128;
        write(bArr, 0, bArr.length);
        int i = getOutputFormats + 63;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3.getOutputStallDuration != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0014, code lost:
    
        if (r3.getOutputStallDuration != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
    
        write(r3.getOutputStallDurationlomOqCM, 0, 1);
        util.h.xy.em.ra.getInputFormats = (util.h.xy.em.ra.getOutputFormats + 45) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        r3.out.write(r3.getOutputStallDuration.mo26552((byte) r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        return;
     */
    @Override // java.io.FilterOutputStream, java.io.OutputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(int i) throws java.io.IOException {
        int i2 = getOutputFormats + 13;
        getInputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            this.getOutputStallDurationlomOqCM[0] = (byte) i;
        } else {
            this.getOutputStallDurationlomOqCM[0] = (byte) i;
        }
    }

    public ra(java.io.OutputStream outputStream, util.h.xy.eo.mb mbVar) {
        super(outputStream);
        this.getOutputStallDurationlomOqCM = new byte[1];
        this.getOutputMinFrameDurationlomOqCM = mbVar;
    }

    public ra(java.io.OutputStream outputStream, util.h.xy.ef.rg rgVar) {
        super(outputStream);
        this.getOutputStallDurationlomOqCM = new byte[1];
        this.getOutputStallDuration = rgVar;
    }

    public ra(java.io.OutputStream outputStream, util.h.xy.ef.b bVar) {
        super(outputStream);
        this.getOutputStallDurationlomOqCM = new byte[1];
        this.getOutputSizes = bVar;
    }
}
