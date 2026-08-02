package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcoil3/network/ConnectivityCheckerApi23;", "Lcoil3/network/ConnectivityChecker;", "Landroid/net/ConnectivityManager;", "p0", "<init>", "(Landroid/net/ConnectivityManager;)V", "", "isOnline", "()Z", "getHighSpeedVideoFpsRangesFor", "Landroid/net/ConnectivityManager;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ConnectivityCheckerApi23 implements coil3.content.ConnectivityChecker {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.net.ConnectivityManager getHighResolutionOutputSizeshNQ4ISI;

    public ConnectivityCheckerApi23(android.net.ConnectivityManager connectivityManager) {
        this.getHighResolutionOutputSizeshNQ4ISI = connectivityManager;
    }

    @Override // coil3.content.ConnectivityChecker
    public final boolean isOnline() {
        android.net.NetworkCapabilities networkCapabilities = this.getHighResolutionOutputSizeshNQ4ISI.getNetworkCapabilities(this.getHighResolutionOutputSizeshNQ4ISI.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
