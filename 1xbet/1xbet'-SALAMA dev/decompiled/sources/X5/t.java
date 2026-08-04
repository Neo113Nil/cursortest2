package X5;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N6.d f7624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7626c;

    public t(N6.d dVar, int i7) {
        this.f7624a = dVar;
        this.f7625b = i7;
    }

    public final void a(byte[] bArr, int i7, int i8) {
        this.f7624a.k(bArr, i7, i8);
        this.f7625b -= i8;
        this.f7626c += i8;
    }
}
