package com.datadog.trace.api;

/* loaded from: classes3.dex */
public final class ConfigSetting {
    private static final java.util.Set<java.lang.String> getHighSpeedVideoSizes = new java.util.HashSet(java.util.Arrays.asList("DD_API_KEY", "dd.api-key", "dd.profiling.api-key", "dd.profiling.apikey"));
    public final java.lang.String key;
    public final com.datadog.trace.api.ConfigOrigin origin;
    public final java.lang.Object value;

    public ConfigSetting(java.lang.String str, java.lang.String str2, com.datadog.trace.api.ConfigOrigin configOrigin) {
        this.key = str;
        this.value = getHighSpeedVideoSizes.contains(str) ? "<hidden>" : str2;
        this.origin = configOrigin;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.datadog.trace.api.ConfigSetting configSetting = (com.datadog.trace.api.ConfigSetting) obj;
        return this.key.equals(configSetting.key) && java.util.Objects.equals(this.value, configSetting.value) && this.origin == configSetting.origin;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.key, this.value, this.origin);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfigSetting{key='");
        sb.append(this.key);
        sb.append("', value=");
        sb.append(this.value);
        sb.append(", origin=");
        sb.append(this.origin);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
