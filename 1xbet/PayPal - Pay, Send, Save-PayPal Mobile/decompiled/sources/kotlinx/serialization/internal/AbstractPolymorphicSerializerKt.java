package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\b"}, d2 = {"", "subClassName", "Lkotlin/reflect/KClass;", "baseClass", "", "throwSubtypeNotRegistered", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Void;", "subClass", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Ljava/lang/Void;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AbstractPolymorphicSerializerKt {
    public static final java.lang.Void throwSubtypeNotRegistered(java.lang.String str, kotlin.reflect.KClass<?> kClass) {
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("in the polymorphic scope of '");
        sb.append(kClass.getSimpleName());
        sb.append('\'');
        java.lang.String obj2 = sb.toString();
        if (str == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Class discriminator was missing and no default serializers were registered ");
            sb2.append(obj2);
            sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            obj = sb2.toString();
        } else {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Serializer for subclass '");
            sb3.append(str);
            sb3.append("' is not found ");
            sb3.append(obj2);
            sb3.append(".\nCheck if class with serial name '");
            sb3.append(str);
            sb3.append("' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '");
            sb3.append(str);
            sb3.append("' has to be '@Serializable', and the base class '");
            sb3.append(kClass.getSimpleName());
            sb3.append("' has to be sealed and '@Serializable'.");
            obj = sb3.toString();
        }
        throw new kotlinx.serialization.SerializationException(obj);
    }

    public static final java.lang.Void throwSubtypeNotRegistered(kotlin.reflect.KClass<?> kClass, kotlin.reflect.KClass<?> kClass2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass2, "");
        java.lang.String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = java.lang.String.valueOf(kClass);
        }
        throwSubtypeNotRegistered(simpleName, kClass2);
        throw new kotlin.KotlinNothingValueException();
    }
}
