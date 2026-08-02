package androidx.paging;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n\u001a;\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\r\"A\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002\"\b\b\u0000\u0010\u000e*\u00020\u0000\"\b\b\u0001\u0010\u000f*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"", "T", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagingData;", "Landroidx/lifecycle/Lifecycle;", com.paypal.oslo.core.telemetry.AppLifecycleConstants.FEATURE, "cachedIn", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/ViewModel;", "viewModel", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/ViewModel;)Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "(Landroidx/lifecycle/LiveData;Lkotlinx/coroutines/CoroutineScope;)Landroidx/lifecycle/LiveData;", "Key", "Value", "Landroidx/paging/Pager;", "getLiveData", "(Landroidx/paging/Pager;)Landroidx/lifecycle/LiveData;", "liveData"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PagingLiveData {
    public static final <Key, Value> androidx.view.LiveData<androidx.paging.PagingData<Value>> getLiveData(androidx.paging.Pager<Key, Value> pager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pager, "");
        return androidx.view.FlowLiveDataConversions.asLiveData$default(pager.getFlow(), (kotlin.coroutines.CoroutineContext) null, 0L, 3, (java.lang.Object) null);
    }

    public static final <T> androidx.view.LiveData<androidx.paging.PagingData<T>> cachedIn(androidx.view.LiveData<androidx.paging.PagingData<T>> liveData, androidx.view.Lifecycle lifecycle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycle, "");
        return androidx.view.FlowLiveDataConversions.asLiveData$default(androidx.paging.CachedPagingDataKt.cachedIn(androidx.view.FlowLiveDataConversions.asFlow(liveData), androidx.view.LifecycleKt.getCoroutineScope(lifecycle)), (kotlin.coroutines.CoroutineContext) null, 0L, 3, (java.lang.Object) null);
    }

    public static final <T> androidx.view.LiveData<androidx.paging.PagingData<T>> cachedIn(androidx.view.LiveData<androidx.paging.PagingData<T>> liveData, androidx.view.ViewModel viewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "");
        return androidx.view.FlowLiveDataConversions.asLiveData$default(androidx.paging.CachedPagingDataKt.cachedIn(androidx.view.FlowLiveDataConversions.asFlow(liveData), androidx.view.ViewModelKt.getViewModelScope(viewModel)), (kotlin.coroutines.CoroutineContext) null, 0L, 3, (java.lang.Object) null);
    }

    public static final <T> androidx.view.LiveData<androidx.paging.PagingData<T>> cachedIn(androidx.view.LiveData<androidx.paging.PagingData<T>> liveData, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        return androidx.view.FlowLiveDataConversions.asLiveData$default(androidx.paging.CachedPagingDataKt.cachedIn(androidx.view.FlowLiveDataConversions.asFlow(liveData), coroutineScope), (kotlin.coroutines.CoroutineContext) null, 0L, 3, (java.lang.Object) null);
    }
}
