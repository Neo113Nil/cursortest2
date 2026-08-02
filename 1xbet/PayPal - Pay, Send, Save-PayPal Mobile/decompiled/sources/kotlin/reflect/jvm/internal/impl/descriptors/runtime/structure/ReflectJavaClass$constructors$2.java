package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
final /* synthetic */ class ReflectJavaClass$constructors$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.reflect.Constructor<?>, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor> {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$constructors$2 getHighSpeedVideoFpsRangesFor = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$constructors$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor invoke(java.lang.reflect.Constructor<?> constructor) {
        java.lang.reflect.Constructor<?> constructor2 = constructor;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor2, "");
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor(constructor2);
    }

    ReflectJavaClass$constructors$2() {
        super(1, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);
    }
}
