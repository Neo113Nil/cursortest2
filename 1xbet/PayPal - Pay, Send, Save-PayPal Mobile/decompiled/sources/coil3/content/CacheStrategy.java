package coil3.content;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0011\u000fJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\nJ2\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/network/CacheStrategy;", "", "Lcoil3/network/NetworkResponse;", "cacheResponse", "Lcoil3/network/NetworkRequest;", "networkRequest", "Lcoil3/request/Options;", "options", "Lcoil3/network/CacheStrategy$ReadResult;", "read", "(Lcoil3/network/NetworkResponse;Lcoil3/network/NetworkRequest;Lcoil3/request/Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkResponse", "Lcoil3/network/CacheStrategy$WriteResult;", "write", "(Lcoil3/network/NetworkResponse;Lcoil3/network/NetworkRequest;Lcoil3/network/NetworkResponse;Lcoil3/request/Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ReadResult", "WriteResult"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CacheStrategy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil3.content.CacheStrategy.Companion INSTANCE = coil3.content.CacheStrategy.Companion.getHighSpeedVideoFpsRangesFor;
    public static final coil3.content.CacheStrategy DEFAULT = new coil3.content.internal.DefaultCacheStrategy();

    java.lang.Object read(coil3.content.NetworkResponse networkResponse, coil3.content.NetworkRequest networkRequest, coil3.view.Options options, kotlin.coroutines.Continuation<? super coil3.network.CacheStrategy.ReadResult> continuation);

    java.lang.Object write(coil3.content.NetworkResponse networkResponse, coil3.content.NetworkRequest networkRequest, coil3.content.NetworkResponse networkResponse2, coil3.view.Options options, kotlin.coroutines.Continuation<? super coil3.network.CacheStrategy.WriteResult> continuation);

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcoil3/network/CacheStrategy$ReadResult;", "", "Lcoil3/network/NetworkRequest;", "request", "<init>", "(Lcoil3/network/NetworkRequest;)V", "Lcoil3/network/NetworkResponse;", "response", "(Lcoil3/network/NetworkResponse;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcoil3/network/NetworkRequest;", "getRequest", "()Lcoil3/network/NetworkRequest;", "Lcoil3/network/NetworkResponse;", "getResponse", "()Lcoil3/network/NetworkResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReadResult {
        private final coil3.content.NetworkRequest request;
        private final coil3.content.NetworkResponse response;

        public final coil3.content.NetworkRequest getRequest() {
            return this.request;
        }

        public final coil3.content.NetworkResponse getResponse() {
            return this.response;
        }

        public ReadResult(coil3.content.NetworkRequest networkRequest) {
            this.request = networkRequest;
            this.response = null;
        }

        public ReadResult(coil3.content.NetworkResponse networkResponse) {
            this.request = null;
            this.response = networkResponse;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof coil3.network.CacheStrategy.ReadResult)) {
                return false;
            }
            coil3.network.CacheStrategy.ReadResult readResult = (coil3.network.CacheStrategy.ReadResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.request, readResult.request) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, readResult.response);
        }

        public final int hashCode() {
            coil3.content.NetworkRequest networkRequest = this.request;
            int hashCode = networkRequest != null ? networkRequest.hashCode() : 0;
            coil3.content.NetworkResponse networkResponse = this.response;
            return (hashCode * 31) + (networkResponse != null ? networkResponse.hashCode() : 0);
        }

        public final java.lang.String toString() {
            coil3.content.NetworkRequest networkRequest = this.request;
            coil3.content.NetworkResponse networkResponse = this.response;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadResult(request=");
            sb.append(networkRequest);
            sb.append(", response=");
            sb.append(networkResponse);
            sb.append(")");
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0012¢\u0006\u0004\b\u0004\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcoil3/network/CacheStrategy$WriteResult;", "", "Lcoil3/network/NetworkResponse;", "response", "<init>", "(Lcoil3/network/NetworkResponse;)V", "()V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcoil3/network/NetworkResponse;", "getResponse", "()Lcoil3/network/NetworkResponse;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WriteResult {
        public static final coil3.network.CacheStrategy.WriteResult DISABLED = new coil3.network.CacheStrategy.WriteResult();
        private final coil3.content.NetworkResponse response;

        public final coil3.content.NetworkResponse getResponse() {
            return this.response;
        }

        public WriteResult(coil3.content.NetworkResponse networkResponse) {
            this.response = networkResponse;
        }

        private WriteResult() {
            this.response = null;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof coil3.network.CacheStrategy.WriteResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, ((coil3.network.CacheStrategy.WriteResult) other).response);
        }

        public final int hashCode() {
            coil3.content.NetworkResponse networkResponse = this.response;
            if (networkResponse != null) {
                return networkResponse.hashCode();
            }
            return 0;
        }

        public final java.lang.String toString() {
            coil3.content.NetworkResponse networkResponse = this.response;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("WriteResult(response=");
            sb.append(networkResponse);
            sb.append(")");
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lcoil3/network/CacheStrategy$Companion;", "", "<init>", "()V", "Lcoil3/network/CacheStrategy;", "DEFAULT", "Lcoil3/network/CacheStrategy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ coil3.content.CacheStrategy.Companion getHighSpeedVideoFpsRangesFor = new coil3.content.CacheStrategy.Companion();

        private Companion() {
        }
    }
}
