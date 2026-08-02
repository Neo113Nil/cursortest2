package AS;

import Ve.C4318i4;
import Ve.C4413ld;
import Ve.C4635t4;
import Ve.C4699va;
import Ve.H3;
import Ve.M7;
import android.view.View;
import android.webkit.WebBackForwardList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.TimerBadge;
import ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.d;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.monoposting.CancelPostingsV2MonopostingViewHolder;
import ru.ozon.app.android.cabinet.profileAvatar.presentation.view.AvatarPickerView;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.SelectorFieldVH;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.tagfilter.TagFilterViewHolder;
import ru.ozon.app.android.geo.mapPreview.presentation.MapPreviewVH;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselProductViewHolder;
import ru.ozon.app.android.storefront.widgets.fashionOnboarding.FashionTabOnboardingDialog;
import ru.ozon.app.android.storefront.widgets.naviGrid.presentation.NaviGridItemViewHolder;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.NavigationSliderV3ItemViewHolder;
import ru.ozon.app.android.travel.feature.avia.widgets.buyTogether.view.BuyTogetherServiceView;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsRoomsList.v5.presentation.rooms.adapters.images.HotelsRoomsListV5ImagesViewHolder;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.holders.disclaimer.DSDisclaimerHolder;
import spay.sdk.view.SPayMaterialButton;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f659a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f660b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f659a = i11;
        this.f660b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AtomAction atomAction;
        switch (this.f659a) {
            case 0:
                HotelsRoomsListV5ImagesViewHolder._init_$lambda$0((HotelsRoomsListV5ImagesViewHolder) this.f660b, view);
                return;
            case 1:
                NavigationSliderV3ItemViewHolder._init_$lambda$0((NavigationSliderV3ItemViewHolder) this.f660b, view);
                return;
            case 2:
                FashionTabOnboardingDialog.onViewCreated$lambda$1((FashionTabOnboardingDialog) this.f660b, view);
                return;
            case 3:
                ((BuyTogetherServiceView) this.f660b).performAction();
                return;
            case 4:
                MapPreviewVH._init_$lambda$0((MapPreviewVH) this.f660b, view);
                return;
            case 5:
                PinPadFragment.v((PinPadFragment) this.f660b);
                return;
            case 6:
                ((TagFilterViewHolder) this.f660b).titleClick();
                return;
            case 7:
                AvatarPickerView.lambda$4$lambda$1((AvatarPickerView) this.f660b, view);
                return;
            case 8:
                H3 this$0 = (H3) this.f660b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                X4.a aVar = this$0.f28693b;
                if (aVar == null) {
                    throw M7.f29463a;
                }
                if (((C4635t4) aVar).f32088e.canGoBack()) {
                    X4.a aVar2 = this$0.f28693b;
                    if (aVar2 == null) {
                        throw M7.f29463a;
                    }
                    WebBackForwardList copyBackForwardList = ((C4635t4) aVar2).f32088e.copyBackForwardList();
                    Intrinsics.checkNotNullExpressionValue(copyBackForwardList, "binding.spaySlpnavwvWv.copyBackForwardList()");
                    int currentIndex = copyBackForwardList.getCurrentIndex();
                    if (currentIndex > 0) {
                        String previousUrl = copyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl();
                        X4.a aVar3 = this$0.f28693b;
                        if (aVar3 == null) {
                            throw M7.f29463a;
                        }
                        SPayMaterialButton sPayMaterialButton = ((C4635t4) aVar3).f32087d;
                        Intrinsics.checkNotNullExpressionValue(sPayMaterialButton, "binding.spaySlpnavwvMbCloseOffer");
                        Intrinsics.checkNotNullExpressionValue(previousUrl, "previousUrl");
                        String str = this$0.f29114d;
                        if (str == null) {
                            str = "";
                        }
                        sPayMaterialButton.setVisibility(h.t(previousUrl, str, true) ? 8 : 0);
                    } else {
                        X4.a aVar4 = this$0.f28693b;
                        if (aVar4 == null) {
                            throw M7.f29463a;
                        }
                        SPayMaterialButton sPayMaterialButton2 = ((C4635t4) aVar4).f32087d;
                        Intrinsics.checkNotNullExpressionValue(sPayMaterialButton2, "binding.spaySlpnavwvMbCloseOffer");
                        sPayMaterialButton2.setVisibility(8);
                    }
                    X4.a aVar5 = this$0.f28693b;
                    if (aVar5 == null) {
                        throw M7.f29463a;
                    }
                    ((C4635t4) aVar5).f32088e.goBack();
                    return;
                }
                return;
            case 9:
                C4699va this$02 = (C4699va) this.f660b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ((C4318i4) this$02.u()).f0(C4413ld.f31524a);
                return;
            case 10:
                DSDisclaimerHolder._init_$lambda$1((DSDisclaimerHolder) this.f660b, view);
                return;
            case 11:
                SelectorFieldVH.lambda$4$lambda$3((SelectorFieldVH) this.f660b, view);
                return;
            case 12:
                ((ComparisonCarouselProductViewHolder) this.f660b).navigateToProductPage();
                return;
            case 13:
                CancelPostingsV2MonopostingViewHolder._init_$lambda$1((CancelPostingsV2MonopostingViewHolder) this.f660b, view);
                return;
            case 14:
                d dVar = (d) this.f660b;
                TimerBadge timerBadge = (TimerBadge) dVar.getData();
                AtomActionDTO action = timerBadge.getAction();
                if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, timerBadge.getTrackingInfo())) == null) {
                    return;
                }
                dVar.handleAction(atomAction);
                return;
            default:
                NaviGridItemViewHolder.onClickListener$lambda$1((NaviGridItemViewHolder) this.f660b, view);
                return;
        }
    }
}
