package androidx.view;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "getHighSpeedVideoFpsRanges", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NavControllerViewModelKt {
    private static final androidx.lifecycle.ViewModelProvider.Factory getHighSpeedVideoFpsRanges;

    static {
        androidx.view.viewmodel.InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new androidx.view.viewmodel.InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.view.NavControllerViewModel.class), new kotlin.jvm.functions.Function1() { // from class: androidx.navigation.NavControllerViewModelKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.view.NavControllerViewModelKt.$r8$lambda$ZKQlW4d0lrWVmUxe97gzYhxN15Q((androidx.view.viewmodel.CreationExtras) obj);
            }
        });
        getHighSpeedVideoFpsRanges = initializerViewModelFactoryBuilder.build();
    }

    public static /* synthetic */ androidx.view.NavControllerViewModel $r8$lambda$ZKQlW4d0lrWVmUxe97gzYhxN15Q(androidx.view.viewmodel.CreationExtras creationExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creationExtras, "");
        return new androidx.view.NavControllerViewModel();
    }
}
