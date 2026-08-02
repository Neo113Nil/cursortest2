package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\f\u001a!\u0010\u000e\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"OvalGuideView", "", "ovalRect", "Landroid/graphics/Rect;", "strokeColor", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroid/graphics/Rect;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/OvalStrokeColor;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TutorialText", "visible", "", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BlinkText", "WarningMessageView", "warningMessage", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/WarningMessage;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "verification-capture_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OvalGuideViewKt {
    public static final void OvalGuideView(final android.graphics.Rect rect, final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ovalStrokeColor, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(265177858);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(rect) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(ovalStrokeColor.ordinal()) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            final int i5 = -1;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(265177858, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideView (OvalGuideView.kt:52)");
            }
            int i6 = com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.WhenMappings.$EnumSwitchMapping$0[ovalStrokeColor.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    i5 = android.graphics.Color.parseColor("#4CAF50");
                } else {
                    if (i6 != 3) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    i5 = android.graphics.Color.parseColor("#FFBE4A");
                }
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            boolean changedInstance = startRestartGroup.changedInstance(rect);
            boolean changed = startRestartGroup.changed(i5);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.$r8$lambda$_58_gyaVKSOyKok8kvivLB7w2B4(rect, i5, (android.content.Context) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            boolean changedInstance2 = startRestartGroup.changedInstance(rect);
            boolean changed2 = startRestartGroup.changed(i5);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if ((changedInstance2 | changed2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.m20639$r8$lambda$1ZEFxkrmMBIGhXFpiDINQwNXJM(rect, i5, (com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.TransparentOvalView) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(function1, fillMaxSize$default, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.$r8$lambda$uOc60LtZwDvLZdHULrh35xWtCP4(rect, ovalStrokeColor, modifier2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TutorialText(final boolean z, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(743827331);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(743827331, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.TutorialText (OvalGuideView.kt:177)");
            }
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(z, modifier, androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, 2, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, 2, null), (java.lang.String) null, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ComposableSingletons$OvalGuideViewKt.INSTANCE.getLambda$1270138795$verification_capture_prodRelease(), startRestartGroup, (i3 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112), 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.$r8$lambda$flrTtpTBgcXb62W6UDl49_K2Psw(z, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void BlinkText(final boolean z, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1505889253);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1505889253, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.BlinkText (OvalGuideView.kt:210)");
            }
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(z, modifier, androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, 2, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, 2, null), (java.lang.String) null, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.ComposableSingletons$OvalGuideViewKt.INSTANCE.getLambda$2072206525$verification_capture_prodRelease(), startRestartGroup, (i3 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112), 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.$r8$lambda$99dAmGFaAKwVOkD50AhswAHlwu0(z, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void WarningMessageView(final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-919969697);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(warningMessage == null ? -1 : warningMessage.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-919969697, i3, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessageView (OvalGuideView.kt:243)");
            }
            androidx.compose.animation.AnimatedVisibilityKt.AnimatedVisibility(warningMessage != null, modifier, androidx.compose.animation.EnterExitTransitionKt.fadeIn$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, 2, null), androidx.compose.animation.EnterExitTransitionKt.fadeOut$default(androidx.compose.animation.core.AnimationSpecKt.tween$default(300, 0, androidx.compose.animation.core.EasingKt.getFastOutSlowInEasing(), 2, null), 0.0f, 2, null), (java.lang.String) null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1839137079, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.$r8$lambda$YkAYECgO0UNbRqgRzdOqg0S3yKo(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage.this, (androidx.compose.animation.AnimatedVisibilityScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (i3 & 112) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalGuideViewKt.m20640$r8$lambda$pyqCTos7fstRl4C4yjm9ImVZps(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$1ZEFxkrmMBIGhXFpi-DINQwNXJM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20639$r8$lambda$1ZEFxkrmMBIGhXFpiDINQwNXJM(android.graphics.Rect rect, int i, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.TransparentOvalView transparentOvalView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transparentOvalView, "");
        transparentOvalView.setOvalRect(rect);
        transparentOvalView.setStrokeColor(i);
        transparentOvalView.invalidate();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$99dAmGFaAKwVOkD50AhswAHlwu0(boolean z, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BlinkText(z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YkAYECgO0UNbRqgRzdOqg0S3yKo(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage, androidx.compose.animation.AnimatedVisibilityScope animatedVisibilityScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedVisibilityScope, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1839137079, i, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessageView.<anonymous> (OvalGuideView.kt:250)");
        }
        if (warningMessage != null) {
            composer.startReplaceGroup(-1165023927);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getBottomCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.lang.String stringRes = warningMessage.getStringRes();
            com.paypal.pds.core.Typography.BodyMedium bodyMedium = com.paypal.pds.core.Typography.BodyMedium.INSTANCE;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(stringRes, androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.Color.ContentRoleBaseWarning.INSTANCE, null, null, null, false, 0, 0, null, bodyMedium, composer, 432, 6, 1016);
            composer.endNode();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1164622229);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.TransparentOvalView $r8$lambda$_58_gyaVKSOyKok8kvivLB7w2B4(android.graphics.Rect rect, int i, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.TransparentOvalView transparentOvalView = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.TransparentOvalView(context);
        transparentOvalView.setOvalRect(rect);
        transparentOvalView.setStrokeColor(i);
        transparentOvalView.setClickable(false);
        transparentOvalView.setFocusable(false);
        return transparentOvalView;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$flrTtpTBgcXb62W6UDl49_K2Psw(boolean z, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TutorialText(z, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pyqCT-os7fstRl4C4yjm9ImVZps, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20640$r8$lambda$pyqCTos7fstRl4C4yjm9ImVZps(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.WarningMessage warningMessage, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WarningMessageView(warningMessage, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uOc60LtZwDvLZdHULrh35xWtCP4(android.graphics.Rect rect, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor ovalStrokeColor, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        OvalGuideView(rect, ovalStrokeColor, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor.values().length];
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor.WHITE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor.GREEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.OvalStrokeColor.ORANGE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
