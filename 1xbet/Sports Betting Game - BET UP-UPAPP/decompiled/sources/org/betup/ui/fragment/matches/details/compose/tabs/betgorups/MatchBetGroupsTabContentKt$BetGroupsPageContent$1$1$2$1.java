package org.betup.ui.fragment.matches.details.compose.tabs.betgorups;

import android.util.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyGroupBetsModel;

/* compiled from: MatchBetGroupsTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.matches.details.compose.tabs.betgorups.MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1", f = "MatchBetGroupsTabContent.kt", i = {}, l = {399}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<MatchVarietyGroupBetsModel> $betGroups;
    final /* synthetic */ Function0<Unit> $onBetSectionReady;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1(List<MatchVarietyGroupBetsModel> list, Function0<Unit> function0, Continuation<? super MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1> continuation) {
        super(2, continuation);
        this.$betGroups = list;
        this.$onBetSectionReady = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1(this.$betGroups, this.$onBetSectionReady, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MatchBetGroupsTabContentKt$BetGroupsPageContent$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.d("TourFlow", "MatchBetGroupsTabContent - LaunchedEffect triggered, betGroups.size=" + this.$betGroups.size() + ", onBetSectionReady=" + (this.$onBetSectionReady != null));
            if (!this.$betGroups.isEmpty() && this.$onBetSectionReady != null) {
                this.label = 1;
                if (DelayKt.delay(300L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                Log.d("TourFlow", "MatchBetGroupsTabContent - Not calling onBetSectionReady: betGroups.isEmpty=" + this.$betGroups.isEmpty() + ", onBetSectionReady=null=" + (this.$onBetSectionReady == null));
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Log.d("TourFlow", "MatchBetGroupsTabContent - Calling onBetSectionReady()");
        this.$onBetSectionReady.invoke();
        Log.d("TourFlow", "MatchBetGroupsTabContent - Bet section ready - first group should be positioned");
        return Unit.INSTANCE;
    }
}
