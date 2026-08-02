package org.betup.services.offer;

import android.app.Activity;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.bus.RemoveAdsMessage;
import org.betup.services.ads.MobileAdsInitializer;
import org.betup.services.billing.PurchaseCompletedListener;
import org.betup.services.storage.LocalPreferencesService;
import org.betup.services.user.UserService;
import org.greenrobot.eventbus.EventBus;

@Singleton
/* loaded from: classes2.dex */
public class AdsInitializer implements PurchaseCompletedListener {
    private Activity activity;
    private boolean initScheduled;
    private boolean isInitialized;
    private final LocalPreferencesService localPreferencesService;
    private final MobileAdsInitializer mobileAdsInitializer;
    private final UserService userService;

    public interface OnAdInitializeCompletedListener {
        void onAdInitialized();
    }

    @Inject
    public AdsInitializer(UserService userService, LocalPreferencesService localPreferencesService, MobileAdsInitializer mobileAdsInitializer) {
        this.userService = userService;
        this.localPreferencesService = localPreferencesService;
        this.mobileAdsInitializer = mobileAdsInitializer;
    }

    public void bindActivity(Activity activity) {
        this.activity = activity;
    }

    public boolean init(final OnAdInitializeCompletedListener completedListener) {
        Activity activity;
        if (this.isInitialized || this.initScheduled || !this.userService.isRegistered() || (activity = this.activity) == null || activity.isFinishing()) {
            return false;
        }
        this.initScheduled = true;
        boolean init = this.mobileAdsInitializer.init(this.activity, new MobileAdsInitializer.OnAdInitializeCompletedListener() { // from class: org.betup.services.offer.AdsInitializer$$ExternalSyntheticLambda0
            @Override // org.betup.services.ads.MobileAdsInitializer.OnAdInitializeCompletedListener
            public final void onAdInitialized() {
                AdsInitializer.this.m12781lambda$init$0$orgbetupservicesofferAdsInitializer(completedListener);
            }
        });
        if (!init) {
            this.initScheduled = false;
        }
        return init;
    }

    /* renamed from: lambda$init$0$org-betup-services-offer-AdsInitializer, reason: not valid java name */
    /* synthetic */ void m12781lambda$init$0$orgbetupservicesofferAdsInitializer(OnAdInitializeCompletedListener onAdInitializeCompletedListener) {
        this.isInitialized = true;
        this.initScheduled = false;
        if (onAdInitializeCompletedListener != null) {
            onAdInitializeCompletedListener.onAdInitialized();
        }
    }

    public boolean isInitialized() {
        return this.mobileAdsInitializer.getIsInitialized() || this.isInitialized;
    }

    @Override // org.betup.services.billing.PurchaseCompletedListener
    public void purchaseCompleted() {
        this.localPreferencesService.saveUserConsentAsked(true);
        EventBus.getDefault().post(new RemoveAdsMessage());
    }
}
