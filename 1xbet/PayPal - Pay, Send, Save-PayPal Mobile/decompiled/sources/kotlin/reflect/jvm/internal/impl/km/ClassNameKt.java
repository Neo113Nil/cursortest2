package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes17.dex */
public final class ClassNameKt {
    public static final boolean isLocalClassName(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.text.StringsKt.startsWith$default(str, ".", false, 2, (java.lang.Object) null);
    }
}
