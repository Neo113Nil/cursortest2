package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4111b implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30696a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bc f30697b;

    public /* synthetic */ C4111b(Bc bc2, int i11) {
        this.f30696a = i11;
        this.f30697b = bc2;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f30696a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                X4.a aVar = ((C1) this.f30697b).f28693b;
                if (aVar == null) {
                    throw M7.f29463a;
                }
                ((C4746x1) aVar).f32441c.setEnabled(booleanValue);
                return Unit.f71690a;
            case 1:
                L2 l22 = (L2) obj;
                X4.a aVar2 = ((C1) this.f30697b).f28693b;
                if (aVar2 == null) {
                    throw M7.f29463a;
                }
                SPayTextView sPayTextView = ((C4746x1) aVar2).f32445g;
                Intrinsics.checkNotNullExpressionValue(sPayTextView, "binding.spaySlobActvTotal");
                long j11 = l22.f29384a;
                int i11 = R.string.spay_currency_pattern;
                Intrinsics.checkNotNullParameter(sPayTextView, "<this>");
                Context context = sPayTextView.getContext();
                String c11 = AbstractC4656tp.c(j11);
                String str = l22.f29385b;
                if (str == null) {
                    str = "";
                }
                sPayTextView.setText(context.getString(i11, c11, str));
                return Unit.f71690a;
            default:
                ((L5) obj).a(new X2((H3) this.f30697b, 1));
                return Unit.f71690a;
        }
    }
}
