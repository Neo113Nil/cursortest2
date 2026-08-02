package com.paypal.oslo.feature.userprofile.ui.screens.phone;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001ag\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\r\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u008a\u0084\u0002²\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u0005X\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010\u0005X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0010X\u008a\u008e\u0002"}, d2 = {"SemiTransparentOverlayAlpha", "", "ConfirmPhoneScreen", "", "phoneId", "", "maskedPhoneNumber", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "viewModel", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmPhoneViewModel;", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/navigation/AppNavigator;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/ConfirmPhoneViewModel;Landroidx/compose/runtime/Composer;II)V", "ConfirmPhoneScreenContent", "code", "codeError", "isResending", "", "showKeyboard", "onCodeChange", "Lkotlin/Function1;", "onCodeComplete", "Lkotlin/Function0;", "onResendCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ConfirmPhoneScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "ConfirmPhoneScreenErrorPreview", "user-profile_prodRelease", "initState", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhoneConfirmationInitState;", "bannerMessage", "isSubmitting", "toastMessage"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConfirmPhoneScreenKt {
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0287, code lost:
    
        if (r3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L117;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmPhoneScreen(final java.lang.String str, final java.lang.String str2, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel2;
        final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel4;
        int i5;
        int i6;
        androidx.compose.runtime.State collectAsStateWithLifecycle;
        androidx.compose.runtime.State collectAsStateWithLifecycle2;
        com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState rememberCommonToastHostState;
        java.lang.Object rememberedValue;
        androidx.compose.runtime.MutableState mutableState;
        boolean changedInstance;
        int i7;
        int i8;
        com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$1$1 rememberedValue2;
        boolean changed;
        com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$2$1 rememberedValue3;
        boolean changed2;
        com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$3$1 rememberedValue4;
        boolean changed3;
        boolean changed4;
        boolean changedInstance2;
        com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$4$1 rememberedValue5;
        boolean changedInstance3;
        boolean z;
        com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1 rememberedValue6;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Error error;
        com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostState commonToastHostState;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        androidx.compose.runtime.State state;
        int i9;
        int i10;
        float f;
        java.lang.Object obj;
        int i11;
        java.lang.Object obj2;
        int i12;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1869555382);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                confirmPhoneViewModel2 = confirmPhoneViewModel;
                if (startRestartGroup.changedInstance(confirmPhoneViewModel2)) {
                    i12 = 2048;
                    i3 |= i12;
                }
            } else {
                confirmPhoneViewModel2 = confirmPhoneViewModel;
            }
            i12 = 1024;
            i3 |= i12;
        } else {
            confirmPhoneViewModel2 = confirmPhoneViewModel;
        }
        int i13 = i3;
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i6 = i13 & (-7169);
                    i4 = 0;
                    confirmPhoneViewModel4 = confirmPhoneViewModel2;
                    i5 = i6;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getInitState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getCode(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.compose.runtime.State collectAsStateWithLifecycle4 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getCodeError(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.compose.runtime.State collectAsStateWithLifecycle5 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getBannerMessage(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.isSubmitting(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.compose.runtime.State collectAsStateWithLifecycle6 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.isResending(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    androidx.compose.runtime.State collectAsStateWithLifecycle7 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getToastMessage(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    rememberCommonToastHostState = com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.rememberCommonToastHostState(startRestartGroup, i4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                    changedInstance = startRestartGroup.changedInstance(confirmPhoneViewModel4);
                    int i14 = i5 & 14;
                    if (i14 == 4) {
                    }
                    if ((i5 & 112) == 32) {
                    }
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (((changedInstance ? 1 : 0) | i7 | i8) == 0) {
                    }
                    rememberedValue2 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$1$1(confirmPhoneViewModel4, str, str2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i14);
                    com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState phoneConfirmationInitState = (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState) collectAsStateWithLifecycle.getValue();
                    changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed) {
                    }
                    rememberedValue3 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$2$1(collectAsStateWithLifecycle, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(phoneConfirmationInitState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                    boolean booleanValue = ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue();
                    changed2 = startRestartGroup.changed(collectAsStateWithLifecycle2);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue4 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$3$1(collectAsStateWithLifecycle2, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 0);
                    java.lang.String str3 = (java.lang.String) collectAsStateWithLifecycle7.getValue();
                    changed3 = startRestartGroup.changed(collectAsStateWithLifecycle7);
                    changed4 = startRestartGroup.changed(rememberCommonToastHostState);
                    changedInstance2 = startRestartGroup.changedInstance(confirmPhoneViewModel4);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!(changed3 | changed4 | changedInstance2)) {
                    }
                    rememberedValue5 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$4$1(collectAsStateWithLifecycle7, rememberCommonToastHostState, confirmPhoneViewModel4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(str3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance3 = startRestartGroup.changedInstance(confirmPhoneViewModel4);
                    int i15 = i5 & 896;
                    if (i15 == 256) {
                    }
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!(changedInstance3 | z)) {
                    }
                    rememberedValue6 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1(confirmPhoneViewModel4, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
                    com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState phoneConfirmationInitState2 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState) collectAsStateWithLifecycle.getValue();
                    if (phoneConfirmationInitState2 instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Error) {
                    }
                    if (error != null) {
                    }
                }
            } else if ((i2 & 8) != 0) {
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
                i4 = 0;
                confirmPhoneViewModel4 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i5 = i13 & (-7169);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1869555382, i5, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreen (ConfirmPhoneScreen.kt:86)");
                }
                collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getInitState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle32 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getCode(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle42 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getCodeError(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle52 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getBannerMessage(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.isSubmitting(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle62 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.isResending(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                androidx.compose.runtime.State collectAsStateWithLifecycle72 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getToastMessage(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                rememberCommonToastHostState = com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.rememberCommonToastHostState(startRestartGroup, i4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                changedInstance = startRestartGroup.changedInstance(confirmPhoneViewModel4);
                int i142 = i5 & 14;
                i7 = i142 == 4 ? 1 : i4;
                i8 = (i5 & 112) == 32 ? 1 : 0;
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | i7 | i8) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$1$1(confirmPhoneViewModel4, str, str2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i142);
                com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState phoneConfirmationInitState3 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState) collectAsStateWithLifecycle.getValue();
                changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$2$1(collectAsStateWithLifecycle, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(phoneConfirmationInitState3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                boolean booleanValue2 = ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue();
                changed2 = startRestartGroup.changed(collectAsStateWithLifecycle2);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$3$1(collectAsStateWithLifecycle2, mutableState, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue2), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 0);
                java.lang.String str32 = (java.lang.String) collectAsStateWithLifecycle72.getValue();
                changed3 = startRestartGroup.changed(collectAsStateWithLifecycle72);
                changed4 = startRestartGroup.changed(rememberCommonToastHostState);
                changedInstance2 = startRestartGroup.changedInstance(confirmPhoneViewModel4);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!(changed3 | changed4 | changedInstance2) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$4$1(collectAsStateWithLifecycle72, rememberCommonToastHostState, confirmPhoneViewModel4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(str32, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance3 = startRestartGroup.changedInstance(confirmPhoneViewModel4);
                int i152 = i5 & 896;
                z = i152 == 256;
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!(changedInstance3 | z) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1(confirmPhoneViewModel4, appNavigator, null);
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
                com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState phoneConfirmationInitState22 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState) collectAsStateWithLifecycle.getValue();
                error = phoneConfirmationInitState22 instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Error ? (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Error) phoneConfirmationInitState22 : null;
                if (error != null) {
                    startRestartGroup.startReplaceGroup(1213756341);
                    java.lang.String title = error.getTitle();
                    java.lang.String message = error.getMessage();
                    java.lang.String buttonText = error.getButtonText();
                    boolean z2 = i152 == 256;
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!z2) {
                        obj2 = rememberedValue7;
                    }
                    kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.$r8$lambda$is0uwb9L8w_vXewrSFmvQI8X0ww(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function0);
                    obj2 = function0;
                    final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel5 = confirmPhoneViewModel4;
                    com.paypal.oslo.feature.userprofile.ui.screens.email.ConfirmEmailScreenKt.ConfirmEmailInitErrorContent(title, message, buttonText, (kotlin.jvm.functions.Function0) obj2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "confirm_phone_init_error"), startRestartGroup, 24576, 0);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                                return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.$r8$lambda$62EPSWzYC1449eNEW8vvOFpcqkk(str, str2, appNavigator, confirmPhoneViewModel5, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                            }
                        };
                        endRestartGroup.updateScope(function2);
                    }
                    return;
                }
                final com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel6 = confirmPhoneViewModel4;
                startRestartGroup.startReplaceGroup(1214066744);
                startRestartGroup.endReplaceGroup();
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                int i16 = i5;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                java.lang.String str4 = (java.lang.String) collectAsStateWithLifecycle52.getValue();
                if (str4 == null) {
                    startRestartGroup.startReplaceGroup(-1638959408);
                    startRestartGroup.endReplaceGroup();
                    commonToastHostState = rememberCommonToastHostState;
                    boxScopeInstance = boxScopeInstance2;
                    i9 = 1;
                    i10 = i16;
                    state = collectAsStateWithLifecycle2;
                } else {
                    startRestartGroup.startReplaceGroup(-1638959407);
                    commonToastHostState = rememberCommonToastHostState;
                    boxScopeInstance = boxScopeInstance2;
                    state = collectAsStateWithLifecycle2;
                    i9 = 1;
                    i10 = i16;
                    com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16()), "confirm_phone_error_banner"), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, (java.lang.String) null, str4, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 48, 116);
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                }
                java.lang.String str5 = (java.lang.String) collectAsStateWithLifecycle32.getValue();
                java.lang.String str6 = (java.lang.String) collectAsStateWithLifecycle42.getValue();
                boolean booleanValue3 = ((java.lang.Boolean) collectAsStateWithLifecycle62.getValue()).booleanValue();
                boolean booleanValue4 = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
                boolean changedInstance4 = startRestartGroup.changedInstance(confirmPhoneViewModel6);
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.$r8$lambda$ue5uek7SZdafLxzLd74S50EDd50(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel.this, (java.lang.String) obj3);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue8;
                boolean changedInstance5 = startRestartGroup.changedInstance(confirmPhoneViewModel6);
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.m20549$r8$lambda$0GJa13cvVkG0MmXYJGaKEqd7MM(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue9;
                boolean changedInstance6 = startRestartGroup.changedInstance(confirmPhoneViewModel6);
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (changedInstance6 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.$r8$lambda$1s5XnRqd96qa7N2mw31OeR64nVk(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                ConfirmPhoneScreenContent(str2, str5, str6, booleanValue3, booleanValue4, function1, function02, (kotlin.jvm.functions.Function0) rememberedValue10, startRestartGroup, (i10 >> 3) & 14);
                startRestartGroup.endNode();
                if (((com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState) collectAsStateWithLifecycle.getValue()) instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Loading) {
                    startRestartGroup.startReplaceGroup(-1910434225);
                    f = 0.0f;
                    obj = null;
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i9, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), "confirm_phone_loading");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                    com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else {
                    f = 0.0f;
                    obj = null;
                    startRestartGroup.startReplaceGroup(-1910071618);
                    startRestartGroup.endReplaceGroup();
                }
                if (((java.lang.Boolean) state.getValue()).booleanValue()) {
                    startRestartGroup.startReplaceGroup(-1909949292);
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.AlphaKt.alpha(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, f, i9, obj), 0.7f), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), "confirm_phone_submitting");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                    i11 = 0;
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor4);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LoaderKt.Loader(null, null, null, null, startRestartGroup, 0, 15);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                } else {
                    i11 = 0;
                    startRestartGroup.startReplaceGroup(-1909529986);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.ToastHost(commonToastHostState, boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), startRestartGroup, i11, i11);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                confirmPhoneViewModel3 = confirmPhoneViewModel6;
            }
            i4 = 0;
            i6 = i13;
            confirmPhoneViewModel4 = confirmPhoneViewModel2;
            i5 = i6;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getInitState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.runtime.State collectAsStateWithLifecycle322 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getCode(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.runtime.State collectAsStateWithLifecycle422 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getCodeError(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.runtime.State collectAsStateWithLifecycle522 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getBannerMessage(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.isSubmitting(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.runtime.State collectAsStateWithLifecycle622 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.isResending(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.runtime.State collectAsStateWithLifecycle722 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(confirmPhoneViewModel4.getToastMessage(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            rememberCommonToastHostState = com.paypal.oslo.feature.userprofile.ui.components.common.CommonToastHostKt.rememberCommonToastHostState(startRestartGroup, i4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            changedInstance = startRestartGroup.changedInstance(confirmPhoneViewModel4);
            int i1422 = i5 & 14;
            if (i1422 == 4) {
            }
            if ((i5 & 112) == 32) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changedInstance ? 1 : 0) | i7 | i8) == 0) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$1$1(confirmPhoneViewModel4, str, str2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, i1422);
            com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState phoneConfirmationInitState32 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState) collectAsStateWithLifecycle.getValue();
            changed = startRestartGroup.changed(collectAsStateWithLifecycle);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue3 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$2$1(collectAsStateWithLifecycle, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(phoneConfirmationInitState32, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
            boolean booleanValue22 = ((java.lang.Boolean) collectAsStateWithLifecycle2.getValue()).booleanValue();
            changed2 = startRestartGroup.changed(collectAsStateWithLifecycle2);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue4 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$3$1(collectAsStateWithLifecycle2, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue22), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 0);
            java.lang.String str322 = (java.lang.String) collectAsStateWithLifecycle722.getValue();
            changed3 = startRestartGroup.changed(collectAsStateWithLifecycle722);
            changed4 = startRestartGroup.changed(rememberCommonToastHostState);
            changedInstance2 = startRestartGroup.changedInstance(confirmPhoneViewModel4);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!(changed3 | changed4 | changedInstance2)) {
            }
            rememberedValue5 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$4$1(collectAsStateWithLifecycle722, rememberCommonToastHostState, confirmPhoneViewModel4, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(str322, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
            kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
            changedInstance3 = startRestartGroup.changedInstance(confirmPhoneViewModel4);
            int i1522 = i5 & 896;
            if (i1522 == 256) {
            }
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!(changedInstance3 | z)) {
            }
            rememberedValue6 = new com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$ConfirmPhoneScreen$5$1(confirmPhoneViewModel4, appNavigator, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
            com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState phoneConfirmationInitState222 = (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState) collectAsStateWithLifecycle.getValue();
            if (phoneConfirmationInitState222 instanceof com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState.Error) {
            }
            if (error != null) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            confirmPhoneViewModel3 = confirmPhoneViewModel2;
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.$r8$lambda$R6FeY63tjRPa5Ll7aZpFa6FAh9o(str, str2, appNavigator, confirmPhoneViewModel3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            };
            endRestartGroup.updateScope(function2);
        }
    }

    public static final void ConfirmPhoneScreenContent(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final boolean z, final boolean z2, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1468317349);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((4793491 & i3) != 4793490, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1468317349, i3, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenContent (ConfirmPhoneScreen.kt:237)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "confirm_phone_screen");
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 48);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_enter_your_code, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 5, null), "confirm_phone_title"), (java.lang.String) null, (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Left, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 24576, 108);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_phone_code_sent_subtitle, new java.lang.Object[]{str}, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "confirm_phone_description"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
            com.paypal.pds.components.CodeInputFieldCount codeInputFieldCount = com.paypal.pds.components.CodeInputFieldCount.SIX;
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "verification_code_input");
            boolean z3 = (i3 & 3670016) == 1048576;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.m20548$r8$lambda$AG36DZQjGCA1ljPZLbfsYdgtUs(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.CodeInputKt.m21717CodeInputJ5mU35w(testTag2, str2, str3, codeInputFieldCount, null, (char) 0, z2, false, 0, null, (kotlin.jvm.functions.Function0) rememberedValue, function1, composer2, (i3 & 112) | 3078 | (i3 & 896) | (3670016 & (i3 << 6)), (i3 >> 12) & 112, 944);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), composer2, 0);
            com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_phone_confirmation_get_a_new_code, composer2, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "get_new_code_button"), null, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, !z, z, composer2, ((i3 >> 21) & 14) | 1769856 | ((i3 << 15) & 234881024), 24);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.$r8$lambda$n7HctRfQQWQVMSk328vNzHzRGns(str, str2, str3, z, z2, function1, function0, function02, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-AG36DZQjGCA1ljPZLbfsYdgtUs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20548$r8$lambda$AG36DZQjGCA1ljPZLbfsYdgtUs(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$0GJa-13cvVkG0MmXYJGaKEqd7MM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20549$r8$lambda$0GJa13cvVkG0MmXYJGaKEqd7MM(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel) {
        confirmPhoneViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneAction.ConfirmPhone.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1s5XnRqd96qa7N2mw31OeR64nVk(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel) {
        confirmPhoneViewModel.handleAction(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneAction.ResendCode.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$62EPSWzYC1449eNEW8vvOFpcqkk(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ConfirmPhoneScreen(str, str2, appNavigator, confirmPhoneViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R6FeY63tjRPa5Ll7aZpFa6FAh9o(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ConfirmPhoneScreen(str, str2, appNavigator, confirmPhoneViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Va0nFtIXzLh8jdAwdYUpDg3RJLw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ao1KwVYYXjDPEbVh9n9cvoFidQ8(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bXEENK9rKkqRELYpz5ros_BYoyA(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gvdddAPIGo2V62qMW163ZHLNtRI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1104737866);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1104737866, updateChangedFlags, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenErrorPreview (ConfirmPhoneScreen.kt:317)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.$r8$lambda$ao1KwVYYXjDPEbVh9n9cvoFidQ8((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ConfirmPhoneScreenContent("***-***-1234", "", "The code you have entered is invalid", false, true, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 14380470);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.$r8$lambda$gvdddAPIGo2V62qMW163ZHLNtRI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$is0uwb9L8w_vXewrSFmvQI8X0ww(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.$r8$lambda$Va0nFtIXzLh8jdAwdYUpDg3RJLw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mc0i3YfzPf1JSMBLqbjfjkHdqbM(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1914377566);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1914377566, updateChangedFlags, -1, "com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenPreview (ConfirmPhoneScreen.kt:300)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.$r8$lambda$bXEENK9rKkqRELYpz5ros_BYoyA((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ConfirmPhoneScreenContent("***-***-1234", "", null, false, true, function1, function0, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 14380470);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.screens.phone.ConfirmPhoneScreenKt.$r8$lambda$mc0i3YfzPf1JSMBLqbjfjkHdqbM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$n7HctRfQQWQVMSk328vNzHzRGns(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, androidx.compose.runtime.Composer composer, int i2) {
        ConfirmPhoneScreenContent(str, str2, str3, z, z2, function1, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ue5uek7SZdafLxzLd74S50EDd50(com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneViewModel confirmPhoneViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        confirmPhoneViewModel.handleAction(new com.paypal.oslo.feature.userprofile.ui.viewmodel.ConfirmPhoneAction.OtpCodeChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState access$ConfirmPhoneScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.userprofile.ui.viewmodel.PhoneConfirmationInitState) state.getValue();
    }

    public static final /* synthetic */ java.lang.String access$ConfirmPhoneScreen$lambda$6(androidx.compose.runtime.State state) {
        return (java.lang.String) state.getValue();
    }
}
