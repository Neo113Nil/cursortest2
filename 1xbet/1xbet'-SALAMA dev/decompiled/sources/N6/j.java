package N6;

/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f4813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f4814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f4815g;

    public j() {
        this.f4809a = new byte[8192];
        this.f4813e = true;
        this.f4812d = false;
    }

    public final j a() {
        j jVar = this.f4814f;
        if (jVar == this) {
            jVar = null;
        }
        j jVar2 = this.f4815g;
        t6.h.b(jVar2);
        jVar2.f4814f = this.f4814f;
        j jVar3 = this.f4814f;
        t6.h.b(jVar3);
        jVar3.f4815g = this.f4815g;
        this.f4814f = null;
        this.f4815g = null;
        return jVar;
    }

    public final void b(j jVar) {
        t6.h.e(jVar, "segment");
        jVar.f4815g = this;
        jVar.f4814f = this.f4814f;
        j jVar2 = this.f4814f;
        t6.h.b(jVar2);
        jVar2.f4815g = jVar;
        this.f4814f = jVar;
    }

    public final j c() {
        this.f4812d = true;
        return new j(this.f4809a, this.f4810b, this.f4811c, true);
    }

    public final void d(j jVar, int i7) {
        t6.h.e(jVar, "sink");
        if (!jVar.f4813e) {
            throw new IllegalStateException("only owner can write");
        }
        int i8 = jVar.f4811c;
        int i9 = i8 + i7;
        byte[] bArr = jVar.f4809a;
        if (i9 > 8192) {
            if (jVar.f4812d) {
                throw new IllegalArgumentException();
            }
            int i10 = jVar.f4810b;
            if (i9 - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            p050g6.g.q0(bArr, 0, bArr, i10, i8);
            jVar.f4811c -= jVar.f4810b;
            jVar.f4810b = 0;
        }
        int i11 = jVar.f4811c;
        int i12 = this.f4810b;
        p050g6.g.q0(this.f4809a, i11, bArr, i12, i12 + i7);
        jVar.f4811c += i7;
        this.f4810b += i7;
    }

    public j(byte[] bArr, int i7, int i8, boolean z4) {
        t6.h.e(bArr, "data");
        this.f4809a = bArr;
        this.f4810b = i7;
        this.f4811c = i8;
        this.f4812d = z4;
        this.f4813e = false;
    }
}
