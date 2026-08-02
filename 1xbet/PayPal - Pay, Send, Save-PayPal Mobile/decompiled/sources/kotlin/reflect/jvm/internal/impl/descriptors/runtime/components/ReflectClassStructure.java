package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
final class ReflectClassStructure {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectClassStructure();

    private ReflectClassStructure() {
    }

    public static void Camera2StreamConfigurationMap(java.lang.Class<?> cls, kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationVisitor, "");
        java.lang.annotation.Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "");
        for (java.lang.annotation.Annotation annotation : declaredAnnotations) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(annotation);
            Camera2StreamConfigurationMap(annotationVisitor, annotation);
        }
        annotationVisitor.visitEnd();
    }

    static void Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, java.lang.annotation.Annotation annotation) {
        java.lang.Class<?> javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation));
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = annotationVisitor.visitAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(javaClass), new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource(annotation));
        if (visitAnnotation != null) {
            getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(visitAnnotation, annotation, javaClass);
        }
    }

    final void Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, java.lang.annotation.Annotation annotation, java.lang.Class<?> cls) {
        java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredMethods, "");
        for (java.lang.reflect.Method method : declaredMethods) {
            try {
                java.lang.Object invoke = method.invoke(annotation, new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNull(invoke);
                kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(method.getName());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
                getHighSpeedVideoSizes(annotationArgumentVisitor, identifier, invoke);
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }

    private static kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue getHighSpeedVideoFpsRangesFor(java.lang.Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cls, "");
        }
        if (cls.isPrimitive()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Void.TYPE)) {
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.unit.toSafe()), i);
            }
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(primitiveType, "");
            if (i > 0) {
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(primitiveType.getArrayTypeFqName()), i - 1);
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue(kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(primitiveType.getTypeFqName()), i);
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(cls);
        kotlin.reflect.jvm.internal.impl.name.ClassId mapJavaToKotlin = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(classId.asSingleFqName());
        if (mapJavaToKotlin != null) {
            classId = mapJavaToKotlin;
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue(classId, i);
    }

    private final void getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, kotlin.reflect.jvm.internal.impl.name.Name name2, java.lang.Object obj) {
        java.util.Set set;
        java.lang.Class<?> cls = obj.getClass();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Class.class)) {
            set = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassKt.getHighSpeedVideoFpsRanges;
            if (set.contains(cls)) {
                annotationArgumentVisitor.visit(name2, obj);
                return;
            }
            if (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(cls)) {
                if (!cls.isEnum()) {
                    cls = cls.getEnclosingClass();
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
                kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(cls);
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(((java.lang.Enum) obj).name());
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
                annotationArgumentVisitor.visitEnum(name2, classId, identifier);
                return;
            }
            if (java.lang.annotation.Annotation.class.isAssignableFrom(cls)) {
                java.lang.Class<?>[] interfaces = cls.getInterfaces();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interfaces, "");
                java.lang.Class<?> cls2 = (java.lang.Class) kotlin.collections.ArraysKt.single(interfaces);
                kotlin.jvm.internal.Intrinsics.checkNotNull(cls2);
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation = annotationArgumentVisitor.visitAnnotation(name2, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(cls2));
                if (visitAnnotation != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    Camera2StreamConfigurationMap(visitAnnotation, (java.lang.annotation.Annotation) obj, cls2);
                    return;
                }
                return;
            }
            if (cls.isArray()) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray = annotationArgumentVisitor.visitArray(name2);
                if (visitArray == null) {
                    return;
                }
                java.lang.Class<?> componentType = cls.getComponentType();
                int i = 0;
                if (componentType.isEnum()) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(componentType);
                    kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(componentType);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    java.lang.Object[] objArr = (java.lang.Object[]) obj;
                    int length = objArr.length;
                    while (i < length) {
                        java.lang.Object obj2 = objArr[i];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        kotlin.reflect.jvm.internal.impl.name.Name identifier2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(((java.lang.Enum) obj2).name());
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier2, "");
                        visitArray.visitEnum(classId2, identifier2);
                        i++;
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(componentType, java.lang.Class.class)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
                    int length2 = objArr2.length;
                    while (i < length2) {
                        java.lang.Object obj3 = objArr2[i];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
                        visitArray.visitClassLiteral(getHighSpeedVideoFpsRangesFor((java.lang.Class) obj3));
                        i++;
                    }
                } else if (java.lang.annotation.Annotation.class.isAssignableFrom(componentType)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    java.lang.Object[] objArr3 = (java.lang.Object[]) obj;
                    int length3 = objArr3.length;
                    while (i < length3) {
                        java.lang.Object obj4 = objArr3[i];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(componentType);
                        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation2 = visitArray.visitAnnotation(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getClassId(componentType));
                        if (visitAnnotation2 != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "");
                            Camera2StreamConfigurationMap(visitAnnotation2, (java.lang.annotation.Annotation) obj4, componentType);
                        }
                        i++;
                    }
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                    java.lang.Object[] objArr4 = (java.lang.Object[]) obj;
                    int length4 = objArr4.length;
                    while (i < length4) {
                        visitArray.visit(objArr4[i]);
                        i++;
                    }
                }
                visitArray.visitEnd();
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported annotation argument value (");
            sb.append(cls);
            sb.append("): ");
            sb.append(obj);
            throw new java.lang.UnsupportedOperationException(sb.toString());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        annotationArgumentVisitor.visitClassLiteral(name2, getHighSpeedVideoFpsRangesFor((java.lang.Class) obj));
    }
}
