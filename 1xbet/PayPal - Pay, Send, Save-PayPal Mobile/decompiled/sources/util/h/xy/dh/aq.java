package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class aq extends util.h.xy.dh.l {
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoSizes;
    private int getHighResolutionOutputSizeshNQ4ISI;

    @Override // util.h.xy.dh.l, util.h.xy.dh.mi
    final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 9) + ((i & 9) << 1);
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        getHighSpeedVideoFpsRanges = (i3 + 31) % 128;
        return this;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rk getHighSpeedVideoSizes() {
        util.h.xy.dh.av avVar = new util.h.xy.dh.av(false, getInputFormats());
        int i = getHighSpeedVideoFpsRanges;
        int i2 = (i ^ 7) + ((i & 7) << 1);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return avVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rh getOutputFormats() {
        util.h.xy.dh.mz mzVar = new util.h.xy.dh.mz(util.h.xy.dh.rr.getHighSpeedVideoFpsRangesFor(getOutputStallDuration()));
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i ^ 37) + ((i & 37) << 1)) % 128;
        return mzVar;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.rd getInputSizeshNQ4ISI() {
        util.h.xy.dh.an anVar = new util.h.xy.dh.an(this);
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 85) << 1) - (i ^ 85);
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return anVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.l
    final util.h.xy.dh.ma getHighSpeedVideoFpsRanges() {
        util.h.xy.dh.ai aiVar = new util.h.xy.dh.ai(util.h.xy.dh.rq.getHighSpeedVideoSizes(getOutputMinFrameDuration()));
        int i = getHighSpeedVideoSizes + 51;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            return aiVar;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        util.h.xy.dh.aq.getHighSpeedVideoFpsRanges = (util.h.xy.dh.aq.getHighSpeedVideoSizes + 21) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r1 > 16) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        r3 = new util.h.xy.dh.mi[r1];
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r4 >= r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        r6 = r8.getHighSpeedVideoFpsRangesFor[r4].mo26279().getHighSpeedVideoFpsRangesFor();
        r3[r4] = r6;
        r5 = (r5 - (~r6.getHighSpeedVideoFpsRanges(true))) - 1;
        r4 = r4 + 1;
        r6 = util.h.xy.dh.aq.getHighSpeedVideoSizes;
        util.h.xy.dh.aq.getHighSpeedVideoFpsRanges = (((r6 | 83) << 1) - (r6 ^ 83)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r8.getHighResolutionOutputSizeshNQ4ISI = r5;
        r9.getHighSpeedVideoFpsRanges(r5);
        r9 = util.h.xy.dh.aq.getHighSpeedVideoSizes;
        util.h.xy.dh.aq.getHighSpeedVideoFpsRanges = (((r9 | 33) << 1) - (r9 ^ 33)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r0 >= r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        r10.getHighSpeedVideoFpsRangesFor(r3[r0], true);
        r0 = (r0 & 1) + (r0 | 1);
        util.h.xy.dh.aq.getHighSpeedVideoSizes = (util.h.xy.dh.aq.getHighSpeedVideoFpsRanges + 85) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        if (r8.getHighResolutionOutputSizeshNQ4ISI < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (r8.getHighResolutionOutputSizeshNQ4ISI < 0) goto L9;
     */
    @Override // util.h.xy.dh.mi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        util.h.xy.dh.am highSpeedVideoFpsRanges;
        int length;
        int i = getHighSpeedVideoFpsRanges;
        int i2 = ((i | 51) << 1) - (i ^ 51);
        getHighSpeedVideoSizes = i2 % 128;
        int i3 = 0;
        if (i2 % 2 != 0) {
            rjVar.getHighSpeedVideoSizes(z, 49);
            highSpeedVideoFpsRanges = rjVar.getHighSpeedVideoFpsRanges();
            length = this.getHighSpeedVideoFpsRangesFor.length;
        } else {
            rjVar.getHighSpeedVideoSizes(z, 48);
            highSpeedVideoFpsRanges = rjVar.getHighSpeedVideoFpsRanges();
            length = this.getHighSpeedVideoFpsRangesFor.length;
        }
        rjVar.getHighSpeedVideoFpsRanges(getOutputMinFrameDurationlomOqCM());
        while (i3 < length) {
            highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor[i3].mo26279(), true);
            int i4 = (i3 & (-125)) + (i3 | (-125));
            i3 = (i4 ^ 126) + ((i4 & 126) << 1);
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 29) % 128;
        }
        int i5 = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i5 & 99) + (i5 | 99)) % 128;
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoFpsRanges;
        getHighSpeedVideoSizes = ((i & 5) + (i | 5)) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, getOutputMinFrameDurationlomOqCM());
        int i2 = getHighSpeedVideoSizes;
        getHighSpeedVideoFpsRanges = ((i2 & 55) + (i2 | 55)) % 128;
        return highSpeedVideoFpsRangesFor;
    }

    private int getOutputMinFrameDurationlomOqCM() throws java.io.IOException {
        int i = getHighSpeedVideoSizes;
        int i2 = (((i | 21) << 1) - (i ^ 21)) % 128;
        getHighSpeedVideoFpsRanges = i2;
        if (this.getHighResolutionOutputSizeshNQ4ISI < 0) {
            getHighSpeedVideoSizes = (((i2 | 69) << 1) - (i2 ^ 69)) % 128;
            int length = this.getHighSpeedVideoFpsRangesFor.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = getHighSpeedVideoFpsRanges;
                getHighSpeedVideoSizes = ((i5 ^ 125) + ((i5 & 125) << 1)) % 128;
                int highSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRangesFor[i4].mo26279().getHighSpeedVideoFpsRangesFor().getHighSpeedVideoFpsRanges(true);
                i3 = (i3 ^ highSpeedVideoFpsRanges) + ((i3 & highSpeedVideoFpsRanges) << 1);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = i3;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 109) % 128;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    aq(util.h.xy.dh.c[] cVarArr) {
        super(cVarArr, false);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public aq(util.h.xy.dh.d dVar) {
        super(dVar);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public aq(util.h.xy.dh.c cVar) {
        super(cVar);
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }

    public aq() {
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
    }
}
