package org.betup.ui.dialogs.webgame;

import android.content.Context;
import android.webkit.WebView;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.dialogs.offer.webview.OfferWebViewConfig;
import org.betup.ui.dialogs.webgame.bridge.BetupWebGameBridgeHandler;
import org.betup.ui.dialogs.webgame.webview.WebGameWebViewFactory;
import org.betup.ui.views.ComposeUtils;

/* compiled from: WebGameWebViewScreen.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001aG\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\rH\u0007¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0012X\u008a\u008e\u0002"}, d2 = {"WEB_GAME_LOADER_HIDE_DELAY_MS", "", "WebGameWebViewScreen", "", "loadUrl", "", "bridgeHandler", "Lorg/betup/ui/dialogs/webgame/bridge/BetupWebGameBridgeHandler;", "modifier", "Landroidx/compose/ui/Modifier;", "config", "Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig;", "onWebViewReady", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "(Ljava/lang/String;Lorg/betup/ui/dialogs/webgame/bridge/BetupWebGameBridgeHandler;Landroidx/compose/ui/Modifier;Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_release", "isWebContentReady", "", "keepLoaderVisible"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebGameWebViewScreenKt {
    private static final long WEB_GAME_LOADER_HIDE_DELAY_MS = 350;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebGameWebViewScreen$lambda$17(String str, BetupWebGameBridgeHandler betupWebGameBridgeHandler, Modifier modifier, OfferWebViewConfig offerWebViewConfig, Function1 function1, int i, int i2, Composer composer, int i3) {
        WebGameWebViewScreen(str, betupWebGameBridgeHandler, modifier, offerWebViewConfig, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebGameWebViewScreen$lambda$1$lambda$0(WebView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WebGameWebViewScreen(final String loadUrl, final BetupWebGameBridgeHandler bridgeHandler, Modifier modifier, OfferWebViewConfig offerWebViewConfig, Function1<? super WebView, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        OfferWebViewConfig offerWebViewConfig2;
        int i5;
        Function1<? super WebView, Unit> function12;
        Function1<? super WebView, Unit> function13;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Object rememberedValue2;
        boolean z3;
        Object rememberedValue3;
        MutableState mutableState;
        boolean changed;
        Object rememberedValue4;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean changed2;
        Object rememberedValue5;
        Object rememberedValue6;
        Composer composer2;
        final Modifier modifier3;
        final Function1<? super WebView, Unit> function14;
        final OfferWebViewConfig offerWebViewConfig3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(loadUrl, "loadUrl");
        Intrinsics.checkNotNullParameter(bridgeHandler, "bridgeHandler");
        Composer startRestartGroup = composer.startRestartGroup(761696258);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(loadUrl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(bridgeHandler) : startRestartGroup.changedInstance(bridgeHandler) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                offerWebViewConfig2 = offerWebViewConfig;
                i3 |= startRestartGroup.changed(offerWebViewConfig2) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function12 = function1;
                    i3 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 != 0) {
                            offerWebViewConfig2 = OfferWebViewConfig.INSTANCE.getDEFAULT();
                        }
                        if (i5 == 0) {
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue7 = startRestartGroup.rememberedValue();
                            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue7 = new Function1() { // from class: org.betup.ui.dialogs.webgame.WebGameWebViewScreenKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        Unit WebGameWebViewScreen$lambda$1$lambda$0;
                                        WebGameWebViewScreen$lambda$1$lambda$0 = WebGameWebViewScreenKt.WebGameWebViewScreen$lambda$1$lambda$0((WebView) obj);
                                        return WebGameWebViewScreen$lambda$1$lambda$0;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue7);
                            }
                            startRestartGroup.endReplaceGroup();
                            function13 = (Function1) rememberedValue7;
                        } else {
                            function13 = function12;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(761696258, i3, -1, "org.betup.ui.dialogs.webgame.WebGameWebViewScreen (WebGameWebViewScreen.kt:32)");
                        }
                        startRestartGroup.startReplaceGroup(5004770);
                        z = (i3 & 7168) != 2048;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new WebGameWebViewFactory(offerWebViewConfig2);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final WebGameWebViewFactory webGameWebViewFactory = (WebGameWebViewFactory) rememberedValue;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        int i7 = i3 & 14;
                        z2 = i7 != 4;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            Object mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                            startRestartGroup.updateRememberedValue(mutableStateOf$default);
                            rememberedValue2 = mutableStateOf$default;
                        }
                        final MutableState mutableState2 = (MutableState) rememberedValue2;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(5004770);
                        z3 = i7 != 4;
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!z3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        mutableState = (MutableState) rememberedValue3;
                        startRestartGroup.endReplaceGroup();
                        Boolean valueOf = Boolean.valueOf(WebGameWebViewScreen$lambda$4(mutableState2));
                        startRestartGroup.startReplaceGroup(-1633490746);
                        changed = startRestartGroup.changed(mutableState2) | startRestartGroup.changed(mutableState);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (!changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function2) new WebGameWebViewScreenKt$WebGameWebViewScreen$2$1(mutableState2, mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf, loadUrl, (Function2) rememberedValue4, startRestartGroup, (i3 << 3) & 112);
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                        Modifier modifier5 = modifier4;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        startRestartGroup.startReplaceGroup(-1224400529);
                        changed2 = startRestartGroup.changed(webGameWebViewFactory) | (i7 != 4) | ((i3 & 112) != 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(bridgeHandler))) | startRestartGroup.changed(mutableState2) | ((i3 & 57344) != 16384);
                        rememberedValue5 = startRestartGroup.rememberedValue();
                        if (!changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            final Function1<? super WebView, Unit> function15 = function13;
                            Object obj = new Function1() { // from class: org.betup.ui.dialogs.webgame.WebGameWebViewScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    WebView WebGameWebViewScreen$lambda$16$lambda$12$lambda$11;
                                    WebGameWebViewScreen$lambda$16$lambda$12$lambda$11 = WebGameWebViewScreenKt.WebGameWebViewScreen$lambda$16$lambda$12$lambda$11(WebGameWebViewFactory.this, loadUrl, bridgeHandler, function15, mutableState2, (Context) obj2);
                                    return WebGameWebViewScreen$lambda$16$lambda$12$lambda$11;
                                }
                            };
                            startRestartGroup.updateRememberedValue(obj);
                            rememberedValue5 = obj;
                        }
                        Function1 function16 = (Function1) rememberedValue5;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1849434622);
                        rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new Function1() { // from class: org.betup.ui.dialogs.webgame.WebGameWebViewScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    Unit WebGameWebViewScreen$lambda$16$lambda$14$lambda$13;
                                    WebGameWebViewScreen$lambda$16$lambda$14$lambda$13 = WebGameWebViewScreenKt.WebGameWebViewScreen$lambda$16$lambda$14$lambda$13((WebView) obj2);
                                    return WebGameWebViewScreen$lambda$16$lambda$14$lambda$13;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        startRestartGroup.endReplaceGroup();
                        OfferWebViewConfig offerWebViewConfig4 = offerWebViewConfig2;
                        AndroidView_androidKt.AndroidView(function16, fillMaxSize$default2, (Function1) rememberedValue6, startRestartGroup, 432, 0);
                        startRestartGroup.startReplaceGroup(-493403760);
                        if (WebGameWebViewScreen$lambda$7(mutableState)) {
                            composer2 = startRestartGroup;
                        } else {
                            Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(32));
                            Alignment center = Alignment.INSTANCE.getCenter();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            startRestartGroup.startReusableNode();
                            if (startRestartGroup.getInserting()) {
                                startRestartGroup.createNode(constructor2);
                            } else {
                                startRestartGroup.useNode();
                            }
                            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            composer2 = startRestartGroup;
                            ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, composer2, 0, 29);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        function14 = function13;
                        offerWebViewConfig3 = offerWebViewConfig4;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        offerWebViewConfig3 = offerWebViewConfig2;
                        function14 = function12;
                        composer2 = startRestartGroup;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.webgame.WebGameWebViewScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit WebGameWebViewScreen$lambda$17;
                                WebGameWebViewScreen$lambda$17 = WebGameWebViewScreenKt.WebGameWebViewScreen$lambda$17(loadUrl, bridgeHandler, modifier3, offerWebViewConfig3, function14, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                return WebGameWebViewScreen$lambda$17;
                            }
                        });
                        return;
                    }
                    return;
                }
                function12 = function1;
                if ((i3 & 9363) == 9362) {
                }
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                startRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 7168) != 2048) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z) {
                }
                rememberedValue = new WebGameWebViewFactory(offerWebViewConfig2);
                startRestartGroup.updateRememberedValue(rememberedValue);
                final WebGameWebViewFactory webGameWebViewFactory2 = (WebGameWebViewFactory) rememberedValue;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                int i72 = i3 & 14;
                if (i72 != 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                Object mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(mutableStateOf$default2);
                rememberedValue2 = mutableStateOf$default2;
                final MutableState mutableState22 = (MutableState) rememberedValue2;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(5004770);
                if (i72 != 4) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!z3) {
                }
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                mutableState = (MutableState) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                Boolean valueOf2 = Boolean.valueOf(WebGameWebViewScreen$lambda$4(mutableState22));
                startRestartGroup.startReplaceGroup(-1633490746);
                changed = startRestartGroup.changed(mutableState22) | startRestartGroup.changed(mutableState);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!changed) {
                }
                rememberedValue4 = (Function2) new WebGameWebViewScreenKt$WebGameWebViewScreen$2$1(mutableState22, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf2, loadUrl, (Function2) rememberedValue4, startRestartGroup, (i3 << 3) & 112);
                Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                Modifier modifier52 = modifier4;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default3);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(-1224400529);
                changed2 = startRestartGroup.changed(webGameWebViewFactory2) | (i72 != 4) | ((i3 & 112) != 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(bridgeHandler))) | startRestartGroup.changed(mutableState22) | ((i3 & 57344) != 16384);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if (!changed2) {
                }
                final Function1 function152 = function13;
                Object obj2 = new Function1() { // from class: org.betup.ui.dialogs.webgame.WebGameWebViewScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj22) {
                        WebView WebGameWebViewScreen$lambda$16$lambda$12$lambda$11;
                        WebGameWebViewScreen$lambda$16$lambda$12$lambda$11 = WebGameWebViewScreenKt.WebGameWebViewScreen$lambda$16$lambda$12$lambda$11(WebGameWebViewFactory.this, loadUrl, bridgeHandler, function152, mutableState22, (Context) obj22);
                        return WebGameWebViewScreen$lambda$16$lambda$12$lambda$11;
                    }
                };
                startRestartGroup.updateRememberedValue(obj2);
                rememberedValue5 = obj2;
                Function1 function162 = (Function1) rememberedValue5;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue6 = startRestartGroup.rememberedValue();
                if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                }
                startRestartGroup.endReplaceGroup();
                OfferWebViewConfig offerWebViewConfig42 = offerWebViewConfig2;
                AndroidView_androidKt.AndroidView(function162, fillMaxSize$default22, (Function1) rememberedValue6, startRestartGroup, 432, 0);
                startRestartGroup.startReplaceGroup(-493403760);
                if (WebGameWebViewScreen$lambda$7(mutableState)) {
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                function14 = function13;
                offerWebViewConfig3 = offerWebViewConfig42;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            offerWebViewConfig2 = offerWebViewConfig;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function12 = function1;
            if ((i3 & 9363) == 9362) {
            }
            if (i6 == 0) {
            }
            if (i4 != 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            startRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 7168) != 2048) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new WebGameWebViewFactory(offerWebViewConfig2);
            startRestartGroup.updateRememberedValue(rememberedValue);
            final WebGameWebViewFactory webGameWebViewFactory22 = (WebGameWebViewFactory) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            int i722 = i3 & 14;
            if (i722 != 4) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            Object mutableStateOf$default22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(mutableStateOf$default22);
            rememberedValue2 = mutableStateOf$default22;
            final MutableState mutableState222 = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            if (i722 != 4) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            mutableState = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            Boolean valueOf22 = Boolean.valueOf(WebGameWebViewScreen$lambda$4(mutableState222));
            startRestartGroup.startReplaceGroup(-1633490746);
            changed = startRestartGroup.changed(mutableState222) | startRestartGroup.changed(mutableState);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue4 = (Function2) new WebGameWebViewScreenKt$WebGameWebViewScreen$2$1(mutableState222, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf22, loadUrl, (Function2) rememberedValue4, startRestartGroup, (i3 << 3) & 112);
            Modifier fillMaxSize$default32 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            Modifier modifier522 = modifier4;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default32);
            Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy32, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
            Modifier fillMaxSize$default222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            startRestartGroup.startReplaceGroup(-1224400529);
            changed2 = startRestartGroup.changed(webGameWebViewFactory22) | (i722 != 4) | ((i3 & 112) != 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(bridgeHandler))) | startRestartGroup.changed(mutableState222) | ((i3 & 57344) != 16384);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            final Function1 function1522 = function13;
            Object obj22 = new Function1() { // from class: org.betup.ui.dialogs.webgame.WebGameWebViewScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj222) {
                    WebView WebGameWebViewScreen$lambda$16$lambda$12$lambda$11;
                    WebGameWebViewScreen$lambda$16$lambda$12$lambda$11 = WebGameWebViewScreenKt.WebGameWebViewScreen$lambda$16$lambda$12$lambda$11(WebGameWebViewFactory.this, loadUrl, bridgeHandler, function1522, mutableState222, (Context) obj222);
                    return WebGameWebViewScreen$lambda$16$lambda$12$lambda$11;
                }
            };
            startRestartGroup.updateRememberedValue(obj22);
            rememberedValue5 = obj22;
            Function1 function1622 = (Function1) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            OfferWebViewConfig offerWebViewConfig422 = offerWebViewConfig2;
            AndroidView_androidKt.AndroidView(function1622, fillMaxSize$default222, (Function1) rememberedValue6, startRestartGroup, 432, 0);
            startRestartGroup.startReplaceGroup(-493403760);
            if (WebGameWebViewScreen$lambda$7(mutableState)) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier522;
            function14 = function13;
            offerWebViewConfig3 = offerWebViewConfig422;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        offerWebViewConfig2 = offerWebViewConfig;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function12 = function1;
        if ((i3 & 9363) == 9362) {
        }
        if (i6 == 0) {
        }
        if (i4 != 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & 7168) != 2048) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new WebGameWebViewFactory(offerWebViewConfig2);
        startRestartGroup.updateRememberedValue(rememberedValue);
        final WebGameWebViewFactory webGameWebViewFactory222 = (WebGameWebViewFactory) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        int i7222 = i3 & 14;
        if (i7222 != 4) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        Object mutableStateOf$default222 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        startRestartGroup.updateRememberedValue(mutableStateOf$default222);
        rememberedValue2 = mutableStateOf$default222;
        final MutableState mutableState2222 = (MutableState) rememberedValue2;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        if (i7222 != 4) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        mutableState = (MutableState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        Boolean valueOf222 = Boolean.valueOf(WebGameWebViewScreen$lambda$4(mutableState2222));
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(mutableState2222) | startRestartGroup.changed(mutableState);
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue4 = (Function2) new WebGameWebViewScreenKt$WebGameWebViewScreen$2$1(mutableState2222, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf222, loadUrl, (Function2) rememberedValue4, startRestartGroup, (i3 << 3) & 112);
        Modifier fillMaxSize$default322 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
        Modifier modifier5222 = modifier4;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy322 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap322 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier322 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default322);
        Function0<ComposeUiNode> constructor322 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy322, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap322, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash322 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash322);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier322, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance322 = BoxScopeInstance.INSTANCE;
        Modifier fillMaxSize$default2222 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(-1224400529);
        changed2 = startRestartGroup.changed(webGameWebViewFactory222) | (i7222 != 4) | ((i3 & 112) != 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(bridgeHandler))) | startRestartGroup.changed(mutableState2222) | ((i3 & 57344) != 16384);
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        final Function1 function15222 = function13;
        Object obj222 = new Function1() { // from class: org.betup.ui.dialogs.webgame.WebGameWebViewScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2222) {
                WebView WebGameWebViewScreen$lambda$16$lambda$12$lambda$11;
                WebGameWebViewScreen$lambda$16$lambda$12$lambda$11 = WebGameWebViewScreenKt.WebGameWebViewScreen$lambda$16$lambda$12$lambda$11(WebGameWebViewFactory.this, loadUrl, bridgeHandler, function15222, mutableState2222, (Context) obj2222);
                return WebGameWebViewScreen$lambda$16$lambda$12$lambda$11;
            }
        };
        startRestartGroup.updateRememberedValue(obj222);
        rememberedValue5 = obj222;
        Function1 function16222 = (Function1) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (rememberedValue6 == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        OfferWebViewConfig offerWebViewConfig4222 = offerWebViewConfig2;
        AndroidView_androidKt.AndroidView(function16222, fillMaxSize$default2222, (Function1) rememberedValue6, startRestartGroup, 432, 0);
        startRestartGroup.startReplaceGroup(-493403760);
        if (WebGameWebViewScreen$lambda$7(mutableState)) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier5222;
        function14 = function13;
        offerWebViewConfig3 = offerWebViewConfig4222;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WebGameWebViewScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void WebGameWebViewScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean WebGameWebViewScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WebGameWebViewScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView WebGameWebViewScreen$lambda$16$lambda$12$lambda$11(WebGameWebViewFactory webGameWebViewFactory, String str, BetupWebGameBridgeHandler betupWebGameBridgeHandler, Function1 function1, final MutableState mutableState, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WebView create = webGameWebViewFactory.create(context, str, betupWebGameBridgeHandler, new Function0() { // from class: org.betup.ui.dialogs.webgame.WebGameWebViewScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit WebGameWebViewScreen$lambda$16$lambda$12$lambda$11$lambda$10;
                WebGameWebViewScreen$lambda$16$lambda$12$lambda$11$lambda$10 = WebGameWebViewScreenKt.WebGameWebViewScreen$lambda$16$lambda$12$lambda$11$lambda$10(MutableState.this);
                return WebGameWebViewScreen$lambda$16$lambda$12$lambda$11$lambda$10;
            }
        });
        function1.invoke(create);
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebGameWebViewScreen$lambda$16$lambda$12$lambda$11$lambda$10(MutableState mutableState) {
        WebGameWebViewScreen$lambda$5(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebGameWebViewScreen$lambda$16$lambda$14$lambda$13(WebView it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
