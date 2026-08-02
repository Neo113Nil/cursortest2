package u;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f19967l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t0 f19968m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(t0 t0Var, int i) {
        super(1);
        this.f19967l = i;
        this.f19968m = t0Var;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f19967l) {
            case 0:
                return new w0(this.f19968m, 0);
            default:
                return new w0(this.f19968m, 1);
        }
    }
}
