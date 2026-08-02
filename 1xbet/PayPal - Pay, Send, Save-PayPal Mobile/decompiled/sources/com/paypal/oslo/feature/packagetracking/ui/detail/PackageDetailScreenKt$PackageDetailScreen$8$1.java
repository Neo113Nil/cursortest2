package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreen$8$1", f = "PackageDetailScreen.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, nl = {269}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class PackageDetailScreenKt$PackageDetailScreen$8$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.ClipboardManager Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getInputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getInputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider, kotlin.Unit> getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getOutputSizes;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState getOutputStallDuration;
    final /* synthetic */ androidx.compose.runtime.MutableIntState getOutputStallDurationlomOqCM;
    int getValidOutputFormatsForInputhNQ4ISI;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreen$8$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ android.content.ClipboardManager Camera2StreamConfigurationMap;
        final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoSizesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider, kotlin.Unit> getInputFormats;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getInputSizeshNQ4ISI;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getOutputFormats;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getOutputMinFrameDuration;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getOutputSizes;
        final /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState getOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getOutputStallDuration;
        final /* synthetic */ androidx.compose.runtime.MutableIntState getOutputStallDurationlomOqCM;

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(1:(3:14|15|16)(2:18|19))(3:20|21|22))(3:23|24|25))(5:26|27|28|24|25))(3:30|31|32))(3:33|(1:35)(2:38|(2:40|(1:42)(1:44))(4:46|(1:48)(2:49|(1:51)(2:52|(1:54)(2:55|(1:57)(2:58|(1:60)(2:62|(1:64)(2:65|(1:67)(2:68|(1:70)(2:71|(1:73)(2:74|(1:76)(2:77|(1:79)(2:80|(2:82|(1:84))(2:85|(2:87|(1:89))(2:90|(1:92)(2:93|(1:95)))))))))))))))|24|25))|37)|96|97))|99|6|7|(0)(0)|96|97|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        
            if (r14.showToast(r2, r0) != r1) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
        
            if (r13 == r1) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x011a, code lost:
        
            if (r14.showToast(r2, r0) != r1) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x016c, code lost:
        
            if (r14.showToast(r2, r0) == r1) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x00ff, code lost:
        
            if (r2.showToast(r3, r0) != r1) goto L99;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object emit(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect packageDetailUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1 packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1;
            int i;
            int intValue;
            if (continuation instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1) {
                packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1 = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1) continuation;
                if ((packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                    packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.Camera2StreamConfigurationMap -= 2147483648;
                    java.lang.Object obj = packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.Camera2StreamConfigurationMap;
                    if (i == 0) {
                        if (i == 1) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i == 2) {
                            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect packageDetailUiEffect2 = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect) packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI;
                            kotlin.ResultKt.throwOnFailure(obj);
                            packageDetailUiEffect = packageDetailUiEffect2;
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i == 3) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i == 4) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowToast) {
                        com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState toastHostState = this.getOutputSizeshNQ4ISI;
                        com.paypal.oslo.feature.packagetracking.domain.UiString message = ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowToast) packageDetailUiEffect).getMessage();
                        packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageDetailUiEffect);
                        packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.Camera2StreamConfigurationMap = 1;
                    } else {
                        if (!(packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.CopyToClipboard)) {
                            if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowPackageOptionsSheet) {
                                this.getInputSizeshNQ4ISI.showSheet();
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowRemovePackageSheet) {
                                this.getHighSpeedVideoSizesFor.showSheet();
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowRenamePackageSheet) {
                                this.getOutputStallDuration.showSheet();
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowMarkAsDeliveredSheet) {
                                this.getHighSpeedVideoFpsRanges.showSheet();
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.MarkAsDeliveredSuccess) {
                                this.getHighSpeedVideoFpsRanges.hideSheet();
                                com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState toastHostState2 = this.getOutputSizeshNQ4ISI;
                                com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource invoke = com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_mark_as_delivered_success);
                                packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageDetailUiEffect);
                                packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.Camera2StreamConfigurationMap = 5;
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.HideMarkAsDeliveredSheet) {
                                this.getHighSpeedVideoFpsRanges.hideSheet();
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowPackageRemovedSuccess) {
                                this.getHighSpeedVideoSizesFor.hideSheet();
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.HideRemovePackageSheet) {
                                this.getHighSpeedVideoSizesFor.hideSheet();
                                intValue = this.getOutputStallDurationlomOqCM.getIntValue();
                                this.getOutputStallDurationlomOqCM.setIntValue(intValue + 1);
                                kotlin.coroutines.jvm.internal.Boxing.boxInt(intValue);
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateBack) {
                                this.getOutputFormats.invoke();
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettings) {
                                this.getOutputMinFrameDuration.invoke();
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettingsForRelink) {
                                this.getInputFormats.invoke(((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.NavigateToPackageSettingsForRelink) packageDetailUiEffect).getEmailProvider());
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenTrackingUrl) {
                                java.lang.String url = ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenTrackingUrl) packageDetailUiEffect).getUrl();
                                if (url != null) {
                                    this.getOutputSizes.setValue(url);
                                }
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenOrderManagementUrl) {
                                java.lang.String url2 = ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.OpenOrderManagementUrl) packageDetailUiEffect).getUrl();
                                if (url2 != null) {
                                    this.getOutputSizes.setValue(url2);
                                }
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowAmazonTrackingPreferencesSheet) {
                                this.getHighSpeedVideoSizes.showSheet();
                            } else if (packageDetailUiEffect instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.ShowAmazonEmailNotLinkedSheet) {
                                this.getHighSpeedVideoFpsRangesFor.showSheet();
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                        android.content.ClipboardManager clipboardManager = this.Camera2StreamConfigurationMap;
                        if (clipboardManager != null) {
                            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(com.paypal.oslo.feature.packagetracking.domain.UiStringKt.resolve(((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.CopyToClipboard) packageDetailUiEffect).getLabel(), this.getHighResolutionOutputSizeshNQ4ISI), ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.CopyToClipboard) packageDetailUiEffect).getText()));
                            com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState toastHostState3 = this.getOutputSizeshNQ4ISI;
                            com.paypal.oslo.feature.packagetracking.domain.UiString confirmationMessage = ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiEffect.CopyToClipboard) packageDetailUiEffect).getConfirmationMessage();
                            packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageDetailUiEffect);
                            packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.Camera2StreamConfigurationMap = 2;
                            java.lang.Object showToast = toastHostState3.showToast(confirmationMessage, packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1);
                            packageDetailUiEffect = showToast;
                        } else {
                            com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState toastHostState4 = this.getOutputSizeshNQ4ISI;
                            com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource invoke2 = com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_copy_failed);
                            packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageDetailUiEffect);
                            packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.Camera2StreamConfigurationMap = 4;
                        }
                    }
                    return coroutine_suspended;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "Failed to copy to clipboard", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e)), null, 4, null);
                    com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState toastHostState5 = this.getOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource invoke3 = com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_copy_failed);
                    packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageDetailUiEffect);
                    packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e);
                    packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.Camera2StreamConfigurationMap = 3;
                }
            }
            packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1 = new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1(this, continuation);
            java.lang.Object obj2 = packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.getHighSpeedVideoSizes;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.Camera2StreamConfigurationMap;
            if (i == 0) {
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "Failed to copy to clipboard", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e)), null, 4, null);
            com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState toastHostState52 = this.getOutputSizeshNQ4ISI;
            com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource invoke32 = com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_copy_failed);
            packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(packageDetailUiEffect);
            packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(e);
            packageDetailScreenKt$PackageDetailScreen$8$1$1$emit$1.Camera2StreamConfigurationMap = 3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState toastHostState, android.content.ClipboardManager clipboardManager, android.content.Context context, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.pds.components.BottomSheetController bottomSheetController3, com.paypal.pds.components.BottomSheetController bottomSheetController4, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider, kotlin.Unit> function1, com.paypal.pds.components.BottomSheetController bottomSheetController5, com.paypal.pds.components.BottomSheetController bottomSheetController6, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableState<java.lang.String> mutableState) {
            this.getOutputSizeshNQ4ISI = toastHostState;
            this.Camera2StreamConfigurationMap = clipboardManager;
            this.getHighResolutionOutputSizeshNQ4ISI = context;
            this.getInputSizeshNQ4ISI = bottomSheetController;
            this.getHighSpeedVideoSizesFor = bottomSheetController2;
            this.getOutputStallDuration = bottomSheetController3;
            this.getHighSpeedVideoFpsRanges = bottomSheetController4;
            this.getOutputFormats = function0;
            this.getOutputMinFrameDuration = function02;
            this.getInputFormats = function1;
            this.getHighSpeedVideoSizes = bottomSheetController5;
            this.getHighSpeedVideoFpsRangesFor = bottomSheetController6;
            this.getOutputStallDurationlomOqCM = mutableIntState;
            this.getOutputSizes = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getValidOutputFormatsForInputhNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getValidOutputFormatsForInputhNQ4ISI = 1;
            if (this.getOutputMinFrameDurationlomOqCM.getUiEffect().collect(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreen$8$1.AnonymousClass1(this.getOutputStallDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getOutputStallDurationlomOqCM, this.getOutputSizes), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreen$8$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreen$8$1(this.getOutputMinFrameDurationlomOqCM, this.getOutputStallDuration, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getInputFormats, this.getHighSpeedVideoSizesFor, this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getInputSizeshNQ4ISI, this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getOutputStallDurationlomOqCM, this.getOutputSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PackageDetailScreenKt$PackageDetailScreen$8$1(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.ui.detail.ToastHostState toastHostState, android.content.ClipboardManager clipboardManager, android.content.Context context, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, com.paypal.pds.components.BottomSheetController bottomSheetController3, com.paypal.pds.components.BottomSheetController bottomSheetController4, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider, kotlin.Unit> function1, com.paypal.pds.components.BottomSheetController bottomSheetController5, com.paypal.pds.components.BottomSheetController bottomSheetController6, androidx.compose.runtime.MutableIntState mutableIntState, androidx.compose.runtime.MutableState<java.lang.String> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailScreenKt$PackageDetailScreen$8$1> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDurationlomOqCM = packageDetailViewModel;
        this.getOutputStallDuration = toastHostState;
        this.Camera2StreamConfigurationMap = clipboardManager;
        this.getHighSpeedVideoFpsRanges = context;
        this.getInputFormats = bottomSheetController;
        this.getHighSpeedVideoSizesFor = bottomSheetController2;
        this.getOutputSizeshNQ4ISI = bottomSheetController3;
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController4;
        this.getOutputMinFrameDuration = function0;
        this.getInputSizeshNQ4ISI = function02;
        this.getOutputFormats = function1;
        this.getHighSpeedVideoFpsRangesFor = bottomSheetController5;
        this.getHighSpeedVideoSizes = bottomSheetController6;
        this.getOutputStallDurationlomOqCM = mutableIntState;
        this.getOutputSizes = mutableState;
    }
}
