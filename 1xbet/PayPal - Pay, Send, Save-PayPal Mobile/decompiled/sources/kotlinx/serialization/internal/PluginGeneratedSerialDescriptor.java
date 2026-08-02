package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c2\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010*R\u001a\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010(R\u0014\u00105\u001a\u0002028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010A\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010>0:8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bC\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00030G8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\"\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070K8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010LR\u001f\u0010-\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030M0:8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\bA\u0010NR!\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00010:8AX\u0081\u0084\u0002¢\u0006\f\n\u0004\bO\u0010N\u001a\u0004\bP\u0010QR\u0015\u0010?\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b=\u0010N"}, d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "", "serialName", "Lkotlinx/serialization/internal/GeneratedSerializer;", "generatedSerializer", "", "elementsCount", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;I)V", "name", "", "isOptional", "", "addElement", "(Ljava/lang/String;Z)V", "", "annotation", "pushAnnotation", "(Ljava/lang/annotation/Annotation;)V", "a", "pushClassAnnotation", "index", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "isElementOptional", "(I)Z", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementName", "(I)Ljava/lang/String;", "getElementIndex", "(Ljava/lang/String;)I", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getSerialName", "getOutputFormats", "Lkotlinx/serialization/internal/GeneratedSerializer;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getElementsCount", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "getAnnotations", "()Ljava/util/List;", "annotations", "getHighResolutionOutputSizeshNQ4ISI", "", "getInputSizeshNQ4ISI", "[Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "", "getOutputMinFrameDuration", "[Ljava/util/List;", "Camera2StreamConfigurationMap", "Ljava/util/List;", "getHighSpeedVideoSizes", "", "[Z", "getHighSpeedVideoSizesFor", "", "getSerialNames", "()Ljava/util/Set;", "serialNames", "", "Ljava/util/Map;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/Lazy;", "typeParameterDescriptors$delegate", "getTypeParameterDescriptors$kotlinx_serialization_core", "()[Lkotlinx/serialization/descriptors/SerialDescriptor;", "typeParameterDescriptors"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class PluginGeneratedSerialDescriptor implements kotlinx.serialization.descriptors.SerialDescriptor, kotlinx.serialization.internal.CachedNames {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputFormats;
    private final int elementsCount;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.List<java.lang.annotation.Annotation> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean[] getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private java.util.Map<java.lang.String, java.lang.Integer> getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final kotlinx.serialization.internal.GeneratedSerializer<?> getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.util.List<java.lang.annotation.Annotation>[] Camera2StreamConfigurationMap;
    private final java.lang.String serialName;

    /* renamed from: typeParameterDescriptors$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy typeParameterDescriptors;

    public PluginGeneratedSerialDescriptor(java.lang.String str, kotlinx.serialization.internal.GeneratedSerializer<?> generatedSerializer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.serialName = str;
        this.getHighSpeedVideoFpsRanges = generatedSerializer;
        this.elementsCount = i;
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        java.lang.String[] strArr = new java.lang.String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.getHighSpeedVideoFpsRangesFor = strArr;
        int i3 = this.elementsCount;
        this.Camera2StreamConfigurationMap = new java.util.List[i3];
        this.getHighSpeedVideoSizesFor = new boolean[i3];
        this.getInputSizeshNQ4ISI = kotlin.collections.MapsKt.emptyMap();
        this.getOutputFormats = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.$r8$lambda$r9j3qqfSiBWrCfo_6pw28Hdd2Aw(kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.this);
            }
        });
        this.typeParameterDescriptors = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.$r8$lambda$4mtRWLjW2TpRxsL3JlSZxIGYDBM(kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.this);
            }
        });
        this.getOutputMinFrameDuration = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int hashCodeImpl;
                hashCodeImpl = kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt.hashCodeImpl(r0, kotlinx.serialization.internal.PluginGeneratedSerialDescriptor.this.getTypeParameterDescriptors$kotlinx_serialization_core());
                return java.lang.Integer.valueOf(hashCodeImpl);
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public /* bridge */ boolean getIsInline() {
        return super.getIsInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* bridge */ boolean isNullable() {
        return super.isNullable();
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(java.lang.String str, kotlinx.serialization.internal.GeneratedSerializer generatedSerializer, int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : generatedSerializer, i);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public java.lang.String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public kotlinx.serialization.descriptors.SerialKind getKind() {
        return kotlinx.serialization.descriptors.StructureKind.CLASS.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        java.util.List<java.lang.annotation.Annotation> list = this.getHighSpeedVideoSizes;
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public java.util.Set<java.lang.String> getSerialNames() {
        return this.getInputSizeshNQ4ISI.keySet();
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor[] getTypeParameterDescriptors$kotlinx_serialization_core() {
        return (kotlinx.serialization.descriptors.SerialDescriptor[]) this.typeParameterDescriptors.getValue();
    }

    public static /* synthetic */ void addElement$default(kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        pluginGeneratedSerialDescriptor.addElement(str, z);
    }

    public final void addElement(java.lang.String name2, boolean isOptional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.String[] strArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getHighResolutionOutputSizeshNQ4ISI + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        strArr[i] = name2;
        this.getHighSpeedVideoSizesFor[i] = isOptional;
        this.Camera2StreamConfigurationMap[i] = null;
        if (i == this.elementsCount - 1) {
            java.util.HashMap hashMap = new java.util.HashMap();
            int length = this.getHighSpeedVideoFpsRangesFor.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(this.getHighSpeedVideoFpsRangesFor[i2], java.lang.Integer.valueOf(i2));
            }
            this.getInputSizeshNQ4ISI = hashMap;
        }
    }

    public final void pushAnnotation(java.lang.annotation.Annotation annotation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotation, "");
        java.util.ArrayList arrayList = this.Camera2StreamConfigurationMap[this.getHighResolutionOutputSizeshNQ4ISI];
        if (arrayList == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
            this.Camera2StreamConfigurationMap[this.getHighResolutionOutputSizeshNQ4ISI] = arrayList2;
            arrayList = arrayList2;
        }
        arrayList.add(annotation);
    }

    public final void pushClassAnnotation(java.lang.annotation.Annotation a2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
        if (this.getHighSpeedVideoSizes == null) {
            this.getHighSpeedVideoSizes = new java.util.ArrayList(1);
        }
        java.util.List<java.lang.annotation.Annotation> list = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(list);
        list.add(a2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        return this.getHighSpeedVideoSizesFor[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public java.util.List<java.lang.annotation.Annotation> getElementAnnotations(int index) {
        java.util.List<java.lang.annotation.Annotation> list = this.Camera2StreamConfigurationMap[index];
        return list == null ? kotlin.collections.CollectionsKt.emptyList() : list;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public java.lang.String getElementName(int index) {
        return this.getHighSpeedVideoFpsRangesFor[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.Integer num = this.getInputSizeshNQ4ISI.get(name2);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public boolean equals(java.lang.Object other) {
        kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this;
        if (pluginGeneratedSerialDescriptor == other) {
            return true;
        }
        if (!(other instanceof kotlinx.serialization.internal.PluginGeneratedSerialDescriptor)) {
            return false;
        }
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) other;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(pluginGeneratedSerialDescriptor.getSerialName(), serialDescriptor.getSerialName()) || !java.util.Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), ((kotlinx.serialization.internal.PluginGeneratedSerialDescriptor) other).getTypeParameterDescriptors$kotlinx_serialization_core()) || pluginGeneratedSerialDescriptor.getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = pluginGeneratedSerialDescriptor.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(pluginGeneratedSerialDescriptor.getElementDescriptor(i).getSerialName(), serialDescriptor.getElementDescriptor(i).getSerialName()) || !kotlin.jvm.internal.Intrinsics.areEqual(pluginGeneratedSerialDescriptor.getElementDescriptor(i).getKind(), serialDescriptor.getElementDescriptor(i).getKind())) {
                return false;
            }
        }
        return true;
    }

    public java.lang.String toString() {
        return kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }

    public static /* synthetic */ kotlinx.serialization.descriptors.SerialDescriptor[] $r8$lambda$4mtRWLjW2TpRxsL3JlSZxIGYDBM(kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        java.util.ArrayList arrayList;
        kotlinx.serialization.KSerializer<?>[] typeParametersSerializers;
        kotlinx.serialization.internal.GeneratedSerializer<?> generatedSerializer = pluginGeneratedSerialDescriptor.getHighSpeedVideoFpsRanges;
        if (generatedSerializer == null || (typeParametersSerializers = generatedSerializer.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(typeParametersSerializers.length);
            for (kotlinx.serialization.KSerializer<?> kSerializer : typeParametersSerializers) {
                arrayList2.add(kSerializer.getDescriptor());
            }
            arrayList = arrayList2;
        }
        return kotlinx.serialization.internal.Platform_commonKt.compactArray(arrayList);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer[] $r8$lambda$r9j3qqfSiBWrCfo_6pw28Hdd2Aw(kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        kotlinx.serialization.KSerializer<?>[] childSerializers;
        kotlinx.serialization.internal.GeneratedSerializer<?> generatedSerializer = pluginGeneratedSerialDescriptor.getHighSpeedVideoFpsRanges;
        return (generatedSerializer == null || (childSerializers = generatedSerializer.childSerializers()) == null) ? kotlinx.serialization.internal.PluginHelperInterfacesKt.EMPTY_SERIALIZER_ARRAY : childSerializers;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index) {
        return ((kotlinx.serialization.KSerializer[]) this.getOutputFormats.getValue())[index].getDescriptor();
    }

    public int hashCode() {
        return ((java.lang.Number) this.getOutputMinFrameDuration.getValue()).intValue();
    }
}
