package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001ah\u0010\n\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022<\u0010\t\u001a8\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u0002\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\bH\u0080\b¢\u0006\u0004\b\n\u0010\u000b\"D\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0006\u0010\u0006\u001a\u00028\u00008A@AX\u0080\u000e¢\u0006\u0012\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f"}, d2 = {"T", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/internal/getHighResolutionOutputSizeshNQ4ISI;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "Lkotlin/ExtensionFunctionType;", "action", "loop", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function2;)V", "getValue", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "setValue", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V", "getValue$annotations", "(Ljava/util/concurrent/atomic/AtomicReference;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Concurrent_commonKt {
    public static /* synthetic */ void getValue$annotations(java.util.concurrent.atomic.AtomicReference atomicReference) {
    }

    public static final <T> T getValue(java.util.concurrent.atomic.AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void setValue(java.util.concurrent.atomic.AtomicReference<T> atomicReference, T t) {
        atomicReference.set(t);
    }

    public static final <T> void loop(java.util.concurrent.atomic.AtomicReference<T> atomicReference, kotlin.jvm.functions.Function2<? super java.util.concurrent.atomic.AtomicReference<T>, ? super T, kotlin.Unit> function2) {
        while (true) {
            function2.invoke(atomicReference, (java.lang.Object) getValue(atomicReference));
        }
    }
}
