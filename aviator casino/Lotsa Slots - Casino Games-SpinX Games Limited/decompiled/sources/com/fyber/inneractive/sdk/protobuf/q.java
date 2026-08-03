package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes3.dex */
public class q extends com.fyber.inneractive.sdk.protobuf.p {
    private static final long serialVersionUID = 1;
    public final byte[] d;

    public q(byte[] bArr) {
        bArr.getClass();
        this.d = bArr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public void a(int i, byte[] bArr) {
        java.lang.System.arraycopy(this.d, 0, bArr, 0, i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public byte c(int i) {
        return this.d[i];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public byte d(int i) {
        return this.d[i];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final com.fyber.inneractive.sdk.protobuf.s e(int i) {
        int a2 = com.fyber.inneractive.sdk.protobuf.s.a(0, i, size());
        return a2 == 0 ? com.fyber.inneractive.sdk.protobuf.s.b : new com.fyber.inneractive.sdk.protobuf.n(this.d, g(), a2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.fyber.inneractive.sdk.protobuf.s) || size() != ((com.fyber.inneractive.sdk.protobuf.s) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof com.fyber.inneractive.sdk.protobuf.q)) {
            return obj.equals(this);
        }
        com.fyber.inneractive.sdk.protobuf.q qVar = (com.fyber.inneractive.sdk.protobuf.q) obj;
        int i = this.f4217a;
        int i2 = qVar.f4217a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > qVar.size()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > qVar.size()) {
            java.lang.StringBuilder a2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Ran off end of other: 0, ", size, ", ");
            a2.append(qVar.size());
            throw new java.lang.IllegalArgumentException(a2.toString());
        }
        byte[] bArr = this.d;
        byte[] bArr2 = qVar.d;
        int g = g() + size;
        int g2 = g();
        int g3 = qVar.g();
        while (g2 < g) {
            if (bArr[g2] != bArr2[g3]) {
                return false;
            }
            g2++;
            g3++;
        }
        return true;
    }

    public int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public int size() {
        return this.d.length;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final void a(com.fyber.inneractive.sdk.protobuf.k kVar) {
        kVar.a(this.d, g(), size());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final boolean c() {
        int g = g();
        return com.fyber.inneractive.sdk.protobuf.d4.f4185a.b(this.d, g, size() + g);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final com.fyber.inneractive.sdk.protobuf.w d() {
        byte[] bArr = this.d;
        int g = g();
        int size = size();
        com.fyber.inneractive.sdk.protobuf.t tVar = new com.fyber.inneractive.sdk.protobuf.t(bArr, g, size, true);
        try {
            tVar.d(size);
            return tVar;
        } catch (com.fyber.inneractive.sdk.protobuf.n1 e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final int a(int i, int i2) {
        byte[] bArr = this.d;
        int g = g();
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.protobuf.l1.f4203a;
        for (int i3 = g; i3 < g + i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s
    public final java.lang.String e() {
        return new java.lang.String(this.d, g(), size(), com.fyber.inneractive.sdk.protobuf.l1.f4203a);
    }
}
