package Fs;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.dialog.DialogBuilder;
import ru.ozon.app.android.dialog.sheetView.SheetViewDialog;
import ru.ozon.app.android.dialog.sheetView.SheetViewDialogBuilder;
import ru.ozon.app.android.ordertracking.v4.presentation.rv.OrderTrackingV4BarcodeViewHolder;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleInCartViewV4;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.header.HeaderVH;
import ru.ozon.fintech.ui.screenstateV20.ScreenStateV20;
import ru.ozon.fintech.ui.screenstateV20.ScreenStateViewV20;
import ru.ozon.uni.atoms.af.AtomAction;

/* renamed from: Fs.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class ViewOnClickListenerC3059a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9555a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9556b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9557c;

    public /* synthetic */ ViewOnClickListenerC3059a(int i11, Object obj, Object obj2) {
        this.f9555a = i11;
        this.f9556b = obj;
        this.f9557c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9555a) {
            case 0:
                SheetViewDialogBuilder.bindOrGone$lambda$3$lambda$2((SheetViewDialog) this.f9556b, (DialogBuilder.Button) this.f9557c, view);
                break;
            case 1:
                OrderTrackingV4BarcodeViewHolder.lambda$1$lambda$0((OrderTrackingV4BarcodeViewHolder) this.f9556b, (Function1) this.f9557c, view);
                break;
            case 2:
                HeaderVH._init_$lambda$2((HeaderVH) this.f9556b, (View) this.f9557c, view);
                break;
            case 3:
                ScreenStateViewV20.bindState$lambda$2((ScreenStateViewV20) this.f9556b, (ScreenStateV20.Error) this.f9557c, view);
                break;
            case 4:
                DoubleInCartViewV4.bindMainButton$lambda$1((CartButtonV4Dto.CartButton) this.f9556b, (DoubleInCartViewV4) this.f9557c, view);
                break;
            default:
                ((Function1) this.f9556b).invoke((AtomAction) this.f9557c);
                break;
        }
    }
}
