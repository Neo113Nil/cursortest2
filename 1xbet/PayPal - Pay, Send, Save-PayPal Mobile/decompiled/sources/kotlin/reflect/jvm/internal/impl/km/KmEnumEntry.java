package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmEnumEntry {
    private java.lang.String Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmEnumEntryExtension> getHighSpeedVideoFpsRangesFor;

    public KmEnumEntry(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(0);
        java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> iNSTANCES$kotlin_metadata = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmEnumEntryExtension createEnumEntryExtension = ((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).createEnumEntryExtension();
            if (createEnumEntryExtension != null) {
                arrayList.add(createEnumEntryExtension);
            }
        }
        this.getHighSpeedVideoFpsRangesFor = arrayList;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getAnnotations() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }
}
