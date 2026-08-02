package kotlin.reflect.jvm;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u0019\u0010\u0004\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/KClass;", "", "getJvmName", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "jvmName"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class KClassesJvm {
    public static final java.lang.String getJvmName(kotlin.reflect.KClass<?> kClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        java.lang.String name2 = ((kotlin.reflect.jvm.internal.KClassImpl) kClass).getJClass().getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return name2;
    }
}
