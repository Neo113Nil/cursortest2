package kotlinx.datetime.internal;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u000f"}, d2 = {"", "", "isAsciiDigit", "(C)Z", "isAsciiLetter", "", "asciiDigitToInt", "(C)I", "", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;I)Ljava/lang/String;", "input", "removeLeadingZerosFromLongYearFormLocalDate", "(Ljava/lang/String;)Ljava/lang/String;", "removeLeadingZerosFromLongYearFormLocalDateTime", "removeLeadingZerosFromLongYearFormYearMonth"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UtilKt {
    public static final int asciiDigitToInt(char c) {
        return c - '0';
    }

    public static final boolean isAsciiDigit(char c) {
        return '0' <= c && c < ':';
    }

    public static final boolean isAsciiLetter(char c) {
        if ('A' > c || c >= '[') {
            return 'a' <= c && c < '{';
        }
        return true;
    }

    private static final java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, int i) {
        if (str.length() < i + 12) {
            return str;
        }
        int i2 = 0;
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "+-", str.charAt(0), false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.lang.String str2 = str;
        int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str2, '-', 1, false, 4, (java.lang.Object) null);
        if (indexOf$default < 12) {
            return str;
        }
        while (true) {
            int i3 = i2 + 1;
            if (str.charAt(i3) != '0') {
                break;
            }
            i2 = i3;
        }
        return indexOf$default - i2 >= 12 ? str : kotlin.text.StringsKt.removeRange(str2, 1, indexOf$default - 10).toString();
    }

    public static final java.lang.String removeLeadingZerosFromLongYearFormLocalDate(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return getHighSpeedVideoFpsRanges(str.toString(), 6);
    }

    public static final java.lang.String removeLeadingZerosFromLongYearFormLocalDateTime(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return getHighSpeedVideoFpsRanges(str.toString(), 12);
    }

    public static final java.lang.String removeLeadingZerosFromLongYearFormYearMonth(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return getHighSpeedVideoFpsRanges(str.toString(), 3);
    }
}
