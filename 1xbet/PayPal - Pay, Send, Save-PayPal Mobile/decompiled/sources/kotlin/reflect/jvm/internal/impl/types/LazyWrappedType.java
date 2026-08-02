package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class LazyWrappedType extends kotlin.reflect.jvm.internal.impl.types.WrappedType {
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<kotlin.reflect.jvm.internal.impl.types.KotlinType> Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public LazyWrappedType(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRanges = storageManager;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.Camera2StreamConfigurationMap = storageManager.createLazyValue(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    protected final kotlin.reflect.jvm.internal.impl.types.KotlinType getDelegate() {
        return this.Camera2StreamConfigurationMap.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    public final boolean isComputed() {
        return this.Camera2StreamConfigurationMap.isComputed();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.LazyWrappedType refine(final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return new kotlin.reflect.jvm.internal.impl.types.LazyWrappedType(this.getHighSpeedVideoFpsRanges, new kotlin.jvm.functions.Function0(kotlinTypeRefiner, this) { // from class: kotlin.reflect.jvm.internal.impl.types.LazyWrappedType$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.types.LazyWrappedType Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.types.KotlinType refineType;
                refineType = this.getHighResolutionOutputSizeshNQ4ISI.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.invoke());
                return refineType;
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = kotlinTypeRefiner;
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }
}
