package androidx.view;

/* JADX INFO: Add missing generic type declarations: [X] */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/lifecycle/Transformations$switchMap$2;", "Landroidx/lifecycle/Observer;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onChanged", "(Ljava/lang/Object;)V", "Landroidx/lifecycle/LiveData;", "liveData", "Landroidx/lifecycle/LiveData;", "getLiveData", "()Landroidx/lifecycle/LiveData;", "setLiveData", "(Landroidx/lifecycle/LiveData;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Transformations$switchMap$2<X> implements androidx.view.Observer<X> {
    final /* synthetic */ androidx.arch.core.util.Function<X, androidx.view.LiveData<Y>> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.MediatorLiveData<Y> getHighSpeedVideoFpsRangesFor;
    private androidx.view.LiveData<Y> liveData;

    Transformations$switchMap$2(androidx.arch.core.util.Function<X, androidx.view.LiveData<Y>> function, androidx.view.MediatorLiveData<Y> mediatorLiveData) {
        this.Camera2StreamConfigurationMap = function;
        this.getHighSpeedVideoFpsRangesFor = mediatorLiveData;
    }

    public final androidx.view.LiveData<Y> getLiveData() {
        return this.liveData;
    }

    public final void setLiveData(androidx.view.LiveData<Y> liveData) {
        this.liveData = liveData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.Observer
    public final void onChanged(X value) {
        androidx.view.LiveData<Y> liveData = (androidx.view.LiveData) this.Camera2StreamConfigurationMap.apply(value);
        java.lang.Object obj = this.liveData;
        if (obj != liveData) {
            if (obj != null) {
                androidx.view.MediatorLiveData<Y> mediatorLiveData = this.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
                mediatorLiveData.removeSource(obj);
            }
            this.liveData = liveData;
            if (liveData != 0) {
                androidx.view.MediatorLiveData<Y> mediatorLiveData2 = this.getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(liveData);
                final androidx.view.MediatorLiveData<Y> mediatorLiveData3 = this.getHighSpeedVideoFpsRangesFor;
                mediatorLiveData2.addSource(liveData, new androidx.view.Transformations$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.Transformations$switchMap$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return androidx.view.Transformations$switchMap$2.$r8$lambda$N3NHLfwNgWTz1sDLgY8ifetXAT8(androidx.view.MediatorLiveData.this, obj2);
                    }
                }));
            }
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N3NHLfwNgWTz1sDLgY8ifetXAT8(androidx.view.MediatorLiveData mediatorLiveData, java.lang.Object obj) {
        mediatorLiveData.setValue(obj);
        return kotlin.Unit.INSTANCE;
    }
}
