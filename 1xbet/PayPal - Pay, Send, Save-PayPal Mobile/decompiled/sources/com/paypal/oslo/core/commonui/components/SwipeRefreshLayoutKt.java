package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\t2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u0002H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0014H\u0002¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\"\u000e\u0010\u0011\u001a\u00020\u0012X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019²\u0006\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007X\u008a\u0084\u0002²\u0006 \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\t\"\b\b\u0000\u0010\u0002*\u00020\u0003X\u008a\u0084\u0002²\u0006 \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\t\"\b\b\u0000\u0010\u0002*\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u0004\u001a\u00020\u0005X\u008a\u008e\u0002"}, d2 = {"SwipeRefreshLayout", "", "T", "Landroid/view/View;", "isRefreshing", "", "onRefresh", "Lkotlin/Function0;", "factory", "Lkotlin/Function1;", "Landroid/content/Context;", "modifier", "Landroidx/compose/ui/Modifier;", "isEnabled", "update", "onRelease", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ChildViewTag", "", "findChildView", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)Landroid/view/View;", "SwipeRefreshLayoutInteractivePreview", "(Landroidx/compose/runtime/Composer;I)V", "SwipeRefreshLayoutRefreshingPreview", "common-ui_release", "currentOnRefresh", "currentUpdate", "currentOnRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SwipeRefreshLayoutKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T extends android.view.View> void SwipeRefreshLayout(final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> function1, androidx.compose.ui.Modifier modifier, boolean z2, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function13, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function14;
        int i6;
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function15;
        final androidx.compose.ui.Modifier modifier3;
        final boolean z4;
        final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function16;
        final kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function17;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i7;
        int i8;
        final int i9;
        int i10;
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function18;
        final androidx.compose.runtime.State state;
        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function19;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1379322575);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z3 = z2;
                i3 |= startRestartGroup.changed(z3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    function14 = function12;
                    i3 |= startRestartGroup.changedInstance(function14) ? 131072 : 65536;
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                        function15 = function13;
                    } else {
                        function15 = function13;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changedInstance(function15) ? 1048576 : 524288;
                        }
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z4 = z3;
                        function16 = function15;
                        function17 = function14;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i11 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        boolean z5 = i4 != 0 ? true : z3;
                        if (i5 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt.m11202$r8$lambda$FRuybdvSdymv_3zou0MWrShpd8((android.view.View) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function14 = (kotlin.jvm.functions.Function1) rememberedValue;
                        }
                        if (i6 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt.$r8$lambda$IvJSSyZgP7ns6jOMHPPM2dbOnzE((android.view.View) obj);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function15 = (kotlin.jvm.functions.Function1) rememberedValue2;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1379322575, i3, -1, "com.paypal.oslo.core.commonui.components.SwipeRefreshLayout (SwipeRefreshLayout.kt:96)");
                        }
                        final androidx.compose.runtime.State rememberUpdatedState = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function0, startRestartGroup, (i3 >> 3) & 14);
                        final androidx.compose.runtime.State rememberUpdatedState2 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function14, startRestartGroup, (i3 >> 15) & 14);
                        androidx.compose.runtime.State rememberUpdatedState3 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(function15, startRestartGroup, (i3 >> 18) & 14);
                        final int m6049toArgb8_81llA = androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(com.paypal.pds.core.Color.BackgroundElevatedPopover.INSTANCE.getValue(startRestartGroup, 6));
                        int m6049toArgb8_81llA2 = androidx.compose.ui.graphics.ColorKt.m6049toArgb8_81llA(com.paypal.pds.core.Color.BorderRoleEmphasisNeutral.INSTANCE.getValue(startRestartGroup, 6));
                        boolean z6 = (i3 & 896) == 256;
                        int i12 = 57344 & i3;
                        boolean z7 = i12 == 16384;
                        boolean changed = startRestartGroup.changed(rememberUpdatedState);
                        int i13 = i3 & 14;
                        int i14 = i3;
                        boolean z8 = i13 == 4;
                        boolean changed2 = startRestartGroup.changed(m6049toArgb8_81llA);
                        boolean changed3 = startRestartGroup.changed(m6049toArgb8_81llA2);
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (((z8 | z6 | z7 | changed | changed2) || changed3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            i7 = i14;
                            i8 = i12;
                            final boolean z9 = z5;
                            i9 = m6049toArgb8_81llA2;
                            i10 = m6049toArgb8_81llA;
                            function18 = function15;
                            state = rememberUpdatedState3;
                            kotlin.jvm.functions.Function1 function110 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt.$r8$lambda$ebNSPDWMBbRvMXfYdGw2sO0RAA0(kotlin.jvm.functions.Function1.this, z9, z, m6049toArgb8_81llA, i9, rememberUpdatedState, (android.content.Context) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(function110);
                            rememberedValue3 = function110;
                        } else {
                            i8 = i12;
                            i9 = m6049toArgb8_81llA2;
                            i10 = m6049toArgb8_81llA;
                            function18 = function15;
                            i7 = i14;
                            state = rememberUpdatedState3;
                        }
                        kotlin.jvm.functions.Function1 function111 = (kotlin.jvm.functions.Function1) rememberedValue3;
                        boolean changed4 = startRestartGroup.changed(state);
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt.m11204$r8$lambda$XPbLMIMFtHv01OauPL6xuJR6Q(androidx.compose.runtime.State.this, (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        kotlin.jvm.functions.Function1 function112 = (kotlin.jvm.functions.Function1) rememberedValue4;
                        boolean z10 = i8 == 16384;
                        boolean z11 = i13 == 4;
                        boolean changed5 = startRestartGroup.changed(rememberUpdatedState);
                        final int i15 = i10;
                        boolean changed6 = startRestartGroup.changed(i15);
                        final int i16 = i9;
                        boolean changed7 = startRestartGroup.changed(i16);
                        boolean changed8 = startRestartGroup.changed(rememberUpdatedState2);
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (((changed5 | z10 | z11 | changed6 | changed7) || changed8) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            function19 = function14;
                            final boolean z12 = z5;
                            rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt.m11206$r8$lambda$u9l0JOtxkVmSON5mKXmukAr0uM(z12, z, i15, i16, rememberUpdatedState, rememberUpdatedState2, (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        } else {
                            function19 = function14;
                        }
                        kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function113 = function18;
                        androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function111, modifier4, null, function112, (kotlin.jvm.functions.Function1) rememberedValue5, startRestartGroup, (i7 >> 6) & 112, 4);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        function16 = function113;
                        function17 = function19;
                        modifier3 = modifier4;
                        z4 = z5;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt.$r8$lambda$x03eUTVYY5Qme98I_9Jyq0aNeAw(z, function0, function1, modifier3, z4, function17, function16, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function14 = function12;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z3 = z2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            function14 = function12;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z3 = z2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        function14 = function12;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final <T extends android.view.View> T getHighResolutionOutputSizeshNQ4ISI(androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        int childCount = swipeRefreshLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            T t = (T) swipeRefreshLayout.getChildAt(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(t.getTag(com.paypal.pds.R.id.core_pds_swipe_refresh_child_tag), "pds_swipe_refresh_child")) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(t, "");
                return t;
            }
        }
        throw new java.lang.IllegalStateException("SwipeRefreshLayout child view not found".toString());
    }

    public static /* synthetic */ android.widget.TextView $r8$lambda$2pgxqickNwNFg_CTx3J_igooNhQ(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText("Refreshing...");
        return textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$48QAMCmHNhZZNYivOXM81qUwK3U(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-70840721);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-70840721, updateChangedFlags, -1, "com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutInteractivePreview (SwipeRefreshLayout.kt:151)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) rememberedValue2;
            boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            boolean changedInstance = startRestartGroup.changedInstance(coroutineScope);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt.$r8$lambda$FFBBw27l88bYk8yMhwew0XPAaaU(kotlinx.coroutines.CoroutineScope.this, mutableState);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt.$r8$lambda$68hpoj4alMqSvTKgI8zthgOy3O8((android.content.Context) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            SwipeRefreshLayout(booleanValue, function0, (kotlin.jvm.functions.Function1) rememberedValue4, null, false, null, null, startRestartGroup, 384, 120);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt.$r8$lambda$48QAMCmHNhZZNYivOXM81qUwK3U(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ android.widget.TextView $r8$lambda$68hpoj4alMqSvTKgI8zthgOy3O8(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText("Pull down to refresh");
        textView.setTextSize(16.0f);
        textView.setGravity(17);
        return textView;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$FFBBw27l88bYk8yMhwew0XPAaaU(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$SwipeRefreshLayoutInteractivePreview$1$1$1$1(mutableState, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$FRuybdvSd-ymv_3zou0MWrShpd8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11202$r8$lambda$FRuybdvSdymv_3zou0MWrShpd8(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$IvJSSyZgP7ns6jOMHPPM2dbOnzE(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XPbLMIMFt-Hv-01OauPL6xuJR6Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11204$r8$lambda$XPbLMIMFtHv01OauPL6xuJR6Q(androidx.compose.runtime.State state, androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swipeRefreshLayout, "");
        ((kotlin.jvm.functions.Function1) state.getValue()).invoke(getHighResolutionOutputSizeshNQ4ISI(swipeRefreshLayout));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.swiperefreshlayout.widget.SwipeRefreshLayout $r8$lambda$ebNSPDWMBbRvMXfYdGw2sO0RAA0(kotlin.jvm.functions.Function1 function1, boolean z, boolean z2, int i, int i2, androidx.compose.runtime.State state, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.view.View view = (android.view.View) function1.invoke(context);
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout(context);
        swipeRefreshLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        swipeRefreshLayout.setEnabled(z);
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) state.getValue();
        swipeRefreshLayout.setOnRefreshListener(new androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda1
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                kotlin.jvm.functions.Function0.this.invoke();
            }
        });
        swipeRefreshLayout.setRefreshing(z2);
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(i);
        swipeRefreshLayout.setColorSchemeColors(i2);
        view.setTag(com.paypal.pds.R.id.core_pds_swipe_refresh_child_tag, "pds_swipe_refresh_child");
        swipeRefreshLayout.addView(view);
        return swipeRefreshLayout;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pyzUtR6JYcfbxZb7JtpbBzzjqg4(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-878155784);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-878155784, updateChangedFlags, -1, "com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutRefreshingPreview (SwipeRefreshLayout.kt:179)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda2
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
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt.$r8$lambda$2pgxqickNwNFg_CTx3J_igooNhQ((android.content.Context) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SwipeRefreshLayout(true, function0, (kotlin.jvm.functions.Function1) rememberedValue2, null, false, null, null, startRestartGroup, 438, 120);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt.$r8$lambda$pyzUtR6JYcfbxZb7JtpbBzzjqg4(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$u9l0JOtxkVmSON5mKXmu-kAr0uM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11206$r8$lambda$u9l0JOtxkVmSON5mKXmukAr0uM(boolean z, boolean z2, int i, int i2, androidx.compose.runtime.State state, androidx.compose.runtime.State state2, androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(swipeRefreshLayout, "");
        swipeRefreshLayout.setEnabled(z);
        swipeRefreshLayout.setRefreshing(z2);
        final kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) state.getValue();
        swipeRefreshLayout.setOnRefreshListener(new androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener() { // from class: com.paypal.oslo.core.commonui.components.SwipeRefreshLayoutKt$$ExternalSyntheticLambda0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                kotlin.jvm.functions.Function0.this.invoke();
            }
        });
        swipeRefreshLayout.setProgressBackgroundColorSchemeColor(i);
        swipeRefreshLayout.setColorSchemeColors(i2);
        ((kotlin.jvm.functions.Function1) state2.getValue()).invoke(getHighResolutionOutputSizeshNQ4ISI(swipeRefreshLayout));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x03eUTVYY5Qme98I_9Jyq0aNeAw(boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z2, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SwipeRefreshLayout(z, function0, function1, modifier, z2, function12, function13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
