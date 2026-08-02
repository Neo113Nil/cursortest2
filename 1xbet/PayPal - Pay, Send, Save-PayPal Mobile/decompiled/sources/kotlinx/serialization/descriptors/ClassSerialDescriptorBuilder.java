package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u00020\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010\u001b\u0012\u0004\b \u0010\u001a\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010\u001b\u001a\u0004\b#\u0010\u001dR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070!8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010\u001dR&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0!8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u001dR \u0010,\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b,\u0010\u001b\u001a\u0004\b-\u0010\u001d"}, d2 = {"Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "", "", "serialName", "<init>", "(Ljava/lang/String;)V", "elementName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "", "annotations", "", "isOptional", "", "element", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/util/List;Z)V", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "isNullable", "Z", "()Z", "setNullable", "(Z)V", "isNullable$annotations", "()V", "Ljava/util/List;", "getAnnotations", "()Ljava/util/List;", "setAnnotations", "(Ljava/util/List;)V", "getAnnotations$annotations", "", "elementNames", "getElementNames$kotlinx_serialization_core", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI", "elementDescriptors", "getElementDescriptors$kotlinx_serialization_core", "elementAnnotations", "getElementAnnotations$kotlinx_serialization_core", "elementOptionality", "getElementOptionality$kotlinx_serialization_core"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClassSerialDescriptorBuilder {
    private java.util.List<? extends java.lang.annotation.Annotation> annotations;
    private final java.util.List<java.util.List<java.lang.annotation.Annotation>> elementAnnotations;
    private final java.util.List<kotlinx.serialization.descriptors.SerialDescriptor> elementDescriptors;
    private final java.util.List<java.lang.String> elementNames;
    private final java.util.List<java.lang.Boolean> elementOptionality;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private boolean isNullable;
    private final java.lang.String serialName;

    @kotlinx.serialization.ExperimentalSerializationApi
    public static /* synthetic */ void getAnnotations$annotations() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "isNullable inside buildSerialDescriptor is deprecated. Please use SerialDescriptor.nullable extension on a builder result.")
    @kotlinx.serialization.ExperimentalSerializationApi
    public static /* synthetic */ void isNullable$annotations() {
    }

    public ClassSerialDescriptorBuilder(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.serialName = str;
        this.annotations = kotlin.collections.CollectionsKt.emptyList();
        this.elementNames = new java.util.ArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashSet();
        this.elementDescriptors = new java.util.ArrayList();
        this.elementAnnotations = new java.util.ArrayList();
        this.elementOptionality = new java.util.ArrayList();
    }

    public final java.lang.String getSerialName() {
        return this.serialName;
    }

    /* renamed from: isNullable, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    public final void setNullable(boolean z) {
        this.isNullable = z;
    }

    public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return this.annotations;
    }

    public final void setAnnotations(java.util.List<? extends java.lang.annotation.Annotation> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.annotations = list;
    }

    public final java.util.List<java.lang.String> getElementNames$kotlinx_serialization_core() {
        return this.elementNames;
    }

    public final java.util.List<kotlinx.serialization.descriptors.SerialDescriptor> getElementDescriptors$kotlinx_serialization_core() {
        return this.elementDescriptors;
    }

    public final java.util.List<java.util.List<java.lang.annotation.Annotation>> getElementAnnotations$kotlinx_serialization_core() {
        return this.elementAnnotations;
    }

    public final java.util.List<java.lang.Boolean> getElementOptionality$kotlinx_serialization_core() {
        return this.elementOptionality;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void element$default(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder classSerialDescriptorBuilder, java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list = kotlin.collections.CollectionsKt.emptyList();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        classSerialDescriptorBuilder.element(str, serialDescriptor, list, z);
    }

    public final void element(java.lang.String elementName, kotlinx.serialization.descriptors.SerialDescriptor descriptor, java.util.List<? extends java.lang.annotation.Annotation> annotations, boolean isOptional) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        if (!this.getHighResolutionOutputSizeshNQ4ISI.add(elementName)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Element with name '");
            sb.append(elementName);
            sb.append("' is already registered in ");
            sb.append(this.serialName);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        this.elementNames.add(elementName);
        this.elementDescriptors.add(descriptor);
        this.elementAnnotations.add(annotations);
        this.elementOptionality.add(java.lang.Boolean.valueOf(isOptional));
    }
}
