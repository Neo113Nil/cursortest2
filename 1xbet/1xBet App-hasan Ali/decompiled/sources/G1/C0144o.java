package G1;

/* renamed from: G1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144o extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1923l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E f1924m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0144o(E e3, int i) {
        super(1);
        this.f1923l = i;
        this.f1924m = e3;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f1923l) {
            case 0:
                kotlin.jvm.internal.l.f("destination", (y) obj);
                return Boolean.valueOf(!this.f1924m.f1837m.containsKey(Integer.valueOf(r2.f1969p)));
            default:
                kotlin.jvm.internal.l.f("destination", (y) obj);
                return Boolean.valueOf(!this.f1924m.f1837m.containsKey(Integer.valueOf(r2.f1969p)));
        }
    }
}
