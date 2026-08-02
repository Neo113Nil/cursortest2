package SD;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import jk0.j;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.BaseGalleryV4ViewHolder;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.adapter.HotelsGalleryVideoViewHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f26067b;

    public /* synthetic */ a(j jVar, int i11) {
        this.f26066a = i11;
        this.f26067b = jVar;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
        switch (this.f26066a) {
            case 0:
                BaseGalleryV4ViewHolder.lifecycleObserver$lambda$0((BaseGalleryV4ViewHolder) this.f26067b, j11, aVar);
                break;
            default:
                HotelsGalleryVideoViewHolder.lifecycleObserver$lambda$0((HotelsGalleryVideoViewHolder) this.f26067b, j11, aVar);
                break;
        }
    }
}
