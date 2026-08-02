package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f12112a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12113b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f12114c;

    static {
        Charset.forName("US-ASCII");
        f12112a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f12113b = bArr;
        f12114c = ByteBuffer.wrap(bArr);
        H6.b.g(bArr, 0, 0, false);
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
