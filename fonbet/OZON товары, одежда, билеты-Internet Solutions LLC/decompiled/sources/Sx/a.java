package Sx;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4View;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.presentation.SearchBarVO;
import ru.ozon.app.android.fresh.unsorted.widgets.searchBar.presentation.SearchBarViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.GalleryV4ButtonVH;
import ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewHolder.ReturnCreationStepsView;
import ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewObject.Step;
import ru.ozon.app.android.storefront.databinding.MoleculeStoryItemPollBinding;
import ru.ozon.app.android.storefront.stories.story.presentation.poll.StoryPollFragment;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerFormClearButton.presentation.TravelAddNewPassengerFormClearButtonVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerFormClearButton.presentation.TravelAddNewPassengerFormClearButtonWidgetViewHolder;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26355a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26357c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f26355a = i11;
        this.f26356b = obj;
        this.f26357c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f26355a) {
            case 0:
                SearchBarViewHolder.bind$lambda$2((SearchBarVO) this.f26356b, (SearchBarViewHolder) this.f26357c, view);
                break;
            case 1:
                GalleryV4ButtonVH.bind$lambda$0((Function1) this.f26356b, (GalleryV4VO.Button) this.f26357c, view);
                break;
            case 2:
                TravelAddNewPassengerFormClearButtonWidgetViewHolder.bind$lambda$1$lambda$0((TravelAddNewPassengerFormClearButtonWidgetViewHolder) this.f26356b, (TravelAddNewPassengerFormClearButtonVO) this.f26357c, view);
                break;
            case 3:
                ReturnCreationStepsView.createIconView$lambda$5$lambda$4((Step) this.f26356b, (Function1) this.f26357c, view);
                break;
            case 4:
                DeliveryWidgetV4View.rebindContentViews$lambda$33$lambda$32((DeliveryWidgetV4View.ContentItem.Text) this.f26356b, (DeliveryWidgetV4View) this.f26357c, view);
                break;
            default:
                StoryPollFragment.onError$lambda$50$lambda$49((MoleculeStoryItemPollBinding) this.f26356b, (StoryPollFragment) this.f26357c, view);
                break;
        }
    }
}
