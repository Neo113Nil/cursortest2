package org.betup.ui.fragment.shop.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
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
import com.explorestack.protobuf.openrtb.LossReason;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.shop.ShopBadgeType;
import org.betup.ui.views.ComposeUtils;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: CoinPackCard.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a9\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"CoinPackCard", "", "shopItem", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "onClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CoinPacksGrid", "items", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "coinPacksGridHeight", "Landroidx/compose/ui/unit/Dp;", "itemCount", "", "(I)F", "PreviewCoinPacksGrid", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoinPackCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinPackCard$lambda$2(ShopItemDataModel shopItemDataModel, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CoinPackCard(shopItemDataModel, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinPacksGrid$lambda$6(List list, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CoinPacksGrid(list, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCoinPacksGrid$lambda$9(int i, Composer composer, int i2) {
        PreviewCoinPacksGrid(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoinPackCard(final ShopItemDataModel shopItem, final Function1<? super ShopItemDataModel, Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(shopItem, "shopItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(2031105102);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(shopItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2031105102, i3, -1, "org.betup.ui.fragment.shop.compose.CoinPackCard (CoinPackCard.kt:27)");
                }
                final boolean z2 = shopItem.getBadgeType() != ShopBadgeType.NEW;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                float m7774constructorimpl = Dp.m7774constructorimpl(200);
                startRestartGroup.startReplaceGroup(-1633490746);
                z = ((i3 & 112) != 32) | ((i3 & 14) == 4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit CoinPackCard$lambda$1$lambda$0;
                            CoinPackCard$lambda$1$lambda$0 = CoinPackCardKt.CoinPackCard$lambda$1$lambda$0(Function1.this, shopItem);
                            return CoinPackCard$lambda$1$lambda$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                ShopCardBorderStyle shopCardBorderForItem = ShopCardBorderStyleKt.shopCardBorderForItem(shopItem.getDisplaySection(), shopItem.getBadgeType());
                boolean popular = shopItem.getPopular();
                ShopBadgeType badgeType = shopItem.getBadgeType();
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-899186684, true, new CoinPackCardKt$CoinPackCard$2(shopItem, onClick), startRestartGroup, 54);
                ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1461574213, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$CoinPackCard$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        BoxScopeInstance boxScopeInstance;
                        String str;
                        int i6;
                        ShopItemDataModel shopItemDataModel;
                        String str2;
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1461574213, i5, -1, "org.betup.ui.fragment.shop.compose.CoinPackCard.<anonymous> (CoinPackCard.kt:45)");
                        }
                        float f = 10;
                        Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
                        boolean z3 = z2;
                        ShopItemDataModel shopItemDataModel2 = shopItem;
                        ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1517paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(-1272399952);
                        if (z3) {
                            str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            boxScopeInstance = boxScopeInstance2;
                            i6 = 10;
                            shopItemDataModel = shopItemDataModel2;
                            str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                            TextKt.m3621Text4IGK_g(ShopCardChromeKt.shopBadgeLabel(ShopBadgeType.NEW, composer2, 6), boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131024);
                        } else {
                            boxScopeInstance = boxScopeInstance2;
                            str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                            i6 = 10;
                            shopItemDataModel = shopItemDataModel2;
                            str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                        }
                        composer2.endReplaceGroup();
                        Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(40), 7, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str2);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                        Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composer2.startReplaceGroup(1401479554);
                        if (shopItemDataModel.getTitle().length() > 0) {
                            TextKt.m3621Text4IGK_g(shopItemDataModel.getTitle(), (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                        }
                        composer2.endReplaceGroup();
                        ShopCardChromeKt.m14126ShopCoinAmountRowa5Y_hM(shopItemDataModel.getAmount(), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 13, null), 0L, composer2, 48, 4);
                        String unitPriceLabel = shopItemDataModel.getUnitPriceLabel();
                        composer2.startReplaceGroup(1401496270);
                        if (unitPriceLabel != null) {
                            TextKt.m3621Text4IGK_g(unitPriceLabel, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(4), 0.0f, 0.0f, 13, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(i6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ShopCardChromeKt.ShopProductImage(shopItemDataModel.getImgUrl(), PaddingKt.m1520paddingqDBjuR0$default(SizeKt.m1549height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), Dp.m7774constructorimpl(56)), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(36), 7, null), null, composer2, 0, 4);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54);
                Modifier modifier4 = modifier3;
                ShopCardChromeKt.m14125ShopCardContainerUwwEzs(fillMaxWidth$default, m7774constructorimpl, (Function0) rememberedValue, shopCardBorderForItem, popular, badgeType, rememberComposableLambda, rememberComposableLambda2, startRestartGroup, 14155824, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier5 = modifier2;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CoinPackCard$lambda$2;
                        CoinPackCard$lambda$2 = CoinPackCardKt.CoinPackCard$lambda$2(ShopItemDataModel.this, onClick, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return CoinPackCard$lambda$2;
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
        if (shopItem.getBadgeType() != ShopBadgeType.NEW) {
        }
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
        float m7774constructorimpl2 = Dp.m7774constructorimpl(200);
        startRestartGroup.startReplaceGroup(-1633490746);
        z = ((i3 & 112) != 32) | ((i3 & 14) == 4);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit CoinPackCard$lambda$1$lambda$0;
                CoinPackCard$lambda$1$lambda$0 = CoinPackCardKt.CoinPackCard$lambda$1$lambda$0(Function1.this, shopItem);
                return CoinPackCard$lambda$1$lambda$0;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        ShopCardBorderStyle shopCardBorderForItem2 = ShopCardBorderStyleKt.shopCardBorderForItem(shopItem.getDisplaySection(), shopItem.getBadgeType());
        boolean popular2 = shopItem.getPopular();
        ShopBadgeType badgeType2 = shopItem.getBadgeType();
        ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(-899186684, true, new CoinPackCardKt$CoinPackCard$2(shopItem, onClick), startRestartGroup, 54);
        ComposableLambda rememberComposableLambda22 = ComposableLambdaKt.rememberComposableLambda(1461574213, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$CoinPackCard$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                BoxScopeInstance boxScopeInstance;
                String str;
                int i6;
                ShopItemDataModel shopItemDataModel;
                String str2;
                if ((i5 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1461574213, i5, -1, "org.betup.ui.fragment.shop.compose.CoinPackCard.<anonymous> (CoinPackCard.kt:45)");
                }
                float f = 10;
                Modifier m1517paddingVpY3zN4 = PaddingKt.m1517paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f));
                boolean z3 = z2;
                ShopItemDataModel shopItemDataModel2 = shopItem;
                ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m1517paddingVpY3zN4);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer m4610constructorimpl = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl.getInserting() || !Intrinsics.areEqual(m4610constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m4617setimpl(m4610constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                composer2.startReplaceGroup(-1272399952);
                if (z3) {
                    str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    boxScopeInstance = boxScopeInstance2;
                    i6 = 10;
                    shopItemDataModel = shopItemDataModel2;
                    str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                    TextKt.m3621Text4IGK_g(ShopCardChromeKt.shopBadgeLabel(ShopBadgeType.NEW, composer2, 6), boxScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), ComposeUtils.AppColorPalette.Gold.INSTANCE.getColor(), TextUnitKt.getSp(10), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131024);
                } else {
                    boxScopeInstance = boxScopeInstance2;
                    str = "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh";
                    i6 = 10;
                    shopItemDataModel = shopItemDataModel2;
                    str2 = "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp";
                }
                composer2.endReplaceGroup();
                Modifier m1520paddingqDBjuR0$default = PaddingKt.m1520paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(40), 7, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m1520paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str2);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer2);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer2.startReplaceGroup(1401479554);
                if (shopItemDataModel.getTitle().length() > 0) {
                    TextKt.m3621Text4IGK_g(shopItemDataModel.getTitle(), (Modifier) null, ComposeUtils.AppColorPalette.White.INSTANCE.getColor(), TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                }
                composer2.endReplaceGroup();
                ShopCardChromeKt.m14126ShopCoinAmountRowa5Y_hM(shopItemDataModel.getAmount(), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(8), 0.0f, 0.0f, 13, null), 0L, composer2, 48, 4);
                String unitPriceLabel = shopItemDataModel.getUnitPriceLabel();
                composer2.startReplaceGroup(1401496270);
                if (unitPriceLabel != null) {
                    TextKt.m3621Text4IGK_g(unitPriceLabel, PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(4), 0.0f, 0.0f, 13, null), ComposeUtils.AppColorPalette.GrayLight.INSTANCE.getColor(), TextUnitKt.getSp(i6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3120, 0, 131056);
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ShopCardChromeKt.ShopProductImage(shopItemDataModel.getImgUrl(), PaddingKt.m1520paddingqDBjuR0$default(SizeKt.m1549height3ABfNKs(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), Dp.m7774constructorimpl(56)), 0.0f, 0.0f, 0.0f, Dp.m7774constructorimpl(36), 7, null), null, composer2, 0, 4);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54);
        Modifier modifier42 = modifier3;
        ShopCardChromeKt.m14125ShopCardContainerUwwEzs(fillMaxWidth$default2, m7774constructorimpl2, (Function0) rememberedValue, shopCardBorderForItem2, popular2, badgeType2, rememberComposableLambda3, rememberComposableLambda22, startRestartGroup, 14155824, 0);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier42;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinPackCard$lambda$1$lambda$0(Function1 function1, ShopItemDataModel shopItemDataModel) {
        function1.invoke(shopItemDataModel);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoinPacksGrid(final List<ShopItemDataModel> items, final Function1<? super ShopItemDataModel, Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        boolean changedInstance;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1219827869);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(items) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
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
                    ComposerKt.traceEventStart(1219827869, i3, -1, "org.betup.ui.fragment.shop.compose.CoinPacksGrid (CoinPackCard.kt:102)");
                }
                GridCells.Fixed fixed = new GridCells.Fixed(2);
                PaddingValues m1511PaddingValuesYgX7TsA$default = PaddingKt.m1511PaddingValuesYgX7TsA$default(Dp.m7774constructorimpl(6), 0.0f, 2, null);
                startRestartGroup.startReplaceGroup(-1633490746);
                changedInstance = startRestartGroup.changedInstance(items) | ((i3 & 112) != 32);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit CoinPacksGrid$lambda$5$lambda$4;
                            CoinPacksGrid$lambda$5$lambda$4 = CoinPackCardKt.CoinPacksGrid$lambda$5$lambda$4(items, onClick, (LazyGridScope) obj);
                            return CoinPacksGrid$lambda$5$lambda$4;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                LazyGridDslKt.LazyVerticalGrid(fixed, modifier3, null, m1511PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) rememberedValue, startRestartGroup, ((i3 >> 3) & 112) | 100666368, 0, 756);
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
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit CoinPacksGrid$lambda$6;
                        CoinPacksGrid$lambda$6 = CoinPackCardKt.CoinPacksGrid$lambda$6(items, onClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return CoinPacksGrid$lambda$6;
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
        GridCells.Fixed fixed2 = new GridCells.Fixed(2);
        PaddingValues m1511PaddingValuesYgX7TsA$default2 = PaddingKt.m1511PaddingValuesYgX7TsA$default(Dp.m7774constructorimpl(6), 0.0f, 2, null);
        startRestartGroup.startReplaceGroup(-1633490746);
        changedInstance = startRestartGroup.changedInstance(items) | ((i3 & 112) != 32);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit CoinPacksGrid$lambda$5$lambda$4;
                CoinPacksGrid$lambda$5$lambda$4 = CoinPackCardKt.CoinPacksGrid$lambda$5$lambda$4(items, onClick, (LazyGridScope) obj);
                return CoinPacksGrid$lambda$5$lambda$4;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        LazyGridDslKt.LazyVerticalGrid(fixed2, modifier3, null, m1511PaddingValuesYgX7TsA$default2, false, null, null, null, false, null, (Function1) rememberedValue, startRestartGroup, ((i3 >> 3) & 112) | 100666368, 0, 756);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final float coinPacksGridHeight(int i) {
        return Dp.m7774constructorimpl(((i + 1) / 2) * LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL_VALUE);
    }

    private static final void PreviewCoinPacksGrid(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-2055540965);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2055540965, i, -1, "org.betup.ui.fragment.shop.compose.PreviewCoinPacksGrid (CoinPackCard.kt:126)");
            }
            List<ShopItemDataModel> coinPacks = ShopPreviewSamples.INSTANCE.getCoinPacks();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PreviewCoinPacksGrid$lambda$8$lambda$7;
                        PreviewCoinPacksGrid$lambda$8$lambda$7 = CoinPackCardKt.PreviewCoinPacksGrid$lambda$8$lambda$7((ShopItemDataModel) obj);
                        return PreviewCoinPacksGrid$lambda$8$lambda$7;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            CoinPacksGrid(coinPacks, (Function1) rememberedValue, SizeKt.m1549height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), coinPacksGridHeight(ShopPreviewSamples.INSTANCE.getCoinPacks().size())), startRestartGroup, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewCoinPacksGrid$lambda$9;
                    PreviewCoinPacksGrid$lambda$9 = CoinPackCardKt.PreviewCoinPacksGrid$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewCoinPacksGrid$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCoinPacksGrid$lambda$8$lambda$7(ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinPacksGrid$lambda$5$lambda$4(final List list, final Function1 function1, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final CoinPackCardKt$CoinPacksGrid$lambda$5$lambda$4$$inlined$items$default$1 coinPackCardKt$CoinPacksGrid$lambda$5$lambda$4$$inlined$items$default$1 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$CoinPacksGrid$lambda$5$lambda$4$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ShopItemDataModel shopItemDataModel) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((ShopItemDataModel) obj);
            }
        };
        LazyVerticalGrid.items(list.size(), null, null, new Function1<Integer, Object>() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$CoinPacksGrid$lambda$5$lambda$4$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function1.this.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.CoinPackCardKt$CoinPacksGrid$lambda$5$lambda$4$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope lazyGridItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "C542@23993L22:LazyGridDsl.kt#7791vq");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & Opcodes.I2S) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(699646206, i3, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                ShopItemDataModel shopItemDataModel = (ShopItemDataModel) list.get(i);
                composer.startReplaceGroup(-1577909102);
                CoinPackCardKt.CoinPackCard(shopItemDataModel, function1, PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(6)), composer, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }
}
