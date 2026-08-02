package O4;

/* renamed from: O4.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274u extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f4232l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0259e f4233m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0274u(InterfaceC0259e interfaceC0259e, int i) {
        super(1);
        this.f4232l = i;
        this.f4233m = interfaceC0259e;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f4232l) {
            case 0:
                this.f4233m.cancel();
                break;
            case 1:
                this.f4233m.cancel();
                break;
            default:
                this.f4233m.cancel();
                break;
        }
        return W3.o.f6046a;
    }
}
