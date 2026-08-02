package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00010\u000eH\u0000\u001aW\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\"\u0010\u0010\u001f\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010 \"\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"DragHandleWithTooltip", "", "Landroidx/compose/foundation/layout/ColumnScope;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/layout/ColumnScope;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "sheetState", "Landroidx/compose/material3/SheetState;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "onFling", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "velocity", "rememberSheetState", "skipPartiallyExpanded", "", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "initialValue", "skipHiddenState", "positionalThreshold", "Landroidx/compose/ui/unit/Dp;", "velocityThreshold", "rememberSheetState-AGcomas", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/material3/SheetValue;ZFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "DragHandleVerticalPadding", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "BottomSheetAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SheetDefaultsKt {
    private static final float Camera2StreamConfigurationMap = androidx.compose.ui.unit.Dp.m8601constructorimpl(22.0f);
    private static final androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRanges = androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null);

    public static /* synthetic */ boolean $r8$lambda$JEf1hHgsUZdBCGzSdP3qafEhKlM(androidx.compose.material3.SheetValue sheetValue) {
        return true;
    }

    public static final void DragHandleWithTooltip(final androidx.compose.foundation.layout.ColumnScope columnScope, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1033612924);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1033612924, i3, -1, "androidx.compose.material3.DragHandleWithTooltip (SheetDefaults.kt:432)");
            }
            androidx.compose.material3.internal.Strings.Companion companion = androidx.compose.material3.internal.Strings.INSTANCE;
            final java.lang.String m4383getString2EP1pXo = androidx.compose.material3.internal.Strings_androidKt.m4383getString2EP1pXo(androidx.compose.material3.internal.Strings.m4304constructorimpl(androidx.compose.material3.R.string.m3c_bottom_sheet_drag_handle_description), startRestartGroup, 0);
            androidx.compose.ui.Modifier align = columnScope.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally());
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, align);
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
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5299constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m5299constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m5299constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m5299constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.material3.TooltipKt.TooltipBox(androidx.compose.material3.TooltipDefaults.INSTANCE.m4167rememberTooltipPositionProviderHu5FAss(androidx.compose.material3.TooltipAnchorPosition.INSTANCE.m4154getAbovelOKsHw4(), 0.0f, startRestartGroup, 390, 2), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2059851063, true, new kotlin.jvm.functions.Function3<androidx.compose.material3.TooltipScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.SheetDefaultsKt$DragHandleWithTooltip$1$1
                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.material3.TooltipScope tooltipScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    androidx.compose.material3.TooltipScope tooltipScope2 = tooltipScope;
                    androidx.compose.runtime.Composer composer3 = composer2;
                    int intValue = num.intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= (intValue & 8) == 0 ? composer3.changed(tooltipScope2) : composer3.changedInstance(tooltipScope2) ? 4 : 2;
                    }
                    if (composer3.shouldExecute((intValue & 19) != 18, intValue & 1)) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(2059851063, intValue, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous> (SheetDefaults.kt:439)");
                        }
                        final java.lang.String str = m4383getString2EP1pXo;
                        androidx.compose.material3.TooltipKt.m4175PlainTooltipgv3ox5I(tooltipScope2, null, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-999924215, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.SheetDefaultsKt$DragHandleWithTooltip$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num2) {
                                androidx.compose.runtime.Composer composer5 = composer4;
                                int intValue2 = num2.intValue();
                                if (composer5.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-999924215, intValue2, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous>.<anonymous> (SheetDefaults.kt:439)");
                                    }
                                    androidx.compose.material3.TextKt.m3985TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer5, 0, 0, 262142);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                } else {
                                    composer5.skipToGroupEnd();
                                }
                                return kotlin.Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, (intValue & 14) | 805306368, 255);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, startRestartGroup, 54), androidx.compose.material3.TooltipKt.rememberTooltipState(false, false, null, startRestartGroup, 0, 7), null, null, false, false, false, function2, startRestartGroup, ((i3 << 21) & 234881024) | 48, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return androidx.compose.material3.SheetDefaultsKt.$r8$lambda$jPnQQ4XY2awHhnouq5MdFks2jZQ(androidx.compose.foundation.layout.ColumnScope.this, function2, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final androidx.compose.ui.input.nestedscroll.NestedScrollConnection ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection(final androidx.compose.material3.SheetState sheetState, final androidx.compose.foundation.gestures.Orientation orientation, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> function1) {
        return new androidx.compose.ui.input.nestedscroll.NestedScrollConnection() { // from class: androidx.compose.material3.SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
                if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
                    return getHighSpeedVideoSizes(androidx.compose.material3.SheetState.this.getAnchoredDraggableState$material3().dispatchRawDelta(java.lang.Float.intBitsToFloat((int) (orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? available >> 32 : available & 4294967295L))));
                }
                return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
                function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxFloat(orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.unit.Velocity.m8839getXimpl(j2) : androidx.compose.ui.unit.Velocity.m8840getYimpl(j2)));
                return androidx.compose.ui.unit.Velocity.m8830boximpl(j2);
            }

            private final long getHighSpeedVideoSizes(float f) {
                float f2 = orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? f : 0.0f;
                if (orientation != androidx.compose.foundation.gestures.Orientation.Vertical) {
                    f = 0.0f;
                }
                return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public final java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
                float m8839getXimpl = orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? androidx.compose.ui.unit.Velocity.m8839getXimpl(j) : androidx.compose.ui.unit.Velocity.m8840getYimpl(j);
                float requireOffset = androidx.compose.material3.SheetState.this.requireOffset();
                float minAnchor = androidx.compose.material3.SheetState.this.getAnchoredDraggableState$material3().getAnchors().minAnchor();
                if (m8839getXimpl < 0.0f && requireOffset > minAnchor) {
                    function1.invoke(kotlin.coroutines.jvm.internal.Boxing.boxFloat(m8839getXimpl));
                } else {
                    j = androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M();
                }
                return androidx.compose.ui.unit.Velocity.m8830boximpl(j);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public final long mo1754onPreScrollOzD1aCk(long available, int source) {
                float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (orientation == androidx.compose.foundation.gestures.Orientation.Horizontal ? available >> 32 : available & 4294967295L));
                if (intBitsToFloat < 0.0f && androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI())) {
                    return getHighSpeedVideoSizes(androidx.compose.material3.SheetState.this.getAnchoredDraggableState$material3().dispatchRawDelta(intBitsToFloat));
                }
                return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            }
        };
    }

    /* renamed from: rememberSheetState-AGcomas, reason: not valid java name */
    public static final androidx.compose.material3.SheetState m3734rememberSheetStateAGcomas(boolean z, kotlin.jvm.functions.Function1<? super androidx.compose.material3.SheetValue, java.lang.Boolean> function1, androidx.compose.material3.SheetValue sheetValue, boolean z2, float f, float f2, androidx.compose.runtime.Composer composer, int i, int i2) {
        final kotlin.jvm.functions.Function1<? super androidx.compose.material3.SheetValue, java.lang.Boolean> function12;
        final boolean z3 = (i2 & 1) != 0 ? false : z;
        if ((i2 & 2) != 0) {
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(androidx.compose.material3.SheetDefaultsKt.$r8$lambda$JEf1hHgsUZdBCGzSdP3qafEhKlM((androidx.compose.material3.SheetValue) obj));
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function12 = (kotlin.jvm.functions.Function1) rememberedValue;
        } else {
            function12 = function1;
        }
        final androidx.compose.material3.SheetValue sheetValue2 = (i2 & 4) != 0 ? androidx.compose.material3.SheetValue.Hidden : sheetValue;
        final boolean z4 = (i2 & 8) != 0 ? false : z2;
        final float m2933getPositionalThresholdD9Ej5fM$material3 = (i2 & 16) != 0 ? androidx.compose.material3.BottomSheetDefaults.INSTANCE.m2933getPositionalThresholdD9Ej5fM$material3() : f;
        final float m2936getVelocityThresholdD9Ej5fM$material3 = (i2 & 32) != 0 ? androidx.compose.material3.BottomSheetDefaults.INSTANCE.m2936getVelocityThresholdD9Ej5fM$material3() : f2;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-20307384, i, -1, "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:514)");
        }
        final androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
        boolean changed = composer.changed(density);
        boolean z5 = (((57344 & i) ^ 24576) > 16384 && composer.changed(m2933getPositionalThresholdD9Ej5fM$material3)) || (i & 24576) == 16384;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if ((changed | z5) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    float mo1418toPx0680j_4;
                    mo1418toPx0680j_4 = androidx.compose.ui.unit.Density.this.mo1418toPx0680j_4(m2933getPositionalThresholdD9Ej5fM$material3);
                    return java.lang.Float.valueOf(mo1418toPx0680j_4);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        final kotlin.jvm.functions.Function0<java.lang.Float> function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
        boolean changed2 = composer.changed(density);
        boolean z6 = (((458752 & i) ^ androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) > 131072 && composer.changed(m2936getVelocityThresholdD9Ej5fM$material3)) || (i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changed2 | z6) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    float mo1418toPx0680j_4;
                    mo1418toPx0680j_4 = androidx.compose.ui.unit.Density.this.mo1418toPx0680j_4(m2936getVelocityThresholdD9Ej5fM$material3);
                    return java.lang.Float.valueOf(mo1418toPx0680j_4);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        final kotlin.jvm.functions.Function0<java.lang.Float> function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(z3), function12, java.lang.Boolean.valueOf(z4)};
        androidx.compose.runtime.saveable.Saver<androidx.compose.material3.SheetState, androidx.compose.material3.SheetValue> Saver = androidx.compose.material3.SheetState.INSTANCE.Saver(z3, function0, function02, function12, z4);
        boolean z7 = (((i & 14) ^ 6) > 4 && composer.changed(z3)) || (i & 6) == 4;
        boolean changed3 = composer.changed(function0);
        boolean changed4 = composer.changed(function02);
        boolean z8 = (((i & 896) ^ 384) > 256 && composer.changed(sheetValue2.ordinal())) || (i & 384) == 256;
        boolean z9 = (((i & 112) ^ 48) > 32 && composer.changed(function12)) || (i & 48) == 32;
        boolean z10 = (((i & 7168) ^ 3072) > 2048 && composer.changed(z4)) || (i & 3072) == 2048;
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if ((z8 | z7 | changed3 | changed4 | z9 | z10) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.SheetDefaultsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.material3.SheetDefaultsKt.$r8$lambda$WaCgI3LvpuAwnnOvE8TzZjKRcO4(z3, function0, function02, sheetValue2, function12, z4);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.material3.SheetState sheetState = (androidx.compose.material3.SheetState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) Saver, (kotlin.jvm.functions.Function0) rememberedValue4, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return sheetState;
    }

    public static /* synthetic */ androidx.compose.material3.SheetState $r8$lambda$WaCgI3LvpuAwnnOvE8TzZjKRcO4(boolean z, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.material3.SheetValue sheetValue, kotlin.jvm.functions.Function1 function1, boolean z2) {
        return new androidx.compose.material3.SheetState(z, function0, function02, sheetValue, function1, z2);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jPnQQ4XY2awHhnouq5MdFks2jZQ(androidx.compose.foundation.layout.ColumnScope columnScope, kotlin.jvm.functions.Function2 function2, int i, androidx.compose.runtime.Composer composer, int i2) {
        DragHandleWithTooltip(columnScope, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
