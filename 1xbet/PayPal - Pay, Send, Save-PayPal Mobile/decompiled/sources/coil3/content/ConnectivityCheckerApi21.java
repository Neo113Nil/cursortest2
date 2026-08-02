package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcoil3/network/ConnectivityCheckerApi21;", "Lcoil3/network/ConnectivityChecker;", "", "isOnline", "()Z", "Landroid/net/ConnectivityManager;", "getHighSpeedVideoFpsRangesFor", "Landroid/net/ConnectivityManager;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ConnectivityCheckerApi21 implements coil3.content.ConnectivityChecker {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.net.ConnectivityManager getHighSpeedVideoFpsRanges;

    @Override // coil3.content.ConnectivityChecker
    public final boolean isOnline() {
        android.net.NetworkInfo activeNetworkInfo = this.getHighSpeedVideoFpsRanges.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }
}
