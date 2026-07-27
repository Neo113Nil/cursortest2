package com.onesignal.otel.attributes;

import com.onesignal.otel.IOtelPlatformProvider;
import g4.AbstractC0465j;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OtelFieldsPerEvent {
    private final IOtelPlatformProvider platformProvider;

    public OtelFieldsPerEvent(IOtelPlatformProvider platformProvider) {
        i.e(platformProvider, "platformProvider");
        this.platformProvider = platformProvider;
    }

    private final UUID getRecordId() {
        UUID randomUUID = UUID.randomUUID();
        i.d(randomUUID, "randomUUID(...)");
        return randomUUID;
    }

    public final Map<String, String> getAttributes() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String uuid = getRecordId().toString();
        i.d(uuid, "toString(...)");
        linkedHashMap.put("log.record.uid", uuid);
        OtelFieldsTopLevelKt.putIfValueNotNull(OtelFieldsTopLevelKt.putIfValueNotNull(OtelFieldsTopLevelKt.putIfValueNotNull(linkedHashMap, "ossdk.app_id", this.platformProvider.getAppId()), "ossdk.onesignal_id", this.platformProvider.getOnesignalId()), "ossdk.push_subscription_id", this.platformProvider.getPushSubscriptionId());
        linkedHashMap.put("app.state", this.platformProvider.getAppState());
        linkedHashMap.put("process.uptime", String.valueOf(this.platformProvider.getProcessUptime()));
        linkedHashMap.put("thread.name", this.platformProvider.getCurrentThreadName());
        List<String> enabledFeatureFlags = this.platformProvider.getEnabledFeatureFlags();
        if (!enabledFeatureFlags.isEmpty()) {
            linkedHashMap.put("ossdk.feature_flags", AbstractC0465j.K0(AbstractC0465j.P0(enabledFeatureFlags), StringUtils.COMMA, null, null, null, 62));
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        i.d(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }
}
