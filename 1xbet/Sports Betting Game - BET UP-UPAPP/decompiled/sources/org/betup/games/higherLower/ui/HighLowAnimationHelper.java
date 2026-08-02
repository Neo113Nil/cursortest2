package org.betup.games.higherLower.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.games.common.ui.animation.BaseGameAnimationHelper;
import org.betup.games.dice.model.rest.GameResult;
import org.betup.utils.DimensionsUtil;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: HighLowAninationHelper.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0015J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lorg/betup/games/higherLower/ui/HighLowAnimationHelper;", "Lorg/betup/games/common/ui/animation/BaseGameAnimationHelper;", "context", "Landroid/content/Context;", "placeBetcoinsAmountContainerLink", "Landroid/view/View;", "selectBetTypeContainerLink", "containerHighLowerResult", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "placeBetcoinsButtonMargin", "", "placeBetcoinsAmountContainerShowAnimator", "Landroid/animation/ObjectAnimator;", "placeBetcoinsAmountContainerHideAnimator", "selectBetTypeButtonMargin", "selectBetTypeContainerShowAnimator", "selectBetTypeContainerHideAnimator", "selectResultContainerFadeOutAnimator", "selectResultContainerFadeInAnimator", "startShowBetcoinsAnimation", "", "startHideBetcoinsAnimation", "startShowBetTypeAnimation", "startHideBetTypeAnimation", "startShowResultAnimation", "gameResult", "Lorg/betup/games/dice/model/rest/GameResult;", "startHideResultAnimation", "removeAllListeners", "initPlaceBetcoinsAmountContainerAnimations", "initSelectBetTypeContainerAnimations", "initSelectResultContainerAnimations", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HighLowAnimationHelper extends BaseGameAnimationHelper {
    public static final int $stable = 8;
    private final View containerHighLowerResult;
    private ObjectAnimator placeBetcoinsAmountContainerHideAnimator;
    private final View placeBetcoinsAmountContainerLink;
    private ObjectAnimator placeBetcoinsAmountContainerShowAnimator;
    private float placeBetcoinsButtonMargin;
    private float selectBetTypeButtonMargin;
    private ObjectAnimator selectBetTypeContainerHideAnimator;
    private final View selectBetTypeContainerLink;
    private ObjectAnimator selectBetTypeContainerShowAnimator;
    private ObjectAnimator selectResultContainerFadeInAnimator;
    private ObjectAnimator selectResultContainerFadeOutAnimator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighLowAnimationHelper(Context context, View placeBetcoinsAmountContainerLink, View selectBetTypeContainerLink, View containerHighLowerResult) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placeBetcoinsAmountContainerLink, "placeBetcoinsAmountContainerLink");
        Intrinsics.checkNotNullParameter(selectBetTypeContainerLink, "selectBetTypeContainerLink");
        Intrinsics.checkNotNullParameter(containerHighLowerResult, "containerHighLowerResult");
        this.placeBetcoinsAmountContainerLink = placeBetcoinsAmountContainerLink;
        this.selectBetTypeContainerLink = selectBetTypeContainerLink;
        this.containerHighLowerResult = containerHighLowerResult;
        this.placeBetcoinsButtonMargin = 32.0f;
        this.selectBetTypeButtonMargin = 16.0f;
        this.placeBetcoinsButtonMargin = DimensionsUtil.getPixelsFromDp(context, 32);
        this.selectBetTypeButtonMargin = DimensionsUtil.getPixelsFromDp(context, 16);
        initPlaceBetcoinsAmountContainerAnimations();
        initSelectBetTypeContainerAnimations();
        initSelectResultContainerAnimations();
    }

    public final void startShowBetcoinsAnimation() {
        if (this.placeBetcoinsAmountContainerLink.getVisibility() != 0) {
            this.placeBetcoinsAmountContainerLink.setVisibility(0);
        }
        ObjectAnimator objectAnimator = this.placeBetcoinsAmountContainerShowAnimator;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    public final void startHideBetcoinsAnimation() {
        ObjectAnimator objectAnimator = this.placeBetcoinsAmountContainerHideAnimator;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        new Handler().postDelayed(new Runnable() { // from class: org.betup.games.higherLower.ui.HighLowAnimationHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                HighLowAnimationHelper.startHideBetcoinsAnimation$lambda$0(HighLowAnimationHelper.this);
            }
        }, 650L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startHideBetcoinsAnimation$lambda$0(HighLowAnimationHelper highLowAnimationHelper) {
        highLowAnimationHelper.placeBetcoinsAmountContainerLink.setVisibility(4);
    }

    public final void startShowBetTypeAnimation() {
        this.selectBetTypeContainerLink.setVisibility(0);
        ObjectAnimator objectAnimator = this.selectBetTypeContainerShowAnimator;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
    }

    public final void startHideBetTypeAnimation() {
        ObjectAnimator objectAnimator = this.selectBetTypeContainerHideAnimator;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        new Handler().postDelayed(new Runnable() { // from class: org.betup.games.higherLower.ui.HighLowAnimationHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                HighLowAnimationHelper.startHideBetTypeAnimation$lambda$1(HighLowAnimationHelper.this);
            }
        }, 650L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startHideBetTypeAnimation$lambda$1(HighLowAnimationHelper highLowAnimationHelper) {
        highLowAnimationHelper.selectBetTypeContainerLink.setVisibility(4);
    }

    public final void startShowResultAnimation(final GameResult gameResult) {
        Intrinsics.checkNotNullParameter(gameResult, "gameResult");
        new Handler().postDelayed(new Runnable() { // from class: org.betup.games.higherLower.ui.HighLowAnimationHelper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                HighLowAnimationHelper.startShowResultAnimation$lambda$2(HighLowAnimationHelper.this, gameResult);
            }
        }, 750L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startShowResultAnimation$lambda$2(HighLowAnimationHelper highLowAnimationHelper, GameResult gameResult) {
        ObjectAnimator objectAnimator = highLowAnimationHelper.selectResultContainerFadeInAnimator;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        if (gameResult == GameResult.WON) {
            BaseGameAnimationHelper.playWonSound$default(highLowAnimationHelper, 0L, 1, null);
        } else if (gameResult == GameResult.LOST) {
            BaseGameAnimationHelper.playLoseSound$default(highLowAnimationHelper, 0L, 1, null);
        }
        highLowAnimationHelper.containerHighLowerResult.setVisibility(0);
    }

    public final void startHideResultAnimation() {
        ObjectAnimator objectAnimator = this.selectResultContainerFadeOutAnimator;
        if (objectAnimator != null) {
            objectAnimator.start();
        }
        new Handler().postDelayed(new Runnable() { // from class: org.betup.games.higherLower.ui.HighLowAnimationHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                HighLowAnimationHelper.startHideResultAnimation$lambda$3(HighLowAnimationHelper.this);
            }
        }, 650L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startHideResultAnimation$lambda$3(HighLowAnimationHelper highLowAnimationHelper) {
        highLowAnimationHelper.containerHighLowerResult.setVisibility(4);
    }

    public final void removeAllListeners() {
        ObjectAnimator objectAnimator = this.placeBetcoinsAmountContainerShowAnimator;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.placeBetcoinsAmountContainerHideAnimator;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
        }
        ObjectAnimator objectAnimator3 = this.selectBetTypeContainerShowAnimator;
        if (objectAnimator3 != null) {
            objectAnimator3.removeAllListeners();
        }
        ObjectAnimator objectAnimator4 = this.selectBetTypeContainerHideAnimator;
        if (objectAnimator4 != null) {
            objectAnimator4.removeAllListeners();
        }
        ObjectAnimator objectAnimator5 = this.selectResultContainerFadeInAnimator;
        if (objectAnimator5 != null) {
            objectAnimator5.removeAllListeners();
        }
        ObjectAnimator objectAnimator6 = this.selectResultContainerFadeOutAnimator;
        if (objectAnimator6 != null) {
            objectAnimator6.removeAllListeners();
        }
        removeActiveListeners();
    }

    private final void initPlaceBetcoinsAmountContainerAnimations() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.placeBetcoinsAmountContainerLink, "translationY", r0.getHeight() + this.placeBetcoinsButtonMargin, 0.0f);
        this.placeBetcoinsAmountContainerShowAnimator = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(650L);
        }
        ObjectAnimator objectAnimator = this.placeBetcoinsAmountContainerShowAnimator;
        if (objectAnimator != null) {
            objectAnimator.addListener(this);
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.placeBetcoinsAmountContainerLink, "translationY", 0.0f, r0.getHeight() + this.placeBetcoinsButtonMargin);
        this.placeBetcoinsAmountContainerHideAnimator = ofFloat2;
        if (ofFloat2 != null) {
            ofFloat2.setDuration(650L);
        }
        ObjectAnimator objectAnimator2 = this.placeBetcoinsAmountContainerHideAnimator;
        if (objectAnimator2 != null) {
            objectAnimator2.addListener(this);
        }
    }

    private final void initSelectBetTypeContainerAnimations() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.selectBetTypeContainerLink, "translationY", r0.getHeight() + this.selectBetTypeButtonMargin, 0.0f);
        this.selectBetTypeContainerShowAnimator = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(650L);
        }
        ObjectAnimator objectAnimator = this.selectBetTypeContainerShowAnimator;
        if (objectAnimator != null) {
            objectAnimator.addListener(this);
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.selectBetTypeContainerLink, "translationY", 0.0f, r0.getHeight() + this.selectBetTypeButtonMargin);
        this.selectBetTypeContainerHideAnimator = ofFloat2;
        if (ofFloat2 != null) {
            ofFloat2.setStartDelay(100L);
        }
        ObjectAnimator objectAnimator2 = this.selectBetTypeContainerHideAnimator;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(650L);
        }
        ObjectAnimator objectAnimator3 = this.selectBetTypeContainerHideAnimator;
        if (objectAnimator3 != null) {
            objectAnimator3.addListener(this);
        }
    }

    private final void initSelectResultContainerAnimations() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.containerHighLowerResult, "alpha", 0.0f, 1.0f);
        this.selectResultContainerFadeInAnimator = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(650L);
        }
        ObjectAnimator objectAnimator = this.selectResultContainerFadeInAnimator;
        if (objectAnimator != null) {
            objectAnimator.addListener(this);
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.containerHighLowerResult, "alpha", 1.0f, 0.0f);
        this.selectResultContainerFadeOutAnimator = ofFloat2;
        if (ofFloat2 != null) {
            ofFloat2.setDuration(650L);
        }
        ObjectAnimator objectAnimator2 = this.selectResultContainerFadeOutAnimator;
        if (objectAnimator2 != null) {
            objectAnimator2.addListener(this);
        }
    }
}
