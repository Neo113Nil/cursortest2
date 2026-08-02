package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import io.bidmachine.media3.common.C;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.R;
import org.betup.model.remote.entity.shop.EntitlementStatus;
import org.betup.model.remote.entity.shop.ShopDisplaySection;
import org.betup.model.remote.entity.shop.ShopEntitlementModel;
import org.betup.model.remote.entity.shop.ShopPresentationMode;
import org.betup.ui.common.video.VideoOfferAvailabilityPhase;
import org.betup.ui.dialogs.offer.OfferWebViewScreenKt;
import org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler;
import org.betup.ui.dialogs.offer.webview.OfferWebLoadSpec;
import org.betup.ui.dialogs.offer.webview.OfferWebViewConfig;
import org.modelmapper.internal.asm.Opcodes;

/* compiled from: ShopHtmlItemCard.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f\u001a2\u0010\r\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0002\b\u0010H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0006H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"ShopHtmlItemCard", "", "shopItem", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "onClick", "Lkotlin/Function1;", "", "onClaimClick", "modifier", "Landroidx/compose/ui/Modifier;", "cardAspectRatio", "", "(Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)Z", "ShopHtmlCardChrome", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PreviewShopHtmlItemCard", "(Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopHtmlItemCardKt {

    /* compiled from: ShopHtmlItemCard.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoOfferAvailabilityPhase.values().length];
            try {
                iArr[VideoOfferAvailabilityPhase.CHECKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoOfferAvailabilityPhase.UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShopPresentationMode.values().length];
            try {
                iArr2[ShopPresentationMode.HTML_REMOTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShopPresentationMode.HTML_INLINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ShopPresentationMode.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewShopHtmlItemCard$lambda$11(int i, Composer composer, int i2) {
        PreviewShopHtmlItemCard(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopHtmlCardChrome$lambda$8(ShopItemDataModel shopItemDataModel, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        ShopHtmlCardChrome(shopItemDataModel, modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final boolean ShopHtmlItemCard(final ShopItemDataModel shopItem, final Function1<? super ShopItemDataModel, Unit> onClick, Function1<? super ShopItemDataModel, Unit> function1, Modifier modifier, float f, Composer composer, int i, int i2) {
        final Function1<? super ShopItemDataModel, Unit> function12;
        String stringResource;
        String str;
        String stringResource2;
        boolean z;
        boolean z2;
        ShopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$1 shopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$1;
        ShopItemDataModel copy;
        Composer composer2;
        Intrinsics.checkNotNullParameter(shopItem, "shopItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        composer.startReplaceGroup(-1094645425);
        if ((i2 & 4) != 0) {
            composer.startReplaceGroup(1849434622);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlItemCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit ShopHtmlItemCard$lambda$1$lambda$0;
                        ShopHtmlItemCard$lambda$1$lambda$0 = ShopHtmlItemCardKt.ShopHtmlItemCard$lambda$1$lambda$0((ShopItemDataModel) obj);
                        return ShopHtmlItemCard$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            function12 = (Function1) rememberedValue;
            composer.endReplaceGroup();
        } else {
            function12 = function1;
        }
        Modifier.Companion companion = (i2 & 8) != 0 ? Modifier.INSTANCE : modifier;
        float shopHtmlAspectRatio = (i2 & 16) != 0 ? ShopHtmlLoadSpecKt.shopHtmlAspectRatio(shopItem) : f;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1094645425, i, -1, "org.betup.ui.fragment.shop.compose.ShopHtmlItemCard (ShopHtmlItemCard.kt:34)");
        }
        Modifier aspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), shopHtmlAspectRatio, false, 2, null);
        boolean z3 = shopItem.getId() == -1;
        String shopPurchaseButtonPrice = ShopPriceFormattingKt.shopPurchaseButtonPrice(shopItem.getPrice(), z3);
        if (z3) {
            composer.startReplaceGroup(312753047);
            stringResource = StringResources_androidKt.stringResource(R.string.shop_price_free, composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(312754872);
            stringResource = StringResources_androidKt.stringResource(R.string.shop_buy_for_price, new Object[]{shopPurchaseButtonPrice}, composer, 6);
            composer.endReplaceGroup();
        }
        String str2 = stringResource;
        composer.startReplaceGroup(312757469);
        if (z3 && shopItem.getVideoMaxPerInterval() > 0) {
            str = StringResources_androidKt.stringResource(R.string.shop_video_reward_remaining, new Object[]{Integer.valueOf(RangesKt.coerceAtLeast(shopItem.getVideoRemainingInInterval(), 0)), Integer.valueOf(shopItem.getVideoMaxPerInterval())}, composer, 6);
        } else {
            str = "";
        }
        composer.endReplaceGroup();
        String stringResource3 = StringResources_androidKt.stringResource(R.string.shop_video_reward_title, composer, 6);
        int i3 = WhenMappings.$EnumSwitchMapping$0[shopItem.getVideoOfferPhase().ordinal()];
        if (i3 == 1) {
            composer.startReplaceGroup(312773283);
            stringResource2 = StringResources_androidKt.stringResource(R.string.video_ads_checking_partners, composer, 6);
            composer.endReplaceGroup();
        } else if (i3 == 2) {
            composer.startReplaceGroup(312777248);
            stringResource2 = StringResources_androidKt.stringResource(R.string.video_ads_none_right_now, composer, 6);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(312779493);
            stringResource2 = StringResources_androidKt.stringResource(R.string.shop_video_reward_description, composer, 6);
            composer.endReplaceGroup();
        }
        ShopHtmlLabels shopHtmlLabels = new ShopHtmlLabels(stringResource3, stringResource2, str, shopItem.getVideoOfferPhase() == VideoOfferAvailabilityPhase.CHECKING || shopItem.getVideoOfferPhase() == VideoOfferAvailabilityPhase.ACTION_IN_PROGRESS);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        long id = shopItem.getId();
        ShopEntitlementModel entitlement = shopItem.getEntitlement();
        Object valueOf = entitlement != null ? Long.valueOf(entitlement.getId()) : null;
        ShopEntitlementModel entitlement2 = shopItem.getEntitlement();
        EntitlementStatus status = entitlement2 != null ? entitlement2.getStatus() : null;
        ShopEntitlementModel entitlement3 = shopItem.getEntitlement();
        Object valueOf2 = entitlement3 != null ? Boolean.valueOf(entitlement3.getCanClaim()) : null;
        ShopEntitlementModel entitlement4 = shopItem.getEntitlement();
        Object valueOf3 = entitlement4 != null ? Integer.valueOf(entitlement4.getDaysClaimed()) : null;
        ShopEntitlementModel entitlement5 = shopItem.getEntitlement();
        Object nextClaimAt = entitlement5 != null ? entitlement5.getNextClaimAt() : null;
        VideoOfferAvailabilityPhase videoOfferPhase = shopItem.getVideoOfferPhase();
        boolean isVideoRewardAvailable = shopItem.isVideoRewardAvailable();
        composer.startReplaceGroup(-1224400529);
        boolean changed = composer.changed(valueOf) | composer.changed(id) | composer.changed(status == null ? -1 : status.ordinal()) | composer.changed(valueOf2) | composer.changed(valueOf3) | composer.changed(nextClaimAt) | composer.changed(videoOfferPhase.ordinal()) | composer.changed(isVideoRewardAvailable);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new OfferWebViewBridgeHandler() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$1
                @Override // org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler
                public void onClose() {
                }

                @Override // org.betup.ui.dialogs.offer.bridge.OfferWebViewBridgeHandler
                public void onPurchaseRequest() {
                    ShopEntitlementModel entitlement6 = ShopItemDataModel.this.getEntitlement();
                    if (ShopEntitlementUi.INSTANCE.hasActiveEntitlement(entitlement6) && entitlement6 != null && entitlement6.getCanClaim()) {
                        function12.invoke(ShopItemDataModel.this);
                    } else {
                        if (ShopEntitlementUi.INSTANCE.hasActiveEntitlement(entitlement6)) {
                            return;
                        }
                        onClick.invoke(ShopItemDataModel.this);
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        final ShopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$1 shopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$12 = (ShopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$1) rememberedValue2;
        composer.endReplaceGroup();
        int i4 = WhenMappings.$EnumSwitchMapping$1[shopItem.getPresentationMode().ordinal()];
        if (i4 == 1) {
            z = true;
            composer.startReplaceGroup(1107556524);
            long id2 = shopItem.getId();
            Object price = shopItem.getPrice();
            Object oldPrice = shopItem.getOldPrice();
            ShopEntitlementModel entitlement6 = shopItem.getEntitlement();
            Object valueOf4 = entitlement6 != null ? Long.valueOf(entitlement6.getId()) : null;
            ShopEntitlementModel entitlement7 = shopItem.getEntitlement();
            EntitlementStatus status2 = entitlement7 != null ? entitlement7.getStatus() : null;
            ShopEntitlementModel entitlement8 = shopItem.getEntitlement();
            Object valueOf5 = entitlement8 != null ? Boolean.valueOf(entitlement8.getCanClaim()) : null;
            composer.startReplaceGroup(-1224400529);
            boolean changed2 = composer.changed(price) | composer.changed(id2) | composer.changed(oldPrice) | composer.changed(valueOf4) | composer.changed(status2 == null ? -1 : status2.ordinal()) | composer.changed(valueOf5) | composer.changed(str2) | composer.changed(shopHtmlLabels) | composer.changed(context);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = ShopHtmlLoadSpecKt.buildShopHtmlLoadSpec(context, shopItem, str2, shopHtmlLabels);
                composer.updateRememberedValue(rememberedValue3);
            }
            final OfferWebLoadSpec offerWebLoadSpec = (OfferWebLoadSpec) rememberedValue3;
            composer.endReplaceGroup();
            if (offerWebLoadSpec == null) {
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return false;
            }
            if (offerWebLoadSpec instanceof OfferWebLoadSpec.InlineHtml) {
                composer.startReplaceGroup(312839227);
                ShopHtmlCardChrome(shopItem, aspectRatio$default, ComposableLambdaKt.rememberComposableLambda(148059801, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlItemCardKt$ShopHtmlItemCard$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(148059801, i5, -1, "org.betup.ui.fragment.shop.compose.ShopHtmlItemCard.<anonymous> (ShopHtmlItemCard.kt:112)");
                        }
                        ShopWebViewScreenKt.ShopWebViewScreen(((OfferWebLoadSpec.InlineHtml) OfferWebLoadSpec.this).getHtml(), shopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$12, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, (i & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composer.endReplaceGroup();
            } else {
                if (!(offerWebLoadSpec instanceof OfferWebLoadSpec.RemoteUrl)) {
                    composer.startReplaceGroup(312837629);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(312852557);
                ShopHtmlCardChrome(shopItem, aspectRatio$default, ComposableLambdaKt.rememberComposableLambda(-1709384190, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlItemCardKt$ShopHtmlItemCard$3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1709384190, i5, -1, "org.betup.ui.fragment.shop.compose.ShopHtmlItemCard.<anonymous> (ShopHtmlItemCard.kt:122)");
                        }
                        OfferWebViewScreenKt.OfferWebViewScreen(OfferWebLoadSpec.this, shopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$12, new OfferWebViewConfig(false, false, false, null, null, null, true, 63, null), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, (i & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
            Unit unit = Unit.INSTANCE;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    composer.startReplaceGroup(312820894);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1109970215);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return false;
            }
            composer.startReplaceGroup(1109021057);
            long id3 = shopItem.getId();
            Object price2 = shopItem.getPrice();
            Object oldPrice2 = shopItem.getOldPrice();
            ShopEntitlementModel entitlement9 = shopItem.getEntitlement();
            Object valueOf6 = entitlement9 != null ? Long.valueOf(entitlement9.getId()) : null;
            ShopEntitlementModel entitlement10 = shopItem.getEntitlement();
            EntitlementStatus status3 = entitlement10 != null ? entitlement10.getStatus() : null;
            ShopEntitlementModel entitlement11 = shopItem.getEntitlement();
            Object valueOf7 = entitlement11 != null ? Boolean.valueOf(entitlement11.getCanClaim()) : null;
            composer.startReplaceGroup(-1224400529);
            boolean changed3 = composer.changed(id3) | composer.changed(price2) | composer.changed(oldPrice2) | composer.changed(valueOf6) | composer.changed(status3 == null ? -1 : status3.ordinal()) | composer.changed(valueOf7) | composer.changed(str2) | composer.changed(shopHtmlLabels) | composer.changed(context);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                z2 = false;
                shopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$1 = shopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$12;
                copy = shopItem.copy((r50 & 1) != 0 ? shopItem.id : 0L, (r50 & 2) != 0 ? shopItem.type : null, (r50 & 4) != 0 ? shopItem.title : null, (r50 & 8) != 0 ? shopItem.description : null, (r50 & 16) != 0 ? shopItem.amount : 0L, (r50 & 32) != 0 ? shopItem.price : shopPurchaseButtonPrice, (r50 & 64) != 0 ? shopItem.oldPrice : null, (r50 & 128) != 0 ? shopItem.imgUrl : null, (r50 & 256) != 0 ? shopItem.multiplier : null, (r50 & 512) != 0 ? shopItem.popular : false, (r50 & 1024) != 0 ? shopItem.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? shopItem.videoOfferPhase : null, (r50 & 4096) != 0 ? shopItem.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? shopItem.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? shopItem.storeCode : null, (r50 & 32768) != 0 ? shopItem.effectCoef : null, (r50 & 65536) != 0 ? shopItem.effectDuration : null, (r50 & 131072) != 0 ? shopItem.displaySection : null, (r50 & 262144) != 0 ? shopItem.displayLabel : null, (r50 & 524288) != 0 ? shopItem.badgeType : null, (r50 & 1048576) != 0 ? shopItem.unitPriceLabel : null, (r50 & 2097152) != 0 ? shopItem.entitlement : null, (r50 & 4194304) != 0 ? shopItem.noAds : false, (r50 & 8388608) != 0 ? shopItem.packageDays : null, (r50 & 16777216) != 0 ? shopItem.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? shopItem.discountPercent : 0, (r50 & 67108864) != 0 ? shopItem.presentationMode : null, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? shopItem.htmlContent : null, (r50 & 268435456) != 0 ? shopItem.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? shopItem.columnsInRow : 0);
                rememberedValue4 = ShopHtmlLoadSpecKt.resolveShopInlineHtml(context, copy, str2, shopHtmlLabels);
                composer2 = composer;
                composer2.updateRememberedValue(rememberedValue4);
            } else {
                shopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$1 = shopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$12;
                composer2 = composer;
                z2 = false;
            }
            final String str3 = (String) rememberedValue4;
            composer.endReplaceGroup();
            if (str3 == null) {
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return z2;
            }
            final ShopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$1 shopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$13 = shopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$1;
            z = true;
            ShopHtmlCardChrome(shopItem, aspectRatio$default, ComposableLambdaKt.rememberComposableLambda(1720697610, true, new Function2<Composer, Integer, Unit>() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlItemCardKt$ShopHtmlItemCard$4
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1720697610, i5, -1, "org.betup.ui.fragment.shop.compose.ShopHtmlItemCard.<anonymous> (ShopHtmlItemCard.kt:154)");
                    }
                    ShopWebViewScreenKt.ShopWebViewScreen(str3, shopHtmlItemCardKt$ShopHtmlItemCard$bridgeHandler$1$13, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), composer3, RendererCapabilities.DECODER_SUPPORT_MASK, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer, (i & 14) | RendererCapabilities.DECODER_SUPPORT_MASK, 0);
            composer.endReplaceGroup();
            Unit unit2 = Unit.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopHtmlItemCard$lambda$1$lambda$0(ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ShopHtmlCardChrome(final ShopItemDataModel shopItemDataModel, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        boolean z;
        Object rememberedValue;
        int currentCompositeKeyHash;
        Composer m4610constructorimpl;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(2067508169);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(shopItemDataModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= RendererCapabilities.DECODER_SUPPORT_MASK;
            } else if ((i & RendererCapabilities.DECODER_SUPPORT_MASK) == 0) {
                i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
            }
            if ((i3 & Opcodes.I2S) == 146 || !startRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2067508169, i3, -1, "org.betup.ui.fragment.shop.compose.ShopHtmlCardChrome (ShopHtmlItemCard.kt:175)");
                }
                z = !shopItemDataModel.getPopular() && shopItemDataModel.getDisplaySection() == ShopDisplaySection.DAILY_DEALS;
                startRestartGroup.startReplaceGroup(1849434622);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlItemCardKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit ShopHtmlCardChrome$lambda$6$lambda$5;
                            ShopHtmlCardChrome$lambda$6$lambda$5 = ShopHtmlItemCardKt.ShopHtmlCardChrome$lambda$6$lambda$5((GraphicsLayerScope) obj);
                            return ShopHtmlCardChrome$lambda$6$lambda$5;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifier3, (Function1) rememberedValue);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer);
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
                function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
                startRestartGroup.startReplaceGroup(240509819);
                if (z) {
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.popular_icon, startRestartGroup, 6), (String) null, OffsetKt.m1475offsetVpY3zN4(boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), Dp.m7774constructorimpl(8), Dp.m7774constructorimpl(-10)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
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
                endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlItemCardKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ShopHtmlCardChrome$lambda$8;
                        ShopHtmlCardChrome$lambda$8 = ShopHtmlItemCardKt.ShopHtmlCardChrome$lambda$8(ShopItemDataModel.this, modifier4, function2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ShopHtmlCardChrome$lambda$8;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & Opcodes.I2S) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (shopItemDataModel.getPopular()) {
        }
        startRestartGroup.startReplaceGroup(1849434622);
        rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
        }
        startRestartGroup.endReplaceGroup();
        Modifier graphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(modifier3, (Function1) rememberedValue);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
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
        function2.invoke(startRestartGroup, Integer.valueOf((i3 >> 6) & 14));
        startRestartGroup.startReplaceGroup(240509819);
        if (z) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShopHtmlCardChrome$lambda$6$lambda$5(GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setClip(false);
        return Unit.INSTANCE;
    }

    private static final void PreviewShopHtmlItemCard(Composer composer, final int i) {
        ShopItemDataModel copy;
        Composer startRestartGroup = composer.startRestartGroup(-460753926);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460753926, i, -1, "org.betup.ui.fragment.shop.compose.PreviewShopHtmlItemCard (ShopHtmlItemCard.kt:195)");
            }
            copy = r11.copy((r50 & 1) != 0 ? r11.id : 0L, (r50 & 2) != 0 ? r11.type : null, (r50 & 4) != 0 ? r11.title : null, (r50 & 8) != 0 ? r11.description : null, (r50 & 16) != 0 ? r11.amount : 0L, (r50 & 32) != 0 ? r11.price : null, (r50 & 64) != 0 ? r11.oldPrice : null, (r50 & 128) != 0 ? r11.imgUrl : null, (r50 & 256) != 0 ? r11.multiplier : null, (r50 & 512) != 0 ? r11.popular : false, (r50 & 1024) != 0 ? r11.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? r11.videoOfferPhase : null, (r50 & 4096) != 0 ? r11.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? r11.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? r11.storeCode : null, (r50 & 32768) != 0 ? r11.effectCoef : null, (r50 & 65536) != 0 ? r11.effectDuration : null, (r50 & 131072) != 0 ? r11.displaySection : null, (r50 & 262144) != 0 ? r11.displayLabel : null, (r50 & 524288) != 0 ? r11.badgeType : null, (r50 & 1048576) != 0 ? r11.unitPriceLabel : null, (r50 & 2097152) != 0 ? r11.entitlement : null, (r50 & 4194304) != 0 ? r11.noAds : false, (r50 & 8388608) != 0 ? r11.packageDays : null, (r50 & 16777216) != 0 ? r11.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? r11.discountPercent : 0, (r50 & 67108864) != 0 ? r11.presentationMode : ShopPresentationMode.HTML_INLINE, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? r11.htmlContent : null, (r50 & 268435456) != 0 ? r11.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? ShopPreviewSamples.INSTANCE.getDailyDeal().columnsInRow : 0);
            startRestartGroup.startReplaceGroup(1849434622);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlItemCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit PreviewShopHtmlItemCard$lambda$10$lambda$9;
                        PreviewShopHtmlItemCard$lambda$10$lambda$9 = ShopHtmlItemCardKt.PreviewShopHtmlItemCard$lambda$10$lambda$9((ShopItemDataModel) obj);
                        return PreviewShopHtmlItemCard$lambda$10$lambda$9;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            ShopHtmlItemCard(copy, (Function1) rememberedValue, null, AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.8367347f, false, 2, null), 0.0f, startRestartGroup, 3120, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: org.betup.ui.fragment.shop.compose.ShopHtmlItemCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PreviewShopHtmlItemCard$lambda$11;
                    PreviewShopHtmlItemCard$lambda$11 = ShopHtmlItemCardKt.PreviewShopHtmlItemCard$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                    return PreviewShopHtmlItemCard$lambda$11;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewShopHtmlItemCard$lambda$10$lambda$9(ShopItemDataModel it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
