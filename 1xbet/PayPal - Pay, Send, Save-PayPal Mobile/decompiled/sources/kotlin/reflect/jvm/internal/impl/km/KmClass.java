package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmClass implements kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer {
    private java.lang.String getHighSpeedVideoSizes;
    private int getHighSpeedVideoSizesFor;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension> getInputFormats;
    private java.lang.String getOutputFormats;
    private kotlin.reflect.jvm.internal.impl.km.KmType getOutputMinFrameDuration;

    /* renamed from: name, reason: collision with root package name */
    public java.lang.String f6919name;
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> getValidOutputFormatsForInputhNQ4ISI = new java.util.ArrayList(0);
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> getOutputStallDuration = new java.util.ArrayList(1);
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmFunction> getInputSizeshNQ4ISI = new java.util.ArrayList();
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmProperty> getOutputMinFrameDurationlomOqCM = new java.util.ArrayList();
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeAlias> unwrapAs = new java.util.ArrayList(0);
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmConstructor> getHighSpeedVideoFpsRanges = new java.util.ArrayList(1);
    private final java.util.List<java.lang.String> getOutputSizes = new java.util.ArrayList(0);
    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(0);
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmEnumEntry> getOutputSizeshNQ4ISI = new java.util.ArrayList(0);
    private final java.util.List<java.lang.String> getOutputStallDurationlomOqCM = new java.util.ArrayList(0);
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList(0);
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> Camera2StreamConfigurationMap = new java.util.ArrayList(0);
    private final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> isOutputSupportedFor = new java.util.ArrayList(0);

    public KmClass() {
        java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions> iNSTANCES$kotlin_metadata = kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions.Companion.getINSTANCES$kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(iNSTANCES$kotlin_metadata, 10));
        java.util.Iterator<T> it = iNSTANCES$kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions) it.next()).createClassExtension());
        }
        this.getInputFormats = arrayList;
    }

    public final int getFlags$kotlin_metadata() {
        return this.getHighSpeedVideoSizesFor;
    }

    public final void setFlags$kotlin_metadata(int i) {
        this.getHighSpeedVideoSizesFor = i;
    }

    public final java.lang.String getName() {
        java.lang.String str = this.f6919name;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.f6919name = str;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeParameter> getTypeParameters() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> getSupertypes() {
        return this.getOutputStallDuration;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmFunction> getFunctions() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmProperty> getProperties() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.KmDeclarationContainer
    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmTypeAlias> getTypeAliases() {
        return this.unwrapAs;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmConstructor> getConstructors() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final void setCompanionObject(java.lang.String str) {
        this.getHighSpeedVideoSizes = str;
    }

    public final java.util.List<java.lang.String> getNestedClasses() {
        return this.getOutputSizes;
    }

    public final java.util.List<java.lang.String> getEnumEntries() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmEnumEntry> getKmEnumEntries() {
        return this.getOutputSizeshNQ4ISI;
    }

    public final java.util.List<java.lang.String> getSealedSubclasses() {
        return this.getOutputStallDurationlomOqCM;
    }

    public final void setInlineClassUnderlyingPropertyName(java.lang.String str) {
        this.getOutputFormats = str;
    }

    public final kotlin.reflect.jvm.internal.impl.km.KmType getInlineClassUnderlyingType() {
        return this.getOutputMinFrameDuration;
    }

    public final void setInlineClassUnderlyingType(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        this.getOutputMinFrameDuration = kmType;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getAnnotations() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmType> getContextReceiverTypes() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement> getVersionRequirements() {
        return this.isOutputSupportedFor;
    }

    public final java.util.List<kotlin.reflect.jvm.internal.impl.km.internal.extensions.KmClassExtension> getExtensions$kotlin_metadata() {
        return this.getInputFormats;
    }
}
