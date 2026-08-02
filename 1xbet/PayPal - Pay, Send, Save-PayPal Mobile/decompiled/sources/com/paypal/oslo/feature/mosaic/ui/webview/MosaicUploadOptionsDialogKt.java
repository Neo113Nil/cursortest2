package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001a-\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\rH\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"MosaicUploadOptionsDialog", "", "onPhotoLibraryClick", "Lkotlin/Function0;", "onTakePhotoClick", "onUploadFileClick", "onDismiss", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "UploadOptionButton", "text", "", "onClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "mosaic_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicUploadOptionsDialogKt {
    public static final void MosaicUploadOptionsDialog(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function04, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-911039732);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-911039732, i2, -1, "com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialog (MosaicUploadOptionsDialog.kt:36)");
            }
            androidx.compose.ui.window.AndroidDialog_androidKt.Dialog(function04, new androidx.compose.ui.window.DialogProperties(true, true, false, 4, (kotlin.jvm.internal.DefaultConstructorMarker) null), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(59246549, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialogKt.$r8$lambda$yqlWveyoU0S7WQ1y54NuynGnKx4(kotlin.jvm.functions.Function0.this, function02, function03, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, ((i2 >> 9) & 14) | 432, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialogKt.$r8$lambda$Jv7khOQDjaJB9a7FDUfLezaieec(kotlin.jvm.functions.Function0.this, function02, function03, function04, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoSizes(final java.lang.String str, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-346251175);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-346251175, i3, -1, "com.paypal.oslo.feature.mosaic.ui.webview.UploadOptionButton (MosaicUploadOptionsDialog.kt:86)");
                }
                int i5 = ((i3 >> 3) & 14) | 1769472 | ((i3 << 3) & 112);
                modifier3 = modifier4;
                com.paypal.pds.components.ButtonKt.Button(function0, str, androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(16.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(12.0f)), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, false, false, startRestartGroup, i5, 408);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialogKt.$r8$lambda$8dOWTNqDTPpO2r6muICZWzPO354(str, function0, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$5p2ypm4sli1ggVc-G9XLES_ZYKs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15813$r8$lambda$5p2ypm4sli1ggVcG9XLES_ZYKs(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1369053009, i, -1, "com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialog.<anonymous>.<anonymous> (MosaicUploadOptionsDialog.kt:50)");
            }
            androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            getHighSpeedVideoSizes(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_use_an_existing_photo, composer, 0), function0, null, composer, 0, 4);
            getHighSpeedVideoSizes(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_take_new_photo, composer, 0), function02, null, composer, 0, 4);
            getHighSpeedVideoSizes(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.mosaic.R.string.feature_mosaic_upload_a_file, composer, 0), function03, null, composer, 0, 4);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8dOWTNqDTPpO2r6muICZWzPO354(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(str, function0, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Jv7khOQDjaJB9a7FDUfLezaieec(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, int i, androidx.compose.runtime.Composer composer, int i2) {
        MosaicUploadOptionsDialog(function0, function02, function03, function04, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yqlWveyoU0S7WQ1y54NuynGnKx4(final kotlin.jvm.functions.Function0 function0, final kotlin.jvm.functions.Function0 function02, final kotlin.jvm.functions.Function0 function03, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(59246549, i, -1, "com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialog.<anonymous> (MosaicUploadOptionsDialog.kt:44)");
            }
            com.paypal.pds.components.CardKt.Card(androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), null, null, com.paypal.pds.components.CardStyle.Outlined.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1369053009, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialogKt.m15813$r8$lambda$5p2ypm4sli1ggVcG9XLES_ZYKs(kotlin.jvm.functions.Function0.this, function02, function03, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 805306374 | (com.paypal.pds.components.CardStyle.Outlined.$stable << 9), 502);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
