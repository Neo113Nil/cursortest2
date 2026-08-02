package x0;

/* loaded from: classes.dex */
public final class l0 extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f21013l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2630p[] f21014m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(C2630p[] c2630pArr, int i) {
        super(2);
        this.f21013l = i;
        this.f21014m = c2630pArr;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21013l) {
            case 0:
                return Float.valueOf(f0.d((Y) obj, true, this.f21014m, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(f0.d((Y) obj, false, this.f21014m, ((Number) obj2).floatValue()));
        }
    }
}
