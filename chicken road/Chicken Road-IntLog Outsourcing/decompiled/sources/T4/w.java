package T4;

/* loaded from: classes.dex */
public final class w extends x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f2995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2996c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f2997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2998e;

    public w(s sVar, int i2, byte[] bArr, int i3) {
        this.f2995b = sVar;
        this.f2996c = i2;
        this.f2997d = bArr;
        this.f2998e = i3;
    }

    @Override // T4.x
    public final long a() {
        return this.f2996c;
    }

    @Override // T4.x
    public final s b() {
        return this.f2995b;
    }

    @Override // T4.x
    public final void c(j5.p pVar) {
        byte[] bArr = this.f2997d;
        if (pVar.f10517c) {
            throw new IllegalStateException("closed");
        }
        pVar.f10516b.H(bArr, this.f2998e, this.f2996c);
        pVar.a();
    }
}
