package kotlinx.coroutines.slf4j;

/* compiled from: MDCContext.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u00040\u00012\u00020\u0005:\u0001\u0012B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u00042\u0006\u0010\f\u001a\u00020\rH\u0016J*\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004H\u0016J\"\u0010\u0011\u001a\u00020\u000f2\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004H\u0002R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/slf4j/MDCContext;", "Lkotlinx/coroutines/ThreadContextElement;", "", "", "Lkotlinx/coroutines/slf4j/MDCContextMap;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "contextMap", "<init>", "(Ljava/util/Map;)V", "getContextMap", "()Ljava/util/Map;", "updateThreadContext", "context", "Lkotlin/coroutines/CoroutineContext;", "restoreThreadContext", "", "oldState", "setCurrent", "Key", "kotlinx-coroutines-slf4j"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MDCContext extends kotlin.coroutines.AbstractCoroutineContextElement implements kotlinx.coroutines.ThreadContextElement<java.util.Map<java.lang.String, ? extends java.lang.String>> {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final kotlinx.coroutines.slf4j.MDCContext.Companion INSTANCE = new kotlinx.coroutines.slf4j.MDCContext.Companion(null);
    private final java.util.Map<java.lang.String, java.lang.String> contextMap;

    /* JADX WARN: Multi-variable type inference failed */
    public MDCContext() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public /* bridge */ /* synthetic */ void restoreThreadContext(kotlin.coroutines.CoroutineContext coroutineContext, java.util.Map<java.lang.String, ? extends java.lang.String> map) {
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

    /* compiled from: MDCContext.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/slf4j/MDCContext$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/slf4j/MDCContext;", "<init>", "()V", "kotlinx-coroutines-slf4j"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.slf4j.MDCContext$Key, reason: from kotlin metadata */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.slf4j.MDCContext> {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public java.util.Map<java.lang.String, ? extends java.lang.String> updateThreadContext(kotlin.coroutines.CoroutineContext context) {
        java.util.Map<java.lang.String, java.lang.String> copyOfContextMap = org.slf4j.MDC.getCopyOfContextMap();
        setCurrent(this.contextMap);
        return copyOfContextMap;
    }

    /* renamed from: restoreThreadContext, reason: avoid collision after fix types in other method */
    public void restoreThreadContext2(kotlin.coroutines.CoroutineContext context, java.util.Map<java.lang.String, java.lang.String> oldState) {
        setCurrent(oldState);
    }

    private final void setCurrent(java.util.Map<java.lang.String, java.lang.String> contextMap) {
        if (contextMap == null) {
            org.slf4j.MDC.clear();
        } else {
            org.slf4j.MDC.setContextMap(contextMap);
        }
    }
}
