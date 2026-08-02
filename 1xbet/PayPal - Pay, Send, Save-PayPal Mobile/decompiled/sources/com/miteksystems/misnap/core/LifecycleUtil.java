package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/miteksystems/misnap/core/LifecycleUtil;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "(Landroid/content/Context;)Landroidx/lifecycle/LifecycleOwner;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LifecycleUtil {
    public static final com.miteksystems.misnap.core.LifecycleUtil INSTANCE = new com.miteksystems.misnap.core.LifecycleUtil();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public final androidx.view.LifecycleOwner getLifecycleOwner(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        while (context != 0 && !(context instanceof androidx.view.LifecycleOwner)) {
            android.content.ContextWrapper contextWrapper = context instanceof android.content.ContextWrapper ? context : null;
            android.content.Context baseContext = contextWrapper != null ? contextWrapper.getBaseContext() : null;
            context = kotlin.jvm.internal.Intrinsics.areEqual(baseContext, context) ? 0 : baseContext;
        }
        if (context instanceof androidx.view.LifecycleOwner) {
            return (androidx.view.LifecycleOwner) context;
        }
        return null;
    }

    private LifecycleUtil() {
    }
}
