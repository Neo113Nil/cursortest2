package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* loaded from: classes5.dex */
public abstract class FunctionTypeKind {
    private final boolean Camera2StreamConfigurationMap;
    private final kotlin.reflect.jvm.internal.impl.name.ClassId getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.name.FqName getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    public FunctionTypeKind(kotlin.reflect.jvm.internal.impl.name.FqName fqName, java.lang.String str, boolean z, kotlin.reflect.jvm.internal.impl.name.ClassId classId, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = fqName;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoSizes = z;
        this.getHighResolutionOutputSizeshNQ4ISI = classId;
        this.Camera2StreamConfigurationMap = z2;
    }

    public final kotlin.reflect.jvm.internal.impl.name.FqName getPackageFqName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String getClassNamePrefix() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.name.Name numberedClassName(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(i);
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier(sb.toString());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        return identifier;
    }

    public final kotlin.reflect.jvm.internal.impl.name.ClassId numberedClassId(int i) {
        return new kotlin.reflect.jvm.internal.impl.name.ClassId(this.getHighSpeedVideoFpsRanges, numberedClassName(i));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append('N');
        return sb.toString();
    }

    public static final class Function extends kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind {
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function INSTANCE = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function();

        private Function() {
            super(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function", false, null, true);
        }
    }

    public static final class SuspendFunction extends kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind {
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction INSTANCE = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction();

        private SuspendFunction() {
            super(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.COROUTINES_PACKAGE_FQ_NAME, "SuspendFunction", false, null, true);
        }
    }

    public static final class KFunction extends kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind {
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KFunction INSTANCE = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KFunction();

        private KFunction() {
            super(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.KOTLIN_REFLECT_FQ_NAME, "KFunction", true, null, false);
        }
    }

    public static final class KSuspendFunction extends kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind {
        public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KSuspendFunction INSTANCE = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KSuspendFunction();

        private KSuspendFunction() {
            super(kotlin.reflect.jvm.internal.impl.builtins.StandardNames.KOTLIN_REFLECT_FQ_NAME, "KSuspendFunction", true, null, false);
        }
    }
}
