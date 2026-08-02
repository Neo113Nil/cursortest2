package androidx.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/navigation/NavControllerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/navigation/NavViewModelStoreProvider;", "<init>", "()V", "", "backStackEntryId", "", "clear", "(Ljava/lang/String;)V", "onCleared", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "(Ljava/lang/String;)Landroidx/lifecycle/ViewModelStore;", "toString", "()Ljava/lang/String;", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavControllerViewModel extends androidx.view.ViewModel implements androidx.view.NavViewModelStoreProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.NavControllerViewModel.Companion INSTANCE = new androidx.view.NavControllerViewModel.Companion(null);

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, androidx.view.ViewModelStore> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();

    public final void clear(java.lang.String backStackEntryId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backStackEntryId, "");
        androidx.view.ViewModelStore remove = this.getHighSpeedVideoFpsRanges.remove(backStackEntryId);
        if (remove != null) {
            remove.clear();
        }
    }

    @Override // androidx.view.ViewModel
    public final void onCleared() {
        java.util.Iterator<androidx.view.ViewModelStore> it = this.getHighSpeedVideoFpsRanges.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.getHighSpeedVideoFpsRanges.clear();
    }

    @Override // androidx.view.NavViewModelStoreProvider
    public final androidx.view.ViewModelStore getViewModelStore(java.lang.String backStackEntryId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backStackEntryId, "");
        androidx.view.ViewModelStore viewModelStore = this.getHighSpeedVideoFpsRanges.get(backStackEntryId);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        androidx.view.ViewModelStore viewModelStore2 = new androidx.view.ViewModelStore();
        this.getHighSpeedVideoFpsRanges.put(backStackEntryId, viewModelStore2);
        return viewModelStore2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavControllerViewModel{");
        sb.append(kotlin.text.UStringsKt.m23931toStringV7xB4Y4(kotlin.UInt.m23470constructorimpl(androidx.view.internal.Utils_jvmCommonKt.identityHashCode(this)), 16));
        sb.append("} ViewModelStores (");
        java.util.Iterator<java.lang.String> it = this.getHighSpeedVideoFpsRanges.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/navigation/NavControllerViewModel$Companion;", "", "<init>", "()V", "Landroidx/lifecycle/ViewModelStore;", "viewModelStore", "Landroidx/navigation/NavControllerViewModel;", "getInstance", "(Landroidx/lifecycle/ViewModelStore;)Landroidx/navigation/NavControllerViewModel;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.view.NavControllerViewModel getInstance(androidx.view.ViewModelStore viewModelStore) {
            androidx.lifecycle.ViewModelProvider.Factory factory;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelStore, "");
            androidx.view.ViewModelProvider.Companion companion = androidx.view.ViewModelProvider.INSTANCE;
            factory = androidx.view.NavControllerViewModelKt.getHighSpeedVideoFpsRanges;
            return (androidx.view.NavControllerViewModel) androidx.view.ViewModelProvider.Companion.create$default(companion, viewModelStore, factory, (androidx.view.viewmodel.CreationExtras) null, 4, (java.lang.Object) null).get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.NavControllerViewModel.class));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
