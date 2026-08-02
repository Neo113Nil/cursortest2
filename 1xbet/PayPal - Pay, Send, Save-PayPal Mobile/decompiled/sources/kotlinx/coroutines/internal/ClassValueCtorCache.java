package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007j\u0002`\b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lkotlinx/coroutines/internal/ClassValueCtorCache;", "Lkotlinx/coroutines/internal/CtorCache;", "<init>", "()V", "Ljava/lang/Class;", "", "p0", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "get", "(Ljava/lang/Class;)Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/ClassValueCtorCache$cache$1;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/internal/ClassValueCtorCache$cache$1;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ClassValueCtorCache extends kotlinx.coroutines.internal.CtorCache {
    public static final kotlinx.coroutines.internal.ClassValueCtorCache INSTANCE = new kotlinx.coroutines.internal.ClassValueCtorCache();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final kotlinx.coroutines.internal.ClassValueCtorCache$cache$1 getHighSpeedVideoFpsRangesFor = new java.lang.ClassValue<kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable>>() { // from class: kotlinx.coroutines.internal.ClassValueCtorCache$cache$1
        @Override // java.lang.ClassValue
        public final /* bridge */ /* synthetic */ kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> computeValue(java.lang.Class cls) {
            return computeValue2((java.lang.Class<?>) cls);
        }

        @Override // java.lang.ClassValue
        /* renamed from: computeValue, reason: avoid collision after fix types in other method */
        protected final kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> computeValue2(java.lang.Class<?> type) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(type, "");
            return kotlinx.coroutines.internal.ExceptionsConstructorKt.access$createConstructor(type);
        }
    };

    private ClassValueCtorCache() {
    }

    @Override // kotlinx.coroutines.internal.CtorCache
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> get(java.lang.Class<? extends java.lang.Throwable> p0) {
        return (kotlin.jvm.functions.Function1) getHighSpeedVideoFpsRangesFor.get(p0);
    }
}
