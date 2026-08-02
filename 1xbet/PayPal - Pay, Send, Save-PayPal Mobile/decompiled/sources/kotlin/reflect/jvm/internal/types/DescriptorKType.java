package kotlin.reflect.jvm.internal.types;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u001e\u0010\u001b\u001a\u00020\u0017*\u00020\u001c2\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0002J\u0010\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\bH\u0016J\u0010\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\bH\u0016J\n\u00102\u001a\u0004\u0018\u00010\u0001H\u0016J\n\u00103\u001a\u0004\u0018\u00010\u0001H\u0016J\u0014\u00104\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000106H\u0096\u0082\u0004J\n\u00107\u001a\u000208H\u0096\u0080\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u000f8VX\u0096\u0084\n¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168VX\u0096\u0084\n¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u001d\u001a\u00020\b8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00168VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u0016\u0010&\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001eR\u0014\u0010+\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001eR\u001a\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001eR\u0014\u00101\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001e¨\u00069"}, d2 = {"Lkotlin/reflect/jvm/internal/types/DescriptorKType;", "Lkotlin/reflect/jvm/internal/types/AbstractKType;", "type", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "computeJavaType", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "isAbbreviation", "", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;Z)V", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "getType", "()Lorg/jetbrains/kotlin/types/KotlinType;", "classifier", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "convert", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "getArguments", "()Ljava/util/List;", "arguments$delegate", "toKTypeProjection", "Lkotlin/reflect/jvm/internal/impl/types/TypeProjection;", "isMarkedNullable", "()Z", "annotations", "", "getAnnotations", "makeNullableAsSpecified", "nullable", "makeDefinitelyNotNullAsSpecified", "isDefinitelyNotNull", "abbreviation", "Lkotlin/reflect/KType;", "getAbbreviation", "()Lkotlin/reflect/KType;", "isDefinitelyNotNullType", "isNothingType", "mutableCollectionClass", "Lkotlin/reflect/KClass;", "getMutableCollectionClass", "()Lkotlin/reflect/KClass;", "isSuspendFunctionType", "isRawType", "lowerBoundIfFlexible", "upperBoundIfFlexible", "equals", "other", "", "hashCode", "", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DescriptorKType extends kotlin.reflect.jvm.internal.types.AbstractKType {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.types.DescriptorKType.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.types.DescriptorKType.class, "arguments", "getArguments()Ljava/util/List;", 0))};
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DescriptorKType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, final kotlin.jvm.functions.Function0<? extends java.lang.reflect.Type> function0, boolean z) {
        super(function0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinType;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.types.DescriptorKType$$Lambda$0
            private final kotlin.reflect.jvm.internal.types.DescriptorKType getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.KClassifier highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = r0.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI);
                return highSpeedVideoFpsRanges;
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this, function0) { // from class: kotlin.reflect.jvm.internal.types.DescriptorKType$$Lambda$1
            private final kotlin.reflect.jvm.internal.types.DescriptorKType getHighResolutionOutputSizeshNQ4ISI;
            private final kotlin.jvm.functions.Function0 getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.types.DescriptorKType.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
                this.getHighSpeedVideoFpsRanges = function0;
            }
        });
    }

    /* renamed from: getType, reason: from getter */
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DescriptorKType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.jvm.functions.Function0<? extends java.lang.reflect.Type> function0) {
        this(kotlinType, function0, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
    }

    public /* synthetic */ DescriptorKType(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinType, (i & 2) != 0 ? null : function0);
    }

    @Override // kotlin.reflect.KType
    public final kotlin.reflect.KClassifier getClassifier() {
        return (kotlin.reflect.KClassifier) this.getHighSpeedVideoFpsRangesFor.getValue(this, getHighSpeedVideoSizes[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.KClassifier getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        if (this.getHighSpeedVideoFpsRanges) {
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
            kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor mockClassDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor) mo23898getDeclarationDescriptor : null;
            if (mockClassDescriptor != null) {
                return new kotlin.reflect.jvm.internal.KTypeAliasImpl(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(mockClassDescriptor));
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor2 = kotlinType.getConstructor().mo23898getDeclarationDescriptor();
        if (mo23898getDeclarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) {
            java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor2);
            if (javaClass == null) {
                return null;
            }
            if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray(kotlinType)) {
                kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) kotlin.collections.CollectionsKt.singleOrNull((java.util.List) kotlinType.getArguments());
                if (typeProjection == null || (type = typeProjection.getType()) == null) {
                    return new kotlin.reflect.jvm.internal.KClassImpl(javaClass);
                }
                kotlin.reflect.KClassifier highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(type));
                if (highSpeedVideoFpsRanges == null) {
                    throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Cannot determine classifier for array element type: ".concat(java.lang.String.valueOf(this)));
                }
                return new kotlin.reflect.jvm.internal.KClassImpl(kotlin.reflect.jvm.internal.UtilKt.createArrayType(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kotlin.reflect.jvm.KTypesJvm.getJvmErasure(highSpeedVideoFpsRanges))));
            }
            if (!kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(kotlinType)) {
                java.lang.Class<?> primitiveByWrapper = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getPrimitiveByWrapper(javaClass);
                if (primitiveByWrapper != null) {
                    javaClass = primitiveByWrapper;
                }
                return new kotlin.reflect.jvm.internal.KClassImpl(javaClass);
            }
            return new kotlin.reflect.jvm.internal.KClassImpl(javaClass);
        }
        if (mo23898getDeclarationDescriptor2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
            return new kotlin.reflect.jvm.internal.KTypeParameterImpl(null, (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor2);
        }
        return null;
    }

    @Override // kotlin.reflect.KType
    public final java.util.List<kotlin.reflect.KTypeProjection> getArguments() {
        T value = this.Camera2StreamConfigurationMap.getValue(this, getHighSpeedVideoSizes[1]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        return (java.util.List) value;
    }

    @Override // kotlin.reflect.KType
    /* renamed from: isMarkedNullable */
    public final boolean getIsMarkedNullable() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isMarkedNullable();
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return kotlin.reflect.jvm.internal.UtilKt.computeAnnotations(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final kotlin.reflect.jvm.internal.types.AbstractKType makeNullableAsSpecified(boolean nullable) {
        if (!kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(this.getHighResolutionOutputSizeshNQ4ISI) && getIsMarkedNullable() == nullable) {
            return this;
        }
        kotlin.reflect.jvm.internal.impl.types.KotlinType makeNullableAsSpecified = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableAsSpecified(this.getHighResolutionOutputSizeshNQ4ISI, nullable);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(makeNullableAsSpecified, "");
        return new kotlin.reflect.jvm.internal.types.DescriptorKType(makeNullableAsSpecified, getComputeJavaType());
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final kotlin.reflect.jvm.internal.types.AbstractKType makeDefinitelyNotNullAsSpecified(boolean isDefinitelyNotNull) {
        kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType;
        kotlin.reflect.jvm.internal.impl.types.SimpleType original;
        if (isDefinitelyNotNull) {
            kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType makeDefinitelyNotNull$default = kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion, this.getHighResolutionOutputSizeshNQ4ISI.unwrap(), true, false, 4, null);
            simpleType = makeDefinitelyNotNull$default != null ? makeDefinitelyNotNull$default : this.getHighResolutionOutputSizeshNQ4ISI;
        } else {
            kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType definitelyNotNullType = kotlinType instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType ? (kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) kotlinType : null;
            simpleType = (definitelyNotNullType == null || (original = definitelyNotNullType.getOriginal()) == null) ? this.getHighResolutionOutputSizeshNQ4ISI : original;
        }
        return new kotlin.reflect.jvm.internal.types.DescriptorKType(simpleType, getComputeJavaType());
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final kotlin.reflect.KType getAbbreviation() {
        kotlin.reflect.jvm.internal.impl.types.SimpleType abbreviation = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.getAbbreviation(this.getHighResolutionOutputSizeshNQ4ISI);
        return abbreviation != null ? new kotlin.reflect.jvm.internal.types.DescriptorKType(abbreviation, getComputeJavaType(), true) : null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    /* renamed from: isDefinitelyNotNullType */
    public final boolean getIsDefinitelyNotNullType() {
        return kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.isDefinitelyNotNullType(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    /* renamed from: isNothingType */
    public final boolean getIsNothingType() {
        return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isNothingOrNullableNothing(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final kotlin.reflect.KClass<?> getMutableCollectionClass() {
        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = this.getHighResolutionOutputSizeshNQ4ISI.getConstructor().mo23898getDeclarationDescriptor();
        final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor : null;
        if (classDescriptor == null || !kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.INSTANCE.isMutable(classDescriptor)) {
            return null;
        }
        if (kotlin.reflect.jvm.internal.SystemPropertiesKt.getUseK1Implementation()) {
            kotlin.reflect.KClassifier classifier = getClassifier();
            kotlin.jvm.internal.Intrinsics.checkNotNull(classifier, "");
            return new kotlin.reflect.jvm.internal.types.MutableCollectionKClass((kotlin.reflect.KClass) classifier, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(classDescriptor).asString(), new kotlin.jvm.functions.Function1(classDescriptor) { // from class: kotlin.reflect.jvm.internal.types.DescriptorKType$$Lambda$2
                private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoFpsRanges;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.types.DescriptorKType.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, (kotlin.reflect.jvm.internal.types.MutableCollectionKClass) obj);
                }

                {
                    this.getHighSpeedVideoFpsRanges = classDescriptor;
                }
            }, new kotlin.jvm.functions.Function1(classDescriptor) { // from class: kotlin.reflect.jvm.internal.types.DescriptorKType$$Lambda$3
                private final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.types.DescriptorKType.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, (kotlin.reflect.jvm.internal.types.MutableCollectionKClass) obj);
                }

                {
                    this.getHighSpeedVideoSizes = classDescriptor;
                }
            });
        }
        kotlin.reflect.jvm.internal.impl.name.FqName fqNameSafe = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(classDescriptor);
        kotlin.reflect.KClassifier classifier2 = getClassifier();
        kotlin.jvm.internal.Intrinsics.checkNotNull(classifier2, "");
        return kotlin.reflect.jvm.internal.types.MutableCollectionKClassKt.getMutableCollectionKClass(fqNameSafe, (kotlin.reflect.KClass) classifier2);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    /* renamed from: isSuspendFunctionType */
    public final boolean getIsSuspendFunctionType() {
        return kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    /* renamed from: isRawType */
    public final boolean getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighResolutionOutputSizeshNQ4ISI instanceof kotlin.reflect.jvm.internal.impl.types.RawType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    /* renamed from: lowerBoundIfFlexible */
    public final kotlin.reflect.jvm.internal.types.AbstractKType getGetHighResolutionOutputSizeshNQ4ISI() {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = this.getHighResolutionOutputSizeshNQ4ISI.unwrap();
        kotlin.jvm.functions.Function0 function0 = null;
        java.lang.Object[] objArr = 0;
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            return new kotlin.reflect.jvm.internal.types.DescriptorKType(((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap).getLowerBound(), function0, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    /* renamed from: upperBoundIfFlexible */
    public final kotlin.reflect.jvm.internal.types.AbstractKType getGetHighSpeedVideoFpsRanges() {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = this.getHighResolutionOutputSizeshNQ4ISI.unwrap();
        kotlin.jvm.functions.Function0 function0 = null;
        java.lang.Object[] objArr = 0;
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            return new kotlin.reflect.jvm.internal.types.DescriptorKType(((kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap).getUpperBound(), function0, 2, objArr == true ? 1 : 0);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final boolean equals(java.lang.Object other) {
        if (kotlin.reflect.jvm.internal.SystemPropertiesKt.getUseK1Implementation()) {
            if (!(other instanceof kotlin.reflect.jvm.internal.types.DescriptorKType)) {
                return false;
            }
            kotlin.reflect.jvm.internal.types.DescriptorKType descriptorKType = (kotlin.reflect.jvm.internal.types.DescriptorKType) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, descriptorKType.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(getClassifier(), descriptorKType.getClassifier()) && kotlin.jvm.internal.Intrinsics.areEqual(getArguments(), descriptorKType.getArguments());
        }
        return super.equals(other);
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractKType
    public final int hashCode() {
        if (kotlin.reflect.jvm.internal.SystemPropertiesKt.getUseK1Implementation()) {
            int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
            kotlin.reflect.KClassifier classifier = getClassifier();
            return (((hashCode * 31) + (classifier != null ? classifier.hashCode() : 0)) * 31) + getArguments().hashCode();
        }
        return super.hashCode();
    }

    static /* synthetic */ java.util.List getHighSpeedVideoSizes(final kotlin.reflect.jvm.internal.types.DescriptorKType descriptorKType, kotlin.jvm.functions.Function0 function0) {
        kotlin.reflect.KTypeProjection invariant;
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> arguments = descriptorKType.getHighResolutionOutputSizeshNQ4ISI.getArguments();
        if (arguments.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> list = arguments;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            kotlin.reflect.jvm.internal.impl.types.TypeProjection typeProjection = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) obj;
            kotlin.jvm.functions.Function0<java.lang.reflect.Type> convertTypeArgumentToJavaType = function0 == null ? null : kotlin.reflect.jvm.internal.ConvertFromMetadataKt.convertTypeArgumentToJavaType(new kotlin.jvm.functions.Function0(descriptorKType) { // from class: kotlin.reflect.jvm.internal.types.DescriptorKType$$Lambda$4
                private final kotlin.reflect.jvm.internal.types.DescriptorKType getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.types.DescriptorKType.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
                }

                {
                    this.getHighSpeedVideoSizes = descriptorKType;
                }
            }, i);
            if (typeProjection.isStarProjection()) {
                invariant = kotlin.reflect.KTypeProjection.INSTANCE.getSTAR();
            } else {
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = typeProjection.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                kotlin.reflect.jvm.internal.types.DescriptorKType descriptorKType2 = new kotlin.reflect.jvm.internal.types.DescriptorKType(type, convertTypeArgumentToJavaType);
                int i2 = kotlin.reflect.jvm.internal.types.DescriptorKType.WhenMappings.$EnumSwitchMapping$0[typeProjection.getProjectionKind().ordinal()];
                if (i2 == 1) {
                    invariant = kotlin.reflect.KTypeProjection.INSTANCE.invariant(descriptorKType2);
                } else if (i2 == 2) {
                    invariant = kotlin.reflect.KTypeProjection.INSTANCE.contravariant(descriptorKType2);
                } else {
                    if (i2 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    invariant = kotlin.reflect.KTypeProjection.INSTANCE.covariant(descriptorKType2);
                }
            }
            arrayList.add(invariant);
            i++;
        }
        return arrayList;
    }

    static /* synthetic */ java.util.List getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.types.MutableCollectionKClass mutableCollectionKClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableCollectionKClass, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = declaredTypeParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameterDescriptor);
            arrayList.add(new kotlin.reflect.jvm.internal.KTypeParameterImpl(mutableCollectionKClass, typeParameterDescriptor));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor, kotlin.reflect.jvm.internal.types.MutableCollectionKClass mutableCollectionKClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableCollectionKClass, "");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
        java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> collection = supertypes;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection, 10));
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new kotlin.reflect.jvm.internal.types.DescriptorKType((kotlin.reflect.jvm.internal.impl.types.KotlinType) it.next(), null, 2, 0 == true ? 1 : 0));
        }
        return arrayList;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.types.AbstractKType getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.types.DescriptorKType descriptorKType) {
        return descriptorKType;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlin.reflect.jvm.internal.impl.types.Variance.values().length];
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
