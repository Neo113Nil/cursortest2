package org.betup.games.dice.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.betup.R;
import org.betup.games.common.ui.animation.BaseGameAnimationHelper;
import org.betup.games.dice.model.rest.GameResult;
import org.betup.ui.views.BetUpLabelView;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DiceAnimationHelper.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020*J\u0006\u00101\u001a\u00020*J\u0018\u00102\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,H\u0002J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,H\u0002J\u0010\u00108\u001a\u00020,2\u0006\u00105\u001a\u000206H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%¨\u00069"}, d2 = {"Lorg/betup/games/dice/ui/DiceAnimationHelper;", "Lorg/betup/games/common/ui/animation/BaseGameAnimationHelper;", "context", "Landroid/content/Context;", "firstDice", "Landroid/view/View;", "secondDice", "containerDialogResult", "Landroid/widget/LinearLayout;", "betUpLabelView", "Lorg/betup/ui/views/BetUpLabelView;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/widget/LinearLayout;Lorg/betup/ui/views/BetUpLabelView;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getFirstDice", "()Landroid/view/View;", "setFirstDice", "(Landroid/view/View;)V", "getSecondDice", "setSecondDice", "getContainerDialogResult", "()Landroid/widget/LinearLayout;", "setContainerDialogResult", "(Landroid/widget/LinearLayout;)V", "getBetUpLabelView", "()Lorg/betup/ui/views/BetUpLabelView;", "dialogAlphaAnimation", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "diceShakeMediaPlayer", "Landroid/media/MediaPlayer;", "getDiceShakeMediaPlayer", "()Landroid/media/MediaPlayer;", "setDiceShakeMediaPlayer", "(Landroid/media/MediaPlayer;)V", "fallingOnTableMediaPlayer", "getFallingOnTableMediaPlayer", "setFallingOnTableMediaPlayer", "starAnimation", "", "firstDiceNumber", "", "secondDiceNumber", "result", "Lorg/betup/games/dice/model/rest/GameResult;", "startDialogAnimation", "restoreViewsStates", "startDicesAnimation", "gameResultRandomizer", "Lorg/betup/games/dice/ui/RandomizerResult;", "dice", "Lorg/betup/games/dice/ui/Dice;", "number", "getRandomAnimation", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DiceAnimationHelper extends BaseGameAnimationHelper {
    public static final int $stable = 8;
    private final BetUpLabelView betUpLabelView;
    private LinearLayout containerDialogResult;
    private Context context;
    private final ObjectAnimator dialogAlphaAnimation;
    private MediaPlayer diceShakeMediaPlayer;
    private MediaPlayer fallingOnTableMediaPlayer;
    private View firstDice;
    private View secondDice;

    public final Context getContext() {
        return this.context;
    }

    public final View getFirstDice() {
        return this.firstDice;
    }

    public final View getSecondDice() {
        return this.secondDice;
    }

    public final void setContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setFirstDice(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.firstDice = view;
    }

    public final void setSecondDice(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.secondDice = view;
    }

    public final BetUpLabelView getBetUpLabelView() {
        return this.betUpLabelView;
    }

    public final LinearLayout getContainerDialogResult() {
        return this.containerDialogResult;
    }

    public final void setContainerDialogResult(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.containerDialogResult = linearLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiceAnimationHelper(Context context, View firstDice, View secondDice, LinearLayout containerDialogResult, BetUpLabelView betUpLabelView) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(firstDice, "firstDice");
        Intrinsics.checkNotNullParameter(secondDice, "secondDice");
        Intrinsics.checkNotNullParameter(containerDialogResult, "containerDialogResult");
        Intrinsics.checkNotNullParameter(betUpLabelView, "betUpLabelView");
        this.context = context;
        this.firstDice = firstDice;
        this.secondDice = secondDice;
        this.containerDialogResult = containerDialogResult;
        this.betUpLabelView = betUpLabelView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(containerDialogResult, "alpha", 0.2f, 1.0f);
        this.dialogAlphaAnimation = ofFloat;
        this.fallingOnTableMediaPlayer = MediaPlayer.create(this.context, R.raw.dice_falling_on_table);
        this.diceShakeMediaPlayer = MediaPlayer.create(this.context, R.raw.dice_shake);
        ofFloat.setDuration(650L);
    }

    public final MediaPlayer getDiceShakeMediaPlayer() {
        return this.diceShakeMediaPlayer;
    }

    public final void setDiceShakeMediaPlayer(MediaPlayer mediaPlayer) {
        this.diceShakeMediaPlayer = mediaPlayer;
    }

    public final MediaPlayer getFallingOnTableMediaPlayer() {
        return this.fallingOnTableMediaPlayer;
    }

    public final void setFallingOnTableMediaPlayer(MediaPlayer mediaPlayer) {
        this.fallingOnTableMediaPlayer = mediaPlayer;
    }

    public final void starAnimation(int firstDiceNumber, int secondDiceNumber, GameResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        startDicesAnimation(firstDiceNumber, secondDiceNumber);
        if (result == GameResult.WON) {
            BetUpLabelView.animationWon$default(this.betUpLabelView, 0L, 1, null);
        }
        if (result == GameResult.LOST) {
            BetUpLabelView.animationLost$default(this.betUpLabelView, 0L, 1, null);
        }
    }

    public final void startDialogAnimation() {
        this.dialogAlphaAnimation.start();
    }

    public final void restoreViewsStates() {
        this.containerDialogResult.clearAnimation();
        this.firstDice.clearAnimation();
        this.secondDice.clearAnimation();
        this.betUpLabelView.restoreViewsStates();
    }

    private final void startDicesAnimation(int firstDiceNumber, int secondDiceNumber) {
        RandomizerResult gameResultRandomizer = gameResultRandomizer(Dice.SECOND, firstDiceNumber);
        RandomizerResult gameResultRandomizer2 = gameResultRandomizer(Dice.FIRST, secondDiceNumber);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.context, gameResultRandomizer2.getDiceAnimation());
        this.firstDice.setBackgroundResource(gameResultRandomizer2.getDiceId());
        this.firstDice.startAnimation(loadAnimation);
        this.firstDice.setVisibility(0);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.context, gameResultRandomizer.getDiceAnimation());
        this.secondDice.setBackgroundResource(gameResultRandomizer.getDiceId());
        this.secondDice.startAnimation(loadAnimation2);
        this.secondDice.setVisibility(0);
    }

    private final RandomizerResult gameResultRandomizer(Dice dice, int number) {
        int randomAnimation = getRandomAnimation(dice);
        if (number == 1) {
            return new RandomizerResult(R.drawable.dice_1, randomAnimation);
        }
        if (number == 2) {
            return new RandomizerResult(R.drawable.dice_2, randomAnimation);
        }
        if (number == 3) {
            return new RandomizerResult(R.drawable.dice_3, randomAnimation);
        }
        if (number == 4) {
            return new RandomizerResult(R.drawable.dice_4, randomAnimation);
        }
        if (number == 5) {
            return new RandomizerResult(R.drawable.dice_5, randomAnimation);
        }
        return new RandomizerResult(R.drawable.dice_6, randomAnimation);
    }

    private final int getRandomAnimation(Dice dice) {
        int nextInt = Random.INSTANCE.nextInt(1, 4);
        return dice == Dice.FIRST ? nextInt != 1 ? nextInt != 2 ? R.anim.first_dice_animation_3 : R.anim.first_dice_animation_2 : R.anim.first_dice_animation_1 : nextInt != 1 ? nextInt != 2 ? R.anim.second_dice_animation_3 : R.anim.second_dice_animation_2 : R.anim.second_dice_animation_1;
    }
}
