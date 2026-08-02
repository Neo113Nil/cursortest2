package com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose;

@kotlin.Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0007\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001ao\u0010\u0000\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0001¢\u0006\u0002\u0010\u0014\u001a9\u0010\u0015\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\u0016\u001a\u001a\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0000\u001a5\u0010\u001c\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\r2\u001c\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"RenderActivityFilteredLandingScreenCompose", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/activity/ui/widgetFullScreen/model/ActivityWidgetFullScreenViewModel;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/activity/ui/widgetFullScreen/model/ActivityWidgetFullScreenViewModel;Landroidx/compose/runtime/Composer;II)V", "buildTransactionClickHandler", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "uiActivityItems", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "onGoBack", "Lkotlin/Function0;", "getWidgetConfig", "Lcom/paypal/oslo/feature/activity/api/models/ActivityFilteredLandingScreenDto;", "onTransactionClick", "onEmptyCtaClick", "(Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RenderSuccessWidgetFullScreenList", "(Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "generateItemKey", "", "activityItem", "index", "", "RenderWidgetFullScreenItem", "(Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetFullScreenComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderActivityFilteredLandingScreenCompose(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel activityWidgetFullScreenViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel activityWidgetFullScreenViewModel2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel activityWidgetFullScreenViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        final com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel activityWidgetFullScreenViewModel4;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        java.lang.Object rememberedValue2;
        boolean changedInstance3;
        java.lang.Object rememberedValue3;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1262731954);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                activityWidgetFullScreenViewModel2 = activityWidgetFullScreenViewModel;
                if (startRestartGroup.changedInstance(activityWidgetFullScreenViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                activityWidgetFullScreenViewModel2 = activityWidgetFullScreenViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            activityWidgetFullScreenViewModel2 = activityWidgetFullScreenViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 19) != 18, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i7 &= -113;
                }
                modifier3 = modifier2;
            } else {
                modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel activityWidgetFullScreenViewModel5 = (com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i4 = i7 & (-113);
                    activityWidgetFullScreenViewModel4 = activityWidgetFullScreenViewModel5;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1262731954, i4, -1, "com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.RenderActivityFilteredLandingScreenCompose (ActivityWidgetFullScreenCompose.kt:61)");
                    }
                    androidx.paging.compose.LazyPagingItems collectAsLazyPagingItems = androidx.paging.compose.LazyPagingItemsKt.collectAsLazyPagingItems(activityWidgetFullScreenViewModel4.getFilteredActivityItems(), null, startRestartGroup, 0, 1);
                    kotlin.jvm.functions.Function2 function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.m11969$r8$lambda$3roYxNgY6WRGswleMajbOzxT4(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.this, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel) obj, (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj2);
                        }
                    };
                    changedInstance = startRestartGroup.changedInstance(activityWidgetFullScreenViewModel4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$ziGU3yB9X6ZamxH3p4teH4j6tdI(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                    changedInstance2 = startRestartGroup.changedInstance(activityWidgetFullScreenViewModel4);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto widgetFSDtoFromNavigator$activity_prodRelease;
                                widgetFSDtoFromNavigator$activity_prodRelease = com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.this.getWidgetFSDtoFromNavigator$activity_prodRelease();
                                return widgetFSDtoFromNavigator$activity_prodRelease;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    changedInstance3 = startRestartGroup.changedInstance(activityWidgetFullScreenViewModel4);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$ILMwJyfUNlKwPvmyZ_k6b6fK8D4(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    activityWidgetFullScreenViewModel3 = activityWidgetFullScreenViewModel4;
                    RenderActivityFilteredLandingScreenCompose(collectAsLazyPagingItems, function0, function02, function2, modifier3, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, ((i4 << 12) & 57344) | androidx.paging.compose.LazyPagingItems.$stable, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            }
            i4 = i7;
            activityWidgetFullScreenViewModel4 = activityWidgetFullScreenViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.paging.compose.LazyPagingItems collectAsLazyPagingItems2 = androidx.paging.compose.LazyPagingItemsKt.collectAsLazyPagingItems(activityWidgetFullScreenViewModel4.getFilteredActivityItems(), null, startRestartGroup, 0, 1);
            kotlin.jvm.functions.Function2 function22 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.m11969$r8$lambda$3roYxNgY6WRGswleMajbOzxT4(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.this, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel) obj, (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj2);
                }
            };
            changedInstance = startRestartGroup.changedInstance(activityWidgetFullScreenViewModel4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$ziGU3yB9X6ZamxH3p4teH4j6tdI(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue;
            changedInstance2 = startRestartGroup.changedInstance(activityWidgetFullScreenViewModel4);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto widgetFSDtoFromNavigator$activity_prodRelease;
                    widgetFSDtoFromNavigator$activity_prodRelease = com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.this.getWidgetFSDtoFromNavigator$activity_prodRelease();
                    return widgetFSDtoFromNavigator$activity_prodRelease;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) rememberedValue2;
            changedInstance3 = startRestartGroup.changedInstance(activityWidgetFullScreenViewModel4);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$ILMwJyfUNlKwPvmyZ_k6b6fK8D4(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            activityWidgetFullScreenViewModel3 = activityWidgetFullScreenViewModel4;
            RenderActivityFilteredLandingScreenCompose(collectAsLazyPagingItems2, function03, function022, function22, modifier3, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, ((i4 << 12) & 57344) | androidx.paging.compose.LazyPagingItems.$stable, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            activityWidgetFullScreenViewModel3 = activityWidgetFullScreenViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$JCa2_UcnFmTKB3EQxqfdZhWWGc4(androidx.compose.ui.Modifier.this, activityWidgetFullScreenViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderActivityFilteredLandingScreenCompose(final androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> lazyPagingItems, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<com.paypal.oslo.feature.activity.api.models.ActivityFilteredLandingScreenDto> function02, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel, ? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        java.lang.String widgetFullScreenTitleText;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyPagingItems, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-957398394);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(lazyPagingItems) : startRestartGroup.changedInstance(lazyPagingItems) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                i3 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
                if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function04 = function03;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function05 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function05 = function03;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-957398394, i3, -1, "com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.RenderActivityFilteredLandingScreenCompose (ActivityWidgetFullScreenCompose.kt:97)");
                    }
                    androidx.compose.foundation.layout.PaddingValues m1703PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 2, null);
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), "activity_widget_full_screen_container");
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier modifier4 = modifier3;
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "top_bar_close_button"), null, null, false, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-938884967, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$H5T_fpsh3O0wO5bo3A4S7V2xn0M(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, 1572918, 60);
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, m1703PaddingValuesa9UjIt4$default), 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_widget_fs_title_default, startRestartGroup, 0);
                    boolean changed = startRestartGroup.changed(stringResource);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig contentConfig = function02.invoke().getContentConfig();
                        if (contentConfig != null && (widgetFullScreenTitleText = contentConfig.getWidgetFullScreenTitleText()) != null) {
                            stringResource = widgetFullScreenTitleText;
                        }
                        startRestartGroup.updateRememberedValue(stringResource);
                        rememberedValue2 = stringResource;
                    }
                    com.paypal.pds.components.HeaderKt.Header((java.lang.String) rememberedValue2, (androidx.compose.ui.Modifier) null, (java.lang.String) null, (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Left, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 24576, 110);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                    if (lazyPagingItems.getLoadState().getRefresh() instanceof androidx.paging.LoadState.Loading) {
                        startRestartGroup.startReplaceGroup(188909180);
                        com.paypal.oslo.feature.activity.ui.ledger.view.compose.shimmer.ActivityLedgerShimmerComposeKt.RenderActivityLedgerItemsShimmer(startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else if (lazyPagingItems.getLoadState().getRefresh() instanceof androidx.paging.LoadState.Error) {
                        startRestartGroup.startReplaceGroup(189133589);
                        com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig contentConfig2 = function02.invoke().getContentConfig();
                        boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(lazyPagingItems));
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$kpsXcxyKhDmsjV5ZAG8Tq5dkVCM(androidx.paging.compose.LazyPagingItems.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        com.paypal.oslo.feature.activity.ui.widget.view.compose.ActivityWidgetErrorComposeKt.RenderActivityWidgetErrorUi(contentConfig2, (kotlin.jvm.functions.Function0) rememberedValue3, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24()), "activity_widget_fullscreen_error"), startRestartGroup, com.paypal.oslo.feature.activity.api.widget.configs.ActivityWidgetContentConfig.$stable, 0);
                        startRestartGroup.endReplaceGroup();
                    } else if (lazyPagingItems.getItemCount() == 0) {
                        startRestartGroup.startReplaceGroup(189852107);
                        com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerEmptyContentComposeKt.RenderActivityLedgerUIEmptyState(null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_widget_empty_state_desc, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_widget_empty_state_cta_text, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing24()), "activity_widget_full_screen_empty"), null, function05, startRestartGroup, (i3 & 458752) | 6, 16);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(190767103);
                        RenderSuccessWidgetFullScreenList(lazyPagingItems, function2, startRestartGroup, androidx.paging.compose.LazyPagingItems.$stable | (i3 & 14) | ((i3 >> 6) & 112));
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function04 = function05;
                    modifier2 = modifier4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier5 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$c4dtS2AXvKdX1gYA30ftqQdpk6c(androidx.paging.compose.LazyPagingItems.this, function0, function02, function2, modifier5, function04, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        if (!startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void RenderSuccessWidgetFullScreenList(final androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> lazyPagingItems, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel, ? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyPagingItems, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(262854972);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(lazyPagingItems) : startRestartGroup.changedInstance(lazyPagingItems) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(262854972, i2, -1, "com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.RenderSuccessWidgetFullScreenList (ActivityWidgetFullScreenCompose.kt:188)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            androidx.compose.foundation.layout.PaddingValues m1703PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing128(), 7, null);
            androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24());
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && startRestartGroup.changedInstance(lazyPagingItems));
            boolean z2 = (i2 & 112) == 32;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((z | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$NIB1Wa5_nIlvk7JsFcxmiylgyVg(androidx.paging.compose.LazyPagingItems.this, mutableState, function2, (androidx.compose.foundation.lazy.LazyListScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(null, null, m1703PaddingValuesa9UjIt4$default, false, m1602spacedBy0680j_4, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0, 491);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$Z3oM_Aw4BlhjCJJuroXwzQ7ip90(androidx.paging.compose.LazyPagingItems.this, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final java.lang.String generateItemKey(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem, int i) {
        java.lang.String assignLazyColumnKeys;
        return (activityItem == null || (assignLazyColumnKeys = com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.assignLazyColumnKeys(activityItem)) == null) ? "pagination_item_".concat(java.lang.String.valueOf(i)) : assignLazyColumnKeys;
    }

    public static final void RenderWidgetFullScreenItem(final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem, final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel, ? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-274080708);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(activityItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-274080708, i2, -1, "com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.RenderWidgetFullScreenItem (ActivityWidgetFullScreenCompose.kt:237)");
            }
            if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader) {
                startRestartGroup.startReplaceGroup(-405324555);
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.header.ActivityItemDateHeaderViewComposeKt.ActivityItemDateHeaderView(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader) activityItem).getData(), null, startRestartGroup, 0, 2);
                startRestartGroup.endReplaceGroup();
            } else if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) {
                startRestartGroup.startReplaceGroup(-405136757);
                com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel data = ((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem).getData();
                boolean z = (i2 & 112) == 32;
                boolean z2 = (i2 & 14) == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$td2sDTTy3MyiIU7EPfvQ63XnPEA(kotlin.jvm.functions.Function2.this, activityItem);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.activity.ui.widget.view.compose.sections.ActivityWidgetSectionItemComposeKt.ActivityWidgetItemView(data, false, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-404877225);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$v08eqqOy9itf891LQmaAzM9D70o(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.this, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$3-roYxNgY6WRGswleM-ajbOzxT4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11969$r8$lambda$3roYxNgY6WRGswleMajbOzxT4(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel activityWidgetFullScreenViewModel, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation isXoomNavigationTypeIfApplicable = com.paypal.oslo.feature.activity.ui.common.ActivityActionExtensionsKt.isXoomNavigationTypeIfApplicable(activityTransactionModel);
        if (isXoomNavigationTypeIfApplicable != null) {
            activityWidgetFullScreenViewModel.navigateByNavigationType$activity_prodRelease(isXoomNavigationTypeIfApplicable);
        } else {
            activityWidgetFullScreenViewModel.invokeAction$activity_prodRelease(activityTransactionModel, activityActionModel);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H5T_fpsh3O0wO5bo3A4S7V2xn0M(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-938884967, i, -1, "com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.RenderActivityFilteredLandingScreenCompose.<anonymous>.<anonymous>.<anonymous> (ActivityWidgetFullScreenCompose.kt:113)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarCloseButton(function0, null, null, composer, 0, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ILMwJyfUNlKwPvmyZ_k6b6fK8D4(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel activityWidgetFullScreenViewModel) {
        activityWidgetFullScreenViewModel.navigateToTabbedLedgerView$activity_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JCa2_UcnFmTKB3EQxqfdZhWWGc4(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel activityWidgetFullScreenViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderActivityFilteredLandingScreenCompose(modifier, activityWidgetFullScreenViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NIB1Wa5_nIlvk7JsFcxmiylgyVg(final androidx.paging.compose.LazyPagingItems lazyPagingItems, androidx.compose.runtime.MutableState mutableState, final kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, lazyPagingItems.getItemCount(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object generateItemKey;
                generateItemKey = com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.generateItemKey((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) androidx.paging.compose.LazyPagingItems.this.get(r2), ((java.lang.Integer) obj).intValue());
                return generateItemKey;
            }
        }, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2039316958, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.ActivityWidgetFullScreenComposeKt.$r8$lambda$T0SNBV33HCrzJOC7KUg0tC0TLRk(androidx.paging.compose.LazyPagingItems.this, function2, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 4, null);
        com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt.lazyPagingItemsStateListener(lazyListScope, mutableState, lazyPagingItems, androidx.compose.ui.Modifier.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T0SNBV33HCrzJOC7KUg0tC0TLRk(androidx.paging.compose.LazyPagingItems lazyPagingItems, kotlin.jvm.functions.Function2 function2, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i2 |= composer.changed(i) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 145) != 144, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2039316958, i2, -1, "com.paypal.oslo.feature.activity.ui.widgetFullScreen.view.compose.RenderSuccessWidgetFullScreenList.<anonymous>.<anonymous>.<anonymous> (ActivityWidgetFullScreenCompose.kt:203)");
            }
            RenderWidgetFullScreenItem((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) lazyPagingItems.get(i), function2, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z3oM_Aw4BlhjCJJuroXwzQ7ip90(androidx.paging.compose.LazyPagingItems lazyPagingItems, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderSuccessWidgetFullScreenList(lazyPagingItems, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$c4dtS2AXvKdX1gYA30ftqQdpk6c(androidx.paging.compose.LazyPagingItems lazyPagingItems, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function03, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderActivityFilteredLandingScreenCompose(lazyPagingItems, function0, function02, function2, modifier, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kpsXcxyKhDmsjV5ZAG8Tq5dkVCM(androidx.paging.compose.LazyPagingItems lazyPagingItems) {
        lazyPagingItems.retry();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$td2sDTTy3MyiIU7EPfvQ63XnPEA(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem) {
        function2.invoke(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem).getData(), null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v08eqqOy9itf891LQmaAzM9D70o(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        RenderWidgetFullScreenItem(activityItem, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ziGU3yB9X6ZamxH3p4teH4j6tdI(com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel activityWidgetFullScreenViewModel) {
        activityWidgetFullScreenViewModel.goBack$activity_prodRelease();
        return kotlin.Unit.INSTANCE;
    }
}
