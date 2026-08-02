package Ve;

import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.SpayDotsLoaderView;

/* loaded from: classes10.dex */
public final class Ni implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SpayDotsLoaderView f29560a;

    public Ni(SpayDotsLoaderView spayDotsLoaderView) {
        this.f29560a = spayDotsLoaderView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i11 = SpayDotsLoaderView.f98884m;
        this.f29560a.b();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
