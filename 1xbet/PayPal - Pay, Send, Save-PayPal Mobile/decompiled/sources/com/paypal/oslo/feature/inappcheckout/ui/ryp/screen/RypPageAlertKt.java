package com.paypal.oslo.feature.inappcheckout.ui.ryp.screen;

@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t28\b\u0002\u0010\n\u001a2\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00010\u000bH\u0001¢\u0006\u0002\u0010\u000f\u001a\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002\u001a\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0016"}, d2 = {"PageAlert", "", "type", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/PageAlertType;", "modifier", "Landroidx/compose/ui/Modifier;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/pds/components/BannerStyle;", "text", "", "onLinkClick", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "tag", "(Lcom/paypal/oslo/feature/inappcheckout/domain/model/PageAlertType;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/BannerStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "getAddCardAlertText", "Lcom/paypal/pds/core/RichText;", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_RESOURCES_KEY, "Landroid/content/res/Resources;", "getUpdateCardAlertText", "getFiNotSelectedAlertText", "inappcheckout_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RypPageAlertKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PageAlert(final com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType pageAlertType, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.BannerStyle bannerStyle, java.lang.String str, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.pds.components.BannerStyle bannerStyle2;
        int i5;
        java.lang.String str2;
        int i6;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        final androidx.compose.ui.Modifier modifier3;
        final java.lang.String str3;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function24;
        com.paypal.pds.core.RichText richText;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pageAlertType, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-826992589);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(pageAlertType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                bannerStyle2 = bannerStyle;
                i3 |= startRestartGroup.changed(bannerStyle2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    str2 = str;
                    i3 |= startRestartGroup.changed(str2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        function22 = function2;
                        i3 |= startRestartGroup.changedInstance(function22) ? 16384 : 8192;
                        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                            startRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            str3 = str2;
                            function23 = function22;
                        } else {
                            androidx.compose.ui.Modifier.Companion companion = i7 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                            com.paypal.pds.components.BannerStyle bannerStyle3 = i4 != 0 ? com.paypal.pds.components.BannerStyle.Info.INSTANCE : bannerStyle2;
                            java.lang.String str4 = i5 != 0 ? null : str2;
                            if (i6 != 0) {
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypPageAlertKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypPageAlertKt.$r8$lambda$dRXIRKdaYTe5Lseu1fP1AzO2Gu0((java.lang.String) obj, (java.lang.String) obj2);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                function24 = (kotlin.jvm.functions.Function2) rememberedValue;
                            } else {
                                function24 = function22;
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-826992589, i3, -1, "com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.PageAlert (RypPageAlert.kt:38)");
                            }
                            androidx.compose.ui.Modifier wrapContentSize$default = androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(companion, com.paypal.pds.core.ConstantsKt.getSize16(), com.paypal.pds.core.ConstantsKt.getSize8()), 0.0f, 1, null), null, false, 3, null);
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
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
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            android.content.res.Resources resources = (android.content.res.Resources) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalResources());
                            int i8 = com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypPageAlertKt.WhenMappings.$EnumSwitchMapping$0[pageAlertType.ordinal()];
                            if (i8 == 1) {
                                java.lang.String string = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_consent_page_alert_add_card);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                                java.lang.String string2 = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_consent_page_alert_add_card_link);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(string);
                                sb.append(" ");
                                sb.append(string2);
                                richText = com.paypal.pds.core.RichTextKt.toRichText(sb.toString(), kotlin.collections.CollectionsKt.listOf(kotlin.TuplesKt.to(string2, com.paypal.oslo.feature.inappcheckout.Constants.ADD_CARD_LINK_ID)));
                            } else if (i8 == 2) {
                                java.lang.String string3 = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_consent_page_alert_update_card);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                                richText = com.paypal.pds.core.RichTextKt.toRichText(string3, kotlin.collections.CollectionsKt.emptyList());
                            } else if (i8 == 3) {
                                java.lang.String string4 = resources.getString(com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_consent_page_alert_select_or_add_payment_method);
                                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string4, "");
                                richText = com.paypal.pds.core.RichTextKt.toRichText(string4, kotlin.collections.CollectionsKt.emptyList());
                            } else {
                                if (i8 != 4) {
                                    throw new kotlin.NoWhenBranchMatchedException();
                                }
                                richText = com.paypal.pds.core.RichTextKt.toRichText(str4 != null ? str4 : "", kotlin.collections.CollectionsKt.emptyList());
                            }
                            com.paypal.pds.components.BannerKt.Banner((androidx.compose.ui.Modifier) null, bannerStyle3, richText, (com.paypal.pds.core.RichText) null, (com.paypal.pds.components.BannerTrailingElement) null, function24, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, ((i3 >> 3) & 112) | ((i3 << 3) & 458752), 89);
                            startRestartGroup.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            modifier3 = companion;
                            bannerStyle2 = bannerStyle3;
                            str3 = str4;
                            function23 = function24;
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final com.paypal.pds.components.BannerStyle bannerStyle4 = bannerStyle2;
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypPageAlertKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypPageAlertKt.$r8$lambda$QLi_WzQ771I5uSqfOwalWQr__j4(com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType.this, modifier3, bannerStyle4, str3, function23, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function22 = function2;
                    if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                str2 = str;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                function22 = function2;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            bannerStyle2 = bannerStyle;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            str2 = str;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            function22 = function2;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        bannerStyle2 = bannerStyle;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        str2 = str;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        function22 = function2;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QLi_WzQ771I5uSqfOwalWQr__j4(com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType pageAlertType, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.BannerStyle bannerStyle, java.lang.String str, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PageAlert(pageAlertType, modifier, bannerStyle, str, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dRXIRKdaYTe5Lseu1fP1AzO2Gu0(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType.values().length];
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType.ADD_CARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType.UPDATE_CARD.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType.FI_NOT_SELECTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType.CARD_SAVE_ERROR.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
