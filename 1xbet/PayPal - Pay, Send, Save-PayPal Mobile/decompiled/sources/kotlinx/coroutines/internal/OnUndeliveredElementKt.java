package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f**\b\u0000\u0010\r\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001"}, d2 = {"E", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "callUndeliveredElementCatchingException", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "Lkotlin/coroutines/CoroutineContext;", "context", "callUndeliveredElement", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "OnUndeliveredElement"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnUndeliveredElementKt {
    public static /* synthetic */ kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException$default(kotlin.jvm.functions.Function1 function1, java.lang.Object obj, kotlinx.coroutines.internal.UndeliveredElementException undeliveredElementException, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            undeliveredElementException = null;
        }
        return callUndeliveredElementCatchingException(function1, obj, undeliveredElementException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, E e, kotlinx.coroutines.internal.UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(e);
            return undeliveredElementException;
        } catch (java.lang.Throwable th) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th) {
                kotlin.ExceptionsKt.addSuppressed(undeliveredElementException, th);
                return undeliveredElementException;
            }
            return new kotlinx.coroutines.internal.UndeliveredElementException("Exception in undelivered element handler for ".concat(java.lang.String.valueOf(e)), th);
        }
    }

    public static final <E> void callUndeliveredElement(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, E e, kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException = callUndeliveredElementCatchingException(function1, e, null);
        if (callUndeliveredElementCatchingException != null) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(coroutineContext, callUndeliveredElementCatchingException);
        }
    }
}
