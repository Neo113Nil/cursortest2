package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectJavaClass extends kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement implements kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass {
    private final java.lang.Class<?> Camera2StreamConfigurationMap;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind getLightClassOriginKind() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean hasDefaultConstructor() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final boolean isDeprecatedInJavaDoc() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        return findAnnotation(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final /* bridge */ /* synthetic */ java.util.Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation> getAnnotations() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation> annotations;
        java.lang.reflect.AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (annotations = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwnerKt.getAnnotations(declaredAnnotations)) == null) ? kotlin.collections.CollectionsKt.emptyList() : annotations;
    }

    public ReflectJavaClass(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        this.Camera2StreamConfigurationMap = cls;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean isAbstract() {
        return java.lang.reflect.Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation findAnnotation(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.lang.reflect.AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwnerKt.findAnnotation(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    public final java.lang.Class<?> getElement() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean isStatic() {
        return java.lang.reflect.Modifier.isStatic(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public final int getModifiers() {
        return this.Camera2StreamConfigurationMap.getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final boolean isFinal() {
        return java.lang.reflect.Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public final kotlin.reflect.jvm.internal.impl.descriptors.Visibility getVisibility() {
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

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getInnerClassNames() {
        java.lang.Class<?>[] declaredClasses = this.Camera2StreamConfigurationMap.getDeclaredClasses();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredClasses, "");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.mapNotNull(kotlin.sequences.SequencesKt.filterNot(kotlin.collections.ArraysKt.asSequence(declaredClasses), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass.Camera2StreamConfigurationMap((java.lang.Class) obj));
            }
        }), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass.getHighSpeedVideoFpsRangesFor((java.lang.Class) obj);
            }
        }));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final kotlin.reflect.jvm.internal.impl.name.FqName getFqName() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(this.Camera2StreamConfigurationMap).asSingleFqName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass getOuterClass() {
        java.lang.Class<?> declaringClass = this.Camera2StreamConfigurationMap.getDeclaringClass();
        if (declaringClass != null) {
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass(declaringClass);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType> getSupertypes() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, java.lang.Object.class)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
        java.lang.Class genericSuperclass = this.Camera2StreamConfigurationMap.getGenericSuperclass();
        if (genericSuperclass == null) {
        }
        spreadBuilder.add(genericSuperclass);
        spreadBuilder.addSpread(this.Camera2StreamConfigurationMap.getGenericInterfaces());
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(spreadBuilder.toArray(new java.lang.reflect.Type[spreadBuilder.size()]));
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
        java.util.Iterator it = listOf.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClassifierType((java.lang.reflect.Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod> getMethods() {
        java.lang.reflect.Method[] declaredMethods = this.Camera2StreamConfigurationMap.getDeclaredMethods();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethods, "");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.filter(kotlin.collections.ArraysKt.asSequence(declaredMethods), new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$$Lambda$2
            private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, (java.lang.reflect.Method) obj));
            }

            {
                this.getHighSpeedVideoSizes = this;
            }
        }), kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$2.getHighSpeedVideoFpsRanges));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField> getFields() {
        java.lang.reflect.Field[] declaredFields = this.Camera2StreamConfigurationMap.getDeclaredFields();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredFields, "");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.filterNot(kotlin.collections.ArraysKt.asSequence(declaredFields), kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$fields$1.Camera2StreamConfigurationMap), kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$fields$2.Camera2StreamConfigurationMap));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor> getConstructors() {
        java.lang.reflect.Constructor<?>[] declaredConstructors = this.Camera2StreamConfigurationMap.getDeclaredConstructors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredConstructors, "");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.filterNot(kotlin.collections.ArraysKt.asSequence(declaredConstructors), kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$constructors$1.getHighSpeedVideoSizes), kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$constructors$2.getHighSpeedVideoFpsRangesFor));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    public final kotlin.reflect.jvm.internal.impl.name.Name getName() {
        if (this.Camera2StreamConfigurationMap.isAnonymousClass()) {
            java.lang.String name2 = this.Camera2StreamConfigurationMap.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(kotlin.text.StringsKt.substringAfterLast$default(name2, ".", (java.lang.String) null, 2, (java.lang.Object) null));
            kotlin.jvm.internal.Intrinsics.checkNotNull(identifier);
            return identifier;
        }
        kotlin.reflect.jvm.internal.impl.name.Name identifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(this.Camera2StreamConfigurationMap.getSimpleName());
        kotlin.jvm.internal.Intrinsics.checkNotNull(identifier2);
        return identifier2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaTypeParameter> getTypeParameters() {
        java.lang.reflect.TypeVariable<java.lang.Class<?>>[] typeParameters = this.Camera2StreamConfigurationMap.getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        java.lang.reflect.TypeVariable<java.lang.Class<?>>[] typeVariableArr = typeParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(typeVariableArr.length);
        for (java.lang.reflect.TypeVariable<java.lang.Class<?>> typeVariable : typeVariableArr) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean isInterface() {
        return this.Camera2StreamConfigurationMap.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean isAnnotationType() {
        return this.Camera2StreamConfigurationMap.isAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean isEnum() {
        return this.Camera2StreamConfigurationMap.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean isRecord() {
        java.lang.Boolean loadIsRecord = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.INSTANCE.loadIsRecord(this.Camera2StreamConfigurationMap);
        if (loadIsRecord != null) {
            return loadIsRecord.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent> getRecordComponents() {
        java.lang.Object[] loadGetRecordComponents = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.INSTANCE.loadGetRecordComponents(this.Camera2StreamConfigurationMap);
        if (loadGetRecordComponents == null) {
            loadGetRecordComponents = new java.lang.Object[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(loadGetRecordComponents.length);
        for (java.lang.Object obj : loadGetRecordComponents) {
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaRecordComponent(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public final boolean isSealed() {
        java.lang.Boolean loadIsSealed = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader.INSTANCE.loadIsSealed(this.Camera2StreamConfigurationMap);
        if (loadIsSealed != null) {
            return loadIsSealed.booleanValue();
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass) obj).Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(this.Camera2StreamConfigurationMap);
        return sb.toString();
    }

    static /* synthetic */ boolean Camera2StreamConfigurationMap(java.lang.Class cls) {
        java.lang.String simpleName = cls.getSimpleName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return simpleName.length() == 0;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRangesFor(java.lang.Class cls) {
        java.lang.String simpleName = cls.getSimpleName();
        if (!kotlin.reflect.jvm.internal.impl.name.Name.isValidIdentifier(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return kotlin.reflect.jvm.internal.impl.name.Name.identifier(simpleName);
        }
        return null;
    }

    static /* synthetic */ boolean Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass reflectJavaClass, java.lang.reflect.Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        if (!reflectJavaClass.isEnum()) {
            return true;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(method);
        java.lang.String name2 = method.getName();
        if (kotlin.jvm.internal.Intrinsics.areEqual(name2, "values")) {
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
            if (parameterTypes.length != 0) {
                return true;
            }
        } else if (!kotlin.jvm.internal.Intrinsics.areEqual(name2, "valueOf") || !java.util.Arrays.equals(method.getParameterTypes(), new java.lang.Class[]{java.lang.String.class})) {
            return true;
        }
        return false;
    }
}
