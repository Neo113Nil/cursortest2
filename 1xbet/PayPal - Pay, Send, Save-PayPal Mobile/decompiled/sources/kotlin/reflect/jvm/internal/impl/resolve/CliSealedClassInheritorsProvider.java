package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public final class CliSealedClassInheritorsProvider extends kotlin.reflect.jvm.internal.impl.resolve.SealedClassInheritorsProvider {
    public static final kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider();

    private CliSealedClassInheritorsProvider() {
    }

    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> computeSealedSubclasses(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        if (classDescriptor.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (!z) {
            declarationDescriptor2 = classDescriptor.getContainingDeclaration();
        } else {
            java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> it = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getParents(classDescriptor).iterator();
            while (true) {
                if (!it.hasNext()) {
                    declarationDescriptor = null;
                    break;
                }
                declarationDescriptor = it.next();
                if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
                    break;
                }
            }
            declarationDescriptor2 = declarationDescriptor;
        }
        if (declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
            getHighSpeedVideoFpsRangesFor(classDescriptor, linkedHashSet, ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor2).getMemberScope(), z);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope = classDescriptor.getUnsubstitutedInnerClassesScope();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unsubstitutedInnerClassesScope, "");
        getHighSpeedVideoFpsRangesFor(classDescriptor, linkedHashSet, unsubstitutedInnerClassesScope, true);
        return kotlin.collections.CollectionsKt.sortedWith(linkedHashSet, new java.util.Comparator() { // from class: kotlin.reflect.jvm.internal.impl.resolve.CliSealedClassInheritorsProvider$computeSealedSubclasses$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) t).asString(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) t2).asString());
            }
        });
    }

    private static final void getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> linkedHashSet, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, boolean z) {
        for (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor : kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.CLASSIFIERS, null, 2, null)) {
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor;
                if (classDescriptor2.isExpect()) {
                    kotlin.reflect.jvm.internal.impl.name.Name name2 = classDescriptor2.getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = memberScope.mo23899getContributedClassifier(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    if (contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                        classDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier;
                    } else {
                        classDescriptor2 = contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor ? ((kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) contributedClassifier).getClassDescriptor() : null;
                    }
                }
                if (classDescriptor2 != null) {
                    if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isDirectSubclass(classDescriptor2, classDescriptor)) {
                        linkedHashSet.add(classDescriptor2);
                    }
                    if (z) {
                        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope unsubstitutedInnerClassesScope = classDescriptor2.getUnsubstitutedInnerClassesScope();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unsubstitutedInnerClassesScope, "");
                        getHighSpeedVideoFpsRangesFor(classDescriptor, linkedHashSet, unsubstitutedInnerClassesScope, z);
                    }
                }
            }
        }
    }
}
