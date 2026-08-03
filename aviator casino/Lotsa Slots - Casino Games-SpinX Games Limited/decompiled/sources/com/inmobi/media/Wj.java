package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Wj extends java.io.ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Xj f5035a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wj(com.inmobi.media.Xj xj, int i) {
        super(i);
        this.f5035a = xj;
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized java.lang.String toString() {
        int i;
        i = ((java.io.ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((java.io.ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.AssertionError(e);
        }
        return new java.lang.String(((java.io.ByteArrayOutputStream) this).buf, 0, i, this.f5035a.b.name());
    }
}
