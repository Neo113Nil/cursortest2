package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* loaded from: classes5.dex */
public interface ResolutionScope {
    /* renamed from: getContributedClassifier */
    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation);

    java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1);

    java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation);

    /* renamed from: recordLookup */
    void mo23903recordLookup(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation);

    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.util.Collection getContributedDescriptors$default(kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope resolutionScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i & 1) != 0) {
                descriptorKindFilter = kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.ALL;
            }
            if ((i & 2) != 0) {
                function1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Companion.getALL_NAME_FILTER();
            }
            return resolutionScope.getContributedDescriptors(descriptorKindFilter, function1);
        }

        public static void recordLookup(kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope resolutionScope, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
            resolutionScope.getContributedFunctions(name2, lookupLocation);
        }
    }
}
