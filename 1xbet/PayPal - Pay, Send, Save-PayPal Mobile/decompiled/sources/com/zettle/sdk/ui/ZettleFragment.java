package com.zettle.sdk.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0007\u001a\u00020\u00048CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/ui/ZettleFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/zettle/sdk/ui/ZettleViewModel;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/Lazy;", "getHighSpeedVideoSizes", "Landroidx/fragment/app/FragmentManager;", "getParentFragmentManagerOrNull", "()Landroidx/fragment/app/FragmentManager;", "parentFragmentManagerOrNull", "Lcom/zettle/sdk/ui/SdkViewModel;", "getSdkViewModel", "()Lcom/zettle/sdk/ui/SdkViewModel;", "sdkViewModel"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ZettleFragment extends androidx.fragment.app.Fragment {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoSizes;

    public ZettleFragment() {
        final com.zettle.sdk.ui.ZettleFragment zettleFragment = this;
        final kotlin.jvm.functions.Function0 function0 = null;
        this.getHighSpeedVideoSizes = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(zettleFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.ui.ZettleViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.ui.ZettleFragment$special$$inlined$activityViewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                androidx.view.ViewModelStore viewModelStore = androidx.fragment.app.Fragment.this.requireActivity().getViewModelStore();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.ui.ZettleFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function02 = kotlin.jvm.functions.Function0.this;
                if (function02 != null && (creationExtras = (androidx.view.viewmodel.CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                androidx.view.viewmodel.CreationExtras defaultViewModelCreationExtras = zettleFragment.requireActivity().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.ui.ZettleFragment$special$$inlined$activityViewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory = androidx.fragment.app.Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }

            {
                super(0);
            }
        });
    }

    public final androidx.fragment.app.FragmentManager getParentFragmentManagerOrNull() {
        try {
            return getParentFragmentManager();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final com.zettle.sdk.ui.SdkViewModel getSdkViewModel() {
        return (com.zettle.sdk.ui.ZettleViewModel) this.getHighSpeedVideoSizes.getValue();
    }
}
