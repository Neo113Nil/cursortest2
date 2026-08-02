package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaClassifierType extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType {
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.reflect.Type getHighSpeedVideoFpsRanges;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public ReflectJavaClassifierType(java.lang.reflect.Type type) {
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass reflectJavaClass;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.getHighSpeedVideoFpsRanges = type;
        java.lang.reflect.Type reflectType = getReflectType();
        if (reflectType instanceof java.lang.Class) {
            reflectJavaClass = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass((java.lang.Class) reflectType);
        } else if (reflectType instanceof java.lang.reflect.TypeVariable) {
            reflectJavaClass = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaTypeParameter((java.lang.reflect.TypeVariable) reflectType);
        } else {
            if (!(reflectType instanceof java.lang.reflect.ParameterizedType)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Not a classifier type (");
                sb.append(reflectType.getClass());
                sb.append("): ");
                sb.append(reflectType);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            java.lang.reflect.Type rawType = ((java.lang.reflect.ParameterizedType) reflectType).getRawType();
            kotlin.jvm.internal.Intrinsics.checkNotNull(rawType, "");
            reflectJavaClass = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass((java.lang.Class) rawType);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = reflectJavaClass;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType
    public final java.lang.reflect.Type getReflectType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier getClassifier() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public final java.lang.String getClassifierQualifiedName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Type not found: ");
        sb.append(getReflectType());
        throw new java.lang.UnsupportedOperationException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public final java.lang.String getPresentableText() {
        return getReflectType().toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public final boolean isRaw() {
        java.lang.reflect.Type reflectType = getReflectType();
        if (!(reflectType instanceof java.lang.Class)) {
            return false;
        }
        java.lang.reflect.TypeVariable[] typeParameters = ((java.lang.Class) reflectType).getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        return typeParameters.length != 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType
    public final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType> getTypeArguments() {
        java.util.List<java.lang.reflect.Type> parameterizedTypeArguments = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getParameterizedTypeArguments(getReflectType());
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory factory = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(parameterizedTypeArguments, 10));
        java.util.Iterator<T> it = parameterizedTypeArguments.iterator();
        while (it.hasNext()) {
            arrayList.add(factory.create((java.lang.reflect.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation> getAnnotations() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return null;
    }
}
