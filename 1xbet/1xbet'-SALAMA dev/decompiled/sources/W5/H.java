package W5;

import U5.AbstractC0457y;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends D {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6811c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0457y f6812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final U5.l0 f6813e;

    public H(M0 m7, AbstractC0457y abstractC0457y, U5.l0 l0Var) {
        super(m7.f6866c, 0);
        this.f6812d = abstractC0457y;
        this.f6813e = l0Var;
    }

    @Override // W5.D
    public final void c() {
        switch (this.f6811c) {
            case 0:
                this.f6812d.g(this.f6813e, new U5.b0());
                break;
            default:
                this.f6812d.g(this.f6813e, new U5.b0());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(G0 g3, AbstractC0457y abstractC0457y, U5.l0 l0Var) {
        super(g3.f6808e, 0);
        this.f6812d = abstractC0457y;
        this.f6813e = l0Var;
    }
}
