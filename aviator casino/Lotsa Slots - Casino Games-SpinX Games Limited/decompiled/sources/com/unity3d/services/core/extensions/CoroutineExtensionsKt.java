package com.unity3d.services.core.extensions;

/* compiled from: CoroutineExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u00022\u001e\b\u0004\u0010\u000e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a.\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a.\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0016H\u0086\bø\u0001\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0017\"5\u0010\u0000\u001a&\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001j\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"deferreds", "Ljava/util/LinkedHashMap;", "", "Lkotlinx/coroutines/Deferred;", "Lkotlin/collections/LinkedHashMap;", "getDeferreds", "()Ljava/util/LinkedHashMap;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getMutex", "()Lkotlinx/coroutines/sync/Mutex;", "memoize", "T", com.ironsource.X3.i.W, "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runReturnSuspendCatching", "Lkotlin/Result;", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "runSuspendCatching", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutineExtensionsKt {
    private static final java.util.LinkedHashMap<java.lang.Object, kotlinx.coroutines.Deferred<?>> deferreds = new java.util.LinkedHashMap<java.lang.Object, kotlinx.coroutines.Deferred<?>>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(java.lang.Object obj) {
            if (obj instanceof kotlinx.coroutines.Deferred) {
                return containsValue((kotlinx.coroutines.Deferred<?>) obj);
            }
            return false;
        }

        public /* bridge */ boolean containsValue(kotlinx.coroutines.Deferred<?> deferred) {
            return super.containsValue((java.lang.Object) deferred);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.util.Set<java.util.Map.Entry<java.lang.Object, kotlinx.coroutines.Deferred<?>>> entrySet() {
            return getEntries();
        }

        public /* bridge */ java.util.Set<java.util.Map.Entry<java.lang.Object, kotlinx.coroutines.Deferred<?>>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ java.util.Set<java.lang.Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ java.util.Collection<kotlinx.coroutines.Deferred<?>> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.util.Set<java.lang.Object> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(java.lang.Object obj, java.lang.Object obj2) {
            if (obj != null && (obj2 instanceof kotlinx.coroutines.Deferred)) {
                return remove(obj, (kotlinx.coroutines.Deferred<?>) obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(java.lang.Object obj, kotlinx.coroutines.Deferred<?> deferred) {
            return super.remove(obj, (java.lang.Object) deferred);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ java.util.Collection<kotlinx.coroutines.Deferred<?>> values() {
            return getValues();
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(java.util.Map.Entry<java.lang.Object, kotlinx.coroutines.Deferred<?>> eldest) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eldest, "eldest");
            return size() > 100;
        }
    };
    private static final kotlinx.coroutines.sync.Mutex mutex = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);

    public static final <R> java.lang.Object runSuspendCatching(kotlin.jvm.functions.Function0<? extends R> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(block.invoke());
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    public static final java.util.LinkedHashMap<java.lang.Object, kotlinx.coroutines.Deferred<?>> getDeferreds() {
        return deferreds;
    }

    public static final kotlinx.coroutines.sync.Mutex getMutex() {
        return mutex;
    }

    public static final <T> java.lang.Object memoize(java.lang.Object obj, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2(obj, function1, null), continuation);
    }

    private static final <T> java.lang.Object memoize$$forInline(java.lang.Object obj, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2 coroutineExtensionsKt$memoize$2 = new com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2(obj, function1, null);
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(coroutineExtensionsKt$memoize$2, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return coroutineScope;
    }

    public static final <R> java.lang.Object runReturnSuspendCatching(kotlin.jvm.functions.Function0<? extends R> block) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "block");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(block.invoke());
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10805isSuccessimpl(m10798constructorimpl)) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(m10798constructorimpl);
        }
        java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl == null) {
            return m10798constructorimpl;
        }
        kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
        return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(m10801exceptionOrNullimpl));
    }
}
