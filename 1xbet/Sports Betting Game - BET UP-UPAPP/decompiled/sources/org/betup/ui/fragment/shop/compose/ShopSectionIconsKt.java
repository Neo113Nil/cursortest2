package org.betup.ui.fragment.shop.compose;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.model.remote.entity.shop.ShopDisplaySection;

/* compiled from: ShopSectionIcons.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"shopSectionIconRes", "", "section", "Lorg/betup/model/remote/entity/shop/ShopDisplaySection;", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ShopSectionIconsKt {

    /* compiled from: ShopSectionIcons.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShopDisplaySection.values().length];
            try {
                iArr[ShopDisplaySection.FIRST_PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShopDisplaySection.DAILY_DEALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShopDisplaySection.BUNDLES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShopDisplaySection.COIN_PACKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShopDisplaySection.FREE_REWARDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int shopSectionIconRes(ShopDisplaySection section) {
        Intrinsics.checkNotNullParameter(section, "section");
        int i = WhenMappings.$EnumSwitchMapping$0[section.ordinal()];
        if (i == 1) {
            return R.drawable.ic_gift;
        }
        if (i == 2) {
            return R.drawable.ic_fire;
        }
        if (i == 3) {
            return R.drawable.ic_calendar;
        }
        if (i == 4) {
            return R.drawable.new_betcoin;
        }
        if (i == 5) {
            return R.drawable.video_reward_shop_img;
        }
        throw new NoWhenBranchMatchedException();
    }
}
