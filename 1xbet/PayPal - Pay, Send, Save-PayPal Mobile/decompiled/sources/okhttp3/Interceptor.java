package okhttp3;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0002\u0007\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lokhttp3/Interceptor;", "", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Companion", "Chain"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Interceptor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.Interceptor.Companion INSTANCE = okhttp3.Interceptor.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u0016\u0010\u0010J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000eH&¢\u0006\u0004\b\u0018\u0010\u0010J\u001f\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0019\u0010\u0015À\u0006\u0003"}, d2 = {"Lokhttp3/Interceptor$Chain;", "", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "Lokhttp3/Response;", "proceed", "(Lokhttp3/Request;)Lokhttp3/Response;", "Lokhttp3/Connection;", "connection", "()Lokhttp3/Connection;", "Lokhttp3/Call;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "()Lokhttp3/Call;", "", "connectTimeoutMillis", "()I", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Ljava/util/concurrent/TimeUnit;", "unit", "withConnectTimeout", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/Interceptor$Chain;", "readTimeoutMillis", "withReadTimeout", "writeTimeoutMillis", "withWriteTimeout"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Chain {
        okhttp3.Call call();

        int connectTimeoutMillis();

        okhttp3.Connection connection();

        okhttp3.Response proceed(okhttp3.Request request) throws java.io.IOException;

        int readTimeoutMillis();

        okhttp3.Request request();

        okhttp3.Interceptor.Chain withConnectTimeout(int timeout, java.util.concurrent.TimeUnit unit);

        okhttp3.Interceptor.Chain withReadTimeout(int timeout, java.util.concurrent.TimeUnit unit);

        okhttp3.Interceptor.Chain withWriteTimeout(int timeout, java.util.concurrent.TimeUnit unit);

        int writeTimeoutMillis();
    }

    okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\u000b2#\b\u0004\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0086\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lokhttp3/Interceptor$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lokhttp3/Interceptor$Chain;", "Lkotlin/ParameterName;", "name", "chain", "Lokhttp3/Response;", "block", "Lokhttp3/Interceptor;", "invoke", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/Interceptor;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        static final /* synthetic */ okhttp3.Interceptor.Companion $$INSTANCE = new okhttp3.Interceptor.Companion();

        private Companion() {
        }

        public final okhttp3.Interceptor invoke(final kotlin.jvm.functions.Function1<? super okhttp3.Interceptor.Chain, okhttp3.Response> block) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
            return new okhttp3.Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                public final okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "");
                    return block.invoke(chain);
                }
            };
        }
    }
}
