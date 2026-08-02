package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"", "Lio/ktor/util/date/GMTDate;", "fromHttpToGmtDate", "(Ljava/lang/String;)Lio/ktor/util/date/GMTDate;", "fromCookieToGmtDate", "toHttpDate", "(Lio/ktor/util/date/GMTDate;)Ljava/lang/String;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DateUtilsKt {
    private static final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"***, dd MMM YYYY hh:mm:ss zzz", "****, dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d hh:mm:ss YYYY", "***, dd-MMM-YYYY hh:mm:ss zzz", "***, dd-MMM-YYYY hh-mm-ss zzz", "***, dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh:mm:ss zzz", "*** dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh-mm-ss zzz", "***,dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d YYYY hh:mm:ss zzz"});

    public static final io.ktor.util.date.GMTDate fromHttpToGmtDate(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String obj = kotlin.text.StringsKt.trim(str).toString();
        java.util.Iterator<java.lang.String> it = getHighSpeedVideoFpsRangesFor.iterator();
        while (it.hasNext()) {
            try {
                return new io.ktor.util.date.GMTDateParser(it.next()).parse(str);
            } catch (io.ktor.util.date.InvalidDateStringException unused) {
            }
        }
        throw new java.lang.IllegalStateException("Failed to parse date: ".concat(java.lang.String.valueOf(obj)).toString());
    }

    public static final io.ktor.util.date.GMTDate fromCookieToGmtDate(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.String obj = kotlin.text.StringsKt.trim(str).toString();
        try {
            return new io.ktor.http.CookieDateParser().parse(obj);
        } catch (io.ktor.http.InvalidCookieDateException unused) {
            return fromHttpToGmtDate(obj);
        }
    }

    public static final java.lang.String toHttpDate(io.ktor.util.date.GMTDate gMTDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gMTDate, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(gMTDate.getDayOfWeek().getValue());
        sb2.append(", ");
        sb.append(sb2.toString());
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(kotlin.text.StringsKt.padStart(java.lang.String.valueOf(gMTDate.getDayOfMonth()), 2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        sb3.append(' ');
        sb.append(sb3.toString());
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(gMTDate.getMonth().getValue());
        sb4.append(' ');
        sb.append(sb4.toString());
        sb.append(kotlin.text.StringsKt.padStart(java.lang.String.valueOf(gMTDate.getYear()), 4, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder(" ");
        sb5.append(kotlin.text.StringsKt.padStart(java.lang.String.valueOf(gMTDate.getHours()), 2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        sb5.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb5.append(kotlin.text.StringsKt.padStart(java.lang.String.valueOf(gMTDate.getMinutes()), 2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        sb5.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb5.append(kotlin.text.StringsKt.padStart(java.lang.String.valueOf(gMTDate.getSeconds()), 2, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
        sb5.append(' ');
        sb.append(sb5.toString());
        sb.append("GMT");
        return sb.toString();
    }
}
