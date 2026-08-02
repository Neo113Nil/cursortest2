package com.paypal.oslo.feature.mosaic.ui.components.address;

@kotlin.Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a=\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\f\u001a-\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0011\u001a_\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\u001a2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001b\u001aC\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010!2\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\"\u001a\f\u0010#\u001a\u00020\u000f*\u00020$H\u0002\u001a\u001a\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0016*\u00020\u0005H\u0002¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, d2 = {"MosaicAddressScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "addressItem", "Lcom/paypal/oslo/feature/mosaic/api/navigation/AddressItem;", "onNextClick", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/MosaicAddressViewModel;", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/mosaic/api/navigation/AddressItem;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/mosaic/ui/components/address/MosaicAddressViewModel;Landroidx/compose/runtime/Composer;II)V", "MosaicAddressLoadingContent", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MosaicAddressErrorContent", "message", "", "onRetry", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MosaicAddressFormContent", androidx.window.reflection.WindowExtensionsConstants.LAYOUT_PACKAGE, "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "fieldValues", "", "dropdownState", "Lcom/paypal/pds/components/DropdownState;", "onFieldValueChange", "Lkotlin/Function2;", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;Lcom/paypal/oslo/feature/mosaic/api/navigation/AddressItem;Ljava/util/Map;Lcom/paypal/pds/components/DropdownState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MosaicAddressFieldInput", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lcom/paypal/oslo/core/i18n/domain/model/AddressComponent;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "onValueChange", "Lkotlin/Function1;", "(Lcom/paypal/oslo/core/i18n/domain/model/AddressComponent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/paypal/pds/components/DropdownState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "toFieldId", "Lcom/paypal/oslo/core/i18n/domain/model/Field;", "toMap", "mosaic_prodRelease", "uiState", "Lcom/paypal/oslo/feature/mosaic/ui/components/address/mvi/MosaicAddressUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicAddressScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MosaicAddressScreen(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.mosaic.api.navigation.AddressItem addressItem, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel mosaicAddressViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel mosaicAddressViewModel2;
        int i4;
        com.paypal.oslo.feature.mosaic.api.navigation.AddressItem addressItem2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel mosaicAddressViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i5;
        com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel mosaicAddressViewModel4;
        androidx.compose.runtime.State collectAsStateWithLifecycle;
        com.paypal.pds.components.DropdownState rememberDropdownState;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState mosaicAddressUiState;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2;
        com.paypal.pds.components.DropdownState dropdownState;
        int i6;
        com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel mosaicAddressViewModel5;
        java.lang.Object obj;
        int i7;
        int i8;
        com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel mosaicAddressViewModel6;
        int i9;
        com.paypal.oslo.feature.mosaic.api.navigation.AddressItem addressItem3 = addressItem;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(985025009);
        int i10 = i2 & 1;
        if (i10 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(addressItem3) : startRestartGroup.changedInstance(addressItem3) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    mosaicAddressViewModel2 = mosaicAddressViewModel;
                    if (startRestartGroup.changedInstance(mosaicAddressViewModel2)) {
                        i9 = 2048;
                        i3 |= i9;
                    }
                } else {
                    mosaicAddressViewModel2 = mosaicAddressViewModel;
                }
                i9 = 1024;
                i3 |= i9;
            } else {
                mosaicAddressViewModel2 = mosaicAddressViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    companion = modifier2;
                    function03 = function02;
                } else {
                    companion = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i11 != 0) {
                        addressItem3 = null;
                    }
                    if (i12 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function03 = function02;
                    }
                    if ((i2 & 8) != 0) {
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
                        i5 = i4 & (-7169);
                        mosaicAddressViewModel4 = (com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(985025009, i5, -1, "com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreen (MosaicAddressScreen.kt:65)");
                        }
                        collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(mosaicAddressViewModel4.getUiState$mosaic_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        rememberDropdownState = com.paypal.pds.components.DropdownKt.rememberDropdownState(startRestartGroup, 0);
                        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
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
                        boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        mosaicAddressUiState = (com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState) collectAsStateWithLifecycle.getValue();
                        if (!(mosaicAddressUiState instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Initial) || (mosaicAddressUiState instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loading)) {
                            boxScopeInstance2 = boxScopeInstance;
                            dropdownState = rememberDropdownState;
                            i6 = i5;
                            mosaicAddressViewModel5 = mosaicAddressViewModel4;
                            startRestartGroup.startReplaceGroup(-2122049362);
                            obj = null;
                            i7 = 0;
                            i8 = 1;
                            getHighSpeedVideoSizes(null, startRestartGroup, 0, 1);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            if (mosaicAddressUiState instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded) {
                                startRestartGroup.startReplaceGroup(-2121932554);
                                com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded loaded = (com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded) mosaicAddressUiState;
                                com.paypal.oslo.core.i18n.domain.model.AddressLayout layout = loaded.getLayout();
                                java.util.Map<java.lang.String, java.lang.String> fieldValues = loaded.getFieldValues();
                                boolean changedInstance = startRestartGroup.changedInstance(mosaicAddressViewModel4);
                                com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$MosaicAddressScreen$2$1$1 rememberedValue2 = startRestartGroup.rememberedValue();
                                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$MosaicAddressScreen$2$1$1(mosaicAddressViewModel4);
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                boxScopeInstance2 = boxScopeInstance;
                                dropdownState = rememberDropdownState;
                                i6 = i5;
                                mosaicAddressViewModel5 = mosaicAddressViewModel4;
                                getHighSpeedVideoFpsRanges(layout, addressItem3, fieldValues, rememberDropdownState, (kotlin.jvm.functions.Function2) ((kotlin.reflect.KFunction) rememberedValue2), null, startRestartGroup, (com.paypal.oslo.feature.mosaic.api.navigation.AddressItem.$stable << 3) | (i5 & 112) | (com.paypal.pds.components.DropdownState.$stable << 9), 32);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                boxScopeInstance2 = boxScopeInstance;
                                dropdownState = rememberDropdownState;
                                i6 = i5;
                                mosaicAddressViewModel5 = mosaicAddressViewModel4;
                                if (!(mosaicAddressUiState instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Error)) {
                                    startRestartGroup.startReplaceGroup(1317017356);
                                    startRestartGroup.endReplaceGroup();
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                startRestartGroup.startReplaceGroup(-2121552866);
                                java.lang.String message = ((com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Error) mosaicAddressUiState).getMessage();
                                boolean changedInstance2 = startRestartGroup.changedInstance(mosaicAddressViewModel5);
                                com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$MosaicAddressScreen$2$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
                                if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$MosaicAddressScreen$2$2$1(mosaicAddressViewModel5);
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                getHighResolutionOutputSizeshNQ4ISI(message, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue3), null, startRestartGroup, 0, 4);
                                startRestartGroup.endReplaceGroup();
                            }
                            obj = null;
                            i7 = 0;
                            i8 = 1;
                        }
                        if (!(((com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded)) {
                            startRestartGroup.startReplaceGroup(-2121298790);
                            mosaicAddressViewModel6 = mosaicAddressViewModel5;
                            com.paypal.pds.components.ButtonKt.Button(function03, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_next, startRestartGroup, i7), androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(boxScopeInstance2.align(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i8, obj), androidx.compose.ui.Alignment.INSTANCE.getBottomCenter()), com.paypal.pds.core.ConstantsKt.getSpacing16()), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, false, false, startRestartGroup, ((i6 >> 6) & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 472);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            mosaicAddressViewModel6 = mosaicAddressViewModel5;
                            startRestartGroup.startReplaceGroup(-2120965013);
                            startRestartGroup.endReplaceGroup();
                        }
                        com.paypal.pds.components.DropdownKt.DropdownBottomSheet(dropdownState, startRestartGroup, com.paypal.pds.components.DropdownState.$stable);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function02 = function03;
                        mosaicAddressViewModel3 = mosaicAddressViewModel6;
                        modifier3 = companion;
                        addressItem2 = addressItem3;
                    }
                }
                i5 = i4;
                mosaicAddressViewModel4 = mosaicAddressViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(mosaicAddressViewModel4.getUiState$mosaic_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                rememberDropdownState = com.paypal.pds.components.DropdownKt.rememberDropdownState(startRestartGroup, 0);
                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                mosaicAddressUiState = (com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState) collectAsStateWithLifecycle.getValue();
                if (!(mosaicAddressUiState instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Initial)) {
                }
                boxScopeInstance2 = boxScopeInstance;
                dropdownState = rememberDropdownState;
                i6 = i5;
                mosaicAddressViewModel5 = mosaicAddressViewModel4;
                startRestartGroup.startReplaceGroup(-2122049362);
                obj = null;
                i7 = 0;
                i8 = 1;
                getHighSpeedVideoSizes(null, startRestartGroup, 0, 1);
                startRestartGroup.endReplaceGroup();
                if (!(((com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.mosaic.ui.components.address.mvi.MosaicAddressUiState.Loaded)) {
                }
                com.paypal.pds.components.DropdownKt.DropdownBottomSheet(dropdownState, startRestartGroup, com.paypal.pds.components.DropdownState.$stable);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                function02 = function03;
                mosaicAddressViewModel3 = mosaicAddressViewModel6;
                modifier3 = companion;
                addressItem2 = addressItem3;
            } else {
                startRestartGroup.skipToGroupEnd();
                addressItem2 = addressItem3;
                modifier3 = modifier2;
                mosaicAddressViewModel3 = mosaicAddressViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final com.paypal.oslo.feature.mosaic.api.navigation.AddressItem addressItem4 = addressItem2;
                final kotlin.jvm.functions.Function0<kotlin.Unit> function04 = function02;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt.$r8$lambda$Uknr3pj87TmmNV6RzQXHKr04mq8(androidx.compose.ui.Modifier.this, addressItem4, function04, mosaicAddressViewModel3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if ((i & 3072) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoSizes(androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(747757071);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            androidx.compose.ui.Modifier modifier3 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(747757071, i3, -1, "com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressLoadingContent (MosaicAddressScreen.kt:112)");
            }
            androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
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
            androidx.compose.ui.Modifier modifier4 = modifier3;
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_loading_address_form, startRestartGroup, 0), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt.m15782$r8$lambda$BPPxcPJ79mEoK7kNp_JfwmRiTM(androidx.compose.ui.Modifier.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1773815852);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1773815852, i3, -1, "com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressErrorContent (MosaicAddressScreen.kt:129)");
                }
                androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical m1602spacedBy0680j_4 = androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(m1602spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.ui.Modifier modifier5 = modifier4;
                com.paypal.pds.components.BannerKt.Banner(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_failed_to_load_address_layout, new java.lang.Object[]{str}, startRestartGroup, 0), (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 54, 120);
                com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_retry, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, false, false, startRestartGroup, ((i3 >> 3) & 14) | 196992, 472);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt.m15783$r8$lambda$_oKB2M6k6TrxS5lzeb0NkVl8xQ(str, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, final com.paypal.oslo.feature.mosaic.api.navigation.AddressItem addressItem, final java.util.Map<java.lang.String, java.lang.String> map, final com.paypal.pds.components.DropdownState dropdownState, final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String stringResource;
        java.util.LinkedHashMap linkedHashMap;
        java.lang.String str;
        java.util.Map<java.lang.String, java.lang.String> highSpeedVideoFpsRangesFor;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1694295216);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changedInstance(addressLayout) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? startRestartGroup.changed(addressItem) : startRestartGroup.changedInstance(addressItem) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(map) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? startRestartGroup.changed(dropdownState) : startRestartGroup.changedInstance(dropdownState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
            i3 = i4;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
            } else {
                androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1694295216, i3, -1, "com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressFormContent (MosaicAddressScreen.kt:158)");
                }
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (addressItem != null) {
                    startRestartGroup.startReplaceGroup(-507260664);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_edit_address, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-507171415);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_add_address, startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringResource, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, startRestartGroup, 0, 6, 1020);
                java.lang.String str2 = "";
                if (addressItem == null || (highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(addressItem)) == null) {
                    linkedHashMap = null;
                } else {
                    java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(highSpeedVideoFpsRangesFor.size()));
                    java.util.Iterator<T> it = highSpeedVideoFpsRangesFor.entrySet().iterator();
                    while (it.hasNext()) {
                        java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                        java.lang.String str3 = (java.lang.String) entry.getKey();
                        java.util.Locale locale = java.util.Locale.ROOT;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                        java.lang.String lowerCase = str3.toLowerCase(locale);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        linkedHashMap2.put(lowerCase, entry.getValue());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                startRestartGroup.startReplaceGroup(1369123862);
                java.util.Iterator<T> it2 = addressLayout.getRows().iterator();
                java.lang.String str4 = null;
                while (it2.hasNext()) {
                    java.util.List<com.paypal.oslo.core.i18n.domain.model.AddressComponent> components = ((com.paypal.oslo.core.i18n.domain.model.AddressLayout.Row) it2.next()).getComponents();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : components) {
                        if (!((com.paypal.oslo.core.i18n.domain.model.AddressComponent) obj).getHidden()) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.ArrayList<com.paypal.oslo.core.i18n.domain.model.AddressComponent> arrayList2 = arrayList;
                    if (arrayList2.isEmpty()) {
                        str = str2;
                        startRestartGroup.startReplaceGroup(80847257);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(80266813);
                        for (com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent : arrayList2) {
                            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(addressComponent.getField().getClass()).getSimpleName();
                            if (simpleName == null) {
                                simpleName = "UnknownField";
                            }
                            java.util.Locale locale2 = java.util.Locale.ROOT;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, str2);
                            final java.lang.String lowerCase2 = simpleName.toLowerCase(locale2);
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, str2);
                            java.lang.String str5 = map.get(lowerCase2);
                            if (str5 == null) {
                                if (linkedHashMap != null) {
                                    str4 = (java.lang.String) linkedHashMap.get(lowerCase2);
                                }
                                str5 = str4 == null ? str2 : str4;
                            }
                            boolean z = (57344 & i3) == 16384;
                            boolean changed = startRestartGroup.changed(lowerCase2);
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if ((z | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt.$r8$lambda$ysK6brCjF7CQcwWS4QsRl0ajw2Y(kotlin.jvm.functions.Function2.this, lowerCase2, (java.lang.String) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            getHighResolutionOutputSizeshNQ4ISI(addressComponent, str5, (kotlin.jvm.functions.Function1) rememberedValue, dropdownState, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null), startRestartGroup, (i3 & 7168) | (com.paypal.pds.components.DropdownState.$stable << 9), 0);
                            str2 = str2;
                            str4 = null;
                            modifier3 = modifier3;
                            i3 = i3;
                        }
                        str = str2;
                        startRestartGroup.endReplaceGroup();
                    }
                    str2 = str;
                }
                androidx.compose.ui.Modifier modifier4 = modifier3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt.$r8$lambda$xeI49XHcnBJb_90Hxz059JalYEM(com.paypal.oslo.core.i18n.domain.model.AddressLayout.this, addressItem, map, dropdownState, function2, modifier2, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i3 = i4;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent, final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final com.paypal.pds.components.DropdownState dropdownState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-977938125);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(addressComponent) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? startRestartGroup.changed(dropdownState) : startRestartGroup.changedInstance(dropdownState) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-977938125, i3, -1, "com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressFieldInput (MosaicAddressScreen.kt:203)");
                }
                java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(addressComponent.getField().getClass()).getSimpleName();
                if (simpleName == null) {
                    simpleName = "UnknownField";
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String label = addressComponent.getLabel();
                if (label != null) {
                    simpleName = label;
                }
                sb.append(simpleName);
                if (addressComponent.getRequired()) {
                    sb.append(" *");
                }
                java.lang.String obj = sb.toString();
                java.util.List<com.paypal.oslo.core.i18n.domain.model.StateList> stateList = addressComponent.getStateList();
                java.lang.Object obj2 = null;
                com.paypal.oslo.core.i18n.domain.model.StateList stateList2 = stateList != null ? (com.paypal.oslo.core.i18n.domain.model.StateList) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) stateList) : null;
                if (stateList2 instanceof com.paypal.oslo.core.i18n.domain.model.StateList.MapValue) {
                    startRestartGroup.startReplaceGroup(-991037658);
                    com.paypal.oslo.core.i18n.domain.model.StateList.MapValue mapValue = (com.paypal.oslo.core.i18n.domain.model.StateList.MapValue) stateList2;
                    boolean changed = startRestartGroup.changed(mapValue);
                    java.util.ArrayList rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        java.util.Map<java.lang.String, java.lang.String> value = mapValue.getValue();
                        java.util.ArrayList arrayList = new java.util.ArrayList(value.size());
                        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : value.entrySet()) {
                            arrayList.add(new com.paypal.pds.components.MenuItem(null, entry.getValue(), entry.getKey(), null, null, 25, null));
                        }
                        rememberedValue = arrayList;
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    java.util.List list = (java.util.List) rememberedValue;
                    boolean z = (i3 & 112) == 32;
                    boolean changed2 = startRestartGroup.changed(list);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.pds.components.MenuItem) next).getKey(), str)) {
                                obj2 = next;
                                break;
                            }
                        }
                        rememberedValue2 = (com.paypal.pds.components.MenuItem) obj2;
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.MenuItem menuItem = (com.paypal.pds.components.MenuItem) rememberedValue2;
                    boolean z2 = (i3 & 896) == 256;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                return com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt.$r8$lambda$JnTxCOFDHgXgZgkUT0aLzUCxIq4(kotlin.jvm.functions.Function1.this, (com.paypal.pds.components.MenuItem) obj3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.pds.components.DropdownKt.Dropdown(dropdownState, list, modifier4, menuItem, (kotlin.jvm.functions.Function1) rememberedValue3, obj, null, false, null, false, null, null, null, null, null, null, null, startRestartGroup, com.paypal.pds.components.DropdownState.$stable | ((i3 >> 9) & 14) | ((i3 >> 6) & 896), 0, 131008);
                    startRestartGroup.endReplaceGroup();
                    composer2 = startRestartGroup;
                } else {
                    startRestartGroup.startReplaceGroup(-990525755);
                    int i5 = i3;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.TextInputKt.TextInput(str, function1, modifier4, obj, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer2, ((i5 >> 3) & 126) | ((i5 >> 6) & 896), 0, 131056);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                        return com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressScreenKt.m15781$r8$lambda$1sZBROK6UACNgt9zkZL4Dgvgmc(com.paypal.oslo.core.i18n.domain.model.AddressComponent.this, str, function1, dropdownState, modifier3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9363) == 9362, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.mosaic.api.navigation.AddressItem addressItem) {
        kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
        companion.getSerializersModule();
        java.lang.String encodeToString = companion.encodeToString(com.paypal.oslo.feature.mosaic.api.navigation.AddressItem.INSTANCE.serializer(), addressItem);
        kotlinx.serialization.json.Json.Companion companion2 = kotlinx.serialization.json.Json.INSTANCE;
        companion2.getSerializersModule();
        kotlinx.serialization.internal.StringSerializer stringSerializer = kotlinx.serialization.internal.StringSerializer.INSTANCE;
        return (java.util.Map) companion2.decodeFromString(new kotlinx.serialization.internal.LinkedHashMapSerializer(stringSerializer, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(stringSerializer)), encodeToString);
    }

    /* renamed from: $r8$lambda$1sZB-ROK6UACNgt9zkZL4Dgvgmc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15781$r8$lambda$1sZBROK6UACNgt9zkZL4Dgvgmc(com.paypal.oslo.core.i18n.domain.model.AddressComponent addressComponent, java.lang.String str, kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.DropdownState dropdownState, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(addressComponent, str, function1, dropdownState, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BPPxcPJ-79mEoK7kNp_JfwmRiTM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15782$r8$lambda$BPPxcPJ79mEoK7kNp_JfwmRiTM(androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JnTxCOFDHgXgZgkUT0aLzUCxIq4(kotlin.jvm.functions.Function1 function1, com.paypal.pds.components.MenuItem menuItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItem, "");
        function1.invoke(menuItem.getKey().toString());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Uknr3pj87TmmNV6RzQXHKr04mq8(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.mosaic.api.navigation.AddressItem addressItem, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.mosaic.ui.components.address.MosaicAddressViewModel mosaicAddressViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        MosaicAddressScreen(modifier, addressItem, function0, mosaicAddressViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_oKB2M-6k6TrxS5lzeb0NkVl8xQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15783$r8$lambda$_oKB2M6k6TrxS5lzeb0NkVl8xQ(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(str, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xeI49XHcnBJb_90Hxz059JalYEM(com.paypal.oslo.core.i18n.domain.model.AddressLayout addressLayout, com.paypal.oslo.feature.mosaic.api.navigation.AddressItem addressItem, java.util.Map map, com.paypal.pds.components.DropdownState dropdownState, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRanges(addressLayout, addressItem, map, dropdownState, function2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ysK6brCjF7CQcwWS4QsRl0ajw2Y(kotlin.jvm.functions.Function2 function2, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        function2.invoke(str, str2);
        return kotlin.Unit.INSTANCE;
    }
}
