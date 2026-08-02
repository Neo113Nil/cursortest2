package com.paypal.oslo.app.profileerror;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a*\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"ProfileErrorGate", "", "viewModel", "Lcom/paypal/oslo/app/profileerror/ProfileErrorViewModel;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/app/profileerror/ProfileErrorViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_prodRelease", "shouldShowError", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ProfileErrorGateKt {
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        if ((r20 & 1) != 0) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfileErrorGate(com.paypal.oslo.app.profileerror.ProfileErrorViewModel profileErrorViewModel, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.app.profileerror.ProfileErrorViewModel profileErrorViewModel2;
        int i3;
        final com.paypal.oslo.app.profileerror.ProfileErrorViewModel profileErrorViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(900676975);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                profileErrorViewModel2 = profileErrorViewModel;
                if (startRestartGroup.changedInstance(profileErrorViewModel2)) {
                    i4 = 4;
                    i3 = i4 | i;
                }
            } else {
                profileErrorViewModel2 = profileErrorViewModel;
            }
            i4 = 2;
            i3 = i4 | i;
        } else {
            profileErrorViewModel2 = profileErrorViewModel;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
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
                    profileErrorViewModel2 = (com.paypal.oslo.app.profileerror.ProfileErrorViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.app.profileerror.ProfileErrorViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i5 &= -15;
                }
                profileErrorViewModel3 = profileErrorViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(900676975, i5, -1, "com.paypal.oslo.app.profileerror.ProfileErrorGate (ProfileErrorGate.kt:34)");
                }
                if (((java.lang.Boolean) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(profileErrorViewModel3.getShouldShowError(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue()).booleanValue()) {
                    startRestartGroup.startReplaceGroup(1407295189);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.profileerror.ProfileErrorGateKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(true, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 54, 0);
                    boolean changedInstance = startRestartGroup.changedInstance(profileErrorViewModel3);
                    com.paypal.oslo.app.profileerror.ProfileErrorGateKt$ProfileErrorGate$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.app.profileerror.ProfileErrorGateKt$ProfileErrorGate$2$1(profileErrorViewModel3);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.app.profileerror.ProfileErrorScreenKt.ProfileErrorScreen((kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue2), startRestartGroup, 0, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1407453754);
                    function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i5 >> 3) & 14));
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
            profileErrorViewModel3 = profileErrorViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.app.profileerror.ProfileErrorGateKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.app.profileerror.ProfileErrorGateKt.$r8$lambda$Vx9HDVKrVJ5twAYyYcwhUuMKkn0(com.paypal.oslo.app.profileerror.ProfileErrorViewModel.this, function2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Vx9HDVKrVJ5twAYyYcwhUuMKkn0(com.paypal.oslo.app.profileerror.ProfileErrorViewModel profileErrorViewModel, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProfileErrorGate(profileErrorViewModel, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
