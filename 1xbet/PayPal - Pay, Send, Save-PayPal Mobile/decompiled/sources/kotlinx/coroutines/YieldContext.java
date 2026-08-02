package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/YieldContext;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "<init>", "()V", "", "dispatcherWasUnconfined", "Z", "Key"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class YieldContext extends kotlin.coroutines.AbstractCoroutineContextElement {

    /* renamed from: Key, reason: from kotlin metadata */
    public static final kotlinx.coroutines.YieldContext.Companion INSTANCE = new kotlinx.coroutines.YieldContext.Companion(null);
    public boolean dispatcherWasUnconfined;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/YieldContext$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/YieldContext;", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlinx.coroutines.YieldContext$Key, reason: from kotlin metadata */
    public static final class Companion implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.YieldContext> {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public YieldContext() {
        super(INSTANCE);
    }
}
