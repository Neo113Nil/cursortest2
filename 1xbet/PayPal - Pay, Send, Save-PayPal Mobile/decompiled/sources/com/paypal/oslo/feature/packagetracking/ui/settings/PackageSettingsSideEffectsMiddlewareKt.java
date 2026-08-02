package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\r\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a3\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0004\u0010\u000f\u001a%\u0010\u0011\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0004\u001a\u00020\n*\u00020\u0007H\u0002¢\u0006\u0004\b\u0004\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsViewModel;", "Lcom/paypal/oslo/feature/packagetracking/domain/usecase/AuthorizationResult;", "p0", "", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsViewModel;Lcom/paypal/oslo/feature/packagetracking/domain/usecase/AuthorizationResult;)V", "", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "p1", "", "p2", "p3", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsViewModel;Ljava/util/List;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;ZZ)V", "(Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsViewModel;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;ZZZ)V", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkStatus;", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsViewModel;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLinkStatus;)V", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;)Z", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsViewModel;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsUiState;", "Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsEvent;", "getSideEffectsMiddleware", "(Lcom/paypal/oslo/feature/packagetracking/ui/settings/PackageSettingsViewModel;)Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "sideEffectsMiddleware"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageSettingsSideEffectsMiddlewareKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$callCompleteAuthorizationUseCase(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Success success, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1 packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1) {
            packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1 = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1) continuation;
            if ((packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.packagetracking.domain.usecase.CompleteAuthorizationUseCase completeAuthorizationUseCase = packageSettingsViewModel.getCompleteAuthorizationUseCase();
                    com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider provider = success.getProvider();
                    java.lang.String authorizationCode = success.getAuthorizationCode();
                    java.lang.String state = success.getState();
                    packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1.getHighSpeedVideoFpsRangesFor = packageSettingsViewModel;
                    packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(success);
                    packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1.Camera2StreamConfigurationMap = 1;
                    obj = completeAuthorizationUseCase.invoke(provider, authorizationCode, state, packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    packageSettingsViewModel = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel) packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    Camera2StreamConfigurationMap(packageSettingsViewModel, (com.paypal.oslo.feature.packagetracking.domain.usecase.AuthorizationResult) ((arrow.core.Either.Right) either).getValue());
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError = (com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError) ((arrow.core.Either.Left) either).getValue();
                    packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkFailed(packageTrackingError.getMessage(), packageTrackingError.getErrorCode()));
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1 = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1(continuation);
        java.lang.Object obj2 = packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = packageSettingsSideEffectsMiddlewareKt$callCompleteAuthorizationUseCase$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState, com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent> getSideEffectsMiddleware(final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageSettingsViewModel, "");
        return new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState, com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent>() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsUiState, com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent event = input.getEvent();
                if ((event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LoadSettings) || (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RetryLoadSettings)) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r5), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadSettings$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, false, null), 3, null);
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt.access$handleLoadAmazonTrackingPreference(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.ConfirmUnlink) {
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.ConfirmUnlink confirmUnlink = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkEmail.ConfirmUnlink) event;
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleUnlinkEmail$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, confirmUnlink.getEmailProvider(), confirmUnlink.getDeleteImportedData(), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.SettingsLoaded) {
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt.access$dispatchPendingAmazonPreference(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this);
                    return;
                }
                if ((event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.UnlinkSuccess) || (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkSuccess)) {
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this.markLinkStateChanged$package_tracking_prodRelease();
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r5), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadSettings$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, true, null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleGetOAuthUrl$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked) event).getEmailProvider(), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.OAuthFlowCompleted) {
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt.access$handleOAuthFlowCompleted(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.OAuthFlowCompleted) event).getResult());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkDataReceived) {
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt.access$handleDeeplinkDataReceived(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkDataReceived) event).getDeeplinkData());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeepLinkRelinkCheck) {
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeepLinkRelinkCheck deepLinkRelinkCheck = (com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeepLinkRelinkCheck) event;
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt.access$handleDeeplinkRelinkCheck(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, deepLinkRelinkCheck.getLinkedEmailAccounts(), deepLinkRelinkCheck.getEmailProvider(), deepLinkRelinkCheck.getShowErrorBanner(), deepLinkRelinkCheck.isNativePushReminder());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RequiresRelink) {
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt.access$handleRequiresRelink(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RequiresRelink) event).getEmailProvider());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkCancelled) {
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt.access$handleLinkCancelled(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RelinkSheetLinkClicked) {
                    com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt.access$handleRelinkSheetLinkClicked(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RelinkSheetLinkClicked) event).getEmailProvider());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedData.ConfirmDeleteImportedData) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r5), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleDeleteImportedData$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, null), 3, null);
                } else if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.ConfirmDeauthorizeAll) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleDeauthorizeAll$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, ((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAll.ConfirmDeauthorizeAll) event).getDeleteImportedData(), null), 3, null);
                } else if (event instanceof com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggled) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r0), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel.this, r5, !((com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingToggled) event).getEnabled(), null), 3, null);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, com.paypal.oslo.feature.packagetracking.domain.usecase.AuthorizationResult authorizationResult) {
        if (authorizationResult instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization) {
            com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization requiresAuthorization = (com.paypal.oslo.feature.packagetracking.domain.usecase.RequiresAuthorization) authorizationResult;
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.OAuthUrlRetrieved(requiresAuthorization.getProvider(), requiresAuthorization.getUrl()));
        } else if (authorizationResult instanceof com.paypal.oslo.feature.packagetracking.domain.usecase.LinkingComplete) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageSettingsViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleAuthorizationResult$1(packageSettingsViewModel, authorizationResult, null), 3, null);
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkSuccess(((com.paypal.oslo.feature.packagetracking.domain.usecase.LinkingComplete) authorizationResult).getProvider()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> list, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, boolean z2) {
        java.lang.Object obj;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) obj).getProvider() == emailProvider) {
                    break;
                }
            }
        }
        com.paypal.oslo.feature.packagetracking.domain.model.EmailLink emailLink = (com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) obj;
        if (emailLink != null) {
            boolean Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(emailLink);
            com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus status = emailLink.getStatus();
            int i = status == null ? -1 : com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt.WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
            if (i == 1) {
                Camera2StreamConfigurationMap(packageSettingsViewModel, emailProvider, Camera2StreamConfigurationMap, z2, z);
                return;
            } else if (i == 2) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "RelinkExpiredDirectAuth"), kotlin.TuplesKt.to("provider", emailProvider)), null, 4, null);
                packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked(emailProvider));
                return;
            } else {
                getHighSpeedVideoFpsRangesFor(packageSettingsViewModel, emailProvider, emailLink.getStatus());
                return;
            }
        }
        getHighSpeedVideoFpsRangesFor(packageSettingsViewModel, emailProvider, null);
    }

    private static final void Camera2StreamConfigurationMap(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, boolean z2, boolean z3) {
        if (z && z2 && packageSettingsViewModel.getFeatureGate().checkGate(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.INSTANCE.getEmailRelinkReminder())) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "RelinkReminderPushShowSheet"), kotlin.TuplesKt.to("provider", emailProvider)), null, 4, null);
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.ShowRelinkSheet(emailProvider));
        } else if (z && packageSettingsViewModel.getFeatureGate().checkGate(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.INSTANCE.getEmailRelinkReminder())) {
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.RequiresRelink(emailProvider, z3));
        } else if (z) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "RelinkReminderGateOff"), kotlin.TuplesKt.to("provider", emailProvider)), null, 4, null);
        } else {
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AlreadyRelinked(emailProvider));
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus emailLinkStatus) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "RelinkCheckDirectAuth"), kotlin.TuplesKt.to("provider", emailProvider), kotlin.TuplesKt.to("status", emailLinkStatus)), null, 4, null);
        packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked(emailProvider));
    }

    private static final boolean Camera2StreamConfigurationMap(com.paypal.oslo.feature.packagetracking.domain.model.EmailLink emailLink) {
        java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent> events = emailLink.getEvents();
        if ((events instanceof java.util.Collection) && events.isEmpty()) {
            return false;
        }
        for (com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEvent emailLinkEvent : events) {
            if (emailLinkEvent.getType() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkEventType.RELINK_REMINDER && kotlin.jvm.internal.Intrinsics.areEqual(emailLinkEvent.getHasActiveReminder(), java.lang.Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel) {
        packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataFailed(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_email_unlinking_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_description_contact_us)));
    }

    public static final /* synthetic */ void access$dispatchPendingAmazonPreference(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel) {
        java.lang.Boolean pendingAmazonPreference = packageSettingsViewModel.getPendingAmazonPreference();
        if (pendingAmazonPreference != null) {
            boolean booleanValue = pendingAmazonPreference.booleanValue();
            packageSettingsViewModel.setPendingAmazonPreference$package_tracking_prodRelease(null);
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.AmazonTrackingPreferenceLoaded(booleanValue));
        }
    }

    public static final /* synthetic */ void access$handleDeeplinkDataReceived(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, com.paypal.oslo.feature.packagetracking.ui.settings.DeeplinkData deeplinkData) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "DeeplinkDataReceived"), kotlin.TuplesKt.to("source", deeplinkData.getSource()), kotlin.TuplesKt.to("triggerPoint", deeplinkData.getTriggerPoint()), kotlin.TuplesKt.to("emailProvider", deeplinkData.getEmailProvider())), null, 4, null);
        com.paypal.oslo.feature.packagetracking.domain.usecase.SettingsDeeplinkState invoke = packageSettingsViewModel.getGetDeeplinkStateSettingsPageUseCase().invoke(deeplinkData.getSource(), deeplinkData.getTriggerPoint(), deeplinkData.getEmailProvider());
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "DeeplinkStateResolved"), kotlin.TuplesKt.to("state", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(invoke.getClass()).getSimpleName())), null, 4, null);
        packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeeplinkStateResolved(invoke));
    }

    public static final /* synthetic */ void access$handleDeeplinkRelinkCheck(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, java.util.List list, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, boolean z, boolean z2) {
        if (list.isEmpty()) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageSettingsViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleDeeplinkRelinkCheck$1(packageSettingsViewModel, emailProvider, z, z2, null), 3, null);
        } else {
            getHighSpeedVideoSizes(packageSettingsViewModel, list, emailProvider, z, z2);
        }
    }

    public static final /* synthetic */ void access$handleLinkCancelled(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel) {
        if (packageSettingsViewModel.getFeatureGate().checkGate(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.INSTANCE.getEmailRelinkReminder())) {
            return;
        }
        packageSettingsViewModel.processEvent$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DismissRelinkSheet.INSTANCE);
    }

    public static final /* synthetic */ void access$handleLoadAmazonTrackingPreference(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel) {
        if (packageSettingsViewModel.getFeatureGate().checkGate(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.INSTANCE.getAmazonOrdersEnabled())) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageSettingsViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadAmazonTrackingPreference$1(packageSettingsViewModel, null), 3, null);
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "AmazonPreferenceGateDisabled")), null, 4, null);
        }
    }

    public static final /* synthetic */ void access$handleOAuthFlowCompleted(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult oAuthFlowResult) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "OAuthFlowCompleted"), kotlin.TuplesKt.to(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.RESULT_TYPE, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(oAuthFlowResult.getClass()).getSimpleName())), null, 4, null);
        if (oAuthFlowResult instanceof com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Success) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageSettingsViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleOAuthSuccess$1(packageSettingsViewModel, (com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Success) oAuthFlowResult, null), 3, null);
            return;
        }
        if (!(oAuthFlowResult instanceof com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error)) {
            if (!(oAuthFlowResult instanceof com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Cancelled)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            new com.paypal.oslo.core.telemetry.analytics.schema.event.generic.ComponentDisappeared(com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUiContext(), null, null, null, com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.Items.INSTANCE.getLinkEmail(), 7, null), com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext.copy$default(com.paypal.oslo.feature.packagetracking.ui.analytics.PTAnalytics.PackageSettingsContexts.INSTANCE.getUserIntentContext(), null, "link_email", "link_email", 1, null), null, 4, null).track(com.paypal.oslo.feature.packagetracking.AnalyticsTrackerKt.analyticsTracker);
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkCancelled.INSTANCE);
            return;
        }
        com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error error = (com.paypal.oslo.feature.packagetracking.ui.oauth.OAuthFlowResult.Error) oAuthFlowResult;
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "OAuthError"), kotlin.TuplesKt.to("provider", error.getProvider())), null, 4, null);
        packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkFailed(error.getErrorMessage(), null, 2, null));
    }

    public static final /* synthetic */ void access$handleRelinkSheetLinkClicked(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "RelinkSheetLinkClicked"), kotlin.TuplesKt.to("provider", emailProvider)), null, 4, null);
        packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked(emailProvider));
    }

    public static final /* synthetic */ void access$handleRequiresRelink(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, "PackageSettingsMiddleware", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("action", "RequiresRelinkAutoLaunch"), kotlin.TuplesKt.to("provider", emailProvider)), null, 4, null);
        packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.LinkEmail.LinkClicked(emailProvider));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ void access$processDeauthorizeAllResult(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, java.util.List list) {
        boolean z;
        boolean z2 = false;
        if (list != null) {
            java.util.List list2 = list;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (!((com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData) it.next()).getDeauthorized()) {
                    }
                }
            }
            z = true;
            if (list != null) {
                java.util.List list3 = list;
                if (!(list3 instanceof java.util.Collection) || !list3.isEmpty()) {
                    java.util.Iterator it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        } else if (!((com.paypal.oslo.feature.packagetracking.domain.model.DeAuthorizeData) it2.next()).getDataDeleted()) {
                            z2 = true;
                            break;
                        }
                    }
                }
            }
            if (!z && !z2) {
                packageSettingsViewModel.markLinkStateChanged$package_tracking_prodRelease();
                packageSettingsViewModel.processEvent$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllSuccess.INSTANCE);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageSettingsViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsSideEffectsMiddlewareKt$handleLoadSettings$1(packageSettingsViewModel, true, null), 3, null);
                return;
            } else if (!z && z2) {
                packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllFailed(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_unlinked_data_deletion_failed_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_description_contact_us)));
                return;
            } else if (!z2) {
                packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllFailed(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_email_unlinking_and_data_deletion_failed_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_description_contact_us)));
                return;
            } else {
                packageSettingsViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeauthorizeAllFailed(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_email_unlinking_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_banner_description_contact_us)));
                return;
            }
        }
        z = false;
        if (list != null) {
        }
        if (!z) {
        }
        if (!z) {
        }
        if (!z2) {
        }
    }

    public static final /* synthetic */ void access$processDeleteImportedDataResult(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsViewModel packageSettingsViewModel, boolean z) {
        if (z) {
            packageSettingsViewModel.processEvent$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsEvent.DeleteImportedDataSuccess.INSTANCE);
        } else {
            getHighResolutionOutputSizeshNQ4ISI(packageSettingsViewModel);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.values().length];
            try {
                iArr[com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.LINKED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.UNLINKED_BY_SYSTEM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
