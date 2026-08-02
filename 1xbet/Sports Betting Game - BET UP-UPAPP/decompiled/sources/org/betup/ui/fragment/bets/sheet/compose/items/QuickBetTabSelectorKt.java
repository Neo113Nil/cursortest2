package org.betup.ui.fragment.bets.sheet.compose.items;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.fragment.bets.sheet.compose.QuickBetDimens;
import org.betup.ui.fragment.bets.sheet.compose.QuickBetDimensKt;
import org.betup.ui.fragment.bets.sheet.compose.QuickBetScreenPreviews;
import org.betup.ui.views.ComposeUtils;

/* compiled from: QuickBetTabSelector.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001aQ\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\tH\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a"}, d2 = {"QuickBetTabSelector", "", "selectedTab", "Lorg/betup/ui/fragment/bets/sheet/compose/items/QuickBetTab;", "onTabSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "isBattleEnabled", "", "(Lorg/betup/ui/fragment/bets/sheet/compose/items/QuickBetTab;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "QuickBetTabItem", "text", "", "isSelected", "selectedBrush", "Landroidx/compose/ui/graphics/Brush;", "selectedTextColor", "Landroidx/compose/ui/graphics/Color;", "onClick", "Lkotlin/Function0;", "isEnabled", "QuickBetTabItem-hYmLsZ8", "(Ljava/lang/String;ZLandroidx/compose/ui/graphics/Brush;JLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "PreviewQuickBetTabSelector", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class QuickBetTabSelectorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewQuickBetTabSelector$lambda$10(int i, Composer composer, int i2) {
        PreviewQuickBetTabSelector(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetTabItem_hYmLsZ8$lambda$9(String str, boolean z, Brush brush, long j, Function0 function0, Modifier modifier, boolean z2, int i, int i2, Composer composer, int i3) {
        m13607QuickBetTabItemhYmLsZ8(str, z, brush, j, function0, modifier, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetTabSelector$lambda$7(QuickBetTab quickBetTab, Function1 function1, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        QuickBetTabSelector(quickBetTab, function1, modifier, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuickBetTabSelector(final QuickBetTab selectedTab, final Function1<? super QuickBetTab, Unit> onTabSelected, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean z3;
        Object rememberedValue;
        Modifier modifier3;
        boolean z4;
        Object rememberedValue2;
        boolean z5;
        Object rememberedValue3;
        final boolean z6;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Composer startRestartGroup = composer.startRestartGroup(884983468);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(selectedTab.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onTabSelected) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    boolean z7 = i4 != 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(884983468, i3, -1, "org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelector (QuickBetTabSelector.kt:45)");
                    }
                    Modifier m1516padding3ABfNKs = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), QuickBetDimens.INSTANCE.m13583getTabContainerPaddingD9Ej5fM());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs);
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
                    String stringResource = StringResources_androidKt.stringResource(R.string.quick_bet_tab_single, startRestartGroup, 6);
                    boolean z8 = selectedTab == QuickBetTab.SINGLE;
                    Brush brush = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
                    long j = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
                    startRestartGroup.startReplaceGroup(5004770);
                    int i6 = i3 & 112;
                    z3 = i6 == 32;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z3 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit QuickBetTabSelector$lambda$6$lambda$1$lambda$0;
                                QuickBetTabSelector$lambda$6$lambda$1$lambda$0 = QuickBetTabSelectorKt.QuickBetTabSelector$lambda$6$lambda$1$lambda$0(Function1.this);
                                return QuickBetTabSelector$lambda$6$lambda$1$lambda$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    modifier3 = modifier4;
                    m13607QuickBetTabItemhYmLsZ8(stringResource, z8, brush, j, (Function0) rememberedValue, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, startRestartGroup, 0, 64);
                    String stringResource2 = StringResources_androidKt.stringResource(R.string.multi_bet, startRestartGroup, 6);
                    boolean z9 = selectedTab == QuickBetTab.MULTI;
                    SolidColor solidColor = new SolidColor(ComposeUtils.AppColorPalette.Blue.INSTANCE.getColor(), null);
                    long j2 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                    startRestartGroup.startReplaceGroup(5004770);
                    z4 = i6 == 32;
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!z4 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit QuickBetTabSelector$lambda$6$lambda$3$lambda$2;
                                QuickBetTabSelector$lambda$6$lambda$3$lambda$2 = QuickBetTabSelectorKt.QuickBetTabSelector$lambda$6$lambda$3$lambda$2(Function1.this);
                                return QuickBetTabSelector$lambda$6$lambda$3$lambda$2;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    m13607QuickBetTabItemhYmLsZ8(stringResource2, z9, solidColor, j2, (Function0) rememberedValue2, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, startRestartGroup, 0, 64);
                    String stringResource3 = StringResources_androidKt.stringResource(R.string.battle, startRestartGroup, 6);
                    boolean z10 = selectedTab == QuickBetTab.BATTLE;
                    SolidColor solidColor2 = new SolidColor(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), null);
                    long j3 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                    startRestartGroup.startReplaceGroup(5004770);
                    z5 = i6 == 32;
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!z5 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit QuickBetTabSelector$lambda$6$lambda$5$lambda$4;
                                QuickBetTabSelector$lambda$6$lambda$5$lambda$4 = QuickBetTabSelectorKt.QuickBetTabSelector$lambda$6$lambda$5$lambda$4(Function1.this);
                                return QuickBetTabSelector$lambda$6$lambda$5$lambda$4;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    m13607QuickBetTabItemhYmLsZ8(stringResource3, z10, solidColor2, j3, (Function0) rememberedValue3, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), z7, startRestartGroup, (i3 << 9) & 3670016, 0);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z6 = z7;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z6 = z2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier5 = modifier3;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit QuickBetTabSelector$lambda$7;
                            QuickBetTabSelector$lambda$7 = QuickBetTabSelectorKt.QuickBetTabSelector$lambda$7(QuickBetTab.this, onTabSelected, modifier5, z6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return QuickBetTabSelector$lambda$7;
                        }
                    });
                    return;
                }
                return;
            }
            z2 = z;
            if ((i3 & 1171) == 1170) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier m1516padding3ABfNKs2 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), QuickBetDimens.INSTANCE.m13583getTabContainerPaddingD9Ej5fM());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            String stringResource4 = StringResources_androidKt.stringResource(R.string.quick_bet_tab_single, startRestartGroup, 6);
            if (selectedTab == QuickBetTab.SINGLE) {
            }
            Brush brush2 = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
            long j4 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
            startRestartGroup.startReplaceGroup(5004770);
            int i62 = i3 & 112;
            if (i62 == 32) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z3) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit QuickBetTabSelector$lambda$6$lambda$1$lambda$0;
                    QuickBetTabSelector$lambda$6$lambda$1$lambda$0 = QuickBetTabSelectorKt.QuickBetTabSelector$lambda$6$lambda$1$lambda$0(Function1.this);
                    return QuickBetTabSelector$lambda$6$lambda$1$lambda$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            modifier3 = modifier4;
            m13607QuickBetTabItemhYmLsZ8(stringResource4, z8, brush2, j4, (Function0) rememberedValue, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), false, startRestartGroup, 0, 64);
            String stringResource22 = StringResources_androidKt.stringResource(R.string.multi_bet, startRestartGroup, 6);
            if (selectedTab == QuickBetTab.MULTI) {
            }
            SolidColor solidColor3 = new SolidColor(ComposeUtils.AppColorPalette.Blue.INSTANCE.getColor(), null);
            long j22 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
            startRestartGroup.startReplaceGroup(5004770);
            if (i62 == 32) {
            }
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit QuickBetTabSelector$lambda$6$lambda$3$lambda$2;
                    QuickBetTabSelector$lambda$6$lambda$3$lambda$2 = QuickBetTabSelectorKt.QuickBetTabSelector$lambda$6$lambda$3$lambda$2(Function1.this);
                    return QuickBetTabSelector$lambda$6$lambda$3$lambda$2;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
            startRestartGroup.endReplaceGroup();
            m13607QuickBetTabItemhYmLsZ8(stringResource22, z9, solidColor3, j22, (Function0) rememberedValue2, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), false, startRestartGroup, 0, 64);
            String stringResource32 = StringResources_androidKt.stringResource(R.string.battle, startRestartGroup, 6);
            if (selectedTab == QuickBetTab.BATTLE) {
            }
            SolidColor solidColor22 = new SolidColor(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), null);
            long j32 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
            startRestartGroup.startReplaceGroup(5004770);
            if (i62 == 32) {
            }
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!z5) {
            }
            rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit QuickBetTabSelector$lambda$6$lambda$5$lambda$4;
                    QuickBetTabSelector$lambda$6$lambda$5$lambda$4 = QuickBetTabSelectorKt.QuickBetTabSelector$lambda$6$lambda$5$lambda$4(Function1.this);
                    return QuickBetTabSelector$lambda$6$lambda$5$lambda$4;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            m13607QuickBetTabItemhYmLsZ8(stringResource32, z10, solidColor22, j32, (Function0) rememberedValue3, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), z7, startRestartGroup, (i3 << 9) & 3670016, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            z6 = z7;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i3 & 1171) == 1170) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier m1516padding3ABfNKs22 = PaddingKt.m1516padding3ABfNKs(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), ComposeUtils.AppColorPalette.Black.INSTANCE.getColor(), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100))), QuickBetDimens.INSTANCE.m13583getTabContainerPaddingD9Ej5fM());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1516padding3ABfNKs22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
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
        String stringResource42 = StringResources_androidKt.stringResource(R.string.quick_bet_tab_single, startRestartGroup, 6);
        if (selectedTab == QuickBetTab.SINGLE) {
        }
        Brush brush22 = ComposeUtils.AppBrushPalette.ButtonBackgroundGold.INSTANCE.getBrush();
        long j42 = ComposeUtils.AppColorPalette.Black.INSTANCE.getColor();
        startRestartGroup.startReplaceGroup(5004770);
        int i622 = i3 & 112;
        if (i622 == 32) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z3) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit QuickBetTabSelector$lambda$6$lambda$1$lambda$0;
                QuickBetTabSelector$lambda$6$lambda$1$lambda$0 = QuickBetTabSelectorKt.QuickBetTabSelector$lambda$6$lambda$1$lambda$0(Function1.this);
                return QuickBetTabSelector$lambda$6$lambda$1$lambda$0;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        modifier3 = modifier4;
        m13607QuickBetTabItemhYmLsZ8(stringResource42, z8, brush22, j42, (Function0) rememberedValue, RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), false, startRestartGroup, 0, 64);
        String stringResource222 = StringResources_androidKt.stringResource(R.string.multi_bet, startRestartGroup, 6);
        if (selectedTab == QuickBetTab.MULTI) {
        }
        SolidColor solidColor32 = new SolidColor(ComposeUtils.AppColorPalette.Blue.INSTANCE.getColor(), null);
        long j222 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
        startRestartGroup.startReplaceGroup(5004770);
        if (i622 == 32) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue2 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit QuickBetTabSelector$lambda$6$lambda$3$lambda$2;
                QuickBetTabSelector$lambda$6$lambda$3$lambda$2 = QuickBetTabSelectorKt.QuickBetTabSelector$lambda$6$lambda$3$lambda$2(Function1.this);
                return QuickBetTabSelector$lambda$6$lambda$3$lambda$2;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        m13607QuickBetTabItemhYmLsZ8(stringResource222, z9, solidColor32, j222, (Function0) rememberedValue2, RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), false, startRestartGroup, 0, 64);
        String stringResource322 = StringResources_androidKt.stringResource(R.string.battle, startRestartGroup, 6);
        if (selectedTab == QuickBetTab.BATTLE) {
        }
        SolidColor solidColor222 = new SolidColor(ComposeUtils.AppColorPalette.Green.INSTANCE.getColor(), null);
        long j322 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
        startRestartGroup.startReplaceGroup(5004770);
        if (i622 == 32) {
        }
        rememberedValue3 = startRestartGroup.rememberedValue();
        if (!z5) {
        }
        rememberedValue3 = new Function0() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit QuickBetTabSelector$lambda$6$lambda$5$lambda$4;
                QuickBetTabSelector$lambda$6$lambda$5$lambda$4 = QuickBetTabSelectorKt.QuickBetTabSelector$lambda$6$lambda$5$lambda$4(Function1.this);
                return QuickBetTabSelector$lambda$6$lambda$5$lambda$4;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue3);
        startRestartGroup.endReplaceGroup();
        m13607QuickBetTabItemhYmLsZ8(stringResource322, z10, solidColor222, j322, (Function0) rememberedValue3, RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), z7, startRestartGroup, (i3 << 9) & 3670016, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        z6 = z7;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetTabSelector$lambda$6$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(QuickBetTab.SINGLE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetTabSelector$lambda$6$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(QuickBetTab.MULTI);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickBetTabSelector$lambda$6$lambda$5$lambda$4(Function1 function1) {
        function1.invoke(QuickBetTab.BATTLE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0081  */
    /* renamed from: QuickBetTabItem-hYmLsZ8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m13607QuickBetTabItemhYmLsZ8(final String str, final boolean z, final Brush brush, final long j, final Function0<Unit> function0, Modifier modifier, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        long j2;
        int i4;
        Modifier modifier2;
        int i5;
        boolean z3;
        Modifier modifier3;
        Modifier.Companion companion;
        long j3;
        long j4;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(550534196);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i3 |= startRestartGroup.changed(brush) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                j2 = j;
                i3 |= startRestartGroup.changed(j2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
                    i4 = i2 & 32;
                    if (i4 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((196608 & i) == 0) {
                        modifier2 = modifier;
                        i3 |= startRestartGroup.changed(modifier2) ? 131072 : 65536;
                        i5 = i2 & 64;
                        if (i5 != 0) {
                            i3 |= 1572864;
                        } else if ((1572864 & i) == 0) {
                            z3 = z2;
                            i3 |= startRestartGroup.changed(z3) ? 1048576 : 524288;
                            if ((599187 & i3) == 599186 || !startRestartGroup.getSkipping()) {
                                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                                boolean z4 = i5 == 0 ? true : z3;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(550534196, i3, -1, "org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabItem (QuickBetTabSelector.kt:92)");
                                }
                                RoundedCornerShape m1810RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                                if (!z) {
                                    RoundedCornerShape roundedCornerShape = m1810RoundedCornerShape0680j_4;
                                    modifier3 = modifier4;
                                    companion = BackgroundKt.background$default(Modifier.INSTANCE, brush, roundedCornerShape, 0.0f, 4, null);
                                } else {
                                    modifier3 = modifier4;
                                    companion = Modifier.INSTANCE;
                                }
                                if (z) {
                                    if (!z4) {
                                        j3 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
                                    } else {
                                        j3 = ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor();
                                    }
                                    j4 = j3;
                                } else {
                                    j4 = j2;
                                }
                                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(ClickAnimationModifierKt.subtleClickAnimation(modifier3.then(companion), function0, null, (z4 || z) ? false : true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i3 >> 9) & 112, 0, 1018), 0.0f, QuickBetDimens.INSTANCE.m13585getTabVerticalPaddingD9Ej5fM(), 1, null);
                                Alignment center = Alignment.INSTANCE.getCenter();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Modifier modifier5 = modifier3;
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
                                long m13584getTabFontSizeXSAIIZE = QuickBetDimens.INSTANCE.m13584getTabFontSizeXSAIIZE();
                                FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                                FontWeight.Companion companion2 = FontWeight.INSTANCE;
                                TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j4, m13584getTabFontSizeXSAIIZE, !z ? companion2.getBold() : companion2.getMedium(), (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, i3 & 14, 3120, 55294);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                startRestartGroup.endNode();
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z3 = z4;
                                modifier2 = modifier5;
                            } else {
                                startRestartGroup.skipToGroupEnd();
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Modifier modifier6 = modifier2;
                                final boolean z5 = z3;
                                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        Unit QuickBetTabItem_hYmLsZ8$lambda$9;
                                        QuickBetTabItem_hYmLsZ8$lambda$9 = QuickBetTabSelectorKt.QuickBetTabItem_hYmLsZ8$lambda$9(str, z, brush, j, function0, modifier6, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                        return QuickBetTabItem_hYmLsZ8$lambda$9;
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        z3 = z2;
                        if ((599187 & i3) == 599186) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        RoundedCornerShape m1810RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                        if (!z) {
                        }
                        if (z) {
                        }
                        Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(ClickAnimationModifierKt.subtleClickAnimation(modifier3.then(companion), function0, null, (z4 || z) ? false : true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i3 >> 9) & 112, 0, 1018), 0.0f, QuickBetDimens.INSTANCE.m13585getTabVerticalPaddingD9Ej5fM(), 1, null);
                        Alignment center2 = Alignment.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        Modifier modifier52 = modifier3;
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                        }
                        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m4610constructorimpl.getInserting()) {
                        }
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        long m13584getTabFontSizeXSAIIZE2 = QuickBetDimens.INSTANCE.m13584getTabFontSizeXSAIIZE();
                        FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                        FontWeight.Companion companion22 = FontWeight.INSTANCE;
                        TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j4, m13584getTabFontSizeXSAIIZE2, !z ? companion22.getBold() : companion22.getMedium(), (FontStyle) null, (FontSynthesis) null, sfProFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, i3 & 14, 3120, 55294);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z3 = z4;
                        modifier2 = modifier52;
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    modifier2 = modifier;
                    i5 = i2 & 64;
                    if (i5 != 0) {
                    }
                    z3 = z2;
                    if ((599187 & i3) == 599186) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    RoundedCornerShape m1810RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                    if (!z) {
                    }
                    if (z) {
                    }
                    Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(ClickAnimationModifierKt.subtleClickAnimation(modifier3.then(companion), function0, null, (z4 || z) ? false : true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i3 >> 9) & 112, 0, 1018), 0.0f, QuickBetDimens.INSTANCE.m13585getTabVerticalPaddingD9Ej5fM(), 1, null);
                    Alignment center22 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(center22, false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    Modifier modifier522 = modifier3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (!startRestartGroup.getInserting()) {
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting()) {
                    }
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                    long m13584getTabFontSizeXSAIIZE22 = QuickBetDimens.INSTANCE.m13584getTabFontSizeXSAIIZE();
                    FontFamily sfProFontFamily22 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                    FontWeight.Companion companion222 = FontWeight.INSTANCE;
                    TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j4, m13584getTabFontSizeXSAIIZE22, !z ? companion222.getBold() : companion222.getMedium(), (FontStyle) null, (FontSynthesis) null, sfProFontFamily22, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, i3 & 14, 3120, 55294);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z3 = z4;
                    modifier2 = modifier522;
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i4 = i2 & 32;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                i5 = i2 & 64;
                if (i5 != 0) {
                }
                z3 = z2;
                if ((599187 & i3) == 599186) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                RoundedCornerShape m1810RoundedCornerShape0680j_4222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
                if (!z) {
                }
                if (z) {
                }
                Modifier m1518paddingVpY3zN4$default222 = PaddingKt.m1518paddingVpY3zN4$default(ClickAnimationModifierKt.subtleClickAnimation(modifier3.then(companion), function0, null, (z4 || z) ? false : true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i3 >> 9) & 112, 0, 1018), 0.0f, QuickBetDimens.INSTANCE.m13585getTabVerticalPaddingD9Ej5fM(), 1, null);
                Alignment center222 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy222 = BoxKt.maybeCachedBoxMeasurePolicy(center222, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default222);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                Modifier modifier5222 = modifier3;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl.getInserting()) {
                }
                m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance222 = BoxScopeInstance.INSTANCE;
                long m13584getTabFontSizeXSAIIZE222 = QuickBetDimens.INSTANCE.m13584getTabFontSizeXSAIIZE();
                FontFamily sfProFontFamily222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                FontWeight.Companion companion2222 = FontWeight.INSTANCE;
                TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j4, m13584getTabFontSizeXSAIIZE222, !z ? companion2222.getBold() : companion2222.getMedium(), (FontStyle) null, (FontSynthesis) null, sfProFontFamily222, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, i3 & 14, 3120, 55294);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                z3 = z4;
                modifier2 = modifier5222;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            j2 = j;
            if ((i2 & 16) != 0) {
            }
            i4 = i2 & 32;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            z3 = z2;
            if ((599187 & i3) == 599186) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape m1810RoundedCornerShape0680j_42222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
            if (!z) {
            }
            if (z) {
            }
            Modifier m1518paddingVpY3zN4$default2222 = PaddingKt.m1518paddingVpY3zN4$default(ClickAnimationModifierKt.subtleClickAnimation(modifier3.then(companion), function0, null, (z4 || z) ? false : true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i3 >> 9) & 112, 0, 1018), 0.0f, QuickBetDimens.INSTANCE.m13585getTabVerticalPaddingD9Ej5fM(), 1, null);
            Alignment center2222 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2222 = BoxKt.maybeCachedBoxMeasurePolicy(center2222, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2222 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default2222);
            Function0<ComposeUiNode> constructor2222 = ComposeUiNode.INSTANCE.getConstructor();
            Modifier modifier52222 = modifier3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy2222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2222);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier2222, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2222 = BoxScopeInstance.INSTANCE;
            long m13584getTabFontSizeXSAIIZE2222 = QuickBetDimens.INSTANCE.m13584getTabFontSizeXSAIIZE();
            FontFamily sfProFontFamily2222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
            FontWeight.Companion companion22222 = FontWeight.INSTANCE;
            TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j4, m13584getTabFontSizeXSAIIZE2222, !z ? companion22222.getBold() : companion22222.getMedium(), (FontStyle) null, (FontSynthesis) null, sfProFontFamily2222, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, i3 & 14, 3120, 55294);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            z3 = z4;
            modifier2 = modifier52222;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        if ((i2 & 8) == 0) {
        }
        j2 = j;
        if ((i2 & 16) != 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        z3 = z2;
        if ((599187 & i3) == 599186) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        RoundedCornerShape m1810RoundedCornerShape0680j_422222 = RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(100));
        if (!z) {
        }
        if (z) {
        }
        Modifier m1518paddingVpY3zN4$default22222 = PaddingKt.m1518paddingVpY3zN4$default(ClickAnimationModifierKt.subtleClickAnimation(modifier3.then(companion), function0, null, (z4 || z) ? false : true, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, (i3 >> 9) & 112, 0, 1018), 0.0f, QuickBetDimens.INSTANCE.m13585getTabVerticalPaddingD9Ej5fM(), 1, null);
        Alignment center22222 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22222 = BoxKt.maybeCachedBoxMeasurePolicy(center22222, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22222 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default22222);
        Function0<ComposeUiNode> constructor22222 = ComposeUiNode.INSTANCE.getConstructor();
        Modifier modifier522222 = modifier3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy22222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22222);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22222 = BoxScopeInstance.INSTANCE;
        long m13584getTabFontSizeXSAIIZE22222 = QuickBetDimens.INSTANCE.m13584getTabFontSizeXSAIIZE();
        FontFamily sfProFontFamily22222 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
        FontWeight.Companion companion222222 = FontWeight.INSTANCE;
        TextKt.m2642Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j4, m13584getTabFontSizeXSAIIZE22222, !z ? companion222222.getBold() : companion222222.getMedium(), (FontStyle) null, (FontSynthesis) null, sfProFontFamily22222, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m7658getCentere0LSkKk(), 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16744408, (DefaultConstructorMarker) null), startRestartGroup, i3 & 14, 3120, 55294);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        z3 = z4;
        modifier2 = modifier522222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    @QuickBetScreenPreviews
    private static final void PreviewQuickBetTabSelector(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1557712631);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1557712631, i, -1, "org.betup.ui.fragment.bets.sheet.compose.items.PreviewQuickBetTabSelector (QuickBetTabSelector.kt:132)");
            }
            QuickBetDimensKt.QuickBetProportionalScale(ComposableSingletons$QuickBetTabSelectorKt.INSTANCE.getLambda$699551437$app_release(), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.bets.sheet.compose.items.QuickBetTabSelectorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewQuickBetTabSelector$lambda$10;
                    PreviewQuickBetTabSelector$lambda$10 = QuickBetTabSelectorKt.PreviewQuickBetTabSelector$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewQuickBetTabSelector$lambda$10;
                }
            });
        }
    }
}
