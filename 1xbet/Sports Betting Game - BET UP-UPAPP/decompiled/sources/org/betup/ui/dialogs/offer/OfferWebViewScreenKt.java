package org.betup.ui.dialogs.offer;

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
import androidx.mediarouter.media.MediaRouterJellybean;
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
import org.betup.ui.dialogs.offer.webview.OfferWebPriceInjection;
import org.betup.ui.dialogs.offer.webview.OfferWebViewConfig;
import org.betup.ui.dialogs.offer.webview.OfferWebViewFactory;
import org.betup.ui.views.ComposeUtils;

/* compiled from: OfferWebViewScreen.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a1\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"OFFER_WEB_LOADER_HIDE_DELAY_MS", "", "OfferWebViewScreen", "", "loadSpec", "Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec;", "bridgeHandler", "Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeHandler;", "config", "Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec;Lorg/betup/ui/dialogs/offer/bridge/OfferWebViewBridgeHandler;Lorg/betup/ui/dialogs/offer/webview/OfferWebViewConfig;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "isWebContentReady", "", "keepLoaderVisible"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferWebViewScreenKt {
    private static final long OFFER_WEB_LOADER_HIDE_DELAY_MS = 350;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OfferWebViewScreen$lambda$18(OfferWebLoadSpec offerWebLoadSpec, OfferWebViewBridgeHandler offerWebViewBridgeHandler, OfferWebViewConfig offerWebViewConfig, Modifier modifier, int i, int i2, Composer composer, int i3) {
        OfferWebViewScreen(offerWebLoadSpec, offerWebViewBridgeHandler, offerWebViewConfig, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OfferWebViewScreen(final OfferWebLoadSpec loadSpec, final OfferWebViewBridgeHandler bridgeHandler, OfferWebViewConfig offerWebViewConfig, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        OfferWebViewConfig offerWebViewConfig2;
        int i4;
        Modifier modifier2;
        OfferWebViewConfig offerWebViewConfig3;
        Object rememberedValue;
        boolean changedInstance;
        Object rememberedValue2;
        boolean z;
        Object rememberedValue3;
        boolean z2;
        Object rememberedValue4;
        boolean z3;
        Object rememberedValue5;
        MutableState mutableState;
        boolean changed;
        Object rememberedValue6;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean changed2;
        Object rememberedValue7;
        boolean z4;
        Object rememberedValue8;
        final Modifier modifier3;
        OfferWebViewConfig offerWebViewConfig4;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(loadSpec, "loadSpec");
        Intrinsics.checkNotNullParameter(bridgeHandler, "bridgeHandler");
        Composer startRestartGroup = composer.startRestartGroup(2096650180);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(loadSpec) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(bridgeHandler) : startRestartGroup.changedInstance(bridgeHandler) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            offerWebViewConfig2 = offerWebViewConfig;
            i3 |= startRestartGroup.changed(offerWebViewConfig2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    offerWebViewConfig3 = i5 != 0 ? OfferWebViewConfig.INSTANCE.getDEFAULT() : offerWebViewConfig2;
                    Modifier modifier4 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2096650180, i3, -1, "org.betup.ui.dialogs.offer.OfferWebViewScreen (OfferWebViewScreen.kt:33)");
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
                    changedInstance = startRestartGroup.changedInstance(updatableOfferWebViewBridgeHandler) | ((i3 & 112) != 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(bridgeHandler)));
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.offer.OfferWebViewScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit OfferWebViewScreen$lambda$2$lambda$1;
                                OfferWebViewScreen$lambda$2$lambda$1 = OfferWebViewScreenKt.OfferWebViewScreen$lambda$2$lambda$1(UpdatableOfferWebViewBridgeHandler.this, bridgeHandler);
                                return OfferWebViewScreen$lambda$2$lambda$1;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
                    startRestartGroup.startReplaceGroup(5004770);
                    z = (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new OfferWebViewFactory(offerWebViewConfig3);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final OfferWebViewFactory offerWebViewFactory = (OfferWebViewFactory) rememberedValue3;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    int i6 = i3 & 14;
                    z2 = i6 == 4;
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!z2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    final MutableState mutableState2 = (MutableState) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    z3 = i6 == 4;
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!z3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    mutableState = (MutableState) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    Boolean valueOf = Boolean.valueOf(OfferWebViewScreen$lambda$5(mutableState2));
                    startRestartGroup.startReplaceGroup(-1633490746);
                    changed = startRestartGroup.changed(mutableState2) | startRestartGroup.changed(mutableState);
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = (Function2) new OfferWebViewScreenKt$OfferWebViewScreen$2$1(mutableState2, mutableState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf, loadSpec, (Function2) rememberedValue6, startRestartGroup, (i3 << 3) & 112);
                    Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
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
                    if (startRestartGroup.getInserting()) {
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
                    changed2 = startRestartGroup.changed(offerWebViewFactory) | (i6 == 4) | startRestartGroup.changedInstance(updatableOfferWebViewBridgeHandler) | startRestartGroup.changed(mutableState2);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changed2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new Function1() { // from class: org.betup.ui.dialogs.offer.OfferWebViewScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                WebView OfferWebViewScreen$lambda$17$lambda$13$lambda$12;
                                OfferWebViewScreen$lambda$17$lambda$13$lambda$12 = OfferWebViewScreenKt.OfferWebViewScreen$lambda$17$lambda$13$lambda$12(OfferWebViewFactory.this, loadSpec, updatableOfferWebViewBridgeHandler, mutableState2, (Context) obj);
                                return OfferWebViewScreen$lambda$17$lambda$13$lambda$12;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    Function1 function1 = (Function1) rememberedValue7;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(5004770);
                    z4 = i6 == 4;
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!z4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new Function1() { // from class: org.betup.ui.dialogs.offer.OfferWebViewScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit OfferWebViewScreen$lambda$17$lambda$15$lambda$14;
                                OfferWebViewScreen$lambda$17$lambda$15$lambda$14 = OfferWebViewScreenKt.OfferWebViewScreen$lambda$17$lambda$15$lambda$14(OfferWebLoadSpec.this, (WebView) obj);
                                return OfferWebViewScreen$lambda$17$lambda$15$lambda$14;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    startRestartGroup.endReplaceGroup();
                    AndroidView_androidKt.AndroidView(function1, fillMaxSize$default2, (Function1) rememberedValue8, startRestartGroup, 48, 0);
                    startRestartGroup.startReplaceGroup(-317474621);
                    if (OfferWebViewScreen$lambda$8(mutableState)) {
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
                        modifier3 = modifier4;
                        offerWebViewConfig4 = offerWebViewConfig3;
                        ProgressIndicatorKt.m2521CircularProgressIndicatorLxG7B9w(null, ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), 0.0f, 0L, 0, startRestartGroup, 0, 29);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    } else {
                        modifier3 = modifier4;
                        offerWebViewConfig4 = offerWebViewConfig3;
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    offerWebViewConfig2 = offerWebViewConfig4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final OfferWebViewConfig offerWebViewConfig5 = offerWebViewConfig2;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.offer.OfferWebViewScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit OfferWebViewScreen$lambda$18;
                            OfferWebViewScreen$lambda$18 = OfferWebViewScreenKt.OfferWebViewScreen$lambda$18(OfferWebLoadSpec.this, bridgeHandler, offerWebViewConfig5, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return OfferWebViewScreen$lambda$18;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i3 & 1171) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
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
            changedInstance = startRestartGroup.changedInstance(updatableOfferWebViewBridgeHandler2) | ((i3 & 112) != 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(bridgeHandler)));
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.offer.OfferWebViewScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit OfferWebViewScreen$lambda$2$lambda$1;
                    OfferWebViewScreen$lambda$2$lambda$1 = OfferWebViewScreenKt.OfferWebViewScreen$lambda$2$lambda$1(UpdatableOfferWebViewBridgeHandler.this, bridgeHandler);
                    return OfferWebViewScreen$lambda$2$lambda$1;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(5004770);
            if ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue3 = new OfferWebViewFactory(offerWebViewConfig3);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            final OfferWebViewFactory offerWebViewFactory2 = (OfferWebViewFactory) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            int i62 = i3 & 14;
            if (i62 == 4) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            final MutableState mutableState22 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            if (i62 == 4) {
            }
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            mutableState = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            Boolean valueOf2 = Boolean.valueOf(OfferWebViewScreen$lambda$5(mutableState22));
            startRestartGroup.startReplaceGroup(-1633490746);
            changed = startRestartGroup.changed(mutableState22) | startRestartGroup.changed(mutableState);
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue6 = (Function2) new OfferWebViewScreenKt$OfferWebViewScreen$2$1(mutableState22, mutableState, null);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf2, loadSpec, (Function2) rememberedValue6, startRestartGroup, (i3 << 3) & 112);
            Modifier fillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
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
            if (startRestartGroup.getInserting()) {
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
            changed2 = startRestartGroup.changed(offerWebViewFactory2) | (i62 == 4) | startRestartGroup.changedInstance(updatableOfferWebViewBridgeHandler2) | startRestartGroup.changed(mutableState22);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue7 = new Function1() { // from class: org.betup.ui.dialogs.offer.OfferWebViewScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    WebView OfferWebViewScreen$lambda$17$lambda$13$lambda$12;
                    OfferWebViewScreen$lambda$17$lambda$13$lambda$12 = OfferWebViewScreenKt.OfferWebViewScreen$lambda$17$lambda$13$lambda$12(OfferWebViewFactory.this, loadSpec, updatableOfferWebViewBridgeHandler2, mutableState22, (Context) obj);
                    return OfferWebViewScreen$lambda$17$lambda$13$lambda$12;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue7);
            Function1 function12 = (Function1) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(5004770);
            if (i62 == 4) {
            }
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue8 = new Function1() { // from class: org.betup.ui.dialogs.offer.OfferWebViewScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit OfferWebViewScreen$lambda$17$lambda$15$lambda$14;
                    OfferWebViewScreen$lambda$17$lambda$15$lambda$14 = OfferWebViewScreenKt.OfferWebViewScreen$lambda$17$lambda$15$lambda$14(OfferWebLoadSpec.this, (WebView) obj);
                    return OfferWebViewScreen$lambda$17$lambda$15$lambda$14;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue8);
            startRestartGroup.endReplaceGroup();
            AndroidView_androidKt.AndroidView(function12, fillMaxSize$default22, (Function1) rememberedValue8, startRestartGroup, 48, 0);
            startRestartGroup.startReplaceGroup(-317474621);
            if (OfferWebViewScreen$lambda$8(mutableState)) {
            }
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            offerWebViewConfig2 = offerWebViewConfig4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        offerWebViewConfig2 = offerWebViewConfig;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        final UpdatableOfferWebViewBridgeHandler updatableOfferWebViewBridgeHandler22 = (UpdatableOfferWebViewBridgeHandler) rememberedValue;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = startRestartGroup.changedInstance(updatableOfferWebViewBridgeHandler22) | ((i3 & 112) != 32 || ((i3 & 64) != 0 && startRestartGroup.changedInstance(bridgeHandler)));
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue2 = new Function0() { // from class: org.betup.ui.dialogs.offer.OfferWebViewScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit OfferWebViewScreen$lambda$2$lambda$1;
                OfferWebViewScreen$lambda$2$lambda$1 = OfferWebViewScreenKt.OfferWebViewScreen$lambda$2$lambda$1(UpdatableOfferWebViewBridgeHandler.this, bridgeHandler);
                return OfferWebViewScreen$lambda$2$lambda$1;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.SideEffect((Function0) rememberedValue2, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue3 = new OfferWebViewFactory(offerWebViewConfig3);
        startRestartGroup.updateRememberedValue(rememberedValue3);
        final OfferWebViewFactory offerWebViewFactory22 = (OfferWebViewFactory) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        int i622 = i3 & 14;
        if (i622 == 4) {
        }
        rememberedValue4 = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue4);
        final MutableState mutableState222 = (MutableState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        if (i622 == 4) {
        }
        rememberedValue5 = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
        startRestartGroup.updateRememberedValue(rememberedValue5);
        mutableState = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        Boolean valueOf22 = Boolean.valueOf(OfferWebViewScreen$lambda$5(mutableState222));
        startRestartGroup.startReplaceGroup(-1633490746);
        changed = startRestartGroup.changed(mutableState222) | startRestartGroup.changed(mutableState);
        rememberedValue6 = startRestartGroup.rememberedValue();
        if (!changed) {
        }
        rememberedValue6 = (Function2) new OfferWebViewScreenKt$OfferWebViewScreen$2$1(mutableState222, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue6);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf22, loadSpec, (Function2) rememberedValue6, startRestartGroup, (i3 << 3) & 112);
        Modifier fillMaxSize$default32 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
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
        if (startRestartGroup.getInserting()) {
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
        changed2 = startRestartGroup.changed(offerWebViewFactory22) | (i622 == 4) | startRestartGroup.changedInstance(updatableOfferWebViewBridgeHandler22) | startRestartGroup.changed(mutableState222);
        rememberedValue7 = startRestartGroup.rememberedValue();
        if (!changed2) {
        }
        rememberedValue7 = new Function1() { // from class: org.betup.ui.dialogs.offer.OfferWebViewScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                WebView OfferWebViewScreen$lambda$17$lambda$13$lambda$12;
                OfferWebViewScreen$lambda$17$lambda$13$lambda$12 = OfferWebViewScreenKt.OfferWebViewScreen$lambda$17$lambda$13$lambda$12(OfferWebViewFactory.this, loadSpec, updatableOfferWebViewBridgeHandler22, mutableState222, (Context) obj);
                return OfferWebViewScreen$lambda$17$lambda$13$lambda$12;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue7);
        Function1 function122 = (Function1) rememberedValue7;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(5004770);
        if (i622 == 4) {
        }
        rememberedValue8 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue8 = new Function1() { // from class: org.betup.ui.dialogs.offer.OfferWebViewScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit OfferWebViewScreen$lambda$17$lambda$15$lambda$14;
                OfferWebViewScreen$lambda$17$lambda$15$lambda$14 = OfferWebViewScreenKt.OfferWebViewScreen$lambda$17$lambda$15$lambda$14(OfferWebLoadSpec.this, (WebView) obj);
                return OfferWebViewScreen$lambda$17$lambda$15$lambda$14;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue8);
        startRestartGroup.endReplaceGroup();
        AndroidView_androidKt.AndroidView(function122, fillMaxSize$default222, (Function1) rememberedValue8, startRestartGroup, 48, 0);
        startRestartGroup.startReplaceGroup(-317474621);
        if (OfferWebViewScreen$lambda$8(mutableState)) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        offerWebViewConfig2 = offerWebViewConfig4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OfferWebViewScreen$lambda$2$lambda$1(UpdatableOfferWebViewBridgeHandler updatableOfferWebViewBridgeHandler, OfferWebViewBridgeHandler offerWebViewBridgeHandler) {
        updatableOfferWebViewBridgeHandler.setDelegate(offerWebViewBridgeHandler);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OfferWebViewScreen$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void OfferWebViewScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean OfferWebViewScreen$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OfferWebViewScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView OfferWebViewScreen$lambda$17$lambda$13$lambda$12(OfferWebViewFactory offerWebViewFactory, OfferWebLoadSpec offerWebLoadSpec, UpdatableOfferWebViewBridgeHandler updatableOfferWebViewBridgeHandler, final MutableState mutableState, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return OfferWebViewFactory.create$default(offerWebViewFactory, context, offerWebLoadSpec, updatableOfferWebViewBridgeHandler, new Function0() { // from class: org.betup.ui.dialogs.offer.OfferWebViewScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit OfferWebViewScreen$lambda$17$lambda$13$lambda$12$lambda$11;
                OfferWebViewScreen$lambda$17$lambda$13$lambda$12$lambda$11 = OfferWebViewScreenKt.OfferWebViewScreen$lambda$17$lambda$13$lambda$12$lambda$11(MutableState.this);
                return OfferWebViewScreen$lambda$17$lambda$13$lambda$12$lambda$11;
            }
        }, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OfferWebViewScreen$lambda$17$lambda$13$lambda$12$lambda$11(MutableState mutableState) {
        OfferWebViewScreen$lambda$6(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OfferWebViewScreen$lambda$17$lambda$15$lambda$14(OfferWebLoadSpec offerWebLoadSpec, WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        OfferWebLoadSpec.RemoteUrl remoteUrl = offerWebLoadSpec instanceof OfferWebLoadSpec.RemoteUrl ? (OfferWebLoadSpec.RemoteUrl) offerWebLoadSpec : null;
        OfferWebPriceInjection priceInjection = remoteUrl != null ? remoteUrl.getPriceInjection() : null;
        if (priceInjection != null) {
            webView.evaluateJavascript(OfferWebViewFactory.INSTANCE.buildPriceInjectionScript(priceInjection), null);
        }
        return Unit.INSTANCE;
    }
}
