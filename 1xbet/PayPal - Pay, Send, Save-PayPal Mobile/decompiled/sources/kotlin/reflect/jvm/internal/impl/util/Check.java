package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public interface Check {
    boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor);

    java.lang.String getDescription();

    java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor);

    public static final class DefaultImpls {
        public static java.lang.String invoke(kotlin.reflect.jvm.internal.impl.util.Check check, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
            if (check.check(functionDescriptor)) {
                return null;
            }
            return check.getDescription();
        }
    }
}
