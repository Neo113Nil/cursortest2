package p000;

/* JADX INFO: renamed from: qd */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0614qd extends C0762ud {

    /* JADX INFO: renamed from: n */
    public final int f6466n;

    /* JADX INFO: renamed from: o */
    public final int f6467o;

    public C0614qd(byte[] bArr, int i, int i2) {
        super(bArr);
        C0762ud.m4907c(i, i + i2, bArr.length);
        this.f6466n = i;
        this.f6467o = i2;
    }

    @Override // p000.C0762ud
    /* JADX INFO: renamed from: b */
    public final byte mo4064b(int i) {
        int i2 = this.f6467o;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f7800k[this.f6466n + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(j11.m2773h("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(AbstractC0024an.m281d(i, i2, "Index > length: ", ", "));
    }

    @Override // p000.C0762ud
    /* JADX INFO: renamed from: e */
    public final int mo4065e() {
        return this.f6466n;
    }

    @Override // p000.C0762ud
    /* JADX INFO: renamed from: f */
    public final byte mo4066f(int i) {
        return this.f7800k[this.f6466n + i];
    }

    @Override // p000.C0762ud
    public final int size() {
        return this.f6467o;
    }
}
