package financial.atomic.muppet.bridge;

@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\u000e\u0010\u000fJB\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u00102)\u0010\u0016\u001a%\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012¢\u0006\u0002\b\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R&\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lfinancial/atomic/muppet/bridge/Bridge;", "T", "", "Lfinancial/atomic/muppet/inter/Page;", "page", "Lfinancial/atomic/muppet/bridge/Store;", com.google.android.libraries.places.api.model.PlaceTypes.STORE, "<init>", "(Lfinancial/atomic/muppet/inter/Page;Lfinancial/atomic/muppet/bridge/Store;)V", "", "method", "Lfinancial/atomic/muppet/bridge/Handler;", "handler", "", "register", "(Ljava/lang/String;Lfinancial/atomic/muppet/bridge/Handler;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)I", "message", "postMessage", "(Ljava/lang/String;)Ljava/lang/String;", "Lfinancial/atomic/muppet/inter/Page;", "getPage", "()Lfinancial/atomic/muppet/inter/Page;", "Lfinancial/atomic/muppet/bridge/Store;", "getStore", "()Lfinancial/atomic/muppet/bridge/Store;", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Bridge<T> {
    private final java.util.Map<java.lang.String, financial.atomic.muppet.bridge.Handler<T>> getHighSpeedVideoFpsRanges;
    private final financial.atomic.muppet.inter.Page<T> page;
    private final financial.atomic.muppet.bridge.Store<T> store;

    /* JADX WARN: Multi-variable type inference failed */
    public Bridge(financial.atomic.muppet.inter.Page<? extends T> page, financial.atomic.muppet.bridge.Store<T> store) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(store, "");
        this.page = page;
        this.store = store;
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
    }

    public static /* synthetic */ int dispatch$default(financial.atomic.muppet.bridge.Bridge bridge, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlinx.coroutines.Dispatchers.getDefault();
        }
        return bridge.dispatch(coroutineContext, function2);
    }

    public final int dispatch(kotlin.coroutines.CoroutineContext context, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> block) {
        kotlinx.coroutines.Deferred<java.lang.String> async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(context), null, null, new financial.atomic.muppet.b.a(block, null), 3, null);
        int hashCode = async$default.hashCode();
        this.store.getDeferrables().put(java.lang.Integer.valueOf(hashCode), async$default);
        return hashCode;
    }

    public final financial.atomic.muppet.inter.Page<T> getPage() {
        return this.page;
    }

    public final financial.atomic.muppet.bridge.Store<T> getStore() {
        return this.store;
    }

    public final java.lang.String postMessage(final java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        companion.getSerializersModule();
        financial.atomic.muppet.bridge.Message message2 = (financial.atomic.muppet.bridge.Message) companion.decodeFromString(financial.atomic.muppet.bridge.Message.INSTANCE.serializer(), message);
        final int handle = message2.getHandle();
        final java.lang.String method = message2.getMethod();
        final kotlinx.serialization.json.JsonArray params = message2.getParams();
        financial.atomic.muppet.g.a aVar = financial.atomic.muppet.g.f6869a;
        new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.bridge.Bridge$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return financial.atomic.muppet.bridge.Bridge.m23215$r8$lambda$14pt91ZVFmuPSjOsdGO2dO04k(message, handle, method, params);
            }
        };
        new kotlin.jvm.functions.Function0() { // from class: financial.atomic.muppet.bridge.Bridge$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return financial.atomic.muppet.bridge.Bridge.$r8$lambda$SYhEuK5kBtZJVAQjLP7SIwrx08g(financial.atomic.muppet.bridge.Bridge.this, method);
            }
        };
        financial.atomic.muppet.bridge.Handler<T> handler = this.getHighSpeedVideoFpsRanges.get(method);
        if (handler != null) {
            return handler.invoke(this, handle, method, params);
        }
        return null;
    }

    public final void register(java.lang.String method, financial.atomic.muppet.bridge.Handler<T> handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        this.getHighSpeedVideoFpsRanges.put(method, handler);
    }

    /* renamed from: $r8$lambda$14pt91ZV-FmuPSjOs-dGO2dO04k, reason: not valid java name */
    public static /* synthetic */ java.lang.String m23215$r8$lambda$14pt91ZVFmuPSjOsdGO2dO04k(java.lang.String str, int i, java.lang.String str2, kotlinx.serialization.json.JsonArray jsonArray) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Bridge.postMessage: ");
        sb.append(str);
        sb.append(" parsed: ");
        sb.append(i);
        sb.append(' ');
        sb.append(str2);
        sb.append(' ');
        sb.append(jsonArray);
        return sb.toString();
    }

    public static /* synthetic */ java.lang.String $r8$lambda$SYhEuK5kBtZJVAQjLP7SIwrx08g(financial.atomic.muppet.bridge.Bridge bridge, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Bridge.postMessage: handler: ");
        sb.append(bridge.getHighSpeedVideoFpsRanges.get(str));
        return sb.toString();
    }
}
