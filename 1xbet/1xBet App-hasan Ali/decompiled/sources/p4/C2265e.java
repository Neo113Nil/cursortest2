package p4;

/* renamed from: p4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2265e implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18786a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18787b;

    public /* synthetic */ C2265e(int i, Object obj) {
        this.f18786a = i;
        this.f18787b = obj;
    }

    public final String toString() {
        switch (this.f18786a) {
            case 0:
                return "CancelHandler.UserSupplied[" + ((i4.c) this.f18787b).getClass().getSimpleName() + '@' + AbstractC2282w.i(this) + ']';
            default:
                return "DisposeOnCancel[" + ((E) this.f18787b) + ']';
        }
    }
}
