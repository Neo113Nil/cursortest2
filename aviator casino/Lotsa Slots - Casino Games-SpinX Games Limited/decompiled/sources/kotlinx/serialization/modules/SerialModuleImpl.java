package kotlinx.serialization.modules;

/* compiled from: SerializersModule.kt */
@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001Bî\u0001\u0012\u0016\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012*\u0010\u0006\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u0003\u0012.\u0010\b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\n0\tj\u0006\u0012\u0002\b\u0003`\u000b0\u0003\u0012&\u0010\f\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u0003\u0012A\u0010\u000e\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00120\tj\u0006\u0012\u0002\b\u0003`\u00130\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u001b\u0018\u00010\n\"\b\b\u0000\u0010\u001b*\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u001b0\u00042\u0006\u0010\u001e\u001a\u0002H\u001bH\u0016¢\u0006\u0002\u0010\u001fJ4\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u001b\u0018\u00010\u0012\"\b\b\u0000\u0010\u001b*\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u001b0\u00042\b\u0010 \u001a\u0004\u0018\u00010\rH\u0016J:\u0010!\u001a\n\u0012\u0004\u0012\u0002H\u001b\u0018\u00010\u0007\"\b\b\u0000\u0010\u001b*\u00020\u001c2\f\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u00042\u0010\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070$H\u0016J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016R\u001e\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R4\u0010\u0006\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R6\u0010\b\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\n0\tj\u0006\u0012\u0002\b\u0003`\u000b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\f\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RI\u0010\u000e\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00120\tj\u0006\u0012\u0002\b\u0003`\u00130\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, d2 = {"Lkotlinx/serialization/modules/SerialModuleImpl;", "Lkotlinx/serialization/modules/SerializersModule;", "class2ContextualFactory", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/modules/ContextualProvider;", "polyBase2Serializers", "Lkotlinx/serialization/KSerializer;", "polyBase2DefaultSerializerProvider", "Lkotlin/Function1;", "Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2NamedSerializers", "", "polyBase2DefaultDeserializerProvider", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "hasInterfaceContextualSerializers", "", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V", "getHasInterfaceContextualSerializers$kotlinx_serialization_core", "()Z", "getPolymorphic", "T", "", "baseClass", "value", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "serializedClassName", "getContextual", "kClass", "typeArgumentsSerializers", "", "dumpTo", "", "collector", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SerialModuleImpl extends kotlinx.serialization.modules.SerializersModule {
    private final java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.modules.ContextualProvider> class2ContextualFactory;
    private final boolean hasInterfaceContextualSerializers;
    private final java.util.Map<kotlin.reflect.KClass<?>, kotlin.jvm.functions.Function1<java.lang.String, kotlinx.serialization.DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider;
    private final java.util.Map<kotlin.reflect.KClass<?>, kotlin.jvm.functions.Function1<?, kotlinx.serialization.SerializationStrategy<?>>> polyBase2DefaultSerializerProvider;
    private final java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, kotlinx.serialization.KSerializer<?>>> polyBase2NamedSerializers;
    public final java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>>> polyBase2Serializers;

    @Override // kotlinx.serialization.modules.SerializersModule
    /* renamed from: getHasInterfaceContextualSerializers$kotlinx_serialization_core, reason: from getter */
    public boolean getHasInterfaceContextualSerializers() {
        return this.hasInterfaceContextualSerializers;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SerialModuleImpl(java.util.Map<kotlin.reflect.KClass<?>, ? extends kotlinx.serialization.modules.ContextualProvider> class2ContextualFactory, java.util.Map<kotlin.reflect.KClass<?>, ? extends java.util.Map<kotlin.reflect.KClass<?>, ? extends kotlinx.serialization.KSerializer<?>>> polyBase2Serializers, java.util.Map<kotlin.reflect.KClass<?>, ? extends kotlin.jvm.functions.Function1<?, ? extends kotlinx.serialization.SerializationStrategy<?>>> polyBase2DefaultSerializerProvider, java.util.Map<kotlin.reflect.KClass<?>, ? extends java.util.Map<java.lang.String, ? extends kotlinx.serialization.KSerializer<?>>> polyBase2NamedSerializers, java.util.Map<kotlin.reflect.KClass<?>, ? extends kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider, boolean z) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.class2ContextualFactory = class2ContextualFactory;
        this.polyBase2Serializers = polyBase2Serializers;
        this.polyBase2DefaultSerializerProvider = polyBase2DefaultSerializerProvider;
        this.polyBase2NamedSerializers = polyBase2NamedSerializers;
        this.polyBase2DefaultDeserializerProvider = polyBase2DefaultDeserializerProvider;
        this.hasInterfaceContextualSerializers = z;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> kotlinx.serialization.SerializationStrategy<T> getPolymorphic(kotlin.reflect.KClass<? super T> baseClass, T value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        if (!baseClass.isInstance(value)) {
            return null;
        }
        java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>> map = this.polyBase2Serializers.get(baseClass);
        kotlinx.serialization.KSerializer<?> kSerializer = map != null ? map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(value.getClass())) : null;
        kotlinx.serialization.KSerializer<?> kSerializer2 = kSerializer instanceof kotlinx.serialization.SerializationStrategy ? kSerializer : null;
        if (kSerializer2 != null) {
            return kSerializer2;
        }
        kotlin.jvm.functions.Function1<?, kotlinx.serialization.SerializationStrategy<?>> function1 = this.polyBase2DefaultSerializerProvider.get(baseClass);
        kotlin.jvm.functions.Function1<?, kotlinx.serialization.SerializationStrategy<?>> function12 = kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function12 != null) {
            return (kotlinx.serialization.SerializationStrategy) function12.invoke(value);
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> kotlinx.serialization.DeserializationStrategy<T> getPolymorphic(kotlin.reflect.KClass<? super T> baseClass, java.lang.String serializedClassName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        java.util.Map<java.lang.String, kotlinx.serialization.KSerializer<?>> map = this.polyBase2NamedSerializers.get(baseClass);
        kotlinx.serialization.KSerializer<?> kSerializer = map != null ? map.get(serializedClassName) : null;
        if (!(kSerializer instanceof kotlinx.serialization.KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        kotlin.jvm.functions.Function1<java.lang.String, kotlinx.serialization.DeserializationStrategy<?>> function1 = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        kotlin.jvm.functions.Function1<java.lang.String, kotlinx.serialization.DeserializationStrategy<?>> function12 = kotlin.jvm.internal.TypeIntrinsics.isFunctionOfArity(function1, 1) ? function1 : null;
        if (function12 != null) {
            return (kotlinx.serialization.DeserializationStrategy) function12.invoke(serializedClassName);
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public <T> kotlinx.serialization.KSerializer<T> getContextual(kotlin.reflect.KClass<T> kClass, java.util.List<? extends kotlinx.serialization.KSerializer<?>> typeArgumentsSerializers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        kotlinx.serialization.modules.ContextualProvider contextualProvider = this.class2ContextualFactory.get(kClass);
        kotlinx.serialization.KSerializer<?> invoke = contextualProvider != null ? contextualProvider.invoke(typeArgumentsSerializers) : null;
        if (invoke instanceof kotlinx.serialization.KSerializer) {
            return (kotlinx.serialization.KSerializer<T>) invoke;
        }
        return null;
    }

    @Override // kotlinx.serialization.modules.SerializersModule
    public void dumpTo(kotlinx.serialization.modules.SerializersModuleCollector collector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collector, "collector");
        for (java.util.Map.Entry<kotlin.reflect.KClass<?>, kotlinx.serialization.modules.ContextualProvider> entry : this.class2ContextualFactory.entrySet()) {
            kotlin.reflect.KClass<?> key = entry.getKey();
            kotlinx.serialization.modules.ContextualProvider value = entry.getValue();
            if (value instanceof kotlinx.serialization.modules.ContextualProvider.Argless) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                kotlinx.serialization.KSerializer<?> serializer = ((kotlinx.serialization.modules.ContextualProvider.Argless) value).getSerializer();
                kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.contextual(key, serializer);
            } else {
                if (!(value instanceof kotlinx.serialization.modules.ContextualProvider.WithTypeArguments)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                collector.contextual(key, ((kotlinx.serialization.modules.ContextualProvider.WithTypeArguments) value).getProvider());
            }
        }
        for (java.util.Map.Entry<kotlin.reflect.KClass<?>, java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>>> entry2 : this.polyBase2Serializers.entrySet()) {
            kotlin.reflect.KClass<?> key2 = entry2.getKey();
            for (java.util.Map.Entry<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>> entry3 : entry2.getValue().entrySet()) {
                kotlin.reflect.KClass<?> key3 = entry3.getKey();
                kotlinx.serialization.KSerializer<?> value2 = entry3.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(key2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                kotlin.jvm.internal.Intrinsics.checkNotNull(key3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                kotlin.jvm.internal.Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.polymorphic(key2, key3, value2);
            }
        }
        for (java.util.Map.Entry<kotlin.reflect.KClass<?>, kotlin.jvm.functions.Function1<?, kotlinx.serialization.SerializationStrategy<?>>> entry4 : this.polyBase2DefaultSerializerProvider.entrySet()) {
            kotlin.reflect.KClass<?> key4 = entry4.getKey();
            kotlin.jvm.functions.Function1<?, kotlinx.serialization.SerializationStrategy<?>> value3 = entry4.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(key4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            kotlin.jvm.internal.Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            collector.polymorphicDefaultSerializer(key4, (kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(value3, 1));
        }
        for (java.util.Map.Entry<kotlin.reflect.KClass<?>, kotlin.jvm.functions.Function1<java.lang.String, kotlinx.serialization.DeserializationStrategy<?>>> entry5 : this.polyBase2DefaultDeserializerProvider.entrySet()) {
            kotlin.reflect.KClass<?> key5 = entry5.getKey();
            kotlin.jvm.functions.Function1<java.lang.String, kotlinx.serialization.DeserializationStrategy<?>> value4 = entry5.getValue();
            kotlin.jvm.internal.Intrinsics.checkNotNull(key5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            kotlin.jvm.internal.Intrinsics.checkNotNull(value4, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            collector.polymorphicDefaultDeserializer(key5, (kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(value4, 1));
        }
    }
}
