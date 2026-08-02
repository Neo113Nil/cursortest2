package org.betup.ui.dialogs.compose;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.dialogs.controller.ChallengePreviewController;

/* compiled from: BattleListDetailsScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.compose.BattleListDetailsScreenKt$BattleListDetailsScreen$5$1", f = "BattleListDetailsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BattleListDetailsScreenKt$BattleListDetailsScreen$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Long> $challengeIds;
    final /* synthetic */ ChallengePreviewController $controller;
    final /* synthetic */ int $currentPage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BattleListDetailsScreenKt$BattleListDetailsScreen$5$1(List<Long> list, int i, ChallengePreviewController challengePreviewController, Continuation<? super BattleListDetailsScreenKt$BattleListDetailsScreen$5$1> continuation) {
        super(2, continuation);
        this.$challengeIds = list;
        this.$currentPage = i;
        this.$controller = challengePreviewController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BattleListDetailsScreenKt$BattleListDetailsScreen$5$1(this.$challengeIds, this.$currentPage, this.$controller, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BattleListDetailsScreenKt$BattleListDetailsScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Long l = (Long) CollectionsKt.getOrNull(this.$challengeIds, this.$currentPage);
        if (l != null) {
            this.$controller.onPageChanged(l.longValue());
        }
        return Unit.INSTANCE;
    }
}
