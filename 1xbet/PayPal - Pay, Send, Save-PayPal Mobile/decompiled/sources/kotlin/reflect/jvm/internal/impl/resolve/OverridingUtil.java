package kotlin.reflect.jvm.internal.impl.resolve;

/* loaded from: classes5.dex */
public class OverridingUtil {
    public static final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil DEFAULT;
    private static final java.util.List<kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.toList(java.util.ServiceLoader.load(kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.class, kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.class.getClassLoader()));
    private static final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function2<kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator getHighSpeedVideoSizes;
    private final kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner getOutputMinFrameDuration;

    static {
        kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality = new kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.1
            @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
            public final boolean equals(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2) {
                if (typeConstructor == null) {
                    getHighSpeedVideoFpsRangesFor(0);
                }
                if (typeConstructor2 == null) {
                    getHighSpeedVideoFpsRangesFor(1);
                }
                return typeConstructor.equals(typeConstructor2);
            }

            private static /* synthetic */ void getHighSpeedVideoFpsRangesFor(int i) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                if (i != 1) {
                    objArr[0] = "a";
                } else {
                    objArr[0] = util.h.xy.cb.b.f1091;
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
                objArr[2] = "equals";
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }
        };
        getHighSpeedVideoFpsRangesFor = typeConstructorEquality;
        DEFAULT = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil(typeConstructorEquality, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner.Default.INSTANCE, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.Default.INSTANCE);
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil createWithTypeRefiner(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner == null) {
            getHighResolutionOutputSizeshNQ4ISI(0);
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil(getHighSpeedVideoFpsRangesFor, kotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.Default.INSTANCE);
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil create(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (kotlinTypeRefiner == null) {
            getHighResolutionOutputSizeshNQ4ISI(3);
        }
        if (typeConstructorEquality == null) {
            getHighResolutionOutputSizeshNQ4ISI(4);
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil(typeConstructorEquality, kotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator.Default.INSTANCE);
    }

    private OverridingUtil(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator kotlinTypePreparator) {
        if (typeConstructorEquality == null) {
            getHighResolutionOutputSizeshNQ4ISI(5);
        }
        if (kotlinTypeRefiner == null) {
            getHighResolutionOutputSizeshNQ4ISI(6);
        }
        if (kotlinTypePreparator == null) {
            getHighResolutionOutputSizeshNQ4ISI(7);
        }
        this.Camera2StreamConfigurationMap = typeConstructorEquality;
        this.getOutputMinFrameDuration = kotlinTypeRefiner;
        this.getHighSpeedVideoSizes = kotlinTypePreparator;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> java.util.Set<D> filterOutOverridden(java.util.Set<D> set) {
        if (set == null) {
            getHighResolutionOutputSizeshNQ4ISI(8);
        }
        return filterOverrides(set, !set.isEmpty() && kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.isTypeRefinementEnabled(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getModule(set.iterator().next())), null, new kotlin.jvm.functions.Function2<D, D, kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> invoke(java.lang.Object obj, java.lang.Object obj2) {
                return new kotlin.Pair<>((kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) obj, (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) obj2);
            }
        });
    }

    public static <D> java.util.Set<D> filterOverrides(java.util.Set<D> set, boolean z, kotlin.jvm.functions.Function0<?> function0, kotlin.jvm.functions.Function2<? super D, ? super D, kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor>> function2) {
        if (set == null) {
            getHighResolutionOutputSizeshNQ4ISI(9);
        }
        if (function2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(10);
        }
        if (set.size() <= 1) {
            if (set == null) {
                getHighResolutionOutputSizeshNQ4ISI(11);
            }
            return set;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : set) {
            if (function0 != null) {
                function0.invoke();
            }
            java.util.Iterator it = linkedHashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    kotlin.Pair<kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> invoke = function2.invoke(obj, (java.lang.Object) it.next());
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor component1 = invoke.component1();
                    kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor component2 = invoke.component2();
                    if (overrides(component1, component2, z, true)) {
                        it.remove();
                    } else if (overrides(component2, component1, z, true)) {
                        break;
                    }
                } else {
                    linkedHashSet.add(obj);
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    public static <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> boolean overrides(D d, D d2, boolean z, boolean z2) {
        if (d == null) {
            getHighResolutionOutputSizeshNQ4ISI(13);
        }
        if (d2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(14);
        }
        if (!d.equals(d2) && kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(d.getOriginal(), d2.getOriginal(), z, z2)) {
            return true;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor original = d2.getOriginal();
        java.util.Iterator it = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getAllOverriddenDescriptors(d).iterator();
        while (it.hasNext()) {
            if (kotlin.reflect.jvm.internal.impl.resolve.DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(original, (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) it.next(), z, z2)) {
                return true;
            }
        }
        return false;
    }

    public static java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> getOverriddenDeclarations(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(15);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        getHighSpeedVideoSizes(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    private static void getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(17);
        }
        if (set == null) {
            getHighResolutionOutputSizeshNQ4ISI(18);
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            set.add(callableMemberDescriptor);
        } else {
            if (callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) {
                throw new java.lang.IllegalStateException("No overridden descriptors found for (fake override) ".concat(java.lang.String.valueOf(callableMemberDescriptor)));
            }
            java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it = callableMemberDescriptor.getOverriddenDescriptors().iterator();
            while (it.hasNext()) {
                getHighSpeedVideoSizes(it.next(), set);
            }
        }
    }

    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo isOverridableBy(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(19);
        }
        if (callableDescriptor2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(20);
        }
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo isOverridableBy = isOverridableBy(callableDescriptor, callableDescriptor2, classDescriptor, false);
        if (isOverridableBy == null) {
            getHighResolutionOutputSizeshNQ4ISI(21);
        }
        return isOverridableBy;
    }

    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo isOverridableBy(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, boolean z) {
        if (callableDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(22);
        }
        if (callableDescriptor2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(23);
        }
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo isOverridableByWithoutExternalConditions = isOverridableByWithoutExternalConditions(callableDescriptor, callableDescriptor2, z);
        boolean z2 = isOverridableByWithoutExternalConditions.getResult() == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE;
        for (kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition externalOverridabilityCondition : getHighSpeedVideoFpsRanges) {
            if (externalOverridabilityCondition.getContract() != kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z2 || externalOverridabilityCondition.getContract() != kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.AnonymousClass8.getHighSpeedVideoFpsRanges[externalOverridabilityCondition.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else if (i == 2) {
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo incompatible = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("External condition");
                    if (incompatible == null) {
                        getHighResolutionOutputSizeshNQ4ISI(24);
                    }
                    return incompatible;
                }
            }
        }
        if (!z2) {
            if (isOverridableByWithoutExternalConditions == null) {
                getHighResolutionOutputSizeshNQ4ISI(25);
            }
            return isOverridableByWithoutExternalConditions;
        }
        for (kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition externalOverridabilityCondition2 : getHighSpeedVideoFpsRanges) {
            if (externalOverridabilityCondition2.getContract() == kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.AnonymousClass8.getHighSpeedVideoFpsRanges[externalOverridabilityCondition2.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i2 == 1) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Contract violation in ");
                    sb.append(externalOverridabilityCondition2.getClass().getName());
                    sb.append(" condition. It's not supposed to end with success");
                    throw new java.lang.IllegalStateException(sb.toString());
                }
                if (i2 == 2) {
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo incompatible2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("External condition");
                    if (incompatible2 == null) {
                        getHighResolutionOutputSizeshNQ4ISI(26);
                    }
                    return incompatible2;
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo success = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.success();
        if (success == null) {
            getHighResolutionOutputSizeshNQ4ISI(27);
        }
        return success;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        r10.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo isOverridableByWithoutExternalConditions(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, boolean z) {
        if (callableDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(28);
        }
        if (callableDescriptor2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(29);
        }
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo basicOverridabilityProblem = getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
        if (basicOverridabilityProblem != null) {
            if (basicOverridabilityProblem == null) {
                getHighResolutionOutputSizeshNQ4ISI(30);
            }
            return basicOverridabilityProblem;
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> highSpeedVideoSizes = getHighSpeedVideoSizes(callableDescriptor);
        java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> highSpeedVideoSizes2 = getHighSpeedVideoSizes(callableDescriptor2);
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < highSpeedVideoSizes.size()) {
                if (!kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.equalTypes(highSpeedVideoSizes.get(i), highSpeedVideoSizes2.get(i))) {
                    kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo incompatible = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Type parameter number mismatch");
                    if (incompatible == null) {
                        getHighResolutionOutputSizeshNQ4ISI(31);
                    }
                    return incompatible;
                }
                i++;
            }
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo conflict = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.conflict("Type parameter number mismatch");
            if (conflict == null) {
                getHighResolutionOutputSizeshNQ4ISI(32);
            }
            return conflict;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeCheckerState highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = typeParameters.get(i2);
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor2 = typeParameters2.get(i2);
            if (typeParameterDescriptor == null) {
                getHighResolutionOutputSizeshNQ4ISI(47);
            }
            if (typeParameterDescriptor2 == null) {
                getHighResolutionOutputSizeshNQ4ISI(48);
            }
            if (highResolutionOutputSizeshNQ4ISI == null) {
                getHighResolutionOutputSizeshNQ4ISI(49);
            }
            java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            java.util.ArrayList arrayList = new java.util.ArrayList(typeParameterDescriptor2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType : upperBounds) {
                    java.util.ListIterator listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (getHighSpeedVideoFpsRanges(kotlinType, (kotlin.reflect.jvm.internal.impl.types.KotlinType) listIterator.next(), highResolutionOutputSizeshNQ4ISI)) {
                            break;
                        }
                    }
                }
            }
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo incompatible2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Type parameter bounds mismatch");
            if (incompatible2 == null) {
                getHighResolutionOutputSizeshNQ4ISI(33);
            }
            return incompatible2;
        }
        while (i < highSpeedVideoSizes.size()) {
            if (!getHighSpeedVideoFpsRanges(highSpeedVideoSizes.get(i), highSpeedVideoSizes2.get(i), highResolutionOutputSizeshNQ4ISI)) {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo incompatible3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Value parameter type mismatch");
                if (incompatible3 == null) {
                    getHighResolutionOutputSizeshNQ4ISI(34);
                }
                return incompatible3;
            }
            i++;
        }
        if ((callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) && (callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor).isSuspend() != ((kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableDescriptor2).isSuspend()) {
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo conflict2 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.conflict("Incompatible suspendability");
            if (conflict2 == null) {
                getHighResolutionOutputSizeshNQ4ISI(35);
            }
            return conflict2;
        }
        if (z) {
            kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = callableDescriptor.getReturnType();
            kotlin.reflect.jvm.internal.impl.types.KotlinType returnType2 = callableDescriptor2.getReturnType();
            if (returnType != null && returnType2 != null && ((!kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(returnType2) || !kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(returnType)) && !kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.INSTANCE.isSubtypeOf(highResolutionOutputSizeshNQ4ISI, returnType2.unwrap(), returnType.unwrap()))) {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo conflict3 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.conflict("Return type mismatch");
                if (conflict3 == null) {
                    getHighResolutionOutputSizeshNQ4ISI(36);
                }
                return conflict3;
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo success = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.success();
        if (success == null) {
            getHighResolutionOutputSizeshNQ4ISI(37);
        }
        return success;
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo getBasicOverridabilityProblem(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2) {
        boolean z;
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo incompatible;
        if (callableDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(38);
        }
        if (callableDescriptor2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(39);
        }
        boolean z2 = callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
        if ((z2 && !(callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor)) || (((z = callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor)) && !(callableDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor))) {
            return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new java.lang.IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: ".concat(java.lang.String.valueOf(callableDescriptor)));
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Name mismatch");
        }
        if ((callableDescriptor.getExtensionReceiverParameter() == null) != (callableDescriptor2.getExtensionReceiverParameter() == null)) {
            incompatible = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Receiver presence mismatch");
        } else {
            incompatible = callableDescriptor.getValueParameters().size() != callableDescriptor2.getValueParameters().size() ? kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.incompatible("Value parameter number mismatch") : null;
        }
        if (incompatible != null) {
            return incompatible;
        }
        return null;
    }

    private kotlin.reflect.jvm.internal.impl.types.TypeCheckerState getHighResolutionOutputSizeshNQ4ISI(java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list, java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list2) {
        if (list == null) {
            getHighResolutionOutputSizeshNQ4ISI(40);
        }
        if (list2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(41);
        }
        if (list.isEmpty()) {
            kotlin.reflect.jvm.internal.impl.types.TypeCheckerState newTypeCheckerState = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilTypeSystemContext(null, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI).newTypeCheckerState(true, true, false);
            if (newTypeCheckerState == null) {
                getHighResolutionOutputSizeshNQ4ISI(42);
            }
            return newTypeCheckerState;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(list.get(i).getTypeConstructor(), list2.get(i).getTypeConstructor());
        }
        kotlin.reflect.jvm.internal.impl.types.TypeCheckerState newTypeCheckerState2 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilTypeSystemContext(hashMap, this.Camera2StreamConfigurationMap, this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI).newTypeCheckerState(true, true, false);
        if (newTypeCheckerState2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(43);
        }
        return newTypeCheckerState2;
    }

    private static boolean getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(44);
        }
        if (kotlinType2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(45);
        }
        if (typeCheckerState == null) {
            getHighResolutionOutputSizeshNQ4ISI(46);
        }
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType) && kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(kotlinType2)) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState, kotlinType.unwrap(), kotlinType2.unwrap());
    }

    private static java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (extensionReceiverParameter != null) {
            arrayList.add(extensionReceiverParameter.getType());
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> it = callableDescriptor.getValueParameters().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    public void generateOverridesInFunctionGroup(kotlin.reflect.jvm.internal.impl.name.Name name2, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, final kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy overridingStrategy) {
        if (name2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(50);
        }
        if (collection == null) {
            getHighResolutionOutputSizeshNQ4ISI(51);
        }
        if (collection2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(52);
        }
        if (classDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(53);
        }
        if (overridingStrategy == null) {
            getHighResolutionOutputSizeshNQ4ISI(54);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(collection);
        for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor : collection2) {
            if (callableMemberDescriptor == null) {
                getHighResolutionOutputSizeshNQ4ISI(57);
            }
            if (collection == null) {
                getHighResolutionOutputSizeshNQ4ISI(58);
            }
            if (classDescriptor == null) {
                getHighResolutionOutputSizeshNQ4ISI(59);
            }
            if (overridingStrategy == null) {
                getHighResolutionOutputSizeshNQ4ISI(60);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(collection.size());
            kotlin.reflect.jvm.internal.impl.utils.SmartSet create = kotlin.reflect.jvm.internal.impl.utils.SmartSet.create();
            for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result = isOverridableBy(callableMemberDescriptor2, callableMemberDescriptor, classDescriptor).getResult();
                boolean isVisibleForOverride = isVisibleForOverride(callableMemberDescriptor, callableMemberDescriptor2, false);
                int i = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.AnonymousClass8.getHighSpeedVideoFpsRangesFor[result.ordinal()];
                if (i == 1) {
                    if (isVisibleForOverride) {
                        create.add(callableMemberDescriptor2);
                    }
                    arrayList.add(callableMemberDescriptor2);
                } else if (i == 2) {
                    if (isVisibleForOverride) {
                        overridingStrategy.overrideConflict(callableMemberDescriptor2, callableMemberDescriptor);
                    }
                    arrayList.add(callableMemberDescriptor2);
                }
            }
            overridingStrategy.setOverriddenDescriptors(callableMemberDescriptor, create);
            linkedHashSet.removeAll(arrayList);
        }
        if (classDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(62);
        }
        if (overridingStrategy == null) {
            getHighResolutionOutputSizeshNQ4ISI(64);
        }
        if (linkedHashSet.size() >= 2) {
            final kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) linkedHashSet.iterator().next()).getContainingDeclaration();
            if (!kotlin.collections.CollectionsKt.all(linkedHashSet, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.3
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor3) {
                    return java.lang.Boolean.valueOf(callableMemberDescriptor3.getContainingDeclaration() == kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor.this);
                }
            })) {
                java.util.LinkedList linkedList = new java.util.LinkedList(linkedHashSet);
                while (!linkedList.isEmpty()) {
                    final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor findMemberWithMaxVisibility = kotlin.reflect.jvm.internal.impl.resolve.VisibilityUtilKt.findMemberWithMaxVisibility(linkedList);
                    if (findMemberWithMaxVisibility == null) {
                        getHighResolutionOutputSizeshNQ4ISI(102);
                    }
                    if (overridingStrategy == null) {
                        getHighResolutionOutputSizeshNQ4ISI(104);
                    }
                    getHighResolutionOutputSizeshNQ4ISI(extractMembersOverridableInBothWays(findMemberWithMaxVisibility, linkedList, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.6
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor3) {
                            return callableMemberDescriptor3;
                        }
                    }, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.7
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor3) {
                            kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy.this.inheritanceConflict(findMemberWithMaxVisibility, callableMemberDescriptor3);
                            return kotlin.Unit.INSTANCE;
                        }
                    }), classDescriptor, overridingStrategy);
                }
                return;
            }
        }
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            getHighResolutionOutputSizeshNQ4ISI(java.util.Collections.singleton((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) it.next()), classDescriptor, overridingStrategy);
        }
    }

    public static boolean isVisibleForOverride(kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor memberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor memberDescriptor2, boolean z) {
        if (memberDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(55);
        }
        if (memberDescriptor2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(56);
        }
        return !kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.isPrivate(memberDescriptor2.getVisibility()) && kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.isVisibleIgnoringReceiver(memberDescriptor2, memberDescriptor, z);
    }

    public static boolean isMoreSpecific(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(65);
        }
        if (callableDescriptor2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(66);
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = callableDescriptor.getReturnType();
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!getHighSpeedVideoFpsRangesFor(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeCheckerState highResolutionOutputSizeshNQ4ISI = DEFAULT.getHighResolutionOutputSizeshNQ4ISI(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters());
        if (callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) {
            return Camera2StreamConfigurationMap(callableDescriptor, returnType, callableDescriptor2, returnType2, highResolutionOutputSizeshNQ4ISI);
        }
        if (callableDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableDescriptor;
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor propertyDescriptor2 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableDescriptor2;
            kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor setter = propertyDescriptor.getSetter();
            kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor setter2 = propertyDescriptor2.getSetter();
            if (setter != null && setter2 != null && !getHighSpeedVideoFpsRangesFor(setter, setter2)) {
                return false;
            }
            if (propertyDescriptor.isVar() && propertyDescriptor2.isVar()) {
                return kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.INSTANCE.equalTypes(highResolutionOutputSizeshNQ4ISI, returnType.unwrap(), returnType2.unwrap());
            }
            return (propertyDescriptor.isVar() || !propertyDescriptor2.isVar()) && Camera2StreamConfigurationMap(callableDescriptor, returnType, callableDescriptor2, returnType2, highResolutionOutputSizeshNQ4ISI);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected callable: ");
        sb.append(callableDescriptor.getClass());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static boolean getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2) {
        if (declarationDescriptorWithVisibility == null) {
            getHighResolutionOutputSizeshNQ4ISI(67);
        }
        if (declarationDescriptorWithVisibility2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(68);
        }
        java.lang.Integer compare = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.compare(declarationDescriptorWithVisibility.getVisibility(), declarationDescriptorWithVisibility2.getVisibility());
        return compare == null || compare.intValue() >= 0;
    }

    private static boolean Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType2, kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState) {
        if (callableDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(71);
        }
        if (kotlinType == null) {
            getHighResolutionOutputSizeshNQ4ISI(72);
        }
        if (callableDescriptor2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(73);
        }
        if (kotlinType2 == null) {
            getHighResolutionOutputSizeshNQ4ISI(74);
        }
        if (typeCheckerState == null) {
            getHighResolutionOutputSizeshNQ4ISI(75);
        }
        return kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker.INSTANCE.isSubtypeOf(typeCheckerState, kotlinType.unwrap(), kotlinType2.unwrap());
    }

    public static <H> H selectMostSpecificMember(java.util.Collection<H> collection, kotlin.jvm.functions.Function1<H, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> function1) {
        H h;
        if (collection == null) {
            getHighResolutionOutputSizeshNQ4ISI(76);
        }
        if (function1 == null) {
            getHighResolutionOutputSizeshNQ4ISI(77);
        }
        if (collection.size() == 1) {
            H h2 = (H) kotlin.collections.CollectionsKt.first(collection);
            if (h2 == null) {
                getHighResolutionOutputSizeshNQ4ISI(78);
            }
            return h2;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        java.util.List map = kotlin.collections.CollectionsKt.map(collection, function1);
        H h3 = (H) kotlin.collections.CollectionsKt.first(collection);
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor invoke = function1.invoke(h3);
        for (H h4 : collection) {
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor invoke2 = function1.invoke(h4);
            if (invoke2 == null) {
                getHighResolutionOutputSizeshNQ4ISI(69);
            }
            if (map == null) {
                getHighResolutionOutputSizeshNQ4ISI(70);
            }
            java.util.Iterator it = map.iterator();
            while (true) {
                if (!it.hasNext()) {
                    arrayList.add(h4);
                    break;
                }
                if (!isMoreSpecific(invoke2, (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) it.next())) {
                    break;
                }
            }
            if (isMoreSpecific(invoke2, invoke) && !isMoreSpecific(invoke, invoke2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 == null) {
                getHighResolutionOutputSizeshNQ4ISI(79);
            }
            return h3;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) kotlin.collections.CollectionsKt.first((java.lang.Iterable) arrayList);
            if (h5 == null) {
                getHighResolutionOutputSizeshNQ4ISI(80);
            }
            return h5;
        }
        java.util.Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                h = null;
                break;
            }
            h = (H) it2.next();
            if (!kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(function1.invoke(h).getReturnType())) {
                break;
            }
        }
        if (h != null) {
            if (h == null) {
                getHighResolutionOutputSizeshNQ4ISI(81);
            }
            return h;
        }
        H h6 = (H) kotlin.collections.CollectionsKt.first((java.lang.Iterable) arrayList);
        if (h6 == null) {
            getHighResolutionOutputSizeshNQ4ISI(82);
        }
        return h6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0076, code lost:
    
        r7 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy overridingStrategy) {
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality;
        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality2;
        if (collection == null) {
            getHighResolutionOutputSizeshNQ4ISI(83);
        }
        if (classDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(84);
        }
        if (overridingStrategy == null) {
            getHighResolutionOutputSizeshNQ4ISI(85);
        }
        java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> filterVisibleFakeOverrides = filterVisibleFakeOverrides(classDescriptor, collection);
        boolean isEmpty = filterVisibleFakeOverrides.isEmpty();
        if (!isEmpty) {
            collection = filterVisibleFakeOverrides;
        }
        if (collection == null) {
            getHighResolutionOutputSizeshNQ4ISI(86);
        }
        if (classDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(87);
        }
        java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor next = it.next();
                int i = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.AnonymousClass8.getHighResolutionOutputSizeshNQ4ISI[next.getModality().ordinal()];
                if (i == 1) {
                    modality2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
                    if (modality2 == null) {
                        getHighResolutionOutputSizeshNQ4ISI(88);
                    }
                } else {
                    if (i == 2) {
                        throw new java.lang.IllegalStateException("Member cannot have SEALED modality: ".concat(java.lang.String.valueOf(next)));
                    }
                    if (i == 3) {
                        z3 = true;
                    } else if (i == 4) {
                        z2 = true;
                    }
                }
            } else {
                if (classDescriptor.isExpect() && classDescriptor.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT && classDescriptor.getModality() != kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED) {
                    z = true;
                }
                if (z3 && !z2) {
                    modality2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
                    if (modality2 == null) {
                        getHighResolutionOutputSizeshNQ4ISI(89);
                    }
                } else if (!z3 && z2) {
                    modality2 = z ? classDescriptor.getModality() : kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
                    if (modality2 == null) {
                        getHighResolutionOutputSizeshNQ4ISI(90);
                    }
                } else {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it2 = collection.iterator();
                    while (it2.hasNext()) {
                        hashSet.addAll(getOverriddenDeclarations(it2.next()));
                    }
                    java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> filterOutOverridden = filterOutOverridden(hashSet);
                    kotlin.reflect.jvm.internal.impl.descriptors.Modality modality3 = classDescriptor.getModality();
                    if (filterOutOverridden == null) {
                        getHighResolutionOutputSizeshNQ4ISI(91);
                    }
                    if (modality3 == null) {
                        getHighResolutionOutputSizeshNQ4ISI(92);
                    }
                    kotlin.reflect.jvm.internal.impl.descriptors.Modality modality4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
                    for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor : filterOutOverridden) {
                        kotlin.reflect.jvm.internal.impl.descriptors.Modality modality5 = (z && callableMemberDescriptor.getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT) ? modality3 : callableMemberDescriptor.getModality();
                        if (modality5.compareTo(modality4) < 0) {
                            modality4 = modality5;
                        }
                    }
                    if (modality4 == null) {
                        getHighResolutionOutputSizeshNQ4ISI(93);
                    }
                    modality = modality4;
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor copy = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) selectMostSpecificMember(collection, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.4
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2) {
                return callableMemberDescriptor2;
            }
        })).copy(classDescriptor, modality, isEmpty ? kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INVISIBLE_FAKE : kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INHERITED, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        overridingStrategy.setOverriddenDescriptors(copy, collection);
        overridingStrategy.addFakeOverride(copy);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.descriptors.Modality.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.values().length];
            getHighSpeedVideoFpsRangesFor = iArr2;
            try {
                iArr2[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.values().length];
            getHighSpeedVideoFpsRanges = iArr3;
            try {
                iArr3[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
        }
    }

    public static java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> filterVisibleFakeOverrides(final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        if (classDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(94);
        }
        if (collection == null) {
            getHighResolutionOutputSizeshNQ4ISI(95);
        }
        java.util.List filter = kotlin.collections.CollectionsKt.filter(collection, new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.5
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor) {
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 = callableMemberDescriptor;
                boolean z = false;
                if (!kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.isPrivate(callableMemberDescriptor2.getVisibility()) && kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.isVisibleIgnoringReceiver(callableMemberDescriptor2, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor.this, false)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
        });
        if (filter == null) {
            getHighResolutionOutputSizeshNQ4ISI(96);
        }
        return filter;
    }

    public static <H> java.util.Collection<H> extractMembersOverridableInBothWays(H h, java.util.Collection<H> collection, kotlin.jvm.functions.Function1<H, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor> function1, kotlin.jvm.functions.Function1<H, kotlin.Unit> function12) {
        if (h == null) {
            getHighResolutionOutputSizeshNQ4ISI(97);
        }
        if (collection == null) {
            getHighResolutionOutputSizeshNQ4ISI(98);
        }
        if (function1 == null) {
            getHighResolutionOutputSizeshNQ4ISI(99);
        }
        if (function12 == null) {
            getHighResolutionOutputSizeshNQ4ISI(100);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(h);
        kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor invoke = function1.invoke(h);
        java.util.Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor invoke2 = function1.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result bothWaysOverridability = getBothWaysOverridability(invoke, invoke2);
                if (bothWaysOverridability == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (bothWaysOverridability == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result getBothWaysOverridability(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor callableDescriptor2) {
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil overridingUtil = DEFAULT;
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result = overridingUtil.isOverridableBy(callableDescriptor2, callableDescriptor, null).getResult();
        kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result2 = overridingUtil.isOverridableBy(callableDescriptor, callableDescriptor2, null).getResult();
        return (result == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && result2 == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) ? kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE : (result == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT || result2 == kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT) ? kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT : kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void resolveUnknownVisibilityForMember(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.Unit> function1) {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility;
        if (callableMemberDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(105);
        }
        for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.getOverriddenDescriptors()) {
            if (callableMemberDescriptor2.getVisibility() == kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INHERITED) {
                resolveUnknownVisibilityForMember(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() != kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INHERITED) {
            return;
        }
        if (callableMemberDescriptor == null) {
            getHighResolutionOutputSizeshNQ4ISI(106);
        }
        java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility findMaxVisibility = findMaxVisibility(overriddenDescriptors);
        if (findMaxVisibility != null) {
            if (callableMemberDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                for (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor3 : overriddenDescriptors) {
                    if (callableMemberDescriptor3.getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT || callableMemberDescriptor3.getVisibility().equals(findMaxVisibility)) {
                    }
                }
            } else {
                findMaxVisibility = findMaxVisibility.normalize();
            }
            if (findMaxVisibility != null) {
                if (function1 != null) {
                    function1.invoke(callableMemberDescriptor);
                }
                descriptorVisibility = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.PUBLIC;
            } else {
                descriptorVisibility = findMaxVisibility;
            }
            if (!(callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl)) {
                ((kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl) callableMemberDescriptor).setVisibility(descriptorVisibility);
                java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor> it = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) callableMemberDescriptor).getAccessors().iterator();
                while (it.hasNext()) {
                    resolveUnknownVisibilityForMember(it.next(), findMaxVisibility == null ? null : function1);
                }
                return;
            }
            if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl) {
                ((kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl) callableMemberDescriptor).setVisibility(descriptorVisibility);
                return;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl) callableMemberDescriptor;
            propertyAccessorDescriptorImpl.setVisibility(descriptorVisibility);
            if (descriptorVisibility != propertyAccessorDescriptorImpl.getCorrespondingProperty().getVisibility()) {
                propertyAccessorDescriptorImpl.setDefault(false);
                return;
            }
            return;
        }
        findMaxVisibility = null;
        if (findMaxVisibility != null) {
        }
        if (!(callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl)) {
        }
    }

    public static kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility findMaxVisibility(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> collection) {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility descriptorVisibility;
        if (collection == null) {
            getHighResolutionOutputSizeshNQ4ISI(107);
        }
        if (collection.isEmpty()) {
            return kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.DEFAULT_VISIBILITY;
        }
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it = collection.iterator();
        loop0: while (true) {
            descriptorVisibility = null;
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = it.next().getVisibility();
                if (descriptorVisibility != null) {
                    java.lang.Integer compare = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.compare(visibility, descriptorVisibility);
                    if (compare != null) {
                        if (compare.intValue() > 0) {
                        }
                    }
                }
                descriptorVisibility = visibility;
            }
        }
        if (descriptorVisibility == null) {
            return null;
        }
        java.util.Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it2 = collection.iterator();
        while (it2.hasNext()) {
            java.lang.Integer compare2 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.compare(descriptorVisibility, it2.next().getVisibility());
            if (compare2 == null || compare2.intValue() < 0) {
                return null;
            }
        }
        return descriptorVisibility;
    }

    public static class OverrideCompatibilityInfo {
        private static final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo(kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE, "SUCCESS");
        private final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result Camera2StreamConfigurationMap;
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo success() {
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo overrideCompatibilityInfo = getHighSpeedVideoFpsRanges;
            if (overrideCompatibilityInfo == null) {
                getHighResolutionOutputSizeshNQ4ISI(0);
            }
            return overrideCompatibilityInfo;
        }

        public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo incompatible(java.lang.String str) {
            if (str == null) {
                getHighResolutionOutputSizeshNQ4ISI(1);
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo(kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE, str);
        }

        public static kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo conflict(java.lang.String str) {
            if (str == null) {
                getHighResolutionOutputSizeshNQ4ISI(2);
            }
            return new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo(kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT, str);
        }

        public OverrideCompatibilityInfo(kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result, java.lang.String str) {
            if (result == null) {
                getHighResolutionOutputSizeshNQ4ISI(3);
            }
            if (str == null) {
                getHighResolutionOutputSizeshNQ4ISI(4);
            }
            this.Camera2StreamConfigurationMap = result;
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result getResult() {
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result result = this.Camera2StreamConfigurationMap;
            if (result == null) {
                getHighResolutionOutputSizeshNQ4ISI(5);
            }
            return result;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(": ");
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            return sb.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
            java.lang.String format;
            java.lang.String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            java.lang.Object[] objArr = new java.lang.Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 3 : 2];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    objArr[0] = "success";
                } else if (i != 4) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                        break;
                    case 5:
                        objArr[1] = "getResult";
                        break;
                    case 6:
                        objArr[1] = "getDebugMessage";
                        break;
                    default:
                        objArr[1] = "success";
                        break;
                }
                if (i != 1) {
                    objArr[2] = "incompatible";
                } else if (i == 2) {
                    objArr[2] = "conflict";
                } else if (i == 3 || i == 4) {
                    objArr[2] = "<init>";
                }
                format = java.lang.String.format(str, objArr);
                if (i == 1 && i != 2 && i != 3 && i != 4) {
                    throw new java.lang.IllegalStateException(format);
                }
                throw new java.lang.IllegalArgumentException(format);
            }
            objArr[0] = "debugMessage";
            switch (i) {
            }
            if (i != 1) {
            }
            format = java.lang.String.format(str, objArr);
            if (i == 1) {
            }
            throw new java.lang.IllegalArgumentException(format);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0255 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(int i) {
        java.lang.String str;
        int i2;
        java.lang.Object[] objArr;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
            }
            if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
                switch (i) {
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            case 88:
                                            case 89:
                                            case 90:
                                                break;
                                            default:
                                                i2 = 3;
                                                break;
                                        }
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                        i2 = 2;
                                        break;
                                }
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                                break;
                        }
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        break;
                }
                objArr = new java.lang.Object[i2];
                switch (i) {
                    case 1:
                    case 7:
                        objArr[0] = "kotlinTypePreparator";
                        break;
                    case 2:
                        objArr[0] = "customSubtype";
                        break;
                    case 3:
                    case 6:
                    default:
                        objArr[0] = "kotlinTypeRefiner";
                        break;
                    case 4:
                        objArr[0] = "equalityAxioms";
                        break;
                    case 5:
                        objArr[0] = "axioms";
                        break;
                    case 8:
                    case 9:
                        objArr[0] = "candidateSet";
                        break;
                    case 10:
                        objArr[0] = "transformFirst";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 42:
                    case 43:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 88:
                    case 89:
                    case 90:
                    case 93:
                    case 96:
                    case 101:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                        break;
                    case 13:
                        objArr[0] = "f";
                        break;
                    case 14:
                        objArr[0] = "g";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "descriptor";
                        break;
                    case 18:
                        objArr[0] = "result";
                        break;
                    case 19:
                    case 22:
                    case 28:
                    case 38:
                        objArr[0] = "superDescriptor";
                        break;
                    case 20:
                    case 23:
                    case 29:
                    case 39:
                        objArr[0] = "subDescriptor";
                        break;
                    case 40:
                        objArr[0] = "firstParameters";
                        break;
                    case 41:
                        objArr[0] = "secondParameters";
                        break;
                    case 44:
                        objArr[0] = "typeInSuper";
                        break;
                    case 45:
                        objArr[0] = "typeInSub";
                        break;
                    case 46:
                    case 49:
                    case 75:
                        objArr[0] = "typeCheckerState";
                        break;
                    case 47:
                        objArr[0] = "superTypeParameter";
                        break;
                    case 48:
                        objArr[0] = "subTypeParameter";
                        break;
                    case 50:
                        objArr[0] = "name";
                        break;
                    case 51:
                        objArr[0] = "membersFromSupertypes";
                        break;
                    case 52:
                        objArr[0] = "membersFromCurrent";
                        break;
                    case 53:
                    case 59:
                    case 62:
                    case 84:
                    case 87:
                    case 94:
                        objArr[0] = "current";
                        break;
                    case 54:
                    case 60:
                    case 64:
                    case 85:
                    case 104:
                        objArr[0] = "strategy";
                        break;
                    case 55:
                        objArr[0] = "overriding";
                        break;
                    case 56:
                        objArr[0] = "fromSuper";
                        break;
                    case 57:
                        objArr[0] = "fromCurrent";
                        break;
                    case 58:
                        objArr[0] = "descriptorsFromSuper";
                        break;
                    case 61:
                    case 63:
                        objArr[0] = "notOverridden";
                        break;
                    case 65:
                    case 67:
                    case 71:
                        objArr[0] = "a";
                        break;
                    case 66:
                    case 68:
                    case 73:
                        objArr[0] = util.h.xy.cb.b.f1091;
                        break;
                    case 69:
                        objArr[0] = "candidate";
                        break;
                    case 70:
                    case 86:
                    case 91:
                    case 107:
                        objArr[0] = "descriptors";
                        break;
                    case 72:
                        objArr[0] = "aReturnType";
                        break;
                    case 74:
                        objArr[0] = "bReturnType";
                        break;
                    case 76:
                    case 83:
                        objArr[0] = "overridables";
                        break;
                    case 77:
                    case 99:
                        objArr[0] = "descriptorByHandle";
                        break;
                    case 92:
                        objArr[0] = "classModality";
                        break;
                    case 95:
                        objArr[0] = "toFilter";
                        break;
                    case 97:
                    case 102:
                        objArr[0] = "overrider";
                        break;
                    case 98:
                    case 103:
                        objArr[0] = "extractFrom";
                        break;
                    case 100:
                        objArr[0] = "onConflict";
                        break;
                    case 105:
                    case 106:
                        objArr[0] = "memberDescriptor";
                        break;
                }
                if (i != 11 || i == 12) {
                    objArr[1] = "filterOverrides";
                } else if (i != 16) {
                    if (i != 21) {
                        if (i == 93) {
                            objArr[1] = "getMinimalModality";
                        } else if (i == 96) {
                            objArr[1] = "filterVisibleFakeOverrides";
                        } else if (i == 101) {
                            objArr[1] = "extractMembersOverridableInBothWays";
                        } else if (i != 42 && i != 43) {
                            switch (i) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                    break;
                                default:
                                    switch (i) {
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                            objArr[1] = "isOverridableByWithoutExternalConditions";
                                            break;
                                        default:
                                            switch (i) {
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                    objArr[1] = "selectMostSpecificMember";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 88:
                                                        case 89:
                                                        case 90:
                                                            objArr[1] = "determineModalityForFakeOverride";
                                                            break;
                                                        default:
                                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                            break;
                                                    }
                                            }
                                    }
                            }
                        } else {
                            objArr[1] = "createTypeCheckerState";
                        }
                    }
                    objArr[1] = "isOverridableBy";
                } else {
                    objArr[1] = "getOverriddenDeclarations";
                }
                switch (i) {
                    case 1:
                    case 2:
                        objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "create";
                        break;
                    case 5:
                    case 6:
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 8:
                        objArr[2] = "filterOutOverridden";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "filterOverrides";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 42:
                    case 43:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 88:
                    case 89:
                    case 90:
                    case 93:
                    case 96:
                    case 101:
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "overrides";
                        break;
                    case 15:
                        objArr[2] = "getOverriddenDeclarations";
                        break;
                    case 17:
                    case 18:
                        objArr[2] = "collectOverriddenDeclarations";
                        break;
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                        objArr[2] = "isOverridableBy";
                        break;
                    case 28:
                    case 29:
                        objArr[2] = "isOverridableByWithoutExternalConditions";
                        break;
                    case 38:
                    case 39:
                        objArr[2] = "getBasicOverridabilityProblem";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "createTypeCheckerState";
                        break;
                    case 44:
                    case 45:
                    case 46:
                        objArr[2] = "areTypesEquivalent";
                        break;
                    case 47:
                    case 48:
                    case 49:
                        objArr[2] = "areTypeParametersEquivalent";
                        break;
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                        objArr[2] = "generateOverridesInFunctionGroup";
                        break;
                    case 55:
                    case 56:
                        objArr[2] = "isVisibleForOverride";
                        break;
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        objArr[2] = "extractAndBindOverridesForMember";
                        break;
                    case 61:
                        objArr[2] = "allHasSameContainingDeclaration";
                        break;
                    case 62:
                    case 63:
                    case 64:
                        objArr[2] = "createAndBindFakeOverrides";
                        break;
                    case 65:
                    case 66:
                        objArr[2] = "isMoreSpecific";
                        break;
                    case 67:
                    case 68:
                        objArr[2] = "isVisibilityMoreSpecific";
                        break;
                    case 69:
                    case 70:
                        objArr[2] = "isMoreSpecificThenAllOf";
                        break;
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                        objArr[2] = "isReturnTypeMoreSpecific";
                        break;
                    case 76:
                    case 77:
                        objArr[2] = "selectMostSpecificMember";
                        break;
                    case 83:
                    case 84:
                    case 85:
                        objArr[2] = "createAndBindFakeOverride";
                        break;
                    case 86:
                    case 87:
                        objArr[2] = "determineModalityForFakeOverride";
                        break;
                    case 91:
                    case 92:
                        objArr[2] = "getMinimalModality";
                        break;
                    case 94:
                    case 95:
                        objArr[2] = "filterVisibleFakeOverrides";
                        break;
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                        objArr[2] = "extractMembersOverridableInBothWays";
                        break;
                    case 105:
                        objArr[2] = "resolveUnknownVisibilityForMember";
                        break;
                    case 106:
                        objArr[2] = "computeVisibilityToInherit";
                        break;
                    case 107:
                        objArr[2] = "findMaxVisibility";
                        break;
                    default:
                        objArr[2] = "createWithTypeRefiner";
                        break;
                }
                java.lang.String format = java.lang.String.format(str, objArr);
                if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
                    switch (i) {
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                            break;
                        default:
                            switch (i) {
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                    break;
                                default:
                                    switch (i) {
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                            break;
                                        default:
                                            switch (i) {
                                                case 88:
                                                case 89:
                                                case 90:
                                                    break;
                                                default:
                                                    throw new java.lang.IllegalArgumentException(format);
                                            }
                                    }
                            }
                    }
                }
                throw new java.lang.IllegalStateException(format);
            }
            i2 = 2;
            objArr = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i) {
            }
            java.lang.String format2 = java.lang.String.format(str, objArr);
            if (i != 11) {
                switch (i) {
                }
            }
            throw new java.lang.IllegalStateException(format2);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 11) {
            switch (i) {
            }
            objArr = new java.lang.Object[i2];
            switch (i) {
            }
            if (i != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i) {
            }
            java.lang.String format22 = java.lang.String.format(str, objArr);
            if (i != 11) {
            }
            throw new java.lang.IllegalStateException(format22);
        }
        i2 = 2;
        objArr = new java.lang.Object[i2];
        switch (i) {
        }
        if (i != 11) {
        }
        objArr[1] = "filterOverrides";
        switch (i) {
        }
        java.lang.String format222 = java.lang.String.format(str, objArr);
        if (i != 11) {
        }
        throw new java.lang.IllegalStateException(format222);
    }
}
