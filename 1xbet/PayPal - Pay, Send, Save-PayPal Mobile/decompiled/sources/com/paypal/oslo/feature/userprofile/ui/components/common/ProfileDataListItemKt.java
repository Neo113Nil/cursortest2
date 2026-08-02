package com.paypal.oslo.feature.userprofile.ui.components.common;

@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\u00132\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u00132\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002\u001a3\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0002\u0010\u001b\u001a\u0019\u0010\u001c\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0003¢\u0006\u0002\u0010\u001d\u001a\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0003¢\u0006\u0002\u0010!\u001a\u0017\u0010\"\u001a\u00020\u00012\b\u0010#\u001a\u0004\u0018\u00010$H\u0003¢\u0006\u0002\u0010%¨\u0006&"}, d2 = {"ProfileDataListItem", "", "profileData", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "onClick", "Lkotlin/Function0;", "testTagPrefix", "", "modifier", "Landroidx/compose/ui/Modifier;", "analyticsItemName", "analyticsContext", "", "Lcom/paypal/oslo/core/telemetry/analytics/context/AnalyticsContext;", "(Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V", "ProfileDataDetails", "Landroidx/compose/foundation/layout/RowScope;", "(Landroidx/compose/foundation/layout/RowScope;Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "shouldShowStatusBadge", "", "shouldShowUnconfirmedBadge", "ProfileStatusBadge", "isPrimary", "isConfirmed", "showUnconfirmedBadge", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/pds/components/BadgeSize;", "(ZZZLcom/paypal/pds/components/BadgeSize;Landroidx/compose/runtime/Composer;II)V", "ProfileDescription", "(Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;Landroidx/compose/runtime/Composer;I)V", "getPhoneTypeLabel", "phoneType", "Lcom/paypal/oslo/core/userstore/model/PhoneType;", "(Lcom/paypal/oslo/core/userstore/model/PhoneType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "ProfileLinkedCards", "cardCount", "", "(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)V", "user-profile_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProfileDataListItemKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfileDataListItem(final com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<?> profileDataItem, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final java.lang.String str, androidx.compose.ui.Modifier modifier, java.lang.String str2, java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str3;
        int i5;
        java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list2;
        final java.lang.String str4;
        final java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileDataItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1787568811);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(profileDataItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str3 = str2;
                i3 |= startRestartGroup.changed(str3) ? 16384 : 8192;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((196608 & i) == 0) {
                    list2 = list;
                    i3 |= startRestartGroup.changedInstance(list2) ? 131072 : 65536;
                    if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        str4 = str3;
                        list3 = list2;
                    } else {
                        androidx.compose.ui.Modifier modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            str3 = null;
                        }
                        if (i5 != 0) {
                            list2 = null;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1787568811, i3, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItem (ProfileDataListItem.kt:72)");
                        }
                        androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-824842939, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt.$r8$lambda$gXDb4MeucrftNcbwV24ekj5x9uY(com.paypal.oslo.feature.userprofile.domain.ProfileDataItem.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54);
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = com.paypal.pds.components.SelectionCardModel.INSTANCE.create(profileDataItem.getId(), (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) ((r18 & 8) != 0 ? null : rememberComposableLambda), (r18 & 16) != 0 ? false : false, (r18 & 32) == 0 ? null : null, (r18 & 64) != 0 ? com.paypal.pds.components.IconSize.Small.INSTANCE : null, (r18 & 128) != 0 ? com.paypal.pds.core.Color.Unspecified.INSTANCE : null, (r18 & 256) != 0 ? com.paypal.pds.core.AnalyticsScope.INSTANCE.getEmpty() : null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        com.paypal.pds.components.SelectionCardModel selectionCardModel = (com.paypal.pds.components.SelectionCardModel) rememberedValue;
                        androidx.compose.ui.Modifier m1707paddingVpY3zN4 = androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing4());
                        if (str3 != null) {
                            m1707paddingVpY3zN4 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(m1707paddingVpY3zN4, new com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item(str3, 0, 2, null));
                        }
                        if (list2 != null) {
                            m1707paddingVpY3zN4 = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(m1707paddingVpY3zN4, list2);
                        }
                        java.lang.String id = profileDataItem.getId();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(str);
                        sb.append("_list_item_");
                        sb.append(id);
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(m1707paddingVpY3zN4, sb.toString());
                        com.paypal.pds.components.SelectionCardConfig.Vertical vertical = new com.paypal.pds.components.SelectionCardConfig.Vertical(false, 1, null);
                        java.util.List listOf = kotlin.collections.CollectionsKt.listOf(selectionCardModel);
                        boolean z = (i3 & 112) == 32;
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt.$r8$lambda$8OhRTffULHExVgbiPvda4qDe5Jo(kotlin.jvm.functions.Function0.this, (com.paypal.pds.components.SelectionCardModel) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        java.lang.String str5 = str3;
                        java.util.List<? extends com.paypal.oslo.core.telemetry.analytics.context.AnalyticsContext> list4 = list2;
                        androidx.compose.ui.Modifier modifier4 = modifier3;
                        com.paypal.pds.components.SelectionCardKt.SelectionCard(vertical, listOf, (kotlin.jvm.functions.Function2) rememberedValue2, testTag, null, false, null, startRestartGroup, com.paypal.pds.components.SelectionCardConfig.Vertical.$stable | 48, 112);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier4;
                        list3 = list4;
                        str4 = str5;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier5 = modifier2;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt.$r8$lambda$uUCzAN9J24hzAzuYIZ3EPsVtkfY(com.paypal.oslo.feature.userprofile.domain.ProfileDataItem.this, function0, str, modifier5, str4, list3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                list2 = list;
                if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str3 = str2;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            list2 = list;
            if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str3 = str2;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        list2 = list;
        if (startRestartGroup.shouldExecute((74899 & i3) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.foundation.layout.RowScope rowScope, final com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<?> profileDataItem, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1830022670);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(rowScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(profileDataItem) ? 32 : 16;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1830022670, i4, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataDetails (ProfileDataListItem.kt:119)");
                }
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScope, modifier3, 1.0f, false, 2, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                if (!kotlin.jvm.internal.Intrinsics.areEqual(profileDataItem.getIcon(), com.paypal.pds.core.Icon.NoIcon.INSTANCE)) {
                    startRestartGroup.startReplaceGroup(-2019421675);
                    com.paypal.pds.components.IconKt.Icon(profileDataItem.getIcon(), profileDataItem.getDisplayValue(), null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27648, 4);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-2019145868);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                if (getHighResolutionOutputSizeshNQ4ISI(profileDataItem)) {
                    startRestartGroup.startReplaceGroup(574883904);
                    ProfileStatusBadge(profileDataItem.isPrimary(), profileDataItem.isConfirmed(), Camera2StreamConfigurationMap(profileDataItem), null, startRestartGroup, 0, 8);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(575139530);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(profileDataItem.getDisplayValue(), null, null, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.LabelMedium.INSTANCE, startRestartGroup, 0, 6, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                getHighSpeedVideoFpsRangesFor(profileDataItem, startRestartGroup, (i4 >> 3) & 14);
                getHighSpeedVideoFpsRangesFor(profileDataItem.getLinkedCards(), startRestartGroup, 0);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt.m20464$r8$lambda$oIeqW6sErnWg2VqdWdWpAGx68U(androidx.compose.foundation.layout.RowScope.this, profileDataItem, modifier4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<?> profileDataItem) {
        java.lang.Object data = profileDataItem.getData();
        if (data instanceof com.paypal.oslo.core.userstore.model.ProfileAddress) {
            return false;
        }
        if (!(data instanceof com.paypal.oslo.core.userstore.model.ProfilePhone)) {
            return true;
        }
        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) data;
        if (profilePhone.getType() == com.paypal.oslo.core.userstore.model.PhoneType.WORK || profilePhone.getType() == com.paypal.oslo.core.userstore.model.PhoneType.HOME) {
            return profileDataItem.isPrimary();
        }
        return true;
    }

    private static final boolean Camera2StreamConfigurationMap(com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<?> profileDataItem) {
        java.lang.Object data = profileDataItem.getData();
        if (!(data instanceof com.paypal.oslo.core.userstore.model.ProfilePhone)) {
            return true;
        }
        com.paypal.oslo.core.userstore.model.ProfilePhone profilePhone = (com.paypal.oslo.core.userstore.model.ProfilePhone) data;
        return (profilePhone.getType() == com.paypal.oslo.core.userstore.model.PhoneType.WORK || profilePhone.getType() == com.paypal.oslo.core.userstore.model.PhoneType.HOME) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfileStatusBadge(final boolean z, final boolean z2, boolean z3, com.paypal.pds.components.BadgeSize badgeSize, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        com.paypal.pds.components.BadgeSize badgeSize2;
        boolean z5;
        final com.paypal.pds.components.BadgeSize badgeSize3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-498714936);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z4 = z3;
            i3 |= startRestartGroup.changed(z4) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                badgeSize2 = badgeSize;
                i3 |= startRestartGroup.changed(badgeSize2) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    z5 = z4;
                    badgeSize3 = badgeSize2;
                } else {
                    z5 = i6 != 0 ? true : z4;
                    com.paypal.pds.components.BadgeSize badgeSize4 = i4 != 0 ? null : badgeSize2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-498714936, i3, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.ProfileStatusBadge (ProfileDataListItem.kt:197)");
                    }
                    boolean z6 = z5 && !z2;
                    if (z || z6) {
                        startRestartGroup.startReplaceGroup(-924508617);
                        androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 7, null);
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
                        int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
                        if (z) {
                            startRestartGroup.startReplaceGroup(-554759098);
                            i5 = 0;
                            com.paypal.pds.components.BadgeKt.Badge(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_primary_badge, startRestartGroup, 0), null, com.paypal.pds.components.BadgeStyle.Neutral.INSTANCE, null, badgeSize4 == null ? com.paypal.pds.components.BadgeSize.Small.INSTANCE : badgeSize4, null, null, startRestartGroup, 384, 106);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            i5 = 0;
                            startRestartGroup.startReplaceGroup(-554525575);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (z && z6) {
                            startRestartGroup.startReplaceGroup(-554476626);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, i5);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-554404551);
                            startRestartGroup.endReplaceGroup();
                        }
                        if (z6) {
                            startRestartGroup.startReplaceGroup(-554363166);
                            com.paypal.pds.components.BadgeKt.Badge(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_unconfirmed_badge, startRestartGroup, i5), null, com.paypal.pds.components.BadgeStyle.Warning.INSTANCE, null, badgeSize4 == null ? com.paypal.pds.components.BadgeSize.Small.INSTANCE : badgeSize4, null, null, startRestartGroup, 384, 106);
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(-554125799);
                            startRestartGroup.endReplaceGroup();
                        }
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-923706182);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    badgeSize3 = badgeSize4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final boolean z7 = z5;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt.$r8$lambda$xhRBbSKmbINu8FR3OeIL0WKzzsc(z, z2, z7, badgeSize3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            badgeSize2 = badgeSize;
            if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z4 = z3;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        badgeSize2 = badgeSize;
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<?> profileDataItem, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String description;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-888024575);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(profileDataItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-888024575, i2, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDescription (ProfileDataListItem.kt:229)");
            }
            java.lang.Object data = profileDataItem.getData();
            if (data instanceof com.paypal.oslo.core.userstore.model.ProfilePhone) {
                startRestartGroup.startReplaceGroup(1306879965);
                description = getHighSpeedVideoFpsRanges(((com.paypal.oslo.core.userstore.model.ProfilePhone) data).getType(), startRestartGroup);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1306881772);
                startRestartGroup.endReplaceGroup();
                description = profileDataItem.getDescription();
            }
            java.lang.String str = description;
            if (str == null) {
                startRestartGroup.startReplaceGroup(1858669321);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(1858669322);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 0);
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(str, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, null, startRestartGroup, 384, 0, 2042);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt.$r8$lambda$rCwUZ_WzRCf5lSIOCalzkWRDGN0(com.paypal.oslo.feature.userprofile.domain.ProfileDataItem.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final java.lang.String getHighSpeedVideoFpsRanges(com.paypal.oslo.core.userstore.model.PhoneType phoneType, androidx.compose.runtime.Composer composer) {
        java.lang.String stringResource;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1449315031, 0, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.getPhoneTypeLabel (ProfileDataListItem.kt:248)");
        }
        int i = com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt.WhenMappings.$EnumSwitchMapping$0[phoneType.ordinal()];
        if (i == 1) {
            composer.startReplaceGroup(-1222337245);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_phone_mobile, composer, 0);
            composer.endReplaceGroup();
        } else if (i == 2) {
            composer.startReplaceGroup(-1222334527);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_phone_work, composer, 0);
            composer.endReplaceGroup();
        } else if (i == 3) {
            composer.startReplaceGroup(-1222331871);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_phone_home, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1222328692);
            composer.endReplaceGroup();
            stringResource = phoneType.name().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringResource, "");
            if (stringResource.length() > 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                java.lang.String valueOf = java.lang.String.valueOf(stringResource.charAt(0));
                kotlin.jvm.internal.Intrinsics.checkNotNull(valueOf, "");
                java.lang.String upperCase = valueOf.toUpperCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
                sb.append((java.lang.Object) upperCase);
                java.lang.String substring = stringResource.substring(1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
                sb.append(substring);
                stringResource = sb.toString();
            }
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    private static final void getHighSpeedVideoFpsRangesFor(final java.lang.Integer num, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String obj;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1658317912);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(num) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1658317912, i2, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.ProfileLinkedCards (ProfileDataListItem.kt:261)");
            }
            java.lang.Integer num2 = null;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            if (num2 != null) {
                startRestartGroup.startReplaceGroup(-2059804678);
                int intValue = num2.intValue();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 0);
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.INSTANCE.getCenterVertically();
                androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                if (intValue == 1) {
                    obj = "1 linked card";
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(intValue);
                    sb.append(" linked cards");
                    obj = sb.toString();
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(obj, null, com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, null, startRestartGroup, 384, 0, 2042);
                composer2.endNode();
                composer2.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-2059804679);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItemKt.$r8$lambda$EralYlFOHfTl_iEliWtMLxNtBKE(num, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8OhRTffULHExVgbiPvda4qDe5Jo(kotlin.jvm.functions.Function0 function0, com.paypal.pds.components.SelectionCardModel selectionCardModel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectionCardModel, "");
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EralYlFOHfTl_iEliWtMLxNtBKE(java.lang.Integer num, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor(num, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gXDb4MeucrftNcbwV24ekj5x9uY(com.paypal.oslo.feature.userprofile.domain.ProfileDataItem profileDataItem, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-824842939, i, -1, "com.paypal.oslo.feature.userprofile.ui.components.common.ProfileDataListItem.<anonymous> (ProfileDataListItem.kt:75)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing4());
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1706padding3ABfNKs);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, profileDataItem, null, composer, 6, 2);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oIeq-W6sErnWg2VqdWdWpAGx68U, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20464$r8$lambda$oIeqW6sErnWg2VqdWdWpAGx68U(androidx.compose.foundation.layout.RowScope rowScope, com.paypal.oslo.feature.userprofile.domain.ProfileDataItem profileDataItem, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(rowScope, profileDataItem, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rCwUZ_WzRCf5lSIOCalzkWRDGN0(com.paypal.oslo.feature.userprofile.domain.ProfileDataItem profileDataItem, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRangesFor((com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<?>) profileDataItem, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$uUCzAN9J24hzAzuYIZ3EPsVtkfY(com.paypal.oslo.feature.userprofile.domain.ProfileDataItem profileDataItem, kotlin.jvm.functions.Function0 function0, java.lang.String str, androidx.compose.ui.Modifier modifier, java.lang.String str2, java.util.List list, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProfileDataListItem(profileDataItem, function0, str, modifier, str2, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xhRBbSKmbINu8FR3OeIL0WKzzsc(boolean z, boolean z2, boolean z3, com.paypal.pds.components.BadgeSize badgeSize, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ProfileStatusBadge(z, z2, z3, badgeSize, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.userstore.model.PhoneType.values().length];
            try {
                iArr[com.paypal.oslo.core.userstore.model.PhoneType.MOBILE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.userstore.model.PhoneType.WORK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.userstore.model.PhoneType.HOME.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
