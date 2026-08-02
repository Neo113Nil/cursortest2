package com.paypal.oslo.feature.inappcheckout.ui.common;

@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"TextWithLeadingIcon", "", "text", "", "icon", "Lcom/paypal/pds/core/Icon;", "modifier", "Landroidx/compose/ui/Modifier;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lcom/paypal/pds/core/Color;", "typography", "Lcom/paypal/pds/core/Typography;", "onClick", "Lkotlin/Function0;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "contentDescription", "(Ljava/lang/String;Lcom/paypal/pds/core/Icon;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/core/Color;Lcom/paypal/pds/core/Typography;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Alignment$Vertical;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "TextWithLeadingIconPreview", "(Landroidx/compose/runtime/Composer;I)V", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextWithLeadingIconKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextWithLeadingIcon(final java.lang.String str, final com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Color color, com.paypal.pds.core.Typography typography, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Alignment.Vertical vertical, java.lang.String str2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        com.paypal.pds.core.Typography typography2;
        int i6;
        int i7;
        androidx.compose.ui.Alignment.Vertical vertical2;
        int i8;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.pds.core.Color color2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final java.lang.String str3;
        final com.paypal.pds.core.Typography typography3;
        final androidx.compose.ui.Alignment.Vertical vertical3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i9;
        androidx.compose.ui.Modifier modifier3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.ui.Alignment.Vertical vertical4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2008007392);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(color) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    typography2 = typography;
                    i3 |= startRestartGroup.changed(typography2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        i3 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                            vertical2 = vertical;
                        } else {
                            vertical2 = vertical;
                            if ((i & 1572864) == 0) {
                                i3 |= startRestartGroup.changed(vertical2) ? 1048576 : 524288;
                            }
                        }
                        i8 = i2 & 128;
                        if (i8 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= startRestartGroup.changed(str2) ? 8388608 : 4194304;
                        }
                        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                            androidx.compose.ui.Modifier modifier4 = i10 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                            com.paypal.pds.core.Color color3 = i4 != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : color;
                            com.paypal.pds.core.Typography typography4 = i5 != 0 ? com.paypal.pds.core.Typography.BodyMedium.INSTANCE : typography2;
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function04 = i6 != 0 ? null : function0;
                            if (i7 != 0) {
                                vertical2 = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                            }
                            java.lang.String str4 = i8 != 0 ? null : str2;
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(2008007392, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.TextWithLeadingIcon (TextWithLeadingIcon.kt:42)");
                            }
                            startRestartGroup.startReplaceGroup(1254802431);
                            androidx.compose.ui.Modifier height = androidx.compose.foundation.layout.IntrinsicKt.height(androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(modifier4, null, false, 3, null), androidx.compose.foundation.layout.IntrinsicSize.Min);
                            if (function04 != null) {
                                startRestartGroup.startReplaceGroup(1489628089);
                                boolean z = (458752 & i3) == 131072;
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.TextWithLeadingIconKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.inappcheckout.ui.common.TextWithLeadingIconKt.$r8$lambda$mtofpoIGQ8p8QReDIEY3AU7F2Jo(kotlin.jvm.functions.Function0.this);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                i9 = i3;
                                modifier3 = modifier4;
                                function03 = function04;
                                vertical4 = vertical2;
                                height = com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(height, null, null, false, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 31);
                            } else {
                                i9 = i3;
                                modifier3 = modifier4;
                                function03 = function04;
                                vertical4 = vertical2;
                                startRestartGroup.startReplaceGroup(1489628996);
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.endReplaceGroup();
                            int i11 = i9 >> 12;
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), vertical4, startRestartGroup, ((i11 & 896) >> 3) & 112);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, height);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                            int i12 = i9 >> 3;
                            com.paypal.pds.components.IconKt.Icon(icon, str4, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, ((i9 >> 18) & 112) | (i12 & 14) | 27648, 4);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                            composer2 = startRestartGroup;
                            androidx.compose.ui.Alignment.Vertical vertical5 = vertical4;
                            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, color3, null, null, null, false, 0, 0, null, typography4, startRestartGroup, (i12 & 896) | (i9 & 14), i11 & 14, 1018);
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            str3 = str4;
                            function02 = function03;
                            color2 = color3;
                            typography3 = typography4;
                            vertical3 = vertical5;
                            modifier2 = modifier3;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            color2 = color;
                            function02 = function0;
                            str3 = str2;
                            typography3 = typography2;
                            vertical3 = vertical2;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.TextWithLeadingIconKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.inappcheckout.ui.common.TextWithLeadingIconKt.$r8$lambda$WSFiF8uQt63SquDZ62kuXFWfnxs(str, icon, modifier2, color2, typography3, function02, vertical3, str3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 128;
                    if (i8 != 0) {
                    }
                    if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                typography2 = typography;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                if (i8 != 0) {
                }
                if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            typography2 = typography;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            if (i8 != 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        typography2 = typography;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        if (i8 != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 4793491) != 4793490, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void TextWithLeadingIconPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1855196756);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1855196756, i, -1, "com.paypal.oslo.feature.inappcheckout.ui.common.TextWithLeadingIconPreview (TextWithLeadingIcon.kt:67)");
            }
            TextWithLeadingIcon("Logout", com.paypal.pds.core.Icon.NoIcon.INSTANCE, null, null, null, null, null, null, startRestartGroup, 54, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.common.TextWithLeadingIconKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.common.TextWithLeadingIconKt.m15511$r8$lambda$XJIllislb3c07Yr8CSJMUTxIaE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WSFiF8uQt63SquDZ62kuXFWfnxs(java.lang.String str, com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, com.paypal.pds.core.Color color, com.paypal.pds.core.Typography typography, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Alignment.Vertical vertical, java.lang.String str2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        TextWithLeadingIcon(str, icon, modifier, color, typography, function0, vertical, str2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XJIllislb3c07Yr8CSJMUTxIa-E, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15511$r8$lambda$XJIllislb3c07Yr8CSJMUTxIaE(int i, androidx.compose.runtime.Composer composer, int i2) {
        TextWithLeadingIconPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mtofpoIGQ8p8QReDIEY3AU7F2Jo(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }
}
