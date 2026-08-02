package LS;

import android.view.View;
import androidx.lifecycle.J;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2WidgetViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2WidgetViewHolder;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f16651b;

    public /* synthetic */ c(J j11, int i11) {
        this.f16650a = i11;
        this.f16651b = j11;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        switch (this.f16650a) {
            case 0:
                TransparentNavBarV2WidgetViewHolder.topContainersOnLayoutListener$lambda$2((TransparentNavBarV2WidgetViewHolder) this.f16651b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
            default:
                AdditionalLuggageV2WidgetViewHolder.actionPaneLayoutChangeListener$lambda$1((AdditionalLuggageV2WidgetViewHolder) this.f16651b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
        }
    }
}
