package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
final /* synthetic */ class ReflectJavaClass$fields$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.reflect.Field, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField> {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$fields$2 Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$fields$2();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField invoke(java.lang.reflect.Field field) {
        java.lang.reflect.Field field2 = field;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(field2, "");
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField(field2);
    }

    ReflectJavaClass$fields$2() {
        super(1, kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);
    }
}
