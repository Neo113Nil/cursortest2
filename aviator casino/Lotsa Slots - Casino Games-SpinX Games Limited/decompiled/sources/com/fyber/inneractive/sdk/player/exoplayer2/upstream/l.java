package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class l implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.b {
    public int b;
    public int c;
    public int d = 0;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] e = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[100];

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] f4092a = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[1];

    public final synchronized void a(int i) {
        boolean z = i < this.b;
        this.b = i;
        if (z) {
            a();
        }
    }

    public final synchronized void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr) {
        int i = this.d;
        int length = aVarArr.length + i;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr2 = this.e;
        if (length >= aVarArr2.length) {
            this.e = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[]) java.util.Arrays.copyOf(aVarArr2, java.lang.Math.max(aVarArr2.length * 2, i + aVarArr.length));
        }
        for (com.fyber.inneractive.sdk.player.exoplayer2.upstream.a aVar : aVarArr) {
            byte[] bArr = aVar.f4073a;
            if (bArr != null && bArr.length != 65536) {
                throw new java.lang.IllegalArgumentException();
            }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.a[] aVarArr3 = this.e;
            int i2 = this.d;
            this.d = i2 + 1;
            aVarArr3[i2] = aVar;
        }
        this.c -= aVarArr.length;
        notifyAll();
    }

    public final synchronized void a() {
        int i = this.b;
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        int max = java.lang.Math.max(0, ((i + 65535) / 65536) - this.c);
        int i3 = this.d;
        if (max >= i3) {
            return;
        }
        java.util.Arrays.fill(this.e, max, i3, (java.lang.Object) null);
        this.d = max;
    }
}
