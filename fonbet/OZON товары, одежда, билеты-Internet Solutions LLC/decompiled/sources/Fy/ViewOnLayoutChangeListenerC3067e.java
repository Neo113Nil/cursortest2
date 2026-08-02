package Fy;

import android.view.View;
import ru.ozon.app.android.geo.map.presentation.viewmapper.AddressEditMapViewWrapper;
import ru.ozon.app.android.marketing.widgets.actionProgress.presentation.ActionProgressOverlayViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2WidgetViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.transparentNavBar.v2.presentation.TransparentNavBarV2WidgetViewHolder;

/* renamed from: Fy.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC3067e implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9587a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9588b;

    public /* synthetic */ ViewOnLayoutChangeListenerC3067e(Object obj, int i11) {
        this.f9587a = i11;
        this.f9588b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        switch (this.f9587a) {
            case 0:
                ((AddressEditMapViewWrapper) this.f9588b).recyclerTop = i12;
                break;
            case 1:
                TransparentNavBarV2WidgetViewHolder.stickyContainersOnLayoutListener$lambda$1((TransparentNavBarV2WidgetViewHolder) this.f9588b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
            case 2:
                ((ActionProgressOverlayViewHolder) this.f9588b).updatePositionAndVisibility();
                break;
            default:
                AdditionalLuggageV2WidgetViewHolder.appBarLayoutChangeListener$lambda$0((AdditionalLuggageV2WidgetViewHolder) this.f9588b, view, i11, i12, i13, i14, i15, i16, i17, i18);
                break;
        }
    }
}
