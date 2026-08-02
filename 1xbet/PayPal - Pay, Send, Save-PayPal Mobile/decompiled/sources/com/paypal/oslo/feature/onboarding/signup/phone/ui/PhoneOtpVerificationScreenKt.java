package com.paypal.oslo.feature.onboarding.signup.phone.ui;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a_\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001a\b\u0002\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"formatPhoneNumberForDisplay", "", "dialingCode", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/InternationalDialingCode;", "phoneNumber", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/PhoneNumber;", "formatPhoneNumberForDisplay-e_b9jFg", "(ILjava/lang/String;)Ljava/lang/String;", "PhoneOtpVerificationScreen", "", "countryCode", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "onErrorDisplay", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;", "viewModel", "Lcom/paypal/oslo/feature/onboarding/signup/phone/ui/PhoneOtpVerificationViewModel;", "PhoneOtpVerificationScreen-lwAJJJI", "(Ljava/lang/String;Ljava/lang/String;ILcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lcom/paypal/oslo/feature/onboarding/signup/phone/ui/PhoneOtpVerificationViewModel;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease", "state", "Lcom/paypal/oslo/feature/onboarding/signup/phone/ui/model/PhoneOtpVerificationState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneOtpVerificationScreenKt {
    /* renamed from: formatPhoneNumberForDisplay-e_b9jFg, reason: not valid java name */
    public static final java.lang.String m16415formatPhoneNumberForDisplaye_b9jFg(int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("+");
        sb.append(i);
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0244  */
    /* renamed from: PhoneOtpVerificationScreen-lwAJJJI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16414PhoneOtpVerificationScreenlwAJJJI(final java.lang.String str, final java.lang.String str2, final int i, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function2, com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function22;
        com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function23;
        int i6;
        androidx.compose.ui.Modifier modifier4;
        com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel4;
        boolean z;
        boolean z2;
        java.lang.Object rememberedValue;
        boolean z3;
        java.lang.Object rememberedValue2;
        boolean changedInstance;
        boolean z4;
        boolean changed;
        int i7;
        boolean z5;
        java.lang.Object rememberedValue3;
        int i8;
        com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel5;
        final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function24;
        boolean changedInstance2;
        boolean z6;
        java.lang.Object rememberedValue4;
        boolean changedInstance3;
        java.lang.Object rememberedValue5;
        boolean changedInstance4;
        java.lang.Object rememberedValue6;
        boolean changedInstance5;
        java.lang.Object rememberedValue7;
        boolean changed2;
        boolean z7;
        java.lang.Object rememberedValue8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2129253430);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= startRestartGroup.changed(appNavigator) ? 2048 : 1024;
        }
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function22 = function2;
            } else {
                function22 = function2;
                if ((i2 & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changedInstance(function22) ? 131072 : 65536;
                }
            }
            if ((i2 & 1572864) != 0) {
                phoneOtpVerificationViewModel2 = phoneOtpVerificationViewModel;
                i4 |= ((i3 & 64) == 0 && startRestartGroup.changedInstance(phoneOtpVerificationViewModel2)) ? 1048576 : 524288;
            } else {
                phoneOtpVerificationViewModel2 = phoneOtpVerificationViewModel;
            }
            if (startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
                phoneOtpVerificationViewModel3 = phoneOtpVerificationViewModel2;
            } else {
                startRestartGroup.startDefaults();
                if ((i2 & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    androidx.compose.ui.Modifier.Companion companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i5 != 0) {
                        java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                        if (rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt.m16413$r8$lambda$j7f2OJFu0N6LOagax0AT56kFgE((com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay) obj, (java.lang.String) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue9);
                        }
                        function23 = (kotlin.jvm.functions.Function2) rememberedValue9;
                    } else {
                        function23 = function22;
                    }
                    if ((i3 & 64) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        i6 = 256;
                        i4 &= -3670017;
                        modifier4 = companion;
                        phoneOtpVerificationViewModel4 = (com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(2129253430, i4, -1, "com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreen (PhoneOtpVerificationScreen.kt:86)");
                        }
                        final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(phoneOtpVerificationViewModel4.getOtpVerificationState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                        int i10 = i4 & 14;
                        z = i10 != 4;
                        int i11 = i4 & 896;
                        z2 = i11 != i6;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = m16415formatPhoneNumberForDisplaye_b9jFg(i, com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl(phoneOtpVerificationViewModel4.m16417formatPhoneNumberAsTyped_ygcFeA$onboarding_prodRelease(str, com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(str2))));
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        java.lang.String str3 = (java.lang.String) rememberedValue;
                        z3 = (i4 & 112) != 32;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(str2));
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        java.lang.String m11369unboximpl = ((com.paypal.oslo.core.i18n.domain.model.CountryCode) rememberedValue2).m11369unboximpl();
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        changedInstance = startRestartGroup.changedInstance(phoneOtpVerificationViewModel4);
                        z4 = i10 != 4;
                        changed = startRestartGroup.changed(m11369unboximpl);
                        i7 = i4;
                        z5 = i11 != 256;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((!(z4 | changedInstance | changed) && !z5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            i8 = i7;
                            phoneOtpVerificationViewModel5 = phoneOtpVerificationViewModel4;
                            function24 = function23;
                            composer2 = startRestartGroup;
                            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$2$1(phoneOtpVerificationViewModel4, str, m11369unboximpl, i, null);
                            composer2.updateRememberedValue(rememberedValue3);
                        } else {
                            phoneOtpVerificationViewModel5 = phoneOtpVerificationViewModel4;
                            function24 = function23;
                            composer2 = startRestartGroup;
                            i8 = i7;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 6);
                        com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel6 = phoneOtpVerificationViewModel5;
                        changedInstance2 = composer2.changedInstance(phoneOtpVerificationViewModel6);
                        int i12 = i8;
                        z6 = (i12 & 7168) != 2048;
                        rememberedValue4 = composer2.rememberedValue();
                        if (!(changedInstance2 | z6) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1(phoneOtpVerificationViewModel6, appNavigator, null);
                            composer2.updateRememberedValue(rememberedValue4);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(phoneOtpVerificationViewModel6, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, (i12 >> 18) & 14);
                        java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_phone_otp_verification_title, composer2, 0);
                        com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay errorDisplay = ((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) collectAsStateWithLifecycle.getValue()).getErrorDisplay();
                        boolean isLoading = ((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) collectAsStateWithLifecycle.getValue()).isLoading();
                        changedInstance3 = composer2.changedInstance(phoneOtpVerificationViewModel6);
                        rememberedValue5 = composer2.rememberedValue();
                        if (!changedInstance3 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$4$1(phoneOtpVerificationViewModel6);
                            composer2.updateRememberedValue(rememberedValue5);
                        }
                        kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue5;
                        changedInstance4 = composer2.changedInstance(phoneOtpVerificationViewModel6);
                        rememberedValue6 = composer2.rememberedValue();
                        if (!changedInstance4 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$5$1(phoneOtpVerificationViewModel6);
                            composer2.updateRememberedValue(rememberedValue6);
                        }
                        kotlin.reflect.KFunction kFunction2 = (kotlin.reflect.KFunction) rememberedValue6;
                        changedInstance5 = composer2.changedInstance(phoneOtpVerificationViewModel6);
                        rememberedValue7 = composer2.rememberedValue();
                        if (!changedInstance5 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$6$1(phoneOtpVerificationViewModel6);
                            composer2.updateRememberedValue(rememberedValue7);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) kFunction;
                        kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) kFunction2;
                        kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue7);
                        changed2 = composer2.changed(collectAsStateWithLifecycle);
                        z7 = (458752 & i12) == 131072;
                        rememberedValue8 = composer2.rememberedValue();
                        if (!(changed2 | z7) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt.m16412$r8$lambda$TP_jXa8XOwt75nlmf24JukdMgk(androidx.compose.runtime.State.this, function24, (java.lang.String) obj);
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue8);
                        }
                        kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function25 = function24;
                        com.paypal.oslo.feature.onboarding.signup.ui.component.OtpVerificationContentKt.OtpVerificationContent(str3, stringResource, errorDisplay, isLoading, function0, function1, function02, modifier4, (kotlin.jvm.functions.Function1) rememberedValue8, composer2, (i12 << 9) & 29360128, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        phoneOtpVerificationViewModel3 = phoneOtpVerificationViewModel6;
                        function22 = function25;
                        modifier3 = modifier4;
                    } else {
                        i6 = 256;
                        modifier2 = companion;
                        function22 = function23;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i3 & 64) != 0) {
                        i4 &= -3670017;
                    }
                    i6 = 256;
                }
                modifier4 = modifier2;
                function23 = function22;
                phoneOtpVerificationViewModel4 = phoneOtpVerificationViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                final androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(phoneOtpVerificationViewModel4.getOtpVerificationState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                int i102 = i4 & 14;
                if (i102 != 4) {
                }
                int i112 = i4 & 896;
                if (i112 != i6) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(z | z2)) {
                }
                rememberedValue = m16415formatPhoneNumberForDisplaye_b9jFg(i, com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl(phoneOtpVerificationViewModel4.m16417formatPhoneNumberAsTyped_ygcFeA$onboarding_prodRelease(str, com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(str2))));
                startRestartGroup.updateRememberedValue(rememberedValue);
                java.lang.String str32 = (java.lang.String) rememberedValue;
                if ((i4 & 112) != 32) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue2 = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11363boximpl(com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(str2));
                startRestartGroup.updateRememberedValue(rememberedValue2);
                java.lang.String m11369unboximpl2 = ((com.paypal.oslo.core.i18n.domain.model.CountryCode) rememberedValue2).m11369unboximpl();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(phoneOtpVerificationViewModel4);
                if (i102 != 4) {
                }
                changed = startRestartGroup.changed(m11369unboximpl2);
                i7 = i4;
                if (i112 != 256) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!(z4 | changedInstance | changed | z5)) {
                }
                i8 = i7;
                phoneOtpVerificationViewModel5 = phoneOtpVerificationViewModel4;
                function24 = function23;
                composer2 = startRestartGroup;
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$2$1(phoneOtpVerificationViewModel4, str, m11369unboximpl2, i, null);
                composer2.updateRememberedValue(rememberedValue3);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 6);
                com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel62 = phoneOtpVerificationViewModel5;
                changedInstance2 = composer2.changedInstance(phoneOtpVerificationViewModel62);
                int i122 = i8;
                if ((i122 & 7168) != 2048) {
                }
                rememberedValue4 = composer2.rememberedValue();
                if (!(changedInstance2 | z6)) {
                }
                rememberedValue4 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$3$1(phoneOtpVerificationViewModel62, appNavigator, null);
                composer2.updateRememberedValue(rememberedValue4);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(phoneOtpVerificationViewModel62, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, composer2, (i122 >> 18) & 14);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_phone_otp_verification_title, composer2, 0);
                com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay errorDisplay2 = ((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) collectAsStateWithLifecycle2.getValue()).getErrorDisplay();
                boolean isLoading2 = ((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) collectAsStateWithLifecycle2.getValue()).isLoading();
                changedInstance3 = composer2.changedInstance(phoneOtpVerificationViewModel62);
                rememberedValue5 = composer2.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue5 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$4$1(phoneOtpVerificationViewModel62);
                composer2.updateRememberedValue(rememberedValue5);
                kotlin.reflect.KFunction kFunction3 = (kotlin.reflect.KFunction) rememberedValue5;
                changedInstance4 = composer2.changedInstance(phoneOtpVerificationViewModel62);
                rememberedValue6 = composer2.rememberedValue();
                if (!changedInstance4) {
                }
                rememberedValue6 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$5$1(phoneOtpVerificationViewModel62);
                composer2.updateRememberedValue(rememberedValue6);
                kotlin.reflect.KFunction kFunction22 = (kotlin.reflect.KFunction) rememberedValue6;
                changedInstance5 = composer2.changedInstance(phoneOtpVerificationViewModel62);
                rememberedValue7 = composer2.rememberedValue();
                if (!changedInstance5) {
                }
                rememberedValue7 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$PhoneOtpVerificationScreen$6$1(phoneOtpVerificationViewModel62);
                composer2.updateRememberedValue(rememberedValue7);
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) kFunction3;
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) kFunction22;
                kotlin.jvm.functions.Function0 function022 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue7);
                changed2 = composer2.changed(collectAsStateWithLifecycle2);
                if ((458752 & i122) == 131072) {
                }
                rememberedValue8 = composer2.rememberedValue();
                if (!(changed2 | z7)) {
                }
                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt.m16412$r8$lambda$TP_jXa8XOwt75nlmf24JukdMgk(androidx.compose.runtime.State.this, function24, (java.lang.String) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue8);
                kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function252 = function24;
                com.paypal.oslo.feature.onboarding.signup.ui.component.OtpVerificationContentKt.OtpVerificationContent(str32, stringResource2, errorDisplay2, isLoading2, function03, function12, function022, modifier4, (kotlin.jvm.functions.Function1) rememberedValue8, composer2, (i122 << 9) & 29360128, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                phoneOtpVerificationViewModel3 = phoneOtpVerificationViewModel62;
                function22 = function252;
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay, ? super java.lang.String, kotlin.Unit> function26 = function22;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationScreenKt.m16411$r8$lambda$MSntbBsaWz_F252_H5FE0iQOzY(str, str2, i, appNavigator, modifier3, function26, phoneOtpVerificationViewModel3, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        if ((i2 & 1572864) != 0) {
        }
        if (startRestartGroup.shouldExecute((i4 & 599187) == 599186, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$MSntbBsaWz-_F252_H5FE0iQOzY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16411$r8$lambda$MSntbBsaWz_F252_H5FE0iQOzY(java.lang.String str, java.lang.String str2, int i, com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.onboarding.signup.phone.ui.PhoneOtpVerificationViewModel phoneOtpVerificationViewModel, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m16414PhoneOtpVerificationScreenlwAJJJI(str, str2, i, appNavigator, modifier, function2, phoneOtpVerificationViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TP_jXa8XOwt75nlmf24-JukdMgk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16412$r8$lambda$TP_jXa8XOwt75nlmf24JukdMgk(androidx.compose.runtime.State state, kotlin.jvm.functions.Function2 function2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay errorDisplay = ((com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationState) state.getValue()).getErrorDisplay();
        if (errorDisplay != null) {
            function2.invoke(errorDisplay, str);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$j-7f2OJFu0N6LOagax0AT56kFgE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16413$r8$lambda$j7f2OJFu0N6LOagax0AT56kFgE(com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay otpErrorDisplay, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(otpErrorDisplay, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }
}
