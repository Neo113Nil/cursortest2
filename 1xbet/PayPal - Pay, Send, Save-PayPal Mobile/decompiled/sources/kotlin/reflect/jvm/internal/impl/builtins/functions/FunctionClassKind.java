package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class FunctionClassKind {
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Companion Companion;
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind Function;
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind KFunction;
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind KSuspendFunction;
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind SuspendFunction;
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind UNKNOWN;
    private static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[] getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private FunctionClassKind(java.lang.String str, int i) {
    }

    static {
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind functionClassKind = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind("Function", 0);
        Function = functionClassKind;
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind functionClassKind2 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind("SuspendFunction", 1);
        SuspendFunction = functionClassKind2;
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind functionClassKind3 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind("KFunction", 2);
        KFunction = functionClassKind3;
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind functionClassKind4 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind("KSuspendFunction", 3);
        KSuspendFunction = functionClassKind4;
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind functionClassKind5 = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind("UNKNOWN", 4);
        UNKNOWN = functionClassKind5;
        kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[] functionClassKindArr = {functionClassKind, functionClassKind2, functionClassKind3, functionClassKind4, functionClassKind5};
        getHighSpeedVideoFpsRanges = functionClassKindArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(functionClassKindArr);
        Companion = new kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Companion(null);
    }

    public static final class Companion {
        private Companion() {
        }

        public final kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind getFunctionClassKind(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind functionTypeKind) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(functionTypeKind, "");
            return kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.Function.INSTANCE) ? kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.Function : kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.SuspendFunction.INSTANCE) ? kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.SuspendFunction : kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KFunction.INSTANCE) ? kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.KFunction : kotlin.jvm.internal.Intrinsics.areEqual(functionTypeKind, kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind.KSuspendFunction.INSTANCE) ? kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.KSuspendFunction : kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.UNKNOWN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[] values() {
        return (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind valueOf(java.lang.String str) {
        return (kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind) java.lang.Enum.valueOf(kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind.class, str);
    }
}
