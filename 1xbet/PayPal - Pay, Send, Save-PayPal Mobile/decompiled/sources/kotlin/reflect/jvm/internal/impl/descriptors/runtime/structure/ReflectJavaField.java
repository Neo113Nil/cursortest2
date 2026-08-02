package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaField extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField {
    private final java.lang.reflect.Field Camera2StreamConfigurationMap;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public final boolean getHasConstantNotNullInitializer() {
        return false;
    }

    public ReflectJavaField(java.lang.reflect.Field field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        this.Camera2StreamConfigurationMap = field;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final java.lang.reflect.Field getMember() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public final boolean isEnumEntry() {
        return getMember().isEnumConstant();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType getType() {
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory factory = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory;
        java.lang.reflect.Type genericType = getMember().getGenericType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericType, "");
        return factory.create(genericType);
    }
}
