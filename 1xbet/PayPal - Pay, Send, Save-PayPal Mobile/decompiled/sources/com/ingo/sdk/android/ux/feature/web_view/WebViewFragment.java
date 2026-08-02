package com.ingo.sdk.android.ux.feature.web_view;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/web_view/WebViewFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/ingo/sdk/android/ux/feature/web_view/GetHtmlContentViewModelImpl;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/ingo/sdk/android/ux/feature/web_view/GetHtmlContentViewModelImpl;", "Landroidx/compose/runtime/MutableState;", "", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/MutableState;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WebViewFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final java.lang.String KEY_IS_PRIVACY_POLICY = "KEY_PP";
    public static final java.lang.String KEY_TITLE = "KEY_TITLE";
    public static final java.lang.String KEY_URL = "KEY_URL";
    private final com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl getHighResolutionOutputSizeshNQ4ISI = new com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl(null, 1, null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.TRUE, null, 2, null);
    public static final int $stable = 8;

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        android.os.Bundle arguments = getArguments();
        return (arguments == null || !arguments.getBoolean(KEY_IS_PRIVACY_POLICY)) ? com.ingo.sdk.kotlin.common.analytics.IScreenNames.TermsWebView : com.ingo.sdk.kotlin.common.analytics.IScreenNames.PrivacyPolicyWebView;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        java.lang.String str;
        super.onCreate(savedInstanceState);
        com.ingo.sdk.android.ux.feature.web_view.WebViewFragment webViewFragment = this;
        requireActivity().getOnBackPressedDispatcher().addCallback(webViewFragment, new androidx.view.OnBackPressedCallback() { // from class: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$onCreate$1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.this.trackHardwareBackButton();
                androidx.view.fragment.FragmentKt.findNavController(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.this).popBackStack();
            }
        });
        com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl getHtmlContentViewModelImpl = this.getHighResolutionOutputSizeshNQ4ISI;
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(webViewFragment, getHtmlContentViewModelImpl.getFailure(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.$r8$lambda$1YARg3ujQWRx7grPYx_vATv0GSY(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        });
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(webViewFragment, getHtmlContentViewModelImpl.getHtmlContent(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.$r8$lambda$8sVpH3IH7GqvtL4ZQqssGixXpGA(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.this, (java.lang.String) obj);
            }
        });
        com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl getHtmlContentViewModelImpl2 = this.getHighResolutionOutputSizeshNQ4ISI;
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(KEY_URL)) == null) {
            str = "";
        }
        getHtmlContentViewModelImpl2.getHtmlContent(str);
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        final androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1756664460, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$onCreateView$1$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$onCreateView$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                final /* synthetic */ com.ingo.sdk.android.ux.feature.web_view.WebViewFragment getHighResolutionOutputSizeshNQ4ISI;
                final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    java.lang.String str;
                    com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl getHtmlContentViewModelImpl;
                    androidx.compose.runtime.MutableState mutableState;
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                        android.os.Bundle arguments = this.getHighResolutionOutputSizeshNQ4ISI.getArguments();
                        if (arguments == null || (str = arguments.getString(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.KEY_TITLE)) == null) {
                            str = "";
                        }
                        java.lang.String str2 = str;
                        getHtmlContentViewModelImpl = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                        androidx.view.MutableLiveData<java.lang.String> htmlContent = getHtmlContentViewModelImpl.getHtmlContent();
                        androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure> failure = this.getHighResolutionOutputSizeshNQ4ISI.getFailure();
                        androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> failureAction = this.getHighResolutionOutputSizeshNQ4ISI.getFailureAction();
                        androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>> retryAction = this.getHighResolutionOutputSizeshNQ4ISI.getRetryAction();
                        mutableState = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
                        final com.ingo.sdk.android.ux.feature.web_view.WebViewFragment webViewFragment = this.getHighResolutionOutputSizeshNQ4ISI;
                        final androidx.compose.ui.platform.ComposeView composeView = this.getHighSpeedVideoSizes;
                        new com.ingo.sdk.android.ux.viewprovider.WebViewProvider(str2, htmlContent, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005d: INVOKE 
                              (wrap:com.ingo.sdk.android.ux.viewprovider.WebViewProvider:0x0058: CONSTRUCTOR 
                              (r1v0 'str2' java.lang.String)
                              (r2v0 'htmlContent' androidx.lifecycle.MutableLiveData<java.lang.String>)
                              (wrap:kotlin.jvm.functions.Function0:0x0052: CONSTRUCTOR 
                              (r10v14 'webViewFragment' com.ingo.sdk.android.ux.feature.web_view.WebViewFragment A[DONT_INLINE])
                              (r0v1 'composeView' androidx.compose.ui.platform.ComposeView A[DONT_INLINE])
                             A[MD:(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment, androidx.compose.ui.platform.ComposeView):void (m), WRAPPED] (LINE:2118) call: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment, androidx.compose.ui.platform.ComposeView):void type: CONSTRUCTOR)
                              (r4v0 'mutableState' androidx.compose.runtime.MutableState)
                              (r5v0 'failure' androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure>)
                              (r6v0 'failureAction' androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>>)
                              (r7v0 'retryAction' androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>>)
                             A[MD:(java.lang.String, androidx.lifecycle.MutableLiveData<java.lang.String>, kotlin.jvm.functions.Function0<kotlin.Unit>, androidx.compose.runtime.MutableState<java.lang.Boolean>, androidx.compose.runtime.MutableState<com.ingo.sdk.kotlin.common.core.exception.Failure>, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>>, androidx.compose.runtime.MutableState<kotlin.jvm.functions.Function0<kotlin.Unit>>):void (m), WRAPPED] (LINE:2107) call: com.ingo.sdk.android.ux.viewprovider.WebViewProvider.<init>(java.lang.String, androidx.lifecycle.MutableLiveData, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState):void type: CONSTRUCTOR)
                              (r9v1 'composer2' androidx.compose.runtime.Composer)
                              (wrap:int:0x005b: SGET  A[WRAPPED] com.ingo.sdk.android.ux.viewprovider.WebViewProvider.$stable int)
                             VIRTUAL call: com.ingo.sdk.android.ux.viewprovider.WebViewProvider.View(androidx.compose.runtime.Composer, int):void A[MD:(androidx.compose.runtime.Composer, int):void (m)] (LINE:2118) in method: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$onCreateView$1$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:782)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:97)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:878)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
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
                            goto L60
                        L17:
                            com.ingo.sdk.android.ux.feature.web_view.WebViewFragment r10 = r8.getHighResolutionOutputSizeshNQ4ISI
                            android.os.Bundle r10 = r10.getArguments()
                            if (r10 == 0) goto L27
                            java.lang.String r0 = "KEY_TITLE"
                            java.lang.String r10 = r10.getString(r0)
                            if (r10 != 0) goto L29
                        L27:
                            java.lang.String r10 = ""
                        L29:
                            r1 = r10
                            com.ingo.sdk.android.ux.feature.web_view.WebViewFragment r10 = r8.getHighResolutionOutputSizeshNQ4ISI
                            com.ingo.sdk.android.ux.feature.web_view.GetHtmlContentViewModelImpl r10 = com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.access$getGetHtmlContentViewModelImpl$p(r10)
                            androidx.lifecycle.MutableLiveData r2 = r10.getHtmlContent()
                            com.ingo.sdk.android.ux.feature.web_view.WebViewFragment r10 = r8.getHighResolutionOutputSizeshNQ4ISI
                            androidx.compose.runtime.MutableState r5 = r10.getFailure()
                            com.ingo.sdk.android.ux.feature.web_view.WebViewFragment r10 = r8.getHighResolutionOutputSizeshNQ4ISI
                            androidx.compose.runtime.MutableState r6 = r10.getFailureAction()
                            com.ingo.sdk.android.ux.feature.web_view.WebViewFragment r10 = r8.getHighResolutionOutputSizeshNQ4ISI
                            androidx.compose.runtime.MutableState r7 = r10.getRetryAction()
                            com.ingo.sdk.android.ux.feature.web_view.WebViewFragment r10 = r8.getHighResolutionOutputSizeshNQ4ISI
                            androidx.compose.runtime.MutableState r4 = com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.access$getShowProgress$p(r10)
                            com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0 r3 = new com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0
                            com.ingo.sdk.android.ux.feature.web_view.WebViewFragment r10 = r8.getHighResolutionOutputSizeshNQ4ISI
                            androidx.compose.ui.platform.ComposeView r0 = r8.getHighSpeedVideoSizes
                            r3.<init>(r10, r0)
                            com.ingo.sdk.android.ux.viewprovider.WebViewProvider r10 = new com.ingo.sdk.android.ux.viewprovider.WebViewProvider
                            r0 = r10
                            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                            int r0 = com.ingo.sdk.android.ux.viewprovider.WebViewProvider.$stable
                            r10.View(r9, r0)
                        L60:
                            kotlin.Unit r9 = kotlin.Unit.INSTANCE
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$onCreateView$1$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }

                    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment webViewFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        webViewFragment.trackNavigationPressed();
                        androidx.view.ViewKt.findNavController(composeView).popBackStack();
                        return kotlin.Unit.INSTANCE;
                    }

                    AnonymousClass1(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment webViewFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        this.getHighResolutionOutputSizeshNQ4ISI = webViewFragment;
                        this.getHighSpeedVideoSizes = composeView;
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
                            com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-186525128, true, new com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$onCreateView$1$1.AnonymousClass1(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.this, composeView), composer2, 54), composer2, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }));
            return composeView;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$1YARg3ujQWRx7grPYx_vATv0GSY(final com.ingo.sdk.android.ux.feature.web_view.WebViewFragment webViewFragment, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
            webViewFragment.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.FALSE);
            if (failure != null && (failure instanceof com.ingo.sdk.kotlin.common.core.exception.ApiFailure)) {
                java.lang.Throwable throwable = ((com.ingo.sdk.kotlin.common.core.exception.ApiFailure) failure).getThrowable();
                if (throwable instanceof com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) {
                    com.ingo.sdk.kotlin.common.model.ApiErrorThrowable apiErrorThrowable = (com.ingo.sdk.kotlin.common.model.ApiErrorThrowable) throwable;
                    apiErrorThrowable.getErrorResponse();
                    webViewFragment.exitOnUnplannedApiError(failure, com.ingo.sdk.kotlin.common.constants.IngoModules.VIEW_LEGAL_DOCUMENT, apiErrorThrowable, webViewFragment.getTransactionReferenceNumberFromArgs());
                } else {
                    webViewFragment.handleUnplannedExceptionWithRetry(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.$r8$lambda$2QCWx1oUD8mrzmTkcXBu0X80UXk(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.this);
                        }
                    }, com.ingo.sdk.kotlin.common.constants.IngoModules.VIEW_LEGAL_DOCUMENT, false, webViewFragment.getTransactionReferenceNumberFromArgs());
                }
            } else {
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "UNKNOWN FAILURE WITH RETRY ".concat(java.lang.String.valueOf(failure)), null, 2, null);
                webViewFragment.handleUnplannedExceptionWithRetry(new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: com.ingo.sdk.android.ux.feature.web_view.WebViewFragment$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.m10707$r8$lambda$Ek1OKd6AcrdbMkpMDWplfF7kZg(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.this);
                    }
                }, com.ingo.sdk.kotlin.common.constants.IngoModules.VIEW_LEGAL_DOCUMENT, false, webViewFragment.getTransactionReferenceNumberFromArgs());
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$2QCWx1oUD8mrzmTkcXBu0X80UXk(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment webViewFragment) {
            webViewFragment.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.FALSE);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit $r8$lambda$8sVpH3IH7GqvtL4ZQqssGixXpGA(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment webViewFragment, java.lang.String str) {
            webViewFragment.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.FALSE);
            return kotlin.Unit.INSTANCE;
        }

        /* renamed from: $r8$lambda$E-k1OKd6AcrdbMkpMDWplfF7kZg, reason: not valid java name */
        public static /* synthetic */ kotlin.Unit m10707$r8$lambda$Ek1OKd6AcrdbMkpMDWplfF7kZg(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment webViewFragment) {
            webViewFragment.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.FALSE);
            return kotlin.Unit.INSTANCE;
        }
    }
