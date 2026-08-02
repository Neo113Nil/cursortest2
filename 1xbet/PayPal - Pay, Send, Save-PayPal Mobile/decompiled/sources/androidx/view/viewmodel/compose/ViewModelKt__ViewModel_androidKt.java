package androidx.view.viewmodel.compose;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0087\b¢\u0006\u0002\u0010\t\u001aG\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\f\u001aQ\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00010\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"viewModel", "VM", "Landroidx/lifecycle/ViewModel;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "key", "", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel-compose"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/lifecycle/viewmodel/compose/ViewModelKt")
/* loaded from: classes.dex */
final /* synthetic */ class ViewModelKt__ViewModel_androidKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    public static final /* synthetic */ <VM extends androidx.view.ViewModel> VM viewModel(androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0 && (viewModelStoreOwner = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.view.ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        java.lang.String str2 = (i2 & 2) != 0 ? null : str;
        androidx.lifecycle.ViewModelProvider.Factory factory2 = (i2 & 4) != 0 ? null : factory;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class), viewModelStoreOwner2, str2, factory2, (androidx.view.viewmodel.CreationExtras) null, composer, (i << 3) & 8176, 16);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    public static final /* synthetic */ androidx.view.ViewModel viewModel(java.lang.Class cls, androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0 && (viewModelStoreOwner = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.view.ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        java.lang.String str2 = (i2 & 4) != 0 ? null : str;
        androidx.lifecycle.ViewModelProvider.Factory factory2 = (i2 & 8) != 0 ? null : factory;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1252471378, i, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:80)");
        }
        androidx.view.ViewModel viewModel = androidx.view.viewmodel.compose.ViewModelKt__ViewModelKt.get$default(viewModelStoreOwner2, kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls), str2, factory2, null, 8, null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return viewModel;
    }

    public static final <VM extends androidx.view.ViewModel> VM viewModel(java.lang.Class<VM> cls, androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 2) != 0 && (viewModelStoreOwner = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            factory = null;
        }
        if ((i2 & 16) != 0) {
            if (viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                creationExtras = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1566358618, i, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:118)");
        }
        VM vm = (VM) androidx.view.viewmodel.compose.ViewModelKt.get(viewModelStoreOwner, kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls), str, factory, creationExtras);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return vm;
    }
}
