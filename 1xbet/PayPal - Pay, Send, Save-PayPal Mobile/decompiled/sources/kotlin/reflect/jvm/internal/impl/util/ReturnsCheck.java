package kotlin.reflect.jvm.internal.impl.util;

/* loaded from: classes5.dex */
public abstract class ReturnsCheck implements kotlin.reflect.jvm.internal.impl.util.Check {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns, kotlin.reflect.jvm.internal.impl.types.KotlinType> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    private ReturnsCheck(java.lang.String str, kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns, ? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> function1) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.Camera2StreamConfigurationMap = "must return ".concat(java.lang.String.valueOf(str));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public /* bridge */ java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        return kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls.invoke(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public java.lang.String getDescription() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    public boolean check(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor functionDescriptor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionDescriptor, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(functionDescriptor.getReturnType(), this.getHighResolutionOutputSizeshNQ4ISI.invoke(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getBuiltIns(functionDescriptor)));
    }

    public static final class ReturnsBoolean extends kotlin.reflect.jvm.internal.impl.util.ReturnsCheck {
        public static final kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean INSTANCE = new kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean();

        private ReturnsBoolean() {
            super("Boolean", new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsBoolean$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean.Camera2StreamConfigurationMap((kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns) obj);
                }
            }, null);
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType Camera2StreamConfigurationMap(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
            kotlin.reflect.jvm.internal.impl.types.SimpleType booleanType = kotlinBuiltIns.getBooleanType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(booleanType, "");
            return booleanType;
        }
    }

    public static final class ReturnsInt extends kotlin.reflect.jvm.internal.impl.util.ReturnsCheck {
        public static final kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsInt INSTANCE = new kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsInt();

        private ReturnsInt() {
            super("Int", new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsInt$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsInt.getHighSpeedVideoFpsRangesFor((kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns) obj);
                }
            }, null);
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRangesFor(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
            kotlin.reflect.jvm.internal.impl.types.SimpleType intType = kotlinBuiltIns.getIntType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intType, "");
            return intType;
        }
    }

    public static final class ReturnsUnit extends kotlin.reflect.jvm.internal.impl.util.ReturnsCheck {
        public static final kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsUnit INSTANCE = new kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsUnit();

        private ReturnsUnit() {
            super("Unit", new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck$ReturnsUnit$$Lambda$0
                @Override // kotlin.jvm.functions.Function1
                public java.lang.Object invoke(java.lang.Object obj) {
                    return kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsUnit.getHighResolutionOutputSizeshNQ4ISI((kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns) obj);
                }
            }, null);
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.KotlinType getHighResolutionOutputSizeshNQ4ISI(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
            kotlin.reflect.jvm.internal.impl.types.SimpleType unitType = kotlinBuiltIns.getUnitType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unitType, "");
            return unitType;
        }
    }

    public /* synthetic */ ReturnsCheck(java.lang.String str, kotlin.jvm.functions.Function1 function1, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, function1);
    }
}
