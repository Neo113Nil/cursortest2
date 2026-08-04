package com.flurry.android.marketing;

import android.os.Handler;
import com.flurry.android.marketing.messaging.FlurryMessagingListener;

/* JADX INFO: loaded from: classes.dex */
public final class FlurryMarketingOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FlurryMessagingListener f10457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f10458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10461g;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f10463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public FlurryMessagingListener f10464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Handler f10465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f10466e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10467f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f10468g = -1;

        public final FlurryMarketingOptions build() {
            FlurryMarketingOptions flurryMarketingOptions = new FlurryMarketingOptions();
            flurryMarketingOptions.f10455a = this.f10462a;
            flurryMarketingOptions.f10456b = this.f10463b;
            flurryMarketingOptions.f10457c = this.f10464c;
            flurryMarketingOptions.f10458d = this.f10465d;
            flurryMarketingOptions.f10459e = this.f10466e;
            flurryMarketingOptions.f10460f = this.f10467f;
            flurryMarketingOptions.f10461g = this.f10468g;
            return flurryMarketingOptions;
        }

        public final Builder setupMessagingWithAutoIntegration() {
            this.f10462a = true;
            return this;
        }

        public final Builder setupMessagingWithManualIntegration(String str) {
            this.f10462a = false;
            this.f10463b = str;
            return this;
        }

        public final Builder withDefaultNotificationChannelId(String str) {
            this.f10466e = str;
            return this;
        }

        public final Builder withDefaultNotificationIconAccentColor(int i7) {
            this.f10468g = i7;
            return this;
        }

        public final Builder withDefaultNotificationIconResourceId(int i7) {
            this.f10467f = i7;
            return this;
        }

        public final Builder withFlurryMessagingListener(FlurryMessagingListener flurryMessagingListener) {
            this.f10464c = flurryMessagingListener;
            return this;
        }

        public final Builder withFlurryMessagingListener(FlurryMessagingListener flurryMessagingListener, Handler handler) {
            this.f10464c = flurryMessagingListener;
            this.f10465d = handler;
            return this;
        }
    }

    public final int getDefaultNotificationIconAccentColor() {
        return this.f10461g;
    }

    public final int getDefaultNotificationIconResourceId() {
        return this.f10460f;
    }

    public final Handler getFlurryMessagingHandler() {
        return this.f10458d;
    }

    public final FlurryMessagingListener getFlurryMessagingListener() {
        return this.f10457c;
    }

    public final String getNotificationChannelId() {
        return this.f10459e;
    }

    public final String getToken() {
        return this.f10456b;
    }

    public final boolean isAutoIntegration() {
        return this.f10455a;
    }
}
