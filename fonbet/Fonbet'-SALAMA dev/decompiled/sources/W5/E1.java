package W5;

/* loaded from: classes2.dex */
public final class E1 implements G1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.protobuf.C f6765a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f6766b;

    public E1(F0 f02, com.google.protobuf.C c3) {
        this.f6766b = f02;
        this.f6765a = c3;
    }

    @Override // W5.G1
    public final void a(M1 m12) {
        m12.f6877a.g(this.f6766b.f6777a.e(this.f6765a));
        m12.f6877a.flush();
    }
}
