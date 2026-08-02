package u;

/* loaded from: classes.dex */
public final class h0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19817l = 1;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f19818m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(i4.c cVar) {
        super(1);
        this.f19818m = (kotlin.jvm.internal.m) cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i4.c, i4.e, kotlin.jvm.internal.m] */
    @Override // i4.c
    public final Object c(Object obj) {
        ?? r02 = this.f19818m;
        switch (this.f19817l) {
            case 0:
                C2463j c2463j = (C2463j) obj;
                Object value = c2463j.f19830e.getValue();
                A0 a02 = B0.f19645a;
                r02.invoke(value, Float.valueOf(((C2466m) c2463j.f).f19873a));
                return W3.o.f6046a;
            default:
                return r02.c(Long.valueOf(((Number) obj).longValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h0(i4.e eVar) {
        super(1);
        A0 a02 = B0.f19645a;
        this.f19818m = (kotlin.jvm.internal.m) eVar;
    }
}
