package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import io.bidmachine.media3.common.C;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.betup.model.remote.entity.shop.ShopPresentationMode;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopVideoRewardHtml.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopVideoRewardHtml;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "HERO_IMAGE_URL", "", "ASSET_PATH", "enrichForShopV2", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "context", "Landroid/content/Context;", "item", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopVideoRewardHtml {
    public static final int $stable = 0;
    private static final String ASSET_PATH = "shop/shop_free_rewards.html";
    public static final String HERO_IMAGE_URL = "https://qbetapp.info/uploads_api/shop/component_video.svg";
    public static final ShopVideoRewardHtml INSTANCE = new ShopVideoRewardHtml();

    private ShopVideoRewardHtml() {
    }

    public final ShopItemDataModel enrichForShopV2(Context context, ShopItemDataModel item) {
        Object m10853constructorimpl;
        ShopItemDataModel copy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getId() != -1) {
            return item;
        }
        String htmlContent = item.getHtmlContent();
        if (htmlContent != null && !StringsKt.isBlank(htmlContent)) {
            return item;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            ShopVideoRewardHtml shopVideoRewardHtml = this;
            InputStream open = context.getApplicationContext().getAssets().open(ASSET_PATH);
            Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                m10853constructorimpl = Result.m10853constructorimpl(readText);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        String str = (String) (Result.m10859isFailureimpl(m10853constructorimpl) ? null : m10853constructorimpl);
        if (str == null) {
            return item;
        }
        copy = item.copy((r50 & 1) != 0 ? item.id : 0L, (r50 & 2) != 0 ? item.type : null, (r50 & 4) != 0 ? item.title : null, (r50 & 8) != 0 ? item.description : null, (r50 & 16) != 0 ? item.amount : 0L, (r50 & 32) != 0 ? item.price : null, (r50 & 64) != 0 ? item.oldPrice : null, (r50 & 128) != 0 ? item.imgUrl : null, (r50 & 256) != 0 ? item.multiplier : null, (r50 & 512) != 0 ? item.popular : false, (r50 & 1024) != 0 ? item.isVideoRewardAvailable : false, (r50 & 2048) != 0 ? item.videoOfferPhase : null, (r50 & 4096) != 0 ? item.videoRemainingInInterval : 0, (r50 & 8192) != 0 ? item.videoMaxPerInterval : 0, (r50 & 16384) != 0 ? item.storeCode : null, (r50 & 32768) != 0 ? item.effectCoef : null, (r50 & 65536) != 0 ? item.effectDuration : null, (r50 & 131072) != 0 ? item.displaySection : null, (r50 & 262144) != 0 ? item.displayLabel : null, (r50 & 524288) != 0 ? item.badgeType : null, (r50 & 1048576) != 0 ? item.unitPriceLabel : null, (r50 & 2097152) != 0 ? item.entitlement : null, (r50 & 4194304) != 0 ? item.noAds : false, (r50 & 8388608) != 0 ? item.packageDays : null, (r50 & 16777216) != 0 ? item.offerExpiresAtMillis : null, (r50 & 33554432) != 0 ? item.discountPercent : 0, (r50 & 67108864) != 0 ? item.presentationMode : ShopPresentationMode.HTML_INLINE, (r50 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? item.htmlContent : str, (r50 & 268435456) != 0 ? item.htmlTemplateUrl : null, (r50 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? item.columnsInRow : 1);
        return copy;
    }
}
