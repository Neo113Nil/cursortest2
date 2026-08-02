package EM;

import kotlin.Unit;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding.AviaSearchResultV4MultiFrameBindDelegate;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.presentation.viewHolders.ReviewGalleryBaseWidgetVH;

/* loaded from: classes10.dex */
public final /* synthetic */ class a implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7693a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7694b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f7693a = i11;
        this.f7694b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindStep1$lambda$0;
        Unit steps$lambda$4;
        switch (this.f7693a) {
            case 0:
                bindStep1$lambda$0 = AviaSearchResultV4MultiFrameBindDelegate.bindStep1$lambda$0((AviaSearchResultV4MultiFrameBindDelegate) this.f7694b);
                return bindStep1$lambda$0;
            default:
                steps$lambda$4 = ReviewGalleryBaseWidgetVH.steps$lambda$4((ReviewGalleryBaseWidgetVH) this.f7694b);
                return steps$lambda$4;
        }
    }
}
