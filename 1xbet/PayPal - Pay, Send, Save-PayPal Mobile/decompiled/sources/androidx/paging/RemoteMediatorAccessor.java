package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/paging/RemoteMediatorAccessor;", "", "Key", "Value", "Landroidx/paging/RemoteMediatorConnection;", "Landroidx/paging/RemoteMediator$InitializeAction;", "initialize", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/paging/LoadStates;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "state"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RemoteMediatorAccessor<Key, Value> extends androidx.paging.RemoteMediatorConnection<Key, Value> {
    kotlinx.coroutines.flow.StateFlow<androidx.paging.LoadStates> getState();

    java.lang.Object initialize(kotlin.coroutines.Continuation<? super androidx.paging.RemoteMediator.InitializeAction> continuation);
}
