package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\" \u0010\u0004\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/KClass;", "", "getCanonicalName", "(Lkotlin/reflect/KClass;)Ljava/lang/String;", "canonicalName"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CanonicalName_jvmKt {
    public static final java.lang.String getCanonicalName(kotlin.reflect.KClass<?> kClass) {
        if (kClass != null) {
            return kClass.getQualifiedName();
        }
        return null;
    }
}
