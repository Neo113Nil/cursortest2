package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public final class JavaDescriptorUtilKt {
    public static final boolean isJavaField(kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptor, "");
        return propertyDescriptor.getGetter() == null;
    }
}
