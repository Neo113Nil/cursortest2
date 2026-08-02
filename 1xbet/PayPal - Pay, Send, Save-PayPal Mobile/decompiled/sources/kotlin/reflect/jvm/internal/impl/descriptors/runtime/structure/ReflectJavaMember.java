package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public abstract class ReflectJavaMember extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement implements kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember {
    public abstract java.lang.reflect.Member getMember();

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        return findAnnotation(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ java.util.Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation> getAnnotations() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation> annotations;
        java.lang.reflect.AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) ? kotlin.collections.CollectionsKt.emptyList() : annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return java.lang.reflect.Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.lang.reflect.AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isStatic() {
        return java.lang.reflect.Modifier.isStatic(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public java.lang.reflect.AnnotatedElement getElement() {
        java.lang.reflect.Member member = getMember();
        kotlin.jvm.internal.Intrinsics.checkNotNull(member, "");
        return (java.lang.reflect.AnnotatedElement) member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return getMember().getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return java.lang.reflect.Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public kotlin.reflect.jvm.internal.impl.name.Name getName() {
        kotlin.reflect.jvm.internal.impl.name.Name identifier;
        java.lang.String name2 = getMember().getName();
        return (name2 == null || (identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(name2)) == null) ? kotlin.reflect.jvm.internal.impl.name.SpecialNames.NO_NAME_PROVIDED : identifier;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility() {
        int modifiers = getModifiers();
        if (java.lang.reflect.Modifier.isPublic(modifiers)) {
            return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Public.INSTANCE;
        }
        if (java.lang.reflect.Modifier.isPrivate(modifiers)) {
            return kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private.INSTANCE;
        }
        if (java.lang.reflect.Modifier.isProtected(modifiers)) {
            return java.lang.reflect.Modifier.isStatic(modifiers) ? kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedStaticVisibility.INSTANCE : kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedAndPackage.INSTANCE;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.PackageVisibility.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMember
    public kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass getContainingClass() {
        java.lang.Class<?> declaringClass = getMember().getDeclaringClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaringClass, "");
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass(declaringClass);
    }

    protected final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter> getValueParameters(java.lang.reflect.Type[] typeArr, java.lang.annotation.Annotation[][] annotationArr, boolean z) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeArr.length);
        java.util.List<java.lang.String> highResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java8ParameterNamesLoader.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(getMember());
        int size = highResolutionOutputSizeshNQ4ISI != null ? highResolutionOutputSizeshNQ4ISI.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i = 0;
        while (i < length) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType create = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType.Factory.create(typeArr[i]);
            if (highResolutionOutputSizeshNQ4ISI != null) {
                str = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(highResolutionOutputSizeshNQ4ISI, i + size);
                if (str == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("No parameter with index ");
                    sb.append(i);
                    sb.append('+');
                    sb.append(size);
                    sb.append(" (name=");
                    sb.append(getName());
                    sb.append(" type=");
                    sb.append(create);
                    sb.append(") in ");
                    sb.append(this);
                    throw new java.lang.IllegalStateException(sb.toString().toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaValueParameter(create, annotationArr[i], str, z && i == kotlin.collections.ArraysKt.getLastIndex(typeArr)));
            i++;
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember) && kotlin.jvm.internal.Intrinsics.areEqual(getMember(), ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember) obj).getMember());
    }

    public int hashCode() {
        return getMember().hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(getMember());
        return sb.toString();
    }
}
