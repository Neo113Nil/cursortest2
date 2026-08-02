package p000;

/* JADX INFO: renamed from: rd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0651rd extends C0799vd {

    /* JADX INFO: renamed from: n */
    public final int f6822n;

    /* JADX INFO: renamed from: o */
    public final int f6823o;

    public C0651rd(byte[] bArr, int i, int i2) {
        super(bArr);
        C0799vd.m5147c(i, i + i2, bArr.length);
        this.f6822n = i;
        this.f6823o = i2;
    }

    @Override // p000.C0799vd
    /* JADX INFO: renamed from: b */
    public final byte mo4338b(int i) {
        int i2 = this.f6823o;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f8180k[this.f6822n + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(j11.m2773h("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0024an.m281d(i, i2, "Index > length: ", ", "));
    }

    @Override // p000.C0799vd
    /* JADX INFO: renamed from: e */
    public final void mo4339e(int i, byte[] bArr) {
        System.arraycopy(this.f8180k, this.f6822n, bArr, 0, i);
    }

    @Override // p000.C0799vd
    /* JADX INFO: renamed from: f */
    public final int mo4340f() {
        return this.f6822n;
    }

    @Override // p000.C0799vd
    /* JADX INFO: renamed from: g */
    public final byte mo4341g(int i) {
        return this.f8180k[this.f6822n + i];
    }

    @Override // p000.C0799vd
    public final int size() {
        return this.f6823o;
    }
}
