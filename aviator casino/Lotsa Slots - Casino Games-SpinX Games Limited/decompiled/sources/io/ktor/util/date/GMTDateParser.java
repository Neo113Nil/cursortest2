package io.ktor.util.date;

/* compiled from: GMTDateParser.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0013"}, d2 = {"Lio/ktor/util/date/GMTDateParser;", "", "", "pattern", "<init>", "(Ljava/lang/String;)V", "dateString", "Lio/ktor/util/date/GMTDate;", "parse", "(Ljava/lang/String;)Lio/ktor/util/date/GMTDate;", "Lio/ktor/util/date/GMTDateBuilder;", "", "type", "chunk", "", "handleToken", "(Lio/ktor/util/date/GMTDateBuilder;CLjava/lang/String;)V", "Ljava/lang/String;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GMTDateParser {
    public static final char ANY = '*';
    public static final char DAY_OF_MONTH = 'd';
    public static final char HOURS = 'h';
    public static final char MINUTES = 'm';
    public static final char MONTH = 'M';
    public static final char SECONDS = 's';
    public static final char YEAR = 'Y';
    public static final char ZONE = 'z';
    private final java.lang.String pattern;

    public GMTDateParser(java.lang.String pattern) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.pattern = pattern;
        if (pattern.length() <= 0) {
            throw new java.lang.IllegalStateException("Date parser pattern shouldn't be empty.".toString());
        }
    }

    public final io.ktor.util.date.GMTDate parse(java.lang.String dateString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateString, "dateString");
        io.ktor.util.date.GMTDateBuilder gMTDateBuilder = new io.ktor.util.date.GMTDateBuilder();
        char charAt = this.pattern.charAt(0);
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        while (i < this.pattern.length()) {
            try {
                if (this.pattern.charAt(i) == charAt) {
                    i++;
                } else {
                    int i4 = (i2 + i) - i3;
                    java.lang.String substring = dateString.substring(i2, i4);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    handleToken(gMTDateBuilder, charAt, substring);
                    try {
                        charAt = this.pattern.charAt(i);
                        i3 = i;
                        i++;
                        i2 = i4;
                    } catch (java.lang.Throwable unused) {
                        i2 = i4;
                        throw new io.ktor.util.date.InvalidDateStringException(dateString, i2, this.pattern);
                    }
                }
            } catch (java.lang.Throwable unused2) {
            }
        }
        if (i2 < dateString.length()) {
            java.lang.String substring2 = dateString.substring(i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            handleToken(gMTDateBuilder, charAt, substring2);
        }
        return gMTDateBuilder.build();
    }

    private final void handleToken(io.ktor.util.date.GMTDateBuilder gMTDateBuilder, char c, java.lang.String str) {
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
