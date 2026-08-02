package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class SuspendFunctionTypeUtilKt {
    public static final kotlin.reflect.jvm.internal.impl.name.FqName KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME = new kotlin.reflect.jvm.internal.impl.name.FqName("kotlin.suspend");
    public static final kotlin.reflect.jvm.internal.impl.name.CallableId KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME_CALLABLE_ID;

    static {
        kotlin.reflect.jvm.internal.impl.name.FqName fqName = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.BUILT_INS_PACKAGE_FQ_NAME;
        kotlin.reflect.jvm.internal.impl.name.Name identifier = kotlin.reflect.jvm.internal.impl.name.Name.identifier("suspend");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(identifier, "");
        KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME_CALLABLE_ID = new kotlin.reflect.jvm.internal.impl.name.CallableId(fqName, identifier);
    }
}
