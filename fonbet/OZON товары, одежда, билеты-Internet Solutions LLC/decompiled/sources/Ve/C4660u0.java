package Ve;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4660u0 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32170a;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f32171b;

    public /* synthetic */ C4660u0(Pc.a aVar, int i11) {
        this.f32170a = i11;
        this.f32171b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f32170a) {
            case 0:
                Vm sPayDataContract = (Vm) this.f32171b.get();
                Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
                return new Up(sPayDataContract);
            default:
                xe.M scope = (xe.M) this.f32171b.get();
                Intrinsics.checkNotNullParameter(scope, "scope");
                return new C4654tn(scope);
        }
    }
}
