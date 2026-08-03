package com.google.firebase.remoteconfig.internal.rollouts;

/* loaded from: classes3.dex */
public class RolloutsStateFactory {
    com.google.firebase.remoteconfig.internal.ConfigCacheClient activatedConfigsCache;
    com.google.firebase.remoteconfig.internal.ConfigCacheClient defaultConfigsCache;

    RolloutsStateFactory(com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient2) {
        this.activatedConfigsCache = configCacheClient;
        this.defaultConfigsCache = configCacheClient2;
    }

    com.google.firebase.remoteconfig.interop.rollouts.RolloutsState getActiveRolloutsState(com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) throws com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException {
        org.json.JSONArray rolloutMetadata = configContainer.getRolloutMetadata();
        long templateVersionNumber = configContainer.getTemplateVersionNumber();
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i < rolloutMetadata.length(); i++) {
            try {
                org.json.JSONObject jSONObject = rolloutMetadata.getJSONObject(i);
                java.lang.String string = jSONObject.getString(com.google.firebase.remoteconfig.internal.ConfigContainer.ROLLOUT_METADATA_ID);
                org.json.JSONArray jSONArray = jSONObject.getJSONArray(com.google.firebase.remoteconfig.internal.ConfigContainer.ROLLOUT_METADATA_AFFECTED_KEYS);
                if (jSONArray.length() > 1) {
                    android.util.Log.w(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, java.lang.String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                java.lang.String optString = jSONArray.optString(0, "");
                hashSet.add(com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment.builder().setRolloutId(string).setVariantId(jSONObject.getString("variantId")).setParameterKey(optString).setParameterValue(getParameterValue(optString)).setTemplateVersion(templateVersionNumber).build());
            } catch (org.json.JSONException e) {
                throw new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return com.google.firebase.remoteconfig.interop.rollouts.RolloutsState.create(hashSet);
    }

    private java.lang.String getParameterValue(java.lang.String str) {
        java.lang.String stringFromCache = getStringFromCache(this.activatedConfigsCache, str);
        if (stringFromCache != null) {
            return stringFromCache;
        }
        java.lang.String stringFromCache2 = getStringFromCache(this.defaultConfigsCache, str);
        return stringFromCache2 != null ? stringFromCache2 : "";
    }

    private static java.lang.String getStringFromCache(com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, java.lang.String str) {
        com.google.firebase.remoteconfig.internal.ConfigContainer blocking = configCacheClient.getBlocking();
        if (blocking == null) {
            return null;
        }
        try {
            return blocking.getConfigs().getString(str);
        } catch (org.json.JSONException unused) {
            return null;
        }
    }

    public static com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory create(com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient, com.google.firebase.remoteconfig.internal.ConfigCacheClient configCacheClient2) {
        return new com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory(configCacheClient, configCacheClient2);
    }
}
