package util.h.xy.ai;

/* loaded from: classes5.dex */
public final class mb {
    private static byte[] Camera2StreamConfigurationMap = {18, -45, -45, -53, -43, -120, com.google.common.base.Ascii.GS, 45, -61, -8, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, com.visa.cbp.getEncExpo.kernelVersion, -47, -46, 35, -27, 63, 35, -35, com.visa.cbp.getEncExpo.registerForActivityResult, 0, -47, -41, -34, -47, -24, kotlin.io.encoding.Base64.padSymbol, -63, 36, -123, 102, -46, -51, -48, -107, 110, -45, -48, -54, com.google.common.base.Ascii.ETB, -116, -116, -124, -114, 65, -42, -26, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -79, -20, -72, -118, -117, -100, 94, -7, -127, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -20, -97, -72, -108, -124, -76, -13, -118, Byte.MIN_VALUE, -105, -118, -95, -10, -70, -99, 126, -33, -117, -122, -119, 78, 39, -116, -119, -125, 13, 107, 107, 99, 109, 32, -121, com.google.common.base.Ascii.EM, Byte.MAX_VALUE, 97, 126, com.google.common.base.Ascii.EM, 114, 39, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 105, com.visa.cbp.getEncExpo.IResultReceiver2, Byte.MAX_VALUE, com.google.common.base.Ascii.GS, 121, com.google.common.base.Ascii.ESC, Byte.MAX_VALUE, 99, 104, 107, 46, -121, 107, 103, 123, com.google.common.base.Ascii.EM, 114, 102, 121, com.google.common.base.Ascii.ESC, 123, -38, -66, 106, 101, 43, -66, 106, 101, 104, 45, -122, 107, 104, 98};
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = -408873083;
    private static int getInputFormats = -867847012;
    private static int getInputSizeshNQ4ISI = -859642651;
    private static short[] getOutputFormats = null;
    private static int getOutputMinFrameDuration = 1;
    private int ArtificialStackFrames = 0;
    private util.h.xy.ai.mb.ra isOutputSupportedFor = null;
    private util.h.xy.ai.mb.ra coroutineBoundary = null;
    private util.h.xy.ai.mb.ra unwrapAs = null;
    private util.h.xy.ai.mb.ra coroutineCreation = null;
    private util.h.xy.ai.mb.ra getHighSpeedVideoSizesFor = null;
    private int getOutputSizes = 0;
    private util.h.xy.ai.mb.ra getOutputSizeshNQ4ISI = null;
    private util.h.xy.ai.mb.ra CoroutineDebuggingKt = null;

    /* renamed from: a, reason: collision with root package name */
    private util.h.xy.ai.mb.ra f7072a = null;
    private int getOutputMinFrameDurationlomOqCM = 0;
    private util.h.xy.ai.mb.ra getOutputStallDuration = null;
    private util.h.xy.ai.mb.ra isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.mb.ra getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.mb.ra toString = null;
    private util.h.xy.ai.mb.ra _CREATION = null;
    private util.h.xy.ai.mb.ra accessartificialFrame = null;
    private util.h.xy.ai.mb.ra getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.mb.ra _BOUNDARY = null;

