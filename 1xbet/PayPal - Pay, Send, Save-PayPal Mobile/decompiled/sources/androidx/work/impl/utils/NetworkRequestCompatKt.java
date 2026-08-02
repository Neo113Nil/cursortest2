package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\b\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/net/NetworkRequest;", "", "getTransportTypesCompat", "(Landroid/net/NetworkRequest;)[I", "transportTypesCompat", "getCapabilitiesCompat", "capabilitiesCompat", "getHighSpeedVideoSizes", "[I", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkRequestCompatKt {
    private static final int[] getHighSpeedVideoSizes = {13, 15, 14};

    public static final int[] getTransportTypesCompat(android.net.NetworkRequest networkRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRequest, "");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.work.impl.utils.NetworkRequest31 networkRequest31 = androidx.work.impl.utils.NetworkRequest31.INSTANCE;
            return androidx.work.impl.utils.NetworkRequest31.getHighSpeedVideoFpsRangesFor(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            if (androidx.work.impl.utils.NetworkRequest28.INSTANCE.hasTransport$work_runtime_release(networkRequest, i2)) {
                arrayList.add(java.lang.Integer.valueOf(i2));
            }
        }
        return kotlin.collections.CollectionsKt.toIntArray(arrayList);
    }

    public static final int[] getCapabilitiesCompat(android.net.NetworkRequest networkRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkRequest, "");
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.work.impl.utils.NetworkRequest31 networkRequest31 = androidx.work.impl.utils.NetworkRequest31.INSTANCE;
            return androidx.work.impl.utils.NetworkRequest31.Camera2StreamConfigurationMap(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            if (androidx.work.impl.utils.NetworkRequest28.INSTANCE.hasCapability$work_runtime_release(networkRequest, i2)) {
                arrayList.add(java.lang.Integer.valueOf(i2));
            }
        }
        return kotlin.collections.CollectionsKt.toIntArray(arrayList);
    }
}
