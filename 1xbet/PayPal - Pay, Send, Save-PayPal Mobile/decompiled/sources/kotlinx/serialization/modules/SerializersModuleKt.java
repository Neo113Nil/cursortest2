package kotlinx.serialization.modules;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0004¢\u0006\u0004\b\u0004\u0010\u0003\" \u0010\u0005\u001a\u00020\u00008\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b*H\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u000b\"\u001d\u0012\u000b\u0012\t\u0018\u00010\r¢\u0006\u0002\b\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f0\f2\u001d\u0012\u000b\u0012\t\u0018\u00010\r¢\u0006\u0002\b\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000f0\f*D\b\u0000\u0010\u0012\u001a\u0004\b\u0000\u0010\u000b\"\u001b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\f2\u001b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u000e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00110\f"}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "other", "plus", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlinx/serialization/modules/SerializersModule;)Lkotlinx/serialization/modules/SerializersModule;", "overwriteWith", "EmptySerializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getEmptySerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "getEmptySerializersModule$annotations", "()V", "Base", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "Lkotlinx/serialization/DeserializationStrategy;", "PolymorphicDeserializerProvider", "Lkotlinx/serialization/SerializationStrategy;", "PolymorphicSerializerProvider"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SerializersModuleKt {
    private static final kotlinx.serialization.modules.SerializersModule EmptySerializersModule = new kotlinx.serialization.modules.SerialModuleImpl(kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.emptyMap(), false);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Deprecated in the favour of 'EmptySerializersModule()'", replaceWith = @kotlin.ReplaceWith(expression = "EmptySerializersModule()", imports = {}))
    public static /* synthetic */ void getEmptySerializersModule$annotations() {
    }

    public static final kotlinx.serialization.modules.SerializersModule getEmptySerializersModule() {
        return EmptySerializersModule;
    }

    public static final kotlinx.serialization.modules.SerializersModule plus(kotlinx.serialization.modules.SerializersModule serializersModule, kotlinx.serialization.modules.SerializersModule serializersModule2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule2, "");
        kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder = new kotlinx.serialization.modules.SerializersModuleBuilder();
        serializersModuleBuilder.include(serializersModule);
        serializersModuleBuilder.include(serializersModule2);
        return serializersModuleBuilder.build();
    }

    public static final kotlinx.serialization.modules.SerializersModule overwriteWith(kotlinx.serialization.modules.SerializersModule serializersModule, kotlinx.serialization.modules.SerializersModule serializersModule2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModule2, "");
        final kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder = new kotlinx.serialization.modules.SerializersModuleBuilder();
        serializersModuleBuilder.include(serializersModule);
        serializersModule2.dumpTo(new kotlinx.serialization.modules.SerializersModuleCollector() { // from class: kotlinx.serialization.modules.SerializersModuleKt$overwriteWith$1$1
            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @kotlin.ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
            public final /* bridge */ <Base> void polymorphicDefault(kotlin.reflect.KClass<Base> kClass, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<? extends Base>> function1) {
                super.polymorphicDefault(kClass, function1);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public final <T> void contextual(kotlin.reflect.KClass<T> kClass, kotlinx.serialization.KSerializer<T> serializer) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
                kotlinx.serialization.modules.SerializersModuleBuilder.this.registerSerializer(kClass, new kotlinx.serialization.modules.ContextualProvider.Argless(serializer), true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public final <T> void contextual(kotlin.reflect.KClass<T> kClass, kotlin.jvm.functions.Function1<? super java.util.List<? extends kotlinx.serialization.KSerializer<?>>, ? extends kotlinx.serialization.KSerializer<?>> provider) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
                kotlinx.serialization.modules.SerializersModuleBuilder.this.registerSerializer(kClass, new kotlinx.serialization.modules.ContextualProvider.WithTypeArguments(provider), true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public final <Base, Sub extends Base> void polymorphic(kotlin.reflect.KClass<Base> baseClass, kotlin.reflect.KClass<Sub> actualClass, kotlinx.serialization.KSerializer<Sub> actualSerializer) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualClass, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actualSerializer, "");
                kotlinx.serialization.modules.SerializersModuleBuilder.this.registerPolymorphicSerializer(baseClass, actualClass, actualSerializer, true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public final <Base> void polymorphicDefaultSerializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super Base, ? extends kotlinx.serialization.SerializationStrategy<? super Base>> defaultSerializerProvider) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultSerializerProvider, "");
                kotlinx.serialization.modules.SerializersModuleBuilder.this.registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public final <Base> void polymorphicDefaultDeserializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "");
                kotlinx.serialization.modules.SerializersModuleBuilder.this.registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, true);
            }
        });
        return serializersModuleBuilder.build();
    }
}
