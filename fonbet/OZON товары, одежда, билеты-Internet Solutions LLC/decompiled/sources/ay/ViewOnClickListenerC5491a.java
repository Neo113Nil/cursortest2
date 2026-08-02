package ay;

import android.view.View;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.adapter.WholeSaleItemViewHolder;
import ru.ozon.app.android.pdp.ui.configurators.ugc.reviewMedia.presentation.MediaVO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.ReviewGalleryV2ProductButtonBinder;
import ru.ozon.app.android.ugc.core.widgets.singlereview.gallery.views.SingleReviewGalleryItemView;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

/* renamed from: ay.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC5491a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45580c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f45581d;

    public /* synthetic */ ViewOnClickListenerC5491a(Object obj, Object obj2, Object obj3, int i11) {
        this.f45578a = i11;
        this.f45579b = obj;
        this.f45580c = obj2;
        this.f45581d = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f45578a) {
            case 0:
                WholeSaleItemViewHolder.setOnClickListener$lambda$2((WholeSaleItemViewHolder) this.f45579b, (Map) this.f45580c, (Map) this.f45581d, view);
                break;
            case 1:
                ReviewGalleryV2ProductButtonBinder.bind$lambda$1((ButtonV3Atom.AddToCartAtom.AddToCartButtonImage) this.f45579b, (ReviewGalleryV2ProductButtonBinder) this.f45580c, (Long) this.f45581d, view);
                break;
            default:
                SingleReviewGalleryItemView.bindMedia$lambda$0((MediaVO) this.f45579b, (SingleReviewGalleryItemView) this.f45580c, (Function1) this.f45581d, view);
                break;
        }
    }
}
