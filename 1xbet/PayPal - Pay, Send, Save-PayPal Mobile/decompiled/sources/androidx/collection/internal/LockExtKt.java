package androidx.collection.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a8\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0080\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"T", "Landroidx/collection/internal/Lock;", "Lkotlin/Function0;", "block", "synchronized", "(Landroidx/collection/internal/Lock;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LockExtKt {
    /* renamed from: synchronized, reason: not valid java name */
    public static final <T> T m1093synchronized(androidx.collection.internal.Lock lock, kotlin.jvm.functions.Function0<? extends T> function0) {
        T invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lock, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        synchronized (lock) {
            invoke = function0.invoke();
        }
        return invoke;
    }
}
