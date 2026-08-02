package org.betup.utils;

import com.google.firebase.crashlytics.internal.common.IdManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.betup.R;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.bets.BetState;
import org.betup.model.remote.entity.challenges.NewChallengeBetDetailsModel;
import org.betup.model.remote.entity.challenges.NewChallengeBetModel;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleBetOutcomeResolver.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ(\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001c\u0010\u0018\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u001c\u0010\u0019\u001a\u00020\u00172\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u001f\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010\u001eJ\u001c\u0010\u001f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u0014\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010!H\u0002J+\u0010%\u001a\u00020\u00172\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010&\u001a\u0004\u0018\u00010!2\b\u0010'\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"Lorg/betup/utils/BattleBetOutcomeResolver;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "resolve", "Lorg/betup/utils/BattleBetOutcomeResult;", "firstBet", "Lorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;", "secondBet", "challengeGlobalState", "", "(Lorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;Lorg/betup/model/remote/entity/challenges/NewChallengeBetDetailsModel;Ljava/lang/Integer;)Lorg/betup/utils/BattleBetOutcomeResult;", "messageResId", "scenario", "Lorg/betup/utils/BattleOutcomeScenario;", "(Lorg/betup/utils/BattleOutcomeScenario;)Ljava/lang/Integer;", "buildOutcomeMessage", "Lorg/betup/utils/BattleOutcomeMessage;", "ordered", "Lorg/betup/utils/OrderedBattleParticipants;", "oddType", "Lorg/betup/model/local/entity/OddType;", "currentUserWon", "", "resolveOneWinsScenario", "isSamePickDifferentPeriod", "formatCoef", "", "coefficient", "", "(Ljava/lang/Double;Lorg/betup/model/local/entity/OddType;)Ljava/lang/String;", "resolveBothWin", "betStateOf", "Lorg/betup/model/remote/entity/bets/BetState;", "bet", "isBetResolved", "state", "isMatchCancelled", "firstState", "secondState", "(Ljava/lang/Integer;Lorg/betup/model/remote/entity/bets/BetState;Lorg/betup/model/remote/entity/bets/BetState;)Z", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattleBetOutcomeResolver {
    public static final int $stable = 0;
    public static final BattleBetOutcomeResolver INSTANCE = new BattleBetOutcomeResolver();

    /* compiled from: BattleBetOutcomeResolver.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BattleOutcomeScenario.values().length];
            try {
                iArr[BattleOutcomeScenario.BOTH_WIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BattleOutcomeScenario.BOTH_LOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BattleOutcomeScenario.MATCH_CANCELLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BattleOutcomeScenario.SAME_PICK_DIFFERENT_PERIOD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BattleOutcomeScenario.ONE_WINS_ONE_LOSES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BattleOutcomeScenario.UNRESOLVED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BattleBetOutcomeResolver() {
    }

    public final BattleBetOutcomeResult resolve(NewChallengeBetDetailsModel firstBet, NewChallengeBetDetailsModel secondBet, Integer challengeGlobalState) {
        BattleBetOutcomeResult battleBetOutcomeResult;
        BetState betStateOf = betStateOf(firstBet);
        BetState betStateOf2 = betStateOf(secondBet);
        if (isMatchCancelled(challengeGlobalState, betStateOf, betStateOf2)) {
            return new BattleBetOutcomeResult(BattleBetHighlightStyle.CANCELLED, BattleBetHighlightStyle.CANCELLED, BattleOutcomeScenario.MATCH_CANCELLED);
        }
        if (!isBetResolved(betStateOf) || !isBetResolved(betStateOf2)) {
            return new BattleBetOutcomeResult(BattleBetHighlightStyle.DEFAULT, BattleBetHighlightStyle.DEFAULT, BattleOutcomeScenario.UNRESOLVED);
        }
        boolean z = betStateOf == BetState.WON;
        boolean z2 = betStateOf2 == BetState.WON;
        boolean z3 = betStateOf == BetState.LOST;
        boolean z4 = betStateOf2 == BetState.LOST;
        if (z && z2) {
            return resolveBothWin(firstBet, secondBet);
        }
        if (z3 && z4) {
            return new BattleBetOutcomeResult(BattleBetHighlightStyle.LOSER, BattleBetHighlightStyle.LOSER, BattleOutcomeScenario.BOTH_LOSE);
        }
        if (z && z4) {
            battleBetOutcomeResult = new BattleBetOutcomeResult(BattleBetHighlightStyle.WINNER, BattleBetHighlightStyle.LOSER, resolveOneWinsScenario(firstBet, secondBet));
        } else if (z3 && z2) {
            battleBetOutcomeResult = new BattleBetOutcomeResult(BattleBetHighlightStyle.LOSER, BattleBetHighlightStyle.WINNER, resolveOneWinsScenario(firstBet, secondBet));
        } else {
            return new BattleBetOutcomeResult(BattleBetHighlightStyle.DEFAULT, BattleBetHighlightStyle.DEFAULT, BattleOutcomeScenario.UNRESOLVED);
        }
        return battleBetOutcomeResult;
    }

    public final Integer messageResId(BattleOutcomeScenario scenario) {
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        int i = WhenMappings.$EnumSwitchMapping$0[scenario.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.string.battle_both_win_winner_hint);
        }
        if (i == 2) {
            return Integer.valueOf(R.string.battle_both_lose_hint);
        }
        if (i != 3) {
            return null;
        }
        return Integer.valueOf(R.string.battle_match_cancelled_hint);
    }

    public final BattleOutcomeMessage buildOutcomeMessage(BattleOutcomeScenario scenario, OrderedBattleParticipants ordered, OddType oddType, boolean currentUserWon) {
        String str;
        BattleOutcomeMessage battleOutcomeMessage;
        NewChallengeBetDetailsModel bet;
        NewChallengeBetDetailsModel bet2;
        String betsGameType;
        NewChallengeBetDetailsModel bet3;
        NewChallengeBetDetailsModel bet4;
        NewChallengeBetDetailsModel bet5;
        NewChallengeBetDetailsModel bet6;
        Intrinsics.checkNotNullParameter(scenario, "scenario");
        Intrinsics.checkNotNullParameter(ordered, "ordered");
        Intrinsics.checkNotNullParameter(oddType, "oddType");
        NewChallengeBetModel leftBet = ordered.getLeftBet();
        String str2 = null;
        String formatCoef = formatCoef((leftBet == null || (bet6 = leftBet.getBet()) == null) ? null : bet6.getPlacedCoefficient(), oddType);
        NewChallengeBetModel rightBet = ordered.getRightBet();
        String formatCoef2 = formatCoef((rightBet == null || (bet5 = rightBet.getBet()) == null) ? null : bet5.getPlacedCoefficient(), oddType);
        NewChallengeBetModel leftBet2 = ordered.getLeftBet();
        if (leftBet2 == null || (bet4 = leftBet2.getBet()) == null || (str = bet4.getBetsGameType()) == null || StringsKt.isBlank(str) || Intrinsics.areEqual(str, AbstractJsonLexerKt.NULL)) {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        switch (WhenMappings.$EnumSwitchMapping$0[scenario.ordinal()]) {
            case 1:
                if (currentUserWon) {
                    return new BattleOutcomeMessage(R.string.battle_outcome_both_win_you_won, new Object[]{formatCoef, formatCoef2});
                }
                return new BattleOutcomeMessage(R.string.battle_outcome_both_win_you_lost, new Object[]{formatCoef2, formatCoef});
            case 2:
                battleOutcomeMessage = new BattleOutcomeMessage(R.string.battle_both_lose_hint, null, 2, null);
                break;
            case 3:
                battleOutcomeMessage = new BattleOutcomeMessage(R.string.battle_match_cancelled_hint, null, 2, null);
                break;
            case 4:
                String str4 = str;
                if (StringsKt.isBlank(str4)) {
                    NewChallengeBetModel leftBet3 = ordered.getLeftBet();
                    String betName = (leftBet3 == null || (bet3 = leftBet3.getBet()) == null) ? null : bet3.getBetName();
                    str4 = betName == null ? "" : betName;
                }
                String str5 = str4;
                if (currentUserWon) {
                    return new BattleOutcomeMessage(R.string.battle_outcome_same_pick_diff_you_won, new Object[]{str5});
                }
                NewChallengeBetModel rightBet2 = ordered.getRightBet();
                if (rightBet2 != null && (bet2 = rightBet2.getBet()) != null && (betsGameType = bet2.getBetsGameType()) != null) {
                    if (StringsKt.isBlank(betsGameType) || Intrinsics.areEqual(betsGameType, AbstractJsonLexerKt.NULL)) {
                        betsGameType = null;
                    }
                    if (betsGameType != null) {
                        str3 = betsGameType;
                        return new BattleOutcomeMessage(R.string.battle_outcome_same_pick_diff_you_lost, new Object[]{str3});
                    }
                }
                NewChallengeBetModel rightBet3 = ordered.getRightBet();
                if (rightBet3 != null && (bet = rightBet3.getBet()) != null) {
                    str2 = bet.getBetName();
                }
                if (str2 != null) {
                    str3 = str2;
                }
                return new BattleOutcomeMessage(R.string.battle_outcome_same_pick_diff_you_lost, new Object[]{str3});
            case 5:
                if (currentUserWon) {
                    battleOutcomeMessage = new BattleOutcomeMessage(R.string.battle_outcome_you_won, null, 2, null);
                    break;
                } else {
                    battleOutcomeMessage = new BattleOutcomeMessage(R.string.battle_outcome_you_lost, null, 2, null);
                    break;
                }
            case 6:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return battleOutcomeMessage;
    }

    private final BattleOutcomeScenario resolveOneWinsScenario(NewChallengeBetDetailsModel firstBet, NewChallengeBetDetailsModel secondBet) {
        if (isSamePickDifferentPeriod(firstBet, secondBet)) {
            return BattleOutcomeScenario.SAME_PICK_DIFFERENT_PERIOD;
        }
        return BattleOutcomeScenario.ONE_WINS_ONE_LOSES;
    }

    private final boolean isSamePickDifferentPeriod(NewChallengeBetDetailsModel firstBet, NewChallengeBetDetailsModel secondBet) {
        String betsGameType;
        String betsGameType2;
        String betName;
        String betName2;
        String str = null;
        String obj = (firstBet == null || (betName2 = firstBet.getBetName()) == null) ? null : StringsKt.trim((CharSequence) betName2).toString();
        if (obj == null) {
            obj = "";
        }
        String obj2 = (secondBet == null || (betName = secondBet.getBetName()) == null) ? null : StringsKt.trim((CharSequence) betName).toString();
        if (obj2 == null) {
            obj2 = "";
        }
        if (StringsKt.isBlank(obj) || StringsKt.isBlank(obj2) || !StringsKt.equals(obj, obj2, true)) {
            return false;
        }
        String obj3 = (firstBet == null || (betsGameType2 = firstBet.getBetsGameType()) == null) ? null : StringsKt.trim((CharSequence) betsGameType2).toString();
        if (obj3 == null) {
            obj3 = "";
        }
        if (secondBet != null && (betsGameType = secondBet.getBetsGameType()) != null) {
            str = StringsKt.trim((CharSequence) betsGameType).toString();
        }
        String str2 = str != null ? str : "";
        return (StringsKt.isBlank(obj3) || StringsKt.isBlank(str2) || StringsKt.equals(obj3, str2, true)) ? false : true;
    }

    private final String formatCoef(Double coefficient, OddType oddType) {
        String format;
        if (coefficient == null || coefficient.doubleValue() <= 0.0d || (format = OddHelper.format(oddType, coefficient.doubleValue())) == null) {
            return "-";
        }
        if (StringsKt.isBlank(format) || Intrinsics.areEqual(format, AbstractJsonLexerKt.NULL) || Intrinsics.areEqual(format, "0") || Intrinsics.areEqual(format, IdManager.DEFAULT_VERSION_NAME)) {
            format = null;
        }
        return format == null ? "-" : format;
    }

    private final BattleBetOutcomeResult resolveBothWin(NewChallengeBetDetailsModel firstBet, NewChallengeBetDetailsModel secondBet) {
        Double placedCoefficient;
        Double placedCoefficient2;
        double d = 0.0d;
        double doubleValue = (firstBet == null || (placedCoefficient2 = firstBet.getPlacedCoefficient()) == null) ? 0.0d : placedCoefficient2.doubleValue();
        if (secondBet != null && (placedCoefficient = secondBet.getPlacedCoefficient()) != null) {
            d = placedCoefficient.doubleValue();
        }
        if (doubleValue > d) {
            return new BattleBetOutcomeResult(BattleBetHighlightStyle.WINNER, BattleBetHighlightStyle.WINNER_MUTED, BattleOutcomeScenario.BOTH_WIN);
        }
        if (d > doubleValue) {
            return new BattleBetOutcomeResult(BattleBetHighlightStyle.WINNER_MUTED, BattleBetHighlightStyle.WINNER, BattleOutcomeScenario.BOTH_WIN);
        }
        return new BattleBetOutcomeResult(BattleBetHighlightStyle.WINNER, BattleBetHighlightStyle.WINNER, BattleOutcomeScenario.BOTH_WIN);
    }

    private final BetState betStateOf(NewChallengeBetDetailsModel bet) {
        Integer state;
        if (bet == null || (state = bet.getState()) == null) {
            return null;
        }
        return BetState.fromInt(state.intValue());
    }

    private final boolean isBetResolved(BetState state) {
        return state == BetState.WON || state == BetState.LOST || state == BetState.RETURNED || state == BetState.CANCELED;
    }

    private final boolean isMatchCancelled(Integer challengeGlobalState, BetState firstState, BetState secondState) {
        if (ChallengeEffectiveStateResolver.INSTANCE.isGlobalCancelledOrRejected(challengeGlobalState)) {
            return true;
        }
        return (firstState == BetState.RETURNED || firstState == BetState.CANCELED) && (secondState == BetState.RETURNED || secondState == BetState.CANCELED);
    }
}
