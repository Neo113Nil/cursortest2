package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class SubpackagesScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRangesFor;

    public SubpackagesScope(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        this.getHighResolutionOutputSizeshNQ4ISI = moduleDescriptor;
        this.getHighSpeedVideoFpsRangesFor = fqName;
    }

    protected final kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor getPackage(kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        if (name2.isSpecial()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor = this.getHighResolutionOutputSizeshNQ4ISI.getPackage(this.getHighSpeedVideoFpsRangesFor.child(name2));
        if (packageViewDescriptor.isEmpty()) {
            return null;
        }
        return packageViewDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (!descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getPACKAGES_MASK())) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        if (this.getHighSpeedVideoFpsRangesFor.isRoot() && descriptorKindFilter.getExcludes().contains(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude.TopLevelPackages.INSTANCE)) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> subPackagesOf = this.getHighResolutionOutputSizeshNQ4ISI.getSubPackagesOf(this.getHighSpeedVideoFpsRangesFor, function1);
        java.util.ArrayList arrayList = new java.util.ArrayList(subPackagesOf.size());
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.name.FqName> it = subPackagesOf.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.name.Name shortName = it.next().shortName();
            if (function1.invoke(shortName).booleanValue()) {
                kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(arrayList, getPackage(shortName));
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames() {
        return kotlin.collections.SetsKt.emptySet();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("subpackages of ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(" from ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        return sb.toString();
    }
}
