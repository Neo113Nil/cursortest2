package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public final class FindClassInModuleKt {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findNonGenericClassAcrossDependencies(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.name.ClassId classId, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notFoundClasses, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return findClassAcrossModuleDependencies != null ? findClassAcrossModuleDependencies : notFoundClasses.getClass(classId, kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.map(kotlin.sequences.SequencesKt.generateSequence(classId, new kotlin.jvm.internal.PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public final java.lang.Object get(java.lang.Object obj) {
                return ((kotlin.reflect.jvm.internal.impl.name.ClassId) obj).getOuterClassId();
            }
        }), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.name.ClassId) obj));
            }
        })));
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor findClassifierAcrossModuleDependencies(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor resolutionAnchorIfAny = kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(classId.getPackageFqName());
            java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> pathSegments = classId.getRelativeClassName().pathSegments();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor contributedClassifier = packageViewDescriptor.getMemberScope().mo23899getContributedClassifier((kotlin.reflect.jvm.internal.impl.name.Name) kotlin.collections.CollectionsKt.first((java.util.List) pathSegments), kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
            if (contributedClassifier == null) {
                return null;
            }
            for (kotlin.reflect.jvm.internal.impl.name.Name name2 : pathSegments.subList(1, pathSegments.size())) {
                if (!(contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier2 = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier).getUnsubstitutedInnerClassesScope().mo23899getContributedClassifier(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = contributedClassifier2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier2 : null;
                if (classDescriptor == null) {
                    return null;
                }
                contributedClassifier = classDescriptor;
            }
            return contributedClassifier;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(classId.getPackageFqName());
        java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> pathSegments2 = classId.getRelativeClassName().pathSegments();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor contributedClassifier3 = packageViewDescriptor2.getMemberScope().mo23899getContributedClassifier((kotlin.reflect.jvm.internal.impl.name.Name) kotlin.collections.CollectionsKt.first((java.util.List) pathSegments2), kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
        if (contributedClassifier3 != null) {
            for (kotlin.reflect.jvm.internal.impl.name.Name name3 : pathSegments2.subList(1, pathSegments2.size())) {
                if (contributedClassifier3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier4 = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier3).getUnsubstitutedInnerClassesScope().mo23899getContributedClassifier(name3, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = contributedClassifier4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier4 : null;
                    if (classDescriptor2 != null) {
                        contributedClassifier3 = classDescriptor2;
                    }
                }
            }
            if (contributedClassifier3 == null) {
                return contributedClassifier3;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(classId.getPackageFqName());
            java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> pathSegments3 = classId.getRelativeClassName().pathSegments();
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor contributedClassifier5 = packageViewDescriptor3.getMemberScope().mo23899getContributedClassifier((kotlin.reflect.jvm.internal.impl.name.Name) kotlin.collections.CollectionsKt.first((java.util.List) pathSegments3), kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
            if (contributedClassifier5 == null) {
                return null;
            }
            for (kotlin.reflect.jvm.internal.impl.name.Name name4 : pathSegments3.subList(1, pathSegments3.size())) {
                if (!(contributedClassifier5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                    return null;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier6 = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier5).getUnsubstitutedInnerClassesScope().mo23899getContributedClassifier(name4, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_DESERIALIZATION);
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor3 = contributedClassifier6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier6 : null;
                if (classDescriptor3 == null) {
                    return null;
                }
                contributedClassifier5 = classDescriptor3;
            }
            return contributedClassifier5;
        }
        contributedClassifier3 = null;
        if (contributedClassifier3 == null) {
        }
    }

    static /* synthetic */ int getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        return 0;
    }
}
