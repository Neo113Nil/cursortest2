package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* loaded from: classes5.dex */
public final class SingleModuleClassResolver implements kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver {
    public kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver resolver;

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClass(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "");
        return getResolver().resolveClass(javaClass);
    }

    public final kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver getResolver() {
        kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver javaDescriptorResolver = this.resolver;
        if (javaDescriptorResolver != null) {
            return javaDescriptorResolver;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setResolver(kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver javaDescriptorResolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaDescriptorResolver, "");
        this.resolver = javaDescriptorResolver;
    }
}
