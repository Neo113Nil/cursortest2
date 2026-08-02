package au;

import WZ.l;
import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.android.messenger.blocks.chat.bx.b;
import ru.ozon.android.messenger.blocks.chat.bx.d;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.domain.CheckoutProductsVO;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation.recyclerview.CheckoutProductItemView;

/* renamed from: au.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC5489a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45572d;

    public /* synthetic */ ViewOnClickListenerC5489a(Object obj, Object obj2, Object obj3, int i11) {
        this.f45569a = i11;
        this.f45570b = obj;
        this.f45571c = obj2;
        this.f45572d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f45569a) {
            case 0:
                CheckoutProductItemView.bind$lambda$22((CheckoutProductsVO.ProductSplitVO) this.f45570b, (Function1) this.f45571c, (l) this.f45572d, view);
                break;
            default:
                d.d((d) this.f45570b, (b) this.f45571c, (p) this.f45572d);
                break;
        }
    }
}
