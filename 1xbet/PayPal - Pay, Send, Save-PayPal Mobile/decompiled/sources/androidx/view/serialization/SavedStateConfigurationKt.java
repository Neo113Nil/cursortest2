package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/savedstate/serialization/SavedStateConfiguration;", "from", "Lkotlin/Function1;", "Landroidx/savedstate/serialization/SavedStateConfiguration$Builder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "SavedStateConfiguration", "(Landroidx/savedstate/serialization/SavedStateConfiguration;Lkotlin/jvm/functions/Function1;)Landroidx/savedstate/serialization/SavedStateConfiguration;", "Lkotlinx/serialization/modules/SerializersModule;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/modules/SerializersModule;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavedStateConfigurationKt {
    private static final kotlinx.serialization.modules.SerializersModule getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ androidx.view.serialization.SavedStateConfiguration SavedStateConfiguration$default(androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            savedStateConfiguration = androidx.view.serialization.SavedStateConfiguration.DEFAULT;
        }
        return SavedStateConfiguration(savedStateConfiguration, function1);
    }

    public static final androidx.view.serialization.SavedStateConfiguration SavedStateConfiguration(androidx.view.serialization.SavedStateConfiguration savedStateConfiguration, kotlin.jvm.functions.Function1<? super androidx.savedstate.serialization.SavedStateConfiguration.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savedStateConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.savedstate.serialization.SavedStateConfiguration.Builder builder = new androidx.savedstate.serialization.SavedStateConfiguration.Builder(savedStateConfiguration);
        function1.invoke(builder);
        return builder.build$savedstate();
    }

    static {
        kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder = new kotlinx.serialization.modules.SerializersModuleBuilder();
        serializersModuleBuilder.contextual(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.os.Bundle.class), androidx.view.serialization.serializers.SavedStateSerializer.INSTANCE);
        serializersModuleBuilder.contextual(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinx.coroutines.flow.MutableStateFlow.class), new kotlin.jvm.functions.Function1() { // from class: androidx.savedstate.serialization.SavedStateConfigurationKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.serialization.SavedStateConfigurationKt.$r8$lambda$TgtcjHF8ZjlR5tsEfiwL9mpu7RI((java.util.List) obj);
            }
        });
        getHighSpeedVideoFpsRangesFor = kotlinx.serialization.modules.SerializersModuleKt.plus(serializersModuleBuilder.build(), androidx.view.serialization.SavedStateConfiguration_androidKt.getDefaultSerializersModuleOnPlatform());
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$TgtcjHF8ZjlR5tsEfiwL9mpu7RI(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new androidx.view.serialization.serializers.MutableStateFlowSerializer((kotlinx.serialization.KSerializer) kotlin.collections.CollectionsKt.first(list));
    }

    public static final androidx.view.serialization.SavedStateConfiguration SavedStateConfiguration(kotlin.jvm.functions.Function1<? super androidx.savedstate.serialization.SavedStateConfiguration.Builder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return SavedStateConfiguration$default(null, function1, 1, null);
    }
}
