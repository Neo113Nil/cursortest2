package okio.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a?\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\"\u001a\u0010\n\u001a\u00020\u00008\u0001X\u0080D¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u000f\u001a\u00020\u000e8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012*\f\b\u0000\u0010\u0014\"\u00020\u00132\u00020\u0013"}, d2 = {"", com.paypal.oslo.feature.taxanddocumentcenter.data.taxreports.mapper.StringResourceConstants.YEAR, "month", "day", "hour", "minute", "second", "", "datePartsToEpochMillis", "(IIIIII)J", "DEFAULT_COMPRESSION", com.visa.cbp.getEncExpo.warmup, "getDEFAULT_COMPRESSION", "()I", "", "EMPTY_BYTE_ARRAY", "[B", "getEMPTY_BYTE_ARRAY", "()[B", "Ljava/util/zip/CRC32;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class _ZlibJvmKt {
    private static final int DEFAULT_COMPRESSION = -1;
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];

    public static final int getDEFAULT_COMPRESSION() {
        return DEFAULT_COMPRESSION;
    }

    public static final long datePartsToEpochMillis(int i, int i2, int i3, int i4, int i5, int i6) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i, i2 - 1, i3, i4, i5, i6);
        return gregorianCalendar.getTime().getTime();
    }

    public static final byte[] getEMPTY_BYTE_ARRAY() {
        return EMPTY_BYTE_ARRAY;
    }
}
