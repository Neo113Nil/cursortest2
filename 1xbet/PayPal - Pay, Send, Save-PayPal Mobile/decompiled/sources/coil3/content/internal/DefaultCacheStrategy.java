package coil3.content.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcoil3/network/internal/DefaultCacheStrategy;", "Lcoil3/network/CacheStrategy;", "<init>", "()V", "Lcoil3/network/NetworkResponse;", "cacheResponse", "Lcoil3/network/NetworkRequest;", "networkRequest", "Lcoil3/request/Options;", "options", "Lcoil3/network/CacheStrategy$ReadResult;", "read", "(Lcoil3/network/NetworkResponse;Lcoil3/network/NetworkRequest;Lcoil3/request/Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkResponse", "Lcoil3/network/CacheStrategy$WriteResult;", "write", "(Lcoil3/network/NetworkResponse;Lcoil3/network/NetworkRequest;Lcoil3/network/NetworkResponse;Lcoil3/request/Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion_"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultCacheStrategy implements coil3.content.CacheStrategy {
    private static final coil3.network.internal.DefaultCacheStrategy.Companion_ Companion_ = new coil3.network.internal.DefaultCacheStrategy.Companion_(null);
    private static final java.util.Set<java.lang.Integer> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Integer[]{300, 301, 404, java.lang.Integer.valueOf(com.datadog.android.internal.network.HttpSpec.StatusCode.METHOD_NOT_ALLOWED), 410, 414, java.lang.Integer.valueOf(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING)});

    @Override // coil3.content.CacheStrategy
    public final java.lang.Object read(coil3.content.NetworkResponse networkResponse, coil3.content.NetworkRequest networkRequest, coil3.view.Options options, kotlin.coroutines.Continuation<? super coil3.network.CacheStrategy.ReadResult> continuation) {
        return new coil3.network.CacheStrategy.ReadResult(networkResponse);
    }

    @Override // coil3.content.CacheStrategy
    public final java.lang.Object write(coil3.content.NetworkResponse networkResponse, coil3.content.NetworkRequest networkRequest, coil3.content.NetworkResponse networkResponse2, coil3.view.Options options, kotlin.coroutines.Continuation<? super coil3.network.CacheStrategy.WriteResult> continuation) {
        coil3.content.NetworkResponse copy;
        if (networkResponse2.getCode() != 304 || networkResponse == null) {
            int code = networkResponse2.getCode();
            if ((200 <= code && code < 300) || getHighSpeedVideoFpsRanges.contains(kotlin.coroutines.jvm.internal.Boxing.boxInt(networkResponse2.getCode()))) {
                return new coil3.network.CacheStrategy.WriteResult(networkResponse2);
            }
            return coil3.network.CacheStrategy.WriteResult.DISABLED;
        }
        copy = networkResponse2.copy((r18 & 1) != 0 ? networkResponse2.code : 0, (r18 & 2) != 0 ? networkResponse2.requestMillis : 0L, (r18 & 4) != 0 ? networkResponse2.responseMillis : 0L, (r18 & 8) != 0 ? networkResponse2.headers : coil3.content.internal.UtilsKt.plus(networkResponse.getHeaders(), networkResponse2.getHeaders()), (r18 & 16) != 0 ? networkResponse2.body : null, (r18 & 32) != 0 ? networkResponse2.delegate : null);
        return new coil3.network.CacheStrategy.WriteResult(copy);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcoil3/network/internal/DefaultCacheStrategy$Companion_;", "", "<init>", "()V", "", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Companion_ {
        private Companion_() {
        }

        public /* synthetic */ Companion_(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
