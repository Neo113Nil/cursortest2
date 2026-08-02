package okhttp3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004À\u0006\u0003"}, d2 = {"Lokhttp3/TrailersSource;", "", "Lokhttp3/Headers;", "peek", "()Lokhttp3/Headers;", "get", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TrailersSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.TrailersSource.Companion INSTANCE = okhttp3.TrailersSource.Companion.$$INSTANCE;
    public static final okhttp3.TrailersSource EMPTY = new okhttp3.TrailersSource() { // from class: okhttp3.TrailersSource$Companion$EMPTY$1
        @Override // okhttp3.TrailersSource
        public final okhttp3.Headers peek() {
            return okhttp3.Headers.EMPTY;
        }

        @Override // okhttp3.TrailersSource
        public final okhttp3.Headers get() {
            return okhttp3.Headers.EMPTY;
        }
    };

    okhttp3.Headers get() throws java.io.IOException;

    default okhttp3.Headers peek() throws java.io.IOException {
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static okhttp3.Headers peek(okhttp3.TrailersSource trailersSource) throws java.io.IOException {
            return okhttp3.TrailersSource.super.peek();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lokhttp3/TrailersSource$Companion;", "", "<init>", "()V", "Lokhttp3/TrailersSource;", "EMPTY", "Lokhttp3/TrailersSource;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ okhttp3.TrailersSource.Companion $$INSTANCE = new okhttp3.TrailersSource.Companion();

        private Companion() {
        }
    }
}
