package kotlinx.serialization.descriptors;

/* compiled from: SerialDescriptors.kt */
@kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\bH\u0016J\u0010\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004H\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010.\u001a\u00020\bH\u0016J\u0010\u00102\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\bH\u0016J\u0010\u00103\u001a\u0002042\u0006\u0010.\u001a\u00020\bH\u0016J\u0013\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u000107H\u0096\u0002J\b\u00108\u001a\u00020\bH\u0016J\b\u00109\u001a\u00020\u0004H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u001c\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\n0\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u001eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010!R\u001b\u0010)\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b*\u0010\u0014¨\u0006:"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptorImpl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "serialName", "", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "elementsCount", "", "typeParameters", "", "builder", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialKind;ILjava/util/List;Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;)V", "getSerialName", "()Ljava/lang/String;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "getElementsCount", "()I", "annotations", "", "getAnnotations", "()Ljava/util/List;", "serialNames", "", "getSerialNames", "()Ljava/util/Set;", "elementNames", "", "[Ljava/lang/String;", "elementDescriptors", "[Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementAnnotations", "[Ljava/util/List;", "elementOptionality", "", "name2Index", "", "typeParametersDescriptors", "_hashCode", "get_hashCode", "_hashCode$delegate", "Lkotlin/Lazy;", "getElementName", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "getElementIndex", "name", "getElementAnnotations", "getElementDescriptor", "isElementOptional", "", "equals", "other", "", "hashCode", "toString", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SerialDescriptorImpl implements kotlinx.serialization.descriptors.SerialDescriptor, kotlinx.serialization.internal.CachedNames {

    /* renamed from: _hashCode$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy _hashCode;
    private final java.util.List<java.lang.annotation.Annotation> annotations;
    private final java.util.List<java.lang.annotation.Annotation>[] elementAnnotations;
    private final kotlinx.serialization.descriptors.SerialDescriptor[] elementDescriptors;
    private final java.lang.String[] elementNames;
    private final boolean[] elementOptionality;
    private final int elementsCount;
    private final kotlinx.serialization.descriptors.SerialKind kind;
    private final java.util.Map<java.lang.String, java.lang.Integer> name2Index;
    private final java.lang.String serialName;
    private final java.util.Set<java.lang.String> serialNames;
    private final kotlinx.serialization.descriptors.SerialDescriptor[] typeParametersDescriptors;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public /* synthetic */ boolean getIsInline() {
        return kotlinx.serialization.descriptors.SerialDescriptor.CC.$default$isInline(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* synthetic */ boolean isNullable() {
        return kotlinx.serialization.descriptors.SerialDescriptor.CC.$default$isNullable(this);
    }

    public SerialDescriptorImpl(java.lang.String serialName, kotlinx.serialization.descriptors.SerialKind kind, int i, java.util.List<? extends kotlinx.serialization.descriptors.SerialDescriptor> typeParameters, kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialName, "serialName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "kind");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        this.serialName = serialName;
        this.kind = kind;
        this.elementsCount = i;
        this.annotations = builder.getAnnotations();
        this.serialNames = kotlin.collections.CollectionsKt.toHashSet(builder.getElementNames$kotlinx_serialization_core());
        java.lang.String[] strArr = (java.lang.String[]) builder.getElementNames$kotlinx_serialization_core().toArray(new java.lang.String[0]);
        this.elementNames = strArr;
        this.elementDescriptors = kotlinx.serialization.internal.Platform_commonKt.compactArray(builder.getElementDescriptors$kotlinx_serialization_core());
        this.elementAnnotations = (java.util.List[]) builder.getElementAnnotations$kotlinx_serialization_core().toArray(new java.util.List[0]);
        this.elementOptionality = kotlin.collections.CollectionsKt.toBooleanArray(builder.getElementOptionality$kotlinx_serialization_core());
        java.lang.Iterable<kotlin.collections.IndexedValue> withIndex = kotlin.collections.ArraysKt.withIndex(strArr);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(withIndex, 10));
        for (kotlin.collections.IndexedValue indexedValue : withIndex) {
            arrayList.add(kotlin.TuplesKt.to(indexedValue.getValue(), java.lang.Integer.valueOf(indexedValue.getIndex())));
        }
        this.name2Index = kotlin.collections.MapsKt.toMap(arrayList);
        this.typeParametersDescriptors = kotlinx.serialization.internal.Platform_commonKt.compactArray(typeParameters);
        this._hashCode = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: kotlinx.serialization.descriptors.SerialDescriptorImpl$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                int _hashCode_delegate$lambda$1;
                _hashCode_delegate$lambda$1 = kotlinx.serialization.descriptors.SerialDescriptorImpl._hashCode_delegate$lambda$1(kotlinx.serialization.descriptors.SerialDescriptorImpl.this);
                return java.lang.Integer.valueOf(_hashCode_delegate$lambda$1);
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public java.lang.String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public kotlinx.serialization.descriptors.SerialKind getKind() {
        return this.kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return this.annotations;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public java.util.Set<java.lang.String> getSerialNames() {
        return this.serialNames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int _hashCode_delegate$lambda$1(kotlinx.serialization.descriptors.SerialDescriptorImpl serialDescriptorImpl) {
        return kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt.hashCodeImpl(serialDescriptorImpl, serialDescriptorImpl.typeParametersDescriptors);
    }

    private final int get_hashCode() {
        return ((java.lang.Number) this._hashCode.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public java.lang.String getElementName(int index) {
        return this.elementNames[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        java.lang.Integer num = this.name2Index.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public java.util.List<java.lang.annotation.Annotation> getElementAnnotations(int index) {
        return this.elementAnnotations[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index) {
        return this.elementDescriptors[index];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        return this.elementOptionality[index];
    }

    public boolean equals(java.lang.Object other) {
        int i;
        kotlinx.serialization.descriptors.SerialDescriptorImpl serialDescriptorImpl = this;
        if (serialDescriptorImpl == other) {
            return true;
        }
        if (other instanceof kotlinx.serialization.descriptors.SerialDescriptorImpl) {
            kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = (kotlinx.serialization.descriptors.SerialDescriptor) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptorImpl.getSerialName(), serialDescriptor.getSerialName()) && java.util.Arrays.equals(this.typeParametersDescriptors, ((kotlinx.serialization.descriptors.SerialDescriptorImpl) other).typeParametersDescriptors) && serialDescriptorImpl.getElementsCount() == serialDescriptor.getElementsCount()) {
                int elementsCount = serialDescriptorImpl.getElementsCount();
                while (i < elementsCount) {
                    i = (kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptorImpl.getElementDescriptor(i).getSerialName(), serialDescriptor.getElementDescriptor(i).getSerialName()) && kotlin.jvm.internal.Intrinsics.areEqual(serialDescriptorImpl.getElementDescriptor(i).getKind(), serialDescriptor.getElementDescriptor(i).getKind())) ? i + 1 : 0;
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return get_hashCode();
    }

    public java.lang.String toString() {
        return kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }
}
