package org.betup.ui.fragment.shop.compose;

import android.content.Context;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.betup.R;
import org.betup.model.remote.entity.shop.EntitlementStatus;
import org.betup.model.remote.entity.shop.ShopEntitlementModel;
import org.betup.ui.fragment.home.compose.HomeCountdownFormat;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopEntitlementUi.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\tJ\u0016\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0005J\u000e\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018¨\u0006\u001d"}, d2 = {"Lorg/betup/ui/fragment/shop/compose/ShopEntitlementUi;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "hasActiveEntitlement", "", "entitlement", "Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;", "progressLabel", "", "context", "Landroid/content/Context;", "claimLabel", "nextClaimAtMillis", "", "(Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;)Ljava/lang/Long;", "remainingMsUntilNextClaim", "nowMs", "(Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;J)Ljava/lang/Long;", "nextClaimCountdownLabel", "progressPercent", "", "resolveBundleCtaLabel", "item", "Lorg/betup/ui/fragment/shop/compose/ShopItemDataModel;", "purchaseLabel", "isCtaDisabled", "isVideoUnavailable", "displayCoinAmount", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopEntitlementUi {
    public static final int $stable = 0;
    public static final ShopEntitlementUi INSTANCE = new ShopEntitlementUi();

    private ShopEntitlementUi() {
    }

    public final boolean hasActiveEntitlement(ShopEntitlementModel entitlement) {
        return entitlement != null && entitlement.getStatus() == EntitlementStatus.ACTIVE;
    }

    public final String progressLabel(Context context, ShopEntitlementModel entitlement) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entitlement, "entitlement");
        Integer totalDays = entitlement.getTotalDays();
        int daysClaimed = entitlement.getDaysClaimed() + 1;
        if (totalDays == null || totalDays.intValue() < 1) {
            String string = context.getString(R.string.shop_entitlement_day_unlimited, Integer.valueOf(daysClaimed));
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = context.getString(R.string.shop_entitlement_day_progress, Integer.valueOf(daysClaimed), totalDays);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    public final String claimLabel(Context context, ShopEntitlementModel entitlement) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entitlement, "entitlement");
        String string = context.getString(R.string.shop_claim_daily, Long.valueOf(entitlement.getDailyAmount()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final Long nextClaimAtMillis(ShopEntitlementModel entitlement) {
        Object m10853constructorimpl;
        Intrinsics.checkNotNullParameter(entitlement, "entitlement");
        String nextClaimAt = entitlement.getNextClaimAt();
        if (nextClaimAt == null) {
            return null;
        }
        if (StringsKt.isBlank(nextClaimAt)) {
            nextClaimAt = null;
        }
        if (nextClaimAt == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(Long.valueOf(Instant.parse(nextClaimAt).toEpochMilli()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m10853constructorimpl = Result.m10853constructorimpl(ResultKt.createFailure(th));
        }
        return (Long) (Result.m10859isFailureimpl(m10853constructorimpl) ? null : m10853constructorimpl);
    }

    public static /* synthetic */ Long remainingMsUntilNextClaim$default(ShopEntitlementUi shopEntitlementUi, ShopEntitlementModel shopEntitlementModel, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        return shopEntitlementUi.remainingMsUntilNextClaim(shopEntitlementModel, j);
    }

    public final Long remainingMsUntilNextClaim(ShopEntitlementModel entitlement, long nowMs) {
        Long nextClaimAtMillis;
        Intrinsics.checkNotNullParameter(entitlement, "entitlement");
        if (entitlement.getCanClaim() || (nextClaimAtMillis = nextClaimAtMillis(entitlement)) == null) {
            return null;
        }
        long longValue = nextClaimAtMillis.longValue() - nowMs;
        if (longValue > 0) {
            return Long.valueOf(longValue);
        }
        return null;
    }

    public static /* synthetic */ String nextClaimCountdownLabel$default(ShopEntitlementUi shopEntitlementUi, Context context, ShopEntitlementModel shopEntitlementModel, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = System.currentTimeMillis();
        }
        return shopEntitlementUi.nextClaimCountdownLabel(context, shopEntitlementModel, j);
    }

    public final String nextClaimCountdownLabel(Context context, ShopEntitlementModel entitlement, long nowMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entitlement, "entitlement");
        Long remainingMsUntilNextClaim = remainingMsUntilNextClaim(entitlement, nowMs);
        if (remainingMsUntilNextClaim == null) {
            return null;
        }
        return context.getString(R.string.shop_entitlement_next_claim_in, HomeCountdownFormat.INSTANCE.formatHms(remainingMsUntilNextClaim.longValue()));
    }

    public final int progressPercent(ShopEntitlementModel entitlement) {
        int intValue;
        Intrinsics.checkNotNullParameter(entitlement, "entitlement");
        Integer totalDays = entitlement.getTotalDays();
        if (totalDays == null || (intValue = totalDays.intValue()) < 1) {
            return 0;
        }
        return RangesKt.coerceIn((int) ((entitlement.getDaysClaimed() / intValue) * 100.0f), 0, 100);
    }

    public final String resolveBundleCtaLabel(Context context, ShopItemDataModel item, String purchaseLabel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(purchaseLabel, "purchaseLabel");
        ShopEntitlementModel entitlement = item.getEntitlement();
        return (entitlement != null && hasActiveEntitlement(entitlement)) ? claimLabel(context, entitlement) : purchaseLabel;
    }

    public final boolean isCtaDisabled(ShopItemDataModel item, boolean isVideoUnavailable) {
        ShopEntitlementModel entitlement;
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getId() == -1 ? isVideoUnavailable : hasActiveEntitlement(item.getEntitlement()) && ((entitlement = item.getEntitlement()) == null || !entitlement.getCanClaim());
    }

    public final long displayCoinAmount(ShopItemDataModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ShopEntitlementModel entitlement = item.getEntitlement();
        if (hasActiveEntitlement(entitlement) && entitlement != null && entitlement.getDailyAmount() > 0) {
            return entitlement.getDailyAmount();
        }
        return item.getAmount();
    }
}
