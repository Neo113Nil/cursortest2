package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Fd implements io.appmetrica.analytics.coreapi.internal.backport.Function {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Hd f4291a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ed f4292b;

    public Fd(io.appmetrica.analytics.impl.Hd hd, io.appmetrica.analytics.impl.Ed ed) {
        this.f4291a = hd;
        this.f4292b = ed;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0015, B:13:0x0020, B:19:0x002c, B:29:0x001a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String apply(java.io.File file) {
        byte[] bArr;
        java.io.FileInputStream fileInputStream;
        try {
            java.lang.String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new java.io.FileInputStream(new java.io.File(absolutePath));
                } catch (java.lang.Throwable unused) {
                    fileInputStream = null;
                }
                try {
                    bArr = u0.AbstractC0995a.x(fileInputStream);
                    io.appmetrica.analytics.impl.AbstractC0522lo.a((java.io.Closeable) fileInputStream);
                } catch (java.lang.Throwable unused2) {
                    io.appmetrica.analytics.impl.AbstractC0522lo.a((java.io.Closeable) fileInputStream);
                    bArr = null;
                    if (bArr == null) {
                    }
                }
                if (bArr == null) {
                    return null;
                }
                if (bArr.length == 0) {
                    bArr = null;
                }
                if (bArr != null) {
                    return io.appmetrica.analytics.coreutils.internal.io.Base64Utils.compressBase64(io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f4292b.fromModel(new io.appmetrica.analytics.impl.Kd(bArr, this.f4291a))));
                }
                return null;
            }
            bArr = null;
            if (bArr == null) {
            }
        } catch (java.lang.Throwable unused3) {
            return null;
        }
    }
}
