package org.betup.ui.fragment.flashbet;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetMatchCrowdSoundEffect.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bJ\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0006\u0010\u0010\u001a\u00020\u000bJ\u0006\u0010\u0011\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetMatchCrowdSoundEffect;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "mainHandler", "Landroid/os/Handler;", "mediaPlayer", "Landroid/media/MediaPlayer;", "pausedByLifecycle", "", TtmlNode.START, "", "appContext", "Landroid/content/Context;", "stop", "stopInternal", "pauseForBackground", "resumeAfterBackground", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetMatchCrowdSoundEffect {
    private static MediaPlayer mediaPlayer;
    private static boolean pausedByLifecycle;
    public static final FlashBetMatchCrowdSoundEffect INSTANCE = new FlashBetMatchCrowdSoundEffect();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());
    public static final int $stable = 8;

    private FlashBetMatchCrowdSoundEffect() {
    }

    public final void start(final Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetMatchCrowdSoundEffect$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                FlashBetMatchCrowdSoundEffect.start$lambda$0(appContext);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(Context context) {
        FlashBetMatchCrowdSoundEffect flashBetMatchCrowdSoundEffect = INSTANCE;
        pausedByLifecycle = false;
        flashBetMatchCrowdSoundEffect.stopInternal();
        MediaPlayer create = MediaPlayer.create(context.getApplicationContext(), R.raw.flash_bet_match_crowd);
        if (create == null) {
            return;
        }
        mediaPlayer = create;
        create.setLooping(true);
        create.setVolume(0.35f, 0.35f);
        create.start();
    }

    public final void stop() {
        mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetMatchCrowdSoundEffect$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FlashBetMatchCrowdSoundEffect.stop$lambda$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1() {
        FlashBetMatchCrowdSoundEffect flashBetMatchCrowdSoundEffect = INSTANCE;
        pausedByLifecycle = false;
        flashBetMatchCrowdSoundEffect.stopInternal();
    }

    private final void stopInternal() {
        Object m10853constructorimpl;
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

    public final void pauseForBackground() {
        mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetMatchCrowdSoundEffect$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                FlashBetMatchCrowdSoundEffect.pauseForBackground$lambda$3();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pauseForBackground$lambda$3() {
        MediaPlayer mediaPlayer2 = mediaPlayer;
        if (mediaPlayer2 != null && mediaPlayer2.isPlaying()) {
            mediaPlayer2.pause();
            pausedByLifecycle = true;
        }
    }

    public final void resumeAfterBackground() {
        mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetMatchCrowdSoundEffect$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                FlashBetMatchCrowdSoundEffect.resumeAfterBackground$lambda$5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resumeAfterBackground$lambda$5() {
        Object m10853constructorimpl;
        if (pausedByLifecycle) {
            pausedByLifecycle = false;
            MediaPlayer mediaPlayer2 = mediaPlayer;
            if (mediaPlayer2 != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    mediaPlayer2.start();
                    m10853constructorimpl = Result.m10853constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
                }
                Result.m10852boximpl(m10853constructorimpl);
            }
        }
    }
}
