package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\\\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\t*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0000¨\u0006\u0013²\u0006\u001b\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u000eX\u008a\u0084\u0002²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u0016\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"BasicEdgeToEdgeDialog", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "lightStatusBars", "", "lightNavigationBars", "content", "Lkotlin/Function1;", "Landroidx/compose/material3/internal/PredictiveBackState;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/window/DialogProperties;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "shouldApplySecureFlag", "Landroidx/compose/ui/window/SecureFlagPolicy;", "isSecureFlagSetOnParent", "material3", "currentContent", "currentOnDismissRequest", "currentDismissOnBackPress"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicEdgeToEdgeDialog_androidKt {
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0279, code lost:
    
        if (r12.changed(r7) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0295, code lost:
    
        if (r12.changed(r9) == false) goto L149;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BasicEdgeToEdgeDialog(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.ui.window.DialogProperties dialogProperties, boolean z, boolean z2, final kotlin.jvm.functions.Function3<? super androidx.compose.material3.internal.PredictiveBackState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.window.DialogProperties dialogProperties2;
        boolean z3;
        boolean z4;
        final androidx.compose.ui.Modifier modifier3;
        final androidx.compose.ui.window.DialogProperties dialogProperties3;
        final boolean z5;
        final boolean z6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z7;
        int i5;
        androidx.compose.ui.Modifier modifier4;
        androidx.compose.ui.window.DialogProperties dialogProperties4;
        boolean z8;
        androidx.compose.runtime.State state;
        int i6;
        int i7;
        boolean z9;
        boolean z10;
        boolean z11;
        java.lang.Object obj;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean changedInstance2;
        boolean z12;
        int i8;
        boolean z13;
        boolean changed;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        java.lang.Object rememberedValue2;
        int i9;
        int i10;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(814581409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                dialogProperties2 = dialogProperties;
                i3 |= startRestartGroup.changed(dialogProperties2) ? 256 : 128;
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        z3 = z;
                        if (startRestartGroup.changed(z3)) {
                            i10 = 2048;
                            i3 |= i10;
                        }
                    } else {
                        z3 = z;
                    }
                    i10 = 1024;
                    i3 |= i10;
                } else {
                    z3 = z;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        z4 = z2;
                        if (startRestartGroup.changed(z4)) {
                            i9 = 16384;
                            i3 |= i9;
                        }
                    } else {
                        z4 = z2;
                    }
                    i9 = 8192;
                    i3 |= i9;
                } else {
                    z4 = z2;
                }
                if ((i2 & 32) != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
                }
                if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        androidx.compose.ui.Modifier.Companion companion = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        androidx.compose.ui.window.DialogProperties dialogProperties5 = i4 != 0 ? new androidx.compose.ui.window.DialogProperties(false, false, false, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null) : dialogProperties2;
                        if ((i2 & 8) != 0) {
                            z7 = androidx.compose.ui.graphics.ColorKt.m6047luminance8_81llA(((androidx.compose.ui.graphics.Color) startRestartGroup.consume(androidx.compose.material3.ContentColorKt.getLocalContentColor())).m6006unboximpl()) < 0.5f;
                            i3 &= -7169;
                        } else {
                            z7 = z3;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                            z4 = androidx.compose.ui.graphics.ColorKt.m6047luminance8_81llA(((androidx.compose.ui.graphics.Color) startRestartGroup.consume(androidx.compose.material3.ContentColorKt.getLocalContentColor())).m6006unboximpl()) < 0.5f;
                        }
                        i5 = i3;
                        modifier4 = companion;
                        dialogProperties4 = dialogProperties5;
                        z8 = z7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        modifier4 = modifier2;
                        dialogProperties4 = dialogProperties2;
                        z8 = z3;
                        i5 = i3;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(814581409, i5, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog (BasicEdgeToEdgeDialog.android.kt:90)");
                    }
                    android.view.View view = (android.view.View) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                    final androidx.compose.ui.unit.LayoutDirection layoutDirection = (androidx.compose.ui.unit.LayoutDirection) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalLayoutDirection());
                    androidx.compose.runtime.CompositionContext rememberCompositionContext = androidx.compose.runtime.ComposablesKt.rememberCompositionContext(startRestartGroup, 0);
                    java.lang.Object[] objArr = new java.lang.Object[0];
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                java.util.UUID randomUUID;
                                randomUUID = java.util.UUID.randomUUID();
                                return randomUUID;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    java.util.UUID uuid = (java.util.UUID) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 48);
                    androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function3, startRestartGroup, (i5 >> 15) & 14);
                    int i12 = i5 & 14;
                    androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, i12);
                    androidx.compose.runtime.State rememberUpdatedState3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(java.lang.Boolean.valueOf(dialogProperties4.getDismissOnBackPress()), startRestartGroup, 0);
                    boolean changed2 = startRestartGroup.changed(view);
                    boolean changed3 = startRestartGroup.changed(density);
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed2 && !changed3) {
                        state = rememberUpdatedState2;
                        if (rememberedValue4 != androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            i6 = i12;
                            i7 = i5;
                            z9 = z4;
                            z10 = z8;
                            z11 = true;
                            obj = rememberedValue4;
                            final androidx.compose.material3.internal.DialogWrapper dialogWrapper = (androidx.compose.material3.internal.DialogWrapper) obj;
                            changedInstance = startRestartGroup.changedInstance(dialogWrapper);
                            rememberedValue = startRestartGroup.rememberedValue();
                            if (!changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj2) {
                                        return androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt.m4287$r8$lambda$9kmuKv_LIBwhUR2F2fbYp2OyVo(androidx.compose.material3.internal.DialogWrapper.this, (androidx.compose.runtime.DisposableEffectScope) obj2);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            androidx.compose.runtime.EffectsKt.DisposableEffect(dialogWrapper, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
                            changedInstance2 = startRestartGroup.changedInstance(dialogWrapper);
                            z12 = i6 != 4 ? z11 : false;
                            i8 = i7;
                            z13 = (i8 & 896) != 256 ? z11 : false;
                            changed = startRestartGroup.changed(layoutDirection.ordinal());
                            if (((i8 & 7168) ^ 3072) <= 2048) {
                                z14 = z10;
                            } else {
                                z14 = z10;
                            }
                            if ((i8 & 3072) != 2048) {
                                z15 = false;
                                if (((57344 & i8) ^ 24576) > 16384) {
                                    z16 = z9;
                                } else {
                                    z16 = z9;
                                }
                                if ((i8 & 24576) != 16384) {
                                    z17 = false;
                                    rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (!(changedInstance2 | z12 | z13 | changed | z15 | z17) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        final androidx.compose.ui.window.DialogProperties dialogProperties6 = dialogProperties4;
                                        final boolean z18 = z14;
                                        final boolean z19 = z16;
                                        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt.m4288$r8$lambda$uHlN0Q4YtsX4zgW_6HFF6skQ_4(androidx.compose.material3.internal.DialogWrapper.this, function0, dialogProperties6, layoutDirection, z18, z19);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(function02);
                                        rememberedValue2 = function02;
                                    }
                                    androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    z5 = z14;
                                    z6 = z16;
                                    modifier3 = modifier4;
                                    dialogProperties3 = dialogProperties4;
                                }
                                z17 = z11;
                                rememberedValue2 = startRestartGroup.rememberedValue();
                                if (!(changedInstance2 | z12 | z13 | changed | z15 | z17)) {
                                }
                                final androidx.compose.ui.window.DialogProperties dialogProperties62 = dialogProperties4;
                                final boolean z182 = z14;
                                final boolean z192 = z16;
                                kotlin.jvm.functions.Function0 function022 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt.m4288$r8$lambda$uHlN0Q4YtsX4zgW_6HFF6skQ_4(androidx.compose.material3.internal.DialogWrapper.this, function0, dialogProperties62, layoutDirection, z182, z192);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(function022);
                                rememberedValue2 = function022;
                                androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                }
                                z5 = z14;
                                z6 = z16;
                                modifier3 = modifier4;
                                dialogProperties3 = dialogProperties4;
                            }
                            z15 = z11;
                            if (((57344 & i8) ^ 24576) > 16384) {
                            }
                            if ((i8 & 24576) != 16384) {
                            }
                            z17 = z11;
                            rememberedValue2 = startRestartGroup.rememberedValue();
                            if (!(changedInstance2 | z12 | z13 | changed | z15 | z17)) {
                            }
                            final androidx.compose.ui.window.DialogProperties dialogProperties622 = dialogProperties4;
                            final boolean z1822 = z14;
                            final boolean z1922 = z16;
                            kotlin.jvm.functions.Function0 function0222 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt.m4288$r8$lambda$uHlN0Q4YtsX4zgW_6HFF6skQ_4(androidx.compose.material3.internal.DialogWrapper.this, function0, dialogProperties622, layoutDirection, z1822, z1922);
                                }
                            };
                            startRestartGroup.updateRememberedValue(function0222);
                            rememberedValue2 = function0222;
                            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            z5 = z14;
                            z6 = z16;
                            modifier3 = modifier4;
                            dialogProperties3 = dialogProperties4;
                        }
                    } else {
                        state = rememberUpdatedState2;
                    }
                    androidx.compose.runtime.State state2 = state;
                    i6 = i12;
                    i7 = i5;
                    z9 = z4;
                    z10 = z8;
                    androidx.compose.material3.internal.DialogWrapper dialogWrapper2 = new androidx.compose.material3.internal.DialogWrapper(function0, dialogProperties4, view, layoutDirection, density, uuid, z8, z9);
                    androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1 basicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1 = new androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1(modifier4, rememberUpdatedState3, state2, rememberUpdatedState);
                    z11 = true;
                    dialogWrapper2.getHighSpeedVideoFpsRanges.setContent(rememberCompositionContext, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-635938462, true, basicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1));
                    startRestartGroup.updateRememberedValue(dialogWrapper2);
                    obj = dialogWrapper2;
                    final androidx.compose.material3.internal.DialogWrapper dialogWrapper3 = (androidx.compose.material3.internal.DialogWrapper) obj;
                    changedInstance = startRestartGroup.changedInstance(dialogWrapper3);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt.m4287$r8$lambda$9kmuKv_LIBwhUR2F2fbYp2OyVo(androidx.compose.material3.internal.DialogWrapper.this, (androidx.compose.runtime.DisposableEffectScope) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.compose.runtime.EffectsKt.DisposableEffect(dialogWrapper3, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
                    changedInstance2 = startRestartGroup.changedInstance(dialogWrapper3);
                    if (i6 != 4) {
                    }
                    i8 = i7;
                    if ((i8 & 896) != 256) {
                    }
                    changed = startRestartGroup.changed(layoutDirection.ordinal());
                    if (((i8 & 7168) ^ 3072) <= 2048) {
                    }
                    if ((i8 & 3072) != 2048) {
                    }
                    z15 = z11;
                    if (((57344 & i8) ^ 24576) > 16384) {
                    }
                    if ((i8 & 24576) != 16384) {
                    }
                    z17 = z11;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!(changedInstance2 | z12 | z13 | changed | z15 | z17)) {
                    }
                    final androidx.compose.ui.window.DialogProperties dialogProperties6222 = dialogProperties4;
                    final boolean z18222 = z14;
                    final boolean z19222 = z16;
                    kotlin.jvm.functions.Function0 function02222 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt.m4288$r8$lambda$uHlN0Q4YtsX4zgW_6HFF6skQ_4(androidx.compose.material3.internal.DialogWrapper.this, function0, dialogProperties6222, layoutDirection, z18222, z19222);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function02222);
                    rememberedValue2 = function02222;
                    androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z14;
                    z6 = z16;
                    modifier3 = modifier4;
                    dialogProperties3 = dialogProperties4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    dialogProperties3 = dialogProperties2;
                    z5 = z3;
                    z6 = z4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt.$r8$lambda$q0N_73IcK0ZPEHbuOZHIihNucmg(kotlin.jvm.functions.Function0.this, modifier3, dialogProperties3, z5, z6, function3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            dialogProperties2 = dialogProperties;
            if ((i & 3072) == 0) {
            }
            if ((i & 24576) == 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        dialogProperties2 = dialogProperties;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 74899) != 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final boolean shouldApplySecureFlag(androidx.compose.ui.window.SecureFlagPolicy secureFlagPolicy, boolean z) {
        int i = androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt.WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i == 3) {
            return z;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    /* renamed from: $r8$lambda$9kmuKv_LIBwhUR2F2fbYp-2OyVo, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m4287$r8$lambda$9kmuKv_LIBwhUR2F2fbYp2OyVo(final androidx.compose.material3.internal.DialogWrapper dialogWrapper, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        dialogWrapper.show();
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$lambda$9$lambda$8$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.compose.material3.internal.DialogWrapper.this.dismiss();
                androidx.compose.material3.internal.DialogWrapper.this.getHighSpeedVideoFpsRanges.disposeComposition();
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$q0N_73IcK0ZPEHbuOZHIihNucmg(kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, androidx.compose.ui.window.DialogProperties dialogProperties, boolean z, boolean z2, kotlin.jvm.functions.Function3 function3, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BasicEdgeToEdgeDialog(function0, modifier, dialogProperties, z, z2, function3, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uHlN0Q4YtsX4-zgW_6HFF6skQ_4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m4288$r8$lambda$uHlN0Q4YtsX4zgW_6HFF6skQ_4(androidx.compose.material3.internal.DialogWrapper dialogWrapper, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.window.DialogProperties dialogProperties, androidx.compose.ui.unit.LayoutDirection layoutDirection, boolean z, boolean z2) {
        dialogWrapper.getHighResolutionOutputSizeshNQ4ISI(function0, dialogProperties, layoutDirection, z, z2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function3 access$BasicEdgeToEdgeDialog$lambda$2(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function3) state.getValue();
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function0 access$BasicEdgeToEdgeDialog$lambda$3(androidx.compose.runtime.State state) {
        return (kotlin.jvm.functions.Function0) state.getValue();
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.ui.window.SecureFlagPolicy.values().length];
            try {
                iArr[androidx.compose.ui.window.SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.ui.window.SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.ui.window.SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
