package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Landroidx/work/impl/utils/NetworkRequest31;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "p0", "", "Camera2StreamConfigurationMap", "(Landroid/net/NetworkRequest;)[I", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class NetworkRequest31 {
    public static final androidx.work.impl.utils.NetworkRequest31 INSTANCE = new androidx.work.impl.utils.NetworkRequest31();

    private NetworkRequest31() {
    }

    public static int[] Camera2StreamConfigurationMap(android.net.NetworkRequest p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        int[] capabilities = p0.getCapabilities();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(capabilities, "");
        return capabilities;
    }

    public static int[] getHighSpeedVideoFpsRangesFor(android.net.NetworkRequest p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        int[] transportTypes = p0.getTransportTypes();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(transportTypes, "");
        return transportTypes;
    }
}
