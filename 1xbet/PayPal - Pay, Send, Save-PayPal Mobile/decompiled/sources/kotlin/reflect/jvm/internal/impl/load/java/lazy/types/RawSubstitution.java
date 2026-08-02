package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

/* loaded from: classes5.dex */
public final class RawSubstitution extends kotlin.reflect.jvm.internal.impl.types.TypeSubstitution {
    private final kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawProjectionComputer getHighSpeedVideoFpsRanges;
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution.Companion Companion = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution.Companion(null);
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, false, true, null, 5, null).withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt.toAttributes$default(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, false, true, null, 5, null).withFlexibility(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean isEmpty() {
        return false;
    }

    public RawSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawProjectionComputer rawProjectionComputer = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawProjectionComputer();
        this.getHighSpeedVideoFpsRanges = rawProjectionComputer;
        this.getHighResolutionOutputSizeshNQ4ISI = typeParameterUpperBoundEraser == null ? new kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, null) : typeParameterUpperBoundEraser;
    }

    public /* synthetic */ RawSubstitution(kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    /* renamed from: get */
    public final kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl mo23902get(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(getHighSpeedVideoSizes(this, kotlinType));
    }

    private static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution rawSubstitution, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        return rawSubstitution.getHighSpeedVideoFpsRangesFor(kotlinType, new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes(kotlin.reflect.jvm.internal.impl.types.TypeUsage.COMMON, null, false, false, null, null, 62, null));
    }

    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl rawTypeImpl;
        while (true) {
            mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
            if (!(mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor)) {
                break;
            }
            kotlinType = this.getHighResolutionOutputSizeshNQ4ISI.getErasedUpperBound((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor, javaTypeAttributes.markIsRaw(true));
        }
        if (mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor2 = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(kotlinType).getConstructor().mo23898getDeclarationDescriptor();
            if (!(mo23898getDeclarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("For some reason declaration for upper bound is not a class but \"");
                sb.append(mo23898getDeclarationDescriptor2);
                sb.append("\" while for lower it's \"");
                sb.append(mo23898getDeclarationDescriptor);
                sb.append('\"');
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            kotlin.Pair<kotlin.reflect.jvm.internal.impl.types.SimpleType, java.lang.Boolean> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(kotlinType), (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor, Camera2StreamConfigurationMap);
            kotlin.reflect.jvm.internal.impl.types.SimpleType component1 = highSpeedVideoFpsRangesFor.component1();
            boolean booleanValue = highSpeedVideoFpsRangesFor.component2().booleanValue();
            kotlin.Pair<kotlin.reflect.jvm.internal.impl.types.SimpleType, java.lang.Boolean> highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.upperIfFlexible(kotlinType), (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor2, getHighSpeedVideoSizes);
            kotlin.reflect.jvm.internal.impl.types.SimpleType component12 = highSpeedVideoFpsRangesFor2.component1();
            boolean booleanValue2 = highSpeedVideoFpsRangesFor2.component2().booleanValue();
            if (booleanValue || booleanValue2) {
                rawTypeImpl = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl(component1, component12);
            } else {
                rawTypeImpl = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(component1, component12);
            }
            return rawTypeImpl;
        }
        throw new java.lang.IllegalStateException("Unexpected declaration kind: ".concat(java.lang.String.valueOf(mo23898getDeclarationDescriptor)).toString());
    }

    private final kotlin.Pair<kotlin.reflect.jvm.internal.impl.types.SimpleType, java.lang.Boolean> getHighSpeedVideoFpsRangesFor(final kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes) {
        boolean isEmpty = simpleType.getConstructor().getParameters().isEmpty();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (isEmpty) {
            return kotlin.TuplesKt.to(simpleType, bool);
        }
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2 = simpleType;
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(simpleType2)) {
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = simpleType.getArguments().get(0);
            kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = typeProjection.getProjectionKind();
            kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
            return kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType$default(simpleType.getAttributes(), simpleType.getConstructor(), kotlin.collections.CollectionsKt.listOf(new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl(projectionKind, getHighSpeedVideoFpsRangesFor(type, javaTypeAttributes))), simpleType.isMarkedNullable(), (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) null, 16, (java.lang.Object) null), bool);
        }
        if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError(simpleType2)) {
            return kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_RAW_TYPE, simpleType.getConstructor().toString()), bool);
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope memberScope = classDescriptor.getMemberScope(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(memberScope, "");
        kotlin.reflect.jvm.internal.impl.types.TypeAttributes attributes = simpleType.getAttributes();
        kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = classDescriptor.getTypeConstructor().getParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = parameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : list) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawProjectionComputer rawProjectionComputer = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameterDescriptor);
            arrayList.add(kotlin.reflect.jvm.internal.impl.types.ErasureProjectionComputer.computeProjection$default(rawProjectionComputer, typeParameterDescriptor, javaTypeAttributes, this.getHighResolutionOutputSizeshNQ4ISI, null, 8, null));
        }
        return kotlin.TuplesKt.to(kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(attributes, typeConstructor, arrayList, simpleType.isMarkedNullable(), memberScope, new kotlin.jvm.functions.Function1(classDescriptor, this, simpleType, javaTypeAttributes) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$$Lambda$0
            private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRanges;
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution getHighSpeedVideoFpsRangesFor;
            private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes getHighSpeedVideoSizes;

            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner) obj);
            }

            {
                this.getHighSpeedVideoFpsRanges = classDescriptor;
                this.getHighSpeedVideoFpsRangesFor = this;
                this.getHighResolutionOutputSizeshNQ4ISI = simpleType;
                this.getHighSpeedVideoSizes = javaTypeAttributes;
            }
        }), java.lang.Boolean.TRUE);
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution rawSubstitution, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes javaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor findClassAcrossModuleDependencies;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.name.ClassId classId = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId == null || (findClassAcrossModuleDependencies = kotlinTypeRefiner.findClassAcrossModuleDependencies(classId)) == null || kotlin.jvm.internal.Intrinsics.areEqual(findClassAcrossModuleDependencies, classDescriptor)) {
            return null;
        }
        return rawSubstitution.getHighSpeedVideoFpsRangesFor(simpleType, findClassAcrossModuleDependencies, javaTypeAttributes).getFirst();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RawSubstitution() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
