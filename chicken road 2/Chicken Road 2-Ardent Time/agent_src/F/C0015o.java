package F;

/* renamed from: F.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015o extends kotlin.jvm.internal.j implements s1.InterfaceC0991a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F.P f504f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0015o(F.P p2, int i2) {
        super(0);
        this.f503e = i2;
        this.f504f = p2;
    }

    @Override // s1.InterfaceC0991a
    public final java.lang.Object invoke() {
        switch (this.f503e) {
            case 0:
                return ((F.Y) this.f504f.f387j.a()).f418b;
            default:
                F.V v2 = this.f504f.f378a;
                java.io.File canonicalFile = ((java.io.File) v2.f403b.invoke()).getCanonicalFile();
                synchronized (F.V.f401d) {
                    java.lang.String path = canonicalFile.getAbsolutePath();
                    java.util.LinkedHashSet linkedHashSet = F.V.f400c;
                    if (linkedHashSet.contains(path)) {
                        throw new java.lang.IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.i.d(path, "path");
                    linkedHashSet.add(path);
                }
                return new F.Y(canonicalFile, (F.j0) v2.f402a.invoke(canonicalFile), new F.U(0, canonicalFile));
        }
    }
}
