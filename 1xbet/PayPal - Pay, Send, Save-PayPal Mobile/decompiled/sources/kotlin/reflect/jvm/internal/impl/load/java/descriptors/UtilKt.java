package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

/* loaded from: classes5.dex */
public final class UtilKt {
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> copyValueParameters(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> collection, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> collection2, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2 = callableDescriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor2, "");
        collection.size();
        collection2.size();
        java.util.List<kotlin.Pair> zip = kotlin.collections.CollectionsKt.zip(collection, collection2);
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(zip, 10));
        for (kotlin.Pair pair : zip) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = (kotlin.reflect.jvm.internal.impl.types.KotlinType) pair.component1();
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) pair.component2();
            int index = valueParameterDescriptor.getIndex();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = valueParameterDescriptor.getAnnotations();
            kotlin.reflect.jvm.internal.impl.name.Name name2 = valueParameterDescriptor.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            boolean declaresDefaultValue = valueParameterDescriptor.declaresDefaultValue();
            boolean isCrossinline = valueParameterDescriptor.isCrossinline();
            boolean isNoinline = valueParameterDescriptor.isNoinline();
            kotlin.reflect.jvm.internal.impl.types.KotlinType arrayElementType = valueParameterDescriptor.getVarargElementType() != null ? kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getModule(callableDescriptor2).getBuiltIns().getArrayElementType(kotlinType) : null;
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = valueParameterDescriptor.getSource();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(source, "");
            arrayList.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(callableDescriptor, null, index, annotations, name2, kotlinType, declaresDefaultValue, isCrossinline, isNoinline, arrayElementType, source));
            callableDescriptor2 = callableDescriptor;
        }
        return arrayList;
    }

    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope getParentJavaStaticClassScope(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope lazyJavaStaticClassScope;
        do {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
            classDescriptor = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getSuperClassNotAny(classDescriptor);
            lazyJavaStaticClassScope = null;
            if (classDescriptor == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope staticScope = classDescriptor.getStaticScope();
            if (staticScope instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope) {
                lazyJavaStaticClassScope = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope) staticScope;
            }
        } while (lazyJavaStaticClassScope == null);
        return lazyJavaStaticClassScope;
    }
}
