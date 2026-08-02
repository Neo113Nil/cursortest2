package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public class EnumEntrySyntheticClassDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorBase {
    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name>> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getCompanionObjectDescriptor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor mo23888getCompanionObjectDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    /* renamed from: getUnsubstitutedPrimaryConstructor */
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor mo23889getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ValueClassRepresentation<kotlin.reflect.jvm.internal.impl.types.SimpleType> getValueClassRepresentation() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isActual() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isCompanionObject() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isData() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExpect() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isFun() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public boolean isInner() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public boolean isValue() {
        return false;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor create(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name>> notNullLazyValue, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        if (storageManager == null) {
            Camera2StreamConfigurationMap(0);
        }
        if (classDescriptor == null) {
            Camera2StreamConfigurationMap(1);
        }
        if (name2 == null) {
            Camera2StreamConfigurationMap(2);
        }
        if (notNullLazyValue == null) {
            Camera2StreamConfigurationMap(3);
        }
        if (annotations == null) {
            Camera2StreamConfigurationMap(4);
        }
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(5);
        }
        return new kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor(storageManager, classDescriptor, classDescriptor.getDefaultType(), name2, notNullLazyValue, annotations, sourceElement);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private EnumEntrySyntheticClassDescriptor(kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name>> notNullLazyValue, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(storageManager, classDescriptor, name2, sourceElement, false);
        if (storageManager == null) {
            Camera2StreamConfigurationMap(6);
        }
        if (classDescriptor == null) {
            Camera2StreamConfigurationMap(7);
        }
        if (kotlinType == null) {
            Camera2StreamConfigurationMap(8);
        }
        if (name2 == null) {
            Camera2StreamConfigurationMap(9);
        }
        if (notNullLazyValue == null) {
            Camera2StreamConfigurationMap(10);
        }
        if (annotations == null) {
            Camera2StreamConfigurationMap(11);
        }
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(12);
        }
        this.getHighSpeedVideoSizes = annotations;
        this.Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.types.ClassTypeConstructorImpl(this, java.util.Collections.emptyList(), java.util.Collections.singleton(kotlinType), storageManager);
        this.getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope(this, storageManager);
        this.getHighSpeedVideoFpsRanges = notNullLazyValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getUnsubstitutedMemberScope(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            Camera2StreamConfigurationMap(13);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = this.getHighResolutionOutputSizeshNQ4ISI;
        if (memberScope == null) {
            Camera2StreamConfigurationMap(14);
        }
        return memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getStaticScope() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty empty = kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty.INSTANCE;
        if (empty == null) {
            Camera2StreamConfigurationMap(15);
        }
        return empty;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors() {
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            Camera2StreamConfigurationMap(16);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getTypeConstructor() {
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = this.Camera2StreamConfigurationMap;
        if (typeConstructor == null) {
            Camera2StreamConfigurationMap(17);
        }
        return typeConstructor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.ClassKind getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind classKind = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY;
        if (classKind == null) {
            Camera2StreamConfigurationMap(18);
        }
        return classKind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public kotlin.reflect.jvm.internal.impl.descriptors.Modality getModality() {
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
        if (modality == null) {
            Camera2StreamConfigurationMap(19);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC;
        if (descriptorVisibility == null) {
            Camera2StreamConfigurationMap(20);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = this.getHighSpeedVideoSizes;
        if (annotations == null) {
            Camera2StreamConfigurationMap(21);
        }
        return annotations;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("enum entry ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> getDeclaredTypeParameters() {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> emptyList = java.util.Collections.emptyList();
        if (emptyList == null) {
            Camera2StreamConfigurationMap(22);
        }
        return emptyList;
    }

    class EnumEntryScope extends kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl {
        private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor>> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor getHighResolutionOutputSizeshNQ4ISI;
        private final kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>> getHighSpeedVideoFpsRanges;
        private final kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>> getHighSpeedVideoSizes;

        static /* synthetic */ java.util.Collection getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope enumEntryScope, kotlin.reflect.jvm.internal.impl.name.Name name2) {
            if (name2 == null) {
                Camera2StreamConfigurationMap(8);
            }
            return enumEntryScope.getHighResolutionOutputSizeshNQ4ISI(name2, enumEntryScope.getHighSpeedVideoSizes().getContributedFunctions(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        static /* synthetic */ java.util.Collection getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope enumEntryScope, kotlin.reflect.jvm.internal.impl.name.Name name2) {
            if (name2 == null) {
                Camera2StreamConfigurationMap(4);
            }
            return enumEntryScope.getHighResolutionOutputSizeshNQ4ISI(name2, enumEntryScope.getHighSpeedVideoSizes().getContributedVariables(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FOR_NON_TRACKED_SCOPE));
        }

        public EnumEntryScope(final kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor enumEntrySyntheticClassDescriptor, kotlin.reflect.jvm.internal.impl.storage.StorageManager storageManager) {
            if (storageManager == null) {
                Camera2StreamConfigurationMap(0);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = enumEntrySyntheticClassDescriptor;
            this.getHighSpeedVideoSizes = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.1
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name name2) {
                    return kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.this, name2);
                }
            });
            this.Camera2StreamConfigurationMap = storageManager.createMemoizedFunction(new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.name.Name, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.2
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> invoke(kotlin.reflect.jvm.internal.impl.name.Name name2) {
                    return kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.this, name2);
                }
            });
            this.getHighSpeedVideoFpsRanges = storageManager.createLazyValue(new kotlin.jvm.functions.Function0<java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.3
                @Override // kotlin.jvm.functions.Function0
                public /* synthetic */ java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> invoke() {
                    return kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.this);
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> getContributedVariables(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            if (name2 == null) {
                Camera2StreamConfigurationMap(1);
            }
            if (lookupLocation == null) {
                Camera2StreamConfigurationMap(2);
            }
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> invoke = this.Camera2StreamConfigurationMap.invoke(name2);
            if (invoke == null) {
                Camera2StreamConfigurationMap(3);
            }
            return invoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getContributedFunctions(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation lookupLocation) {
            if (name2 == null) {
                Camera2StreamConfigurationMap(5);
            }
            if (lookupLocation == null) {
                Camera2StreamConfigurationMap(6);
            }
            java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> invoke = this.getHighSpeedVideoSizes.invoke(name2);
            if (invoke == null) {
                Camera2StreamConfigurationMap(7);
            }
            return invoke;
        }

        private kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getHighSpeedVideoSizes() {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = this.getHighResolutionOutputSizeshNQ4ISI.getTypeConstructor().getSupertypes().iterator().next().getMemberScope();
            if (memberScope == null) {
                Camera2StreamConfigurationMap(9);
            }
            return memberScope;
        }

        private <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<? extends D> getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<? extends D> collection) {
            if (name2 == null) {
                Camera2StreamConfigurationMap(10);
            }
            if (collection == null) {
                Camera2StreamConfigurationMap(11);
            }
            final java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.DEFAULT.generateOverridesInFunctionGroup(name2, collection, java.util.Collections.emptySet(), this.getHighResolutionOutputSizeshNQ4ISI, new kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope.4
                @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
                public void addFakeOverride(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                    if (callableMemberDescriptor == null) {
                        getHighSpeedVideoSizes(0);
                    }
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, null);
                    linkedHashSet.add(callableMemberDescriptor);
                }

                @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
                public void conflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                    if (callableMemberDescriptor == null) {
                        getHighSpeedVideoSizes(1);
                    }
                    if (callableMemberDescriptor2 == null) {
                        getHighSpeedVideoSizes(2);
                    }
                }

                private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    if (i == 1) {
                        objArr[0] = "fromSuper";
                    } else if (i != 2) {
                        objArr[0] = "fakeOverride";
                    } else {
                        objArr[0] = "fromCurrent";
                    }
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                    if (i == 1 || i == 2) {
                        objArr[2] = "conflict";
                    } else {
                        objArr[2] = "addFakeOverride";
                    }
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                }
            });
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
        public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> getContributedDescriptors(kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter descriptorKindFilter, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.Name, java.lang.Boolean> function1) {
            if (descriptorKindFilter == null) {
                Camera2StreamConfigurationMap(13);
            }
            if (function1 == null) {
                Camera2StreamConfigurationMap(14);
            }
            java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor> invoke = this.getHighSpeedVideoFpsRanges.invoke();
            if (invoke == null) {
                Camera2StreamConfigurationMap(15);
            }
            return invoke;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionNames() {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> set = (java.util.Set) this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges.invoke();
            if (set == null) {
                Camera2StreamConfigurationMap(17);
            }
            return set;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getClassifierNames() {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> emptySet = java.util.Collections.emptySet();
            if (emptySet == null) {
                Camera2StreamConfigurationMap(18);
            }
            return emptySet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getVariableNames() {
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> set = (java.util.Set) this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges.invoke();
            if (set == null) {
                Camera2StreamConfigurationMap(19);
            }
            return set;
        }

        static /* synthetic */ java.util.Collection getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor.EnumEntryScope enumEntryScope) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (kotlin.reflect.jvm.internal.impl.name.Name name2 : (java.util.Set) enumEntryScope.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges.invoke()) {
                hashSet.addAll(enumEntryScope.getContributedFunctions(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FOR_NON_TRACKED_SCOPE));
                hashSet.addAll(enumEntryScope.getContributedVariables(name2, kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FOR_NON_TRACKED_SCOPE));
            }
            return hashSet;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x004e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
            java.lang.String str;
            int i2;
            if (i != 3 && i != 7 && i != 9 && i != 12) {
                switch (i) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
                if (i != 3 && i != 7 && i != 9 && i != 12) {
                    switch (i) {
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            i2 = 3;
                            break;
                    }
                    java.lang.Object[] objArr = new java.lang.Object[i2];
                    switch (i) {
                        case 1:
                        case 4:
                        case 5:
                        case 8:
                        case 10:
                            objArr[0] = "name";
                            break;
                        case 2:
                        case 6:
                            objArr[0] = "location";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                            break;
                        case 11:
                            objArr[0] = "fromSupertypes";
                            break;
                        case 13:
                            objArr[0] = "kindFilter";
                            break;
                        case 14:
                            objArr[0] = "nameFilter";
                            break;
                        case 20:
                            objArr[0] = "p";
                            break;
                        default:
                            objArr[0] = "storageManager";
                            break;
                    }
                    if (i != 3) {
                        objArr[1] = "getContributedVariables";
                    } else if (i == 7) {
                        objArr[1] = "getContributedFunctions";
                    } else if (i == 9) {
                        objArr[1] = "getSupertypeScope";
                    } else if (i != 12) {
                        switch (i) {
                            case 15:
                                objArr[1] = "getContributedDescriptors";
                                break;
                            case 16:
                                objArr[1] = "computeAllDeclarations";
                                break;
                            case 17:
                                objArr[1] = "getFunctionNames";
                                break;
                            case 18:
                                objArr[1] = "getClassifierNames";
                                break;
                            case 19:
                                objArr[1] = "getVariableNames";
                                break;
                            default:
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                                break;
                        }
                    } else {
                        objArr[1] = "resolveFakeOverrides";
                    }
                    switch (i) {
                        case 1:
                        case 2:
                            objArr[2] = "getContributedVariables";
                            break;
                        case 3:
                        case 7:
                        case 9:
                        case 12:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                            break;
                        case 4:
                            objArr[2] = "computeProperties";
                            break;
                        case 5:
                        case 6:
                            objArr[2] = "getContributedFunctions";
                            break;
                        case 8:
                            objArr[2] = "computeFunctions";
                            break;
                        case 10:
                        case 11:
                            objArr[2] = "resolveFakeOverrides";
                            break;
                        case 13:
                        case 14:
                            objArr[2] = "getContributedDescriptors";
                            break;
                        case 20:
                            objArr[2] = "printScopeStructure";
                            break;
                        default:
                            objArr[2] = "<init>";
                            break;
                    }
                    java.lang.String format = java.lang.String.format(str, objArr);
                    if (i != 3 && i != 7 && i != 9 && i != 12) {
                        switch (i) {
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                                break;
                            default:
                                throw new java.lang.IllegalArgumentException(format);
                        }
                    }
                    throw new java.lang.IllegalStateException(format);
                }
                i2 = 2;
                java.lang.Object[] objArr2 = new java.lang.Object[i2];
                switch (i) {
                }
                if (i != 3) {
                }
                switch (i) {
                }
                java.lang.String format2 = java.lang.String.format(str, objArr2);
                if (i != 3) {
                    switch (i) {
                    }
                }
                throw new java.lang.IllegalStateException(format2);
            }
            str = "@NotNull method %s.%s must not return null";
            if (i != 3) {
                switch (i) {
                }
                java.lang.Object[] objArr22 = new java.lang.Object[i2];
                switch (i) {
                }
                if (i != 3) {
                }
                switch (i) {
                }
                java.lang.String format22 = java.lang.String.format(str, objArr22);
                if (i != 3) {
                }
                throw new java.lang.IllegalStateException(format22);
            }
            i2 = 2;
            java.lang.Object[] objArr222 = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 3) {
            }
            switch (i) {
            }
            java.lang.String format222 = java.lang.String.format(str, objArr222);
            if (i != 3) {
            }
            throw new java.lang.IllegalStateException(format222);
        }
    }

    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.String str;
        int i2;
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new java.lang.IllegalStateException(format);
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }
}
