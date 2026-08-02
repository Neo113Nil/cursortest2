package org.betup.games.warGame.ui.animation;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.View;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.games.common.ui.animation.BaseGameAnimationHelper;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WarGameAnimationHelper.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0017J,\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u00172\b\b\u0002\u0010!\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lorg/betup/games/warGame/ui/animation/WarGameAnimationHelper;", "Lorg/betup/games/common/ui/animation/BaseGameAnimationHelper;", "context", "Landroid/content/Context;", "containerMakeCustomBet", "Landroid/view/View;", "containerDrawResult", "containerDialogResult", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "getContext", "()Landroid/content/Context;", "mediaPlayerSoundDraw", "Landroid/media/MediaPlayer;", "handler", "Landroid/os/Handler;", "dialogAlphaAnimationShow", "Landroid/animation/ObjectAnimator;", "dialogAlphaAnimationHide", "dispose", "", "playDrawSound", "delay", "", "stopAnimation", "stopAnimationListener", "Ljava/lang/Runnable;", "changeAndStartTargetAnimation", "target", "Lorg/betup/games/warGame/ui/animation/TargetAnimation;", "withHandlerDelay", "", "duration", "extraTime", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WarGameAnimationHelper extends BaseGameAnimationHelper {
    public static final int $stable = 8;
    private final View containerDialogResult;
    private final View containerDrawResult;
    private final View containerMakeCustomBet;
    private final Context context;
    private ObjectAnimator dialogAlphaAnimationHide;
    private ObjectAnimator dialogAlphaAnimationShow;
    private final Handler handler;
    private MediaPlayer mediaPlayerSoundDraw;
    private final Handler stopAnimation;
    private final Runnable stopAnimationListener;

    /* compiled from: WarGameAnimationHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TargetAnimation.values().length];
            try {
                iArr[TargetAnimation.HIDE_BET_DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetAnimation.SHOW_BET_DIALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TargetAnimation.HIDE_DRAW_DIALOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TargetAnimation.SHOW_DRAW_DIALOG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TargetAnimation.HIDE_RESULT_DIALOG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TargetAnimation.SHOW_RESULT_DIALOG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WarGameAnimationHelper(Context context, View containerMakeCustomBet, View containerDrawResult, View containerDialogResult) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(containerMakeCustomBet, "containerMakeCustomBet");
        Intrinsics.checkNotNullParameter(containerDrawResult, "containerDrawResult");
        Intrinsics.checkNotNullParameter(containerDialogResult, "containerDialogResult");
        this.context = context;
        this.containerMakeCustomBet = containerMakeCustomBet;
        this.containerDrawResult = containerDrawResult;
        this.containerDialogResult = containerDialogResult;
        this.handler = new Handler();
        this.mediaPlayerSoundDraw = MediaPlayer.create(context, R.raw.draw);
        this.dialogAlphaAnimationShow = ObjectAnimator.ofFloat(containerMakeCustomBet, "alpha", 0.1f, 1.0f);
        this.dialogAlphaAnimationHide = ObjectAnimator.ofFloat(containerMakeCustomBet, "alpha", 1.0f, 0.0f);
        this.stopAnimation = new Handler();
        this.stopAnimationListener = new Runnable() { // from class: org.betup.games.warGame.ui.animation.WarGameAnimationHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                WarGameAnimationHelper.this.notifyEnded();
            }
        };
    }

    @Override // org.betup.games.common.ui.animation.BaseGameAnimationHelper
    public void dispose() {
        super.dispose();
        MediaPlayer mediaPlayer = this.mediaPlayerSoundDraw;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
    }

    public static /* synthetic */ void playDrawSound$default(WarGameAnimationHelper warGameAnimationHelper, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        warGameAnimationHelper.playDrawSound(j);
    }

    public final void playDrawSound(long delay) {
        if (delay == 0) {
            MediaPlayer mediaPlayer = this.mediaPlayerSoundDraw;
            if (mediaPlayer != null) {
                mediaPlayer.start();
                return;
            }
            return;
        }
        new Handler().postDelayed(new Runnable() { // from class: org.betup.games.warGame.ui.animation.WarGameAnimationHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                WarGameAnimationHelper.playDrawSound$lambda$0(WarGameAnimationHelper.this);
            }
        }, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playDrawSound$lambda$0(WarGameAnimationHelper warGameAnimationHelper) {
        MediaPlayer mediaPlayer = warGameAnimationHelper.mediaPlayerSoundDraw;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public static /* synthetic */ void changeAndStartTargetAnimation$default(WarGameAnimationHelper warGameAnimationHelper, TargetAnimation targetAnimation, boolean z, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            j = 250;
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = 0;
        }
        warGameAnimationHelper.changeAndStartTargetAnimation(targetAnimation, z2, j3, j2);
    }

    public final void changeAndStartTargetAnimation(final TargetAnimation target, boolean withHandlerDelay, final long duration, long extraTime) {
        Intrinsics.checkNotNullParameter(target, "target");
        long j = withHandlerDelay ? extraTime + duration : 0L;
        notifyStarted();
        this.stopAnimation.postDelayed(this.stopAnimationListener, j);
        this.handler.postDelayed(new Runnable() { // from class: org.betup.games.warGame.ui.animation.WarGameAnimationHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                WarGameAnimationHelper.changeAndStartTargetAnimation$lambda$2(WarGameAnimationHelper.this, duration, target);
            }
        }, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void changeAndStartTargetAnimation$lambda$2(WarGameAnimationHelper warGameAnimationHelper, long j, TargetAnimation targetAnimation) {
        ObjectAnimator objectAnimator = warGameAnimationHelper.dialogAlphaAnimationHide;
        if (objectAnimator != null) {
            objectAnimator.setDuration(j);
        }
        ObjectAnimator objectAnimator2 = warGameAnimationHelper.dialogAlphaAnimationShow;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(j);
        }
        switch (WhenMappings.$EnumSwitchMapping$0[targetAnimation.ordinal()]) {
            case 1:
                if (warGameAnimationHelper.dialogAlphaAnimationHide != null) {
                    warGameAnimationHelper.containerMakeCustomBet.setClickable(false);
                    warGameAnimationHelper.containerMakeCustomBet.setVisibility(4);
                    ObjectAnimator objectAnimator3 = warGameAnimationHelper.dialogAlphaAnimationHide;
                    if (objectAnimator3 != null) {
                        objectAnimator3.setTarget(warGameAnimationHelper.containerMakeCustomBet);
                    }
                    ObjectAnimator objectAnimator4 = warGameAnimationHelper.dialogAlphaAnimationHide;
                    if (objectAnimator4 != null) {
                        objectAnimator4.start();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (warGameAnimationHelper.dialogAlphaAnimationShow != null) {
                    warGameAnimationHelper.containerMakeCustomBet.setClickable(true);
                    warGameAnimationHelper.containerMakeCustomBet.setVisibility(0);
                    ObjectAnimator objectAnimator5 = warGameAnimationHelper.dialogAlphaAnimationShow;
                    if (objectAnimator5 != null) {
                        objectAnimator5.setTarget(warGameAnimationHelper.containerMakeCustomBet);
                    }
                    ObjectAnimator objectAnimator6 = warGameAnimationHelper.dialogAlphaAnimationShow;
                    if (objectAnimator6 != null) {
                        objectAnimator6.start();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (warGameAnimationHelper.dialogAlphaAnimationHide != null) {
                    warGameAnimationHelper.containerDrawResult.setVisibility(4);
                    warGameAnimationHelper.containerDrawResult.setClickable(false);
                    ObjectAnimator objectAnimator7 = warGameAnimationHelper.dialogAlphaAnimationHide;
                    if (objectAnimator7 != null) {
                        objectAnimator7.setTarget(warGameAnimationHelper.containerDrawResult);
                    }
                    ObjectAnimator objectAnimator8 = warGameAnimationHelper.dialogAlphaAnimationHide;
                    if (objectAnimator8 != null) {
                        objectAnimator8.start();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (warGameAnimationHelper.dialogAlphaAnimationShow != null) {
                    warGameAnimationHelper.containerDrawResult.setVisibility(0);
                    warGameAnimationHelper.containerDrawResult.setClickable(true);
                    ObjectAnimator objectAnimator9 = warGameAnimationHelper.dialogAlphaAnimationShow;
                    if (objectAnimator9 != null) {
                        objectAnimator9.setTarget(warGameAnimationHelper.containerDrawResult);
                    }
                    ObjectAnimator objectAnimator10 = warGameAnimationHelper.dialogAlphaAnimationShow;
                    if (objectAnimator10 != null) {
                        objectAnimator10.start();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (warGameAnimationHelper.dialogAlphaAnimationShow != null) {
                    warGameAnimationHelper.containerDialogResult.setVisibility(4);
                    warGameAnimationHelper.containerDialogResult.setClickable(false);
                    ObjectAnimator objectAnimator11 = warGameAnimationHelper.dialogAlphaAnimationShow;
                    if (objectAnimator11 != null) {
                        objectAnimator11.setTarget(warGameAnimationHelper.containerDialogResult);
                    }
                    ObjectAnimator objectAnimator12 = warGameAnimationHelper.dialogAlphaAnimationShow;
                    if (objectAnimator12 != null) {
                        objectAnimator12.start();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                if (warGameAnimationHelper.dialogAlphaAnimationShow != null) {
                    warGameAnimationHelper.containerDialogResult.setVisibility(0);
                    warGameAnimationHelper.containerDialogResult.setClickable(true);
                    ObjectAnimator objectAnimator13 = warGameAnimationHelper.dialogAlphaAnimationShow;
                    if (objectAnimator13 != null) {
                        objectAnimator13.setTarget(warGameAnimationHelper.containerDialogResult);
                    }
                    ObjectAnimator objectAnimator14 = warGameAnimationHelper.dialogAlphaAnimationShow;
                    if (objectAnimator14 != null) {
                        objectAnimator14.start();
                        return;
                    }
                    return;
                }
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
