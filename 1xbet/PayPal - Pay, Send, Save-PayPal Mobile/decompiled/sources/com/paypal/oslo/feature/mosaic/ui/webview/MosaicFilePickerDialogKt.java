package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "showFilePicker", "Lcom/paypal/oslo/feature/mosaic/ui/webview/FileUploadManager;", "uploadManager", "Lkotlin/Function0;", "", "onDismiss", "MosaicFilePickerDialog", "(ZLcom/paypal/oslo/feature/mosaic/ui/webview/FileUploadManager;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MosaicFilePickerDialogKt {
    public static final void MosaicFilePickerDialog(final boolean z, final com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileUploadManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(426993572);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(fileUploadManager) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(426993572, i2, -1, "com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialog (MosaicFilePickerDialog.kt:33)");
            }
            if (z) {
                startRestartGroup.startReplaceGroup(-1127450505);
                final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                boolean changedInstance = startRestartGroup.changedInstance(fileUploadManager);
                int i3 = i2 & 896;
                boolean z2 = i3 == 256;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt.m15810$r8$lambda$YPHedvAyENnv64BMof0Ok5elE(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager.this, function0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean changedInstance2 = startRestartGroup.changedInstance(context);
                boolean changedInstance3 = startRestartGroup.changedInstance(fileUploadManager);
                boolean z3 = i3 == 256;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance2 | changedInstance3 | z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt.$r8$lambda$EMda6Krd4PXBldJxsEFFEaIxgDY(context, fileUploadManager, function0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue2;
                boolean changedInstance4 = startRestartGroup.changedInstance(fileUploadManager);
                boolean z4 = i3 == 256;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if ((changedInstance4 | z4) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt.$r8$lambda$8SnoVuigLsRS8__IV7y_V637fnM(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager.this, function0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function04 = (kotlin.jvm.functions.Function0) rememberedValue3;
                boolean z5 = i3 == 256;
                boolean changedInstance5 = startRestartGroup.changedInstance(fileUploadManager);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if ((changedInstance5 | z5) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt.m15811$r8$lambda$AP6QAY6iwNjLwEwVTFyaMtJdMo(kotlin.jvm.functions.Function0.this, fileUploadManager);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.feature.mosaic.ui.webview.MosaicUploadOptionsDialogKt.MosaicUploadOptionsDialog(function02, function03, function04, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-1126551970);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt.$r8$lambda$YgSApCPHeKJwngi9Xw8SjNMnX7Q(z, fileUploadManager, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-YPHedvAyENnv64BMof0Ok5-elE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15810$r8$lambda$YPHedvAyENnv64BMof0Ok5elE(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager, kotlin.jvm.functions.Function0 function0) {
        fileUploadManager.pickMultipleVisualMedia();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8SnoVuigLsRS8__IV7y_V637fnM(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager, kotlin.jvm.functions.Function0 function0) {
        fileUploadManager.pickFile();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AP6QAY6iwNjLwEwVTFyaMt-JdMo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15811$r8$lambda$AP6QAY6iwNjLwEwVTFyaMtJdMo(kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager) {
        function0.invoke();
        android.webkit.ValueCallback<android.net.Uri[]> filePathCallback = fileUploadManager.getFilePathCallback();
        if (filePathCallback != null) {
            filePathCallback.onReceiveValue(null);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EMda6Krd4PXBldJxsEFFEaIxgDY(android.content.Context context, final com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager, kotlin.jvm.functions.Function0 function0) {
        if (com.paypal.oslo.feature.mosaic.ui.webview.Utils.INSTANCE.isCameraAvailable$mosaic_prodRelease(context)) {
            fileUploadManager.requestCameraPermission(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.mosaic.ui.webview.MosaicFilePickerDialogKt.m15812$r8$lambda$IAffyNBYTZapJzVEp99Ox9FvRY(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager.this);
                }
            });
        } else {
            android.webkit.ValueCallback<android.net.Uri[]> filePathCallback = fileUploadManager.getFilePathCallback();
            if (filePathCallback != null) {
                filePathCallback.onReceiveValue(null);
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.mosaic.LoggerKt.log, "Mosaic WebView, Camera not available", null, null, 6, null);
        }
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IAffyNBYTZa-pJzVEp99Ox9FvRY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15812$r8$lambda$IAffyNBYTZapJzVEp99Ox9FvRY(com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager) {
        fileUploadManager.takePhoto();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YgSApCPHeKJwngi9Xw8SjNMnX7Q(boolean z, com.paypal.oslo.feature.mosaic.ui.webview.FileUploadManager fileUploadManager, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        MosaicFilePickerDialog(z, fileUploadManager, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
