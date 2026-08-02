package util.h.xy.ck;

/* loaded from: classes5.dex */
public final class rc extends java.lang.Exception {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final long serialVersionUID = -8208748247352059308L;
    private util.h.xy.ck.d getHighSpeedVideoFpsRangesFor;

    public rc(util.h.xy.ck.d dVar, java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        util.h.xy.ck.d dVar2 = util.h.xy.ck.d.f1114;
        this.getHighSpeedVideoFpsRangesFor = dVar;
    }

    public rc(util.h.xy.ck.d dVar, java.lang.String str) {
        super(str);
        util.h.xy.ck.d dVar2 = util.h.xy.ck.d.f1114;
        this.getHighSpeedVideoFpsRangesFor = dVar;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.ck.d m25957() {
        int i = getHighSpeedVideoFpsRanges + 75;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return this.getHighSpeedVideoFpsRangesFor;
        }
        throw null;
    }
}
