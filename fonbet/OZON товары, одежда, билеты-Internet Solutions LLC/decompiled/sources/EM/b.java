package EM;

import kotlin.Unit;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding.AviaSearchResultV4MultiFrameBindDelegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7696b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f7695a = i11;
        this.f7696b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindStep2$lambda$1;
        switch (this.f7695a) {
            case 0:
                bindStep2$lambda$1 = AviaSearchResultV4MultiFrameBindDelegate.bindStep2$lambda$1((AviaSearchResultV4MultiFrameBindDelegate) this.f7696b);
                return bindStep2$lambda$1;
            default:
                return ReviewGalleryBaseWidgetVH.steps$lambda$5((ReviewGalleryBaseWidgetVH) this.f7696b);
        }
    }
}
