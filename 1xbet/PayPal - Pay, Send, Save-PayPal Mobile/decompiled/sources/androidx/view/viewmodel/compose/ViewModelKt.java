package androidx.view.viewmodel.compose;

@kotlin.Metadata(d1 = {"androidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt", "androidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModel_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewModelKt {
    public static final <VM extends androidx.view.ViewModel> VM get(androidx.view.ViewModelStoreOwner viewModelStoreOwner, kotlin.reflect.KClass<VM> kClass, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras) {
        return (VM) androidx.view.viewmodel.compose.ViewModelKt__ViewModelKt.get(viewModelStoreOwner, kClass, str, factory, creationExtras);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    public static final /* synthetic */ <VM extends androidx.view.ViewModel> VM viewModel(androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.compose.runtime.Composer composer, int i, int i2) {
        return (VM) androidx.view.viewmodel.compose.ViewModelKt__ViewModel_androidKt.viewModel(viewModelStoreOwner, str, factory, composer, i, i2);
    }

    public static final /* synthetic */ <VM extends androidx.view.ViewModel> VM viewModel(androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras, androidx.compose.runtime.Composer composer, int i, int i2) {
        return (VM) androidx.view.viewmodel.compose.ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, factory, creationExtras, composer, i, i2);
    }

    public static final /* synthetic */ <VM extends androidx.view.ViewModel> VM viewModel(androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.view.viewmodel.CreationExtras, ? extends VM> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        return (VM) androidx.view.viewmodel.compose.ViewModelKt__ViewModelKt.viewModel(viewModelStoreOwner, str, function1, composer, i, i2);
    }

    public static final <VM extends androidx.view.ViewModel> VM viewModel(java.lang.Class<VM> cls, androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras, androidx.compose.runtime.Composer composer, int i, int i2) {
        return (VM) androidx.view.viewmodel.compose.ViewModelKt__ViewModel_androidKt.viewModel(cls, viewModelStoreOwner, str, factory, creationExtras, composer, i, i2);
    }

    public static final <VM extends androidx.view.ViewModel> VM viewModel(kotlin.reflect.KClass<VM> kClass, androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras, androidx.compose.runtime.Composer composer, int i, int i2) {
        return (VM) androidx.view.viewmodel.compose.ViewModelKt__ViewModelKt.viewModel(kClass, viewModelStoreOwner, str, factory, creationExtras, composer, i, i2);
    }
}
