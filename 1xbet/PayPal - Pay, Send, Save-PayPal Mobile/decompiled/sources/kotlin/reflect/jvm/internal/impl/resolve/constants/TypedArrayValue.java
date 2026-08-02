package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public final class TypedArrayValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue {
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypedArrayValue(java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> list, final kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        super(list, new kotlin.jvm.functions.Function1(kotlinType) { // from class: kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = kotlinType;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        this.Camera2StreamConfigurationMap = kotlinType;
    }

    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
        return this.Camera2StreamConfigurationMap;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        return kotlinType;
    }
}
