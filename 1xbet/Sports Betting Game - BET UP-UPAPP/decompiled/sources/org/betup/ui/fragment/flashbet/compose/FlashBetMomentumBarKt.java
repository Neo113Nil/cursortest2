package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.ironsource.InterfaceC3497ge;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: FlashBetMomentumBar.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\bX\u008a\u0084\u0002²\u0006\n\u0010\u0010\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"PossessionGold", "Landroidx/compose/ui/graphics/Color;", "J", "PossessionGoldBright", "PossessionAwayOrange", "FlashBetMomentumBar", "", "homePercent", "", "momentum", "", "modifier", "Landroidx/compose/ui/Modifier;", "(IFLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release", "animatedHome", "animatedMomentum"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetMomentumBarKt {
    private static final long PossessionGold = ColorKt.Color(4294093115L);
    private static final long PossessionGoldBright = ColorKt.Color(4294363986L);
    private static final long PossessionAwayOrange = ColorKt.Color(4294937131L);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetMomentumBar$lambda$4(int i, float f, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        FlashBetMomentumBar(i, f, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetMomentumBar(final int i, float f, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        float f2;
        int i5;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(-1592204265);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            f2 = f;
            i4 |= startRestartGroup.changed(f2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                modifier2 = modifier;
                i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
                if ((i4 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                    float f3 = i6 != 0 ? 0.0f : f2;
                    Modifier modifier4 = i5 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1592204265, i4, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetMomentumBar (FlashBetMomentumBar.kt:48)");
                    }
                    final State<Integer> animateIntAsState = AnimateAsStateKt.animateIntAsState(RangesKt.coerceIn(i, 0, 100), AnimationSpecKt.tween$default(InterfaceC3497ge.c.d, 0, null, 6, null), "flashBetPossessionGeneral", null, startRestartGroup, 432, 8);
                    float f4 = f3;
                    Modifier modifier5 = modifier4;
                    State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(RangesKt.coerceIn(f3, -95.0f, 95.0f), AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, "flashBetPossessionMomentum", null, startRestartGroup, 3120, 20);
                    int coerceIn = RangesKt.coerceIn(100 - FlashBetMomentumBar$lambda$0(animateIntAsState), 0, 100);
                    float FlashBetMomentumBar$lambda$1 = FlashBetMomentumBar$lambda$1(animateFloatAsState) > 0.0f ? FlashBetMomentumBar$lambda$1(animateFloatAsState) / 2.0f : 0.0f;
                    float f5 = FlashBetMomentumBar$lambda$1(animateFloatAsState) < 0.0f ? (-FlashBetMomentumBar$lambda$1(animateFloatAsState)) / 2.0f : 0.0f;
                    FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                    long m5167copywmQWz5c$default = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
                    long m5167copywmQWz5c$default2 = Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
                    m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
                    Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    final float f6 = FlashBetMomentumBar$lambda$1;
                    final float f7 = f5;
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_possession_percent, new Object[]{Integer.valueOf(FlashBetMomentumBar$lambda$0(animateIntAsState))}, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), m5167copywmQWz5c$default2, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), sfProFontFamily, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 130960);
                    String upperCase = StringResources_androidKt.stringResource(R.string.flash_bet_ball_possession, startRestartGroup, 6).toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    TextKt.m2642Text4IGK_g(upperCase, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.2f, false, 2, null), m5167copywmQWz5c$default, TextUnitKt.getSp(8), (FontStyle) null, FontWeight.INSTANCE.getMedium(), sfProFontFamily, TextUnitKt.getSp(1.8d), (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 12782592, 0, 130320);
                    TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_possession_percent, new Object[]{Integer.valueOf(coerceIn)}, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), m5167copywmQWz5c$default2, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), sfProFontFamily, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 130448);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
                    BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(6)), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(999))), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), null, false, ComposableLambdaKt.rememberComposableLambda(-1510322741, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMomentumBarKt$FlashBetMomentumBar$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                            invoke(boxWithConstraintsScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i7) {
                            int i8;
                            int FlashBetMomentumBar$lambda$0;
                            long j;
                            long j2;
                            long j3;
                            long j4;
                            long j5;
                            long j6;
                            long j7;
                            long j8;
                            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                            if ((i7 & 6) == 0) {
                                i8 = i7 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                            } else {
                                i8 = i7;
                            }
                            if ((i8 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1510322741, i8, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetMomentumBar.<anonymous>.<anonymous> (FlashBetMomentumBar.kt:107)");
                            }
                            float mo1423getMaxWidthD9Ej5fM = BoxWithConstraints.mo1423getMaxWidthD9Ej5fM();
                            FlashBetMomentumBar$lambda$0 = FlashBetMomentumBarKt.FlashBetMomentumBar$lambda$0(animateIntAsState);
                            float m7774constructorimpl = Dp.m7774constructorimpl(mo1423getMaxWidthD9Ej5fM * (FlashBetMomentumBar$lambda$0 / 100.0f));
                            float f8 = 2;
                            float m7774constructorimpl2 = Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() / f8);
                            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), 0.0f, 1, null);
                            j = FlashBetMomentumBarKt.PossessionGold;
                            BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(fillMaxHeight$default, Color.m5167copywmQWz5c$default(j, 0.28f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer2, 0);
                            float f9 = 1;
                            BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(f9)), 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.22f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer2, 0);
                            composer2.startReplaceGroup(278811111);
                            if (f7 > 0.0f) {
                                float m7774constructorimpl3 = Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() * (f7 / 100.0f));
                                Modifier fillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), Dp.m7774constructorimpl(m7774constructorimpl2 - m7774constructorimpl3), 0.0f, 2, null), m7774constructorimpl3), 0.0f, 1, null);
                                Brush.Companion companion = Brush.INSTANCE;
                                j7 = FlashBetMomentumBarKt.PossessionAwayOrange;
                                j8 = FlashBetMomentumBarKt.PossessionAwayOrange;
                                BoxKt.Box(BackgroundKt.background$default(fillMaxHeight$default2, Brush.Companion.m5117horizontalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(j7), Color.m5158boximpl(Color.m5167copywmQWz5c$default(j8, 0.45f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer2, 0);
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(278834932);
                            if (f6 > 0.0f) {
                                Modifier fillMaxHeight$default3 = SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), m7774constructorimpl2, 0.0f, 2, null), Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() * (f6 / 100.0f))), 0.0f, 1, null);
                                Brush.Companion companion2 = Brush.INSTANCE;
                                j5 = FlashBetMomentumBarKt.PossessionGoldBright;
                                j6 = FlashBetMomentumBarKt.PossessionGoldBright;
                                BoxKt.Box(BackgroundKt.background$default(fillMaxHeight$default3, Brush.Companion.m5117horizontalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(j5, 0.45f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(j6)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer2, 0);
                            }
                            composer2.endReplaceGroup();
                            Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), Dp.m7774constructorimpl(m7774constructorimpl - Dp.m7774constructorimpl(f9)), 0.0f, 2, null), Dp.m7774constructorimpl(f8)), Dp.m7774constructorimpl(8));
                            float m7774constructorimpl4 = Dp.m7774constructorimpl(6);
                            j2 = FlashBetMomentumBarKt.PossessionGold;
                            long m5167copywmQWz5c$default3 = Color.m5167copywmQWz5c$default(j2, 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                            j3 = FlashBetMomentumBarKt.PossessionGold;
                            Modifier m4803shadows4CzXII$default = ShadowKt.m4803shadows4CzXII$default(m1549height3ABfNKs, m7774constructorimpl4, null, false, Color.m5167copywmQWz5c$default(j3, 0.35f, 0.0f, 0.0f, 0.0f, 14, null), m5167copywmQWz5c$default3, 6, null);
                            j4 = FlashBetMomentumBarKt.PossessionGold;
                            BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(m4803shadows4CzXII$default, j4, null, 2, null), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, 3072, 6);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f2 = f4;
                    modifier3 = modifier5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final float f8 = f2;
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMomentumBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit FlashBetMomentumBar$lambda$4;
                            FlashBetMomentumBar$lambda$4 = FlashBetMomentumBarKt.FlashBetMomentumBar$lambda$4(i, f8, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return FlashBetMomentumBar$lambda$4;
                        }
                    });
                    return;
                }
                return;
            }
            modifier2 = modifier;
            if ((i4 & Opcodes.I2S) == 146) {
            }
            if (i6 != 0) {
            }
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final State<Integer> animateIntAsState2 = AnimateAsStateKt.animateIntAsState(RangesKt.coerceIn(i, 0, 100), AnimationSpecKt.tween$default(InterfaceC3497ge.c.d, 0, null, 6, null), "flashBetPossessionGeneral", null, startRestartGroup, 432, 8);
            float f42 = f3;
            Modifier modifier52 = modifier4;
            State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(RangesKt.coerceIn(f3, -95.0f, 95.0f), AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, "flashBetPossessionMomentum", null, startRestartGroup, 3120, 20);
            int coerceIn2 = RangesKt.coerceIn(100 - FlashBetMomentumBar$lambda$0(animateIntAsState2), 0, 100);
            if (FlashBetMomentumBar$lambda$1(animateFloatAsState2) > 0.0f) {
            }
            if (FlashBetMomentumBar$lambda$1(animateFloatAsState2) < 0.0f) {
            }
            FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
            long m5167copywmQWz5c$default3 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
            long m5167copywmQWz5c$default22 = Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
            Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier52, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default22);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl2.getInserting()) {
            }
            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            final float f62 = FlashBetMomentumBar$lambda$1;
            final float f72 = f5;
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_possession_percent, new Object[]{Integer.valueOf(FlashBetMomentumBar$lambda$0(animateIntAsState2))}, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), m5167copywmQWz5c$default22, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), sfProFontFamily2, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 130960);
            String upperCase2 = StringResources_androidKt.stringResource(R.string.flash_bet_ball_possession, startRestartGroup, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            TextKt.m2642Text4IGK_g(upperCase2, RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.2f, false, 2, null), m5167copywmQWz5c$default3, TextUnitKt.getSp(8), (FontStyle) null, FontWeight.INSTANCE.getMedium(), sfProFontFamily2, TextUnitKt.getSp(1.8d), (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 12782592, 0, 130320);
            TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_possession_percent, new Object[]{Integer.valueOf(coerceIn2)}, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), m5167copywmQWz5c$default22, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), sfProFontFamily2, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 130448);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
            BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(6)), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(999))), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), null, false, ComposableLambdaKt.rememberComposableLambda(-1510322741, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMomentumBarKt$FlashBetMomentumBar$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                    invoke(boxWithConstraintsScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i7) {
                    int i8;
                    int FlashBetMomentumBar$lambda$0;
                    long j;
                    long j2;
                    long j3;
                    long j4;
                    long j5;
                    long j6;
                    long j7;
                    long j8;
                    Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                    if ((i7 & 6) == 0) {
                        i8 = i7 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                    } else {
                        i8 = i7;
                    }
                    if ((i8 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1510322741, i8, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetMomentumBar.<anonymous>.<anonymous> (FlashBetMomentumBar.kt:107)");
                    }
                    float mo1423getMaxWidthD9Ej5fM = BoxWithConstraints.mo1423getMaxWidthD9Ej5fM();
                    FlashBetMomentumBar$lambda$0 = FlashBetMomentumBarKt.FlashBetMomentumBar$lambda$0(animateIntAsState2);
                    float m7774constructorimpl = Dp.m7774constructorimpl(mo1423getMaxWidthD9Ej5fM * (FlashBetMomentumBar$lambda$0 / 100.0f));
                    float f82 = 2;
                    float m7774constructorimpl2 = Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() / f82);
                    Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), 0.0f, 1, null);
                    j = FlashBetMomentumBarKt.PossessionGold;
                    BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(fillMaxHeight$default, Color.m5167copywmQWz5c$default(j, 0.28f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer2, 0);
                    float f9 = 1;
                    BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(f9)), 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.22f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer2, 0);
                    composer2.startReplaceGroup(278811111);
                    if (f72 > 0.0f) {
                        float m7774constructorimpl3 = Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() * (f72 / 100.0f));
                        Modifier fillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), Dp.m7774constructorimpl(m7774constructorimpl2 - m7774constructorimpl3), 0.0f, 2, null), m7774constructorimpl3), 0.0f, 1, null);
                        Brush.Companion companion = Brush.INSTANCE;
                        j7 = FlashBetMomentumBarKt.PossessionAwayOrange;
                        j8 = FlashBetMomentumBarKt.PossessionAwayOrange;
                        BoxKt.Box(BackgroundKt.background$default(fillMaxHeight$default2, Brush.Companion.m5117horizontalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(j7), Color.m5158boximpl(Color.m5167copywmQWz5c$default(j8, 0.45f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(278834932);
                    if (f62 > 0.0f) {
                        Modifier fillMaxHeight$default3 = SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), m7774constructorimpl2, 0.0f, 2, null), Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() * (f62 / 100.0f))), 0.0f, 1, null);
                        Brush.Companion companion2 = Brush.INSTANCE;
                        j5 = FlashBetMomentumBarKt.PossessionGoldBright;
                        j6 = FlashBetMomentumBarKt.PossessionGoldBright;
                        BoxKt.Box(BackgroundKt.background$default(fillMaxHeight$default3, Brush.Companion.m5117horizontalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(j5, 0.45f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(j6)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer2, 0);
                    }
                    composer2.endReplaceGroup();
                    Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), Dp.m7774constructorimpl(m7774constructorimpl - Dp.m7774constructorimpl(f9)), 0.0f, 2, null), Dp.m7774constructorimpl(f82)), Dp.m7774constructorimpl(8));
                    float m7774constructorimpl4 = Dp.m7774constructorimpl(6);
                    j2 = FlashBetMomentumBarKt.PossessionGold;
                    long m5167copywmQWz5c$default32 = Color.m5167copywmQWz5c$default(j2, 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                    j3 = FlashBetMomentumBarKt.PossessionGold;
                    Modifier m4803shadows4CzXII$default = ShadowKt.m4803shadows4CzXII$default(m1549height3ABfNKs, m7774constructorimpl4, null, false, Color.m5167copywmQWz5c$default(j3, 0.35f, 0.0f, 0.0f, 0.0f, 14, null), m5167copywmQWz5c$default32, 6, null);
                    j4 = FlashBetMomentumBarKt.PossessionGold;
                    BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(m4803shadows4CzXII$default, j4, null, 2, null), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 6);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
            }
            f2 = f42;
            modifier3 = modifier52;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        f2 = f;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i4 & Opcodes.I2S) == 146) {
        }
        if (i6 != 0) {
        }
        if (i5 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        final State<Integer> animateIntAsState22 = AnimateAsStateKt.animateIntAsState(RangesKt.coerceIn(i, 0, 100), AnimationSpecKt.tween$default(InterfaceC3497ge.c.d, 0, null, 6, null), "flashBetPossessionGeneral", null, startRestartGroup, 432, 8);
        float f422 = f3;
        Modifier modifier522 = modifier4;
        State<Float> animateFloatAsState22 = AnimateAsStateKt.animateFloatAsState(RangesKt.coerceIn(f3, -95.0f, 95.0f), AnimationSpecKt.tween$default(500, 0, null, 6, null), 0.0f, "flashBetPossessionMomentum", null, startRestartGroup, 3120, 20);
        int coerceIn22 = RangesKt.coerceIn(100 - FlashBetMomentumBar$lambda$0(animateIntAsState22), 0, 100);
        if (FlashBetMomentumBar$lambda$1(animateFloatAsState22) > 0.0f) {
        }
        if (FlashBetMomentumBar$lambda$1(animateFloatAsState22) < 0.0f) {
        }
        FontFamily sfProFontFamily22 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
        long m5167copywmQWz5c$default32 = Color.m5167copywmQWz5c$default(ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
        long m5167copywmQWz5c$default222 = Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.85f, 0.0f, 0.0f, 0.0f, 14, null);
        Modifier fillMaxWidth$default32 = SizeKt.fillMaxWidth$default(modifier522, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap32 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier32 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default32);
        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash32 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash32);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        Modifier fillMaxWidth$default222 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Vertical centerVertically22 = Alignment.INSTANCE.getCenterVertically();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy22 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically22, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default222);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, rowMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance22 = RowScopeInstance.INSTANCE;
        final float f622 = FlashBetMomentumBar$lambda$1;
        final float f722 = f5;
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_possession_percent, new Object[]{Integer.valueOf(FlashBetMomentumBar$lambda$0(animateIntAsState22))}, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), m5167copywmQWz5c$default222, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), sfProFontFamily22, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 130960);
        String upperCase22 = StringResources_androidKt.stringResource(R.string.flash_bet_ball_possession, startRestartGroup, 6).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase22, "toUpperCase(...)");
        TextKt.m2642Text4IGK_g(upperCase22, RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.2f, false, 2, null), m5167copywmQWz5c$default32, TextUnitKt.getSp(8), (FontStyle) null, FontWeight.INSTANCE.getMedium(), sfProFontFamily22, TextUnitKt.getSp(1.8d), (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7658getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 12782592, 0, 130320);
        TextKt.m2642Text4IGK_g(StringResources_androidKt.stringResource(R.string.flash_bet_possession_percent, new Object[]{Integer.valueOf(coerceIn22)}, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance22, Modifier.INSTANCE, 1.0f, false, 2, null), m5167copywmQWz5c$default222, TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), sfProFontFamily22, 0L, (TextDecoration) null, TextAlign.m7651boximpl(TextAlign.INSTANCE.m7659getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 0, 130448);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.Spacer(SizeKt.m1549height3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(4)), startRestartGroup, 6);
        BoxWithConstraintsKt.BoxWithConstraints(BackgroundKt.m1025backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(6)), RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(999))), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), null, false, ComposableLambdaKt.rememberComposableLambda(-1510322741, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetMomentumBarKt$FlashBetMomentumBar$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                invoke(boxWithConstraintsScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer2, int i7) {
                int i8;
                int FlashBetMomentumBar$lambda$0;
                long j;
                long j2;
                long j3;
                long j4;
                long j5;
                long j6;
                long j7;
                long j8;
                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((i7 & 6) == 0) {
                    i8 = i7 | (composer2.changed(BoxWithConstraints) ? 4 : 2);
                } else {
                    i8 = i7;
                }
                if ((i8 & 19) == 18 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1510322741, i8, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetMomentumBar.<anonymous>.<anonymous> (FlashBetMomentumBar.kt:107)");
                }
                float mo1423getMaxWidthD9Ej5fM = BoxWithConstraints.mo1423getMaxWidthD9Ej5fM();
                FlashBetMomentumBar$lambda$0 = FlashBetMomentumBarKt.FlashBetMomentumBar$lambda$0(animateIntAsState22);
                float m7774constructorimpl = Dp.m7774constructorimpl(mo1423getMaxWidthD9Ej5fM * (FlashBetMomentumBar$lambda$0 / 100.0f));
                float f82 = 2;
                float m7774constructorimpl2 = Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() / f82);
                Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, m7774constructorimpl), 0.0f, 1, null);
                j = FlashBetMomentumBarKt.PossessionGold;
                BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(fillMaxHeight$default, Color.m5167copywmQWz5c$default(j, 0.28f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer2, 0);
                float f9 = 1;
                BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), Dp.m7774constructorimpl(f9)), 0.0f, 1, null), Color.m5167copywmQWz5c$default(Color.INSTANCE.m5205getWhite0d7_KjU(), 0.22f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer2, 0);
                composer2.startReplaceGroup(278811111);
                if (f722 > 0.0f) {
                    float m7774constructorimpl3 = Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() * (f722 / 100.0f));
                    Modifier fillMaxHeight$default2 = SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), Dp.m7774constructorimpl(m7774constructorimpl2 - m7774constructorimpl3), 0.0f, 2, null), m7774constructorimpl3), 0.0f, 1, null);
                    Brush.Companion companion = Brush.INSTANCE;
                    j7 = FlashBetMomentumBarKt.PossessionAwayOrange;
                    j8 = FlashBetMomentumBarKt.PossessionAwayOrange;
                    BoxKt.Box(BackgroundKt.background$default(fillMaxHeight$default2, Brush.Companion.m5117horizontalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(j7), Color.m5158boximpl(Color.m5167copywmQWz5c$default(j8, 0.45f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer2, 0);
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(278834932);
                if (f622 > 0.0f) {
                    Modifier fillMaxHeight$default3 = SizeKt.fillMaxHeight$default(SizeKt.m1568width3ABfNKs(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), m7774constructorimpl2, 0.0f, 2, null), Dp.m7774constructorimpl(BoxWithConstraints.mo1423getMaxWidthD9Ej5fM() * (f622 / 100.0f))), 0.0f, 1, null);
                    Brush.Companion companion2 = Brush.INSTANCE;
                    j5 = FlashBetMomentumBarKt.PossessionGoldBright;
                    j6 = FlashBetMomentumBarKt.PossessionGoldBright;
                    BoxKt.Box(BackgroundKt.background$default(fillMaxHeight$default3, Brush.Companion.m5117horizontalGradient8A3gB4$default(companion2, CollectionsKt.listOf((Object[]) new Color[]{Color.m5158boximpl(Color.m5167copywmQWz5c$default(j5, 0.45f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m5158boximpl(j6)}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), composer2, 0);
                }
                composer2.endReplaceGroup();
                Modifier m1549height3ABfNKs = SizeKt.m1549height3ABfNKs(SizeKt.m1568width3ABfNKs(OffsetKt.m1476offsetVpY3zN4$default(BoxWithConstraints.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterStart()), Dp.m7774constructorimpl(m7774constructorimpl - Dp.m7774constructorimpl(f9)), 0.0f, 2, null), Dp.m7774constructorimpl(f82)), Dp.m7774constructorimpl(8));
                float m7774constructorimpl4 = Dp.m7774constructorimpl(6);
                j2 = FlashBetMomentumBarKt.PossessionGold;
                long m5167copywmQWz5c$default322 = Color.m5167copywmQWz5c$default(j2, 0.8f, 0.0f, 0.0f, 0.0f, 14, null);
                j3 = FlashBetMomentumBarKt.PossessionGold;
                Modifier m4803shadows4CzXII$default = ShadowKt.m4803shadows4CzXII$default(m1549height3ABfNKs, m7774constructorimpl4, null, false, Color.m5167copywmQWz5c$default(j3, 0.35f, 0.0f, 0.0f, 0.0f, 14, null), m5167copywmQWz5c$default322, 6, null);
                j4 = FlashBetMomentumBarKt.PossessionGold;
                BoxKt.Box(BackgroundKt.m1025backgroundbw27NRU$default(m4803shadows4CzXII$default, j4, null, 2, null), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, 3072, 6);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        f2 = f422;
        modifier3 = modifier522;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FlashBetMomentumBar$lambda$0(State<Integer> state) {
        return state.getValue().intValue();
    }

    private static final float FlashBetMomentumBar$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }
}
