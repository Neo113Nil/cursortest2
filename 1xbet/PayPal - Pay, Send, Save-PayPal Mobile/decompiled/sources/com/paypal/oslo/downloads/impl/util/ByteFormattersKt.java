package com.paypal.oslo.downloads.impl.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a'\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"", "", "formatBytes", "(J)Ljava/lang/String;", "formatSpeed", "formatTimeRemaining", "downloadedBytes", "totalBytes", "bytesPerSecond", "calculateEta", "(JJJ)J", "", "calculateProgress", "(JJ)I", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(JJLjava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ByteFormattersKt {
    public static final java.lang.String formatBytes(long j) {
        if (j < 0) {
            return "Unknown";
        }
        if (j < okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            sb.append(" B");
            return sb.toString();
        }
        if (j < com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) {
            return getHighResolutionOutputSizeshNQ4ISI(j, okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, "KB");
        }
        if (j < com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.Colors.SHADOW_COLOR) {
            return getHighResolutionOutputSizeshNQ4ISI(j, com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES, "MB");
        }
        if (j < 1099511627776L) {
            return getHighResolutionOutputSizeshNQ4ISI(j, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.Colors.SHADOW_COLOR, "GB");
        }
        return getHighResolutionOutputSizeshNQ4ISI(j, 1099511627776L, "TB");
    }

    public static final java.lang.String formatSpeed(long j) {
        if (j < 0) {
            return "Unknown";
        }
        if (j < okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(j);
            sb.append(" B/s");
            return sb.toString();
        }
        if (j < com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES) {
            return getHighResolutionOutputSizeshNQ4ISI(j, okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE, "KB/s");
        }
        if (j < com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.Colors.SHADOW_COLOR) {
            return getHighResolutionOutputSizeshNQ4ISI(j, com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES, "MB/s");
        }
        return getHighResolutionOutputSizeshNQ4ISI(j, com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.Colors.SHADOW_COLOR, "GB/s");
    }

    public static final java.lang.String formatTimeRemaining(long j) {
        java.lang.StringBuilder sb;
        java.lang.StringBuilder sb2;
        if (j < 0) {
            return "Unknown";
        }
        java.lang.String str = lib.android.paypal.com.magnessdk.g.n2;
        if (j < 60) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(j);
            sb3.append(lib.android.paypal.com.magnessdk.g.n2);
            return sb3.toString();
        }
        java.lang.String str2 = "m";
        if (j < 3600) {
            long j2 = j / 60;
            long j3 = j % 60;
            if (j3 > 0) {
                sb2 = new java.lang.StringBuilder();
                sb2.append(j2);
                sb2.append("m ");
                sb2.append(j3);
            } else {
                sb2 = new java.lang.StringBuilder();
                sb2.append(j2);
                str = "m";
            }
            sb2.append(str);
            return sb2.toString();
        }
        long j4 = j / 3600;
        long j5 = (j % 3600) / 60;
        if (j5 > 0) {
            sb = new java.lang.StringBuilder();
            sb.append(j4);
            sb.append("h ");
            sb.append(j5);
        } else {
            sb = new java.lang.StringBuilder();
            sb.append(j4);
            str2 = "h";
        }
        sb.append(str2);
        return sb.toString();
    }

    public static final long calculateEta(long j, long j2, long j3) {
        if (j2 <= 0 || j3 <= 0) {
            return -1L;
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            return j4 / j3;
        }
        return 0L;
    }

    public static final int calculateProgress(long j, long j2) {
        if (j2 <= 0) {
            return -1;
        }
        return kotlin.ranges.RangesKt.coerceIn((int) ((j / j2) * 100.0d), 0, 100);
    }

    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI(long j, long j2, java.lang.String str) {
        double d = j / j2;
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format(java.util.Locale.US, "%.2f %s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d), str}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
