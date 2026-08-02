package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0014\u0010 R\u0014\u0010$\u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020\u00058\u0017X\u0097D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001b\u0082\u0001\u0005()*+,"}, d2 = {"Lkotlinx/serialization/internal/ListLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "p0", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "isElementOptional", "(I)Z", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "elementDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "elementsCount", com.visa.cbp.getEncExpo.warmup, "getElementsCount", "Lkotlinx/serialization/internal/ArrayClassDesc;", "Lkotlinx/serialization/internal/ArrayListClassDesc;", "Lkotlinx/serialization/internal/HashSetClassDesc;", "Lkotlinx/serialization/internal/LinkedHashSetClassDesc;", "Lkotlinx/serialization/internal/PrimitiveArrayDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ListLikeDescriptor implements kotlinx.serialization.descriptors.SerialDescriptor {
    private final kotlinx.serialization.descriptors.SerialDescriptor elementDescriptor;
    private final int elementsCount;

    private ListLikeDescriptor(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        this.elementDescriptor = serialDescriptor;
        this.elementsCount = 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* bridge */ java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return super.getAnnotations();
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor() {
        return this.elementDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* bridge */ boolean isInline() {
        return super.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* bridge */ boolean isNullable() {
        return super.isNullable();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public kotlinx.serialization.descriptors.SerialKind getKind() {
        return kotlinx.serialization.descriptors.StructureKind.LIST.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public java.lang.String getElementName(int index) {
        return java.lang.String.valueOf(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(name2);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(name2);
        sb.append(" is not a valid list index");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        if (index >= 0) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal index ");
        sb.append(index);
        sb.append(", ");
        sb.append(getSerialName());
        sb.append(" expects only non-negative indices");
        throw new java.lang.IllegalArgumentException(sb.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public java.util.List<java.lang.annotation.Annotation> getElementAnnotations(int index) {
        if (index < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal index ");
            sb.append(index);
            sb.append(", ");
            sb.append(getSerialName());
            sb.append(" expects only non-negative indices");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index) {
        if (index < 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Illegal index ");
            sb.append(index);
            sb.append(", ");
            sb.append(getSerialName());
            sb.append(" expects only non-negative indices");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        return this.elementDescriptor;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlinx.serialization.internal.ListLikeDescriptor)) {
            return false;
        }
        kotlinx.serialization.internal.ListLikeDescriptor listLikeDescriptor = (kotlinx.serialization.internal.ListLikeDescriptor) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.elementDescriptor, listLikeDescriptor.elementDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(getSerialName(), listLikeDescriptor.getSerialName());
    }

    public int hashCode() {
        return (this.elementDescriptor.hashCode() * 31) + getSerialName().hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getSerialName());
        sb.append('(');
        sb.append(this.elementDescriptor);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ ListLikeDescriptor(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(serialDescriptor);
    }
}
