package org.betup.ui.fragment.wheeloffortune;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: WheelOfFortuneSpinSoundEffect.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\tH\u0002J \u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u0007H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J\u0019\u0010#\u001a\u00020\u00132\u000e\b\u0004\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130%H\u0082\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lorg/betup/ui/fragment/wheeloffortune/WheelOfFortuneSpinSoundEffect;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "MAX_VOLUME", "", "FADE_OUT_MS", "", "FADE_TICK_MS", "mainHandler", "Landroid/os/Handler;", "mediaPlayer", "Landroid/media/MediaPlayer;", "stopRunnable", "Ljava/lang/Runnable;", "fadeStepRunnable", "playForSpin", "", "appContext", "Landroid/content/Context;", "spinDurationMs", "", "stop", "createSpinPlayer", "context", "releasePlayerNow", "scheduleStop", "mp", "playMs", "startVolumeFade", "durationMs", "maxVol", "cancelScheduled", "runOnMain", "block", "Lkotlin/Function0;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WheelOfFortuneSpinSoundEffect {
    private static final long FADE_OUT_MS = 400;
    private static final long FADE_TICK_MS = 40;
    private static final float MAX_VOLUME = 0.85f;
    private static final String TAG = "WheelSpinSound";
    private static Runnable fadeStepRunnable;
    private static MediaPlayer mediaPlayer;
    private static Runnable stopRunnable;
    public static final WheelOfFortuneSpinSoundEffect INSTANCE = new WheelOfFortuneSpinSoundEffect();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    public static final int $stable = 8;

    private WheelOfFortuneSpinSoundEffect() {
    }

    public final void playForSpin(final Context appContext, int spinDurationMs) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        final long coerceIn = RangesKt.coerceIn(spinDurationMs, 500, 10000);
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneSpinSoundEffect$playForSpin$$inlined$runOnMain$1
                @Override // java.lang.Runnable
                public final void run() {
                    WheelOfFortuneSpinSoundEffect.INSTANCE.releasePlayerNow();
                    WheelOfFortuneSpinSoundEffect wheelOfFortuneSpinSoundEffect = WheelOfFortuneSpinSoundEffect.INSTANCE;
                    Context applicationContext = appContext.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    MediaPlayer createSpinPlayer = wheelOfFortuneSpinSoundEffect.createSpinPlayer(applicationContext);
                    if (createSpinPlayer == null) {
                        Log.w("WheelSpinSound", "Could not create MediaPlayer for wheel_of_fortune_spin");
                        return;
                    }
                    WheelOfFortuneSpinSoundEffect wheelOfFortuneSpinSoundEffect2 = WheelOfFortuneSpinSoundEffect.INSTANCE;
                    WheelOfFortuneSpinSoundEffect.mediaPlayer = createSpinPlayer;
                    createSpinPlayer.setLooping(false);
                    createSpinPlayer.setVolume(0.85f, 0.85f);
                    createSpinPlayer.setOnCompletionListener(WheelOfFortuneSpinSoundEffect$playForSpin$1$1.INSTANCE);
                    createSpinPlayer.setOnErrorListener(WheelOfFortuneSpinSoundEffect$playForSpin$1$2.INSTANCE);
                    createSpinPlayer.start();
                    WheelOfFortuneSpinSoundEffect.INSTANCE.scheduleStop(createSpinPlayer, coerceIn);
                }
            });
            return;
        }
        WheelOfFortuneSpinSoundEffect wheelOfFortuneSpinSoundEffect = INSTANCE;
        wheelOfFortuneSpinSoundEffect.releasePlayerNow();
        Context applicationContext = appContext.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        MediaPlayer createSpinPlayer = wheelOfFortuneSpinSoundEffect.createSpinPlayer(applicationContext);
        if (createSpinPlayer != null) {
            mediaPlayer = createSpinPlayer;
            createSpinPlayer.setLooping(false);
            createSpinPlayer.setVolume(0.85f, 0.85f);
            createSpinPlayer.setOnCompletionListener(WheelOfFortuneSpinSoundEffect$playForSpin$1$1.INSTANCE);
            createSpinPlayer.setOnErrorListener(WheelOfFortuneSpinSoundEffect$playForSpin$1$2.INSTANCE);
            createSpinPlayer.start();
            wheelOfFortuneSpinSoundEffect.scheduleStop(createSpinPlayer, coerceIn);
            return;
        }
        Log.w(TAG, "Could not create MediaPlayer for wheel_of_fortune_spin");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaPlayer createSpinPlayer(Context context) {
        try {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build());
            AssetFileDescriptor openRawResourceFd = context.getResources().openRawResourceFd(R.raw.wheel_of_fortune_spin);
            if (openRawResourceFd == null) {
                return null;
            }
            AssetFileDescriptor assetFileDescriptor = openRawResourceFd;
            try {
                AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
                mediaPlayer2.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(assetFileDescriptor, null);
                mediaPlayer2.prepare();
                return mediaPlayer2;
            } finally {
            }
        } catch (Exception e) {
            Log.e(TAG, "createSpinPlayer failed", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releasePlayerNow() {
        Object m10853constructorimpl;
        cancelScheduled();
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleStop(final MediaPlayer mp, long playMs) {
        cancelScheduled();
        final long coerceAtMost = RangesKt.coerceAtMost(FADE_OUT_MS, playMs);
        long coerceAtLeast = RangesKt.coerceAtLeast(playMs - coerceAtMost, 0L);
        Runnable runnable = new Runnable() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneSpinSoundEffect$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                WheelOfFortuneSpinSoundEffect.scheduleStop$lambda$7(mp);
            }
        };
        stopRunnable = runnable;
        Handler handler = mainHandler;
        handler.postDelayed(runnable, playMs);
        if (coerceAtMost > 0) {
            handler.postDelayed(new Runnable() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneSpinSoundEffect$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    WheelOfFortuneSpinSoundEffect.scheduleStop$lambda$8(mp, coerceAtMost);
                }
            }, coerceAtLeast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleStop$lambda$7(final MediaPlayer mediaPlayer2) {
        stopRunnable = null;
        if (mediaPlayer != mediaPlayer2) {
            return;
        }
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
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
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m10853constructorimpl(ResultKt.createFailure(th));
                return;
            }
        }
        mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneSpinSoundEffect$scheduleStop$lambda$7$$inlined$runOnMain$1
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = WheelOfFortuneSpinSoundEffect.fadeStepRunnable;
                if (runnable2 != null) {
                    WheelOfFortuneSpinSoundEffect.mainHandler.removeCallbacks(runnable2);
                }
                WheelOfFortuneSpinSoundEffect wheelOfFortuneSpinSoundEffect = WheelOfFortuneSpinSoundEffect.INSTANCE;
                WheelOfFortuneSpinSoundEffect.fadeStepRunnable = null;
                if (WheelOfFortuneSpinSoundEffect.mediaPlayer == mediaPlayer2) {
                    WheelOfFortuneSpinSoundEffect wheelOfFortuneSpinSoundEffect2 = WheelOfFortuneSpinSoundEffect.INSTANCE;
                    WheelOfFortuneSpinSoundEffect.mediaPlayer = null;
                }
                MediaPlayer mediaPlayer3 = mediaPlayer2;
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    if (mediaPlayer3.isPlaying()) {
                        mediaPlayer3.stop();
                    }
                    mediaPlayer3.release();
                    Result.m10853constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m10853constructorimpl(ResultKt.createFailure(th2));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleStop$lambda$8(MediaPlayer mediaPlayer2, long j) {
        if (mediaPlayer != mediaPlayer2) {
            return;
        }
        INSTANCE.startVolumeFade(mediaPlayer2, j, 0.85f);
    }

    private final void startVolumeFade(final MediaPlayer mp, long durationMs, final float maxVol) {
        Runnable runnable = fadeStepRunnable;
        if (runnable != null) {
            mainHandler.removeCallbacks(runnable);
        }
        final int coerceAtLeast = RangesKt.coerceAtLeast((int) (durationMs / FADE_TICK_MS), 1);
        final Ref.IntRef intRef = new Ref.IntRef();
        Runnable runnable2 = new Runnable() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneSpinSoundEffect$startVolumeFade$r$1
            @Override // java.lang.Runnable
            public void run() {
                if (WheelOfFortuneSpinSoundEffect.mediaPlayer != mp) {
                    WheelOfFortuneSpinSoundEffect wheelOfFortuneSpinSoundEffect = WheelOfFortuneSpinSoundEffect.INSTANCE;
                    WheelOfFortuneSpinSoundEffect.fadeStepRunnable = null;
                    return;
                }
                intRef.element++;
                float coerceIn = RangesKt.coerceIn(maxVol * (1.0f - (intRef.element / coerceAtLeast)), 0.0f, 1.0f);
                mp.setVolume(coerceIn, coerceIn);
                if (intRef.element < coerceAtLeast) {
                    WheelOfFortuneSpinSoundEffect.mainHandler.postDelayed(this, 40L);
                } else {
                    WheelOfFortuneSpinSoundEffect wheelOfFortuneSpinSoundEffect2 = WheelOfFortuneSpinSoundEffect.INSTANCE;
                    WheelOfFortuneSpinSoundEffect.fadeStepRunnable = null;
                }
            }
        };
        fadeStepRunnable = runnable2;
        mainHandler.post(runnable2);
    }

    private final void cancelScheduled() {
        Runnable runnable = stopRunnable;
        if (runnable != null) {
            mainHandler.removeCallbacks(runnable);
        }
        Runnable runnable2 = fadeStepRunnable;
        if (runnable2 != null) {
            mainHandler.removeCallbacks(runnable2);
        }
        stopRunnable = null;
        fadeStepRunnable = null;
    }

    private final void runOnMain(final Function0<Unit> block) {
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneSpinSoundEffect$runOnMain$1
                @Override // java.lang.Runnable
                public final void run() {
                    block.invoke();
                }
            });
        } else {
            block.invoke();
        }
    }

    public final void stop() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            INSTANCE.releasePlayerNow();
        } else {
            mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneSpinSoundEffect$stop$$inlined$runOnMain$1
                @Override // java.lang.Runnable
                public final void run() {
                    WheelOfFortuneSpinSoundEffect.INSTANCE.releasePlayerNow();
                }
            });
        }
    }
}
