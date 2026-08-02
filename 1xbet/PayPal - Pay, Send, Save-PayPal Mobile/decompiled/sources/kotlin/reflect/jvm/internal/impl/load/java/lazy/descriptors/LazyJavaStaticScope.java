package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public abstract class LazyJavaStaticScope extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope {
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getDispatchReceiverParameter() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        super(lazyJavaResolverContext, null, 2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData resolveMethodSignature(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod javaMethod, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope.MethodSignatureData(kotlinType, null, list2, list, false, kotlin.collections.CollectionsKt.emptyList());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void computeNonDeclaredProperties(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
    }
}
