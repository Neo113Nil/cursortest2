package B;

import C2.r;
import androidx.concurrent.futures.b;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorView;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter.IndicatorAnimationController;

/* loaded from: classes8.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1309b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1310c;

    public /* synthetic */ f(int i11, Object obj, Object obj2) {
        this.f1308a = i11;
        this.f1309b = obj;
        this.f1310c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1308a) {
            case 0:
                g.c((g) this.f1309b, (b.a) this.f1310c);
                return;
            case 1:
                L2.a this$0 = (L2.a) this.f1309b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                D2.g e11 = (D2.g) this.f1310c;
                Intrinsics.checkNotNullParameter(e11, "$e");
                r rVar = this$0.f16205f;
                if (rVar != null) {
                    rVar.a(e11);
                    return;
                } else {
                    Intrinsics.n("callback");
                    throw null;
                }
            default:
                ((IndicatorAnimationController) this.f1309b).startTriggerIncreaseIndicatorAnimation((IndicatorView) this.f1310c);
                return;
        }
    }
}
