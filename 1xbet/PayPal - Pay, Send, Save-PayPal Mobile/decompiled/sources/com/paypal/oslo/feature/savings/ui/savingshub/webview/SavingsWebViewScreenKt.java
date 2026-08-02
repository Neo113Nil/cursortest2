package com.paypal.oslo.feature.savings.ui.savingshub.webview;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a?\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"SavingsWebViewSource", "", "openPdfInExternalViewer", "", "context", "Landroid/content/Context;", "url", "SavingsWebViewScreen", "title", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "requiresAuth", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "createSavingsWebViewConfiguration", "Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", "pdfDelegate", "Lcom/paypal/oslo/core/webview/ui/client/SecureWebViewClientDelegate;", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsWebViewScreenKt {
    public static final java.lang.String SavingsWebViewSource = "savings-documents";

    public static final void openPdfInExternalViewer(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setDataAndType(android.net.Uri.parse(str), "application/pdf");
        intent.setFlags(268435456);
        android.content.Intent createChooser = android.content.Intent.createChooser(intent, "Open PDF");
        createChooser.setFlags(268435456);
        context.startActivity(createChooser);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SavingsWebViewScreen(final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        final boolean z3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-686626074);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 16384 : 8192;
                if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    z3 = z2;
                } else {
                    androidx.compose.ui.Modifier modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if (i4 != 0) {
                        z2 = true;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-686626074, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.webview.SavingsWebViewScreen (SavingsWebViewScreen.kt:81)");
                    }
                    final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    int i6 = i3 & 14;
                    boolean z4 = i6 == 4;
                    boolean changedInstance = startRestartGroup.changedInstance(context);
                    int i7 = i3 & 896;
                    boolean z5 = i7 == 256;
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if ((z4 | changedInstance | z5) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.savings.ui.savingshub.webview.SavingsWebViewScreenKt$SavingsWebViewScreen$1$1(str, context, function0, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(str, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i6);
                    if (kotlin.text.StringsKt.endsWith(str, ".pdf", true)) {
                        startRestartGroup.startReplaceGroup(1653670716);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1652649173);
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.webview.SavingsWebViewScreenKt$SavingsWebViewScreen$pdfDelegate$1$1
                                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                                public final /* bridge */ void onPageFinished(java.lang.String str3) {
                                    super.onPageFinished(str3);
                                }

                                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                                public final /* bridge */ void onPageStarted(java.lang.String str3, android.graphics.Bitmap bitmap) {
                                    super.onPageStarted(str3, bitmap);
                                }

                                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                                public final /* bridge */ void onReceivedError(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
                                    super.onReceivedError(webResourceRequest, webResourceError);
                                }

                                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                                public final /* bridge */ void onReceivedHttpError(android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceResponse webResourceResponse) {
                                    super.onReceivedHttpError(webResourceRequest, webResourceResponse);
                                }

                                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                                public final /* bridge */ boolean shouldOverrideUrlLoading(android.webkit.WebResourceRequest webResourceRequest) {
                                    return super.shouldOverrideUrlLoading(webResourceRequest);
                                }

                                @Override // com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate
                                public final boolean onPdfDetected(java.lang.String url) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
                                    com.paypal.oslo.feature.savings.ui.savingshub.webview.SavingsWebViewScreenKt.openPdfInExternalViewer(context, url);
                                    return true;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        com.paypal.oslo.feature.savings.ui.savingshub.webview.SavingsWebViewScreenKt$SavingsWebViewScreen$pdfDelegate$1$1 savingsWebViewScreenKt$SavingsWebViewScreen$pdfDelegate$1$1 = (com.paypal.oslo.feature.savings.ui.savingshub.webview.SavingsWebViewScreenKt$SavingsWebViewScreen$pdfDelegate$1$1) rememberedValue2;
                        boolean z6 = i6 == 4;
                        boolean z7 = (i3 & 112) == 32;
                        boolean z8 = (57344 & i3) == 16384;
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if ((z6 | z7 | z8) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = createSavingsWebViewConfiguration(str, str2, z2, savingsWebViewScreenKt$SavingsWebViewScreen$pdfDelegate$1$1);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration secureWebViewConfiguration = (com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration) rememberedValue3;
                        boolean z9 = i7 == 256;
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (z9 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            startRestartGroup.updateRememberedValue(function0);
                            rememberedValue4 = function0;
                        }
                        com.paypal.oslo.core.webview.ui.compose.SecureWebViewKt.SecureWebView(secureWebViewConfiguration, (kotlin.jvm.functions.Function0) rememberedValue4, modifier3, null, startRestartGroup, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration.$stable | ((i3 >> 3) & 896), 8);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    z3 = z2;
                    modifier2 = modifier3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier2;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.webview.SavingsWebViewScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.webview.SavingsWebViewScreenKt.$r8$lambda$SfGae9wN0wd79GeY56L7QSfQoC8(str, str2, function0, modifier4, z3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if (!startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration createSavingsWebViewConfiguration(java.lang.String str, java.lang.String str2, boolean z, com.paypal.oslo.core.webview.ui.client.SecureWebViewClientDelegate secureWebViewClientDelegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureWebViewClientDelegate, "");
        return new com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration(null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewURLRequest(str, SavingsWebViewSource, z, true, null, 16, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewUiConfig(str2, null, false, false, false, 30, null), new com.paypal.oslo.core.webview.ui.config.SecureWebViewSettings(null, true, 1, null), null, new com.paypal.oslo.core.webview.ui.config.SecureWebViewClientConfiguration(secureWebViewClientDelegate, null, 2, null), 37, null);
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SfGae9wN0wd79GeY56L7QSfQoC8(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SavingsWebViewScreen(str, str2, function0, modifier, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
