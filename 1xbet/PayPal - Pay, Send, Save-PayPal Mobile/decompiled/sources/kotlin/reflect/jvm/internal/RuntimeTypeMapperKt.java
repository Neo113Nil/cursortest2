package kotlin.reflect.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RuntimeTypeMapperKt {
    public static final /* synthetic */ java.lang.String access$getSignature(java.lang.reflect.Method method) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(method.getName());
        java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
        sb.append(kotlin.collections.ArraysKt.joinToString$default(parameterTypes, "", "(", ")", 0, (java.lang.CharSequence) null, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.RuntimeTypeMapperKt$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.RuntimeTypeMapperKt.Camera2StreamConfigurationMap((java.lang.Class) obj);
            }
        }, 24, (java.lang.Object) null));
        java.lang.Class<?> returnType = method.getReturnType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(returnType, "");
        sb.append(kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getDesc(returnType));
        return sb.toString();
    }

    static /* synthetic */ java.lang.CharSequence Camera2StreamConfigurationMap(java.lang.Class cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(cls);
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt.getDesc(cls);
    }
}
