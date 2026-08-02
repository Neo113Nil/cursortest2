package com.ingo.sdk.android.ux.feature.transaction.confirm_amount;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/confirm_amount/ConfirmCheckAmountFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/MutableState;", "", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/ingo/sdk/android/ux/feature/transaction/confirm_amount/ConfirmCheckAmountViewModelImpl;", "getHighSpeedVideoFpsRanges", "Lcom/ingo/sdk/android/ux/feature/transaction/confirm_amount/ConfirmCheckAmountViewModelImpl;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConfirmCheckAmountFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl getHighSpeedVideoFpsRangesFor = new com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl(null, 1, 0 == true ? 1 : 0);

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.ConfirmAmount;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment = this;
        requireActivity().getGetHighResolutionOutputSizeshNQ4ISI().addCallback(confirmCheckAmountFragment, new androidx.view.OnBackPressedCallback() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreate$1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                java.lang.String transactionReferenceNumberFromArgs;
                com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.this.trackHardwareBackButton();
                com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment2 = com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.this;
                transactionReferenceNumberFromArgs = confirmCheckAmountFragment2.getTransactionReferenceNumberFromArgs();
                com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(confirmCheckAmountFragment2, com.ingo.sdk.kotlin.common.constants.IngoModules.CONFIRM_CHECK_AMOUNT, transactionReferenceNumberFromArgs, null, 4, null);
            }
        });
        com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountViewModelImpl confirmCheckAmountViewModelImpl = this.getHighSpeedVideoFpsRangesFor;
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(confirmCheckAmountFragment, confirmCheckAmountViewModelImpl.getConfirmAmountResponse(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.$r8$lambda$1Zt9thAPywjKx1vd8_nofRsB3Dc(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.this, (com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse) obj);
            }
        });
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(confirmCheckAmountFragment, confirmCheckAmountViewModelImpl.getFailure(), new com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreate$2$2(this));
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        final androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1567722733, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoFpsRanges;
                final /* synthetic */ com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    androidx.compose.runtime.MutableState mutableState;
                    long ocrAmountFromArguments;
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                        mutableState = this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI;
                        ocrAmountFromArguments = this.getHighSpeedVideoSizes.getOcrAmountFromArguments();
                        final com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment = this.getHighSpeedVideoSizes;
                        kotlin.jvm.functions.Function0 function0 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0027: CONSTRUCTOR (r4v0 'function0' kotlin.jvm.functions.Function0) = 
                              (r12v6 'confirmCheckAmountFragment' com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment A[DONT_INLINE])
                             A[DECLARE_VAR, MD:(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment):void (m)] (LINE:4101) call: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            this = this;
                            androidx.compose.runtime.Composer r11 = (androidx.compose.runtime.Composer) r11
                            java.lang.Number r12 = (java.lang.Number) r12
                            int r12 = r12.intValue()
                            r12 = r12 & 11
                            r0 = 2
                            if (r12 != r0) goto L17
                            boolean r12 = r11.getSkipping()
                            if (r12 == 0) goto L17
                            r11.skipToGroupEnd()
                            goto L57
                        L17:
                            com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment r12 = r10.getHighSpeedVideoSizes
                            androidx.compose.runtime.MutableState r1 = com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.access$getProgressShowing$p(r12)
                            com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment r12 = r10.getHighSpeedVideoSizes
                            long r2 = com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.access$getOcrAmountFromArguments(r12)
                            com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0 r4 = new com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0
                            com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment r12 = r10.getHighSpeedVideoSizes
                            r4.<init>(r12)
                            com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1 r5 = new com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1
                            com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment r12 = r10.getHighSpeedVideoSizes
                            androidx.compose.ui.platform.ComposeView r0 = r10.getHighSpeedVideoFpsRanges
                            r5.<init>(r12, r0)
                            com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1$1$$ExternalSyntheticLambda2 r6 = new com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1$1$$ExternalSyntheticLambda2
                            com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment r12 = r10.getHighSpeedVideoSizes
                            r6.<init>(r12)
                            com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment r12 = r10.getHighSpeedVideoSizes
                            androidx.compose.runtime.MutableState r7 = r12.getFailure()
                            com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment r12 = r10.getHighSpeedVideoSizes
                            androidx.compose.runtime.MutableState r8 = r12.getFailureAction()
                            com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment r12 = r10.getHighSpeedVideoSizes
                            androidx.compose.runtime.MutableState r9 = r12.getRetryAction()
                            com.ingo.sdk.android.ux.viewprovider.ConfirmCheckAmountComposableProvider r12 = new com.ingo.sdk.android.ux.viewprovider.ConfirmCheckAmountComposableProvider
                            r0 = r12
                            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9)
                            int r0 = com.ingo.sdk.android.ux.viewprovider.ConfirmCheckAmountComposableProvider.$stable
                            r12.View(r11, r0)
                        L57:
                            kotlin.Unit r11 = kotlin.Unit.INSTANCE
                            return r11
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }

                    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment) {
                        java.lang.String transactionReferenceNumberFromArgs;
                        confirmCheckAmountFragment.trackNavigationPressed();
                        transactionReferenceNumberFromArgs = confirmCheckAmountFragment.getTransactionReferenceNumberFromArgs();
                        com.ingo.sdk.android.common.core.platform.SdkComposeFragment.customerExitSdk$default(confirmCheckAmountFragment, com.ingo.sdk.kotlin.common.constants.IngoModules.CONFIRM_CHECK_AMOUNT, transactionReferenceNumberFromArgs, null, 4, null);
                        return kotlin.Unit.INSTANCE;
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.access$trackChangeAmountPressed(confirmCheckAmountFragment);
                        androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_confirmAmountFragment_to_enterAmountFragment, confirmCheckAmountFragment.getArguments());
                        return kotlin.Unit.INSTANCE;
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment) {
                        com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.access$trackConfirmAmountPressed(confirmCheckAmountFragment);
                        confirmCheckAmountFragment.getHighSpeedVideoSizes();
                        return kotlin.Unit.INSTANCE;
                    }

                    AnonymousClass1(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        this.getHighSpeedVideoSizes = confirmCheckAmountFragment;
                        this.getHighSpeedVideoFpsRanges = composeView;
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
                            com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1860815831, true, new com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$onCreateView$1$1.AnonymousClass1(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.this, composeView), composer2, 54), composer2, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }));
            return composeView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void getHighSpeedVideoSizes() {
            java.lang.String string;
            java.lang.String string2;
            long ocrAmountFromArguments = getOcrAmountFromArguments();
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoUxState.class));
            if (obj != null) {
                com.ingo.sdk.kotlin.common.features.configuration.model.ConfigurationResponse configurationResponse = ((com.ingo.sdk.kotlin.ux.IngoUxState) obj).configurationResponse();
                com.ingo.sdk.kotlin.common.features.configuration.model.CheckAmountLimits checkAmountLimits = configurationResponse != null ? configurationResponse.getCheckAmountLimits() : null;
                if (ocrAmountFromArguments > 0) {
                    if (ocrAmountFromArguments < (checkAmountLimits != null ? checkAmountLimits.getMinCheckAmountAcceptedInCents() : 0L)) {
                        if (checkAmountLimits == null || (string2 = checkAmountLimits.getMinCheckAmountNotMetDescription()) == null) {
                            string2 = requireContext().getString(com.ingo.sdk.android.R.string.ingo_default_check_amount_minimum_limit_description);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                        }
                        showFailureMessage(string2);
                        return;
                    }
                }
                if (ocrAmountFromArguments > (checkAmountLimits != null ? checkAmountLimits.getMaxCheckAmountAcceptedInCents() : Long.MAX_VALUE)) {
                    if (checkAmountLimits == null || (string = checkAmountLimits.getMaxCheckAmountExceededDescription()) == null) {
                        string = requireContext().getString(com.ingo.sdk.android.R.string.ingo_default_check_amount_exceeds_limit_description);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                    }
                    showFailureMessage(string);
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.TRUE);
                this.getHighSpeedVideoFpsRangesFor.confirmAmountPressed(ocrAmountFromArguments, getTransactionReferenceNumberFromArgs());
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoUxState");
        }

        /* renamed from: $r8$lambda$-gmEVsCJA1CGpXHEBMe0JBWxDlQ, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m10684$r8$lambda$gmEVsCJA1CGpXHEBMe0JBWxDlQ(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment) {
            confirmCheckAmountFragment.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.FALSE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$1Zt9thAPywjKx1vd8_nofRsB3Dc(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment, com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse confirmAmountResponse) {
            confirmCheckAmountFragment.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.FALSE);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putAll(confirmCheckAmountFragment.getArguments());
            kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
            json.getSerializersModule();
            bundle.putString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_CONFIRM_AMOUNT_RESPONSE, json.encodeToString(kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.ingo.sdk.kotlin.common.features.confirm_amount.model.ConfirmAmountResponse.INSTANCE.serializer()), confirmAmountResponse));
            com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.fragment.FragmentKt.findNavController(confirmCheckAmountFragment), com.ingo.sdk.android.R.id.action_confirmAmountFragment_to_fundsTimingFragment, bundle, null, null, 12, null);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$3gtd2NDOg4gRGKf5Y4sgL2ldZUg(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment) {
            confirmCheckAmountFragment.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.FALSE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$CTaJveatE7K4f5PZVVnkVYSupWI(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment) {
            confirmCheckAmountFragment.getHighSpeedVideoSizes();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$uuWKd6WQwIvxi50JQjNSotONf1c(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment) {
            confirmCheckAmountFragment.getHighSpeedVideoSizes();
            return kotlin.Unit.INSTANCE;
        }

        public static final /* synthetic */ void access$renderFailure(final com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
            confirmCheckAmountFragment.getHighResolutionOutputSizeshNQ4ISI.setValue(java.lang.Boolean.FALSE);
            if (failure != null && (failure instanceof com.ingo.sdk.kotlin.common.core.exception.ApiFailure)) {
                java.lang.Throwable throwable = ((com.ingo.sdk.kotlin.common.core.exception.ApiFailure) failure).getThrowable();
                if (throwable instanceof com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) {
                    confirmCheckAmountFragment.exitOnUnplannedApiError(failure, com.ingo.sdk.kotlin.common.constants.IngoModules.CONFIRM_CHECK_AMOUNT, (com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) throwable, confirmCheckAmountFragment.getTransactionReferenceNumberFromArgs());
                    return;
                } else {
                    confirmCheckAmountFragment.handleUnplannedExceptionWithRetry(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.$r8$lambda$CTaJveatE7K4f5PZVVnkVYSupWI(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.this);
                        }
                    }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.m10684$r8$lambda$gmEVsCJA1CGpXHEBMe0JBWxDlQ(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.this);
                        }
                    }, com.ingo.sdk.kotlin.common.constants.IngoModules.CONFIRM_CHECK_AMOUNT, false, confirmCheckAmountFragment.getTransactionReferenceNumberFromArgs());
                    return;
                }
            }
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "UNKNOWN FAILURE WITH RETRY ".concat(java.lang.String.valueOf(failure)), null, 2, null);
            confirmCheckAmountFragment.handleUnplannedExceptionWithRetry(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.$r8$lambda$uuWKd6WQwIvxi50JQjNSotONf1c(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.this);
                }
            }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.$r8$lambda$3gtd2NDOg4gRGKf5Y4sgL2ldZUg(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment.this);
                }
            }, com.ingo.sdk.kotlin.common.constants.IngoModules.CONFIRM_CHECK_AMOUNT, false, confirmCheckAmountFragment.getTransactionReferenceNumberFromArgs());
        }

        public static final /* synthetic */ void access$trackChangeAmountPressed(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment) {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj != null) {
                java.util.Map<java.lang.String, java.lang.String> defaultProperties = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties(confirmCheckAmountFragment.getTransactionReferenceNumberFromArgs());
                defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.ConfirmAmount);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.ChangeAmountPressed, defaultProperties);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }

        public static final /* synthetic */ void access$trackConfirmAmountPressed(com.ingo.sdk.android.ux.feature.transaction.confirm_amount.ConfirmCheckAmountFragment confirmCheckAmountFragment) {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj != null) {
                java.util.Map<java.lang.String, java.lang.String> defaultProperties = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties(confirmCheckAmountFragment.getTransactionReferenceNumberFromArgs());
                defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.ConfirmAmount);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.ConfirmAmountPressed, defaultProperties);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }
    }
