package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public abstract class ValueParameterCountCheck implements kotlin.reflect.jvm.internal.impl.util.Check {
    private final java.lang.String Camera2StreamConfigurationMap;

    public static final class NoValueParameters extends kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck {
        public static final kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters INSTANCE = new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.NoValueParameters();

        private NoValueParameters() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
            return functionDescriptor.getValueParameters().isEmpty();
        }
    }

    private ValueParameterCountCheck(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public java.lang.String getDescription() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public /* bridge */ java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        return kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    public static final class SingleValueParameter extends kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck {
        public static final kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter INSTANCE = new kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.SingleValueParameter();

        private SingleValueParameter() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
            return functionDescriptor.getValueParameters().size() == 1;
        }
    }

    public static final class AtLeast extends kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck {
        private final int getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AtLeast(int i) {
            super(r0.toString(), null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? lib.android.paypal.com.magnessdk.g.n2 : "");
            this.getHighSpeedVideoFpsRangesFor = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
            return functionDescriptor.getValueParameters().size() >= this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public static final class Equals extends kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck {
        private final int getHighSpeedVideoSizes;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Equals(int i) {
            super(r0.toString(), null);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("must have exactly ");
            sb.append(i);
            sb.append(" value parameters");
            this.getHighSpeedVideoSizes = i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        public final boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
            return functionDescriptor.getValueParameters().size() == this.getHighSpeedVideoSizes;
        }
    }

    public /* synthetic */ ValueParameterCountCheck(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
