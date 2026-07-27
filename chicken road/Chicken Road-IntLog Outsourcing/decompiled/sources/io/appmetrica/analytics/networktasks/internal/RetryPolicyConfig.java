package io.appmetrica.analytics.networktasks.internal;

import B0.o;

/* loaded from: classes.dex */
public class RetryPolicyConfig {
    public final int exponentialMultiplier;
    public final int maxIntervalSeconds;

    public RetryPolicyConfig(int i2, int i3) {
        this.maxIntervalSeconds = i2;
        this.exponentialMultiplier = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RetryPolicyConfig retryPolicyConfig = (RetryPolicyConfig) obj;
        return this.maxIntervalSeconds == retryPolicyConfig.maxIntervalSeconds && this.exponentialMultiplier == retryPolicyConfig.exponentialMultiplier;
    }

    public int hashCode() {
        return (this.maxIntervalSeconds * 31) + this.exponentialMultiplier;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RetryPolicyConfig{maxIntervalSeconds=");
        sb.append(this.maxIntervalSeconds);
        sb.append(", exponentialMultiplier=");
        return o.k(sb, this.exponentialMultiplier, '}');
    }
}
