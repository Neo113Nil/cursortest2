package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/work/impl/utils/NetworkRequest28;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "request", "", "capability", "", "hasCapability$work_runtime_release", "(Landroid/net/NetworkRequest;I)Z", androidx.core.app.NotificationCompat.CATEGORY_TRANSPORT, "hasTransport$work_runtime_release", "", "capabilities", "transports", "createNetworkRequest", "([I[I)Landroid/net/NetworkRequest;", "Landroidx/work/impl/utils/NetworkRequestCompat;", "createNetworkRequestCompat$work_runtime_release", "([I[I)Landroidx/work/impl/utils/NetworkRequestCompat;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkRequest28 {
    public static final androidx.work.impl.utils.NetworkRequest28 INSTANCE = new androidx.work.impl.utils.NetworkRequest28();

    private NetworkRequest28() {
    }

    public final boolean hasCapability$work_runtime_release(android.net.NetworkRequest request, int capability) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return request.hasCapability(capability);
    }

    public final boolean hasTransport$work_runtime_release(android.net.NetworkRequest request, int transport) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return request.hasTransport(transport);
    }

    @kotlin.jvm.JvmStatic
    public static final android.net.NetworkRequest createNetworkRequest(int[] capabilities, int[] transports) {
        int[] iArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capabilities, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transports, "");
        android.net.NetworkRequest.Builder builder = new android.net.NetworkRequest.Builder();
        for (int i : capabilities) {
            try {
                builder.addCapability(i);
            } catch (java.lang.IllegalArgumentException e) {
                androidx.work.Logger logger = androidx.work.Logger.get();
                java.lang.String tag = androidx.work.impl.utils.NetworkRequestCompat.INSTANCE.getTAG();
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Ignoring adding capability '");
                sb.append(i);
                sb.append('\'');
                logger.warning(tag, sb.toString(), e);
            }
        }
        iArr = androidx.work.impl.utils.NetworkRequestCompatKt.getHighSpeedVideoSizes;
        for (int i2 : iArr) {
            if (!kotlin.collections.ArraysKt.contains(capabilities, i2)) {
                try {
                    builder.removeCapability(i2);
                } catch (java.lang.IllegalArgumentException e2) {
                    androidx.work.Logger logger2 = androidx.work.Logger.get();
                    java.lang.String tag2 = androidx.work.impl.utils.NetworkRequestCompat.INSTANCE.getTAG();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Ignoring removing default capability '");
                    sb2.append(i2);
                    sb2.append('\'');
                    logger2.warning(tag2, sb2.toString(), e2);
                }
            }
        }
        for (int i3 : transports) {
            builder.addTransportType(i3);
        }
        android.net.NetworkRequest build = builder.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    public final androidx.work.impl.utils.NetworkRequestCompat createNetworkRequestCompat$work_runtime_release(int[] capabilities, int[] transports) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capabilities, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transports, "");
        return new androidx.work.impl.utils.NetworkRequestCompat(createNetworkRequest(capabilities, transports));
    }
}
