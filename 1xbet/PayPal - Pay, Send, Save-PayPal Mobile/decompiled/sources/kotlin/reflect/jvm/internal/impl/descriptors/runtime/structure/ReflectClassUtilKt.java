package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
public final class ReflectClassUtilKt {
    private static final java.util.Map<java.lang.Class<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> Camera2StreamConfigurationMap;
    private static final java.util.Map<java.lang.Class<? extends java.lang.Object>, java.lang.Class<? extends java.lang.Object>> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map<java.lang.Class<? extends kotlin.Function<?>>, java.lang.Integer> getHighSpeedVideoFpsRangesFor;
    private static final java.util.List<kotlin.reflect.KClass<? extends java.lang.Object>> getHighSpeedVideoSizes;

    public static final java.lang.ClassLoader getSafeClassLoader(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        java.lang.ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        java.lang.ClassLoader systemClassLoader = java.lang.ClassLoader.getSystemClassLoader();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(systemClassLoader, "");
        return systemClassLoader;
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return java.lang.Enum.class.isAssignableFrom(cls);
    }

    static {
        int i = 0;
        java.util.List<kotlin.reflect.KClass<? extends java.lang.Object>> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Boolean.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Byte.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Character.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Double.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Float.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Long.TYPE), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Short.TYPE)});
        getHighSpeedVideoSizes = listOf;
        java.util.List<kotlin.reflect.KClass<? extends java.lang.Object>> list = listOf;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.reflect.KClass kClass = (kotlin.reflect.KClass) it.next();
            arrayList.add(kotlin.TuplesKt.to(kotlin.jvm.JvmClassMappingKt.getJavaObjectType(kClass), kotlin.jvm.JvmClassMappingKt.getJavaPrimitiveType(kClass)));
        }
        Camera2StreamConfigurationMap = kotlin.collections.MapsKt.toMap(arrayList);
        java.util.List<kotlin.reflect.KClass<? extends java.lang.Object>> list2 = getHighSpeedVideoSizes;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            kotlin.reflect.KClass kClass2 = (kotlin.reflect.KClass) it2.next();
            arrayList2.add(kotlin.TuplesKt.to(kotlin.jvm.JvmClassMappingKt.getJavaPrimitiveType(kClass2), kotlin.jvm.JvmClassMappingKt.getJavaObjectType(kClass2)));
        }
        getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.toMap(arrayList2);
        java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Class[]{kotlin.jvm.functions.Function0.class, kotlin.jvm.functions.Function1.class, kotlin.jvm.functions.Function2.class, kotlin.jvm.functions.Function3.class, kotlin.jvm.functions.Function4.class, kotlin.jvm.functions.Function5.class, kotlin.jvm.functions.Function6.class, kotlin.jvm.functions.Function7.class, kotlin.jvm.functions.Function8.class, kotlin.jvm.functions.Function9.class, kotlin.jvm.functions.Function10.class, kotlin.jvm.functions.Function11.class, kotlin.jvm.functions.Function12.class, kotlin.jvm.functions.Function13.class, kotlin.jvm.functions.Function14.class, kotlin.jvm.functions.Function15.class, kotlin.jvm.functions.Function16.class, kotlin.jvm.functions.Function17.class, kotlin.jvm.functions.Function18.class, kotlin.jvm.functions.Function19.class, kotlin.jvm.functions.Function20.class, kotlin.jvm.functions.Function21.class, kotlin.jvm.functions.Function22.class});
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf2, 10));
        for (java.lang.Object obj : listOf2) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            arrayList3.add(kotlin.TuplesKt.to((java.lang.Class) obj, java.lang.Integer.valueOf(i)));
            i++;
        }
        getHighSpeedVideoFpsRangesFor = kotlin.collections.MapsKt.toMap(arrayList3);
    }

    public static final java.lang.Class<?> getPrimitiveByWrapper(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return Camera2StreamConfigurationMap.get(cls);
    }

    public static final java.lang.Class<?> getWrapperByPrimitive(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return getHighResolutionOutputSizeshNQ4ISI.get(cls);
    }

    public static final java.lang.Integer getFunctionClassArity(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return getHighSpeedVideoFpsRangesFor.get(cls);
    }

    public static final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId(java.lang.Class<?> cls) {
        kotlin.reflect.jvm.internal.impl.name.ClassId classId;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        if (cls.isPrimitive()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for primitive type: ".concat(java.lang.String.valueOf(cls)));
        }
        if (cls.isArray()) {
            throw new java.lang.IllegalArgumentException("Can't compute ClassId for array type: ".concat(java.lang.String.valueOf(cls)));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            java.lang.String simpleName = cls.getSimpleName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(simpleName, "");
            if (simpleName.length() != 0) {
                java.lang.Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (classId = getClassId(declaringClass)) != null) {
                    kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(cls.getSimpleName());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
                    kotlin.reflect.jvm.internal.impl.name.ClassId createNestedClassId = classId.createNestedClassId(identifier);
                    if (createNestedClassId != null) {
                        return createNestedClassId;
                    }
                }
                kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
                java.lang.String name2 = cls.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                return companion.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName(name2));
            }
        }
        java.lang.String name3 = cls.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = new kotlin.reflect.jvm.internal.impl.name.FqName(name3);
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(fqName.parent(), kotlin.reflect.jvm.internal.impl.name.FqName.Companion.topLevel(fqName.shortName()), true);
    }

    public static final java.lang.String getDesc(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                java.lang.String name2 = cls.getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                return kotlin.text.StringsKt.replace$default(name2, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 4, (java.lang.Object) null);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("L");
            java.lang.String name3 = cls.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
            sb.append(kotlin.text.StringsKt.replace$default(name3, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR, kotlinx.io.files.FileSystemKt.UnixPathSeparator, false, 4, (java.lang.Object) null));
            sb.append(';');
            return sb.toString();
        }
        java.lang.String name4 = cls.getName();
        if (name4 != null) {
            switch (name4.hashCode()) {
                case -1325958191:
                    if (name4.equals(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_DOUBLE)) {
                        return "D";
                    }
                    break;
                case 104431:
                    if (name4.equals(com.adobe.marketing.mobile.launch.rulesengine.LaunchRulesEngineConstants.Transform.TRANSFORM_TO_INT)) {
                        return com.visa.cbp.getEncExpo.warmup;
                    }
                    break;
                case 3039496:
                    if (name4.equals("byte")) {
                        return "B";
                    }
                    break;
                case 3052374:
                    if (name4.equals("char")) {
                        return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA;
                    }
                    break;
                case 3327612:
                    if (name4.equals(com.adjust.sdk.Constants.LONG)) {
                        return "J";
                    }
                    break;
                case 3625364:
                    if (name4.equals("void")) {
                        return "V";
                    }
                    break;
                case 64711720:
                    if (name4.equals(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_BOOLEAN)) {
                        return "Z";
                    }
                    break;
                case 97526364:
                    if (name4.equals(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_FLOAT)) {
                        return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER;
                    }
                    break;
                case 109413500:
                    if (name4.equals("short")) {
                        return "S";
                    }
                    break;
            }
        }
        throw new java.lang.IllegalArgumentException("Unsupported primitive type: ".concat(java.lang.String.valueOf(cls)));
    }

    public static final java.util.List<java.lang.reflect.Type> getParameterizedTypeArguments(java.lang.reflect.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (!(type instanceof java.lang.reflect.ParameterizedType)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.lang.reflect.ParameterizedType parameterizedType = (java.lang.reflect.ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.flatMap(kotlin.sequences.SequencesKt.generateSequence(type, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.Camera2StreamConfigurationMap((java.lang.reflect.ParameterizedType) obj);
                }
            }), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt$$Lambda$1
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getHighSpeedVideoSizes((java.lang.reflect.ParameterizedType) obj);
                }
            }));
        }
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "");
        return kotlin.collections.ArraysKt.toList(actualTypeArguments);
    }

    static /* synthetic */ java.lang.reflect.ParameterizedType Camera2StreamConfigurationMap(java.lang.reflect.ParameterizedType parameterizedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterizedType, "");
        java.lang.reflect.Type ownerType = parameterizedType.getOwnerType();
        if (ownerType instanceof java.lang.reflect.ParameterizedType) {
            return (java.lang.reflect.ParameterizedType) ownerType;
        }
        return null;
    }

    static /* synthetic */ kotlin.sequences.Sequence getHighSpeedVideoSizes(java.lang.reflect.ParameterizedType parameterizedType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterizedType, "");
        java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "");
        return kotlin.collections.ArraysKt.asSequence(actualTypeArguments);
    }
}
