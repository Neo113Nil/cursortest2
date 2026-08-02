package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/mvi/RewardsSummaryDestinations;", "", "<init>", "()V", "Landroidx/navigation3/runtime/NavKey;", "destination", "", "getIndexFromDestination", "(Landroidx/navigation3/runtime/NavKey;)I", "", "destinations", "Ljava/util/List;", "getDestinations", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsSummaryDestinations {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryDestinations INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryDestinations();
    private static final java.util.List<androidx.navigation3.runtime.NavKey> destinations = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.navigation3.runtime.NavKey[]{new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryEarnDestination((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryRedeemDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.shoppingrewards.api.rewards.summary.navigation.RewardsSummaryActivityDestination((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null)});
    public static final int $stable = 8;

    private RewardsSummaryDestinations() {
    }

    public final java.util.List<androidx.navigation3.runtime.NavKey> getDestinations() {
        return destinations;
    }

    public final int getIndexFromDestination(androidx.navigation3.runtime.NavKey destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        java.util.Iterator<androidx.navigation3.runtime.NavKey> it = destinations.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getClass() == destination.getClass()) {
                break;
            }
            i++;
        }
        return kotlin.ranges.RangesKt.coerceAtLeast(i, 0);
    }
}
