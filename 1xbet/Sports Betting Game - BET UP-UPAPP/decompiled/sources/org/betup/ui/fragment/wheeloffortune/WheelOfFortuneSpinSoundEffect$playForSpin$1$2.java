package org.betup.ui.fragment.wheeloffortune;

import android.media.MediaPlayer;
import android.os.Looper;
import android.util.Log;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WheelOfFortuneSpinSoundEffect.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class WheelOfFortuneSpinSoundEffect$playForSpin$1$2 implements MediaPlayer.OnErrorListener {
    public static final WheelOfFortuneSpinSoundEffect$playForSpin$1$2 INSTANCE = new WheelOfFortuneSpinSoundEffect$playForSpin$1$2();

    WheelOfFortuneSpinSoundEffect$playForSpin$1$2() {
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(final MediaPlayer mediaPlayer, int i, int i2) {
        Log.e("WheelSpinSound", "MediaPlayer error what=" + i + " extra=" + i2);
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
                return true;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m10853constructorimpl(ResultKt.createFailure(th));
                return true;
            }
        }
        WheelOfFortuneSpinSoundEffect.mainHandler.post(new Runnable() { // from class: org.betup.ui.fragment.wheeloffortune.WheelOfFortuneSpinSoundEffect$playForSpin$1$2$onError$$inlined$runOnMain$1
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
        return true;
    }
}
