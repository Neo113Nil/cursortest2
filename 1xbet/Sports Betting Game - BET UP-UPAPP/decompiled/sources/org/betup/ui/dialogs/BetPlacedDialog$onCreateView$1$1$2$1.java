package org.betup.ui.dialogs;

import android.view.View;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
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
import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;
import org.betup.ui.common.compose.HapticFeedbackEffect;
import org.betup.ui.common.compose.HapticFeedbackType;

/* compiled from: BetPlacedDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "org.betup.ui.dialogs.BetPlacedDialog$onCreateView$1$1$2$1", f = "BetPlacedDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class BetPlacedDialog$onCreateView$1$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<List<BetsListModel>> $bet$delegate;
    final /* synthetic */ State<Boolean> $isLoading$delegate;
    final /* synthetic */ MutableState<Boolean> $placementHapticPlayed$delegate;
    final /* synthetic */ View $view;
    int label;
    final /* synthetic */ BetPlacedDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BetPlacedDialog$onCreateView$1$1$2$1(BetPlacedDialog betPlacedDialog, View view, MutableState<Boolean> mutableState, State<Boolean> state, State<? extends List<? extends BetsListModel>> state2, Continuation<? super BetPlacedDialog$onCreateView$1$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = betPlacedDialog;
        this.$view = view;
        this.$placementHapticPlayed$delegate = mutableState;
        this.$isLoading$delegate = state;
        this.$bet$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BetPlacedDialog$onCreateView$1$1$2$1(this.this$0, this.$view, this.$placementHapticPlayed$delegate, this.$isLoading$delegate, this.$bet$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BetPlacedDialog$onCreateView$1$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean invoke$lambda$3;
        boolean invoke$lambda$1;
        List invoke$lambda$0;
        List invoke$lambda$02;
        int i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            invoke$lambda$3 = BetPlacedDialog$onCreateView$1$1.invoke$lambda$3(this.$placementHapticPlayed$delegate);
            if (!invoke$lambda$3) {
                invoke$lambda$1 = BetPlacedDialog$onCreateView$1$1.invoke$lambda$1(this.$isLoading$delegate);
                if (!invoke$lambda$1) {
                    invoke$lambda$0 = BetPlacedDialog$onCreateView$1$1.invoke$lambda$0(this.$bet$delegate);
                    if (!invoke$lambda$0.isEmpty()) {
                        invoke$lambda$02 = BetPlacedDialog$onCreateView$1$1.invoke$lambda$0(this.$bet$delegate);
                        Integer id = ((BetsListModel) CollectionsKt.first(invoke$lambda$02)).getId();
                        i = this.this$0.betId;
                        if (id != null && id.intValue() == i) {
                            BetPlacedDialog$onCreateView$1$1.invoke$lambda$4(this.$placementHapticPlayed$delegate, true);
                            HapticFeedbackEffect.perform(this.$view, HapticFeedbackType.PlaceBetSuccess);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
