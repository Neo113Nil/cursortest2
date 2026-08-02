package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmFunction {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getHighSpeedVideoFpsRanges;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> getHighSpeedVideoFpsRangesFor;
    private kotlin.reflect.jvm.internal.impl.km.KmContract getHighSpeedVideoSizes;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> getHighSpeedVideoSizesFor;
    private int getInputFormats;
    private kotlin.reflect.jvm.internal.impl.km.KmType getInputSizeshNQ4ISI;
    private java.lang.String getOutputFormats;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension> getOutputMinFrameDuration;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> getOutputMinFrameDurationlomOqCM;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> getOutputStallDuration;
    public kotlin.reflect.jvm.internal.impl.km.KmType returnType;

    public KmFunction(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getInputFormats = i;
        this.getOutputFormats = str;
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList(0);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(0);
        this.Camera2StreamConfigurationMap = new java.util.ArrayList(0);
        this.getOutputStallDuration = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
        this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList(0);
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(0);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> iNSTANCES$kotlin_metadata = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        java.util.Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).createFunctionExtension());
        }
        this.getOutputMinFrameDuration = arrayList;
    }

    public final int getFlags$kotlin_metadata() {
        return this.getInputFormats;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.getInputFormats = i;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> getTypeParameters() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final void setReceiverParameterType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        this.getInputSizeshNQ4ISI = kmType;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getExtensionReceiverParameterAnnotations() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> getValueParameters() {
        return this.getOutputStallDuration;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> getContextParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setReturnType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        this.returnType = kmType;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> getVersionRequirements() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public final void setContract(kotlin.reflect.jvm.internal.impl.km.KmContract kmContract) {
        this.getHighSpeedVideoSizes = kmContract;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getAnnotations() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmFunctionExtension> getExtensions$kotlin_metadata() {
        return this.getOutputMinFrameDuration;
    }
}
