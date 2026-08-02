package com.paypal.oslo.feature.mosaic.api.widget.docupload;

@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001au\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0016\u001a\u0015\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"DocUploadWidget", "", "config", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetConfig;", "state", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;", "modifier", "Landroidx/compose/ui/Modifier;", "navigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "onDocUploadDocumentTypeSelect", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocumentTypeID;", "onDocUploadSuccess", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadResult$Success;", "onDocUploadFailure", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadResult$Error;", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetConfig;Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/core/navigation/AppNavigator;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberDocUploadWidgetProvider", "Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetProvider;", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetProvider;", "rememberDocUploadWidgetState", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;", "DocUploadWidgetBottomSheet", "(Lcom/paypal/oslo/feature/mosaic/api/widget/docupload/DocUploadWidgetState;Landroidx/compose/runtime/Composer;I)V", "mosaic-api_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DocUploadWidgetKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DocUploadWidget(final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig docUploadWidgetConfig, final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error, kotlin.Unit> function13, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, kotlin.Unit> function14;
        int i6;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success, kotlin.Unit> function15;
        int i7;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error, kotlin.Unit> function16;
        final androidx.compose.ui.Modifier modifier2;
        final com.paypal.oslo.core.navigation.AppNavigator appNavigator2;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, kotlin.Unit> function17;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success, kotlin.Unit> function18;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error, kotlin.Unit> function19;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID, kotlin.Unit> function110;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success, kotlin.Unit> function111;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadWidgetConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadWidgetState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-487326385);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(docUploadWidgetConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(docUploadWidgetState) : startRestartGroup.changedInstance(docUploadWidgetState) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changed(appNavigator) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function14 = function1;
                    i3 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        function15 = function12;
                        i3 |= startRestartGroup.changedInstance(function15) ? 131072 : 65536;
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            function16 = function13;
                            i3 |= startRestartGroup.changedInstance(function16) ? 1048576 : 524288;
                            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                appNavigator2 = appNavigator;
                                function17 = function14;
                                function18 = function15;
                                function19 = function16;
                            } else {
                                androidx.compose.ui.Modifier modifier3 = i8 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                com.paypal.oslo.core.navigation.AppNavigator appNavigator3 = i4 != 0 ? null : appNavigator;
                                if (i5 != 0) {
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt.m15775$r8$lambda$suq6SdPUeOuYAk1CCxhLvQ7qMc((com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function110 = (kotlin.jvm.functions.Function1) rememberedValue;
                                } else {
                                    function110 = function14;
                                }
                                if (i6 != 0) {
                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt.m15774$r8$lambda$AV4wjePIIFUgegmvmnQwCQ_HPM((com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    function111 = (kotlin.jvm.functions.Function1) rememberedValue2;
                                } else {
                                    function111 = function15;
                                }
                                if (i7 != 0) {
                                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt.$r8$lambda$expIcZK9KB21sDEcKD5PGJQW0VY((com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error) obj);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    function16 = (kotlin.jvm.functions.Function1) rememberedValue3;
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-487326385, i3, -1, "com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidget (DocUploadWidget.kt:88)");
                                }
                                rememberDocUploadWidgetProvider(startRestartGroup, 0).getWidget().invoke(docUploadWidgetConfig, docUploadWidgetState, modifier3, appNavigator3, function110, function111, function16, startRestartGroup, java.lang.Integer.valueOf(i3 & 4194302));
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                function19 = function16;
                                modifier2 = modifier3;
                                appNavigator2 = appNavigator3;
                                function17 = function110;
                                function18 = function111;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt.$r8$lambda$faezlzkZMUIp2Q0trr70Xowxf7s(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig.this, docUploadWidgetState, modifier2, appNavigator2, function17, function18, function19, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function16 = function13;
                        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    function15 = function12;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    function16 = function13;
                    if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function14 = function1;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                function15 = function12;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                function16 = function13;
                if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function14 = function1;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function15 = function12;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            function16 = function13;
            if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function14 = function1;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function15 = function12;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        function16 = function13;
        if (startRestartGroup.shouldExecute((i3 & 599187) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetProvider rememberDocUploadWidgetProvider(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1164363420, i, -1, "com.paypal.oslo.feature.mosaic.api.widget.docupload.rememberDocUploadWidgetProvider (DocUploadWidget.kt:102)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetFactory.INSTANCE.getProvider();
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetProvider docUploadWidgetProvider = (com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetProvider) rememberedValue;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return docUploadWidgetProvider;
    }

    public static final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState rememberDocUploadWidgetState(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(595496998, i, -1, "com.paypal.oslo.feature.mosaic.api.widget.docupload.rememberDocUploadWidgetState (DocUploadWidget.kt:115)");
        }
        com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState rememberState = rememberDocUploadWidgetProvider(composer, 0).rememberState(composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberState;
    }

    public static final void DocUploadWidgetBottomSheet(final com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(docUploadWidgetState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(239613560);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(docUploadWidgetState) : startRestartGroup.changedInstance(docUploadWidgetState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(239613560, i2, -1, "com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetBottomSheet (DocUploadWidget.kt:148)");
            }
            rememberDocUploadWidgetProvider(startRestartGroup, 0).BottomSheet(docUploadWidgetState, startRestartGroup, i2 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetKt.$r8$lambda$aDGjnwvggMIk1BoYa2gaVkm3vrk(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$AV4wjePIIFUg-egmvmnQwCQ_HPM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15774$r8$lambda$AV4wjePIIFUgegmvmnQwCQ_HPM(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Success success) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(success, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$aDGjnwvggMIk1BoYa2gaVkm3vrk(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, int i, androidx.compose.runtime.Composer composer, int i2) {
        DocUploadWidgetBottomSheet(docUploadWidgetState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$expIcZK9KB21sDEcKD5PGJQW0VY(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadResult.Error error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$faezlzkZMUIp2Q0trr70Xowxf7s(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetConfig docUploadWidgetConfig, com.paypal.oslo.feature.mosaic.api.widget.docupload.DocUploadWidgetState docUploadWidgetState, androidx.compose.ui.Modifier modifier, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DocUploadWidget(docUploadWidgetConfig, docUploadWidgetState, modifier, appNavigator, function1, function12, function13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$suq6SdPUeOuYAk1CCxhLvQ7q-Mc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15775$r8$lambda$suq6SdPUeOuYAk1CCxhLvQ7qMc(com.paypal.oslo.feature.mosaic.api.widget.docupload.DocumentTypeID documentTypeID) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentTypeID, "");
        return kotlin.Unit.INSTANCE;
    }
}
