package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public final class NotFoundClasses {
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor> Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.storage.StorageManager getHighSpeedVideoSizes;

    public NotFoundClasses(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        this.getHighSpeedVideoSizes = storageManager;
        this.getHighSpeedVideoFpsRanges = moduleDescriptor;
        this.getHighResolutionOutputSizeshNQ4ISI = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.name.FqName) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
        this.Camera2StreamConfigurationMap = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$$Lambda$1
            private final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses Camera2StreamConfigurationMap;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, (kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest) obj);
            }

            {
                this.Camera2StreamConfigurationMap = this;
            }
        });
    }

    static final class ClassRequest {
        final kotlin.reflect.jvm.internal.impl.name.ClassId Camera2StreamConfigurationMap;
        final java.util.List<java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;

        public ClassRequest(kotlin.reflect.jvm.internal.impl.name.ClassId classId, java.util.List<java.lang.Integer> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.Camera2StreamConfigurationMap = classId;
            this.getHighResolutionOutputSizeshNQ4ISI = list;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassRequest(classId=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(", typeParametersCount=");
            sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.Camera2StreamConfigurationMap.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest classRequest = (kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest) obj;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, classRequest.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, classRequest.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    public static final class MockClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase {
        private final kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl Camera2StreamConfigurationMap;
        private final boolean getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getHighSpeedVideoSizes;

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* renamed from: getCompanionObjectDescriptor */
        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23888getCompanionObjectDescriptor() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        /* renamed from: getUnsubstitutedPrimaryConstructor */
        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> getValueClassRepresentation() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final boolean isActual() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean isCompanionObject() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean isData() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final boolean isExpect() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final boolean isExternal() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean isFun() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean isInline() {
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final boolean isValue() {
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MockClassDescriptor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2, boolean z, int i) {
            super(storageManager, declarationDescriptor, name2, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE, false);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageManager, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, i);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
                arrayList.add(kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl.createWithDefaultBound(this, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY(), false, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, kotlin.reflect.jvm.internal.impl.name.Name.identifier("T".concat(java.lang.String.valueOf(nextInt))), nextInt, storageManager));
            }
            this.getHighSpeedVideoSizes = arrayList;
            this.Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl(this, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt.computeConstructorTypeParameters(this), kotlin.collections.SetsKt.setOf(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getModule(this).getBuiltIns().getAnyType()), storageManager);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
            return kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
        public final kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
            return kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
        public final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(descriptorVisibility, "");
            return descriptorVisibility;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
        public final kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl getTypeConstructor() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
        public final boolean isInner() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
            return kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion.getEMPTY();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty getUnsubstitutedMemberScope(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty getStaticScope() {
            return kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
            return kotlin.collections.SetsKt.emptySet();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("class ");
            sb.append(getName());
            sb.append(" (not found)");
            return sb.toString();
        }
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getClass(kotlin.reflect.jvm.internal.impl.name.ClassId classId, java.util.List<java.lang.Integer> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return this.Camera2StreamConfigurationMap.invoke(new kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest(classId, list));
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor(notFoundClasses.getHighSpeedVideoFpsRanges, fqName);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses notFoundClasses, kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest classRequest) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classRequest, "");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = classRequest.Camera2StreamConfigurationMap;
        java.util.List<java.lang.Integer> list = classRequest.getHighResolutionOutputSizeshNQ4ISI;
        if (classId.isLocal()) {
            throw new java.lang.UnsupportedOperationException("Unresolved local class: ".concat(java.lang.String.valueOf(classId)));
        }
        kotlin.reflect.jvm.internal.impl.name.ClassId outerClassId = classId.getOuterClassId();
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor invoke = (outerClassId == null || (classDescriptor = notFoundClasses.getClass(outerClassId, kotlin.collections.CollectionsKt.drop(list, 1))) == null) ? notFoundClasses.getHighResolutionOutputSizeshNQ4ISI.invoke(classId.getPackageFqName()) : classDescriptor;
        boolean isNestedClass = classId.isNestedClass();
        kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager = notFoundClasses.getHighSpeedVideoSizes;
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor = invoke;
        kotlin.reflect.jvm.internal.impl.name.Name shortClassName = classId.getShortClassName();
        java.lang.Integer num = (java.lang.Integer) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list);
        return new kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor(storageManager, declarationDescriptor, shortClassName, isNestedClass, num != null ? num.intValue() : 0);
    }
}
