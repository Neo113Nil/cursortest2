package org.betup.ui.fragment.matches.details;

import com.android.billingclient.api.BillingClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function6;
import org.betup.ui.fragment.matches.details.compose.tabs.betgorups.BetGroupsTabs;

/* compiled from: MatchDetailsController.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", BillingClient.ProductType.SUBS, "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/betgorups/BetGroupsTabs;", "tabIdx", "", "helpOpen", "autoDismissed", "<unused var>"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.MatchDetailsController$showPlayerStatsMinStakeInfo$1", f = "MatchDetailsController.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchDetailsController$showPlayerStatsMinStakeInfo$1 extends SuspendLambda implements Function6<List<? extends BetGroupsTabs>, Integer, Boolean, Boolean, Integer, Continuation<? super Boolean>, Object> {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;
    final /* synthetic */ MatchDetailsController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchDetailsController$showPlayerStatsMinStakeInfo$1(MatchDetailsController matchDetailsController, Continuation<? super MatchDetailsController$showPlayerStatsMinStakeInfo$1> continuation) {
        super(6, continuation);
        this.this$0 = matchDetailsController;
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(List<? extends BetGroupsTabs> list, Integer num, Boolean bool, Boolean bool2, Integer num2, Continuation<? super Boolean> continuation) {
        return invoke((List<BetGroupsTabs>) list, num.intValue(), bool.booleanValue(), bool2.booleanValue(), num2.intValue(), continuation);
    }

    public final Object invoke(List<BetGroupsTabs> list, int i, boolean z, boolean z2, int i2, Continuation<? super Boolean> continuation) {
        MatchDetailsController$showPlayerStatsMinStakeInfo$1 matchDetailsController$showPlayerStatsMinStakeInfo$1 = new MatchDetailsController$showPlayerStatsMinStakeInfo$1(this.this$0, continuation);
        matchDetailsController$showPlayerStatsMinStakeInfo$1.L$0 = list;
        matchDetailsController$showPlayerStatsMinStakeInfo$1.I$0 = i;
        matchDetailsController$showPlayerStatsMinStakeInfo$1.Z$0 = z;
        matchDetailsController$showPlayerStatsMinStakeInfo$1.Z$1 = z2;
        return matchDetailsController$showPlayerStatsMinStakeInfo$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r6 = r5.this$0.minStakeRuleIdForTab(r6, r0);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean isMinStakeEnforcementActiveForTab;
        String minStakeRuleIdForTab;
        boolean currentUserHasVarietyMinStakeBetEverPlaced;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            int i = this.I$0;
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            isMinStakeEnforcementActiveForTab = this.this$0.isMinStakeEnforcementActiveForTab(list, i);
            if (isMinStakeEnforcementActiveForTab && minStakeRuleIdForTab != null) {
                currentUserHasVarietyMinStakeBetEverPlaced = this.this$0.currentUserHasVarietyMinStakeBetEverPlaced(minStakeRuleIdForTab);
                if (!currentUserHasVarietyMinStakeBetEverPlaced) {
                    z = !z2 || z;
                }
                return Boxing.boxBoolean(z);
            }
            return Boxing.boxBoolean(false);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
