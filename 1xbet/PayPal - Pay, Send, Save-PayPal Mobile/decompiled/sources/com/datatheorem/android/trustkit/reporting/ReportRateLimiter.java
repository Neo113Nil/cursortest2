package com.datatheorem.android.trustkit.reporting;

/* loaded from: classes8.dex */
class ReportRateLimiter {
    private static final java.util.Set<java.util.List<java.lang.Object>> getHighSpeedVideoFpsRangesFor = new java.util.HashSet();
    protected static java.util.Date getHighSpeedVideoSizes = new java.util.Date();

    ReportRateLimiter() {
    }

    static boolean Camera2StreamConfigurationMap(com.datatheorem.android.trustkit.reporting.PinningFailureReport pinningFailureReport) {
        boolean contains;
        synchronized (com.datatheorem.android.trustkit.reporting.ReportRateLimiter.class) {
            java.util.Date date = new java.util.Date();
            if ((date.getTime() / 1000) - (getHighSpeedVideoSizes.getTime() / 1000) > 86400) {
                getHighSpeedVideoFpsRangesFor.clear();
                getHighSpeedVideoSizes = date;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(pinningFailureReport.getNotedHostname());
            arrayList.add(pinningFailureReport.getServerHostname());
            arrayList.add(java.lang.Integer.valueOf(pinningFailureReport.getHighResolutionOutputSizeshNQ4ISI));
            arrayList.add(pinningFailureReport.getHighSpeedVideoSizes);
            arrayList.add(pinningFailureReport.getValidationResult());
            java.util.Set<java.util.List<java.lang.Object>> set = getHighSpeedVideoFpsRangesFor;
            contains = set.contains(arrayList);
            if (!contains) {
                set.add(arrayList);
            }
        }
        return contains;
    }
}
