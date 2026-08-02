package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class KotlinTypeFactory {
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory INSTANCE = new kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory();
    private static final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, kotlin.reflect.jvm.internal.impl.types.SimpleType> getHighResolutionOutputSizeshNQ4ISI = new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter((kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) obj, "");
            return null;
        }
    };

    private KotlinTypeFactory() {
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType$default(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List list, boolean z, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return simpleType(typeAttributes, typeConstructor, (java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection>) list, z, kotlinTypeRefiner);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType(final kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, final kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, final java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, final boolean z, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.reflect.jvm.internal.impl.types.error.ErrorScope createScopeForKotlinType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        if (typeAttributes.isEmpty() && list.isEmpty() && !z && typeConstructor.mo23898getDeclarationDescriptor() != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = typeConstructor.mo23898getDeclarationDescriptor();
            kotlin.jvm.internal.Intrinsics.checkNotNull(mo23898getDeclarationDescriptor);
            kotlin.reflect.jvm.internal.impl.types.SimpleType defaultType = mo23898getDeclarationDescriptor.getDefaultType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultType, "");
            return defaultType;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor2 = typeConstructor.mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
            createScopeForKotlinType = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor2).getDefaultType().getMemberScope();
        } else if (mo23898getDeclarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getKotlinTypeRefiner(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getModule(mo23898getDeclarationDescriptor2));
            }
            if (list.isEmpty()) {
                createScopeForKotlinType = kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor2, kotlinTypeRefiner);
            } else {
                createScopeForKotlinType = kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor2, kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.create(typeConstructor, list), kotlinTypeRefiner);
            }
        } else if (mo23898getDeclarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) {
            kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind errorScopeKind = kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            java.lang.String obj = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) mo23898getDeclarationDescriptor2).getName().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
            createScopeForKotlinType = kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorScope(errorScopeKind, true, obj);
        } else if (typeConstructor instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) {
            createScopeForKotlinType = ((kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) typeConstructor).createScopeForKotlinType();
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported classifier: ");
            sb.append(mo23898getDeclarationDescriptor2);
            sb.append(" for constructor: ");
            sb.append(typeConstructor);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        return simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, list, z, createScopeForKotlinType, new kotlin.jvm.functions.Function1(typeConstructor, list, typeAttributes, z) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$$Lambda$0
            private final java.util.List getHighResolutionOutputSizeshNQ4ISI;
            private final boolean getHighSpeedVideoFpsRanges;
            private final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getHighSpeedVideoFpsRangesFor;
            private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj2) {
                return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) obj2);
            }

            {
                this.getHighSpeedVideoSizes = typeConstructor;
                this.getHighResolutionOutputSizeshNQ4ISI = list;
                this.getHighSpeedVideoFpsRangesFor = typeAttributes;
                this.getHighSpeedVideoFpsRanges = z;
            }
        });
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType computeExpandedType(kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor typeAliasDescriptor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAliasDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return new kotlin.reflect.jvm.internal.impl.types.TypeAliasExpander(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).expand(kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansion.Companion.create(null, typeAliasDescriptor, list), kotlin.reflect.jvm.internal.impl.types.TypeAttributes.Companion.getEmpty());
    }

    private static kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.ExpandedTypeOrRefinedConstructor getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor refineDescriptor;
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = typeConstructor.mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor == null || (refineDescriptor = kotlinTypeRefiner.refineDescriptor(mo23898getDeclarationDescriptor)) == null) {
            return null;
        }
        if (refineDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) {
            return new kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.ExpandedTypeOrRefinedConstructor(computeExpandedType((kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) refineDescriptor, list), null);
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor refine = refineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(refine, "");
        return new kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.ExpandedTypeOrRefinedConstructor(null, refine);
    }

    static final class ExpandedTypeOrRefinedConstructor {
        final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRangesFor;
        final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getHighSpeedVideoSizes;

        public ExpandedTypeOrRefinedConstructor(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor) {
            this.getHighSpeedVideoFpsRangesFor = simpleType;
            this.getHighSpeedVideoSizes = typeConstructor;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeWithNonTrivialMemberScope(final kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, final kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, final java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, final boolean z, final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberScope, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleTypeImpl simpleTypeImpl = new kotlin.reflect.jvm.internal.impl.types.SimpleTypeImpl(typeConstructor, list, z, memberScope, new kotlin.jvm.functions.Function1(typeConstructor, list, typeAttributes, z, memberScope) { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$$Lambda$1
            private final java.util.List Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor getHighResolutionOutputSizeshNQ4ISI;
            private final boolean getHighSpeedVideoFpsRanges;
            private final kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getHighSpeedVideoFpsRangesFor;
            private final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) obj);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = typeConstructor;
                this.Camera2StreamConfigurationMap = list;
                this.getHighSpeedVideoSizes = typeAttributes;
                this.getHighSpeedVideoFpsRanges = z;
                this.getHighSpeedVideoFpsRangesFor = memberScope;
            }
        });
        if (typeAttributes.isEmpty()) {
            return simpleTypeImpl;
        }
        return new kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithAttributes(simpleTypeImpl, typeAttributes);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleTypeWithNonTrivialMemberScope(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, boolean z, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner, ? extends kotlin.reflect.jvm.internal.impl.types.SimpleType> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(memberScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleTypeImpl simpleTypeImpl = new kotlin.reflect.jvm.internal.impl.types.SimpleTypeImpl(typeConstructor, list, z, memberScope, function1);
        if (typeAttributes.isEmpty()) {
            return simpleTypeImpl;
        }
        return new kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithAttributes(simpleTypeImpl, typeAttributes);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleNotNullType(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(classDescriptor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
        return simpleType$default(typeAttributes, typeConstructor, (java.util.List) list, false, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
    }

    public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType$default(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            typeAttributes = simpleType.getAttributes();
        }
        if ((i & 4) != 0) {
            typeConstructor = simpleType.getConstructor();
        }
        if ((i & 8) != 0) {
            list = simpleType.getArguments();
        }
        if ((i & 16) != 0) {
            z = simpleType.isMarkedNullable();
        }
        return simpleType(simpleType, typeAttributes, typeConstructor, (java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection>) list, z);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return simpleType$default(typeAttributes, typeConstructor, list, z, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.UnwrappedType flexibleType(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType2, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(simpleType, simpleType2) ? simpleType : new kotlin.reflect.jvm.internal.impl.types.FlexibleTypeImpl(simpleType, simpleType2);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType integerLiteralType(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor integerLiteralTypeConstructor, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(integerLiteralTypeConstructor, "");
        return simpleTypeWithNonTrivialMemberScope(typeAttributes, integerLiteralTypeConstructor, kotlin.collections.CollectionsKt.emptyList(), z, kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorScope(kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List list, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, boolean z, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.ExpandedTypeOrRefinedConstructor highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(typeConstructor, kotlinTypeRefiner, list);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        if (simpleType != null) {
            return simpleType;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2 = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(typeConstructor2);
        return simpleType(typeAttributes, typeConstructor2, (java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection>) list, z, kotlinTypeRefiner);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List list, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, boolean z, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.ExpandedTypeOrRefinedConstructor highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(typeConstructor, kotlinTypeRefiner, list);
        if (highResolutionOutputSizeshNQ4ISI == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        if (simpleType != null) {
            return simpleType;
        }
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor2 = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(typeConstructor2);
        return simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor2, list, z, memberScope);
    }

    @kotlin.jvm.JvmStatic
    public static final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.TypeProjection> list, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return simpleType$default(typeAttributes, typeConstructor, list, z, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null);
    }
}
