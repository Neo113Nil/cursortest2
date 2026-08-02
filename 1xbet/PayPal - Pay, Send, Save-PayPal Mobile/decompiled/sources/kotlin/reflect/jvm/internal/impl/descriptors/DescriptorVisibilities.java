package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public class DescriptorVisibilities {
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue ALWAYS_SUITABLE_RECEIVER;
    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility DEFAULT_VISIBILITY;

    @java.lang.Deprecated
    public static final kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue FALSE_IF_PROTECTED;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility INHERITED;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility INTERNAL;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility INVISIBLE_FAKE;
    public static final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility> INVISIBLE_FROM_OTHER_MODULES;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility LOCAL;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility PRIVATE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility PRIVATE_TO_THIS;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility PROTECTED;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility PUBLIC;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility UNKNOWN;
    private static final kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.Visibility, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility, java.lang.Integer> getHighSpeedVideoSizes;

    static {
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Private.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
            /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
            /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
            /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == 0) {
                    Camera2StreamConfigurationMap(1);
                }
                if (declarationDescriptor == null) {
                    Camera2StreamConfigurationMap(2);
                }
                if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isTopLevelDeclaration(declarationDescriptorWithVisibility)) {
                    if (declarationDescriptor == null) {
                        Camera2StreamConfigurationMap(0);
                    }
                    if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingSourceFile(declarationDescriptor) != kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE) {
                        return kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor);
                    }
                }
                if (declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) {
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters containingDeclaration = ((kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) declarationDescriptorWithVisibility).getContainingDeclaration();
                    if (z && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSealedClass(containingDeclaration) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isTopLevelDeclaration(containingDeclaration) && (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isTopLevelDeclaration(declarationDescriptor.getContainingDeclaration()) && kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor)) {
                        return true;
                    }
                }
                while (declarationDescriptorWithVisibility != 0) {
                    declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.getContainingDeclaration();
                    if (((declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) && !kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(declarationDescriptorWithVisibility)) || (declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor)) {
                        break;
                    }
                }
                if (declarationDescriptorWithVisibility == 0) {
                    return false;
                }
                while (declarationDescriptor != null) {
                    if (declarationDescriptorWithVisibility == declarationDescriptor) {
                        return true;
                    }
                    if (declarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) {
                        return (declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) && declarationDescriptorWithVisibility.getFqName().equals(((kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) declarationDescriptor).getFqName()) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.areInSameModule(declarationDescriptor, declarationDescriptorWithVisibility);
                    }
                    declarationDescriptor = declarationDescriptor.getContainingDeclaration();
                }
                return false;
            }

            private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i == 1) {
                    objArr[0] = "what";
                } else if (i != 2) {
                    objArr[0] = "descriptor";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
                if (i == 1 || i == 2) {
                    objArr[2] = "isVisible";
                } else {
                    objArr[2] = "hasContainingSourceFile";
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        PRIVATE = delegatedDescriptorVisibility;
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility2 = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.PrivateToThis.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.2
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor parentOfType;
                if (declarationDescriptorWithVisibility == null) {
                    getHighSpeedVideoSizes(0);
                }
                if (declarationDescriptor == null) {
                    getHighSpeedVideoSizes(1);
                }
                if (kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PRIVATE.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, z)) {
                    if (receiverValue == kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                        return true;
                    }
                    if (receiverValue != kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.Camera2StreamConfigurationMap && (parentOfType = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class)) != null && (receiverValue instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver)) {
                        return ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver) receiverValue).getClassDescriptor().getOriginal().equals(parentOfType.getOriginal());
                    }
                }
                return false;
            }

            private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        PRIVATE_TO_THIS = delegatedDescriptorVisibility2;
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility3 = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Protected.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.3
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                kotlin.reflect.jvm.internal.impl.types.KotlinType type;
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor;
                while (true) {
                    if (declarationDescriptorWithVisibility == null) {
                        getHighSpeedVideoFpsRanges(0);
                    }
                    if (declarationDescriptor == null) {
                        getHighSpeedVideoFpsRanges(1);
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class);
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class, false);
                    if (classDescriptor3 == null) {
                        return false;
                    }
                    if (classDescriptor2 != null && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isCompanionObject(classDescriptor2) && (classDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(classDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class)) != null && kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSubclass(classDescriptor3, classDescriptor)) {
                        return true;
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility unwrapFakeOverrideToAnyDeclaration = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility);
                    kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor4 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(unwrapFakeOverrideToAnyDeclaration, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.class);
                    if (classDescriptor4 == null) {
                        return false;
                    }
                    if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSubclass(classDescriptor3, classDescriptor4)) {
                        if (unwrapFakeOverrideToAnyDeclaration == null) {
                            getHighSpeedVideoFpsRanges(2);
                        }
                        if (classDescriptor3 == null) {
                            getHighSpeedVideoFpsRanges(3);
                        }
                        if (receiverValue != kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.FALSE_IF_PROTECTED) {
                            if ((unwrapFakeOverrideToAnyDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) && !(unwrapFakeOverrideToAnyDeclaration instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) && receiverValue != kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                                if (receiverValue != kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.Camera2StreamConfigurationMap && receiverValue != null) {
                                    if (receiverValue instanceof kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue) {
                                        type = ((kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue) receiverValue).getThisType();
                                    } else {
                                        type = receiverValue.getType();
                                    }
                                    if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.isSubtypeOfClass(type, classDescriptor3) || kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt.isDynamic(type)) {
                                        break;
                                    }
                                }
                            } else {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    declarationDescriptor = classDescriptor3.getContainingDeclaration();
                }
            }

            private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i == 1) {
                    objArr[0] = "from";
                } else if (i == 2) {
                    objArr[0] = "whatDeclaration";
                } else if (i != 3) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "fromClass";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
                if (i == 2 || i == 3) {
                    objArr[2] = "doesReceiverFitForProtectedVisibility";
                } else {
                    objArr[2] = "isVisible";
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        PROTECTED = delegatedDescriptorVisibility3;
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility4 = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Internal.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.4
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    getHighResolutionOutputSizeshNQ4ISI(0);
                }
                if (declarationDescriptor == null) {
                    getHighResolutionOutputSizeshNQ4ISI(1);
                }
                if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(declarationDescriptor).shouldSeeInternalsOf(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModule(declarationDescriptorWithVisibility))) {
                    return kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.getHighResolutionOutputSizeshNQ4ISI.isInFriendModule(declarationDescriptorWithVisibility, declarationDescriptor);
                }
                return false;
            }

            private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        INTERNAL = delegatedDescriptorVisibility4;
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility5 = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Public.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.5
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    getHighResolutionOutputSizeshNQ4ISI(0);
                }
                if (declarationDescriptor == null) {
                    getHighResolutionOutputSizeshNQ4ISI(1);
                }
                return true;
            }

            private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        PUBLIC = delegatedDescriptorVisibility5;
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility6 = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Local.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.6
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    getHighSpeedVideoFpsRangesFor(0);
                }
                if (declarationDescriptor == null) {
                    getHighSpeedVideoFpsRangesFor(1);
                }
                throw new java.lang.IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }

            private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        LOCAL = delegatedDescriptorVisibility6;
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility7 = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Inherited.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.7
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    getHighSpeedVideoFpsRangesFor(0);
                }
                if (declarationDescriptor == null) {
                    getHighSpeedVideoFpsRangesFor(1);
                }
                throw new java.lang.IllegalStateException("Visibility is unknown yet");
            }

            private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        INHERITED = delegatedDescriptorVisibility7;
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility8 = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.InvisibleFake.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.8
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    getHighResolutionOutputSizeshNQ4ISI(0);
                }
                if (declarationDescriptor == null) {
                    getHighResolutionOutputSizeshNQ4ISI(1);
                }
                return false;
            }

            private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        INVISIBLE_FAKE = delegatedDescriptorVisibility8;
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility9 = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Unknown.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.9
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    Camera2StreamConfigurationMap(0);
                }
                if (declarationDescriptor == null) {
                    Camera2StreamConfigurationMap(1);
                }
                return false;
            }

            private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        UNKNOWN = delegatedDescriptorVisibility9;
        INVISIBLE_FROM_OTHER_MODULES = java.util.Collections.unmodifiableSet(kotlin.collections.SetsKt.setOf((java.lang.Object[]) new kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility[]{delegatedDescriptorVisibility, delegatedDescriptorVisibility2, delegatedDescriptorVisibility4, delegatedDescriptorVisibility6}));
        java.util.HashMap newHashMapWithExpectedSize = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.newHashMapWithExpectedSize(4);
        newHashMapWithExpectedSize.put(delegatedDescriptorVisibility2, 0);
        newHashMapWithExpectedSize.put(delegatedDescriptorVisibility, 0);
        newHashMapWithExpectedSize.put(delegatedDescriptorVisibility4, 1);
        newHashMapWithExpectedSize.put(delegatedDescriptorVisibility3, 1);
        newHashMapWithExpectedSize.put(delegatedDescriptorVisibility5, 2);
        getHighSpeedVideoSizes = java.util.Collections.unmodifiableMap(newHashMapWithExpectedSize);
        DEFAULT_VISIBILITY = delegatedDescriptorVisibility5;
        Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.10
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
                throw new java.lang.IllegalStateException("This method should not be called");
            }
        };
        ALWAYS_SUITABLE_RECEIVER = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.11
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
                throw new java.lang.IllegalStateException("This method should not be called");
            }
        };
        FALSE_IF_PROTECTED = new kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.12
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            public final kotlin.reflect.jvm.internal.impl.types.KotlinType getType() {
                throw new java.lang.IllegalStateException("This method should not be called");
            }
        };
        java.util.Iterator it = java.util.ServiceLoader.load(kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.class, kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.class.getClassLoader()).iterator();
        getHighResolutionOutputSizeshNQ4ISI = it.hasNext() ? (kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper) it.next() : kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper.EMPTY.INSTANCE;
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoFpsRangesFor = hashMap;
        hashMap.put(delegatedDescriptorVisibility.getDelegate(), delegatedDescriptorVisibility);
        hashMap.put(delegatedDescriptorVisibility2.getDelegate(), delegatedDescriptorVisibility2);
        hashMap.put(delegatedDescriptorVisibility3.getDelegate(), delegatedDescriptorVisibility3);
        hashMap.put(delegatedDescriptorVisibility4.getDelegate(), delegatedDescriptorVisibility4);
        hashMap.put(delegatedDescriptorVisibility5.getDelegate(), delegatedDescriptorVisibility5);
        hashMap.put(delegatedDescriptorVisibility6.getDelegate(), delegatedDescriptorVisibility6);
        hashMap.put(delegatedDescriptorVisibility7.getDelegate(), delegatedDescriptorVisibility7);
        hashMap.put(delegatedDescriptorVisibility8.getDelegate(), delegatedDescriptorVisibility8);
        hashMap.put(delegatedDescriptorVisibility9.getDelegate(), delegatedDescriptorVisibility9);
    }

    public static boolean isVisibleIgnoringReceiver(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
        if (declarationDescriptorWithVisibility == null) {
            Camera2StreamConfigurationMap(2);
        }
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(3);
        }
        return findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility, declarationDescriptor, z) == null;
    }

    public static boolean inSameFile(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(6);
        }
        if (declarationDescriptor2 == null) {
            Camera2StreamConfigurationMap(7);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.SourceFile containingSourceFile = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingSourceFile(declarationDescriptor2);
        if (containingSourceFile != kotlin.reflect.jvm.internal.impl.descriptors.SourceFile.NO_SOURCE_FILE) {
            return containingSourceFile.equals(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingSourceFile(declarationDescriptor));
        }
        return false;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility findInvisibleMember(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility findInvisibleMember;
        if (declarationDescriptorWithVisibility == null) {
            Camera2StreamConfigurationMap(8);
        }
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(9);
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.getOriginal(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != LOCAL; declarationDescriptorWithVisibility2 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility2, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().isVisible(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor, z)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if (!(declarationDescriptorWithVisibility instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor) || (findInvisibleMember = findInvisibleMember(receiverValue, ((kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).getUnderlyingConstructorDescriptor(), declarationDescriptor, z)) == null) {
            return null;
        }
        return findInvisibleMember;
    }

    public static java.lang.Integer compare(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            Camera2StreamConfigurationMap(12);
        }
        if (descriptorVisibility2 == null) {
            Camera2StreamConfigurationMap(13);
        }
        java.lang.Integer compareTo = descriptorVisibility.compareTo(descriptorVisibility2);
        if (compareTo != null) {
            return compareTo;
        }
        java.lang.Integer compareTo2 = descriptorVisibility2.compareTo(descriptorVisibility);
        if (compareTo2 != null) {
            return java.lang.Integer.valueOf(-compareTo2.intValue());
        }
        return null;
    }

    public static boolean isPrivate(kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            Camera2StreamConfigurationMap(14);
        }
        return descriptorVisibility == PRIVATE || descriptorVisibility == PRIVATE_TO_THIS;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility toDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
        if (visibility == null) {
            Camera2StreamConfigurationMap(15);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = getHighSpeedVideoFpsRangesFor.get(visibility);
        if (descriptorVisibility == null) {
            throw new java.lang.IllegalArgumentException("Inapplicable visibility: ".concat(java.lang.String.valueOf(visibility)));
        }
        if (descriptorVisibility == null) {
            Camera2StreamConfigurationMap(16);
        }
        return descriptorVisibility;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 16 ? 3 : 2];
        if (i != 1 && i != 3 && i != 5 && i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            if (i == 16) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            } else {
                objArr[1] = "toDescriptorVisibility";
            }
            switch (i) {
                case 2:
                case 3:
                    objArr[2] = "isVisibleIgnoringReceiver";
                    break;
                case 4:
                case 5:
                    objArr[2] = "isVisibleWithAnyReceiver";
                    break;
                case 6:
                case 7:
                    objArr[2] = "inSameFile";
                    break;
                case 8:
                case 9:
                    objArr[2] = "findInvisibleMember";
                    break;
                case 10:
                case 11:
                    objArr[2] = "compareLocal";
                    break;
                case 12:
                case 13:
                    objArr[2] = "compare";
                    break;
                case 14:
                    objArr[2] = "isPrivate";
                    break;
                case 15:
                    objArr[2] = "toDescriptorVisibility";
                    break;
                case 16:
                    break;
                default:
                    objArr[2] = "isVisible";
                    break;
            }
            java.lang.String format = java.lang.String.format(str, objArr);
            if (i != 16) {
                throw new java.lang.IllegalStateException(format);
            }
            throw new java.lang.IllegalArgumentException(format);
        }
        objArr[0] = "from";
        if (i == 16) {
        }
        switch (i) {
        }
        java.lang.String format2 = java.lang.String.format(str, objArr);
        if (i != 16) {
        }
    }
}
