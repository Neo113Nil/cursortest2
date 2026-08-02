package org.betup.ui.fragment.matches.details;

import com.android.billingclient.api.BillingClient;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlin.text.StringsKt;
import org.betup.ui.fragment.matches.details.compose.MatchTopBaseData;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;
import org.betup.utils.MatchUtils;

/* compiled from: MatchDetailsController.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, d2 = {"<anonymous>", "Lorg/betup/ui/fragment/matches/details/compose/MatchTopBaseData;", TtmlNode.RUBY_BASE, "selectedTabIdx", "", "betGroupTabIdx", BillingClient.ProductType.SUBS, "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsTabs;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.MatchDetailsController$displayBaseMatchInfo$1", f = "MatchDetailsController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchDetailsController$displayBaseMatchInfo$1 extends SuspendLambda implements Function5<MatchTopBaseData, Integer, Integer, List<? extends BetGroupsTabs>, Continuation<? super MatchTopBaseData>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ int I$1;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    MatchDetailsController$displayBaseMatchInfo$1(Continuation<? super MatchDetailsController$displayBaseMatchInfo$1> continuation) {
        super(5, continuation);
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(MatchTopBaseData matchTopBaseData, Integer num, Integer num2, List<? extends BetGroupsTabs> list, Continuation<? super MatchTopBaseData> continuation) {
        return invoke(matchTopBaseData, num.intValue(), num2.intValue(), (List<BetGroupsTabs>) list, continuation);
    }

    public final Object invoke(MatchTopBaseData matchTopBaseData, int i, int i2, List<BetGroupsTabs> list, Continuation<? super MatchTopBaseData> continuation) {
        MatchDetailsController$displayBaseMatchInfo$1 matchDetailsController$displayBaseMatchInfo$1 = new MatchDetailsController$displayBaseMatchInfo$1(continuation);
        matchDetailsController$displayBaseMatchInfo$1.L$0 = matchTopBaseData;
        matchDetailsController$displayBaseMatchInfo$1.I$0 = i;
        matchDetailsController$displayBaseMatchInfo$1.I$1 = i2;
        matchDetailsController$displayBaseMatchInfo$1.L$1 = list;
        return matchDetailsController$displayBaseMatchInfo$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MatchTopBaseData copy;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MatchTopBaseData matchTopBaseData = (MatchTopBaseData) this.L$0;
        int i = this.I$0;
        int i2 = this.I$1;
        List list = (List) this.L$1;
        String str = null;
        if (matchTopBaseData == null) {
            return null;
        }
        if (i != 0 || list.isEmpty() || i2 < 0 || i2 >= list.size()) {
            return matchTopBaseData;
        }
        BetGroupsTabs betGroupsTabs = (BetGroupsTabs) list.get(i2);
        String resultRaw = betGroupsTabs.getResultRaw();
        if (resultRaw != null) {
            if (StringsKt.isBlank(resultRaw)) {
                resultRaw = null;
            }
            if (resultRaw != null) {
                str = MatchUtils.INSTANCE.extractPeriodScoresFromResultRaw(resultRaw);
            }
        }
        copy = matchTopBaseData.copy((r30 & 1) != 0 ? matchTopBaseData.firstTeamName : null, (r30 & 2) != 0 ? matchTopBaseData.secondTeamName : null, (r30 & 4) != 0 ? matchTopBaseData.firstTeamImage : null, (r30 & 8) != 0 ? matchTopBaseData.secondTeamImage : null, (r30 & 16) != 0 ? matchTopBaseData.scoreFirstTeam : String.valueOf(betGroupsTabs.getScoreHome()), (r30 & 32) != 0 ? matchTopBaseData.scoreSecondTeam : String.valueOf(betGroupsTabs.getScoreAway()), (r30 & 64) != 0 ? matchTopBaseData.matchDateTime : null, (r30 & 128) != 0 ? matchTopBaseData.isScoreAvailable : false, (r30 & 256) != 0 ? matchTopBaseData.playTime : null, (r30 & 512) != 0 ? matchTopBaseData.playTimeName : null, (r30 & 1024) != 0 ? matchTopBaseData.isLive : false, (r30 & 2048) != 0 ? matchTopBaseData.sportId : 0, (r30 & 4096) != 0 ? matchTopBaseData.matchStat : null, (r30 & 8192) != 0 ? matchTopBaseData.periodScoresDisplay : str == null ? matchTopBaseData.getPeriodScoresDisplay() : str);
        return copy;
    }
}
