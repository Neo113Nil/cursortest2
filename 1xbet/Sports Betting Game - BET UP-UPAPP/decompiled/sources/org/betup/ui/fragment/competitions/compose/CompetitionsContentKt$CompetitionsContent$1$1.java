package org.betup.ui.fragment.competitions.compose;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.betup.ui.fragment.competitions.controller.CompetitionsController;

/* compiled from: CompetitionsContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.fragment.competitions.compose.CompetitionsContentKt$CompetitionsContent$1$1", f = "CompetitionsContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class CompetitionsContentKt$CompetitionsContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CompetitionsController $controller;
    final /* synthetic */ State<Integer> $currentTab$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompetitionsContentKt$CompetitionsContent$1$1(CompetitionsController competitionsController, State<Integer> state, Continuation<? super CompetitionsContentKt$CompetitionsContent$1$1> continuation) {
        super(2, continuation);
        this.$controller = competitionsController;
        this.$currentTab$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CompetitionsContentKt$CompetitionsContent$1$1(this.$controller, this.$currentTab$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CompetitionsContentKt$CompetitionsContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int CompetitionsContent$lambda$1;
        CompetitionsController competitionsController;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CompetitionsContent$lambda$1 = CompetitionsContentKt.CompetitionsContent$lambda$1(this.$currentTab$delegate);
            if (CompetitionsContent$lambda$1 == 1 && (competitionsController = this.$controller) != null) {
                competitionsController.loadHistoryCount();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
