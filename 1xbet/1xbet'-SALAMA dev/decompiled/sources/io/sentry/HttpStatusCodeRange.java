package io.sentry;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpStatusCodeRange {
    public static final int DEFAULT_MAX = 599;
    public static final int DEFAULT_MIN = 500;
    private final int max;
    private final int min;

    public HttpStatusCodeRange(int i7, int i8) {
        this.min = i7;
        this.max = i8;
    }

    public boolean isInRange(int i7) {
        return i7 >= this.min && i7 <= this.max;
    }

    public HttpStatusCodeRange(int i7) {
        this.min = i7;
        this.max = i7;
    }
}
