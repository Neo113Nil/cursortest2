package org.betup.ui.fragment.shop.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.mediarouter.media.MediaRouterJellybean;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.shop.ShopDisplaySection;
import org.betup.model.remote.entity.shop.ShopPresentationMode;
import org.betup.ui.common.compose.LazyListStateNoSaveKt;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: ShopSectionedScreen.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"ShopSectionedScreen", "", "content", "Lorg/betup/ui/fragment/shop/compose/ShopContentUiModel;", "onItemClick", "Lkotlin/Function1;", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "onClaimClick", "(Lorg/betup/ui/fragment/shop/compose/ShopContentUiModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewShopSectionedScreen", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopSectionedScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewShopSectionedScreen$lambda$12(int i, Composer composer, int i2) {
        PreviewShopSectionedScreen(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopSectionedScreen$lambda$6(ShopContentUiModel shopContentUiModel, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        ShopSectionedScreen(shopContentUiModel, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopSectionedScreen$lambda$1$lambda$0(ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShopSectionedScreen(final ShopContentUiModel content, final Function1<? super ShopItemDataModel, Unit> onItemClick, Function1<? super ShopItemDataModel, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super ShopItemDataModel, Unit> function12;
        final Function1<? super ShopItemDataModel, Unit> function13;
        boolean changedInstance;
        Object rememberedValue;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer startRestartGroup = composer.startRestartGroup(1819356820);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onItemClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
        } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
            function12 = function1;
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                if (i4 == 0) {
                    startRestartGroup.startReplaceGroup(1849434622);
                    Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionedScreenKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit ShopSectionedScreen$lambda$1$lambda$0;
                                ShopSectionedScreen$lambda$1$lambda$0 = ShopSectionedScreenKt.ShopSectionedScreen$lambda$1$lambda$0((ShopItemDataModel) obj);
                                return ShopSectionedScreen$lambda$1$lambda$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    function13 = (Function1) rememberedValue2;
                } else {
                    function13 = function12;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1819356820, i3, -1, "org.betup.ui.fragment.shop.compose.ShopSectionedScreen (ShopSectionedScreen.kt:26)");
                }
                LazyListState rememberLazyListStateWithoutSavedState = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                PaddingValues m1513PaddingValuesa9UjIt4$default = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, Dp.m7774constructorimpl(12), 0.0f, Dp.m7774constructorimpl(34), 5, null);
                startRestartGroup.startReplaceGroup(-1746271574);
                changedInstance = ((i3 & 112) != 32) | startRestartGroup.changedInstance(content) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionedScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ShopSectionedScreen$lambda$5$lambda$4;
                            ShopSectionedScreen$lambda$5$lambda$4 = ShopSectionedScreenKt.ShopSectionedScreen$lambda$5$lambda$4(ShopContentUiModel.this, onItemClick, function13, (LazyListScope) obj);
                            return ShopSectionedScreen$lambda$5$lambda$4;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                Function1<? super ShopItemDataModel, Unit> function14 = function13;
                LazyDslKt.LazyColumn(fillMaxSize$default, rememberLazyListStateWithoutSavedState, m1513PaddingValuesa9UjIt4$default, false, null, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 390, 504);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function12 = function14;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Function1<? super ShopItemDataModel, Unit> function15 = function12;
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionedScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ShopSectionedScreen$lambda$6;
                        ShopSectionedScreen$lambda$6 = ShopSectionedScreenKt.ShopSectionedScreen$lambda$6(ShopContentUiModel.this, onItemClick, function15, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ShopSectionedScreen$lambda$6;
                    }
                });
                return;
            }
            return;
        }
        function12 = function1;
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        LazyListState rememberLazyListStateWithoutSavedState2 = LazyListStateNoSaveKt.rememberLazyListStateWithoutSavedState(0, 0, startRestartGroup, 0, 3);
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        PaddingValues m1513PaddingValuesa9UjIt4$default2 = PaddingKt.m1513PaddingValuesa9UjIt4$default(0.0f, Dp.m7774constructorimpl(12), 0.0f, Dp.m7774constructorimpl(34), 5, null);
        startRestartGroup.startReplaceGroup(-1746271574);
        changedInstance = ((i3 & 112) != 32) | startRestartGroup.changedInstance(content) | ((i3 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 256);
        rememberedValue = startRestartGroup.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionedScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ShopSectionedScreen$lambda$5$lambda$4;
                ShopSectionedScreen$lambda$5$lambda$4 = ShopSectionedScreenKt.ShopSectionedScreen$lambda$5$lambda$4(ShopContentUiModel.this, onItemClick, function13, (LazyListScope) obj);
                return ShopSectionedScreen$lambda$5$lambda$4;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        Function1<? super ShopItemDataModel, Unit> function142 = function13;
        LazyDslKt.LazyColumn(fillMaxSize$default2, rememberLazyListStateWithoutSavedState2, m1513PaddingValuesa9UjIt4$default2, false, null, null, null, false, null, (Function1) rememberedValue, startRestartGroup, 390, 504);
        if (ComposerKt.isTraceInProgress()) {
        }
        function12 = function142;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopSectionedScreen$lambda$5$lambda$4(ShopContentUiModel shopContentUiModel, final Function1 function1, Function1 function12, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        for (final ShopSectionUiModel shopSectionUiModel : shopContentUiModel.getSections()) {
            if (!shopSectionUiModel.getItems().isEmpty()) {
                LazyListScope.item$default(LazyColumn, "header-" + shopSectionUiModel.getType(), null, ComposableLambdaKt.composableLambdaInstance(1766703100, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionedScreenKt$ShopSectionedScreen$2$1$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                        invoke(lazyItemScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(LazyItemScope item, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(item, "$this$item");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1766703100, i, -1, "org.betup.ui.fragment.shop.compose.ShopSectionedScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopSectionedScreen.kt:37)");
                        }
                        ShopSectionHeaderKt.ShopSectionHeader(StringResources_androidKt.stringResource(ShopSectionUiModel.this.getTitleRes(), composer, 0), ShopSectionUiModel.this.getResetAtMillis(), ShopSectionUiModel.this.getType(), null, composer, 0, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }), 2, null);
                ShopSectionItemsLayoutKt.shopSectionLazyItems(LazyColumn, shopSectionUiModel.getType(), shopSectionUiModel.getItems(), function1, function12);
            }
        }
        final ShopItemDataModel videoReward = shopContentUiModel.getVideoReward();
        if (videoReward != null) {
            LazyListScope.item$default(LazyColumn, "video-header", null, ComposableSingletons$ShopSectionedScreenKt.INSTANCE.m14114getLambda$1597520466$app_release(), 2, null);
            LazyListScope.item$default(LazyColumn, "video-card", null, ComposableLambdaKt.composableLambdaInstance(66285911, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionedScreenKt$ShopSectionedScreen$2$1$2$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    ShopItemDataModel copy;
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(66285911, i, -1, "org.betup.ui.fragment.shop.compose.ShopSectionedScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShopSectionedScreen.kt:60)");
                    }
                    copy = r5.copy((r50 & 1) != 0 ? r5.id : 0L, (r50 & 2) != 0 ? r5.type : null, (r50 & 4) != 0 ? r5.title : null, (r50 & 8) != 0 ? r5.description : null, (r50 & 16) != 0 ? r5.amount : 0L, (r50 & 32) != 0 ? r5.price : null, (r50 & 64) != 0 ? r5.oldPrice : null, (r50 & 128) != 0 ? r5.imgUrl : null, (r50 & 256) != 0 ? r5.multiplier : null, (r50 & 512) != 0 ? r5.popular : false, (r50 & 1024) != 0 ? r5.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? r5.videoOfferPhase : null, (r50 & 4096) != 0 ? r5.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? r5.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? r5.storeCode : null, (r50 & 32768) != 0 ? r5.effectCoef : null, (r50 & 65536) != 0 ? r5.effectDuration : null, (r50 & 131072) != 0 ? r5.displaySection : ShopDisplaySection.FREE_REWARDS, (r50 & 262144) != 0 ? r5.displayLabel : null, (r50 & 524288) != 0 ? r5.badgeType : null, (r50 & 1048576) != 0 ? r5.unitPriceLabel : null, (r50 & 2097152) != 0 ? r5.entitlement : null, (r50 & 4194304) != 0 ? r5.noAds : false, (r50 & 8388608) != 0 ? r5.packageDays : null, (r50 & 16777216) != 0 ? r5.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? r5.discountPercent : 0, (r50 & 67108864) != 0 ? r5.presentationMode : null, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r5.htmlContent : null, (r50 & 268435456) != 0 ? r5.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? ShopItemDataModel.this.columnsInRow : 0);
                    Modifier shopItemOuterPadding = ShopSectionItemsLayoutKt.shopItemOuterPadding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null));
                    composer.startReplaceGroup(-723741073);
                    boolean z = copy.getUsesHtmlPresentation() && ShopHtmlItemCardKt.ShopHtmlItemCard(copy, function1, null, shopItemOuterPadding, 0.0f, composer, 0, 20);
                    composer.endReplaceGroup();
                    if (z) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        ShopScreenKt.ShopCard(shopItemOuterPadding, copy, function1, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void PreviewShopSectionedScreen(Composer composer, final int i) {
        ShopItemDataModel copy;
        ShopItemDataModel copy2;
        ShopItemDataModel copy3;
        Composer startRestartGroup = composer.startRestartGroup(742300052);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(742300052, i, -1, "org.betup.ui.fragment.shop.compose.PreviewShopSectionedScreen (ShopSectionedScreen.kt:84)");
            }
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionedScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ShopItemDataModel PreviewShopSectionedScreen$lambda$8$lambda$7;
                        PreviewShopSectionedScreen$lambda$8$lambda$7 = ShopSectionedScreenKt.PreviewShopSectionedScreen$lambda$8$lambda$7((ShopItemDataModel) obj);
                        return PreviewShopSectionedScreen$lambda$8$lambda$7;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Function1 function1 = (Function1) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ShopSectionUiModel[] shopSectionUiModelArr = new ShopSectionUiModel[4];
            shopSectionUiModelArr[0] = new ShopSectionUiModel(ShopDisplaySection.FIRST_PURCHASE, R.string.shop_section_first_purchase, null, CollectionsKt.listOf(function1.invoke(ShopPreviewSamples.INSTANCE.getFirstPurchase())), 4, null);
            shopSectionUiModelArr[1] = new ShopSectionUiModel(ShopDisplaySection.DAILY_DEALS, R.string.shop_section_daily_deals, Long.valueOf(System.currentTimeMillis() + 28800000), CollectionsKt.listOf(function1.invoke(ShopPreviewSamples.INSTANCE.getDailyDeal())));
            ShopDisplaySection shopDisplaySection = ShopDisplaySection.BUNDLES;
            copy = r11.copy((r50 & 1) != 0 ? r11.id : 0L, (r50 & 2) != 0 ? r11.type : null, (r50 & 4) != 0 ? r11.title : null, (r50 & 8) != 0 ? r11.description : null, (r50 & 16) != 0 ? r11.amount : 0L, (r50 & 32) != 0 ? r11.price : null, (r50 & 64) != 0 ? r11.oldPrice : null, (r50 & 128) != 0 ? r11.imgUrl : null, (r50 & 256) != 0 ? r11.multiplier : null, (r50 & 512) != 0 ? r11.popular : false, (r50 & 1024) != 0 ? r11.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? r11.videoOfferPhase : null, (r50 & 4096) != 0 ? r11.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? r11.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? r11.storeCode : null, (r50 & 32768) != 0 ? r11.effectCoef : null, (r50 & 65536) != 0 ? r11.effectDuration : null, (r50 & 131072) != 0 ? r11.displaySection : null, (r50 & 262144) != 0 ? r11.displayLabel : null, (r50 & 524288) != 0 ? r11.badgeType : null, (r50 & 1048576) != 0 ? r11.unitPriceLabel : null, (r50 & 2097152) != 0 ? r11.entitlement : null, (r50 & 4194304) != 0 ? r11.noAds : false, (r50 & 8388608) != 0 ? r11.packageDays : null, (r50 & 16777216) != 0 ? r11.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? r11.discountPercent : 0, (r50 & 67108864) != 0 ? r11.presentationMode : null, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r11.htmlContent : null, (r50 & 268435456) != 0 ? r11.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? ShopPreviewSamples.INSTANCE.getBundle30().columnsInRow : 2);
            copy2 = r11.copy((r50 & 1) != 0 ? r11.id : 0L, (r50 & 2) != 0 ? r11.type : null, (r50 & 4) != 0 ? r11.title : null, (r50 & 8) != 0 ? r11.description : null, (r50 & 16) != 0 ? r11.amount : 0L, (r50 & 32) != 0 ? r11.price : null, (r50 & 64) != 0 ? r11.oldPrice : null, (r50 & 128) != 0 ? r11.imgUrl : null, (r50 & 256) != 0 ? r11.multiplier : null, (r50 & 512) != 0 ? r11.popular : false, (r50 & 1024) != 0 ? r11.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? r11.videoOfferPhase : null, (r50 & 4096) != 0 ? r11.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? r11.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? r11.storeCode : null, (r50 & 32768) != 0 ? r11.effectCoef : null, (r50 & 65536) != 0 ? r11.effectDuration : null, (r50 & 131072) != 0 ? r11.displaySection : null, (r50 & 262144) != 0 ? r11.displayLabel : null, (r50 & 524288) != 0 ? r11.badgeType : null, (r50 & 1048576) != 0 ? r11.unitPriceLabel : null, (r50 & 2097152) != 0 ? r11.entitlement : null, (r50 & 4194304) != 0 ? r11.noAds : false, (r50 & 8388608) != 0 ? r11.packageDays : null, (r50 & 16777216) != 0 ? r11.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? r11.discountPercent : 0, (r50 & 67108864) != 0 ? r11.presentationMode : null, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r11.htmlContent : null, (r50 & 268435456) != 0 ? r11.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? ShopPreviewSamples.INSTANCE.getBundleSeason().columnsInRow : 2);
            shopSectionUiModelArr[2] = new ShopSectionUiModel(shopDisplaySection, R.string.shop_section_bundles, null, CollectionsKt.listOf((Object[]) new ShopItemDataModel[]{function1.invoke(copy), function1.invoke(copy2)}), 4, null);
            ShopDisplaySection shopDisplaySection2 = ShopDisplaySection.COIN_PACKS;
            List<ShopItemDataModel> coinPacks = ShopPreviewSamples.INSTANCE.getCoinPacks();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(coinPacks, 10));
            Iterator<T> it = coinPacks.iterator();
            while (it.hasNext()) {
                copy3 = r11.copy((r50 & 1) != 0 ? r11.id : 0L, (r50 & 2) != 0 ? r11.type : null, (r50 & 4) != 0 ? r11.title : null, (r50 & 8) != 0 ? r11.description : null, (r50 & 16) != 0 ? r11.amount : 0L, (r50 & 32) != 0 ? r11.price : null, (r50 & 64) != 0 ? r11.oldPrice : null, (r50 & 128) != 0 ? r11.imgUrl : null, (r50 & 256) != 0 ? r11.multiplier : null, (r50 & 512) != 0 ? r11.popular : false, (r50 & 1024) != 0 ? r11.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? r11.videoOfferPhase : null, (r50 & 4096) != 0 ? r11.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? r11.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? r11.storeCode : null, (r50 & 32768) != 0 ? r11.effectCoef : null, (r50 & 65536) != 0 ? r11.effectDuration : null, (r50 & 131072) != 0 ? r11.displaySection : null, (r50 & 262144) != 0 ? r11.displayLabel : null, (r50 & 524288) != 0 ? r11.badgeType : null, (r50 & 1048576) != 0 ? r11.unitPriceLabel : null, (r50 & 2097152) != 0 ? r11.entitlement : null, (r50 & 4194304) != 0 ? r11.noAds : false, (r50 & 8388608) != 0 ? r11.packageDays : null, (r50 & 16777216) != 0 ? r11.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? r11.discountPercent : 0, (r50 & 67108864) != 0 ? r11.presentationMode : null, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r11.htmlContent : null, (r50 & 268435456) != 0 ? r11.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? ((ShopItemDataModel) it.next()).columnsInRow : 2);
                arrayList.add((ShopItemDataModel) function1.invoke(copy3));
            }
            shopSectionUiModelArr[3] = new ShopSectionUiModel(shopDisplaySection2, R.string.shop_section_coin_packs, null, arrayList, 4, null);
            ShopContentUiModel shopContentUiModel = new ShopContentUiModel(CollectionsKt.listOf((Object[]) shopSectionUiModelArr), ShopPreviewSamples.INSTANCE.getVideoReward(), null, true, 4, null);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionedScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PreviewShopSectionedScreen$lambda$11$lambda$10;
                        PreviewShopSectionedScreen$lambda$11$lambda$10 = ShopSectionedScreenKt.PreviewShopSectionedScreen$lambda$11$lambda$10((ShopItemDataModel) obj);
                        return PreviewShopSectionedScreen$lambda$11$lambda$10;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            ShopSectionedScreen(shopContentUiModel, (Function1) rememberedValue2, null, startRestartGroup, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopSectionedScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewShopSectionedScreen$lambda$12;
                    PreviewShopSectionedScreen$lambda$12 = ShopSectionedScreenKt.PreviewShopSectionedScreen$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewShopSectionedScreen$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShopItemDataModel PreviewShopSectionedScreen$lambda$8$lambda$7(ShopItemDataModel item) {
        ShopItemDataModel copy;
        Intrinsics.checkNotNullParameter(item, "item");
        copy = item.copy((r50 & 1) != 0 ? item.id : 0L, (r50 & 2) != 0 ? item.type : null, (r50 & 4) != 0 ? item.title : null, (r50 & 8) != 0 ? item.description : null, (r50 & 16) != 0 ? item.amount : 0L, (r50 & 32) != 0 ? item.price : null, (r50 & 64) != 0 ? item.oldPrice : null, (r50 & 128) != 0 ? item.imgUrl : null, (r50 & 256) != 0 ? item.multiplier : null, (r50 & 512) != 0 ? item.popular : false, (r50 & 1024) != 0 ? item.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? item.videoOfferPhase : null, (r50 & 4096) != 0 ? item.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? item.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? item.storeCode : null, (r50 & 32768) != 0 ? item.effectCoef : null, (r50 & 65536) != 0 ? item.effectDuration : null, (r50 & 131072) != 0 ? item.displaySection : null, (r50 & 262144) != 0 ? item.displayLabel : null, (r50 & 524288) != 0 ? item.badgeType : null, (r50 & 1048576) != 0 ? item.unitPriceLabel : null, (r50 & 2097152) != 0 ? item.entitlement : null, (r50 & 4194304) != 0 ? item.noAds : false, (r50 & 8388608) != 0 ? item.packageDays : null, (r50 & 16777216) != 0 ? item.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? item.discountPercent : 0, (r50 & 67108864) != 0 ? item.presentationMode : ShopPresentationMode.HTML_INLINE, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? item.htmlContent : null, (r50 & 268435456) != 0 ? item.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? item.columnsInRow : 0);
        return copy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewShopSectionedScreen$lambda$11$lambda$10(ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
