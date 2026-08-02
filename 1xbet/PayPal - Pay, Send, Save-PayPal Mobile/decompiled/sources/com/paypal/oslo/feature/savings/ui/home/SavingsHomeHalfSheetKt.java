package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¿\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u001a\b\u0002\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"SavingsHomeHalfSheet", "", "currentHalfSheetRequest", "Lcom/paypal/oslo/feature/savings/ui/home/HalfSheetRequest;", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "moneyManagementRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "onAddMoney", "Lkotlin/Function0;", "onAddMoneyGeneralSavings", "onTransferMoney", "onDismiss", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_GOALS_VALUE, "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;", "isAddMoneyFeatureAvailable", "", "onFdicAgreementClick", "goalForSuccessSheet", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "onGoalSuccessAction", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/savings/ui/home/GoalSuccessActionType;", "SavingsHomeHalfSheet-vb775d0", "(Lcom/paypal/oslo/feature/savings/ui/home/HalfSheetRequest;Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;ZLkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsHomeHalfSheetKt {
    /* JADX WARN: Removed duplicated region for block: B:127:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* renamed from: SavingsHomeHalfSheet-vb775d0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m18864SavingsHomeHalfSheetvb775d0(final com.paypal.oslo.feature.savings.ui.home.HalfSheetRequest halfSheetRequest, final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function05, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, ? super com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        int i6;
        int i7;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO2;
        final boolean z2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function011;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function012;
        final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, ? super com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType, kotlin.Unit> function22;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function013;
        kotlin.jvm.functions.Function0<kotlin.Unit> function014;
        kotlin.jvm.functions.Function0<kotlin.Unit> function015;
        kotlin.jvm.functions.Function0<kotlin.Unit> function016;
        kotlin.jvm.functions.Function0<kotlin.Unit> function017;
        kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, ? super com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType, kotlin.Unit> function23;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(901475786);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(halfSheetRequest) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changed(appNavigator) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(str) ? 2048 : 1024;
        }
        int i15 = i3 & 16;
        if (i15 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function06 = function02;
            } else {
                function06 = function02;
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i4 |= startRestartGroup.changedInstance(function06) ? 131072 : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changedInstance(function03) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                function07 = function04;
            } else {
                function07 = function04;
                if ((i & 12582912) == 0) {
                    i4 |= startRestartGroup.changedInstance(function07) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changedInstance(goalZoneDTO) ? 67108864 : 33554432;
            }
            i9 = i3 & 512;
            if (i9 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changed(z) ? 536870912 : 268435456;
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i11 = i2 | (startRestartGroup.changedInstance(function05) ? 4 : 2);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
                i11 |= 48;
            } else if ((i2 & 48) == 0) {
                i11 |= startRestartGroup.changed(goalSummaryDTO) ? 32 : 16;
            }
            i13 = i11;
            i14 = i3 & 4096;
            if (i14 == 0) {
                i13 |= 384;
            } else if ((i2 & 384) == 0) {
                i13 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 147) != 146, i4 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function08 = function0;
                    function09 = function03;
                    goalZoneDTO2 = goalZoneDTO;
                    z2 = z;
                    function010 = function05;
                    goalSummaryDTO2 = goalSummaryDTO;
                    function011 = function07;
                    function012 = function06;
                    function22 = function2;
                } else {
                    if (i15 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function013 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function013 = function0;
                    }
                    if (i5 != 0) {
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function014 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    } else {
                        function014 = function06;
                    }
                    if (i6 != 0) {
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        function015 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    } else {
                        function015 = function03;
                    }
                    if (i7 != 0) {
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        function016 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    } else {
                        function016 = function07;
                    }
                    com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO3 = i8 != 0 ? null : goalZoneDTO;
                    boolean z3 = i9 != 0 ? true : z;
                    if (i10 != 0) {
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        function017 = (kotlin.jvm.functions.Function0) rememberedValue5;
                    } else {
                        function017 = function05;
                    }
                    com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO3 = i12 != 0 ? null : goalSummaryDTO;
                    if (i14 != 0) {
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt.$r8$lambda$gyTUpHUKSt47vhQg8Ffz31RYW6M((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj, (com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        function23 = (kotlin.jvm.functions.Function2) rememberedValue6;
                    } else {
                        function23 = function2;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(901475786, i4, i13, "com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheet (SavingsHomeHalfSheet.kt:53)");
                    }
                    boolean changedInstance = startRestartGroup.changedInstance(halfSheetRequest);
                    int i16 = i4 & 112;
                    boolean z4 = i16 == 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                    com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt$SavingsHomeHalfSheet$7$1 rememberedValue7 = startRestartGroup.rememberedValue();
                    if ((changedInstance | z4) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt$SavingsHomeHalfSheet$7$1(halfSheetRequest, bottomSheetController, null);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(halfSheetRequest, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue7, startRestartGroup, i4 & 14);
                    if (halfSheetRequest == null) {
                        startRestartGroup.startReplaceGroup(-564327497);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                    } else {
                        startRestartGroup.startReplaceGroup(-564327496);
                        com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetType type = halfSheetRequest.getType();
                        boolean z5 = i16 == 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                        boolean z6 = (i4 & 896) == 256;
                        boolean z7 = (i4 & 7168) == 2048;
                        boolean z8 = (57344 & i4) == 16384;
                        boolean z9 = (458752 & i4) == 131072;
                        boolean z10 = (3670016 & i4) == 1048576;
                        boolean z11 = (29360128 & i4) == 8388608;
                        boolean z12 = (i13 & 14) == 4;
                        boolean z13 = (i13 & 896) == 256;
                        java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                        if ((z5 | z6 | z7 | z8 | z9 | z10 | z11 | z12 | z13) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function018 = function013;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function019 = function014;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function020 = function015;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function021 = function016;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function022 = function017;
                            final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, ? super com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType, kotlin.Unit> function24 = function23;
                            rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt.$r8$lambda$l5WKkKU2299_6cmGpaEVKWAXqgM(com.paypal.pds.components.BottomSheetController.this, appNavigator, str, function018, function019, function020, function021, function022, function24, (com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue8);
                        }
                        int i17 = i4;
                        composer2 = startRestartGroup;
                        com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetManagerKt.SavingsHalfSheetManager(type, bottomSheetController, null, (kotlin.jvm.functions.Function1) rememberedValue8, null, goalZoneDTO3, false, z3, null, goalSummaryDTO3, null, null, false, null, null, composer2, (com.paypal.pds.components.BottomSheetController.$stable << 3) | i16 | ((i17 >> 9) & 458752) | ((i17 >> 6) & 29360128) | ((i13 << 24) & 1879048192), 0, 32084);
                        composer2.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function09 = function015;
                    function08 = function013;
                    function012 = function014;
                    function011 = function016;
                    goalZoneDTO2 = goalZoneDTO3;
                    z2 = z3;
                    function010 = function017;
                    goalSummaryDTO2 = goalSummaryDTO3;
                    function22 = function23;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.home.SavingsHomeHalfSheetKt.$r8$lambda$zqJ1JXMHm0iPuACKXy38K84TGDk(com.paypal.oslo.feature.savings.ui.home.HalfSheetRequest.this, bottomSheetController, appNavigator, str, function08, function012, function09, function011, goalZoneDTO2, z2, function010, goalSummaryDTO2, function22, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 147) != 146, i4 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        i13 = i11;
        i14 = i3 & 4096;
        if (i14 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i4 & 306783379) == 306783378 || (i13 & 147) != 146, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gyTUpHUKSt47vhQg8Ffz31RYW6M(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, com.paypal.oslo.feature.savings.ui.home.GoalSuccessActionType goalSuccessActionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSuccessActionType, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$l5WKkKU2299_6cmGpaEVKWAXqgM(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.savings.ui.home.SavingsHalfSheetAction savingsHalfSheetAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHalfSheetAction, "");
        com.paypal.oslo.feature.savings.ui.home.SavingsHomeActionHandlersKt.m18859handleHalfSheetActionqXWgq1I(savingsHalfSheetAction, bottomSheetController, appNavigator, str, function0, function02, function03, function04, function05, function2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zqJ1JXMHm0iPuACKXy38K84TGDk(com.paypal.oslo.feature.savings.ui.home.HalfSheetRequest halfSheetRequest, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, boolean z, kotlin.jvm.functions.Function0 function05, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, kotlin.jvm.functions.Function2 function2, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        m18864SavingsHomeHalfSheetvb775d0(halfSheetRequest, bottomSheetController, appNavigator, str, function0, function02, function03, function04, goalZoneDTO, z, function05, goalSummaryDTO, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }
}
