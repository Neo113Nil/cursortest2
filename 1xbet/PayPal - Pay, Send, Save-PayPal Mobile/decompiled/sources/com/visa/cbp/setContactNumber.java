package com.visa.cbp;

/* loaded from: classes5.dex */
public final class setContactNumber {
    private static java.lang.String getHighSpeedVideoFpsRangesFor;

    static {
        try {
            try {
                getHighSpeedVideoFpsRangesFor = (java.lang.String) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.String>() { // from class: com.visa.cbp.setContactNumber.1
                    @Override // java.security.PrivilegedAction
                    public final /* synthetic */ java.lang.String run() {
                        return java.lang.System.getProperty("line.separator");
                    }
                });
            } catch (java.lang.Exception unused) {
                getHighSpeedVideoFpsRangesFor = java.lang.String.format("%n", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused2) {
            getHighSpeedVideoFpsRangesFor = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE;
        }
    }

    public static java.lang.String valueOf() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
