package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\n\"$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailViewModel;", "", "getHighSpeedVideoFpsRangesFor", "(Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailViewModel;)V", "Lcom/paypal/oslo/feature/packagetracking/domain/model/Address;", "", "Camera2StreamConfigurationMap", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/Address;)Ljava/lang/String;", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailViewModel;Ljava/lang/String;)V", "Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailUiState;", "Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailEvent;", "getSideEffectsMiddleware", "(Lcom/paypal/oslo/feature/packagetracking/ui/detail/PackageDetailViewModel;)Lcom/paypal/oslo/core/mvi/MviStateStore$Middleware;", "sideEffectsMiddleware"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageDetailSideEffectsMiddlewareKt {
    public static final com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent> getSideEffectsMiddleware(final com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageDetailViewModel, "");
        return new com.paypal.oslo.core.mvi.MviStateStore.Middleware<com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent>() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$sideEffectsMiddleware$1
            @Override // com.paypal.oslo.core.mvi.MviStateStore.Middleware
            public final void invoke(com.paypal.oslo.core.mvi.MviStateStore.Middleware.Input<com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent> input) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
                com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent event = input.getEvent();
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.LoadPackageDetail) {
                    com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt.access$handleLoadPackageDetail(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this, (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.LoadPackageDetail) event);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RetryLoadPackageDetail) {
                    com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RefreshPackageDetail) {
                    com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt.access$handleRefreshPackageDetail(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this, input.getStates().getFirst());
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.RemoveButtonClicked) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r3), null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$removePackage$1(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this, r0.getCarrierId(), r0.getTrackingNumber(), ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemoveSheet.RemoveButtonClicked) event).getTransactionNumber(), null), 3, null);
                    return;
                }
                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSaveClicked) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r3), null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$updatePackageNickname$1(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this, r0.getCarrierId(), r0.getTrackingNumber(), ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSaveClicked) event).getNickname(), null), 3, null);
                    return;
                }
                if (!(event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageSuccess)) {
                    if (event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RefreshPackageDetailAfterRename) {
                        com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt.access$handleRefreshPackageDetailAfterRename(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this, input.getStates().getFirst());
                        return;
                    }
                    if (event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumberClicked) {
                        com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt.access$handleCopyTrackingNumberClicked(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this, input.getStates().getFirst());
                        return;
                    }
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CloseButtonClicked.INSTANCE)) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageOptionsClicked.INSTANCE)) {
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(event, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageSettingsClicked.INSTANCE)) {
                                if (event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.UnlinkBySystemBannerClicked) {
                                    com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt.access$handleUnlinkBySystemBannerClicked(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this, ((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.UnlinkBySystemBannerClicked) event).getEmailProvider());
                                    return;
                                }
                                if (!(event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.TrackingUrlClicked)) {
                                    if (!(event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OrderManagementUrlClicked)) {
                                        if (event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.MarkAsDelivered.MarkAsDeliveredButtonClicked) {
                                            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt.access$handleMarkAsDeliveredButtonClicked(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this, input.getStates().getFirst());
                                            return;
                                        } else {
                                            if (event instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggle) {
                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(r3), null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$handleAmazonTrackingToggle$1(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this, r0, !((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.AmazonTrackingToggle) event).getEnabled(), null), 3, null);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenOrderManagementUrl(((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OrderManagementUrlClicked) event).getUrl()));
                                    return;
                                }
                                com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.OpenTrackingUrl(((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.TrackingUrlClicked) event).getUrl()));
                                return;
                            }
                            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this.processEvent$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.NavigateToPackageSettings.INSTANCE);
                            return;
                        }
                        com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this.processEvent$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailSettings.PackageSettingsMenuOptionClicked.INSTANCE);
                        return;
                    }
                    com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this.processEvent$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.ClosePackageDetailScreen.INSTANCE);
                    return;
                }
                com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel.this.processEvent$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RefreshPackageDetailAfterRename.INSTANCE);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel) {
        java.lang.String str = (java.lang.String) packageDetailViewModel.getSavedStateHandle().get("carrier_id");
        java.lang.String str2 = (java.lang.String) packageDetailViewModel.getSavedStateHandle().get("tracking_number");
        java.lang.String str3 = (java.lang.String) packageDetailViewModel.getSavedStateHandle().get("transaction_number");
        if (str2 != null && str != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageDetailViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1(packageDetailViewModel, str, str2, str3, null), 3, null);
        } else {
            packageDetailViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoadFailed(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_generic_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_error_retry_message)));
        }
    }

    private static final java.lang.String Camera2StreamConfigurationMap(com.paypal.oslo.feature.packagetracking.domain.model.Address address) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (address != null) {
            java.lang.String[] strArr = new java.lang.String[3];
            java.lang.String city = address.getCity();
            if (city == null || city.length() <= 0) {
                city = null;
            }
            strArr[0] = city;
            java.lang.String state = address.getState();
            if (state == null || state.length() <= 0) {
                state = null;
            }
            strArr[1] = state;
            strArr[2] = address.getCountryCode();
            sb.append(kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.listOfNotNull((java.lang.Object[]) strArr), ", ", null, null, 0, null, null, 62, null));
            java.lang.String postalCode = address.getPostalCode();
            if (postalCode != null) {
                java.lang.String str = kotlin.text.StringsKt.isBlank(postalCode) ? null : postalCode;
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    private static final void getHighSpeedVideoSizes(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, java.lang.String str) {
        if (!kotlin.text.StringsKt.isBlank(str)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageDetailViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageGeoCodes$1(packageDetailViewModel, str, null), 3, null);
        } else {
            packageDetailViewModel.processEvent$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderFailure.INSTANCE);
        }
    }

    public static final /* synthetic */ void access$handleCopyTrackingNumberClicked(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState packageDetailUiState) {
        if (packageDetailUiState instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success) {
            packageDetailViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.CopyTrackingNumber(((com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success) packageDetailUiState).getDisplayData().getTrackingNumber(), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_tracking_label), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_tracking_number_copied)));
        }
    }

    public static final /* synthetic */ void access$handleLoadPackageDetail(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.LoadPackageDetail loadPackageDetail) {
        com.paypal.oslo.feature.packagetracking.api.navigation.PackageDetailDestination destination = loadPackageDetail.getDestination();
        packageDetailViewModel.getSavedStateHandle().set("tracking_number", destination.getTrackingNumber());
        packageDetailViewModel.getSavedStateHandle().set("carrier_id", destination.getCarrierId());
        packageDetailViewModel.getSavedStateHandle().set("transaction_number", destination.getTransactionNumber());
        packageDetailViewModel.getSavedStateHandle().set("source", destination.getSource());
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageDetailViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1(packageDetailViewModel, destination.getCarrierId(), destination.getTrackingNumber(), destination.getTransactionNumber(), null), 3, null);
    }

    public static final /* synthetic */ void access$handleMarkAsDeliveredButtonClicked(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState packageDetailUiState) {
        com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success success = packageDetailUiState instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success ? (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success) packageDetailUiState : null;
        if (success != null) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageDetailViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$markAsDelivered$1(packageDetailViewModel, success.getDisplayData().getCarrierId(), success.getDisplayData().getTrackingNumber(), success.getDisplayData(), null), 3, null);
        }
    }

    public static final /* synthetic */ void access$handlePackageDetailError(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailLogConstants.PACKAGE_TRACKING_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", packageTrackingError.getMessage()), kotlin.TuplesKt.to("error", packageTrackingError)), null, 4, null);
        packageDetailViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoadFailed(com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_generic_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_error_retry_message)));
    }

    public static final /* synthetic */ void access$handlePackageDetailSuccess(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.domain.model.PackageData packageData, arrow.core.Either either, arrow.core.Either either2) {
        java.util.ArrayList emptyList;
        java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink> emptyList2;
        java.util.List list = (java.util.List) either.getOrNull();
        if (list == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) obj).getStatus() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.LINKED) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) it.next()).getProvider());
            }
            emptyList = arrayList3;
        }
        java.util.List<? extends com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider> list2 = emptyList;
        java.util.List list3 = (java.util.List) either.getOrNull();
        if (list3 == null) {
            emptyList2 = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list3) {
                com.paypal.oslo.feature.packagetracking.domain.model.EmailLink emailLink = (com.paypal.oslo.feature.packagetracking.domain.model.EmailLink) obj2;
                if (emailLink.getStatus() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.UNLINKED_BY_SYSTEM || emailLink.getStatus() == com.paypal.oslo.feature.packagetracking.domain.model.EmailLinkStatus.UNLINKED_BY_USER) {
                    arrayList4.add(obj2);
                }
            }
            emptyList2 = arrayList4;
        }
        com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDisplayData invoke = packageDetailViewModel.getComputeDisplayData().invoke(packageData, list2, emptyList2, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlin.Pair[]{new kotlin.Pair(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.GMAIL, packageDetailViewModel.getGetUnlinkBannerSeenUseCase().invoke(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.GMAIL)), new kotlin.Pair(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.OUTLOOK, packageDetailViewModel.getGetUnlinkBannerSeenUseCase().invoke(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.OUTLOOK))}), (com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider) either2.getOrNull());
        packageDetailViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.PackageDetailLoaded(invoke, (java.lang.String) packageDetailViewModel.getSavedStateHandle().get("source")));
        if (packageData.getStatus() == com.paypal.oslo.feature.packagetracking.domain.model.TrackingPackageStatus.DELIVERED || packageData.getMarkedAsDelivered()) {
            getHighSpeedVideoSizes(packageDetailViewModel, Camera2StreamConfigurationMap(packageData.getDestinationAddress()));
        } else if (!packageData.getEvents().isEmpty()) {
            getHighSpeedVideoSizes(packageDetailViewModel, Camera2StreamConfigurationMap(((com.paypal.oslo.feature.packagetracking.domain.model.TrackingStatusUpdate) kotlin.collections.CollectionsKt.first((java.util.List) packageData.getEvents())).getLocation()));
        } else {
            packageDetailViewModel.processEvent$package_tracking_prodRelease(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.GeoCoderFailure.INSTANCE);
        }
        if (either.isLeft()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailLogConstants.PACKAGE_TRACKING_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", "Failed to load email link status"), kotlin.TuplesKt.to("error", (com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError) ((arrow.core.Either.Left) either).getValue())), null, 4, null);
        }
        if (either2.isLeft()) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailLogConstants.PACKAGE_TRACKING_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", "Failed to load user email provider"), kotlin.TuplesKt.to("error", (com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError) ((arrow.core.Either.Left) either2).getValue())), null, 4, null);
        }
        if (invoke.isAmazonOrder() && packageDetailViewModel.getFeatureGate().checkGate(com.paypal.oslo.feature.packagetracking.remoteconfig.featureflags.PackageTrackingFeatureGateSpec.INSTANCE.getAmazonOrdersEnabled())) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageDetailViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$loadAmazonTrackingPreference$1(packageDetailViewModel, null), 3, null);
        }
    }

    public static final /* synthetic */ void access$handleRefreshPackageDetail(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState packageDetailUiState) {
        if (packageDetailUiState instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success) {
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success success = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success) packageDetailUiState;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageDetailViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1(packageDetailViewModel, success.getDisplayData().getCarrierId(), success.getDisplayData().getTrackingNumber(), success.getDisplayData().getTransactionNumber(), null), 3, null);
            return;
        }
        getHighSpeedVideoFpsRangesFor(packageDetailViewModel);
    }

    public static final /* synthetic */ void access$handleRefreshPackageDetailAfterRename(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState packageDetailUiState) {
        if (packageDetailUiState instanceof com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success) {
            com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success success = (com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailUiState.Success) packageDetailUiState;
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageDetailViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$fetchPackageDetail$1(packageDetailViewModel, success.getDisplayData().getCarrierId(), success.getDisplayData().getTrackingNumber(), success.getDisplayData().getTransactionNumber(), null), 3, null);
        }
    }

    public static final /* synthetic */ void access$handleUnlinkBySystemBannerClicked(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(packageDetailViewModel), null, null, new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailSideEffectsMiddlewareKt$handleUnlinkBySystemBannerClicked$1(packageDetailViewModel, emailProvider, null), 3, null);
        packageDetailViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.NavigateToPackageSettingsForRelink(emailProvider));
    }

    public static final /* synthetic */ com.google.android.gms.maps.model.LatLng access$processGeoCodeData(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.domain.repository.models.GeocoderModel geocoderModel) {
        com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location;
        com.paypal.oslo.feature.packagetracking.domain.repository.models.Location location2;
        java.util.List<com.paypal.oslo.feature.packagetracking.domain.repository.models.Result> results = geocoderModel.getResults();
        java.util.List<com.paypal.oslo.feature.packagetracking.domain.repository.models.Result> list = results;
        if (list == null || list.isEmpty()) {
            return null;
        }
        com.paypal.oslo.feature.packagetracking.domain.repository.models.Result result = results.get(0);
        com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry geometry = result.getGeometry();
        java.lang.Double valueOf = (geometry == null || (location2 = geometry.getLocation()) == null) ? null : java.lang.Double.valueOf(location2.getLat());
        com.paypal.oslo.feature.packagetracking.domain.repository.models.Geometry geometry2 = result.getGeometry();
        java.lang.Double valueOf2 = (geometry2 == null || (location = geometry2.getLocation()) == null) ? null : java.lang.Double.valueOf(location.getLng());
        if (valueOf == null || valueOf2 == null) {
            return null;
        }
        return new com.google.android.gms.maps.model.LatLng(valueOf.doubleValue(), valueOf2.doubleValue());
    }

    public static final /* synthetic */ void access$removePackageErrorEvent(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError) {
        if (packageTrackingError != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailLogConstants.PACKAGE_TRACKING_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", packageTrackingError.getMessage()), kotlin.TuplesKt.to("error", packageTrackingError)), null, 4, null);
        }
        packageDetailViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RemovePackageFailed(new com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner("remove-package-error", com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_generic_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_remove_failed_description), com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType.REMOVE_PACKAGE, null, 16, null)));
    }

    public static final /* synthetic */ void access$renamePackageErrorEvent(com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailViewModel packageDetailViewModel, com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError packageTrackingError) {
        if (packageTrackingError != null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.packagetracking.LoggerKt.log, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailLogConstants.PACKAGE_TRACKING_ERROR, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("errorMessage", packageTrackingError.getMessage()), kotlin.TuplesKt.to("error", packageTrackingError)), null, 4, null);
        }
        packageDetailViewModel.processEvent$package_tracking_prodRelease(new com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailEvent.RenamePackage.RenamePackageFailed(packageTrackingError, new com.paypal.oslo.feature.packagetracking.domain.model.display.InfoBanner("rename-package-error", com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_error_generic_title), com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_rename_error), com.paypal.oslo.feature.packagetracking.domain.model.display.BannerType.RENAME_PACKAGE_FAILED, null, 16, null)));
    }
}
