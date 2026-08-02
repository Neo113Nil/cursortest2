package Ve;

import Ae.InterfaceC2397i;
import android.content.Context;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SPayTextView;

/* renamed from: Ve.no, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4482no implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Cr f31683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f31684b;

    public C4482no(Cr cr, Context context) {
        this.f31683a = cr;
        this.f31684b = context;
    }

    @Override // Ae.InterfaceC2397i
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        Sr sr = (Sr) obj;
        X4.a aVar = this.f31683a.f28693b;
        if (aVar == null) {
            throw M7.f29463a;
        }
        C4368jq c4368jq = (C4368jq) aVar;
        Group spaySllGroupSpinner = c4368jq.f31398c;
        Intrinsics.checkNotNullExpressionValue(spaySllGroupSpinner, "spaySllGroupSpinner");
        Context context = this.f31684b;
        spaySllGroupSpinner.setVisibility(!kotlin.text.h.K(E.f(sr, context)) ? 0 : 8);
        LottieAnimationView spaySllLottieSpayLogo = c4368jq.f31399d;
        Intrinsics.checkNotNullExpressionValue(spaySllLottieSpayLogo, "spaySllLottieSpayLogo");
        spaySllLottieSpayLogo.setVisibility(kotlin.text.h.K(E.f(sr, context)) ? 0 : 8);
        SPayTextView sPayTextView = c4368jq.f31400e;
        sPayTextView.setLineSpacing(0.0f, 1.25f);
        sPayTextView.setText(E.f(sr, context));
        return Unit.f71690a;
    }
}
