package P;

/* renamed from: P.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4505a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4506b;

    public /* synthetic */ C0312q(int i, Object obj) {
        this.f4505a = i;
        this.f4506b = obj;
    }

    public final void a() {
        switch (this.f4505a) {
            case 0:
                C0315s c0315s = (C0315s) this.f4506b;
                c0315s.f4514A--;
                break;
            default:
                Z.r rVar = (Z.r) this.f4506b;
                rVar.f6227j--;
                break;
        }
    }

    public final void b() {
        switch (this.f4505a) {
            case 0:
                ((C0315s) this.f4506b).f4514A++;
                break;
            default:
                ((Z.r) this.f4506b).f6227j++;
                break;
        }
    }
}
