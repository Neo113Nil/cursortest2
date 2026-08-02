package androidx.view.viewmodel.navigation3;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Landroidx/lifecycle/viewmodel/navigation3/EntryViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "onCleared", "", "", "Landroidx/lifecycle/ViewModelStore;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class EntryViewModel extends androidx.view.ViewModel {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final java.util.Map<java.lang.Object, androidx.view.ViewModelStore> getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        java.util.Iterator<java.util.Map.Entry<java.lang.Object, androidx.view.ViewModelStore>> it = this.getHighResolutionOutputSizeshNQ4ISI.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().clear();
        }
    }
}
