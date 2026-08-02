package kotlinx.serialization.modules;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJN\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032%\u0010\r\u001a!\u0012\u0013\u0012\u0011\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u000b¢\u0006\u0002\b\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\nH&¢\u0006\u0004\b\b\u0010\u000eJM\u0010\u0014\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u0001\"\b\b\u0001\u0010\u0010*\u00028\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¢\u0006\u0004\b\u0014\u0010\u0015JH\u0010\u0018\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u001f\u0010\u0017\u001a\u001b\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\f\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00160\nH&¢\u0006\u0004\b\u0018\u0010\u000eJJ\u0010\u001c\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032!\u0010\u001b\u001a\u001d\u0012\u000b\u0012\t\u0018\u00010\u0019¢\u0006\u0002\b\f\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\nH&¢\u0006\u0004\b\u001c\u0010\u000eJT\u0010\u001f\u001a\u00020\u0007\"\b\b\u0000\u0010\u000f*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032+\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0019¢\u0006\f\b\f\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a0\nH\u0017¢\u0006\u0004\b\u001f\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lkotlinx/serialization/modules/SerializersModuleCollector;", "", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "", "contextual", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "provider", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "Base", "Sub", "baseClass", "actualClass", "actualSerializer", "polymorphic", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "Lkotlinx/serialization/SerializationStrategy;", "defaultSerializerProvider", "polymorphicDefaultSerializer", "", "Lkotlinx/serialization/DeserializationStrategy;", "defaultDeserializerProvider", "polymorphicDefaultDeserializer", "name", "className", "polymorphicDefault"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.ExperimentalSerializationApi
/* loaded from: classes3.dex */
public interface SerializersModuleCollector {
    <T> void contextual(kotlin.reflect.KClass<T> kClass, kotlin.jvm.functions.Function1<? super java.util.List<? extends kotlinx.serialization.KSerializer<?>>, ? extends kotlinx.serialization.KSerializer<?>> provider);

    <Base, Sub extends Base> void polymorphic(kotlin.reflect.KClass<Base> baseClass, kotlin.reflect.KClass<Sub> actualClass, kotlinx.serialization.KSerializer<Sub> actualSerializer);

    <Base> void polymorphicDefaultDeserializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<? extends Base>> defaultDeserializerProvider);

    <Base> void polymorphicDefaultSerializer(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super Base, ? extends kotlinx.serialization.SerializationStrategy<? super Base>> defaultSerializerProvider);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> void contextual(kotlinx.serialization.modules.SerializersModuleCollector serializersModuleCollector, kotlin.reflect.KClass<T> kClass, kotlinx.serialization.KSerializer<T> kSerializer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
            kotlinx.serialization.modules.SerializersModuleCollector.super.contextual(kClass, kSerializer);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @kotlin.ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
        @java.lang.Deprecated
        public static <Base> void polymorphicDefault(kotlinx.serialization.modules.SerializersModuleCollector serializersModuleCollector, kotlin.reflect.KClass<Base> kClass, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<? extends Base>> function1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
            kotlinx.serialization.modules.SerializersModuleCollector.super.polymorphicDefault(kClass, function1);
        }
    }

    default <T> void contextual(kotlin.reflect.KClass<T> kClass, final kotlinx.serialization.KSerializer<T> serializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializer, "");
        contextual(kClass, new kotlin.jvm.functions.Function1() { // from class: kotlinx.serialization.modules.SerializersModuleCollector$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kotlinx.serialization.modules.SerializersModuleCollector.$r8$lambda$9Fw7IoyEGISfLIDNCJyYVspn8lA(kotlinx.serialization.KSerializer.this, (java.util.List) obj);
            }
        });
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @kotlin.ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}))
    default <Base> void polymorphicDefault(kotlin.reflect.KClass<Base> baseClass, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends kotlinx.serialization.DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "");
        polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider);
    }

    static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$9Fw7IoyEGISfLIDNCJyYVspn8lA(kotlinx.serialization.KSerializer kSerializer, java.util.List list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kSerializer;
    }
}
