package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\"R&\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00150\t8\u0017X\u0096\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R \u00103\u001a\b\u0012\u0004\u0012\u00020\u0003028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0001078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010;\u001a\u00020@8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010AR \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070B8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\u0001078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010<R\u0015\u0010H\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b:\u0010G"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptorImpl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "", "serialName", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "", "elementsCount", "", "typeParameters", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "builder", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;ILjava/util/List;Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;)V", "index", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "isElementOptional", "(I)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getSerialName", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", com.visa.cbp.getEncExpo.warmup, "getElementsCount", "annotations", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "getAnnotations$annotations", "()V", "", "serialNames", "Ljava/util/Set;", "getSerialNames", "()Ljava/util/Set;", "", "Camera2StreamConfigurationMap", "[Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "[Ljava/util/List;", "", "[Z", "", "getOutputMinFrameDuration", "Ljava/util/Map;", "getOutputFormats", "getHighSpeedVideoSizesFor", "Lkotlin/Lazy;", "getInputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SerialDescriptorImpl implements kotlinx.serialization.descriptors.SerialDescriptor, kotlinx.serialization.internal.CachedNames {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String[] getHighSpeedVideoFpsRanges;
    private final java.util.List<java.lang.annotation.Annotation> annotations;
    private final int elementsCount;
    private final java.util.List<java.lang.annotation.Annotation>[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.descriptors.SerialDescriptor[] getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.serialization.descriptors.SerialDescriptor[] getHighSpeedVideoSizesFor;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Integer> Camera2StreamConfigurationMap;
    private final kotlinx.serialization.descriptors.SerialKind kind;
    private final java.lang.String serialName;
    private final java.util.Set<java.lang.String> serialNames;

    public static /* synthetic */ void getAnnotations$annotations() {
    }

    public SerialDescriptorImpl(java.lang.String str, kotlinx.serialization.descriptors.SerialKind serialKind, int i, java.util.List<? extends kotlinx.serialization.descriptors.SerialDescriptor> list, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialKind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classSerialDescriptorBuilder, "");
        this.serialName = str;
        this.kind = serialKind;
        this.elementsCount = i;
        this.annotations = classSerialDescriptorBuilder.getAnnotations();
        this.serialNames = kotlin.collections.CollectionsKt.toHashSet(classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core());
        java.lang.String[] strArr = (java.lang.String[]) classSerialDescriptorBuilder.getElementNames$kotlinx_serialization_core().toArray(new java.lang.String[0]);
        this.getHighSpeedVideoFpsRanges = strArr;
        this.getHighSpeedVideoSizes = kotlinx.serialization.internal.Platform_commonKt.compactArray(classSerialDescriptorBuilder.getElementDescriptors$kotlinx_serialization_core());
        this.getHighResolutionOutputSizeshNQ4ISI = (java.util.List[]) classSerialDescriptorBuilder.getElementAnnotations$kotlinx_serialization_core().toArray(new java.util.List[0]);
        this.getHighSpeedVideoFpsRangesFor = kotlin.collections.CollectionsKt.toBooleanArray(classSerialDescriptorBuilder.getElementOptionality$kotlinx_serialization_core());
        java.lang.Iterable<kotlin.collections.IndexedValue> withIndex = kotlin.collections.ArraysKt.withIndex(strArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(withIndex, 10));
        for (kotlin.collections.IndexedValue indexedValue : withIndex) {
            arrayList.add(kotlin.TuplesKt.to(indexedValue.getValue(), java.lang.Integer.valueOf(indexedValue.getIndex())));
        }
        this.Camera2StreamConfigurationMap = kotlin.collections.MapsKt.toMap(arrayList);
        this.getHighSpeedVideoSizesFor = kotlinx.serialization.internal.Platform_commonKt.compactArray(list);
        this.getInputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int hashCodeImpl;
                hashCodeImpl = kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt.hashCodeImpl(r0, kotlinx.serialization.descriptors.SerialDescriptorImpl.this.getHighSpeedVideoSizesFor);
                return java.lang.Integer.valueOf(hashCodeImpl);
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public final /* bridge */ boolean getIsInline() {
        return super.getIsInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* bridge */ boolean isNullable() {
        return super.isNullable();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: getSerialName, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialKind getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public final java.util.Set<java.lang.String> getSerialNames() {
        return this.serialNames;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String getElementName(int index) {
        return this.getHighSpeedVideoFpsRanges[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.Integer num = this.Camera2StreamConfigurationMap.get(name2);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List<java.lang.annotation.Annotation> getElementAnnotations(int index) {
        return this.getHighResolutionOutputSizeshNQ4ISI[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index) {
        return this.getHighSpeedVideoSizes[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int index) {
        return this.getHighSpeedVideoFpsRangesFor[index];
    }

    public final boolean equals(java.lang.Object other) {
        kotlinx.serialization.descriptors.SerialDescriptorImpl serialDescriptorImpl = this;
        if (serialDescriptorImpl == other) {
            return true;
        }
        if (!(other instanceof kotlinx.serialization.descriptors.SerialDescriptorImpl)) {
            return false;
        }
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) other;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptorImpl.getGetHighSpeedVideoSizes(), serialDescriptor.getGetHighSpeedVideoSizes()) || !java.util.Arrays.equals(this.getHighSpeedVideoSizesFor, ((kotlinx.serialization.descriptors.SerialDescriptorImpl) other).getHighSpeedVideoSizesFor) || serialDescriptorImpl.getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = serialDescriptorImpl.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptorImpl.getElementDescriptor(i).getGetHighSpeedVideoSizes(), serialDescriptor.getElementDescriptor(i).getGetHighSpeedVideoSizes()) || !kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptorImpl.getElementDescriptor(i).getKind(), serialDescriptor.getElementDescriptor(i).getKind())) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String toString() {
        return kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }

    public final int hashCode() {
        return ((java.lang.Number) this.getInputSizeshNQ4ISI.getValue()).intValue();
    }
}
