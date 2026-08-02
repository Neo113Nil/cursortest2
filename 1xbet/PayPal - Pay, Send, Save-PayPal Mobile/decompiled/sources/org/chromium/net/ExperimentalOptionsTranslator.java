package org.chromium.net;

/* loaded from: classes5.dex */
final class ExperimentalOptionsTranslator {

    @java.lang.FunctionalInterface
    interface JsonPatch {
        void applyTo(org.json.JSONObject jSONObject) throws org.json.JSONException;
    }

    private ExperimentalOptionsTranslator() {
    }

    static void getHighSpeedVideoSizes(org.json.JSONObject jSONObject, org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions) throws org.json.JSONException {
        org.json.JSONObject highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(jSONObject, "QUIC");
        if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
            highSpeedVideoFpsRanges.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
        }
        if (connectionMigrationOptions.getAllowServerMigration() != null) {
            highSpeedVideoFpsRanges.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
        }
        if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
            highSpeedVideoFpsRanges.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
        }
        if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
            highSpeedVideoFpsRanges.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
        }
        if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
            highSpeedVideoFpsRanges.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
        }
        if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
            highSpeedVideoFpsRanges.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
        }
        if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
            highSpeedVideoFpsRanges.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
        }
        if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
            highSpeedVideoFpsRanges.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
        }
        if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
            boolean booleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
            highSpeedVideoFpsRanges.put("allow_port_migration", booleanValue);
            if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                boolean booleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                if (!booleanValue && booleanValue2) {
                    throw new java.lang.IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                }
                if (booleanValue && booleanValue2) {
                    highSpeedVideoFpsRanges.put("migrate_sessions_early_v2", true);
                    highSpeedVideoFpsRanges.put("migrate_sessions_on_network_change_v2", true);
                } else {
                    highSpeedVideoFpsRanges.put("migrate_sessions_early_v2", false);
                }
            }
        }
    }

    static void getHighSpeedVideoFpsRangesFor(org.json.JSONObject jSONObject, org.chromium.net.DnsOptions dnsOptions) throws org.json.JSONException {
        org.json.JSONObject highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(jSONObject, "AsyncDNS");
        if (dnsOptions.getUseBuiltInDnsResolver() != null) {
            highSpeedVideoFpsRanges.put("enable", dnsOptions.getUseBuiltInDnsResolver());
        }
        org.json.JSONObject highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(jSONObject, "StaleDNS");
        if (dnsOptions.getEnableStaleDns() != null) {
            highSpeedVideoFpsRanges2.put("enable", dnsOptions.getEnableStaleDns());
        }
        if (dnsOptions.getPersistHostCache() != null) {
            highSpeedVideoFpsRanges2.put("persist_to_disk", dnsOptions.getPersistHostCache());
        }
        if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
            highSpeedVideoFpsRanges2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
        }
        if (dnsOptions.getStaleDnsOptions() != null) {
            org.chromium.net.DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
            if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                highSpeedVideoFpsRanges2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
            }
            if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                highSpeedVideoFpsRanges2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
            }
            if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                highSpeedVideoFpsRanges2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
            }
            if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                highSpeedVideoFpsRanges2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
            }
        }
        org.json.JSONObject highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(jSONObject, "QUIC");
        if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
            highSpeedVideoFpsRanges3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
        }
    }

    static void getHighSpeedVideoFpsRanges(org.json.JSONObject jSONObject, org.chromium.net.QuicOptions quicOptions) throws org.json.JSONException {
        org.json.JSONObject highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(jSONObject, "QUIC");
        if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
            highSpeedVideoFpsRanges.put("host_whitelist", java.lang.String.join(",", quicOptions.getQuicHostAllowlist()));
        }
        if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
            highSpeedVideoFpsRanges.put("quic_version", java.lang.String.join(",", quicOptions.getEnabledQuicVersions()));
        }
        if (!quicOptions.getConnectionOptions().isEmpty()) {
            highSpeedVideoFpsRanges.put("connection_options", java.lang.String.join(",", quicOptions.getConnectionOptions()));
        }
        if (!quicOptions.getClientConnectionOptions().isEmpty()) {
            highSpeedVideoFpsRanges.put("client_connection_options", java.lang.String.join(",", quicOptions.getClientConnectionOptions()));
        }
        if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
            highSpeedVideoFpsRanges.put("set_quic_flags", java.lang.String.join(",", quicOptions.getExtraQuicheFlags()));
        }
        if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
            highSpeedVideoFpsRanges.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
        }
        if (quicOptions.getHandshakeUserAgent() != null) {
            highSpeedVideoFpsRanges.put("user_agent_id", quicOptions.getHandshakeUserAgent());
        }
        if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
            highSpeedVideoFpsRanges.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
        }
        if (quicOptions.getEnableTlsZeroRtt() != null) {
            highSpeedVideoFpsRanges.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
        }
        if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
            highSpeedVideoFpsRanges.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
        }
        if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
            highSpeedVideoFpsRanges.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
        }
        if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
            highSpeedVideoFpsRanges.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
        }
        if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
            highSpeedVideoFpsRanges.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
        }
        if (quicOptions.getCloseSessionsOnIpChange() != null) {
            highSpeedVideoFpsRanges.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
        }
        if (quicOptions.getGoawaySessionsOnIpChange() != null) {
            highSpeedVideoFpsRanges.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
        }
        if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
            highSpeedVideoFpsRanges.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
        }
        if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
            highSpeedVideoFpsRanges.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
        }
        if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
            highSpeedVideoFpsRanges.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
        }
    }

    static org.json.JSONObject getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new org.json.JSONObject(str);
        } catch (org.json.JSONException e) {
            throw new java.lang.IllegalArgumentException("Experimental options parsing failed", e);
        }
    }

    static org.json.JSONObject getHighSpeedVideoFpsRangesFor(org.json.JSONObject jSONObject, java.util.List<org.chromium.net.ExperimentalOptionsTranslator.JsonPatch> list) {
        if (jSONObject == null && list.isEmpty()) {
            return null;
        }
        if (jSONObject == null) {
            jSONObject = new org.json.JSONObject();
        }
        java.util.Iterator<org.chromium.net.ExperimentalOptionsTranslator.JsonPatch> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().applyTo(jSONObject);
            } catch (org.json.JSONException e) {
                throw new java.lang.IllegalStateException("Unable to apply JSON patch!", e);
            }
        }
        return jSONObject;
    }

    private static org.json.JSONObject getHighSpeedVideoFpsRanges(org.json.JSONObject jSONObject, java.lang.String str) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            return optJSONObject;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (org.json.JSONException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed adding a default object for key [");
            sb.append(str);
            sb.append("]");
            throw new java.lang.IllegalArgumentException(sb.toString(), e);
        }
    }
}
