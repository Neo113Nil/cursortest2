package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "context", "Lcoil3/network/ConnectivityChecker;", "ConnectivityChecker", "(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: coil3.network.ConnectivityCheckerKt, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0299ConnectivityCheckerKt {
    public static final coil3.content.ConnectivityChecker ConnectivityChecker(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) androidx.core.content.ContextCompat.getSystemService(applicationContext, android.net.ConnectivityManager.class);
        if (connectivityManager == null || !coil3.content.internal.Utils_androidKt.isPermissionGranted(applicationContext, "android.permission.ACCESS_NETWORK_STATE")) {
            return coil3.content.ConnectivityChecker.ONLINE;
        }
        try {
            return new coil3.content.ConnectivityCheckerApi23(connectivityManager);
        } catch (java.lang.Exception unused) {
            return coil3.content.ConnectivityChecker.ONLINE;
        }
    }
}
