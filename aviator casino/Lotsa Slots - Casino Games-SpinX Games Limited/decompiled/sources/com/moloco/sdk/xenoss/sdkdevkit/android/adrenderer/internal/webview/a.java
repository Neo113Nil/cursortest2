package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a$a, reason: collision with other inner class name */
    public static final class C0318a implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.Unit f7957a;

        public C0318a(kotlin.Unit unit) {
            this.f7957a = unit;
        }

        public final void a(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1018657295, i, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebView.<anonymous>.<anonymous> (AdWebView.kt:40)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            a(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }
    }

    public static final class b implements androidx.compose.runtime.DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.webkit.WebView f7958a;

        public b(android.webkit.WebView webView) {
            this.f7958a = webView;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            android.view.ViewParent parent = this.f7958a.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f7958a);
            }
        }
    }

    public static final kotlin.Unit a(android.webkit.WebView webView, androidx.compose.ui.Modifier modifier, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        a(webView, modifier, yVar, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final void a(final android.webkit.WebView webView, androidx.compose.ui.Modifier modifier, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webView, "webView");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1111633024);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(webView) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? startRestartGroup.changed(yVar) : startRestartGroup.changedInstance(yVar) ? 256 : 128;
        }
        int i5 = i3;
        if ((i5 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1111633024, i5, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebView (AdWebView.kt:13)");
            }
            startRestartGroup.startReplaceableGroup(1539490980);
            startRestartGroup.startReplaceableGroup(1539458953);
            boolean changedInstance = startRestartGroup.changedInstance(webView);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, (android.content.Context) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView((kotlin.jvm.functions.Function1) rememberedValue, modifier, null, startRestartGroup, i5 & 112, 4);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            startRestartGroup.startReplaceableGroup(1539491745);
            if (yVar != null) {
                yVar.a(androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1018657295, true, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.C0318a(unit)), startRestartGroup, ((i5 >> 3) & 112) | 6);
            }
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(1539498319);
            boolean changedInstance2 = startRestartGroup.changedInstance(webView);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, (androidx.compose.runtime.DisposableEffectScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.EffectsKt.DisposableEffect(webView, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue2, startRestartGroup, i5 & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.a(webView, modifier2, yVar, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final android.widget.FrameLayout a(android.webkit.WebView webView, android.content.Context it) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(it);
        webView.setBackgroundColor(0);
        webView.setVisibility(0);
        frameLayout.addView(webView, new android.view.ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static final androidx.compose.runtime.DisposableEffectResult a(android.webkit.WebView webView, androidx.compose.runtime.DisposableEffectScope DisposableEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a.b(webView);
    }
}
