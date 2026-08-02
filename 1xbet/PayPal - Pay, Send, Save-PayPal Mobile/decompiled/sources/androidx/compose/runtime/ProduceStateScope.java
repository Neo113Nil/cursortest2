package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/ProduceStateScope;", "T", "Landroidx/compose/runtime/MutableState;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function0;", "", "onDispose", "", "awaitDispose", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ProduceStateScope<T> extends androidx.compose.runtime.MutableState<T>, kotlinx.coroutines.CoroutineScope {
    java.lang.Object awaitDispose(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<?> continuation);
}
