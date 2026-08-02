package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmTypeAlias {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> Camera2StreamConfigurationMap;
    public kotlin.reflect.jvm.internal.impl.km.KmType expandedType;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeAliasExtension> getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> getOutputMinFrameDuration;
    public kotlin.reflect.jvm.internal.impl.km.KmType underlyingType;

    public KmTypeAlias(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoSizes = i;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(0);
        this.Camera2StreamConfigurationMap = new java.util.ArrayList(0);
        this.getOutputMinFrameDuration = new java.util.ArrayList(0);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> iNSTANCES$kotlin_metadata = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeAliasExtension createTypeAliasExtension = ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).createTypeAliasExtension();
            if (createTypeAliasExtension != null) {
                arrayList.add(createTypeAliasExtension);
            }
        }
        this.getHighSpeedVideoFpsRangesFor = arrayList;
    }

    public final int getFlags$kotlin_metadata() {
        return this.getHighSpeedVideoSizes;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> getTypeParameters() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void setUnderlyingType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        this.underlyingType = kmType;
    }

    public final void setExpandedType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        this.expandedType = kmType;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getAnnotations() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> getVersionRequirements() {
        return this.getOutputMinFrameDuration;
    }
}
