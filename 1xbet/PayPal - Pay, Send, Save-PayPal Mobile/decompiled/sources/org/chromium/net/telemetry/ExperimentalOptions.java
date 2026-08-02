package org.chromium.net.telemetry;

/* loaded from: classes18.dex */
public final class ExperimentalOptions {
    private static final java.lang.String Camera2StreamConfigurationMap = "ExperimentalOptions";
    public static final int UNSET_INT_VALUE = -1;
    public static final java.util.Set<java.lang.String> VALID_CONNECTION_OPTIONS = androidx.media3.muxer.AacWriter$$ExternalSyntheticBackport0.m9181m((java.lang.Object[]) new java.lang.String[]{"CHLO", "SHLO", "SCFG", "REJ", "CETV", "PRST", "SCUP", "ALPN", "P256", "C255", "AESG", "CC20", "QBIC", "AFCW", "IFW5", "IFW6", "IFW7", "IFW8", "IFW9", "IFWA", "TBBR", "1RTT", "2RTT", "LRTT", "BBS1", "BBS2", "BBS3", "BBS4", "BBS5", "BBRR", "BBR1", "BBR2", "BBR3", "BBR4", "BBR5", "BBR9", "BBRA", "BBRB", "BBRS", "BBQ1", "BBQ2", "BBQ3", "BBQ5", "BBQ6", "BBQ7", "BBQ8", "BBQ9", "BBQ0", "RENO", "TPCC", "BYTE", "IW03", "IW10", "IW20", "IW50", "B2ON", "B2NA", "B2NE", "B2RP", "B2LO", "B2HR", "B2SL", "B2H2", "B2RC", "BSAO", "B2DL", "B201", "B202", "B203", "B204", "B205", "B206", "B207", "NTLP", "1TLP", "1RTO", "NRTO", "TIME", "ATIM", "MIN1", "MIN4", "MAD0", "MAD2", "MAD3", "1ACK", "AKD3", "AKDU", "AFFE", "AFF1", "AFF2", "SSLR", "NPRR", "2RTO", "3RTO", "4RTO", "5RTO", "6RTO", "CBHD", "NBHD", "CONH", "LFAK", "STMP", "EACK", "ILD0", "ILD1", "ILD2", "ILD3", "ILD4", "RUNT", "NSTP", "NRTT", "1PTO", "2PTO", "6PTO", "7PTO", "8PTO", "PTOS", "PTOA", "PEB1", "PEB2", "PVS1", "PAG1", "PAG2", "PSDA", "PLE1", "PLE2", "APTO", "ELDT", "RVCM", "TCID", "MPTH", "NCMR", "DFER", "NPCO", "BWRE", "BWMX", "BWID", "BWI1", "BWRS", "BWS2", "BWS3", "BWS4", "BWS5", "BWS6", "BWP0", "BWP1", "BWP2", "BWP3", "BWP4", "BWG4", "BWG7", "BWG8", "BWS7", "BWM3", "BWM4", "ICW1", "DTOS", "FIDT", "3AFF", "10AF", "MTUH", "MTUL", "NSLC", "NCHP", "NBPE", "X509", "X59R", "CHID", "VER ", "NONC", "NONP", "KEXS", "AEAD", "COPT", "CLOP", "ICSL", "MIBS", "MIUS", "ADE ", "IRTT", "TRTT", "SNI ", "PUBS", "SCID", "ORBT", "PDMD", "PROF", "CCRT", "EXPY", "STTL", "SFCW", "CFCW", "UAID", "XLCT", "QLVE", "PDP1", "PDP2", "PDP3", "PDP5", "QNZ2", "MAD", "IGNP", "SRWP", "ROWF", "ROWR", "GSR0", "GSR1", "GSR2", "GSR3", "NRES", "INVC", "GWCH", "YTCH", "ACH0", "RREJ", "CADR", "ASAD", "SRST", "CIDK", "CIDS", "RNON", "RSEQ", "PAD ", "EPID", "SNO0", "STK0", "CRT255", "CSCT"});
    private org.json.JSONObject getHighSpeedVideoSizes;

