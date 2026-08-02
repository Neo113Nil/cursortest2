package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/material/SliderColors;", "", "", "enabled", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "thumbColor", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", com.paypal.oslo.feature.shoppingrewards.rewards.common.analytics.RewardsAnalyticsConstants.Action.ACTIVE, "trackColor", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "tickColor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SliderColors {
    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> thumbColor(boolean z, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> tickColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i);

    androidx.compose.runtime.State<androidx.compose.ui.graphics.Color> trackColor(boolean z, boolean z2, androidx.compose.runtime.Composer composer, int i);
}
