package Ve;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class I5 extends Transition {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f29214b = {"heightTransition:height", "heightTransition:viewType"};

    /* renamed from: a, reason: collision with root package name */
    public final long f29215a;

    public I5(long j11) {
        this.f29215a = j11;
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        Map map = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
        Object parent = transitionValues.view.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        View view = (View) parent;
        Point point = new Point();
        Object systemService = view.getContext().getSystemService("window");
        Intrinsics.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getSize(point);
        int i11 = 0;
        view.measure(View.MeasureSpec.makeMeasureSpec(point.x, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        Point point2 = new Point();
        Object systemService2 = view.getContext().getSystemService("window");
        Intrinsics.g(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService2).getDefaultDisplay().getSize(point2);
        int i12 = point2.y;
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        Integer valueOf = Integer.valueOf(identifier);
        if (identifier <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i11 = context.getResources().getDimensionPixelSize(valueOf.intValue());
        }
        int i13 = i12 - i11;
        if (measuredHeight > i13) {
            measuredHeight = i13;
        }
        map.put("heightTransition:height", Integer.valueOf(measuredHeight));
        Map map2 = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(map2, "transitionValues.values");
        map2.put("heightTransition:viewType", "end");
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        Intrinsics.checkNotNullParameter(transitionValues, "transitionValues");
        Map map = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(map, "transitionValues.values");
        map.put("heightTransition:height", Integer.valueOf(transitionValues.view.getHeight()));
        Map map2 = transitionValues.values;
        Intrinsics.checkNotNullExpressionValue(map2, "transitionValues.values");
        map2.put("heightTransition:viewType", "start");
        Object parent = transitionValues.view.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = view.getHeight();
            view.setLayoutParams(layoutParams);
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup sceneRoot, TransitionValues transitionValues, TransitionValues transitionValues2) {
        Intrinsics.checkNotNullParameter(sceneRoot, "sceneRoot");
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues2.view;
        Intrinsics.checkNotNullExpressionValue(view, "endValues.view");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        long j11 = this.f29215a;
        ofFloat.setDuration(j11);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        Intrinsics.checkNotNullExpressionValue(ofFloat, "ofFloat(view, View.ALPHA…eInterpolator()\n        }");
        Object obj = transitionValues.values.get("heightTransition:height");
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        Object obj2 = transitionValues2.values.get("heightTransition:height");
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue2 = ((Integer) obj2).intValue();
        View view2 = transitionValues2.view;
        Intrinsics.checkNotNullExpressionValue(view2, "endValues.view");
        ValueAnimator prepareHeightAnimator$lambda$10 = ValueAnimator.ofInt(intValue, intValue2);
        Object parent = view2.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        View view3 = (View) parent;
        prepareHeightAnimator$lambda$10.addUpdateListener(new Gt.c(view3, 2));
        Intrinsics.checkNotNullExpressionValue(prepareHeightAnimator$lambda$10, "prepareHeightAnimator$lambda$10");
        prepareHeightAnimator$lambda$10.addListener(new C4232f5(view3));
        prepareHeightAnimator$lambda$10.setStartDelay(j11 / 3);
        prepareHeightAnimator$lambda$10.setDuration(j11 / 2);
        prepareHeightAnimator$lambda$10.setInterpolator(new AccelerateInterpolator());
        Intrinsics.checkNotNullExpressionValue(prepareHeightAnimator$lambda$10, "prepareHeightAnimator(\n …Values.view\n            )");
        List b02 = C7714v.b0(ofFloat, prepareHeightAnimator$lambda$10);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(b02);
        return animatorSet;
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return f29214b;
    }
}
