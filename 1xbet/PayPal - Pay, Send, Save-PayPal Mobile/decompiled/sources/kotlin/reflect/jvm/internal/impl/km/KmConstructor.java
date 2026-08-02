package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmConstructor {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmConstructorExtension> Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getHighSpeedVideoSizes;

    public KmConstructor(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(0);
        this.getHighSpeedVideoSizes = new java.util.ArrayList(0);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> iNSTANCES$kotlin_metadata = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        java.util.Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).createConstructorExtension());
        }
        this.Camera2StreamConfigurationMap = arrayList;
    }

    public final int getFlags$kotlin_metadata() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public KmConstructor() {
        this(0);
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmValueParameter> getValueParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> getVersionRequirements() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getAnnotations() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmConstructorExtension> getExtensions$kotlin_metadata() {
        return this.Camera2StreamConfigurationMap;
    }
}
