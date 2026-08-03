package kotlinx.serialization.internal;

/* compiled from: Caching.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0014J-\u0010\t\u001a\u00028\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b2\u000e\b\u0004\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Lkotlinx/serialization/internal/ClassValueReferences;", "T", "Ljava/lang/ClassValue;", "Lkotlinx/serialization/internal/MutableSoftReference;", "<init>", "()V", "computeValue", "type", "Ljava/lang/Class;", "getOrSet", com.ironsource.X3.i.W, "factory", "Lkotlin/Function0;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isStored", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ClassValueReferences<T> extends java.lang.ClassValue<kotlinx.serialization.internal.MutableSoftReference<T>> {
    @Override // java.lang.ClassValue
    public /* bridge */ /* synthetic */ java.lang.Object computeValue(java.lang.Class cls) {
        return computeValue((java.lang.Class<?>) cls);
    }

    @Override // java.lang.ClassValue
    protected kotlinx.serialization.internal.MutableSoftReference<T> computeValue(java.lang.Class<?> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "type");
        return new kotlinx.serialization.internal.MutableSoftReference<>();
    }

    public final T getOrSet(java.lang.Class<?> key, final kotlin.jvm.functions.Function0<? extends T> factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "factory");
        T t = get(key);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(t, "get(...)");
        kotlinx.serialization.internal.MutableSoftReference mutableSoftReference = (kotlinx.serialization.internal.MutableSoftReference) t;
        T t2 = mutableSoftReference.reference.get();
        return t2 != null ? t2 : (T) mutableSoftReference.getOrSetWithLock(new kotlin.jvm.functions.Function0<T>() { // from class: kotlinx.serialization.internal.ClassValueReferences$getOrSet$2
            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return factory.invoke();
            }
        });
    }

    public final boolean isStored(java.lang.Class<?> key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return ((kotlinx.serialization.internal.MutableSoftReference) get(key)).reference.get() != null;
    }
}
