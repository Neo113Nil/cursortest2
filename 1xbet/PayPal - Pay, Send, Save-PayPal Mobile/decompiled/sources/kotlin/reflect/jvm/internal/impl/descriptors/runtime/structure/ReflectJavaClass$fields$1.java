package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

/* loaded from: classes5.dex */
final /* synthetic */ class ReflectJavaClass$fields$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.reflect.Member, java.lang.Boolean> {
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$fields$1 Camera2StreamConfigurationMap = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$fields$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Boolean invoke(java.lang.reflect.Member member) {
        java.lang.reflect.Member member2 = member;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(member2, "");
        return java.lang.Boolean.valueOf(member2.isSynthetic());
    }

    ReflectJavaClass$fields$1() {
        super(1, java.lang.reflect.Member.class, "isSynthetic", "isSynthetic()Z", 0);
    }
}
