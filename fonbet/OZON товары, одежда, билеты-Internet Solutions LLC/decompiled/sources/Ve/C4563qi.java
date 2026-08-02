package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.qi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4563qi implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bc f31877b;

    public /* synthetic */ C4563qi(Bc bc2, int i11) {
        this.f31876a = i11;
        this.f31877b = bc2;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31876a) {
            case 0:
                int intValue = ((Number) obj).intValue();
                C4192dm c4192dm = (C4192dm) this.f31877b;
                if (intValue != 0) {
                    X4.a aVar = c4192dm.f28693b;
                    if (aVar == null) {
                        throw M7.f29463a;
                    }
                    SPayTextView handleCommissionState$lambda$16 = ((H2) aVar).f29105d;
                    Intrinsics.checkNotNullExpressionValue(handleCommissionState$lambda$16, "handleCommissionState$lambda$16");
                    Intrinsics.checkNotNullParameter(handleCommissionState$lambda$16, "<this>");
                    handleCommissionState$lambda$16.setVisibility(0);
                    int i11 = R.string.spay_bnpl_commission_message;
                    Object[] args = {Integer.valueOf(intValue / 100)};
                    Intrinsics.checkNotNullParameter(args, "args");
                    Pq pq = new Pq(i11, C7705l.f0(args));
                    Context requireContext = c4192dm.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "this@BnplPartsOrderFragment.requireContext()");
                    handleCommissionState$lambda$16.setText(E.f(pq, requireContext));
                } else {
                    c4192dm.getClass();
                }
                return Unit.f71690a;
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                X4.a aVar2 = ((C1) this.f31877b).f28693b;
                if (aVar2 == null) {
                    throw M7.f29463a;
                }
                ((C4746x1) aVar2).f32446h.setChecked(booleanValue);
                return Unit.f71690a;
        }
    }
}
