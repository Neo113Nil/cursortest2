package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* renamed from: androidx.fragment.app.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5397s {
    @SuppressLint({"ResourceType"})
    static a a(@NonNull Context context, @NonNull ComponentCallbacksC5392m componentCallbacksC5392m, boolean z11, boolean z12) {
        int nextTransition = componentCallbacksC5392m.getNextTransition();
        int popEnterAnim = z12 ? z11 ? componentCallbacksC5392m.getPopEnterAnim() : componentCallbacksC5392m.getPopExitAnim() : z11 ? componentCallbacksC5392m.getEnterAnim() : componentCallbacksC5392m.getExitAnim();
        componentCallbacksC5392m.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = componentCallbacksC5392m.mContainer;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            componentCallbacksC5392m.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = componentCallbacksC5392m.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = componentCallbacksC5392m.onCreateAnimation(nextTransition, z11, popEnterAnim);
        if (onCreateAnimation != null) {
            return new a(onCreateAnimation);
        }
        Animator onCreateAnimator = componentCallbacksC5392m.onCreateAnimator(nextTransition, z11, popEnterAnim);
        if (onCreateAnimator != null) {
            return new a(onCreateAnimator);
        }
        if (popEnterAnim == 0 && nextTransition != 0) {
            popEnterAnim = nextTransition != 4097 ? nextTransition != 8194 ? nextTransition != 8197 ? nextTransition != 4099 ? nextTransition != 4100 ? -1 : z11 ? b(android.R.attr.activityOpenEnterAnimation, context) : b(android.R.attr.activityOpenExitAnimation, context) : z11 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z11 ? b(android.R.attr.activityCloseEnterAnimation, context) : b(android.R.attr.activityCloseExitAnimation, context) : z11 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z11 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (popEnterAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                } catch (Resources.NotFoundException e11) {
                    throw e11;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                if (loadAnimator != null) {
                    return new a(loadAnimator);
                }
            } catch (RuntimeException e12) {
                if (equals) {
                    throw e12;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                if (loadAnimation2 != null) {
                    return new a(loadAnimation2);
                }
            }
        }
        return null;
    }

    private static int b(int i11, @NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i11});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: androidx.fragment.app.s$a */
    /* loaded from: classes8.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f43165a;

        /* renamed from: b, reason: collision with root package name */
        public final AnimatorSet f43166b;

        a(Animation animation) {
            this.f43165a = animation;
            this.f43166b = null;
        }

        a(Animator animator) {
            this.f43165a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f43166b = animatorSet;
            animatorSet.play(animator);
        }
    }

    /* renamed from: androidx.fragment.app.s$b */
    /* loaded from: classes8.dex */
    static class b extends AnimationSet implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final ViewGroup f43167a;

        /* renamed from: b, reason: collision with root package name */
        private final View f43168b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f43169c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f43170d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f43171e;

        b(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f43171e = true;
            this.f43167a = viewGroup;
            this.f43168b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j11, @NonNull Transformation transformation) {
            this.f43171e = true;
            if (this.f43169c) {
                return !this.f43170d;
            }
            if (!super.getTransformation(j11, transformation)) {
                this.f43169c = true;
                androidx.core.view.G.a(this.f43167a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z11 = this.f43169c;
            ViewGroup viewGroup = this.f43167a;
            if (z11 || !this.f43171e) {
                viewGroup.endViewTransition(this.f43168b);
                this.f43170d = true;
            } else {
                this.f43171e = false;
                viewGroup.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j11, @NonNull Transformation transformation, float f7) {
            this.f43171e = true;
            if (this.f43169c) {
                return !this.f43170d;
            }
            if (!super.getTransformation(j11, transformation, f7)) {
                this.f43169c = true;
                androidx.core.view.G.a(this.f43167a, this);
            }
            return true;
        }
    }
}
