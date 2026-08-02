package J90;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ze.u;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14226b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f14225a = i11;
        this.f14226b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14225a) {
            case 0:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((g) this.f14226b).q(false);
                break;
            default:
                u uVar = (u) this.f14226b;
                if (!uVar.g()) {
                    uVar.b(Boolean.TRUE);
                    uVar.l(null);
                }
                break;
        }
        return Unit.f71690a;
    }
}
