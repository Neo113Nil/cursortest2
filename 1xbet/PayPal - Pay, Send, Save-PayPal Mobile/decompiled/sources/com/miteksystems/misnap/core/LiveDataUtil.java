package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ/\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\u000eJ)\u0010\u0012\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/miteksystems/misnap/core/LiveDataUtil;", "", "<init>", "()V", "T", "Landroidx/lifecycle/LiveData;", "liveData", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/Observer;", "observer", "", "observeOnce", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/Observer;)V", "Landroidx/lifecycle/MutableLiveData;", "mutableLiveData", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "updateValue", "(Landroidx/lifecycle/MutableLiveData;Ljava/lang/Object;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LiveDataUtil {
    public static final com.miteksystems.misnap.core.LiveDataUtil INSTANCE = new com.miteksystems.misnap.core.LiveDataUtil();

    public final <T> void observeOnce(androidx.view.LiveData<T> liveData, androidx.view.LifecycleOwner lifecycleOwner, androidx.view.Observer<T> observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "");
        liveData.observe(lifecycleOwner, new com.miteksystems.misnap.core.LiveDataUtil.b(observer, liveData));
    }

    public final <T> void observeOnce(androidx.view.LiveData<T> liveData, androidx.view.Observer<T> observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(liveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "");
        liveData.observeForever(new com.miteksystems.misnap.core.LiveDataUtil.a(observer, liveData));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/miteksystems/misnap/core/LiveDataUtil$a;", "Landroidx/lifecycle/Observer;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onChanged", "(Ljava/lang/Object;)V"}, k = 1, mv = {1, 8, 0})
    public static final class a<T> implements androidx.view.Observer<T> {
        final /* synthetic */ androidx.view.LiveData<T> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.view.Observer<T> getHighSpeedVideoSizes;

        @Override // androidx.view.Observer
        public final void onChanged(T value) {
            this.getHighSpeedVideoSizes.onChanged(value);
            this.getHighResolutionOutputSizeshNQ4ISI.removeObserver(this);
        }

        a(androidx.view.Observer<T> observer, androidx.view.LiveData<T> liveData) {
            this.getHighSpeedVideoSizes = observer;
            this.getHighResolutionOutputSizeshNQ4ISI = liveData;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/miteksystems/misnap/core/LiveDataUtil$b;", "Landroidx/lifecycle/Observer;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "onChanged", "(Ljava/lang/Object;)V"}, k = 1, mv = {1, 8, 0})
    public static final class b<T> implements androidx.view.Observer<T> {
        final /* synthetic */ androidx.view.Observer<T> getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.view.LiveData<T> getHighSpeedVideoFpsRangesFor;

        @Override // androidx.view.Observer
        public final void onChanged(T value) {
            this.getHighSpeedVideoFpsRanges.onChanged(value);
            this.getHighSpeedVideoFpsRangesFor.removeObserver(this);
        }

        b(androidx.view.Observer<T> observer, androidx.view.LiveData<T> liveData) {
            this.getHighSpeedVideoFpsRanges = observer;
            this.getHighSpeedVideoFpsRangesFor = liveData;
        }
    }

    public final <T> void updateValue(androidx.view.MutableLiveData<T> mutableLiveData, T newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
        if (android.os.Looper.getMainLooper().isCurrentThread()) {
            mutableLiveData.setValue(newValue);
        } else {
            mutableLiveData.postValue(newValue);
        }
    }

    private LiveDataUtil() {
    }
}
