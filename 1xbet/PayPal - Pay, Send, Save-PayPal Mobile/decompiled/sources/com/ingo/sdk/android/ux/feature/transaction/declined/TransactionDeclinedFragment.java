package com.ingo.sdk.android.ux.feature.transaction.declined;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/transaction/declined/TransactionDeclinedFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionDeclinedErrorResponse;", "Camera2StreamConfigurationMap", "()Lcom/ingo/sdk/kotlin/common/core/http/response/TransactionDeclinedErrorResponse;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionDeclinedFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        return com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionDeclined;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new androidx.view.OnBackPressedCallback() { // from class: com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreate$1
            {
                super(true);
            }

            @Override // androidx.view.OnBackPressedCallback
            public final void handleOnBackPressed() {
                com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment.this.trackHardwareBackButton();
                r0.customerExitSdk(com.ingo.sdk.kotlin.common.constants.IngoModules.TRANSACTION_DECLINED, r0.getTransactionReferenceNumberFromArgs(), com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment.this.Camera2StreamConfigurationMap());
            }
        });
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        final androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1973050788, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                final /* synthetic */ com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse Camera2StreamConfigurationMap;
                    com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse Camera2StreamConfigurationMap2;
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.ux.IngoSdkTheme.class));
                        if (obj != null) {
                            com.ingo.sdk.kotlin.ux.IngoSdkTheme ingoSdkTheme = (com.ingo.sdk.kotlin.ux.IngoSdkTheme) obj;
                            Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
                            java.lang.String title = Camera2StreamConfigurationMap.getTitle();
                            Camera2StreamConfigurationMap2 = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
                            java.lang.String detail = Camera2StreamConfigurationMap2.getDetail();
                            java.lang.String string = this.getHighSpeedVideoFpsRangesFor.getString(com.ingo.sdk.android.R.string.ingo_customer_support);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                            java.lang.String string2 = this.getHighSpeedVideoFpsRangesFor.getString(com.ingo.sdk.android.R.string.ingo_done);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                            java.lang.String string3 = this.getHighSpeedVideoSizes.getContext().getString(com.ingo.sdk.android.R.string.ingo_declined_content_img_description);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                            int i = com.ingo.sdk.android.R.drawable.ic_failure_status;
                            java.lang.Object obj2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.appcompat.app.AppCompatDelegate.class));
                            if (obj2 == null) {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                            }
                            int parseColor = android.graphics.Color.parseColor((com.ingo.sdk.android.core.ux.theme.ThemeKt.isNightMode((androidx.appcompat.app.AppCompatDelegate) obj2, composer2, 8) ? ingoSdkTheme.getDark() : ingoSdkTheme.getLight()).getErrorColor());
                            final com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment transactionDeclinedFragment = this.getHighSpeedVideoFpsRangesFor;
                            kotlin.jvm.functions.Function0 function0 = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x009c: CONSTRUCTOR (r7v2 'function0' kotlin.jvm.functions.Function0) = 
                                  (r3v13 'transactionDeclinedFragment' com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment A[DONT_INLINE])
                                 A[DECLARE_VAR, MD:(com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment):void (m)] (LINE:4070) call: com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 31 more
                                */
                            /*
                                this = this;
                                r0 = r19
                                r1 = r20
                                androidx.compose.runtime.Composer r1 = (androidx.compose.runtime.Composer) r1
                                r2 = r21
                                java.lang.Number r2 = (java.lang.Number) r2
                                int r2 = r2.intValue()
                                r2 = r2 & 11
                                r3 = 2
                                if (r2 != r3) goto L1e
                                boolean r2 = r1.getSkipping()
                                if (r2 == 0) goto L1e
                                r1.skipToGroupEnd()
                                goto Lc3
                            L1e:
                                java.util.Map r2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState()
                                java.lang.Class<com.ingo.sdk.kotlin.ux.IngoSdkTheme> r3 = com.ingo.sdk.kotlin.ux.IngoSdkTheme.class
                                kotlin.reflect.KClass r3 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r3)
                                java.lang.Object r2 = r2.get(r3)
                                if (r2 == 0) goto Lce
                                com.ingo.sdk.kotlin.ux.IngoSdkTheme r2 = (com.ingo.sdk.kotlin.ux.IngoSdkTheme) r2
                                com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment r3 = r0.getHighSpeedVideoFpsRangesFor
                                com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse r3 = com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment.access$declinedResponse(r3)
                                java.lang.String r5 = r3.getTitle()
                                com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment r3 = r0.getHighSpeedVideoFpsRangesFor
                                com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse r3 = com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment.access$declinedResponse(r3)
                                java.lang.String r6 = r3.getDetail()
                                com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment r3 = r0.getHighSpeedVideoFpsRangesFor
                                int r4 = com.ingo.sdk.android.R.string.ingo_customer_support
                                java.lang.String r12 = r3.getString(r4)
                                java.lang.String r3 = ""
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
                                com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment r4 = r0.getHighSpeedVideoFpsRangesFor
                                int r7 = com.ingo.sdk.android.R.string.ingo_done
                                java.lang.String r10 = r4.getString(r7)
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r3)
                                androidx.compose.ui.platform.ComposeView r4 = r0.getHighSpeedVideoSizes
                                android.content.Context r4 = r4.getContext()
                                int r7 = com.ingo.sdk.android.R.string.ingo_declined_content_img_description
                                java.lang.String r15 = r4.getString(r7)
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r3)
                                int r14 = com.ingo.sdk.android.R.drawable.ic_failure_status
                                java.util.Map r3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState()
                                java.lang.Class<androidx.appcompat.app.AppCompatDelegate> r4 = androidx.appcompat.app.AppCompatDelegate.class
                                kotlin.reflect.KClass r4 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r4)
                                java.lang.Object r3 = r3.get(r4)
                                if (r3 == 0) goto Lc6
                                androidx.appcompat.app.AppCompatDelegate r3 = (androidx.appcompat.app.AppCompatDelegate) r3
                                r4 = 8
                                boolean r3 = com.ingo.sdk.android.core.ux.theme.ThemeKt.isNightMode(r3, r1, r4)
                                if (r3 == 0) goto L8c
                                com.ingo.sdk.kotlin.ux.IngoSdkColorTheme r2 = r2.getDark()
                                goto L90
                            L8c:
                                com.ingo.sdk.kotlin.ux.IngoSdkColorTheme r2 = r2.getLight()
                            L90:
                                java.lang.String r2 = r2.getErrorColor()
                                int r2 = android.graphics.Color.parseColor(r2)
                                com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0 r7 = new com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0
                                com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment r3 = r0.getHighSpeedVideoFpsRangesFor
                                r7.<init>(r3)
                                com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1 r11 = new com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda1
                                com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment r3 = r0.getHighSpeedVideoFpsRangesFor
                                r11.<init>(r3)
                                com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda2 r13 = new com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1$1$$ExternalSyntheticLambda2
                                com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment r3 = r0.getHighSpeedVideoFpsRangesFor
                                androidx.compose.ui.platform.ComposeView r4 = r0.getHighSpeedVideoSizes
                                r13.<init>(r3, r4)
                                com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProvider r3 = new com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProvider
                                r8 = 0
                                r9 = 0
                                r17 = 24
                                r18 = 0
                                r4 = r3
                                r16 = r15
                                r15 = r2
                                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                                int r2 = com.ingo.sdk.android.ux.viewprovider.TerminalScreenViewProvider.$stable
                                r3.View(r1, r2)
                            Lc3:
                                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                                return r1
                            Lc6:
                                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                                java.lang.String r2 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate"
                                r1.<init>(r2)
                                throw r1
                            Lce:
                                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                                java.lang.String r2 = "null cannot be cast to non-null type com.ingo.sdk.kotlin.ux.IngoSdkTheme"
                                r1.<init>(r2)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }

                        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment transactionDeclinedFragment) {
                            transactionDeclinedFragment.trackNavigationPressed();
                            transactionDeclinedFragment.customerExitSdk(com.ingo.sdk.kotlin.common.constants.IngoModules.TRANSACTION_DECLINED, transactionDeclinedFragment.getTransactionReferenceNumberFromArgs(), transactionDeclinedFragment.Camera2StreamConfigurationMap());
                            return kotlin.Unit.INSTANCE;
                        }

                        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment transactionDeclinedFragment) {
                            transactionDeclinedFragment.customerExitSdk(com.ingo.sdk.kotlin.common.constants.IngoModules.TRANSACTION_DECLINED, transactionDeclinedFragment.getTransactionReferenceNumberFromArgs(), transactionDeclinedFragment.Camera2StreamConfigurationMap());
                            return kotlin.Unit.INSTANCE;
                        }

                        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment transactionDeclinedFragment, androidx.compose.ui.platform.ComposeView composeView) {
                            transactionDeclinedFragment.trackCustomerSupportPressed();
                            com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.ViewKt.findNavController(composeView), com.ingo.sdk.android.R.id.action_transactionDeclinedFragment_to_customerServiceFragment, null, null, null, 14, null);
                            return kotlin.Unit.INSTANCE;
                        }

                        AnonymousClass1(com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment transactionDeclinedFragment, androidx.compose.ui.platform.ComposeView composeView) {
                            this.getHighSpeedVideoFpsRangesFor = transactionDeclinedFragment;
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
                                com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(783547680, true, new com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment$onCreateView$1$1.AnonymousClass1(com.ingo.sdk.android.ux.feature.transaction.declined.TransactionDeclinedFragment.this, composeView), composer2, 54), composer2, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
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
            public final com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse Camera2StreamConfigurationMap() {
                java.lang.String str;
                kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                android.os.Bundle arguments = getArguments();
                if (arguments == null || (str = arguments.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_TRANSACTION_DECLINED_RESPONSE)) == null) {
                    str = "";
                }
                json.getSerializersModule();
                return (com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse) json.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.TransactionDeclinedErrorResponse.INSTANCE.serializer(), str);
            }
        }
