package kotlin.reflect.jvm.internal.impl.km.jvm;

/* loaded from: classes17.dex */
public final class JvmMemberSignatureKt {
    public static final kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature wrapAsPublic(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        return new kotlin.reflect.jvm.internal.impl.km.jvm.JvmMethodSignature(method.getName(), method.getDesc());
    }

    public static final kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature wrapAsPublic(kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field field) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field, "");
        return new kotlin.reflect.jvm.internal.impl.km.jvm.JvmFieldSignature(field.getName(), field.getDesc());
    }
}
