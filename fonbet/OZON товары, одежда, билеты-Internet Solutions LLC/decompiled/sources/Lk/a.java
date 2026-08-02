package Lk;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.replymessageblock.c;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.app.android.account.orders.emptyscreen.antibot.OpenBarcodeButtonConfig;
import ru.ozon.app.android.atoms.atom2.LabelAtom;
import ru.ozon.app.android.barcodecache.data.BarcodeData;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.presentation.SellerCarouselAdapter;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.products.ButtonItemView;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17137c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f17135a = i11;
        this.f17136b = obj;
        this.f17137c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar;
        switch (this.f17135a) {
            case 0:
                OpenBarcodeButtonConfig.createButton$lambda$0((Context) this.f17136b, (BarcodeData) this.f17137c, view);
                break;
            case 1:
                LabelAtom.onAction$lambda$3((LabelAtom) this.f17136b, (Function1) this.f17137c, view);
                break;
            case 2:
                SellerCarouselAdapter.SellerViewHolder._init_$lambda$1((SellerCarouselAdapter) this.f17136b, (SellerCarouselAdapter.SellerViewHolder) this.f17137c, view);
                break;
            case 3:
                ButtonItemView.bind$lambda$9((ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductItemContentDTO.ButtonItem) this.f17136b, (Function1) this.f17137c, view);
                break;
            default:
                dVar = ((c) this.f17136b).f86373a;
                dVar.c().h(((ru.ozon.android.messenger.blocks.replymessageblock.a) this.f17137c).a().getReplyMessageId());
                break;
        }
    }
}
