package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0007¢\u0006\f\n\u0004\b\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0006R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/work/impl/utils/NetworkRequestCompat;", "", "wrapped", "<init>", "(Ljava/lang/Object;)V", "component1", "()Ljava/lang/Object;", "copy", "(Ljava/lang/Object;)Landroidx/work/impl/utils/NetworkRequestCompat;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Object;", "getWrapped", "Landroid/net/NetworkRequest;", "getNetworkRequest", "()Landroid/net/NetworkRequest;", "networkRequest", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NetworkRequestCompat {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.utils.NetworkRequestCompat.Companion INSTANCE = new androidx.work.impl.utils.NetworkRequestCompat.Companion(null);
    private static final java.lang.String TAG;
    private final java.lang.Object wrapped;

    public NetworkRequestCompat(java.lang.Object obj) {
        this.wrapped = obj;
    }

    public /* synthetic */ NetworkRequestCompat(java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    public final java.lang.Object getWrapped() {
        return this.wrapped;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\u00070\u0004¢\u0006\u0002\b\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/work/impl/utils/NetworkRequestCompat$Companion;", "", "<init>", "()V", "", "Lorg/jspecify/annotations/NonNull;", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String getTAG() {
            return androidx.work.impl.utils.NetworkRequestCompat.TAG;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("NetworkRequestCompat");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        TAG = tagWithPrefix;
    }

    public final android.net.NetworkRequest getNetworkRequest() {
        return (android.net.NetworkRequest) this.wrapped;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkRequestCompat(wrapped=");
        sb.append(this.wrapped);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Object obj = this.wrapped;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.work.impl.utils.NetworkRequestCompat) && kotlin.jvm.internal.Intrinsics.areEqual(this.wrapped, ((androidx.work.impl.utils.NetworkRequestCompat) other).wrapped);
    }

    public final androidx.work.impl.utils.NetworkRequestCompat copy(java.lang.Object wrapped) {
        return new androidx.work.impl.utils.NetworkRequestCompat(wrapped);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Object getWrapped() {
        return this.wrapped;
    }

    public static /* synthetic */ androidx.work.impl.utils.NetworkRequestCompat copy$default(androidx.work.impl.utils.NetworkRequestCompat networkRequestCompat, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = networkRequestCompat.wrapped;
        }
        return networkRequestCompat.copy(obj);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NetworkRequestCompat() {
        this(r0, 1, r0);
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
    }
}
