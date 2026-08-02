package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmType {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension> Camera2StreamConfigurationMap;
    public kotlin.reflect.jvm.internal.impl.km.KmClassifier classifier;
    private kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeProjection> getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private kotlin.reflect.jvm.internal.impl.km.KmType getHighSpeedVideoSizes;
    private kotlin.reflect.jvm.internal.impl.km.KmType getOutputMinFrameDuration;

    public KmType(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(0);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> iNSTANCES$kotlin_metadata = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        java.util.Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).createTypeExtension());
        }
        this.Camera2StreamConfigurationMap = arrayList;
    }

    public final int getFlags$kotlin_metadata() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public KmType() {
        this(0);
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmClassifier getClassifier() {
        kotlin.reflect.jvm.internal.impl.km.KmClassifier kmClassifier = this.classifier;
        if (kmClassifier != null) {
            return kmClassifier;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setClassifier(kotlin.reflect.jvm.internal.impl.km.KmClassifier kmClassifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmClassifier, "");
        this.classifier = kmClassifier;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeProjection> getArguments() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmType getAbbreviatedType() {
        return this.getHighSpeedVideoSizes;
    }

    public final void setAbbreviatedType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        this.getHighSpeedVideoSizes = kmType;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmType getOuterType() {
        return this.getOutputMinFrameDuration;
    }

    public final void setOuterType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        this.getOutputMinFrameDuration = kmType;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound getFlexibleTypeUpperBound() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void setFlexibleTypeUpperBound(kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound) {
        this.getHighResolutionOutputSizeshNQ4ISI = kmFlexibleTypeUpperBound;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmTypeExtension> getExtensions$kotlin_metadata() {
        return this.Camera2StreamConfigurationMap;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        kotlin.reflect.jvm.internal.impl.km.KmType kmType = (kotlin.reflect.jvm.internal.impl.km.KmType) obj;
        return this.getHighSpeedVideoFpsRangesFor == kmType.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(getClassifier(), kmType.getClassifier()) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, kmType.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputMinFrameDuration, kmType.getOutputMinFrameDuration) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, kmType.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, kmType.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, kmType.Camera2StreamConfigurationMap);
    }

    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRangesFor * 31) + getClassifier().hashCode()) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }
}
