package com.datadog.trace.bootstrap.config.provider;

/* loaded from: classes3.dex */
public final class ConfigProvider {
    private static final com.datadog.trace.logger.Logger getHighSpeedVideoFpsRanges = com.datadog.trace.logger.LoggerFactory.getLogger((java.lang.Class<?>) com.datadog.trace.bootstrap.config.provider.ConfigProvider.class);
    private final com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source[] getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRangesFor;

    static final class Singleton {
        private static final com.datadog.trace.bootstrap.config.provider.ConfigProvider getHighResolutionOutputSizeshNQ4ISI = com.datadog.trace.bootstrap.config.provider.ConfigProvider.createDefault();

        private Singleton() {
        }
    }

    private ConfigProvider(com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source... sourceArr) {
        this(sourceArr, (byte) 0);
    }

    private ConfigProvider(com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source[] sourceArr, byte b) {
        this.getHighSpeedVideoFpsRangesFor = true;
        this.getHighResolutionOutputSizeshNQ4ISI = sourceArr;
    }

    public final java.lang.String getConfigFileStatus() {
        java.lang.String property;
        for (com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source source : this.getHighResolutionOutputSizeshNQ4ISI) {
            if ((source instanceof com.datadog.trace.bootstrap.config.provider.PropertiesConfigSource) && (property = ((com.datadog.trace.bootstrap.config.provider.PropertiesConfigSource) source).getHighSpeedVideoFpsRangesFor.getProperty("_dd.config.file.status")) != null) {
                return property;
            }
        }
        return "no config file present";
    }

    public final java.lang.String getString(java.lang.String str) {
        return getString(str, null, new java.lang.String[0]);
    }

    public final <T extends java.lang.Enum<T>> T getEnum(java.lang.String str, java.lang.Class<T> cls, T t) {
        java.lang.String string = getString(str);
        if (string != null) {
            try {
                return (T) java.lang.Enum.valueOf(cls, string);
            } catch (java.lang.Exception unused) {
                getHighSpeedVideoFpsRanges.debug("failed to parse {} for {}, defaulting to {}", string, str, t);
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            com.datadog.trace.api.ConfigCollector.get().put(str, java.lang.String.valueOf(t), com.datadog.trace.api.ConfigOrigin.DEFAULT);
        }
        return t;
    }

    public final java.lang.String getString(java.lang.String str, java.lang.String str2, java.lang.String... strArr) {
        for (com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source source : this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.String str3 = source.get(str, strArr);
            if (str3 != null) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    com.datadog.trace.api.ConfigCollector.get().put(str, str3, source.origin());
                }
                return str3;
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor && str2 != null) {
            com.datadog.trace.api.ConfigCollector.get().put(str, str2, com.datadog.trace.api.ConfigOrigin.DEFAULT);
        }
        return str2;
    }

