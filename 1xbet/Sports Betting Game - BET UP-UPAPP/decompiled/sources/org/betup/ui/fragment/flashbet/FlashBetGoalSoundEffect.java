package org.betup.ui.fragment.flashbet;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetGoalSoundEffect.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ(\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\bH\u0002J \u0010 \u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\bH\u0002J\b\u0010\"\u001a\u00020\u0016H\u0002J\u0006\u0010#\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetGoalSoundEffect;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "GOAL_CHEER_SKIP_HEAD_MS", "", "GOAL_CHEER_SKIP_TAIL_MS", "GOAL_CHEER_MAX_VOLUME", "", "PENALTY_GOAL_CHEER_VOLUME", "FADE_OUT_MS", "", "FADE_TICK_MS", "mainHandler", "Landroid/os/Handler;", "mediaPlayer", "Landroid/media/MediaPlayer;", "endStopRunnable", "Ljava/lang/Runnable;", "fadeStartRunnable", "fadeStepRunnable", "play", "", "appContext", "Landroid/content/Context;", "penaltyGoal", "", "schedulePlaybackWindow", "mp", "startMs", "endMs", "maxVol", "startVolumeFade", "durationMs", "cancelScheduledPlayback", "stop", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetGoalSoundEffect {
    private static final long FADE_OUT_MS = 1400;
    private static final long FADE_TICK_MS = 45;
    private static final float GOAL_CHEER_MAX_VOLUME = 0.12f;
    private static final int GOAL_CHEER_SKIP_HEAD_MS = 5000;
    private static final int GOAL_CHEER_SKIP_TAIL_MS = 4000;
    private static final float PENALTY_GOAL_CHEER_VOLUME = 0.08f;
    private static Runnable endStopRunnable;
    private static Runnable fadeStartRunnable;
    private static Runnable fadeStepRunnable;
    private static MediaPlayer mediaPlayer;
    public static final FlashBetGoalSoundEffect INSTANCE = new FlashBetGoalSoundEffect();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    public static final int $stable = 8;

    private FlashBetGoalSoundEffect() {
    }

    public static /* synthetic */ void play$default(FlashBetGoalSoundEffect flashBetGoalSoundEffect, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        flashBetGoalSoundEffect.play(context, z);
    }

    public final void play(final Context appContext, final boolean penaltyGoal) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetGoalSoundEffect$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                FlashBetGoalSoundEffect.play$lambda$5(penaltyGoal, appContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$5(boolean z, Context context) {
        Object m10853constructorimpl;
        INSTANCE.cancelScheduledPlayback();
        MediaPlayer mediaPlayer2 = mediaPlayer;
        if (mediaPlayer2 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                mediaPlayer2.stop();
                mediaPlayer2.release();
                m10853constructorimpl = Result.m10853constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
            }
            Result.m10852boximpl(m10853constructorimpl);
        }
        FlashBetGoalSoundEffect flashBetGoalSoundEffect = INSTANCE;
        mediaPlayer = null;
        final float f = z ? 0.08f : 0.12f;
        MediaPlayer create = MediaPlayer.create(context.getApplicationContext(), R.raw.flash_bet_goal_cheer);
        if (create == null) {
            return;
        }
        mediaPlayer = create;
        create.setLooping(false);
        create.setVolume(f, f);
        create.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: org.betup.ui.fragment.flashbet.FlashBetGoalSoundEffect$$ExternalSyntheticLambda4
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer3) {
                FlashBetGoalSoundEffect.play$lambda$5$lambda$3(mediaPlayer3);
            }
        });
        final int duration = create.getDuration();
        boolean z2 = duration > 9000;
        final int i = z2 ? 5000 : 0;
        if (z2) {
            duration -= 4000;
        }
        if (duration <= i) {
            create.start();
        } else if (i > 0) {
            create.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: org.betup.ui.fragment.flashbet.FlashBetGoalSoundEffect$$ExternalSyntheticLambda5
                @Override // android.media.MediaPlayer.OnSeekCompleteListener
                public final void onSeekComplete(MediaPlayer mediaPlayer3) {
                    FlashBetGoalSoundEffect.play$lambda$5$lambda$4(i, duration, f, mediaPlayer3);
                }
            });
            create.seekTo(i);
        } else {
            create.start();
            flashBetGoalSoundEffect.schedulePlaybackWindow(create, i, duration, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$5$lambda$3(final MediaPlayer mediaPlayer2) {
        INSTANCE.cancelScheduledPlayback();
        mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetGoalSoundEffect$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FlashBetGoalSoundEffect.play$lambda$5$lambda$3$lambda$2(mediaPlayer2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$5$lambda$3$lambda$2(MediaPlayer mediaPlayer2) {
        if (mediaPlayer == mediaPlayer2) {
            mediaPlayer = null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            mediaPlayer2.release();
            Result.m10853constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$5$lambda$4(int i, int i2, float f, MediaPlayer mediaPlayer2) {
        mediaPlayer2.setOnSeekCompleteListener(null);
        mediaPlayer2.start();
        FlashBetGoalSoundEffect flashBetGoalSoundEffect = INSTANCE;
        Intrinsics.checkNotNull(mediaPlayer2);
        flashBetGoalSoundEffect.schedulePlaybackWindow(mediaPlayer2, i, i2, f);
    }

    private final void schedulePlaybackWindow(final MediaPlayer mp, int startMs, int endMs, final float maxVol) {
        cancelScheduledPlayback();
        int i = endMs - startMs;
        if (i <= 0) {
            return;
        }
        mp.setVolume(maxVol, maxVol);
        long j = i;
        final long coerceAtMost = RangesKt.coerceAtMost(FADE_OUT_MS, RangesKt.coerceAtLeast(j, 1L));
        long j2 = j - coerceAtMost;
        Runnable runnable = new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetGoalSoundEffect$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                FlashBetGoalSoundEffect.schedulePlaybackWindow$lambda$9(mp);
            }
        };
        endStopRunnable = runnable;
        Handler handler = mainHandler;
        handler.postDelayed(runnable, j);
        Runnable runnable2 = new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetGoalSoundEffect$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                FlashBetGoalSoundEffect.schedulePlaybackWindow$lambda$10(mp, coerceAtMost, maxVol);
            }
        };
        fadeStartRunnable = runnable2;
        handler.postDelayed(runnable2, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedulePlaybackWindow$lambda$9(final MediaPlayer mediaPlayer2) {
        endStopRunnable = null;
        if (mediaPlayer != mediaPlayer2) {
            return;
        }
        mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetGoalSoundEffect$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                FlashBetGoalSoundEffect.schedulePlaybackWindow$lambda$9$lambda$8(mediaPlayer2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedulePlaybackWindow$lambda$9$lambda$8(MediaPlayer mediaPlayer2) {
        Runnable runnable = fadeStepRunnable;
        if (runnable != null) {
            mainHandler.removeCallbacks(runnable);
        }
        fadeStepRunnable = null;
        if (mediaPlayer == mediaPlayer2) {
            mediaPlayer = null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (mediaPlayer2.isPlaying()) {
                mediaPlayer2.stop();
            }
            mediaPlayer2.release();
            Result.m10853constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedulePlaybackWindow$lambda$10(MediaPlayer mediaPlayer2, long j, float f) {
        FlashBetGoalSoundEffect flashBetGoalSoundEffect = INSTANCE;
        fadeStartRunnable = null;
        if (mediaPlayer != mediaPlayer2) {
            return;
        }
        flashBetGoalSoundEffect.startVolumeFade(mediaPlayer2, j, f);
    }

    private final void startVolumeFade(final MediaPlayer mp, long durationMs, final float maxVol) {
        Runnable runnable = fadeStepRunnable;
        if (runnable != null) {
            mainHandler.removeCallbacks(runnable);
        }
        final int coerceAtLeast = RangesKt.coerceAtLeast((int) (durationMs / FADE_TICK_MS), 1);
        final Ref.IntRef intRef = new Ref.IntRef();
        Runnable runnable2 = new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetGoalSoundEffect$startVolumeFade$r$1
            @Override // java.lang.Runnable
            public void run() {
                MediaPlayer mediaPlayer2;
                Handler handler;
                mediaPlayer2 = FlashBetGoalSoundEffect.mediaPlayer;
                if (mediaPlayer2 != mp) {
                    FlashBetGoalSoundEffect flashBetGoalSoundEffect = FlashBetGoalSoundEffect.INSTANCE;
                    FlashBetGoalSoundEffect.fadeStepRunnable = null;
                    return;
                }
                intRef.element++;
                float coerceIn = RangesKt.coerceIn(maxVol * (1.0f - (intRef.element / coerceAtLeast)), 0.0f, 1.0f);
                mp.setVolume(coerceIn, coerceIn);
                if (intRef.element < coerceAtLeast) {
                    handler = FlashBetGoalSoundEffect.mainHandler;
                    handler.postDelayed(this, 45L);
                } else {
                    FlashBetGoalSoundEffect flashBetGoalSoundEffect2 = FlashBetGoalSoundEffect.INSTANCE;
                    FlashBetGoalSoundEffect.fadeStepRunnable = null;
                }
            }
        };
        fadeStepRunnable = runnable2;
        mainHandler.post(runnable2);
    }

    private final void cancelScheduledPlayback() {
        Runnable runnable = endStopRunnable;
        if (runnable != null) {
            mainHandler.removeCallbacks(runnable);
        }
        Runnable runnable2 = fadeStartRunnable;
        if (runnable2 != null) {
            mainHandler.removeCallbacks(runnable2);
        }
        Runnable runnable3 = fadeStepRunnable;
        if (runnable3 != null) {
            mainHandler.removeCallbacks(runnable3);
        }
        endStopRunnable = null;
        fadeStartRunnable = null;
        fadeStepRunnable = null;
    }

    public final void stop() {
        mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetGoalSoundEffect$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                FlashBetGoalSoundEffect.stop$lambda$16();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$16() {
        Object m10853constructorimpl;
        INSTANCE.cancelScheduledPlayback();
        MediaPlayer mediaPlayer2 = mediaPlayer;
        if (mediaPlayer2 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                if (mediaPlayer2.isPlaying()) {
                    mediaPlayer2.stop();
                }
                mediaPlayer2.release();
                m10853constructorimpl = Result.m10853constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
            }
            Result.m10852boximpl(m10853constructorimpl);
        }
        mediaPlayer = null;
    }
}
