package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class av extends util.h.xy.dh.rk {
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private int Camera2StreamConfigurationMap;

    @Override // util.h.xy.dh.rk, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 117) << 1) - (i ^ 117);
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        int i3 = i + 89;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 != 0) {
            return this;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r3 = util.h.xy.dh.av.getHighSpeedVideoFpsRanges;
        r4 = ((r3 & 105) + (r3 | 105)) % 128;
        util.h.xy.dh.av.getHighSpeedVideoFpsRangesFor = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r0 > 16) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        r3 = new util.h.xy.dh.mi[r0];
        util.h.xy.dh.av.getHighSpeedVideoFpsRanges = ((r4 ^ 7) + ((r4 & 7) << 1)) % 128;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r4 >= r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        r6 = r7.f1212[r4].mo26279().getHighSpeedVideoFpsRangesFor();
        r3[r4] = r6;
        r5 = (r5 - (~r6.getHighSpeedVideoFpsRanges(true))) - 1;
        r4 = (r4 & 1) + (r4 | 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r7.Camera2StreamConfigurationMap = r5;
        r8.getHighSpeedVideoFpsRanges(r5);
        r8 = util.h.xy.dh.av.getHighSpeedVideoFpsRanges;
        util.h.xy.dh.av.getHighSpeedVideoFpsRangesFor = ((r8 & 11) + (r8 | 11)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r1 >= r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        r8 = util.h.xy.dh.av.getHighSpeedVideoFpsRangesFor + 69;
        util.h.xy.dh.av.getHighSpeedVideoFpsRanges = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
    
        if ((r8 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:
    
        r9.getHighSpeedVideoFpsRangesFor(r3[r1], true);
        r1 = (r1 ^ 1) + ((r1 & 1) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        r9.getHighSpeedVideoFpsRangesFor(r3[r1], true);
        r1 = r1 + 30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002d, code lost:
    
        if (r7.Camera2StreamConfigurationMap < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r7.Camera2StreamConfigurationMap < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x009b, code lost:
    
        r8.getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes());
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x00a2, code lost:
    
        if (r1 >= r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00a4, code lost:
    
        util.h.xy.dh.av.getHighSpeedVideoFpsRangesFor = (util.h.xy.dh.av.getHighSpeedVideoFpsRanges + 91) % 128;
        r9.getHighSpeedVideoFpsRangesFor(r7.f1212[r1].mo26279(), true);
        r1 = r1 + 1;
     */
    @Override // util.h.xy.dh.mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        util.h.xy.dh.am highSpeedVideoFpsRanges;
        int length;
        int i = getHighSpeedVideoFpsRanges + 109;
        getHighSpeedVideoFpsRangesFor = i % 128;
        int i2 = 0;
        if (i % 2 == 0) {
            rjVar.getHighSpeedVideoSizes(z, 89);
            highSpeedVideoFpsRanges = rjVar.getHighSpeedVideoFpsRanges();
            length = this.f1212.length;
        } else {
            rjVar.getHighSpeedVideoSizes(z, 49);
            highSpeedVideoFpsRanges = rjVar.getHighSpeedVideoFpsRanges();
            length = this.f1212.length;
        }
        int i3 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoFpsRangesFor = ((i3 & 17) + (i3 | 17)) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = (i ^ 49) + ((i & 49) << 1);
        getHighSpeedVideoFpsRanges = i2 % 128;
        int highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (i2 % 2 == 0) {
            return util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, highSpeedVideoSizes);
        }
        util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, highSpeedVideoSizes);
        throw null;
    }

    private int getHighSpeedVideoSizes() throws java.io.IOException {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = ((i ^ 77) + ((i & 77) << 1)) % 128;
        if (this.Camera2StreamConfigurationMap < 0) {
            getHighSpeedVideoFpsRanges = ((i ^ 57) + ((i & 57) << 1)) % 128;
            int length = this.f1212.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3 = (((i3 | (-28)) << 1) - (i3 ^ (-28))) + 29) {
                int i4 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoFpsRangesFor = ((i4 & 57) + (i4 | 57)) % 128;
                i2 = (i2 - (~(-(-this.f1212[i3].mo26279().getHighSpeedVideoFpsRangesFor().getHighSpeedVideoFpsRanges(true))))) - 1;
            }
            this.Camera2StreamConfigurationMap = i2;
        }
        int i5 = this.Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 61) % 128;
        return i5;
    }

    av(boolean z, util.h.xy.dh.c[] cVarArr) {
        super(z, cVarArr);
        this.Camera2StreamConfigurationMap = -1;
    }

    public av(util.h.xy.dh.d dVar) {
        super(dVar, false);
        this.Camera2StreamConfigurationMap = -1;
    }

    public av() {
        this.Camera2StreamConfigurationMap = -1;
    }
}
