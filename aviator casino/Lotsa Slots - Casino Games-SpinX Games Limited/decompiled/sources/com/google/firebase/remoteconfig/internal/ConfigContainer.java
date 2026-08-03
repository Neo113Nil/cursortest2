package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class ConfigContainer {
    static final java.lang.String ABT_EXPERIMENTS_KEY = "abt_experiments_key";
    static final java.lang.String CONFIGS_KEY = "configs_key";
    private static final java.util.Date DEFAULTS_FETCH_TIME = new java.util.Date(0);
    static final java.lang.String FETCH_TIME_KEY = "fetch_time_key";
    static final java.lang.String PERSONALIZATION_METADATA_KEY = "personalization_metadata_key";
    public static final java.lang.String ROLLOUT_METADATA_AFFECTED_KEYS = "affectedParameterKeys";
    public static final java.lang.String ROLLOUT_METADATA_ID = "rolloutId";
    static final java.lang.String ROLLOUT_METADATA_KEY = "rollout_metadata_key";
    public static final java.lang.String ROLLOUT_METADATA_VARIANT_ID = "variantId";
    static final java.lang.String TEMPLATE_VERSION_NUMBER_KEY = "template_version_number_key";
    private org.json.JSONArray abtExperiments;
    private org.json.JSONObject configsJson;
    private org.json.JSONObject containerJson;
    private java.util.Date fetchTime;
    private org.json.JSONObject personalizationMetadata;
    private org.json.JSONArray rolloutMetadata;
    private long templateVersionNumber;

    private ConfigContainer(org.json.JSONObject jSONObject, java.util.Date date, org.json.JSONArray jSONArray, org.json.JSONObject jSONObject2, long j, org.json.JSONArray jSONArray2) throws org.json.JSONException {
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put(CONFIGS_KEY, jSONObject);
        jSONObject3.put(FETCH_TIME_KEY, date.getTime());
        jSONObject3.put(ABT_EXPERIMENTS_KEY, jSONArray);
        jSONObject3.put(PERSONALIZATION_METADATA_KEY, jSONObject2);
        jSONObject3.put(TEMPLATE_VERSION_NUMBER_KEY, j);
        jSONObject3.put(ROLLOUT_METADATA_KEY, jSONArray2);
        this.configsJson = jSONObject;
        this.fetchTime = date;
        this.abtExperiments = jSONArray;
        this.personalizationMetadata = jSONObject2;
        this.templateVersionNumber = j;
        this.rolloutMetadata = jSONArray2;
        this.containerJson = jSONObject3;
    }

    static com.google.firebase.remoteconfig.internal.ConfigContainer copyOf(org.json.JSONObject jSONObject) throws org.json.JSONException {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(PERSONALIZATION_METADATA_KEY);
        if (optJSONObject == null) {
            optJSONObject = new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject2 = optJSONObject;
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray(ROLLOUT_METADATA_KEY);
        if (optJSONArray == null) {
            optJSONArray = new org.json.JSONArray();
        }
        return new com.google.firebase.remoteconfig.internal.ConfigContainer(jSONObject.getJSONObject(CONFIGS_KEY), new java.util.Date(jSONObject.getLong(FETCH_TIME_KEY)), jSONObject.getJSONArray(ABT_EXPERIMENTS_KEY), jSONObject2, jSONObject.optLong(TEMPLATE_VERSION_NUMBER_KEY), optJSONArray);
    }

    private static com.google.firebase.remoteconfig.internal.ConfigContainer deepCopyOf(org.json.JSONObject jSONObject) throws org.json.JSONException {
        return copyOf(new org.json.JSONObject(jSONObject.toString()));
    }

    public org.json.JSONObject getConfigs() {
        return this.configsJson;
    }

    public java.util.Date getFetchTime() {
        return this.fetchTime;
    }

    public org.json.JSONArray getAbtExperiments() {
        return this.abtExperiments;
    }

    public org.json.JSONObject getPersonalizationMetadata() {
        return this.personalizationMetadata;
    }

    public long getTemplateVersionNumber() {
        return this.templateVersionNumber;
    }

    public org.json.JSONArray getRolloutMetadata() {
        return this.rolloutMetadata;
    }

    public java.lang.String toString() {
        return this.containerJson.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.firebase.remoteconfig.internal.ConfigContainer) {
            return this.containerJson.toString().equals(((com.google.firebase.remoteconfig.internal.ConfigContainer) obj).toString());
        }
        return false;
    }

    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> createRolloutParameterKeyMap() throws org.json.JSONException {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i = 0; i < getRolloutMetadata().length(); i++) {
            org.json.JSONObject jSONObject = getRolloutMetadata().getJSONObject(i);
            java.lang.String string = jSONObject.getString(ROLLOUT_METADATA_ID);
            java.lang.String string2 = jSONObject.getString("variantId");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(ROLLOUT_METADATA_AFFECTED_KEYS);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                java.lang.String string3 = jSONArray.getString(i2);
                if (!hashMap.containsKey(string3)) {
                    hashMap.put(string3, new java.util.HashMap());
                }
                java.util.Map map = (java.util.Map) hashMap.get(string3);
                if (map != null) {
                    map.put(string, string2);
                }
            }
        }
        return hashMap;
    }

    public java.util.Set<java.lang.String> getChangedParams(com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) throws org.json.JSONException {
        org.json.JSONObject configs = deepCopyOf(configContainer.containerJson).getConfigs();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> createRolloutParameterKeyMap = createRolloutParameterKeyMap();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> createRolloutParameterKeyMap2 = configContainer.createRolloutParameterKeyMap();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<java.lang.String> keys = getConfigs().keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            if (!configContainer.getConfigs().has(next)) {
                hashSet.add(next);
            } else if (!getConfigs().get(next).equals(configContainer.getConfigs().get(next))) {
                hashSet.add(next);
            } else if ((getPersonalizationMetadata().has(next) && !configContainer.getPersonalizationMetadata().has(next)) || (!getPersonalizationMetadata().has(next) && configContainer.getPersonalizationMetadata().has(next))) {
                hashSet.add(next);
            } else if (getPersonalizationMetadata().has(next) && configContainer.getPersonalizationMetadata().has(next) && !getPersonalizationMetadata().getJSONObject(next).toString().equals(configContainer.getPersonalizationMetadata().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (createRolloutParameterKeyMap.containsKey(next) != createRolloutParameterKeyMap2.containsKey(next)) {
                hashSet.add(next);
            } else if (createRolloutParameterKeyMap.containsKey(next) && createRolloutParameterKeyMap2.containsKey(next) && !createRolloutParameterKeyMap.get(next).equals(createRolloutParameterKeyMap2.get(next))) {
                hashSet.add(next);
            } else {
                configs.remove(next);
            }
        }
        java.util.Iterator<java.lang.String> keys2 = configs.keys();
        while (keys2.hasNext()) {
            hashSet.add(keys2.next());
        }
        return hashSet;
    }

    public int hashCode() {
        return this.containerJson.hashCode();
    }

    public static class Builder {
        private org.json.JSONArray builderAbtExperiments;
        private org.json.JSONObject builderConfigsJson;
        private java.util.Date builderFetchTime;
        private org.json.JSONObject builderPersonalizationMetadata;
        private org.json.JSONArray builderRolloutMetadata;
        private long builderTemplateVersionNumber;

        private Builder() {
            this.builderConfigsJson = new org.json.JSONObject();
            this.builderFetchTime = com.google.firebase.remoteconfig.internal.ConfigContainer.DEFAULTS_FETCH_TIME;
            this.builderAbtExperiments = new org.json.JSONArray();
            this.builderPersonalizationMetadata = new org.json.JSONObject();
            this.builderTemplateVersionNumber = 0L;
            this.builderRolloutMetadata = new org.json.JSONArray();
        }

        public Builder(com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) {
            this.builderConfigsJson = configContainer.getConfigs();
            this.builderFetchTime = configContainer.getFetchTime();
            this.builderAbtExperiments = configContainer.getAbtExperiments();
            this.builderPersonalizationMetadata = configContainer.getPersonalizationMetadata();
            this.builderTemplateVersionNumber = configContainer.getTemplateVersionNumber();
            this.builderRolloutMetadata = configContainer.getRolloutMetadata();
        }

        public com.google.firebase.remoteconfig.internal.ConfigContainer.Builder replaceConfigsWith(java.util.Map<java.lang.String, java.lang.String> map) {
            this.builderConfigsJson = new org.json.JSONObject(map);
            return this;
        }

        public com.google.firebase.remoteconfig.internal.ConfigContainer.Builder replaceConfigsWith(org.json.JSONObject jSONObject) {
            try {
                this.builderConfigsJson = new org.json.JSONObject(jSONObject.toString());
            } catch (org.json.JSONException unused) {
            }
            return this;
        }

        public com.google.firebase.remoteconfig.internal.ConfigContainer.Builder withFetchTime(java.util.Date date) {
            this.builderFetchTime = date;
            return this;
        }

        public com.google.firebase.remoteconfig.internal.ConfigContainer.Builder withAbtExperiments(org.json.JSONArray jSONArray) {
            try {
                this.builderAbtExperiments = new org.json.JSONArray(jSONArray.toString());
            } catch (org.json.JSONException unused) {
            }
            return this;
        }

        public com.google.firebase.remoteconfig.internal.ConfigContainer.Builder withPersonalizationMetadata(org.json.JSONObject jSONObject) {
            try {
                this.builderPersonalizationMetadata = new org.json.JSONObject(jSONObject.toString());
            } catch (org.json.JSONException unused) {
            }
            return this;
        }

        public com.google.firebase.remoteconfig.internal.ConfigContainer.Builder withTemplateVersionNumber(long j) {
            this.builderTemplateVersionNumber = j;
            return this;
        }

        public com.google.firebase.remoteconfig.internal.ConfigContainer.Builder withRolloutMetadata(org.json.JSONArray jSONArray) {
            try {
                this.builderRolloutMetadata = new org.json.JSONArray(jSONArray.toString());
            } catch (org.json.JSONException unused) {
            }
            return this;
        }

        public com.google.firebase.remoteconfig.internal.ConfigContainer build() throws org.json.JSONException {
            return new com.google.firebase.remoteconfig.internal.ConfigContainer(this.builderConfigsJson, this.builderFetchTime, this.builderAbtExperiments, this.builderPersonalizationMetadata, this.builderTemplateVersionNumber, this.builderRolloutMetadata);
        }
    }

    public static com.google.firebase.remoteconfig.internal.ConfigContainer.Builder newBuilder() {
        return new com.google.firebase.remoteconfig.internal.ConfigContainer.Builder();
    }

    public static com.google.firebase.remoteconfig.internal.ConfigContainer.Builder newBuilder(com.google.firebase.remoteconfig.internal.ConfigContainer configContainer) {
        return new com.google.firebase.remoteconfig.internal.ConfigContainer.Builder(configContainer);
    }
}
