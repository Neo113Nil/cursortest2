package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
public final class ReflectKotlinClass implements kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass.Factory Factory = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass.Factory(null);
    private final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader getHighSpeedVideoFpsRangesFor;
    private final java.lang.Class<?> getHighSpeedVideoSizes;

    private ReflectKotlinClass(java.lang.Class<?> cls, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader kotlinClassHeader) {
        this.getHighSpeedVideoSizes = cls;
        this.getHighSpeedVideoFpsRangesFor = kotlinClassHeader;
    }

    public final java.lang.Class<?> getKlass() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader getClassHeader() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static final class Factory {
        private Factory() {
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass create(java.lang.Class<?> cls) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = new kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor();
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure reflectClassStructure = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure.Camera2StreamConfigurationMap(cls, readKotlinClassHeaderAnnotationVisitor);
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader createHeaderWithDefaultMetadataVersion = readKotlinClassHeaderAnnotationVisitor.createHeaderWithDefaultMetadataVersion();
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (createHeaderWithDefaultMetadataVersion == null) {
                return null;
            }
            return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass(cls, createHeaderWithDefaultMetadataVersion, defaultConstructorMarker);
        }

        public /* synthetic */ Factory(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final java.lang.String getLocation() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String name2 = this.getHighSpeedVideoSizes.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        sb.append(kotlin.text.StringsKt.replace$default(name2, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 4, (java.lang.Object) null));
        sb.append(".class");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final void loadClassAnnotations(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationVisitor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure reflectClassStructure = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, annotationVisitor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public final void visitMembers(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor memberVisitor, byte[] bArr) {
        java.lang.reflect.Constructor<?>[] constructorArr;
        int i;
        java.lang.reflect.Method[] methodArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberVisitor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure reflectClassStructure = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Class<?> cls = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberVisitor, "");
        java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethods, "");
        int length = declaredMethods.length;
        int i2 = 0;
        while (i2 < length) {
            java.lang.reflect.Method method = declaredMethods[i2];
            kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(method.getName());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer signatureSerializer = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(method);
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod = memberVisitor.visitMethod(identifier, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer.getHighResolutionOutputSizeshNQ4ISI(method));
            if (visitMethod != null) {
                java.lang.annotation.Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "");
                for (java.lang.annotation.Annotation annotation : declaredAnnotations) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure.Camera2StreamConfigurationMap(visitMethod, annotation);
                }
                java.lang.annotation.Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "");
                java.lang.annotation.Annotation[][] annotationArr = parameterAnnotations;
                int length2 = annotationArr.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    java.lang.annotation.Annotation[] annotationArr2 = annotationArr[i3];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(annotationArr2);
                    int length3 = annotationArr2.length;
                    int i4 = 0;
                    while (i4 < length3) {
                        java.lang.annotation.Annotation annotation2 = annotationArr2[i4];
                        java.lang.Class<?> javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation2));
                        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(javaClass);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(annotation2);
                        java.lang.reflect.Method[] methodArr2 = declaredMethods;
                        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation = visitMethod.visitParameterAnnotation(i3, classId, new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource(annotation2));
                        if (visitParameterAnnotation != null) {
                            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(visitParameterAnnotation, annotation2, javaClass);
                        }
                        i4++;
                        declaredMethods = methodArr2;
                    }
                }
                methodArr = declaredMethods;
                visitMethod.visitEnd();
            } else {
                methodArr = declaredMethods;
            }
            i2++;
            declaredMethods = methodArr;
        }
        java.lang.reflect.Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredConstructors, "");
        int length4 = declaredConstructors.length;
        int i5 = 0;
        while (i5 < length4) {
            java.lang.reflect.Constructor<?> constructor = declaredConstructors[i5];
            kotlin.reflect.jvm.internal.impl.name.Name name2 = kotlin.reflect.jvm.internal.impl.name.SpecialNames.INIT;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer signatureSerializer2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(constructor);
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor visitMethod2 = memberVisitor.visitMethod(name2, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer.getHighSpeedVideoFpsRangesFor(constructor));
            if (visitMethod2 != null) {
                java.lang.annotation.Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredAnnotations2, "");
                for (java.lang.annotation.Annotation annotation3 : declaredAnnotations2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(annotation3);
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure.Camera2StreamConfigurationMap(visitMethod2, annotation3);
                }
                java.lang.annotation.Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                kotlin.jvm.internal.Intrinsics.checkNotNull(parameterAnnotations2);
                java.lang.annotation.Annotation[][] annotationArr3 = parameterAnnotations2;
                if (annotationArr3.length != 0) {
                    int length5 = constructor.getParameterTypes().length;
                    int length6 = annotationArr3.length;
                    int length7 = annotationArr3.length;
                    for (int i6 = 0; i6 < length7; i6++) {
                        java.lang.annotation.Annotation[] annotationArr4 = parameterAnnotations2[i6];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(annotationArr4);
                        int length8 = annotationArr4.length;
                        int i7 = 0;
                        while (i7 < length8) {
                            java.lang.annotation.Annotation annotation4 = annotationArr4[i7];
                            java.lang.reflect.Constructor<?>[] constructorArr2 = declaredConstructors;
                            java.lang.Class<?> javaClass2 = kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation4));
                            int i8 = length4;
                            kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(javaClass2);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation4);
                            java.lang.annotation.Annotation[][] annotationArr5 = parameterAnnotations2;
                            int i9 = length5;
                            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitParameterAnnotation2 = visitMethod2.visitParameterAnnotation(i6 + (length5 - length6), classId2, new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource(annotation4));
                            if (visitParameterAnnotation2 != null) {
                                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(visitParameterAnnotation2, annotation4, javaClass2);
                            }
                            i7++;
                            length4 = i8;
                            declaredConstructors = constructorArr2;
                            parameterAnnotations2 = annotationArr5;
                            length5 = i9;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                i = length4;
                visitMethod2.visitEnd();
            } else {
                constructorArr = declaredConstructors;
                i = length4;
            }
            i5++;
            length4 = i;
            declaredConstructors = constructorArr;
        }
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredFields, "");
        for (java.lang.reflect.Field field : declaredFields) {
            kotlin.reflect.jvm.internal.impl.name.Name identifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(field.getName());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier2, "");
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer signatureSerializer3 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(field);
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor visitField = memberVisitor.visitField(identifier2, kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer.getHighSpeedVideoFpsRanges(field), null);
            if (visitField != null) {
                java.lang.annotation.Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredAnnotations3, "");
                for (java.lang.annotation.Annotation annotation5 : declaredAnnotations3) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(annotation5);
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure.Camera2StreamConfigurationMap(visitField, annotation5);
                }
                visitField.visitEnd();
            }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass) obj).getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(this.getHighSpeedVideoSizes);
        return sb.toString();
    }

    public /* synthetic */ ReflectKotlinClass(java.lang.Class cls, kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader kotlinClassHeader, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, kotlinClassHeader);
    }
}
