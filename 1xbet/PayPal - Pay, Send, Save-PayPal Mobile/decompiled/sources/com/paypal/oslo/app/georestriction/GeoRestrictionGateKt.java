package com.paypal.oslo.app.georestriction;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a*\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0002\b\bH\u0001¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"GeoGuideUrl", "", "GeoRestrictionGate", "", "viewModel", "Lcom/paypal/oslo/app/georestriction/GeoRestrictionViewModel;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/app/georestriction/GeoRestrictionViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_prodRelease", "shouldShowRestriction", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GeoRestrictionGateKt {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if ((r15 & 1) != 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GeoRestrictionGate(final com.paypal.oslo.app.georestriction.GeoRestrictionViewModel geoRestrictionViewModel, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-259689097);
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changedInstance(geoRestrictionViewModel)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
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
                    geoRestrictionViewModel = (com.paypal.oslo.app.georestriction.GeoRestrictionViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.app.georestriction.GeoRestrictionViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i4 &= -15;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-259689097, i4, -1, "com.paypal.oslo.app.georestriction.GeoRestrictionGate (GeoRestrictionGate.kt:40)");
                }
                if (((java.lang.Boolean) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(geoRestrictionViewModel.getShouldShowRestriction(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue()).booleanValue()) {
                    startRestartGroup.startReplaceGroup(-1161514062);
                    final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean changedInstance = startRestartGroup.changedInstance(geoRestrictionViewModel);
                    com.paypal.oslo.app.georestriction.GeoRestrictionGateKt$GeoRestrictionGate$1$1 rememberedValue = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new com.paypal.oslo.app.georestriction.GeoRestrictionGateKt$GeoRestrictionGate$1$1(geoRestrictionViewModel, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    boolean changedInstance2 = startRestartGroup.changedInstance(context);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.georestriction.GeoRestrictionGateKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit highSpeedVideoSizes;
                                highSpeedVideoSizes = com.paypal.oslo.app.georestriction.GeoRestrictionGateKt.getHighSpeedVideoSizes(context);
                                return highSpeedVideoSizes;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.app.georestriction.GeoRestrictedScreenNonUSKt.GeoRestrictedScreenNonUS((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1160929774);
                    function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i4 >> 3) & 14));
                    startRestartGroup.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.app.georestriction.GeoRestrictionGateKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.app.georestriction.GeoRestrictionGateKt.m11073$r8$lambda$uaQff6W70Qi2DoqSCOzdU1LX0Y(com.paypal.oslo.app.georestriction.GeoRestrictionViewModel.this, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(android.content.Context context) {
        try {
            context.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("https://www.paypal.com/us/campaign/paypalappbeta#Instructionsforandroid")));
        } catch (android.content.ActivityNotFoundException unused) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "No browser app found to handle intent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", "https://www.paypal.com/us/campaign/paypalappbeta#Instructionsforandroid")), null, 4, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uaQff6W70Qi2DoqSCOzdU-1LX0Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11073$r8$lambda$uaQff6W70Qi2DoqSCOzdU1LX0Y(com.paypal.oslo.app.georestriction.GeoRestrictionViewModel geoRestrictionViewModel, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        GeoRestrictionGate(geoRestrictionViewModel, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
