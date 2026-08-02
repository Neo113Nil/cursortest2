package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public abstract class TypeRegistry<K, V> {
    private final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRanges = new java.util.concurrent.ConcurrentHashMap<>();
    private final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger(0);

    public abstract int customComputeIfAbsent(java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> concurrentHashMap, java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Integer> function1);

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V, KK extends K> kotlin.reflect.jvm.internal.impl.util.NullableArrayMapAccessor<K, V, T> generateNullableAccessor(kotlin.reflect.KClass<KK> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        return new kotlin.reflect.jvm.internal.impl.util.NullableArrayMapAccessor<>(getId(kClass));
    }

    public final <T extends K> int getId(kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.lang.String qualifiedName = kClass.getQualifiedName();
        kotlin.jvm.internal.Intrinsics.checkNotNull(qualifiedName);
        return getId(qualifiedName);
    }

    public final int getId(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return customComputeIfAbsent(this.getHighSpeedVideoFpsRanges, str, new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.util.TypeRegistry$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.util.TypeRegistry getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(kotlin.reflect.jvm.internal.impl.util.TypeRegistry.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, (java.lang.String) obj));
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        });
    }

    public final java.util.Map<java.lang.String, java.lang.Integer> allValuesThreadUnsafeForRendering() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.Collection<java.lang.Integer> getIndices() {
        java.util.Collection<java.lang.Integer> values = this.getHighSpeedVideoFpsRanges.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "");
        return values;
    }

    static /* synthetic */ int getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.util.TypeRegistry typeRegistry, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return typeRegistry.getHighResolutionOutputSizeshNQ4ISI.getAndIncrement();
    }
}
