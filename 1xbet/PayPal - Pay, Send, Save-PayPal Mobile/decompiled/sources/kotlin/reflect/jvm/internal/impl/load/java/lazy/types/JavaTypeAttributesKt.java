package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* loaded from: classes5.dex */
public final class JavaTypeAttributesKt {
    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage typeUsage, boolean z, boolean z2, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            typeParameterDescriptor = null;
        }
        return toAttributes(typeUsage, z, z2, typeParameterDescriptor);
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes toAttributes(kotlin.reflect.jvm.internal.impl.types.TypeUsage typeUsage, boolean z, boolean z2, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeUsage, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes(typeUsage, null, z2, z, typeParameterDescriptor != null ? kotlin.collections.SetsKt.setOf(typeParameterDescriptor) : null, null, 34, null);
    }
}
