package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public final class FieldDescriptorImpl extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotatedImpl implements kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor {
    private final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FieldDescriptorImpl(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        super(annotations);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        this.getHighSpeedVideoFpsRanges = propertyDescriptor;
    }
}
