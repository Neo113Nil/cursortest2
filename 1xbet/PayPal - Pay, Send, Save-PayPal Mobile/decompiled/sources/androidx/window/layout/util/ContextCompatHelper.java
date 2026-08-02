package androidx.window.layout.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/window/layout/util/ContextCompatHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "unwrapContext$window_release", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContextCompatHelper {
    public static final androidx.window.layout.util.ContextCompatHelper INSTANCE = new androidx.window.layout.util.ContextCompatHelper();

    private ContextCompatHelper() {
    }

    public final android.content.Context unwrapContext$window_release(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.content.Context context2 = context;
        while (context2 instanceof android.content.ContextWrapper) {
            if (!(context2 instanceof android.app.Activity) && !(context2 instanceof android.inputmethodservice.InputMethodService)) {
                android.content.ContextWrapper contextWrapper = (android.content.ContextWrapper) context2;
                if (contextWrapper.getBaseContext() != null) {
                    context2 = contextWrapper.getBaseContext();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(context2, "");
                }
            }
            return context2;
        }
        return context;
    }
}
