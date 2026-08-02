package util.h.xy.be;

/* loaded from: classes5.dex */
public final class a implements com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionHistoryService {
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private util.h.xy.au.rh Camera2StreamConfigurationMap = new util.h.xy.au.rh();

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionHistoryService
    public final void refreshHistory(java.lang.String str, java.lang.String str2, java.lang.String str3, com.gemalto.mfs.mwsdk.mobilegateway.listener.TransactionHistoryListener transactionHistoryListener) throws java.lang.IllegalArgumentException, java.lang.IllegalStateException {
        java.lang.String str4 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f421);
        sb.append(util.h.xy.al.ra.f772);
        util.h.xy.am.ma.m25027(str4, sb.toString());
        this.Camera2StreamConfigurationMap.m25227(str, str2, str3, null, transactionHistoryListener);
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoSizes = ((i & 115) + (i | 115)) % 128;
    }

    @Override // com.gemalto.mfs.mwsdk.mobilegateway.MGTransactionHistoryService
    public final void refreshHistory(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.gemalto.mfs.mwsdk.mobilegateway.listener.TransactionHistoryListener transactionHistoryListener) {
        java.lang.String str5 = util.h.xy.al.ra.f281;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.al.ra.f421);
        sb.append(util.h.xy.al.ra.f772);
        util.h.xy.am.ma.m25027(str5, sb.toString());
        this.Camera2StreamConfigurationMap.m25227(str, str2, str3, str4, transactionHistoryListener);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 31) % 128;
    }
}
