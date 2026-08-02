package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* loaded from: classes5.dex */
public final class BuiltInFictitiousFunctionClassFactory implements kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory {
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getHighSpeedVideoFpsRangesFor;

    public BuiltInFictitiousFunctionClassFactory(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        this.getHighSpeedVideoFpsRangesFor = storageManager;
        this.getHighResolutionOutputSizeshNQ4ISI = moduleDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final boolean shouldCreateClass(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        java.lang.String asString = name2.asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        return (kotlin.text.StringsKt.startsWith$default(asString, "Function", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(asString, "KFunction", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(asString, "SuspendFunction", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(asString, "KSuspendFunction", false, 2, (java.lang.Object) null)) && kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity(fqName, asString) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor createClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId) {
        kotlin.reflect.jvm.internal.impl.name.FqName packageFqName;
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.KindWithArity functionalClassKindWithArity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        if (classId.isLocal() || classId.isNestedClass()) {
            return null;
        }
        java.lang.String asString = classId.getRelativeClassName().asString();
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) asString, (java.lang.CharSequence) "Function", false, 2, (java.lang.Object) null) || (functionalClassKindWithArity = kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKindExtractor.Companion.getDefault().getFunctionalClassKindWithArity((packageFqName = classId.getPackageFqName()), asString)) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind component1 = functionalClassKindWithArity.component1();
        int component2 = functionalClassKindWithArity.component2();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> fragments = this.getHighResolutionOutputSizeshNQ4ISI.getPackage(packageFqName).getFragments();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : fragments) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayList2) {
            if (obj2 instanceof kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment) {
                arrayList3.add(obj2);
            }
        }
        java.lang.Object obj3 = (kotlin.reflect.jvm.internal.impl.builtins.FunctionInterfacePackageFragment) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList3);
        if (obj3 == null) {
            obj3 = kotlin.collections.CollectionsKt.first((java.util.List<? extends java.lang.Object>) arrayList2);
        }
        return new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.builtins.BuiltInsPackageFragment) obj3, component1, component2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getAllContributedClassesIfPossible(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return kotlin.collections.SetsKt.emptySet();
    }
}
