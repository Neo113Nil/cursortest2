package com.ingo.sdk.android.ux.feature.history.detail;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/ingo/sdk/android/ux/feature/history/detail/TransactionDetailFragment;", "Lcom/ingo/sdk/android/common/core/platform/SdkComposeFragment;", "<init>", "()V", "", "screenName", "()Ljava/lang/String;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/ingo/sdk/android/ux/feature/history/detail/TransactionImageViewModelImpl;", "getHighSpeedVideoFpsRanges", "Lcom/ingo/sdk/android/ux/feature/history/detail/TransactionImageViewModelImpl;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/MutableState;", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/MutableState;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransactionDetailFragment extends com.ingo.sdk.android.common.core.platform.SdkComposeFragment {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl Camera2StreamConfigurationMap = new com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl(null, 1, null);
    private final androidx.compose.runtime.MutableState<byte[]> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment
    public final java.lang.String screenName() {
        android.os.Bundle arguments = getArguments();
        if ((arguments != null ? arguments.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_REQUIRED_RESPONSE) : null) != null) {
            return com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionRequiresVoid;
        }
        android.os.Bundle arguments2 = getArguments();
        return (arguments2 != null ? arguments2.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_SOFT_DECLINED_RESPONSE) : null) != null ? com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionRequiresVoid : com.ingo.sdk.kotlin.common.analytics.IScreenNames.TransactionDetails;
    }

    @Override // com.ingo.sdk.android.common.core.platform.SdkComposeFragment, com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(android.os.Bundle savedInstanceState) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        super.onCreate(savedInstanceState);
        com.ingo.sdk.android.ux.feature.history.detail.TransactionImageViewModelImpl transactionImageViewModelImpl = this.Camera2StreamConfigurationMap;
        com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment = this;
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(transactionDetailFragment, transactionImageViewModelImpl.getFailure(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment.$r8$lambda$oWkhdTIuRelDtLRBlgBR3iwDqCw(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment.this, (com.ingo.sdk.kotlin.common.core.exception.Failure) obj);
            }
        });
        com.ingo.sdk.kotlin.common.extension.LifecycleKt.observe(transactionDetailFragment, transactionImageViewModelImpl.getImageBytes(), new kotlin.jvm.functions.Function1() { // from class: com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment.m10660$r8$lambda$mxLowIcvb6eCTxm_v7lJ313UM(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment.this, (byte[]) obj);
            }
        });
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if ((arguments != null ? arguments.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_TRANSACTION_DETAILS) : null) != null) {
            kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
            android.os.Bundle arguments2 = getArguments();
            if (arguments2 != null && (string3 = arguments2.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_TRANSACTION_DETAILS)) != null) {
                str = string3;
            }
            json.getSerializersModule();
            this.Camera2StreamConfigurationMap.getTransactionImage(((com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails) json.decodeFromString(com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails.INSTANCE.serializer(), str)).getCheckDetails().getCheckImageThumbnailUrl());
            return;
        }
        android.os.Bundle arguments3 = getArguments();
        if ((arguments3 != null ? arguments3.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_REQUIRED_RESPONSE) : null) != null) {
            kotlinx.serialization.json.Json json2 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
            android.os.Bundle arguments4 = getArguments();
            if (arguments4 != null && (string2 = arguments4.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_REQUIRED_RESPONSE)) != null) {
                str = string2;
            }
            json2.getSerializersModule();
            this.Camera2StreamConfigurationMap.getTransactionImage(((com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse) json2.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse.INSTANCE.serializer(), str)).getTransaction().getFrontImageThumbnailUrl());
            return;
        }
        android.os.Bundle arguments5 = getArguments();
        if ((arguments5 != null ? arguments5.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_SOFT_DECLINED_RESPONSE) : null) != null) {
            kotlinx.serialization.json.Json json3 = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
            android.os.Bundle arguments6 = getArguments();
            if (arguments6 != null && (string = arguments6.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_VOID_IMAGE_SOFT_DECLINED_RESPONSE)) != null) {
                str = string;
            }
            json3.getSerializersModule();
            this.Camera2StreamConfigurationMap.getTransactionImage(((com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse) json3.decodeFromString(com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse.INSTANCE.serializer(), str)).getTransaction().getFrontImageThumbnailUrl());
        }
    }

    @Override // com.ingo.sdk.kotlin.common.platform.BaseFragment, androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inflater, "");
        android.content.Context requireContext = requireContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requireContext, "");
        final androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(requireContext, null, 0, 6, null);
        composeView.setContent(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(330666435, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment$onCreateView$1$1

            @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment$onCreateView$1$1$1, reason: invalid class name */
            static final class AnonymousClass1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
                final /* synthetic */ com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment getHighSpeedVideoFpsRangesFor;
                final /* synthetic */ androidx.compose.ui.platform.ComposeView getHighSpeedVideoSizes;

                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
                    androidx.compose.runtime.MutableState mutableState;
                    java.lang.String string;
                    androidx.compose.runtime.MutableState mutableState2;
                    java.lang.String string2;
                    androidx.compose.runtime.MutableState mutableState3;
                    java.lang.String string3;
                    androidx.compose.runtime.Composer composer2 = composer;
                    if ((num.intValue() & 11) != 2 || !composer2.getSkipping()) {
                        android.os.Bundle arguments = this.getHighSpeedVideoFpsRangesFor.getArguments();
                        java.lang.String str = "";
                        if ((arguments != null ? arguments.get(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_TRANSACTION_DETAILS) : null) != null) {
                            composer2.startReplaceGroup(1161019806);
                            kotlinx.serialization.json.Json json = com.ingo.sdk.kotlin.ux.IngoCoreKt.getJson();
                            android.os.Bundle arguments2 = this.getHighSpeedVideoFpsRangesFor.getArguments();
                            if (arguments2 != null && (string3 = arguments2.getString(com.ingo.sdk.android.ux.activity.IngoSdkActivity.KEY_TRANSACTION_DETAILS)) != null) {
                                str = string3;
                            }
                            json.getSerializersModule();
                            com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails transactionDetails = (com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails) json.decodeFromString(com.ingo.sdk.kotlin.common.features.history.model.TransactionDetails.INSTANCE.serializer(), str);
                            final com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment = this.getHighSpeedVideoFpsRangesFor;
                            final androidx.compose.ui.platform.ComposeView composeView = this.getHighSpeedVideoSizes;
                            kotlin.jvm.functions.Function0 function0 = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005e: CONSTRUCTOR (r0v19 'function0' kotlin.jvm.functions.Function0) = 
                                  (r1v11 'transactionDetailFragment' com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment A[DONT_INLINE])
                                  (r2v10 'composeView' androidx.compose.ui.platform.ComposeView A[DONT_INLINE])
                                 A[DECLARE_VAR, MD:(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment, androidx.compose.ui.platform.ComposeView):void (m)] (LINE:7110) call: com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0.<init>(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment, androidx.compose.ui.platform.ComposeView):void type: CONSTRUCTOR in method: com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment$onCreateView$1$1.1.invoke(androidx.compose.runtime.Composer, java.lang.Integer):kotlin.Unit, file: classes9.dex
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment$onCreateView$1$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 27 more
                                */
                            /*
                                Method dump skipped, instructions count: 337
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment$onCreateView$1$1.AnonymousClass1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                        }

                        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment, com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse voidImageSoftDeclinedResponse) {
                            transactionDetailFragment.trackNavigationPressed();
                            transactionDetailFragment.customerExitSdk(com.ingo.sdk.kotlin.common.constants.IngoModules.CAPTURE_VOID_IMAGE, voidImageSoftDeclinedResponse.getTransaction().getTransactionReferenceNumber(), voidImageSoftDeclinedResponse);
                            return kotlin.Unit.INSTANCE;
                        }

                        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment, androidx.compose.ui.platform.ComposeView composeView) {
                            transactionDetailFragment.trackCustomerSupportPressed();
                            com.ingo.sdk.kotlin.common.extension.NavControllerKt.navigateSafe$default(androidx.view.ViewKt.findNavController(composeView), com.ingo.sdk.android.R.id.action_transactionDetailFragment_to_customerServiceFragment, null, null, null, 14, null);
                            return kotlin.Unit.INSTANCE;
                        }

                        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment, androidx.compose.ui.platform.ComposeView composeView) {
                            transactionDetailFragment.trackNavigationPressed();
                            androidx.view.ViewKt.findNavController(composeView).popBackStack();
                            return kotlin.Unit.INSTANCE;
                        }

                        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment, com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse voidImageSoftDeclinedResponse, androidx.compose.ui.platform.ComposeView composeView) {
                            com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment.access$trackResumeVoidRequiredTransaction(transactionDetailFragment, voidImageSoftDeclinedResponse.getTransaction().getTransactionReferenceNumber());
                            androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_transactionDetailFragment_to_captureVoidImageFragment, transactionDetailFragment.getArguments());
                            return kotlin.Unit.INSTANCE;
                        }

                        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment, com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse voidImageSoftDeclinedResponse) {
                            transactionDetailFragment.trackNavigationPressed();
                            transactionDetailFragment.customerExitSdk(com.ingo.sdk.kotlin.common.constants.IngoModules.VOID_IMAGE_SOFT_DECLINED, voidImageSoftDeclinedResponse.getTransaction().getTransactionReferenceNumber(), voidImageSoftDeclinedResponse);
                            return kotlin.Unit.INSTANCE;
                        }

                        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment, com.ingo.sdk.kotlin.common.core.http.response.VoidImageSoftDeclinedResponse voidImageSoftDeclinedResponse, androidx.compose.ui.platform.ComposeView composeView) {
                            com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment.access$trackResumeVoidRequiredTransaction(transactionDetailFragment, voidImageSoftDeclinedResponse.getTransaction().getTransactionReferenceNumber());
                            androidx.view.ViewKt.findNavController(composeView).navigate(com.ingo.sdk.android.R.id.action_transactionDetailFragment_to_captureVoidImageFragment, transactionDetailFragment.getArguments());
                            return kotlin.Unit.INSTANCE;
                        }

                        AnonymousClass1(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment, androidx.compose.ui.platform.ComposeView composeView) {
                            this.getHighSpeedVideoFpsRangesFor = transactionDetailFragment;
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
                                com.ingo.sdk.android.core.ux.theme.ThemeKt.IngoSdkMaterialTheme((androidx.appcompat.app.AppCompatDelegate) obj, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(384684423, true, new com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment$onCreateView$1$1.AnonymousClass1(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment.this, composeView), composer2, 54), composer2, my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY, 2);
                            } else {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.appcompat.app.AppCompatDelegate");
                            }
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }));
                return composeView;
            }

            /* renamed from: $r8$lambda$mxL-owIcvb6eCTxm_v7lJ3-13UM, reason: not valid java name */
            public static /* synthetic */ kotlin.Unit m10660$r8$lambda$mxLowIcvb6eCTxm_v7lJ313UM(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment, byte[] bArr) {
                transactionDetailFragment.getHighResolutionOutputSizeshNQ4ISI.setValue(bArr);
                return kotlin.Unit.INSTANCE;
            }

            public static /* synthetic */ kotlin.Unit $r8$lambda$oWkhdTIuRelDtLRBlgBR3iwDqCw(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment, com.ingo.sdk.kotlin.common.core.exception.Failure failure) {
                java.lang.String str;
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger ingoLogging = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging();
                if (failure == null || (str = failure.toString()) == null) {
                    str = "Failure Block Triggered With No Data";
                }
                com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(ingoLogging, str, null, null, 6, null);
                transactionDetailFragment.getHighResolutionOutputSizeshNQ4ISI.setValue(new byte[0]);
                return kotlin.Unit.INSTANCE;
            }

            public static final /* synthetic */ void access$trackResumeVoidRequiredTransaction(com.ingo.sdk.android.ux.feature.history.detail.TransactionDetailFragment transactionDetailFragment, java.lang.String str) {
                java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
                if (obj != null) {
                    java.util.Map<java.lang.String, java.lang.String> defaultProperties = com.ingo.sdk.kotlin.common.analytics.IngoAnalyticsKt.defaultProperties(str);
                    defaultProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ScreenName, transactionDetailFragment.screenName());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.ResumeVoidRequiredTransaction, defaultProperties);
                    return;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
            }
        }
