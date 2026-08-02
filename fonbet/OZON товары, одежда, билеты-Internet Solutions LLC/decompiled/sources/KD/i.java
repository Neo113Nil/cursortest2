package KD;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.core.viewmapper.b;
import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class i implements G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J f15422b;

    public /* synthetic */ i(J j11, int i11) {
        this.f15421a = i11;
        this.f15422b = j11;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(J j11, AbstractC5434v.a event) {
        switch (this.f15421a) {
            case 0:
                VideoGalleryFullViewHolder.lifecycleObserver$lambda$2((VideoGalleryFullViewHolder) this.f15422b, j11, event);
                break;
            default:
                Intrinsics.checkNotNullParameter(j11, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                ((b.C1565b) this.f15422b).a(event);
                break;
        }
    }
}
