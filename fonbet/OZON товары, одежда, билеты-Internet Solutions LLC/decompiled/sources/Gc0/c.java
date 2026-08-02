package Gc0;

import Fc0.e;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f9920a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f9921b;

    c(d dVar, e eVar) {
        this.f9920a = dVar;
        this.f9921b = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f9920a.d(this.f9921b);
    }
}
