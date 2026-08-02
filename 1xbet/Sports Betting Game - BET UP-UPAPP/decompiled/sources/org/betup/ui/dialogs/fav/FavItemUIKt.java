package org.betup.ui.dialogs.fav;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import coil3.compose.SingletonAsyncImageKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.common.compose.FavoriteStarButtonKt;
import org.betup.ui.views.ComposeUtils;

/* compiled from: FavItemUI.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"FavItemUI", "", "item", "Lorg/betup/ui/dialogs/fav/FavItem;", "showFav", "", "(Lorg/betup/ui/dialogs/fav/FavItem;ZLandroidx/compose/runtime/Composer;II)V", "PreviewFavItemUI", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FavItemUIKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavItemUI$lambda$4(FavItem favItem, boolean z, int i, int i2, Composer composer, int i3) {
        FavItemUI(favItem, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFavItemUI$lambda$7(int i, Composer composer, int i2) {
        PreviewFavItemUI(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FavItemUI(final FavItem item, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z2;
        boolean z3;
        boolean z4;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        int currentCompositeKeyHash2;
        Composer m4610constructorimpl2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(item, "item");
        Composer startRestartGroup = composer.startRestartGroup(-1528050438);
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
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                z3 = i4 == 0 ? true : z2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1528050438, i3, -1, "org.betup.ui.dialogs.fav.FavItemUI (FavItemUI.kt:29)");
                }
                long j = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
                long j2 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
                long j3 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(5004770);
                z4 = (i3 & 14) == 4;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z4 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.fav.FavItemUIKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit FavItemUI$lambda$1$lambda$0;
                            FavItemUI$lambda$1$lambda$0 = FavItemUIKt.FavItemUI$lambda$1$lambda$0(FavItem.this);
                            return FavItemUI$lambda$1$lambda$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue, 7, null), Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(8));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
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
                SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(item.getFavImage(), null, PaddingKt.m1516padding3ABfNKs(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), Dp.m7774constructorimpl(4)), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 432, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
                SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
                Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2 = startRestartGroup;
                TextKt.m3621Text4IGK_g(item.getFavName(), (Modifier) null, j2, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.startReplaceGroup(-2059540443);
                if (z3) {
                    FavoriteStarButtonKt.m12932FavoriteStarButtonFbr4GWI(item.isFav(), item.getOnClick(), null, false, 0.0f, 0.0f, 0, 0, j, j3, false, composer2, 0, 0, 1276);
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
                z2 = z3;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.fav.FavItemUIKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit FavItemUI$lambda$4;
                        FavItemUI$lambda$4 = FavItemUIKt.FavItemUI$lambda$4(FavItem.this, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return FavItemUI$lambda$4;
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        long j4 = ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor();
        long j22 = ComposeUtils.AppColorPalette.White.INSTANCE.getColor();
        long j32 = ComposeUtils.AppColorPalette.GrayDark.INSTANCE.getColor();
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        startRestartGroup.startReplaceGroup(5004770);
        if ((i3 & 14) == 4) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z4) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.fav.FavItemUIKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit FavItemUI$lambda$1$lambda$0;
                FavItemUI$lambda$1$lambda$0 = FavItemUIKt.FavItemUI$lambda$1$lambda$0(FavItem.this);
                return FavItemUI$lambda$1$lambda$0;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier m1517paddingVpY3zN42 = PaddingKt.m1517paddingVpY3zN4(ClickableKt.m1059clickableXHw0xAI$default(fillMaxWidth$default2, false, null, null, (Function0) rememberedValue, 7, null), Dp.m7774constructorimpl(0), Dp.m7774constructorimpl(8));
        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
        Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1517paddingVpY3zN42);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash3);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407735110, "C101@5232L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        SingletonAsyncImageKt.m8174AsyncImage10Xjiaw(item.getFavImage(), null, PaddingKt.m1516padding3ABfNKs(SizeKt.m1563size3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(32)), Dp.m7774constructorimpl(4)), null, null, null, null, 0.0f, null, 0, false, startRestartGroup, 432, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
        SpacerKt.Spacer(SizeKt.m1568width3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(16)), startRestartGroup, 6);
        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m4610constructorimpl2 = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl2.getInserting()) {
        }
        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        composer2 = startRestartGroup;
        TextKt.m3621Text4IGK_g(item.getFavName(), (Modifier) null, j22, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7710getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.startReplaceGroup(-2059540443);
        if (z3) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        z2 = z3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FavItemUI$lambda$1$lambda$0(FavItem favItem) {
        favItem.getOnClick().invoke();
        return Unit.INSTANCE;
    }

    public static final void PreviewFavItemUI(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-251586396);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-251586396, i, -1, "org.betup.ui.dialogs.fav.PreviewFavItemUI (FavItemUI.kt:80)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: org.betup.ui.dialogs.fav.FavItemUIKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            FavItemUI(new FavItem(22, "Football", "data:image/png;base64,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", true, (Function0) rememberedValue), false, startRestartGroup, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.dialogs.fav.FavItemUIKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewFavItemUI$lambda$7;
                    PreviewFavItemUI$lambda$7 = FavItemUIKt.PreviewFavItemUI$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewFavItemUI$lambda$7;
                }
            });
        }
    }
}
