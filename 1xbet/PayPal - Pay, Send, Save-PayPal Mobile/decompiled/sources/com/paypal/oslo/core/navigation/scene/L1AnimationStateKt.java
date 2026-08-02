package com.paypal.oslo.core.navigation.scene;

@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a'\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\f\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0000\u001a\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\bX\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002"}, d2 = {"FullscreenHeightFraction", "", "ScrollThresholdPx", "FloatComparisonEpsilon", "ContentFlingThreshold", "rememberL1HeightAnimation", "Lcom/paypal/oslo/core/navigation/scene/L1AnimationResult;", "tabStateKey", "", "currentTabState", "Lcom/paypal/oslo/core/navigation/scene/L1TabState;", "currentL1Parent", "(Ljava/lang/String;Lcom/paypal/oslo/core/navigation/scene/L1TabState;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/core/navigation/scene/L1AnimationResult;", "createSheetDragConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "tabState", "createScrollConnection", "navigation_release", "previousL1Parent", "previousHeight"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class L1AnimationStateKt {
    public static final com.paypal.oslo.core.navigation.scene.L1AnimationResult rememberL1HeightAnimation(java.lang.String str, com.paypal.oslo.core.navigation.scene.L1TabState l1TabState, java.lang.String str2, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l1TabState, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(486248972, i, -1, "com.paypal.oslo.core.navigation.scene.rememberL1HeightAnimation (L1AnimationState.kt:96)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && composer.changed(str)) || (i & 6) == 4;
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = createScrollConnection(l1TabState);
            composer.updateRememberedValue(rememberedValue3);
        }
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) rememberedValue3;
        boolean z3 = (i2 > 4 && composer.changed(str)) || (i & 6) == 4;
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (z3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = createSheetDragConnection(l1TabState);
            composer.updateRememberedValue(rememberedValue4);
        }
        androidx.compose.ui.input.nestedscroll.NestedScrollConnection nestedScrollConnection2 = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) rememberedValue4;
        float f = l1TabState.isFullscreen() ? 1.0f : 0.95f;
        java.lang.Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue5 = androidx.compose.animation.core.AnimatableKt.Animatable$default(0.95f, 0.0f, 2, null);
            composer.updateRememberedValue(rememberedValue5);
        }
        androidx.compose.animation.core.Animatable animatable = (androidx.compose.animation.core.Animatable) rememberedValue5;
        boolean isExpanded = l1TabState.isExpanded();
        boolean z4 = (((i & 896) ^ 384) > 256 && composer.changed(str2)) || (i & 384) == 256;
        boolean changed = composer.changed(f);
        if ((((i & 112) ^ 48) <= 32 || !composer.changed(l1TabState)) && (i & 48) != 32) {
            z = false;
        }
        boolean changedInstance = composer.changedInstance(animatable);
        java.lang.Object rememberedValue6 = composer.rememberedValue();
        if ((z4 | changed | z | changedInstance) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue6 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.core.navigation.scene.L1AnimationStateKt$rememberL1HeightAnimation$1$1(str2, f, l1TabState, animatable, mutableState, mutableState2, null);
            composer.updateRememberedValue(rememberedValue6);
        }
        androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Float.valueOf(f), str2, java.lang.Boolean.valueOf(isExpanded), (kotlin.jvm.functions.Function2) rememberedValue6, composer, (i >> 3) & 112);
        com.paypal.oslo.core.navigation.scene.L1AnimationResult l1AnimationResult = new com.paypal.oslo.core.navigation.scene.L1AnimationResult(((java.lang.Number) animatable.getValue()).floatValue(), l1TabState.isTransitioning(), l1TabState.isFullscreen(), l1TabState.isContractingViaDrag(), nestedScrollConnection, nestedScrollConnection2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return l1AnimationResult;
    }

    public static final androidx.compose.ui.input.nestedscroll.NestedScrollConnection createSheetDragConnection(final com.paypal.oslo.core.navigation.scene.L1TabState l1TabState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l1TabState, "");
        return new androidx.compose.ui.input.nestedscroll.NestedScrollConnection() { // from class: com.paypal.oslo.core.navigation.scene.L1AnimationStateKt$createSheetDragConnection$1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public final /* bridge */ java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
                return super.mo1528onPostFlingRZ2iAVY(j, j2, continuation);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public final /* bridge */ long mo1529onPostScrollDzOQY0M(long j, long j2, int i) {
                return super.mo1529onPostScrollDzOQY0M(j, j2, i);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public final long mo1754onPreScrollOzD1aCk(long available, int source) {
                if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI()) && java.lang.Float.intBitsToFloat((int) (4294967295L & available)) > 0.0f && com.paypal.oslo.core.navigation.scene.L1TabState.this.isFullscreen()) {
                    com.paypal.oslo.core.navigation.scene.L1TabState.this.setFullscreen(false);
                    com.paypal.oslo.core.navigation.scene.L1TabState.this.setContractingViaDrag(true);
                    com.paypal.oslo.core.navigation.scene.L1TabState.this.setScrollAccumulator(0.0f);
                    return available;
                }
                return androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public final java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
                return androidx.compose.ui.unit.Velocity.m8830boximpl(androidx.compose.ui.unit.Velocity.INSTANCE.m8850getZero9UxMQ8M());
            }
        };
    }

    public static final androidx.compose.ui.input.nestedscroll.NestedScrollConnection createScrollConnection(final com.paypal.oslo.core.navigation.scene.L1TabState l1TabState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l1TabState, "");
        return new androidx.compose.ui.input.nestedscroll.NestedScrollConnection() { // from class: com.paypal.oslo.core.navigation.scene.L1AnimationStateKt$createScrollConnection$1
            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public final /* bridge */ java.lang.Object mo1753onPreFlingQWom1Mo(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
                return super.mo1753onPreFlingQWom1Mo(j, continuation);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public final /* bridge */ long mo1754onPreScrollOzD1aCk(long j, int i) {
                return super.mo1754onPreScrollOzD1aCk(j, i);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public final java.lang.Object mo1528onPostFlingRZ2iAVY(long j, long j2, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
                com.paypal.oslo.core.navigation.scene.L1TabState.this.setScrollAccumulator(0.0f);
                if (java.lang.Math.abs(androidx.compose.ui.unit.Velocity.m8840getYimpl(j)) > 300.0f) {
                    return androidx.compose.ui.unit.Velocity.m8830boximpl(j2);
                }
                return super.mo1528onPostFlingRZ2iAVY(j, j2, continuation);
            }

            @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public final long mo1529onPostScrollDzOQY0M(long consumed, long available, int source) {
                int i = (int) (consumed & 4294967295L);
                float intBitsToFloat = java.lang.Float.intBitsToFloat(i);
                int i2 = (int) (4294967295L & available);
                boolean z = java.lang.Float.intBitsToFloat(i2) < 0.0f && java.lang.Float.intBitsToFloat(i) == 0.0f;
                boolean z2 = java.lang.Float.intBitsToFloat(i2) > 0.0f && java.lang.Float.intBitsToFloat(i) == 0.0f;
                boolean z3 = z || z2;
                if (androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7126getUserInputWNlRxjI()) || androidx.compose.ui.input.nestedscroll.NestedScrollSource.m7114equalsimpl0(source, androidx.compose.ui.input.nestedscroll.NestedScrollSource.INSTANCE.m7125getSideEffectWNlRxjI())) {
                    if (intBitsToFloat < 0.0f && !z3) {
                        if (!com.paypal.oslo.core.navigation.scene.L1TabState.this.isTransitioning()) {
                            com.paypal.oslo.core.navigation.scene.L1TabState l1TabState2 = com.paypal.oslo.core.navigation.scene.L1TabState.this;
                            l1TabState2.setScrollAccumulator(l1TabState2.getScrollAccumulator() + intBitsToFloat);
                            if (java.lang.Math.abs(com.paypal.oslo.core.navigation.scene.L1TabState.this.getScrollAccumulator()) >= 50.0f && !com.paypal.oslo.core.navigation.scene.L1TabState.this.isFullscreen()) {
                                com.paypal.oslo.core.navigation.scene.L1TabState.this.setFullscreen(true);
                                com.paypal.oslo.core.navigation.scene.L1TabState.this.setScrollAccumulator(0.0f);
                            }
                        }
                    } else if (z2 && com.paypal.oslo.core.navigation.scene.L1TabState.this.isFullscreen()) {
                        com.paypal.oslo.core.navigation.scene.L1TabState l1TabState3 = com.paypal.oslo.core.navigation.scene.L1TabState.this;
                        l1TabState3.setScrollAccumulator(l1TabState3.getScrollAccumulator() + java.lang.Float.intBitsToFloat(i2));
                        if (java.lang.Math.abs(com.paypal.oslo.core.navigation.scene.L1TabState.this.getScrollAccumulator()) >= 50.0f) {
                            com.paypal.oslo.core.navigation.scene.L1TabState.this.setFullscreen(false);
                            com.paypal.oslo.core.navigation.scene.L1TabState.this.setScrollAccumulator(0.0f);
                        }
                    } else if (z) {
                        if (com.paypal.oslo.core.navigation.scene.L1TabState.this.isFullscreen() || com.paypal.oslo.core.navigation.scene.L1TabState.this.isTransitioning()) {
                            com.paypal.oslo.core.navigation.scene.L1TabState.this.setScrollAccumulator(0.0f);
                        } else {
                            if (com.paypal.oslo.core.navigation.scene.L1TabState.this.getScrollAccumulator() > 0.0f) {
                                com.paypal.oslo.core.navigation.scene.L1TabState.this.setScrollAccumulator(java.lang.Float.intBitsToFloat(i2));
                            } else {
                                com.paypal.oslo.core.navigation.scene.L1TabState l1TabState4 = com.paypal.oslo.core.navigation.scene.L1TabState.this;
                                l1TabState4.setScrollAccumulator(l1TabState4.getScrollAccumulator() + java.lang.Float.intBitsToFloat(i2));
                            }
                            if (java.lang.Math.abs(com.paypal.oslo.core.navigation.scene.L1TabState.this.getScrollAccumulator()) >= 50.0f) {
                                com.paypal.oslo.core.navigation.scene.L1TabState.this.setFullscreen(true);
                                com.paypal.oslo.core.navigation.scene.L1TabState.this.setScrollAccumulator(0.0f);
                            }
                        }
                    } else {
                        boolean z4 = intBitsToFloat > 0.0f;
                        boolean z5 = intBitsToFloat < 0.0f;
                        boolean z6 = com.paypal.oslo.core.navigation.scene.L1TabState.this.getScrollAccumulator() < 0.0f;
                        boolean z7 = com.paypal.oslo.core.navigation.scene.L1TabState.this.getScrollAccumulator() > 0.0f;
                        if ((z4 && z6) || (z5 && z7)) {
                            com.paypal.oslo.core.navigation.scene.L1TabState.this.setScrollAccumulator(intBitsToFloat);
                        } else {
                            com.paypal.oslo.core.navigation.scene.L1TabState l1TabState5 = com.paypal.oslo.core.navigation.scene.L1TabState.this;
                            l1TabState5.setScrollAccumulator(l1TabState5.getScrollAccumulator() + intBitsToFloat);
                        }
                    }
                }
                return (!z2 || com.paypal.oslo.core.navigation.scene.L1TabState.this.isFullscreen()) ? available : androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ java.lang.String access$rememberL1HeightAnimation$lambda$1(androidx.compose.runtime.MutableState mutableState) {
        return (java.lang.String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ java.lang.Float access$rememberL1HeightAnimation$lambda$4(androidx.compose.runtime.MutableState mutableState) {
        return (java.lang.Float) mutableState.getValue();
    }
}
