package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"PackageDetailStatusTimeline", "", "progressInfo", "Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDetailsProgressInfo;", "shippingDestination", "", "shippingDestinationStringResId", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString;", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/display/PackageDetailsProgressInfo;Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/domain/UiString;Landroidx/compose/runtime/Composer;II)V", "PackageDetailDeliveryLabel", "location", "Lcom/paypal/oslo/feature/packagetracking/domain/UiString$StringResource;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/packagetracking/domain/UiString$StringResource;Landroidx/compose/runtime/Composer;I)V", "PackageDetailStatusTimelinePreview", "(Landroidx/compose/runtime/Composer;I)V", "package-tracking_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PackageDetailStatusTimelineKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PackageDetailStatusTimeline(final com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo packageDetailsProgressInfo, java.lang.String str, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str2;
        int i4;
        com.paypal.oslo.feature.packagetracking.domain.UiString uiString2;
        final com.paypal.oslo.feature.packagetracking.domain.UiString uiString3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageDetailsProgressInfo, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1599565346);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(packageDetailsProgressInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            str2 = str;
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                uiString2 = uiString;
                i3 |= startRestartGroup.changed(uiString2) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    uiString3 = uiString2;
                } else {
                    java.lang.String str3 = i5 != 0 ? null : str2;
                    com.paypal.oslo.feature.packagetracking.domain.UiString uiString4 = i4 != 0 ? null : uiString2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1599565346, i3, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailStatusTimeline (PackageDetailStatusTimeline.kt:53)");
                    }
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                    com.paypal.oslo.feature.packagetracking.domain.UiString uiString5 = uiString4;
                    java.lang.String str4 = str3;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(com.paypal.oslo.feature.packagetracking.domain.UiStringKt.resolve(packageDetailsProgressInfo.getStatusLabel(), startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                    com.paypal.pds.components.ProgressBarKt.ProgressBar(100.0f, packageDetailsProgressInfo.getProgress(), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), packageDetailsProgressInfo.getProgressBarStyle(), 0, 0, 0L, null, startRestartGroup, 6, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    if (uiString5 instanceof com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource) {
                        stringResource = (com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource) uiString5;
                        str2 = str4;
                    } else {
                        str2 = str4;
                        stringResource = null;
                    }
                    if (str2 != null && stringResource != null) {
                        startRestartGroup.startReplaceGroup(836562228);
                        androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenterStart(), false);
                        int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        PackageDetailDeliveryLabel(str2, stringResource, startRestartGroup, (i3 >> 3) & 14);
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(836894734);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    uiString3 = uiString5;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final java.lang.String str5 = str2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailStatusTimelineKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailStatusTimelineKt.$r8$lambda$8pnXIiBKYmPyx5_qqQCFucaeT_g(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo.this, str5, uiString3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            uiString2 = uiString;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        str2 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        uiString2 = uiString;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void PackageDetailDeliveryLabel(final java.lang.String str, final com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource stringResource, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringResource, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1167270156);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(stringResource) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1167270156, i2, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailDeliveryLabel (PackageDetailStatusTimeline.kt:92)");
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(stringResource.getResId(), new java.lang.Object[]{str}, startRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailStatusTimelineKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailStatusTimelineKt.$r8$lambda$8gBlnW3IMw1ugAqlTC_kd_ixQkg(str, stringResource, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0Pcmes9TvvWHlqW0FLJHSAVCixg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1589570663);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1589570663, updateChangedFlags, -1, "com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailStatusTimelinePreview (PackageDetailStatusTimeline.kt:111)");
            }
            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background((androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.INSTANCE, (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            PackageDetailStatusTimeline(new com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo(33.0f, com.paypal.pds.components.ProgressBarStyle.Positive.INSTANCE, com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_status_in_progress)), null, null, startRestartGroup, 0, 6);
            PackageDetailDeliveryLabel("Los Angeles, CA", com.paypal.oslo.feature.packagetracking.domain.UiString.INSTANCE.invoke(com.paypal.oslo.feature.packagetracking.R.string.feature_package_tracking_package_detail_delivery_destination), startRestartGroup, 6);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailStatusTimelineKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailStatusTimelineKt.$r8$lambda$0Pcmes9TvvWHlqW0FLJHSAVCixg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8gBlnW3IMw1ugAqlTC_kd_ixQkg(java.lang.String str, com.paypal.oslo.feature.packagetracking.domain.UiString.StringResource stringResource, int i, androidx.compose.runtime.Composer composer, int i2) {
        PackageDetailDeliveryLabel(str, stringResource, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8pnXIiBKYmPyx5_qqQCFucaeT_g(com.paypal.oslo.feature.packagetracking.domain.model.display.PackageDetailsProgressInfo packageDetailsProgressInfo, java.lang.String str, com.paypal.oslo.feature.packagetracking.domain.UiString uiString, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PackageDetailStatusTimeline(packageDetailsProgressInfo, str, uiString, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
