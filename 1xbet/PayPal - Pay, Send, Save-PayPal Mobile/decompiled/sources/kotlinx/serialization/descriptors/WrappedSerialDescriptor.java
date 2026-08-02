package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u0010R\u0014\u0010#\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\f8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010\u000eR\u0014\u0010)\u001a\u00020\t8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\t8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010*R\u0014\u0010/\u001a\u00020,8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b-\u0010."}, d2 = {"Lkotlinx/serialization/descriptors/WrappedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "serialName", com.visa.cbp.DeviceInfo.valueOf, "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "index", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "name", "getElementIndex", "(Ljava/lang/String;)I", "getElementName", "(I)Ljava/lang/String;", "isElementOptional", "(I)Z", "Ljava/lang/String;", "getSerialName", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getHighResolutionOutputSizeshNQ4ISI", "getAnnotations", "()Ljava/util/List;", "annotations", "getElementsCount", "elementsCount", "isInline", "()Z", "isNullable", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class WrappedSerialDescriptor implements kotlinx.serialization.descriptors.SerialDescriptor {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.serialization.descriptors.SerialDescriptor getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String serialName;

    public WrappedSerialDescriptor(java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDescriptor, "");
        this.serialName = str;
        this.getHighResolutionOutputSizeshNQ4ISI = serialDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String getSerialName() {
        return this.serialName;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlinx.serialization.descriptors.WrappedSerialDescriptor)) {
            return false;
        }
        kotlinx.serialization.descriptors.WrappedSerialDescriptor wrappedSerialDescriptor = (kotlinx.serialization.descriptors.WrappedSerialDescriptor) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getSerialName(), wrappedSerialDescriptor.getSerialName()) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, wrappedSerialDescriptor.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return (getSerialName().hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final java.lang.String toString() {
        return kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isNullable() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isNullable();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public final boolean getIsInline() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getIsInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int index) {
        return this.getHighResolutionOutputSizeshNQ4ISI.isElementOptional(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialKind getKind() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getKind();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getElementsCount();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String getElementName(int index) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getElementName(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.getElementIndex(name2);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getElementDescriptor(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List<java.lang.annotation.Annotation> getElementAnnotations(int index) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getElementAnnotations(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getAnnotations();
    }
}
