package com.discover.mpos.sdk.core.extensions;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/Date;", "", "getFormattedDate", "(Ljava/util/Date;)Ljava/lang/String;", "DATE_FORMAT", "Ljava/lang/String;"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class DateExtKt {
    private static final java.lang.String DATE_FORMAT = "yyMMdd";

    public static final java.lang.String getFormattedDate(java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        return new java.text.SimpleDateFormat("yyMMdd", java.util.Locale.US).format(date);
    }
}
