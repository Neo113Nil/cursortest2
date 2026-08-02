package LT;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.media3.ui.b;
import ru.ozon.app.android.travel.feature.tours.widgets.toursHotelInfoCard.presentation.ToursHotelInfoCardWidgetViewHolder;
import ru.ozon.fintech.features.camera.ui.QrScannerView;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16652a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f16653b;

    public /* synthetic */ a(View view, int i11) {
        this.f16652a = i11;
        this.f16653b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16652a) {
            case 0:
                ToursHotelInfoCardWidgetViewHolder.animateDescriptionTextView$lambda$8$lambda$7((AppCompatTextView) this.f16653b, valueAnimator);
                break;
            case 1:
                QrScannerView.onSizeChanged$lambda$6$lambda$5((QrScannerView) this.f16653b, valueAnimator);
                break;
            default:
                b.a((b) this.f16653b, valueAnimator);
                break;
        }
    }
}
