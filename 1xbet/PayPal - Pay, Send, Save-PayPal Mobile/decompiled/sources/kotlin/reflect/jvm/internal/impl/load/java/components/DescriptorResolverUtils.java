package kotlin.reflect.jvm.internal.impl.load.java.components;

/* loaded from: classes5.dex */
public final class DescriptorResolverUtils {
    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> resolveOverridesForNonStaticMembers(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<D> collection, java.util.Collection<D> collection2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil overridingUtil) {
        if (name2 == null) {
            getHighSpeedVideoSizes(0);
        }
        if (collection == null) {
            getHighSpeedVideoSizes(1);
        }
        if (collection2 == null) {
            getHighSpeedVideoSizes(2);
        }
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(3);
        }
        if (errorReporter == null) {
            getHighSpeedVideoSizes(4);
        }
        if (overridingUtil == null) {
            getHighSpeedVideoSizes(5);
        }
        return getHighSpeedVideoFpsRangesFor(name2, collection, collection2, classDescriptor, errorReporter, overridingUtil, false);
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> resolveOverridesForStaticMembers(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<D> collection, java.util.Collection<D> collection2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil overridingUtil) {
        if (name2 == null) {
            getHighSpeedVideoSizes(6);
        }
        if (collection == null) {
            getHighSpeedVideoSizes(7);
        }
        if (collection2 == null) {
            getHighSpeedVideoSizes(8);
        }
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(9);
        }
        if (errorReporter == null) {
            getHighSpeedVideoSizes(10);
        }
        if (overridingUtil == null) {
            getHighSpeedVideoSizes(11);
        }
        return getHighSpeedVideoFpsRangesFor(name2, collection, collection2, classDescriptor, errorReporter, overridingUtil, true);
    }

    private static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> java.util.Collection<D> getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<D> collection, java.util.Collection<D> collection2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, final kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter errorReporter, kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil overridingUtil, final boolean z) {
        if (name2 == null) {
            getHighSpeedVideoSizes(12);
        }
        if (collection == null) {
            getHighSpeedVideoSizes(13);
        }
        if (collection2 == null) {
            getHighSpeedVideoSizes(14);
        }
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(15);
        }
        if (errorReporter == null) {
            getHighSpeedVideoSizes(16);
        }
        if (overridingUtil == null) {
            getHighSpeedVideoSizes(17);
        }
        final java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        overridingUtil.generateOverridesInFunctionGroup(name2, collection, collection2, classDescriptor, new kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.1
            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            public final void addFakeOverride(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                if (callableMemberDescriptor == null) {
                    getHighSpeedVideoFpsRanges(0);
                }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.resolveUnknownVisibilityForMember(callableMemberDescriptor, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils.1.1
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor3 = callableMemberDescriptor2;
                        if (callableMemberDescriptor3 != null) {
                            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter.this.reportCannotInferVisibility(callableMemberDescriptor3);
                            return kotlin.Unit.INSTANCE;
                        }
                        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
                    }
                });
                linkedHashSet.add(callableMemberDescriptor);
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            public final void setOverriddenDescriptors(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection3) {
                if (callableMemberDescriptor == null) {
                    getHighSpeedVideoFpsRanges(3);
                }
                if (collection3 == null) {
                    getHighSpeedVideoFpsRanges(4);
                }
                if (!z || callableMemberDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                    super.setOverriddenDescriptors(callableMemberDescriptor, collection3);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
            public final void conflict(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                if (callableMemberDescriptor == null) {
                    getHighSpeedVideoFpsRanges(1);
                }
                if (callableMemberDescriptor2 == null) {
                    getHighSpeedVideoFpsRanges(2);
                }
            }

            private static /* synthetic */ void getHighSpeedVideoFpsRanges(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i == 1) {
                    objArr[0] = "fromSuper";
                } else if (i == 2) {
                    objArr[0] = "fromCurrent";
                } else if (i == 3) {
                    objArr[0] = "member";
                } else if (i != 4) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "overridden";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
                if (i == 1 || i == 2) {
                    objArr[2] = "conflict";
                } else if (i == 3 || i == 4) {
                    objArr[2] = "setOverriddenDescriptors";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        });
        return linkedHashSet;
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor getAnnotationParameterByName(kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (name2 == null) {
            getHighSpeedVideoSizes(19);
        }
        if (classDescriptor == null) {
            getHighSpeedVideoSizes(20);
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> constructors = classDescriptor.getConstructors();
        if (constructors.size() != 1) {
            return null;
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor : constructors.iterator().next().getValueParameters()) {
            if (valueParameterDescriptor.getName().equals(name2)) {
                return valueParameterDescriptor;
            }
        }
        return null;
    }

    private static /* synthetic */ void getHighSpeedVideoSizes(int i) {
        java.lang.String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i == 18) {
            throw new java.lang.IllegalStateException(format);
        }
    }
}
