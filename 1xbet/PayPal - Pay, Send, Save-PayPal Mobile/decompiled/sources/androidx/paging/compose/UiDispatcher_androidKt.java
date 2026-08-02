package androidx.paging.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "uiDispatcher", "Lkotlin/coroutines/CoroutineContext;", "getUiDispatcher", "()Lkotlin/coroutines/CoroutineContext;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UiDispatcher_androidKt {
    private static final kotlin.coroutines.CoroutineContext uiDispatcher = androidx.compose.ui.platform.AndroidUiDispatcher.INSTANCE.getMain();

    public static final kotlin.coroutines.CoroutineContext getUiDispatcher() {
        return uiDispatcher;
    }
}
