package com.zettle.sdk.feature.taptopay.ui.payment;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J!\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u00020\u00138\u0007@\u0007X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u00020\u001f8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0018\u0010\u001c\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\u00020)8\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u0015\u0010'\u001a\u0002038CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b4\u00105"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/payment/FailedFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onStop", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/widget/ImageView;", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "Landroidx/lifecycle/Observer;", "Lcom/zettle/sdk/feature/taptopay/ui/payment/ViewState;", "getHighSpeedVideoSizes", "Landroidx/lifecycle/Observer;", "Camera2StreamConfigurationMap", "Landroid/widget/Button;", "okBtn", "Landroid/widget/Button;", "getOkBtn", "()Landroid/widget/Button;", "setOkBtn", "(Landroid/widget/Button;)V", "Landroid/media/MediaPlayer;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/media/MediaPlayer;", "Landroid/widget/TextView;", "subtitle", "Landroid/widget/TextView;", "getSubtitle", "()Landroid/widget/TextView;", "setSubtitle", "(Landroid/widget/TextView;)V", "title", "getTitle", "setTitle", "Lcom/zettle/sdk/feature/taptopay/ui/payment/TapToPayPaymentViewModel;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/Lazy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class FailedFragment extends androidx.fragment.app.Fragment {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.media.MediaPlayer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.Lazy getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState> Camera2StreamConfigurationMap;
    public android.widget.ImageView icon;
    public android.widget.Button okBtn;
    public android.widget.TextView subtitle;
    public android.widget.TextView title;

    public FailedFragment() {
        final com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment failedFragment = this;
        final kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner> function0 = new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment$viewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final androidx.view.ViewModelStoreOwner invoke() {
                androidx.fragment.app.FragmentActivity requireActivity = com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this.requireActivity();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireActivity, "");
                return requireActivity;
            }

            {
                super(0);
            }
        };
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStoreOwner invoke() {
                return (androidx.view.ViewModelStoreOwner) kotlin.jvm.functions.Function0.this.invoke();
            }

            {
                super(0);
            }
        });
        final kotlin.jvm.functions.Function0 function02 = null;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(failedFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(kotlin.Lazy.this).getGetHighSpeedVideoSizes();
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function03 = kotlin.jvm.functions.Function0.this;
                if (function03 != null && (creationExtras = (androidx.view.viewmodel.CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                androidx.view.ViewModelStoreOwner m9158access$viewModels$lambda1 = androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(lazy);
                androidx.view.HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m9158access$viewModels$lambda1 instanceof androidx.view.HasDefaultViewModelProviderFactory ? (androidx.view.HasDefaultViewModelProviderFactory) m9158access$viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory;
                androidx.view.ViewModelStoreOwner m9158access$viewModels$lambda1 = androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(lazy);
                androidx.view.HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m9158access$viewModels$lambda1 instanceof androidx.view.HasDefaultViewModelProviderFactory ? (androidx.view.HasDefaultViewModelProviderFactory) m9158access$viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                androidx.lifecycle.ViewModelProvider.Factory defaultViewModelProviderFactory2 = androidx.fragment.app.Fragment.this.getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "");
                return defaultViewModelProviderFactory2;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.Camera2StreamConfigurationMap = new androidx.view.Observer<com.zettle.sdk.feature.taptopay.ui.payment.ViewState>() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment$observer$1
            @Override // androidx.view.Observer
            public final /* synthetic */ void onChanged(com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState) {
                com.zettle.sdk.feature.taptopay.ui.payment.ViewState viewState2 = viewState;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewState2, "");
                com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen screen = viewState2.getScreen();
                com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult result = viewState2.getResult();
                if ((screen instanceof com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Failed) && (result instanceof com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentResult.Failed)) {
                    com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Failed failed = (com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel.Screen.Failed) screen;
                    com.zettle.sdk.feature.taptopay.core.TransactionFailureReason failureReason = failed.getFailureReason();
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.AttestationFailed) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onFailedUnrecoverableError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this);
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.DeveloperOptionsDetected) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onFailedWithAction(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, (com.zettle.sdk.feature.taptopay.core.Actionable) failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.TimeMismatchDetected) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onFailedWithAction(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, (com.zettle.sdk.feature.taptopay.core.Actionable) failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.AboveMaximum) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.BackendError) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.BelowMinimum) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CanceledByTimeout) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CanceledByUser) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CardReadInvalid) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CountryNotSupported) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.EmptyPayload) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.EmptyResponse) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.InvalidArguments) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.NetworkError) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.PinEntranceCanceled) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.RequireBankVerification) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.SignatureCanceled) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.ScaChallenge) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onWarningError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this);
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.ParsingError) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.UnsuccessfulResponse) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.TechnicalError) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.CanceledByNetworkTimeout) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.PaymentDeclined) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.NFCUnexpectedError) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                        return;
                    }
                    if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.AuthRequired) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                    } else if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.GratuityAmountTooHigh) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                    } else if (failureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.GratuityAmountTooLow) {
                        com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.access$onDismissibleError(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, failed.getFailureReason());
                    }
                }
            }
        };
    }

    public final android.widget.TextView getTitle() {
        android.widget.TextView textView = this.title;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setTitle(android.widget.TextView textView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "");
        this.title = textView;
    }

    public final android.widget.TextView getSubtitle() {
        android.widget.TextView textView = this.subtitle;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setSubtitle(android.widget.TextView textView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textView, "");
        this.subtitle = textView;
    }

    public final android.widget.Button getOkBtn() {
        android.widget.Button button = this.okBtn;
        if (button != null) {
            return button;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setOkBtn(android.widget.Button button) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(button, "");
        this.okBtn = button;
    }

    public final android.widget.ImageView getIcon() {
        android.widget.ImageView imageView = this.icon;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final void setIcon(android.widget.ImageView imageView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageView, "");
        this.icon = imageView;
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        return inflater.inflate(com.zettle.sdk.feature.taptopay.ui.R.layout.fragment_taptopay_payment_failed, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, savedInstanceState);
        this.getHighSpeedVideoSizes = android.media.MediaPlayer.create(requireContext(), com.zettle.sdk.feature.taptopay.ui.R.raw.payment_failed);
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) this.getHighResolutionOutputSizeshNQ4ISI.getValue()).getState().observe(getViewLifecycleOwner(), this.Camera2StreamConfigurationMap);
        android.view.View findViewById = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_failure_dismiss);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById, "");
        setOkBtn((android.widget.Button) findViewById);
        android.view.View findViewById2 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_failure_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        setTitle((android.widget.TextView) findViewById2);
        android.view.View findViewById3 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_failure_sub_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        setSubtitle((android.widget.TextView) findViewById3);
        android.view.View findViewById4 = view.findViewById(com.zettle.sdk.feature.taptopay.ui.R.id.payment_failure_icon);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        setIcon((android.widget.ImageView) findViewById4);
        android.media.MediaPlayer mediaPlayer = this.getHighSpeedVideoSizes;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        android.media.MediaPlayer mediaPlayer = this.getHighSpeedVideoSizes;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.getHighSpeedVideoSizes = null;
    }

    /* renamed from: $r8$lambda$CX8j1hCElGcjVWWBw3TAeigp5-8, reason: not valid java name */
    public static /* synthetic */ void m23174$r8$lambda$CX8j1hCElGcjVWWBw3TAeigp58(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment failedFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedFragment, "");
        failedFragment.requireActivity().finish();
    }

    public static /* synthetic */ void $r8$lambda$lmYtcDC17xJXP7OJxOPDr9tIM6o(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment failedFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedFragment, "");
        failedFragment.requireActivity().finish();
    }

    public static /* synthetic */ void $r8$lambda$rQMnobvcSEAin_0otEOGC23Ujaw(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment failedFragment, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedFragment, "");
        failedFragment.requireActivity().finish();
    }

    /* renamed from: $r8$lambda$s8HetzJkY-vqwp34jLzl60dpfIE, reason: not valid java name */
    public static /* synthetic */ void m23175$r8$lambda$s8HetzJkYvqwp34jLzl60dpfIE(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment failedFragment, com.zettle.sdk.feature.taptopay.core.Actionable actionable, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedFragment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionable, "");
        com.zettle.sdk.feature.taptopay.core.attestation.RecommendedAction recommendedAction = actionable.getRecommendedAction();
        try {
            android.content.Intent intent = new android.content.Intent(recommendedAction.getIntent());
            intent.addFlags(268435456);
            if (recommendedAction.getIncludePackage()) {
                intent.setData(android.net.Uri.fromParts("package", failedFragment.requireContext().getPackageName(), null));
            }
            failedFragment.startActivity(intent);
        } catch (android.content.ActivityNotFoundException unused) {
            androidx.fragment.app.FragmentActivity activity = failedFragment.getActivity();
            if (activity != null) {
                com.google.android.material.snackbar.Snackbar.make(activity.findViewById(android.R.id.content), com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_error_generic, 0).show();
            }
        }
        failedFragment.requireActivity().finish();
    }

    public static final /* synthetic */ void access$onDismissibleError(final com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment failedFragment, com.zettle.sdk.feature.taptopay.core.TransactionFailureReason transactionFailureReason) {
        java.lang.String description;
        failedFragment.getTitle().setText(transactionFailureReason.getTitle());
        failedFragment.getTitle().setAccessibilityLiveRegion(1);
        com.zettle.sdk.commons.accessibility.SpeechTextUtilsKt.requestAccessibilityFocus$default(failedFragment.getTitle(), false, 1, null);
        if (transactionFailureReason instanceof com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.BelowMinimum) {
            com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.BelowMinimum belowMinimum = (com.zettle.sdk.feature.taptopay.core.TransactionFailureReason.BelowMinimum) transactionFailureReason;
            java.util.Currency currency = belowMinimum.getCurrency();
            long minAmount = belowMinimum.getMinAmount();
            com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currency2 = new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder().currency(currency);
            java.util.Locale locale = java.util.Locale.getDefault();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
            description = kotlin.text.StringsKt.replace$default(transactionFailureReason.getDescription(), "%@", currency2.locale(locale).build().format(minAmount).toString(), false, 4, (java.lang.Object) null);
        } else {
            description = transactionFailureReason.getDescription();
        }
        failedFragment.getSubtitle().setText(description);
        failedFragment.getOkBtn().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.$r8$lambda$lmYtcDC17xJXP7OJxOPDr9tIM6o(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, view);
            }
        });
    }

    public static final /* synthetic */ void access$onFailedUnrecoverableError(final com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment failedFragment) {
        failedFragment.getTitle().setText(failedFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_failed_problem_ocurred_title));
        failedFragment.getTitle().setAccessibilityLiveRegion(1);
        com.zettle.sdk.commons.accessibility.SpeechTextUtilsKt.requestAccessibilityFocus$default(failedFragment.getTitle(), false, 1, null);
        ((com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentViewModel) failedFragment.getHighResolutionOutputSizeshNQ4ISI.getValue()).getState().removeObservers(failedFragment.requireActivity());
        failedFragment.getSubtitle().setVisibility(0);
        failedFragment.getSubtitle().setText(failedFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_failed_problem_ocurred_subtitle));
        failedFragment.getOkBtn().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.$r8$lambda$rQMnobvcSEAin_0otEOGC23Ujaw(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void access$onFailedWithAction(final com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment failedFragment, final com.zettle.sdk.feature.taptopay.core.Actionable actionable) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(actionable, "");
        com.zettle.sdk.feature.taptopay.core.TransactionFailureReason transactionFailureReason = (com.zettle.sdk.feature.taptopay.core.TransactionFailureReason) actionable;
        failedFragment.getTitle().setText(transactionFailureReason.getTitle());
        failedFragment.getTitle().setAccessibilityLiveRegion(1);
        com.zettle.sdk.commons.accessibility.SpeechTextUtilsKt.requestAccessibilityFocus$default(failedFragment.getTitle(), false, 1, null);
        failedFragment.getSubtitle().setText(transactionFailureReason.getDescription());
        failedFragment.getOkBtn().setText(failedFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_attestation_error_dev_options_positive_btn));
        failedFragment.getOkBtn().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.m23175$r8$lambda$s8HetzJkYvqwp34jLzl60dpfIE(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, actionable, view);
            }
        });
    }

    public static final /* synthetic */ void access$onWarningError(final com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment failedFragment) {
        failedFragment.getTitle().setText(failedFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_sca_challenge_warning_title));
        failedFragment.getTitle().setAccessibilityLiveRegion(1);
        com.zettle.sdk.commons.accessibility.SpeechTextUtilsKt.requestAccessibilityFocus$default(failedFragment.getTitle(), false, 1, null);
        failedFragment.getSubtitle().setText(failedFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_sca_challenge_warning_subtitle));
        failedFragment.getIcon().setImageDrawable(androidx.core.content.ContextCompat.getDrawable(failedFragment.requireContext(), com.zettle.sdk.feature.taptopay.ui.R.drawable.payment_card_warning));
        failedFragment.getOkBtn().setOnClickListener(new android.view.View.OnClickListener() { // from class: com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.m23174$r8$lambda$CX8j1hCElGcjVWWBw3TAeigp58(com.zettle.sdk.feature.taptopay.ui.payment.FailedFragment.this, view);
            }
        });
    }
}
