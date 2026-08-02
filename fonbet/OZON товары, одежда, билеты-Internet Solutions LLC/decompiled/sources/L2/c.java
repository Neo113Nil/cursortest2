package L2;

import C.s0;
import C2.r;
import D2.k;
import W.f0;
import Y.c;
import androidx.camera.core.impl.InterfaceC5129y0;
import androidx.camera.core.impl.W;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.presentation.logosCarousel.LogosCarouselSplitVH;
import ru.ozon.app.android.search.catalog.components.clusters.presentation.ClustersVO;
import ru.ozon.app.android.search.catalog.components.clusters.presentation.ClustersWidgetViewHolder;
import ru.ozon.uni.android.component.sheet.SheetDialog;

/* loaded from: classes8.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16229b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16230c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f16228a = i11;
        this.f16229b = obj;
        this.f16230c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16228a) {
            case 0:
                a this$0 = (a) this.f16229b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Throwable t2 = (Throwable) this.f16230c;
                Intrinsics.checkNotNullParameter(t2, "$t");
                r rVar = this$0.f16205f;
                if (rVar != null) {
                    rVar.a(new k(t2.getMessage()));
                    return;
                } else {
                    Intrinsics.n("callback");
                    throw null;
                }
            case 1:
                O.k.h((O.k) this.f16229b, (s0) this.f16230c);
                return;
            case 2:
                ClustersWidgetViewHolder.bind$lambda$3((ClustersWidgetViewHolder) this.f16229b, (ClustersVO) this.f16230c);
                return;
            case 3:
                f0.V((f0) this.f16229b, (W) this.f16230c);
                return;
            case 4:
                ((InterfaceC5129y0.a) ((Map.Entry) this.f16229b).getKey()).a((c.a) this.f16230c);
                return;
            case 5:
                ((LogosCarouselSplitVH) this.f16229b).scrollToItem((SplitDynamicElementVO.LogosCarousel) this.f16230c);
                return;
            default:
                SheetDialog.wrapSheetContent$lambda$18$lambda$17((ConstraintLayout) this.f16229b, (SheetDialog) this.f16230c);
                return;
        }
    }
}
