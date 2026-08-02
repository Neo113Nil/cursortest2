package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u00014B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u00020#0%\"\u00020#H\u0002¢\u0006\u0002\u0010&J\u0014\u0010/\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u000101H\u0096\u0082\u0004J\n\u00102\u001a\u00020\u0005H\u0096\u0080\u0004J\n\u00103\u001a\u00020\u001fH\u0096\u0080\u0004R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0004\u001a\u00020\u0005X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0006\u001a\u00020\u0007X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198VX\u0096\u0084\n¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b \u0010!R\u0015\u0010'\u001a\u00020(8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0015\u0010+\u001a\u00020,8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b+\u0010-R\u0015\u0010.\u001a\u00020,8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b.\u0010-¨\u00065"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKParameter;", "Lkotlin/reflect/jvm/internal/ReflectKParameter;", "callable", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "index", "", "kind", "Lkotlin/reflect/KParameter$Kind;", "computeDescriptor", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "<init>", "(Lkotlin/reflect/jvm/internal/DescriptorKCallable;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "getCallable", "()Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "getIndex", "()I", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "descriptor", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "name", "", "getName", "()Ljava/lang/String;", "compoundType", "Ljava/lang/reflect/Type;", "types", "", "([Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;", "type", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "isOptional", "", "()Z", "isVararg", "equals", "other", "", "hashCode", "toString", "CompoundTypeImpl", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DescriptorKParameter implements kotlin.reflect.jvm.internal.ReflectKParameter {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.DescriptorKParameter.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.DescriptorKParameter.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};
    private final int Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.DescriptorKCallable<?> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal getHighSpeedVideoSizes;
    private final kotlin.reflect.KParameter.Kind getInputSizeshNQ4ISI;

    public DescriptorKParameter(kotlin.reflect.jvm.internal.DescriptorKCallable<?> descriptorKCallable, int i, kotlin.reflect.KParameter.Kind kind, kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorKCallable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kind, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRanges = descriptorKCallable;
        this.Camera2StreamConfigurationMap = i;
        this.getInputSizeshNQ4ISI = kind;
        this.getHighSpeedVideoFpsRangesFor = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(function0);
        this.getHighSpeedVideoSizes = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKParameter$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKParameter getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKParameter.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKParameter
    public final kotlin.reflect.jvm.internal.DescriptorKCallable<?> getCallable() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.KParameter
    /* renamed from: getIndex, reason: from getter */
    public final int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.KParameter
    /* renamed from: getKind, reason: from getter */
    public final kotlin.reflect.KParameter.Kind getGetInputSizeshNQ4ISI() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        T value = this.getHighSpeedVideoSizes.getValue(this, getHighResolutionOutputSizeshNQ4ISI[1]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        return (java.util.List) value;
    }

    private static java.lang.reflect.Type getHighSpeedVideoFpsRangesFor(java.lang.reflect.Type... typeArr) {
        int length = typeArr.length;
        if (length == 0) {
            throw new kotlin.jvm.KotlinReflectionNotSupportedError("Expected at least 1 type for compound type");
        }
        if (length == 1) {
            return (java.lang.reflect.Type) kotlin.collections.ArraysKt.single(typeArr);
        }
        return new kotlin.reflect.jvm.internal.DescriptorKParameter.CompoundTypeImpl(typeArr);
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\t\u001a\u00020\nH\u0096\u0080\u0004J\n\u0010\u0011\u001a\u00020\fH\u0096\u0080\u0004R\u001b\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKParameter$CompoundTypeImpl;", "Ljava/lang/reflect/Type;", "types", "", "<init>", "([Ljava/lang/reflect/Type;)V", "getTypes", "()[Ljava/lang/reflect/Type;", "[Ljava/lang/reflect/Type;", "hashCode", "", "getTypeName", "", "equals", "", "other", "", "toString", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class CompoundTypeImpl implements java.lang.reflect.Type {
        private final int getHighSpeedVideoFpsRangesFor;
        private final java.lang.reflect.Type[] getHighSpeedVideoSizes;

        public CompoundTypeImpl(java.lang.reflect.Type[] typeArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArr, "");
            this.getHighSpeedVideoSizes = typeArr;
            this.getHighSpeedVideoFpsRangesFor = java.util.Arrays.hashCode(typeArr);
        }

        @Override // java.lang.reflect.Type
        public final java.lang.String getTypeName() {
            return kotlin.collections.ArraysKt.joinToString$default(this.getHighSpeedVideoSizes, ", ", "[", "]", 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 56, (java.lang.Object) null);
        }

        public final boolean equals(java.lang.Object other) {
            return (other instanceof kotlin.reflect.jvm.internal.DescriptorKParameter.CompoundTypeImpl) && java.util.Arrays.equals(this.getHighSpeedVideoSizes, ((kotlin.reflect.jvm.internal.DescriptorKParameter.CompoundTypeImpl) other).getHighSpeedVideoSizes);
        }

        /* renamed from: hashCode, reason: from getter */
        public final int getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final java.lang.String toString() {
            return getTypeName();
        }
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof kotlin.reflect.jvm.internal.ReflectKParameter)) {
            return false;
        }
        kotlin.reflect.jvm.internal.ReflectKParameter reflectKParameter = (kotlin.reflect.jvm.internal.ReflectKParameter) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getCallable(), reflectKParameter.getCallable()) && getCamera2StreamConfigurationMap() == reflectKParameter.getCamera2StreamConfigurationMap();
    }

    public final int hashCode() {
        return (getCallable().hashCode() * 31) + java.lang.Integer.hashCode(getCamera2StreamConfigurationMap());
    }

    public final java.lang.String toString() {
        return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.INSTANCE.renderParameter(this);
    }

    static /* synthetic */ java.util.List getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.DescriptorKParameter descriptorKParameter) {
        T value = descriptorKParameter.getHighSpeedVideoFpsRangesFor.getValue(descriptorKParameter, getHighResolutionOutputSizeshNQ4ISI[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        return kotlin.reflect.jvm.internal.UtilKt.computeAnnotations((kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor) value);
    }

    static /* synthetic */ java.lang.reflect.Type getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.DescriptorKParameter descriptorKParameter) {
        java.util.List slice;
        T value = descriptorKParameter.getHighSpeedVideoFpsRangesFor.getValue(descriptorKParameter, getHighResolutionOutputSizeshNQ4ISI[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor parameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor) value;
        if ((parameterDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.UtilKt.getInstanceReceiverParameter(descriptorKParameter.getCallable().getDescriptor()), parameterDescriptor) && descriptorKParameter.getCallable().getDescriptor().getKind() == kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = descriptorKParameter.getCallable().getDescriptor().getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration, "");
            java.lang.Class<?> javaClass = kotlin.reflect.jvm.internal.UtilKt.toJavaClass((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration);
            if (javaClass != null) {
                return javaClass;
            }
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: ".concat(java.lang.String.valueOf(parameterDescriptor)));
        }
        kotlin.reflect.jvm.internal.calls.Caller<?> caller = descriptorKParameter.getCallable().getCaller();
        if (caller instanceof kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller) {
            if (kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(descriptorKParameter.getCallable())) {
                kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller valueClassAwareCaller = (kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller) caller;
                kotlin.ranges.IntRange realSlicesOfParameters = valueClassAwareCaller.getRealSlicesOfParameters(descriptorKParameter.getCamera2StreamConfigurationMap() + 1);
                int last = valueClassAwareCaller.getRealSlicesOfParameters(0).getLast() + 1;
                slice = kotlin.collections.CollectionsKt.slice((java.util.List) valueClassAwareCaller.getParameterTypes(), new kotlin.ranges.IntRange(realSlicesOfParameters.getFirst() - last, realSlicesOfParameters.getLast() - last));
            } else {
                kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller valueClassAwareCaller2 = (kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller) caller;
                slice = kotlin.collections.CollectionsKt.slice((java.util.List) valueClassAwareCaller2.getParameterTypes(), valueClassAwareCaller2.getRealSlicesOfParameters(descriptorKParameter.getCamera2StreamConfigurationMap()));
            }
            java.lang.reflect.Type[] typeArr = (java.lang.reflect.Type[]) slice.toArray(new java.lang.reflect.Type[0]);
            return getHighSpeedVideoFpsRangesFor((java.lang.reflect.Type[]) java.util.Arrays.copyOf(typeArr, typeArr.length));
        }
        if (caller instanceof kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller) {
            java.lang.Class[] clsArr = (java.lang.Class[]) ((kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller) caller).getOriginalParametersGroups().get(descriptorKParameter.getCamera2StreamConfigurationMap()).toArray(new java.lang.Class[0]);
            return getHighSpeedVideoFpsRangesFor((java.lang.reflect.Type[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        }
        return caller.getParameterTypes().get(descriptorKParameter.getCamera2StreamConfigurationMap());
    }

    @Override // kotlin.reflect.KParameter
    public final java.lang.String getName() {
        T value = this.getHighSpeedVideoFpsRangesFor.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor parameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor) value;
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = parameterDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) parameterDescriptor : null;
        if (valueParameterDescriptor == null || valueParameterDescriptor.getContainingDeclaration().hasSynthesizedParameterNames()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.Name name2 = valueParameterDescriptor.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        if (name2.isSpecial()) {
            return null;
        }
        return name2.asString();
    }

    @Override // kotlin.reflect.KParameter
    public final kotlin.reflect.KType getType() {
        T value = this.getHighSpeedVideoFpsRangesFor.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType type = ((kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor) value).getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        return new kotlin.reflect.jvm.internal.types.DescriptorKType(type, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKParameter$$Lambda$1
            private final kotlin.reflect.jvm.internal.DescriptorKParameter getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKParameter.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    @Override // kotlin.reflect.KParameter
    public final boolean isOptional() {
        T value = this.getHighSpeedVideoFpsRangesFor.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor parameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor) value;
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = parameterDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) parameterDescriptor : null;
        if (valueParameterDescriptor != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor);
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    public final boolean isVararg() {
        T value = this.getHighSpeedVideoFpsRangesFor.getValue(this, getHighResolutionOutputSizeshNQ4ISI[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor parameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor) value;
        return (parameterDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) parameterDescriptor).getVarargElementType() != null;
    }
}
