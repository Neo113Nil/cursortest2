package okhttp3;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001$J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00172\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001cH&¢\u0006\u0004\b\u001a\u0010\u001dJ5\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH&¢\u0006\u0004\b\u001a\u0010 J5\u0010\u001a\u001a\u00028\u0000\"\b\b\u0000\u0010\u0017*\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH&¢\u0006\u0004\b\u001a\u0010!J\u000f\u0010\"\u001a\u00020\u0000H&¢\u0006\u0004\b\"\u0010#À\u0006\u0003"}, d2 = {"Lokhttp3/Call;", "", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "Lokhttp3/Callback;", "responseCallback", "", "enqueue", "(Lokhttp3/Callback;)V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "", "isExecuted", "()Z", "isCanceled", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "", "T", "Lkotlin/reflect/KClass;", "type", "tag", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/Function0;", "computeIfAbsent", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "clone", "()Lokhttp3/Call;", "Factory"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Call extends java.lang.Cloneable {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lokhttp3/Call$Factory;", "", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "(Lokhttp3/Request;)Lokhttp3/Call;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        okhttp3.Call newCall(okhttp3.Request request);
    }

    void cancel();

    /* renamed from: clone */
    okhttp3.Call mo10002clone();

    void enqueue(okhttp3.Callback responseCallback);

    okhttp3.Response execute() throws java.io.IOException;

    boolean isCanceled();

    boolean isExecuted();

    okhttp3.Request request();

    <T> T tag(java.lang.Class<? extends T> type);

    <T> T tag(java.lang.Class<T> type, kotlin.jvm.functions.Function0<? extends T> computeIfAbsent);

    <T> T tag(kotlin.reflect.KClass<T> type);

    <T> T tag(kotlin.reflect.KClass<T> type, kotlin.jvm.functions.Function0<? extends T> computeIfAbsent);

    okio.Timeout timeout();
}
