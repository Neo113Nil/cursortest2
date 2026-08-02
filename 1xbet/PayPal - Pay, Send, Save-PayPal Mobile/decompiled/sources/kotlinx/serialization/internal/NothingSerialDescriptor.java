package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00068\u0017X\u0097D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0016R\u0014\u0010&\u001a\u00020\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001c"}, d2 = {"Lkotlinx/serialization/internal/NothingSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "", "index", "", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "isElementOptional", "(I)Z", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lkotlinx/serialization/descriptors/SerialKind;", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "serialName", "Ljava/lang/String;", "getSerialName", "getElementsCount", "elementsCount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NothingSerialDescriptor implements kotlinx.serialization.descriptors.SerialDescriptor {
    public static final kotlinx.serialization.internal.NothingSerialDescriptor INSTANCE = new kotlinx.serialization.internal.NothingSerialDescriptor();
    private static final kotlinx.serialization.descriptors.SerialKind kind = kotlinx.serialization.descriptors.StructureKind.OBJECT.INSTANCE;
    private static final java.lang.String serialName = "kotlin.Nothing";

    public final boolean equals(java.lang.Object other) {
        return this == other;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return 0;
    }

    private NothingSerialDescriptor() {
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
    public final kotlinx.serialization.descriptors.SerialKind getKind() {
        return kind;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String getSerialName() {
        return serialName;
    }

    public final java.lang.String toString() {
        return "NothingSerialDescriptor";
    }

    public final int hashCode() {
        return getSerialName().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.util.List<java.lang.annotation.Annotation> getElementAnnotations(int index) {
        throw new java.lang.IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index) {
        throw new java.lang.IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementIndex(java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        throw new java.lang.IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final java.lang.String getElementName(int index) {
        throw new java.lang.IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isElementOptional(int index) {
        throw new java.lang.IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }
}
