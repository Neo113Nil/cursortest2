package io.sentry.android.replay;

import A1.W;
import androidx.compose.runtime.internal.StabilityInferred;
import t6.h;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ReplayLifecycle {
    public static final int $stable = 8;
    private volatile ReplayState currentState = ReplayState.INITIAL;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReplayState.values().length];
            try {
                iArr[ReplayState.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReplayState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReplayState.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReplayState.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReplayState.STOPPED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReplayState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final ReplayState getCurrentState$sentry_android_replay_release() {
        return this.currentState;
    }

    public final boolean isAllowed(ReplayState replayState) {
        h.e(replayState, "newState");
        switch (WhenMappings.$EnumSwitchMapping$0[this.currentState.ordinal()]) {
            case 1:
                if (replayState == ReplayState.STARTED || replayState == ReplayState.CLOSED) {
                    return true;
                }
                break;
            case 2:
                if (replayState == ReplayState.PAUSED || replayState == ReplayState.STOPPED || replayState == ReplayState.CLOSED) {
                    return true;
                }
                break;
            case 3:
                if (replayState == ReplayState.PAUSED || replayState == ReplayState.STOPPED || replayState == ReplayState.CLOSED) {
                    return true;
                }
                break;
            case 4:
                if (replayState == ReplayState.RESUMED || replayState == ReplayState.STOPPED || replayState == ReplayState.CLOSED) {
                    return true;
                }
                break;
            case 5:
                if (replayState == ReplayState.STARTED || replayState == ReplayState.CLOSED) {
                    return true;
                }
                break;
            case 6:
                break;
            default:
                throw new W();
        }
        return false;
    }

    public final boolean isTouchRecordingAllowed() {
        return this.currentState == ReplayState.STARTED || this.currentState == ReplayState.RESUMED;
    }

    public final void setCurrentState$sentry_android_replay_release(ReplayState replayState) {
        h.e(replayState, "<set-?>");
        this.currentState = replayState;
    }
}
