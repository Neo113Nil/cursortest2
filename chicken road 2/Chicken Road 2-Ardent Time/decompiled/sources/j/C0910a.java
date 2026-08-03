package j;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0910a extends j.C0915f {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f7922e = new java.util.HashMap();

    @Override // j.C0915f
    public final j.C0912c a(java.lang.Object obj) {
        return (j.C0912c) this.f7922e.get(obj);
    }

    @Override // j.C0915f
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object b2 = super.b(obj);
        this.f7922e.remove(obj);
        return b2;
    }
}
