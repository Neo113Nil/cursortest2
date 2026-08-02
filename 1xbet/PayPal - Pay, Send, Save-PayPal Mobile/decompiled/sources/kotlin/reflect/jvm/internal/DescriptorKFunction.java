package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B5\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB+\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0011B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0013J\u0012\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0012\u001a\u00020\fH\u0002J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u001c\u0010.\u001a\u0006\u0012\u0002\b\u00030 2\u0006\u0010,\u001a\u00020-2\u0006\u0010/\u001a\u00020+H\u0002J\u0010\u00100\u001a\u0002012\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020-H\u0002J.\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u000305042\n\u0010,\u001a\u0006\u0012\u0002\b\u0003052\u0006\u0010\u0012\u001a\u00020\f2\u0006\u00106\u001a\u00020+H\u0002J\u0014\u0010A\u001a\u00020+2\b\u0010B\u001a\u0004\u0018\u00010\u0002H\u0096\u0082\u0004J\n\u0010C\u001a\u000208H\u0096\u0080\u0004J\n\u0010D\u001a\u00020\tH\u0096\u0080\u0004R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0012\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\b\u001a\u00020\t8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0017R\u001f\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R!\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010 8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b&\u0010\"R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0019R\u0015\u00107\u001a\u0002088VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0015\u0010;\u001a\u00020+8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0015\u0010=\u001a\u00020+8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b=\u0010<R\u0015\u0010>\u001a\u00020+8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0015\u0010?\u001a\u00020+8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b?\u0010<R\u0015\u0010@\u001a\u00020+8VX\u0096\u0084\b¢\u0006\u0006\u001a\u0004\b@\u0010<¨\u0006E"}, d2 = {"Lkotlin/reflect/jvm/internal/DescriptorKFunction;", "Lkotlin/reflect/jvm/internal/DescriptorKCallable;", "", "Lkotlin/reflect/jvm/internal/ReflectKFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "name", "", "signature", "descriptorInitialValue", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "rawBoundReceiver", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "descriptor", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getSignature", "()Ljava/lang/String;", "getRawBoundReceiver", "()Ljava/lang/Object;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", "descriptor$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getName", "caller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller$delegate", "Lkotlin/Lazy;", "defaultCaller", "getDefaultCaller", "defaultCaller$delegate", "getFunctionWithDefaultParametersForValueClassOverride", "getBoundReceiver", "useBoxedBoundReceiver", "", "member", "Ljava/lang/reflect/Method;", "createStaticMethodCaller", "isCallByToValueClassMangledMethod", "createJvmStaticInObjectCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl$Method;", "createInstanceMethodCaller", "createConstructorCaller", "Lkotlin/reflect/jvm/internal/calls/CallerImpl;", "Ljava/lang/reflect/Constructor;", "isDefault", "arity", "", "getArity", "()I", "isInline", "()Z", "isExternal", "isOperator", "isInfix", "isSuspend", "equals", "other", "hashCode", "toString", "kotlin-reflection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DescriptorKFunction extends kotlin.reflect.jvm.internal.DescriptorKCallable<java.lang.Object> implements kotlin.jvm.internal.FunctionBase<java.lang.Object>, kotlin.reflect.jvm.internal.FunctionWithAllInvokes, kotlin.reflect.jvm.internal.ReflectKFunction {
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoSizes = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(kotlin.reflect.jvm.internal.DescriptorKFunction.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};
    private final kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal Camera2StreamConfigurationMap;
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.KDeclarationContainerImpl getHighSpeedVideoFpsRangesFor;
    private final java.lang.Object getInputSizeshNQ4ISI;
    private final java.lang.String getOutputFormats;

    private DescriptorKFunction(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, final java.lang.String str, java.lang.String str2, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = kDeclarationContainerImpl;
        this.getOutputFormats = str2;
        this.getInputSizeshNQ4ISI = obj;
        this.Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.ReflectProperties.lazySoft(functionDescriptor, new kotlin.jvm.functions.Function0(this, str) { // from class: kotlin.reflect.jvm.internal.DescriptorKFunction$$Lambda$0
            private final java.lang.String Camera2StreamConfigurationMap;
            private final kotlin.reflect.jvm.internal.DescriptorKFunction getHighResolutionOutputSizeshNQ4ISI;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor findFunctionDescriptor;
                findFunctionDescriptor = r0.getGetHighSpeedVideoFpsRangesFor().findFunctionDescriptor(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.getGetOutputFormats());
                return findFunctionDescriptor;
            }

            {
                this.getHighResolutionOutputSizeshNQ4ISI = this;
                this.Camera2StreamConfigurationMap = str;
            }
        });
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKFunction$$Lambda$1
            private final kotlin.reflect.jvm.internal.DescriptorKFunction getHighSpeedVideoFpsRanges;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKFunction.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
            }

            {
                this.getHighSpeedVideoFpsRanges = this;
            }
        });
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0(this) { // from class: kotlin.reflect.jvm.internal.DescriptorKFunction$$Lambda$2
            private final kotlin.reflect.jvm.internal.DescriptorKFunction getHighSpeedVideoFpsRangesFor;

            @Override // kotlin.jvm.functions.Function0
            public java.lang.Object invoke() {
                return kotlin.reflect.jvm.internal.DescriptorKFunction.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor);
            }

            {
                this.getHighSpeedVideoFpsRangesFor = this;
            }
        });
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        return default$invoke();
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return default$invoke(obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return default$invoke(obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return default$invoke(obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return default$invoke(obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return default$invoke(obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // kotlin.jvm.functions.Function7
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // kotlin.jvm.functions.Function8
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // kotlin.jvm.functions.Function9
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // kotlin.jvm.functions.Function10
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // kotlin.jvm.functions.Function11
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // kotlin.jvm.functions.Function12
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // kotlin.jvm.functions.Function13
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // kotlin.jvm.functions.Function14
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // kotlin.jvm.functions.Function15
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // kotlin.jvm.functions.Function16
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // kotlin.jvm.functions.Function17
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // kotlin.jvm.functions.Function18
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // kotlin.jvm.functions.Function19
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // kotlin.jvm.functions.Function20
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // kotlin.jvm.functions.Function21
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20, java.lang.Object obj21) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // kotlin.jvm.functions.Function22
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20, java.lang.Object obj21, java.lang.Object obj22) {
        return default$invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    /* renamed from: getContainer, reason: from getter */
    public final kotlin.reflect.jvm.internal.KDeclarationContainerImpl getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKFunction
    /* renamed from: getSignature, reason: from getter */
    public final java.lang.String getGetOutputFormats() {
        return this.getOutputFormats;
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    /* renamed from: getRawBoundReceiver, reason: from getter */
    public final java.lang.Object getGetInputSizeshNQ4ISI() {
        return this.getInputSizeshNQ4ISI;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DescriptorKFunction(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
    }

    public final java.lang.Object default$invoke() {
        return call(new java.lang.Object[0]);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj) {
        return call(obj);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2) {
        return call(obj, obj2);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return call(obj, obj2, obj3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DescriptorKFunction(kotlin.reflect.jvm.internal.KDeclarationContainerImpl kDeclarationContainerImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        this(kDeclarationContainerImpl, r4, kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature(functionDescriptor).getGetHighSpeedVideoFpsRangesFor(), functionDescriptor, kotlin.jvm.internal.CallableReference.NO_RECEIVER);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        java.lang.String asString = functionDescriptor.getName().asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // kotlin.reflect.jvm.internal.DescriptorKCallable
    public final kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor getDescriptor() {
        T value = this.Camera2StreamConfigurationMap.getValue(this, getHighSpeedVideoSizes[0]);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "");
        return (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) value;
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // kotlin.reflect.KCallable
    /* renamed from: getName */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        java.lang.String asString = getDescriptor().getName().asString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asString, "");
        return asString;
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final kotlin.reflect.jvm.internal.calls.Caller<?> getCaller() {
        return (kotlin.reflect.jvm.internal.calls.Caller) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20, java.lang.Object obj21) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    public final java.lang.Object default$invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20, java.lang.Object obj21, java.lang.Object obj22) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // kotlin.reflect.jvm.internal.ReflectKCallable
    public final kotlin.reflect.jvm.internal.calls.Caller<?> getDefaultCaller() {
        return (kotlin.reflect.jvm.internal.calls.Caller) this.getHighSpeedVideoFpsRanges.getValue();
    }

    private final boolean Camera2StreamConfigurationMap(java.lang.reflect.Method method) {
        kotlin.reflect.jvm.internal.impl.types.KotlinType type;
        kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor dispatchReceiverParameter = getDescriptor().getDispatchReceiverParameter();
        if (dispatchReceiverParameter == null || (type = dispatchReceiverParameter.getType()) == null || !kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isInlineClassType(type)) {
            return false;
        }
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
        java.lang.Class cls = (java.lang.Class) kotlin.collections.ArraysKt.firstOrNull(parameterTypes);
        return cls != null && cls.isInterface();
    }

    private final kotlin.reflect.jvm.internal.calls.Caller<?> Camera2StreamConfigurationMap(java.lang.reflect.Method method, boolean z) {
        if (kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(this)) {
            return new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundStatic(method, z, Camera2StreamConfigurationMap(method) ? getGetInputSizeshNQ4ISI() : kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.coerceToExpectedReceiverType(getGetInputSizeshNQ4ISI(), getDescriptor()));
        }
        return new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Static(method);
    }

    private final kotlin.reflect.jvm.internal.calls.CallerImpl.Method getHighSpeedVideoSizes(java.lang.reflect.Method method) {
        return kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(this) ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundJvmStaticInObject(method) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.JvmStaticInObject(method);
    }

    private final kotlin.reflect.jvm.internal.calls.CallerImpl<java.lang.reflect.Constructor<?>> getHighSpeedVideoFpsRanges(java.lang.reflect.Constructor<?> constructor, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor, boolean z) {
        if (!z && kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt.shouldHideConstructorDueToValueClassTypeValueParameters(functionDescriptor)) {
            if (kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(this)) {
                return new kotlin.reflect.jvm.internal.calls.CallerImpl.AccessorForHiddenBoundConstructor(constructor, kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.coerceToExpectedReceiverType(getGetInputSizeshNQ4ISI(), getDescriptor()));
            }
            return new kotlin.reflect.jvm.internal.calls.CallerImpl.AccessorForHiddenConstructor(constructor);
        }
        if (kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(this)) {
            return new kotlin.reflect.jvm.internal.calls.CallerImpl.BoundConstructor(constructor, kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.coerceToExpectedReceiverType(getGetInputSizeshNQ4ISI(), getDescriptor()));
        }
        return new kotlin.reflect.jvm.internal.calls.CallerImpl.Constructor(constructor);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public final int getArity() {
        return kotlin.reflect.jvm.internal.calls.CallerKt.getArity(getCaller());
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInline() {
        return getDescriptor().isInline();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isExternal() {
        return getDescriptor().isExternal();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isOperator() {
        return getDescriptor().isOperator();
    }

    @Override // kotlin.reflect.KFunction
    public final boolean isInfix() {
        return getDescriptor().isInfix();
    }

    @Override // kotlin.reflect.KCallable
    public final boolean isSuspend() {
        return getDescriptor().isSuspend();
    }

    public final boolean equals(java.lang.Object other) {
        kotlin.reflect.jvm.internal.ReflectKFunction asReflectFunction = kotlin.reflect.jvm.internal.UtilKt.asReflectFunction(other);
        return asReflectFunction != null && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoFpsRangesFor(), asReflectFunction.getGetHighSpeedVideoFpsRangesFor()) && kotlin.jvm.internal.Intrinsics.areEqual(getGetHighSpeedVideoFpsRanges(), asReflectFunction.getGetHighSpeedVideoFpsRanges()) && kotlin.jvm.internal.Intrinsics.areEqual(getGetOutputFormats(), asReflectFunction.getGetOutputFormats()) && kotlin.jvm.internal.Intrinsics.areEqual(getGetInputSizeshNQ4ISI(), asReflectFunction.getGetInputSizeshNQ4ISI());
    }

    public final int hashCode() {
        return (((getGetHighSpeedVideoFpsRangesFor().hashCode() * 31) + getGetHighSpeedVideoFpsRanges().hashCode()) * 31) + getGetOutputFormats().hashCode();
    }

    public final java.lang.String toString() {
        return kotlin.reflect.jvm.internal.ReflectionObjectRenderer.INSTANCE.renderFunction(this);
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.calls.Caller getHighSpeedVideoFpsRanges(kotlin.reflect.jvm.internal.DescriptorKFunction descriptorKFunction) {
        java.lang.reflect.Constructor<?> constructor;
        kotlin.reflect.jvm.internal.calls.CallerImpl.Method Camera2StreamConfigurationMap;
        kotlin.reflect.jvm.internal.JvmFunctionSignature mapSignature = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature(descriptorKFunction.getDescriptor());
        if (mapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor) {
            if (descriptorKFunction.isAnnotationConstructor()) {
                java.lang.Class<?> jClass = descriptorKFunction.getGetHighSpeedVideoFpsRangesFor().getJClass();
                java.util.List<kotlin.reflect.KParameter> parameters = descriptorKFunction.getParameters();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(parameters, 10));
                java.util.Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    java.lang.String name2 = ((kotlin.reflect.KParameter) it.next()).getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(name2);
                    arrayList.add(name2);
                }
                return new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller(jClass, arrayList, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            constructor = descriptorKFunction.getGetHighSpeedVideoFpsRangesFor().findConstructorBySignature(((kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor) mapSignature).getConstructorDesc());
        } else if (mapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction) {
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor = descriptorKFunction.getDescriptor();
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
            if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration) && (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) descriptor).isPrimary()) {
                kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor2 = descriptorKFunction.getDescriptor();
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl getHighSpeedVideoFpsRangesFor = descriptorKFunction.getGetHighSpeedVideoFpsRangesFor();
                java.lang.String methodDesc = ((kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction) mapSignature).getMethodDesc();
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = descriptorKFunction.getDescriptor().getValueParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
                return new kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller(descriptor2, getHighSpeedVideoFpsRangesFor, methodDesc, valueParameters);
            }
            kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction kotlinFunction = (kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction) mapSignature;
            constructor = descriptorKFunction.getGetHighSpeedVideoFpsRangesFor().findMethodBySignature(kotlinFunction.getMethodName(), kotlinFunction.getMethodDesc());
        } else if (mapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaMethod) {
            java.lang.reflect.Method method = ((kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaMethod) mapSignature).getMethod();
            kotlin.jvm.internal.Intrinsics.checkNotNull(method, "");
            constructor = method;
        } else {
            if (!(mapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaConstructor)) {
                if (!(mapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                java.util.List<java.lang.reflect.Method> methods = ((kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor) mapSignature).getMethods();
                java.lang.Class<?> jClass2 = descriptorKFunction.getGetHighSpeedVideoFpsRangesFor().getJClass();
                java.util.List<java.lang.reflect.Method> list = methods;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((java.lang.reflect.Method) it2.next()).getName());
                }
                return new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller(jClass2, arrayList2, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA, methods);
            }
            java.lang.reflect.Constructor<?> constructor2 = ((kotlin.reflect.jvm.internal.JvmFunctionSignature.JavaConstructor) mapSignature).getConstructor();
            kotlin.jvm.internal.Intrinsics.checkNotNull(constructor2, "");
            constructor = constructor2;
        }
        if (constructor instanceof java.lang.reflect.Constructor) {
            Camera2StreamConfigurationMap = descriptorKFunction.getHighSpeedVideoFpsRanges((java.lang.reflect.Constructor) constructor, descriptorKFunction.getDescriptor(), false);
        } else if (constructor instanceof java.lang.reflect.Method) {
            java.lang.reflect.Method method2 = (java.lang.reflect.Method) constructor;
            if (java.lang.reflect.Modifier.isStatic(method2.getModifiers())) {
                if (descriptorKFunction.getDescriptor().getAnnotations().mo23890findAnnotation(kotlin.reflect.jvm.internal.UtilKt.getJVM_STATIC()) != null) {
                    Camera2StreamConfigurationMap = descriptorKFunction.getHighSpeedVideoSizes(method2);
                } else {
                    Camera2StreamConfigurationMap = descriptorKFunction.Camera2StreamConfigurationMap(method2, false);
                }
            } else {
                Camera2StreamConfigurationMap = kotlin.reflect.jvm.internal.ReflectKCallableKt.isBound(descriptorKFunction) ? new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.BoundInstance(method2, kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.coerceToExpectedReceiverType(descriptorKFunction.getGetInputSizeshNQ4ISI(), descriptorKFunction.getDescriptor())) : new kotlin.reflect.jvm.internal.calls.CallerImpl.Method.Instance(method2);
            }
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not compute caller for function: ");
            sb.append(descriptorKFunction.getDescriptor());
            sb.append(" (member = ");
            sb.append(constructor);
            sb.append(')');
            throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
        }
        return kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.createValueClassAwareCallerIfNeeded$default(Camera2StreamConfigurationMap, descriptorKFunction.getDescriptor(), false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, java.lang.reflect.Member] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ kotlin.reflect.jvm.internal.calls.Caller getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.DescriptorKFunction descriptorKFunction) {
        java.lang.reflect.Constructor<?> constructor;
        kotlin.reflect.jvm.internal.calls.CallerImpl.Method method;
        kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor;
        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor callableMemberDescriptor;
        kotlin.reflect.jvm.internal.JvmFunctionSignature mapSignature = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature(descriptorKFunction.getDescriptor());
        if (mapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction) {
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor = descriptorKFunction.getDescriptor();
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration, "");
            if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration) && (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) && ((kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor) descriptor).isPrimary()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(descriptorKFunction.getDescriptor().getContainingDeclaration());
                sb.append(" cannot have default arguments");
                throw new kotlin.reflect.jvm.internal.KotlinReflectionInternalError(sb.toString());
            }
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor descriptor2 = descriptorKFunction.getDescriptor();
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters = descriptor2.getValueParameters();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters, "");
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list = valueParameters;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it.next()).declaresDefaultValue()) {
                        break;
                    }
                }
            }
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration2 = descriptor2.getContainingDeclaration();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "");
            if (kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.isValueClass(containingDeclaration2)) {
                ?? mo23887getMember = descriptorKFunction.getCaller().mo23887getMember();
                kotlin.jvm.internal.Intrinsics.checkNotNull(mo23887getMember);
                if (java.lang.reflect.Modifier.isStatic(mo23887getMember.getModifiers())) {
                    java.util.Iterator<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> it2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.overriddenTreeAsSequence(descriptor2, false).iterator();
                    loop0: while (true) {
                        if (!it2.hasNext()) {
                            callableMemberDescriptor = null;
                            break;
                        }
                        callableMemberDescriptor = it2.next();
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters2 = callableMemberDescriptor.getValueParameters();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueParameters2, "");
                        java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> list2 = valueParameters2;
                        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                            java.util.Iterator<T> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                if (((kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) it3.next()).declaresDefaultValue()) {
                                    break loop0;
                                }
                            }
                        }
                    }
                    if (callableMemberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) {
                        functionDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) callableMemberDescriptor;
                        if (functionDescriptor == null) {
                            kotlin.reflect.jvm.internal.JvmFunctionSignature mapSignature2 = kotlin.reflect.jvm.internal.RuntimeTypeMapper.INSTANCE.mapSignature(functionDescriptor);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(mapSignature2, "");
                            kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction kotlinFunction = (kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction) mapSignature2;
                            constructor = descriptorKFunction.getGetHighSpeedVideoFpsRangesFor().findDefaultMethod(kotlinFunction.getMethodName(), kotlinFunction.getMethodDesc(), true);
                        } else {
                            kotlin.reflect.jvm.internal.KDeclarationContainerImpl getHighSpeedVideoFpsRangesFor = descriptorKFunction.getGetHighSpeedVideoFpsRangesFor();
                            kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction kotlinFunction2 = (kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction) mapSignature;
                            java.lang.String methodName = kotlinFunction2.getMethodName();
                            java.lang.String methodDesc = kotlinFunction2.getMethodDesc();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(descriptorKFunction.getCaller().mo23887getMember());
                            constructor = getHighSpeedVideoFpsRangesFor.findDefaultMethod(methodName, methodDesc, !java.lang.reflect.Modifier.isStatic(r6.getModifiers()));
                        }
                    }
                }
            }
            functionDescriptor = null;
            if (functionDescriptor == null) {
            }
        } else if (mapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor) {
            if (descriptorKFunction.isAnnotationConstructor()) {
                java.lang.Class<?> jClass = descriptorKFunction.getGetHighSpeedVideoFpsRangesFor().getJClass();
                java.util.List<kotlin.reflect.KParameter> parameters = descriptorKFunction.getParameters();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(parameters, 10));
                java.util.Iterator<T> it4 = parameters.iterator();
                while (it4.hasNext()) {
                    java.lang.String name2 = ((kotlin.reflect.KParameter) it4.next()).getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(name2);
                    arrayList.add(name2);
                }
                return new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller(jClass, arrayList, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            constructor = descriptorKFunction.getGetHighSpeedVideoFpsRangesFor().findDefaultConstructor(((kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinConstructor) mapSignature).getConstructorDesc());
        } else {
            if (mapSignature instanceof kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor) {
                java.util.List<java.lang.reflect.Method> methods = ((kotlin.reflect.jvm.internal.JvmFunctionSignature.FakeJavaAnnotationConstructor) mapSignature).getMethods();
                java.lang.Class<?> jClass2 = descriptorKFunction.getGetHighSpeedVideoFpsRangesFor().getJClass();
                java.util.List<java.lang.reflect.Method> list3 = methods;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator<T> it5 = list3.iterator();
                while (it5.hasNext()) {
                    arrayList2.add(((java.lang.reflect.Method) it5.next()).getName());
                }
                return new kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller(jClass2, arrayList2, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode.CALL_BY_NAME, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin.JAVA, methods);
            }
            constructor = null;
        }
        if (constructor instanceof java.lang.reflect.Constructor) {
            method = descriptorKFunction.getHighSpeedVideoFpsRanges((java.lang.reflect.Constructor) constructor, descriptorKFunction.getDescriptor(), true);
        } else if (constructor instanceof java.lang.reflect.Method) {
            if (descriptorKFunction.getDescriptor().getAnnotations().mo23890findAnnotation(kotlin.reflect.jvm.internal.UtilKt.getJVM_STATIC()) != null) {
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor containingDeclaration3 = descriptorKFunction.getDescriptor().getContainingDeclaration();
                kotlin.jvm.internal.Intrinsics.checkNotNull(containingDeclaration3, "");
                if (!((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) containingDeclaration3).isCompanionObject()) {
                    method = descriptorKFunction.getHighSpeedVideoSizes((java.lang.reflect.Method) constructor);
                }
            }
            method = descriptorKFunction.Camera2StreamConfigurationMap((java.lang.reflect.Method) constructor, descriptorKFunction.getCaller().isBoundInstanceCallWithValueClasses());
        } else {
            method = null;
        }
        if (method != null) {
            return kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt.createValueClassAwareCallerIfNeeded(method, descriptorKFunction.getDescriptor(), true);
        }
        return null;
    }
}
