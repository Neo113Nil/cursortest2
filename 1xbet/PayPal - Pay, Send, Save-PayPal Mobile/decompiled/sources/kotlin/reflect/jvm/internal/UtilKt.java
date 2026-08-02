package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000Ø\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u00020\u0006H\u0000\u001a$\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0000\u001a.\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a\u0014\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0005*\u0006\u0012\u0002\b\u00030\u0005H\u0000\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\u0014*\u00020\u0015H\u0000\u001a\u0012\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\u00020\u0019H\u0000\u001a\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017*\b\u0012\u0004\u0012\u00020\u00180\u0017\u001a\u000e\u0010\u001b\u001a\u0004\u0018\u00010\u0018*\u00020\u001cH\u0002\u001a\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e*\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\u000f\u001a\u00020\nH\u0002\u001a\u0016\u0010 \u001a\u0004\u0018\u00010\u001e*\u00020!2\u0006\u0010\u000f\u001a\u00020\nH\u0002\u001a%\u0010\"\u001a\u0002H#\"\u0004\b\u0000\u0010#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H#0%H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010&\u001a\u0010\u0010'\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\u001eH\u0000\u001a\u0014\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010**\u0004\u0018\u00010\u001eH\u0000\u001a\u0014\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010,*\u0004\u0018\u00010\u001eH\u0000\u001al\u00102\u001a\u0002H3\"\b\b\u0000\u00104*\u000205\"\b\b\u0001\u00103*\u00020/2\n\u00106\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u00107\u001a\u0002H42\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u001d\u0010>\u001a\u0019\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u0002H4\u0012\u0004\u0012\u0002H30?¢\u0006\u0002\bAH\u0000¢\u0006\u0002\u0010B\u001a\u0012\u0010I\u001a\u0004\u0018\u00010\u001e2\u0006\u0010J\u001a\u00020KH\u0000\u001a;\u0010L\u001a\u0004\u0018\u00010M*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010N\u001a\u00020\b2\u001a\u0010O\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050P\"\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0002\u0010Q\u001a\u001a\u0010R\u001a\u0004\u0018\u00010S*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010N\u001a\u00020\bH\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u001a\u0010-\u001a\u0004\u0018\u00010.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0018\u0010C\u001a\u00020D*\u00020E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010F\"\u0018\u0010G\u001a\u00020D*\u00020E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010F\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006T"}, d2 = {"JVM_STATIC", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "toJavaClass", "Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "SUSPEND_FUNCTION_PREFIX", "", "loadClass", "Ljava/lang/ClassLoader;", "kotlinClassId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "arrayDimensions", "", "classLoader", com.visa.cbp.ConsumerInfo.setSignature, "className", "createArrayType", "toKVisibility", "Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "computeAnnotations", "", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "unwrapRepeatableAnnotations", "toAnnotationInstance", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "toRuntimeValue", "", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "arrayToRuntimeValue", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;", "reflectionCall", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "asReflectFunction", "Lkotlin/reflect/jvm/internal/ReflectKFunction;", "asReflectProperty", "Lkotlin/reflect/jvm/internal/ReflectKProperty;", "asReflectCallable", "Lkotlin/reflect/jvm/internal/ReflectKCallable;", "instanceReceiverParameter", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "deserializeToDescriptor", "D", "M", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "moduleAnchor", "proto", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "metadataVersion", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "createDescriptor", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "isInlineClassType", "", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KType;)Z", "needsMultiFieldValueClassFlattening", "getNeedsMultiFieldValueClassFlattening", "defaultPrimitiveValue", "type", "Ljava/lang/reflect/Type;", "getDeclaredMethodOrNull", "Ljava/lang/reflect/Method;", "name", "parameterTypes", "", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "getDeclaredFieldOrNull", "Ljava/lang/reflect/Field;", "kotlin-reflection"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UtilKt {
    private static final kotlin.reflect.jvm.internal.impl.name.FqName Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.JvmStatic");
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;

    static {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction.INSTANCE.getPackageFqName().asString());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction.INSTANCE.getClassNamePrefix());
        getHighSpeedVideoFpsRangesFor = sb.toString();
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getJVM_STATIC() {
        return Camera2StreamConfigurationMap;
    }

    public static final java.lang.Class<?> toJavaClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = classDescriptor.getSource();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(source, "");
        if (source instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass binaryClass = ((kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement) source).getBinaryClass();
            kotlin.jvm.internal.Intrinsics.checkNotNull(binaryClass, "");
            return ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass) binaryClass).getKlass();
        }
        if (source instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory.RuntimeSourceElement) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement javaElement = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
            kotlin.jvm.internal.Intrinsics.checkNotNull(javaElement, "");
            return ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass) javaElement).getElement();
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId == null) {
            return null;
        }
        return loadClass$default(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(classDescriptor.getClass()), classId, 0, 2, null);
    }

    public static /* synthetic */ java.lang.Class loadClass$default(java.lang.ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.ClassId classId, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return loadClass(classLoader, classId, i);
    }

    public static final java.lang.Class<?> loadClass(java.lang.ClassLoader classLoader, kotlin.reflect.jvm.internal.impl.name.ClassId classId, int i) {
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe unsafe;
        while (true) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classLoader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
            unsafe = classId.asSingleFqName().toUnsafe();
            java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(kotlin.text.StringsKt.substringAfter$default(unsafe.asString(), getHighSpeedVideoFpsRangesFor, (java.lang.String) null, 2, (java.lang.Object) null));
            if (intOrNull == null) {
                break;
            }
            classId = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function.INSTANCE.numberedClassId(intOrNull.intValue() + 1);
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId mapKotlinToJava = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(unsafe);
        if (mapKotlinToJava == null) {
            mapKotlinToJava = classId;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(mapKotlinToJava, classId)) {
            classLoader = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getSafeClassLoader(kotlin.Unit.class);
        }
        java.lang.String asString = mapKotlinToJava.getPackageFqName().asString();
        java.lang.String asString2 = mapKotlinToJava.getRelativeClassName().asString();
        if (kotlin.jvm.internal.Intrinsics.areEqual(asString, "kotlin")) {
            switch (asString2.hashCode()) {
                case -901856463:
                    if (asString2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (asString2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (asString2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (asString2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (asString2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (asString2.equals("Array")) {
                        return java.lang.Object[].class;
                    }
                    break;
                case 601811914:
                    if (asString2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (asString2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (asString2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (asString.length() > 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(asString);
            sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb.append(sb2.toString());
        }
        sb.append(kotlin.text.StringsKt.replace$default(asString2, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlin.text.Typography.dollar, false, 4, (java.lang.Object) null));
        if (i > 0) {
            sb.append(";");
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt.tryLoadClass(classLoader, sb.toString());
    }

    public static final java.lang.Class<?> createArrayType(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return java.lang.reflect.Array.newInstance(cls, 0).getClass();
    }

    public static final kotlin.reflect.KVisibility toKVisibility(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorVisibility, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC)) {
            return kotlin.reflect.KVisibility.PUBLIC;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PROTECTED)) {
            return kotlin.reflect.KVisibility.PROTECTED;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INTERNAL)) {
            return kotlin.reflect.KVisibility.INTERNAL;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PRIVATE) || kotlin.jvm.internal.Intrinsics.areEqual(descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PRIVATE_TO_THIS)) {
            return kotlin.reflect.KVisibility.PRIVATE;
        }
        return null;
    }

    public static final java.util.List<java.lang.annotation.Annotation> computeAnnotations(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated annotated) {
        java.lang.annotation.Annotation highSpeedVideoFpsRanges;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotated, "");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = annotated.getAnnotations();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor : annotations) {
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = annotationDescriptor.getSource();
            if (source instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource) {
                highSpeedVideoFpsRanges = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource) source).getAnnotation();
            } else if (source instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory.RuntimeSourceElement) {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement javaElement = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation reflectJavaAnnotation = javaElement instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation) javaElement : null;
                highSpeedVideoFpsRanges = reflectJavaAnnotation != null ? reflectJavaAnnotation.getAnnotation() : null;
            } else {
                highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(annotationDescriptor);
            }
            if (highSpeedVideoFpsRanges != null) {
                arrayList.add(highSpeedVideoFpsRanges);
            }
        }
        return unwrapRepeatableAnnotations(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.util.List<java.lang.annotation.Annotation> unwrapRepeatableAnnotations(java.util.List<? extends java.lang.annotation.Annotation> list) {
        java.util.List listOf;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<? extends java.lang.annotation.Annotation> list2 = list;
        if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
            return list;
        }
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass((java.lang.annotation.Annotation) it.next())).getSimpleName(), androidx.compose.material3.internal.TextFieldImplKt.ContainerId)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.annotation.Annotation annotation : list2) {
                    java.lang.Class javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass(kotlin.jvm.JvmClassMappingKt.getAnnotationClass(annotation));
                    if (kotlin.jvm.internal.Intrinsics.areEqual(javaClass.getSimpleName(), androidx.compose.material3.internal.TextFieldImplKt.ContainerId) && javaClass.getAnnotation(kotlin.jvm.internal.RepeatableContainer.class) != null) {
                        java.lang.Object invoke = javaClass.getDeclaredMethod(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, new java.lang.Class[0]).invoke(annotation, new java.lang.Object[0]);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
                        listOf = kotlin.collections.ArraysKt.asList((java.lang.annotation.Annotation[]) invoke);
                    } else {
                        listOf = kotlin.collections.CollectionsKt.listOf(annotation);
                    }
                    kotlin.collections.CollectionsKt.addAll(arrayList, listOf);
                }
                return arrayList;
            }
        }
        return list;
    }

    private static final java.lang.annotation.Annotation getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor annotationClass = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        java.lang.Class<?> javaClass = annotationClass != null ? toJavaClass(annotationClass) : null;
        if (!(javaClass instanceof java.lang.Class)) {
            javaClass = null;
        }
        if (javaClass == null) {
            return null;
        }
        java.util.Set<java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>> entrySet = annotationDescriptor.getAllValueArguments().entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            kotlin.reflect.jvm.internal.impl.name.Name name2 = (kotlin.reflect.jvm.internal.impl.name.Name) entry.getKey();
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue constantValue = (kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) entry.getValue();
            java.lang.ClassLoader classLoader = javaClass.getClassLoader();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(classLoader, "");
            java.lang.Object Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(constantValue, classLoader);
            kotlin.Pair pair = Camera2StreamConfigurationMap2 != null ? kotlin.TuplesKt.to(name2.asString(), Camera2StreamConfigurationMap2) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (java.lang.annotation.Annotation) kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance$default(javaClass, kotlin.collections.MapsKt.toMap(arrayList), null, 4, null);
    }

    private static final java.lang.Object Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> constantValue, java.lang.ClassLoader classLoader) {
        if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue) {
            return getHighSpeedVideoFpsRanges(((kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue) constantValue).getValue());
        }
        if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) {
            return getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue) constantValue, classLoader);
        }
        if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) {
            kotlin.Pair<? extends kotlin.reflect.jvm.internal.impl.name.ClassId, ? extends kotlin.reflect.jvm.internal.impl.name.Name> value = ((kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) constantValue).getValue();
            kotlin.reflect.jvm.internal.impl.name.ClassId component1 = value.component1();
            kotlin.reflect.jvm.internal.impl.name.Name component2 = value.component2();
            java.lang.Class loadClass$default = loadClass$default(classLoader, component1, 0, 2, null);
            if (loadClass$default != null) {
                return kotlin.reflect.jvm.internal.Util.getHighResolutionOutputSizeshNQ4ISI(loadClass$default, component2.asString());
            }
            return null;
        }
        if (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value value2 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue) constantValue).getValue();
            if (value2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) {
                kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass normalClass = (kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.NormalClass) value2;
                return loadClass(classLoader, normalClass.getClassId(), normalClass.getArrayDimensions());
            }
            if (!(value2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value.LocalClass) value2).getType().getConstructor().mo23898getDeclarationDescriptor();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor : null;
            if (classDescriptor != null) {
                return toJavaClass(classDescriptor);
            }
            return null;
        }
        if ((constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue) || (constantValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue)) {
            return null;
        }
        return constantValue.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue arrayValue, java.lang.ClassLoader classLoader) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        java.lang.Class loadClass$default;
        kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue typedArrayValue = arrayValue instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue ? (kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue) arrayValue : null;
        if (typedArrayValue == null || (type = typedArrayValue.getType()) == null) {
            return null;
        }
        java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> value = arrayValue.getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(value, 10));
        java.util.Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue) it.next(), classLoader));
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveArrayElementType = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.getPrimitiveArrayElementType(type);
        int i = 0;
        switch (primitiveArrayElementType == null ? -1 : kotlin.reflect.jvm.internal.UtilKt.WhenMappings.$EnumSwitchMapping$0[primitiveArrayElementType.ordinal()]) {
            case -1:
                if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(type)) {
                    throw new java.lang.IllegalStateException("Not an array type: ".concat(java.lang.String.valueOf(type)).toString());
                }
                kotlin.reflect.jvm.internal.impl.types.KotlinType type2 = ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.single((java.util.List) type.getArguments())).getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type2, "");
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = type2.getConstructor().mo23898getDeclarationDescriptor();
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor : null;
                if (classDescriptor == null) {
                    throw new java.lang.IllegalStateException("Not a class type: ".concat(java.lang.String.valueOf(type2)).toString());
                }
                if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(type2)) {
                    int size = arrayValue.getValue().size();
                    java.lang.String[] strArr = new java.lang.String[size];
                    while (i < size) {
                        java.lang.Object obj = arrayList2.get(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                        strArr[i] = obj;
                        i++;
                    }
                    return strArr;
                }
                if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isKClass(classDescriptor)) {
                    int size2 = arrayValue.getValue().size();
                    java.lang.Class[] clsArr = new java.lang.Class[size2];
                    while (i < size2) {
                        java.lang.Object obj2 = arrayList2.get(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        clsArr[i] = obj2;
                        i++;
                    }
                    return clsArr;
                }
                kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(classDescriptor);
                if (classId == null || (loadClass$default = loadClass$default(classLoader, classId, 0, 2, null)) == null) {
                    return null;
                }
                java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) loadClass$default, arrayValue.getValue().size());
                kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "");
                java.lang.Object[] objArr = (java.lang.Object[]) newInstance;
                int size3 = arrayList2.size();
                while (i < size3) {
                    objArr[i] = arrayList2.get(i);
                    i++;
                }
                return objArr;
            case 0:
            default:
                throw new kotlin.NoWhenBranchMatchedException();
            case 1:
                int size4 = arrayValue.getValue().size();
                boolean[] zArr = new boolean[size4];
                while (i < size4) {
                    java.lang.Object obj3 = arrayList2.get(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj3, "");
                    zArr[i] = ((java.lang.Boolean) obj3).booleanValue();
                    i++;
                }
                return zArr;
            case 2:
                int size5 = arrayValue.getValue().size();
                char[] cArr = new char[size5];
                while (i < size5) {
                    java.lang.Object obj4 = arrayList2.get(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj4, "");
                    cArr[i] = ((java.lang.Character) obj4).charValue();
                    i++;
                }
                return cArr;
            case 3:
                int size6 = arrayValue.getValue().size();
                byte[] bArr = new byte[size6];
                while (i < size6) {
                    java.lang.Object obj5 = arrayList2.get(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj5, "");
                    bArr[i] = ((java.lang.Byte) obj5).byteValue();
                    i++;
                }
                return bArr;
            case 4:
                int size7 = arrayValue.getValue().size();
                short[] sArr = new short[size7];
                while (i < size7) {
                    java.lang.Object obj6 = arrayList2.get(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj6, "");
                    sArr[i] = ((java.lang.Short) obj6).shortValue();
                    i++;
                }
                return sArr;
            case 5:
                int size8 = arrayValue.getValue().size();
                int[] iArr = new int[size8];
                while (i < size8) {
                    java.lang.Object obj7 = arrayList2.get(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj7, "");
                    iArr[i] = ((java.lang.Integer) obj7).intValue();
                    i++;
                }
                return iArr;
            case 6:
                int size9 = arrayValue.getValue().size();
                float[] fArr = new float[size9];
                while (i < size9) {
                    java.lang.Object obj8 = arrayList2.get(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj8, "");
                    fArr[i] = ((java.lang.Float) obj8).floatValue();
                    i++;
                }
                return fArr;
            case 7:
                int size10 = arrayValue.getValue().size();
                long[] jArr = new long[size10];
                while (i < size10) {
                    java.lang.Object obj9 = arrayList2.get(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj9, "");
                    jArr[i] = ((java.lang.Long) obj9).longValue();
                    i++;
                }
                return jArr;
            case 8:
                int size11 = arrayValue.getValue().size();
                double[] dArr = new double[size11];
                while (i < size11) {
                    java.lang.Object obj10 = arrayList2.get(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj10, "");
                    dArr[i] = ((java.lang.Double) obj10).doubleValue();
                    i++;
                }
                return dArr;
        }
    }

    public static final kotlin.reflect.jvm.internal.ReflectKFunction asReflectFunction(java.lang.Object obj) {
        if (obj instanceof kotlin.reflect.jvm.internal.ReflectKFunction) {
            return (kotlin.reflect.jvm.internal.ReflectKFunction) obj;
        }
        if (!(obj instanceof kotlin.jvm.internal.FunctionReference)) {
            return null;
        }
        kotlin.reflect.KCallable compute = ((kotlin.jvm.internal.FunctionReference) obj).compute();
        if (compute instanceof kotlin.reflect.jvm.internal.ReflectKFunction) {
            return (kotlin.reflect.jvm.internal.ReflectKFunction) compute;
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.ReflectKProperty<?> asReflectProperty(java.lang.Object obj) {
        if (obj instanceof kotlin.reflect.jvm.internal.ReflectKProperty) {
            return (kotlin.reflect.jvm.internal.ReflectKProperty) obj;
        }
        if (!(obj instanceof kotlin.jvm.internal.PropertyReference)) {
            return null;
        }
        kotlin.reflect.KCallable compute = ((kotlin.jvm.internal.PropertyReference) obj).compute();
        if (compute instanceof kotlin.reflect.jvm.internal.ReflectKProperty) {
            return (kotlin.reflect.jvm.internal.ReflectKProperty) compute;
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.ReflectKCallable<?> asReflectCallable(java.lang.Object obj) {
        if (obj instanceof kotlin.reflect.jvm.internal.ReflectKCallable) {
            return (kotlin.reflect.jvm.internal.ReflectKCallable) obj;
        }
        if (!(obj instanceof kotlin.jvm.internal.CallableReference)) {
            return null;
        }
        kotlin.reflect.KCallable compute = ((kotlin.jvm.internal.CallableReference) obj).compute();
        if (compute instanceof kotlin.reflect.jvm.internal.ReflectKCallable) {
            return (kotlin.reflect.jvm.internal.ReflectKCallable) compute;
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getInstanceReceiverParameter(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        if (callableDescriptor.getDispatchReceiverParameter() == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration, "");
        return ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration).getThisAsReceiverParameter();
    }

    public static final <M extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> D deserializeToDescriptor(java.lang.Class<?> cls, M m, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer, ? super M, ? extends D> function2) {
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> typeParameterList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeTable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData orCreateModule = kotlin.reflect.jvm.internal.ModuleByClassLoaderKt.getOrCreateModule(cls);
        if (m instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) {
            typeParameterList = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) m).getTypeParameterList();
        } else {
            if (!(m instanceof kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property)) {
                throw new java.lang.IllegalStateException("Unsupported message: ".concat(java.lang.String.valueOf(m)).toString());
            }
            typeParameterList = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) m).getTypeParameterList();
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter> list = typeParameterList;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents deserialization = orCreateModule.getDeserialization();
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor module = orCreateModule.getModule();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable empty = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion.getEMPTY();
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        return function2.invoke(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer(new kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext(deserialization, nameResolver, module, typeTable, empty, binaryVersion, null, null, list)), m);
    }

    public static final boolean isInlineClassType(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        kotlin.reflect.KClassifier classifier = kType.getClassifier();
        kotlin.reflect.jvm.internal.KClassImpl kClassImpl = classifier instanceof kotlin.reflect.jvm.internal.KClassImpl ? (kotlin.reflect.jvm.internal.KClassImpl) classifier : null;
        return kClassImpl != null && kClassImpl.isInline$kotlin_reflection();
    }

    public static final boolean getNeedsMultiFieldValueClassFlattening(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        kotlin.reflect.KClassifier classifier = kType.getClassifier();
        kotlin.reflect.jvm.internal.KClassImpl kClassImpl = classifier instanceof kotlin.reflect.jvm.internal.KClassImpl ? (kotlin.reflect.jvm.internal.KClassImpl) classifier : null;
        return (kClassImpl == null || !kClassImpl.isValue() || kClassImpl.isInline$kotlin_reflection()) ? false : true;
    }

    public static final java.lang.Object defaultPrimitiveValue(java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (!(type instanceof java.lang.Class)) {
            return null;
        }
        java.lang.Class cls = (java.lang.Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Boolean.TYPE)) {
            return java.lang.Boolean.FALSE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Character.TYPE)) {
            return (char) 0;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Byte.TYPE)) {
            return (byte) 0;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Short.TYPE)) {
            return (short) 0;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Integer.TYPE)) {
            return 0;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Float.TYPE)) {
            return java.lang.Float.valueOf(0.0f);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Long.TYPE)) {
            return 0L;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Double.TYPE)) {
            return java.lang.Double.valueOf(0.0d);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(cls, java.lang.Void.TYPE)) {
            throw new java.lang.IllegalStateException("Parameter with void type is illegal");
        }
        throw new java.lang.UnsupportedOperationException("Unknown primitive: ".concat(java.lang.String.valueOf(type)));
    }

    public static final java.lang.reflect.Method getDeclaredMethodOrNull(java.lang.Class<?> cls, java.lang.String str, java.lang.Class<?>... clsArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clsArr, "");
        try {
            return cls.getDeclaredMethod(str, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    public static final java.lang.reflect.Field getDeclaredFieldOrNull(java.lang.Class<?> cls, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            return null;
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.CHAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.BYTE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.SHORT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.INT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.LONG.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
