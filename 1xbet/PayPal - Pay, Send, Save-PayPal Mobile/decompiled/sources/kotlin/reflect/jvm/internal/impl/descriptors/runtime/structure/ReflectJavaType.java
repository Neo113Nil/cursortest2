package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public abstract class ReflectJavaType implements kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory Factory = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory(null);

    protected abstract java.lang.reflect.Type getReflectType();

    public static final class Factory {
        private Factory() {
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType create(java.lang.reflect.Type type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            boolean z = type instanceof java.lang.Class;
            if (z) {
                java.lang.Class cls = (java.lang.Class) type;
                if (cls.isPrimitive()) {
                    return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaPrimitiveType(cls);
                }
            }
            if ((type instanceof java.lang.reflect.GenericArrayType) || (z && ((java.lang.Class) type).isArray())) {
                return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaArrayType(type);
            }
            return type instanceof java.lang.reflect.WildcardType ? new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaWildcardType((java.lang.reflect.WildcardType) type) : new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClassifierType(type);
        }

        public /* synthetic */ Factory(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType) && kotlin.jvm.internal.Intrinsics.areEqual(getReflectType(), ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType) obj).getReflectType());
    }

    public int hashCode() {
        return getReflectType().hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(getReflectType());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.util.Iterator<T> it = getAnnotations().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            kotlin.reflect.jvm.internal.impl.name.ClassId classId = ((kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation) next).getClassId();
            if (kotlin.jvm.internal.Intrinsics.areEqual(classId != null ? classId.asSingleFqName() : null, fqName)) {
                obj = next;
                break;
            }
        }
        return (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation) obj;
    }
}
