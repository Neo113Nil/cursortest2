package com.chartboost.sdk.callbacks;

import androidx.core.app.NotificationCompat;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import com.ironsource.Wf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH&J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH&J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/chartboost/sdk/callbacks/AdCallback;", "", Wf.j, "", NotificationCompat.CATEGORY_EVENT, "Lcom/chartboost/sdk/events/CacheEvent;", "error", "Lcom/chartboost/sdk/events/CacheError;", "onAdRequestedToShow", "Lcom/chartboost/sdk/events/ShowEvent;", "onAdShown", "Lcom/chartboost/sdk/events/ShowError;", Wf.f, "Lcom/chartboost/sdk/events/ClickEvent;", "Lcom/chartboost/sdk/events/ClickError;", "onImpressionRecorded", "Lcom/chartboost/sdk/events/ImpressionEvent;", "onAdExpired", "Lcom/chartboost/sdk/events/ExpirationEvent;", "ChartboostMonetization-9.13.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AdCallback {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAdExpired(AdCallback adCallback, ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
        }
    }

    void onAdClicked(ClickEvent event, ClickError error);

    void onAdExpired(ExpirationEvent event);

    void onAdLoaded(CacheEvent event, CacheError error);

    void onAdRequestedToShow(ShowEvent event);

    void onAdShown(ShowEvent event, ShowError error);

    void onImpressionRecorded(ImpressionEvent event);
}
