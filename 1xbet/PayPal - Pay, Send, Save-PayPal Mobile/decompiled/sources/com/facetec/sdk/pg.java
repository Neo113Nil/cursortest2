package com.facetec.sdk;

/* loaded from: classes8.dex */
public abstract class pg {

    /* renamed from: a, reason: collision with root package name */
    public static int f3743a;
    public static int b;

    public abstract java.util.List<java.security.cert.Certificate> e(java.util.List<java.security.cert.Certificate> list, java.lang.String str) throws javax.net.ssl.SSLPeerUnverifiedException;

    public static int c() {
        int i = b;
        b = i + 1;
        if (i % 9270474 != 0) {
            return f3743a;
        }
        int elapsedCpuTime = (int) android.os.Process.getElapsedCpuTime();
        f3743a = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
