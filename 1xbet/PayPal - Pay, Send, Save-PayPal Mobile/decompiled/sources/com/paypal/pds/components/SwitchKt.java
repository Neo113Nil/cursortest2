package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\r\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "CheckmarkMinScale", "", "SwitchPreview", "(ZLandroidx/compose/runtime/Composer;I)V", "pds_release", "thumbOffset", "animatedColor", "Landroidx/compose/ui/graphics/Color;", "checkmarkVisible", "checkmarkScale", "checkedInternal"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SwitchKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(final boolean z, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final androidx.compose.ui.Modifier modifier2;
        int i3;
        boolean z3;
        int i4;
        final boolean z4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1690760671);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changed(z) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i5 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i5 |= 3072;
            } else if ((i & 3072) == 0) {
                z3 = z2;
                i5 |= startRestartGroup.changed(z3) ? 2048 : 1024;
                i4 = i5;
                if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    z4 = z3;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    boolean z5 = i3 != 0 ? true : z3;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1690760671, i4, -1, "com.paypal.pds.components.Switch (Switch.kt:79)");
                    }
                    float size56 = com.paypal.pds.core.ConstantsKt.getSize56();
                    float size32 = com.paypal.pds.core.ConstantsKt.getSize32();
                    float size24 = com.paypal.pds.core.ConstantsKt.getSize24();
                    float spacing4 = com.paypal.pds.core.ConstantsKt.getSpacing4();
                    float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(androidx.compose.ui.unit.Dp.m8601constructorimpl(size56 - size24) - androidx.compose.ui.unit.Dp.m8601constructorimpl(2.0f * spacing4));
                    final androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback = (androidx.compose.ui.hapticfeedback.HapticFeedback) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalHapticFeedback());
                    androidx.compose.ui.unit.Density density = (androidx.compose.ui.unit.Density) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                    boolean changed = startRestartGroup.changed(density);
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = java.lang.Float.valueOf(density.mo1418toPx0680j_4(m8601constructorimpl));
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    float floatValue = ((java.lang.Number) rememberedValue).floatValue();
                    if (!z) {
                        floatValue = 0.0f;
                    }
                    final androidx.compose.runtime.State<java.lang.Float> animateFloatAsState = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(floatValue, androidx.compose.animation.core.AnimationSpecKt.tween$default(100, 0, com.paypal.pds.core.MotionEasingKt.easingExpressiveInOut(startRestartGroup, 0), 2, null), 0.0f, null, null, startRestartGroup, 0, 28);
                    long value = com.paypal.pds.core.Color.BackgroundUtilitySelected.INSTANCE.getValue(startRestartGroup, 6);
                    long value2 = com.paypal.pds.core.Color.BackgroundUtilityUnselected.INSTANCE.getValue(startRestartGroup, 6);
                    if (z) {
                        value2 = value;
                    }
                    com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(startRestartGroup, 0);
                    kotlin.jvm.internal.SpreadBuilder spreadBuilder = new kotlin.jvm.internal.SpreadBuilder(2);
                    spreadBuilder.addSpread(new java.lang.Object[0]);
                    spreadBuilder.add(localTokens);
                    java.lang.Object[] array = spreadBuilder.toArray(new java.lang.Object[spreadBuilder.size()]);
                    boolean z6 = false;
                    for (java.lang.Object obj : array) {
                        z6 |= startRestartGroup.changed(obj);
                    }
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (z6 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = androidx.compose.animation.core.AnimationSpecKt.snap(50);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    final androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> m1150animateColorAsStateeuL9pac = androidx.compose.animation.SingleValueAnimationKt.m1150animateColorAsStateeuL9pac(value2, (androidx.compose.animation.core.AnimationSpec) rememberedValue2, null, null, startRestartGroup, 0, 12);
                    float f = z ? 1.0f : 0.0f;
                    com.paypal.pds.tokens.PDSTokens localTokens2 = com.paypal.pds.core.ThemeKt.localTokens(startRestartGroup, 0);
                    kotlin.jvm.internal.SpreadBuilder spreadBuilder2 = new kotlin.jvm.internal.SpreadBuilder(2);
                    spreadBuilder2.addSpread(new java.lang.Object[0]);
                    spreadBuilder2.add(localTokens2);
                    java.lang.Object[] array2 = spreadBuilder2.toArray(new java.lang.Object[spreadBuilder2.size()]);
                    boolean z7 = false;
                    for (java.lang.Object obj2 : array2) {
                        z7 |= startRestartGroup.changed(obj2);
                    }
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (z7 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = androidx.compose.animation.core.AnimationSpecKt.snap(50);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.State<java.lang.Float> animateFloatAsState2 = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(f, (androidx.compose.animation.core.AnimationSpec) rememberedValue3, 0.0f, null, null, startRestartGroup, 0, 28);
                    final androidx.compose.runtime.State<java.lang.Float> animateFloatAsState3 = androidx.compose.animation.core.AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.6f, androidx.compose.animation.core.AnimationSpecKt.tween(150, 50, com.paypal.pds.core.MotionEasingKt.easingExpressiveIn(startRestartGroup, 0)), 0.0f, null, null, startRestartGroup, 0, 28);
                    androidx.compose.ui.Alignment centerStart = androidx.compose.ui.Alignment.INSTANCE.getCenterStart();
                    androidx.compose.ui.Modifier clip = androidx.compose.ui.draw.ClipKt.clip(com.paypal.pds.core.PDSHighlightHostKt.pdsComponent(modifier3), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape());
                    int m7804getSwitcho7Vup1c = androidx.compose.ui.semantics.Role.INSTANCE.m7804getSwitcho7Vup1c();
                    com.paypal.pds.core.PDSIndication.None none = com.paypal.pds.core.PDSIndication.None.INSTANCE;
                    androidx.compose.ui.semantics.Role m7792boximpl = androidx.compose.ui.semantics.Role.m7792boximpl(m7804getSwitcho7Vup1c);
                    boolean changedInstance = startRestartGroup.changedInstance(hapticFeedback);
                    boolean z8 = (i4 & 112) == 32;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((changedInstance | z8) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SwitchKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                return com.paypal.pds.components.SwitchKt.$r8$lambda$z3wzcM9ujVXGAxIos1l5u9hVgMc(androidx.compose.ui.hapticfeedback.HapticFeedback.this, function1, ((java.lang.Boolean) obj3).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    int i7 = i4 << 3;
                    androidx.compose.ui.Modifier m1742sizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(com.paypal.pds.core.ModifierExtensionsKt.m22104toggleableXVZzFYc(clip, z, null, none, z5, m7792boximpl, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, (i7 & 112) | 3456 | (i7 & 57344), 0), size56, size32);
                    boolean changed2 = startRestartGroup.changed(m1150animateColorAsStateeuL9pac);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SwitchKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                return com.paypal.pds.components.SwitchKt.$r8$lambda$YT3Kf6TFeF4WCbUFD9CsLuJSIxk(androidx.compose.runtime.State.this, (androidx.compose.ui.graphics.drawscope.DrawScope) obj3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    androidx.compose.ui.Modifier drawBehind = androidx.compose.ui.draw.DrawModifierKt.drawBehind(m1742sizeVpY3zN4, (kotlin.jvm.functions.Function1) rememberedValue5);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, drawBehind);
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
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.INSTANCE.getCenter();
                    androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                    boolean changed3 = startRestartGroup.changed(animateFloatAsState);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SwitchKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj3) {
                                return com.paypal.pds.components.SwitchKt.$r8$lambda$NcL3xgsSPL9z41Ux2IXteg6w31g(androidx.compose.runtime.State.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(companion, (kotlin.jvm.functions.Function1) rememberedValue6), spacing4, 0.0f, 2, null), size24), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.ContentUtilityInverse.INSTANCE, (androidx.compose.ui.graphics.Shape) androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape(), startRestartGroup, 48, 0);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    if (animateFloatAsState2.getValue().floatValue() > 0.0f) {
                        startRestartGroup.startReplaceGroup(-373788845);
                        com.paypal.pds.core.Icon.Check check = com.paypal.pds.core.Icon.Check.INSTANCE;
                        com.paypal.pds.components.IconSize.XSmall xSmall = com.paypal.pds.components.IconSize.XSmall.INSTANCE;
                        com.paypal.pds.core.Color.ContentUtilitySelected contentUtilitySelected = com.paypal.pds.core.Color.ContentUtilitySelected.INSTANCE;
                        androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                        boolean changed4 = startRestartGroup.changed(animateFloatAsState3);
                        java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                        if (changed4 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SwitchKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj3) {
                                    return com.paypal.pds.components.SwitchKt.$r8$lambda$dMJxLLSweJjfVemPrGN2fqkrLSs(androidx.compose.runtime.State.this, (androidx.compose.ui.graphics.GraphicsLayerScope) obj3);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        com.paypal.pds.components.IconKt.Icon(check, null, androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(companion2, (kotlin.jvm.functions.Function1) rememberedValue7), xSmall, contentUtilitySelected, startRestartGroup, 27702, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-373342507);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    z4 = z5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.SwitchKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                            return com.paypal.pds.components.SwitchKt.m22037$r8$lambda$QlK5xzVExMVEUaQEVnkbk1tyPs(z, function1, modifier2, z4, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z3 = z2;
            i4 = i5;
            if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        z3 = z2;
        i4 = i5;
        if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$0sOne6DB6Jwkcob_zj_ROpZTlr4(final boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        int i3;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1579639945);
        if ((updateChangedFlags & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | updateChangedFlags;
        } else {
            i3 = updateChangedFlags;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1579639945, i3, -1, "com.paypal.pds.components.SwitchPreview (Switch.kt:186)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(z), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            boolean booleanValue = ((java.lang.Boolean) mutableState.getValue()).booleanValue();
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.components.SwitchKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.pds.components.SwitchKt.m22038$r8$lambda$bCUYhHQ2Y0ZLKhHKA7pZJsRTTI(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Switch(booleanValue, (kotlin.jvm.functions.Function1) rememberedValue2, null, false, startRestartGroup, 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.pds.components.SwitchKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.pds.components.SwitchKt.$r8$lambda$0sOne6DB6Jwkcob_zj_ROpZTlr4(z, updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NcL3xgsSPL9z41Ux2IXteg6w31g(androidx.compose.runtime.State state, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setTranslationX(((java.lang.Number) state.getValue()).floatValue());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QlK5xzV-ExMVEUaQEVnkbk1tyPs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22037$r8$lambda$QlK5xzVExMVEUaQEVnkbk1tyPs(boolean z, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        Switch(z, function1, modifier, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YT3Kf6TFeF4WCbUFD9CsLuJSIxk(androidx.compose.runtime.State state, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.drawscope.DrawScope.m6526drawRectnJ9OG0$default(drawScope, ((androidx.compose.ui.graphics.Color) state.getValue()).m6006unboximpl(), 0L, 0L, 0.0f, null, null, 0, 126, null);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$bCUYhHQ2Y0ZLKhHKA7p-ZJsRTTI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m22038$r8$lambda$bCUYhHQ2Y0ZLKhHKA7pZJsRTTI(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dMJxLLSweJjfVemPrGN2fqkrLSs(androidx.compose.runtime.State state, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setScaleX(((java.lang.Number) state.getValue()).floatValue());
        graphicsLayerScope.setScaleY(((java.lang.Number) state.getValue()).floatValue());
        graphicsLayerScope.mo6180setTransformOrigin__ExYCQ(androidx.compose.ui.graphics.TransformOriginKt.TransformOrigin(0.0f, 1.0f));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z3wzcM9ujVXGAxIos1l5u9hVgMc(androidx.compose.ui.hapticfeedback.HapticFeedback hapticFeedback, kotlin.jvm.functions.Function1 function1, boolean z) {
        hapticFeedback.mo6704performHapticFeedbackCdsT49E(androidx.compose.ui.hapticfeedback.HapticFeedbackType.INSTANCE.m6716getKeyboardTap5zf0vsI());
        function1.invoke(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }
}
