package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class X6 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30340c;

    public /* synthetic */ X6(int i11, Object obj, Object obj2) {
        this.f30338a = i11;
        this.f30339b = obj;
        this.f30340c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0158  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        C4666u6 c4666u6;
        int i11;
        switch (this.f30338a) {
            case 0:
                if (dVar instanceof C4666u6) {
                    c4666u6 = (C4666u6) dVar;
                    int i12 = c4666u6.f32183e;
                    if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                        c4666u6.f32183e = i12 - LinearLayoutManager.INVALID_OFFSET;
                        Object obj2 = c4666u6.f32182d;
                        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                        i11 = c4666u6.f32183e;
                        if (i11 != 0) {
                            Sc.s.b(obj2);
                            SPaySdkConfig sPaySdkConfig = ((C4712vn) ((Vl) this.f30340c)).f32313c;
                            if (sPaySdkConfig == null) {
                                throw C4317i3.f31235a;
                            }
                            Mg mg2 = new Mg(sPaySdkConfig.getImages().getLogoIcon());
                            c4666u6.f32183e = 1;
                            if (((InterfaceC2397i) this.f30339b).emit(mg2, c4666u6) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Sc.s.b(obj2);
                        }
                        return Unit.f71690a;
                    }
                }
                c4666u6 = new C4666u6(this, dVar);
                Object obj22 = c4666u6.f32182d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c4666u6.f32183e;
                if (i11 != 0) {
                }
                return Unit.f71690a;
            default:
                C4221en c4221en = (C4221en) obj;
                Integer f7 = c4221en.f();
                C4192dm c4192dm = (C4192dm) this.f30340c;
                H2 h22 = (H2) this.f30339b;
                String str = c4221en.f30946g;
                if (f7 != null) {
                    ConstraintLayout constraintLayout = h22.f29108g.f29858a;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "spaySloIncludeCompoundWallet.root");
                    constraintLayout.setVisibility(0);
                    ConstraintLayout constraintLayout2 = h22.f29109h.f32058a;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "spaySloIncludeSelectedCard.root");
                    Rj rj2 = h22.f29108g;
                    ConstraintLayout constraintLayout3 = rj2.f29858a;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout3, "spaySloIncludeCompoundWallet.root");
                    constraintLayout2.setVisibility(constraintLayout3.getVisibility() != 0 ? 0 : 8);
                    SPayTextView sPayTextView = rj2.f29860c;
                    Sr h11 = c4221en.h();
                    Context requireContext = c4192dm.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                    sPayTextView.setText(E.f(h11, requireContext));
                    Integer f11 = c4221en.f();
                    String quantityString = f11 != null ? c4192dm.getResources().getQuantityString(f11.intValue(), AbstractC4656tp.a(c4221en.a()), new Integer(AbstractC4656tp.a(c4221en.a()))) : null;
                    rj2.f29861d.setText(c4221en.e() ? c4192dm.getString(c4221en.d(), c4221en.c(), quantityString) : c4192dm.getString(c4221en.d(), c4221en.b(), c4221en.c(), quantityString));
                    rj2.f29862e.a(str);
                } else {
                    ConstraintLayout constraintLayout4 = h22.f29108g.f29858a;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "spaySloIncludeCompoundWallet.root");
                    constraintLayout4.setVisibility(8);
                    C4622sk c4622sk = h22.f29109h;
                    ConstraintLayout constraintLayout5 = c4622sk.f32058a;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout5, "spaySloIncludeSelectedCard.root");
                    ConstraintLayout constraintLayout6 = h22.f29108g.f29858a;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout6, "spaySloIncludeCompoundWallet.root");
                    constraintLayout5.setVisibility(constraintLayout6.getVisibility() != 0 ? 0 : 8);
                    SPayTextView sPayTextView2 = c4622sk.f32062e;
                    Sr h12 = c4221en.h();
                    Context requireContext2 = c4192dm.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
                    sPayTextView2.setText(E.f(h12, requireContext2));
                    c4622sk.f32061d.setText(c4221en.e() ? c4192dm.getString(c4221en.d(), c4221en.c()) : c4192dm.getString(c4221en.d(), c4221en.b(), c4221en.c()));
                    c4622sk.f32059b.a(str);
                }
                return Unit.f71690a;
        }
    }
}
