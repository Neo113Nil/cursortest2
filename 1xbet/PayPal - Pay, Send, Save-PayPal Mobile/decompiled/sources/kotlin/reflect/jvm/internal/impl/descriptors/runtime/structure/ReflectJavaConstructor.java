package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaConstructor extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor {
    private final java.lang.reflect.Constructor<?> getHighSpeedVideoFpsRangesFor;

    public ReflectJavaConstructor(java.lang.reflect.Constructor<?> constructor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
        this.getHighSpeedVideoFpsRangesFor = constructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final java.lang.reflect.Constructor<?> getMember() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor
    public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> getValueParameters() {
        java.lang.reflect.Type[] genericParameterTypes = getMember().getGenericParameterTypes();
        kotlin.jvm.internal.Intrinsics.checkNotNull(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.Class<?> declaringClass = getMember().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !java.lang.reflect.Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (java.lang.reflect.Type[]) kotlin.collections.ArraysKt.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
        }
        java.lang.annotation.Annotation[][] parameterAnnotations = getMember().getParameterAnnotations();
        java.lang.annotation.Annotation[][] annotationArr = parameterAnnotations;
        if (annotationArr.length < genericParameterTypes.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal generic signature: ");
            sb.append(getMember());
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (annotationArr.length > genericParameterTypes.length) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(parameterAnnotations);
            parameterAnnotations = (java.lang.annotation.Annotation[][]) kotlin.collections.ArraysKt.copyOfRange(annotationArr, annotationArr.length - genericParameterTypes.length, annotationArr.length);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(genericParameterTypes);
        kotlin.jvm.internal.Intrinsics.checkNotNull(parameterAnnotations);
        return getValueParameters(genericParameterTypes, parameterAnnotations, getMember().isVarArgs());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaTypeParameter> getTypeParameters() {
        java.lang.reflect.TypeVariable<java.lang.reflect.Constructor<?>>[] typeParameters = getMember().getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        java.lang.reflect.TypeVariable<java.lang.reflect.Constructor<?>>[] typeVariableArr = typeParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(typeVariableArr.length);
        for (java.lang.reflect.TypeVariable<java.lang.reflect.Constructor<?>> typeVariable : typeVariableArr) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }
}
