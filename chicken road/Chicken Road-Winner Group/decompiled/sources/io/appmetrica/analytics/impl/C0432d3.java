package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0432d3 {

    /* renamed from: a, reason: collision with root package name */
    public final C0406c3 f7137a;

    /* renamed from: b, reason: collision with root package name */
    public final GZIPCompressor f7138b;

    public C0432d3() {
        this(new C0406c3(), new GZIPCompressor());
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C0406c3 c0406c3 = this.f7137a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c0406c3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, copyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f7138b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public C0432d3(C0406c3 c0406c3, GZIPCompressor gZIPCompressor) {
        this.f7137a = c0406c3;
        this.f7138b = gZIPCompressor;
    }
}
