package okhttp3.internal.http2;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017À\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/PushObserver;", "", "", "streamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "", "onRequest", "(ILjava/util/List;)Z", "responseHeaders", "last", "onHeaders", "(ILjava/util/List;Z)Z", "Lokio/BufferedSource;", "source", "byteCount", "onData", "(ILokio/BufferedSource;IZ)Z", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "", "onReset", "(ILokhttp3/internal/http2/ErrorCode;)V", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PushObserver {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.http2.PushObserver.Companion INSTANCE = okhttp3.internal.http2.PushObserver.Companion.$$INSTANCE;
    public static final okhttp3.internal.http2.PushObserver CANCEL = new okhttp3.internal.http2.PushObserver.Companion.PushObserverCancel();

    boolean onData(int streamId, okio.BufferedSource source, int byteCount, boolean last) throws java.io.IOException;

    boolean onHeaders(int streamId, java.util.List<okhttp3.internal.http2.Header> responseHeaders, boolean last);

    boolean onRequest(int streamId, java.util.List<okhttp3.internal.http2.Header> requestHeaders);

    void onReset(int streamId, okhttp3.internal.http2.ErrorCode errorCode);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lokhttp3/internal/http2/PushObserver$Companion;", "", "<init>", "()V", "Lokhttp3/internal/http2/PushObserver;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityActionsConstant.CANCEL, "Lokhttp3/internal/http2/PushObserver;", "PushObserverCancel"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ okhttp3.internal.http2.PushObserver.Companion $$INSTANCE = new okhttp3.internal.http2.PushObserver.Companion();

        private Companion() {
        }

        @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Lokhttp3/internal/http2/PushObserver$Companion$PushObserverCancel;", "Lokhttp3/internal/http2/PushObserver;", "<init>", "()V", "", "p0", "", "Lokhttp3/internal/http2/Header;", "p1", "", "onRequest", "(ILjava/util/List;)Z", "p2", "onHeaders", "(ILjava/util/List;Z)Z", "Lokio/BufferedSource;", "p3", "onData", "(ILokio/BufferedSource;IZ)Z", "Lokhttp3/internal/http2/ErrorCode;", "", "onReset", "(ILokhttp3/internal/http2/ErrorCode;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
        static final class PushObserverCancel implements okhttp3.internal.http2.PushObserver {
            @Override // okhttp3.internal.http2.PushObserver
            public final boolean onData(int p0, okio.BufferedSource p1, int p2, boolean p3) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
                p1.skip(p2);
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public final void onReset(int p0, okhttp3.internal.http2.ErrorCode p1) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            }

            @Override // okhttp3.internal.http2.PushObserver
            public final boolean onRequest(int p0, java.util.List<okhttp3.internal.http2.Header> p1) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
                return true;
            }

            @Override // okhttp3.internal.http2.PushObserver
            public final boolean onHeaders(int p0, java.util.List<okhttp3.internal.http2.Header> p1, boolean p2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
                return true;
            }
        }
    }
}
