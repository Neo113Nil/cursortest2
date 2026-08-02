package p4;

/* renamed from: p4.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2285z extends AbstractC2261a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f18837n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2285z(a4.h hVar, boolean z3, int i) {
        super(hVar, z3);
        this.f18837n = i;
    }

    @Override // p4.b0
    public boolean L(Throwable th) {
        switch (this.f18837n) {
            case 1:
                AbstractC2282w.l(this.f18774m, th);
                return true;
            default:
                return super.L(th);
        }
    }
}
