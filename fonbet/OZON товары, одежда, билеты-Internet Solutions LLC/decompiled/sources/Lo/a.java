package Lo;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import kc0.C7645c;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.checkoutcomposer.split.presentation.elements.carouselSelector.CarouselSelectorViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryPhotoViewHolder;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeVO;
import ru.ozon.app.android.travel.molecules.view.infoBadge.InfoBadgeView;
import ru.ozon.id.nativeauth.data.models.b;
import tj.e;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17156c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f17154a = i11;
        this.f17156c = obj;
        this.f17155b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f17154a) {
            case 0:
                CarouselSelectorViewHolder.lambda$2$lambda$1((CarouselSelectorViewHolder) this.f17156c, (Function1) this.f17155b, view);
                break;
            case 1:
                HotelsGalleryPhotoViewHolder._init_$lambda$0((HotelsGalleryPhotoViewHolder) this.f17156c, (Function1) this.f17155b, view);
                break;
            case 2:
                C7645c.u((C7645c) this.f17156c, (b.c) this.f17155b);
                break;
            case 3:
                InfoBadgeView.bind$lambda$8((InfoBadgeVO) this.f17156c, (Function1) this.f17155b, view);
                break;
            default:
                e.v((e) this.f17156c, (SwitchCompat) this.f17155b);
                break;
        }
    }
}
