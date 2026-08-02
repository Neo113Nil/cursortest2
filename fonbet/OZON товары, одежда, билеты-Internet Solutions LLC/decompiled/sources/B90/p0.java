package B90;

import Ve.C4635t4;
import Ve.H3;
import Ve.M7;
import android.webkit.WebView;
import android.widget.ProgressBar;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image.GalleryV5PinchToZoomTouchListener;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.CharacteristicsGroupViewHolder;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4LocationsView;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4LocationsView$startTypingTextAnimation$1$1;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;

/* loaded from: classes3.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3183b;

    public /* synthetic */ p0(Object obj, int i11) {
        this.f3182a = i11;
        this.f3183b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f3183b;
        switch (this.f3182a) {
            case 0:
                v0.e0((v0) obj);
                return;
            case 1:
                H3 this$0 = (H3) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.isAdded()) {
                    X4.a aVar = this$0.f28693b;
                    if (aVar == null) {
                        throw M7.f29463a;
                    }
                    C4635t4 c4635t4 = (C4635t4) aVar;
                    WebView spaySlpnavwvWv = c4635t4.f32088e;
                    Intrinsics.checkNotNullExpressionValue(spaySlpnavwvWv, "spaySlpnavwvWv");
                    spaySlpnavwvWv.setVisibility(0);
                    ProgressBar spaySlpnavpbLoading = c4635t4.f32085b;
                    Intrinsics.checkNotNullExpressionValue(spaySlpnavpbLoading, "spaySlpnavpbLoading");
                    spaySlpnavpbLoading.setVisibility(8);
                    c4635t4.f32087d.setEnabled(true);
                    return;
                }
                return;
            case 2:
                ((GalleryV5PinchToZoomTouchListener) obj).clearZoom();
                return;
            case 3:
                CharacteristicsGroupViewHolder.bind$lambda$3$lambda$2$lambda$1((CharacteristicsGroupViewHolder) obj);
                return;
            case 4:
                int i11 = PermissionsScreenStateView.f96633c;
                ((PermissionsScreenStateView) obj).expand();
                return;
            default:
                SearchFormV4LocationsView$startTypingTextAnimation$1$1.onAnimationEnd$lambda$0((SearchFormV4LocationsView) obj);
                return;
        }
    }
}
