package com.plaid.internal;

/* loaded from: classes16.dex */
public final class O6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.BufferedInputStream f5872a;

    public O6(java.io.InputStream inputStream) {
        this.f5872a = new java.io.BufferedInputStream(inputStream);
    }

    public final java.lang.String a() {
        int read;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            read = this.f5872a.read();
            if (read == -1 || read == 10) {
                break;
            }
            if (read != 13) {
                sb.append((char) read);
            }
        }
        if (read == -1 && sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
