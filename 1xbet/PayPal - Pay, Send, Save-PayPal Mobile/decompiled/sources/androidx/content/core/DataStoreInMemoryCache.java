package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/datastore/core/DataStoreInMemoryCache;", "T", "", "<init>", "()V", "Landroidx/datastore/core/State;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_STATE_KEY, "tryUpdate", "(Landroidx/datastore/core/State;)Landroidx/datastore/core/State;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighResolutionOutputSizeshNQ4ISI", "getCurrentState", "()Landroidx/datastore/core/State;", "currentState", "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DataStoreInMemoryCache<T> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<androidx.content.core.State<T>> getHighResolutionOutputSizeshNQ4ISI;

    public DataStoreInMemoryCache() {
        androidx.content.core.UnInitialized unInitialized = androidx.content.core.UnInitialized.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(unInitialized, "");
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(unInitialized);
    }

    public final androidx.content.core.State<T> getCurrentState() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    public final kotlinx.coroutines.flow.Flow<androidx.content.core.State<T>> getFlow() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r6.getVersion() > ((androidx.content.core.Data) r2).getVersion()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.content.core.State<T> tryUpdate(androidx.content.core.State<T> newState) {
        androidx.content.core.State<T> value;
        androidx.content.core.State<T> state;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newState, "");
        kotlinx.coroutines.flow.MutableStateFlow<androidx.content.core.State<T>> mutableStateFlow = this.getHighResolutionOutputSizeshNQ4ISI;
        do {
            value = mutableStateFlow.getValue();
            state = value;
            if (!(state instanceof androidx.content.core.ReadException) && !kotlin.jvm.internal.Intrinsics.areEqual(state, androidx.content.core.UnInitialized.INSTANCE)) {
                if (!(state instanceof androidx.content.core.Data)) {
                    if (!(state instanceof androidx.content.core.Final)) {
                        if (state instanceof androidx.content.core.NoValueDataState) {
                            throw new java.lang.IllegalStateException(androidx.content.core.DataStoreImpl.BUG_MESSAGE.toString());
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
            }
            state = newState;
        } while (!mutableStateFlow.compareAndSet(value, state));
        return state;
    }
}
