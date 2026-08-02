package com.discover.mpos.sdk.core.extensions;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/Calendar;", "", "month", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "lastDayOfMonth", "(Ljava/util/Calendar;II)Ljava/util/Calendar;"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class CalendarExtKt {
    public static final java.util.Calendar lastDayOfMonth(java.util.Calendar calendar, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(calendar, "");
        calendar.set(1, i2 + 2000);
        calendar.set(2, i - 1);
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar;
    }
}
