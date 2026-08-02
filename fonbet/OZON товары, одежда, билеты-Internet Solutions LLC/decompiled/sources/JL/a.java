package JL;

import C2.C2713h;
import C2.r;
import Z50.d;
import Zi.c;
import android.view.animation.TranslateAnimation;
import com.google.common.util.concurrent.m;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.regulardraw.ui.indicator.IndicatorView;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v1.presentation.adapter.IndicatorAnimationController;
import ru.ozon.app.android.storefront.widgets.rateApp.presentation.RateAppViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;
import spay.sdk.view.SpayDotsLoaderView;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14285c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f14283a = i11;
        this.f14284b = obj;
        this.f14285c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14283a) {
            case 0:
                RateAppViewHolder.AnonymousClass1.invoke$lambda$3$lambda$2$lambda$1$lambda$0((RateAppViewHolder) this.f14284b, (AtomAction.ComposerAction) this.f14285c);
                return;
            case 1:
                SpayDotsLoaderView.a((SpayDotsLoaderView) this.f14284b, (TranslateAnimation) this.f14285c);
                return;
            case 2:
                L2.a this$0 = (L2.a) this.f14284b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C2713h response = (C2713h) this.f14285c;
                Intrinsics.checkNotNullParameter(response, "$response");
                r rVar = this$0.f16205f;
                if (rVar != null) {
                    rVar.onResult(response);
                    return;
                } else {
                    Intrinsics.n("callback");
                    throw null;
                }
            case 3:
                d.e((d) this.f14284b, (WeakReference) this.f14285c);
                return;
            case 4:
                c.e((m) this.f14284b, (c) this.f14285c);
                return;
            default:
                ((IndicatorAnimationController) this.f14284b).clearTriggerAnimation((IndicatorView) this.f14285c);
                return;
        }
    }
}
