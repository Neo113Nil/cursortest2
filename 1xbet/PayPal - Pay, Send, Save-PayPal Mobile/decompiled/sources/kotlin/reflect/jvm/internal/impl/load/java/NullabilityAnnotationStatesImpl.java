package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public final class NullabilityAnnotationStatesImpl<T> implements kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates<T> {
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, T> Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.name.FqName, T> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public NullabilityAnnotationStatesImpl(java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, ? extends T> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.Camera2StreamConfigurationMap = map;
        kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager lockBasedStorageManager = new kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager("Java nullability annotation states");
        this.getHighSpeedVideoFpsRanges = lockBasedStorageManager;
        kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.name.FqName, T> createMemoizedFunctionWithNullableValues = lockBasedStorageManager.createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.name.FqName) obj);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createMemoizedFunctionWithNullableValues, "");
        this.getHighResolutionOutputSizeshNQ4ISI = createMemoizedFunctionWithNullableValues;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStates
    public final T get(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(fqName);
    }

    static /* synthetic */ java.lang.Object Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.java.NullabilityAnnotationStatesImpl nullabilityAnnotationStatesImpl, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(fqName);
        return kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.findValueForMostSpecificFqname(fqName, nullabilityAnnotationStatesImpl.Camera2StreamConfigurationMap);
    }
}
