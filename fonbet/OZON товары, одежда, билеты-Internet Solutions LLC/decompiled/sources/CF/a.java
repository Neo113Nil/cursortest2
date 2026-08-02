package CF;

import android.animation.ValueAnimator;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.flashbar.animation.b;
import ru.ozon.app.android.product.addToCart.presentation.likezone.AnimationExtensionsKt;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4526a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4527b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f4526a = i11;
        this.f4527b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator it) {
        switch (this.f4526a) {
            case 0:
                AnimationExtensionsKt.animateLeftMarginChange$lambda$5$lambda$4((View) this.f4527b, it);
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                it.getAnimatedFraction();
                ((b.a) this.f4527b).onUpdate();
                break;
        }
    }
}
