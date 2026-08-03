package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class HSProactiveParsingException extends java.lang.RuntimeException {
    public final java.lang.String analyticsId;
    public final long deliveryTime;
    public final java.lang.String notificationId;

    public HSProactiveParsingException(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
        this.analyticsId = "";
        this.notificationId = "";
        this.deliveryTime = 0L;
    }

    public HSProactiveParsingException(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.Throwable th) {
        super(str, th);
        this.analyticsId = str3;
        this.notificationId = str2;
        this.deliveryTime = j;
    }

    public HSProactiveParsingException(java.lang.String str, com.helpshift.proactive.ProactiveInappNotification proactiveInappNotification, java.lang.Throwable th) {
        super(str, th);
        if (proactiveInappNotification == null) {
            this.analyticsId = "";
            this.notificationId = "";
            this.deliveryTime = 0L;
        } else {
            this.analyticsId = proactiveInappNotification.analyticsId;
            this.notificationId = proactiveInappNotification.notificationId;
            this.deliveryTime = proactiveInappNotification.deliveryTime;
        }
    }
}
