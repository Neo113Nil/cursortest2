package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

/* loaded from: classes5.dex */
public final class LazyJavaPackageScope extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope {
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<java.util.Set<java.lang.String>> getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage javaPackage, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(lazyJavaResolverContext);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaResolverContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaPackage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyJavaPackageFragment, "");
        this.getHighResolutionOutputSizeshNQ4ISI = javaPackage;
        this.getHighSpeedVideoFpsRanges = lazyJavaPackageFragment;
        this.getHighSpeedVideoSizes = lazyJavaResolverContext.getStorageManager().createNullableLazyValue(new kotlin.jvm.functions.Function0(lazyJavaResolverContext, this) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.Set knownClassNamesInPackage;
                knownClassNamesInPackage = this.Camera2StreamConfigurationMap.getComponents().getFinder().knownClassNamesInPackage(this.getHighSpeedVideoFpsRangesFor.getOwnerDescriptor().getFqName());
                return knownClassNamesInPackage;
            }

            {
                this.Camera2StreamConfigurationMap = lazyJavaResolverContext;
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
        this.getHighSpeedVideoFpsRangesFor = lazyJavaResolverContext.getStorageManager().createMemoizedFunctionWithNullableValues(new kotlin.jvm.functions.Function1(this, lazyJavaResolverContext) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
                this.Camera2StreamConfigurationMap = lazyJavaResolverContext;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment getOwnerDescriptor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    static abstract class KotlinClassLookupResult {

        public static final class Found extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult {
            private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor Camera2StreamConfigurationMap;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Found(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
                this.Camera2StreamConfigurationMap = classDescriptor;
            }

            public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getDescriptor() {
                return this.Camera2StreamConfigurationMap;
            }
        }

        private KotlinClassLookupResult() {
        }

        public static final class NotFound extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult {
            public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound();

            private NotFound() {
                super(null);
            }
        }

        public static final class SyntheticClass extends kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult {
            public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass INSTANCE = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass();

            private SyntheticClass() {
                super(null);
            }
        }

        public /* synthetic */ KotlinClassLookupResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class FindClassRequest {
        final kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass getHighSpeedVideoFpsRanges;
        final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoSizes;

        public FindClassRequest(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            this.getHighSpeedVideoSizes = name2;
            this.getHighSpeedVideoFpsRanges = javaClass;
        }

        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest) obj).getHighSpeedVideoSizes);
        }

        public final int hashCode() {
            return this.getHighSpeedVideoSizes.hashCode();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* renamed from: getContributedClassifier */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23899getContributedClassifier(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return getHighSpeedVideoFpsRanges(name2, null);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
        if (!kotlin.reflect.jvm.internal.impl.name.SpecialNames.INSTANCE.isSafeIdentifier(name2)) {
            return null;
        }
        java.util.Set<java.lang.String> invoke = this.getHighSpeedVideoSizes.invoke();
        if (javaClass != null || invoke == null || invoke.contains(name2.asString())) {
            return this.getHighSpeedVideoFpsRangesFor.invoke(new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest(name2, javaClass));
        }
        return null;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassifierByJavaClass$descriptors_jvm(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(javaClass, "");
        return getHighSpeedVideoFpsRanges(javaClass.getName(), javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex computeMemberIndex() {
        return kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeClassNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        if (!descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return kotlin.collections.SetsKt.emptySet();
        }
        java.util.Set<java.lang.String> invoke = this.getHighSpeedVideoSizes.invoke();
        if (invoke == null) {
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage javaPackage = this.getHighResolutionOutputSizeshNQ4ISI;
            if (function1 == null) {
                function1 = kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.alwaysTrue();
            }
            java.util.Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass> classes = javaPackage.getClasses(function1);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass : classes) {
                kotlin.reflect.jvm.internal.impl.name.Name name2 = javaClass.getLightClassOriginKind() == kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.SOURCE ? null : javaClass.getName();
                if (name2 != null) {
                    linkedHashSet.add(name2);
                }
            }
            return linkedHashSet;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<T> it = invoke.iterator();
        while (it.hasNext()) {
            hashSet.add(kotlin.reflect.jvm.internal.impl.name.Name.identifier((java.lang.String) it.next()));
        }
        return hashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computeFunctionNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> computePropertyNames(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKindFilter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        if (!descriptorKindFilter.acceptsKinds(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getCLASSIFIERS_MASK() | kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> invoke = getAllDescriptors().invoke();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : invoke) {
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj;
            if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
                kotlin.reflect.jvm.internal.impl.name.Name name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor).getName();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                if (function1.invoke(name2).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope lazyJavaPackageScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext lazyJavaResolverContext, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.FindClassRequest findClassRequest) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(findClassRequest, "");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = new kotlin.reflect.jvm.internal.impl.name.ClassId(lazyJavaPackageScope.getOwnerDescriptor().getFqName(), findClassRequest.getHighSpeedVideoSizes);
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result findKotlinClassOrContent = findClassRequest.getHighSpeedVideoFpsRanges != null ? lazyJavaResolverContext.getComponents().getKotlinClassFinder().findKotlinClassOrContent(findClassRequest.getHighSpeedVideoFpsRanges, lazyJavaPackageScope.getC().getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration().getMetadataVersion()) : lazyJavaResolverContext.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId, lazyJavaPackageScope.getC().getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration().getMetadataVersion());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor lazyJavaClassDescriptor = null;
        kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass kotlinJvmBinaryClass = findKotlinClassOrContent != null ? findKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId2 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
        if (classId2 != null && (classId2.isNestedClass() || classId2.isLocal())) {
            return null;
        }
        if (kotlinJvmBinaryClass == null) {
            obj = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult) kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound.INSTANCE;
        } else if (kotlinJvmBinaryClass.getClassHeader().getKind() == kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.CLASS) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClass = lazyJavaPackageScope.getC().getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
            obj = resolveClass != null ? (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult) new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.Found(resolveClass) : (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult) kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound.INSTANCE;
        } else {
            obj = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult) kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass.INSTANCE;
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.Found) {
            return ((kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.Found) obj).getDescriptor();
        }
        if (obj instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass) {
            return null;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope.KotlinClassLookupResult.NotFound)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass = findClassRequest.getHighSpeedVideoFpsRanges;
        if (javaClass == null) {
            kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder finder = lazyJavaResolverContext.getComponents().getFinder();
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent classFileContent = findKotlinClassOrContent instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent ? (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder.Result.ClassFileContent) findKotlinClassOrContent : null;
            javaClass = finder.findClass(new kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder.Request(classId, classFileContent != null ? classFileContent.getContent() : null, null, 4, null));
        }
        kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass javaClass2 = javaClass;
        if ((javaClass2 != null ? javaClass2.getLightClassOriginKind() : null) != kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.BINARY) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = javaClass2 != null ? javaClass2.getFqName() : null;
            if (fqName != null && !fqName.isRoot() && kotlin.jvm.internal.Intrinsics.areEqual(fqName.parent(), lazyJavaPackageScope.getOwnerDescriptor().getFqName())) {
                lazyJavaClassDescriptor = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaPackageScope.getOwnerDescriptor(), javaClass2, null, 8, null);
                lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
            }
            return lazyJavaClassDescriptor;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
        sb.append(javaClass2);
        sb.append("\nClassId: ");
        sb.append(classId);
        sb.append("\nfindKotlinClass(JavaClass) = ");
        sb.append(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext.getComponents().getKotlinClassFinder(), javaClass2, lazyJavaPackageScope.getC().getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration().getMetadataVersion()));
        sb.append("\nfindKotlinClass(ClassId) = ");
        sb.append(kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext.getComponents().getKotlinClassFinder(), classId, lazyJavaPackageScope.getC().getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration().getMetadataVersion()));
        sb.append('\n');
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected final void computeNonDeclaredFunctions(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> collection, kotlin.reflect.jvm.internal.impl.name.Name name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
    }
}
