package androidx.activity;

/* compiled from: ActivityViewModelLazy.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"viewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "activity-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt {
    public static /* synthetic */ kotlin.Lazy viewModels$default(androidx.activity.ComponentActivity componentActivity, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (function0 == null) {
            function0 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.lifecycle.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), new androidx.activity.ActivityViewModelLazyKt$viewModels$1(componentActivity), function0, new androidx.activity.ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.Lazy<VM> viewModels(androidx.activity.ComponentActivity componentActivity, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (function0 == null) {
            function0 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.lifecycle.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), new androidx.activity.ActivityViewModelLazyKt$viewModels$1(componentActivity), function0, new androidx.activity.ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    public static /* synthetic */ kotlin.Lazy viewModels$default(androidx.activity.ComponentActivity componentActivity, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            function02 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (function02 == null) {
            function02 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.lifecycle.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), new androidx.activity.ActivityViewModelLazyKt$viewModels$3(componentActivity), function02, new androidx.activity.ActivityViewModelLazyKt$viewModels$4(function0, componentActivity));
    }

    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.Lazy<VM> viewModels(androidx.activity.ComponentActivity componentActivity, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.viewmodel.CreationExtras> function0, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (function02 == null) {
            function02 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.lifecycle.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), new androidx.activity.ActivityViewModelLazyKt$viewModels$3(componentActivity), function02, new androidx.activity.ActivityViewModelLazyKt$viewModels$4(function0, componentActivity));
    }
}
