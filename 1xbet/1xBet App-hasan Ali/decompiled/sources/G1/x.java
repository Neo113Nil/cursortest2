package G1;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1961l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f1962m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(v vVar, int i) {
        super(1);
        this.f1961l = i;
        this.f1962m = vVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1961l) {
            case 0:
                kotlin.jvm.internal.l.f("key", (String) obj);
                return Boolean.valueOf(!this.f1962m.c().contains(r2));
            default:
                kotlin.jvm.internal.l.f("key", (String) obj);
                return Boolean.valueOf(!this.f1962m.c().contains(r2));
        }
    }
}
