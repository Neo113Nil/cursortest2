package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class ou extends java.io.IOException {

    /* renamed from: a, reason: collision with root package name */
    public static int f3734a;
    public static int d;
    public final com.facetec.sdk.og b;

    public ou(com.facetec.sdk.og ogVar) {
        super("stream was reset: ".concat(java.lang.String.valueOf(ogVar)));
        this.b = ogVar;
    }

    public static int d() {
        int i = f3734a;
        f3734a = i + 1;
        if (i % 5299407 != 0) {
            return d;
        }
        int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
        d = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
