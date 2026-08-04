package W5;

/* JADX INFO: loaded from: classes2.dex */
public final class E1 implements G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.protobuf.C f6765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f6766b;

    public E1(F0 f7, com.google.protobuf.C c3) {
        this.f6766b = f7;
        this.f6765a = c3;
    }

    @Override // W5.G1
    public final void a(M1 m7) {
        m7.f6877a.g(this.f6766b.f6777a.e(this.f6765a));
        m7.f6877a.flush();
    }
}
