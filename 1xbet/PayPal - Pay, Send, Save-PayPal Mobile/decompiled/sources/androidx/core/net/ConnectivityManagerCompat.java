package androidx.core.net;

/* loaded from: classes3.dex */
public final class ConnectivityManagerCompat {
    public static final int RESTRICT_BACKGROUND_STATUS_DISABLED = 1;
    public static final int RESTRICT_BACKGROUND_STATUS_ENABLED = 3;
    public static final int RESTRICT_BACKGROUND_STATUS_WHITELISTED = 2;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RestrictBackgroundStatus {
    }

    @androidx.annotation.ReplaceWith(expression = "cm.isActiveNetworkMetered()")
    @java.lang.Deprecated
    public static boolean isActiveNetworkMetered(android.net.ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }

    public static android.net.NetworkInfo getNetworkInfoFromBroadcast(android.net.ConnectivityManager connectivityManager, android.content.Intent intent) {
        android.net.NetworkInfo networkInfo = (android.net.NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int getRestrictBackgroundStatus(android.net.ConnectivityManager connectivityManager) {
        return androidx.core.net.ConnectivityManagerCompat.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(connectivityManager);
    }

    private ConnectivityManagerCompat() {
    }

    /* loaded from: classes7.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        static int getHighResolutionOutputSizeshNQ4ISI(android.net.ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }
}
