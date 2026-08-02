package B90;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.curtain.CurtainNavBarLabelTextView;
import ru.ozon.app.android.marketing.widgets.stickyLadder.presentation.StickyLadderView;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation.FullTextSearchHeaderV4ViewHolder;
import ru.ozon.app.android.uikit.utils.DelayedVisibilityHandler;
import ru.ozon.app.android.videomolecule.presentation.visibilitydelegate.VideoMoleculeVisibilityDelegate;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3170b;

    public /* synthetic */ l0(Object obj, int i11) {
        this.f3169a = i11;
        this.f3170b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3169a) {
            case 0:
                v0.w0((v0) this.f3170b);
                return;
            case 1:
                VideoMoleculeVisibilityDelegate.inActivityCallback$lambda$5((VideoMoleculeVisibilityDelegate) this.f3170b);
                return;
            case 2:
                CurtainNavBarLabelTextView.setSmallTypePaddings$lambda$0((CurtainNavBarLabelTextView) this.f3170b);
                return;
            case 3:
                L2.a this$0 = (L2.a) this.f3170b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C2.r rVar = this$0.f16205f;
                if (rVar != null) {
                    rVar.a(new D2.k("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                    return;
                } else {
                    Intrinsics.n("callback");
                    throw null;
                }
            case 4:
                FullTextSearchHeaderV4ViewHolder.showOrGoneContent$lambda$9$lambda$8((RecyclerView) this.f3170b);
                return;
            case 5:
                io.sentry.android.replay.screenshot.f.f((io.sentry.android.replay.screenshot.f) this.f3170b);
                return;
            case 6:
                ViewExtKt.gone((StickyLadderView) this.f3170b);
                return;
            case 7:
                DelayedVisibilityHandler.delayedShow$lambda$1((DelayedVisibilityHandler) this.f3170b);
                return;
            default:
                CartButtonV5WidgetViewHolder.postRunnableBind$lambda$2((CartButtonV5WidgetViewHolder) this.f3170b);
                return;
        }
    }
}
