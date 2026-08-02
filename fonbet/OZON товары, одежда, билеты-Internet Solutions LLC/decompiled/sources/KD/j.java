package KD;

import ru.ozon.app.android.pdp.widgets.galleryFullView.presentation.fullView.VideoGalleryFullViewHolder;

/* loaded from: classes13.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15423a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15425c;

    public /* synthetic */ j(boolean z11, int i11, Object obj) {
        this.f15423a = i11;
        this.f15425c = obj;
        this.f15424b = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15423a) {
            case 0:
                VideoGalleryFullViewHolder.updateVolumeButtonVisibility$lambda$17((VideoGalleryFullViewHolder) this.f15425c, this.f15424b);
                break;
            default:
                ((O9.e) this.f15425c).f20079c.m(this.f15424b);
                break;
        }
    }
}
