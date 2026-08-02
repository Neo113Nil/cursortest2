package io.ktor.utils.io.pool;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aA\u0010\u0006\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aA\u0010\b\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lio/ktor/utils/io/pool/ObjectPool;", "Lkotlin/Function1;", "block", "useBorrowed", "(Lio/ktor/utils/io/pool/ObjectPool;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "useInstance"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PoolKt {
    public static final <T, R> R useInstance(io.ktor.utils.io.pool.ObjectPool<T> objectPool, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectPool, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        T borrow = objectPool.borrow();
        try {
            return function1.invoke(borrow);
        } finally {
            objectPool.recycle(borrow);
        }
    }

    @kotlin.Deprecated(message = "Use useInstance instead", replaceWith = @kotlin.ReplaceWith(expression = "useInstance(block)", imports = {}))
    public static final <T, R> R useBorrowed(io.ktor.utils.io.pool.ObjectPool<T> objectPool, kotlin.jvm.functions.Function1<? super T, ? extends R> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objectPool, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        T borrow = objectPool.borrow();
        try {
            return function1.invoke(borrow);
        } finally {
            objectPool.recycle(borrow);
        }
    }
}
