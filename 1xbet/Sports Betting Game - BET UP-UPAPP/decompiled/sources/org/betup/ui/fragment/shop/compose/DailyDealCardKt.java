package org.betup.ui.fragment.shop.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.explorestack.protobuf.openrtb.LossReason;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.shop.ShopEntitlementModel;

/* compiled from: DailyDealCard.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"DailyDealCard", "", "shopItem", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "onClick", "Lkotlin/Function1;", "onClaimClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewDailyDealCard", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DailyDealCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DailyDealCard$lambda$7(ShopItemDataModel shopItemDataModel, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DailyDealCard(shopItemDataModel, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewDailyDealCard$lambda$10(int i, Composer composer, int i2) {
        PreviewDailyDealCard(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DailyDealCard$lambda$1$lambda$0(ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DailyDealCard(final ShopItemDataModel shopItem, final Function1<? super ShopItemDataModel, Unit> onClick, Function1<? super ShopItemDataModel, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super ShopItemDataModel, Unit> function12;
        int i4;
        Modifier modifier2;
        Function1<? super ShopItemDataModel, Unit> function13;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        final String description;
        boolean z;
        Object rememberedValue;
        ShopEntitlementModel entitlement;
        Modifier modifier3;
        Composer composer2;
        final Modifier modifier4;
        final Function1<? super ShopItemDataModel, Unit> function14;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(shopItem, "shopItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1567735429);
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
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
                if ((i3 & 1171) == 1170 || !startRestartGroup.getSkipping()) {
                    if (i5 != 0) {
                        startRestartGroup.startReplaceGroup(1849434622);
                        Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.DailyDealCardKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit DailyDealCard$lambda$1$lambda$0;
                                    DailyDealCard$lambda$1$lambda$0 = DailyDealCardKt.DailyDealCard$lambda$1$lambda$0((ShopItemDataModel) obj);
                                    return DailyDealCard$lambda$1$lambda$0;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        startRestartGroup.endReplaceGroup();
                        function13 = (Function1) rememberedValue2;
                    } else {
                        function13 = function12;
                    }
                    Modifier.Companion companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1567735429, i3, -1, "org.betup.ui.fragment.shop.compose.DailyDealCard (DailyDealCard.kt:19)");
                    }
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                    startRestartGroup.startReplaceGroup(-1404330323);
                    if (shopItem.getEffectCoef() == null && shopItem.getEffectDuration() != null) {
                        Double effectCoef = shopItem.getEffectCoef();
                        Intrinsics.checkNotNull(effectCoef);
                        Integer valueOf = Integer.valueOf((int) effectCoef.doubleValue());
                        Integer effectDuration = shopItem.getEffectDuration();
                        Intrinsics.checkNotNull(effectDuration);
                        description = StringResources_androidKt.stringResource(R.string.shop_effect_daily_bonus_format, new Object[]{valueOf, effectDuration}, startRestartGroup, 6);
                    } else {
                        description = shopItem.getDescription();
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    float m7774constructorimpl = Dp.m7774constructorimpl(LossReason.LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE);
                    startRestartGroup.startReplaceGroup(-1633490746);
                    int i6 = i3 & 14;
                    z = ((i3 & 112) == 32) | (i6 == 4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.DailyDealCardKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit DailyDealCard$lambda$6$lambda$3$lambda$2;
                                DailyDealCard$lambda$6$lambda$3$lambda$2 = DailyDealCardKt.DailyDealCard$lambda$6$lambda$3$lambda$2(Function1.this, shopItem);
                                return DailyDealCard$lambda$6$lambda$3$lambda$2;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    Modifier modifier5 = companion;
                    ShopCardChromeKt.m14125ShopCardContainerUwwEzs(fillMaxWidth$default, m7774constructorimpl, (Function0) rememberedValue, ShopCardBorderStyleKt.shopCardBorderForSection(shopItem.getDisplaySection()), shopItem.getPopular(), null, ComposableLambdaKt.rememberComposableLambda(248999301, true, new DailyDealCardKt$DailyDealCard$2$2(shopItem, onClick), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-111460410, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.DailyDealCardKt$DailyDealCard$2$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-111460410, i7, -1, "org.betup.ui.fragment.shop.compose.DailyDealCard.<anonymous>.<anonymous> (DailyDealCard.kt:47)");
                            }
                            float f = 12;
                            Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(44));
                            String str = description;
                            ShopItemDataModel shopItemDataModel = shopItem;
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, m1519paddingqDBjuR0);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                            Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m4617setimpl(m4610constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            composer3.startReplaceGroup(-1390714654);
                            if (str.length() > 0) {
                                ShopCardChromeKt.ShopBulletLine(str, null, composer3, 0, 2);
                            }
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-1390710698);
                            if (shopItemDataModel.getNoAds()) {
                                ShopCardChromeKt.ShopBulletLine(StringResources_androidKt.stringResource(R.string.shop_no_ads_removes_forced_ads, composer3, 6), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(4), 0.0f, 0.0f, 13, null), composer3, 48, 0);
                            }
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-1390702183);
                            if (shopItemDataModel.getAmount() > 0) {
                                ShopCardChromeKt.m14126ShopCoinAmountRowa5Y_hM(shopItemDataModel.getAmount(), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f), 0.0f, 0.0f, 13, null), 0L, composer3, 48, 4);
                            }
                            composer3.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, 14155830, 32);
                    entitlement = shopItem.getEntitlement();
                    if (entitlement != null || !entitlement.getCanClaim()) {
                        entitlement = null;
                    }
                    startRestartGroup.startReplaceGroup(-1404269868);
                    if (entitlement == null) {
                        modifier3 = modifier5;
                        composer2 = startRestartGroup;
                    } else {
                        modifier3 = modifier5;
                        composer2 = startRestartGroup;
                        EntitlementProgressChipKt.EntitlementProgressChip(shopItem, function13, null, startRestartGroup, i6 | ((i3 >> 3) & 112), 4);
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
                    modifier4 = modifier3;
                    function14 = function13;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    function14 = function12;
                    modifier4 = modifier2;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.DailyDealCardKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit DailyDealCard$lambda$7;
                            DailyDealCard$lambda$7 = DailyDealCardKt.DailyDealCard$lambda$7(ShopItemDataModel.this, onClick, function14, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return DailyDealCard$lambda$7;
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
            Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m4610constructorimpl.getInserting()) {
            }
            m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
            Updater.m4617setimpl(m4610constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1404330323);
            if (shopItem.getEffectCoef() == null) {
            }
            description = shopItem.getDescription();
            startRestartGroup.endReplaceGroup();
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            float m7774constructorimpl2 = Dp.m7774constructorimpl(LossReason.LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE);
            startRestartGroup.startReplaceGroup(-1633490746);
            int i62 = i3 & 14;
            z = ((i3 & 112) == 32) | (i62 == 4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z) {
            }
            rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.DailyDealCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit DailyDealCard$lambda$6$lambda$3$lambda$2;
                    DailyDealCard$lambda$6$lambda$3$lambda$2 = DailyDealCardKt.DailyDealCard$lambda$6$lambda$3$lambda$2(Function1.this, shopItem);
                    return DailyDealCard$lambda$6$lambda$3$lambda$2;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            Modifier modifier52 = companion;
            ShopCardChromeKt.m14125ShopCardContainerUwwEzs(fillMaxWidth$default2, m7774constructorimpl2, (Function0) rememberedValue, ShopCardBorderStyleKt.shopCardBorderForSection(shopItem.getDisplaySection()), shopItem.getPopular(), null, ComposableLambdaKt.rememberComposableLambda(248999301, true, new DailyDealCardKt$DailyDealCard$2$2(shopItem, onClick), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-111460410, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.DailyDealCardKt$DailyDealCard$2$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-111460410, i7, -1, "org.betup.ui.fragment.shop.compose.DailyDealCard.<anonymous>.<anonymous> (DailyDealCard.kt:47)");
                    }
                    float f = 12;
                    Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(44));
                    String str = description;
                    ShopItemDataModel shopItemDataModel = shopItem;
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composer3.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer3, m1519paddingqDBjuR0);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                    if (!(composer3.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor22);
                    } else {
                        composer3.useNode();
                    }
                    Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                    Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash22);
                    }
                    Updater.m4617setimpl(m4610constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    composer3.startReplaceGroup(-1390714654);
                    if (str.length() > 0) {
                        ShopCardChromeKt.ShopBulletLine(str, null, composer3, 0, 2);
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1390710698);
                    if (shopItemDataModel.getNoAds()) {
                        ShopCardChromeKt.ShopBulletLine(StringResources_androidKt.stringResource(R.string.shop_no_ads_removes_forced_ads, composer3, 6), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(4), 0.0f, 0.0f, 13, null), composer3, 48, 0);
                    }
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(-1390702183);
                    if (shopItemDataModel.getAmount() > 0) {
                        ShopCardChromeKt.m14126ShopCoinAmountRowa5Y_hM(shopItemDataModel.getAmount(), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f), 0.0f, 0.0f, 13, null), 0L, composer3, 48, 4);
                    }
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 14155830, 32);
            entitlement = shopItem.getEntitlement();
            if (entitlement != null) {
            }
            entitlement = null;
            startRestartGroup.startReplaceGroup(-1404269868);
            if (entitlement == null) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
            function14 = function13;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function12 = function1;
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
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m4610constructorimpl = Updater.m4610constructorimpl(startRestartGroup);
        Updater.m4617setimpl(m4610constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4617setimpl(m4610constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m4610constructorimpl.getInserting()) {
        }
        m4610constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m4610constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m4617setimpl(m4610constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384672921, "C89@4556L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-1404330323);
        if (shopItem.getEffectCoef() == null) {
        }
        description = shopItem.getDescription();
        startRestartGroup.endReplaceGroup();
        Modifier fillMaxWidth$default22 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        float m7774constructorimpl22 = Dp.m7774constructorimpl(LossReason.LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE);
        startRestartGroup.startReplaceGroup(-1633490746);
        int i622 = i3 & 14;
        z = ((i3 & 112) == 32) | (i622 == 4);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z) {
        }
        rememberedValue = new Function0() { // from class: org.betup.ui.fragment.shop.compose.DailyDealCardKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit DailyDealCard$lambda$6$lambda$3$lambda$2;
                DailyDealCard$lambda$6$lambda$3$lambda$2 = DailyDealCardKt.DailyDealCard$lambda$6$lambda$3$lambda$2(Function1.this, shopItem);
                return DailyDealCard$lambda$6$lambda$3$lambda$2;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Modifier modifier522 = companion;
        ShopCardChromeKt.m14125ShopCardContainerUwwEzs(fillMaxWidth$default22, m7774constructorimpl22, (Function0) rememberedValue, ShopCardBorderStyleKt.shopCardBorderForSection(shopItem.getDisplaySection()), shopItem.getPopular(), null, ComposableLambdaKt.rememberComposableLambda(248999301, true, new DailyDealCardKt$DailyDealCard$2$2(shopItem, onClick), startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-111460410, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.DailyDealCardKt$DailyDealCard$2$3
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i7) {
                if ((i7 & 3) == 2 && composer3.getSkipping()) {
                    composer3.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-111460410, i7, -1, "org.betup.ui.fragment.shop.compose.DailyDealCard.<anonymous>.<anonymous> (DailyDealCard.kt:47)");
                }
                float f = 12;
                Modifier m1519paddingqDBjuR0 = PaddingKt.m1519paddingqDBjuR0(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(f), Dp.m7774constructorimpl(44));
                String str = description;
                ShopItemDataModel shopItemDataModel = shopItem;
                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap222 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer3, m1519paddingqDBjuR0);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor222);
                } else {
                    composer3.useNode();
                }
                Composer m4610constructorimpl2 = Updater.m4610constructorimpl(composer3);
                Updater.m4617setimpl(m4610constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4617setimpl(m4610constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m4610constructorimpl2.getInserting() || !Intrinsics.areEqual(m4610constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m4610constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m4610constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash222);
                }
                Updater.m4617setimpl(m4610constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer3, -384672921, "C89@4556L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                composer3.startReplaceGroup(-1390714654);
                if (str.length() > 0) {
                    ShopCardChromeKt.ShopBulletLine(str, null, composer3, 0, 2);
                }
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(-1390710698);
                if (shopItemDataModel.getNoAds()) {
                    ShopCardChromeKt.ShopBulletLine(StringResources_androidKt.stringResource(R.string.shop_no_ads_removes_forced_ads, composer3, 6), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(4), 0.0f, 0.0f, 13, null), composer3, 48, 0);
                }
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(-1390702183);
                if (shopItemDataModel.getAmount() > 0) {
                    ShopCardChromeKt.m14126ShopCoinAmountRowa5Y_hM(shopItemDataModel.getAmount(), PaddingKt.m1520paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7774constructorimpl(f), 0.0f, 0.0f, 13, null), 0L, composer3, 48, 4);
                }
                composer3.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, 14155830, 32);
        entitlement = shopItem.getEntitlement();
        if (entitlement != null) {
        }
        entitlement = null;
        startRestartGroup.startReplaceGroup(-1404269868);
        if (entitlement == null) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier4 = modifier3;
        function14 = function13;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DailyDealCard$lambda$6$lambda$3$lambda$2(Function1 function1, ShopItemDataModel shopItemDataModel) {
        function1.invoke(shopItemDataModel);
        return Unit.INSTANCE;
    }

    private static final void PreviewDailyDealCard(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1301204190);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1301204190, i, -1, "org.betup.ui.fragment.shop.compose.PreviewDailyDealCard (DailyDealCard.kt:78)");
            }
            ShopItemDataModel dailyDeal = ShopPreviewSamples.INSTANCE.getDailyDeal();
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.DailyDealCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PreviewDailyDealCard$lambda$9$lambda$8;
                        PreviewDailyDealCard$lambda$9$lambda$8 = DailyDealCardKt.PreviewDailyDealCard$lambda$9$lambda$8((ShopItemDataModel) obj);
                        return PreviewDailyDealCard$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            DailyDealCard(dailyDeal, (Function1) rememberedValue, null, PaddingKt.m1516padding3ABfNKs(Modifier.INSTANCE, Dp.m7774constructorimpl(12)), startRestartGroup, 3120, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.DailyDealCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewDailyDealCard$lambda$10;
                    PreviewDailyDealCard$lambda$10 = DailyDealCardKt.PreviewDailyDealCard$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewDailyDealCard$lambda$10;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewDailyDealCard$lambda$9$lambda$8(ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