    public ExperimentalOptions(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.json.JSONObject();
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            this.getHighSpeedVideoSizes = (org.json.JSONObject) new org.json.JSONTokener(str).nextValue();
        } catch (java.lang.ClassCastException | org.json.JSONException e) {
            if (android.util.Log.isLoggable(Camera2StreamConfigurationMap, 2)) {
                new java.lang.Object[]{e.getMessage()};
            }
        }
    }

    public final java.lang.String getConnectionOptionsOption() {
        java.lang.String str = (java.lang.String) getHighSpeedVideoFpsRangesFor("QUIC", "connection_options", null, java.lang.String.class);
        if (str == null || str.isEmpty()) {
            return str;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : str.split(",", -1)) {
            if (VALID_CONNECTION_OPTIONS.contains(str2.toUpperCase(java.util.Locale.ROOT).trim())) {
                arrayList.add(str2);
            }
        }
        return java.lang.String.join(",", arrayList);
    }

    public final org.chromium.net.telemetry.OptionalBoolean getStoreServerConfigsInPropertiesOption() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("QUIC", "store_server_configs_in_properties", null, java.lang.Boolean.class));
    }

    public final int getMaxServerConfigsStoredInPropertiesOption() {
        return ((java.lang.Integer) getHighSpeedVideoFpsRangesFor("QUIC", "max_server_configs_stored_in_properties", -1, java.lang.Integer.class)).intValue();
    }

    public final int getIdleConnectionTimeoutSecondsOption() {
        return ((java.lang.Integer) getHighSpeedVideoFpsRangesFor("QUIC", "idle_connection_timeout_seconds", -1, java.lang.Integer.class)).intValue();
    }

    public final org.chromium.net.telemetry.OptionalBoolean getGoawaySessionsOnIpChangeOption() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("QUIC", "goaway_sessions_on_ip_change", null, java.lang.Boolean.class));
    }

    public final org.chromium.net.telemetry.OptionalBoolean getCloseSessionsOnIpChangeOption() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("QUIC", "close_sessions_on_ip_change", null, java.lang.Boolean.class));
    }

    public final org.chromium.net.telemetry.OptionalBoolean getMigrateSessionsOnNetworkChangeV2Option() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("QUIC", "migrate_sessions_on_network_change_v2", null, java.lang.Boolean.class));
    }

    public final org.chromium.net.telemetry.OptionalBoolean getMigrateSessionsEarlyV2() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("QUIC", "migrate_sessions_early_v2", null, java.lang.Boolean.class));
    }

    public final org.chromium.net.telemetry.OptionalBoolean getDisableBidirectionalStreamsOption() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("QUIC", "disable_bidirectional_streams", null, java.lang.Boolean.class));
    }

    public final int getMaxTimeBeforeCryptoHandshakeSecondsOption() {
        return ((java.lang.Integer) getHighSpeedVideoFpsRangesFor("QUIC", "max_time_before_crypto_handshake_seconds", -1, java.lang.Integer.class)).intValue();
    }

    public final int getMaxIdleTimeBeforeCryptoHandshakeSecondsOption() {
        return ((java.lang.Integer) getHighSpeedVideoFpsRangesFor("QUIC", "max_idle_time_before_crypto_handshake_seconds", -1, java.lang.Integer.class)).intValue();
    }

    public final org.chromium.net.telemetry.OptionalBoolean getEnableSocketRecvOptimizationOption() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("QUIC", "enable_socket_recv_optimization", null, java.lang.Boolean.class));
    }

    public final org.chromium.net.telemetry.OptionalBoolean getAllowPortMigration() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("QUIC", "allow_port_migration", null, java.lang.Boolean.class));
    }

    public final org.chromium.net.telemetry.OptionalBoolean getRaceStaleDnsOnConnection() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("QUIC", "race_stale_dns_on_connection", null, java.lang.Boolean.class));
    }

    public final java.lang.String getHostWhitelist() {
        return (java.lang.String) getHighSpeedVideoFpsRangesFor("QUIC", "host_whitelist", null, java.lang.String.class);
    }

    public final java.lang.String getUserAgentId() {
        return (java.lang.String) getHighSpeedVideoFpsRangesFor("QUIC", "user_agent_id", null, java.lang.String.class);
    }

    public final org.chromium.net.telemetry.OptionalBoolean getAsyncDnsEnableOption() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("AsyncDNS", "enable", null, java.lang.Boolean.class));
    }

    public final org.chromium.net.telemetry.OptionalBoolean getStaleDnsEnableOption() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("StaleDNS", "enable", null, java.lang.Boolean.class));
    }

    public final int getStaleDnsDelayMillisOption() {
        return ((java.lang.Integer) getHighSpeedVideoFpsRangesFor("StaleDNS", "delay_ms", -1, java.lang.Integer.class)).intValue();
    }

    public final int getStaleDnsMaxExpiredTimeMillisOption() {
        return ((java.lang.Integer) getHighSpeedVideoFpsRangesFor("StaleDNS", "max_expired_time_ms", -1, java.lang.Integer.class)).intValue();
    }

    public final int getStaleDnsMaxStaleUsesOption() {
        return ((java.lang.Integer) getHighSpeedVideoFpsRangesFor("StaleDNS", "max_stale_uses", -1, java.lang.Integer.class)).intValue();
    }

    public final org.chromium.net.telemetry.OptionalBoolean getStaleDnsAllowOtherNetworkOption() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("StaleDNS", "allow_other_network", null, java.lang.Boolean.class));
    }

    public final org.chromium.net.telemetry.OptionalBoolean getStaleDnsPersistToDiskOption() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("StaleDNS", "persist_to_disk", null, java.lang.Boolean.class));
    }

    public final int getStaleDnsPersistDelayMillisOption() {
        return ((java.lang.Integer) getHighSpeedVideoFpsRangesFor("StaleDNS", "persist_delay_ms", -1, java.lang.Integer.class)).intValue();
    }

    public final org.chromium.net.telemetry.OptionalBoolean getStaleDnsUseStaleOnNameNotResolvedOption() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoFpsRangesFor("StaleDNS", "use_stale_on_name_not_resolved", null, java.lang.Boolean.class));
    }

    public final org.chromium.net.telemetry.OptionalBoolean getDisableIpv6OnWifiOption() {
        return org.chromium.net.telemetry.OptionalBoolean.fromBoolean((java.lang.Boolean) getHighSpeedVideoSizes("disable_ipv6_on_wifi", java.lang.Boolean.class));
    }

    private <T> T getHighSpeedVideoFpsRangesFor(java.lang.String str, java.lang.String str2, T t, java.lang.Class<T> cls) {
        org.json.JSONObject jSONObject;
        if (this.getHighSpeedVideoSizes.length() == 0) {
            return t;
        }
        try {
            jSONObject = this.getHighSpeedVideoSizes.getJSONObject(str);
        } catch (org.json.JSONException e) {
            if (android.util.Log.isLoggable(Camera2StreamConfigurationMap, 2)) {
                new java.lang.Object[]{str, e.getMessage()};
            }
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return t;
        }
        try {
            return cls.cast(jSONObject.get(str2));
        } catch (java.lang.ClassCastException | org.json.JSONException e2) {
            if (!android.util.Log.isLoggable(Camera2StreamConfigurationMap, 2)) {
                return t;
            }
            new java.lang.Object[]{str2, e2.getMessage()};
            return t;
        }
    }

    private <T> T getHighSpeedVideoSizes(java.lang.String str, java.lang.Class<T> cls) {
        if (this.getHighSpeedVideoSizes.length() == 0) {
            return null;
        }
        try {
            return cls.cast(this.getHighSpeedVideoSizes.get(str));
        } catch (java.lang.ClassCastException | org.json.JSONException e) {
            if (!android.util.Log.isLoggable(Camera2StreamConfigurationMap, 2)) {
                return null;
            }
            new java.lang.Object[]{str, e.getMessage()};
            return null;
        }
    }
}
