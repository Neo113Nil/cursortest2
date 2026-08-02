package kotlinx.serialization.modules;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\u0007\u001a\u00020\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\t\u001a,\u0010\u000f\u001a\u00020\u00062\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012\u001a.\u0010\u0013\u001a\u00020\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0014\u001ab\u0010\u0019\u001a\u00020\f\"\b\b\u0000\u0010\u0015*\u00020\u0000*\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00042\u001f\b\u0002\u0010\u000e\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "T", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlinx/serialization/modules/SerializersModule;", "serializersModuleOf", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/modules/SerializersModule;", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/modules/SerializersModule;", "Lkotlin/Function1;", "Lkotlinx/serialization/modules/SerializersModuleBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builderAction", "SerializersModule", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/serialization/modules/SerializersModule;", "EmptySerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "contextual", "(Lkotlinx/serialization/modules/SerializersModuleBuilder;Lkotlinx/serialization/KSerializer;)V", "Base", "baseClass", "baseSerializer", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "polymorphic", "(Lkotlinx/serialization/modules/SerializersModuleBuilder;Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SerializersModuleBuildersKt {
    public static final /* synthetic */ <T> kotlinx.serialization.modules.SerializersModule serializersModuleOf(kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        return serializersModuleOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), kSerializer);
    }

    public static final kotlinx.serialization.modules.SerializersModule SerializersModule(kotlin.jvm.functions.Function1<? super kotlinx.serialization.modules.SerializersModuleBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder = new kotlinx.serialization.modules.SerializersModuleBuilder();
        function1.invoke(serializersModuleBuilder);
        return serializersModuleBuilder.build();
    }

    public static final kotlinx.serialization.modules.SerializersModule EmptySerializersModule() {
        return kotlinx.serialization.modules.SerializersModuleKt.getEmptySerializersModule();
    }

    public static final /* synthetic */ <T> void contextual(kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder, kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModuleBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        serializersModuleBuilder.contextual(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), kSerializer);
    }

    public static /* synthetic */ void polymorphic$default(kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder, kotlin.reflect.KClass kClass, kotlinx.serialization.KSerializer kSerializer, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            kSerializer = null;
        }
        if ((i & 4) != 0) {
            function1 = new kotlin.jvm.functions.Function1<kotlinx.serialization.modules.PolymorphicModuleBuilder<? super Base>, kotlin.Unit>() { // from class: kotlinx.serialization.modules.SerializersModuleBuildersKt$polymorphic$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Object obj2) {
                    invoke((kotlinx.serialization.modules.PolymorphicModuleBuilder) obj2);
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(kotlinx.serialization.modules.PolymorphicModuleBuilder<? super Base> polymorphicModuleBuilder) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polymorphicModuleBuilder, "");
                }
            };
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModuleBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.serialization.modules.PolymorphicModuleBuilder polymorphicModuleBuilder = new kotlinx.serialization.modules.PolymorphicModuleBuilder(kClass, kSerializer);
        function1.invoke(polymorphicModuleBuilder);
        polymorphicModuleBuilder.buildTo(serializersModuleBuilder);
    }

    public static final <Base> void polymorphic(kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder, kotlin.reflect.KClass<Base> kClass, kotlinx.serialization.KSerializer<Base> kSerializer, kotlin.jvm.functions.Function1<? super kotlinx.serialization.modules.PolymorphicModuleBuilder<? super Base>, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serializersModuleBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlinx.serialization.modules.PolymorphicModuleBuilder polymorphicModuleBuilder = new kotlinx.serialization.modules.PolymorphicModuleBuilder(kClass, kSerializer);
        function1.invoke(polymorphicModuleBuilder);
        polymorphicModuleBuilder.buildTo(serializersModuleBuilder);
    }

    public static final <T> kotlinx.serialization.modules.SerializersModule serializersModuleOf(kotlin.reflect.KClass<T> kClass, kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlinx.serialization.modules.SerializersModuleBuilder serializersModuleBuilder = new kotlinx.serialization.modules.SerializersModuleBuilder();
        serializersModuleBuilder.contextual(kClass, kSerializer);
        return serializersModuleBuilder.build();
    }
}
