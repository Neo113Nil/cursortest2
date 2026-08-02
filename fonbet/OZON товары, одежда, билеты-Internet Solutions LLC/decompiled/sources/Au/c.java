package Au;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4VO;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4View;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonVO;
import ru.ozon.app.android.fresh.unsorted.widgets.homeButton.presentation.HomeButtonViewHolder;
import ru.ozon.app.android.partpayment.formpage.view.vh.CheckerFieldVH;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewVO;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.UgcGalleryFullViewViewHolder;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.ugc.GalleryV4UgcVH;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.PreviewItemListAdapter;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryPreviewV2.presentation.ReviewGalleryPreviewV2VO;
import ru.ozon.fintech.ui.input.InputView;
import ru.ozon.fintech.ui.input.TextAreaInfoActionIconView;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes12.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1281c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f1279a = i11;
        this.f1280b = obj;
        this.f1281c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1279a) {
            case 0:
                ((Function1) this.f1280b).invoke((AtomAction) this.f1281c);
                break;
            case 1:
                UgcGalleryFullViewViewHolder.bind$lambda$1((GalleryFullViewVO.GalleryItemVO.Ugc) this.f1280b, (UgcGalleryFullViewViewHolder) this.f1281c, view);
                break;
            case 2:
                GalleryV4UgcVH.bind$lambda$1((GalleryV4VO.Item.Ugc) this.f1280b, (GalleryV4UgcVH) this.f1281c, view);
                break;
            case 3:
                CheckerFieldVH.CheckerSuggestsAdapter.SuggestVH._init_$lambda$0((CheckerFieldVH.CheckerSuggestsAdapter) this.f1280b, (CheckerFieldVH.CheckerSuggestsAdapter.SuggestVH) this.f1281c, view);
                break;
            case 4:
                PreviewItemListAdapter.onBindViewHolder$lambda$2((PreviewItemListAdapter) this.f1280b, (ReviewGalleryPreviewV2VO.ItemVO) this.f1281c, view);
                break;
            case 5:
                DeliveryWidgetV4View.bind$lambda$19$lambda$17((DeliveryWidgetV4View) this.f1280b, (DeliveryWidgetV4VO) this.f1281c, view);
                break;
            case 6:
                ru.ozon.android.messenger.blocks.input.attachments.presentation.a.g((ru.ozon.android.messenger.blocks.input.attachments.presentation.a) this.f1280b, (ru.ozon.android.messenger.blocks.input.attachments.presentation.b) this.f1281c);
                break;
            case 7:
                InputView.createTextAreaInfoActionIconView$lambda$11$lambda$10((TextAreaInfoActionIconView) this.f1280b, (InputView) this.f1281c, view);
                break;
            default:
                HomeButtonViewHolder.bind$lambda$6$lambda$5((HomeButtonViewHolder) this.f1280b, (HomeButtonVO) this.f1281c, view);
                break;
        }
    }
}
