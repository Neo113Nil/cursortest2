package org.betup.services.offer;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.util.Log;
import io.bidmachine.iab.vast.tags.VastTagName;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.services.user.UserAnalyticsTagsService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: PromoInterstitialRulesSync.kt */
@Singleton
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\tJ\u0006\u0010\u000f\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lorg/betup/services/offer/PromoInterstitialRulesSync;", "", "userAnalyticsTagsService", "Lorg/betup/services/user/UserAnalyticsTagsService;", "promoInterstitialSettingsService", "Lorg/betup/services/offer/PromoInterstitialSettingsService;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/services/user/UserAnalyticsTagsService;Lorg/betup/services/offer/PromoInterstitialSettingsService;)V", "lastRefreshStartedAtMs", "", "refreshWhenIdle", "", "source", "", "minIntervalMs", "clear", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromoInterstitialRulesSync {
    public static final long DEFAULT_MIN_INTERVAL_MS = 30000;
    public static final long ENTRY_SCREEN_MIN_INTERVAL_MS = 10000;
    private static final String TAG = "InterstitialRules";
    private volatile long lastRefreshStartedAtMs;
    private final PromoInterstitialSettingsService promoInterstitialSettingsService;
    private final UserAnalyticsTagsService userAnalyticsTagsService;
    public static final int $stable = 8;

    @Inject
    public PromoInterstitialRulesSync(UserAnalyticsTagsService userAnalyticsTagsService, PromoInterstitialSettingsService promoInterstitialSettingsService) {
        Intrinsics.checkNotNullParameter(userAnalyticsTagsService, "userAnalyticsTagsService");
        Intrinsics.checkNotNullParameter(promoInterstitialSettingsService, "promoInterstitialSettingsService");
        this.userAnalyticsTagsService = userAnalyticsTagsService;
        this.promoInterstitialSettingsService = promoInterstitialSettingsService;
    }

    public static /* synthetic */ void refreshWhenIdle$default(PromoInterstitialRulesSync promoInterstitialRulesSync, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 30000;
        }
        promoInterstitialRulesSync.refreshWhenIdle(str, j);
    }

    public final void refreshWhenIdle(final String source, long minIntervalMs) {
        Intrinsics.checkNotNullParameter(source, "source");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastRefreshStartedAtMs < minIntervalMs) {
            Log.d(TAG, "refresh skipped (" + source + "): throttled " + minIntervalMs + "ms");
            return;
        }
        this.lastRefreshStartedAtMs = currentTimeMillis;
        Log.d(TAG, "refresh queued when idle (" + source + ")");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: org.betup.services.offer.PromoInterstitialRulesSync$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PromoInterstitialRulesSync.refreshWhenIdle$lambda$1(PromoInterstitialRulesSync.this, source);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshWhenIdle$lambda$1(final PromoInterstitialRulesSync promoInterstitialRulesSync, final String str) {
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: org.betup.services.offer.PromoInterstitialRulesSync$$ExternalSyntheticLambda1
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                boolean refreshWhenIdle$lambda$1$lambda$0;
                refreshWhenIdle$lambda$1$lambda$0 = PromoInterstitialRulesSync.refreshWhenIdle$lambda$1$lambda$0(PromoInterstitialRulesSync.this, str);
                return refreshWhenIdle$lambda$1$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshWhenIdle$lambda$1$lambda$0(PromoInterstitialRulesSync promoInterstitialRulesSync, String str) {
        promoInterstitialRulesSync.userAnalyticsTagsService.refresh();
        promoInterstitialRulesSync.promoInterstitialSettingsService.refresh();
        Log.d(TAG, "refresh started (" + str + ")");
        return false;
    }

    public final void clear() {
        this.userAnalyticsTagsService.clear();
        this.promoInterstitialSettingsService.clear();
    }
}
