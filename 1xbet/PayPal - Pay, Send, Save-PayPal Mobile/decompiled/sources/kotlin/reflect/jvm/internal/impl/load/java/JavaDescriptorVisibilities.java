package kotlin.reflect.jvm.internal.impl.load.java;

/* loaded from: classes5.dex */
public class JavaDescriptorVisibilities {
    private static final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.Visibility, kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility> Camera2StreamConfigurationMap;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility PACKAGE_VISIBILITY;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility PROTECTED_AND_PACKAGE;
    public static final kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility PROTECTED_STATIC_VISIBILITY;

    static /* synthetic */ boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptorWithVisibility == null) {
            getHighSpeedVideoFpsRangesFor(0);
        }
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRangesFor(1);
        }
        if (getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility), declarationDescriptor)) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PROTECTED.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, false);
    }

    static {
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.PackageVisibility.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities.1
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    getHighResolutionOutputSizeshNQ4ISI(0);
                }
                if (declarationDescriptor == null) {
                    getHighResolutionOutputSizeshNQ4ISI(1);
                }
                return kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities.getHighResolutionOutputSizeshNQ4ISI(declarationDescriptorWithVisibility, declarationDescriptor);
            }

            private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i == 1) {
                    objArr[0] = "from";
                } else if (i == 2) {
                    objArr[0] = "fromPackage";
                } else if (i != 3) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "myPackage";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
                if (i == 2 || i == 3) {
                    objArr[2] = "visibleFromPackage";
                } else {
                    objArr[2] = "isVisible";
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        PACKAGE_VISIBILITY = delegatedDescriptorVisibility;
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility2 = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedStaticVisibility.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities.2
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    getHighResolutionOutputSizeshNQ4ISI(0);
                }
                if (declarationDescriptor == null) {
                    getHighResolutionOutputSizeshNQ4ISI(1);
                }
                return kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities.getHighSpeedVideoFpsRangesFor(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
            }

            private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        PROTECTED_STATIC_VISIBILITY = delegatedDescriptorVisibility2;
        kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility delegatedDescriptorVisibility3 = new kotlin.reflect.jvm.internal.impl.descriptors.DelegatedDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities.ProtectedAndPackage.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities.3
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public final boolean isVisible(kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue receiverValue, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    getHighSpeedVideoFpsRangesFor(0);
                }
                if (declarationDescriptor == null) {
                    getHighSpeedVideoFpsRangesFor(1);
                }
                return kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities.getHighSpeedVideoFpsRangesFor(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor);
            }

            private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
                objArr[2] = "isVisible";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        PROTECTED_AND_PACKAGE = delegatedDescriptorVisibility3;
        java.util.HashMap hashMap = new java.util.HashMap();
        Camera2StreamConfigurationMap = hashMap;
        hashMap.put(delegatedDescriptorVisibility.getDelegate(), delegatedDescriptorVisibility);
        hashMap.put(delegatedDescriptorVisibility2.getDelegate(), delegatedDescriptorVisibility2);
        hashMap.put(delegatedDescriptorVisibility3.getDelegate(), delegatedDescriptorVisibility3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            getHighSpeedVideoFpsRangesFor(2);
        }
        if (declarationDescriptor2 == null) {
            getHighSpeedVideoFpsRangesFor(3);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor.class, false);
        kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor packageFragmentDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getParentOfType(declarationDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor.class, false);
        return (packageFragmentDescriptor2 == null || packageFragmentDescriptor == null || !packageFragmentDescriptor.getFqName().equals(packageFragmentDescriptor2.getFqName())) ? false : true;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility toDescriptorVisibility(kotlin.reflect.jvm.internal.impl.descriptors.Visibility visibility) {
        if (visibility == null) {
            getHighSpeedVideoFpsRangesFor(4);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility = Camera2StreamConfigurationMap.get(visibility);
        if (descriptorVisibility != null) {
            if (descriptorVisibility == null) {
                getHighSpeedVideoFpsRangesFor(6);
            }
            return descriptorVisibility;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility2 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.toDescriptorVisibility(visibility);
        if (descriptorVisibility2 == null) {
            getHighSpeedVideoFpsRangesFor(5);
        }
        return descriptorVisibility2;
    }

    private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
        java.lang.String str = (i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 5 || i == 6) ? 2 : 3];
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i == 5 || i == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i != 5 && i != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i != 5 && i != 6) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
