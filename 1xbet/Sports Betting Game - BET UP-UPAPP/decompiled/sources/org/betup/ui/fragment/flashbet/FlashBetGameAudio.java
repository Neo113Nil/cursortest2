package org.betup.ui.fragment.flashbet;

import com.ironsource.X3;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: FlashBetGameAudio.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Lorg/betup/ui/fragment/flashbet/FlashBetGameAudio;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", X3.i.t0, "", X3.i.u0, "onSessionEnd", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetGameAudio {
    public static final int $stable = 0;
    public static final FlashBetGameAudio INSTANCE = new FlashBetGameAudio();

    private FlashBetGameAudio() {
    }

    public final void onPause() {
        FlashBetGoalSoundEffect.INSTANCE.stop();
        FlashBetMatchCrowdSoundEffect.INSTANCE.pauseForBackground();
    }

    public final void onResume() {
        FlashBetMatchCrowdSoundEffect.INSTANCE.resumeAfterBackground();
    }

    public final void onSessionEnd() {
        FlashBetGoalSoundEffect.INSTANCE.stop();
        FlashBetMatchCrowdSoundEffect.INSTANCE.stop();
        FlashBetUiSoundEffect.INSTANCE.release();
    }
}
