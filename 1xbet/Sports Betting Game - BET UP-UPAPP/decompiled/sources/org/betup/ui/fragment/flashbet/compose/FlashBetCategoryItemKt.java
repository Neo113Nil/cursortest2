package org.betup.ui.fragment.flashbet.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.exifinterface.media.ExifInterface;
import coil3.compose.SingletonAsyncImageKt;
import com.google.logging.type.LogSeverity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.ClickAnimationModifierKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: FlashBetCategoryItem.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\b¨\u0006\f"}, d2 = {"FlashBetCategoryRow", "", "item", "Lorg/betup/ui/fragment/flashbet/compose/FlashBetCategoryItem;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/flashbet/compose/FlashBetCategoryItem;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewFlashBetCategoryRowFootball", "(Landroidx/compose/runtime/Composer;I)V", "PreviewFlashBetCategoryRowLongName", "PreviewFlashBetCategoryRowZeroMatches", "PreviewFlashBetCategoryRowZeroZeroHidden", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FlashBetCategoryItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlashBetCategoryRow$lambda$1(FlashBetCategoryItem flashBetCategoryItem, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FlashBetCategoryRow(flashBetCategoryItem, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFlashBetCategoryRowFootball$lambda$2(int i, Composer composer, int i2) {
        PreviewFlashBetCategoryRowFootball(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFlashBetCategoryRowLongName$lambda$3(int i, Composer composer, int i2) {
        PreviewFlashBetCategoryRowLongName(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFlashBetCategoryRowZeroMatches$lambda$4(int i, Composer composer, int i2) {
        PreviewFlashBetCategoryRowZeroMatches(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFlashBetCategoryRowZeroZeroHidden$lambda$5(int i, Composer composer, int i2) {
        PreviewFlashBetCategoryRowZeroZeroHidden(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FlashBetCategoryRow(final FlashBetCategoryItem item, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        boolean z;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(914581685);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(item) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(914581685, i3, -1, "org.betup.ui.fragment.flashbet.compose.FlashBetCategoryRow (FlashBetCategoryItem.kt:36)");
                }
                long j = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
                long j2 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                long j3 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                modifier3 = modifier4;
                float f = 8;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickAnimationModifierKt.subtleClickAnimation(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), j, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4))), item.getOnClick(), null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, 0, 0, 1022), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN4);
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
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(item.getPhotoUrl(), null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(30)), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 432, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), startRestartGroup, 6);
                TextKt.m2642Text4IGK_g(item.getName(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), j2, TextUnitKt.getSp(12), (FontStyle) null, new FontWeight(LogSeverity.WARNING_VALUE), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 131024);
                z = item.getCurrentMatches() == 0 || item.getTotalMatches() != 0;
                startRestartGroup.startReplaceGroup(1465282531);
                if (z) {
                    composer2 = startRestartGroup;
                } else {
                    SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), startRestartGroup, 6);
                    String valueOf = String.valueOf(item.getCurrentMatches());
                    if (item.getCurrentMatches() == 0) {
                        j3 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                    }
                    composer2 = startRestartGroup;
                    TextKt.m2642Text4IGK_g(valueOf, (Modifier) null, j3, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                    TextKt.m2642Text4IGK_g(" / " + item.getTotalMatches(), (Modifier) null, j2, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
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
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoryItemKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FlashBetCategoryRow$lambda$1;
                        FlashBetCategoryRow$lambda$1 = FlashBetCategoryItemKt.FlashBetCategoryRow$lambda$1(FlashBetCategoryItem.this, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return FlashBetCategoryRow$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        long j4 = ComposeUtils.AppColorPalette.BackgroundGroupMatchBet.INSTANCE.getColor();
        long j22 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
        long j32 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
        modifier3 = modifier4;
        float f2 = 8;
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(ClickAnimationModifierKt.subtleClickAnimation(BackgroundKt.m1024backgroundbw27NRU(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), j4, RoundedCornerShapeKt.m1810RoundedCornerShape0680j_4(Dp.m7774constructorimpl(4))), item.getOnClick(), null, false, 0, false, false, 0.0f, false, 0.0f, null, startRestartGroup, 0, 0, 1022), Dp.m7774constructorimpl(f2), Dp.m7774constructorimpl(f2));
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.Horizontal start2 = Arrangement.INSTANCE.getStart();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(start2, centerVertically2, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
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
        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(item.getPhotoUrl(), null, SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(30)), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 432, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), startRestartGroup, 6);
        TextKt.m2642Text4IGK_g(item.getName(), RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), j22, TextUnitKt.getSp(12), (FontStyle) null, new FontWeight(LogSeverity.WARNING_VALUE), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199680, 0, 131024);
        if (item.getCurrentMatches() == 0) {
        }
        startRestartGroup.startReplaceGroup(1465282531);
        if (z) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void PreviewFlashBetCategoryRowFootball(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-649349839);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-649349839, i, -1, "org.betup.ui.fragment.flashbet.compose.PreviewFlashBetCategoryRowFootball (FlashBetCategoryItem.kt:95)");
            }
            FlashBetCategoryRow(new FlashBetCategoryItem("1", "FOOTBALL", "https://betup.org/uploads_api/sport/22.png", 3, 50, null, 32, null), null, startRestartGroup, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoryItemKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewFlashBetCategoryRowFootball$lambda$2;
                    PreviewFlashBetCategoryRowFootball$lambda$2 = FlashBetCategoryItemKt.PreviewFlashBetCategoryRowFootball$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewFlashBetCategoryRowFootball$lambda$2;
                }
            });
        }
    }

    private static final void PreviewFlashBetCategoryRowLongName(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1211972757);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1211972757, i, -1, "org.betup.ui.fragment.flashbet.compose.PreviewFlashBetCategoryRowLongName (FlashBetCategoryItem.kt:113)");
            }
            FlashBetCategoryRow(new FlashBetCategoryItem(ExifInterface.GPS_MEASUREMENT_2D, "ESPORTS HANDBALL", "https://betup.org/uploads_api/sport/102.png", 5, 50, null, 32, null), null, startRestartGroup, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoryItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewFlashBetCategoryRowLongName$lambda$3;
                    PreviewFlashBetCategoryRowLongName$lambda$3 = FlashBetCategoryItemKt.PreviewFlashBetCategoryRowLongName$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewFlashBetCategoryRowLongName$lambda$3;
                }
            });
        }
    }

    private static final void PreviewFlashBetCategoryRowZeroMatches(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-942058931);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-942058931, i, -1, "org.betup.ui.fragment.flashbet.compose.PreviewFlashBetCategoryRowZeroMatches (FlashBetCategoryItem.kt:131)");
            }
            FlashBetCategoryRow(new FlashBetCategoryItem(ExifInterface.GPS_MEASUREMENT_3D, "TABLE TENNIS", "https://betup.org/uploads_api/sport/91.png", 0, 50, null, 32, null), null, startRestartGroup, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoryItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewFlashBetCategoryRowZeroMatches$lambda$4;
                    PreviewFlashBetCategoryRowZeroMatches$lambda$4 = FlashBetCategoryItemKt.PreviewFlashBetCategoryRowZeroMatches$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewFlashBetCategoryRowZeroMatches$lambda$4;
                }
            });
        }
    }

    private static final void PreviewFlashBetCategoryRowZeroZeroHidden(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1269138050);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1269138050, i, -1, "org.betup.ui.fragment.flashbet.compose.PreviewFlashBetCategoryRowZeroZeroHidden (FlashBetCategoryItem.kt:149)");
            }
            FlashBetCategoryRow(new FlashBetCategoryItem("4", "NEW SPORT", "https://betup.org/uploads_api/sport/22.png", 0, 0, null, 32, null), null, startRestartGroup, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.flashbet.compose.FlashBetCategoryItemKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewFlashBetCategoryRowZeroZeroHidden$lambda$5;
                    PreviewFlashBetCategoryRowZeroZeroHidden$lambda$5 = FlashBetCategoryItemKt.PreviewFlashBetCategoryRowZeroZeroHidden$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewFlashBetCategoryRowZeroZeroHidden$lambda$5;
                }
            });
        }
    }
}
