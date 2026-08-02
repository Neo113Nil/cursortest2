package com.datadog.trace.api;

/* loaded from: classes3.dex */
public enum ConfigOrigin {
    ENV("env_var"),
    REMOTE(com.paypal.oslo.core.remoteconfig.companion.RemoteConfigSectionFactory.REMOTE_CONFIG_SECTION_ID),
    JVM_PROP("jvm_prop"),
    DEFAULT(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT);

    public final java.lang.String value;

    ConfigOrigin(java.lang.String str) {
        this.value = str;
    }
}
