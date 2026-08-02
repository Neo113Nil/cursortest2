package androidx.view.viewmodel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a,\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00020\u0002\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\b*\u00020\u00012\u0019\b\b\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "Landroidx/lifecycle/ViewModelProvider$Factory;", "viewModelFactory", "(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initializer", "(Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;Lkotlin/jvm/functions/Function1;)V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InitializerViewModelFactoryKt {
    public static final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory(kotlin.jvm.functions.Function1<? super androidx.view.viewmodel.InitializerViewModelFactoryBuilder, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.view.viewmodel.InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new androidx.view.viewmodel.InitializerViewModelFactoryBuilder();
        function1.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }

    public static final /* synthetic */ <VM extends androidx.view.ViewModel> void initializer(androidx.view.viewmodel.InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, kotlin.jvm.functions.Function1<? super androidx.view.viewmodel.CreationExtras, ? extends VM> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializerViewModelFactoryBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.ViewModel.class), function1);
    }
}
