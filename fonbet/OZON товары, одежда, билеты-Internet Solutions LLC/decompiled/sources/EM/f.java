package EM;

import kotlin.Unit;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.presentation.allDone.multiFrameBinding.AviaSearchResultV4MultiFrameBindDelegate;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilescroll.ui.adapter.vh.TileScrollBannerViewHolder;

/* loaded from: classes10.dex */
public final /* synthetic */ class f implements BindStep {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7701b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f7700a = i11;
        this.f7701b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Unit bindStep6$lambda$5;
        Unit steps$lambda$0;
        switch (this.f7700a) {
            case 0:
                bindStep6$lambda$5 = AviaSearchResultV4MultiFrameBindDelegate.bindStep6$lambda$5((AviaSearchResultV4MultiFrameBindDelegate) this.f7701b);
                return bindStep6$lambda$5;
            default:
                steps$lambda$0 = TileScrollBannerViewHolder.steps$lambda$0((TileScrollBannerViewHolder) this.f7701b);
                return steps$lambda$0;
        }
    }
}
