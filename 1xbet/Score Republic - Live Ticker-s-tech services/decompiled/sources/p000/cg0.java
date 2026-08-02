package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class cg0 extends ig0 {

    /* JADX INFO: renamed from: n */
    public final boolean f1248n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg0() {
        super(true);
        boolean z = true;
        m2608H(null);
        InterfaceC0432lg interfaceC0432lgM2604D = m2604D();
        C0469mg c0469mg = interfaceC0432lgM2604D instanceof C0469mg ? (C0469mg) interfaceC0432lgM2604D : null;
        if (c0469mg == null) {
            z = false;
            break;
        }
        ig0 ig0VarM1413q = c0469mg.m1413q();
        while (!ig0VarM1413q.mo929A()) {
            InterfaceC0432lg interfaceC0432lgM2604D2 = ig0VarM1413q.m2604D();
            C0469mg c0469mg2 = interfaceC0432lgM2604D2 instanceof C0469mg ? (C0469mg) interfaceC0432lgM2604D2 : null;
            if (c0469mg2 == null) {
                z = false;
                break;
            }
            ig0VarM1413q = c0469mg2.m1413q();
        }
        this.f1248n = z;
    }

    @Override // p000.ig0
    /* JADX INFO: renamed from: A */
    public final boolean mo929A() {
        return this.f1248n;
    }

    @Override // p000.ig0
    /* JADX INFO: renamed from: B */
    public final boolean mo930B() {
        return true;
    }
}
