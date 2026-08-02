package coil3.content.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "assertNotOnMainThread", "()V", "Landroid/content/Context;", "", com.paypal.oslo.feature.cashin.api.analytics.CashInAnalytics.LocationPermissionScreen.FEATURE, "", "isPermissionGranted", "(Landroid/content/Context;Ljava/lang/String;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Utils_androidKt {
    public static final void assertNotOnMainThread() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new android.os.NetworkOnMainThreadException();
        }
    }

    public static final boolean isPermissionGranted(android.content.Context context, java.lang.String str) {
        return androidx.core.content.ContextCompat.checkSelfPermission(context, str) == 0;
    }
}
