package org.betup.utils;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.challenges.ChallengeState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ChallengeEffectiveStateResolver.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ5\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n¢\u0006\u0002\u0010\u0017J,\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\nJ\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lorg/betup/utils/ChallengeEffectiveStateResolver;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "SERVER_REJECTED", "", "SERVER_CANCELED", "FINAL_STATE_VALUES", "", "isFinalState", "", "state", "(Ljava/lang/Integer;)Z", "normalizeGlobalState", "serverOrAndroidState", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "isGlobalCancelledOrRejected", "rawGlobalState", "resolveEffectiveStateInt", "globalState", "participantState", "hasOnlyOneUser", "opponentHasBet", "(Ljava/lang/Integer;Ljava/lang/Integer;ZZ)Ljava/lang/Integer;", "resolveEffectiveState", "Lorg/betup/model/remote/entity/challenges/ChallengeState;", "toDisplayStateInt", "toDisplayState", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChallengeEffectiveStateResolver {
    private static final int SERVER_CANCELED = 6;
    private static final int SERVER_REJECTED = 3;
    public static final ChallengeEffectiveStateResolver INSTANCE = new ChallengeEffectiveStateResolver();
    private static final Set<Integer> FINAL_STATE_VALUES = SetsKt.setOf((Object[]) new Integer[]{Integer.valueOf(ChallengeState.REJECTED.INSTANCE.getValue()), Integer.valueOf(ChallengeState.WON.INSTANCE.getValue()), Integer.valueOf(ChallengeState.LOST.INSTANCE.getValue()), Integer.valueOf(ChallengeState.DRAW.INSTANCE.getValue()), Integer.valueOf(ChallengeState.RETURN.INSTANCE.getValue()), Integer.valueOf(ChallengeState.CANCELED.INSTANCE.getValue()), Integer.valueOf(ChallengeState.FINISHED.INSTANCE.getValue())});
    public static final int $stable = 8;

    private ChallengeEffectiveStateResolver() {
    }

    public final boolean isFinalState(Integer state) {
        return state != null && FINAL_STATE_VALUES.contains(state);
    }

    public final Integer normalizeGlobalState(Integer serverOrAndroidState) {
        if (serverOrAndroidState == null) {
            return null;
        }
        int intValue = serverOrAndroidState.intValue();
        ChallengeState fromServerGlobalInt = ChallengeState.INSTANCE.fromServerGlobalInt(intValue);
        if (fromServerGlobalInt != null) {
            intValue = fromServerGlobalInt.getValue();
        }
        return Integer.valueOf(intValue);
    }

    public final boolean isGlobalCancelledOrRejected(Integer rawGlobalState) {
        if (rawGlobalState == null) {
            return false;
        }
        if (rawGlobalState.intValue() != 3 && rawGlobalState.intValue() != 6) {
            if (rawGlobalState.intValue() != ChallengeState.CANCELED.INSTANCE.getValue()) {
                if (rawGlobalState.intValue() != ChallengeState.REJECTED.INSTANCE.getValue()) {
                    if (rawGlobalState.intValue() != ChallengeState.RETURN.INSTANCE.getValue()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static /* synthetic */ Integer resolveEffectiveStateInt$default(ChallengeEffectiveStateResolver challengeEffectiveStateResolver, Integer num, Integer num2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return challengeEffectiveStateResolver.resolveEffectiveStateInt(num, num2, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (isFinalState(r4) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer resolveEffectiveStateInt(Integer globalState, Integer participantState, boolean hasOnlyOneUser, boolean opponentHasBet) {
        Integer normalizeGlobalState = normalizeGlobalState(globalState);
        int value = ChallengeState.PENDING.INSTANCE.getValue();
        if (normalizeGlobalState != null && normalizeGlobalState.intValue() == value) {
            participantState = Integer.valueOf(ChallengeState.PENDING.INSTANCE.getValue());
        } else {
            int value2 = ChallengeState.ACCEPTED.INSTANCE.getValue();
            if (normalizeGlobalState == null || normalizeGlobalState.intValue() != value2) {
                int value3 = ChallengeState.STARTED.INSTANCE.getValue();
                if (normalizeGlobalState == null || normalizeGlobalState.intValue() != value3) {
                    int value4 = ChallengeState.FINISHED.INSTANCE.getValue();
                    if (normalizeGlobalState != null) {
                        participantState = normalizeGlobalState;
                    }
                    participantState = normalizeGlobalState;
                }
            }
            if (hasOnlyOneUser || !opponentHasBet) {
                participantState = Integer.valueOf(ChallengeState.PENDING.INSTANCE.getValue());
            }
        }
        return toDisplayStateInt(participantState);
    }

    public static /* synthetic */ ChallengeState resolveEffectiveState$default(ChallengeEffectiveStateResolver challengeEffectiveStateResolver, ChallengeState challengeState, ChallengeState challengeState2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        return challengeEffectiveStateResolver.resolveEffectiveState(challengeState, challengeState2, z, z2);
    }

    public final ChallengeState resolveEffectiveState(ChallengeState globalState, ChallengeState participantState, boolean hasOnlyOneUser, boolean opponentHasBet) {
        int intValue;
        Intrinsics.checkNotNullParameter(globalState, "globalState");
        Integer resolveEffectiveStateInt = resolveEffectiveStateInt(Integer.valueOf(globalState.getValue()), participantState != null ? Integer.valueOf(participantState.getValue()) : null, hasOnlyOneUser, opponentHasBet);
        ChallengeState.Companion companion = ChallengeState.INSTANCE;
        if (resolveEffectiveStateInt != null) {
            intValue = resolveEffectiveStateInt.intValue();
        } else {
            Integer valueOf = participantState != null ? Integer.valueOf(participantState.getValue()) : null;
            intValue = valueOf != null ? valueOf.intValue() : 0;
        }
        ChallengeState fromInt = companion.fromInt(intValue);
        return fromInt == null ? ChallengeState.NONE.INSTANCE : fromInt;
    }

    public final Integer toDisplayStateInt(Integer state) {
        return (state != null && state.intValue() == ChallengeState.REJECTED.INSTANCE.getValue()) ? Integer.valueOf(ChallengeState.RETURN.INSTANCE.getValue()) : state;
    }

    public final ChallengeState toDisplayState(ChallengeState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return Intrinsics.areEqual(state, ChallengeState.REJECTED.INSTANCE) ? ChallengeState.RETURN.INSTANCE : state;
    }
}
