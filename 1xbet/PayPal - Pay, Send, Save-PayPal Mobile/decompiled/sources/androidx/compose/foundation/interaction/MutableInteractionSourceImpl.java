package androidx.compose.foundation.interaction;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/foundation/interaction/MutableInteractionSourceImpl;", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "<init>", "()V", "Landroidx/compose/foundation/interaction/Interaction;", "p0", "", "emit", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryEmit", "(Landroidx/compose/foundation/interaction/Interaction;)Z", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoFpsRanges", "()Lkotlinx/coroutines/flow/MutableSharedFlow;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MutableInteractionSourceImpl implements androidx.compose.foundation.interaction.MutableInteractionSource {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<androidx.compose.foundation.interaction.Interaction> getHighSpeedVideoFpsRanges = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 16, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, 1, null);

    @Override // androidx.compose.foundation.interaction.InteractionSource
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final kotlinx.coroutines.flow.MutableSharedFlow<androidx.compose.foundation.interaction.Interaction> getInteractions() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final java.lang.Object emit(androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object emit = getInteractions().emit(interaction, continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final boolean tryEmit(androidx.compose.foundation.interaction.Interaction p0) {
        return getInteractions().tryEmit(p0);
    }
}
