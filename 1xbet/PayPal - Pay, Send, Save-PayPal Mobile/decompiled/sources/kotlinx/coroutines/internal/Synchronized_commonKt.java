package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", "synchronized", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Synchronized_commonKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m24129synchronized(java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0) {
        T invoke;
        synchronized (obj) {
            invoke = function0.invoke();
        }
        return invoke;
    }
}
