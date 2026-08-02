package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ResolutionAnchorProviderKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.sequences.SequencesKt;

@SourceDebugExtension({"SMAP\nfindClassInModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n1#1,66:1\n43#1,2:67\n*S KotlinDebug\n*F\n+ 1 findClassInModule.kt\norg/jetbrains/kotlin/descriptors/FindClassInModuleKt\n*L\n23#1:67,2\n*E\n"})
/* loaded from: classes5.dex */
public final class FindClassInModuleKt {
    public static final ClassDescriptor findClassAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof ClassDescriptor) {
            return (ClassDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ClassifierDescriptor findClassifierAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ModuleDescriptor resolutionAnchorIfAny = ResolutionAnchorProviderKt.getResolutionAnchorIfAny(moduleDescriptor);
        if (resolutionAnchorIfAny == null) {
            FqName packageFqName = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptor = moduleDescriptor.getPackage(packageFqName);
            List<Name> pathSegments = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "classId.relativeClassName.pathSegments()");
            MemberScope memberScope = packageViewDescriptor.getMemberScope();
            Object first = CollectionsKt.first((List<? extends Object>) pathSegments);
            Intrinsics.checkNotNullExpressionValue(first, "segments.first()");
            ClassifierDescriptor mo3000getContributedClassifier = memberScope.mo3000getContributedClassifier((Name) first, NoLookupLocation.FROM_DESERIALIZATION);
            if (mo3000getContributedClassifier != null) {
                for (Name name : pathSegments.subList(1, pathSegments.size())) {
                    if (mo3000getContributedClassifier instanceof ClassDescriptor) {
                        MemberScope unsubstitutedInnerClassesScope = ((ClassDescriptor) mo3000getContributedClassifier).getUnsubstitutedInnerClassesScope();
                        Intrinsics.checkNotNullExpressionValue(name, "name");
                        ClassifierDescriptor mo3000getContributedClassifier2 = unsubstitutedInnerClassesScope.mo3000getContributedClassifier(name, NoLookupLocation.FROM_DESERIALIZATION);
                        mo3000getContributedClassifier = mo3000getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) mo3000getContributedClassifier2 : null;
                        if (mo3000getContributedClassifier != null) {
                        }
                    }
                }
                return mo3000getContributedClassifier;
            }
        } else {
            FqName packageFqName2 = classId.getPackageFqName();
            Intrinsics.checkNotNullExpressionValue(packageFqName2, "classId.packageFqName");
            PackageViewDescriptor packageViewDescriptor2 = resolutionAnchorIfAny.getPackage(packageFqName2);
            List<Name> pathSegments2 = classId.getRelativeClassName().pathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments2, "classId.relativeClassName.pathSegments()");
            MemberScope memberScope2 = packageViewDescriptor2.getMemberScope();
            Object first2 = CollectionsKt.first((List<? extends Object>) pathSegments2);
            Intrinsics.checkNotNullExpressionValue(first2, "segments.first()");
            ClassifierDescriptor mo3000getContributedClassifier3 = memberScope2.mo3000getContributedClassifier((Name) first2, NoLookupLocation.FROM_DESERIALIZATION);
            if (mo3000getContributedClassifier3 != null) {
                for (Name name2 : pathSegments2.subList(1, pathSegments2.size())) {
                    if (mo3000getContributedClassifier3 instanceof ClassDescriptor) {
                        MemberScope unsubstitutedInnerClassesScope2 = ((ClassDescriptor) mo3000getContributedClassifier3).getUnsubstitutedInnerClassesScope();
                        Intrinsics.checkNotNullExpressionValue(name2, "name");
                        ClassifierDescriptor mo3000getContributedClassifier4 = unsubstitutedInnerClassesScope2.mo3000getContributedClassifier(name2, NoLookupLocation.FROM_DESERIALIZATION);
                        mo3000getContributedClassifier3 = mo3000getContributedClassifier4 instanceof ClassDescriptor ? (ClassDescriptor) mo3000getContributedClassifier4 : null;
                        if (mo3000getContributedClassifier3 != null) {
                        }
                    }
                }
                if (mo3000getContributedClassifier3 == null) {
                    return mo3000getContributedClassifier3;
                }
                FqName packageFqName3 = classId.getPackageFqName();
                Intrinsics.checkNotNullExpressionValue(packageFqName3, "classId.packageFqName");
                PackageViewDescriptor packageViewDescriptor3 = moduleDescriptor.getPackage(packageFqName3);
                List<Name> pathSegments3 = classId.getRelativeClassName().pathSegments();
                Intrinsics.checkNotNullExpressionValue(pathSegments3, "classId.relativeClassName.pathSegments()");
                MemberScope memberScope3 = packageViewDescriptor3.getMemberScope();
                Object first3 = CollectionsKt.first((List<? extends Object>) pathSegments3);
                Intrinsics.checkNotNullExpressionValue(first3, "segments.first()");
                ClassifierDescriptor mo3000getContributedClassifier5 = memberScope3.mo3000getContributedClassifier((Name) first3, NoLookupLocation.FROM_DESERIALIZATION);
                if (mo3000getContributedClassifier5 != null) {
                    for (Name name3 : pathSegments3.subList(1, pathSegments3.size())) {
                        if (mo3000getContributedClassifier5 instanceof ClassDescriptor) {
                            MemberScope unsubstitutedInnerClassesScope3 = ((ClassDescriptor) mo3000getContributedClassifier5).getUnsubstitutedInnerClassesScope();
                            Intrinsics.checkNotNullExpressionValue(name3, "name");
                            ClassifierDescriptor mo3000getContributedClassifier6 = unsubstitutedInnerClassesScope3.mo3000getContributedClassifier(name3, NoLookupLocation.FROM_DESERIALIZATION);
                            mo3000getContributedClassifier5 = mo3000getContributedClassifier6 instanceof ClassDescriptor ? (ClassDescriptor) mo3000getContributedClassifier6 : null;
                            if (mo3000getContributedClassifier5 != null) {
                            }
                        }
                    }
                    return mo3000getContributedClassifier5;
                }
            }
            mo3000getContributedClassifier3 = null;
            if (mo3000getContributedClassifier3 == null) {
            }
        }
        return null;
    }

    public static final ClassDescriptor findNonGenericClassAcrossDependencies(ModuleDescriptor moduleDescriptor, ClassId classId, NotFoundClasses notFoundClasses) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        ClassDescriptor findClassAcrossModuleDependencies = findClassAcrossModuleDependencies(moduleDescriptor, classId);
        return findClassAcrossModuleDependencies != null ? findClassAcrossModuleDependencies : notFoundClasses.getClass(classId, SequencesKt.toList(SequencesKt.map(SequencesKt.generateSequence(classId, FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$1.INSTANCE), new Function1<ClassId, Integer>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt$findNonGenericClassAcrossDependencies$typeParametersCount$2
            @Override // kotlin.jvm.functions.Function1
            public final Integer invoke(ClassId it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return 0;
            }
        })));
    }

    public static final TypeAliasDescriptor findTypeAliasAcrossModuleDependencies(ModuleDescriptor moduleDescriptor, ClassId classId) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        ClassifierDescriptor findClassifierAcrossModuleDependencies = findClassifierAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) findClassifierAcrossModuleDependencies;
        }
        return null;
    }
}
