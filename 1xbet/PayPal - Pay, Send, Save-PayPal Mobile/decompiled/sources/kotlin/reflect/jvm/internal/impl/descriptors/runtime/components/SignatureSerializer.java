package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

/* loaded from: classes5.dex */
final class SignatureSerializer {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.SignatureSerializer();

    private SignatureSerializer() {
    }

    public static java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.reflect.Method method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
        for (java.lang.Class<?> cls : parameterTypes) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getDesc(cls));
        }
        sb.append(")");
        java.lang.Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(returnType, "");
        sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getDesc(returnType));
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.reflect.Constructor<?> constructor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
        for (java.lang.Class<?> cls : parameterTypes) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
            sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getDesc(cls));
        }
        sb.append(")V");
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static java.lang.String getHighSpeedVideoFpsRanges(java.lang.reflect.Field field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        java.lang.Class<?> type = field.getType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(type, "");
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getDesc(type);
    }
}
