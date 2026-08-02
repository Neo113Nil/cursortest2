package androidx.view.serialization;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "getDefaultSerializersModuleOnPlatform", "()Lkotlinx/serialization/modules/SerializersModule;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SavedStateConfiguration_androidKt {
    public static final kotlinx.serialization.modules.SerializersModule getDefaultSerializersModuleOnPlatform() {
        kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder = new kotlinx.serialization.modules.SerializersModuleBuilder();
        serializersModuleBuilder.contextual(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.util.Size.class), androidx.view.serialization.serializers.SizeSerializer.INSTANCE);
        serializersModuleBuilder.contextual(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.util.SizeF.class), androidx.view.serialization.serializers.SizeFSerializer.INSTANCE);
        serializersModuleBuilder.contextual(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.util.SparseArray.class), new kotlin.jvm.functions.Function1() { // from class: androidx.savedstate.serialization.SavedStateConfiguration_androidKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.serialization.SavedStateConfiguration_androidKt.$r8$lambda$F2Bu_msLjIdEkxACHw9ogO1pgbw((java.util.List) obj);
            }
        });
        return serializersModuleBuilder.build();
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$F2Bu_msLjIdEkxACHw9ogO1pgbw(java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new androidx.view.serialization.serializers.SparseArraySerializer((kotlinx.serialization.KSerializer) kotlin.collections.CollectionsKt.first(list));
    }
}
