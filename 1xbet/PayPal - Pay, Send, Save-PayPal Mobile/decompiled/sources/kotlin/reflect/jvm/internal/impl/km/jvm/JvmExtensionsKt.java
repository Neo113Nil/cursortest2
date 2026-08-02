package kotlin.reflect.jvm.internal.impl.km.jvm;

/* loaded from: classes5.dex */
public final class JvmExtensionsKt {
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.km.KmAnnotation> getAnnotations(kotlin.reflect.jvm.internal.impl.km.KmType kmType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kmType, "");
        return kotlin.reflect.jvm.internal.impl.km.jvm.internal.JvmExtensionNodesKt.getJvm(kmType).getAnnotations();
    }
}
