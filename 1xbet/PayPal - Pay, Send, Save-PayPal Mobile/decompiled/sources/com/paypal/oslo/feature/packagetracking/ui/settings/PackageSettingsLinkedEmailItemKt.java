package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000b"}, d2 = {"", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "provider", "", "providerIcon", "Lkotlin/Function0;", "", "onClick", "PackageSettingsLinkedEmailItem", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PackageSettingsLinkedEmailItemGmailPreview", "(Landroidx/compose/runtime/Composer;I)V", "PackageSettingsLinkedEmailItemOutlookPreview", "PackageSettingsLinkedEmailListPreview"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageSettingsLinkedEmailItemKt {
    public static final void PackageSettingsLinkedEmailItem(final java.lang.String str, final java.lang.String str2, final int i, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i2) {
        int i3;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(374499454);
        if ((i2 & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= startRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(374499454, i4, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItem (PackageSettingsLinkedEmailItem.kt:42)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ListKt.ListItemView(new com.paypal.pds.components.ListItem(str2, str, null, null, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(627186587, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt.$r8$lambda$H9GE9xUiKiONFSmjahNNInM6hF0(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1413488518, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt.$r8$lambda$Gqd5mL3JguCyELyQmJDgJUyAyBI(i, str2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, null, null, androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), androidx.compose.ui.unit.Dp.m8599boximpl(com.paypal.pds.core.ConstantsKt.getSpacing0()), 1852, null), null, false, function0, null, null, false, composer2, com.paypal.pds.components.ListItem.$stable | (i4 & 7168), 118);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt.$r8$lambda$ysET4Gjq4NyNo8cPKC4Yy_LJ5RI(str, str2, i, function0, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PackageSettingsLinkedEmailItemGmailPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1435263827);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1435263827, i, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemGmailPreview (PackageSettingsLinkedEmailItem.kt:73)");
            }
            int i2 = com.paypal.oslo.feature.packagetracking.R.drawable.feature_package_tracking_ic_gmail;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PackageSettingsLinkedEmailItem(com.paypal.oslo.feature.packagetracking.ui.PTUiConstants.MOCK_EMAIL_PLACEHOLDER, "Gmail", i2, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 3126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt.$r8$lambda$SZgoRvMCV_lO7XRPv9Teup3eDDE(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PackageSettingsLinkedEmailItemOutlookPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(619585506);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(619585506, i, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemOutlookPreview (PackageSettingsLinkedEmailItem.kt:87)");
            }
            int i2 = com.paypal.oslo.feature.packagetracking.R.drawable.feature_package_tracking_ic_outlook;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            PackageSettingsLinkedEmailItem(com.paypal.oslo.feature.packagetracking.ui.PTUiConstants.MOCK_EMAIL_PLACEHOLDER, "Outlook", i2, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 3126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt.$r8$lambda$HsQCwoj1XNS14G6xgDJeXPcYbZ4(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PackageSettingsLinkedEmailListPreview(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(552741686);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(552741686, i, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailListPreview (PackageSettingsLinkedEmailItem.kt:101)");
            }
            com.paypal.pds.components.CardKt.Card(null, com.paypal.pds.core.Color.BackgroundBase.INSTANCE, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, com.paypal.oslo.feature.packagetracking.ui.settings.ComposableSingletons$PackageSettingsLinkedEmailItemKt.INSTANCE.m17564getLambda$1357110082$package_tracking_prodRelease(), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | 805306416, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt.$r8$lambda$nhJj4AGtB3cCn6NoAiXqvCJKs0c(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Gqd5mL3JguCyELyQmJDgJUyAyBI(int i, java.lang.String str, androidx.compose.runtime.Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1413488518, i2, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItem.<anonymous> (PackageSettingsLinkedEmailItem.kt:48)");
            }
            com.paypal.pds.components.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(i, composer, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_content_description_image, new java.lang.Object[]{str}, composer, 0), androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSize40()), null, null, null, null, composer, androidx.compose.ui.graphics.painter.Painter.$stable, 120);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H9GE9xUiKiONFSmjahNNInM6hF0(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(627186587, i, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItem.<anonymous> (PackageSettingsLinkedEmailItem.kt:58)");
            }
            com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.LinkBroken.INSTANCE, function0, null, com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE, null, null, null, false, false, composer, 3078, 500);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$HsQCwoj1XNS14G6xgDJeXPcYbZ4(int i, androidx.compose.runtime.Composer composer, int i2) {
        PackageSettingsLinkedEmailItemOutlookPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SZgoRvMCV_lO7XRPv9Teup3eDDE(int i, androidx.compose.runtime.Composer composer, int i2) {
        PackageSettingsLinkedEmailItemGmailPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nhJj4AGtB3cCn6NoAiXqvCJKs0c(int i, androidx.compose.runtime.Composer composer, int i2) {
        PackageSettingsLinkedEmailListPreview(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ysET4Gjq4NyNo8cPKC4Yy_LJ5RI(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.functions.Function0 function0, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PackageSettingsLinkedEmailItem(str, str2, i, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return kotlin.Unit.INSTANCE;
    }
}
