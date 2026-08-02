package com.iovation.mobile.android;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001:\u0001\u0002"}, d2 = {"Lcom/iovation/mobile/android/FraudForceConfiguration;", "", "Builder"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FraudForceConfiguration {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010"}, d2 = {"Lcom/iovation/mobile/android/FraudForceConfiguration$Builder;", "", "<init>", "()V", "", "subscriberKey", "(Ljava/lang/String;)Lcom/iovation/mobile/android/FraudForceConfiguration$Builder;", "", "phoneHomeEnabled", "enableNetworkCalls", "(Z)Lcom/iovation/mobile/android/FraudForceConfiguration$Builder;", "Lcom/iovation/mobile/android/FraudForceConfiguration;", "build", "()Lcom/iovation/mobile/android/FraudForceConfiguration;", "isNetworkCallsEnabled", "Z", "Ljava/lang/String;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private boolean isNetworkCallsEnabled;
        private java.lang.String subscriberKey;

        public final com.iovation.mobile.android.FraudForceConfiguration build() {
            java.lang.String str = this.subscriberKey;
            if (str != null) {
                kotlin.text.StringsKt.isBlank(str);
            }
            return new com.iovation.mobile.android.FraudForceConfiguration(this.isNetworkCallsEnabled, this.subscriberKey);
        }

        public final com.iovation.mobile.android.FraudForceConfiguration.Builder enableNetworkCalls(boolean phoneHomeEnabled) {
            this.isNetworkCallsEnabled = phoneHomeEnabled;
            return this;
        }

        public final com.iovation.mobile.android.FraudForceConfiguration.Builder subscriberKey(java.lang.String subscriberKey) {
            this.subscriberKey = subscriberKey;
            return this;
        }
    }

    public FraudForceConfiguration(boolean z, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
