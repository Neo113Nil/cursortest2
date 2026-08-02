package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public final class ModalityUtilsKt {
    public static final boolean isFinalClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        return classDescriptor.getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL && classDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS;
    }
}
