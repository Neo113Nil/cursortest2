package com.fyber.inneractive.sdk.player.cache;

/* loaded from: classes3.dex */
public final class j extends java.io.ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.cache.k f3872a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.fyber.inneractive.sdk.player.cache.k kVar, int i) {
        super(i);
        this.f3872a = kVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final java.lang.String toString() {
        int i = ((java.io.ByteArrayOutputStream) this).count;
        if (i > 0) {
            int i2 = i - 1;
            if (((java.io.ByteArrayOutputStream) this).buf[i2] == 13) {
                i = i2;
            }
        }
        try {
            return new java.lang.String(((java.io.ByteArrayOutputStream) this).buf, 0, i, this.f3872a.b.name());
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.AssertionError(e);
        }
    }
}
