package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class RetryPolicyConfig {
    public final int exponentialMultiplier;
    public final int maxIntervalSeconds;

    public RetryPolicyConfig(int i2, int i3) {
        this.maxIntervalSeconds = i2;
        this.exponentialMultiplier = i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig retryPolicyConfig = (io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig) obj;
        return this.maxIntervalSeconds == retryPolicyConfig.maxIntervalSeconds && this.exponentialMultiplier == retryPolicyConfig.exponentialMultiplier;
    }

    public int hashCode() {
        return (this.maxIntervalSeconds * 31) + this.exponentialMultiplier;
    }

    public java.lang.String toString() {
        return "RetryPolicyConfig{maxIntervalSeconds=" + this.maxIntervalSeconds + ", exponentialMultiplier=" + this.exponentialMultiplier + '}';
    }
}
