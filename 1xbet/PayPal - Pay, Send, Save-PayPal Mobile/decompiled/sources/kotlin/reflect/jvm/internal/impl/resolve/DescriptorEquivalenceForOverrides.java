package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public final class DescriptorEquivalenceForOverrides {
    public static final kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides INSTANCE = new kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides();

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges() {
        return false;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor() {
        return false;
    }

    private DescriptorEquivalenceForOverrides() {
    }

    public static /* synthetic */ boolean areEquivalent$default(kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return descriptorEquivalenceForOverrides.areEquivalent(declarationDescriptor, declarationDescriptor2, z, z2);
    }

    public final boolean areEquivalent(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2, boolean z, boolean z2) {
        if (!(declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) || !(declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
            if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) && (declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor)) {
                return areTypeParametersEquivalent$default(this, (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) declarationDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) declarationDescriptor2, z, null, 8, null);
            }
            if ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) && (declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor)) {
                return areCallableDescriptorsEquivalent$default(this, (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) declarationDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) declarationDescriptor2, z, z2, false, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner.Default.INSTANCE, 16, null);
            }
            return ((declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) && (declarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor)) ? kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor).getFqName(), ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor2).getFqName()) : kotlin.jvm.internal.Intrinsics.areEqual(declarationDescriptor, declarationDescriptor2);
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor).getTypeConstructor(), ((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) declarationDescriptor2).getTypeConstructor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean areTypeParametersEquivalent$default(kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2, boolean z, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$0
                @Override // kotlin.jvm.functions.Function2
                public java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.getHighSpeedVideoFpsRanges());
                }
            };
        }
        return descriptorEquivalenceForOverrides.areTypeParametersEquivalent(typeParameterDescriptor, typeParameterDescriptor2, z, function2);
    }

    public final boolean areTypeParametersEquivalent(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2, boolean z, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, ? super kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, java.lang.Boolean> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(typeParameterDescriptor, typeParameterDescriptor2)) {
            return true;
        }
        return !kotlin.jvm.internal.Intrinsics.areEqual(typeParameterDescriptor.getContainingDeclaration(), typeParameterDescriptor2.getContainingDeclaration()) && getHighSpeedVideoFpsRangesFor(typeParameterDescriptor, typeParameterDescriptor2, function2, z) && typeParameterDescriptor.getIndex() == typeParameterDescriptor2.getIndex();
    }

    private static kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        while (callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) callableDescriptor;
            if (callableMemberDescriptor.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                break;
            }
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "");
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) kotlin.collections.CollectionsKt.singleOrNull(overriddenDescriptors);
            if (callableMemberDescriptor2 == null) {
                return null;
            }
            callableDescriptor = callableMemberDescriptor2;
        }
        return callableDescriptor.getSource();
    }

    public static /* synthetic */ boolean areCallableDescriptorsEquivalent$default(kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides descriptorEquivalenceForOverrides, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = false;
        }
        return descriptorEquivalenceForOverrides.areCallableDescriptorsEquivalent(callableDescriptor, callableDescriptor2, z, z4, z3, kotlinTypeRefiner);
    }

    public final boolean areCallableDescriptorsEquivalent(final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, final boolean z, boolean z2, boolean z3, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableDescriptor2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(callableDescriptor, callableDescriptor2)) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(callableDescriptor.getName(), callableDescriptor2.getName())) {
            return false;
        }
        if (z2 && (callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor) && (callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor) callableDescriptor).isExpect() != ((kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor) callableDescriptor2).isExpect()) {
            return false;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(callableDescriptor.getContainingDeclaration(), callableDescriptor2.getContainingDeclaration()) && (!z || !kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoFpsRanges(callableDescriptor), getHighSpeedVideoFpsRanges(callableDescriptor2)))) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor3 = callableDescriptor;
        if (!kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(callableDescriptor3)) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor4 = callableDescriptor2;
            if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isLocal(callableDescriptor4) || !getHighSpeedVideoFpsRangesFor(callableDescriptor3, callableDescriptor4, new kotlin.jvm.functions.Function2() { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$1
                @Override // kotlin.jvm.functions.Function2
                public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.getHighSpeedVideoFpsRangesFor());
                }
            }, z)) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil create = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.create(kotlinTypeRefiner, new kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality(z, callableDescriptor, callableDescriptor2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$2
                private final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor Camera2StreamConfigurationMap;
                private final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getHighSpeedVideoFpsRanges;
                private final boolean getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
                public boolean equals(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2) {
                    return kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, typeConstructor, typeConstructor2);
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = z;
                    this.Camera2StreamConfigurationMap = callableDescriptor;
                    this.getHighSpeedVideoFpsRanges = callableDescriptor2;
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            boolean z4 = !z3;
            if (create.isOverridableBy(callableDescriptor, callableDescriptor2, null, z4).getResult() == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && create.isOverridableBy(callableDescriptor2, callableDescriptor, null, z4).getResult() == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                return true;
            }
        }
        return false;
    }

    private final boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2, kotlin.jvm.functions.Function2<? super kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, ? super kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, java.lang.Boolean> function2, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = declarationDescriptor2.getContainingDeclaration();
        if ((containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) || (containingDeclaration2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor)) {
            return function2.invoke(containingDeclaration, containingDeclaration2).booleanValue();
        }
        return areEquivalent$default(this, containingDeclaration, containingDeclaration2, z, false, 8, null);
    }

    static /* synthetic */ boolean Camera2StreamConfigurationMap(boolean z, final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(typeConstructor, typeConstructor2)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = typeConstructor.mo23898getDeclarationDescriptor();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor2 = typeConstructor2.mo23898getDeclarationDescriptor();
        if ((mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) && (mo23898getDeclarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor)) {
            return INSTANCE.areTypeParametersEquivalent((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor, (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor2, z, new kotlin.jvm.functions.Function2(callableDescriptor, callableDescriptor2) { // from class: kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides$$Lambda$3
                private final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getHighResolutionOutputSizeshNQ4ISI;
                private final kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function2
                public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj, (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj2));
                }

                {
                    this.getHighResolutionOutputSizeshNQ4ISI = callableDescriptor;
                    this.getHighSpeedVideoFpsRanges = callableDescriptor2;
                }
            });
        }
        return false;
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(declarationDescriptor, callableDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(declarationDescriptor2, callableDescriptor2);
    }

    public final boolean areTypeParametersEquivalent(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterDescriptor2, "");
        return areTypeParametersEquivalent$default(this, typeParameterDescriptor, typeParameterDescriptor2, z, null, 8, null);
    }
}
