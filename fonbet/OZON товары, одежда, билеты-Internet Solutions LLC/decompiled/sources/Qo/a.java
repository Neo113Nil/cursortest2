package Qo;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitDetailV2VO;
import ru.ozon.app.android.checkoutcomposer.splitDetailV2.presentation.SplitVerticalViewHolder;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation.CheckoutButtonVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation.CheckoutButtonView;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23820d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i11) {
        this.f23817a = i11;
        this.f23818b = obj;
        this.f23819c = obj2;
        this.f23820d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23817a) {
            case 0:
                SplitVerticalViewHolder.bindQuantityControl$lambda$15$lambda$14((SplitDetailV2VO.Split.Vertical.QuantityControl) this.f23818b, (SplitVerticalViewHolder) this.f23819c, (AppCompatImageView) this.f23820d, view);
                break;
            default:
                CheckoutButtonView.bind$lambda$3$lambda$2((Function1) this.f23818b, (CheckoutButtonVO) this.f23819c, (Function1) this.f23820d, view);
                break;
        }
    }
}
