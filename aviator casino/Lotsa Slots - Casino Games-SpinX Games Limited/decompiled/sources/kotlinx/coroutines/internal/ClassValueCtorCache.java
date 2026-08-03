package kotlinx.coroutines.internal;

/* compiled from: ExceptionsConstructor.kt */
@kotlin.Metadata(d1 = {"\u0000'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\bj\u0002`\n2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\fH\u0016R\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/internal/ClassValueCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "<init>", "()V", "cache", "kotlinx/coroutines/internal/ClassValueCtorCache$cache$1", "Lkotlinx/coroutines/internal/ClassValueCtorCache$cache$1;", "get", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", com.ironsource.X3.i.W, "Ljava/lang/Class;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ClassValueCtorCache extends kotlinx.coroutines.internal.CtorCache {
    public static final kotlinx.coroutines.internal.ClassValueCtorCache INSTANCE = new kotlinx.coroutines.internal.ClassValueCtorCache();
    private static final kotlinx.coroutines.internal.ClassValueCtorCache$cache$1 cache = new java.lang.ClassValue<kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable>>() { // from class: kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
        @Override // java.lang.ClassValue
        public /* bridge */ /* synthetic */ kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> computeValue(java.lang.Class cls) {
            return computeValue2((java.lang.Class<?>) cls);
        }

        @Override // java.lang.ClassValue
        /* renamed from: computeValue, reason: avoid collision after fix types in other method */
        protected kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> computeValue2(java.lang.Class<?> type) {
            kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> createConstructor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            createConstructor = kotlinx.coroutines.internal.ExceptionsConstructorKt.createConstructor(type);
            return createConstructor;
        }
    };

    private ClassValueCtorCache() {
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> get(java.lang.Class<? extends java.lang.Throwable> key) {
        return (kotlin.jvm.functions.Function1) cache.get(key);
    }
}
