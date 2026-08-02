package BE;

import android.view.View;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.atoms.v3.molecules.list.rv.GalleryRecyclerViewAdapter;
import ru.ozon.app.android.atoms.v3.molecules.list.rv.holders.GalleryImagesCountViewHolder;
import ru.ozon.app.android.commonwidgets.widgets.logosList.presentation.LogosListAdapter;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartViewV4;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButton;
import ru.ozon.app.android.regulardraw.ui.button.MorkovskShadowButtonDTO;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3241a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3242b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3243c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f3241a = i11;
        this.f3242b = obj;
        this.f3243c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3241a) {
            case 0:
                ((Function1) this.f3242b).invoke((AtomAction) this.f3243c);
                break;
            case 1:
                MorkovskShadowButton.bind$lambda$1((Function1) this.f3242b, (MorkovskShadowButtonDTO) this.f3243c, view);
                break;
            case 2:
                GalleryRecyclerViewAdapter.onCreateViewHolder$lambda$5$lambda$4((GalleryImagesCountViewHolder) this.f3242b, (GalleryRecyclerViewAdapter) this.f3243c, view);
                break;
            case 3:
                CartViewV4.bindMainButton$lambda$2((CartButtonV4Dto.CartButton) this.f3242b, (CartViewV4) this.f3243c, view);
                break;
            default:
                LogosListAdapter.LogoViewHolder._init_$lambda$1((LogosListAdapter.LogoViewHolder) this.f3243c, (Function1) this.f3242b, view);
                break;
        }
    }

    public /* synthetic */ a(LogosListAdapter.LogoViewHolder logoViewHolder, Function1 function1) {
        this.f3241a = 4;
        this.f3243c = logoViewHolder;
        this.f3242b = function1;
    }
}
