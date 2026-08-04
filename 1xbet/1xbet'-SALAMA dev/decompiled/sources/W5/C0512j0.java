package W5;

import A1.AbstractC0021h;

/* JADX INFO: renamed from: W5.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0512j0 extends AbstractC0021h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ U5.E f7257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0512j0(U5.E e7, int i7) {
        super(4);
        this.f7256b = i7;
        this.f7257c = e7;
    }

    @Override // A1.AbstractC0021h
    public final void j() {
        switch (this.f7256b) {
            case 0:
                C0538s0 c0538s0 = (C0538s0) this.f7257c;
                ((P0) c0538s0.f7343d.f7233c).j.c0.o(c0538s0, true);
                break;
            case 1:
                ((Q0) this.f7257c).C();
                break;
            default:
                ((X5.m) this.f7257c).f7587h.j(true);
                break;
        }
    }

    @Override // A1.AbstractC0021h
    public final void k() {
        switch (this.f7256b) {
            case 0:
                C0538s0 c0538s0 = (C0538s0) this.f7257c;
                ((P0) c0538s0.f7343d.f7233c).j.c0.o(c0538s0, false);
                break;
            case 1:
                Q0 q1 = (Q0) this.f7257c;
                if (!q1.f6939J.get()) {
                    q1.E();
                    break;
                }
                break;
            default:
                ((X5.m) this.f7257c).f7587h.j(false);
                break;
        }
    }
}
