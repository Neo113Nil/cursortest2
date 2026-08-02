package okhttp3.internal.http;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011"}, d2 = {"", "Ljava/util/Date;", "toHttpDateOrNull", "(Ljava/lang/String;)Ljava/util/Date;", "toHttpDateString", "(Ljava/util/Date;)Ljava/lang/String;", "", "MAX_DATE", "J", "Lokhttp3/internal/http/DateFormattingKt$STANDARD_DATE_FORMAT$1;", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/internal/http/DateFormattingKt$STANDARD_DATE_FORMAT$1;", "getHighSpeedVideoFpsRanges", "", "getHighResolutionOutputSizeshNQ4ISI", "[Ljava/lang/String;", "Ljava/text/DateFormat;", "[Ljava/text/DateFormat;"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DateFormattingKt {
    public static final long MAX_DATE = 253402300799999L;
    private static final okhttp3.internal.http.DateFormattingKt$STANDARD_DATE_FORMAT$1 getHighSpeedVideoFpsRangesFor = new java.lang.ThreadLocal<java.text.DateFormat>() { // from class: okhttp3.internal.http.DateFormattingKt$STANDARD_DATE_FORMAT$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public final java.text.DateFormat initialValue() {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", java.util.Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(okhttp3.internal._UtilJvmKt.UTC);
            return simpleDateFormat;
        }
    };
    private static final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    private static final java.text.DateFormat[] getHighSpeedVideoFpsRanges = new java.text.DateFormat[15];

    public static final java.util.Date toHttpDateOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            return null;
        }
        java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
        java.util.Date parse = getHighSpeedVideoFpsRangesFor.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        java.lang.String[] strArr = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                java.text.DateFormat[] dateFormatArr = getHighSpeedVideoFpsRanges;
                java.text.SimpleDateFormat simpleDateFormat = dateFormatArr[i];
                if (simpleDateFormat == null) {
                    java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat(getHighResolutionOutputSizeshNQ4ISI[i], java.util.Locale.US);
                    simpleDateFormat2.setTimeZone(okhttp3.internal._UtilJvmKt.UTC);
                    simpleDateFormat = simpleDateFormat2;
                    dateFormatArr[i] = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                java.util.Date parse2 = simpleDateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            return null;
        }
    }

    public static final java.lang.String toHttpDateString(java.util.Date date) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
        java.lang.String format = getHighSpeedVideoFpsRangesFor.get().format(date);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
