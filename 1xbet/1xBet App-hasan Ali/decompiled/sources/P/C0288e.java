package P;

/* renamed from: P.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288e implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0286d f4459k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0290f f4460l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f4461m;

    public C0288e(C0286d c0286d, C0290f c0290f, kotlin.jvm.internal.u uVar) {
        this.f4459k = c0286d;
        this.f4460l = c0290f;
        this.f4461m = uVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        int i;
        C0286d c0286d = this.f4459k;
        c0286d.f4457a = null;
        c0286d.f4458b = null;
        X.a aVar = this.f4460l.f4465n;
        int i5 = this.f4461m.f17622k;
        do {
            i = aVar.get();
        } while (!aVar.compareAndSet(i, ((i >>> 27) & 15) == i5 ? i - 1 : i));
        return W3.o.f6046a;
    }
}
