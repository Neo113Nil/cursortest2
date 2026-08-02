package com.ingo.sdk.android.ux.feature.more_menu;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/more_menu/MoreMenuFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MoreMenuFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.Menu;
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        final androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1266628703, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                        final com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment moreMenuFragment = this.getHighSpeedVideoSizes;
                        final androidx.compose.ui.platform.ComposeView composeView = this.getHighSpeedVideoFpsRangesFor;
                        kotlin.jvm.functions.Function0 function0 = 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001d: CONSTRUCTOR (r1v0 'function0' kotlin.jvm.functions.Function0) = 
                              (r8v4 'moreMenuFragment' com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment A[DONT_INLINE])
                              (r0v1 'composeView' androidx.compose.ui.platform.ComposeView A[DONT_INLINE])
                             A[DECLARE_VAR, MD:(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment, androidx.compose.ui.platform.ComposeView):void (m)] call: com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment, androidx.compose.ui.platform.ComposeView):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            this = this;
                            androidx.compose.runtime.Composer r7 = (androidx.compose.runtime.Composer) r7
                            java.lang.Number r8 = (java.lang.Number) r8
                            int r8 = r8.intValue()
                            r8 = r8 & 11
                            r0 = 2
                            if (r8 != r0) goto L17
                            boolean r8 = r7.getSkipping()
                            if (r8 == 0) goto L17
                            r7.skipToGroupEnd()
                            goto L4f
                        L17:
                            com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0 r1 = new com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0
                            com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment r8 = r6.getHighSpeedVideoSizes
                            androidx.compose.ui.platform.ComposeView r0 = r6.getHighSpeedVideoFpsRangesFor
                            r1.<init>(r8, r0)
                            com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1 r2 = new com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1
                            com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment r8 = r6.getHighSpeedVideoSizes
                            androidx.compose.ui.platform.ComposeView r0 = r6.getHighSpeedVideoFpsRangesFor
                            r2.<init>(r8, r0)
                            com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda2 r3 = new com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda2
                            com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment r8 = r6.getHighSpeedVideoSizes
                            androidx.compose.ui.platform.ComposeView r0 = r6.getHighSpeedVideoFpsRangesFor
                            r3.<init>(r8, r0)
                            com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda3 r4 = new com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda3
                            com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment r8 = r6.getHighSpeedVideoSizes
                            androidx.compose.ui.platform.ComposeView r0 = r6.getHighSpeedVideoFpsRangesFor
                            r4.<init>(r8, r0)
                            com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda4 r5 = new com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1$1$$ExternalSyntheticLambda4
                            com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment r8 = r6.getHighSpeedVideoSizes
                            androidx.compose.ui.platform.ComposeView r0 = r6.getHighSpeedVideoFpsRangesFor
                            r5.<init>(r8, r0)
                            com.ingo.sdk.android.ux.viewprovider.MoreMenuViewProvider r8 = new com.ingo.sdk.android.ux.viewprovider.MoreMenuViewProvider
                            r0 = r8
                            r0.<init>(r1, r2, r3, r4, r5)
                            int r0 = com.ingo.sdk.android.ux.viewprovider.MoreMenuViewProvider.$stable
                            r8.View(r7, r0)
                        L4f:
                            kotlin.Unit r7 = kotlin.Unit.INSTANCE
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment moreMenuFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment.access$trackCheckStatusPressed(moreMenuFragment);
                        com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.ViewKt.findNavController(composeView), com.ingo.sdk.android.R.id.action_moreMenuFragment_to_historyFragment, null, null, null, 14, null);
                        return kotlin.Unit.INSTANCE;
                    }

                    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment moreMenuFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment.access$trackTermsAndConditionsClicked(moreMenuFragment);
                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.IngoSdkConfiguration.class));
                        if (obj != null) {
                            com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration = (com.ingo.sdk.kotlin.common.IngoSdkConfiguration) obj;
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.KEY_TITLE, composeView.getContext().getString(com.ingo.sdk.android.R.string.ingo_terms_and_conditions_title));
                            java.lang.String baseUrl = ingoSdkConfiguration.getBaseUrl();
                            java.lang.String customerId = ingoSdkConfiguration.getCustomerId();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(baseUrl);
                            sb.append("legal-documents/customers/");
                            sb.append(customerId);
                            sb.append("/accepted-terms-conditions");
                            bundle.putString(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.KEY_URL, sb.toString());
                            bundle.putBoolean(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.KEY_IS_PRIVACY_POLICY, false);
                            androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_moreMenuFragment_to_webViewFragment, bundle);
                            return kotlin.Unit.INSTANCE;
                        }
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.IngoSdkConfiguration");
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment moreMenuFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        moreMenuFragment.trackCustomerSupportPressed();
                        com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.ViewKt.findNavController(composeView), com.ingo.sdk.android.R.id.action_moreMenuFragment_to_customerServiceFragment, null, null, null, 14, null);
                        return kotlin.Unit.INSTANCE;
                    }

                    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment moreMenuFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        moreMenuFragment.trackNavigationPressed();
                        androidx.view.ViewKt.findNavController(composeView).popBackStack();
                        return kotlin.Unit.INSTANCE;
                    }

                    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment moreMenuFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment.access$trackPrivacyPolicyClicked(moreMenuFragment);
                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.IngoSdkConfiguration.class));
                        if (obj != null) {
                            com.ingo.sdk.kotlin.common.IngoSdkConfiguration ingoSdkConfiguration = (com.ingo.sdk.kotlin.common.IngoSdkConfiguration) obj;
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putString(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.KEY_TITLE, composeView.getContext().getString(com.ingo.sdk.android.R.string.ingo_privacy_policy_title));
                            java.lang.String baseUrl = ingoSdkConfiguration.getBaseUrl();
                            java.lang.String customerId = ingoSdkConfiguration.getCustomerId();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(baseUrl);
                            sb.append("legal-documents/customers/");
                            sb.append(customerId);
                            sb.append("/accepted-privacy-policy");
                            bundle.putString(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.KEY_URL, sb.toString());
                            bundle.putBoolean(com.ingo.sdk.android.ux.feature.web_view.WebViewFragment.KEY_IS_PRIVACY_POLICY, true);
                            androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_moreMenuFragment_to_webViewFragment, bundle);
                            return kotlin.Unit.INSTANCE;
                        }
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.IngoSdkConfiguration");
                    }

                    AnonymousClass1(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment moreMenuFragment, androidx.compose.ui.platform.ComposeView composeView) {
                        this.getHighSpeedVideoSizes = moreMenuFragment;
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
                            com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(798647579, true, new com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment$onCreateView$1$1.AnonymousClass1(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment.this, composeView), composer2, 54), composer2, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                        } else {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }));
            return composeView;
        }

        public static final /* synthetic */ void access$trackCheckStatusPressed(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment moreMenuFragment) {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj != null) {
                java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
                defaultProperties$default.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, moreMenuFragment.screenName());
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.CheckStatusPressed, defaultProperties$default);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }

        public static final /* synthetic */ void access$trackPrivacyPolicyClicked(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment moreMenuFragment) {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj != null) {
                java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
                defaultProperties$default.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.Menu);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.PrivacyPolicyWebViewPressed, defaultProperties$default);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }

        public static final /* synthetic */ void access$trackTermsAndConditionsClicked(com.ingo.sdk.android.ux.feature.more_menu.MoreMenuFragment moreMenuFragment) {
            java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
            if (obj != null) {
                java.util.Map<java.lang.String, java.lang.String> defaultProperties$default = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties$default(null, 1, null);
                defaultProperties$default.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, com.ingo.sdk.kotlin.common.analytics.IScreenNames.Menu);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.TermsWebViewPressed, defaultProperties$default);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
        }
    }
