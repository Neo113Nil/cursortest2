package androidx.view.viewmodel.navigation3;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u000b*\u00020\fH\u0002¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"rememberViewModelStoreNavEntryDecorator", "Landroidx/lifecycle/viewmodel/navigation3/ViewModelStoreNavEntryDecorator;", "T", "", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "removeViewModelStoreOnPop", "Lkotlin/Function0;", "", "(Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/viewmodel/navigation3/ViewModelStoreNavEntryDecorator;", "getEntryViewModel", "Landroidx/lifecycle/viewmodel/navigation3/EntryViewModel;", "Landroidx/lifecycle/ViewModelStore;", "getEntryViewModel$ViewModelStoreNavEntryDecoratorKt__ViewModelStoreNavEntryDecoratorKt", "lifecycle-viewmodel-navigation3"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/lifecycle/viewmodel/navigation3/ViewModelStoreNavEntryDecoratorKt")
/* loaded from: classes7.dex */
final /* synthetic */ class ViewModelStoreNavEntryDecoratorKt__ViewModelStoreNavEntryDecoratorKt {
    public static final <T> androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecorator<T> rememberViewModelStoreNavEntryDecorator(androidx.view.ViewModelStoreOwner viewModelStoreOwner, kotlin.jvm.functions.Function0<java.lang.Boolean> function0, androidx.compose.runtime.Composer composer, int i, int i2) {
        if ((i2 & 1) != 0 && (viewModelStoreOwner = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable)) == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i2 & 2) != 0) {
            function0 = androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecoratorDefaults.INSTANCE.removeViewModelStoreOnPop(composer, 6);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1988859602, i, -1, "androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator (ViewModelStoreNavEntryDecorator.kt:64)");
        }
        androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, composer, (i >> 3) & 14);
        boolean changed = composer.changed(viewModelStoreOwner);
        boolean changed2 = composer.changed(rememberUpdatedState);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if ((changed2 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecorator(viewModelStoreOwner.getGetHighSpeedVideoSizes(), function0);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecorator<T> viewModelStoreNavEntryDecorator = (androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecorator) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return viewModelStoreNavEntryDecorator;
    }

    public static /* synthetic */ androidx.view.viewmodel.navigation3.EntryViewModel Camera2StreamConfigurationMap() {
        return new androidx.view.viewmodel.navigation3.EntryViewModel();
    }

    public static final /* synthetic */ androidx.view.viewmodel.navigation3.EntryViewModel getHighSpeedVideoFpsRanges(androidx.view.ViewModelStore viewModelStore) {
        androidx.view.ViewModelProvider.Companion companion = androidx.view.ViewModelProvider.INSTANCE;
        androidx.view.viewmodel.InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new androidx.view.viewmodel.InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.viewmodel.navigation3.EntryViewModel.class), new kotlin.jvm.functions.Function1() { // from class: androidx.lifecycle.viewmodel.navigation3.ViewModelStoreNavEntryDecoratorKt__ViewModelStoreNavEntryDecoratorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.viewmodel.navigation3.ViewModelStoreNavEntryDecoratorKt__ViewModelStoreNavEntryDecoratorKt.Camera2StreamConfigurationMap();
            }
        });
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        return (androidx.view.viewmodel.navigation3.EntryViewModel) androidx.view.ViewModelProvider.Companion.create$default(companion, viewModelStore, initializerViewModelFactoryBuilder.build(), (androidx.view.viewmodel.CreationExtras) null, 4, (java.lang.Object) null).get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.viewmodel.navigation3.EntryViewModel.class));
    }
}
