package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesVM;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "", "Landroidx/lifecycle/SavedStateHandle;", "handles", "Ljava/util/Map;", "getHandles", "()Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavedStateHandlesVM extends androidx.view.ViewModel {
    private final java.util.Map<java.lang.String, androidx.view.SavedStateHandle> handles = new java.util.LinkedHashMap();

    public final java.util.Map<java.lang.String, androidx.view.SavedStateHandle> getHandles() {
        return this.handles;
    }
}
