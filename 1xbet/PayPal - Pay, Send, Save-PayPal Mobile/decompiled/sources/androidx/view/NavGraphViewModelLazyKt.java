package androidx.view;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u001aP\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u001a<\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"navGraphViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "navGraphId", "", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "navGraphRoute", "", "navigation-fragment_release", "backStackEntry", "Landroidx/navigation/NavBackStackEntry;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt {
    public static /* synthetic */ kotlin.Lazy navGraphViewModels$default(androidx.fragment.app.Fragment fragment, int i, kotlin.jvm.functions.Function0 function0, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i));
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(lazy);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$1 navGraphViewModelLazyKt$navGraphViewModels$1 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$1(lazy);
        if (function0 == null) {
            function0 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$2(lazy);
        }
        return androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, navGraphViewModelLazyKt$navGraphViewModels$1, function0);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    public static final /* synthetic */ <VM extends androidx.view.ViewModel> kotlin.Lazy<VM> navGraphViewModels(androidx.fragment.app.Fragment fragment, int i, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i));
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(lazy);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$1 navGraphViewModelLazyKt$navGraphViewModels$1 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$1(lazy);
        if (function0 == null) {
            function0 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$2(lazy);
        }
        return androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$1, navGraphViewModelLazyKt$navGraphViewModels$1, function0);
    }

    public static /* synthetic */ kotlin.Lazy navGraphViewModels$default(androidx.fragment.app.Fragment fragment, int i, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        if ((i2 & 4) != 0) {
            function02 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(fragment, i));
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(lazy);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$3 navGraphViewModelLazyKt$navGraphViewModels$3 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$3(function0, lazy);
        if (function02 == null) {
            function02 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$4(lazy);
        }
        return androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, navGraphViewModelLazyKt$navGraphViewModels$3, function02);
    }

    public static final /* synthetic */ <VM extends androidx.view.ViewModel> kotlin.Lazy<VM> navGraphViewModels(androidx.fragment.app.Fragment fragment, int i, kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function0, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(fragment, i));
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$2(lazy);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$3 navGraphViewModelLazyKt$navGraphViewModels$3 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$3(function0, lazy);
        if (function02 == null) {
            function02 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$4(lazy);
        }
        return androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$2, navGraphViewModelLazyKt$navGraphViewModels$3, function02);
    }

    public static /* synthetic */ kotlin.Lazy navGraphViewModels$default(androidx.fragment.app.Fragment fragment, java.lang.String str, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, str));
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(lazy);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$5 navGraphViewModelLazyKt$navGraphViewModels$5 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$5(lazy);
        if (function0 == null) {
            function0 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$6(lazy);
        }
        return androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, navGraphViewModelLazyKt$navGraphViewModels$5, function0);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by navGraphViewModels that takes a CreationExtras producer")
    public static final /* synthetic */ <VM extends androidx.view.ViewModel> kotlin.Lazy<VM> navGraphViewModels(androidx.fragment.app.Fragment fragment, java.lang.String str, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(fragment, str));
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$3(lazy);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$5 navGraphViewModelLazyKt$navGraphViewModels$5 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$5(lazy);
        if (function0 == null) {
            function0 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$6(lazy);
        }
        return androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$3, navGraphViewModelLazyKt$navGraphViewModels$5, function0);
    }

    public static /* synthetic */ kotlin.Lazy navGraphViewModels$default(androidx.fragment.app.Fragment fragment, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11(fragment, str));
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(lazy);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$7 navGraphViewModelLazyKt$navGraphViewModels$7 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$7(function0, lazy);
        if (function02 == null) {
            function02 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$8(lazy);
        }
        return androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, navGraphViewModelLazyKt$navGraphViewModels$7, function02);
    }

    public static final /* synthetic */ <VM extends androidx.view.ViewModel> kotlin.Lazy<VM> navGraphViewModels(androidx.fragment.app.Fragment fragment, java.lang.String str, kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function0, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$11(fragment, str));
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$4(lazy);
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class);
        androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$7 navGraphViewModelLazyKt$navGraphViewModels$7 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$7(function0, lazy);
        if (function02 == null) {
            function02 = new androidx.view.NavGraphViewModelLazyKt$navGraphViewModels$8(lazy);
        }
        return androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(fragment, orCreateKotlinClass, navGraphViewModelLazyKt$navGraphViewModels$storeProducer$4, navGraphViewModelLazyKt$navGraphViewModels$7, function02);
    }

    /* renamed from: access$navGraphViewModels$lambda-0, reason: not valid java name */
    public static final /* synthetic */ androidx.view.NavBackStackEntry m9191access$navGraphViewModels$lambda0(kotlin.Lazy lazy) {
        return (androidx.view.NavBackStackEntry) lazy.getValue();
    }

    /* renamed from: access$navGraphViewModels$lambda-1, reason: not valid java name */
    public static final /* synthetic */ androidx.view.NavBackStackEntry m9192access$navGraphViewModels$lambda1(kotlin.Lazy lazy) {
        return (androidx.view.NavBackStackEntry) lazy.getValue();
    }

    /* renamed from: access$navGraphViewModels$lambda-2, reason: not valid java name */
    public static final /* synthetic */ androidx.view.NavBackStackEntry m9193access$navGraphViewModels$lambda2(kotlin.Lazy lazy) {
        return (androidx.view.NavBackStackEntry) lazy.getValue();
    }

    /* renamed from: access$navGraphViewModels$lambda-3, reason: not valid java name */
    public static final /* synthetic */ androidx.view.NavBackStackEntry m9194access$navGraphViewModels$lambda3(kotlin.Lazy lazy) {
        return (androidx.view.NavBackStackEntry) lazy.getValue();
    }
}
