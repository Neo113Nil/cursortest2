package H2;

import C2.r;
import E2.f;
import android.view.animation.TranslateAnimation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.presentation.SelectorDataConcreteStepViewHolder;
import ru.ozon.app.android.search.databinding.NoUiWidgetSelectorConcreteStepDataBinding;
import spay.sdk.view.SpayDotsLoaderView;

/* loaded from: classes8.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10518a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10519b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10520c;

    public /* synthetic */ b(int i11, Object obj, Object obj2) {
        this.f10518a = i11;
        this.f10519b = obj;
        this.f10520c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10518a) {
            case 0:
                r callback = (r) this.f10519b;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Exception e11 = (Exception) this.f10520c;
                Intrinsics.checkNotNullParameter(e11, "$e");
                callback.a(new D2.c(e11.getMessage()));
                return;
            case 1:
                SpayDotsLoaderView.b((SpayDotsLoaderView) this.f10519b, (TranslateAnimation) this.f10520c);
                return;
            case 2:
                L2.a this$0 = (L2.a) this.f10519b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                JSONException e12 = (JSONException) this.f10520c;
                Intrinsics.checkNotNullParameter(e12, "$e");
                r rVar = this$0.f16205f;
                if (rVar != null) {
                    rVar.a(new F2.a(new f(), e12.getMessage()));
                    return;
                } else {
                    Intrinsics.n("callback");
                    throw null;
                }
            default:
                SelectorDataConcreteStepViewHolder.lambda$3$lambda$2$lambda$1((NoUiWidgetSelectorConcreteStepDataBinding) this.f10519b, (SelectorDataConcreteStepViewHolder) this.f10520c);
                return;
        }
    }
}
