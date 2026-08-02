package kotlin.reflect.jvm.internal.impl.builtins.jvm;

/* loaded from: classes5.dex */
public final class JavaToKotlinClassMap {
    private static final kotlin.reflect.jvm.internal.impl.name.FqName Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap INSTANCE;
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId getHighResolutionOutputSizeshNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoFpsRanges;
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoFpsRangesFor;
    private static final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoSizes;
    private static final java.lang.String getHighSpeedVideoSizesFor;
    private static final java.lang.String getInputFormats;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.ClassId> getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.name.ClassId> getOutputMinFrameDurationlomOqCM;
    private static final java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> getOutputSizes;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping> getOutputSizeshNQ4ISI;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.FqName> getOutputStallDuration;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.ClassId> getOutputStallDurationlomOqCM;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.ClassId, kotlin.reflect.jvm.internal.impl.name.ClassId> isOutputSupportedFor;
    private static final java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.FqName> unwrapAs;

    private JavaToKotlinClassMap() {
    }

    static {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function.INSTANCE.getPackageFqName());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function.INSTANCE.getClassNamePrefix());
        getInputFormats = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KFunction.INSTANCE.getPackageFqName());
        sb2.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb2.append(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KFunction.INSTANCE.getClassNamePrefix());
        getHighSpeedVideoSizesFor = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction.INSTANCE.getPackageFqName());
        sb3.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb3.append(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction.INSTANCE.getClassNamePrefix());
        getInputSizeshNQ4ISI = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KSuspendFunction.INSTANCE.getPackageFqName());
        sb4.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb4.append(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KSuspendFunction.INSTANCE.getClassNamePrefix());
        getOutputMinFrameDuration = sb4.toString();
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.functions.FunctionN"));
        getHighSpeedVideoSizes = classId;
        Camera2StreamConfigurationMap = classId.asSingleFqName();
        getHighSpeedVideoFpsRanges = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getKFunction();
        getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.name.StandardClassIds.INSTANCE.getKClass();
        getHighResolutionOutputSizeshNQ4ISI = javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.lang.Class.class);
        java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.ClassId> hashMap = new java.util.HashMap<>();
        getOutputFormats = hashMap;
        java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.ClassId> hashMap2 = new java.util.HashMap<>();
        getOutputStallDurationlomOqCM = hashMap2;
        getOutputStallDuration = new java.util.HashMap<>();
        unwrapAs = new java.util.HashMap<>();
        getOutputMinFrameDurationlomOqCM = new java.util.HashMap<>();
        isOutputSupportedFor = new java.util.HashMap<>();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        getOutputSizes = linkedHashSet;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.iterable);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.lang.Iterable.class), classId2, new kotlin.reflect.jvm.internal.impl.name.ClassId(classId2.getPackageFqName(), kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableIterable, classId2.getPackageFqName()), false));
        kotlin.reflect.jvm.internal.impl.name.ClassId classId3 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.iterator);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping2 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.util.Iterator.class), classId3, new kotlin.reflect.jvm.internal.impl.name.ClassId(classId3.getPackageFqName(), kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableIterator, classId3.getPackageFqName()), false));
        kotlin.reflect.jvm.internal.impl.name.ClassId classId4 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.collection);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping3 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.util.Collection.class), classId4, new kotlin.reflect.jvm.internal.impl.name.ClassId(classId4.getPackageFqName(), kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableCollection, classId4.getPackageFqName()), false));
        kotlin.reflect.jvm.internal.impl.name.ClassId classId5 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.list);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping4 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.util.List.class), classId5, new kotlin.reflect.jvm.internal.impl.name.ClassId(classId5.getPackageFqName(), kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableList, classId5.getPackageFqName()), false));
        kotlin.reflect.jvm.internal.impl.name.ClassId classId6 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.set);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping5 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.util.Set.class), classId6, new kotlin.reflect.jvm.internal.impl.name.ClassId(classId6.getPackageFqName(), kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableSet, classId6.getPackageFqName()), false));
        kotlin.reflect.jvm.internal.impl.name.ClassId classId7 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.listIterator);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping6 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.util.ListIterator.class), classId7, new kotlin.reflect.jvm.internal.impl.name.ClassId(classId7.getPackageFqName(), kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableListIterator, classId7.getPackageFqName()), false));
        kotlin.reflect.jvm.internal.impl.name.ClassId classId8 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.map);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping7 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.util.Map.class), classId8, new kotlin.reflect.jvm.internal.impl.name.ClassId(classId8.getPackageFqName(), kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableMap, classId8.getPackageFqName()), false));
        kotlin.reflect.jvm.internal.impl.name.ClassId createNestedClassId = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.map).createNestedClassId(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mapEntry.shortName());
        java.util.List<kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping[]{platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping(javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.util.Map.Entry.class), createNestedClassId, new kotlin.reflect.jvm.internal.impl.name.ClassId(createNestedClassId.getPackageFqName(), kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt.tail(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.mutableMapEntry, createNestedClassId.getPackageFqName()), false))});
        getOutputSizeshNQ4ISI = listOf;
        kotlin.reflect.jvm.internal.impl.name.FqName safe = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.any.toSafe();
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI = javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.lang.Object.class);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId9 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(safe);
        hashMap.put(highResolutionOutputSizeshNQ4ISI.asSingleFqName().toUnsafe(), classId9);
        kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName = classId9.asSingleFqName();
        linkedHashSet.add(asSingleFqName);
        hashMap2.put(asSingleFqName.toUnsafe(), highResolutionOutputSizeshNQ4ISI);
        kotlin.reflect.jvm.internal.impl.name.FqName safe2 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.string.toSafe();
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI2 = javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.lang.String.class);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId10 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(safe2);
        hashMap.put(highResolutionOutputSizeshNQ4ISI2.asSingleFqName().toUnsafe(), classId10);
        kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName2 = classId10.asSingleFqName();
        linkedHashSet.add(asSingleFqName2);
        hashMap2.put(asSingleFqName2.toUnsafe(), highResolutionOutputSizeshNQ4ISI2);
        kotlin.reflect.jvm.internal.impl.name.FqName safe3 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.charSequence.toSafe();
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI3 = javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence.class);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId11 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(safe3);
        hashMap.put(highResolutionOutputSizeshNQ4ISI3.asSingleFqName().toUnsafe(), classId11);
        kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName3 = classId11.asSingleFqName();
        linkedHashSet.add(asSingleFqName3);
        hashMap2.put(asSingleFqName3.toUnsafe(), highResolutionOutputSizeshNQ4ISI3);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.throwable;
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI4 = javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.lang.Throwable.class);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId12 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(fqName);
        hashMap.put(highResolutionOutputSizeshNQ4ISI4.asSingleFqName().toUnsafe(), classId12);
        kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName4 = classId12.asSingleFqName();
        linkedHashSet.add(asSingleFqName4);
        hashMap2.put(asSingleFqName4.toUnsafe(), highResolutionOutputSizeshNQ4ISI4);
        kotlin.reflect.jvm.internal.impl.name.FqName safe4 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.cloneable.toSafe();
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI5 = javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.lang.Cloneable.class);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId13 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(safe4);
        hashMap.put(highResolutionOutputSizeshNQ4ISI5.asSingleFqName().toUnsafe(), classId13);
        kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName5 = classId13.asSingleFqName();
        linkedHashSet.add(asSingleFqName5);
        hashMap2.put(asSingleFqName5.toUnsafe(), highResolutionOutputSizeshNQ4ISI5);
        kotlin.reflect.jvm.internal.impl.name.FqName safe5 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.number.toSafe();
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI6 = javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.lang.Number.class);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId14 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(safe5);
        hashMap.put(highResolutionOutputSizeshNQ4ISI6.asSingleFqName().toUnsafe(), classId14);
        kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName6 = classId14.asSingleFqName();
        linkedHashSet.add(asSingleFqName6);
        hashMap2.put(asSingleFqName6.toUnsafe(), highResolutionOutputSizeshNQ4ISI6);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName2 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.comparable;
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI7 = javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.lang.Comparable.class);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId15 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(fqName2);
        hashMap.put(highResolutionOutputSizeshNQ4ISI7.asSingleFqName().toUnsafe(), classId15);
        kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName7 = classId15.asSingleFqName();
        linkedHashSet.add(asSingleFqName7);
        hashMap2.put(asSingleFqName7.toUnsafe(), highResolutionOutputSizeshNQ4ISI7);
        kotlin.reflect.jvm.internal.impl.name.FqName safe6 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames._enum.toSafe();
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI8 = javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.lang.Enum.class);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId16 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(safe6);
        hashMap.put(highResolutionOutputSizeshNQ4ISI8.asSingleFqName().toUnsafe(), classId16);
        kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName8 = classId16.asSingleFqName();
        linkedHashSet.add(asSingleFqName8);
        hashMap2.put(asSingleFqName8.toUnsafe(), highResolutionOutputSizeshNQ4ISI8);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName3 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.annotation;
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI9 = javaToKotlinClassMap.getHighResolutionOutputSizeshNQ4ISI(java.lang.annotation.Annotation.class);
        kotlin.reflect.jvm.internal.impl.name.ClassId classId17 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(fqName3);
        hashMap.put(highResolutionOutputSizeshNQ4ISI9.asSingleFqName().toUnsafe(), classId17);
        kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName9 = classId17.asSingleFqName();
        linkedHashSet.add(asSingleFqName9);
        hashMap2.put(asSingleFqName9.toUnsafe(), highResolutionOutputSizeshNQ4ISI9);
        for (kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping8 : listOf) {
            kotlin.reflect.jvm.internal.impl.name.ClassId component1 = platformMutabilityMapping8.component1();
            kotlin.reflect.jvm.internal.impl.name.ClassId component2 = platformMutabilityMapping8.component2();
            kotlin.reflect.jvm.internal.impl.name.ClassId component3 = platformMutabilityMapping8.component3();
            getOutputFormats.put(component1.asSingleFqName().toUnsafe(), component2);
            kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName10 = component2.asSingleFqName();
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set = getOutputSizes;
            set.add(asSingleFqName10);
            java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.ClassId> hashMap3 = getOutputStallDurationlomOqCM;
            hashMap3.put(asSingleFqName10.toUnsafe(), component1);
            kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName11 = component3.asSingleFqName();
            set.add(asSingleFqName11);
            hashMap3.put(asSingleFqName11.toUnsafe(), component1);
            getOutputMinFrameDurationlomOqCM.put(component3, component2);
            isOutputSupportedFor.put(component2, component3);
            kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName12 = component2.asSingleFqName();
            kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName13 = component3.asSingleFqName();
            getOutputStallDuration.put(component3.asSingleFqName().toUnsafe(), asSingleFqName12);
            unwrapAs.put(asSingleFqName12.toUnsafe(), asSingleFqName13);
        }
        for (kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType jvmPrimitiveType : kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.values()) {
            kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
            kotlin.reflect.jvm.internal.impl.name.FqName wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(wrapperFqName, "");
            kotlin.reflect.jvm.internal.impl.name.ClassId classId18 = companion.topLevel(wrapperFqName);
            kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion2 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(primitiveType, "");
            kotlin.reflect.jvm.internal.impl.name.ClassId classId19 = companion2.topLevel(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.getPrimitiveFqName(primitiveType));
            getOutputFormats.put(classId18.asSingleFqName().toUnsafe(), classId19);
            kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName14 = classId19.asSingleFqName();
            getOutputSizes.add(asSingleFqName14);
            getOutputStallDurationlomOqCM.put(asSingleFqName14.toUnsafe(), classId18);
        }
        for (kotlin.reflect.jvm.internal.impl.name.ClassId classId20 : kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion3 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("kotlin.jvm.internal.");
            sb5.append(classId20.getShortClassName().asString());
            sb5.append("CompanionObject");
            kotlin.reflect.jvm.internal.impl.name.ClassId classId21 = companion3.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName(sb5.toString()));
            kotlin.reflect.jvm.internal.impl.name.ClassId createNestedClassId2 = classId20.createNestedClassId(kotlin.reflect.jvm.internal.impl.name.SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            getOutputFormats.put(classId21.asSingleFqName().toUnsafe(), createNestedClassId2);
            kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName15 = createNestedClassId2.asSingleFqName();
            getOutputSizes.add(asSingleFqName15);
            getOutputStallDurationlomOqCM.put(asSingleFqName15.toUnsafe(), classId21);
        }
        for (int i = 0; i < 23; i++) {
            kotlin.reflect.jvm.internal.impl.name.ClassId classId22 = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.jvm.functions.Function".concat(java.lang.String.valueOf(i))));
            kotlin.reflect.jvm.internal.impl.name.ClassId functionClassId = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.getFunctionClassId(i);
            getOutputFormats.put(classId22.asSingleFqName().toUnsafe(), functionClassId);
            kotlin.reflect.jvm.internal.impl.name.FqName asSingleFqName16 = functionClassId.asSingleFqName();
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set2 = getOutputSizes;
            set2.add(asSingleFqName16);
            java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.ClassId> hashMap4 = getOutputStallDurationlomOqCM;
            hashMap4.put(asSingleFqName16.toUnsafe(), classId22);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(getHighSpeedVideoSizesFor);
            sb6.append(i);
            kotlin.reflect.jvm.internal.impl.name.FqName fqName4 = new kotlin.reflect.jvm.internal.impl.name.FqName(sb6.toString());
            kotlin.reflect.jvm.internal.impl.name.ClassId classId23 = getHighSpeedVideoFpsRanges;
            set2.add(fqName4);
            hashMap4.put(fqName4.toUnsafe(), classId23);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KSuspendFunction kSuspendFunction = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KSuspendFunction.INSTANCE;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(kSuspendFunction.getPackageFqName());
            sb7.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            sb7.append(kSuspendFunction.getClassNamePrefix());
            java.lang.String obj = sb7.toString();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(obj);
            sb8.append(i2);
            kotlin.reflect.jvm.internal.impl.name.FqName fqName5 = new kotlin.reflect.jvm.internal.impl.name.FqName(sb8.toString());
            kotlin.reflect.jvm.internal.impl.name.ClassId classId24 = getHighSpeedVideoFpsRanges;
            getOutputSizes.add(fqName5);
            getOutputStallDurationlomOqCM.put(fqName5.toUnsafe(), classId24);
        }
        kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
        kotlin.reflect.jvm.internal.impl.name.FqName fqName6 = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.concurrent.atomics.AtomicInt");
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI10 = javaToKotlinClassMap2.getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.atomic.AtomicInteger.class);
        java.util.Set<kotlin.reflect.jvm.internal.impl.name.FqName> set3 = getOutputSizes;
        set3.add(fqName6);
        java.util.HashMap<kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe, kotlin.reflect.jvm.internal.impl.name.ClassId> hashMap5 = getOutputStallDurationlomOqCM;
        hashMap5.put(fqName6.toUnsafe(), highResolutionOutputSizeshNQ4ISI10);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName7 = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.concurrent.atomics.AtomicLong");
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI11 = javaToKotlinClassMap2.getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.atomic.AtomicLong.class);
        set3.add(fqName7);
        hashMap5.put(fqName7.toUnsafe(), highResolutionOutputSizeshNQ4ISI11);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName8 = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.concurrent.atomics.AtomicBoolean");
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI12 = javaToKotlinClassMap2.getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.atomic.AtomicBoolean.class);
        set3.add(fqName8);
        hashMap5.put(fqName8.toUnsafe(), highResolutionOutputSizeshNQ4ISI12);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName9 = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.concurrent.atomics.AtomicReference");
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI13 = javaToKotlinClassMap2.getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.atomic.AtomicReference.class);
        set3.add(fqName9);
        hashMap5.put(fqName9.toUnsafe(), highResolutionOutputSizeshNQ4ISI13);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName10 = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.concurrent.atomics.AtomicIntArray");
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI14 = javaToKotlinClassMap2.getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.atomic.AtomicIntegerArray.class);
        set3.add(fqName10);
        hashMap5.put(fqName10.toUnsafe(), highResolutionOutputSizeshNQ4ISI14);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName11 = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.concurrent.atomics.AtomicLongArray");
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI15 = javaToKotlinClassMap2.getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.atomic.AtomicLongArray.class);
        set3.add(fqName11);
        hashMap5.put(fqName11.toUnsafe(), highResolutionOutputSizeshNQ4ISI15);
        kotlin.reflect.jvm.internal.impl.name.FqName fqName12 = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.concurrent.atomics.AtomicArray");
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI16 = javaToKotlinClassMap2.getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.atomic.AtomicReferenceArray.class);
        set3.add(fqName12);
        hashMap5.put(fqName12.toUnsafe(), highResolutionOutputSizeshNQ4ISI16);
        kotlin.reflect.jvm.internal.impl.name.FqName safe7 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.nothing.toSafe();
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI17 = javaToKotlinClassMap2.getHighResolutionOutputSizeshNQ4ISI(java.lang.Void.class);
        set3.add(safe7);
        hashMap5.put(safe7.toUnsafe(), highResolutionOutputSizeshNQ4ISI17);
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName getFUNCTION_N_FQ_NAME() {
        return Camera2StreamConfigurationMap;
    }

    public static final class PlatformMutabilityMapping {
        private final kotlin.reflect.jvm.internal.impl.name.ClassId Camera2StreamConfigurationMap;
        private final kotlin.reflect.jvm.internal.impl.name.ClassId getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.name.ClassId getHighSpeedVideoFpsRanges;

        public PlatformMutabilityMapping(kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.name.ClassId classId2, kotlin.reflect.jvm.internal.impl.name.ClassId classId3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId3, "");
            this.Camera2StreamConfigurationMap = classId;
            this.getHighSpeedVideoFpsRanges = classId2;
            this.getHighResolutionOutputSizeshNQ4ISI = classId3;
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId getJavaClass() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PlatformMutabilityMapping(javaClass=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", kotlinReadOnly=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(", kotlinMutable=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping = (kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, platformMutabilityMapping.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, platformMutabilityMapping.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, platformMutabilityMapping.getHighResolutionOutputSizeshNQ4ISI);
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId component3() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId component2() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final kotlin.reflect.jvm.internal.impl.name.ClassId component1() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.PlatformMutabilityMapping> getMutabilityMappings() {
        return getOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId mapJavaToKotlin(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return getOutputFormats.get(fqName.toUnsafe());
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId mapKotlinToJava(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqNameUnsafe, "");
        if (!Camera2StreamConfigurationMap(fqNameUnsafe, getInputFormats) && !Camera2StreamConfigurationMap(fqNameUnsafe, getInputSizeshNQ4ISI)) {
            if (!Camera2StreamConfigurationMap(fqNameUnsafe, getHighSpeedVideoSizesFor) && !Camera2StreamConfigurationMap(fqNameUnsafe, getOutputMinFrameDuration)) {
                return getOutputStallDurationlomOqCM.get(fqNameUnsafe);
            }
            return getHighSpeedVideoFpsRanges;
        }
        return getHighSpeedVideoSizes;
    }

    private static boolean Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe, java.lang.String str) {
        java.lang.Integer intOrNull;
        java.lang.String asString = fqNameUnsafe.asString();
        if (!kotlin.text.StringsKt.startsWith$default(asString, str, false, 2, (java.lang.Object) null)) {
            return false;
        }
        java.lang.String substring = asString.substring(str.length());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return (kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) substring, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, false, 2, (java.lang.Object) null) || (intOrNull = kotlin.text.StringsKt.toIntOrNull(substring)) == null || intOrNull.intValue() < 23) ? false : true;
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName mutableToReadOnly(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        return getOutputStallDuration.get(fqNameUnsafe);
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName readOnlyToMutable(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        return unwrapAs.get(fqNameUnsafe);
    }

    public final boolean isMutable(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        return getOutputStallDuration.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe) {
        return unwrapAs.containsKey(fqNameUnsafe);
    }

    public final boolean isMutable(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        return getOutputMinFrameDurationlomOqCM.containsKey(classId);
    }

    private final kotlin.reflect.jvm.internal.impl.name.ClassId getHighResolutionOutputSizeshNQ4ISI(java.lang.Class<?> cls) {
        java.lang.Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            kotlin.reflect.jvm.internal.impl.name.ClassId.Companion companion = kotlin.reflect.jvm.internal.impl.name.ClassId.Companion;
            java.lang.String canonicalName = cls.getCanonicalName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(canonicalName, "");
            return companion.topLevel(new kotlin.reflect.jvm.internal.impl.name.FqName(canonicalName));
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(declaringClass);
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(cls.getSimpleName());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return highResolutionOutputSizeshNQ4ISI.createNestedClassId(identifier);
    }
}
