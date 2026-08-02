package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class VB {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f11871a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f11872b;

    /* renamed from: c, reason: collision with root package name */
    public static final ByteBuffer f11873c;

    static {
        Charset.forName("US-ASCII");
        f11871a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f11872b = bArr;
        f11873c = ByteBuffer.wrap(bArr);
        AbstractC1674uy.j(bArr, 0, 0);
    }
}
