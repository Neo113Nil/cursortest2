package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmTypeParameter {
    private java.lang.String Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension> getHighSpeedVideoSizes;
    private kotlin.reflect.jvm.internal.impl.km.KmVariance getOutputFormats;

    public KmTypeParameter(int i, java.lang.String str, int i2, kotlin.reflect.jvm.internal.impl.km.KmVariance kmVariance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmVariance, "");
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getOutputFormats = kmVariance;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(1);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> iNSTANCES$kotlin_metadata = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        java.util.Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).createTypeParameterExtension());
        }
        this.getHighSpeedVideoSizes = arrayList;
    }

    public final int getFlags$kotlin_metadata() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final java.lang.String getName() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int getId() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmVariance getVariance() {
        return this.getOutputFormats;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KmTypeParameter(java.lang.String str, int i, kotlin.reflect.jvm.internal.impl.km.KmVariance kmVariance) {
        this(0, str, i, kmVariance);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmVariance, "");
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> getUpperBounds() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeParameterExtension> getExtensions$kotlin_metadata() {
        return this.getHighSpeedVideoSizes;
    }
}
