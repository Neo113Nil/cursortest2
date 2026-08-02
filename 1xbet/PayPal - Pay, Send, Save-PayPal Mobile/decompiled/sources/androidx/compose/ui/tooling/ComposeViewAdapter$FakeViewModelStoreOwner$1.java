package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/ViewModelStore;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/lifecycle/ViewModelStore;", "getHighSpeedVideoFpsRanges", "viewModelStore", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposeViewAdapter$FakeViewModelStoreOwner$1 implements androidx.view.ViewModelStoreOwner {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.view.ViewModelStore getHighSpeedVideoFpsRanges;
    private final androidx.view.ViewModelStore viewModelStore;

    ComposeViewAdapter$FakeViewModelStoreOwner$1() {
        androidx.view.ViewModelStore viewModelStore = new androidx.view.ViewModelStore();
        this.getHighSpeedVideoFpsRanges = viewModelStore;
        this.viewModelStore = viewModelStore;
    }

    @Override // androidx.view.ViewModelStoreOwner
    public final androidx.view.ViewModelStore getViewModelStore() {
        return this.viewModelStore;
    }
}
