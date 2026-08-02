package org.betup.ui.fragment.bets.sheet.compose.items;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.dialogs.compose.BattleFlowDimens;

/* compiled from: TopActionButtons.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"TopActionButtons", "", "modifier", "Landroidx/compose/ui/Modifier;", "onCloseClick", "Lkotlin/Function0;", "onBackClick", "onSettingsClick", "isSettingsVisible", "", "showBackButton", "compact", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZZLandroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TopActionButtonsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionButtons$lambda$11(Modifier modifier, Function0 function0, Function0 function02, Function0 function03, boolean z, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        TopActionButtons(modifier, function0, function02, function03, z, z2, z3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TopActionButtons(final Modifier modifier, final Function0<Unit> onCloseClick, Function0<Unit> function0, Function0<Unit> function02, boolean z, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function03;
        int i4;
        Function0<Unit> function04;
        int i5;
        boolean z4;
        int i6;
        final boolean z5;
        int i7;
        boolean z6;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        boolean z7;
        float m7774constructorimpl;
        float m7774constructorimpl2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        float f;
        boolean z8;
        Object rememberedValue;
        final Function0<Unit> function07;
        final boolean z9;
        final boolean z10;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer startRestartGroup = composer.startRestartGroup(242485936);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onCloseClick) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function03 = function0;
            i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function04 = function02;
                i3 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    z4 = z;
                    i3 |= startRestartGroup.changed(z4) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        z5 = z2;
                    } else {
                        z5 = z2;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= startRestartGroup.changed(z5) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        z6 = z3;
                    } else {
                        z6 = z3;
                        if ((i & 1572864) == 0) {
                            i3 |= startRestartGroup.changed(z6) ? 1048576 : 524288;
                        }
                    }
                    if ((i3 & 599187) == 599186 || !startRestartGroup.getSkipping()) {
                        if (i8 == 0) {
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit unit;
                                        unit = Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function05 = (Function0) rememberedValue2;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            function05 = function03;
                        }
                        if (i4 == 0) {
                            startRestartGroup.startReplaceGroup(1849434622);
                            Object rememberedValue3 = startRestartGroup.rememberedValue();
                            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit unit;
                                        unit = Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue3);
                            }
                            function06 = (Function0) rememberedValue3;
                            startRestartGroup.endReplaceGroup();
                        } else {
                            function06 = function04;
                        }
                        boolean z11 = i5 == 0 ? true : z4;
                        if (i6 != 0) {
                            z5 = false;
                        }
                        z7 = i7 == 0 ? false : z6;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(242485936, i3, -1, "org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtons (TopActionButtons.kt:27)");
                        }
                        if (!z7) {
                            m7774constructorimpl = BattleFlowDimens.INSTANCE.m13188getTopActionIconD9Ej5fM();
                        } else {
                            m7774constructorimpl = Dp.m7774constructorimpl(36);
                        }
                        float f2 = m7774constructorimpl;
                        if (!z7) {
                            m7774constructorimpl2 = BattleFlowDimens.INSTANCE.m13189getTopActionSpacerD9Ej5fM();
                        } else {
                            m7774constructorimpl2 = Dp.m7774constructorimpl(48);
                        }
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        if (z5) {
                            f = f2;
                            if (z11) {
                                startRestartGroup.startReplaceGroup(-824995297);
                                Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.new_settings_ic, startRestartGroup, 6);
                                String stringResource = StringResources_androidKt.stringResource(R.string.cd_settings, startRestartGroup, 6);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                startRestartGroup.startReplaceGroup(5004770);
                                boolean z12 = (i3 & 7168) == 2048;
                                Object rememberedValue4 = startRestartGroup.rememberedValue();
                                if (z12 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue4 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit TopActionButtons$lambda$10$lambda$7$lambda$6;
                                            TopActionButtons$lambda$10$lambda$7$lambda$6 = TopActionButtonsKt.TopActionButtons$lambda$10$lambda$7$lambda$6(Function0.this);
                                            return TopActionButtons$lambda$10$lambda$7$lambda$6;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue4);
                                }
                                startRestartGroup.endReplaceGroup();
                                ImageKt.Image(painterResource, stringResource, ClickAnimationModifierKt.clickAnimation(companion, (Function0) rememberedValue4, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 6, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                                startRestartGroup.endReplaceGroup();
                            } else {
                                startRestartGroup.startReplaceGroup(-824657955);
                                Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, m7774constructorimpl2);
                                z8 = false;
                                SpacerKt.Spacer(m1563size3ABfNKs, startRestartGroup, 0);
                                startRestartGroup.endReplaceGroup();
                                Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6);
                                String stringResource2 = StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6);
                                Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f);
                                startRestartGroup.startReplaceGroup(5004770);
                                if ((i3 & 112) == 32) {
                                    z8 = true;
                                }
                                rememberedValue = startRestartGroup.rememberedValue();
                                if (!z8 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            Unit TopActionButtons$lambda$10$lambda$9$lambda$8;
                                            TopActionButtons$lambda$10$lambda$9$lambda$8 = TopActionButtonsKt.TopActionButtons$lambda$10$lambda$9$lambda$8(Function0.this);
                                            return TopActionButtons$lambda$10$lambda$9$lambda$8;
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                startRestartGroup.endReplaceGroup();
                                ImageKt.Image(painterResource2, stringResource2, ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs2, (Function0) rememberedValue, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function07 = function06;
                                function03 = function05;
                                z9 = z11;
                                z10 = z7;
                            }
                        } else {
                            startRestartGroup.startReplaceGroup(-825440240);
                            Painter painterResource3 = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
                            String stringResource3 = StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6);
                            Modifier m1563size3ABfNKs3 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f2);
                            startRestartGroup.startReplaceGroup(5004770);
                            boolean z13 = (i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256;
                            Object rememberedValue5 = startRestartGroup.rememberedValue();
                            if (z13 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                rememberedValue5 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit TopActionButtons$lambda$10$lambda$5$lambda$4;
                                        TopActionButtons$lambda$10$lambda$5$lambda$4 = TopActionButtonsKt.TopActionButtons$lambda$10$lambda$5$lambda$4(Function0.this);
                                        return TopActionButtons$lambda$10$lambda$5$lambda$4;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue5);
                            }
                            startRestartGroup.endReplaceGroup();
                            f = f2;
                            ImageKt.Image(painterResource3, stringResource3, ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs3, (Function0) rememberedValue5, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                            startRestartGroup.endReplaceGroup();
                        }
                        z8 = false;
                        Painter painterResource22 = PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6);
                        String stringResource22 = StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6);
                        Modifier m1563size3ABfNKs22 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f);
                        startRestartGroup.startReplaceGroup(5004770);
                        if ((i3 & 112) == 32) {
                        }
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z8) {
                        }
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TopActionButtons$lambda$10$lambda$9$lambda$8;
                                TopActionButtons$lambda$10$lambda$9$lambda$8 = TopActionButtonsKt.TopActionButtons$lambda$10$lambda$9$lambda$8(Function0.this);
                                return TopActionButtons$lambda$10$lambda$9$lambda$8;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                        startRestartGroup.endReplaceGroup();
                        ImageKt.Image(painterResource22, stringResource22, ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs22, (Function0) rememberedValue, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function07 = function06;
                        function03 = function05;
                        z9 = z11;
                        z10 = z7;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        z10 = z6;
                        function07 = function04;
                        z9 = z4;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final Function0<Unit> function08 = function03;
                        endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit TopActionButtons$lambda$11;
                                TopActionButtons$lambda$11 = TopActionButtonsKt.TopActionButtons$lambda$11(Modifier.this, onCloseClick, function08, function07, z9, z5, z10, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return TopActionButtons$lambda$11;
                            }
                        });
                        return;
                    }
                    return;
                }
                z4 = z;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 599187) == 599186) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (!z7) {
                }
                float f22 = m7774constructorimpl;
                if (!z7) {
                }
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                if (z5) {
                }
                z8 = false;
                Painter painterResource222 = PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6);
                String stringResource222 = StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6);
                Modifier m1563size3ABfNKs222 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f);
                startRestartGroup.startReplaceGroup(5004770);
                if ((i3 & 112) == 32) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z8) {
                }
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit TopActionButtons$lambda$10$lambda$9$lambda$8;
                        TopActionButtons$lambda$10$lambda$9$lambda$8 = TopActionButtonsKt.TopActionButtons$lambda$10$lambda$9$lambda$8(Function0.this);
                        return TopActionButtons$lambda$10$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                ImageKt.Image(painterResource222, stringResource222, ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs222, (Function0) rememberedValue, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                function07 = function06;
                function03 = function05;
                z9 = z11;
                z10 = z7;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function04 = function02;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z4 = z;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 599187) == 599186) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (!z7) {
            }
            float f222 = m7774constructorimpl;
            if (!z7) {
            }
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween22 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(spaceBetween22, centerVertically22, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
            if (z5) {
            }
            z8 = false;
            Painter painterResource2222 = PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6);
            String stringResource2222 = StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6);
            Modifier m1563size3ABfNKs2222 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f);
            startRestartGroup.startReplaceGroup(5004770);
            if ((i3 & 112) == 32) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z8) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit TopActionButtons$lambda$10$lambda$9$lambda$8;
                    TopActionButtons$lambda$10$lambda$9$lambda$8 = TopActionButtonsKt.TopActionButtons$lambda$10$lambda$9$lambda$8(Function0.this);
                    return TopActionButtons$lambda$10$lambda$9$lambda$8;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            ImageKt.Image(painterResource2222, stringResource2222, ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs2222, (Function0) rememberedValue, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            function07 = function06;
            function03 = function05;
            z9 = z11;
            z10 = z7;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function03 = function0;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function04 = function02;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z4 = z;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 599187) == 599186) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (!z7) {
        }
        float f2222 = m7774constructorimpl;
        if (!z7) {
        }
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween222 = Arrangement.INSTANCE.getSpaceBetween();
        Alignment.Vertical centerVertically222 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy222 = RowKt.rowMeasurePolicy(spaceBetween222, centerVertically222, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance222 = RowScopeInstance.INSTANCE;
        if (z5) {
        }
        z8 = false;
        Painter painterResource22222 = PainterResources_androidKt.painterResource(R.drawable.new_close_ic, startRestartGroup, 6);
        String stringResource22222 = StringResources_androidKt.stringResource(R.string.cd_close, startRestartGroup, 6);
        Modifier m1563size3ABfNKs22222 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, f);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & 112) == 32) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z8) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.TopActionButtonsKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit TopActionButtons$lambda$10$lambda$9$lambda$8;
                TopActionButtons$lambda$10$lambda$9$lambda$8 = TopActionButtonsKt.TopActionButtons$lambda$10$lambda$9$lambda$8(Function0.this);
                return TopActionButtons$lambda$10$lambda$9$lambda$8;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        ImageKt.Image(painterResource22222, stringResource22222, ClickAnimationModifierKt.clickAnimation(m1563size3ABfNKs22222, (Function0) rememberedValue, null, false, null, null, 0, 0, 0.0f, 0.0f, false, false, null, startRestartGroup, 0, 0, 4094), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        function07 = function06;
        function03 = function05;
        z9 = z11;
        z10 = z7;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionButtons$lambda$10$lambda$5$lambda$4(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionButtons$lambda$10$lambda$7$lambda$6(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TopActionButtons$lambda$10$lambda$9$lambda$8(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
