package org.betup.utils;

import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsModel;
import org.betup.model.remote.entity.challenges.NewChallengeDetailsResponseModelP;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleDetailsMapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0010¨\u0006\u0012"}, d2 = {"Lorg/betup/utils/BattleDetailsMapper;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "resolveAmountDisplay", "Lorg/betup/utils/BattleDetailsMapper$AmountDisplay;", "challengeDetails", "Lorg/betup/model/remote/entity/challenges/NewChallengeDetailsResponseModelP;", "effectiveState", "", "isPendingInviteAwaitingAccept", "", "shouldShowStakesStrip", "twoUsers", "betsVisible", "statusHintMessageRes", "(I)Ljava/lang/Integer;", "AmountDisplay", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BattleDetailsMapper {
    public static final int $stable = 0;
    public static final BattleDetailsMapper INSTANCE = new BattleDetailsMapper();

    private BattleDetailsMapper() {
    }

    /* compiled from: BattleDetailsMapper.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lorg/betup/utils/BattleDetailsMapper$AmountDisplay;", "", "amountText", "", "amountColor", "Landroidx/compose/ui/graphics/Color;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAmountText", "()Ljava/lang/String;", "getAmountColor-0d7_KjU", "()J", "J", "component1", "component2", "component2-0d7_KjU", "copy", "copy-4WTKRHQ", "(Ljava/lang/String;J)Lorg/betup/utils/BattleDetailsMapper$AmountDisplay;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AmountDisplay {
        public static final int $stable = 0;
        private final long amountColor;
        private final String amountText;

        public /* synthetic */ AmountDisplay(String str, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, j);
        }

        /* renamed from: copy-4WTKRHQ$default, reason: not valid java name */
        public static /* synthetic */ AmountDisplay m14438copy4WTKRHQ$default(AmountDisplay amountDisplay, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = amountDisplay.amountText;
            }
            if ((i & 2) != 0) {
                j = amountDisplay.amountColor;
            }
            return amountDisplay.m14440copy4WTKRHQ(str, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAmountText() {
            return this.amountText;
        }

        /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
        public final long getAmountColor() {
            return this.amountColor;
        }

        /* renamed from: copy-4WTKRHQ, reason: not valid java name */
        public final AmountDisplay m14440copy4WTKRHQ(String amountText, long amountColor) {
            Intrinsics.checkNotNullParameter(amountText, "amountText");
            return new AmountDisplay(amountText, amountColor, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AmountDisplay)) {
                return false;
            }
            AmountDisplay amountDisplay = (AmountDisplay) other;
            return Intrinsics.areEqual(this.amountText, amountDisplay.amountText) && Color.m5169equalsimpl0(this.amountColor, amountDisplay.amountColor);
        }

        public int hashCode() {
            return (this.amountText.hashCode() * 31) + Color.m5175hashCodeimpl(this.amountColor);
        }

        public String toString() {
            return "AmountDisplay(amountText=" + this.amountText + ", amountColor=" + Color.m5176toStringimpl(this.amountColor) + ")";
        }

        private AmountDisplay(String amountText, long j) {
            Intrinsics.checkNotNullParameter(amountText, "amountText");
            this.amountText = amountText;
            this.amountColor = j;
        }

        public final String getAmountText() {
            return this.amountText;
        }

        /* renamed from: getAmountColor-0d7_KjU, reason: not valid java name */
        public final long m14441getAmountColor0d7_KjU() {
            return this.amountColor;
        }
    }

    public final AmountDisplay resolveAmountDisplay(NewChallengeDetailsResponseModelP challengeDetails, int effectiveState, boolean isPendingInviteAwaitingAccept) {
        NewChallengeDetailsModel challenge;
        Long enterFee;
        NewChallengeDetailsModel challenge2;
        Long moneyAccept;
        NewChallengeDetailsModel challenge3;
        Long moneyToWin;
        long longValue = (challengeDetails == null || (challenge3 = challengeDetails.getChallenge()) == null || (moneyToWin = challenge3.getMoneyToWin()) == null) ? 0L : moneyToWin.longValue();
        long longValue2 = (challengeDetails == null || (challenge2 = challengeDetails.getChallenge()) == null || (moneyAccept = challenge2.getMoneyAccept()) == null) ? 0L : moneyAccept.longValue();
        long longValue3 = ((challengeDetails == null || (challenge = challengeDetails.getChallenge()) == null || (enterFee = challenge.getEnterFee()) == null) ? 0L : enterFee.longValue()) + longValue2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (isPendingInviteAwaitingAccept) {
            Long valueOf = Long.valueOf(longValue2);
            if (valueOf.longValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                longValue = valueOf.longValue();
            }
            return new AmountDisplay(String.valueOf(longValue * 2), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), defaultConstructorMarker);
        }
        long j = longValue3 > 0 ? 2 * longValue3 : longValue;
        switch (effectiveState) {
            case 1:
            case 2:
            case 8:
            case 9:
                return new AmountDisplay(String.valueOf(longValue), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), defaultConstructorMarker);
            case 3:
            default:
                return new AmountDisplay(String.valueOf(longValue), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), defaultConstructorMarker);
            case 4:
                return new AmountDisplay("+" + j, ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), defaultConstructorMarker);
            case 5:
                return new AmountDisplay("-" + longValue3, ComposeUtils.AppColorPalette.Red.INSTANCE.getColor(), defaultConstructorMarker);
            case 6:
                return new AmountDisplay("+" + longValue, ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), defaultConstructorMarker);
            case 7:
            case 10:
                return new AmountDisplay(String.valueOf(longValue), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), defaultConstructorMarker);
        }
    }

    public final boolean shouldShowStakesStrip(int effectiveState, boolean twoUsers, boolean betsVisible) {
        if (twoUsers && betsVisible) {
            return CollectionsKt.listOf((Object[]) new Integer[]{2, 4, 5, 6, 8, 9}).contains(Integer.valueOf(effectiveState));
        }
        return false;
    }

    public final Integer statusHintMessageRes(int effectiveState) {
        if (effectiveState == 1) {
            return Integer.valueOf(R.string.battle_awaiting_opponent);
        }
        if (effectiveState != 2) {
            switch (effectiveState) {
                case 7:
                    return Integer.valueOf(R.string.battle_stake_returned);
                case 8:
                    break;
                case 9:
                    return Integer.valueOf(R.string.battle_settling_results);
                case 10:
                    return Integer.valueOf(R.string.battle_canceled_subtitle);
                default:
                    return null;
            }
        }
        return Integer.valueOf(R.string.battle_in_progress);
    }
}