    public final java.lang.String getStringNotEmpty(java.lang.String str, java.lang.String str2, java.lang.String... strArr) {
        for (com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source source : this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.String str3 = source.get(str, strArr);
            if (str3 != null && !str3.trim().isEmpty()) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    com.datadog.trace.api.ConfigCollector.get().put(str, str3, source.origin());
                }
                return str3;
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor && str2 != null) {
            com.datadog.trace.api.ConfigCollector.get().put(str, str2, com.datadog.trace.api.ConfigOrigin.DEFAULT);
        }
        return str2;
    }

    public final java.lang.String getStringExcludingSource(java.lang.String str, java.lang.String str2, java.lang.Class<? extends com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source> cls, java.lang.String... strArr) {
        java.lang.String str3;
        for (com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source source : this.getHighResolutionOutputSizeshNQ4ISI) {
            if (!cls.isAssignableFrom(source.getClass()) && (str3 = source.get(str, strArr)) != null) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    com.datadog.trace.api.ConfigCollector.get().put(str, str3, source.origin());
                }
                return str3;
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor && str2 != null) {
            com.datadog.trace.api.ConfigCollector.get().put(str, str2, com.datadog.trace.api.ConfigOrigin.DEFAULT);
        }
        return str2;
    }

    public final boolean isSet(java.lang.String str) {
        java.lang.String string = getString(str);
        return (string == null || string.isEmpty()) ? false : true;
    }

    public final java.lang.Boolean getBoolean(java.lang.String str) {
        return (java.lang.Boolean) getHighResolutionOutputSizeshNQ4ISI(str, null, java.lang.Boolean.class, new java.lang.String[0]);
    }

    public final java.lang.Boolean getBoolean(java.lang.String str, java.lang.String... strArr) {
        return (java.lang.Boolean) getHighResolutionOutputSizeshNQ4ISI(str, null, java.lang.Boolean.class, strArr);
    }

    public final boolean getBoolean(java.lang.String str, boolean z, java.lang.String... strArr) {
        return ((java.lang.Boolean) getHighResolutionOutputSizeshNQ4ISI(str, java.lang.Boolean.valueOf(z), java.lang.Boolean.class, strArr)).booleanValue();
    }

    public final java.lang.Integer getInteger(java.lang.String str) {
        return (java.lang.Integer) getHighResolutionOutputSizeshNQ4ISI(str, null, java.lang.Integer.class, new java.lang.String[0]);
    }

    public final java.lang.Integer getInteger(java.lang.String str, java.lang.String... strArr) {
        return (java.lang.Integer) getHighResolutionOutputSizeshNQ4ISI(str, null, java.lang.Integer.class, strArr);
    }

    public final int getInteger(java.lang.String str, int i, java.lang.String... strArr) {
        return ((java.lang.Integer) getHighResolutionOutputSizeshNQ4ISI(str, java.lang.Integer.valueOf(i), java.lang.Integer.class, strArr)).intValue();
    }

    public final java.lang.Long getLong(java.lang.String str) {
        return (java.lang.Long) getHighResolutionOutputSizeshNQ4ISI(str, null, java.lang.Long.class, new java.lang.String[0]);
    }

    public final java.lang.Long getLong(java.lang.String str, java.lang.String... strArr) {
        return (java.lang.Long) getHighResolutionOutputSizeshNQ4ISI(str, null, java.lang.Long.class, strArr);
    }

    public final long getLong(java.lang.String str, long j, java.lang.String... strArr) {
        return ((java.lang.Long) getHighResolutionOutputSizeshNQ4ISI(str, java.lang.Long.valueOf(j), java.lang.Long.class, strArr)).longValue();
    }

    public final java.lang.Float getFloat(java.lang.String str, java.lang.String... strArr) {
        return (java.lang.Float) getHighResolutionOutputSizeshNQ4ISI(str, null, java.lang.Float.class, strArr);
    }

    public final float getFloat(java.lang.String str, float f) {
        return ((java.lang.Float) getHighResolutionOutputSizeshNQ4ISI(str, java.lang.Float.valueOf(f), java.lang.Float.class, new java.lang.String[0])).floatValue();
    }

    public final java.lang.Double getDouble(java.lang.String str) {
        return (java.lang.Double) getHighResolutionOutputSizeshNQ4ISI(str, null, java.lang.Double.class, new java.lang.String[0]);
    }

    public final double getDouble(java.lang.String str, double d) {
        return ((java.lang.Double) getHighResolutionOutputSizeshNQ4ISI(str, java.lang.Double.valueOf(d), java.lang.Double.class, new java.lang.String[0])).doubleValue();
    }

    private <T> T getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, T t, java.lang.Class<T> cls, java.lang.String... strArr) {
        java.lang.String str2;
        T t2;
        for (com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source source : this.getHighResolutionOutputSizeshNQ4ISI) {
            try {
                str2 = source.get(str, strArr);
                t2 = (T) com.datadog.trace.bootstrap.config.provider.ConfigConverter.getHighSpeedVideoSizes(str2, cls);
            } catch (java.lang.NumberFormatException unused) {
            }
            if (t2 != null) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    com.datadog.trace.api.ConfigCollector.get().put(str, str2, source.origin());
                }
                return t2;
            }
            continue;
        }
        if (this.getHighSpeedVideoFpsRangesFor && t != null) {
            com.datadog.trace.api.ConfigCollector.get().put(str, t, com.datadog.trace.api.ConfigOrigin.DEFAULT);
        }
        return t;
    }

    public final java.util.List<java.lang.String> getList(java.lang.String str) {
        return com.datadog.trace.bootstrap.config.provider.ConfigConverter.getHighSpeedVideoFpsRangesFor(getString(str));
    }

    public final java.util.List<java.lang.String> getList(java.lang.String str, java.util.List<java.lang.String> list) {
        if (getString(str) == null) {
            if (this.getHighSpeedVideoFpsRangesFor && list != null) {
                com.datadog.trace.api.ConfigCollector.get().put(str, java.lang.String.join(",", list), com.datadog.trace.api.ConfigOrigin.DEFAULT);
            }
            return list;
        }
        return com.datadog.trace.bootstrap.config.provider.ConfigConverter.getHighSpeedVideoFpsRangesFor(getString(str));
    }

    public final java.util.Set<java.lang.String> getSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        if (getString(str) == null) {
            if (this.getHighSpeedVideoFpsRangesFor && set != null) {
                com.datadog.trace.api.ConfigCollector.get().put(str, java.lang.String.join(",", set), com.datadog.trace.api.ConfigOrigin.DEFAULT);
            }
            return set;
        }
        return new java.util.HashSet(com.datadog.trace.bootstrap.config.provider.ConfigConverter.getHighSpeedVideoFpsRangesFor(getString(str)));
    }

    public final java.util.List<java.lang.String> getSpacedList(java.lang.String str) {
        return com.datadog.trace.bootstrap.config.provider.ConfigConverter.getHighSpeedVideoFpsRangesFor(getString(str), " ");
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMergedMap(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.datadog.trace.api.ConfigOrigin configOrigin = com.datadog.trace.api.ConfigOrigin.DEFAULT;
        for (int length = this.getHighResolutionOutputSizeshNQ4ISI.length - 1; length >= 0; length--) {
            java.util.Map<java.lang.String, java.lang.String> highSpeedVideoFpsRanges = com.datadog.trace.bootstrap.config.provider.ConfigConverter.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI[length].get(str), str);
            if (!highSpeedVideoFpsRanges.isEmpty()) {
                configOrigin = this.getHighResolutionOutputSizeshNQ4ISI[length].origin();
            }
            hashMap.putAll(highSpeedVideoFpsRanges);
        }
        getHighResolutionOutputSizeshNQ4ISI(str, hashMap, configOrigin);
        return hashMap;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getOrderedMap(java.lang.String str) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.datadog.trace.api.ConfigOrigin configOrigin = com.datadog.trace.api.ConfigOrigin.DEFAULT;
        for (int length = this.getHighResolutionOutputSizeshNQ4ISI.length - 1; length >= 0; length--) {
            java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap = com.datadog.trace.bootstrap.config.provider.ConfigConverter.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI[length].get(str), str);
            if (!Camera2StreamConfigurationMap.isEmpty()) {
                configOrigin = this.getHighResolutionOutputSizeshNQ4ISI[length].origin();
            }
            linkedHashMap.putAll(Camera2StreamConfigurationMap);
        }
        getHighResolutionOutputSizeshNQ4ISI(str, linkedHashMap, configOrigin);
        return linkedHashMap;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getMergedMapWithOptionalMappings(java.lang.String str, boolean z, java.lang.String... strArr) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.datadog.trace.api.ConfigOrigin configOrigin = com.datadog.trace.api.ConfigOrigin.DEFAULT;
        for (java.lang.String str2 : strArr) {
            for (int length = this.getHighResolutionOutputSizeshNQ4ISI.length - 1; length >= 0; length--) {
                java.util.Map<java.lang.String, java.lang.String> highSpeedVideoSizes = com.datadog.trace.bootstrap.config.provider.ConfigConverter.getHighSpeedVideoSizes(this.getHighResolutionOutputSizeshNQ4ISI[length].get(str2), str2, str, z);
                if (!highSpeedVideoSizes.isEmpty()) {
                    configOrigin = this.getHighResolutionOutputSizeshNQ4ISI[length].origin();
                }
                hashMap.putAll(highSpeedVideoSizes);
            }
            getHighResolutionOutputSizeshNQ4ISI(str2, hashMap, configOrigin);
        }
        return hashMap;
    }

    public final java.util.BitSet getIntegerRange(java.lang.String str, java.util.BitSet bitSet) {
        java.lang.String string = getString(str);
        if (string != null) {
            try {
                return com.datadog.trace.bootstrap.config.provider.ConfigConverter.getHighSpeedVideoSizes(string, str);
            } catch (java.lang.NumberFormatException e) {
                getHighSpeedVideoFpsRanges.warn("Invalid configuration for {}", str, e);
            }
        }
        if (this.getHighSpeedVideoFpsRangesFor) {
            com.datadog.trace.api.ConfigCollector.get().put(str, com.datadog.trace.bootstrap.config.provider.ConfigConverter.getHighSpeedVideoSizes(bitSet), com.datadog.trace.api.ConfigOrigin.DEFAULT);
        }
        return bitSet;
    }

    public final boolean isEnabled(java.lang.Iterable<java.lang.String> iterable, java.lang.String str, java.lang.String str2, boolean z) {
        boolean z2 = z;
        for (java.lang.String str3 : iterable) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(str3);
            sb.append(str2);
            java.lang.String obj = sb.toString();
            boolean z3 = getBoolean(obj.startsWith("trace.") ? obj : "trace.".concat(java.lang.String.valueOf(obj)), z, obj);
            z2 = z ? z2 & z3 : z2 | z3;
        }
        return z2;
    }

    public static com.datadog.trace.bootstrap.config.provider.ConfigProvider getInstance() {
        return com.datadog.trace.bootstrap.config.provider.ConfigProvider.Singleton.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.datadog.trace.bootstrap.config.provider.ConfigProvider createDefault() {
        return new com.datadog.trace.bootstrap.config.provider.ConfigProvider(new com.datadog.trace.bootstrap.config.provider.ConfigProvider.Source[0]);
    }

    public static com.datadog.trace.bootstrap.config.provider.ConfigProvider withPropertiesOverride(java.util.Properties properties) {
        return new com.datadog.trace.bootstrap.config.provider.ConfigProvider(new com.datadog.trace.bootstrap.config.provider.PropertiesConfigSource(properties));
    }

    private void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, com.datadog.trace.api.ConfigOrigin configOrigin) {
        if (!this.getHighSpeedVideoFpsRangesFor || map.isEmpty()) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            sb.append(entry.getKey());
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            sb.append(entry.getValue());
        }
        com.datadog.trace.api.ConfigCollector.get().put(str, sb.toString(), configOrigin);
    }

    public static abstract class Source {
        protected abstract java.lang.String get(java.lang.String str);

        public abstract com.datadog.trace.api.ConfigOrigin origin();

        public final java.lang.String get(java.lang.String str, java.lang.String... strArr) {
            java.lang.String str2 = get(str);
            if (str2 != null) {
                return str2;
            }
            for (java.lang.String str3 : strArr) {
                java.lang.String str4 = get(str3);
                if (str4 != null) {
                    return str4;
                }
            }
            return null;
        }
    }
}
