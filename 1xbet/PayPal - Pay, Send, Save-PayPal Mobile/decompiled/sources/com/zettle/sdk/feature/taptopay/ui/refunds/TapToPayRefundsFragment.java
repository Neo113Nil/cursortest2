package com.zettle.sdk.feature.taptopay.ui.refunds;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0018\u001a\u00020\u00158CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0015\u0010\u001b\u001a\u00020\u00198CX\u0082\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsFragment;", "Lcom/zettle/sdk/ui/ZettleFragment;", "<init>", "()V", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$UiData;", "uiData", "", "Content", "(Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$UiData;Landroidx/compose/runtime/Composer;I)V", "LoadingView", "(Landroidx/compose/runtime/Composer;I)V", "RefundView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayAction$Refund;", "getHighSpeedVideoSizes", "Lkotlin/Lazy;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayRefundsFragment extends com.zettle.sdk.ui.ZettleFragment {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.Lazy Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.Lazy getHighSpeedVideoFpsRangesFor;

    public TapToPayRefundsFragment() {
        final com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment tapToPayRefundsFragment = this;
        kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> function0 = new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$viewModel$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                return new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl.Factory();
            }
        };
        final kotlin.jvm.functions.Function0<androidx.fragment.app.Fragment> function02 = new kotlin.jvm.functions.Function0<androidx.fragment.app.Fragment>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$special$$inlined$viewModels$default$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.fragment.app.Fragment invoke() {
                return androidx.fragment.app.Fragment.this;
            }

            {
                super(0);
            }
        };
        final kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.NONE, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<androidx.view.ViewModelStoreOwner>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStoreOwner invoke() {
                return (androidx.view.ViewModelStoreOwner) kotlin.jvm.functions.Function0.this.invoke();
            }

            {
                super(0);
            }
        });
        final kotlin.jvm.functions.Function0 function03 = null;
        this.Camera2StreamConfigurationMap = androidx.fragment.app.FragmentViewModelLazyKt.createViewModelLazy(tapToPayRefundsFragment, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModelImpl.class), new kotlin.jvm.functions.Function0<androidx.view.ViewModelStore>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.ViewModelStore invoke() {
                return androidx.fragment.app.FragmentViewModelLazyKt.m9158access$viewModels$lambda1(kotlin.Lazy.this).getViewModelStore();
            }

            {
                super(0);
            }
        }, new kotlin.jvm.functions.Function0<androidx.view.viewmodel.CreationExtras>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.view.viewmodel.CreationExtras invoke() {
                androidx.view.viewmodel.CreationExtras creationExtras;
                kotlin.jvm.functions.Function0 function04 = kotlin.jvm.functions.Function0.this;
                if (function04 != null && (creationExtras = (androidx.view.viewmodel.CreationExtras) function04.invoke()) != null) {
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
        }, function0 == null ? new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$special$$inlined$viewModels$default$5
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
        } : function0);
        this.getHighSpeedVideoFpsRangesFor = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$action$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund invoke() {
                com.zettle.sdk.ui.SdkViewModel sdkViewModel;
                sdkViewModel = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.getSdkViewModel();
                com.zettle.sdk.features.Action action = sdkViewModel.getAction();
                com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund refund = action instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund ? (com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund) action : null;
                if (refund != null) {
                    return refund;
                }
                throw new java.lang.IllegalArgumentException("The Action must be of type TapToPayAction.Refund");
            }

            {
                super(0);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1390960276, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                Camera2StreamConfigurationMap(composer, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1390960276, i, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.onCreateView.<anonymous>.<anonymous> (TapToPayRefundsFragment.kt:70)");
                    }
                    final com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment tapToPayRefundsFragment = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this;
                    com.izettle.ui.compose.OttoThemeKt.OttoTheme(false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer, -1036814447, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            androidx.compose.runtime.Composer composer3 = composer2;
                            int intValue = num.intValue();
                            if ((intValue & 11) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                            } else {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1036814447, intValue, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (TapToPayRefundsFragment.kt:71)");
                                }
                                com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.RefundView(composer3, 8);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        {
                            super(2);
                        }
                    }), composer, 48, 1);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            {
                super(2);
            }
        }));
        return composeView;
    }

    public final void RefundView(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-799489673);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-799489673, i, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.RefundView (TapToPayRefundsFragment.kt:86)");
        }
        final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel) this.Camera2StreamConfigurationMap.getValue()).getUiData(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 8, 7);
        androidx.compose.runtime.EffectsKt.LaunchedEffect(((com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel) this.Camera2StreamConfigurationMap.getValue()).getEffects(), new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$1(this, null), startRestartGroup, 72);
        androidx.compose.runtime.EffectsKt.LaunchedEffect(kotlin.Unit.INSTANCE, new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$2(this, null), startRestartGroup, 70);
        androidx.compose.material.ScaffoldKt.m2719Scaffold27mzLpw(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 134997052, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$3
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                if ((intValue & 11) != 2 || !composer3.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(134997052, intValue, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.RefundView.<anonymous> (TapToPayRefundsFragment.kt:128)");
                    }
                    kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m23179getLambda1$ui_publicRelease = com.zettle.sdk.feature.taptopay.ui.refunds.ComposableSingletons$TapToPayRefundsFragmentKt.INSTANCE.m23179getLambda1$ui_publicRelease();
                    final com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment tapToPayRefundsFragment = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this;
                    androidx.compose.material.AppBarKt.m2486TopAppBarxWeB9s(m23179getLambda1$ui_publicRelease, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, -1384691530, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$3.1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                            androidx.compose.runtime.Composer composer5 = composer4;
                            int intValue2 = num2.intValue();
                            if ((intValue2 & 11) != 2 || !composer5.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1384691530, intValue2, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.RefundView.<anonymous>.<anonymous> (TapToPayRefundsFragment.kt:131)");
                                }
                                final com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment tapToPayRefundsFragment2 = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this;
                                androidx.compose.material.IconButtonKt.IconButton(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.RefundView.3.1.1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final /* synthetic */ kotlin.Unit invoke() {
                                        com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.access$getViewModel(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this).dispatchAction(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.Cancel.INSTANCE);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    {
                                        super(0);
                                    }
                                }, null, false, null, com.zettle.sdk.feature.taptopay.ui.refunds.ComposableSingletons$TapToPayRefundsFragmentKt.INSTANCE.m23180getLambda2$ui_publicRelease(), composer5, 24576, 14);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                            } else {
                                composer5.skipToGroupEnd();
                            }
                            return kotlin.Unit.INSTANCE;
                        }

                        {
                            super(2);
                        }
                    }), null, 0L, 0L, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f), composer3, 1573254, 58);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return kotlin.Unit.INSTANCE;
            }

            {
                super(2);
            }
        }), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, com.izettle.ui.compose.OttoTheme.INSTANCE.getColors(startRestartGroup, com.izettle.ui.compose.OttoTheme.$stable).getBackgroundColors().getDefault-0d7_KjU(), 0L, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1717021131, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$4
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "");
                if ((intValue & 11) != 2 || !composer3.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1717021131, intValue, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.RefundView.<anonymous> (TapToPayRefundsFragment.kt:144)");
                    }
                    if (com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.access$RefundView$lambda$1(collectAsStateWithLifecycle).getLoading()) {
                        composer3.startReplaceableGroup(-1126780172);
                        com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.LoadingView(composer3, 8);
                        composer3.endReplaceableGroup();
                    } else {
                        composer3.startReplaceableGroup(-1126780113);
                        com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.Content(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.access$RefundView$lambda$1(collectAsStateWithLifecycle), composer3, 72);
                        composer3.endReplaceableGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }
        }), startRestartGroup, 390, 12582912, 98298);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$RefundView$5
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.RefundView(composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }

    public final void LoadingView(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1481401679);
        if ((i & 1) != 0 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1481401679, i, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.LoadingView (TapToPayRefundsFragment.kt:155)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical center = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            startRestartGroup.startReplaceableGroup(-483455358);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(center, centerHorizontally, startRestartGroup, 54);
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
            androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
            androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxSize$default);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.material.ProgressIndicatorKt.m2701CircularProgressIndicatorLxG7B9w(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(64.0f)), com.izettle.ui.compose.OttoTheme.INSTANCE.getColors(startRestartGroup, com.izettle.ui.compose.OttoTheme.$stable).getProgressColors().getIndicator-0d7_KjU(), 0.0f, 0L, 0, startRestartGroup, 6, 28);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$LoadingView$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.LoadingView(composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }

    public final void Content(final com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData uiData, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiData, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-626250219);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-626250219, i, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.Content (TapToPayRefundsFragment.kt:169)");
        }
        androidx.compose.ui.Modifier fillMaxHeight$default = androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(-483455358);
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxHeight$default);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, density, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, layoutDirection, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, viewConfiguration, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.ui.Modifier weight = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE.weight(androidx.compose.ui.Modifier.INSTANCE, 1.0f, true);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection2 = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration2 = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf2 = androidx.compose.ui.layout.LayoutKt.materializerOf(weight);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, density2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, layoutDirection2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, viewConfiguration2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        com.izettle.ui.compose.component.presentationarea.OttoPresentationAreaKt.OttoPresentationArea(androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.align(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.Alignment.INSTANCE.getCenter()), (androidx.compose.ui.Alignment) null, (com.izettle.ui.compose.component.presentationarea.OttoPresentationAreaStyles) null, (androidx.compose.foundation.layout.PaddingValues) null, (androidx.compose.foundation.layout.PaddingValues) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -700327639, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$Content$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.BoxScope boxScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(boxScope, "");
                if ((intValue & 81) != 16 || !composer3.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-700327639, intValue, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.Content.<anonymous>.<anonymous>.<anonymous> (TapToPayRefundsFragment.kt:176)");
                    }
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.res.PrimitiveResources_androidKt.dimensionResource(com.zettle.sdk.feature.taptopay.ui.R.dimen.grid_2x, composer3, 0));
                    com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$Content$1$1$1.AnonymousClass1 anonymousClass1 = new kotlin.jvm.functions.Function1<android.content.Context, com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$Content$1$1$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent invoke(android.content.Context context) {
                            android.content.Context context2 = context;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context2, "");
                            return new com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent(context2, null, 0, 6, null);
                        }
                    };
                    final com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData uiData2 = com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData.this;
                    final com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment tapToPayRefundsFragment = this;
                    androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(anonymousClass1, m1706padding3ABfNKs, new kotlin.jvm.functions.Function1<com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$Content$1$1$1.2
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent) {
                            com.zettle.sdk.common.ui.components.totalamount.OttoTotalAmountComponent ottoTotalAmountComponent2 = ottoTotalAmountComponent;
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ottoTotalAmountComponent2, "");
                            com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder currency = new com.zettle.sdk.common.ui.text.CurrencyFormatter.Builder().currency(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData.this.getCurrency());
                            java.util.Locale locale = java.util.Locale.getDefault();
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                            com.zettle.sdk.common.ui.text.CurrencyFormatter build = currency.locale(locale).build();
                            java.lang.String string = tapToPayRefundsFragment.getString(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_refunds_amount_description);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                            android.text.SpannableString format = build.format(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData.this.getRefundedAmount());
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("<b>");
                            sb.append((java.lang.Object) format);
                            sb.append("</b>");
                            java.lang.String replaceFirst$default = kotlin.text.StringsKt.replaceFirst$default(string, "%@", sb.toString(), false, 4, (java.lang.Object) null);
                            android.text.SpannableString format2 = build.format(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData.this.getTotalAmount());
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("<b>");
                            sb2.append((java.lang.Object) format2);
                            sb2.append("</b>");
                            ottoTotalAmountComponent2.setSecondaryTextBottom(androidx.core.text.HtmlCompat.fromHtml(kotlin.text.StringsKt.replaceFirst$default(replaceFirst$default, "%@", sb2.toString(), false, 4, (java.lang.Object) null), 63).toString());
                            ottoTotalAmountComponent2.setOttoAmount(build.formatAsOttoAmount(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData.this.getRefundedAmount()));
                            return kotlin.Unit.INSTANCE;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    }, composer3, 6, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                } else {
                    composer3.skipToGroupEnd();
                }
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }
        }), startRestartGroup, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.res.PrimitiveResources_androidKt.dimensionResource(com.zettle.sdk.feature.taptopay.ui.R.dimen.grid_2x, startRestartGroup, 0));
        startRestartGroup.startReplaceableGroup(-483455358);
        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.ui.unit.Density density3 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection3 = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration3 = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf3 = androidx.compose.ui.layout.LayoutKt.materializerOf(m1706padding3ABfNKs);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, density3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, layoutDirection3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, viewConfiguration3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.Modifier.Companion companion2 = companion;
        androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(companion2, androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f));
        startRestartGroup.startReplaceableGroup(693286680);
        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.ui.unit.Density density4 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection4 = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration4 = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf4 = androidx.compose.ui.layout.LayoutKt.materializerOf(m1707paddingVpY3zN4);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor4);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, density4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, layoutDirection4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, viewConfiguration4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
        androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_symbols_date_s, startRestartGroup, 0), "", (androidx.compose.ui.Modifier) null, (androidx.compose.ui.Alignment) null, (androidx.compose.ui.layout.ContentScale) null, 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, 56, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f)), startRestartGroup, 6);
        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.ui.unit.Density density5 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection5 = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration5 = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf5 = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxWidth$default);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor5);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, rememberBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, density5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, layoutDirection5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, viewConfiguration5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf5.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        androidx.compose.material.TextKt.m2830Text4IGK_g(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_refunds_date, startRestartGroup, 0), boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterStart()), 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, startRestartGroup, 0, 0, 131068);
        androidx.compose.material.TextKt.m2830Text4IGK_g(uiData.getDate(), boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterEnd()), 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, startRestartGroup, 0, 0, 131068);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.Modifier.Companion companion4 = companion3;
        androidx.compose.ui.Modifier m1707paddingVpY3zN42 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(companion4, androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f));
        startRestartGroup.startReplaceableGroup(693286680);
        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.ui.unit.Density density6 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection6 = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration6 = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf6 = androidx.compose.ui.layout.LayoutKt.materializerOf(m1707paddingVpY3zN42);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor6);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m5299constructorimpl6 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, density6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, layoutDirection6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, viewConfiguration6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf6.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
        androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_symbols_card_filled_s, startRestartGroup, 0), "", (androidx.compose.ui.Modifier) null, (androidx.compose.ui.Alignment) null, (androidx.compose.ui.layout.ContentScale) null, 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, 56, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f)), startRestartGroup, 6);
        androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.ui.unit.Density density7 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection7 = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration7 = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor7 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf7 = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxWidth$default2);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor7);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m5299constructorimpl7 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, rememberBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, density7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, layoutDirection7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, viewConfiguration7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf7.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        androidx.compose.material.TextKt.m2830Text4IGK_g(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_refunds_card, startRestartGroup, 0), boxScopeInstance2.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterStart()), 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, startRestartGroup, 0, 0, 131068);
        androidx.compose.material.TextKt.m2830Text4IGK_g(uiData.getCard(), boxScopeInstance2.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterEnd()), 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, startRestartGroup, 0, 0, 131068);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        androidx.compose.ui.Modifier.Companion companion5 = androidx.compose.ui.Modifier.INSTANCE;
        androidx.compose.ui.Modifier.Companion companion6 = companion5;
        androidx.compose.ui.Modifier m1707paddingVpY3zN43 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(companion6, androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(10.0f));
        startRestartGroup.startReplaceableGroup(693286680);
        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.ui.unit.Density density8 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection8 = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration8 = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor8 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf8 = androidx.compose.ui.layout.LayoutKt.materializerOf(m1707paddingVpY3zN43);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor8);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m5299constructorimpl8 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, rowMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, density8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, layoutDirection8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, viewConfiguration8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf8.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance3 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
        androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.zettle.sdk.feature.taptopay.ui.R.drawable.otto_icon_symbols_receipt_filled_s, startRestartGroup, 0), "", (androidx.compose.ui.Modifier) null, (androidx.compose.ui.Alignment) null, (androidx.compose.ui.layout.ContentScale) null, 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, 56, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f)), startRestartGroup, 6);
        androidx.compose.ui.Modifier fillMaxWidth$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy4 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false, startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.ui.unit.Density density9 = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        androidx.compose.ui.unit.LayoutDirection layoutDirection9 = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
        androidx.compose.ui.platform.ViewConfiguration viewConfiguration9 = (androidx.compose.ui.platform.ViewConfiguration) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration());
        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor9 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
        kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> materializerOf9 = androidx.compose.ui.layout.LayoutKt.materializerOf(fillMaxWidth$default3);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            androidx.compose.runtime.ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor9);
        } else {
            startRestartGroup.useNode();
        }
        startRestartGroup.disableReusing();
        androidx.compose.runtime.Composer m5299constructorimpl9 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, rememberBoxMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, density9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetDensity());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, layoutDirection9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetLayoutDirection());
        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, viewConfiguration9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetViewConfiguration());
        startRestartGroup.enableReusing();
        materializerOf9.invoke(androidx.compose.runtime.SkippableUpdater.m5269boximpl(androidx.compose.runtime.SkippableUpdater.m5270constructorimpl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        androidx.compose.material.TextKt.m2830Text4IGK_g(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_refunds_receipt_number, startRestartGroup, 0), boxScopeInstance3.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterStart()), 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, startRestartGroup, 0, 0, 131068);
        androidx.compose.material.TextKt.m2830Text4IGK_g(uiData.getReceiptNumber(), boxScopeInstance3.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterEnd()), 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, startRestartGroup, 0, 0, 131068);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        boolean refundButtonEnable = uiData.getRefundButtonEnable();
        com.izettle.ui.compose.component.button.OttoButtonKt.OttoButton(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$Content$1$2$4
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlin.Unit invoke() {
                com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.access$getViewModel(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this).dispatchAction(new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.DoRefund(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.access$getAction(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this).getAmount(), com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.access$getAction(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this).getRefundReferenceId()));
                return kotlin.Unit.INSTANCE;
            }

            {
                super(0);
            }
        }, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0.0f, androidx.compose.ui.unit.Dp.m8601constructorimpl(20.0f), 0.0f, 0.0f, 13, null), (androidx.compose.foundation.interaction.MutableInteractionSource) null, (com.izettle.ui.compose.component.button.OttoButtonTypes) null, com.izettle.ui.compose.component.button.OttoButtonStyles.PRIMARY, refundButtonEnable, (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -746911901, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$Content$1$2$5
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                androidx.compose.runtime.Composer composer3 = composer2;
                int intValue = num.intValue();
                if ((intValue & 11) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                } else {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-746911901, intValue, -1, "com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.Content.<anonymous>.<anonymous>.<anonymous> (TapToPayRefundsFragment.kt:298)");
                    }
                    androidx.compose.material.TextKt.m2830Text4IGK_g(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData.this.getRefundButtonText(), composer3, 0), (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit>) null, (androidx.compose.ui.text.TextStyle) null, composer3, 0, 0, 131070);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
                return kotlin.Unit.INSTANCE;
            }

            {
                super(2);
            }
        }), startRestartGroup, 12607536, 76);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment$Content$2
            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment.this.Content(uiData, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                return kotlin.Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }
        });
    }

    public static final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData access$RefundView$lambda$1(androidx.compose.runtime.State state) {
        return (com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData) state.getValue();
    }

    public static final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund access$getAction(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment tapToPayRefundsFragment) {
        return (com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund) tapToPayRefundsFragment.getHighSpeedVideoFpsRangesFor.getValue();
    }

    public static final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel access$getViewModel(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment tapToPayRefundsFragment) {
        return (com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel) tapToPayRefundsFragment.Camera2StreamConfigurationMap.getValue();
    }
}
