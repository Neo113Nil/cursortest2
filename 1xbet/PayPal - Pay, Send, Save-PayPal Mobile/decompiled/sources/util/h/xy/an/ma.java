package util.h.xy.an;

/* loaded from: classes5.dex */
public class ma<T> implements com.gemalto.mfs.mwsdk.utils.async.AsyncToken<T> {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 55) % 128;
    private java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> getHighSpeedVideoFpsRangesFor;

    @Override // com.gemalto.mfs.mwsdk.utils.async.AsyncToken
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> waitToComplete() {
        java.lang.String str = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f641);
        sb.append(util.h.xy.al.ra.f398);
        util.h.xy.am.ma.m25027(str, sb.toString());
        try {
            synchronized (this.getHighSpeedVideoFpsRanges) {
                while (this.getHighSpeedVideoFpsRangesFor == null) {
                    this.getHighSpeedVideoFpsRanges.wait();
                }
            }
        } catch (java.lang.InterruptedException e) {
            e.getMessage();
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public void m25034(com.gemalto.mfs.mwsdk.utils.async.AsyncResult<T> asyncResult) {
        synchronized (this.getHighSpeedVideoFpsRanges) {
            this.getHighSpeedVideoFpsRangesFor = asyncResult;
            this.getHighSpeedVideoFpsRanges.notifyAll();
        }
    }
}
