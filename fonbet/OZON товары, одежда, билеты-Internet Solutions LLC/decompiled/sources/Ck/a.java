package Ck;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.orders.commonBarcode.presentation.fullwidth.CommonBarcodeFullWidthViewHolder;
import ru.ozon.app.android.fresh.main.widgets.header.presentation.HeaderViewHolder;
import ru.ozon.app.android.fresh.navigation.onboarding.FreshTabOnboardingDialog;
import ru.ozon.app.android.gallery.details.OzonVideoGalleryFragment;
import ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.imagetitle.BlackFridayStatusImageTitleViewHolder;
import ru.ozon.app.android.orderdetails.orderdetailsitem.presentation.OrderDetailsItemWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectCompactV2FooterWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.cart.CartQuantQuantView;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.miniature.BaseGalleryViewMiniatureViewHolder;
import ru.ozon.app.android.pdp.widgets.navBar.presentation.NavBarFavoriteMoleculeButton;
import ru.ozon.app.android.storefront.widgets.feedback.result.presentation.adapter.holders.ResultImageItemViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.SmallTileMoleculeDelegate;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5144b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f5143a = i11;
        this.f5144b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5143a) {
            case 0:
                CommonBarcodeFullWidthViewHolder._init_$lambda$0((CommonBarcodeFullWidthViewHolder) this.f5144b, view);
                break;
            case 1:
                ((Function0) this.f5144b).invoke();
                break;
            case 2:
                BaseGalleryViewMiniatureViewHolder._init_$lambda$0((BaseGalleryViewMiniatureViewHolder) this.f5144b, view);
                break;
            case 3:
                ResultImageItemViewHolder.onCreateViewHolder$lambda$0((ResultImageItemViewHolder) this.f5144b, view);
                break;
            case 4:
                PinPadFragment.E((PinPadFragment) this.f5144b);
                break;
            case 5:
                FreshTabOnboardingDialog.onViewCreated$lambda$2((FreshTabOnboardingDialog) this.f5144b, view);
                break;
            case 6:
                AspectCompactV2FooterWidgetViewHolder._init_$lambda$0((AspectCompactV2FooterWidgetViewHolder) this.f5144b, view);
                break;
            case 7:
                SmallTileMoleculeDelegate._init_$lambda$4((SmallTileMoleculeDelegate) this.f5144b, view);
                break;
            case 8:
                OzonVideoGalleryFragment.setupUi$lambda$16$lambda$15((OzonVideoGalleryFragment) this.f5144b, view);
                break;
            case 9:
                CartQuantQuantView.bindMinusPlus$lambda$3((CartQuantQuantView) this.f5144b, view);
                break;
            case 10:
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.f5144b;
                Context context = appCompatTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                CharSequence text = appCompatTextView.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                Intrinsics.checkNotNullParameter(context, "<this>");
                Intrinsics.checkNotNullParameter(text, "text");
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("", text));
                    break;
                }
                break;
            case 11:
                HeaderViewHolder._init_$lambda$0((HeaderViewHolder) this.f5144b, view);
                break;
            case 12:
                OrderDetailsItemWidgetViewHolder._init_$lambda$2((OrderDetailsItemWidgetViewHolder) this.f5144b, view);
                break;
            case 13:
                BlackFridayStatusImageTitleViewHolder.configureLeftImage$lambda$4$lambda$2((BlackFridayStatusImageTitleViewHolder) this.f5144b, view);
                break;
            default:
                NavBarFavoriteMoleculeButton._init_$lambda$1((NavBarFavoriteMoleculeButton) this.f5144b, view);
                break;
        }
    }
}
