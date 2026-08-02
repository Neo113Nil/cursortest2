package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
final /* synthetic */ class ReflectJavaClass$methods$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.reflect.Method, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod> {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$2 getHighSpeedVideoFpsRanges = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod invoke(java.lang.reflect.Method method) {
        java.lang.reflect.Method method2 = method;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method2, "");
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod(method2);
    }

    ReflectJavaClass$methods$2() {
        super(1, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);
    }
}
