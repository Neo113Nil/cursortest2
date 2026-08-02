package androidx.compose.foundation.interaction;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/interaction/InteractionSource;", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "", "emit", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "tryEmit", "(Landroidx/compose/foundation/interaction/Interaction;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MutableInteractionSource extends androidx.compose.foundation.interaction.InteractionSource {
    java.lang.Object emit(androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    boolean tryEmit(androidx.compose.foundation.interaction.Interaction interaction);
}
