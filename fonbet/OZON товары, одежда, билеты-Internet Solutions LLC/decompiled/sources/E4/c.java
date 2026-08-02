package E4;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.GalleryFullViewViewHolder;

/* loaded from: classes8.dex */
public final /* synthetic */ class c implements G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7438b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f7437a = i11;
        this.f7438b = obj;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(J j11, AbstractC5434v.a aVar) {
        switch (this.f7437a) {
            case 0:
                e.m((e) this.f7438b, j11, aVar);
                break;
            default:
                GalleryFullViewViewHolder.lifecycleObserver$lambda$1((GalleryFullViewViewHolder) this.f7438b, j11, aVar);
                break;
        }
    }
}
