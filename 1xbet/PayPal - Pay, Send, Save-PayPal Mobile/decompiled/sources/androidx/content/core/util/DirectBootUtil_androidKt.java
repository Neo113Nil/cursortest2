package androidx.content.core.util;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Context;", "requireDeviceProtectedStorageContext", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DirectBootUtil_androidKt {
    public static final android.content.Context requireDeviceProtectedStorageContext(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (context.isDeviceProtectedStorage()) {
            return context;
        }
        android.content.Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(createDeviceProtectedStorageContext);
        return createDeviceProtectedStorageContext;
    }
}
