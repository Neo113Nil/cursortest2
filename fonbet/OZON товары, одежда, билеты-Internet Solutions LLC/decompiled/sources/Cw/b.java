package Cw;

import android.view.View;
import d70.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import ru.ozon.android.messenger.blocks.input.viewdelegates.j;
import ru.ozon.app.android.atoms.af.holders.CellRadioAtom;
import ru.ozon.app.android.atoms.v3.holders.disclosure.DisclosureHolder;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment;
import ru.ozon.app.android.cabinet.profiledatasettings.presentation.ui.ProfileGenderBottomSheet;
import ru.ozon.app.android.fresh.main.widgets.product.scroll.presentation.ScrollProductViewHolder;
import ru.ozon.app.android.partpayment.formpage.view.vh.UploadButtonVH;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.title.InstallmentTitleViewHolder;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.multibutton.relatedProductsBottomSheet.TileRelatedProductsBottomSheetView;
import ru.ozon.fintech.preferences.presentation.nativebridge.FintechNativeBridgeTestingFragment;
import ru.ozon.fintech.ui.button.small.FinSmallButtonView;
import ru.ozon.uni.android.atom.notification.view.NotificationBarView;
import ru.ozon.uni.atoms.v3.holders.labelRatingHolder.LabelRatingHolder;

/* loaded from: classes12.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5174b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f5173a = i11;
        this.f5174b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f5174b;
        switch (this.f5173a) {
            case 0:
                ScrollProductViewHolder._init_$lambda$3((ScrollProductViewHolder) obj, view);
                return;
            case 1:
                FintechNativeBridgeTestingFragment.v((FintechNativeBridgeTestingFragment) obj);
                return;
            case 2:
                CellRadioAtom._init_$lambda$2((CellRadioAtom) obj, view);
                return;
            case 3:
                ((ProfileGenderBottomSheet) obj).dismiss();
                return;
            case 4:
                UploadButtonVH._init_$lambda$0((UploadButtonVH) obj, view);
                return;
            case 5:
                FinSmallButtonView._init_$lambda$1((FinSmallButtonView) obj, view);
                return;
            case 6:
                DisclosureHolder._init_$lambda$0((DisclosureHolder) obj, view);
                return;
            case 7:
                LabelRatingHolder._init_$lambda$1((LabelRatingHolder) obj, view);
                return;
            case 8:
                TileRelatedProductsBottomSheetView.closeButton$lambda$3$lambda$2((TileRelatedProductsBottomSheetView) obj, view);
                return;
            case 9:
                ((Function0) obj).invoke();
                return;
            case 10:
                ProductPickerSearchFragment.prepareToolbar$lambda$18$lambda$17((ProductPickerSearchFragment) obj, view);
                return;
            case 11:
                int i11 = f.f72971Z;
                d dVar = ((f) obj).f73005x;
                if (dVar != null) {
                    dVar.g(false, d.a.NATIVE_BRIDGE);
                    return;
                } else {
                    Intrinsics.n("offlineManager");
                    throw null;
                }
            case 12:
                InstallmentTitleViewHolder._init_$lambda$0((InstallmentTitleViewHolder) obj, view);
                return;
            case 13:
                NotificationBarView.setupListeners$lambda$7((NotificationBarView) obj, view);
                return;
            default:
                j.a((j) obj);
                return;
        }
    }
}
