package Gw;

import Ve.C4171d1;
import Ve.C4318i4;
import Ve.C4667u7;
import Ve.C4699va;
import Ve.Gc;
import Ve.N5;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.abtool.presentation.features.recycler.NumberAbToggleHolder;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.ActionFieldVH;
import ru.ozon.app.android.fresh.main.widgets.redirectButton.presentation.ExpressRedirectButtonViewHolder;
import ru.ozon.app.android.fresh.unsorted.databinding.ReturnItemViewBinding;
import ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v2.presentation.item.ProductsInBotV2ItemView;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation.BigPromoPDPViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryVideoViewHolder;
import ru.ozon.fintech.features.pinpad.presentation.pinpad.PinPadFragment;
import ru.ozon.fintech.ui.cardV2.CardV2View;

/* renamed from: Gw.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC3131a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10319b;

    public /* synthetic */ ViewOnClickListenerC3131a(Object obj, int i11) {
        this.f10318a = i11;
        this.f10319b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10318a) {
            case 0:
                ExpressRedirectButtonViewHolder._init_$lambda$0((ExpressRedirectButtonViewHolder) this.f10319b, view);
                break;
            case 1:
                ProductsInBotV2ItemView.setDisabled$lambda$8$lambda$7((ReturnItemViewBinding) this.f10319b, view);
                break;
            case 2:
                PinPadFragment.H((PinPadFragment) this.f10319b);
                break;
            case 3:
                N5 this$0 = (N5) this.f10319b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((C4667u7) this$0.u()).f0(C4171d1.f30845b);
                break;
            case 4:
                C4699va this$02 = (C4699va) this.f10319b;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                ((C4318i4) this$02.u()).f0(Gc.f29071a);
                break;
            case 5:
                ((NumberAbToggleHolder) this.f10319b).resetLocal();
                break;
            case 6:
                HotelsGalleryVideoViewHolder._init_$lambda$4((HotelsGalleryVideoViewHolder) this.f10319b, view);
                break;
            case 7:
                ((Function0) this.f10319b).invoke();
                break;
            case 8:
                ActionFieldVH._init_$lambda$2((ActionFieldVH) this.f10319b, view);
                break;
            case 9:
                BigPromoPDPViewHolder._init_$lambda$0((BigPromoPDPViewHolder) this.f10319b, view);
                break;
            default:
                CardV2View._init_$lambda$1((CardV2View) this.f10319b, view);
                break;
        }
    }
}
