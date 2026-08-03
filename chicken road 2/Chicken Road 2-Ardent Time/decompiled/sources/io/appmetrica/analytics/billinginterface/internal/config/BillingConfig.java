package io.appmetrica.analytics.billinginterface.internal.config;

/* loaded from: classes.dex */
public class BillingConfig {
    public final int firstCollectingInappMaxAgeSeconds;
    public final int sendFrequencySeconds;

    public BillingConfig(int i2, int i3) {
        this.sendFrequencySeconds = i2;
        this.firstCollectingInappMaxAgeSeconds = i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        io.appmetrica.analytics.billinginterface.internal.config.BillingConfig billingConfig = (io.appmetrica.analytics.billinginterface.internal.config.BillingConfig) obj;
        return this.sendFrequencySeconds == billingConfig.sendFrequencySeconds && this.firstCollectingInappMaxAgeSeconds == billingConfig.firstCollectingInappMaxAgeSeconds;
    }

    public int hashCode() {
        return (this.sendFrequencySeconds * 31) + this.firstCollectingInappMaxAgeSeconds;
    }

    public java.lang.String toString() {
        return "BillingConfig{sendFrequencySeconds=" + this.sendFrequencySeconds + ", firstCollectingInappMaxAgeSeconds=" + this.firstCollectingInappMaxAgeSeconds + "}";
    }
}
