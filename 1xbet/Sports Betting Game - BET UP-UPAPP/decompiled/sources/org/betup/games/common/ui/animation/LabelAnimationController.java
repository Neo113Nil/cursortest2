package org.betup.games.common.ui.animation;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LayoutAnimationController;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: LabelAnimationController.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020 J\b\u0010\"\u001a\u00020\u0019H\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lorg/betup/games/common/ui/animation/LabelAnimationController;", "Lorg/betup/games/common/ui/animation/BaseGameAnimationHelper;", "context", "Landroid/content/Context;", "label", "Landroid/widget/ImageView;", "starsLayout", "Landroid/widget/LinearLayout;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/widget/ImageView;Landroid/widget/LinearLayout;)V", "getContext", "()Landroid/content/Context;", "getLabel", "()Landroid/widget/ImageView;", "getStarsLayout", "()Landroid/widget/LinearLayout;", "handler", "Landroid/os/Handler;", "starLayoutAnimationWon", "Landroid/view/animation/LayoutAnimationController;", "labelAnimator", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "starsObjectAnimatorLost", "restoreViewsStates", "", "labelDrawableId", "", "starDrawableId", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "animationWon", "delay", "", "animationLost", "startLabelAnimation", "startStarsAnimationLost", "startStarsAnimationWon", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LabelAnimationController extends BaseGameAnimationHelper {
    public static final int $stable = 8;
    private final Context context;
    private Handler handler;
    private final ImageView label;
    private final ObjectAnimator labelAnimator;
    private final LayoutAnimationController starLayoutAnimationWon;
    private final LinearLayout starsLayout;
    private final ObjectAnimator starsObjectAnimatorLost;

    public final Context getContext() {
        return this.context;
    }

    public final ImageView getLabel() {
        return this.label;
    }

    public final LinearLayout getStarsLayout() {
        return this.starsLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelAnimationController(Context context, ImageView label, LinearLayout starsLayout) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(starsLayout, "starsLayout");
        this.context = context;
        this.label = label;
        this.starsLayout = starsLayout;
        this.handler = new Handler();
        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(context, (AttributeSet) null);
        this.starLayoutAnimationWon = layoutAnimationController;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(label, "alpha", 0.1f, 0.1f, 1.0f, 0.3f, 1.0f);
        this.labelAnimator = ofFloat;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(starsLayout, "alpha", 0.1f, 0.8f, 0.7f, 0.1f);
        this.starsObjectAnimatorLost = ofFloat2;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.1f, 1.0f);
        alphaAnimation.setDuration(350L);
        alphaAnimation.setFillAfter(true);
        layoutAnimationController.setAnimation(alphaAnimation);
        ofFloat.setDuration(1000L);
        ofFloat2.setDuration(1000L);
    }

    public final void restoreViewsStates(Integer labelDrawableId, Integer starDrawableId) {
        this.label.clearAnimation();
        this.starsLayout.clearAnimation();
        if (labelDrawableId != null) {
            this.label.setBackground(null);
            this.label.setColorFilter(ContextCompat.getColor(this.context, labelDrawableId.intValue()));
        }
        this.starsLayout.setAlpha(1.0f);
        if (starDrawableId != null) {
            LinearLayout linearLayout = this.starsLayout;
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = linearLayout.getChildAt(i);
                if (!(childAt instanceof View)) {
                    childAt = null;
                }
                if (childAt != null) {
                    ImageView imageView = (ImageView) childAt;
                    imageView.setColorFilter(ContextCompat.getColor(this.context, starDrawableId.intValue()));
                    imageView.setBackground(null);
                    imageView.setAlpha(1.0f);
                }
            }
        }
    }

    public static /* synthetic */ void animationWon$default(LabelAnimationController labelAnimationController, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        labelAnimationController.animationWon(j);
    }

    public final void animationWon(long delay) {
        this.handler.postDelayed(new Runnable() { // from class: org.betup.games.common.ui.animation.LabelAnimationController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                LabelAnimationController.animationWon$lambda$1(LabelAnimationController.this);
            }
        }, delay);
        if (delay == 0) {
            this.handler.postDelayed(new Runnable() { // from class: org.betup.games.common.ui.animation.LabelAnimationController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    LabelAnimationController.animationWon$lambda$2(LabelAnimationController.this);
                }
            }, 800L);
        } else {
            this.handler.postDelayed(new Runnable() { // from class: org.betup.games.common.ui.animation.LabelAnimationController$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    LabelAnimationController.animationWon$lambda$3(LabelAnimationController.this);
                }
            }, delay + 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationWon$lambda$1(LabelAnimationController labelAnimationController) {
        labelAnimationController.startLabelAnimation();
        labelAnimationController.startStarsAnimationWon();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationWon$lambda$2(LabelAnimationController labelAnimationController) {
        BaseGameAnimationHelper.playWonSound$default(labelAnimationController, 0L, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationWon$lambda$3(LabelAnimationController labelAnimationController) {
        BaseGameAnimationHelper.playWonSound$default(labelAnimationController, 0L, 1, null);
    }

    public static /* synthetic */ void animationLost$default(LabelAnimationController labelAnimationController, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        labelAnimationController.animationLost(j);
    }

    public final void animationLost(long delay) {
        this.handler.postDelayed(new Runnable() { // from class: org.betup.games.common.ui.animation.LabelAnimationController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LabelAnimationController.animationLost$lambda$4(LabelAnimationController.this);
            }
        }, delay);
        if (delay == 0) {
            this.handler.postDelayed(new Runnable() { // from class: org.betup.games.common.ui.animation.LabelAnimationController$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    LabelAnimationController.animationLost$lambda$5(LabelAnimationController.this);
                }
            }, 800L);
        } else {
            this.handler.postDelayed(new Runnable() { // from class: org.betup.games.common.ui.animation.LabelAnimationController$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    LabelAnimationController.animationLost$lambda$6(LabelAnimationController.this);
                }
            }, delay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationLost$lambda$4(LabelAnimationController labelAnimationController) {
        labelAnimationController.startLabelAnimation();
        labelAnimationController.startStarsAnimationLost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationLost$lambda$5(LabelAnimationController labelAnimationController) {
        BaseGameAnimationHelper.playLoseSound$default(labelAnimationController, 0L, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animationLost$lambda$6(LabelAnimationController labelAnimationController) {
        BaseGameAnimationHelper.playLoseSound$default(labelAnimationController, 0L, 1, null);
    }

    private final void startLabelAnimation() {
        this.label.setColorFilter(ContextCompat.getColor(this.context, R.color.transparent));
        this.label.setBackground(ContextCompat.getDrawable(this.context, R.drawable.betup_name_visible));
        this.labelAnimator.start();
    }

    private final void startStarsAnimationLost() {
        LinearLayout linearLayout = this.starsLayout;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (!(childAt instanceof View)) {
                childAt = null;
            }
            if (childAt != null) {
                ImageView imageView = (ImageView) childAt;
                imageView.setColorFilter(ContextCompat.getColor(this.context, R.color.transparent));
                imageView.setBackground(ContextCompat.getDrawable(this.context, R.drawable.star_ligthed));
            }
        }
        this.starsObjectAnimatorLost.start();
    }

    private final void startStarsAnimationWon() {
        LinearLayout linearLayout = this.starsLayout;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            if (!(childAt instanceof View)) {
                childAt = null;
            }
            if (childAt != null) {
                ImageView imageView = (ImageView) childAt;
                imageView.setColorFilter(ContextCompat.getColor(this.context, R.color.transparent));
                imageView.setBackground(ContextCompat.getDrawable(this.context, R.drawable.star_ligthed));
            }
        }
        this.starsLayout.setLayoutAnimation(this.starLayoutAnimationWon);
    }
}
