package com.paypal.oslo.feature.onboarding.signup.ui.field;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001as\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"SignupTextInputFieldWithIcon", "", "label", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "onClick", "Lkotlin/Function0;", "alerts", "", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function0;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupTextInputFieldWithIconKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SignupTextInputFieldWithIcon(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> list2;
        final boolean z5;
        final boolean z6;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(185685012);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z;
                i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i3 |= startRestartGroup.changed(z4) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        function02 = function0;
                        i3 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changedInstance(list) ? 8388608 : 4194304;
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            list2 = list;
                            z5 = z3;
                            z6 = z4;
                            function03 = function02;
                        } else {
                            androidx.compose.ui.Modifier modifier3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            boolean z7 = i4 != 0 ? true : z3;
                            boolean z8 = i5 != 0 ? false : z4;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function04 = i6 != 0 ? null : function02;
                            java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert> emptyList = i7 != 0 ? kotlin.collections.CollectionsKt.emptyList() : list;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(185685012, i3, -1, "com.paypal.oslo.feature.onboarding.signup.ui.field.SignupTextInputFieldWithIcon (SignupTextInputFieldWithIcon.kt:51)");
                            }
                            int i9 = i3;
                            int i10 = i9 << 9;
                            composer2 = startRestartGroup;
                            androidx.compose.ui.Modifier modifier4 = modifier3;
                            com.paypal.pds.components.TextInputKt.ClickableTextInput(str2, function1, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(modifier3, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), !z7 ? function04 : null, str, null, null, z7, z8, null, null, null, true, null, null, emptyList, null, com.paypal.oslo.feature.onboarding.signup.ui.field.ComposableSingletons$SignupTextInputFieldWithIconKt.INSTANCE.getLambda$66082650$onboarding_prodRelease(), composer2, ((i9 >> 3) & 126) | ((i9 << 12) & 57344) | (i10 & 29360128) | (i10 & 234881024), (458752 & (i9 >> 6)) | 12583296, 93792);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            z5 = z7;
                            z6 = z8;
                            function03 = function04;
                            list2 = emptyList;
                            modifier2 = modifier4;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.signup.ui.field.SignupTextInputFieldWithIconKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.onboarding.signup.ui.field.SignupTextInputFieldWithIconKt.$r8$lambda$g6GPCNY54tvTjFDBfAEPlZeJTyw(str, str2, function1, modifier2, z5, z6, function03, list2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function02 = function0;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                z4 = z2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                function02 = function0;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            z3 = z;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z4 = z2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            function02 = function0;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z4 = z2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        function02 = function0;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g6GPCNY54tvTjFDBfAEPlZeJTyw(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, java.util.List list, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SignupTextInputFieldWithIcon(str, str2, function1, modifier, z, z2, function0, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
