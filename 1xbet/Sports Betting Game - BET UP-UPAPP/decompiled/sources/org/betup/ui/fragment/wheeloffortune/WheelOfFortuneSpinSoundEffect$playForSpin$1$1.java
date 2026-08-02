package org.betup.ui.fragment.wheeloffortune;

import android.media.MediaPlayer;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WheelOfFortuneSpinSoundEffect.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class WheelOfFortuneSpinSoundEffect$playForSpin$1$1 implements MediaPlayer.OnCompletionListener {
    public static final WheelOfFortuneSpinSoundEffect$playForSpin$1$1 INSTANCE = new WheelOfFortuneSpinSoundEffect$playForSpin$1$1();

    WheelOfFortuneSpinSoundEffect$playForSpin$1$1() {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(final MediaPlayer mediaPlayer) {
        WheelOfFortuneSpinSoundEffect wheelOfFortuneSpinSoundEffect = WheelOfFortuneSpinSoundEffect.INSTANCE;
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            if (WheelOfFortuneSpinSoundEffect.mediaPlayer == mediaPlayer) {
                WheelOfFortuneSpinSoundEffect wheelOfFortuneSpinSoundEffect2 = WheelOfFortuneSpinSoundEffect.INSTANCE;
                WheelOfFortuneSpinSoundEffect.mediaPlayer = null;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                mediaPlayer.release();
                Result.m10853constructorimpl(Unit.INSTANCE);
                return;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m10853constructorimpl(ResultKt.createFailure(th));
                return;
            }
        }
        WheelOfFortuneSpinSoundEffect.mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneSpinSoundEffect$playForSpin$1$1$onCompletion$$inlined$runOnMain$1
            @Override // java.lang.Runnable
            public final void run() {
                if (WheelOfFortuneSpinSoundEffect.mediaPlayer == mediaPlayer) {
                    WheelOfFortuneSpinSoundEffect wheelOfFortuneSpinSoundEffect3 = WheelOfFortuneSpinSoundEffect.INSTANCE;
                    WheelOfFortuneSpinSoundEffect.mediaPlayer = null;
                }
                MediaPlayer mediaPlayer2 = mediaPlayer;
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    mediaPlayer2.release();
                    Result.m10853constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m10853constructorimpl(ResultKt.createFailure(th2));
                }
            }
        });
    }
}
