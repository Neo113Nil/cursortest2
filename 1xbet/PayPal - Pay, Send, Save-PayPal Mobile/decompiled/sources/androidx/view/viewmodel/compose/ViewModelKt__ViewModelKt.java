package androidx.view.viewmodel.compose;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aF\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b¢\u0006\u0002\u0010\u000b\u001aQ\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000e\u001aK\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0019\b\b\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00010\u0010¢\u0006\u0002\b\u0011H\u0087\b¢\u0006\u0002\u0010\u0012\u001aK\u0010\u0013\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00010\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"viewModel", "VM", "Landroidx/lifecycle/ViewModel;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "key", "", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "modelClass", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "initializer", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;", "get", "(Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/reflect/KClass;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel-compose"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/lifecycle/viewmodel/compose/ViewModelKt")
/* loaded from: classes.dex */
final /* synthetic */ class ViewModelKt__ViewModelKt {
    public static final /* synthetic */ <VM extends androidx.view.ViewModel> VM viewModel(androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        if ((i2 & 1) != 0 && (viewModelStoreOwner = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.view.ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        java.lang.String str2 = (i2 & 2) != 0 ? null : str;
        androidx.lifecycle.ViewModelProvider.Factory factory2 = (i2 & 4) != 0 ? null : factory;
        if ((i2 & 8) != 0) {
            if (viewModelStoreOwner2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                empty = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras();
            } else {
                empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
            creationExtras = empty;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class), viewModelStoreOwner2, str2, factory2, creationExtras, composer, (i << 3) & 65520, 0);
    }

    public static final <VM extends androidx.view.ViewModel> VM viewModel(kotlin.reflect.KClass<VM> kClass, androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras, androidx.compose.runtime.Composer composer, int i, int i2) {
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
            androidx.compose.runtime.ComposerKt.traceEventStart(1673618944, i, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.kt:105)");
        }
        VM vm = (VM) androidx.view.viewmodel.compose.ViewModelKt.get(viewModelStoreOwner, kClass, str, factory, creationExtras);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return vm;
    }

    public static final /* synthetic */ <VM extends androidx.view.ViewModel> VM viewModel(androidx.view.ViewModelStoreOwner viewModelStoreOwner, java.lang.String str, kotlin.jvm.functions.Function1<? super androidx.view.viewmodel.CreationExtras, ? extends VM> function1, androidx.compose.runtime.Composer composer, int i, int i2) {
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        if ((i2 & 1) != 0 && (viewModelStoreOwner = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6)) == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.view.ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        if ((i2 & 2) != 0) {
            str = null;
        }
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.view.viewmodel.InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new androidx.view.viewmodel.InitializerViewModelFactoryBuilder();
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class), function1);
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        androidx.lifecycle.ViewModelProvider.Factory build = initializerViewModelFactoryBuilder.build();
        if (viewModelStoreOwner2 instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            empty = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner2).getDefaultViewModelCreationExtras();
        } else {
            empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
        }
        return (VM) androidx.view.viewmodel.compose.ViewModelKt.viewModel(orCreateKotlinClass, viewModelStoreOwner2, str2, build, empty, composer, (i << 3) & 1008, 0);
    }

    public static /* synthetic */ androidx.view.ViewModel get$default(androidx.view.ViewModelStoreOwner viewModelStoreOwner, kotlin.reflect.KClass kClass, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            factory = null;
        }
        if ((i & 8) != 0) {
            if (viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                creationExtras = ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
            } else {
                creationExtras = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }
        }
        return androidx.view.viewmodel.compose.ViewModelKt.get(viewModelStoreOwner, kClass, str, factory, creationExtras);
    }

    public static final <VM extends androidx.view.ViewModel> VM get(androidx.view.ViewModelStoreOwner viewModelStoreOwner, kotlin.reflect.KClass<VM> kClass, java.lang.String str, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.view.viewmodel.CreationExtras creationExtras) {
        androidx.view.ViewModelProvider create$default;
        if (factory != null) {
            create$default = androidx.view.ViewModelProvider.INSTANCE.create(viewModelStoreOwner.getGetHighSpeedVideoFpsRangesFor(), factory, creationExtras);
        } else if (viewModelStoreOwner instanceof androidx.view.HasDefaultViewModelProviderFactory) {
            create$default = androidx.view.ViewModelProvider.INSTANCE.create(viewModelStoreOwner.getGetHighSpeedVideoFpsRangesFor(), ((androidx.view.HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory(), creationExtras);
        } else {
            create$default = androidx.view.ViewModelProvider.Companion.create$default(androidx.view.ViewModelProvider.INSTANCE, viewModelStoreOwner, (androidx.lifecycle.ViewModelProvider.Factory) null, (androidx.view.viewmodel.CreationExtras) null, 6, (java.lang.Object) null);
        }
        if (str != null) {
            return (VM) create$default.get(str, kClass);
        }
        return (VM) create$default.get(kClass);
    }
}
