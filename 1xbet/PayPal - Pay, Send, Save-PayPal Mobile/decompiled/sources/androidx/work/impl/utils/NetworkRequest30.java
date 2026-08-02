package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/impl/utils/NetworkRequest30;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "request", "Landroid/net/NetworkSpecifier;", "getNetworkSpecifier", "(Landroid/net/NetworkRequest;)Landroid/net/NetworkSpecifier;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NetworkRequest30 {
    public static final androidx.work.impl.utils.NetworkRequest30 INSTANCE = new androidx.work.impl.utils.NetworkRequest30();

    private NetworkRequest30() {
    }

    public final android.net.NetworkSpecifier getNetworkSpecifier(android.net.NetworkRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return request.getNetworkSpecifier();
    }
}
