package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* loaded from: classes5.dex */
public abstract class VariableDescriptorWithInitializerImpl extends kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl {
    protected kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> compileTimeInitializer;
    protected kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>> compileTimeInitializerFactory;
    private final boolean getHighSpeedVideoFpsRanges;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableDescriptorWithInitializerImpl(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor declarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations annotations, kotlin.reflect.jvm.internal.impl.name.Name name2, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType, boolean z, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name2, kotlinType, sourceElement);
        if (declarationDescriptor == null) {
            Camera2StreamConfigurationMap(0);
        }
        if (annotations == null) {
            Camera2StreamConfigurationMap(1);
        }
        if (name2 == null) {
            Camera2StreamConfigurationMap(2);
        }
        if (sourceElement == null) {
            Camera2StreamConfigurationMap(3);
        }
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isVar() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    /* renamed from: getCompileTimeInitializer */
    public kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> mo23891getCompileTimeInitializer() {
        kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> nullableLazyValue = this.compileTimeInitializer;
        if (nullableLazyValue != null) {
            return nullableLazyValue.invoke();
        }
        return null;
    }

    public void setCompileTimeInitializerFactory(kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>> function0) {
        if (function0 == null) {
            Camera2StreamConfigurationMap(4);
        }
        setCompileTimeInitializer(null, function0);
    }

    public void setCompileTimeInitializer(kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>> nullableLazyValue, kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue<kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?>>> function0) {
        if (function0 == null) {
            Camera2StreamConfigurationMap(5);
        }
        this.compileTimeInitializerFactory = function0;
        if (nullableLazyValue == null) {
            nullableLazyValue = function0.invoke();
        }
        this.compileTimeInitializer = nullableLazyValue;
    }

    private static /* synthetic */ void Camera2StreamConfigurationMap(int i) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
