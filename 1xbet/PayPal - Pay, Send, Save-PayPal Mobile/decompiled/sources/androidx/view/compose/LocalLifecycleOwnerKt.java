package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0007¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/lifecycle/LifecycleOwner;", "LocalLifecycleOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalLifecycleOwner$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocalLifecycleOwnerKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.view.LifecycleOwner> LocalLifecycleOwner;

    public static /* synthetic */ void getLocalLifecycleOwner$annotations() {
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.view.LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }

    static {
        java.lang.Object m23436constructorimpl;
        androidx.compose.runtime.ProvidableCompositionLocal providableCompositionLocal;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.ClassLoader classLoader = androidx.view.LifecycleOwner.class.getClassLoader();
            kotlin.jvm.internal.Intrinsics.checkNotNull(classLoader);
            java.lang.reflect.Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", new java.lang.Class[0]);
            java.lang.annotation.Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (annotations[i] instanceof kotlin.Deprecated) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    java.lang.Object invoke = method.invoke(null, new java.lang.Object[0]);
                    if (invoke instanceof androidx.compose.runtime.ProvidableCompositionLocal) {
                        providableCompositionLocal = (androidx.compose.runtime.ProvidableCompositionLocal) invoke;
                    }
                }
            }
            providableCompositionLocal = null;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(providableCompositionLocal);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        androidx.compose.runtime.ProvidableCompositionLocal<androidx.view.LifecycleOwner> providableCompositionLocal2 = (androidx.compose.runtime.ProvidableCompositionLocal) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
        if (providableCompositionLocal2 == null) {
            providableCompositionLocal2 = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.lifecycle.compose.LocalLifecycleOwnerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.view.compose.LocalLifecycleOwnerKt.$r8$lambda$4JmQiPovNGZSrm3ZtxKHJ0fk4As();
                }
            });
        }
        LocalLifecycleOwner = providableCompositionLocal2;
    }

    public static /* synthetic */ androidx.view.LifecycleOwner $r8$lambda$4JmQiPovNGZSrm3ZtxKHJ0fk4As() {
        throw new java.lang.IllegalStateException("CompositionLocal LocalLifecycleOwner not present".toString());
    }
}
