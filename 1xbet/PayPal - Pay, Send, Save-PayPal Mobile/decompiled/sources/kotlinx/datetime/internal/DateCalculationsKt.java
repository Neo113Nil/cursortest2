package kotlinx.datetime.internal;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0014\u0010\t\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\b\"\u0014\u0010\n\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\b\"\u0014\u0010\f\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\b\"\u0014\u0010\r\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\b\"\u0014\u0010\u000e\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\b\"\u0014\u0010\u000f\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\b\"\u0014\u0010\u0011\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0013\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\b\"\u0014\u0010\u0016\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012"}, d2 = {"", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "", "isLeapYear", "(I)Z", "monthLength", "(IZ)I", "SECONDS_PER_HOUR", com.visa.cbp.getEncExpo.warmup, "SECONDS_PER_MINUTE", "MINUTES_PER_HOUR", "HOURS_PER_DAY", "SECONDS_PER_DAY", "NANOS_PER_ONE", "NANOS_PER_MILLI", "MILLIS_PER_ONE", "", "NANOS_PER_DAY", "J", "NANOS_PER_MINUTE", "NANOS_PER_HOUR", "MILLIS_PER_DAY", "SECONDS_PER_10000_YEARS"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DateCalculationsKt {
    public static final int HOURS_PER_DAY = 24;
    public static final int MILLIS_PER_DAY = 86400000;
    public static final int MILLIS_PER_ONE = 1000;
    public static final int MINUTES_PER_HOUR = 60;
    public static final long NANOS_PER_DAY = 86400000000000L;
    public static final long NANOS_PER_HOUR = 3600000000000L;
    public static final int NANOS_PER_MILLI = 1000000;
    public static final long NANOS_PER_MINUTE = 60000000000L;
    public static final int NANOS_PER_ONE = 1000000000;
    public static final long SECONDS_PER_10000_YEARS = 315569520000L;
    public static final int SECONDS_PER_DAY = 86400;
    public static final int SECONDS_PER_HOUR = 3600;
    public static final int SECONDS_PER_MINUTE = 60;

    public static final int monthLength(int i, boolean z) {
        return i != 2 ? (i == 4 || i == 6 || i == 9 || i == 11) ? 30 : 31 : z ? 29 : 28;
    }

    public static final boolean isLeapYear(int i) {
        long j = i;
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }
}
