package FB;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.orders.cml.deliveryOrderList.presentation.viewHolder.DeliveryOrderViewHolder;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.views.StoryItemClickableLayoutV3;
import ru.ozon.app.android.storefront.stories.story.presentation.StoryItemClickableLayout;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9175b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f9174a = i11;
        this.f9175b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean _init_$lambda$0;
        boolean _init_$lambda$02;
        switch (this.f9174a) {
            case 0:
                z11 = DeliveryOrderViewHolder.touchListener$lambda$0((DeliveryOrderViewHolder) this.f9175b, view, motionEvent);
                return z11;
            case 1:
                _init_$lambda$0 = StoryItemClickableLayoutV3._init_$lambda$0((StoryItemClickableLayoutV3) this.f9175b, view, motionEvent);
                return _init_$lambda$0;
            default:
                _init_$lambda$02 = StoryItemClickableLayout._init_$lambda$0((StoryItemClickableLayout) this.f9175b, view, motionEvent);
                return _init_$lambda$02;
        }
    }
}
