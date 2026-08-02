package com.ingo.sdk.android.ux.feature.transaction.funds_timing;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/funds_timing/FundsTimingFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Pair;", "Lcom/ingo/sdk/kotlin/common/features/add_promo_code/model/AddPromoCodeResponse;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FundsTimingFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.String, com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse>> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.FundsTimingSelection;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new androidx.view.OnBackPressedCallback() { // from class: com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreate$1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                java.lang.String transactionReferenceNumberFromArgs;
                com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment.this.trackHardwareBackButton();
                com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment fundsTimingFragment = com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment.this;
                transactionReferenceNumberFromArgs = fundsTimingFragment.getTransactionReferenceNumberFromArgs();
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(fundsTimingFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.SELECT_FUNDS_TIMING, transactionReferenceNumberFromArgs, null, 4, null);
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        androidx.view.SavedStateHandle savedStateHandle;
        androidx.view.MutableLiveData liveData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        final androidx.view.NavController findNavController = androidx.view.fragment.FragmentKt.findNavController(this);
        androidx.view.NavBackStackEntry currentBackStackEntry = findNavController.getCurrentBackStackEntry();
        if (currentBackStackEntry != null && (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) != null && (liveData = savedStateHandle.getLiveData(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_PROMO_CODE_RESPONSE)) != null) {
            liveData.observe(getViewLifecycleOwner(), new com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment.m10696$r8$lambda$ZbDH67wJ5a_nvMrtPIQqXDacWU(androidx.view.NavController.this, this, (java.lang.String) obj);
                }
            }));
        }
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        final androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(635355505, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                final /* synthetic */ com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment Camera2StreamConfigurationMap;
                final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoFpsRangesFor;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponseFromArguments;
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                        androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure = this.Camera2StreamConfigurationMap.getFailure();
                        androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction = this.Camera2StreamConfigurationMap.getFailureAction();
                        androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction = this.Camera2StreamConfigurationMap.getRetryAction();
                        confirmAmountResponseFromArguments = this.Camera2StreamConfigurationMap.getConfirmAmountResponseFromArguments();
                        final com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment fundsTimingFragment = this.Camera2StreamConfigurationMap;
                        final androidx.compose.ui.platform.ComposeView composeView = this.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.functions.Function1 function1 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0035: CONSTRUCTOR (r5v0 'function1' kotlin.jvm.functions.Function1) = 
                              (r10v8 'fundsTimingFragment' com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment A[DONT_INLINE])
                              (r0v1 'composeView' androidx.compose.ui.platform.ComposeView A[DONT_INLINE])
                             A[DECLARE_VAR, MD:(com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment, androidx.compose.ui.platform.ComposeView):void (m)] (LINE:4131) call: com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1$1$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment, androidx.compose.ui.platform.ComposeView):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            this = this;
                            androidx.compose.runtime.Composer r9 = (androidx.compose.runtime.Composer) r9
                            java.lang.Number r10 = (java.lang.Number) r10
                            int r10 = r10.intValue()
                            r10 = r10 & 11
                            r0 = 2
                            if (r10 != r0) goto L17
                            boolean r10 = r9.getSkipping()
                            if (r10 == 0) goto L17
                            r9.skipToGroupEnd()
                            goto L51
                        L17:
                            com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment r10 = r8.Camera2StreamConfigurationMap
                            androidx.compose.runtime.MutableState r1 = r10.getFailure()
                            com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment r10 = r8.Camera2StreamConfigurationMap
                            androidx.compose.runtime.MutableState r2 = r10.getFailureAction()
                            com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment r10 = r8.Camera2StreamConfigurationMap
                            androidx.compose.runtime.MutableState r3 = r10.getRetryAction()
                            com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment r10 = r8.Camera2StreamConfigurationMap
                            com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse r4 = com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment.access$getConfirmAmountResponseFromArguments(r10)
                            com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1$1$$ExternalSyntheticLambda0 r5 = new com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1$1$$ExternalSyntheticLambda0
                            com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment r10 = r8.Camera2StreamConfigurationMap
                            androidx.compose.ui.platform.ComposeView r0 = r8.getHighSpeedVideoFpsRangesFor
                            r5.<init>(r10, r0)
                            com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1$1$$ExternalSyntheticLambda1 r6 = new com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1$1$$ExternalSyntheticLambda1
                            com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment r10 = r8.Camera2StreamConfigurationMap
                            r6.<init>(r10)
                            com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1$1$$ExternalSyntheticLambda2 r7 = new com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1$1$$ExternalSyntheticLambda2
                            com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment r10 = r8.Camera2StreamConfigurationMap
                            r7.<init>(r10)
                            com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider r10 = new com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider
                            r0 = r10
                            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                            int r0 = com.ingo.sdk.android.ux.viewprovider.FundsTimingFragmentViewProvider.$stable
                            r10.View(r9, r0)
                        L51:
                            kotlin.Unit r9 = kotlin.Unit.INSTANCE
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }

                    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment fundsTimingFragment, androidx.compose.ui.platform.ComposeView composeView, com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming) {
                        java.lang.String transactionReferenceNumberFromArgs;
                        androidx.compose.runtime.MutableState mutableState;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundsTiming, "");
                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
                        if (obj == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
                        }
                        com.ingo.sdk.kotlin.common.analytics.IngoAnalytics ingoAnalytics = (com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj;
                        transactionReferenceNumberFromArgs = fundsTimingFragment.getTransactionReferenceNumberFromArgs();
                        java.util.Map<java.lang.String, java.lang.String> defaultProperties = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties(transactionReferenceNumberFromArgs);
                        defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.FundsTimingSelection);
                        defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.FundsTiming, fundsTiming.getValue() == com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming.INSTANCE.getValue() ? com.ingo.sdk.kotlin.common.analytics.IPropertyValues.FundsInMinutes : com.ingo.sdk.kotlin.common.analytics.IPropertyValues.FundsInDays);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        ingoAnalytics.trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.FundsTimingConfirmed, defaultProperties);
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putAll(fundsTimingFragment.getArguments());
                        bundle.putInt(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_SELECTED_TIMING, fundsTiming.getValue());
                        mutableState = fundsTimingFragment.getHighSpeedVideoFpsRangesFor;
                        kotlin.Pair pair = (kotlin.Pair) mutableState.getValue();
                        if (pair != null) {
                            bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_PROMO_CODE_STRING, (java.lang.String) pair.getFirst());
                            kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                            java.lang.Object second = pair.getSecond();
                            json.getSerializersModule();
                            bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_PROMO_CODE_RESPONSE, json.encodeToString(com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse.INSTANCE.serializer(), second));
                        }
                        androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_fundsTimingFragment_to_confirmTransactionDetailsFragment, bundle);
                        return kotlin.Unit.INSTANCE;
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment fundsTimingFragment) {
                        java.lang.String transactionReferenceNumberFromArgs;
                        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Nav Back Clicked", null, 2, null);
                        fundsTimingFragment.trackNavigationPressed();
                        transactionReferenceNumberFromArgs = fundsTimingFragment.getTransactionReferenceNumberFromArgs();
                        com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(fundsTimingFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.SELECT_FUNDS_TIMING, transactionReferenceNumberFromArgs, null, 4, null);
                        return kotlin.Unit.INSTANCE;
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment fundsTimingFragment, com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming) {
                        if (fundsTiming != null) {
                            com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment.access$trackFundsTimingChanged(fundsTimingFragment, fundsTiming);
                        }
                        return kotlin.Unit.INSTANCE;
                    }

                    AnonymousClass1(com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment fundsTimingFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        this.Camera2StreamConfigurationMap = fundsTimingFragment;
                        this.getHighSpeedVideoFpsRangesFor = composeView;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
                        if (obj != null) {
                            com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(921444917, true, new com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$onCreateView$2$1.AnonymousClass1(com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment.this, composeView), composer2, 54), composer2, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }));
            return composeView;
        }

        /* renamed from: $r8$lambda$ZbDH-67wJ5a_nvMrtPIQqXDacWU, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m10696$r8$lambda$ZbDH67wJ5a_nvMrtPIQqXDacWU(androidx.view.NavController navController, final com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment fundsTimingFragment, final java.lang.String str) {
            androidx.view.SavedStateHandle savedStateHandle;
            androidx.view.MutableLiveData liveData;
            androidx.view.NavBackStackEntry currentBackStackEntry = navController.getCurrentBackStackEntry();
            if (currentBackStackEntry != null && (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) != null && (liveData = savedStateHandle.getLiveData(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_PROMO_CODE_STRING)) != null) {
                liveData.observe(fundsTimingFragment.getViewLifecycleOwner(), new com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$sam$androidx_lifecycle_Observer$0(new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment.$r8$lambda$c4gsg7EUM8IelWuHEj7kdu7dUWM(com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment.this, str, (java.lang.String) obj);
                    }
                }));
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$c4gsg7EUM8IelWuHEj7kdu7dUWM(com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment fundsTimingFragment, java.lang.String str, java.lang.String str2) {
            androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.String, com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse>> mutableState = fundsTimingFragment.getHighSpeedVideoFpsRangesFor;
            kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
            kotlin.jvm.internal.Intrinsics.checkNotNull(str);
            json.getSerializersModule();
            mutableState.setValue(new kotlin.Pair<>(str2, json.decodeFromString(com.ingo.sdk.kotlin.common.features.add_promo_code.model.AddPromoCodeResponse.INSTANCE.serializer(), str)));
            return kotlin.Unit.INSTANCE;
        }

        public static final /* synthetic */ void access$trackFundsTimingChanged(com.ingo.sdk.android.ux.feature.transaction.funds_timing.FundsTimingFragment fundsTimingFragment, com.ingo.sdk.kotlin.common.constants.FundsTiming fundsTiming) {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj != null) {
                com.ingo.sdk.kotlin.common.analytics.IngoAnalytics ingoAnalytics = (com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj;
                java.lang.String str = fundsTiming instanceof com.ingo.sdk.kotlin.common.constants.InMinutesFundsTiming ? com.ingo.sdk.kotlin.common.analytics.IEventNames.InMinutesFundsTimingSelected : com.ingo.sdk.kotlin.common.analytics.IEventNames.InDaysFundsTimingSelected;
                java.util.Map<java.lang.String, java.lang.String> defaultProperties = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties(fundsTimingFragment.getTransactionReferenceNumberFromArgs());
                defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.FundsTimingSelection);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ingoAnalytics.trackEvent(str, defaultProperties);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }
    }
