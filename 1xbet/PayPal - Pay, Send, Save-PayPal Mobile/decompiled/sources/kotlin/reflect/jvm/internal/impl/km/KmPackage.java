package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmPackage implements kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension> Camera2StreamConfigurationMap;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmFunction> getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmProperty> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeAlias> getHighSpeedVideoSizes = new java.util.ArrayList(0);

    public KmPackage() {
        java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> iNSTANCES$kotlin_metadata = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        java.util.Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).createPackageExtension());
        }
        this.Camera2StreamConfigurationMap = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmFunction> getFunctions() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmProperty> getProperties() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeAlias> getTypeAliases() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmPackageExtension> getExtensions$kotlin_metadata() {
        return this.Camera2StreamConfigurationMap;
    }
}
