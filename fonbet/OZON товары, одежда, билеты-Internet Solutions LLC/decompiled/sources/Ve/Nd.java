package Ve;

import Ae.InterfaceC2397i;
import kotlin.Pair;
import kotlin.Unit;
import spay.sdk.R;

/* loaded from: classes10.dex */
public final class Nd implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29555b;

    public /* synthetic */ Nd(Object obj, int i11) {
        this.f29554a = i11;
        this.f29555b = obj;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Pair pair;
        switch (this.f29554a) {
            case 0:
                ((C4400l0) this.f29555b).f31486d.setEnabled(((Boolean) obj).booleanValue());
                return Unit.f71690a;
            default:
                Tp tp = (Tp) obj;
                Lo lo = (Lo) this.f29555b;
                X4.a aVar = lo.f28693b;
                if (aVar == null) {
                    throw M7.f29463a;
                }
                int ordinal = tp.ordinal();
                if (ordinal == 0) {
                    pair = new Pair(new C4474ng(), "FraudMonOtpReviewFragment");
                } else if (ordinal == 1) {
                    pair = new Pair(new N5(), "FraudMonReviewHintFragment");
                } else if (ordinal == 2) {
                    pair = new Pair(new C4236f9(), "FraudMonDenyFragment");
                } else {
                    if (ordinal != 3) {
                        throw new Sc.o();
                    }
                    pair = new Pair(new C4460n2(), "FraudMonDenyBlockFragment");
                }
                Bc bc2 = (Bc) pair.a();
                String str = (String) pair.b();
                androidx.fragment.app.Q p11 = lo.getParentFragmentManager().p();
                p11.r(R.id.spay_root_fc, bc2, str);
                p11.i();
                return Unit.f71690a;
        }
    }
}
