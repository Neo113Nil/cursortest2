package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public abstract class AbstractModifierChecks {
    public abstract java.util.List<kotlin.reflect.jvm.internal.impl.util.Checks> getChecks$descriptors();

    public final kotlin.reflect.jvm.internal.impl.util.CheckResult check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        for (kotlin.reflect.jvm.internal.impl.util.Checks checks : getChecks$descriptors()) {
            if (checks.isApplicable(functionDescriptor)) {
                return checks.checkAll(functionDescriptor);
            }
        }
        return kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalFunctionName.INSTANCE;
    }
}
