package MU;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.regulardraw.databinding.WidgetMorkovskNavbarBinding;
import ru.ozon.app.android.regulardraw.widgets.navbar.presentation.MorkovskNavBarViewHolder;
import ru.ozon.app.android.ugc.core.widgets.iconWidget.core.IconWidgetOverlayViewMapper;
import ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation.IconWidgetView;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17738b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f17737a = i11;
        this.f17738b = obj;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$0;
        View _init_$lambda$0;
        switch (this.f17737a) {
            case 0:
                createHolder$lambda$0 = IconWidgetOverlayViewMapper.createHolder$lambda$0((IconWidgetView) this.f17738b, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
            default:
                _init_$lambda$0 = MorkovskNavBarViewHolder._init_$lambda$0((WidgetMorkovskNavbarBinding) this.f17738b, (LinearLayout) viewGroup);
                return _init_$lambda$0;
        }
    }
}
