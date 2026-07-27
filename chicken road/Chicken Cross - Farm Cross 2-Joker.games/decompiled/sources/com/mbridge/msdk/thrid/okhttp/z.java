package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import javax.annotation.Nullable;

/* compiled from: RequestBody.java */
/* loaded from: classes6.dex */
public abstract class z {

    /* compiled from: RequestBody.java */
    static class a extends z {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u f9957a;
        final /* synthetic */ int b;
        final /* synthetic */ byte[] c;
        final /* synthetic */ int d;

        a(u uVar, int i, byte[] bArr, int i2) {
            this.f9957a = uVar;
            this.b = i;
            this.c = bArr;
            this.d = i2;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public long a() {
            return this.b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        @Nullable
        public u b() {
            return this.f9957a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
            dVar.write(this.c, this.d, this.b);
        }
    }

    public static z a(@Nullable u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }

    public abstract long a() throws IOException;

    public abstract void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException;

    @Nullable
    public abstract u b();

    public static z a(@Nullable u uVar, byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(bArr.length, i, i2);
        return new a(uVar, i2, bArr, i);
    }
}
