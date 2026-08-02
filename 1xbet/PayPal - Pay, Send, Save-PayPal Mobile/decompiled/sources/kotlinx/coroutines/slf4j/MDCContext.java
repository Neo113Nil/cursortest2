package kotlinx.coroutines.slf4j;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00040\u00012\u00020\u0005:\u0001\u0014B%\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R+\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lkotlinx/coroutines/slf4j/MDCContext;", "Lkotlinx/coroutines/ThreadContextElement;", "", "", "Lkotlinx/coroutines/slf4j/MDCContextMap;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "contextMap", "<init>", "(Ljava/util/Map;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "updateThreadContext", "(Lkotlin/coroutines/CoroutineContext;)Ljava/util/Map;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.OLD_STATE_KEY, "", "restoreThreadContext", "(Lkotlin/coroutines/CoroutineContext;Ljava/util/Map;)V", "Ljava/util/Map;", "getContextMap", "()Ljava/util/Map;", "Key"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MDCContext extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.ThreadContextElement<java.util.Map<java.lang.String, ? extends java.lang.String>> {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final kotlinx.coroutines.slf4j.MDCContext.Companion INSTANCE = new kotlinx.coroutines.slf4j.MDCContext.Companion(null);
    private final java.util.Map<java.lang.String, java.lang.String> contextMap;

    @Override // kotlinx.coroutines.ThreadContextElement
    public final /* bridge */ /* synthetic */ void restoreThreadContext(kotlin.coroutines.CoroutineContext coroutineContext, java.util.Map<java.lang.String, ? extends java.lang.String> map) {
        restoreThreadContext2(coroutineContext, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public final java.util.Map<java.lang.String, java.lang.String> getContextMap() {
        return this.contextMap;
    }

    public /* synthetic */ MDCContext(java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? org.slf4j.MDC.getCopyOfContextMap() : map);
    }

    public MDCContext(java.util.Map<java.lang.String, java.lang.String> map) {
        super(INSTANCE);
        this.contextMap = map;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/slf4j/MDCContext$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/slf4j/MDCContext;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.slf4j.MDCContext$Key, reason: from kotlin metadata */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.slf4j.MDCContext> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public final java.util.Map<java.lang.String, ? extends java.lang.String> updateThreadContext(kotlin.coroutines.CoroutineContext context) {
        java.util.Map<java.lang.String, java.lang.String> copyOfContextMap = org.slf4j.MDC.getCopyOfContextMap();
        java.util.Map<java.lang.String, java.lang.String> map = this.contextMap;
        if (map == null) {
            org.slf4j.MDC.clear();
        } else {
            org.slf4j.MDC.setContextMap(map);
        }
        return copyOfContextMap;
    }

    /* renamed from: restoreThreadContext, reason: avoid collision after fix types in other method */
    public final void restoreThreadContext2(kotlin.coroutines.CoroutineContext context, java.util.Map<java.lang.String, java.lang.String> oldState) {
        if (oldState == null) {
            org.slf4j.MDC.clear();
        } else {
            org.slf4j.MDC.setContextMap(oldState);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MDCContext() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
