package com.paypal.oslo.feature.cashin.ui.barcode.composable;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0002\u0010\u0015\u001a%\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u001c\"\u000e\u0010\u001d\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"DebitCard", "", "showDebitCardWidget", "", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "debitCardWidgetRequestId", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "transactionTimeDelay", "", "minLimitPerTransaction", "maxLimitPerTransaction", "transactionMinLimitPerDay", "transactionMaxLimitPerMonth", "modifier", "Landroidx/compose/ui/Modifier;", "debitCardImageUrl", "DebitCard-bzQNO5k", "(ZLcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "DebitCardLeadingIcon", "cardArtUrl", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "DebitCardLeadingIconContent", "painterState", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "Landroidx/compose/ui/graphics/painter/Painter;", "contentDescription", "(Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "CardArtImageTestTag", "cash-in_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DebitCardKt {
    public static final java.lang.String CardArtImageTestTag = "card_art_image";

    /* JADX WARN: Removed duplicated region for block: B:65:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e1  */
    /* renamed from: DebitCard-bzQNO5k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13410DebitCardbzQNO5k(final boolean z, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final java.lang.String str6, androidx.compose.ui.Modifier modifier, java.lang.String str7, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str8;
        androidx.compose.runtime.Composer composer2;
        java.lang.String str9;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        final java.lang.String str10;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-170332507);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str != null ? com.paypal.oslo.core.navigation.result.NavResultRequestId.m11587boximpl(str) : null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changed(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changed(str4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= startRestartGroup.changed(str5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= startRestartGroup.changed(str6) ? 8388608 : 4194304;
        }
        int i5 = i2 & 256;
        if (i5 != 0) {
            i3 |= 100663296;
        } else if ((100663296 & i) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 67108864 : 33554432;
            i4 = i2 & 512;
            if (i4 == 0) {
                i3 |= 805306368;
                str8 = str7;
            } else {
                str8 = str7;
                if ((i & 805306368) == 0) {
                    i3 |= startRestartGroup.changed(str8) ? 536870912 : 268435456;
                }
            }
            if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                str9 = str8;
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier.Companion companion = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                java.lang.String str11 = i4 != 0 ? null : str8;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-170332507, i3, -1, "com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCard (DebitCard.kt:63)");
                }
                if (z) {
                    startRestartGroup.startReplaceGroup(-2018905149);
                    str10 = str11;
                    com.paypal.oslo.feature.debitcard.api.widget.DebitCardWidgetKt.m14170DebitCardWidgetTgLG0vA(appNavigator, com.paypal.oslo.feature.debitcard.api.model.DebitCardEntryPoint.CASH_AT_STORE, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), str, startRestartGroup, ((i3 >> 3) & 14) | 48 | ((i3 << 3) & 7168), 0);
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup = startRestartGroup;
                } else {
                    str10 = str11;
                    startRestartGroup.startReplaceGroup(-2018633651);
                    com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (com.paypal.pds.core.BaseColor) null, (androidx.compose.ui.graphics.painter.Painter) null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, new com.paypal.pds.components.HeaderConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_activationdetails_instructions_ppdc_heading, startRestartGroup, 0), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1844065203, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardKt.$r8$lambda$cSaF8irfXsrDJg6OjAoWaXonOyM(str10, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), null, 22, null), (com.paypal.pds.components.FooterConfig) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (com.paypal.pds.components.CardPadding) null, (com.paypal.pds.components.CardCornerRadius) null, (kotlin.Unit) null, com.paypal.oslo.feature.cashin.ui.barcode.composable.ComposableSingletons$DebitCardKt.INSTANCE.getLambda$1291332045$cash_in_prodRelease(), startRestartGroup, (com.paypal.pds.components.CardStyle.Outlined.$stable << 9) | (com.paypal.pds.components.HeaderConfig.$stable << 12), 6, 998);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                composer2 = startRestartGroup;
                com.paypal.pds.components.ContextualAlertKt.ContextualAlert(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_activationdetails_disclaimer_ppdc, new java.lang.Object[]{str2, str3, str4, str5, str6}, startRestartGroup, 0), null, null, startRestartGroup, 0, 6);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
                str9 = str10;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                final java.lang.String str12 = str9;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardKt.$r8$lambda$KX7gv9yME4FVNPSHkrfxMYDFaO0(z, appNavigator, str, str2, str3, str4, str5, str6, modifier4, str12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 512;
        if (i4 == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 306783379) == 306783378, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void DebitCardLeadingIcon(final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.ScopeUpdateScope scopeUpdateScope;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1052764552);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1052764552, i2, -1, "com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardLeadingIcon (DebitCard.kt:115)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.cashin.R.string.feature_cash_in_debit_card_icon_content_description, startRestartGroup, 0);
            java.lang.String str2 = str;
            if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
                startRestartGroup.startReplaceGroup(-1057360950);
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Card.INSTANCE, stringResource, null, null, null, startRestartGroup, 6, 28);
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                scopeUpdateScope = startRestartGroup.endRestartGroup();
                if (scopeUpdateScope != null) {
                    function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardKt.$r8$lambda$TnnN0xBLutxwx6NgozyMBnFoPUY(str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScope.updateScope(function2);
                }
                return;
            }
            startRestartGroup.startReplaceGroup(-1057237942);
            startRestartGroup.endReplaceGroup();
            com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(new com.paypal.oslo.core.commonui.components.ImageRequest.Builder((android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext())).data(str).build(), null, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.components.ImageRequest.$stable, 30);
            DebitCardLeadingIconContent((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State) androidx.compose.runtime.SnapshotStateKt.collectAsState(rememberAsyncImagePainter.getState(), null, startRestartGroup, 0, 1).getValue(), rememberAsyncImagePainter, stringResource, startRestartGroup, com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.$stable);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScope = startRestartGroup.endRestartGroup();
        if (scopeUpdateScope != null) {
            function2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardKt.$r8$lambda$CAb4iQH2vH3EpT94rOaH6Qb4WOM(str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            };
            scopeUpdateScope.updateScope(function2);
        }
    }

    public static final void DebitCardLeadingIconContent(final com.paypal.oslo.core.commonui.components.AsyncImagePainter.State state, final androidx.compose.ui.graphics.painter.Painter painter, final java.lang.String str, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2013257603);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(state) : startRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(painter) : startRestartGroup.changedInstance(painter) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2013257603, i2, -1, "com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardLeadingIconContent (DebitCard.kt:147)");
            }
            if (state instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success) {
                startRestartGroup.startReplaceGroup(-2033677752);
                int i3 = i2 >> 3;
                androidx.compose.foundation.ImageKt.Image(painter, str, androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1742sizeVpY3zN4(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, CardArtImageTestTag), androidx.compose.ui.unit.Dp.m8601constructorimpl(48.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(32.0f)), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(androidx.compose.ui.unit.Dp.m8601constructorimpl(4.0f))), (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.INSTANCE.getCrop(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, startRestartGroup, androidx.compose.ui.graphics.painter.Painter.$stable | 24576 | (i3 & 14) | (i3 & 112), 104);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-2033289632);
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Card.INSTANCE, str, null, null, null, startRestartGroup, ((i2 >> 3) & 112) | 6, 28);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCardKt.$r8$lambda$RqzYTjoYgMXQIWcvlFZoFAsl4tc(com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.this, painter, str, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CAb4iQH2vH3EpT94rOaH6Qb4WOM(java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        DebitCardLeadingIcon(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KX7gv9yME4FVNPSHkrfxMYDFaO0(boolean z, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, androidx.compose.ui.Modifier modifier, java.lang.String str7, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m13410DebitCardbzQNO5k(z, appNavigator, str, str2, str3, str4, str5, str6, modifier, str7, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RqzYTjoYgMXQIWcvlFZoFAsl4tc(com.paypal.oslo.core.commonui.components.AsyncImagePainter.State state, androidx.compose.ui.graphics.painter.Painter painter, java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        DebitCardLeadingIconContent(state, painter, str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TnnN0xBLutxwx6NgozyMBnFoPUY(java.lang.String str, int i, androidx.compose.runtime.Composer composer, int i2) {
        DebitCardLeadingIcon(str, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cSaF8irfXsrDJg6OjAoWaXonOyM(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1844065203, i, -1, "com.paypal.oslo.feature.cashin.ui.barcode.composable.DebitCard.<anonymous> (DebitCard.kt:78)");
            }
            DebitCardLeadingIcon(str, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
