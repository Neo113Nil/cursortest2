package androidx.view;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/activity/ComponentActivity;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Lkotlin/Lazy;", "viewModels", "(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt {
    public static /* synthetic */ kotlin.Lazy viewModels$default(androidx.view.ComponentActivity componentActivity, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "");
        if (function0 == null) {
            function0 = new androidx.view.ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class), new androidx.view.ActivityViewModelLazyKt$viewModels$1(componentActivity), function0, new androidx.view.ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    public static final /* synthetic */ <VM extends androidx.view.ViewModel> kotlin.Lazy<VM> viewModels(androidx.view.ComponentActivity componentActivity, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "");
        if (function0 == null) {
            function0 = new androidx.view.ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class), new androidx.view.ActivityViewModelLazyKt$viewModels$1(componentActivity), function0, new androidx.view.ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    public static /* synthetic */ kotlin.Lazy viewModels$default(androidx.view.ComponentActivity componentActivity, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            function02 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "");
        if (function02 == null) {
            function02 = new androidx.view.ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class), new androidx.view.ActivityViewModelLazyKt$viewModels$3(componentActivity), function02, new androidx.view.ActivityViewModelLazyKt$viewModels$4(function0, componentActivity));
    }

    public static final /* synthetic */ <VM extends androidx.view.ViewModel> kotlin.Lazy<VM> viewModels(androidx.view.ComponentActivity componentActivity, kotlin.jvm.functions.Function0<? extends androidx.view.viewmodel.CreationExtras> function0, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "");
        if (function02 == null) {
            function02 = new androidx.view.ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.view.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class), new androidx.view.ActivityViewModelLazyKt$viewModels$3(componentActivity), function02, new androidx.view.ActivityViewModelLazyKt$viewModels$4(function0, componentActivity));
    }
}
