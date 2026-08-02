package arrow.atomic;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aN\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0004\b\u0007\u0010\b\u001aN\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001aN\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0004\b\r\u0010\u000e\u001aN\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aN\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u008c\u0001\u0010\r\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0012*\u00028\u0000\"\u0004\b\u0002\u0010\u0013*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\u0016\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0015\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00028\u00020\u0014H\u0086\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0002\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\r\u0010\u0017\u001a\u0086\u0001\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0012*\u00028\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\"\u0010\u0018\u001a\u001e\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0015\u0012\t\u0012\u00078\u0001¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\u00040\u0014H\u0086\bø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\u000b\u0010\u0019\">\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00022\u0006\u0010\u001b\u001a\u00028\u00008G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"V", "Ljava/util/concurrent/atomic/AtomicReference;", "Larrow/atomic/getHighResolutionOutputSizeshNQ4ISI;", "Lkotlin/Function1;", "", "action", "", "loop", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)Ljava/lang/Void;", "function", "", "tryUpdate", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)Z", "update", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)V", "getAndUpdate", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "updateAndGet", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.UNITY, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "transform", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "onUpdated", "(Ljava/util/concurrent/atomic/AtomicReference;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Z", "T", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Object;", "setValue", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AtomicKt {
    public static final <T> T getValue(java.util.concurrent.atomic.AtomicReference<T> atomicReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        return atomicReference.get();
    }

    public static final <T> void setValue(java.util.concurrent.atomic.AtomicReference<T> atomicReference, T t) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        atomicReference.set(t);
    }

    public static final <V> java.lang.Void loop(java.util.concurrent.atomic.AtomicReference<V> atomicReference, kotlin.jvm.functions.Function1<? super V, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (true) {
            function1.invoke((java.lang.Object) getValue(atomicReference));
        }
    }

    public static final <V, U extends V> boolean tryUpdate(java.util.concurrent.atomic.AtomicReference<V> atomicReference, kotlin.jvm.functions.Function1<? super V, ? extends U> function1, kotlin.jvm.functions.Function2<? super V, ? super U, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        a.d dVar = (java.lang.Object) getValue(atomicReference);
        U invoke = function1.invoke(dVar);
        boolean m = androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, dVar, invoke);
        if (m) {
            function2.invoke(dVar, invoke);
        }
        return m;
    }

    public static final <V> boolean tryUpdate(java.util.concurrent.atomic.AtomicReference<V> atomicReference, kotlin.jvm.functions.Function1<? super V, ? extends V> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        a.d dVar = (java.lang.Object) getValue(atomicReference);
        return androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, dVar, function1.invoke(dVar));
    }

    public static final <V> void update(java.util.concurrent.atomic.AtomicReference<V> atomicReference, kotlin.jvm.functions.Function1<? super V, ? extends V> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, getValue(atomicReference), function1.invoke((java.lang.Object) getValue(atomicReference)))) {
        }
    }

    public static final <V> V getAndUpdate(java.util.concurrent.atomic.AtomicReference<V> atomicReference, kotlin.jvm.functions.Function1<? super V, ? extends V> function1) {
        V v;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            v = (V) getValue(atomicReference);
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, v, function1.invoke((java.lang.Object) getValue(atomicReference))));
        return v;
    }

    public static final <V> V updateAndGet(java.util.concurrent.atomic.AtomicReference<V> atomicReference, kotlin.jvm.functions.Function1<? super V, ? extends V> function1) {
        java.lang.Object value;
        V invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        do {
            value = getValue(atomicReference);
            invoke = function1.invoke((java.lang.Object) getValue(atomicReference));
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, value, invoke));
        return invoke;
    }

    public static final <V, U extends V, R> R update(java.util.concurrent.atomic.AtomicReference<V> atomicReference, kotlin.jvm.functions.Function1<? super V, ? extends U> function1, kotlin.jvm.functions.Function2<? super V, ? super U, ? extends R> function2) {
        a.d dVar;
        U invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(atomicReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        do {
            dVar = (java.lang.Object) getValue(atomicReference);
            invoke = function1.invoke((java.lang.Object) getValue(atomicReference));
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, dVar, invoke));
        return function2.invoke(dVar, invoke);
    }
}
