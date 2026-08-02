package A;

/* renamed from: A.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006f extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f47l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f48m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0006f(int i, Object obj) {
        super(1);
        this.f47l = i;
        this.f48m = obj;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f47l) {
            case 0:
                ((Number) obj).intValue();
                return this.f48m;
            default:
                return Boolean.valueOf(kotlin.jvm.internal.l.a(obj, this.f48m));
        }
    }
}
