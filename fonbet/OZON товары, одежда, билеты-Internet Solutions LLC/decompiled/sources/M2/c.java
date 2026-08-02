package M2;

import D2.s;
import E.V;
import Y.c;
import android.view.View;
import androidx.camera.core.impl.InterfaceC5129y0;
import io.sentry.I2;
import io.sentry.W2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.GalleryV5PinchToZoomTouchListener;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2VO;
import ru.ozon.app.android.search.widgets.tapTags.v2.presentation.TapTagsV2ViewHolder;

/* loaded from: classes8.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17275b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17276c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f17274a = i11;
        this.f17275b = obj;
        this.f17276c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17274a) {
            case 0:
                a this$0 = (a) this.f17275b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                s e11 = (s) this.f17276c;
                Intrinsics.checkNotNullParameter(e11, "$e");
                this$0.m().a(e11);
                break;
            case 1:
                TapTagsV2ViewHolder.updateFromBind$lambda$0((TapTagsV2ViewHolder) this.f17275b, (TapTagsV2VO) this.f17276c);
                break;
            case 2:
                ((InterfaceC5129y0.a) this.f17275b).a((c.a) this.f17276c);
                break;
            case 3:
                GalleryV5PinchToZoomTouchListener.moveToOriginPosition$lambda$15$lambda$14((View) this.f17275b, (GalleryV5PinchToZoomTouchListener) this.f17276c);
                break;
            default:
                try {
                    ((V) this.f17275b).run();
                    break;
                } catch (Throwable th2) {
                    ((W2) this.f17276c).getLogger().a(I2.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th2);
                }
        }
    }
}
