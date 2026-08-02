package org.betup.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import com.vk.sdk.api.model.VKApiUserFull;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: SnackbarAwareBehavior.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0003\u0010\tJ \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J \u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lorg/betup/utils/SnackbarAwareBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Landroid/view/View;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "marginAnimator", "Landroid/animation/ValueAnimator;", "layoutDependsOn", "", VKApiUserFull.RelativeType.PARENT, "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", VKApiUserFull.RelativeType.CHILD, "dependency", "onDependentViewChanged", "onDependentViewRemoved", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SnackbarAwareBehavior extends CoordinatorLayout.Behavior<View> {
    public static final int $stable = 8;
    private ValueAnimator marginAnimator;

    public SnackbarAwareBehavior() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarAwareBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(CoordinatorLayout parent, View child, View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        return dependency instanceof Snackbar.SnackbarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout parent, View child, View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        if (!(dependency instanceof Snackbar.SnackbarLayout)) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return false;
        }
        Snackbar.SnackbarLayout snackbarLayout = (Snackbar.SnackbarLayout) dependency;
        int coerceIn = RangesKt.coerceIn((int) (snackbarLayout.getHeight() - snackbarLayout.getTranslationY()), 0, snackbarLayout.getHeight());
        if (marginLayoutParams.bottomMargin == coerceIn) {
            return true;
        }
        marginLayoutParams.bottomMargin = coerceIn;
        child.requestLayout();
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDependentViewRemoved(CoordinatorLayout parent, final View child, View dependency) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(dependency, "dependency");
        if (dependency instanceof Snackbar.SnackbarLayout) {
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            final ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams == null) {
                return;
            }
            ValueAnimator valueAnimator = this.marginAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(marginLayoutParams.bottomMargin, 0);
            ofInt.setDuration(200L);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.betup.utils.SnackbarAwareBehavior$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SnackbarAwareBehavior.onDependentViewRemoved$lambda$1$lambda$0(marginLayoutParams, child, valueAnimator2);
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter() { // from class: org.betup.utils.SnackbarAwareBehavior$onDependentViewRemoved$1$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    SnackbarAwareBehavior.this.marginAnimator = null;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    SnackbarAwareBehavior.this.marginAnimator = null;
                }
            });
            ofInt.start();
            this.marginAnimator = ofInt;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDependentViewRemoved$lambda$1$lambda$0(ViewGroup.MarginLayoutParams marginLayoutParams, View view, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
        view.requestLayout();
    }
}
