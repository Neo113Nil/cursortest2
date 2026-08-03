package kotlinx.serialization.modules;

/* compiled from: SerializersModuleBuilders.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0001¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0018\u001a\u00020\u0019\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001a0\tH\u0016JQ\u0010\u0018\u001a\u00020\u0019\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00062/\u0010\u001e\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u001f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b( \u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u000bH\u0016JF\u0010!\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b\"\b\b\u0001\u0010#*\u0002H\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H#0\u00062\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H#0\tH\u0016JK\u0010'\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062)\u0010(\u001a%\u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b()\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\"\u0018\u00010\f0\u000bH\u0016JM\u0010*\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062+\u0010+\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\"\u0018\u00010\u00140\u000bH\u0016J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.J2\u0010/\u001a\u00020\u0019\"\b\b\u0000\u0010\u001a*\u00020\u001b2\f\u00100\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00062\u0006\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u00101\u001a\u00020\u0017H\u0001JS\u00102\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062)\u0010(\u001a%\u0012\u0013\u0012\u0011H\"¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b()\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\"\u0018\u00010\f0\u000b2\u0006\u00101\u001a\u00020\u0017H\u0001JU\u00103\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062+\u0010+\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\"\u0018\u00010\u00140\u000b2\u0006\u00101\u001a\u00020\u0017H\u0001JP\u00104\u001a\u00020\u0019\"\b\b\u0000\u0010\"*\u00020\u001b\"\b\b\u0001\u0010#*\u0002H\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\"0\u00062\f\u00105\u001a\b\u0012\u0004\u0012\u0002H#0\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u0002H#0\t2\b\b\u0002\u00101\u001a\u00020\u0017H\u0001J\b\u00107\u001a\u00020.H\u0001R\u001e\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\b\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\n\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u001c\u0012\u001a\u0012\u0002\b\u0003\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u000bj\u0006\u0012\u0002\b\u0003`\r0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u000e\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000RI\u0010\u0010\u001a=\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012/\u0012-\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00140\u000bj\u0006\u0012\u0002\b\u0003`\u00150\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lkotlinx/serialization/modules/SerializersModuleBuilder;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "<init>", "()V", "class2ContextualProvider", "", "Lkotlin/reflect/KClass;", "Lkotlinx/serialization/modules/ContextualProvider;", "polyBase2Serializers", "Lkotlinx/serialization/KSerializer;", "polyBase2DefaultSerializerProvider", "Lkotlin/Function1;", "Lkotlinx/serialization/SerializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicSerializerProvider;", "polyBase2NamedSerializers", "", "polyBase2DefaultDeserializerProvider", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "Lkotlinx/serialization/modules/PolymorphicDeserializerProvider;", "hasInterfaceContextualSerializers", "", "contextual", "", "T", "", "kClass", "serializer", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "", "typeArgumentsSerializers", "polymorphic", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphicDefaultSerializer", "defaultSerializerProvider", "value", "polymorphicDefaultDeserializer", "defaultDeserializerProvider", "include", "module", "Lkotlinx/serialization/modules/SerializersModule;", "registerSerializer", "forClass", "allowOverwrite", "registerDefaultPolymorphicSerializer", "registerDefaultPolymorphicDeserializer", "registerPolymorphicSerializer", "concreteClass", "concreteSerializer", "build", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SerializersModuleBuilder implements kotlinx.serialization.modules.SerializersModuleCollector {
    private boolean hasInterfaceContextualSerializers;
    private final java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.modules.ContextualProvider> class2ContextualProvider = new java.util.HashMap();
    private final java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>>> polyBase2Serializers = new java.util.HashMap();
    private final java.util.Map<kotlin.reflect.KClass<?>, kotlin.jvm.functions.Function1<?, kotlinx.serialization.SerializationStrategy<?>>> polyBase2DefaultSerializerProvider = new java.util.HashMap();
    private final java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, kotlinx.serialization.KSerializer<?>>> polyBase2NamedSerializers = new java.util.HashMap();
    private final java.util.Map<kotlin.reflect.KClass<?>, kotlin.jvm.functions.Function1<java.lang.String, kotlinx.serialization.DeserializationStrategy<?>>> polyBase2DefaultDeserializerProvider = new java.util.HashMap();

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public /* synthetic */ void polymorphicDefault(kotlin.reflect.KClass kClass, kotlin.jvm.functions.Function1 function1) {
        kotlinx.serialization.modules.SerializersModuleCollector.CC.$default$polymorphicDefault(this, kClass, function1);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(kotlin.reflect.KClass<T> kClass, kotlinx.serialization.KSerializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
        registerSerializer$default(this, kClass, new kotlinx.serialization.modules.ContextualProvider.Argless(serializer), false, 4, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(kotlin.reflect.KClass<T> kClass, kotlin.jvm.functions.Function1<? super java.util.List<? extends kotlinx.serialization.KSerializer<?>>, ? extends kotlinx.serialization.KSerializer<?>> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
        registerSerializer$default(this, kClass, new kotlinx.serialization.modules.ContextualProvider.WithTypeArguments(provider), false, 4, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void polymorphic(kotlin.reflect.KClass<Base> baseClass, kotlin.reflect.KClass<Sub> actualClass, kotlinx.serialization.KSerializer<Sub> actualSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        registerPolymorphicSerializer$default(this, baseClass, actualClass, actualSerializer, false, 8, null);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultSerializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super Base, ? extends kotlinx.serialization.SerializationStrategy<? super Base>> defaultSerializerProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, false);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultDeserializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, false);
    }

    public final void include(kotlinx.serialization.modules.SerializersModule module) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(module, "module");
        module.dumpTo(this);
    }

    public static /* synthetic */ void registerSerializer$default(kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder, kotlin.reflect.KClass kClass, kotlinx.serialization.modules.ContextualProvider contextualProvider, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        serializersModuleBuilder.registerSerializer(kClass, contextualProvider, z);
    }

    public final <T> void registerSerializer(kotlin.reflect.KClass<T> forClass, kotlinx.serialization.modules.ContextualProvider provider, boolean allowOverwrite) {
        kotlinx.serialization.modules.ContextualProvider contextualProvider;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(forClass, "forClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
        if (!allowOverwrite && (contextualProvider = this.class2ContextualProvider.get(forClass)) != null && !kotlin.jvm.internal.Intrinsics.areEqual(contextualProvider, provider)) {
            throw new kotlinx.serialization.modules.SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
        }
        this.class2ContextualProvider.put(forClass, provider);
        if (kotlinx.serialization.internal.PlatformKt.isInterface(forClass)) {
            this.hasInterfaceContextualSerializers = true;
        }
    }

    public final <Base> void registerDefaultPolymorphicSerializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super Base, ? extends kotlinx.serialization.SerializationStrategy<? super Base>> defaultSerializerProvider, boolean allowOverwrite) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        kotlin.jvm.functions.Function1<?, kotlinx.serialization.SerializationStrategy<?>> function1 = this.polyBase2DefaultSerializerProvider.get(baseClass);
        if (function1 != null && !kotlin.jvm.internal.Intrinsics.areEqual(function1, defaultSerializerProvider) && !allowOverwrite) {
            throw new java.lang.IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
        }
        this.polyBase2DefaultSerializerProvider.put(baseClass, defaultSerializerProvider);
    }

    public final <Base> void registerDefaultPolymorphicDeserializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<? extends Base>> defaultDeserializerProvider, boolean allowOverwrite) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        kotlin.jvm.functions.Function1<java.lang.String, kotlinx.serialization.DeserializationStrategy<?>> function1 = this.polyBase2DefaultDeserializerProvider.get(baseClass);
        if (function1 != null && !kotlin.jvm.internal.Intrinsics.areEqual(function1, defaultDeserializerProvider) && !allowOverwrite) {
            throw new java.lang.IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
        }
        this.polyBase2DefaultDeserializerProvider.put(baseClass, defaultDeserializerProvider);
    }

    public static /* synthetic */ void registerPolymorphicSerializer$default(kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder, kotlin.reflect.KClass kClass, kotlin.reflect.KClass kClass2, kotlinx.serialization.KSerializer kSerializer, boolean z, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        serializersModuleBuilder.registerPolymorphicSerializer(kClass, kClass2, kSerializer, z);
    }

    public final <Base, Sub extends Base> void registerPolymorphicSerializer(kotlin.reflect.KClass<Base> baseClass, kotlin.reflect.KClass<Sub> concreteClass, kotlinx.serialization.KSerializer<Sub> concreteSerializer, boolean allowOverwrite) {
        java.lang.Object obj;
        kotlin.reflect.KClass kClass;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        java.lang.String serialName = concreteSerializer.getDescriptor().getSerialName();
        java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>>> map = this.polyBase2Serializers;
        java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>> map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new java.util.HashMap<>();
            map.put(baseClass, map2);
        }
        java.util.Map<kotlin.reflect.KClass<?>, kotlinx.serialization.KSerializer<?>> map3 = map2;
        java.util.Map<kotlin.reflect.KClass<?>, java.util.Map<java.lang.String, kotlinx.serialization.KSerializer<?>>> map4 = this.polyBase2NamedSerializers;
        java.util.Map<java.lang.String, kotlinx.serialization.KSerializer<?>> map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new java.util.HashMap<>();
            map4.put(baseClass, map5);
        }
        java.util.Map<java.lang.String, kotlinx.serialization.KSerializer<?>> map6 = map5;
        kotlinx.serialization.KSerializer<?> kSerializer = map3.get(concreteClass);
        if (kSerializer != null && !kotlin.jvm.internal.Intrinsics.areEqual(kSerializer, concreteSerializer)) {
            if (allowOverwrite) {
                map6.remove(kSerializer.getDescriptor().getSerialName());
            } else {
                throw new kotlinx.serialization.modules.SerializerAlreadyRegisteredException(baseClass, concreteClass);
            }
        }
        kotlinx.serialization.KSerializer<?> kSerializer2 = map6.get(serialName);
        if (kSerializer2 != null && !kotlin.jvm.internal.Intrinsics.areEqual(kSerializer2, concreteSerializer)) {
            java.util.Iterator it = kotlin.collections.MapsKt.asSequence(map3).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((java.util.Map.Entry) obj).getValue() == kSerializer2) {
                        break;
                    }
                }
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            if (entry == null || (kClass = (kotlin.reflect.KClass) entry.getKey()) == null) {
                throw new java.lang.IllegalStateException(("Name " + serialName + " is registered in the module but no Kotlin class is associated with it.").toString());
            }
            if (allowOverwrite) {
                map3.remove(kClass);
            } else {
                throw new java.lang.IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + baseClass + "' have the same serial name '" + serialName + "': " + concreteSerializer + " for '" + concreteClass + "' and " + kSerializer2 + " for '" + kClass + '\'');
            }
        }
        map3.put(concreteClass, concreteSerializer);
        map6.put(serialName, concreteSerializer);
    }

    public final kotlinx.serialization.modules.SerializersModule build() {
        return new kotlinx.serialization.modules.SerialModuleImpl(this.class2ContextualProvider, this.polyBase2Serializers, this.polyBase2DefaultSerializerProvider, this.polyBase2NamedSerializers, this.polyBase2DefaultDeserializerProvider, this.hasInterfaceContextualSerializers);
    }
}
