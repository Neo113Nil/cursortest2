package Lw;

import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseBeakViewHolder;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatView;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayout;
import ru.ozon.fintech.features.camera.ui.QrScannerView;

/* renamed from: Lw.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C3599b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17176b;

    public /* synthetic */ C3599b(Object obj, int i11) {
        this.f17175a = i11;
        this.f17176b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17175a) {
            case 0:
                WiseBeakViewHolder.onRelease$lambda$4$lambda$3((Function1) this.f17176b, valueAnimator);
                break;
            case 1:
                AirplaneSeatView.highlight$lambda$8$lambda$7((AirplaneSeatView) this.f17176b, valueAnimator);
                break;
            case 2:
                TravelTextInputLayout.centerHint$lambda$23$lambda$22((TravelTextInputLayout) this.f17176b, valueAnimator);
                break;
            default:
                QrScannerView.onSizeChanged$lambda$2$lambda$1((QrScannerView) this.f17176b, valueAnimator);
                break;
        }
    }
}
