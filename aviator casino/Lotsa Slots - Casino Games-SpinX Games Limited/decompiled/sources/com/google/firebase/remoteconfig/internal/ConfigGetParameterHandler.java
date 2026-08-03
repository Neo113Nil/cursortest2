package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class ConfigGetParameterHandler {
    private final com.google.firebase.remoteconfig.internal.ConfigCacheClient activatedConfigsCache;
    private final com.google.firebase.remoteconfig.internal.ConfigCacheClient defaultConfigsCache;
    private final java.util.concurrent.Executor executor;
    private final java.util.Set<com.google.android.gms.common.util.BiConsumer<java.lang.String, com.google.firebase.remoteconfig.internal.ConfigContainer>> listeners = new java.util.HashSet();
    public static final java.nio.charset.Charset FRC_BYTE_ARRAY_ENCODING = java.nio.charset.Charset.forName("UTF-8");
    static final java.util.regex.Pattern TRUE_REGEX = java.util.regex.Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    static final java.util.regex.Pattern FALSE_REGEX = java.util.regex.Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    public ConfigGetParameterHandler(java.util.concurrent.Executor executor, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient2) {
        this.executor = executor;
        this.activatedConfigsCache = configCacheClient;
        this.defaultConfigsCache = configCacheClient2;
    }

    public java.lang.String getString(java.lang.String str) {
        java.lang.String stringFromCache = getStringFromCache(this.activatedConfigsCache, str);
        if (stringFromCache != null) {
            callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
            return stringFromCache;
        }
        java.lang.String stringFromCache2 = getStringFromCache(this.defaultConfigsCache, str);
        if (stringFromCache2 != null) {
            return stringFromCache2;
        }
        logParameterValueDoesNotExist(str, "String");
        return "";
    }

    public boolean getBoolean(java.lang.String str) {
        java.lang.String stringFromCache = getStringFromCache(this.activatedConfigsCache, str);
        if (stringFromCache != null) {
            if (TRUE_REGEX.matcher(stringFromCache).matches()) {
                callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
                return true;
            }
            if (FALSE_REGEX.matcher(stringFromCache).matches()) {
                callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
                return false;
            }
        }
        java.lang.String stringFromCache2 = getStringFromCache(this.defaultConfigsCache, str);
        if (stringFromCache2 != null) {
            if (TRUE_REGEX.matcher(stringFromCache2).matches()) {
                return true;
            }
            if (FALSE_REGEX.matcher(stringFromCache2).matches()) {
                return false;
            }
        }
        logParameterValueDoesNotExist(str, "Boolean");
        return false;
    }

    public byte[] getByteArray(java.lang.String str) {
        java.lang.String stringFromCache = getStringFromCache(this.activatedConfigsCache, str);
        if (stringFromCache != null) {
            callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
            return stringFromCache.getBytes(FRC_BYTE_ARRAY_ENCODING);
        }
        java.lang.String stringFromCache2 = getStringFromCache(this.defaultConfigsCache, str);
        if (stringFromCache2 != null) {
            return stringFromCache2.getBytes(FRC_BYTE_ARRAY_ENCODING);
        }
        logParameterValueDoesNotExist(str, "ByteArray");
        return com.google.firebase.remoteconfig.FirebaseRemoteConfig.DEFAULT_VALUE_FOR_BYTE_ARRAY;
    }

    public double getDouble(java.lang.String str) {
        java.lang.Double doubleFromCache = getDoubleFromCache(this.activatedConfigsCache, str);
        if (doubleFromCache != null) {
            callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
            return doubleFromCache.doubleValue();
        }
        java.lang.Double doubleFromCache2 = getDoubleFromCache(this.defaultConfigsCache, str);
        if (doubleFromCache2 != null) {
            return doubleFromCache2.doubleValue();
        }
        logParameterValueDoesNotExist(str, "Double");
        return 0.0d;
    }

    public long getLong(java.lang.String str) {
        java.lang.Long longFromCache = getLongFromCache(this.activatedConfigsCache, str);
        if (longFromCache != null) {
            callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
            return longFromCache.longValue();
        }
        java.lang.Long longFromCache2 = getLongFromCache(this.defaultConfigsCache, str);
        if (longFromCache2 != null) {
            return longFromCache2.longValue();
        }
        logParameterValueDoesNotExist(str, "Long");
        return 0L;
    }

    public com.google.firebase.remoteconfig.FirebaseRemoteConfigValue getValue(java.lang.String str) {
        java.lang.String stringFromCache = getStringFromCache(this.activatedConfigsCache, str);
        if (stringFromCache != null) {
            callListeners(str, getConfigsFromCache(this.activatedConfigsCache));
            return new com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl(stringFromCache, 2);
        }
        java.lang.String stringFromCache2 = getStringFromCache(this.defaultConfigsCache, str);
        if (stringFromCache2 != null) {
            return new com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl(stringFromCache2, 1);
        }
        logParameterValueDoesNotExist(str, "FirebaseRemoteConfigValue");
        return new com.google.firebase.remoteconfig.internal.FirebaseRemoteConfigValueImpl("", 0);
    }

    public java.util.Set<java.lang.String> getKeysByPrefix(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        java.util.TreeSet treeSet = new java.util.TreeSet();
        com.google.firebase.remoteconfig.internal.ConfigContainer configsFromCache = getConfigsFromCache(this.activatedConfigsCache);
        if (configsFromCache != null) {
            treeSet.addAll(getKeysByPrefix(str, configsFromCache));
        }
        com.google.firebase.remoteconfig.internal.ConfigContainer configsFromCache2 = getConfigsFromCache(this.defaultConfigsCache);
        if (configsFromCache2 != null) {
            treeSet.addAll(getKeysByPrefix(str, configsFromCache2));
        }
        return treeSet;
    }

    private static java.util.TreeSet<java.lang.String> getKeysByPrefix(java.lang.String str, com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) {
        java.util.TreeSet<java.lang.String> treeSet = new java.util.TreeSet<>();
        java.util.Iterator<java.lang.String> keys = configContainer.getConfigs().keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            if (next.startsWith(str)) {
                treeSet.add(next);
            }
        }
        return treeSet;
    }

    public java.util.Map<java.lang.String, com.google.firebase.remoteconfig.FirebaseRemoteConfigValue> getAll() {
        java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet();
        hashSet.addAll(getKeySetFromCache(this.activatedConfigsCache));
        hashSet.addAll(getKeySetFromCache(this.defaultConfigsCache));
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : hashSet) {
            hashMap.put(str, getValue(str));
        }
        return hashMap;
    }

    public void addListener(com.google.android.gms.common.util.BiConsumer<java.lang.String, com.google.firebase.remoteconfig.internal.ConfigContainer> biConsumer) {
        synchronized (this.listeners) {
            this.listeners.add(biConsumer);
        }
    }

    private void callListeners(final java.lang.String str, final com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) {
        if (configContainer == null) {
            return;
        }
        synchronized (this.listeners) {
            for (final com.google.android.gms.common.util.BiConsumer<java.lang.String, com.google.firebase.remoteconfig.internal.ConfigContainer> biConsumer : this.listeners) {
                this.executor.execute(new java.lang.Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.common.util.BiConsumer.this.accept(str, configContainer);
                    }
                });
            }
        }
    }

    private static java.lang.String getStringFromCache(com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, java.lang.String str) {
        com.google.firebase.remoteconfig.internal.ConfigContainer configsFromCache = getConfigsFromCache(configCacheClient);
        if (configsFromCache == null) {
            return null;
        }
        try {
            return configsFromCache.getConfigs().getString(str);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private static java.lang.Double getDoubleFromCache(com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, java.lang.String str) {
        com.google.firebase.remoteconfig.internal.ConfigContainer configsFromCache = getConfigsFromCache(configCacheClient);
        if (configsFromCache == null) {
            return null;
        }
        try {
            return java.lang.Double.valueOf(configsFromCache.getConfigs().getDouble(str));
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private static java.lang.Long getLongFromCache(com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, java.lang.String str) {
        com.google.firebase.remoteconfig.internal.ConfigContainer configsFromCache = getConfigsFromCache(configCacheClient);
        if (configsFromCache == null) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(configsFromCache.getConfigs().getLong(str));
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    private static java.util.Set<java.lang.String> getKeySetFromCache(com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient) {
        java.util.HashSet hashSet = new java.util.HashSet();
        com.google.firebase.remoteconfig.internal.ConfigContainer configsFromCache = getConfigsFromCache(configCacheClient);
        if (configsFromCache == null) {
            return hashSet;
        }
        java.util.Iterator<java.lang.String> keys = configsFromCache.getConfigs().keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    private static com.google.firebase.remoteconfig.internal.ConfigContainer getConfigsFromCache(com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient) {
        return configCacheClient.getBlocking();
    }

    private static void logParameterValueDoesNotExist(java.lang.String str, java.lang.String str2) {
        android.util.Log.w(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, java.lang.String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }
}
