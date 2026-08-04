package W5;

import U5.C0452t;
import U5.InterfaceC0444k;

/* JADX INFO: loaded from: classes2.dex */
public final class B1 implements G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6748b;

    public /* synthetic */ B1(Object obj, int i7) {
        this.f6747a = i7;
        this.f6748b = obj;
    }

    @Override // W5.G1
    public final void a(M1 m7) {
        switch (this.f6747a) {
            case 0:
                m7.f6877a.a((InterfaceC0444k) this.f6748b);
                break;
            case 1:
                m7.f6877a.l((U5.r) this.f6748b);
                break;
            default:
                m7.f6877a.k((C0452t) this.f6748b);
                break;
        }
    }
}
