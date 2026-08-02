package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* loaded from: classes5.dex */
public abstract class ErrorValue extends kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue<kotlin.Unit> {
    public static final kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion Companion = new kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.Companion(null);

    public ErrorValue() {
        super(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public kotlin.Unit getValue() {
        throw new java.lang.UnsupportedOperationException();
    }

    public static final class ErrorValueWithMessage extends kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue {
        private final java.lang.String getHighSpeedVideoFpsRangesFor;

        public ErrorValueWithMessage(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.getHighSpeedVideoFpsRangesFor = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public final kotlin.reflect.jvm.internal.impl.types.error.ErrorType getType(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor moduleDescriptor) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moduleDescriptor, "");
            return kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils.createErrorType(kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind.ERROR_CONSTANT_VALUE, this.getHighSpeedVideoFpsRangesFor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        public final java.lang.String toString() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue create(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue.ErrorValueWithMessage(str);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
