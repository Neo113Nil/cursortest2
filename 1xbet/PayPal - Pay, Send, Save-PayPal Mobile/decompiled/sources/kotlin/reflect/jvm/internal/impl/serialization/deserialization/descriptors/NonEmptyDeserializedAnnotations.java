package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

/* loaded from: classes5.dex */
public final class NonEmptyDeserializedAnnotations extends kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations {
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonEmptyDeserializedAnnotations(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>> function0) {
        super(storageManager, function0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
    }
}
