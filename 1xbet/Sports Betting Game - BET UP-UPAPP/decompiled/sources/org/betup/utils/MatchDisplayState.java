package org.betup.utils;

import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.betup.model.remote.entity.matches.MatchState;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchDisplayState.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\fJ-\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0011J-\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0011J-\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u000e\u0010\u0015\u001a\u00020\n*\u0004\u0018\u00010\u0010H\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0016"}, d2 = {"Lorg/betup/utils/MatchDisplayState;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "FIFA_SPORT_IDS", "", "", "getFIFA_SPORT_IDS", "()Ljava/util/Set;", "isFifaSport", "", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "(Ljava/lang/Integer;)Z", "isMatchStarted", "matchState", "matchDate", "", "(ILjava/lang/String;Ljava/lang/Integer;)Z", "isLive", "isScoreAvailable", "isFinished", "hasMatchTimeReachedSafe", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchDisplayState {
    public static final MatchDisplayState INSTANCE = new MatchDisplayState();
    private static final Set<Integer> FIFA_SPORT_IDS = SetsKt.setOf((Object[]) new Integer[]{64, 65});
    public static final int $stable = 8;

    /* compiled from: MatchDisplayState.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchState.values().length];
            try {
                iArr[MatchState.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchState.PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MatchState.LIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MatchState.SCHEDULED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MatchState.CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final boolean isLive(int i) {
        return isLive$default(i, null, null, 6, null);
    }

    @JvmStatic
    public static final boolean isLive(int i, String str) {
        return isLive$default(i, str, null, 4, null);
    }

    @JvmStatic
    public static final boolean isMatchStarted(int i) {
        return isMatchStarted$default(i, null, null, 6, null);
    }

    @JvmStatic
    public static final boolean isMatchStarted(int i, String str) {
        return isMatchStarted$default(i, str, null, 4, null);
    }

    @JvmStatic
    public static final boolean isScoreAvailable(int i) {
        return isScoreAvailable$default(i, null, null, 6, null);
    }

    @JvmStatic
    public static final boolean isScoreAvailable(int i, String str) {
        return isScoreAvailable$default(i, str, null, 4, null);
    }

    private MatchDisplayState() {
    }

    public final Set<Integer> getFIFA_SPORT_IDS() {
        return FIFA_SPORT_IDS;
    }

    @JvmStatic
    public static final boolean isFifaSport(Integer sportId) {
        return sportId != null && FIFA_SPORT_IDS.contains(sportId);
    }

    public static /* synthetic */ boolean isMatchStarted$default(int i, String str, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return isMatchStarted(i, str, num);
    }

    @JvmStatic
    public static final boolean isMatchStarted(int matchState, String matchDate, Integer sportId) {
        MatchState fromInt = MatchState.fromInt(matchState);
        int i = fromInt == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fromInt.ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        if (i == 3) {
            return isLive(matchState, matchDate, sportId);
        }
        if (i == 4 || i == 5) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean isLive$default(int i, String str, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return isLive(i, str, num);
    }

    @JvmStatic
    public static final boolean isLive(int matchState, String matchDate, Integer sportId) {
        if (MatchState.fromInt(matchState) != MatchState.LIVE) {
            return false;
        }
        MatchDisplayState matchDisplayState = INSTANCE;
        if (isFifaSport(sportId)) {
            return matchDisplayState.hasMatchTimeReachedSafe(matchDate);
        }
        return true;
    }

    public static /* synthetic */ boolean isScoreAvailable$default(int i, String str, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return isScoreAvailable(i, str, num);
    }

    @JvmStatic
    public static final boolean isScoreAvailable(int matchState, String matchDate, Integer sportId) {
        return isMatchStarted(matchState, matchDate, sportId);
    }

    @JvmStatic
    public static final boolean isFinished(int matchState) {
        return MatchState.fromInt(matchState) == MatchState.FINISHED;
    }

    private final boolean hasMatchTimeReachedSafe(String str) {
        String str2 = str;
        return (str2 == null || StringsKt.isBlank(str2) || !UiExtensionsKt.hasMatchTimeReached(str)) ? false : true;
    }
}
