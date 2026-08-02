package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.R;
import spay.sdk.view.SPayTextView;

/* loaded from: classes10.dex */
public final class Pb implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H2 f29689a;

    public Pb(H2 h22) {
        this.f29689a = h22;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        L2 l22 = (L2) obj;
        SPayTextView spaySlobActvTotal = this.f29689a.f29112k;
        Intrinsics.checkNotNullExpressionValue(spaySlobActvTotal, "spaySlobActvTotal");
        long j11 = l22.f29384a;
        int i11 = R.string.spay_currency_pattern;
        Intrinsics.checkNotNullParameter(spaySlobActvTotal, "<this>");
        Context context = spaySlobActvTotal.getContext();
        String c11 = AbstractC4656tp.c(j11);
        String str = l22.f29385b;
        if (str == null) {
            str = "";
        }
        spaySlobActvTotal.setText(context.getString(i11, c11, str));
        return Unit.f71690a;
    }
}
