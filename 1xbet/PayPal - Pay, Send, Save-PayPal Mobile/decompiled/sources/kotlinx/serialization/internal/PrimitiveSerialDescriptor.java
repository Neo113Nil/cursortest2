package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001f"}, d2 = {"Lkotlinx/serialization/internal/PrimitiveSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "serialName", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "kind", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/PrimitiveKind;)V", "", "index", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "isElementOptional", "(I)Z", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "getSerialName", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "getKind", "()Lkotlinx/serialization/descriptors/PrimitiveKind;", "getElementsCount", "elementsCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PrimitiveSerialDescriptor implements kotlinx.serialization.descriptors.SerialDescriptor {
    private final kotlinx.serialization.descriptors.PrimitiveKind kind;
    private final java.lang.String serialName;

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return 0;
    }

    public PrimitiveSerialDescriptor(java.lang.String str, kotlinx.serialization.descriptors.PrimitiveKind primitiveKind) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primitiveKind, "");
        this.serialName = str;
        this.kind = primitiveKind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* bridge */ java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return super.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* bridge */ boolean isInline() {
        return super.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* bridge */ boolean isNullable() {
        return super.isNullable();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String getSerialName() {
        return this.serialName;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.PrimitiveKind getKind() {
        return this.kind;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PrimitiveDescriptor(");
        sb.append(getSerialName());
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlinx.serialization.internal.PrimitiveSerialDescriptor)) {
            return false;
        }
        kotlinx.serialization.internal.PrimitiveSerialDescriptor primitiveSerialDescriptor = (kotlinx.serialization.internal.PrimitiveSerialDescriptor) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getSerialName(), primitiveSerialDescriptor.getSerialName()) && kotlin.jvm.internal.Intrinsics.areEqual(getKind(), primitiveSerialDescriptor.getKind());
    }

    public final int hashCode() {
        return getSerialName().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List<java.lang.annotation.Annotation> getElementAnnotations(int index) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Primitive descriptor ");
        sb.append(getSerialName());
        sb.append(" does not have elements");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Primitive descriptor ");
        sb.append(getSerialName());
        sb.append(" does not have elements");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Primitive descriptor ");
        sb.append(getSerialName());
        sb.append(" does not have elements");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String getElementName(int index) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Primitive descriptor ");
        sb.append(getSerialName());
        sb.append(" does not have elements");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int index) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Primitive descriptor ");
        sb.append(getSerialName());
        sb.append(" does not have elements");
        throw new java.lang.IllegalStateException(sb.toString());
    }
}
