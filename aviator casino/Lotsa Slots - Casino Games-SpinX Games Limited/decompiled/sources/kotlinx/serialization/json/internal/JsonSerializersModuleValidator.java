package kotlinx.serialization.json.internal;

/* compiled from: JsonSerializersModuleValidator.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005JQ\u0010\u000b\u001a\u00020\f\"\b\b\u0000\u0010\r*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\r0\u00102/\u0010\u0011\u001a+\u0012\u001d\u0012\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0012H\u0016JF\u0010\u0018\u001a\u00020\f\"\b\b\u0000\u0010\u0019*\u00020\u000e\"\b\b\u0001\u0010\u001a*\u0002H\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u00102\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0014H\u0016J\u001c\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002J\u001c\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020 2\n\u0010\u001c\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0002JK\u0010\"\u001a\u00020\f\"\b\b\u0000\u0010\u0019*\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u00102)\u0010#\u001a%\u0012\u0013\u0012\u0011H\u0019¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b($\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0019\u0018\u00010%0\u0012H\u0016JM\u0010&\u001a\u00020\f\"\b\b\u0000\u0010\u0019*\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00190\u00102+\u0010'\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b((\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0019\u0018\u00010)0\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lkotlinx/serialization/json/internal/JsonSerializersModuleValidator;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "configuration", "Lkotlinx/serialization/json/JsonConfiguration;", "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;)V", "discriminator", "", "useArrayPolymorphism", "", "isDiscriminatorRequired", "contextual", "", "T", "", "kClass", "Lkotlin/reflect/KClass;", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "name", "typeArgumentsSerializers", "polymorphic", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "checkKind", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "checkDiscriminatorCollisions", "polymorphicDefaultSerializer", "defaultSerializerProvider", "value", "Lkotlinx/serialization/SerializationStrategy;", "polymorphicDefaultDeserializer", "defaultDeserializerProvider", "className", "Lkotlinx/serialization/DeserializationStrategy;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonSerializersModuleValidator implements kotlinx.serialization.modules.SerializersModuleCollector {
    private final java.lang.String discriminator;
    private final boolean isDiscriminatorRequired;
    private final boolean useArrayPolymorphism;

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <T> void contextual(kotlin.reflect.KClass<T> kClass, kotlin.jvm.functions.Function1<? super java.util.List<? extends kotlinx.serialization.KSerializer<?>>, ? extends kotlinx.serialization.KSerializer<?>> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public /* synthetic */ void contextual(kotlin.reflect.KClass kClass, kotlinx.serialization.KSerializer kSerializer) {
        kotlinx.serialization.modules.SerializersModuleCollector.CC.$default$contextual(this, kClass, kSerializer);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public /* synthetic */ void polymorphicDefault(kotlin.reflect.KClass kClass, kotlin.jvm.functions.Function1 function1) {
        kotlinx.serialization.modules.SerializersModuleCollector.CC.$default$polymorphicDefault(this, kClass, function1);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultDeserializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base> void polymorphicDefaultSerializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super Base, ? extends kotlinx.serialization.SerializationStrategy<? super Base>> defaultSerializerProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    public JsonSerializersModuleValidator(kotlinx.serialization.json.JsonConfiguration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.discriminator = configuration.getClassDiscriminator();
        this.useArrayPolymorphism = configuration.getUseArrayPolymorphism();
        this.isDiscriminatorRequired = configuration.getClassDiscriminatorMode() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE;
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public <Base, Sub extends Base> void polymorphic(kotlin.reflect.KClass<Base> baseClass, kotlin.reflect.KClass<Sub> actualClass, kotlinx.serialization.KSerializer<Sub> actualSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = actualSerializer.getDescriptor();
        checkKind(descriptor, actualClass);
        if (this.useArrayPolymorphism || !this.isDiscriminatorRequired) {
            return;
        }
        checkDiscriminatorCollisions(descriptor, actualClass);
    }

    private final void checkKind(kotlinx.serialization.descriptors.SerialDescriptor descriptor, kotlin.reflect.KClass<?> actualClass) {
        kotlinx.serialization.descriptors.SerialKind kind = descriptor.getKind();
        if ((kind instanceof kotlinx.serialization.descriptors.PolymorphicKind) || kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL.INSTANCE)) {
            throw new java.lang.IllegalArgumentException("Serializer for " + actualClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (!this.useArrayPolymorphism && this.isDiscriminatorRequired) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.LIST.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.MAP.INSTANCE) || (kind instanceof kotlinx.serialization.descriptors.PrimitiveKind) || (kind instanceof kotlinx.serialization.descriptors.SerialKind.ENUM)) {
                throw new java.lang.IllegalArgumentException("Serializer for " + actualClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
            }
        }
    }

    private final void checkDiscriminatorCollisions(kotlinx.serialization.descriptors.SerialDescriptor descriptor, kotlin.reflect.KClass<?> actualClass) {
        int elementsCount = descriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            java.lang.String elementName = descriptor.getElementName(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(elementName, this.discriminator)) {
                throw new java.lang.IllegalArgumentException("Polymorphic serializer for " + actualClass + " has property '" + elementName + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }
}
