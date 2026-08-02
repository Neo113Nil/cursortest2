package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes3.dex */
public final class PackageFragmentProviderImpl implements kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized {
    private final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public PackageFragmentProviderImpl(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        this.Camera2StreamConfigurationMap = collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final void collectPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        for (java.lang.Object obj : this.Camera2StreamConfigurationMap) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                collection.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public final boolean isEmpty(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> collection = this.Camera2StreamConfigurationMap;
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) it.next()).getFqName(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @kotlin.Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> getPackageFragments(kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> collection = this.Camera2StreamConfigurationMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.name.FqName> getSubPackagesOf(final kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.filter(kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(this.Camera2StreamConfigurationMap), new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl.getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) obj);
            }
        }), new kotlin.jvm.functions.Function1(fqName) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.name.FqName) obj));
            }

            {
                this.getHighSpeedVideoFpsRanges = fqName;
            }
        }));
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageFragmentDescriptor, "");
        return packageFragmentDescriptor.getFqName();
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.name.FqName fqName2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName2, "");
        return !fqName2.isRoot() && kotlin.jvm.internal.Intrinsics.areEqual(fqName2.parent(), fqName);
    }
}
