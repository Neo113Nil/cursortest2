package kotlinx.serialization.descriptors;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!À\u0006\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "", "index", "", "getElementName", "(I)Ljava/lang/String;", "name", "getElementIndex", "(Ljava/lang/String;)I", "", "", "getElementAnnotations", "(I)Ljava/util/List;", "getElementDescriptor", "(I)Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "isElementOptional", "(I)Z", "getSerialName", "()Ljava/lang/String;", "serialName", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kind", "isNullable", "()Z", "isInline", "getElementsCount", "()I", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SerialDescriptor {
    java.util.List<java.lang.annotation.Annotation> getElementAnnotations(int index);

    kotlinx.serialization.descriptors.SerialDescriptor getElementDescriptor(int index);

    int getElementIndex(java.lang.String name2);

    java.lang.String getElementName(int index);

    int getElementsCount();

    kotlinx.serialization.descriptors.SerialKind getKind();

    java.lang.String getSerialName();

    boolean isElementOptional(int index);

    default boolean isInline() {
        return false;
    }

    default boolean isNullable() {
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean isNullable(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
            return kotlinx.serialization.descriptors.SerialDescriptor.super.isNullable();
        }

        @java.lang.Deprecated
        public static boolean isInline(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
            return kotlinx.serialization.descriptors.SerialDescriptor.super.isInline();
        }

        @java.lang.Deprecated
        public static java.util.List<java.lang.annotation.Annotation> getAnnotations(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
            return kotlinx.serialization.descriptors.SerialDescriptor.super.getAnnotations();
        }
    }

    default java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
