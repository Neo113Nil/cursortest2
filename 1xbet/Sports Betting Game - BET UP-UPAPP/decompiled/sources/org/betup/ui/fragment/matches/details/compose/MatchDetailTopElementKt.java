package org.betup.ui.fragment.matches.details.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
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
import org.betup.ui.common.compose.MatchLeagueItemKt;

/* compiled from: MatchDetailTopElement.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aq\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"MatchDetailTopElement", "", "modifier", "Landroidx/compose/ui/Modifier;", "onClickBack", "Lkotlin/Function0;", "label", "", "imageLabel", "onClickNotification", "isSubscribed", "", "onLeagueClick", "isOneClickBetEnabled", "onOneClickBetClick", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PreviewMatchTopElement", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MatchDetailTopElementKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailTopElement$lambda$8(Modifier modifier, Function0 function0, String str, String str2, Function0 function02, boolean z, Function0 function03, boolean z2, Function0 function04, int i, int i2, Composer composer, int i3) {
        MatchDetailTopElement(modifier, function0, str, str2, function02, z, function03, z2, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMatchTopElement$lambda$15(int i, Composer composer, int i2) {
        PreviewMatchTopElement(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MatchDetailTopElement(final Modifier modifier, final Function0<Unit> onClickBack, final String label, final String imageLabel, final Function0<Unit> onClickNotification, final boolean z, Function0<Unit> function0, final boolean z2, final Function0<Unit> onOneClickBetClick, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function02;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onClickBack, "onClickBack");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(imageLabel, "imageLabel");
        Intrinsics.checkNotNullParameter(onClickNotification, "onClickNotification");
        Intrinsics.checkNotNullParameter(onOneClickBetClick, "onOneClickBetClick");
        Composer startRestartGroup = composer.startRestartGroup(-38427684);
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
            i3 |= startRestartGroup.changedInstance(onClickBack) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(label) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(imageLabel) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(onClickNotification) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
            }
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= startRestartGroup.changedInstance(onOneClickBetClick) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if ((38347923 & i5) != 38347922 || !startRestartGroup.getSkipping()) {
            Function0<Unit> function03 = i4 != 0 ? null : function02;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-38427684, i5, -1, "org.betup.ui.fragment.matches.details.compose.MatchDetailTopElement (MatchDetailTopElement.kt:32)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Composer m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.arrow_light_left, startRestartGroup, 6);
            String stringResource = StringResources_androidKt.stringResource(R.string.cd_back, startRestartGroup, 6);
            float f = 24;
            Modifier m1563size3ABfNKs = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f));
            startRestartGroup.startReplaceGroup(5004770);
            boolean z3 = (i5 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailTopElementKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MatchDetailTopElement$lambda$7$lambda$1$lambda$0;
                        MatchDetailTopElement$lambda$7$lambda$1$lambda$0 = MatchDetailTopElementKt.MatchDetailTopElement$lambda$7$lambda$1$lambda$0(Function0.this);
                        return MatchDetailTopElement$lambda$7$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            ImageKt.Image(painterResource, stringResource, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs, false, null, null, (Function0) rememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 0, 120);
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
            Updater.m4617setimpl(m4610constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            MatchLeagueItemKt.MatchLeagueItem(null, imageLabel, label, false, false, false, function03, startRestartGroup, ((i5 >> 6) & 112) | (i5 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) | (3670016 & i5), 57);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(20)), composer2, 6);
            Painter painterResource2 = PainterResources_androidKt.painterResource(z2 ? R.drawable.flash_selected : R.drawable.flash_unselected, composer2, 0);
            String stringResource2 = StringResources_androidKt.stringResource(R.string.cd_one_click_bet, composer2, 6);
            Modifier m1563size3ABfNKs2 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(22));
            composer2.startReplaceGroup(5004770);
            boolean z4 = (i5 & 234881024) == 67108864;
            Object rememberedValue2 = composer2.rememberedValue();
            if (z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailTopElementKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MatchDetailTopElement$lambda$7$lambda$4$lambda$3;
                        MatchDetailTopElement$lambda$7$lambda$4$lambda$3 = MatchDetailTopElementKt.MatchDetailTopElement$lambda$7$lambda$4$lambda$3(Function0.this);
                        return MatchDetailTopElement$lambda$7$lambda$4$lambda$3;
                    }
                };
                composer2.updateRememberedValue(rememberedValue2);
            }
            composer2.endReplaceGroup();
            ImageKt.Image(painterResource2, stringResource2, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs2, false, null, null, (Function0) rememberedValue2, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 0, 120);
            SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(8)), composer2, 6);
            Painter painterResource3 = PainterResources_androidKt.painterResource(!z ? R.drawable.notification_new_r_icon : R.drawable.notification_new_icon, composer2, 0);
            String stringResource3 = StringResources_androidKt.stringResource(R.string.cd_notification, composer2, 6);
            Modifier m1563size3ABfNKs3 = SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(f));
            composer2.startReplaceGroup(5004770);
            boolean z5 = (i5 & 57344) == 16384;
            Object rememberedValue3 = composer2.rememberedValue();
            if (z5 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailTopElementKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MatchDetailTopElement$lambda$7$lambda$6$lambda$5;
                        MatchDetailTopElement$lambda$7$lambda$6$lambda$5 = MatchDetailTopElementKt.MatchDetailTopElement$lambda$7$lambda$6$lambda$5(Function0.this);
                        return MatchDetailTopElement$lambda$7$lambda$6$lambda$5;
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            composer2.endReplaceGroup();
            ImageKt.Image(painterResource3, stringResource3, ClickableKt.m1059clickableXHw0xAI$default(m1563size3ABfNKs3, false, null, null, (Function0) rememberedValue3, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 0, 120);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function02 = function03;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailTopElementKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MatchDetailTopElement$lambda$8;
                    MatchDetailTopElement$lambda$8 = MatchDetailTopElementKt.MatchDetailTopElement$lambda$8(Modifier.this, onClickBack, label, imageLabel, onClickNotification, z, function02, z2, onOneClickBetClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MatchDetailTopElement$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailTopElement$lambda$7$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailTopElement$lambda$7$lambda$4$lambda$3(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MatchDetailTopElement$lambda$7$lambda$6$lambda$5(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void PreviewMatchTopElement(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1885036994);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1885036994, i, -1, "org.betup.ui.fragment.matches.details.compose.PreviewMatchTopElement (MatchDetailTopElement.kt:95)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailTopElementKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailTopElementKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailTopElementKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            MatchDetailTopElement(companion, function0, "Label nsdjdjdkdkkjd", "data:image/png;base64,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", function02, true, null, true, (Function0) rememberedValue3, startRestartGroup, 115043766, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.matches.details.compose.MatchDetailTopElementKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewMatchTopElement$lambda$15;
                    PreviewMatchTopElement$lambda$15 = MatchDetailTopElementKt.PreviewMatchTopElement$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewMatchTopElement$lambda$15;
                }
            });
        }
    }
}
