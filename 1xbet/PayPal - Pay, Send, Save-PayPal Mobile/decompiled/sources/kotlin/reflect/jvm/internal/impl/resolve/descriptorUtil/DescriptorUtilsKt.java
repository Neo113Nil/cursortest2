package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

/* loaded from: classes5.dex */
public final class DescriptorUtilsKt {
    private static final kotlin.reflect.jvm.internal.impl.name.Name getHighSpeedVideoFpsRangesFor;

    static {
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        getHighSpeedVideoFpsRangesFor = identifier;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe getFqNameUnsafe(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqName = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqName(declarationDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqName, "");
        return fqName;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName getFqNameSafe(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameSafe = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getFqNameSafe(declarationDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fqNameSafe, "");
        return fqNameSafe;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor getModule(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor containingModule = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(declarationDescriptor);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingModule, "");
        return containingModule;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveTopLevelClass(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor, kotlin.reflect.jvm.internal.impl.name.FqName fqName, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lookupLocation, "");
        fqName.isRoot();
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor contributedClassifier = moduleDescriptor.getPackage(fqName.parent()).getMemberScope().mo23899getContributedClassifier(fqName.shortName(), lookupLocation);
        if (contributedClassifier instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) contributedClassifier;
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.ClassId getClassId(kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor classifierDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration;
        kotlin.reflect.jvm.internal.impl.name.ClassId classId;
        if (classifierDescriptor == null || (containingDeclaration = classifierDescriptor.getContainingDeclaration()) == null) {
            return null;
        }
        if (containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
            kotlin.reflect.jvm.internal.impl.name.FqName fqName = ((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) containingDeclaration).getFqName();
            kotlin.reflect.jvm.internal.impl.name.Name name2 = classifierDescriptor.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
            return new kotlin.reflect.jvm.internal.impl.name.ClassId(fqName, name2);
        }
        if (!(containingDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters) || (classId = getClassId((kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) containingDeclaration)) == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name3 = classifierDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
        return classId.createNestedClassId(name3);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getSuperClassNotAny(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : classDescriptor.getDefaultType().getConstructor().getSupertypes()) {
            if (!kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isAnyOrNullableAny(kotlinType)) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
                if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isClassOrEnumClass(mo23898getDeclarationDescriptor)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(mo23898getDeclarationDescriptor, "");
                    return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor;
                }
            }
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        return getModule(declarationDescriptor).getBuiltIns();
    }

    public static final boolean declaresOrInheritsDefaultValue(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(valueParameterDescriptor, "");
        java.lang.Boolean ifAny = kotlin.reflect.jvm.internal.impl.utils.DFS.ifAny(kotlin.collections.CollectionsKt.listOf(valueParameterDescriptor), new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$0
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public java.lang.Iterable getNeighbors(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getHighSpeedVideoFpsRanges((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) obj);
            }
        }, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.getHighSpeedVideoFpsRanges);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ifAny, "");
        return ifAny.booleanValue();
    }

    public static final kotlin.sequences.Sequence<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getParentsWithSelf(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        return kotlin.sequences.SequencesKt.generateSequence(declarationDescriptor, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$1
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getHighSpeedVideoSizes((kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) obj);
            }
        });
    }

    public static final kotlin.sequences.Sequence<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getParents(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        return kotlin.sequences.SequencesKt.drop(getParentsWithSelf(declarationDescriptor), 1);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor getPropertyIfAccessor(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        if (!(callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor)) {
            return callableMemberDescriptor;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor correspondingProperty = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor) callableMemberDescriptor).getCorrespondingProperty();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(correspondingProperty, "");
        return correspondingProperty;
    }

    public static final kotlin.reflect.jvm.internal.impl.name.FqName fqNameOrNull(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe fqNameUnsafe = getFqNameUnsafe(declarationDescriptor);
        if (!fqNameUnsafe.isSafe()) {
            fqNameUnsafe = null;
        }
        if (fqNameUnsafe != null) {
            return fqNameUnsafe.toSafe();
        }
        return null;
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor firstOverridden$default(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return firstOverridden(callableMemberDescriptor, z, function1);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor firstOverridden(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, final boolean z, final kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        final kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        return (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) kotlin.reflect.jvm.internal.impl.utils.DFS.dfs(kotlin.collections.CollectionsKt.listOf(callableMemberDescriptor), new kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors(z) { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$2
            private final boolean getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
            public java.lang.Iterable getNeighbors(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = z;
            }
        }, new kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$firstOverridden$2
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final boolean beforeChildren(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor2, "");
                return objectRef.element == null;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final void afterChildren(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor2, "");
                if (objectRef.element == null && function1.invoke(callableMemberDescriptor2).booleanValue()) {
                    objectRef.element = callableMemberDescriptor2;
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
            public final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor result() {
                return objectRef.element;
            }
        });
    }

    public static final kotlin.sequences.Sequence<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenTreeAsSequence(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
        if (z) {
            callableMemberDescriptor = callableMemberDescriptor.getOriginal();
        }
        kotlin.sequences.Sequence sequenceOf = kotlin.sequences.SequencesKt.sequenceOf(callableMemberDescriptor);
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "");
        return kotlin.sequences.SequencesKt.plus(sequenceOf, kotlin.sequences.SequencesKt.flatMap(kotlin.collections.CollectionsKt.asSequence(overriddenDescriptors), new kotlin.jvm.functions.Function1(z) { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$$Lambda$3
            private final boolean getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) obj);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = z;
            }
        }));
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getAnnotationClass(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor annotationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(annotationDescriptor, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = annotationDescriptor.getType().getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor;
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner getKotlinTypeRefiner(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.checker.Ref ref = (kotlin.reflect.jvm.internal.impl.types.checker.Ref) moduleDescriptor.getCapability(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport typeRefinementSupport = ref != null ? (kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport) ref.getValue() : null;
        return typeRefinementSupport instanceof kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport.Enabled ? ((kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport.Enabled) typeRefinementSupport).getTypeRefiner() : kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner.Default.INSTANCE;
    }

    public static final boolean isTypeRefinementEnabled(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
        kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport typeRefinementSupport;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
        kotlin.reflect.jvm.internal.impl.types.checker.Ref ref = (kotlin.reflect.jvm.internal.impl.types.checker.Ref) moduleDescriptor.getCapability(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefinerKt.getREFINER_CAPABILITY());
        return (ref == null || (typeRefinementSupport = (kotlin.reflect.jvm.internal.impl.types.checker.TypeRefinementSupport) ref.getValue()) == null || !typeRefinementSupport.isEnabled()) ? false : true;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> getInlineClassRepresentation(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> valueClassRepresentation = classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation) valueClassRepresentation;
        }
        return null;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> getMultiFieldValueClassRepresentation(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> valueClassRepresentation = classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null;
        if (valueClassRepresentation instanceof kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation) valueClassRepresentation;
        }
        return null;
    }

    static /* synthetic */ java.lang.Iterable getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor) {
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> overriddenDescriptors = valueParameterDescriptor.getOverriddenDescriptors();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(overriddenDescriptors, 10));
        java.util.Iterator<T> it = overriddenDescriptors.iterator();
        while (it.hasNext()) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next()).getOriginal());
        }
        return arrayList;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(declarationDescriptor, "");
        return declarationDescriptor.getContainingDeclaration();
    }

    static /* synthetic */ java.lang.Iterable getHighSpeedVideoFpsRangesFor(boolean z, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors;
        if (z) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.getOriginal() : null;
        }
        return (callableMemberDescriptor == null || (overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors()) == null) ? kotlin.collections.CollectionsKt.emptyList() : overriddenDescriptors;
    }

    static /* synthetic */ kotlin.sequences.Sequence getHighSpeedVideoSizes(boolean z, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(callableMemberDescriptor);
        return overriddenTreeAsSequence(callableMemberDescriptor, z);
    }
}
