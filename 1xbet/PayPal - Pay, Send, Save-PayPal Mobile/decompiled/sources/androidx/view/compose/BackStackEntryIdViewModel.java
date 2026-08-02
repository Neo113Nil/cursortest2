package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/navigation/compose/BackStackEntryIdViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "", "onCleared", "()V", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "id", "getId", "()Ljava/lang/String;", "Landroidx/navigation/compose/internal/WeakReference;", "Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolderRef", "Landroidx/navigation/compose/internal/WeakReference;", "getSaveableStateHolderRef", "()Landroidx/navigation/compose/internal/WeakReference;", "setSaveableStateHolderRef", "(Landroidx/navigation/compose/internal/WeakReference;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BackStackEntryIdViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes = "SaveableStateHolder_BackStackEntryKey";
    private final java.lang.String id;
    public androidx.view.compose.internal.WeakReference<androidx.compose.runtime.saveable.SaveableStateHolder> saveableStateHolderRef;

    public BackStackEntryIdViewModel(androidx.view.SavedStateHandle savedStateHandle) {
        java.lang.String str = (java.lang.String) savedStateHandle.get("SaveableStateHolder_BackStackEntryKey");
        if (str == null) {
            str = androidx.view.compose.internal.NavComposeUtils_androidKt.randomUUID();
            savedStateHandle.set("SaveableStateHolder_BackStackEntryKey", str);
        }
        this.id = str;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final androidx.view.compose.internal.WeakReference<androidx.compose.runtime.saveable.SaveableStateHolder> getSaveableStateHolderRef() {
        androidx.view.compose.internal.WeakReference<androidx.compose.runtime.saveable.SaveableStateHolder> weakReference = this.saveableStateHolderRef;
        if (weakReference != null) {
            return weakReference;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setSaveableStateHolderRef(androidx.view.compose.internal.WeakReference<androidx.compose.runtime.saveable.SaveableStateHolder> weakReference) {
        this.saveableStateHolderRef = weakReference;
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        super.onCleared();
        androidx.compose.runtime.saveable.SaveableStateHolder saveableStateHolder = getSaveableStateHolderRef().get();
        if (saveableStateHolder != null) {
            saveableStateHolder.removeState(this.id);
        }
        getSaveableStateHolderRef().clear();
    }
}
