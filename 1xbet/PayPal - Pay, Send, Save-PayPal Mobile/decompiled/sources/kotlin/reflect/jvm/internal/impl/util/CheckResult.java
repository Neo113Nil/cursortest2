package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public abstract class CheckResult {
    private final boolean getHighSpeedVideoSizes;

    public static final class IllegalSignature extends kotlin.reflect.jvm.internal.impl.util.CheckResult {
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IllegalSignature(java.lang.String str) {
            super(false, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }
    }

    private CheckResult(boolean z) {
        this.getHighSpeedVideoSizes = z;
    }

    public final boolean isSuccess() {
        return this.getHighSpeedVideoSizes;
    }

    public static final class IllegalFunctionName extends kotlin.reflect.jvm.internal.impl.util.CheckResult {
        public static final kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalFunctionName INSTANCE = new kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalFunctionName();

        private IllegalFunctionName() {
            super(false, null);
        }
    }

    public static final class SuccessCheck extends kotlin.reflect.jvm.internal.impl.util.CheckResult {
        public static final kotlin.reflect.jvm.internal.impl.util.CheckResult.SuccessCheck INSTANCE = new kotlin.reflect.jvm.internal.impl.util.CheckResult.SuccessCheck();

        private SuccessCheck() {
            super(true, null);
        }
    }

    public /* synthetic */ CheckResult(boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
