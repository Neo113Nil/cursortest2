package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Z3 implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30559b;

    public /* synthetic */ Z3(Object obj, int i11) {
        this.f30558a = i11;
        this.f30559b = obj;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f30558a) {
            case 0:
                Wb wb2 = (Wb) obj;
                Co co = (Co) this.f30559b;
                co.f28780d.setText(wb2.f30256a);
                co.f28779c.setText(wb2.f30257b);
                co.f28782f.setText(wb2.f30259d);
                co.f28781e.setText(wb2.f30260e);
                co.f28778b.setText(wb2.f30261f);
                return Unit.f71690a;
            case 1:
                ((L5) obj).a(new C4704vf((Pm) this.f30559b));
                return Unit.f71690a;
            case 2:
                List list = (List) obj;
                J4 j42 = (J4) this.f30559b;
                X4.a aVar = j42.f28693b;
                if (aVar == null) {
                    throw M7.f29463a;
                }
                RecyclerView recyclerView = ((Hp) aVar).f29182f;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.spaySlhRvHintHelper");
                recyclerView.setVisibility(list.isEmpty() ? 4 : 0);
                C4665u5 c4665u5 = j42.f29265d;
                if (c4665u5 != null) {
                    c4665u5.submitList(list);
                    return Unit.f71690a;
                }
                Intrinsics.n("hintsAdapter");
                throw null;
            default:
                int intValue = ((Number) obj).intValue();
                C1 c12 = (C1) this.f30559b;
                if (intValue != 0) {
                    X4.a aVar2 = c12.f28693b;
                    if (aVar2 == null) {
                        throw M7.f29463a;
                    }
                    SPayTextView handleCommissionState$lambda$9 = ((C4746x1) aVar2).f32440b;
                    Intrinsics.checkNotNullExpressionValue(handleCommissionState$lambda$9, "handleCommissionState$lambda$9");
                    Intrinsics.checkNotNullParameter(handleCommissionState$lambda$9, "<this>");
                    handleCommissionState$lambda$9.setVisibility(0);
                    int i11 = R.string.spay_bnpl_commission_message;
                    Object[] args = {Integer.valueOf(intValue / 100)};
                    Intrinsics.checkNotNullParameter(args, "args");
                    Pq pq = new Pq(i11, C7705l.f0(args));
                    Context requireContext = c12.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "this@BnplOrderFragment.requireContext()");
                    handleCommissionState$lambda$9.setText(E.f(pq, requireContext));
                } else {
                    c12.getClass();
                }
                return Unit.f71690a;
        }
    }
}
