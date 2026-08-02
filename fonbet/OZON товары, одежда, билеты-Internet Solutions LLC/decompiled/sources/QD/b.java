package QD;

import android.content.Context;
import android.view.View;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.header.s;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.InfoCardView;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.PriceV2VO$BonusInfo;
import ru.ozon.app.android.pdp.widgets.galleryV3.presentation.viewpager.VideoPreviewItemViewHolder;
import ru.ozon.app.android.storefront.databinding.MoleculeStoryItemMediaBinding;
import ru.ozon.app.android.storefront.stories.story.presentation.media.StoryMediaFragment;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayout;
import ru.ozon.fintech.ui.button.switchbutton.FinSwitchItem;
import ru.ozon.fintech.ui.button.switchbutton.FinSwitchItemView;

/* loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23116a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23117b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23118c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f23116a = i11;
        this.f23117b = obj;
        this.f23118c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23116a) {
            case 0:
                VideoPreviewItemViewHolder.bind$lambda$1$lambda$0((VideoPreviewItemViewHolder) this.f23117b, (GalleryV3VO.Item.OzonVideo) this.f23118c, view);
                break;
            case 1:
                FinSwitchItemView.bindState$lambda$4((FinSwitchItemView) this.f23117b, (FinSwitchItem.State) this.f23118c, view);
                break;
            case 2:
                TravelTextInputLayout._init_$lambda$7((TravelTextInputLayout) this.f23117b, (Context) this.f23118c, view);
                break;
            case 3:
                StoryMediaFragment.onError$lambda$41$lambda$40((MoleculeStoryItemMediaBinding) this.f23117b, (StoryMediaFragment) this.f23118c, view);
                break;
            case 4:
                d dVar = (d) this.f23117b;
                ru.ozon.android.messenger.framework.navigation.controller.a c11 = dVar.c();
                s sVar = (s) this.f23118c;
                c11.q(ru.ozon.android.messenger.framework.navigation.action.b.e(sVar.a(), null, 3));
                Map<String, MessengerTrackingInfo> l11 = sVar.l();
                if (l11 != null) {
                    dVar.c().m(l11);
                }
                dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(sVar.a(), null, 3));
                break;
            default:
                InfoCardView.bind$lambda$5$lambda$4((PriceV2VO$BonusInfo) this.f23117b, (Function1) this.f23118c, view);
                break;
        }
    }
}
