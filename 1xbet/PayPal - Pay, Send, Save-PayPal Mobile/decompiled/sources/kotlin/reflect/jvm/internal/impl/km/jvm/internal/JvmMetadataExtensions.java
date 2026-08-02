package kotlin.reflect.jvm.internal.impl.km.jvm.internal;

/* loaded from: classes17.dex */
public final class JvmMetadataExtensions implements kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions {
    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmEnumEntryExtension createEnumEntryExtension() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeAliasExtension createTypeAliasExtension() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmValueParameterExtension createValueParameterExtension() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void readClassExtensions(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r7, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmClassExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmClass);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotationList = r7.getAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmClass.getAnnotations();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : annotationList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            annotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation, readContext.getStrings()));
        }
        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r6 = r7;
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class, java.lang.Integer> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.anonymousObjectOriginName;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
        java.lang.Integer num = (java.lang.Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(r6, generatedExtension);
        if (num != null) {
            jvm.setAnonymousObjectOriginName(readContext.get(num.intValue()));
        }
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property : (java.util.List) r7.getExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.classLocalVariable)) {
            java.util.List<kotlin.reflect.jvm.internal.impl.km.KmProperty> localDelegatedProperties = jvm.getLocalDelegatedProperties();
            kotlin.jvm.internal.Intrinsics.checkNotNull(property);
            localDelegatedProperties.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.toKmProperty(property, readContext));
        }
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class, java.lang.Integer> generatedExtension2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.classModuleName;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension2, "");
        java.lang.Integer num2 = (java.lang.Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(r6, generatedExtension2);
        if (num2 == null || (str = readContext.get(num2.intValue())) == null) {
            str = "main";
        }
        jvm.setModuleName(str);
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class, java.lang.Integer> generatedExtension3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.jvmClassFlags;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension3, "");
        java.lang.Integer num3 = (java.lang.Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(r6, generatedExtension3);
        if (num3 != null) {
            jvm.setJvmFlags(num3.intValue());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void readPackageExtensions(kotlin.reflect.jvm.internal.impl.km.KmPackage kmPackage, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r6, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmPackage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPackageExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmPackage);
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property : (java.util.List) r6.getExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.packageLocalVariable)) {
            java.util.List<kotlin.reflect.jvm.internal.impl.km.KmProperty> localDelegatedProperties = jvm.getLocalDelegatedProperties();
            kotlin.jvm.internal.Intrinsics.checkNotNull(property);
            localDelegatedProperties.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.toKmProperty(property, readContext));
        }
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package, java.lang.Integer> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.packageModuleName;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
        java.lang.Integer num = (java.lang.Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(r6, generatedExtension);
        if (num == null || (str = readContext.get(num.intValue())) == null) {
            str = "main";
        }
        jvm.setModuleName(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void readFunctionExtensions(kotlin.reflect.jvm.internal.impl.km.KmFunction kmFunction, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function function, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmFunction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmFunctionExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmFunction);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotationList = function.getAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmFunction.getAnnotations();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : annotationList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            annotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation, readContext.getStrings()));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> extensionReceiverAnnotationList = function.getExtensionReceiverAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(extensionReceiverAnnotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> extensionReceiverParameterAnnotations = kmFunction.getExtensionReceiverParameterAnnotations();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation2 : extensionReceiverAnnotationList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation2);
            extensionReceiverParameterAnnotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation2, readContext.getStrings()));
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method jvmMethodSignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getJvmMethodSignature(function, readContext.getStrings(), readContext.getTypes());
        jvm.setSignature(jvmMethodSignature != null ? kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignatureKt.wrapAsPublic(jvmMethodSignature) : null);
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function, java.lang.Integer> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.lambdaClassOriginName;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
        java.lang.Integer num = (java.lang.Integer) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(function, generatedExtension);
        if (num != null) {
            jvm.setLambdaClassOriginName(readContext.get(num.intValue()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void readPropertyExtensions(kotlin.reflect.jvm.internal.impl.km.KmProperty kmProperty, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property property, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmProperty, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(property, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPropertyExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmProperty);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotationList = property.getAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmProperty.getAnnotations();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : annotationList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            annotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation, readContext.getStrings()));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> getterAnnotationList = property.getGetterAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getterAnnotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations2 = kmProperty.getGetter().getAnnotations();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation2 : getterAnnotationList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation2);
            annotations2.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation2, readContext.getStrings()));
        }
        kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes setter = kmProperty.getSetter();
        if (setter != null) {
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> setterAnnotationList = property.getSetterAnnotationList();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(setterAnnotationList, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations3 = setter.getAnnotations();
            for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation3 : setterAnnotationList) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(annotation3);
                annotations3.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation3, readContext.getStrings()));
            }
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> extensionReceiverAnnotationList = property.getExtensionReceiverAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(extensionReceiverAnnotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> extensionReceiverParameterAnnotations = kmProperty.getExtensionReceiverParameterAnnotations();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation4 : extensionReceiverAnnotationList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation4);
            extensionReceiverParameterAnnotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation4, readContext.getStrings()));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> backingFieldAnnotationList = property.getBackingFieldAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(backingFieldAnnotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> backingFieldAnnotations = kmProperty.getBackingFieldAnnotations();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation5 : backingFieldAnnotationList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation5);
            backingFieldAnnotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation5, readContext.getStrings()));
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> delegateFieldAnnotationList = property.getDelegateFieldAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(delegateFieldAnnotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> delegateFieldAnnotations = kmProperty.getDelegateFieldAnnotations();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation6 : delegateFieldAnnotationList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation6);
            delegateFieldAnnotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation6, readContext.getStrings()));
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field jvmFieldSignature$default = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.getJvmFieldSignature$default(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE, property, readContext.getStrings(), readContext.getTypes(), false, 8, null);
        kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature> generatedExtension = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.propertySignature;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedExtension, "");
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt.getExtensionOrNull(property, generatedExtension);
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature getter = (jvmPropertySignature == null || !jvmPropertySignature.hasGetter()) ? null : jvmPropertySignature.getGetter();
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature setter2 = (jvmPropertySignature == null || !jvmPropertySignature.hasSetter()) ? null : jvmPropertySignature.getSetter();
        java.lang.Object extension = property.getExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.flags);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(extension, "");
        jvm.setJvmFlags(((java.lang.Number) extension).intValue());
        jvm.setFieldSignature(jvmFieldSignature$default != null ? kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignatureKt.wrapAsPublic(jvmFieldSignature$default) : null);
        jvm.setGetterSignature(getter != null ? new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature(readContext.get(getter.getName()), readContext.get(getter.getDesc())) : null);
        jvm.setSetterSignature(setter2 != null ? new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature(readContext.get(setter2.getName()), readContext.get(setter2.getDesc())) : null);
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature syntheticMethod = (jvmPropertySignature == null || !jvmPropertySignature.hasSyntheticMethod()) ? null : jvmPropertySignature.getSyntheticMethod();
        jvm.setSyntheticMethodForAnnotations(syntheticMethod != null ? new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature(readContext.get(syntheticMethod.getName()), readContext.get(syntheticMethod.getDesc())) : null);
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature delegateMethod = (jvmPropertySignature == null || !jvmPropertySignature.hasDelegateMethod()) ? null : jvmPropertySignature.getDelegateMethod();
        jvm.setSyntheticMethodForDelegate(delegateMethod != null ? new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature(readContext.get(delegateMethod.getName()), readContext.get(delegateMethod.getDesc())) : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void readConstructorExtensions(kotlin.reflect.jvm.internal.impl.km.KmConstructor kmConstructor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor constructor, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmConstructorExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmConstructor);
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotationList = constructor.getAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmConstructor.getAnnotations();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : annotationList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            annotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation, readContext.getStrings()));
        }
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method jvmConstructorSignature = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature(constructor, readContext.getStrings(), readContext.getTypes());
        jvm.setSignature(jvmConstructorSignature != null ? kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignatureKt.wrapAsPublic(jvmConstructorSignature) : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void readTypeParameterExtensions(kotlin.reflect.jvm.internal.impl.km.KmTypeParameter kmTypeParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter typeParameter, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmTypeParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeParameterExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmTypeParameter);
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : typeParameter.getAnnotationList()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = jvm.getAnnotations();
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            annotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation, readContext.getStrings()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void readEnumEntryExtensions(kotlin.reflect.jvm.internal.impl.km.KmEnumEntry kmEnumEntry, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry enumEntry, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmEnumEntry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumEntry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : enumEntry.getAnnotationList()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmEnumEntry.getAnnotations();
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            annotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation, readContext.getStrings()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void readTypeExtensions(kotlin.reflect.jvm.internal.impl.km.KmType kmType, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type type, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmType);
        java.lang.Object extension = type.getExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.isRaw);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(extension, "");
        jvm.setRaw(((java.lang.Boolean) extension).booleanValue());
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : type.getAnnotationList()) {
            java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = jvm.getAnnotations();
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            annotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation, readContext.getStrings()));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void readValueParameterExtensions(kotlin.reflect.jvm.internal.impl.km.KmValueParameter kmValueParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter valueParameter, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmValueParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation> annotationList = valueParameter.getAnnotationList();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(annotationList, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmValueParameter.getAnnotations();
        for (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation annotation : annotationList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            annotations.add(kotlin.reflect.jvm.internal.impl.km.internal.ReadUtilsKt.readAnnotation(annotation, readContext.getStrings()));
        }
    }

    public final void writeClassExtensions(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmClassExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmClass);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmClass.getAnnotations();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(annotations, 10));
        java.util.Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it.next(), writeContext.getStrings()).build());
        }
        builder.addAllAnnotation(arrayList);
        java.lang.String anonymousObjectOriginName = jvm.getAnonymousObjectOriginName();
        if (anonymousObjectOriginName != null) {
            builder.setExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.anonymousObjectOriginName, java.lang.Integer.valueOf(writeContext.get(anonymousObjectOriginName)));
        }
        java.util.Iterator<T> it2 = jvm.getLocalDelegatedProperties().iterator();
        while (it2.hasNext()) {
            builder.addExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.classLocalVariable, kotlin.reflect.jvm.internal.impl.km.internal.WritersKt.writeProperty(writeContext, (kotlin.reflect.jvm.internal.impl.km.KmProperty) it2.next()).build());
        }
        java.lang.String moduleName = jvm.getModuleName();
        if (moduleName != null && !kotlin.jvm.internal.Intrinsics.areEqual(moduleName, "main")) {
            builder.setExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.classModuleName, java.lang.Integer.valueOf(writeContext.get(moduleName)));
        }
        if (jvm.getJvmFlags() != 0) {
            builder.setExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.jvmClassFlags, java.lang.Integer.valueOf(jvm.getJvmFlags()));
        }
    }

    public final void writePackageExtensions(kotlin.reflect.jvm.internal.impl.km.KmPackage kmPackage, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmPackage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPackageExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmPackage);
        java.util.Iterator<T> it = jvm.getLocalDelegatedProperties().iterator();
        while (it.hasNext()) {
            builder.addExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.packageLocalVariable, kotlin.reflect.jvm.internal.impl.km.internal.WritersKt.writeProperty(writeContext, (kotlin.reflect.jvm.internal.impl.km.KmProperty) it.next()).build());
        }
        java.lang.String moduleName = jvm.getModuleName();
        if (moduleName == null || kotlin.jvm.internal.Intrinsics.areEqual(moduleName, "main")) {
            return;
        }
        builder.setExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.packageModuleName, java.lang.Integer.valueOf(writeContext.get(moduleName)));
    }

    public final void writeFunctionExtensions(kotlin.reflect.jvm.internal.impl.km.KmFunction kmFunction, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmFunction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmFunctionExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmFunction);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmFunction.getAnnotations();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(annotations, 10));
        java.util.Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it.next(), writeContext.getStrings()).build());
        }
        builder.addAllAnnotation(arrayList);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> extensionReceiverParameterAnnotations = kmFunction.getExtensionReceiverParameterAnnotations();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(extensionReceiverParameterAnnotations, 10));
        java.util.Iterator<T> it2 = extensionReceiverParameterAnnotations.iterator();
        while (it2.hasNext()) {
            arrayList2.add(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it2.next(), writeContext.getStrings()).build());
        }
        builder.addAllExtensionReceiverAnnotation(arrayList2);
        kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature signature = jvm.getSignature();
        if (signature != null) {
            builder.setExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.methodSignature, getHighSpeedVideoFpsRanges(signature, writeContext));
        }
        java.lang.String lambdaClassOriginName = jvm.getLambdaClassOriginName();
        if (lambdaClassOriginName != null) {
            builder.setExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.lambdaClassOriginName, java.lang.Integer.valueOf(writeContext.get(lambdaClassOriginName)));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void writePropertyExtensions(kotlin.reflect.jvm.internal.impl.km.KmProperty kmProperty, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmProperty, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPropertyExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmProperty);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmProperty.getAnnotations();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(annotations, 10));
        java.util.Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it.next(), writeContext.getStrings()).build());
        }
        builder.addAllAnnotation(arrayList);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations2 = kmProperty.getGetter().getAnnotations();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(annotations2, 10));
        java.util.Iterator<T> it2 = annotations2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it2.next(), writeContext.getStrings()).build());
        }
        builder.addAllGetterAnnotation(arrayList2);
        kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes setter = kmProperty.getSetter();
        if (setter != null) {
            java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations3 = setter.getAnnotations();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(annotations3, 10));
            java.util.Iterator<T> it3 = annotations3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it3.next(), writeContext.getStrings()).build());
            }
            builder.addAllSetterAnnotation(arrayList3);
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> extensionReceiverParameterAnnotations = kmProperty.getExtensionReceiverParameterAnnotations();
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(extensionReceiverParameterAnnotations, 10));
        java.util.Iterator<T> it4 = extensionReceiverParameterAnnotations.iterator();
        while (it4.hasNext()) {
            arrayList4.add(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it4.next(), writeContext.getStrings()).build());
        }
        builder.addAllExtensionReceiverAnnotation(arrayList4);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> backingFieldAnnotations = kmProperty.getBackingFieldAnnotations();
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(backingFieldAnnotations, 10));
        java.util.Iterator<T> it5 = backingFieldAnnotations.iterator();
        while (it5.hasNext()) {
            arrayList5.add(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it5.next(), writeContext.getStrings()).build());
        }
        builder.addAllBackingFieldAnnotation(arrayList5);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> delegateFieldAnnotations = kmProperty.getDelegateFieldAnnotations();
        java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(delegateFieldAnnotations, 10));
        java.util.Iterator<T> it6 = delegateFieldAnnotations.iterator();
        while (it6.hasNext()) {
            arrayList6.add(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it6.next(), writeContext.getStrings()).build());
        }
        builder.addAllDelegateFieldAnnotation(arrayList6);
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder newBuilder = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "");
        boolean z2 = true;
        if (jvm.getFieldSignature() != null) {
            kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.Builder newBuilder2 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.newBuilder();
            kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature fieldSignature = jvm.getFieldSignature();
            kotlin.jvm.internal.Intrinsics.checkNotNull(fieldSignature);
            newBuilder2.setName(writeContext.get(fieldSignature.getName()));
            kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature fieldSignature2 = jvm.getFieldSignature();
            kotlin.jvm.internal.Intrinsics.checkNotNull(fieldSignature2);
            newBuilder2.setDesc(writeContext.get(fieldSignature2.getDescriptor()));
            newBuilder.setField(newBuilder2.build());
            z = true;
        } else {
            z = false;
        }
        if (jvm.getGetterSignature() != null) {
            kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature getterSignature = jvm.getGetterSignature();
            kotlin.jvm.internal.Intrinsics.checkNotNull(getterSignature);
            newBuilder.setGetter(getHighSpeedVideoFpsRanges(getterSignature, writeContext));
            z = true;
        }
        if (jvm.getSetterSignature() != null) {
            kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature setterSignature = jvm.getSetterSignature();
            kotlin.jvm.internal.Intrinsics.checkNotNull(setterSignature);
            newBuilder.setSetter(getHighSpeedVideoFpsRanges(setterSignature, writeContext));
        } else {
            z2 = z;
        }
        if (z2 && jvm.getSyntheticMethodForAnnotations() != null) {
            kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature syntheticMethodForAnnotations = jvm.getSyntheticMethodForAnnotations();
            kotlin.jvm.internal.Intrinsics.checkNotNull(syntheticMethodForAnnotations);
            newBuilder.setSyntheticMethod(getHighSpeedVideoFpsRanges(syntheticMethodForAnnotations, writeContext));
        }
        if (z2 && jvm.getSyntheticMethodForDelegate() != null) {
            kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature syntheticMethodForDelegate = jvm.getSyntheticMethodForDelegate();
            kotlin.jvm.internal.Intrinsics.checkNotNull(syntheticMethodForDelegate);
            newBuilder.setDelegateMethod(getHighSpeedVideoFpsRanges(syntheticMethodForDelegate, writeContext));
        }
        int jvmFlags = jvm.getJvmFlags();
        java.lang.Integer num = (java.lang.Integer) kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.getDefaultInstance().getExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.flags);
        if (num == null || jvmFlags != num.intValue()) {
            builder.setExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.flags, java.lang.Integer.valueOf(jvm.getJvmFlags()));
        }
        if (z2) {
            builder.setExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.propertySignature, newBuilder.build());
        }
    }

    public final void writeConstructorExtensions(kotlin.reflect.jvm.internal.impl.km.KmConstructor kmConstructor, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmConstructorExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmConstructor);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmConstructor.getAnnotations();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(annotations, 10));
        java.util.Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it.next(), writeContext.getStrings()).build());
        }
        builder.addAllAnnotation(arrayList);
        kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature signature = jvm.getSignature();
        if (signature != null) {
            builder.setExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.constructorSignature, getHighSpeedVideoFpsRanges(signature, writeContext));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void writeTypeParameterExtensions(kotlin.reflect.jvm.internal.impl.km.KmTypeParameter kmTypeParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmTypeParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
        java.util.Iterator<T> it = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmTypeParameter).getAnnotations().iterator();
        while (it.hasNext()) {
            builder.addAnnotation(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it.next(), writeContext.getStrings()).build());
        }
    }

    public final void writeEnumEntryExtensions(kotlin.reflect.jvm.internal.impl.km.KmEnumEntry kmEnumEntry, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmEnumEntry, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
        java.util.Iterator<T> it = kmEnumEntry.getAnnotations().iterator();
        while (it.hasNext()) {
            builder.addAnnotation(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it.next(), writeContext.getStrings()).build());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void writeTypeExtensions(kotlin.reflect.jvm.internal.impl.km.KmType kmType, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
        kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeExtension jvm = kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmType);
        if (jvm.isRaw()) {
            builder.setExtension(kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.isRaw, java.lang.Boolean.TRUE);
        }
        java.util.Iterator<T> it = jvm.getAnnotations().iterator();
        while (it.hasNext()) {
            builder.addAnnotation(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it.next(), writeContext.getStrings()).build());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void writeValueParameterExtensions(kotlin.reflect.jvm.internal.impl.km.KmValueParameter kmValueParameter, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmValueParameter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> annotations = kmValueParameter.getAnnotations();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(annotations, 10));
        java.util.Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            arrayList.add(kotlin.reflect.jvm.internal.impl.km.internal.WriteUtilsKt.writeAnnotation((kotlin.reflect.jvm.internal.impl.km.KmAnnotation) it.next(), writeContext.getStrings()).build());
        }
        builder.addAllAnnotation(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension createClassExtension() {
        return new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmClassExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension createPackageExtension() {
        return new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPackageExtension();
    }

    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmModuleFragmentExtension createModuleFragmentExtensions() {
        return new kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmModuleFragmentExtension() { // from class: kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmMetadataExtensions$createModuleFragmentExtensions$1
            private final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmModuleFragmentExtension.class));

            @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtension
            public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmExtensionType getType() {
                return this.Camera2StreamConfigurationMap;
            }
        };
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension createFunctionExtension() {
        return new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmFunctionExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension createPropertyExtension() {
        return new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmPropertyExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmConstructorExtension createConstructorExtension() {
        return new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmConstructorExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension createTypeParameterExtension() {
        return new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeParameterExtension();
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension createTypeExtension() {
        return new kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmTypeExtension();
    }

    private static kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature jvmMemberSignature, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder newBuilder = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.newBuilder();
        newBuilder.setName(writeContext.get(jvmMemberSignature.getName()));
        newBuilder.setDesc(writeContext.get(jvmMemberSignature.getDescriptor()));
        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature build = newBuilder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public final void writeTypeAliasExtensions(kotlin.reflect.jvm.internal.impl.km.KmTypeAlias kmTypeAlias, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmTypeAlias, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
    }

    public final void writeModuleFragmentExtensions(kotlin.reflect.jvm.internal.impl.km.internal.common.KmModuleFragment kmModuleFragment, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder builder, kotlin.reflect.jvm.internal.impl.km.internal.WriteContext writeContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmModuleFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeContext, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions
    public final void readTypeAliasExtensions(kotlin.reflect.jvm.internal.impl.km.KmTypeAlias kmTypeAlias, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias typeAlias, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmTypeAlias, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAlias, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
    }

    public final void readModuleFragmentExtensions(kotlin.reflect.jvm.internal.impl.km.internal.common.KmModuleFragment kmModuleFragment, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment packageFragment, kotlin.reflect.jvm.internal.impl.km.internal.ReadContext readContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmModuleFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readContext, "");
    }
}
