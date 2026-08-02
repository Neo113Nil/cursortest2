package coil3.compose.internal;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ>\u0010 \u001a\u00028\u0000\"\n\b\u0000\u0010\u001b*\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00028\u00002\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00028\u00000\u001dH\u0096\u0001¢\u0006\u0004\b \u0010!J*\u0010#\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\"*\u00020\u001e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0003¢\u0006\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lcoil3/compose/internal/ForwardingCoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "delegate", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "old", "new", "newContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lcoil3/compose/internal/ForwardingCoroutineContext;", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "minusKey", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "context", "plus", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.OPERATION, "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "E", "get", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/coroutines/CoroutineContext;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ForwardingCoroutineContext implements kotlin.coroutines.CoroutineContext {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext Camera2StreamConfigurationMap;

    public abstract coil3.compose.internal.ForwardingCoroutineContext newContext(kotlin.coroutines.CoroutineContext old, kotlin.coroutines.CoroutineContext r2);

    public ForwardingCoroutineContext(kotlin.coroutines.CoroutineContext coroutineContext) {
        this.Camera2StreamConfigurationMap = coroutineContext;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return newContext(this, this.Camera2StreamConfigurationMap.minusKey(key));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext context) {
        return newContext(this, this.Camera2StreamConfigurationMap.plus(context));
    }

    public boolean equals(java.lang.Object other) {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, other);
    }

    public int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public java.lang.String toString() {
        kotlin.coroutines.CoroutineContext coroutineContext = this.Camera2StreamConfigurationMap;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ForwardingCoroutineContext(delegate=");
        sb.append(coroutineContext);
        sb.append(")");
        return sb.toString();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) this.Camera2StreamConfigurationMap.get(key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R initial, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
        return (R) this.Camera2StreamConfigurationMap.fold(initial, operation);
    }
}
