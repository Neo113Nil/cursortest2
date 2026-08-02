package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzbgp extends java.lang.ThreadLocal {
    zzbgp() {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ java.lang.Object initialValue() {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", java.util.Locale.ENGLISH);
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        gregorianCalendar.setGregorianChange(new java.util.Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }
}
