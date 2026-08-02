package androidx.camera.view;

/* loaded from: classes6.dex */
final class ForwardingLiveData<T> extends androidx.view.MediatorLiveData<T> {
    private androidx.view.LiveData<T> getHighSpeedVideoSizes;

    ForwardingLiveData() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void getHighResolutionOutputSizeshNQ4ISI(androidx.view.LiveData<T> liveData) {
        androidx.view.LiveData<T> liveData2 = this.getHighSpeedVideoSizes;
        if (liveData2 != null) {
            super.removeSource(liveData2);
        }
        this.getHighSpeedVideoSizes = liveData;
        super.addSource(liveData, new androidx.view.Observer() { // from class: androidx.camera.view.ForwardingLiveData$$ExternalSyntheticLambda0
            @Override // androidx.view.Observer
            public final void onChanged(java.lang.Object obj) {
                androidx.camera.view.ForwardingLiveData.this.setValue(obj);
            }
        });
    }

    @Override // androidx.view.LiveData
    public final T getValue() {
        androidx.view.LiveData<T> liveData = this.getHighSpeedVideoSizes;
        if (liveData == null) {
            return null;
        }
        return liveData.getValue();
    }
}
