package kotlinx.serialization.internal;

/* compiled from: AbstractPolymorphicSerializer.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0001\u001a \u0010\u0000\u001a\u00020\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0001¨\u0006\u0007"}, d2 = {"throwSubtypeNotRegistered", "", "subClassName", "", "baseClass", "Lkotlin/reflect/KClass;", "subClass", "kotlinx-serialization-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbstractPolymorphicSerializerKt {
    public static final java.lang.Void throwSubtypeNotRegistered(java.lang.String str, kotlin.reflect.KClass<?> baseClass) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        java.lang.String str3 = "in the polymorphic scope of '" + baseClass.getSimpleName() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default serializers were registered " + str3 + '.';
        } else {
            str2 = "Serializer for subclass '" + str + "' is not found " + str3 + ".\nCheck if class with serial name '" + str + "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.getSimpleName() + "' has to be sealed and '@Serializable'.";
        }
        throw new kotlinx.serialization.SerializationException(str2);
    }

    public static final java.lang.Void throwSubtypeNotRegistered(kotlin.reflect.KClass<?> subClass, kotlin.reflect.KClass<?> baseClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subClass, "subClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        java.lang.String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = java.lang.String.valueOf(subClass);
        }
        throwSubtypeNotRegistered(simpleName, baseClass);
        throw new kotlin.KotlinNothingValueException();
    }
}
