package com.paypal.oslo.feature.wallet.banks.ui.details.nickname;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u001ag\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00060\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\f\u0010\u0018\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002"}, d2 = {"TestTagAddNicknameModal", "", "TestTagNicknameInput", "MaxNicknameLength", "", "AddNicknameModal", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "onDismiss", "Lkotlin/Function0;", "onSave", "Lkotlin/Function1;", "onRemove", "currentNickname", "errorMessage", "isLoading", "", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "AddNicknameModalPreview", "(Landroidx/compose/runtime/Composer;I)V", "EditNicknameModalPreview", "wallet_prodRelease", "nicknameValue", "fieldError"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AddNicknameModalKt {
    public static final java.lang.String TestTagAddNicknameModal = "test_tag_add_nickname_modal";
    public static final java.lang.String TestTagNicknameInput = "test_tag_nickname_input";

    /* JADX WARN: Removed duplicated region for block: B:108:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddNicknameModal(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function02, java.lang.String str, java.lang.String str2, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i4;
        java.lang.String str3;
        int i5;
        java.lang.String str4;
        int i6;
        boolean z2;
        androidx.compose.runtime.Composer composer2;
        final boolean z3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final java.lang.String str5;
        final java.lang.String str6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        int i7;
        int i8;
        int i9;
        java.lang.Boolean bool;
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1232650202);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function03 = function02;
            i3 |= startRestartGroup.changedInstance(function03) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str3 = str;
                i3 |= startRestartGroup.changed(str3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    str4 = str2;
                } else {
                    str4 = str2;
                    if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i3 |= startRestartGroup.changed(str4) ? 131072 : 65536;
                    }
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                    i3 |= 1572864;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    z3 = z2;
                    function04 = function03;
                    str5 = str3;
                    str6 = str4;
                } else {
                    if (i10 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda3
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
                    if (i4 != 0) {
                        str3 = "";
                    }
                    java.lang.String str7 = i5 != 0 ? null : str4;
                    boolean z4 = i6 != 0 ? false : z2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1232650202, i3, -1, "com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModal (AddNicknameModal.kt:83)");
                    }
                    int i11 = 57344 & i3;
                    boolean z5 = i11 == 16384;
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z5 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i7 = 2;
                        rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str3, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    } else {
                        i7 = 2;
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, i7, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new androidx.compose.ui.focus.FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    final androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue4;
                    androidx.compose.ui.focus.FocusManager focusManager = (androidx.compose.ui.focus.FocusManager) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager());
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(bottomSheetController.getVisible());
                    int i12 = i3 & 14;
                    boolean z6 = i12 == 4 || ((i3 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                    boolean changedInstance = startRestartGroup.changedInstance(focusManager);
                    boolean changed = startRestartGroup.changed(mutableState);
                    boolean z7 = i11 == 16384;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (((z6 | changedInstance | changed) || z7) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        i8 = i3;
                        i9 = i12;
                        bool = valueOf;
                        rememberedValue5 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$AddNicknameModal$2$1(bottomSheetController, focusRequester, focusManager, str3, mutableState, mutableState2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    } else {
                        i8 = i3;
                        i9 = i12;
                        bool = valueOf;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(bool, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
                    if (str3.length() == 0) {
                        startRestartGroup.startReplaceGroup(89231959);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_cancel, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(89306359);
                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_remove, startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    }
                    final java.lang.String str8 = stringResource;
                    final java.lang.String str9 = str7;
                    final boolean z8 = z4;
                    final java.lang.String str10 = str3;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function06 = function05;
                    java.lang.String str11 = str3;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function0, new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_nickname, startRestartGroup, 0), false, null, 4, null), null, null, null, function0, true, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-340668481, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.$r8$lambda$r0iesfJZBUG2Ns6WgJbg864vemQ(str9, focusRequester, mutableState, mutableState2, z8, str10, function0, function06, str8, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 817889280 | i9 | (i8 & 112) | (com.paypal.pds.components.TopNavConfig.$stable << 6) | ((i8 << 15) & 3670016), 312);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z3 = z4;
                    str5 = str11;
                    function04 = function05;
                    str6 = str7;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.$r8$lambda$x1M_Vv4McBjXPn5_78TbullpnMU(com.paypal.pds.components.BottomSheetController.this, function0, function1, function04, str5, str6, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            str3 = str;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function03 = function02;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str3 = str;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0cvbOhoRZH2v9y0Oew4PbIhJhm4(java.lang.String str, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.MutableState mutableState) {
        if (str.length() != 0) {
            function02.invoke();
        } else {
            mutableState.setValue(str);
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$2CFZNJ-Ks8YuiS-5oC-ET5lm_EA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20899$r8$lambda$2CFZNJKs8YuiS5oCET5lm_EA(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$H8BTDw6_1zre7wkg1VqAYrjR-pA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20900$r8$lambda$H8BTDw6_1zre7wkg1VqAYrjRpA(final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-691675892, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModal.<anonymous>.<anonymous>.<anonymous> (AddNicknameModal.kt:152)");
            }
            com.paypal.pds.core.Icon.XCircleFill xCircleFill = com.paypal.pds.core.Icon.XCircleFill.INSTANCE;
            boolean changed = composer.changed(mutableState);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.$r8$lambda$xDzpUSUPCkDkuKF8TDFkl3_xud8(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(xCircleFill, (kotlin.jvm.functions.Function0) rememberedValue, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, null, null, false, false, composer, 27654, 484);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Z4ElOXA3WxoekNPWmigOrjIQEbs(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$aC7_oiy0XQxl99_YvPa_I3uOjE8(androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() <= 25) {
            mutableState.setValue(str);
            if (((java.lang.String) mutableState2.getValue()) != null) {
                mutableState2.setValue(null);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jRBeZdCa9KNx_--KZJmS4WcYk7o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20904$r8$lambda$jRBeZdCa9KNx_KZJmS4WcYk7o(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1872200556);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1872200556, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.banks.ui.details.nickname.EditNicknameModalPreview (AddNicknameModal.kt:239)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            bottomSheetController.showSheet();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.$r8$lambda$Z4ElOXA3WxoekNPWmigOrjIQEbs((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AddNicknameModal(bottomSheetController, function0, (kotlin.jvm.functions.Function1) rememberedValue2, null, "My Savings Account", null, false, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 25008, 104);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.m20904$r8$lambda$jRBeZdCa9KNx_KZJmS4WcYk7o(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ko0LvYi5IpCg3jvkWUFx2czshDo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-287096817);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-287096817, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalPreview (AddNicknameModal.kt:221)");
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = new com.paypal.pds.components.BottomSheetController();
            bottomSheetController.showSheet();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.m20899$r8$lambda$2CFZNJKs8YuiS5oCET5lm_EA((java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            AddNicknameModal(bottomSheetController, function0, (kotlin.jvm.functions.Function1) rememberedValue2, null, null, null, false, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 432, 120);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.$r8$lambda$ko0LvYi5IpCg3jvkWUFx2czshDo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$mvIxwp720T_GpMQ7vDiY55809ew(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$r0iesfJZBUG2Ns6WgJbg864vemQ(java.lang.String str, androidx.compose.ui.focus.FocusRequester focusRequester, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableState mutableState2, boolean z, final java.lang.String str2, final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, java.lang.String str3, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.Composer composer2;
        int i2;
        java.util.List listOf;
        int i3;
        androidx.compose.runtime.internal.ComposableLambda composableLambda;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-340668481, i, -1, "com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModal.<anonymous> (AddNicknameModal.kt:117)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16())), TestTagAddNicknameModal);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (str == null) {
                composer.startReplaceGroup(847940297);
                composer.endReplaceGroup();
                i2 = 0;
                composer2 = composer;
            } else {
                composer.startReplaceGroup(847940298);
                composer2 = composer;
                com.paypal.pds.components.BannerKt.Banner((androidx.compose.ui.Modifier) null, com.paypal.pds.components.BannerStyle.Negative.INSTANCE, str, (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, composer, 48, 121);
                i2 = 0;
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                composer.endReplaceGroup();
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            }
            androidx.compose.runtime.MutableState mutableState3 = mutableState;
            java.lang.String str4 = (java.lang.String) mutableState3.getValue();
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_enter_nickname, composer2, i2);
            final java.lang.String str5 = (java.lang.String) mutableState2.getValue();
            if (str5 == null) {
                composer2.startReplaceGroup(848671029);
                composer.endReplaceGroup();
                listOf = null;
            } else {
                composer2.startReplaceGroup(848671030);
                com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                boolean changed = composer2.changed(str5);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.$r8$lambda$mvIxwp720T_GpMQ7vDiY55809ew(str5, (java.lang.String) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                listOf = kotlin.collections.CollectionsKt.listOf(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue));
                composer.endReplaceGroup();
            }
            java.util.List emptyList = listOf == null ? kotlin.collections.CollectionsKt.emptyList() : listOf;
            if (((java.lang.String) mutableState3.getValue()).length() > 0) {
                composer2.startReplaceGroup(849138262);
                i3 = 1;
                androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-691675892, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.m20900$r8$lambda$H8BTDw6_1zre7wkg1VqAYrjRpA(androidx.compose.runtime.MutableState.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, composer2, 54);
                composer.endReplaceGroup();
                composableLambda = rememberComposableLambda;
            } else {
                i3 = 1;
                composer2.startReplaceGroup(849517733);
                composer.endReplaceGroup();
                composableLambda = null;
            }
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, i3, null), focusRequester), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), i3, null), TestTagNicknameInput);
            boolean changed2 = composer2.changed(mutableState);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.$r8$lambda$aC7_oiy0XQxl99_YvPa_I3uOjE8(androidx.compose.runtime.MutableState.this, mutableState2, (java.lang.String) obj);
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.TextInputKt.TextInput(str4, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue2, testTag2, stringResource, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) emptyList, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) composableLambda, composer, 0, 0, 49136);
            final java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.String) mutableState3.getValue()).toString();
            final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_nickname_add_a_nickname_to_continue, composer2, 0);
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getTop(), composer2, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
            androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            boolean changed3 = composer2.changed(str2);
            boolean changed4 = composer2.changed(mutableState);
            boolean changed5 = composer2.changed(function0);
            boolean changed6 = composer2.changed(function02);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed3 | changed4 | changed5 | changed6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.$r8$lambda$0cvbOhoRZH2v9y0Oew4PbIhJhm4(str2, function0, function02, mutableState);
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, str3, weight$default, null, null, secondary, medium, !z, false, composer, 1769472, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_save, composer2, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Medium medium2 = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
            androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
            boolean changed7 = composer2.changed(obj);
            boolean changed8 = composer2.changed(stringResource2);
            androidx.compose.runtime.Composer composer3 = composer2;
            boolean changed9 = composer3.changed(function1);
            java.lang.Object rememberedValue4 = composer.rememberedValue();
            if ((changed7 | changed8 | changed9) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.banks.ui.details.nickname.AddNicknameModalKt.$r8$lambda$r4r_qSvCoucnA_ZjgVEV8BfCvSs(obj, stringResource2, function1, mutableState2);
                    }
                };
                composer3.updateRememberedValue(rememberedValue4);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, stringResource3, weight$default2, null, null, primary, medium2, false, z, composer, 1769472, 152);
            composer.endNode();
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$r4r_qSvCoucnA_ZjgVEV8BfCvSs(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState) {
        if (str.length() != 0) {
            function1.invoke(str);
        } else {
            mutableState.setValue(str2);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x1M_Vv4McBjXPn5_78TbullpnMU(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function02, java.lang.String str, java.lang.String str2, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AddNicknameModal(bottomSheetController, function0, function1, function02, str, str2, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xDzpUSUPCkDkuKF8TDFkl3_xud8(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue("");
        return kotlin.Unit.INSTANCE;
    }
}
