package util.h.xy.aa;

/* loaded from: classes5.dex */
public class mb {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 117;
    private final com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifierInput getHighResolutionOutputSizeshNQ4ISI;
    private final android.content.Context getHighSpeedVideoSizes;

    /* loaded from: classes18.dex */
    public static abstract class ra {
        private static int getHighSpeedVideoFpsRangesFor = 0;
        private static int getHighSpeedVideoSizes = 1;

        /* renamed from: ˊ, reason: contains not printable characters */
        public void mo24519(int i, java.lang.CharSequence charSequence) {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 15) % 128;
        }

        /* renamed from: ˎ, reason: contains not printable characters */
        public void mo24521(int i, java.lang.CharSequence charSequence) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 71) % 128;
        }

        /* renamed from: ᐝ, reason: contains not printable characters */
        public void mo24522(boolean z, long j) {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = ((i | 29) << 1) - (i ^ 29);
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        public void mo24520() {
            int i = getHighSpeedVideoFpsRangesFor + 73;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
    }

    mb(android.content.Context context, com.gemalto.mfs.mwsdk.cdcvm.DeviceCVMVerifierInput deviceCVMVerifierInput) {
        this.getHighSpeedVideoSizes = context;
        this.getHighResolutionOutputSizeshNQ4ISI = deviceCVMVerifierInput;
    }

    static com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport getHighResolutionOutputSizeshNQ4ISI(android.content.Context context) {
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 41) % 128;
        com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport m24528 = util.h.xy.aa.md.m24524(context).m24528();
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i & 27) + (i | 27);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return m24528;
        }
        throw null;
    }

    static com.gemalto.mfs.mwsdk.cdcvm.BiometricsSupport getHighSpeedVideoSizes(android.content.Context context) {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 65) + (i | 65);
        getHighSpeedVideoFpsRanges = i2 % 128;
        util.h.xy.aa.md m24524 = util.h.xy.aa.md.m24524(context);
        if (i2 % 2 == 0) {
            return m24524.m24529();
        }
        m24524.m24529();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        getHighSpeedVideoSizes(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0063, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0064, code lost:
    
        getHighSpeedVideoFpsRanges(r1, r5);
        r5 = util.h.xy.aa.mb.getHighSpeedVideoFpsRangesFor + 65;
        util.h.xy.aa.mb.getHighSpeedVideoFpsRanges = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if ((r5 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        r5 = 5 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        r0 = util.h.xy.aa.mb.getHighSpeedVideoFpsRangesFor;
        util.h.xy.aa.mb.getHighSpeedVideoFpsRanges = ((r0 & 89) + (r0 | 89)) % 128;
        getHighResolutionOutputSizeshNQ4ISI(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT > 29) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (android.os.Build.VERSION.SDK_INT > 97) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (android.os.Build.VERSION.SDK_INT != 29) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        r0 = util.h.xy.aa.mb.getHighSpeedVideoFpsRangesFor;
        r2 = ((r0 | 47) << 1) - (r0 ^ 47);
        util.h.xy.aa.mb.getHighSpeedVideoFpsRanges = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
    
        if ((r2 % 2) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        getHighSpeedVideoSizes(r1, r5);
        r5 = util.h.xy.aa.mb.getHighSpeedVideoFpsRanges;
        util.h.xy.aa.mb.getHighSpeedVideoFpsRangesFor = ((r5 & 27) + (r5 | 27)) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighSpeedVideoFpsRangesFor(util.h.xy.aa.mb.ra raVar) {
        util.h.xy.aa.ra raVar2;
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i & 7) + (i | 7);
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 != 0) {
            raVar2 = (util.h.xy.aa.ra) this.getHighResolutionOutputSizeshNQ4ISI.getDeviceCVMCancellationSignal();
        } else {
            raVar2 = (util.h.xy.aa.ra) this.getHighResolutionOutputSizeshNQ4ISI.getDeviceCVMCancellationSignal();
        }
    }

    private void getHighSpeedVideoSizes(util.h.xy.aa.ra raVar, util.h.xy.aa.mb.ra raVar2) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i ^ 85) + ((i & 85) << 1)) % 128;
        util.h.xy.aa.md.m24524(this.getHighSpeedVideoSizes).m24526(this.getHighResolutionOutputSizeshNQ4ISI, raVar, raVar2);
        int i2 = getHighSpeedVideoFpsRanges + 93;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.aa.ra raVar, util.h.xy.aa.mb.ra raVar2) {
        int i = getHighSpeedVideoFpsRangesFor + 29;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 == 0) {
            util.h.xy.aa.md.m24524(this.getHighSpeedVideoSizes).m24532(this.getHighResolutionOutputSizeshNQ4ISI, raVar, raVar2);
            int i2 = getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = (((i2 | 57) << 1) - (i2 ^ 57)) % 128;
            return;
        }
        util.h.xy.aa.md.m24524(this.getHighSpeedVideoSizes).m24532(this.getHighResolutionOutputSizeshNQ4ISI, raVar, raVar2);
        throw new java.lang.ArithmeticException();
    }

    private void getHighSpeedVideoFpsRanges(util.h.xy.aa.ra raVar, util.h.xy.aa.mb.ra raVar2) {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i & 15) + (i | 15)) % 128;
        util.h.xy.aa.md.m24524(this.getHighSpeedVideoSizes).m24527(raVar, raVar2);
        int i2 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = (((i2 | 113) << 1) - (i2 ^ 113)) % 128;
    }
}
