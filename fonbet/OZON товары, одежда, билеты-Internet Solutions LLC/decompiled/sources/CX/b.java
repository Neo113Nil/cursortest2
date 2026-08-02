package CX;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderViewHolderDelegateImpl;
import ru.ozon.app.android.travel.feature.general.common.widgets.pricesHistogram.v2.presentation.PricesHistogramV2WidgetViewHolder;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.tile.MessengerTileView;
import ru.ozon.fintech.ui.utils.CbottomExtKt;
import ru.ozon.fintech.ui.utils.WidgetFrameLayout;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4568b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f4567a = i11;
        this.f4568b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean lambda$1$lambda$0;
        boolean z11;
        boolean applyClickListener$lambda$0;
        boolean _init_$lambda$2;
        switch (this.f4567a) {
            case 0:
                lambda$1$lambda$0 = MessengerTileView.lambda$1$lambda$0((MessengerTileView) this.f4568b, view, motionEvent);
                return lambda$1$lambda$0;
            case 1:
                z11 = PricesHistogramV2WidgetViewHolder.setupRV$lambda$2$lambda$1((RecyclerView) this.f4568b, view, motionEvent);
                return z11;
            case 2:
                applyClickListener$lambda$0 = CbottomExtKt.applyClickListener$lambda$0((WidgetFrameLayout) this.f4568b, view, motionEvent);
                return applyClickListener$lambda$0;
            default:
                _init_$lambda$2 = WidgetImagePlaceholderViewHolderDelegateImpl._init_$lambda$2((WidgetImagePlaceholderViewHolderDelegateImpl) this.f4568b, view, motionEvent);
                return _init_$lambda$2;
        }
    }
}
