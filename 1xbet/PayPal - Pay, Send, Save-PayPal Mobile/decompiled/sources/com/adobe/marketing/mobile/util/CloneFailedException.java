package com.adobe.marketing.mobile.util;

/* loaded from: classes3.dex */
public class CloneFailedException extends java.lang.Exception {
    final com.adobe.marketing.mobile.util.CloneFailedException.Reason getHighSpeedVideoFpsRangesFor;

    enum Reason {
        MAX_DEPTH_REACHED,
        UNSUPPORTED_TYPE,
        UNKNOWN
    }

    public CloneFailedException(java.lang.String str) {
        this(str, com.adobe.marketing.mobile.util.CloneFailedException.Reason.UNKNOWN);
    }

    CloneFailedException(com.adobe.marketing.mobile.util.CloneFailedException.Reason reason) {
        this(reason.toString(), reason);
    }

    private CloneFailedException(java.lang.String str, com.adobe.marketing.mobile.util.CloneFailedException.Reason reason) {
        super(str);
        this.getHighSpeedVideoFpsRangesFor = reason;
    }
}
