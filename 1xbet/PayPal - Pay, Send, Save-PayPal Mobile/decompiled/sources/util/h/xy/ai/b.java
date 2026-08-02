package util.h.xy.ai;

/* loaded from: classes5.dex */
public final class b {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] Camera2StreamConfigurationMap = {38471, 41914, 38468, 41909, 38478, 38465, 41908, 41906, 41903, 41900, 41913, 41896, 41905, 41902, 41907, 41904, 38466, 41897, 41919, 41917, 41980, 38469, 38464, 41912, 38467};
    private static char getHighSpeedVideoSizesFor = 38467;
    private util.h.xy.ai.b.mb toString = null;
    private util.h.xy.ai.b.mb isOutputSupportedForhNQ4ISI = null;
    private util.h.xy.ai.b.mb b = null;
    private util.h.xy.ai.b.mb getValidOutputFormatsForInputhNQ4ISI = null;
    private util.h.xy.ai.b.mb getOutputMinFrameDurationlomOqCM = null;
    private util.h.xy.ai.b.mb getOutputFormats = null;
    private util.h.xy.ai.b.mb getOutputMinFrameDuration = null;
    private util.h.xy.ai.b.mb AMEXKernel = null;
    private util.h.xy.ai.b.mb getInputSizeshNQ4ISI = null;
    private util.h.xy.ai.b.mb CoroutineDebuggingKt = null;
    private int getOutputStallDuration = 0;
    private util.h.xy.ai.b.mb getOutputSizes = null;
    private util.h.xy.ai.b.mb getOutputStallDurationlomOqCM = null;
    private util.h.xy.ai.b.mb unwrapAs = null;
    private int getOutputSizeshNQ4ISI = 0;
    private util.h.xy.ai.b.mb ArtificialStackFrames = null;
    private util.h.xy.ai.b.mb isOutputSupportedFor = null;

    /* renamed from: a, reason: collision with root package name */
    private util.h.xy.ai.b.mb f7070a = null;
    private int coroutineBoundary = 0;
    private util.h.xy.ai.b.mb getARTIFICIAL_FRAME_PACKAGE_NAME = null;
    private util.h.xy.ai.b.mb resetTransaction = null;
    private util.h.xy.ai.b.mb release = null;
    private util.h.xy.ai.b.mb coroutineCreation = null;
    private util.h.xy.ai.b.mb getInputFormats = null;
    private int accessartificialFrame = 0;
    private util.h.xy.ai.b.mb kernelVersion = null;
    private util.h.xy.ai.b.mb d = null;
    private util.h.xy.ai.b.mb _BOUNDARY = null;
    private util.h.xy.ai.b.mb _CREATION = null;
    private util.h.xy.ai.b.mb c = null;
    private util.h.xy.ai.b.mb AMEXKernela = null;
    private util.h.xy.ai.b.mb init = null;
    private util.h.xy.ai.b.mb startTransaction = null;

    /* loaded from: classes18.dex */
    public interface a extends com.sun.jna.Library {

        /* loaded from: classes5.dex */
        public interface ra extends com.sun.jna.Callback {
            int callback(com.sun.jna.Pointer pointer);
        }
    }

    /* renamed from: util.h.xy.ai.b$b, reason: collision with other inner class name */
    /* loaded from: classes18.dex */
    public interface InterfaceC0256b extends com.sun.jna.Library {

        /* renamed from: util.h.xy.ai.b$b$mb */
        public interface mb extends com.sun.jna.Callback {
            int callback(com.sun.jna.Pointer pointer);
        }
    }

    /* loaded from: classes18.dex */
    public interface ma extends com.sun.jna.Library {

        /* loaded from: classes5.dex */
        public interface mb extends com.sun.jna.Callback {
            int callback(com.sun.jna.Pointer pointer, com.sun.jna.Pointer pointer2, com.sun.jna.Pointer pointer3);
        }
    }

    /* loaded from: classes18.dex */
    public interface mc extends com.sun.jna.Library {

        public interface ra extends com.sun.jna.Callback {
            int callback(com.sun.jna.Pointer pointer, com.sun.jna.Pointer pointer2, com.sun.jna.Pointer pointer3);
        }
    }

    /* loaded from: classes18.dex */
    public interface ra extends com.sun.jna.Library {

        /* renamed from: util.h.xy.ai.b$ra$ra, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public interface InterfaceC0257ra extends com.sun.jna.Callback {
            int callback(com.sun.jna.Pointer pointer, com.sun.jna.Pointer pointer2);
        }
    }

    protected final void finalize() {
        int i = getHighSpeedVideoSizes + 75;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            m24600();
            int i2 = getHighSpeedVideoSizes + 35;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            return;
        }
        m24600();
        throw null;
    }

    final class mb extends com.sun.jna.Memory {
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor;

        public mb(long j) {
            super(j);
        }

        @Override // com.sun.jna.Memory
        public final void dispose() {
            int i = getHighSpeedVideoFpsRanges;
            int i2 = ((i | 51) << 1) - (i ^ 51);
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                super.dispose();
                int i3 = getHighSpeedVideoFpsRangesFor + 27;
                getHighSpeedVideoFpsRanges = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
            super.dispose();
            throw null;
        }
    }

    private static int Camera2StreamConfigurationMap() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i + 109) % 128;
        int i2 = i + 37;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return 84;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    protected final void m24606() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 69;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.b.mb mbVar = this.toString;
        if (mbVar != null) {
            getHighSpeedVideoSizes = (i + 85) % 128;
            try {
                mbVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        util.h.xy.ai.b.mb mbVar2 = this.isOutputSupportedForhNQ4ISI;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
                this.isOutputSupportedForhNQ4ISI = null;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 53) % 128;
            } catch (java.lang.Throwable th) {
                this.isOutputSupportedForhNQ4ISI = null;
                throw th;
            }
        }
    }

    private util.h.xy.ai.b.mb getHighSpeedVideoFpsRanges(long j) {
        util.h.xy.ai.b.mb mbVar = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 77) % 128;
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        int i4 = 129620390;
        int i5 = 0;
        while (i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 111) % 128;
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
            i5++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 5) % 128;
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = getHighSpeedVideoSizes + 107;
            getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
            if (i6 % 2 != 0) {
                j2 -= (bArr[i] & 29813) >>> (i - 32);
                i += com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            } else {
                j2 |= (bArr[i] & 255) << (i * 8);
                i++;
            }
        }
        mbVar.setLong(0L, j2);
        return mbVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24608(com.sun.jna.Callback callback) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 89) % 128;
        util.h.xy.ai.b.mb mbVar = this.toString;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.toString = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE);
        int i = getHighResolutionOutputSizeshNQ4ISI + 1;
        getHighSpeedVideoSizes = i % 128;
        util.h.xy.ai.b.mb mbVar2 = new util.h.xy.ai.b.mb(nativeSize + (i % 2 == 0 ? 23433 : 137));
        this.toString = mbVar2;
        Camera2StreamConfigurationMap();
        mbVar2.setPointer(84L, com.sun.jna.CallbackReference.getFunctionPointer(callback));
        util.h.xy.ai.b.mb mbVar3 = this.isOutputSupportedForhNQ4ISI;
        if (mbVar3 != null) {
            int i2 = getHighSpeedVideoSizes + 1;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    mbVar3.dispose();
                } else {
                    mbVar3.dispose();
                    throw null;
                }
            } finally {
                this.isOutputSupportedForhNQ4ISI = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.toString);
        Camera2StreamConfigurationMap();
        this.isOutputSupportedForhNQ4ISI = getHighSpeedVideoFpsRanges(nativeValue + 84);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0090, code lost:
    
        if (r0.f2641 == r0.f2636) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b9, code lost:
    
        r0.f2639 = r0.f2641 / r2;
        r0.f2640 = r0.f2641 % r2;
        r0.f2637 = r0.f2636 / r2;
        r0.f2635 = r0.f2636 % r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d1, code lost:
    
        if (r0.f2640 != r0.f2635) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        util.h.xy.ai.b.getHighSpeedVideoFpsRanges = (util.h.xy.ai.b.getHighSpeedVideoFpsRangesFor + 97) % 128;
        r0.f2639 = ((r0.f2639 + r2) - 1) % r2;
        r0.f2637 = ((r0.f2637 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0107, code lost:
    
        if (r0.f2639 != r0.f2637) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0109, code lost:
    
        util.h.xy.ai.b.getHighSpeedVideoFpsRangesFor = (util.h.xy.ai.b.getHighSpeedVideoFpsRanges + 19) % 128;
        r0.f2640 = ((r0.f2640 + r2) - 1) % r2;
        r0.f2635 = ((r0.f2635 + r2) - 1) % r2;
        r7 = r0.f2639;
        r8 = r0.f2640;
        r9 = r0.f2637;
        r10 = r0.f2635;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0139, code lost:
    
        r7 = r0.f2639;
        r8 = r0.f2635;
        r9 = r0.f2637;
        r10 = r0.f2640;
        r3[r0.f2638] = r1[(r7 * r2) + r8];
        r3[r0.f2638 + 1] = r1[(r9 * r2) + r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        r3[r0.f2638] = (char) (r0.f2641 - r12);
        r3[r0.f2638 + 1] = (char) (r0.f2636 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
    
        if (r0.f2641 == r0.f2636) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Camera2StreamConfigurationMap(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 33) % 128;
        char[] cArr = charArray;
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr2 = Camera2StreamConfigurationMap;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 81) % 128;
                cArr3[i3] = (char) (cArr2[i3] ^ 4042185467053315654L);
            }
            cArr2 = cArr3;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoSizesFor);
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i4 = getHighSpeedVideoFpsRanges + 113;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                i2 = i + 53;
                cArr4[i2] = (char) (cArr[i2] << b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 65) % 128;
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                int i5 = getHighSpeedVideoFpsRanges + 57;
                getHighSpeedVideoFpsRangesFor = i5 % 128;
                if (i5 % 2 == 0) {
                    mcVar.f2641 = cArr[mcVar.f2638];
                    mcVar.f2636 = cArr[mcVar.f2638 + 1];
                } else {
                    mcVar.f2641 = cArr[mcVar.f2638];
                    mcVar.f2636 = cArr[mcVar.f2638 + 1];
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i6 = 0; i6 < i; i6++) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 105) % 128;
            cArr4[i6] = (char) (cArr4[i6] ^ 13722);
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    private static int getHighResolutionOutputSizeshNQ4ISI() {
        int i = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
        getHighSpeedVideoSizes = i;
        int i2 = i + 9;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return 98;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    protected final void m24601() {
        util.h.xy.ai.b.mb mbVar = this.b;
        if (mbVar != null) {
            int i = getHighSpeedVideoSizes + 17;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 == 0) {
                    mbVar.dispose();
                } else {
                    mbVar.dispose();
                    this.b = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.b = null;
            }
        }
        util.h.xy.ai.b.mb mbVar2 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24603(com.sun.jna.Callback callback) {
        util.h.xy.ai.b.mb mbVar = this.b;
        if (mbVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 93) % 128;
            try {
                mbVar.dispose();
            } finally {
                this.b = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE);
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 91;
        getHighSpeedVideoSizes = i2 % 128;
        int i3 = i2 % 2 == 0 ? 4312 : 129;
        int i4 = i + 89;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        util.h.xy.ai.b.mb mbVar2 = new util.h.xy.ai.b.mb(nativeSize + i3);
        this.b = mbVar2;
        getHighResolutionOutputSizeshNQ4ISI();
        mbVar2.setPointer(98L, com.sun.jna.CallbackReference.getFunctionPointer(callback));
        util.h.xy.ai.b.mb mbVar3 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (mbVar3 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 11) % 128;
            try {
                mbVar3.dispose();
            } finally {
                this.getValidOutputFormatsForInputhNQ4ISI = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.b);
        getHighResolutionOutputSizeshNQ4ISI();
        util.h.xy.ai.b.mb mbVar4 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar4.setLong(0L, (nativeValue + 98) ^ 999509883);
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
        this.getValidOutputFormatsForInputhNQ4ISI = mbVar4;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24591() {
        util.h.xy.ai.b.mb mbVar = this.getOutputMinFrameDurationlomOqCM;
        if (mbVar != null) {
            try {
                mbVar.dispose();
                this.getOutputMinFrameDurationlomOqCM = null;
                int i = getHighSpeedVideoSizes + 21;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                int i2 = i % 2;
            } catch (java.lang.Throwable th) {
                this.getOutputMinFrameDurationlomOqCM = null;
                throw th;
            }
        }
        util.h.xy.ai.b.mb mbVar2 = this.getOutputFormats;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        int i3 = getHighResolutionOutputSizeshNQ4ISI + 81;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24598(com.sun.jna.Callback callback) {
        int i = getHighSpeedVideoSizes;
        int i2 = i + 75;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.b.mb mbVar = this.getOutputMinFrameDurationlomOqCM;
        if (mbVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (i + 69) % 128;
            try {
                mbVar.dispose();
            } finally {
                this.getOutputMinFrameDurationlomOqCM = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE);
        int i3 = getHighSpeedVideoSizes + 111;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        util.h.xy.ai.b.mb mbVar2 = new util.h.xy.ai.b.mb(nativeSize + (i3 % 2 != 0 ? 97 : 105));
        this.getOutputMinFrameDurationlomOqCM = mbVar2;
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 55;
        getHighSpeedVideoSizes = i4 % 128;
        mbVar2.setPointer(i4 % 2 == 0 ? 14 : 72, com.sun.jna.CallbackReference.getFunctionPointer(callback));
        util.h.xy.ai.b.mb mbVar3 = this.getOutputFormats;
        if (mbVar3 != null) {
            try {
                mbVar3.dispose();
            } finally {
                this.getOutputFormats = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDurationlomOqCM);
        int i5 = getHighResolutionOutputSizeshNQ4ISI + 55;
        getHighSpeedVideoSizes = i5 % 128;
        long j = nativeValue + (i5 % 2 != 0 ? 72 : 14);
        util.h.xy.ai.b.mb mbVar4 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i6 = 0;
        for (int i7 = 0; i7 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i7++) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            int i8 = i7 * 8;
            bArr[i7] = (byte) (((255 << i8) & j) >> i8);
        }
        int i9 = 1651989008;
        for (int i10 = 0; i10 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i10++) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 5) % 128;
            byte b = bArr[i10];
            bArr[i10] = (byte) (((byte) (i9 & 255)) ^ b);
            i9 = ((i9 << (i10 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i9 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i10 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i11 = getHighSpeedVideoSizes + 119;
            getHighResolutionOutputSizeshNQ4ISI = i11 % 128;
            if (i11 % 2 != 0) {
                j2 -= (bArr[i6] & 2051) >> (i6 + 75);
                i6 += 54;
            } else {
                j2 |= (bArr[i6] & 255) << (i6 * 8);
                i6++;
            }
        }
        mbVar4.setLong(0L, j2);
        this.getOutputFormats = mbVar4;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24596() {
        util.h.xy.ai.b.mb mbVar = this.getOutputMinFrameDuration;
        if (mbVar != null) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 99) % 128;
            try {
                mbVar.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        util.h.xy.ai.b.mb mbVar2 = this.AMEXKernel;
        if (mbVar2 != null) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 27) % 128;
            try {
                mbVar2.dispose();
            } finally {
                this.AMEXKernel = null;
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24613(com.sun.jna.Callback callback) {
        util.h.xy.ai.b.mb mbVar = this.getOutputMinFrameDuration;
        if (mbVar != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 109) % 128;
            try {
                mbVar.dispose();
            } finally {
                this.getOutputMinFrameDuration = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE);
        int i = (getHighResolutionOutputSizeshNQ4ISI + 45) % 128;
        getHighSpeedVideoSizes = i;
        getHighResolutionOutputSizeshNQ4ISI = (i + 105) % 128;
        util.h.xy.ai.b.mb mbVar2 = new util.h.xy.ai.b.mb(nativeSize + 119);
        this.getOutputMinFrameDuration = mbVar2;
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i2 + 75) % 128;
        getHighSpeedVideoSizes = (i2 + 37) % 128;
        mbVar2.setPointer(70L, com.sun.jna.CallbackReference.getFunctionPointer(callback));
        util.h.xy.ai.b.mb mbVar3 = this.AMEXKernel;
        if (mbVar3 != null) {
            try {
                mbVar3.dispose();
                this.AMEXKernel = null;
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
            } catch (java.lang.Throwable th) {
                this.AMEXKernel = null;
                throw th;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputMinFrameDuration);
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i3 + 75) % 128;
        getHighSpeedVideoSizes = (i3 + 37) % 128;
        util.h.xy.ai.b.mb mbVar4 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar4.setLong(0L, 1897977440 ^ (nativeValue + 70));
        int i4 = (getHighResolutionOutputSizeshNQ4ISI + 65) % 128;
        getHighSpeedVideoSizes = i4;
        this.AMEXKernel = mbVar4;
        int i5 = i4 + 99;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    protected final void m24611() {
        int i = (getHighSpeedVideoSizes + 5) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        util.h.xy.ai.b.mb mbVar = this.getInputSizeshNQ4ISI;
        if (mbVar != null) {
            getHighSpeedVideoSizes = (i + 25) % 128;
            try {
                mbVar.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        util.h.xy.ai.b.mb mbVar2 = this.CoroutineDebuggingKt;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.CoroutineDebuggingKt = null;
            }
        }
    }

    private util.h.xy.ai.b.mb getHighSpeedVideoSizes(long j) {
        util.h.xy.ai.b.mb mbVar = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i2 = getHighSpeedVideoSizes + 119;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                bArr[i] = (byte) (((255 >> (i >> 52)) + j) >>> (i >> 79));
                i += 62;
            } else {
                int i3 = i * 8;
                bArr[i] = (byte) (((255 << i3) & j) >> i3);
                i++;
            }
        }
        int i4 = 402972918;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
        long j2 = 0;
        for (int i6 = 0; i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i6++) {
            j2 |= (bArr[i6] & 255) << (i6 * 8);
        }
        mbVar.setLong(0L, j2);
        return mbVar;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24593(com.sun.jna.Callback callback) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 71;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ai.b.mb mbVar = this.getInputSizeshNQ4ISI;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getInputSizeshNQ4ISI = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 81;
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        int i4 = i2 % 2 == 0 ? 21266 : com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
        int i5 = i3 + 93;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        util.h.xy.ai.b.mb mbVar2 = new util.h.xy.ai.b.mb(nativeSize + i4);
        this.getInputSizeshNQ4ISI = mbVar2;
        int i6 = getHighSpeedVideoSizes + 27;
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        mbVar2.setPointer(i6 % 2 != 0 ? 119 : 84, com.sun.jna.CallbackReference.getFunctionPointer(callback));
        util.h.xy.ai.b.mb mbVar3 = this.CoroutineDebuggingKt;
        if (mbVar3 != null) {
            try {
                mbVar3.dispose();
                this.CoroutineDebuggingKt = null;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 5) % 128;
            } catch (java.lang.Throwable th) {
                this.CoroutineDebuggingKt = null;
                throw th;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getInputSizeshNQ4ISI);
        int i7 = getHighSpeedVideoSizes + 27;
        getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
        this.CoroutineDebuggingKt = getHighSpeedVideoSizes(nativeValue + (i7 % 2 == 0 ? 84 : 119));
        int i8 = getHighResolutionOutputSizeshNQ4ISI + 29;
        getHighSpeedVideoSizes = i8 % 128;
        if (i8 % 2 == 0) {
            throw null;
        }
    }

    private static int getHighSpeedVideoFpsRangesFor() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 89;
        getHighSpeedVideoSizes = i2 % 128;
        int i3 = i2 % 2 == 0 ? 0 : 98;
        int i4 = i + 69;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 != 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    protected final void m24610() {
        int i = getHighSpeedVideoSizes + 59;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            util.h.xy.ai.b.mb mbVar = this.getOutputSizes;
            if (mbVar != null) {
                try {
                    mbVar.dispose();
                } finally {
                    this.getOutputSizes = null;
                }
            }
            util.h.xy.ai.b.mb mbVar2 = this.getOutputStallDurationlomOqCM;
            if (mbVar2 != null) {
                int i2 = getHighSpeedVideoSizes + 41;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                try {
                    if (i2 % 2 == 0) {
                        mbVar2.dispose();
                    } else {
                        mbVar2.dispose();
                        throw null;
                    }
                } finally {
                    this.getOutputStallDurationlomOqCM = null;
                }
            }
            util.h.xy.ai.b.mb mbVar3 = this.unwrapAs;
            if (mbVar3 != null) {
                try {
                    mbVar3.dispose();
                    return;
                } finally {
                    this.unwrapAs = null;
                }
            }
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24602(int i) {
        this.getOutputStallDuration = i;
        util.h.xy.ai.b.mb mbVar = this.getOutputSizes;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getOutputSizes = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i2 = getHighSpeedVideoSizes;
        int i3 = i2 + 63;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        int i4 = i3 % 2 != 0 ? 66 : 125;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 15) % 128;
        this.getOutputSizes = new util.h.xy.ai.b.mb(nativeSize + i4);
        util.h.xy.ai.b.mb mbVar2 = this.getOutputStallDurationlomOqCM;
        if (mbVar2 != null) {
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 87;
            getHighSpeedVideoSizes = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    mbVar2.dispose();
                    throw null;
                }
                mbVar2.dispose();
            } finally {
                this.getOutputStallDurationlomOqCM = null;
            }
        }
        util.h.xy.ai.b.mb mbVar3 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.getOutputStallDurationlomOqCM = mbVar3;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.getOutputSizes) + getHighSpeedVideoFpsRangesFor()));
        util.h.xy.ai.b.mb mbVar4 = this.unwrapAs;
        if (mbVar4 != null) {
            try {
                mbVar4.dispose();
                this.unwrapAs = null;
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
            } catch (java.lang.Throwable th) {
                this.unwrapAs = null;
                throw th;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getOutputStallDurationlomOqCM);
        util.h.xy.ai.b.mb mbVar5 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar5.setLong(0L, nativeValue ^ 1272862411);
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
        this.unwrapAs = mbVar5;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24604(java.lang.String str) throws java.io.IOException {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 49) % 128;
        m24599(str, java.nio.charset.Charset.defaultCharset());
        int i = getHighSpeedVideoSizes + 35;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    protected final void m24599(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 25) % 128;
        byte[] bytes = str.getBytes(charset);
        m24602(bytes.length + 1);
        this.getOutputSizes.write(getHighSpeedVideoFpsRangesFor(), bytes, 0, bytes.length);
        this.getOutputSizes.setByte(bytes.length + getHighSpeedVideoFpsRangesFor(), (byte) 0);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 103) % 128;
    }

    private static int getHighSpeedVideoSizes() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 115;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        int i3 = i % 2 == 0 ? 63 : 72;
        int i4 = i2 + 19;
        getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw null;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected final void m24587() {
        util.h.xy.ai.b.mb mbVar = this.ArtificialStackFrames;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        util.h.xy.ai.b.mb mbVar2 = this.isOutputSupportedFor;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.b.mb mbVar3 = this.f7070a;
        if (mbVar3 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 73) % 128;
            try {
                mbVar3.dispose();
                this.f7070a = null;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 85) % 128;
            } catch (java.lang.Throwable th) {
                this.f7070a = null;
                throw th;
            }
        }
    }

    private util.h.xy.ai.b.mb getHighSpeedVideoFpsRangesFor(long j) {
        util.h.xy.ai.b.mb mbVar = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        int i = 0;
        for (int i2 = 0; i2 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i2++) {
            int i3 = i2 * 8;
            bArr[i2] = (byte) (((255 << i3) & j) >> i3);
        }
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 47) % 128;
        int i4 = 1925341536;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            byte b = bArr[i5];
            bArr[i5] = (byte) (((byte) (i4 & 255)) ^ b);
            i4 = ((i4 << (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i4 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i5 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        while (i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            int i6 = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
            getHighSpeedVideoSizes = i6;
            j2 |= (bArr[i] & 255) << (i * 8);
            i++;
            getHighResolutionOutputSizeshNQ4ISI = (i6 + 61) % 128;
        }
        mbVar.setLong(0L, j2);
        return mbVar;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24607(int i) {
        int i2 = (getHighSpeedVideoSizes + 5) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getOutputSizeshNQ4ISI = i;
        util.h.xy.ai.b.mb mbVar = this.ArtificialStackFrames;
        if (mbVar != null) {
            int i3 = i2 + 37;
            getHighSpeedVideoSizes = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    mbVar.dispose();
                    throw null;
                }
                mbVar.dispose();
            } finally {
                this.ArtificialStackFrames = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE) * i;
        int i4 = (getHighSpeedVideoSizes + 81) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        getHighSpeedVideoSizes = (i4 + 17) % 128;
        this.ArtificialStackFrames = new util.h.xy.ai.b.mb(nativeSize + 101);
        util.h.xy.ai.b.mb mbVar2 = this.isOutputSupportedFor;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.isOutputSupportedFor = null;
            }
        }
        util.h.xy.ai.b.mb mbVar3 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.isOutputSupportedFor = mbVar3;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(com.sun.jna.Pointer.nativeValue(this.ArtificialStackFrames) + getHighSpeedVideoSizes()));
        util.h.xy.ai.b.mb mbVar4 = this.f7070a;
        if (mbVar4 != null) {
            int i5 = getHighResolutionOutputSizeshNQ4ISI + 15;
            getHighSpeedVideoSizes = i5 % 128;
            try {
                if (i5 % 2 == 0) {
                    mbVar4.dispose();
                    this.f7070a = null;
                    throw new java.lang.ArithmeticException();
                }
                mbVar4.dispose();
            } finally {
                this.f7070a = null;
            }
        }
        this.f7070a = getHighSpeedVideoFpsRangesFor(com.sun.jna.Pointer.nativeValue(this.isOutputSupportedFor));
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m24609(java.lang.String str) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 39) % 128;
        m24594(str, java.nio.charset.Charset.defaultCharset());
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    protected final void m24594(java.lang.String str, java.nio.charset.Charset charset) throws java.io.IOException {
        int i = getHighSpeedVideoSizes + 49;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            byte[] bytes = str.getBytes(charset);
            m24607(bytes.length >>> 1);
            util.h.xy.ai.b.mb mbVar = this.ArtificialStackFrames;
            getHighSpeedVideoSizes();
            mbVar.write(0L, bytes, 0, bytes.length);
            this.ArtificialStackFrames.setByte(bytes.length * getHighSpeedVideoSizes(), (byte) 1);
        } else {
            byte[] bytes2 = str.getBytes(charset);
            m24607(bytes2.length + 1);
            this.ArtificialStackFrames.write(getHighSpeedVideoSizes(), bytes2, 0, bytes2.length);
            this.ArtificialStackFrames.setByte(bytes2.length + getHighSpeedVideoSizes(), (byte) 0);
        }
        int i2 = getHighSpeedVideoSizes + 111;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    protected final void m24586() {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 89) % 128;
        util.h.xy.ai.b.mb mbVar = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
            }
        }
        util.h.xy.ai.b.mb mbVar2 = this.resetTransaction;
        if (mbVar2 != null) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 59) % 128;
            try {
                mbVar2.dispose();
                this.resetTransaction = null;
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 3) % 128;
            } catch (java.lang.Throwable th) {
                this.resetTransaction = null;
                throw th;
            }
        }
        util.h.xy.ai.b.mb mbVar3 = this.release;
        if (mbVar3 != null) {
            try {
                mbVar3.dispose();
            } finally {
                this.release = null;
            }
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m24612(int i) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 41) % 128;
        this.coroutineBoundary = i;
        util.h.xy.ai.b.mb mbVar = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 33;
        getHighSpeedVideoSizes = i2 % 128;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = new util.h.xy.ai.b.mb(nativeSize + (i2 % 2 == 0 ? 25128 : com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE));
        util.h.xy.ai.b.mb mbVar2 = this.resetTransaction;
        if (mbVar2 != null) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 69) % 128;
            try {
                mbVar2.dispose();
                this.resetTransaction = null;
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 1) % 128;
            } catch (java.lang.Throwable th) {
                this.resetTransaction = null;
                throw th;
            }
        }
        util.h.xy.ai.b.mb mbVar3 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.resetTransaction = mbVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        int i3 = (getHighSpeedVideoSizes + 87) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i3;
        getHighSpeedVideoSizes = (i3 + 79) % 128;
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 88));
        util.h.xy.ai.b.mb mbVar4 = this.release;
        if (mbVar4 != null) {
            try {
                mbVar4.dispose();
            } finally {
                this.release = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.resetTransaction);
        util.h.xy.ai.b.mb mbVar5 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 55) % 128;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 81) % 128;
            int i5 = i4 * 8;
            bArr[i4] = (byte) (((255 << i5) & nativeValue2) >> i5);
        }
        int i6 = 1852128913;
        for (int i7 = 0; i7 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i7++) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 93) % 128;
            byte b = bArr[i7];
            bArr[i7] = (byte) (((byte) (i6 & 255)) ^ b);
            i6 = ((i6 << (i7 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i6 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i7 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j = 0;
        for (int i8 = 0; i8 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i8++) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 105) % 128;
            j |= (bArr[i8] & 255) << (i8 * 8);
        }
        mbVar5.setLong(0L, j);
        this.release = mbVar5;
        int i9 = getHighSpeedVideoSizes + 19;
        getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
        if (i9 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m24605(int[] iArr) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 53) % 128;
        m24612(iArr.length);
        util.h.xy.ai.b.mb mbVar = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        int i = (getHighSpeedVideoSizes + 87) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i;
        getHighSpeedVideoSizes = (i + 79) % 128;
        mbVar.write(88L, iArr, 0, iArr.length);
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 101;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected final void m24585() {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
        util.h.xy.ai.b.mb mbVar = this.coroutineCreation;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        util.h.xy.ai.b.mb mbVar2 = this.getInputFormats;
        if (mbVar2 != null) {
            int i = getHighSpeedVideoSizes + 65;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 == 0) {
                    mbVar2.dispose();
                } else {
                    mbVar2.dispose();
                    throw null;
                }
            } finally {
                this.getInputFormats = null;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24592(int i) {
        int i2 = (getHighSpeedVideoSizes + 73) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        util.h.xy.ai.b.mb mbVar = this.coroutineCreation;
        if (mbVar != null) {
            int i3 = i2 + 105;
            getHighSpeedVideoSizes = i3 % 128;
            try {
                if (i3 % 2 == 0) {
                    mbVar.dispose();
                    throw null;
                }
                mbVar.dispose();
            } finally {
                this.coroutineCreation = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i4 = (getHighSpeedVideoSizes + 59) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i4;
        getHighSpeedVideoSizes = (i4 + 23) % 128;
        util.h.xy.ai.b.mb mbVar2 = new util.h.xy.ai.b.mb(nativeSize + 153);
        this.coroutineCreation = mbVar2;
        int i5 = getHighSpeedVideoSizes + 5;
        getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
        mbVar2.setInt(i5 % 2 != 0 ? 119 : 102, i);
        util.h.xy.ai.b.mb mbVar3 = this.getInputFormats;
        if (mbVar3 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 121) % 128;
            try {
                mbVar3.dispose();
            } finally {
                this.getInputFormats = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.coroutineCreation);
        int i6 = getHighSpeedVideoSizes + 5;
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        long j = nativeValue + (i6 % 2 == 0 ? 102 : 119);
        util.h.xy.ai.b.mb mbVar4 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        mbVar4.setLong(0L, j ^ 357124391);
        int i7 = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i7 + 101) % 128;
        this.getInputFormats = mbVar4;
        getHighResolutionOutputSizeshNQ4ISI = (i7 + 19) % 128;
    }

    private static int getOutputFormats() {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i + 33) % 128;
        int i2 = i + 67;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return 76;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    protected final void m24614() {
        util.h.xy.ai.b.mb mbVar = this.kernelVersion;
        if (mbVar != null) {
            int i = getHighSpeedVideoSizes + 79;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            try {
                if (i % 2 == 0) {
                    mbVar.dispose();
                } else {
                    mbVar.dispose();
                    this.kernelVersion = null;
                    throw new java.lang.ArithmeticException();
                }
            } finally {
                this.kernelVersion = null;
            }
        }
        util.h.xy.ai.b.mb mbVar2 = this.d;
        if (mbVar2 != null) {
            try {
                mbVar2.dispose();
            } finally {
                this.d = null;
            }
        }
        util.h.xy.ai.b.mb mbVar3 = this._BOUNDARY;
        if (mbVar3 != null) {
            try {
                mbVar3.dispose();
                this._BOUNDARY = null;
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 9) % 128;
            } catch (java.lang.Throwable th) {
                this._BOUNDARY = null;
                throw th;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m24597(int i) {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
        this.accessartificialFrame = i;
        util.h.xy.ai.b.mb mbVar = this.kernelVersion;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.kernelVersion = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) * i;
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 59;
        getHighSpeedVideoSizes = i2 % 128;
        this.kernelVersion = new util.h.xy.ai.b.mb(nativeSize + (i2 % 2 == 0 ? 81 : 107));
        util.h.xy.ai.b.mb mbVar2 = this.d;
        if (mbVar2 != null) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
            try {
                mbVar2.dispose();
            } finally {
                this.d = null;
            }
        }
        util.h.xy.ai.b.mb mbVar3 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        this.d = mbVar3;
        long nativeValue = com.sun.jna.Pointer.nativeValue(this.kernelVersion);
        getOutputFormats();
        mbVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 76));
        util.h.xy.ai.b.mb mbVar4 = this._BOUNDARY;
        if (mbVar4 != null) {
            try {
                mbVar4.dispose();
            } finally {
                this._BOUNDARY = null;
            }
        }
        long nativeValue2 = com.sun.jna.Pointer.nativeValue(this.d);
        util.h.xy.ai.b.mb mbVar5 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i3 = 0; i3 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i3++) {
            int i4 = i3 * 8;
            bArr[i3] = (byte) (((255 << i4) & nativeValue2) >> i4);
        }
        int i5 = 963282637;
        int i6 = 0;
        while (i6 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 115) % 128;
            byte b = bArr[i6];
            bArr[i6] = (byte) (((byte) (i5 & 255)) ^ b);
            i5 = ((i5 << (i6 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i5 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i6 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
            i6++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 9) % 128;
        }
        long j = 0;
        for (int i7 = 0; i7 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i7++) {
            j |= (bArr[i7] & 255) << (i7 * 8);
        }
        mbVar5.setLong(0L, j);
        this._BOUNDARY = mbVar5;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m24595(long[] jArr) throws java.io.IOException {
        int i = getHighResolutionOutputSizeshNQ4ISI + 91;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            m24597(jArr.length);
            util.h.xy.ai.b.mb mbVar = this.kernelVersion;
            int outputFormats = 0 / getOutputFormats();
            mbVar.write(0L, jArr, 1, jArr.length);
            return;
        }
        m24597(jArr.length);
        util.h.xy.ai.b.mb mbVar2 = this.kernelVersion;
        getOutputFormats();
        mbVar2.write(76L, jArr, 0, jArr.length);
    }

    private static int getHighSpeedVideoFpsRanges() {
        int i = getHighSpeedVideoSizes;
        getHighResolutionOutputSizeshNQ4ISI = (i + 53) % 128;
        int i2 = i + 59;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            return 80;
        }
        throw null;
    }

    /* renamed from: ˈ, reason: contains not printable characters */
    protected final void m24589() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 3;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ai.b.mb mbVar = this._CREATION;
        if (mbVar != null) {
            int i3 = i2 + 61;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    mbVar.dispose();
                    this._CREATION = null;
                    throw new java.lang.ArithmeticException();
                }
                mbVar.dispose();
            } finally {
                this._CREATION = null;
            }
        }
        util.h.xy.ai.b.mb mbVar2 = this.c;
        if (mbVar2 != null) {
            int i4 = getHighSpeedVideoSizes + 51;
            getHighResolutionOutputSizeshNQ4ISI = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    mbVar2.dispose();
                } else {
                    mbVar2.dispose();
                    throw null;
                }
            } finally {
                this.c = null;
            }
        }
    }

    private util.h.xy.ai.b.mb getHighResolutionOutputSizeshNQ4ISI(long j) {
        util.h.xy.ai.b.mb mbVar = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 1400229394;
        for (int i4 = 0; i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i4++) {
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
        }
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        mbVar.setLong(0L, j2);
        int i6 = getHighResolutionOutputSizeshNQ4ISI + 25;
        getHighSpeedVideoSizes = i6 % 128;
        if (i6 % 2 != 0) {
            return mbVar;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ι, reason: contains not printable characters */
    public final void m24615(int i) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 25) % 128;
        util.h.xy.ai.b.mb mbVar = this._CREATION;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this._CREATION = null;
            }
        }
        int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
        int i2 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i2 + 37) % 128;
        int i3 = i2 + 93;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.ai.b.mb mbVar2 = new util.h.xy.ai.b.mb(nativeSize + 121);
        this._CREATION = mbVar2;
        getHighSpeedVideoFpsRanges();
        mbVar2.setInt(80L, i);
        util.h.xy.ai.b.mb mbVar3 = this.c;
        if (mbVar3 != null) {
            try {
                mbVar3.dispose();
            } finally {
                this.c = null;
            }
        }
        long nativeValue = com.sun.jna.Pointer.nativeValue(this._CREATION);
        getHighSpeedVideoFpsRanges();
        this.c = getHighResolutionOutputSizeshNQ4ISI(nativeValue + 80);
        int i4 = getHighResolutionOutputSizeshNQ4ISI + 45;
        getHighSpeedVideoSizes = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ʿ, reason: contains not printable characters */
    protected final void m24588() {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 35) % 128;
        util.h.xy.ai.b.mb mbVar = this.AMEXKernela;
        if (mbVar != null) {
            try {
                mbVar.dispose();
            } finally {
                this.AMEXKernela = null;
            }
        }
        util.h.xy.ai.b.mb mbVar2 = this.init;
        if (mbVar2 != null) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 61) % 128;
            try {
                mbVar2.dispose();
            } finally {
                this.init = null;
            }
        }
        util.h.xy.ai.b.mb mbVar3 = this.startTransaction;
        if (mbVar3 != null) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
            try {
                mbVar3.dispose();
            } finally {
                this.startTransaction = null;
            }
        }
    }

    private util.h.xy.ai.b.mb Camera2StreamConfigurationMap(long j) {
        util.h.xy.ai.b.mb mbVar = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
        byte[] bArr = new byte[com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)];
        for (int i = 0; i < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i++) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 53) % 128;
            int i2 = i * 8;
            bArr[i] = (byte) (((255 << i2) & j) >> i2);
        }
        int i3 = 1624624912;
        int i4 = 0;
        while (i4 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE)) {
            byte b = bArr[i4];
            bArr[i4] = (byte) (((byte) (i3 & 255)) ^ b);
            i3 = ((i3 << (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))) | (i3 >>> (((com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8) - 1) - (i4 % (com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE) * 8))))) * (~(b & 255));
            i4++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 69) % 128;
        }
        long j2 = 0;
        for (int i5 = 0; i5 < com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE) / com.sun.jna.Native.getNativeSize(java.lang.Byte.TYPE); i5++) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 49) % 128;
            j2 |= (bArr[i5] & 255) << (i5 * 8);
        }
        mbVar.setLong(0L, j2);
        return mbVar;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public final int m24590() throws java.io.IOException {
        if (this.isOutputSupportedForhNQ4ISI != null && this.getValidOutputFormatsForInputhNQ4ISI != null && this.getOutputFormats != null) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoSizes = (i + 43) % 128;
            if (this.AMEXKernel != null) {
                int i2 = (i + 115) % 128;
                getHighSpeedVideoSizes = i2;
                if (this.CoroutineDebuggingKt != null && this.unwrapAs != null && this.f7070a != null && this.release != null) {
                    int i3 = (i2 + 65) % 128;
                    getHighResolutionOutputSizeshNQ4ISI = i3;
                    if (this.getInputFormats != null) {
                        int i4 = i3 + 81;
                        getHighSpeedVideoSizes = i4 % 128;
                        if (i4 % 2 == 0) {
                            throw new java.lang.ArithmeticException();
                        }
                        if (this._BOUNDARY != null && this.c != null) {
                            util.h.xy.ai.b.mb mbVar = this.AMEXKernela;
                            if (mbVar != null) {
                                try {
                                    mbVar.dispose();
                                } finally {
                                    this.AMEXKernela = null;
                                }
                            }
                            int nativeSize = com.sun.jna.Native.getNativeSize(java.lang.Integer.TYPE);
                            int i5 = getHighSpeedVideoSizes + 1;
                            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
                            this.AMEXKernela = new util.h.xy.ai.b.mb(nativeSize + (i5 % 2 != 0 ? 107 : 113));
                            util.h.xy.ai.b.mb mbVar2 = this.init;
                            if (mbVar2 != null) {
                                try {
                                    mbVar2.dispose();
                                } finally {
                                    this.init = null;
                                }
                            }
                            util.h.xy.ai.b.mb mbVar3 = new util.h.xy.ai.b.mb(com.sun.jna.Native.getNativeSize(java.lang.Long.TYPE));
                            this.init = mbVar3;
                            long nativeValue = com.sun.jna.Pointer.nativeValue(this.AMEXKernela);
                            int i6 = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
                            getHighSpeedVideoSizes = i6;
                            getHighResolutionOutputSizeshNQ4ISI = (i6 + 101) % 128;
                            mbVar3.setPointer(0L, new com.sun.jna.Pointer(nativeValue + 74));
                            util.h.xy.ai.b.mb mbVar4 = this.startTransaction;
                            if (mbVar4 != null) {
                                try {
                                    mbVar4.dispose();
                                } finally {
                                    this.startTransaction = null;
                                }
                            }
                            this.startTransaction = Camera2StreamConfigurationMap(com.sun.jna.Pointer.nativeValue(this.init));
                            util.h.xy.ai.n.Camera2StreamConfigurationMap._KBBeBVsz3au5Hjv4VoBJsa(this.startTransaction, this.isOutputSupportedForhNQ4ISI, this.getValidOutputFormatsForInputhNQ4ISI, this.getOutputFormats, this.AMEXKernel, this.CoroutineDebuggingKt, this.unwrapAs, this.f7070a, this.release, this.getInputFormats, this._BOUNDARY, this.c);
                            int[] iArr = new int[1];
                            util.h.xy.ai.b.mb mbVar5 = this.AMEXKernela;
                            int i7 = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
                            getHighSpeedVideoSizes = i7;
                            getHighResolutionOutputSizeshNQ4ISI = (i7 + 101) % 128;
                            mbVar5.read(74L, iArr, 0, 1);
                            return iArr[0];
                        }
                    }
                }
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((byte) (122 - (android.view.ViewConfiguration.getTapTimeout() >> 16)), "\u0011\u0016\u0006\r\u0017\u000f\u000f\u0010\u0014\u0000\u000f\u0010\u0014\u0000\u000e\u0018\u000e\u0012\r\u000b\f\u000b\u0012\r\u0015\u0018\r\u000f\u0010\u000f\u000e\u0012\r\u0001\f\t\u0016\n\u000b\f\t\u000b\u0003\r\u0015\u0000\b\u0012\u0006\r", 49 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr);
        throw new java.io.IOException(((java.lang.String) objArr[0]).intern());
    }

    /* renamed from: ˌ, reason: contains not printable characters */
    public final void m24600() {
        int i = getHighSpeedVideoSizes + 97;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            m24606();
            m24601();
            m24591();
            m24596();
            m24611();
            m24610();
            m24587();
            m24586();
            m24585();
            m24614();
            m24589();
            m24588();
            return;
        }
        m24606();
        m24601();
        m24591();
        m24596();
        m24611();
        m24610();
        m24587();
        m24586();
        m24585();
        m24614();
        m24589();
        m24588();
        throw null;
    }
}
