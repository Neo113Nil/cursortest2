package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* loaded from: classes5.dex */
public final class CompositeSyntheticJavaPartsProvider implements kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider {
    private final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeSyntheticJavaPartsProvider(java.util.List<? extends kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoFpsRanges = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getMethodNames(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider> list = this.getHighSpeedVideoFpsRanges;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider) it.next()).getMethodNames(classDescriptor, lazyJavaResolverContext));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void generateMethods(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider) it.next()).generateMethods(classDescriptor, name2, collection, lazyJavaResolverContext);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getStaticFunctionNames(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider> list = this.getHighSpeedVideoFpsRanges;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider) it.next()).getStaticFunctionNames(classDescriptor, lazyJavaResolverContext));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void generateStaticFunctions(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider) it.next()).generateStaticFunctions(classDescriptor, name2, collection, lazyJavaResolverContext);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void generateConstructors(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> list, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider) it.next()).generateConstructors(classDescriptor, list, lazyJavaResolverContext);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> getNestedClassNames(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider> list = this.getHighSpeedVideoFpsRanges;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, ((kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider) it.next()).getNestedClassNames(classDescriptor, lazyJavaResolverContext));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final void generateNestedClass(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> list, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            ((kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider) it.next()).generateNestedClass(classDescriptor, name2, list, lazyJavaResolverContext);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider
    public final kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl modifyField(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl propertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(propertyDescriptorImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoFpsRanges.iterator();
        while (it.hasNext()) {
            propertyDescriptorImpl = ((kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider) it.next()).modifyField(classDescriptor, propertyDescriptorImpl, lazyJavaResolverContext);
        }
        return propertyDescriptorImpl;
    }
}
