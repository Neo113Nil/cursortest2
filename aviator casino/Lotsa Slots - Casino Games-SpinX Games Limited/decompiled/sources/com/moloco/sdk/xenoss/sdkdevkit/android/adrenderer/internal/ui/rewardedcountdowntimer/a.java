package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

/* loaded from: classes5.dex */
public final class a {
    public static final kotlin.Unit a(com.moloco.sdk.internal.ortb.model.k kVar, int i, int i2, kotlin.jvm.functions.Function0 function0, int i3, androidx.compose.runtime.Composer composer, int i4) {
        a(kVar, i, i2, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final kotlin.Unit b(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semantics, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semantics, str);
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(final com.moloco.sdk.internal.ortb.model.k countDownTimer, final int i, final int i2, final kotlin.jvm.functions.Function0<kotlin.Unit> onTimerFinish, androidx.compose.runtime.Composer composer, final int i3) {
        int i4;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countDownTimer, "countDownTimer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onTimerFinish, "onTimerFinish");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1599911995);
        if ((i3 & 6) == 0) {
            i4 = (startRestartGroup.changed(countDownTimer) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(onTimerFinish) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1599911995, i4, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.AggregateRewardedCountDownTimer (AggregateRewardedCountDownTimer.kt:18)");
            }
            float m4478constructorimpl = androidx.compose.ui.unit.Dp.m4478constructorimpl(countDownTimer.getCircleSize());
            long m4500DpSizeYgX7TsA = androidx.compose.ui.unit.DpKt.m4500DpSizeYgX7TsA(m4478constructorimpl, m4478constructorimpl);
            androidx.compose.ui.Alignment a2 = com.moloco.sdk.internal.d.a(countDownTimer.getHorizontalAlignment(), countDownTimer.getVerticalAlignment());
            long backgroundColor = countDownTimer.getBackgroundColor();
            long foregroundColor = countDownTimer.getForegroundColor();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(a2, false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.node.ComposeUiNode.Companion companion2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE;
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = companion2.getConstructor();
            kotlin.jvm.functions.Function3<androidx.compose.runtime.SkippableUpdater<androidx.compose.ui.node.ComposeUiNode>, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            androidx.compose.runtime.Composer m1641constructorimpl = androidx.compose.runtime.Updater.m1641constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m1648setimpl(m1641constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2<androidx.compose.ui.node.ComposeUiNode, java.lang.Integer, kotlin.Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1641constructorimpl.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(m1641constructorimpl.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                m1641constructorimpl.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                m1641constructorimpl.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.m1632boximpl(androidx.compose.runtime.SkippableUpdater.m1633constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (countDownTimer.getIsDefaultTimer()) {
                startRestartGroup.startReplaceableGroup(2067666933);
                startRestartGroup.startReplaceableGroup(-210384916);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final java.lang.String str = "rewarded_countdown_timer";
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(str, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceableGroup();
                int i5 = 458752 & (i4 << 6);
                int i6 = i4 << 18;
                composer2 = startRestartGroup;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c.a(backgroundColor, foregroundColor, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), 0.0f, androidx.compose.ui.unit.DpSize.m4576getWidthD9Ej5fM(m4500DpSizeYgX7TsA), onTimerFinish, null, i, i2, startRestartGroup, (234881024 & i6) | i5 | (29360128 & i6), 72);
                composer2.endReplaceableGroup();
            } else {
                composer2 = startRestartGroup;
                java.lang.String customTimerDesc = countDownTimer.getCustomTimerDesc();
                if (customTimerDesc == null || customTimerDesc.length() <= 0) {
                    composer2.startReplaceableGroup(2069220715);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(2068452876);
                    java.lang.String customTimerDesc2 = countDownTimer.getCustomTimerDesc();
                    composer2.startReplaceableGroup(-210357300);
                    java.lang.Object rememberedValue2 = composer2.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final java.lang.String str2 = "rewarded_countdown_timer_custom";
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.b(str2, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    composer2.endReplaceableGroup();
                    int i7 = 458752 & (i4 << 6);
                    int i8 = i4 << 21;
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b.a(backgroundColor, foregroundColor, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null), 0.0f, androidx.compose.ui.unit.DpSize.m4576getWidthD9Ej5fM(m4500DpSizeYgX7TsA), onTimerFinish, customTimerDesc2, null, i, i2, composer2, (234881024 & i8) | i7 | (1879048192 & i8), 136);
                    composer2.endReplaceableGroup();
                }
            }
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.a.a(com.moloco.sdk.internal.ortb.model.k.this, i, i2, onTimerFinish, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final kotlin.Unit a(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semantics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semantics, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semantics, str);
        return kotlin.Unit.INSTANCE;
    }

    public static final float a(int i, int i2) {
        int compare;
        compare = java.lang.Integer.compare(i2 ^ Integer.MIN_VALUE, 1 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            return i == 0 ? 0.0f : 1.0f;
        }
        return (((float) kotlin.UnsignedKt.uintToDouble(i)) - 1.0f) / (((float) kotlin.UnsignedKt.uintToDouble(i2)) - 1.0f);
    }
}
