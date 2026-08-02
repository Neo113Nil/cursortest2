package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JN\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2%\u0010\u000e\u001a!\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b¢\u0006\u0002\b\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u0017\u001a\u00020\u000f\"\b\b\u0000\u0010\u0012*\u00020\u0006\"\b\b\u0001\u0010\u0013*\u00028\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\u001b\u001a\u00020\u000f\"\b\b\u0000\u0010\u0012*\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u001f\u0010\u001a\u001a\u001b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\r\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00190\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0011JJ\u0010\u001f\u001a\u00020\u000f\"\b\b\u0000\u0010\u0012*\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\b2!\u0010\u001e\u001a\u001d\u0012\u000b\u0012\t\u0018\u00010\u001c¢\u0006\u0002\b\r\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001d0\nH\u0016¢\u0006\u0004\b\u001f\u0010\u0011R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\""}, d2 = {"Lkotlinx/serialization/json/internal/JsonSerializersModuleValidator;", "Lkotlinx/serialization/modules/SerializersModuleCollector;", "Lkotlinx/serialization/json/JsonConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "<init>", "(Lkotlinx/serialization/json/JsonConfiguration;)V", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlin/Function1;", "", "Lkotlinx/serialization/KSerializer;", "Lkotlin/ParameterName;", "provider", "", "contextual", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphic", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefaultDeserializer", "", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JsonSerializersModuleValidator implements kotlinx.serialization.modules.SerializersModuleCollector {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighResolutionOutputSizeshNQ4ISI;

    public JsonSerializersModuleValidator(kotlinx.serialization.json.JsonConfiguration jsonConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonConfiguration, "");
        this.getHighResolutionOutputSizeshNQ4ISI = jsonConfiguration.getUseArrayPolymorphism();
        this.getHighSpeedVideoFpsRanges = jsonConfiguration.getClassDiscriminatorMode() != kotlinx.serialization.json.ClassDiscriminatorMode.NONE;
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final /* bridge */ <T> void contextual(kotlin.reflect.KClass<T> kClass, kotlinx.serialization.KSerializer<T> kSerializer) {
        super.contextual(kClass, kSerializer);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @kotlin.ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    public final /* bridge */ <Base> void polymorphicDefault(kotlin.reflect.KClass<Base> kClass, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<? extends Base>> function1) {
        super.polymorphicDefault(kClass, function1);
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final <Base, Sub extends Base> void polymorphic(kotlin.reflect.KClass<Base> baseClass, kotlin.reflect.KClass<Sub> actualClass, kotlinx.serialization.KSerializer<Sub> actualSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualSerializer, "");
        kotlinx.serialization.descriptors.SerialKind kind = actualSerializer.getDescriptor().getKind();
        if ((kind instanceof kotlinx.serialization.descriptors.PolymorphicKind) || kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL.INSTANCE)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Serializer for ");
            sb.append(actualClass.getSimpleName());
            sb.append(" can't be registered as a subclass for polymorphic serialization because its kind ");
            sb.append(kind);
            sb.append(" is not concrete. To work with multiple hierarchies, register it as a base class.");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI || !this.getHighSpeedVideoFpsRanges) {
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.LIST.INSTANCE) || kotlin.jvm.internal.Intrinsics.areEqual(kind, kotlinx.serialization.descriptors.StructureKind.MAP.INSTANCE) || (kind instanceof kotlinx.serialization.descriptors.PrimitiveKind) || (kind instanceof kotlinx.serialization.descriptors.SerialKind.ENUM)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Serializer for ");
            sb2.append(actualClass.getSimpleName());
            sb2.append(" of kind ");
            sb2.append(kind);
            sb2.append(" cannot be serialized polymorphically with class discriminator.");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final <Base> void polymorphicDefaultSerializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super Base, ? extends kotlinx.serialization.SerializationStrategy<? super Base>> defaultSerializerProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultSerializerProvider, "");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final <Base> void polymorphicDefaultDeserializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "");
    }

    @Override // kotlinx.serialization.modules.SerializersModuleCollector
    public final <T> void contextual(kotlin.reflect.KClass<T> kClass, kotlin.jvm.functions.Function1<? super java.util.List<? extends kotlinx.serialization.KSerializer<?>>, ? extends kotlinx.serialization.KSerializer<?>> provider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
    }
}
