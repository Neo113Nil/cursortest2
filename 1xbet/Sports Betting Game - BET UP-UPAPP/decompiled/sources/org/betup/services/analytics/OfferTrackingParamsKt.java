package org.betup.services.analytics;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;

/* compiled from: OfferTrackingParams.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"offerIdAnalyticsParams", "", "", "Landroid/content/Context;", "offerId", "app_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OfferTrackingParamsKt {
    public static final Map<String, String> offerIdAnalyticsParams(Context context, String offerId) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        String string = context.getString(R.string.analytics_param_offer_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return MapsKt.mapOf(TuplesKt.to(string, offerId));
    }
}
