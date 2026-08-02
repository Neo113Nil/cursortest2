package TS;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.messenger.blocks.chat.common.menuItems.c;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.adapter.TrustFactorAdapter;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation.adapter.TrustFactorHolder;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarVO;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.adapter.TravelScrollPriceCalendarAdapter;
import ru.ozon.app.android.uploadPhotos.adapter.viewHolder.PhotoItemVH;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26944c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f26942a = i11;
        this.f26943b = obj;
        this.f26944c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f26942a) {
            case 0:
                TravelScrollPriceCalendarAdapter.onBindViewHolder$lambda$0((TravelScrollPriceCalendarVO.DateTabVO) this.f26943b, (TravelScrollPriceCalendarAdapter) this.f26944c, view);
                break;
            case 1:
                TrustFactorAdapter.onCreateViewHolder$lambda$5$lambda$4((TrustFactorHolder) this.f26943b, (TrustFactorAdapter) this.f26944c, view);
                break;
            case 2:
                c.e((Function2) this.f26943b, (c) this.f26944c);
                break;
            default:
                PhotoItemVH.lambda$4$lambda$1$lambda$0((Function1) this.f26943b, (PhotoItemVH) this.f26944c, view);
                break;
        }
    }
}
