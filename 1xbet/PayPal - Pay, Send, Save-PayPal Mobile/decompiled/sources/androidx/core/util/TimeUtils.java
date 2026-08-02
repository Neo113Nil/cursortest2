package androidx.core.util;

/* loaded from: classes7.dex */
public final class TimeUtils {
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();
    private static char[] getHighSpeedVideoFpsRangesFor = new char[24];

    private static int Camera2StreamConfigurationMap(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    private static int getHighSpeedVideoFpsRanges(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        cArr[i4 + 1] = c;
        return i4 + 2;
    }

    private static int getHighSpeedVideoFpsRangesFor(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        if (getHighSpeedVideoFpsRangesFor.length < i) {
            getHighSpeedVideoFpsRangesFor = new char[i];
        }
        char[] cArr = getHighSpeedVideoFpsRangesFor;
        if (j2 == 0) {
            while (i - 1 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            j2 = -j2;
            c = '-';
        }
        int i7 = (int) (j2 % 1000);
        int floor = (int) java.lang.Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY;
            floor -= kotlinx.datetime.internal.DateCalculationsKt.SECONDS_PER_DAY * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i8 = floor / 60;
            i4 = floor - (i8 * 60);
            i5 = i8;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i != 0) {
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(i2, 1, false, 0);
            int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap2 + Camera2StreamConfigurationMap(i3, 1, Camera2StreamConfigurationMap2 > 0, 2);
            int Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap3 + Camera2StreamConfigurationMap(i5, 1, Camera2StreamConfigurationMap3 > 0, 2);
            int Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap4 + Camera2StreamConfigurationMap(i4, 1, Camera2StreamConfigurationMap4 > 0, 2);
            i6 = 0;
            for (int Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap5 + Camera2StreamConfigurationMap(i7, 2, true, Camera2StreamConfigurationMap5 > 0 ? 3 : 0) + 1; Camera2StreamConfigurationMap6 < i; Camera2StreamConfigurationMap6++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i9 = i6 + 1;
        boolean z = i != 0;
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(cArr, i2, io.ktor.util.date.GMTDateParser.DAY_OF_MONTH, i9, false, 0);
        int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(cArr, i3, io.ktor.util.date.GMTDateParser.HOURS, highSpeedVideoFpsRanges, highSpeedVideoFpsRanges != i9, z ? 2 : 0);
        int highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(cArr, i5, io.ktor.util.date.GMTDateParser.MINUTES, highSpeedVideoFpsRanges2, highSpeedVideoFpsRanges2 != i9, z ? 2 : 0);
        int highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(cArr, i4, io.ktor.util.date.GMTDateParser.SECONDS, highSpeedVideoFpsRanges3, highSpeedVideoFpsRanges3 != i9, z ? 2 : 0);
        int highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(cArr, i7, io.ktor.util.date.GMTDateParser.MINUTES, highSpeedVideoFpsRanges4, true, (!z || highSpeedVideoFpsRanges4 == i9) ? 0 : 3);
        cArr[highSpeedVideoFpsRanges5] = io.ktor.util.date.GMTDateParser.SECONDS;
        return highSpeedVideoFpsRanges5 + 1;
    }

    public static void formatDuration(long j, java.lang.StringBuilder sb) {
        synchronized (Camera2StreamConfigurationMap) {
            sb.append(getHighSpeedVideoFpsRangesFor, 0, getHighSpeedVideoFpsRangesFor(j, 0));
        }
    }

    public static void formatDuration(long j, java.io.PrintWriter printWriter, int i) {
        synchronized (Camera2StreamConfigurationMap) {
            printWriter.print(new java.lang.String(getHighSpeedVideoFpsRangesFor, 0, getHighSpeedVideoFpsRangesFor(j, i)));
        }
    }

    public static void formatDuration(long j, java.io.PrintWriter printWriter) {
        formatDuration(j, printWriter, 0);
    }

    public static void formatDuration(long j, long j2, java.io.PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j - j2, printWriter, 0);
        }
    }

    private TimeUtils() {
    }
}
