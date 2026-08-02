package com.paypal.oslo.feature.searchandintelligence.ui.preview;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/ui/preview/PreviewFocusInteractionSource;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "<init>", "()V", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "", "emit", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryEmit", "(Landroidx/compose/foundation/interaction/Interaction;)Z", "Lkotlinx/coroutines/flow/Flow;", "getInteractions", "()Lkotlinx/coroutines/flow/Flow;", "interactions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PreviewFocusInteractionSource implements androidx.compose.foundation.interaction.MutableInteractionSource {
    public static final int $stable = 0;

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public final kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> getInteractions() {
        return kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new androidx.compose.foundation.interaction.FocusInteraction.Focus());
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final java.lang.Object emit(androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final boolean tryEmit(androidx.compose.foundation.interaction.Interaction interaction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interaction, "");
        return false;
    }
}
