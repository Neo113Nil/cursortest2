package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler;
import org.betup.ui.dialogs.offer.bridge.UpdatableOfferWebViewBridgeHandler;
import org.betup.ui.dialogs.offer.webview.OfferWebLoadSpec;
import org.betup.ui.dialogs.offer.webview.OfferWebViewConfig;
import org.betup.ui.dialogs.offer.webview.OfferWebViewFactory;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: ShopWebViewScreen.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"SHOP_HTML_BASE_URL", "", "ShopWebViewScreen", "", "html", "bridgeHandler", "Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeHandler;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeHandler;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopWebViewScreenKt {
    private static final String SHOP_HTML_BASE_URL = "file:///android_asset/";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopWebViewScreen$lambda$13(String str, OfferWebViewBridgeHandler offerWebViewBridgeHandler, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ShopWebViewScreen(str, offerWebViewBridgeHandler, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShopWebViewScreen(final String html, final OfferWebViewBridgeHandler bridgeHandler, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Object rememberedValue;
        boolean changedInstance;
        Object rememberedValue2;
        Object rememberedValue3;
        final OfferWebViewConfig offerWebViewConfig;
        Object rememberedValue4;
        Object rememberedValue5;
        boolean changedInstance2;
        Object rememberedValue6;
        boolean z;
        Object rememberedValue7;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(bridgeHandler, "bridgeHandler");
        Composer startRestartGroup = composer.startRestartGroup(2071134314);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(html) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(bridgeHandler) : startRestartGroup.changedInstance(bridgeHandler) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2071134314, i3, -1, "org.betup.ui.fragment.shop.compose.ShopWebViewScreen (ShopWebViewScreen.kt:28)");
                }
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new UpdatableOfferWebViewBridgeHandler(bridgeHandler);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final UpdatableOfferWebViewBridgeHandler updatableOfferWebViewBridgeHandler = (UpdatableOfferWebViewBridgeHandler) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = ((i3 & 112) != 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(bridgeHandler))) | startRestartGroup.changedInstance(updatableOfferWebViewBridgeHandler);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.shop.compose.ShopWebViewScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit ShopWebViewScreen$lambda$2$lambda$1;
                            ShopWebViewScreen$lambda$2$lambda$1 = ShopWebViewScreenKt.ShopWebViewScreen$lambda$2$lambda$1(UpdatableOfferWebViewBridgeHandler.this, bridgeHandler);
                            return ShopWebViewScreen$lambda$2$lambda$1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                startRestartGroup.endReplaceGroup();
                EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new OfferWebViewConfig(false, false, false, SHOP_HTML_BASE_URL, null, null, true, 55, null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                offerWebViewConfig = (OfferWebViewConfig) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new OfferWebViewFactory(offerWebViewConfig);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final OfferWebViewFactory offerWebViewFactory = (OfferWebViewFactory) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopWebViewScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ShopWebViewScreen$lambda$6$lambda$5;
                            ShopWebViewScreen$lambda$6$lambda$5 = ShopWebViewScreenKt.ShopWebViewScreen$lambda$6$lambda$5((GraphicsLayerScope) obj);
                            return ShopWebViewScreen$lambda$6$lambda$5;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifier3, (Function1) rememberedValue5);
                startRestartGroup.startReplaceGroup(-1746271574);
                int i5 = i3 & 14;
                changedInstance2 = (i5 != 4) | startRestartGroup.changedInstance(updatableOfferWebViewBridgeHandler);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (!changedInstance2 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopWebViewScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            WebView ShopWebViewScreen$lambda$10$lambda$9;
                            ShopWebViewScreen$lambda$10$lambda$9 = ShopWebViewScreenKt.ShopWebViewScreen$lambda$10$lambda$9(OfferWebViewFactory.this, html, updatableOfferWebViewBridgeHandler, (Context) obj);
                            return ShopWebViewScreen$lambda$10$lambda$9;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                Function1 function1 = (Function1) rememberedValue6;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(-1633490746);
                z = i5 == 4;
                rememberedValue7 = startRestartGroup.rememberedValue();
                if (!z || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopWebViewScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ShopWebViewScreen$lambda$12$lambda$11;
                            ShopWebViewScreen$lambda$12$lambda$11 = ShopWebViewScreenKt.ShopWebViewScreen$lambda$12$lambda$11(html, offerWebViewConfig, (WebView) obj);
                            return ShopWebViewScreen$lambda$12$lambda$11;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                startRestartGroup.endReplaceGroup();
                AndroidView_androidKt.AndroidView(function1, graphicsLayer, (Function1) rememberedValue7, startRestartGroup, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopWebViewScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ShopWebViewScreen$lambda$13;
                        ShopWebViewScreen$lambda$13 = ShopWebViewScreenKt.ShopWebViewScreen$lambda$13(html, bridgeHandler, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ShopWebViewScreen$lambda$13;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final UpdatableOfferWebViewBridgeHandler updatableOfferWebViewBridgeHandler2 = (UpdatableOfferWebViewBridgeHandler) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = ((i3 & 112) != 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(bridgeHandler))) | startRestartGroup.changedInstance(updatableOfferWebViewBridgeHandler2);
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.shop.compose.ShopWebViewScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit ShopWebViewScreen$lambda$2$lambda$1;
                ShopWebViewScreen$lambda$2$lambda$1 = ShopWebViewScreenKt.ShopWebViewScreen$lambda$2$lambda$1(UpdatableOfferWebViewBridgeHandler.this, bridgeHandler);
                return ShopWebViewScreen$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
        }
        offerWebViewConfig = (OfferWebViewConfig) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
        }
        final OfferWebViewFactory offerWebViewFactory2 = (OfferWebViewFactory) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier graphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifier3, (Function1) rememberedValue5);
        startRestartGroup.startReplaceGroup(-1746271574);
        int i52 = i3 & 14;
        changedInstance2 = (i52 != 4) | startRestartGroup.changedInstance(updatableOfferWebViewBridgeHandler2);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changedInstance2) {
        }
        rememberedValue6 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopWebViewScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                WebView ShopWebViewScreen$lambda$10$lambda$9;
                ShopWebViewScreen$lambda$10$lambda$9 = ShopWebViewScreenKt.ShopWebViewScreen$lambda$10$lambda$9(OfferWebViewFactory.this, html, updatableOfferWebViewBridgeHandler2, (Context) obj);
                return ShopWebViewScreen$lambda$10$lambda$9;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue6);
        Function1 function12 = (Function1) rememberedValue6;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        if (i52 == 4) {
        }
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue7 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopWebViewScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ShopWebViewScreen$lambda$12$lambda$11;
                ShopWebViewScreen$lambda$12$lambda$11 = ShopWebViewScreenKt.ShopWebViewScreen$lambda$12$lambda$11(html, offerWebViewConfig, (WebView) obj);
                return ShopWebViewScreen$lambda$12$lambda$11;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        startRestartGroup.endReplaceGroup();
        AndroidView_androidKt.AndroidView(function12, graphicsLayer2, (Function1) rememberedValue7, startRestartGroup, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopWebViewScreen$lambda$2$lambda$1(UpdatableOfferWebViewBridgeHandler updatableOfferWebViewBridgeHandler, OfferWebViewBridgeHandler offerWebViewBridgeHandler) {
        updatableOfferWebViewBridgeHandler.setDelegate(offerWebViewBridgeHandler);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopWebViewScreen$lambda$6$lambda$5(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setClip(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView ShopWebViewScreen$lambda$10$lambda$9(OfferWebViewFactory offerWebViewFactory, String str, UpdatableOfferWebViewBridgeHandler updatableOfferWebViewBridgeHandler, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WebView create$default = OfferWebViewFactory.create$default(offerWebViewFactory, context, new OfferWebLoadSpec.InlineHtml(str), updatableOfferWebViewBridgeHandler, null, new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopWebViewScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                WebView ShopWebViewScreen$lambda$10$lambda$9$lambda$7;
                ShopWebViewScreen$lambda$10$lambda$9$lambda$7 = ShopWebViewScreenKt.ShopWebViewScreen$lambda$10$lambda$9$lambda$7((Context) obj);
                return ShopWebViewScreen$lambda$10$lambda$9$lambda$7;
            }
        }, 8, null);
        create$default.setTag(str);
        create$default.setBackgroundColor(0);
        create$default.setClipToOutline(false);
        create$default.setClipChildren(false);
        create$default.setVerticalScrollBarEnabled(false);
        create$default.setHorizontalScrollBarEnabled(false);
        create$default.setNestedScrollingEnabled(false);
        create$default.setFocusable(false);
        create$default.setFocusableInTouchMode(false);
        create$default.setOverScrollMode(2);
        create$default.getSettings().setMediaPlaybackRequiresUserGesture(false);
        create$default.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return create$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView ShopWebViewScreen$lambda$10$lambda$9$lambda$7(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ShopScrollFriendlyWebView(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopWebViewScreen$lambda$12$lambda$11(String str, OfferWebViewConfig offerWebViewConfig, WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Object tag = webView.getTag();
        if (Intrinsics.areEqual(tag instanceof String ? (String) tag : null, str)) {
            return Unit.INSTANCE;
        }
        webView.setTag(str);
        webView.setBackgroundColor(0);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.loadDataWithBaseURL(SHOP_HTML_BASE_URL, str, offerWebViewConfig.getMimeType(), offerWebViewConfig.getCharset(), null);
        return Unit.INSTANCE;
    }
}
