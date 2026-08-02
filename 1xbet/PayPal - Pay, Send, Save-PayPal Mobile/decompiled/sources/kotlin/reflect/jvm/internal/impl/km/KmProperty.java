package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmProperty {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.KmProperty.class, "_hasSetter", "get_hasSetter()Z", 0)), kotlin.jvm.internal.Reflection.mutableProperty1(new kotlin.jvm.internal.MutablePropertyReference1Impl(kotlin.reflect.jvm.internal.impl.km.KmProperty.class, "_hasGetter", "get_hasGetter()Z", 0))};
    private final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate getHighSpeedVideoFpsRangesFor;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> getHighSpeedVideoSizesFor;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> getInputFormats;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension> getInputSizeshNQ4ISI;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getOutputFormats;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getOutputMinFrameDuration;
    private kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes getOutputMinFrameDurationlomOqCM;
    private kotlin.reflect.jvm.internal.impl.km.KmType getOutputSizes;
    private int getOutputSizeshNQ4ISI;
    private java.lang.String getOutputStallDuration;
    private final kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes getOutputStallDurationlomOqCM;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> isOutputSupportedFor;
    private kotlin.reflect.jvm.internal.impl.km.KmValueParameter isOutputSupportedForhNQ4ISI;
    public kotlin.reflect.jvm.internal.impl.km.KmType returnType;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> toString;

    public KmProperty(int i, java.lang.String str, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getOutputSizeshNQ4ISI = i;
        this.getOutputStallDuration = str;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_SETTER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField, "");
        kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<kotlin.reflect.jvm.internal.impl.km.KmProperty> propertyBooleanFlag = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField));
        this.Camera2StreamConfigurationMap = propertyBooleanFlag;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField booleanFlagField2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_GETTER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanFlagField2, "");
        kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate<kotlin.reflect.jvm.internal.impl.km.KmProperty> propertyBooleanFlag2 = kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt.propertyBooleanFlag(new kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl(booleanFlagField2));
        this.getHighSpeedVideoFpsRangesFor = propertyBooleanFlag2;
        kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes kmPropertyAccessorAttributes = new kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes(i2);
        kotlin.reflect.KProperty<?>[] kPropertyArr = getHighSpeedVideoSizes;
        propertyBooleanFlag2.setValue(this, kPropertyArr[1], true);
        this.getOutputStallDurationlomOqCM = kmPropertyAccessorAttributes;
        this.getOutputMinFrameDurationlomOqCM = propertyBooleanFlag.getValue(this, kPropertyArr[0]) ? new kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes(i3) : null;
        this.toString = new java.util.ArrayList(0);
        this.getOutputFormats = new java.util.ArrayList(0);
        this.getInputFormats = new java.util.ArrayList(0);
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
        this.isOutputSupportedFor = new java.util.ArrayList(0);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(0);
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(0);
        this.getOutputMinFrameDuration = new java.util.ArrayList(0);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> iNSTANCES$kotlin_metadata = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        java.util.Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).createPropertyExtension());
        }
        this.getInputSizeshNQ4ISI = arrayList;
    }

    public final int getFlags$kotlin_metadata() {
        return this.getOutputSizeshNQ4ISI;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.getOutputSizeshNQ4ISI = i;
    }

    public final java.lang.String getName() {
        return this.getOutputStallDuration;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes getGetter() {
        return this.getOutputStallDurationlomOqCM;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmPropertyAccessorAttributes getSetter() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> getTypeParameters() {
        return this.toString;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmType getReceiverParameterType() {
        return this.getOutputSizes;
    }

    public final void setReceiverParameterType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        this.getOutputSizes = kmType;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getExtensionReceiverParameterAnnotations() {
        return this.getOutputFormats;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> getContextParameters() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmValueParameter getSetterParameter() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public final void setSetterParameter(kotlin.reflect.jvm.internal.impl.km.KmValueParameter kmValueParameter) {
        this.isOutputSupportedForhNQ4ISI = kmValueParameter;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmType getReturnType() {
        kotlin.reflect.jvm.internal.impl.km.KmType kmType = this.returnType;
        if (kmType != null) {
            return kmType;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setReturnType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        this.returnType = kmType;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> getVersionRequirements() {
        return this.isOutputSupportedFor;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getAnnotations() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getBackingFieldAnnotations() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getDelegateFieldAnnotations() {
        return this.getOutputMinFrameDuration;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPropertyExtension> getExtensions$kotlin_metadata() {
        return this.getInputSizeshNQ4ISI;
    }
}
