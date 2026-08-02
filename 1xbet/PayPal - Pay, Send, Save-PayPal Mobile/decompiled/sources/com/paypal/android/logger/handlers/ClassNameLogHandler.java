package com.paypal.android.logger.handlers;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/android/logger/handlers/ClassNameLogHandler;", "Lcom/paypal/android/logger/LogHandler;", "", "withMethodName", "<init>", "(Z)V", "Lcom/paypal/android/logger/Log;", "log", "", "handle", "(Lcom/paypal/android/logger/Log;)V", "Ljava/util/regex/Pattern;", "Camera2StreamConfigurationMap", "Ljava/util/regex/Pattern;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ClassNameLogHandler implements com.paypal.android.logger.LogHandler {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.regex.Pattern getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    public ClassNameLogHandler(boolean z) {
        this.getHighSpeedVideoSizes = z;
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(\\$\\d+)+$");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(compile, "");
        this.getHighResolutionOutputSizeshNQ4ISI = compile;
    }

    public /* synthetic */ ClassNameLogHandler(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    @Override // com.paypal.android.logger.LogHandler
    public final void handle(com.paypal.android.logger.Log log) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(log, "");
        java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            java.lang.String className = stackTraceElement.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "");
            if (!kotlin.text.StringsKt.startsWith$default(className, "com.paypal.android.logger", false, 2, (java.lang.Object) null)) {
                java.lang.String className2 = stackTraceElement.getClassName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className2, "");
                java.lang.String substringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(className2, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, (java.lang.String) null, 2, (java.lang.Object) null);
                java.util.regex.Matcher matcher = this.getHighResolutionOutputSizeshNQ4ISI.matcher(substringAfterLast$default);
                if (matcher.find()) {
                    substringAfterLast$default = matcher.replaceAll("");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substringAfterLast$default, "");
                }
                kotlin.Pair pair = new kotlin.Pair(substringAfterLast$default, stackTraceElement.getMethodName());
                java.lang.String str = (java.lang.String) pair.component1();
                java.lang.String str2 = (java.lang.String) pair.component2();
                log.getAttributes().put(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS, str);
                if (this.getHighSpeedVideoSizes) {
                    log.getAttributes().put("method", str2);
                    return;
                }
                return;
            }
        }
        throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
    }

    public ClassNameLogHandler() {
        this(false, 1, null);
    }
}
