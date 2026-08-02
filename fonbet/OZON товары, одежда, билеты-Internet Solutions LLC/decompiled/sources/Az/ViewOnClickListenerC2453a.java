package Az;

import android.view.View;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.input.viewdelegates.l;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.messenger.framework.navigation.action.b;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.components.radio.RadioVH;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.iconsadapter.icon.BannerIcon;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.EnableNotificationsVO;
import ru.ozon.app.android.marketing.widgets.enableNotifications.presentation.view.EnableNotificationsView;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.TileVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate.RichContentDoubleTileBinderDelegate;
import ru.ozon.app.android.search.widgets.searchRequest.presentation.SearchRequestAdapter;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v2.presentation.preview.HotelsGalleryFullV2PreviewViewHolder;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.binders.UgcCountersLlBinder;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* renamed from: Az.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC2453a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1299c;

    public /* synthetic */ ViewOnClickListenerC2453a(int i11, Object obj, Object obj2) {
        this.f1297a = i11;
        this.f1298b = obj;
        this.f1299c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1297a) {
            case 0:
                EnableNotificationsView.setCloseButton$lambda$6$lambda$5((EnableNotificationsVO.CloseButton) this.f1298b, (Function1) this.f1299c, view);
                return;
            case 1:
                BannerIcon.fadeIn$lambda$7$lambda$6((AddressEditMapVO.MapIcon.BannerIcon) this.f1298b, (BannerIcon) this.f1299c, view);
                return;
            case 2:
                RichContentDoubleTileBinderDelegate.DefaultImpls.bindTile$lambda$5$lambda$4$lambda$3((Function2) this.f1298b, (TileVO) this.f1299c, view);
                return;
            case 3:
                SearchRequestAdapter.SearchRequestWidgetVH._init_$lambda$0((SearchRequestAdapter.SearchRequestWidgetVH) this.f1298b, (Function1) this.f1299c, view);
                return;
            case 4:
                UgcCountersLlBinder.bindBlocks$lambda$9$lambda$4$lambda$3((UgcCountersLlBinder) this.f1298b, (UgcCountersVO.Block.Single) this.f1299c, view);
                return;
            case 5:
                HotelsGalleryFullV2PreviewViewHolder._init_$lambda$0((Function2) this.f1298b, (HotelsGalleryFullV2PreviewViewHolder) this.f1299c, view);
                return;
            case 6:
                CommonControlSettings common = ((ButtonV3DTO) this.f1298b).getCommon();
                ru.ozon.android.messenger.blocks.curtain.a aVar = (ru.ozon.android.messenger.blocks.curtain.a) this.f1299c;
                if (common != null) {
                    Map<String, TokenizedTrackingInfo> trackingInfo = common.getTrackingInfo();
                    if (trackingInfo != null) {
                        ru.ozon.android.messenger.framework.navigation.controller.a aVar2 = aVar.f84967a;
                        if (aVar2 == null) {
                            Intrinsics.n("controller");
                            throw null;
                        }
                        aVar2.m(h.a(trackingInfo));
                    }
                    AtomActionDTO action = common.getAction();
                    if (action != null) {
                        ru.ozon.android.messenger.framework.navigation.controller.a aVar3 = aVar.f84967a;
                        if (aVar3 == null) {
                            Intrinsics.n("controller");
                            throw null;
                        }
                        aVar3.q(b.c(action));
                    }
                }
                aVar.dismiss();
                return;
            case 7:
                l.a((IconButtonV3DTO) this.f1298b, (l) this.f1299c);
                return;
            default:
                RadioVH._init_$lambda$0((ComposerReferences) this.f1298b, (RadioVH) this.f1299c, view);
                return;
        }
    }
}
