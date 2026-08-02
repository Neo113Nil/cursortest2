package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"InAppCheckoutCTAButton", "", "text", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonStyle;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize;", "enabled", "", "isLoading", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonStyle;Lcom/paypal/oslo/feature/inappcheckout/ui/common/ButtonSize;ZZLandroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InAppCheckoutCTAButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x036f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InAppCheckoutCTAButton(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle buttonStyle, com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize buttonSize, boolean z, boolean z2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final androidx.compose.ui.Modifier modifier2;
        int i4;
        final com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle buttonStyle2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize buttonSize2;
        final boolean z4;
        final com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle buttonStyle3;
        final boolean z5;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z6;
        androidx.compose.runtime.Composer composer3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1220558808);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                buttonStyle2 = buttonStyle;
                i3 |= startRestartGroup.changed(buttonStyle2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changed(buttonSize) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        z3 = z;
                    } else {
                        z3 = z;
                        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(z3) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        buttonSize2 = buttonSize;
                        z4 = z2;
                        buttonStyle3 = buttonStyle2;
                        z5 = z3;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            buttonStyle2 = com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle.Primary.INSTANCE;
                        }
                        final com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize buttonSize3 = i5 != 0 ? com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize.Large.INSTANCE : buttonSize;
                        boolean z7 = i6 != 0 ? true : z3;
                        final boolean z8 = i7 != 0 ? false : z2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1220558808, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCTAButton (InAppCheckoutCTAButton.kt:54)");
                        }
                        final long rememberColorValue = com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberColorValue((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), com.paypal.oslo.feature.inappcheckout.R.color.feature_inappcheckout_primary_blue, startRestartGroup, 0);
                        androidx.compose.ui.Modifier m1724defaultMinSizeVpY3zN4 = androidx.compose.foundation.layout.SizeKt.m1724defaultMinSizeVpY3zN4(modifier3, buttonSize3.getMinSize(), buttonSize3.getMinSize());
                        boolean z9 = (i3 & 7168) == 2048;
                        boolean z10 = (57344 & i3) == 16384;
                        boolean changed = startRestartGroup.changed(rememberColorValue);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((z9 | z10 | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCTAButtonKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCTAButtonKt.m15497$r8$lambda$TE4bLM6bUAiYzmfkhH9y8q3Pc4(com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle.this, buttonSize3, rememberColorValue, (androidx.compose.ui.graphics.drawscope.DrawScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        int i9 = i3;
                        com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle buttonStyle4 = buttonStyle2;
                        com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize buttonSize4 = buttonSize3;
                        androidx.compose.ui.Modifier modifier4 = modifier3;
                        androidx.compose.ui.Modifier m22100clickable_mRqjOc = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.draw.DrawModifierKt.drawBehind(m1724defaultMinSizeVpY3zN4, (kotlin.jvm.functions.Function1) rememberedValue), buttonSize3.getContentPadding()), null, null, z7 && !z8, androidx.compose.ui.semantics.Role.m7792boximpl(androidx.compose.ui.semantics.Role.INSTANCE.m7798getButtono7Vup1c()), null, function0, startRestartGroup, (i3 << 15) & 3670016, 19);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m22100clickable_mRqjOc);
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
                        androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                        boolean z11 = (i9 & 3670016) == 1048576;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z11 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCTAButtonKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCTAButtonKt.$r8$lambda$VsonyzX5xvWJTIFLjUnRDUb9eEQ(z8, (androidx.compose.ui.graphics.GraphicsLayerScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        androidx.compose.ui.Modifier graphicsLayer = androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer(companion, (kotlin.jvm.functions.Function1) rememberedValue2);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer);
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
                        if ((str.length() > 0 ? str : null) != null) {
                            startRestartGroup.startReplaceGroup(1924187148);
                            z6 = z8;
                            composer3 = startRestartGroup;
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, buttonStyle4.getTextColor(), null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), androidx.compose.ui.text.style.TextOverflow.m8488boximpl(androidx.compose.ui.text.style.TextOverflow.INSTANCE.m8504getVisiblegIe3tQ8()), false, 0, 0, null, buttonSize4.getTypography(), startRestartGroup, (i9 & 14) | androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 970);
                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                            composer3.endReplaceGroup();
                            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                        } else {
                            startRestartGroup.startReplaceGroup(1924187147);
                            startRestartGroup.endReplaceGroup();
                            z6 = z8;
                            composer3 = startRestartGroup;
                        }
                        composer3.endNode();
                        if (z6) {
                            composer2 = composer3;
                            composer2.startReplaceGroup(-36077022);
                            com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutLoaderKt.InAppCheckoutLoader(null, buttonSize4.getLoaderSize(), buttonStyle4.getTrackColor(), buttonStyle4.getTrackProgressColor(), composer2, 0, 1);
                            composer2.endReplaceGroup();
                        } else {
                            composer2 = composer3;
                            composer2.startReplaceGroup(-35896044);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z4 = z6;
                        z5 = z7;
                        buttonStyle3 = buttonStyle4;
                        buttonSize2 = buttonSize4;
                        modifier2 = modifier4;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCTAButtonKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutCTAButtonKt.$r8$lambda$ZNxpUs6YOIpFXfTkElFN4HJ2sPY(str, function0, modifier2, buttonStyle3, buttonSize2, z5, z4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            buttonStyle2 = buttonStyle;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        buttonStyle2 = buttonStyle;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$TE4bLM6bUAiYzm-fkhH9y8q3Pc4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15497$r8$lambda$TE4bLM6bUAiYzmfkhH9y8q3Pc4(com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle buttonStyle, com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize buttonSize, long j, androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        com.paypal.oslo.feature.inappcheckout.extensions.InAppCheckoutExtensionsKt.m15437drawCTAButtonBackgroundg2O1Hgs(drawScope, buttonStyle, buttonSize, j);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VsonyzX5xvWJTIFLjUnRDUb9eEQ(boolean z, androidx.compose.ui.graphics.GraphicsLayerScope graphicsLayerScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphicsLayerScope, "");
        graphicsLayerScope.setAlpha(z ? 0.0f : 1.0f);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZNxpUs6YOIpFXfTkElFN4HJ2sPY(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.inappcheckout.ui.common.ButtonStyle buttonStyle, com.paypal.oslo.feature.inappcheckout.ui.common.ButtonSize buttonSize, boolean z, boolean z2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        InAppCheckoutCTAButton(str, function0, modifier, buttonStyle, buttonSize, z, z2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
