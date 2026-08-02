package androidx.lifecycle;

import androidx.lifecycle.AbstractC5434v;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.presentation.pager.HotelsGalleryFullPagerVideoViewHolder;

/* renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C5433u implements G {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43390b;

    public /* synthetic */ C5433u(Object obj, int i11) {
        this.f43389a = i11;
        this.f43390b = obj;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(J j11, AbstractC5434v.a event) {
        switch (this.f43389a) {
            case 0:
                Ae.x0 mutableStateFlow = (Ae.x0) this.f43390b;
                Intrinsics.checkNotNullParameter(mutableStateFlow, "$mutableStateFlow");
                Intrinsics.checkNotNullParameter(j11, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(event, "event");
                mutableStateFlow.setValue(event.a());
                break;
            default:
                HotelsGalleryFullPagerVideoViewHolder.lifecycleObserver$lambda$0((HotelsGalleryFullPagerVideoViewHolder) this.f43390b, j11, event);
                break;
        }
    }
}
