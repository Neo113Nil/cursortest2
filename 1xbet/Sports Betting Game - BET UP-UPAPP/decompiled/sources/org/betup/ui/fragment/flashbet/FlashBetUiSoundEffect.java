package org.betup.ui.fragment.flashbet;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Looper;
import androidx.mediarouter.media.MediaRouteProviderProtocol;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetUiSoundEffect.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010 \u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\"\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$J$\u0010%\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010&\u001a\u00020\u00072\b\b\u0002\u0010'\u001a\u00020\u0005H\u0002J\u0006\u0010(\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetUiSoundEffect;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "UI_VOLUME", "", "PLAY_PRIORITY", "", "releaseHandler", "Landroid/os/Handler;", "soundPool", "Landroid/media/SoundPool;", "sampleIds", "", "pendingLoads", "allSamples", "", "prepare", "", "appContext", "Landroid/content/Context;", "playQuestionTick", "urgent", "", "playLockIn", "playClick", "playWhistle", "short", "playYellowCard", "playSubstitution", "playPenalty", "playPenaltyMissed", "playCorner", "playAmbientEvent", "playMatchEvent", "kind", "Lorg/betup/ui/fragment/flashbet/FlashBetEventKind;", "play", "resId", MediaRouteProviderProtocol.CLIENT_DATA_VOLUME, "release", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetUiSoundEffect {
    private static final int PLAY_PRIORITY = 1;
    private static final float UI_VOLUME = 0.55f;
    private static int pendingLoads;
    private static SoundPool soundPool;
    public static final FlashBetUiSoundEffect INSTANCE = new FlashBetUiSoundEffect();
    private static final Handler releaseHandler = new Handler(Looper.getMainLooper());
    private static final Map<Integer, Integer> sampleIds = new LinkedHashMap();
    private static final int[] allSamples = {R.raw.flash_bet_tick, R.raw.flash_bet_tick_urgent, R.raw.flash_bet_lock_in, R.raw.flash_bet_whistle_short, R.raw.flash_bet_whistle_long, R.raw.flash_bet_card, R.raw.flash_bet_sub, R.raw.flash_bet_penalty, R.raw.flash_bet_wrong};
    public static final int $stable = 8;

    /* compiled from: FlashBetUiSoundEffect.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlashBetEventKind.values().length];
            try {
                iArr[FlashBetEventKind.GOAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlashBetEventKind.YELLOW_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlashBetEventKind.RED_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlashBetEventKind.SUBSTITUTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FlashBetEventKind.CORNER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FlashBetEventKind.PENALTY_MISSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FlashBetEventKind.HALF_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FlashBetEventKind.OTHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private FlashBetUiSoundEffect() {
    }

    public final void prepare(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        if (soundPool != null) {
            return;
        }
        Context applicationContext = appContext.getApplicationContext();
        SoundPool build = new SoundPool.Builder().setMaxStreams(8).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).setFlags(256).build()).build();
        soundPool = build;
        int[] iArr = allSamples;
        pendingLoads = iArr.length;
        build.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: org.betup.ui.fragment.flashbet.FlashBetUiSoundEffect$$ExternalSyntheticLambda2
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool2, int i, int i2) {
                FlashBetUiSoundEffect.prepare$lambda$0(soundPool2, i, i2);
            }
        });
        for (int i : iArr) {
            sampleIds.put(Integer.valueOf(i), Integer.valueOf(build.load(applicationContext, i, 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void prepare$lambda$0(SoundPool soundPool2, int i, int i2) {
        if (i2 == 0) {
            pendingLoads--;
        }
    }

    public final void playQuestionTick(Context appContext, boolean urgent) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        play$default(this, appContext, urgent ? R.raw.flash_bet_tick_urgent : R.raw.flash_bet_tick, 0.0f, 4, null);
    }

    public final void playLockIn(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        play$default(this, appContext, R.raw.flash_bet_lock_in, 0.0f, 4, null);
    }

    public final void playClick(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        play$default(this, appContext, R.raw.flash_bet_lock_in, 0.0f, 4, null);
    }

    public static /* synthetic */ void playWhistle$default(FlashBetUiSoundEffect flashBetUiSoundEffect, Context context, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        flashBetUiSoundEffect.playWhistle(context, z);
    }

    public final void playWhistle(Context appContext, boolean r8) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        play$default(this, appContext, r8 ? R.raw.flash_bet_whistle_short : R.raw.flash_bet_whistle_long, 0.0f, 4, null);
    }

    public final void playYellowCard(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        play$default(this, appContext, R.raw.flash_bet_card, 0.0f, 4, null);
    }

    public final void playSubstitution(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        play$default(this, appContext, R.raw.flash_bet_sub, 0.0f, 4, null);
    }

    public final void playPenalty(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        play(appContext, R.raw.flash_bet_penalty, 0.62f);
    }

    public final void playPenaltyMissed(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        play(appContext, R.raw.flash_bet_wrong, 0.52f);
    }

    public final void playCorner(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        play(appContext, R.raw.flash_bet_tick, 0.38f);
    }

    public final void playAmbientEvent(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        play(appContext, R.raw.flash_bet_tick, 0.32f);
    }

    public final void playMatchEvent(Context appContext, FlashBetEventKind kind) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(kind, "kind");
        switch (WhenMappings.$EnumSwitchMapping$0[kind.ordinal()]) {
            case 1:
                return;
            case 2:
            case 3:
                playYellowCard(appContext);
                return;
            case 4:
                playSubstitution(appContext);
                return;
            case 5:
                playCorner(appContext);
                return;
            case 6:
                playPenaltyMissed(appContext);
                return;
            case 7:
                playWhistle(appContext, false);
                return;
            case 8:
                playAmbientEvent(appContext);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    static /* synthetic */ void play$default(FlashBetUiSoundEffect flashBetUiSoundEffect, Context context, int i, float f, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = UI_VOLUME;
        }
        flashBetUiSoundEffect.play(context, i, f);
    }

    private final void play(final Context appContext, final int resId, final float volume) {
        Integer num;
        int intValue;
        prepare(appContext);
        SoundPool soundPool2 = soundPool;
        if (soundPool2 == null || (num = sampleIds.get(Integer.valueOf(resId))) == null || (intValue = num.intValue()) == 0) {
            return;
        }
        if (pendingLoads > 0) {
            releaseHandler.postDelayed(new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetUiSoundEffect$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    FlashBetUiSoundEffect.play$lambda$2(appContext, resId, volume);
                }
            }, 35L);
        } else {
            soundPool2.play(intValue, volume, volume, 1, 0, 1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$2(Context context, int i, float f) {
        INSTANCE.play(context, i, f);
    }

    public final void release() {
        releaseHandler.post(new Runnable() { // from class: org.betup.ui.fragment.flashbet.FlashBetUiSoundEffect$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                FlashBetUiSoundEffect.release$lambda$4();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void release$lambda$4() {
        Object m10853constructorimpl;
        SoundPool soundPool2 = soundPool;
        if (soundPool2 != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                soundPool2.release();
                m10853constructorimpl = Result.m10853constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
            }
            Result.m10852boximpl(m10853constructorimpl);
        }
        soundPool = null;
        sampleIds.clear();
        pendingLoads = 0;
    }
}
