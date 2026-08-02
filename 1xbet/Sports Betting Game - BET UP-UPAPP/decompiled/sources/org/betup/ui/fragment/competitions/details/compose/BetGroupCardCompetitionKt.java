package org.betup.ui.fragment.competitions.details.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.local.entity.OddType;
import org.betup.model.remote.entity.matches.varieties.MatchVarietyBetOptionModel;
import org.betup.ui.views.ComposeUtils;

/* compiled from: BetGroupCardCompetition.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\u001a»\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u001126\u0010\u0012\u001a2\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00142\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u001c\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u001d¨\u0006\u001e"}, d2 = {"BetGroupCardCompetition", "", "modifier", "Landroidx/compose/ui/Modifier;", "groupName", "", "bets", "", "Lorg/betup/model/remote/entity/matches/varieties/MatchVarietyBetOptionModel;", "oddType", "Lorg/betup/model/local/entity/OddType;", "isExpanded", "", "selectedBetIds", "", "", "onExpandToggle", "Lkotlin/Function0;", "onBetClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "betTypeId", "betIndex", "isLocked", "betColumnSize", "isInBattle", "isInCompetition", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lorg/betup/model/local/entity/OddType;ZLjava/util/Set;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ZIZZLandroidx/compose/runtime/Composer;III)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BetGroupCardCompetitionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetGroupCardCompetition$lambda$2(Modifier modifier, String str, List list, OddType oddType, boolean z, Set set, Function0 function0, Function2 function2, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, Composer composer, int i5) {
        BetGroupCardCompetition(modifier, str, list, oddType, z, set, function0, function2, z2, i, z3, z4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BetGroupCardCompetition(Modifier modifier, final String groupName, final List<MatchVarietyBetOptionModel> bets, final OddType oddType, final boolean z, Set<Long> set, final Function0<Unit> onExpandToggle, final Function2<? super Integer, ? super Integer, Unit> onBetClick, boolean z2, final int i, boolean z3, boolean z4, Composer composer, final int i2, final int i3, final int i4) {
        Modifier modifier2;
        int i5;
        Set<Long> set2;
        int i6;
        int i7;
        int i8;
        boolean z5;
        boolean z6;
        int i9;
        float m7774constructorimpl;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        long sp;
        long j;
        Composer composer2;
        final Set<Long> set3;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(bets, "bets");
        Intrinsics.checkNotNullParameter(onExpandToggle, "onExpandToggle");
        Intrinsics.checkNotNullParameter(onBetClick, "onBetClick");
        Composer startRestartGroup = composer.startRestartGroup(1241674192);
        int i10 = i4 & 1;
        if (i10 != 0) {
            i5 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i5 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(groupName) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i2 & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            i5 |= startRestartGroup.changedInstance(bets) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(oddType == null ? -1 : oddType.ordinal()) ? 2048 : 1024;
        }
        int i11 = i4 & 32;
        if (i11 != 0) {
            i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            set2 = set;
        } else {
            set2 = set;
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i5 |= startRestartGroup.changedInstance(set2) ? 131072 : 65536;
            }
        }
        if ((i4 & 128) != 0) {
            i5 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changedInstance(onBetClick) ? 8388608 : 4194304;
        }
        int i12 = i4 & 256;
        if (i12 != 0) {
            i5 |= 100663296;
        } else if ((i2 & 100663296) == 0) {
            i5 |= startRestartGroup.changed(z2) ? 67108864 : 33554432;
        }
        if ((i4 & 512) != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= startRestartGroup.changed(i) ? C.BUFFER_FLAG_LAST_SAMPLE : 268435456;
            i6 = i4 & 1024;
            if (i6 == 0) {
                i7 = i3 | 6;
            } else if ((i3 & 6) == 0) {
                i7 = i3 | (startRestartGroup.changed(z3) ? 4 : 2);
            } else {
                i7 = i3;
            }
            i8 = i4 & 2048;
            if (i8 == 0) {
                i7 |= 48;
            } else if ((i3 & 48) == 0) {
                i7 |= startRestartGroup.changed(z4) ? 32 : 16;
            }
            int i13 = i7;
            if ((i5 & 306250899) == 306250898 || (i13 & 19) != 18 || !startRestartGroup.getSkipping()) {
                if (i10 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                Set<Long> emptySet = i11 == 0 ? SetsKt.emptySet() : set2;
                z5 = i12 == 0 ? false : z2;
                boolean z10 = i6 == 0 ? false : z3;
                z6 = i8 == 0 ? false : z4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1241674192, i5, i13, "org.betup.ui.fragment.competitions.details.compose.BetGroupCardCompetition (BetGroupCardCompetition.kt:45)");
                }
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                if (!z6) {
                    i9 = 2;
                    m7774constructorimpl = Dp.m7774constructorimpl(2);
                } else {
                    i9 = 2;
                    m7774constructorimpl = Dp.m7774constructorimpl(4);
                }
                Modifier m1518paddingVpY3zN4$default = PaddingKt.m1518paddingVpY3zN4$default(fillMaxWidth$default, m7774constructorimpl, 0.0f, i9, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default);
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
                if (!startRestartGroup.getInserting()) {
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
                float f = 1;
                BoxKt.Box(SizeKt.m1549height3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(f)), startRestartGroup, 0);
                Modifier m1518paddingVpY3zN4$default2 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(16), 0.0f, 2, null);
                if (!z6) {
                    sp = TextUnitKt.getSp(10);
                } else {
                    sp = TextUnitKt.getSp(14);
                }
                long j2 = sp;
                FontFamily sfProFontFamily = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
                FontWeight fontWeight = new FontWeight(500);
                if (!z5) {
                    j = ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor();
                } else {
                    j = ComposeUtils.AppColorPalette.Gray.INSTANCE.getColor();
                }
                Modifier modifier4 = modifier2;
                TextKt.m2642Text4IGK_g(groupName, m1518paddingVpY3zN4$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, j2, fontWeight, (FontStyle) null, (FontSynthesis) null, sfProFontFamily, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, ((i5 >> 3) & 14) | 48, 0, 65532);
                composer2 = startRestartGroup;
                BoxKt.Box(SizeKt.m1549height3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(f)), composer2, 0);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1201848964, true, new BetGroupCardCompetitionKt$BetGroupCardCompetition$1$2(z6, bets, z10, i, emptySet, oddType, z5, onBetClick), composer2, 54), composer2, 3078, 6);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                set3 = emptySet;
                z7 = z5;
                z8 = z10;
                z9 = z6;
                modifier3 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                z9 = z4;
                modifier3 = modifier2;
                set3 = set2;
                composer2 = startRestartGroup;
                z7 = z2;
                z8 = z3;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.competitions.details.compose.BetGroupCardCompetitionKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit BetGroupCardCompetition$lambda$2;
                        BetGroupCardCompetition$lambda$2 = BetGroupCardCompetitionKt.BetGroupCardCompetition$lambda$2(Modifier.this, groupName, bets, oddType, z, set3, onExpandToggle, onBetClick, z7, i, z8, z9, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                        return BetGroupCardCompetition$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        i6 = i4 & 1024;
        if (i6 == 0) {
        }
        i8 = i4 & 2048;
        if (i8 == 0) {
        }
        int i132 = i7;
        if ((i5 & 306250899) == 306250898) {
        }
        if (i10 != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        if (i6 == 0) {
        }
        if (i8 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
        if (!z6) {
        }
        Modifier m1518paddingVpY3zN4$default3 = PaddingKt.m1518paddingVpY3zN4$default(fillMaxWidth$default3, m7774constructorimpl, 0.0f, i9, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1518paddingVpY3zN4$default3);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
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
        if (!startRestartGroup.getInserting()) {
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
        float f2 = 1;
        BoxKt.Box(SizeKt.m1549height3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(f2)), startRestartGroup, 0);
        Modifier m1518paddingVpY3zN4$default22 = PaddingKt.m1518paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m7774constructorimpl(16), 0.0f, 2, null);
        if (!z6) {
        }
        long j22 = sp;
        FontFamily sfProFontFamily2 = ComposeUtils.INSTANCE.sfProFontFamily(startRestartGroup, 6);
        FontWeight fontWeight2 = new FontWeight(500);
        if (!z5) {
        }
        Modifier modifier42 = modifier2;
        TextKt.m2642Text4IGK_g(groupName, m1518paddingVpY3zN4$default22, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(j, j22, fontWeight2, (FontStyle) null, (FontSynthesis) null, sfProFontFamily2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), startRestartGroup, ((i5 >> 3) & 14) | 48, 0, 65532);
        composer2 = startRestartGroup;
        BoxKt.Box(SizeKt.m1549height3ABfNKs(BackgroundKt.m1025backgroundbw27NRU$default(RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), ComposeUtils.AppColorPalette.GrayUnselectedMatchButton.INSTANCE.getColor(), null, 2, null), Dp.m7774constructorimpl(f2)), composer2, 0);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(1201848964, true, new BetGroupCardCompetitionKt$BetGroupCardCompetition$1$2(z6, bets, z10, i, emptySet, oddType, z5, onBetClick), composer2, 54), composer2, 3078, 6);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        set3 = emptySet;
        z7 = z5;
        z8 = z10;
        z9 = z6;
        modifier3 = modifier42;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