    protected final void finalize() {
        int i = getHighSpeedVideoFpsRanges + 113;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            m24713();
        } else {
            m24713();
            throw null;
        }
    }

    final class ra extends com.sun.jna.Memory {
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor;

        public ra(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRanges + 17;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 == 0) {
                super.dispose();
            } else {
                super.dispose();
                throw null;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24710() {
        int i = getOutputMinFrameDuration + 77;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.mb.ra raVar = this.isOutputSupportedFor;
        if (raVar != null) {
            try {
                raVar.dispose();
                this.isOutputSupportedFor = null;
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 53) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedFor = null;
                throw th;
            }
        }
        util.h.xy.ai.mb.ra raVar2 = this.coroutineBoundary;
        if (raVar2 != null) {
            int i2 = getHighSpeedVideoFpsRanges + 85;
            getOutputMinFrameDuration = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    raVar2.dispose();
                    throw null;
                }
                raVar2.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        util.h.xy.ai.mb.ra raVar3 = this.unwrapAs;
        if (raVar3 != null) {
            int i3 = getOutputMinFrameDuration + 51;
            getHighSpeedVideoFpsRanges = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    raVar3.dispose();
                } else {
                    raVar3.dispose();
                    throw null;
                }
            } finally {
                this.unwrapAs = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b9, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b7, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        int length;
        byte[] bArr;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L)));
        if (i6 == -1) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 25) % 128;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr2 = Camera2StreamConfigurationMap;
            if (bArr2 != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 105) % 128;
                int length2 = bArr2.length;
                byte[] bArr3 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
                    bArr3[i7] = (byte) (bArr2[i7] ^ (-2689713159175858216L));
                }
                bArr2 = bArr3;
            }
            if (bArr2 != null) {
                getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
                i6 = (byte) (((byte) (Camera2StreamConfigurationMap[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
            } else {
                i6 = (short) (((short) (getOutputFormats[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 13) % 128;
            }
        }
        if (i6 > 0) {
            int i8 = getHighSpeedVideoFpsRangesFor + 117;
            getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
            if (i8 % 2 != 0) {
                i4 = ((i - i6) % 3) >>> ((int) (getInputSizeshNQ4ISI + 2689713159175858216L));
            } else {
                i4 = ((i + i6) - 2) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getInputFormats ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr4 = Camera2StreamConfigurationMap;
            if (bArr4 != null) {
                int i9 = getHighSpeedVideoFpsRangesFor + 49;
                getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
                if (i9 % 2 != 0) {
                    length = bArr4.length;
                    bArr = new byte[length];
                } else {
                    length = bArr4.length;
                    bArr = new byte[length];
                }
                for (int i10 = 0; i10 < length; i10++) {
                    bArr[i10] = (byte) (bArr4[i10] ^ (-2689713159175858216L));
                }
                bArr4 = bArr;
            }
            boolean z2 = bArr4 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRangesFor + 61) % 128;
                    byte[] bArr5 = Camera2StreamConfigurationMap;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getOutputFormats;
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

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24715(int i) {
        this.ArtificialStackFrames = i;
        util.h.xy.ai.mb.ra raVar = this.isOutputSupportedFor;
        if (raVar != null) {
            try {
                raVar.dispose();
                this.isOutputSupportedFor = null;
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 27) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedFor = null;
                throw th;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighSpeedVideoFpsRanges;
        getOutputMinFrameDuration = (i2 + 27) % 128;
        getOutputMinFrameDuration = (i2 + 95) % 128;
        this.isOutputSupportedFor = new util.h.xy.ai.mb.ra(nativeSize + 109);
        util.h.xy.ai.mb.ra raVar2 = this.coroutineBoundary;
        if (raVar2 != null) {
            int i3 = getOutputMinFrameDuration + 63;
            getHighSpeedVideoFpsRanges = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    raVar2.dispose();
                    throw null;
                }
                raVar2.dispose();
            } finally {
                this.coroutineBoundary = null;
            }
        }
        util.h.xy.ai.mb.ra raVar3 = new util.h.xy.ai.mb.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.coroutineBoundary = raVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor);
        int i4 = getHighSpeedVideoFpsRanges;
        getOutputMinFrameDuration = (i4 + 107) % 128;
        getOutputMinFrameDuration = (i4 + 117) % 128;
        raVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 92));
        util.h.xy.ai.mb.ra raVar4 = this.unwrapAs;
        if (raVar4 != null) {
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 87) % 128;
            try {
                raVar4.dispose();
            } finally {
                this.unwrapAs = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.coroutineBoundary);
        util.h.xy.ai.mb.ra raVar5 = new util.h.xy.ai.mb.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i5 = 0;
        while (i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = i5 * 8;
            bArr[i5] = (byte) (((255 << i6) & nativeValue2) >> i6);
            i5++;
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 67) % 128;
        }
        int i7 = 285509138;
        for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 37) % 128;
            byte b = bArr[i8];
            bArr[i8] = (byte) (((byte) (i7 & 255)) ^ b);
            i7 = ((i7 << (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i7 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j = 0;
        for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
            j |= (bArr[i9] & 255) << (i9 * 8);
        }
        raVar5.setLong(0L, j);
        this.unwrapAs = raVar5;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24705(byte[] bArr) throws java.io.IOException {
        int i = getOutputMinFrameDuration + 23;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            m24715(bArr.length);
            util.h.xy.ai.mb.ra raVar = this.isOutputSupportedFor;
            int i2 = getHighSpeedVideoFpsRanges;
            getOutputMinFrameDuration = (i2 + 107) % 128;
            getOutputMinFrameDuration = (i2 + 117) % 128;
            raVar.write(92L, bArr, 1, bArr.length);
            return;
        }
        m24715(bArr.length);
        util.h.xy.ai.mb.ra raVar2 = this.isOutputSupportedFor;
        int i3 = getHighSpeedVideoFpsRanges;
        getOutputMinFrameDuration = (i3 + 107) % 128;
        getOutputMinFrameDuration = (i3 + 117) % 128;
        raVar2.write(92L, bArr, 0, bArr.length);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoFpsRanges;
        getOutputMinFrameDuration = (i + 63) % 128;
        int i2 = i + 9;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            return 102;
        }
        throw null;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24702() {
        util.h.xy.ai.mb.ra raVar = this.coroutineCreation;
        if (raVar != null) {
            int i = getOutputMinFrameDuration + 59;
            getHighSpeedVideoFpsRanges = i % 128;
            try {
                if (i % 2 == 0) {
                    raVar.dispose();
                } else {
                    raVar.dispose();
                    throw null;
                }
            } finally {
                this.coroutineCreation = null;
            }
        }
        util.h.xy.ai.mb.ra raVar2 = this.getHighSpeedVideoSizesFor;
        if (raVar2 != null) {
            try {
                raVar2.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 13) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24703(int i) {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 3) % 128;
        util.h.xy.ai.mb.ra raVar = this.coroutineCreation;
        if (raVar != null) {
            try {
                raVar.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i2 = getOutputMinFrameDuration + 79;
        getHighSpeedVideoFpsRanges = i2 % 128;
        util.h.xy.ai.mb.ra raVar2 = new util.h.xy.ai.mb.ra(nativeSize + (i2 % 2 != 0 ? 6929 : 153));
        this.coroutineCreation = raVar2;
        getHighResolutionOutputSizeshNQ4ISI();
        raVar2.setInt(102L, i);
        util.h.xy.ai.mb.ra raVar3 = this.getHighSpeedVideoSizesFor;
        if (raVar3 != null) {
            try {
                raVar3.dispose();
            } finally {
                this.getHighSpeedVideoSizesFor = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.coroutineCreation);
        getHighResolutionOutputSizeshNQ4ISI();
        util.h.xy.ai.mb.ra raVar4 = new util.h.xy.ai.mb.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        raVar4.setLong(0L, 790187043 ^ (nativeValue + 102));
        int i3 = getHighSpeedVideoFpsRanges;
        int i4 = i3 + 77;
        getOutputMinFrameDuration = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        this.getHighSpeedVideoSizesFor = raVar4;
        int i5 = i3 + 97;
        getOutputMinFrameDuration = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24707() {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 3) % 128;
        util.h.xy.ai.mb.ra raVar = this.getOutputSizeshNQ4ISI;
        if (raVar != null) {
            try {
                raVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.mb.ra raVar2 = this.CoroutineDebuggingKt;
        if (raVar2 != null) {
            try {
                raVar2.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        util.h.xy.ai.mb.ra raVar3 = this.f7072a;
        if (raVar3 != null) {
            try {
                raVar3.dispose();
                this.f7072a = null;
                getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 53) % 128;
            } catch (java.lang.Throwable th) {
                this.f7072a = null;
                throw th;
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24711(int i) {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 63) % 128;
        this.getOutputSizes = i;
        util.h.xy.ai.mb.ra raVar = this.getOutputSizeshNQ4ISI;
        if (raVar != null) {
            try {
                raVar.dispose();
            } finally {
                this.getOutputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getOutputMinFrameDuration + 119;
        getHighSpeedVideoFpsRanges = i2 % 128;
        this.getOutputSizeshNQ4ISI = new util.h.xy.ai.mb.ra(nativeSize + (i2 % 2 != 0 ? 76 : 121));
        util.h.xy.ai.mb.ra raVar2 = this.CoroutineDebuggingKt;
        if (raVar2 != null) {
            try {
                raVar2.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
        util.h.xy.ai.mb.ra raVar3 = new util.h.xy.ai.mb.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.CoroutineDebuggingKt = raVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputSizeshNQ4ISI);
        int i3 = (getOutputMinFrameDuration + 73) % 128;
        getHighSpeedVideoFpsRanges = i3;
        getOutputMinFrameDuration = (i3 + 55) % 128;
        raVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 80));
        util.h.xy.ai.mb.ra raVar4 = this.f7072a;
        if (raVar4 != null) {
            try {
                raVar4.dispose();
                this.f7072a = null;
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 77) % 128;
            } catch (java.lang.Throwable th) {
                this.f7072a = null;
                throw th;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.CoroutineDebuggingKt);
        util.h.xy.ai.mb.ra raVar5 = new util.h.xy.ai.mb.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i4 = 0;
        while (i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i5 = getHighSpeedVideoFpsRanges + 45;
            getOutputMinFrameDuration = i5 % 128;
            if (i5 % 2 == 0) {
                bArr[i4] = (byte) ((nativeValue2 - (255 >> (i4 - 27))) >> (i4 * 109));
                i4 += 90;
            } else {
                int i6 = i4 * 8;
                bArr[i4] = (byte) (((255 << i6) & nativeValue2) >> i6);
                i4++;
            }
        }
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 47) % 128;
        int i7 = 1807877756;
        for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
            byte b = bArr[i8];
            bArr[i8] = (byte) (((byte) (i7 & 255)) ^ b);
            i7 = ((i7 << (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i7 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 5) % 128;
        long j = 0;
        for (int i9 = 0; i9 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i9++) {
            j |= (bArr[i9] & 255) << (i9 * 8);
        }
        raVar5.setLong(0L, j);
        this.f7072a = raVar5;
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 81) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final byte[] m24706() throws java.io.IOException {
        int i = (getHighSpeedVideoFpsRanges + 43) % 128;
        getOutputMinFrameDuration = i;
        util.h.xy.ai.mb.ra raVar = this.getOutputSizeshNQ4ISI;
        if (raVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 727970621, (short) ((-10) - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), (byte) android.graphics.Color.red(0), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) - 93, (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 736404183, objArr);
            throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
        }
        int i2 = this.getOutputSizes;
        byte[] bArr = new byte[i2];
        int i3 = (i + 73) % 128;
        getHighSpeedVideoFpsRanges = i3;
        getOutputMinFrameDuration = (i3 + 55) % 128;
        raVar.read(80L, bArr, 0, i2);
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 7) % 128;
        return bArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24712(byte[] bArr) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges + 81;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            m24711(bArr.length);
            util.h.xy.ai.mb.ra raVar = this.getOutputSizeshNQ4ISI;
            int i2 = (getOutputMinFrameDuration + 73) % 128;
            getHighSpeedVideoFpsRanges = i2;
            getOutputMinFrameDuration = (i2 + 55) % 128;
            raVar.write(65536L, bArr, 1, bArr.length);
            return;
        }
        m24711(bArr.length);
        util.h.xy.ai.mb.ra raVar2 = this.getOutputSizeshNQ4ISI;
        int i3 = (getOutputMinFrameDuration + 73) % 128;
        getHighSpeedVideoFpsRanges = i3;
        getOutputMinFrameDuration = (i3 + 55) % 128;
        raVar2.write(80L, bArr, 0, bArr.length);
    }

    private static int getHighSpeedVideoSizes() {
        int i = getOutputMinFrameDuration;
        int i2 = i + 107;
        getHighSpeedVideoFpsRanges = i2 % 128;
        int i3 = i2 % 2 != 0 ? 23 : 92;
        int i4 = i + 15;
        getHighSpeedVideoFpsRanges = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24714() {
        util.h.xy.ai.mb.ra raVar = this.getOutputStallDuration;
        if (raVar != null) {
            try {
                raVar.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        util.h.xy.ai.mb.ra raVar2 = this.isOutputSupportedForhNQ4ISI;
        if (raVar2 != null) {
            int i = getOutputMinFrameDuration + 109;
            getHighSpeedVideoFpsRanges = i % 128;
            try {
                if (i % 2 == 0) {
                    raVar2.dispose();
                } else {
                    raVar2.dispose();
                    throw null;
                }
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        util.h.xy.ai.mb.ra raVar3 = this.getOutputStallDurationlomOqCM;
        if (raVar3 != null) {
            try {
                raVar3.dispose();
                this.getOutputStallDurationlomOqCM = null;
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 91) % 128;
            } catch (java.lang.Throwable th) {
                this.getOutputStallDurationlomOqCM = null;
                throw th;
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24708(int i) {
        this.getOutputMinFrameDurationlomOqCM = i;
        util.h.xy.ai.mb.ra raVar = this.getOutputStallDuration;
        if (raVar != null) {
            try {
                raVar.dispose();
            } finally {
                this.getOutputStallDuration = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
        int i2 = getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = (i2 + 51) % 128;
        getHighSpeedVideoFpsRanges = (i2 + 43) % 128;
        this.getOutputStallDuration = new util.h.xy.ai.mb.ra(nativeSize + 115);
        util.h.xy.ai.mb.ra raVar2 = this.isOutputSupportedForhNQ4ISI;
        if (raVar2 != null) {
            try {
                raVar2.dispose();
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        util.h.xy.ai.mb.ra raVar3 = new util.h.xy.ai.mb.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.isOutputSupportedForhNQ4ISI = raVar3;
        raVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getOutputStallDuration) + getHighSpeedVideoSizes()));
        util.h.xy.ai.mb.ra raVar4 = this.getOutputStallDurationlomOqCM;
        if (raVar4 != null) {
            int i3 = getOutputMinFrameDuration + 73;
            getHighSpeedVideoFpsRanges = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    raVar4.dispose();
                    throw null;
                }
                raVar4.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.isOutputSupportedForhNQ4ISI);
        util.h.xy.ai.mb.ra raVar5 = new util.h.xy.ai.mb.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i4 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            int i6 = i5 * 8;
            bArr[i5] = (byte) (((255 << i6) & nativeValue) >> i6);
        }
        int i7 = 1015605453;
        for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 45) % 128;
            byte b = bArr[i8];
            bArr[i8] = (byte) (((byte) (i7 & 255)) ^ b);
            i7 = ((i7 << (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i7 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i8 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j = 0;
        while (i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i9 = getOutputMinFrameDuration + 99;
            getHighSpeedVideoFpsRanges = i9 % 128;
            if (i9 % 2 != 0) {
                j *= (bArr[i4] & 22684) >>> (i4 >> 121);
                i4 += 92;
            } else {
                j |= (bArr[i4] & 255) << (i4 * 8);
                i4++;
            }
        }
        raVar5.setLong(0L, j);
        this.getOutputStallDurationlomOqCM = raVar5;
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 115) % 128;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final int[] m24716() throws java.io.IOException {
        util.h.xy.ai.mb.ra raVar = this.getOutputStallDuration;
        if (raVar == null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((-727970583) - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), (short) ((android.view.ViewConfiguration.getTouchSlop() >> 8) - 83), (byte) (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (-93) - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), android.graphics.Color.blue(0) - 736404183, objArr);
                throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int[] iArr = new int[this.getOutputMinFrameDurationlomOqCM];
        raVar.read(getHighSpeedVideoSizes(), iArr, 0, this.getOutputMinFrameDurationlomOqCM);
        return iArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24709(int[] iArr) throws java.io.IOException {
        getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 51) % 128;
        m24708(iArr.length);
        this.getOutputStallDuration.write(getHighSpeedVideoSizes(), iArr, 0, iArr.length);
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 55) % 128;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m24701() {
        int i = getOutputMinFrameDuration + 19;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.mb.ra raVar = this.toString;
        if (raVar != null) {
            try {
                raVar.dispose();
                this.toString = null;
                int i2 = getHighSpeedVideoFpsRanges + 91;
                getOutputMinFrameDuration = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 5 / 4;
                }
            } catch (java.lang.Throwable th) {
                this.toString = null;
                throw th;
            }
        }
        util.h.xy.ai.mb.ra raVar2 = this._CREATION;
        if (raVar2 != null) {
            int i4 = getOutputMinFrameDuration + 57;
            getHighSpeedVideoFpsRanges = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    raVar2.dispose();
                } else {
                    raVar2.dispose();
                    throw null;
                }
            } finally {
                this._CREATION = null;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24704(int i) {
        int i2 = getOutputMinFrameDuration;
        getHighSpeedVideoFpsRanges = (i2 + 99) % 128;
        util.h.xy.ai.mb.ra raVar = this.toString;
        if (raVar != null) {
            getHighSpeedVideoFpsRanges = (i2 + 93) % 128;
            try {
                raVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i3 = (getOutputMinFrameDuration + 55) % 128;
        getHighSpeedVideoFpsRanges = i3;
        getOutputMinFrameDuration = (i3 + 109) % 128;
        util.h.xy.ai.mb.ra raVar2 = new util.h.xy.ai.mb.ra(nativeSize + 83);
        this.toString = raVar2;
        int i4 = getHighSpeedVideoFpsRanges + 105;
        getOutputMinFrameDuration = i4 % 128;
        raVar2.setInt(i4 % 2 == 0 ? 50 : 70, i);
        util.h.xy.ai.mb.ra raVar3 = this._CREATION;
        if (raVar3 != null) {
            try {
                raVar3.dispose();
            } finally {
                this._CREATION = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.toString);
        int i5 = getHighSpeedVideoFpsRanges + 105;
        getOutputMinFrameDuration = i5 % 128;
        long j = nativeValue + (i5 % 2 != 0 ? 70 : 50);
        util.h.xy.ai.mb.ra raVar4 = new util.h.xy.ai.mb.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        raVar4.setLong(0L, j ^ 2033296166);
        int i6 = getHighSpeedVideoFpsRanges + 51;
        int i7 = i6 % 128;
        getOutputMinFrameDuration = i7;
        if (i6 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        this._CREATION = raVar4;
        getHighSpeedVideoFpsRanges = (i7 + 33) % 128;
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = (getHighSpeedVideoFpsRanges + 87) % 128;
        getOutputMinFrameDuration = i;
        int i2 = i + 97;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            return 100;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void m24700() {
        util.h.xy.ai.mb.ra raVar = this.accessartificialFrame;
        if (raVar != null) {
            int i = getOutputMinFrameDuration + 73;
            getHighSpeedVideoFpsRanges = i % 128;
            try {
                if (i % 2 == 0) {
                    raVar.dispose();
                } else {
                    raVar.dispose();
                    this.accessartificialFrame = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.accessartificialFrame = null;
            }
        }
        util.h.xy.ai.mb.ra raVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (raVar2 != null) {
            try {
                raVar2.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        util.h.xy.ai.mb.ra raVar3 = this._BOUNDARY;
        if (raVar3 != null) {
            try {
                raVar3.dispose();
                this._BOUNDARY = null;
                getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 105) % 128;
            } catch (java.lang.Throwable th) {
                this._BOUNDARY = null;
                throw th;
            }
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final int m24699() throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges;
        getOutputMinFrameDuration = (i + 125) % 128;
        if (this.unwrapAs != null && this.getHighSpeedVideoSizesFor != null && this.f7072a != null && this.getOutputStallDurationlomOqCM != null) {
            getOutputMinFrameDuration = (i + 41) % 128;
            if (this._CREATION != null) {
                util.h.xy.ai.mb.ra raVar = this.accessartificialFrame;
                if (raVar != null) {
                    try {
                        raVar.dispose();
                    } finally {
                        this.accessartificialFrame = null;
                    }
                }
                int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                int i2 = (getHighSpeedVideoFpsRanges + 19) % 128;
                getOutputMinFrameDuration = i2;
                getHighSpeedVideoFpsRanges = (i2 + 99) % 128;
                this.accessartificialFrame = new util.h.xy.ai.mb.ra(nativeSize + 119);
                util.h.xy.ai.mb.ra raVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
                if (raVar2 != null) {
                    try {
                        raVar2.dispose();
                        this.getValidOutputFormatsForInputhNQ4ISI = null;
                        getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 49) % 128;
                    } catch (java.lang.Throwable th) {
                        this.getValidOutputFormatsForInputhNQ4ISI = null;
                        throw th;
                    }
                }
                util.h.xy.ai.mb.ra raVar3 = new util.h.xy.ai.mb.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                this.getValidOutputFormatsForInputhNQ4ISI = raVar3;
                long nativeValue = com.sun.jna.Pointer.nativeValue(this.accessartificialFrame);
                getHighSpeedVideoFpsRangesFor();
                raVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 100));
                util.h.xy.ai.mb.ra raVar4 = this._BOUNDARY;
                if (raVar4 != null) {
                    getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 49) % 128;
                    try {
                        raVar4.dispose();
                    } finally {
                        this._BOUNDARY = null;
                    }
                }
                long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.getValidOutputFormatsForInputhNQ4ISI);
                util.h.xy.ai.mb.ra raVar5 = new util.h.xy.ai.mb.ra(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                raVar5.setLong(0L, nativeValue2 ^ 1415302072);
                int i3 = getHighSpeedVideoFpsRanges + 21;
                getOutputMinFrameDuration = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                this._BOUNDARY = raVar5;
                util.h.xy.ai.ml.Camera2StreamConfigurationMap._EFCoEKTUsesANHdevt81HF(this._BOUNDARY, this.unwrapAs, this.getHighSpeedVideoSizesFor, this.f7072a, this.getOutputStallDurationlomOqCM, this._CREATION);
                int[] iArr = new int[1];
                util.h.xy.ai.mb.ra raVar6 = this.accessartificialFrame;
                getHighSpeedVideoFpsRangesFor();
                raVar6.read(100L, iArr, 0, 1);
                return iArr[0];
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI((-727970538) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (short) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 78), (byte) android.view.View.combineMeasuredStates(0, 0), (-94) - android.graphics.Color.argb(0, 0, 0, 0), (-736404183) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public final void m24713() {
        int i = getOutputMinFrameDuration + 97;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            m24710();
            m24702();
            m24707();
            m24714();
            m24701();
            m24700();
            return;
        }
        m24710();
        m24702();
        m24707();
        m24714();
        m24701();
        m24700();
        throw null;
    }
}
