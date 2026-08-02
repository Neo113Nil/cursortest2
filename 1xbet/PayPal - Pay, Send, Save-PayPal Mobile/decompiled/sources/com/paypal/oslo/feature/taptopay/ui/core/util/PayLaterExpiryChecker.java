package com.paypal.oslo.feature.taptopay.ui.core.util;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000f*\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0015R.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0001@\u0001X\u0080\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/core/util/PayLaterExpiryChecker;", "", "<init>", "()V", "", "createTime", "validityDuration", "", "hasExpired", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "timeLeftMs", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "Ljava/util/Date;", "p0", "", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/util/Date;I)J", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/util/Date;", "(Ljava/lang/String;)Ljava/lang/Integer;", "Lkotlin/Function0;", "currentTimeMillis", "Lkotlin/jvm/functions/Function0;", "getCurrentTimeMillis$taptopay_prodRelease", "()Lkotlin/jvm/functions/Function0;", "setCurrentTimeMillis$taptopay_prodRelease", "(Lkotlin/jvm/functions/Function0;)V", "getCurrentTimeMillis$taptopay_prodRelease$annotations", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayLaterExpiryChecker {
    private kotlin.jvm.functions.Function0<java.lang.Long> currentTimeMillis = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            long currentTimeMillis;
            currentTimeMillis = java.lang.System.currentTimeMillis();
            return java.lang.Long.valueOf(currentTimeMillis);
        }
    };
    public static final int $stable = 8;

    public static /* synthetic */ void getCurrentTimeMillis$taptopay_prodRelease$annotations() {
    }

    @javax.inject.Inject
    public PayLaterExpiryChecker() {
    }

    public final kotlin.jvm.functions.Function0<java.lang.Long> getCurrentTimeMillis$taptopay_prodRelease() {
        return this.currentTimeMillis;
    }

    public final void setCurrentTimeMillis$taptopay_prodRelease(kotlin.jvm.functions.Function0<java.lang.Long> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.currentTimeMillis = function0;
    }

    public final boolean hasExpired(java.lang.String createTime, java.lang.String validityDuration) {
        java.lang.String str;
        java.util.Date highSpeedVideoFpsRangesFor;
        java.lang.Integer highSpeedVideoFpsRanges;
        java.lang.String str2 = createTime;
        return str2 == null || str2.length() == 0 || (str = validityDuration) == null || str.length() == 0 || (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(createTime)) == null || (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(validityDuration)) == null || getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges.intValue()) <= 0;
    }

    public final java.lang.Long timeLeftMs(java.lang.String createTime, java.lang.String validityDuration) {
        java.lang.String str;
        java.util.Date highSpeedVideoFpsRangesFor;
        java.lang.Integer highSpeedVideoFpsRanges;
        java.lang.String str2 = createTime;
        if (str2 == null || str2.length() == 0 || (str = validityDuration) == null || str.length() == 0 || (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(createTime)) == null || (highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(validityDuration)) == null) {
            return null;
        }
        return java.lang.Long.valueOf(getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, highSpeedVideoFpsRanges.intValue()));
    }

    private final long getHighSpeedVideoFpsRanges(java.util.Date p0, int p1) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        calendar.setTime(p0);
        calendar.add(11, p1);
        return calendar.getTime().getTime() - this.currentTimeMillis.invoke().longValue();
    }

    private static java.util.Date getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_UTC_FORMAT_UTC_Z, java.util.Locale.US);
            simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
            return simpleDateFormat.parse(str);
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("createTime", str);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "unknown";
            }
            pairArr[1] = kotlin.TuplesKt.to("error", message);
            com.paypal.android.logger.Logger.w$default(logger, "Failed to parse createTime for PayLater expiry check", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return null;
        }
    }

    private static java.lang.Integer getHighSpeedVideoFpsRanges(java.lang.String str) {
        try {
            return java.lang.Integer.valueOf((int) kotlin.time.Duration.m23951getInWholeHoursimpl(kotlin.time.Duration.INSTANCE.m24012parseUwyO8pc(str)));
        } catch (java.lang.Exception e) {
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            pairArr[0] = kotlin.TuplesKt.to("validityDuration", str);
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "unknown";
            }
            pairArr[1] = kotlin.TuplesKt.to("error", message);
            com.paypal.android.logger.Logger.w$default(logger, "Failed to parse validityDuration for PayLater expiry check", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            return null;
        }
    }
}
