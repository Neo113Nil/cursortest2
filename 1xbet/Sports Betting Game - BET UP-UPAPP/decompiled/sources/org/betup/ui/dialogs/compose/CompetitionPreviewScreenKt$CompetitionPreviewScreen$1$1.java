package org.betup.ui.dialogs.compose;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.betup.model.remote.entity.competitions.CompetitionDetailsWithParticipantModel;
import org.betup.ui.common.compose.HapticFeedbackType;

/* compiled from: CompetitionPreviewScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.compose.CompetitionPreviewScreenKt$CompetitionPreviewScreen$1$1", f = "CompetitionPreviewScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class CompetitionPreviewScreenKt$CompetitionPreviewScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<CompetitionDetailsWithParticipantModel> $comp$delegate;
    final /* synthetic */ Boolean $isWon;
    final /* synthetic */ Function1<HapticFeedbackType, Unit> $performHaptic;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CompetitionPreviewScreenKt$CompetitionPreviewScreen$1$1(Boolean bool, Function1<? super HapticFeedbackType, Unit> function1, State<CompetitionDetailsWithParticipantModel> state, Continuation<? super CompetitionPreviewScreenKt$CompetitionPreviewScreen$1$1> continuation) {
        super(2, continuation);
        this.$isWon = bool;
        this.$performHaptic = function1;
        this.$comp$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CompetitionPreviewScreenKt$CompetitionPreviewScreen$1$1(this.$isWon, this.$performHaptic, this.$comp$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CompetitionPreviewScreenKt$CompetitionPreviewScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CompetitionDetailsWithParticipantModel CompetitionPreviewScreen$lambda$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CompetitionPreviewScreen$lambda$0 = CompetitionPreviewScreenKt.CompetitionPreviewScreen$lambda$0(this.$comp$delegate);
            if (CompetitionPreviewScreen$lambda$0 == null) {
                return Unit.INSTANCE;
            }
            Boolean bool = this.$isWon;
            if (Intrinsics.areEqual(bool, Boxing.boxBoolean(true))) {
                this.$performHaptic.invoke(HapticFeedbackType.Win);
            } else if (Intrinsics.areEqual(bool, Boxing.boxBoolean(false))) {
                this.$performHaptic.invoke(HapticFeedbackType.Loss);
            } else if (bool != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
