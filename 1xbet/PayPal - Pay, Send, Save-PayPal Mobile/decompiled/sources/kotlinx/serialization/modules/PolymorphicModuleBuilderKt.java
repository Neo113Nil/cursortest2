package kotlinx.serialization.modules;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a>\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0086\b¢\u0006\u0004\b\u0007\u0010\u000b\u001a0\u0010\f\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\b¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "Base", "T", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "Lkotlinx/serialization/KSerializer;", "serializer", "", "subclass", "(Lkotlinx/serialization/modules/PolymorphicModuleBuilder;Lkotlinx/serialization/KSerializer;)V", "Lkotlin/reflect/KClass;", "clazz", "(Lkotlinx/serialization/modules/PolymorphicModuleBuilder;Lkotlin/reflect/KClass;)V", "subclassesOfSealed", "(Lkotlinx/serialization/modules/PolymorphicModuleBuilder;)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PolymorphicModuleBuilderKt {
    public static final /* synthetic */ <Base, T extends Base> void subclass(kotlinx.serialization.modules.PolymorphicModuleBuilder<? super Base> polymorphicModuleBuilder, kotlinx.serialization.KSerializer<T> kSerializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polymorphicModuleBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        polymorphicModuleBuilder.subclass(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Object.class), kSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Base, T extends Base> void subclass(kotlinx.serialization.modules.PolymorphicModuleBuilder<? super Base> polymorphicModuleBuilder, kotlin.reflect.KClass<T> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polymorphicModuleBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        polymorphicModuleBuilder.subclass(kClass, kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @kotlinx.serialization.ExperimentalSerializationApi
    public static final /* synthetic */ <Base, T extends Base> void subclassesOfSealed(kotlinx.serialization.modules.PolymorphicModuleBuilder<? super Base> polymorphicModuleBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(polymorphicModuleBuilder, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(6, "T");
        kotlin.jvm.internal.MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.simple");
        polymorphicModuleBuilder.subclassesOfSealed(kotlinx.serialization.SerializersKt.serializer((kotlin.reflect.KType) null));
    }
}
