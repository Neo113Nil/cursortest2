package kotlinx.coroutines.selects;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0001\u0014"}, d2 = {"Lkotlinx/coroutines/selects/SelectInstance;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "", "clauseObject", "result", "", "trySelect", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/DisposableHandle;", "disposableHandle", "", "disposeOnCompletion", "(Lkotlinx/coroutines/DisposableHandle;)V", "internalResult", "selectInRegistrationPhase", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/selects/SelectInstanceInternal;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SelectInstance<R> {
    void disposeOnCompletion(kotlinx.coroutines.DisposableHandle disposableHandle);

    kotlin.coroutines.CoroutineContext getContext();

    void selectInRegistrationPhase(java.lang.Object internalResult);

    boolean trySelect(java.lang.Object clauseObject, java.lang.Object result);
}
