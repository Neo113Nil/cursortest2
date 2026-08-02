package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/zettle/sdk/analytics/SynchronizedDataFormatterImpl;", "Lcom/zettle/sdk/analytics/Gdp$DataFormatter;", "<init>", "()V", "", "timestamp", "", "format", "(J)Ljava/lang/String;", "Ljava/text/SimpleDateFormat;", "getHighSpeedVideoFpsRangesFor", "Ljava/text/SimpleDateFormat;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SynchronizedDataFormatterImpl implements com.zettle.sdk.analytics.Gdp.DataFormatter {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.text.SimpleDateFormat getHighResolutionOutputSizeshNQ4ISI;

    public SynchronizedDataFormatterImpl() {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", java.util.Locale.US);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        this.getHighResolutionOutputSizeshNQ4ISI = simpleDateFormat;
    }

    @Override // com.zettle.sdk.analytics.Gdp.DataFormatter
    public final java.lang.String format(long timestamp) {
        java.lang.String format;
        synchronized (this) {
            format = this.getHighResolutionOutputSizeshNQ4ISI.format(new java.util.Date(timestamp));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        }
        return format;
    }
}
