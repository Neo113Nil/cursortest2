package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aq\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\r\u001aE\u0010\u000e\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u000f\u001aE\u0010\u0010\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"NavigationEventHandler", "", "state", "Landroidx/navigationevent/compose/NavigationEventState;", "Landroidx/navigationevent/NavigationEventInfo;", "isForwardEnabled", "", "onForwardCancelled", "Lkotlin/Function0;", "onForwardCompleted", "isBackEnabled", "onBackCancelled", "onBackCompleted", "(Landroidx/navigationevent/compose/NavigationEventState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "NavigationBackHandler", "(Landroidx/navigationevent/compose/NavigationEventState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "NavigationForwardHandler", "navigationevent-compose"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationEventHandlerKt {
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationEventHandler(final androidx.view.compose.NavigationEventState<? extends androidx.view.NavigationEventInfo> navigationEventState, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        int i6;
        boolean z4;
        int i7;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        int i8;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        final boolean z5;
        final boolean z6;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function011;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        kotlin.jvm.functions.Function0<kotlin.Unit> function012;
        kotlin.jvm.functions.Function0<kotlin.Unit> function013;
        kotlin.jvm.functions.Function0<kotlin.Unit> function014;
        boolean z7;
        int i9;
        boolean z8;
        final androidx.view.NavigationEventDispatcher navigationEventDispatcher;
        kotlin.jvm.functions.Function0<kotlin.Unit> function015;
        final androidx.view.compose.ComposeNavigationEventHandler composeNavigationEventHandler;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(898330592);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(navigationEventState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z3 = z;
            i3 |= startRestartGroup.changed(z3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function05 = function0;
                i3 |= startRestartGroup.changedInstance(function05) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    function06 = function02;
                    i3 |= startRestartGroup.changedInstance(function06) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        z4 = z2;
                        i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            function07 = function03;
                        } else {
                            function07 = function03;
                            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i3 |= startRestartGroup.changedInstance(function07) ? 131072 : 65536;
                            }
                        }
                        i8 = i2 & 64;
                        if (i8 != 0) {
                            i3 |= 1572864;
                            function08 = function04;
                        } else {
                            function08 = function04;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changedInstance(function08) ? 1048576 : 524288;
                            }
                        }
                        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            z5 = z3;
                            z6 = z4;
                            function09 = function06;
                            kotlin.jvm.functions.Function0<kotlin.Unit> function016 = function05;
                            function010 = function08;
                            function011 = function016;
                        } else {
                            boolean z9 = i10 != 0 ? true : z3;
                            if (i4 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda15
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function012 = (kotlin.jvm.functions.Function0) rememberedValue;
                            } else {
                                function012 = function05;
                            }
                            if (i5 != 0) {
                                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda16
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue2);
                                }
                                function06 = (kotlin.jvm.functions.Function0) rememberedValue2;
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                            if (i7 != 0) {
                                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue3);
                                }
                                function013 = (kotlin.jvm.functions.Function0) rememberedValue3;
                            } else {
                                function013 = function07;
                            }
                            if (i8 != 0) {
                                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            kotlin.Unit unit;
                                            unit = kotlin.Unit.INSTANCE;
                                            return unit;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                function014 = (kotlin.jvm.functions.Function0) rememberedValue4;
                            } else {
                                function014 = function08;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(898330592, i3, -1, "androidx.navigationevent.compose.NavigationEventHandler (NavigationEventHandler.kt:79)");
                            }
                            if (!androidx.view.compose.NavigationEventHandler_androidKt.isInspectionMode(startRestartGroup, 0)) {
                                androidx.view.NavigationEventDispatcherOwner current = androidx.view.compose.LocalNavigationEventDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, 6);
                                if (current == null) {
                                    throw new java.lang.IllegalStateException("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner".toString());
                                }
                                androidx.view.NavigationEventDispatcher getHighSpeedVideoFpsRanges = current.getGetHighSpeedVideoFpsRanges();
                                int i11 = i3 & 14;
                                boolean z10 = i11 == 4;
                                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                                if (z10 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    androidx.view.compose.ComposeNavigationEventHandler composeNavigationEventHandler2 = new androidx.view.compose.ComposeNavigationEventHandler(navigationEventState.getCurrentInfo(), new kotlin.jvm.functions.Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return androidx.view.compose.NavigationEventHandlerKt.$r8$lambda$HP3NbCVoJFLbGzkVuIxDyQ6hQZM(androidx.view.compose.NavigationEventState.this, (androidx.view.NavigationEventTransitionState) obj);
                                        }
                                    });
                                    startRestartGroup.updateRememberedValue(composeNavigationEventHandler2);
                                    rememberedValue5 = composeNavigationEventHandler2;
                                }
                                final androidx.view.compose.ComposeNavigationEventHandler composeNavigationEventHandler3 = (androidx.view.compose.ComposeNavigationEventHandler) rememberedValue5;
                                boolean changedInstance = startRestartGroup.changedInstance(composeNavigationEventHandler3);
                                boolean z11 = (i3 & 112) == 32;
                                boolean z12 = (i3 & 896) == 256;
                                boolean z13 = (i3 & 7168) == 2048;
                                boolean z14 = (57344 & i3) == 16384;
                                boolean z15 = (458752 & i3) == 131072;
                                boolean z16 = (i3 & 3670016) == 1048576;
                                boolean z17 = i11 == 4;
                                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if (((changedInstance | z11 | z12 | z13 | z14 | z15 | z16) || z17) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    final boolean z18 = z9;
                                    final kotlin.jvm.functions.Function0<kotlin.Unit> function017 = function012;
                                    final kotlin.jvm.functions.Function0<kotlin.Unit> function018 = function06;
                                    final boolean z19 = z4;
                                    final kotlin.jvm.functions.Function0<kotlin.Unit> function019 = function013;
                                    z7 = z9;
                                    i9 = i11;
                                    final kotlin.jvm.functions.Function0<kotlin.Unit> function020 = function014;
                                    z8 = z4;
                                    navigationEventDispatcher = getHighSpeedVideoFpsRanges;
                                    function015 = function06;
                                    composeNavigationEventHandler = composeNavigationEventHandler3;
                                    kotlin.jvm.functions.Function0 function021 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return androidx.view.compose.NavigationEventHandlerKt.m9247$r8$lambda$bwD0f5vjMne8Q2S4maGONOaY(androidx.view.compose.ComposeNavigationEventHandler.this, z18, function017, function018, z19, function019, function020, navigationEventState);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(function021);
                                    rememberedValue6 = function021;
                                } else {
                                    z7 = z9;
                                    i9 = i11;
                                    z8 = z4;
                                    navigationEventDispatcher = getHighSpeedVideoFpsRanges;
                                    function015 = function06;
                                    composeNavigationEventHandler = composeNavigationEventHandler3;
                                }
                                androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 0);
                                boolean z20 = i9 == 4;
                                boolean changedInstance2 = startRestartGroup.changedInstance(composeNavigationEventHandler);
                                boolean changedInstance3 = startRestartGroup.changedInstance(navigationEventDispatcher);
                                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                                if ((changedInstance2 | z20 | changedInstance3) || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return androidx.view.compose.NavigationEventHandlerKt.m9243$r8$lambda$KKg1DU3xyFKfeJGpbRXhnTWiCc(androidx.view.compose.NavigationEventState.this, composeNavigationEventHandler, navigationEventDispatcher, (androidx.compose.runtime.DisposableEffectScope) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue7);
                                }
                                androidx.compose.runtime.EffectsKt.DisposableEffect(navigationEventState, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue7, startRestartGroup, i9);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                function09 = function015;
                                z6 = z8;
                                function07 = function013;
                                z5 = z7;
                                function010 = function014;
                                function011 = function012;
                            } else {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                endRestartGroup = startRestartGroup.endRestartGroup();
                                if (endRestartGroup != null) {
                                    final boolean z21 = z9;
                                    final kotlin.jvm.functions.Function0<kotlin.Unit> function022 = function012;
                                    final kotlin.jvm.functions.Function0<kotlin.Unit> function023 = function06;
                                    final boolean z22 = z4;
                                    final kotlin.jvm.functions.Function0<kotlin.Unit> function024 = function013;
                                    final kotlin.jvm.functions.Function0<kotlin.Unit> function025 = function014;
                                    function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return androidx.view.compose.NavigationEventHandlerKt.m9248$r8$lambda$lS7hkk_wNiEqQxVGMU5ajLq3AA(androidx.view.compose.NavigationEventState.this, z21, function022, function023, z22, function024, function025, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                        }
                                    };
                                    endRestartGroup.updateScope(function2);
                                    return;
                                }
                                return;
                            }
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            function2 = new kotlin.jvm.functions.Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return androidx.view.compose.NavigationEventHandlerKt.$r8$lambda$oRvRrN9e6iFshEVdayHBU1h6JAU(androidx.view.compose.NavigationEventState.this, z5, function011, function09, z6, function07, function010, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            };
                            endRestartGroup.updateScope(function2);
                            return;
                        }
                        return;
                    }
                    z4 = z2;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 64;
                    if (i8 != 0) {
                    }
                    if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function06 = function02;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                z4 = z2;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                }
                if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function05 = function0;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function06 = function02;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            z4 = z2;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            i8 = i2 & 64;
            if (i8 != 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z3 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function05 = function0;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function06 = function02;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        z4 = z2;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        i8 = i2 & 64;
        if (i8 != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 599187) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationBackHandler(final androidx.view.compose.NavigationEventState<? extends androidx.view.NavigationEventInfo> navigationEventState, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        boolean z3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1220469155);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(navigationEventState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function03 = function0;
                i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    z3 = z2;
                    function04 = function03;
                } else {
                    z3 = i5 != 0 ? true : z2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda11
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
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1220469155, i3, -1, "androidx.navigationevent.compose.NavigationBackHandler (NavigationEventHandler.kt:152)");
                    }
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    kotlin.jvm.functions.Function0 function07 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    int i6 = i3 << 9;
                    NavigationEventHandler(navigationEventState, false, function06, function07, z3, function05, function02, startRestartGroup, (i3 & 14) | 3504 | (57344 & i6) | (458752 & i6) | (i6 & 3670016), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function04 = function05;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final boolean z4 = z3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.view.compose.NavigationEventHandlerKt.$r8$lambda$bdCAtK9VRXehSRYPXtZJCNVxgHw(androidx.view.compose.NavigationEventState.this, z4, function04, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function03 = function0;
            if ((i & 3072) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function0;
        if ((i & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationForwardHandler(final androidx.view.compose.NavigationEventState<? extends androidx.view.NavigationEventInfo> navigationEventState, boolean z, kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        boolean z3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1737636087);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(navigationEventState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                function03 = function0;
                i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
                if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    z3 = z2;
                    function04 = function03;
                } else {
                    z3 = i5 != 0 ? true : z2;
                    if (i4 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda0
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
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1737636087, i3, -1, "androidx.navigationevent.compose.NavigationForwardHandler (NavigationEventHandler.kt:187)");
                    }
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    kotlin.jvm.functions.Function0 function06 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    NavigationEventHandler(navigationEventState, z3, function05, function02, false, function06, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, (i3 & 14) | 1794048 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function04 = function05;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final boolean z4 = z3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return androidx.view.compose.NavigationEventHandlerKt.$r8$lambda$JAKk58Pa5q1j5nTEXhCcJ93hpbk(androidx.view.compose.NavigationEventState.this, z4, function04, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function03 = function0;
            if ((i & 3072) == 0) {
            }
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function03 = function0;
        if ((i & 3072) == 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HP3NbCVoJFLbGzkVuIxDyQ6hQZM(androidx.view.compose.NavigationEventState navigationEventState, androidx.view.NavigationEventTransitionState navigationEventTransitionState) {
        navigationEventState.setTransitionState$navigationevent_compose(navigationEventTransitionState);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JAKk58Pa5q1j5nTEXhCcJ93hpbk(androidx.view.compose.NavigationEventState navigationEventState, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NavigationForwardHandler(navigationEventState, z, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$KKg1-DU3xyFKfeJGpbRXhnTWiCc, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m9243$r8$lambda$KKg1DU3xyFKfeJGpbRXhnTWiCc(final androidx.view.compose.NavigationEventState navigationEventState, final androidx.view.compose.ComposeNavigationEventHandler composeNavigationEventHandler, androidx.view.NavigationEventDispatcher navigationEventDispatcher, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        if (navigationEventState.getSourceHandler$navigationevent_compose() != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationEventState '");
            sb.append(navigationEventState);
            sb.append("' is already registered with a NavigationEventHandler '");
            sb.append(composeNavigationEventHandler);
            sb.append("'.");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        androidx.view.compose.ComposeNavigationEventHandler composeNavigationEventHandler2 = composeNavigationEventHandler;
        navigationEventState.setSourceHandler$navigationevent_compose(composeNavigationEventHandler2);
        androidx.view.NavigationEventDispatcher.addHandler$default(navigationEventDispatcher, composeNavigationEventHandler2, 0, 2, null);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: androidx.navigationevent.compose.NavigationEventHandlerKt$NavigationEventHandler$lambda$17$lambda$16$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.compose.ComposeNavigationEventHandler.this.remove();
                navigationEventState.setSourceHandler$navigationevent_compose(null);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bdCAtK9VRXehSRYPXtZJCNVxgHw(androidx.view.compose.NavigationEventState navigationEventState, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NavigationBackHandler(navigationEventState, z, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bwD0f5vjMne8--Q-2S4maGONOaY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9247$r8$lambda$bwD0f5vjMne8Q2S4maGONOaY(androidx.view.compose.ComposeNavigationEventHandler composeNavigationEventHandler, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z2, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, androidx.view.compose.NavigationEventState navigationEventState) {
        composeNavigationEventHandler.setForwardEnabled(z);
        composeNavigationEventHandler.getHighSpeedVideoSizes = function0;
        composeNavigationEventHandler.getHighSpeedVideoFpsRangesFor = function02;
        composeNavigationEventHandler.setBackEnabled(z2);
        composeNavigationEventHandler.getHighSpeedVideoFpsRanges = function03;
        composeNavigationEventHandler.Camera2StreamConfigurationMap = function04;
        composeNavigationEventHandler.setInfo(navigationEventState.getCurrentInfo(), navigationEventState.getBackInfo(), navigationEventState.getForwardInfo());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lS7hkk_wNiEqQxVGMU5-ajLq3AA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m9248$r8$lambda$lS7hkk_wNiEqQxVGMU5ajLq3AA(androidx.view.compose.NavigationEventState navigationEventState, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z2, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NavigationEventHandler(navigationEventState, z, function0, function02, z2, function03, function04, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oRvRrN9e6iFshEVdayHBU1h6JAU(androidx.view.compose.NavigationEventState navigationEventState, boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z2, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NavigationEventHandler(navigationEventState, z, function0, function02, z2, function03, function04, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
