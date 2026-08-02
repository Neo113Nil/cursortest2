package kotlin.reflect.jvm.internal.impl.descriptors;

/* loaded from: classes5.dex */
public interface VariableDescriptor extends kotlin.reflect.jvm.internal.impl.descriptors.ValueDescriptor {
    /* renamed from: getCompileTimeInitializer */
    kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<?> mo23891getCompileTimeInitializer();

    boolean isConst();

    boolean isLateInit();

    boolean isVar();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor substitute(kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor);
}
