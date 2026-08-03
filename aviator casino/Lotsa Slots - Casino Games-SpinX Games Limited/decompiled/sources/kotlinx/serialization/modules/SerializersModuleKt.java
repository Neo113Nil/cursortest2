package kotlinx.serialization.modules;

/* compiled from: SerializersModule.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\u0004\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005*\\\b\u0000\u0010\t\u001a\u0004\b\u0000\u0010\n\"'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u00100\u000b2'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u00100\u000b*X\b\u0000\u0010\u0011\u001a\u0004\b\u0000\u0010\n\"%\u0012\u0013\u0012\u0011H\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u00130\u000b2%\u0012\u0013\u0012\u0011H\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\n\u0018\u00010\u00130\u000b¨\u0006\u0014"}, d2 = {"EmptySerializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getEmptySerializersModule$annotations", "()V", "getEmptySerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "plus", "other", "overwriteWith", "PolymorphicDeserializerProvider", "Base", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "className", "Lkotlinx/serialization/DeserializationStrategy;", "PolymorphicSerializerProvider", "value", "Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SerializersModuleKt {
    private static final kotlinx.serialization.modules.SerializersModule EmptySerializersModule = new kotlinx.serialization.modules.SerialModuleImpl(kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), false);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Deprecated in the favour of 'EmptySerializersModule()'", replaceWith = @kotlin.ReplaceWith(expression = "EmptySerializersModule()", imports = {}))
    public static /* synthetic */ void getEmptySerializersModule$annotations() {
    }

    public static final kotlinx.serialization.modules.SerializersModule getEmptySerializersModule() {
        return EmptySerializersModule;
    }

    public static final kotlinx.serialization.modules.SerializersModule plus(kotlinx.serialization.modules.SerializersModule serializersModule, kotlinx.serialization.modules.SerializersModule other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder = new kotlinx.serialization.modules.SerializersModuleBuilder();
        serializersModuleBuilder.include(serializersModule);
        serializersModuleBuilder.include(other);
        return serializersModuleBuilder.build();
    }

    public static final kotlinx.serialization.modules.SerializersModule overwriteWith(kotlinx.serialization.modules.SerializersModule serializersModule, kotlinx.serialization.modules.SerializersModule other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        final kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder = new kotlinx.serialization.modules.SerializersModuleBuilder();
        serializersModuleBuilder.include(serializersModule);
        other.dumpTo(new kotlinx.serialization.modules.SerializersModuleCollector() { // from class: kotlinx.serialization.modules.SerializersModuleKt$overwriteWith$1$1
            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public /* synthetic */ void polymorphicDefault(kotlin.reflect.KClass kClass, kotlin.jvm.functions.Function1 function1) {
                kotlinx.serialization.modules.SerializersModuleCollector.CC.$default$polymorphicDefault(this, kClass, function1);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <T> void contextual(kotlin.reflect.KClass<T> kClass, kotlinx.serialization.KSerializer<T> serializer) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "serializer");
                kotlinx.serialization.modules.SerializersModuleBuilder.this.registerSerializer(kClass, new kotlinx.serialization.modules.ContextualProvider.Argless(serializer), true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <T> void contextual(kotlin.reflect.KClass<T> kClass, kotlin.jvm.functions.Function1<? super java.util.List<? extends kotlinx.serialization.KSerializer<?>>, ? extends kotlinx.serialization.KSerializer<?>> provider) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "kClass");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "provider");
                kotlinx.serialization.modules.SerializersModuleBuilder.this.registerSerializer(kClass, new kotlinx.serialization.modules.ContextualProvider.WithTypeArguments(provider), true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <Base, Sub extends Base> void polymorphic(kotlin.reflect.KClass<Base> baseClass, kotlin.reflect.KClass<Sub> actualClass, kotlinx.serialization.KSerializer<Sub> actualSerializer) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualClass, "actualClass");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
                kotlinx.serialization.modules.SerializersModuleBuilder.this.registerPolymorphicSerializer(baseClass, actualClass, actualSerializer, true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <Base> void polymorphicDefaultSerializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super Base, ? extends kotlinx.serialization.SerializationStrategy<? super Base>> defaultSerializerProvider) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
                kotlinx.serialization.modules.SerializersModuleBuilder.this.registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <Base> void polymorphicDefaultDeserializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
                kotlinx.serialization.modules.SerializersModuleBuilder.this.registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, true);
            }
        });
        return serializersModuleBuilder.build();
    }
}
