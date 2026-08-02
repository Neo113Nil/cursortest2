package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\f*\u00020\u0007H\u0002J'\u00102\u001a\u00028\u00002\u0016\u00103\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010504\"\u0004\u0018\u000105H\u0096\u0080\u0004¢\u0006\u0002\u00106J%\u00107\u001a\u00028\u00002\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010508H\u0096\u0080\u0004¢\u0006\u0002\u00109J\u0015\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010504H\u0002¢\u0006\u0002\u0010<J1\u0010=\u001a\u00028\u00002\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u000105082\f\u0010>\u001a\b\u0012\u0002\b\u0003\u0018\u00010?H\u0016¢\u0006\u0002\u0010@J\u0010\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0014H\u0002J#\u0010F\u001a\u00028\u00002\u0014\u00103\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010508H\u0002¢\u0006\u0002\u00109J\u0010\u0010G\u001a\u0002052\u0006\u0010H\u001a\u00020 H\u0002J\n\u0010I\u001a\u0004\u0018\u00010JH\u0002R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR(\u0010\n\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\r \u000e*\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R>\u0010\u0012\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\u0014 \u000e*\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00150\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00150\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R>\u0010\u0018\u001a2\u0012.\u0012,\u0012\u0004\u0012\u00020\u0014 \u000e*\u0016\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013j\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001`\u00150\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00150\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\f8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u001c\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u001e0\u001e0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u001f\u001a\u00020 8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b!\u0010\"R(\u0010#\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ \u000e*\n\u0012\u0004\u0012\u00020$\u0018\u00010\f0\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\f8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b'\u0010\u0011R\u0017\u0010(\u001a\u0004\u0018\u00010)8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0015\u0010,\u001a\u00020-8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b,\u0010.R\u0015\u0010/\u001a\u00020-8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0015\u00100\u001a\u00020-8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0014\u00101\u001a\u00020-8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R,\u0010:\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u000105 \u000e*\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u000104040\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020-0BX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006K"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKCallable;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/reflect/jvm/internal/ReflectKCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "<init>", "()V", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "_annotations", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "", "", "kotlin.jvm.PlatformType", "annotations", "getAnnotations", "()Ljava/util/List;", "_receiverParameters", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "Lkotlin/collections/ArrayList;", "receiverParameters", "getReceiverParameters", "_parameters", "computeContextParameters", "Lkotlin/reflect/jvm/internal/impl/descriptors/ValueParameterDescriptor;", "parameters", "getParameters", "_returnType", "Lkotlin/reflect/jvm/internal/types/DescriptorKType;", "returnType", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "_typeParameters", "Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "isFinal", "", "()Z", "isOpen", "isAbstract", "isAnnotationConstructor", androidx.core.app.NotificationCompat.CATEGORY_CALL, "args", "", "", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "", "(Ljava/util/Map;)Ljava/lang/Object;", "_absentArguments", "getAbsentArguments", "()[Ljava/lang/Object;", "callDefaultMethod", "continuationArgument", "Lkotlin/coroutines/Continuation;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parametersNeedMFVCFlattening", "Lkotlin/Lazy;", "getParameterTypeSize", "", "parameter", "callAnnotationConstructor", "defaultEmptyArray", "type", "extractContinuationArgument", "Ljava/lang/reflect/Type;", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DescriptorKCallable<R> implements kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl, kotlin.reflect.jvm.internal.ReflectKCallable<R> {
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.List<java.lang.annotation.Annotation>> Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.ArrayList<kotlin.reflect.KParameter>> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.lang.Object[]> getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<kotlin.reflect.jvm.internal.types.DescriptorKType> getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.ArrayList<kotlin.reflect.KParameter>> getHighSpeedVideoSizes;
    private final kotlin.Lazy<java.lang.Boolean> getHighSpeedVideoSizesFor;
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.List<kotlin.reflect.jvm.internal.KTypeParameterImpl>> getOutputFormats;

    public abstract kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor getDescriptor();

    public DescriptorKCallable() {
        kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.List<java.lang.annotation.Annotation>> lazySoft = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$0
            private final kotlin.reflect.jvm.internal.DescriptorKCallable getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                java.util.List computeAnnotations;
                computeAnnotations = kotlin.reflect.jvm.internal.UtilKt.computeAnnotations(this.getHighResolutionOutputSizeshNQ4ISI.getDescriptor());
                return computeAnnotations;
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lazySoft, "");
        this.Camera2StreamConfigurationMap = lazySoft;
        kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.ArrayList<kotlin.reflect.KParameter>> lazySoft2 = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$1
            private final kotlin.reflect.jvm.internal.DescriptorKCallable getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKCallable.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lazySoft2, "");
        this.getHighSpeedVideoSizes = lazySoft2;
        kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.ArrayList<kotlin.reflect.KParameter>> lazySoft3 = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$2
            private final kotlin.reflect.jvm.internal.DescriptorKCallable getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKCallable.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lazySoft3, "");
        this.getHighResolutionOutputSizeshNQ4ISI = lazySoft3;
        kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<kotlin.reflect.jvm.internal.types.DescriptorKType> lazySoft4 = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$3
            private final kotlin.reflect.jvm.internal.DescriptorKCallable getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKCallable.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lazySoft4, "");
        this.getHighSpeedVideoFpsRangesFor = lazySoft4;
        kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.util.List<kotlin.reflect.jvm.internal.KTypeParameterImpl>> lazySoft5 = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$4
            private final kotlin.reflect.jvm.internal.DescriptorKCallable getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKCallable.getOutputFormats(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lazySoft5, "");
        this.getOutputFormats = lazySoft5;
        kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal<java.lang.Object[]> lazySoft6 = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$5
            private final kotlin.reflect.jvm.internal.DescriptorKCallable getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKCallable.getOutputMinFrameDuration(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lazySoft6, "");
        this.getHighSpeedVideoFpsRanges = lazySoft6;
        this.getHighSpeedVideoSizesFor = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$6
            private final kotlin.reflect.jvm.internal.DescriptorKCallable getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(kotlin.reflect.jvm.internal.DescriptorKCallable.getInputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges));
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        java.util.List<java.lang.annotation.Annotation> invoke = this.Camera2StreamConfigurationMap.invoke();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(invoke, "");
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public java.util.List<kotlin.reflect.KParameter> getReceiverParameters() {
        java.util.ArrayList<kotlin.reflect.KParameter> invoke = this.getHighSpeedVideoSizes.invoke();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(invoke, "");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public java.util.List<kotlin.reflect.KParameter> getParameters() {
        java.util.ArrayList<kotlin.reflect.KParameter> invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(invoke, "");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public kotlin.reflect.KType getReturnType() {
        kotlin.reflect.jvm.internal.types.DescriptorKType invoke = this.getHighSpeedVideoFpsRangesFor.invoke();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(invoke, "");
        return invoke;
    }

    @Override // kotlin.reflect.jvm.internal.KTypeParameterOwnerImpl, kotlin.reflect.KCallable
    public java.util.List<kotlin.reflect.KTypeParameter> getTypeParameters() {
        java.util.List<kotlin.reflect.jvm.internal.KTypeParameterImpl> invoke = this.getOutputFormats.invoke();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(invoke, "");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public kotlin.reflect.KVisibility getVisibility() {
        kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility visibility = getDescriptor().getVisibility();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(visibility, "");
        return kotlin.reflect.jvm.internal.UtilKt.toKVisibility(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return getDescriptor().getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return getDescriptor().getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return getDescriptor().getModality() == kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT;
    }

    protected final boolean isAnnotationConstructor() {
        return kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoFpsRanges(), "<init>") && getGetHighSpeedVideoFpsRangesFor().getJClass().isAnnotation();
    }

    @Override // kotlin.reflect.KCallable
    public R call(java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        try {
            return (R) getCaller().call(args);
        } catch (java.lang.IllegalAccessException e) {
            throw new kotlin.reflect.full.IllegalCallableAccessException(e);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        return isAnnotationConstructor() ? getHighSpeedVideoSizes(args) : callDefaultMethod(args, null);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public R callDefaultMethod(java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> args, kotlin.coroutines.Continuation<?> continuationArgument) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
        java.util.List<kotlin.reflect.KParameter> parameters = getParameters();
        boolean z = false;
        if (!parameters.isEmpty()) {
            int size = parameters.size() + (isSuspend() ? 1 : 0);
            java.lang.Object[] objArr = (java.lang.Object[]) this.getHighSpeedVideoFpsRanges.invoke().clone();
            if (isSuspend()) {
                objArr[parameters.size()] = continuationArgument;
            }
            boolean booleanValue = this.getHighSpeedVideoSizesFor.getValue().booleanValue();
            int i = 0;
            for (kotlin.reflect.KParameter kParameter : parameters) {
                int highSpeedVideoSizes = booleanValue ? getHighSpeedVideoSizes(kParameter) : 1;
                if (args.containsKey(kParameter)) {
                    objArr[kParameter.getCamera2StreamConfigurationMap()] = args.get(kParameter);
                } else if (kParameter.isOptional()) {
                    if (booleanValue) {
                        for (int i2 = i; i2 < i + highSpeedVideoSizes; i2++) {
                            int i3 = (i2 / 32) + size;
                            java.lang.Object obj = objArr[i3];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                            objArr[i3] = java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() | (1 << (i2 % 32)));
                        }
                    } else {
                        int i4 = (i / 32) + size;
                        java.lang.Object obj2 = objArr[i4];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
                        objArr[i4] = java.lang.Integer.valueOf(((java.lang.Integer) obj2).intValue() | (1 << (i % 32)));
                    }
                    z = true;
                } else if (!kParameter.isVararg()) {
                    throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: ".concat(java.lang.String.valueOf(kParameter)));
                }
                if (kParameter.getGetInputSizeshNQ4ISI() == kotlin.reflect.KParameter.Kind.VALUE) {
                    i += highSpeedVideoSizes;
                }
            }
            if (!z) {
                try {
                    kotlin.reflect.jvm.internal.calls.Caller<?> caller = getCaller();
                    java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, size);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
                    return (R) caller.call(copyOf);
                } catch (java.lang.IllegalAccessException e) {
                    throw new kotlin.reflect.full.IllegalCallableAccessException(e);
                }
            }
            kotlin.reflect.jvm.internal.calls.Caller<?> defaultCaller = getDefaultCaller();
            if (defaultCaller == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("This callable does not support a default call: ");
                sb.append(getDescriptor());
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
            }
            try {
                return (R) defaultCaller.call(objArr);
            } catch (java.lang.IllegalAccessException e2) {
                throw new kotlin.reflect.full.IllegalCallableAccessException(e2);
            }
        }
        try {
            return (R) getCaller().call(isSuspend() ? new kotlin.coroutines.Continuation[]{continuationArgument} : new kotlin.coroutines.Continuation[0]);
        } catch (java.lang.IllegalAccessException e3) {
            throw new kotlin.reflect.full.IllegalCallableAccessException(e3);
        }
    }

    private final int getHighSpeedVideoSizes(kotlin.reflect.KParameter kParameter) {
        if (!this.getHighSpeedVideoSizesFor.getValue().booleanValue()) {
            throw new java.lang.IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before".toString());
        }
        if (!kotlin.reflect.jvm.internal.UtilKt.getNeedsMultiFieldValueClassFlattening(kParameter.getType())) {
            return 1;
        }
        kotlin.reflect.KType type = kParameter.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(type, "");
        java.util.List<java.lang.reflect.Method> mfvcUnboxMethods = kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.getMfvcUnboxMethods(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.asSimpleType(((kotlin.reflect.jvm.internal.types.DescriptorKType) type).getGetHighResolutionOutputSizeshNQ4ISI()));
        kotlin.jvm.internal.Intrinsics.checkNotNull(mfvcUnboxMethods);
        return mfvcUnboxMethods.size();
    }

    private final R getHighSpeedVideoSizes(java.util.Map<kotlin.reflect.KParameter, ? extends java.lang.Object> map) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        java.util.List<kotlin.reflect.KParameter> parameters = getParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(parameters, 10));
        for (kotlin.reflect.KParameter kParameter : parameters) {
            if (map.containsKey(kParameter)) {
                highResolutionOutputSizeshNQ4ISI = map.get(kParameter);
                if (highResolutionOutputSizeshNQ4ISI == null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Annotation argument value cannot be null (");
                    sb.append(kParameter);
                    sb.append(')');
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            } else if (kParameter.isOptional()) {
                highResolutionOutputSizeshNQ4ISI = null;
            } else {
                if (!kParameter.isVararg()) {
                    throw new java.lang.IllegalArgumentException("No argument provided for a required parameter: ".concat(java.lang.String.valueOf(kParameter)));
                }
                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(kParameter.getType());
            }
            arrayList.add(highResolutionOutputSizeshNQ4ISI);
        }
        java.util.ArrayList arrayList2 = arrayList;
        kotlin.reflect.jvm.internal.calls.Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("This callable does not support a default call: ");
            sb2.append(getDescriptor());
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb2.toString());
        }
        try {
            return (R) defaultCaller.call(arrayList2.toArray(new java.lang.Object[0]));
        } catch (java.lang.IllegalAccessException e) {
            throw new kotlin.reflect.full.IllegalCallableAccessException(e);
        }
    }

    private static java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.KType kType) {
        java.lang.Class javaClass = kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kotlin.reflect.jvm.KTypesJvm.getJvmErasure(kType));
        if (javaClass.isArray()) {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(javaClass.getComponentType(), 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
            return newInstance;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot instantiate the default empty array of type ");
        sb.append(javaClass.getSimpleName());
        sb.append(", because it is not an array type");
        throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
    }

    static /* synthetic */ java.util.ArrayList getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable) {
        kotlin.Pair pair;
        final java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor instanceReceiverParameter = kotlin.reflect.jvm.internal.UtilKt.getInstanceReceiverParameter(descriptorKCallable.getDescriptor());
        if (instanceReceiverParameter != null) {
            arrayList2.add(new kotlin.reflect.jvm.internal.DescriptorKParameter(descriptorKCallable, arrayList2.size(), kotlin.reflect.KParameter.Kind.INSTANCE, new kotlin.jvm.functions.Function0(instanceReceiverParameter) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$7
                private final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.DescriptorKCallable.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
                }

                {
                    this.getHighSpeedVideoSizes = instanceReceiverParameter;
                }
            }));
        }
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor descriptor = descriptorKCallable.getDescriptor();
        if (descriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor) descriptor;
            pair = kotlin.TuplesKt.to(deserializedSimpleFunctionDescriptor.getNameResolver(), deserializedSimpleFunctionDescriptor.getProto().getContextParameterList());
        } else if (descriptor instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor deserializedPropertyDescriptor = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) descriptor;
            pair = kotlin.TuplesKt.to(deserializedPropertyDescriptor.getNameResolver(), deserializedPropertyDescriptor.getProto().getContextParameterList());
        } else {
            if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor) {
                kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor correspondingProperty = ((kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor) descriptor).getCorrespondingProperty();
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor deserializedPropertyDescriptor2 = correspondingProperty instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor) correspondingProperty : null;
                if (deserializedPropertyDescriptor2 != null) {
                    pair = kotlin.TuplesKt.to(deserializedPropertyDescriptor2.getNameResolver(), deserializedPropertyDescriptor2.getProto().getContextParameterList());
                }
            }
            pair = null;
        }
        if (pair != null) {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver = (kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver) pair.component1();
            java.util.List list = (java.util.List) pair.component2();
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> contextReceiverParameters = descriptor.getContextReceiverParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor> list2 = contextReceiverParameters;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            int i = 0;
            for (java.lang.Object obj : list2) {
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor) obj;
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations = receiverParameterDescriptor.getAnnotations();
                kotlin.reflect.jvm.internal.impl.name.Name guessByFirstCharacter = kotlin.reflect.jvm.internal.impl.name.Name.guessByFirstCharacter(nameResolver.getString(((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) list.get(i)).getName()));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(guessByFirstCharacter, "");
                kotlin.reflect.jvm.internal.impl.types.KotlinType type = receiverParameterDescriptor.getType();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
                kotlin.reflect.jvm.internal.impl.descriptors.SourceElement source = receiverParameterDescriptor.getSource();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(source, "");
                arrayList3.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl(descriptor, null, i, annotations, guessByFirstCharacter, type, false, false, false, null, source));
                i++;
            }
            arrayList = arrayList3;
        } else {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        int size = arrayList.size();
        for (final int i2 = 0; i2 < size; i2++) {
            arrayList2.add(new kotlin.reflect.jvm.internal.DescriptorKParameter(descriptorKCallable, arrayList2.size(), kotlin.reflect.KParameter.Kind.CONTEXT, new kotlin.jvm.functions.Function0(arrayList, i2) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$8
                private final int Camera2StreamConfigurationMap;
                private final java.util.List getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.DescriptorKCallable.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap);
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = arrayList;
                    this.Camera2StreamConfigurationMap = i2;
                }
            }));
        }
        final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor extensionReceiverParameter = descriptorKCallable.getDescriptor().getExtensionReceiverParameter();
        if (extensionReceiverParameter != null) {
            arrayList2.add(new kotlin.reflect.jvm.internal.DescriptorKParameter(descriptorKCallable, arrayList2.size(), kotlin.reflect.KParameter.Kind.EXTENSION_RECEIVER, new kotlin.jvm.functions.Function0(extensionReceiverParameter) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$9
                private final kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.DescriptorKCallable.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor);
                }

                {
                    this.getHighSpeedVideoFpsRangesFor = extensionReceiverParameter;
                }
            }));
        }
        return arrayList2;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor, int i) {
        kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor valueParameterDescriptor = callableMemberDescriptor.getValueParameters().get(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameterDescriptor, "");
        return valueParameterDescriptor;
    }

    static /* synthetic */ java.lang.reflect.Type getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable) {
        java.lang.reflect.Type[] lowerBounds;
        java.lang.reflect.Type type = null;
        if (descriptorKCallable.isSuspend()) {
            java.lang.Object lastOrNull = kotlin.collections.CollectionsKt.lastOrNull((java.util.List<? extends java.lang.Object>) descriptorKCallable.getCaller().getParameterTypes());
            java.lang.reflect.ParameterizedType parameterizedType = lastOrNull instanceof java.lang.reflect.ParameterizedType ? (java.lang.reflect.ParameterizedType) lastOrNull : null;
            if (kotlin.jvm.internal.Intrinsics.areEqual(parameterizedType != null ? parameterizedType.getRawType() : null, kotlin.coroutines.Continuation.class)) {
                java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "");
                java.lang.Object single = kotlin.collections.ArraysKt.single(actualTypeArguments);
                java.lang.reflect.WildcardType wildcardType = single instanceof java.lang.reflect.WildcardType ? (java.lang.reflect.WildcardType) single : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    type = (java.lang.reflect.Type) kotlin.collections.ArraysKt.first(lowerBounds);
                }
            }
        }
        return type == null ? descriptorKCallable.getCaller().getReturnType() : type;
    }

    static /* synthetic */ java.util.ArrayList getHighSpeedVideoSizes(kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable) {
        final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor descriptor = descriptorKCallable.getDescriptor();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(descriptorKCallable)) {
            arrayList.addAll(descriptorKCallable.getReceiverParameters());
        }
        int size = descriptor.getValueParameters().size();
        for (final int i = 0; i < size; i++) {
            arrayList.add(new kotlin.reflect.jvm.internal.DescriptorKParameter(descriptorKCallable, arrayList.size(), kotlin.reflect.KParameter.Kind.VALUE, new kotlin.jvm.functions.Function0(descriptor, i) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$10
                private final kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor Camera2StreamConfigurationMap;
                private final int getHighResolutionOutputSizeshNQ4ISI;

                @Override // kotlin.jvm.functions.Function0
                public java.lang.Object invoke() {
                    return kotlin.reflect.jvm.internal.DescriptorKCallable.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI);
                }

                {
                    this.Camera2StreamConfigurationMap = descriptor;
                    this.getHighResolutionOutputSizeshNQ4ISI = i;
                }
            }));
        }
        if (descriptorKCallable.isAnnotationConstructor() && (descriptor instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor)) {
            java.util.ArrayList arrayList2 = arrayList;
            if (arrayList2.size() > 1) {
                kotlin.collections.CollectionsKt.sortWith(arrayList2, new java.util.Comparator() { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$_parameters$lambda$0$$inlined$sortBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return kotlin.comparisons.ComparisonsKt.compareValues(((kotlin.reflect.KParameter) t).getName(), ((kotlin.reflect.KParameter) t2).getName());
                    }
                });
            }
        }
        arrayList.trimToSize();
        return arrayList;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.types.DescriptorKType Camera2StreamConfigurationMap(final kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType returnType = descriptorKCallable.getDescriptor().getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNull(returnType);
        return new kotlin.reflect.jvm.internal.types.DescriptorKType(returnType, new kotlin.jvm.functions.Function0(descriptorKCallable) { // from class: kotlin.reflect.jvm.internal.DescriptorKCallable$$Lambda$11
            private final kotlin.reflect.jvm.internal.DescriptorKCallable getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKCallable.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = descriptorKCallable;
            }
        });
    }

    static /* synthetic */ java.util.List getOutputFormats(kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable) {
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> typeParameters = descriptorKCallable.getDescriptor().getTypeParameters();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> list = typeParameters;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        for (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor : list) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(typeParameterDescriptor);
            arrayList.add(new kotlin.reflect.jvm.internal.KTypeParameterImpl(descriptorKCallable, typeParameterDescriptor));
        }
        return arrayList;
    }

    static /* synthetic */ java.lang.Object[] getOutputMinFrameDuration(kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable) {
        int i;
        java.util.List<kotlin.reflect.KParameter> parameters = descriptorKCallable.getParameters();
        int size = parameters.size() + (descriptorKCallable.isSuspend() ? 1 : 0);
        if (descriptorKCallable.getHighSpeedVideoSizesFor.getValue().booleanValue()) {
            i = 0;
            for (kotlin.reflect.KParameter kParameter : parameters) {
                i += kParameter.getGetInputSizeshNQ4ISI() == kotlin.reflect.KParameter.Kind.VALUE ? descriptorKCallable.getHighSpeedVideoSizes(kParameter) : 0;
            }
        } else {
            java.util.List<kotlin.reflect.KParameter> list = parameters;
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                i = 0;
            } else {
                java.util.Iterator<T> it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((kotlin.reflect.KParameter) it.next()).getGetInputSizeshNQ4ISI() == kotlin.reflect.KParameter.Kind.VALUE && (i = i + 1) < 0) {
                        kotlin.collections.CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        int i2 = (i + 31) / 32;
        java.lang.Object[] objArr = new java.lang.Object[size + i2 + 1];
        for (kotlin.reflect.KParameter kParameter2 : parameters) {
            if (kParameter2.isOptional() && !kotlin.reflect.jvm.internal.UtilKt.isInlineClassType(kParameter2.getType())) {
                objArr[kParameter2.getCamera2StreamConfigurationMap()] = kotlin.reflect.jvm.internal.UtilKt.defaultPrimitiveValue(kotlin.reflect.jvm.ReflectJvmMapping.getJavaType(kParameter2.getType()));
            } else if (kParameter2.isVararg()) {
                objArr[kParameter2.getCamera2StreamConfigurationMap()] = getHighResolutionOutputSizeshNQ4ISI(kParameter2.getType());
            }
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[size + i3] = 0;
        }
        return objArr;
    }

    static /* synthetic */ boolean getInputSizeshNQ4ISI(kotlin.reflect.jvm.internal.DescriptorKCallable descriptorKCallable) {
        java.util.List<kotlin.reflect.KParameter> parameters = descriptorKCallable.getParameters();
        if ((parameters instanceof java.util.Collection) && parameters.isEmpty()) {
            return false;
        }
        java.util.Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            if (kotlin.reflect.jvm.internal.UtilKt.getNeedsMultiFieldValueClassFlattening(((kotlin.reflect.KParameter) it.next()).getType())) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor) {
        return receiverParameterDescriptor;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor getHighSpeedVideoFpsRangesFor(java.util.List list, int i) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor) list.get(i);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor receiverParameterDescriptor) {
        return receiverParameterDescriptor;
    }
}
