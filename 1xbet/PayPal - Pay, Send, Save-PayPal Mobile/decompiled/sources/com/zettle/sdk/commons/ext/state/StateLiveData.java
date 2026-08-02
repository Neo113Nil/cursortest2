package com.zettle.sdk.commons.ext.state;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/commons/ext/state/StateLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zettle/sdk/commons/state/StateObserver;", "Lcom/zettle/sdk/commons/state/State;", "p0", "<init>", "(Lcom/zettle/sdk/commons/state/State;)V", "", "onActive", "()V", "onInactive", "onNext", "(Ljava/lang/Object;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/commons/state/State;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class StateLiveData<T> extends androidx.view.MutableLiveData<T> implements com.zettle.sdk.commons.state.StateObserver<T> {
    private final com.zettle.sdk.commons.state.State<T> getHighResolutionOutputSizeshNQ4ISI;

    public StateLiveData(com.zettle.sdk.commons.state.State<T> state) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }

    @Override // com.zettle.sdk.commons.state.StateObserver
    public final void onNext(T p0) {
        setValue(p0);
    }

    @Override // androidx.view.LiveData
    public final void onActive() {
        super.onActive();
        this.getHighResolutionOutputSizeshNQ4ISI.addObserver(this);
    }

    @Override // androidx.view.LiveData
    public final void onInactive() {
        super.onInactive();
        this.getHighResolutionOutputSizeshNQ4ISI.removeObserver(this);
    }
}
