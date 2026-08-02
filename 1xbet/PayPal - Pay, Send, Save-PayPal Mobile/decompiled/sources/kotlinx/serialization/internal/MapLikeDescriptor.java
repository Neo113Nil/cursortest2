package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0014\u0010,\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020\b8\u0017X\u0097D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u001d\u0082\u0001\u000201"}, d2 = {"Lkotlinx/serialization/internal/MapLikeDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "index", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "isElementOptional", "(I)Z", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "serialName", "Ljava/lang/String;", "getSerialName", "keyDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getKeyDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "valueDescriptor", "getValueDescriptor", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "elementsCount", com.visa.cbp.getEncExpo.warmup, "getElementsCount", "Lkotlinx/serialization/internal/HashMapClassDesc;", "Lkotlinx/serialization/internal/LinkedHashMapClassDesc;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class MapLikeDescriptor implements kotlinx.serialization.descriptors.SerialDescriptor {
    private final int elementsCount;
    private final kotlinx.serialization.descriptors.SerialDescriptor keyDescriptor;
    private final java.lang.String serialName;
    private final kotlinx.serialization.descriptors.SerialDescriptor valueDescriptor;

    private MapLikeDescriptor(java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor2) {
        this.serialName = str;
        this.keyDescriptor = serialDescriptor;
        this.valueDescriptor = serialDescriptor2;
        this.elementsCount = 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public /* bridge */ java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return super.getAnnotations();
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
    public java.lang.String getSerialName() {
        return this.serialName;
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getKeyDescriptor() {
        return this.keyDescriptor;
    }

    public final kotlinx.serialization.descriptors.SerialDescriptor getValueDescriptor() {
        return this.valueDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public kotlinx.serialization.descriptors.SerialKind getKind() {
        return kotlinx.serialization.descriptors.StructureKind.MAP.INSTANCE;
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
        sb.append(" is not a valid map index");
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
        int i = index % 2;
        if (i == 0) {
            return this.keyDescriptor;
        }
        if (i == 1) {
            return this.valueDescriptor;
        }
        throw new java.lang.IllegalStateException("Unreached".toString());
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlinx.serialization.internal.MapLikeDescriptor)) {
            return false;
        }
        kotlinx.serialization.internal.MapLikeDescriptor mapLikeDescriptor = (kotlinx.serialization.internal.MapLikeDescriptor) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getSerialName(), mapLikeDescriptor.getSerialName()) && kotlin.jvm.internal.Intrinsics.areEqual(this.keyDescriptor, mapLikeDescriptor.keyDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(this.valueDescriptor, mapLikeDescriptor.valueDescriptor);
    }

    public int hashCode() {
        return (((getSerialName().hashCode() * 31) + this.keyDescriptor.hashCode()) * 31) + this.valueDescriptor.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getSerialName());
        sb.append('(');
        sb.append(this.keyDescriptor);
        sb.append(", ");
        sb.append(this.valueDescriptor);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ MapLikeDescriptor(java.lang.String str, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serialDescriptor, serialDescriptor2);
    }
}
