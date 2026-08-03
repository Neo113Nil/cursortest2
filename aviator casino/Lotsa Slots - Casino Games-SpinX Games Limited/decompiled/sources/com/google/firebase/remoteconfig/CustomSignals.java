package com.google.firebase.remoteconfig;

/* loaded from: classes3.dex */
public class CustomSignals {
    final java.util.Map<java.lang.String, java.lang.String> customSignals;

    public static class Builder {
        private java.util.Map<java.lang.String, java.lang.String> customSignals = new java.util.HashMap();

        public com.google.firebase.remoteconfig.CustomSignals.Builder put(java.lang.String str, java.lang.String str2) {
            this.customSignals.put(str, str2);
            return this;
        }

        public com.google.firebase.remoteconfig.CustomSignals.Builder put(java.lang.String str, long j) {
            this.customSignals.put(str, java.lang.Long.toString(j));
            return this;
        }

        public com.google.firebase.remoteconfig.CustomSignals.Builder put(java.lang.String str, double d) {
            this.customSignals.put(str, java.lang.Double.toString(d));
            return this;
        }

        public com.google.firebase.remoteconfig.CustomSignals build() {
            return new com.google.firebase.remoteconfig.CustomSignals(this);
        }
    }

    CustomSignals(com.google.firebase.remoteconfig.CustomSignals.Builder builder) {
        this.customSignals = builder.customSignals;
    }
}
