package MQ;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelSearchBar.presentation.TravelSearchBarWidgetViewHolder;
import ru.ozon.fintech.ui.checkbox.CheckBoxWrapperView;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17735b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f17734a = i11;
        this.f17735b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean _init_$lambda$2;
        switch (this.f17734a) {
            case 0:
                z11 = TravelSearchBarWidgetViewHolder.touchListener$lambda$0((TravelSearchBarWidgetViewHolder) this.f17735b, view, motionEvent);
                return z11;
            default:
                _init_$lambda$2 = CheckBoxWrapperView._init_$lambda$2((CheckBoxWrapperView) this.f17735b, view, motionEvent);
                return _init_$lambda$2;
        }
    }
}
