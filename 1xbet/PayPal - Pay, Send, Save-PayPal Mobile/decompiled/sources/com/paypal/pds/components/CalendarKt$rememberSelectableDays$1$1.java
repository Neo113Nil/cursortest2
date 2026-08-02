package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/pds/components/CalendarKt$rememberSelectableDays$1$1;", "Landroidx/compose/material3/SelectableDates;", "", "utcTimeMillis", "", "isSelectableDate", "(J)Z", "", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "isSelectableYear", "(I)Z"}, k = 1, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes16.dex */
public final class CalendarKt$rememberSelectableDays$1$1 implements androidx.compose.material3.SelectableDates {
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Long, java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Boolean> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public CalendarKt$rememberSelectableDays$1$1(kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function12) {
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoSizes = function12;
    }

    @Override // androidx.compose.material3.SelectableDates
    public final boolean isSelectableDate(long utcTimeMillis) {
        return this.getHighSpeedVideoFpsRanges.invoke(java.lang.Long.valueOf(utcTimeMillis)).booleanValue();
    }

    @Override // androidx.compose.material3.SelectableDates
    public final boolean isSelectableYear(int year) {
        return this.getHighSpeedVideoSizes.invoke(java.lang.Integer.valueOf(year)).booleanValue();
    }
}
