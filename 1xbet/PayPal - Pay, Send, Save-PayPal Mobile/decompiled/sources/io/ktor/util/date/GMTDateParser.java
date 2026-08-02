package io.ktor.util.date;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lio/ktor/util/date/GMTDateParser;", "", "", "pattern", "<init>", "(Ljava/lang/String;)V", "dateString", "Lio/ktor/util/date/GMTDate;", "parse", "(Ljava/lang/String;)Lio/ktor/util/date/GMTDate;", "Lio/ktor/util/date/GMTDateBuilder;", "", "p0", "p1", "", "getHighSpeedVideoFpsRanges", "(Lio/ktor/util/date/GMTDateBuilder;CLjava/lang/String;)V", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class GMTDateParser {
    public static final char ANY = '*';
    public static final char DAY_OF_MONTH = 'd';
    public static final char HOURS = 'h';
    public static final char MINUTES = 'm';
    public static final char MONTH = 'M';
    public static final char SECONDS = 's';
    public static final char YEAR = 'Y';
    public static final char ZONE = 'z';

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public GMTDateParser(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        if (str.length() <= 0) {
            throw new java.lang.IllegalStateException("Date parser pattern shouldn't be empty.".toString());
        }
    }

    public final io.ktor.util.date.GMTDate parse(java.lang.String dateString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateString, "");
        io.ktor.util.date.GMTDateBuilder gMTDateBuilder = new io.ktor.util.date.GMTDateBuilder();
        char charAt = this.getHighSpeedVideoFpsRangesFor.charAt(0);
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i2 < this.getHighSpeedVideoFpsRangesFor.length()) {
            try {
                if (this.getHighSpeedVideoFpsRangesFor.charAt(i2) == charAt) {
                    i2++;
                } else {
                    int i4 = (i3 + i2) - i;
                    java.lang.String substring = dateString.substring(i3, i4);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                    getHighSpeedVideoFpsRanges(gMTDateBuilder, charAt, substring);
                    try {
                        charAt = this.getHighSpeedVideoFpsRangesFor.charAt(i2);
                        i = i2;
                        i2++;
                        i3 = i4;
                    } catch (java.lang.Throwable unused) {
                        i3 = i4;
                        throw new io.ktor.util.date.InvalidDateStringException(dateString, i3, this.getHighSpeedVideoFpsRangesFor);
                    }
                }
            } catch (java.lang.Throwable unused2) {
            }
        }
        if (i3 < dateString.length()) {
            java.lang.String substring2 = dateString.substring(i3);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
            getHighSpeedVideoFpsRanges(gMTDateBuilder, charAt, substring2);
        }
        return gMTDateBuilder.build();
    }

    private static void getHighSpeedVideoFpsRanges(io.ktor.util.date.GMTDateBuilder gMTDateBuilder, char c, java.lang.String str) {
        if (c != '*') {
            if (c == 'M') {
                gMTDateBuilder.setMonth(io.ktor.util.date.Month.INSTANCE.from(str));
                return;
            }
            if (c == 'Y') {
                gMTDateBuilder.setYear(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                return;
            }
            if (c == 'd') {
                gMTDateBuilder.setDayOfMonth(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                return;
            }
            if (c == 'h') {
                gMTDateBuilder.setHours(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                return;
            }
            if (c == 'm') {
                gMTDateBuilder.setMinutes(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                return;
            }
            if (c == 's') {
                gMTDateBuilder.setSeconds(java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                return;
            }
            if (c == 'z') {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(str, "GMT")) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                return;
            }
            java.lang.String str2 = str;
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) != c) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
            }
        }
    }
}
