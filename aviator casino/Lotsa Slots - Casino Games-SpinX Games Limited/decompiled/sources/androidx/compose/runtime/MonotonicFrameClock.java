package androidx.compose.runtime;

/* compiled from: MonotonicFrameClock.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ7\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00070\tH¦@¢\u0006\u0002\u0010\u000eR\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/CoroutineContext$Element;", com.ironsource.X3.i.W, "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Key", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface MonotonicFrameClock extends kotlin.coroutines.CoroutineContext.Element {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final androidx.compose.runtime.MonotonicFrameClock.Companion INSTANCE = androidx.compose.runtime.MonotonicFrameClock.Companion.$$INSTANCE;

    @Override // kotlin.coroutines.CoroutineContext.Element
    kotlin.coroutines.CoroutineContext.Key<?> getKey();

    <R> java.lang.Object withFrameNanos(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation);

    /* compiled from: MonotonicFrameClock.kt */
    /* renamed from: androidx.compose.runtime.MonotonicFrameClock$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            androidx.compose.runtime.MonotonicFrameClock.Companion companion = androidx.compose.runtime.MonotonicFrameClock.INSTANCE;
        }

        public static kotlin.coroutines.CoroutineContext.Key $default$getKey(androidx.compose.runtime.MonotonicFrameClock _this) {
            return androidx.compose.runtime.MonotonicFrameClock.INSTANCE;
        }
    }

    /* compiled from: MonotonicFrameClock.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <R> R fold(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
            return (R) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(monotonicFrameClock, r, function2);
        }

        public static <E extends kotlin.coroutines.CoroutineContext.Element> E get(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.CoroutineContext.Key<E> key) {
            return (E) kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(monotonicFrameClock, key);
        }

        public static kotlin.coroutines.CoroutineContext minusKey(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.CoroutineContext.Key<?> key) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(monotonicFrameClock, key);
        }

        public static kotlin.coroutines.CoroutineContext plus(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock, kotlin.coroutines.CoroutineContext coroutineContext) {
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(monotonicFrameClock, coroutineContext);
        }

        @java.lang.Deprecated
        public static kotlin.coroutines.CoroutineContext.Key<?> getKey(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock) {
            return androidx.compose.runtime.MonotonicFrameClock.CC.$default$getKey(monotonicFrameClock);
        }
    }

    /* compiled from: MonotonicFrameClock.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/MonotonicFrameClock;", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.MonotonicFrameClock$Key, reason: from kotlin metadata */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<androidx.compose.runtime.MonotonicFrameClock> {
        static final /* synthetic */ androidx.compose.runtime.MonotonicFrameClock.Companion $$INSTANCE = new androidx.compose.runtime.MonotonicFrameClock.Companion();

        private Companion() {
        }
    }
}
