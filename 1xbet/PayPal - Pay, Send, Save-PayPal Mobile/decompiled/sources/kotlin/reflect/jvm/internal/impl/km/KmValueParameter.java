package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmValueParameter {
    private int Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getHighResolutionOutputSizeshNQ4ISI;
    private kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument getHighSpeedVideoFpsRanges;
    private java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmValueParameterExtension> getHighSpeedVideoSizes;
    private kotlin.reflect.jvm.internal.impl.km.KmType getOutputFormats;
    public kotlin.reflect.jvm.internal.impl.km.KmType type;

    public KmValueParameter(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(0);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> iNSTANCES$kotlin_metadata = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmValueParameterExtension createValueParameterExtension = ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).createValueParameterExtension();
            if (createValueParameterExtension != null) {
                arrayList.add(createValueParameterExtension);
            }
        }
        this.getHighSpeedVideoSizes = arrayList;
    }

    public final int getFlags$kotlin_metadata() {
        return this.Camera2StreamConfigurationMap;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public final java.lang.String getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmType getType() {
        kotlin.reflect.jvm.internal.impl.km.KmType kmType = this.type;
        if (kmType != null) {
            return kmType;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        this.type = kmType;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmType getVarargElementType() {
        return this.getOutputFormats;
    }

    public final void setVarargElementType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        this.getOutputFormats = kmType;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument getAnnotationParameterDefaultValue() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void setAnnotationParameterDefaultValue(kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument kmAnnotationArgument) {
        this.getHighSpeedVideoFpsRanges = kmAnnotationArgument;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getAnnotations() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
