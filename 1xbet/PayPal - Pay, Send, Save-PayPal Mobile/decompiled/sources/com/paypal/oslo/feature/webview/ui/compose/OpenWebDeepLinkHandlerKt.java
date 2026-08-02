package com.paypal.oslo.feature.webview.ui.compose;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006\"\u0014\u0010\n\u001a\u00020\t8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/webview/api/navigation/OpenWebDeepLinkDestination;", "destination", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "", "OpenWebDeepLinkRouter", "(Lcom/paypal/oslo/feature/webview/api/navigation/OpenWebDeepLinkDestination;Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/runtime/Composer;I)V", "OpenWebExternalHandler", "OpenWebInternalHandler", "", "DefaultSource", "Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OpenWebDeepLinkHandlerKt {
    public static final java.lang.String DefaultSource = "open_web";

    public static final void OpenWebDeepLinkRouter(final com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openWebDeepLinkDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1178832973);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(openWebDeepLinkDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1178832973, i2, -1, "com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkRouter (OpenWebDeepLinkHandler.kt:38)");
            }
            if (openWebDeepLinkDestination.isExternal()) {
                startRestartGroup.startReplaceGroup(1334618391);
                OpenWebExternalHandler(openWebDeepLinkDestination, appNavigator, startRestartGroup, i2 & 126);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1334711639);
                OpenWebInternalHandler(openWebDeepLinkDestination, appNavigator, startRestartGroup, i2 & 126);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt.m21515$r8$lambda$s0g92x4edrpp4vQu1bwvah_iMs(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OpenWebExternalHandler(final com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openWebDeepLinkDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-452122405);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(openWebDeepLinkDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-452122405, i2, -1, "com.paypal.oslo.feature.webview.ui.compose.OpenWebExternalHandler (OpenWebDeepLinkHandler.kt:58)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            boolean z = (i2 & 112) == 32;
            boolean changedInstance = startRestartGroup.changedInstance(openWebDeepLinkDestination);
            boolean changedInstance2 = startRestartGroup.changedInstance(context);
            com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebExternalHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebExternalHandler$1$1(appNavigator, openWebDeepLinkDestination, context, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(openWebDeepLinkDestination, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i2 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt.m21514$r8$lambda$avGEvGwlP2AvMCLBq_ILgVZV5Q(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OpenWebInternalHandler(final com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination, final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openWebDeepLinkDestination, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-777160883);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(openWebDeepLinkDestination) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(appNavigator) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-777160883, i2, -1, "com.paypal.oslo.feature.webview.ui.compose.OpenWebInternalHandler (OpenWebDeepLinkHandler.kt:98)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(openWebDeepLinkDestination);
            boolean z = (i2 & 112) == 32;
            com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebInternalHandler$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$OpenWebInternalHandler$1$1(openWebDeepLinkDestination, appNavigator, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(openWebDeepLinkDestination, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, i2 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.webview.ui.compose.OpenWebDeepLinkHandlerKt.$r8$lambda$fQk4vZ1pJgoaEpg_tjoytCREHb4(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.this, appNavigator, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$avGEvGwlP2AvMCLBq_I-LgVZV5Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21514$r8$lambda$avGEvGwlP2AvMCLBq_ILgVZV5Q(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        OpenWebExternalHandler(openWebDeepLinkDestination, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fQk4vZ1pJgoaEpg_tjoytCREHb4(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        OpenWebInternalHandler(openWebDeepLinkDestination, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$s0g92x4edrpp4vQu1bw-vah_iMs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21515$r8$lambda$s0g92x4edrpp4vQu1bwvah_iMs(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination openWebDeepLinkDestination, com.paypal.oslo.core.navigation.AppNavigator appNavigator, int i, androidx.compose.runtime.Composer composer, int i2) {
        OpenWebDeepLinkRouter(openWebDeepLinkDestination, appNavigator, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
