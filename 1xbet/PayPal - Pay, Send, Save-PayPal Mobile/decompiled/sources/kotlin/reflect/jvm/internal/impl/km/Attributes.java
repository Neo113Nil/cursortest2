package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class Attributes {
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate AMEXKernel;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate AMEXKernelCallback;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate AMEXKernelJNI;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate AMEXKernelProvider;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate AMEXKernela;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate ArtificialStackFrames;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate BerTlvEncoder;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate Camera2StreamConfigurationMap;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate CoroutineDebuggingKt;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate _BOUNDARY;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate f6918a;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate accessartificialFrame;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate b;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate c;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate coroutineBoundary;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate coroutineCreation;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate d;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate encode;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate exchange;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate free;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate freeTransaction;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getARTIFICIAL_FRAME_PACKAGE_NAME;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getHighResolutionOutputSizeshNQ4ISI;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRanges = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.Attributes.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1))};
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getHighSpeedVideoFpsRangesFor;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getHighSpeedVideoSizes;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getHighSpeedVideoSizesFor;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getInputFormats;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getInputSizeshNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getOutputFormats;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getOutputMinFrameDuration;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getOutputMinFrameDurationlomOqCM;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getOutputSizes;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getOutputSizeshNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getOutputStallDuration;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getOutputStallDurationlomOqCM;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getValidOutputFormatsForInputhNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate init;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate isOutputSupportedFor;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate isOutputSupportedForhNQ4ISI;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate kernelVersion;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate l;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate newContext;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate release;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate requestGoOnline;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate requestPINEntry;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate resetTransaction;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate rsaCipher;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate setup;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate sha1;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate start;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate startTransaction;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate toString;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate unwrapAs;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate updateUI;
    private static final kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate version;

    public static final kotlin.reflect.jvm.internal.impl.km.Modality getModality(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        return (kotlin.reflect.jvm.internal.impl.km.Modality) sha1.getValue(kmClass, getHighSpeedVideoFpsRanges[7]);
    }

    public static final void setModality(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass, kotlin.reflect.jvm.internal.impl.km.Modality modality) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modality, "");
        sha1.setValue(kmClass, getHighSpeedVideoFpsRanges[7], modality);
    }

    public static final void setVisibility(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass, kotlin.reflect.jvm.internal.impl.km.Visibility visibility) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibility, "");
        AMEXKernelProvider.setValue(kmClass, getHighSpeedVideoFpsRanges[8], visibility);
    }

    public static final kotlin.reflect.jvm.internal.impl.km.ClassKind getKind(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        return (kotlin.reflect.jvm.internal.impl.km.ClassKind) l.getValue(kmClass, getHighSpeedVideoFpsRanges[9]);
    }

    public static final void setKind(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass, kotlin.reflect.jvm.internal.impl.km.ClassKind classKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classKind, "");
        l.setValue(kmClass, getHighSpeedVideoFpsRanges[9], classKind);
    }

    public static final boolean isInner(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        return _BOUNDARY.getValue(kmClass, getHighSpeedVideoFpsRanges[10]);
    }

    public static final boolean isData(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        return getValidOutputFormatsForInputhNQ4ISI.getValue(kmClass, getHighSpeedVideoFpsRanges[11]);
    }

    public static final boolean isValue(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        return requestGoOnline.getValue(kmClass, getHighSpeedVideoFpsRanges[14]);
    }

    public static final boolean isFunInterface(kotlin.reflect.jvm.internal.impl.km.KmClass kmClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClass, "");
        return getARTIFICIAL_FRAME_PACKAGE_NAME.getValue(kmClass, getHighSpeedVideoFpsRanges[15]);
    }

    public static final boolean isNullable(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        return resetTransaction.getValue(kmType, getHighSpeedVideoFpsRanges[46]);
    }

    public static final boolean isSuspend(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        return requestPINEntry.getValue(kmType, getHighSpeedVideoFpsRanges[47]);
    }

    public static final boolean isDefinitelyNonNull(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        return isOutputSupportedForhNQ4ISI.getValue(kmType, getHighSpeedVideoFpsRanges[48]);
    }

    public static final boolean isReified(kotlin.reflect.jvm.internal.impl.km.KmTypeParameter kmTypeParameter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmTypeParameter, "");
        return release.getValue(kmTypeParameter, getHighSpeedVideoFpsRanges[49]);
    }

    static {
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField, "");
        getHighResolutionOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.classBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField2, "");
        Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.constructorBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField2));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField3, "");
        getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.functionBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField3));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField4, "");
        getHighSpeedVideoSizesFor = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField4));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField5, "");
        getInputFormats = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyAccessorBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField5));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField6, "");
        getOutputFormats = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.valueParameterBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField6));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField7, "");
        getInputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.typeAliasBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField7));
        sha1 = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.modalityDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmClass) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmClass) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        AMEXKernelProvider = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.visibilityDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmClass) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmClass) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        kotlin.reflect.jvm.internal.impl.km.Attributes$kind$2 attributes$kind$2 = new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmClass) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmClass) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        };
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind> flagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.CLASS_KIND;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(flagField, "");
        kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.ClassKind> entries = kotlin.reflect.jvm.internal.impl.km.ClassKind.getEntries();
        kotlin.enums.EnumEntries<kotlin.reflect.jvm.internal.impl.km.ClassKind> entries2 = kotlin.reflect.jvm.internal.impl.km.ClassKind.getEntries();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries2, 10));
        java.util.Iterator<E> it = entries2.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.km.ClassKind) it.next()).getFlag$kotlin_metadata());
        }
        l = new kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate(attributes$kind$2, flagField, entries, arrayList);
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField8 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INNER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField8, "");
        _BOUNDARY = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.classBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField8));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField9 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_DATA;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField9, "");
        getValidOutputFormatsForInputhNQ4ISI = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.classBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField9));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_CLASS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField10, "");
        ArtificialStackFrames = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.classBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField10));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXPECT_CLASS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField11, "");
        toString = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.classBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField11));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_VALUE_CLASS;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField12, "");
        requestGoOnline = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.classBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField12));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField13 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_FUN_INTERFACE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField13, "");
        getARTIFICIAL_FRAME_PACKAGE_NAME = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.classBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField13));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField14 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ENUM_ENTRIES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField14, "");
        getOutputMinFrameDurationlomOqCM = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.classBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField14));
        setup = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.visibilityDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmConstructor) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmConstructor) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField15 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SECONDARY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField15, "");
        AMEXKernela = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.constructorBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField15));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField16 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField16, "");
        getOutputSizeshNQ4ISI = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.constructorBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField16));
        AMEXKernelJNI = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.memberKindDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$7
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmFunction) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmFunction) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        version = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.visibilityDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmFunction) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmFunction) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        free = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.modalityDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$6
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmFunction) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmFunction) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField17 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_OPERATOR;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField17, "");
        startTransaction = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.functionBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField17));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField18 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INFIX;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField18, "");
        _CREATION = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.functionBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField18));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField19 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField19, "");
        b = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.functionBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField19));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField20 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_TAILREC;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField20, "");
        AMEXKernelCallback = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.functionBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField20));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField21 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_FUNCTION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField21, "");
        coroutineCreation = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.functionBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField21));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField22 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SUSPEND;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField22, "");
        exchange = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.functionBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField22));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField23 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXPECT_FUNCTION;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField23, "");
        unwrapAs = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.functionBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField23));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField24 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField24, "");
        getOutputSizes = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.functionBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField24));
        start = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.visibilityDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmProperty) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmProperty) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        freeTransaction = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.modalityDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$10
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmProperty) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmProperty) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        rsaCipher = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.memberKindDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$kind$11
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmProperty) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmProperty) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField25 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_VAR;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField25, "");
        updateUI = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField25));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField26 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CONST;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField26, "");
        getOutputStallDuration = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField26));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField27 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_LATEINIT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField27, "");
        d = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField27));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField28 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_CONSTANT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField28, "");
        getOutputMinFrameDuration = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField28));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField29 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_PROPERTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField29, "");
        CoroutineDebuggingKt = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField29));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField30 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_DELEGATED;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField30, "");
        isOutputSupportedFor = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField30));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField31 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXPECT_PROPERTY;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField31, "");
        coroutineBoundary = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField31));
        BerTlvEncoder = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.visibilityDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$18
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        newContext = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.modalityDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$modality$14
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField32 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NOT_DEFAULT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField32, "");
        AMEXKernel = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyAccessorBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField32));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField33 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_ACCESSOR;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField33, "");
        accessartificialFrame = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyAccessorBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField33));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField34 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE_ACCESSOR;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField34, "");
        f6918a = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyAccessorBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField34));
        resetTransaction = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.typeBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(0, 1, 1));
        requestPINEntry = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.typeBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.SUSPEND_TYPE.offset + 1, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.SUSPEND_TYPE.bitWidth, 1));
        isOutputSupportedForhNQ4ISI = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.typeBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.DEFINITELY_NOT_NULL_TYPE.offset + 1, kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.DEFINITELY_NOT_NULL_TYPE.bitWidth, 1));
        release = new kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isReified$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmTypeParameter) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmTypeParameter) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        }, new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(0, 1, 1));
        encode = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.visibilityDelegate(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$visibility$22
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmTypeAlias) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmTypeAlias) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        });
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField35 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.DECLARES_DEFAULT_VALUE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField35, "");
        getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.valueParameterBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField35));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField36 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CROSSINLINE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField36, "");
        getOutputStallDurationlomOqCM = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.valueParameterBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField36));
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField37 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NOINLINE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField37, "");
        c = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.valueParameterBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField37));
        kotlin.reflect.jvm.internal.impl.km.Attributes$isNegated$2 attributes$isNegated$2 = new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNegated$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmEffectExpression) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmEffectExpression) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        };
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField38 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NEGATED;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField38, "");
        init = new kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate(attributes$isNegated$2, new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField38));
        kotlin.reflect.jvm.internal.impl.km.Attributes$isNullCheckPredicate$2 attributes$isNullCheckPredicate$2 = new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.km.Attributes$isNullCheckPredicate$2
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return java.lang.Integer.valueOf(((kotlin.reflect.jvm.internal.impl.km.KmEffectExpression) obj).getFlags$kotlin_metadata());
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
            public final void set(java.lang.Object obj, java.lang.Object obj2) {
                ((kotlin.reflect.jvm.internal.impl.km.KmEffectExpression) obj).setFlags$kotlin_metadata(((java.lang.Number) obj2).intValue());
            }
        };
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField39 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NULL_CHECK_PREDICATE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField39, "");
        kernelVersion = new kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate(attributes$isNullCheckPredicate$2, new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField39));
    }
}
