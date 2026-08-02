package org.chromium.net.telemetry;

/* loaded from: classes18.dex */
public final class SizeBuckets {
    private SizeBuckets() {
    }

    public static int calcRequestBodySizeBucket(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Request body size is negative");
        }
        double d = j / 1024.0d;
        if (d == 0.0d) {
            return 1;
        }
        if (d > 0.0d && d < 10.0d) {
            return 2;
        }
        if (d >= 10.0d && d < 50.0d) {
            return 3;
        }
        if (d >= 50.0d && d < 200.0d) {
            return 4;
        }
        if (d >= 200.0d && d < 500.0d) {
            return 5;
        }
        if (d < 500.0d || d >= 1000.0d) {
            return (d < 1000.0d || d >= 5000.0d) ? 8 : 7;
        }
        return 6;
    }

    public static int calcRequestHeadersSizeBucket(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Request header size is negative");
        }
        double d = j / 1024.0d;
        if (d >= 0.0d && d < 1.0d) {
            return 1;
        }
        if (d >= 1.0d && d < 10.0d) {
            return 2;
        }
        if (d >= 10.0d && d < 25.0d) {
            return 3;
        }
        if (d < 25.0d || d >= 50.0d) {
            return (d < 50.0d || d >= 100.0d) ? 6 : 5;
        }
        return 4;
    }

    public static int calcResponseBodySizeBucket(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Response body size is negative");
        }
        double d = j / 1024.0d;
        if (d == 0.0d) {
            return 1;
        }
        if (d > 0.0d && d < 10.0d) {
            return 2;
        }
        if (d >= 10.0d && d < 50.0d) {
            return 3;
        }
        if (d >= 50.0d && d < 200.0d) {
            return 4;
        }
        if (d >= 200.0d && d < 500.0d) {
            return 5;
        }
        if (d < 500.0d || d >= 1000.0d) {
            return (d < 1000.0d || d >= 5000.0d) ? 8 : 7;
        }
        return 6;
    }

    public static int calcResponseHeadersSizeBucket(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Response header size is negative");
        }
        double d = j / 1024.0d;
        if (d >= 0.0d && d < 1.0d) {
            return 1;
        }
        if (d >= 1.0d && d < 10.0d) {
            return 2;
        }
        if (d >= 10.0d && d < 25.0d) {
            return 3;
        }
        if (d < 25.0d || d >= 50.0d) {
            return (d < 50.0d || d >= 100.0d) ? 6 : 5;
        }
        return 4;
    }
}
