package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaMethod extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod {
    private final java.lang.reflect.Method getHighSpeedVideoSizes;

    public ReflectJavaMethod(java.lang.reflect.Method method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        this.getHighSpeedVideoSizes = method;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final java.lang.reflect.Method getMember() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> getValueParameters() {
        java.lang.reflect.Type[] genericParameterTypes = getMember().getGenericParameterTypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
        java.lang.annotation.Annotation[][] parameterAnnotations = getMember().getParameterAnnotations();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "");
        return getValueParameters(genericParameterTypes, parameterAnnotations, getMember().isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType getReturnType() {
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory factory = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory;
        java.lang.reflect.Type genericReturnType = getMember().getGenericReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(genericReturnType, "");
        return factory.create(genericReturnType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument getAnnotationParameterDefaultValue() {
        java.lang.Object defaultValue = getMember().getDefaultValue();
        return defaultValue != null ? kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationArgument.Factory.create(defaultValue, null) : null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaTypeParameter> getTypeParameters() {
        java.lang.reflect.TypeVariable<java.lang.reflect.Method>[] typeParameters = getMember().getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        java.lang.reflect.TypeVariable<java.lang.reflect.Method>[] typeVariableArr = typeParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(typeVariableArr.length);
        for (java.lang.reflect.TypeVariable<java.lang.reflect.Method> typeVariable : typeVariableArr) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod
    public final boolean getHasAnnotationParameterDefaultValue() {
        return getAnnotationParameterDefaultValue() != null;
    }
}
