package androidx.hilt.navigation.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0087\b¢\u0006\u0002\u0010\u0007\u001aN\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002\"\u0006\b\u0001\u0010\b\u0018\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0014\b\b\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00010\nH\u0087\b¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"hiltViewModel", "VM", "Landroidx/lifecycle/ViewModel;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "key", "", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "VMF", "creationCallback", "Lkotlin/Function1;", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "createHiltViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;", "hilt-navigation-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HiltViewModelKt {
    @kotlin.Deprecated(message = "Moved to package: androidx.hilt.lifecycle.viewmodel.compose", replaceWith = @kotlin.ReplaceWith(expression = "hiltViewModel(viewModelStoreOwner, key)", imports = {"androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel"}))
    public static final /* synthetic */ <VM extends androidx.view.ViewModel> VM hiltViewModel(androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        if ((i2 & 1) != 0 && (viewModelStoreOwner = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable)) == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.view.ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i2 & 2) != 0) {
            str = null;
        }
        java.lang.String str2 = str;
        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner2, composer, i & 14);
        if (viewModelStoreOwner2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            empty = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras();
        } else {
            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class), viewModelStoreOwner2, str2, createHiltViewModelFactory, empty, composer, ((i & 126) << 3) & 1008, 0);
    }

    @kotlin.Deprecated(message = "Moved to package: androidx.hilt.lifecycle.viewmodel.compose", replaceWith = @kotlin.ReplaceWith(expression = "hiltViewModel(viewModelStoreOwner, key, creationCallback)", imports = {"androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel"}))
    public static final /* synthetic */ <VM extends androidx.view.ViewModel, VMF> VM hiltViewModel(androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, kotlin.jvm.functions.Function1<? super VMF, ? extends VM> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.view.viewmodel.CreationExtras withCreationCallback;
        if ((i2 & 1) != 0 && (viewModelStoreOwner = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable)) == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.view.ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i2 & 2) != 0) {
            str = null;
        }
        java.lang.String str2 = str;
        androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(viewModelStoreOwner2, composer, i & 14);
        if (viewModelStoreOwner2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras(), function1);
        } else {
            withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class), viewModelStoreOwner2, str2, createHiltViewModelFactory, withCreationCallback, composer, ((i & 126) << 3) & 1008, 0);
    }

    public static final androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory(androidx.view.ViewModelStoreOwner viewModelStoreOwner, androidx.compose.runtime.Composer composer, int i) {
        androidx.lifecycle.ViewModelProvider.Factory factory;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1770922558, i, -1, "androidx.hilt.navigation.compose.createHiltViewModelFactory (HiltViewModel.kt:92)");
        }
        if (viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            composer.startReplaceGroup(-1824123978);
            factory = androidx.hilt.lifecycle.viewmodel.HiltViewModelFactory.create((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory());
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1823945480);
            composer.endReplaceGroup();
            factory = null;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return factory;
    }
}
