package org.betup.games.common.ui.animation;

import android.animation.Animator;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.games.StubListener;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BaseGameAnimationHelper.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u0019\u001a\u0004\u0018\u00010\nJ\b\u0010\u001a\u001a\u00020\u0011H\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001fR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lorg/betup/games/common/ui/animation/BaseGameAnimationHelper;", "Landroid/animation/Animator$AnimatorListener;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "mediaPlayerSoundWon", "Landroid/media/MediaPlayer;", "mediaPlayerSoundLost", "stubListener", "Lorg/betup/games/StubListener;", "isAnimatedNow", "", "()Z", "setAnimatedNow", "(Z)V", "onAnimationStart", "", "animation", "Landroid/animation/Animator;", "notifyEnded", "notifyStarted", "onAnimationEnd", "dispose", "setStubListener", "getStubListener", "removeActiveListeners", "onAnimationRepeat", "onAnimationCancel", "playWonSound", "delay", "", "playLoseSound", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseGameAnimationHelper implements Animator.AnimatorListener {
    public static final int $stable = 8;
    private boolean isAnimatedNow;
    private MediaPlayer mediaPlayerSoundLost;
    private MediaPlayer mediaPlayerSoundWon;
    private StubListener stubListener;

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public BaseGameAnimationHelper(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.isAnimatedNow = true;
        this.mediaPlayerSoundWon = MediaPlayer.create(context, R.raw.bet_won);
        this.mediaPlayerSoundLost = MediaPlayer.create(context, R.raw.bet_lost);
    }

    /* renamed from: isAnimatedNow, reason: from getter */
    public final boolean getIsAnimatedNow() {
        return this.isAnimatedNow;
    }

    public final void setAnimatedNow(boolean z) {
        this.isAnimatedNow = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        notifyStarted();
    }

    public final void notifyEnded() {
        this.isAnimatedNow = false;
        new Handler().postDelayed(new Runnable() { // from class: org.betup.games.common.ui.animation.BaseGameAnimationHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BaseGameAnimationHelper.notifyEnded$lambda$0(BaseGameAnimationHelper.this);
            }
        }, 70L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyEnded$lambda$0(BaseGameAnimationHelper baseGameAnimationHelper) {
        StubListener stubListener = baseGameAnimationHelper.stubListener;
        if (stubListener != null) {
            stubListener.setUpStub(false);
        }
    }

    public final void notifyStarted() {
        this.isAnimatedNow = true;
        StubListener stubListener = this.stubListener;
        if (stubListener != null) {
            stubListener.setUpStub(true);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        notifyEnded();
    }

    public void dispose() {
        MediaPlayer mediaPlayer = this.mediaPlayerSoundWon;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = this.mediaPlayerSoundLost;
        if (mediaPlayer2 != null) {
            mediaPlayer2.stop();
        }
    }

    public final void setStubListener(StubListener stubListener) {
        Intrinsics.checkNotNullParameter(stubListener, "stubListener");
        this.stubListener = stubListener;
    }

    public final StubListener getStubListener() {
        return this.stubListener;
    }

    public void removeActiveListeners() {
        this.stubListener = null;
    }

    public static /* synthetic */ void playWonSound$default(BaseGameAnimationHelper baseGameAnimationHelper, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playWonSound");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        baseGameAnimationHelper.playWonSound(j);
    }

    public final void playWonSound(long delay) {
        if (delay == 0) {
            MediaPlayer mediaPlayer = this.mediaPlayerSoundWon;
            if (mediaPlayer != null) {
                mediaPlayer.start();
                return;
            }
            return;
        }
        new Handler().postDelayed(new Runnable() { // from class: org.betup.games.common.ui.animation.BaseGameAnimationHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BaseGameAnimationHelper.playWonSound$lambda$1(BaseGameAnimationHelper.this);
            }
        }, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playWonSound$lambda$1(BaseGameAnimationHelper baseGameAnimationHelper) {
        MediaPlayer mediaPlayer = baseGameAnimationHelper.mediaPlayerSoundWon;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public static /* synthetic */ void playLoseSound$default(BaseGameAnimationHelper baseGameAnimationHelper, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playLoseSound");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        baseGameAnimationHelper.playLoseSound(j);
    }

    public final void playLoseSound(long delay) {
        if (delay == 0) {
            MediaPlayer mediaPlayer = this.mediaPlayerSoundLost;
            if (mediaPlayer != null) {
                mediaPlayer.start();
                return;
            }
            return;
        }
        new Handler().postDelayed(new Runnable() { // from class: org.betup.games.common.ui.animation.BaseGameAnimationHelper$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BaseGameAnimationHelper.playLoseSound$lambda$2(BaseGameAnimationHelper.this);
            }
        }, delay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playLoseSound$lambda$2(BaseGameAnimationHelper baseGameAnimationHelper) {
        MediaPlayer mediaPlayer = baseGameAnimationHelper.mediaPlayerSoundLost;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }
}
