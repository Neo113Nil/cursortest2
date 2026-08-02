package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0000*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\r2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0011"}, d2 = {"Ljava/time/Instant;", "Ljava/time/ZoneId;", "zoneId", "", "isToday", "(Ljava/time/Instant;Ljava/time/ZoneId;)Z", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "anyToInstantOrNull", "(Ljava/lang/Object;)Ljava/time/Instant;", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/time/Instant;", "Ljava/time/LocalDate;", "Lcom/paypal/oslo/core/i18n/domain/model/DateTime;", "toDateTime", "(Ljava/time/LocalDate;Ljava/time/ZoneId;)Lcom/paypal/oslo/core/i18n/domain/model/DateTime;", "(Ljava/time/Instant;Ljava/time/ZoneId;)Lcom/paypal/oslo/core/i18n/domain/model/DateTime;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DateUtilKt {
    public static /* synthetic */ boolean isToday$default(java.time.Instant instant, java.time.ZoneId zoneId, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            zoneId = java.time.ZoneId.systemDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zoneId, "");
        }
        return isToday(instant, zoneId);
    }

    public static final boolean isToday(java.time.Instant instant, java.time.ZoneId zoneId) {
        java.time.ZonedDateTime atZone;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zoneId, "");
        return kotlin.jvm.internal.Intrinsics.areEqual((instant == null || (atZone = instant.atZone(zoneId)) == null) ? null : atZone.toLocalDate(), java.time.LocalDate.now(zoneId));
    }

    public static final java.time.Instant anyToInstantOrNull(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.time.Instant) {
            return (java.time.Instant) obj;
        }
        if (obj instanceof java.lang.String) {
            return getHighSpeedVideoFpsRangesFor((java.lang.String) obj);
        }
        return null;
    }

    private static final java.time.Instant getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.time.Instant.parse(kotlin.text.StringsKt.trim(str).toString()));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        return (java.time.Instant) m23436constructorimpl;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DateTime toDateTime$default(java.time.LocalDate localDate, java.time.ZoneId zoneId, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            zoneId = java.time.ZoneId.systemDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zoneId, "");
        }
        return toDateTime(localDate, zoneId);
    }

    public static final com.paypal.oslo.core.i18n.domain.model.DateTime toDateTime(java.time.LocalDate localDate, java.time.ZoneId zoneId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zoneId, "");
        java.util.Date from = java.util.Date.from(localDate.atStartOfDay(zoneId).toInstant());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
        java.lang.String id = zoneId.getId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        return new com.paypal.oslo.core.i18n.domain.model.DateTime(from, id);
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.DateTime toDateTime$default(java.time.Instant instant, java.time.ZoneId zoneId, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            zoneId = java.time.ZoneId.systemDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zoneId, "");
        }
        return toDateTime(instant, zoneId);
    }

    public static final com.paypal.oslo.core.i18n.domain.model.DateTime toDateTime(java.time.Instant instant, java.time.ZoneId zoneId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zoneId, "");
        java.util.Date from = java.util.Date.from(instant);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
        java.lang.String id = zoneId.getId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(id, "");
        return new com.paypal.oslo.core.i18n.domain.model.DateTime(from, id);
    }
}
