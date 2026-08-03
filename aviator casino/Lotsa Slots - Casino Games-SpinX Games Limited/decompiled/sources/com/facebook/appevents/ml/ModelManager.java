package com.facebook.appevents.ml;

/* compiled from: ModelManager.kt */
@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u000278B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0019H\u0007J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\n\u0010\u001e\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0007J\u0010\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%H\u0002J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0002J\u0010\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020\u001bH\u0002J9\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010-2\u0006\u0010!\u001a\u00020\"2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020'0-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040-H\u0007¢\u0006\u0002\u00100J%\u00101\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010-2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020'H\u0002¢\u0006\u0002\u00105J%\u00106\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010-2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020'H\u0002¢\u0006\u0002\u00105R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u001c\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager;", "", "()V", "ASSET_URI_KEY", "", "CACHE_KEY_MODELS", "CACHE_KEY_REQUEST_TIMESTAMP", "MODEL_ASSERT_STORE", "MODEL_REQUEST_INTERVAL_MILLISECONDS", "", "MTML_INTEGRITY_DETECT_PREDICTION", "", "MTML_SUGGESTED_EVENTS_PREDICTION", "MTML_USE_CASE", "RULES_URI_KEY", "THRESHOLD_KEY", "USE_CASE_KEY", "VERSION_ID_KEY", "isLocaleEnglish", "", "()Z", "taskHandlers", "", "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "addModels", "", com.facebook.appevents.ml.ModelManager.CACHE_KEY_MODELS, "Lorg/json/JSONObject;", com.ironsource.mediationsdk.metadata.a.j, "enableMTML", "fetchModels", "getRuleFile", "Ljava/io/File;", "task", "Lcom/facebook/appevents/ml/ModelManager$Task;", "isValidTimestamp", com.ironsource.C4.a.d, "", "parseJsonArray", "", "jsonArray", "Lorg/json/JSONArray;", "parseRawJsonObject", "jsonObject", "predict", "", "denses", "texts", "(Lcom/facebook/appevents/ml/ModelManager$Task;[[F[Ljava/lang/String;)[Ljava/lang/String;", "processIntegrityDetectionResult", "res", "Lcom/facebook/appevents/ml/MTensor;", com.facebook.appevents.ml.ModelManager.THRESHOLD_KEY, "(Lcom/facebook/appevents/ml/MTensor;[F)[Ljava/lang/String;", "processSuggestedEventResult", "Task", "TaskHandler", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ModelManager {
    private static final java.lang.String ASSET_URI_KEY = "asset_uri";
    private static final java.lang.String CACHE_KEY_MODELS = "models";
    private static final java.lang.String CACHE_KEY_REQUEST_TIMESTAMP = "model_request_timestamp";
    private static final java.lang.String MODEL_ASSERT_STORE = "com.facebook.internal.MODEL_STORE";
    public static final int MODEL_REQUEST_INTERVAL_MILLISECONDS = 259200000;
    private static final java.lang.String MTML_USE_CASE = "MTML";
    private static final java.lang.String RULES_URI_KEY = "rules_uri";
    private static final java.lang.String THRESHOLD_KEY = "thresholds";
    private static final java.lang.String USE_CASE_KEY = "use_case";
    private static final java.lang.String VERSION_ID_KEY = "version_id";
    public static final com.facebook.appevents.ml.ModelManager INSTANCE = new com.facebook.appevents.ml.ModelManager();
    private static final java.util.Map<java.lang.String, com.facebook.appevents.ml.ModelManager.TaskHandler> taskHandlers = new java.util.concurrent.ConcurrentHashMap();
    private static final java.util.List<java.lang.String> MTML_SUGGESTED_EVENTS_PREDICTION = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"other", com.facebook.appevents.AppEventsConstants.EVENT_NAME_COMPLETED_REGISTRATION, com.facebook.appevents.AppEventsConstants.EVENT_NAME_ADDED_TO_CART, com.facebook.appevents.AppEventsConstants.EVENT_NAME_PURCHASED, com.facebook.appevents.AppEventsConstants.EVENT_NAME_INITIATED_CHECKOUT});
    private static final java.util.List<java.lang.String> MTML_INTEGRITY_DETECT_PREDICTION = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"none", com.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_ADDRESS, com.facebook.appevents.integrity.IntegrityManager.INTEGRITY_TYPE_HEALTH});

    /* compiled from: ModelManager.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.appevents.ml.ModelManager.Task.valuesCustom().length];
            iArr[com.facebook.appevents.ml.ModelManager.Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            iArr[com.facebook.appevents.ml.ModelManager.Task.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ModelManager() {
    }

    public static final /* synthetic */ float[] access$parseJsonArray(com.facebook.appevents.ml.ModelManager modelManager, org.json.JSONArray jSONArray) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ml.ModelManager.class)) {
            return null;
        }
        try {
            return modelManager.parseJsonArray(jSONArray);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ml.ModelManager.class);
            return null;
        }
    }

    /* compiled from: ModelManager.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$Task;", "", "(Ljava/lang/String;I)V", "toKey", "", "toUseCase", "MTML_INTEGRITY_DETECT", "MTML_APP_EVENT_PREDICTION", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Task {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* compiled from: ModelManager.kt */
        @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.facebook.appevents.ml.ModelManager.Task.valuesCustom().length];
                iArr[com.facebook.appevents.ml.ModelManager.Task.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                iArr[com.facebook.appevents.ml.ModelManager.Task.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final java.lang.String toKey() {
            int i = com.facebook.appevents.ml.ModelManager.Task.WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "integrity_detect";
            }
            if (i == 2) {
                return "app_event_pred";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        public final java.lang.String toUseCase() {
            int i = com.facebook.appevents.ml.ModelManager.Task.WhenMappings.$EnumSwitchMapping$0[ordinal()];
            if (i == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.appevents.ml.ModelManager.Task[] valuesCustom() {
            com.facebook.appevents.ml.ModelManager.Task[] valuesCustom = values();
            return (com.facebook.appevents.ml.ModelManager.Task[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ml.ModelManager.class)) {
            return;
        }
        try {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.runOnNonUiThread(new java.lang.Runnable() { // from class: com.facebook.appevents.ml.ModelManager$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.ml.ModelManager.m5142enable$lambda0();
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ml.ModelManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: all -> 0x007d, Exception -> 0x0081, TryCatch #2 {Exception -> 0x0081, all -> 0x007d, blocks: (B:6:0x000d, B:8:0x0021, B:11:0x002b, B:12:0x0036, B:14:0x0046, B:16:0x004c, B:18:0x0074, B:21:0x0054, B:24:0x005d, B:25:0x0031), top: B:5:0x000d }] */
    /* renamed from: enable$lambda-0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5142enable$lambda0() {
        org.json.JSONObject jSONObject;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ml.ModelManager.class)) {
            return;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences sharedPreferences = com.facebook.FacebookSdk.getApplicationContext().getSharedPreferences(MODEL_ASSERT_STORE, 0);
            java.lang.String string = sharedPreferences.getString(CACHE_KEY_MODELS, null);
            if (string != null && string.length() != 0) {
                jSONObject = new org.json.JSONObject(string);
                long j = sharedPreferences.getLong(CACHE_KEY_REQUEST_TIMESTAMP, 0L);
                com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
                if (com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.ModelRequest) || jSONObject.length() == 0 || !INSTANCE.isValidTimestamp(j)) {
                    jSONObject = INSTANCE.fetchModels();
                    if (jSONObject != null) {
                        return;
                    } else {
                        sharedPreferences.edit().putString(CACHE_KEY_MODELS, jSONObject.toString()).putLong(CACHE_KEY_REQUEST_TIMESTAMP, java.lang.System.currentTimeMillis()).apply();
                    }
                }
                com.facebook.appevents.ml.ModelManager modelManager = INSTANCE;
                modelManager.addModels(jSONObject);
                modelManager.enableMTML();
                return;
            }
            jSONObject = new org.json.JSONObject();
            long j2 = sharedPreferences.getLong(CACHE_KEY_REQUEST_TIMESTAMP, 0L);
            com.facebook.internal.FeatureManager featureManager2 = com.facebook.internal.FeatureManager.INSTANCE;
            if (com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.ModelRequest)) {
            }
            jSONObject = INSTANCE.fetchModels();
            if (jSONObject != null) {
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ml.ModelManager.class);
        }
    }

    private final boolean isValidTimestamp(long timestamp) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this) || timestamp == 0) {
            return false;
        }
        try {
            return java.lang.System.currentTimeMillis() - timestamp < 259200000;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final void addModels(org.json.JSONObject models) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.util.Iterator<java.lang.String> keys = models.keys();
            while (keys.hasNext()) {
                try {
                    com.facebook.appevents.ml.ModelManager.TaskHandler build = com.facebook.appevents.ml.ModelManager.TaskHandler.INSTANCE.build(models.getJSONObject(keys.next()));
                    if (build != null) {
                        taskHandlers.put(build.getUseCase(), build);
                    }
                } catch (org.json.JSONException unused) {
                    return;
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final org.json.JSONObject parseRawJsonObject(org.json.JSONObject jsonObject) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                org.json.JSONArray jSONArray = jsonObject.getJSONArray("data");
                int length = jSONArray.length();
                if (length <= 0) {
                    return jSONObject;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                    jSONObject3.put(VERSION_ID_KEY, jSONObject2.getString(VERSION_ID_KEY));
                    jSONObject3.put(USE_CASE_KEY, jSONObject2.getString(USE_CASE_KEY));
                    jSONObject3.put(THRESHOLD_KEY, jSONObject2.getJSONArray(THRESHOLD_KEY));
                    jSONObject3.put(ASSET_URI_KEY, jSONObject2.getString(ASSET_URI_KEY));
                    if (jSONObject2.has(RULES_URI_KEY)) {
                        jSONObject3.put(RULES_URI_KEY, jSONObject2.getString(RULES_URI_KEY));
                    }
                    jSONObject.put(jSONObject2.getString(USE_CASE_KEY), jSONObject3);
                    if (i2 >= length) {
                        return jSONObject;
                    }
                    i = i2;
                }
            } catch (org.json.JSONException unused) {
                return new org.json.JSONObject();
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final org.json.JSONObject fetchModels() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.lang.String[] strArr = {USE_CASE_KEY, VERSION_ID_KEY, ASSET_URI_KEY, RULES_URI_KEY, THRESHOLD_KEY};
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.facebook.GraphRequest.FIELDS_PARAM, android.text.TextUtils.join(",", strArr));
            com.facebook.GraphRequest newGraphPathRequest = com.facebook.GraphRequest.INSTANCE.newGraphPathRequest(null, "app/model_asset", null);
            newGraphPathRequest.setParameters(bundle);
            org.json.JSONObject graphObject = newGraphPathRequest.executeAndWait().getGraphObject();
            if (graphObject == null) {
                return null;
            }
            return parseRawJsonObject(graphObject);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void enableMTML() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String str = null;
            int i = 0;
            for (java.util.Map.Entry<java.lang.String, com.facebook.appevents.ml.ModelManager.TaskHandler> entry : taskHandlers.entrySet()) {
                java.lang.String key = entry.getKey();
                com.facebook.appevents.ml.ModelManager.TaskHandler value = entry.getValue();
                if (kotlin.jvm.internal.Intrinsics.areEqual(key, com.facebook.appevents.ml.ModelManager.Task.MTML_APP_EVENT_PREDICTION.toUseCase())) {
                    java.lang.String assetUri = value.getAssetUri();
                    int max = java.lang.Math.max(i, value.getVersionId());
                    com.facebook.internal.FeatureManager featureManager = com.facebook.internal.FeatureManager.INSTANCE;
                    if (com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.SuggestedEvents) && isLocaleEnglish()) {
                        arrayList.add(value.setOnPostExecute(new java.lang.Runnable() { // from class: com.facebook.appevents.ml.ModelManager$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facebook.appevents.ml.ModelManager.m5143enableMTML$lambda1();
                            }
                        }));
                    }
                    str = assetUri;
                    i = max;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(key, com.facebook.appevents.ml.ModelManager.Task.MTML_INTEGRITY_DETECT.toUseCase())) {
                    str = value.getAssetUri();
                    i = java.lang.Math.max(i, value.getVersionId());
                    com.facebook.internal.FeatureManager featureManager2 = com.facebook.internal.FeatureManager.INSTANCE;
                    if (com.facebook.internal.FeatureManager.isEnabled(com.facebook.internal.FeatureManager.Feature.IntelligentIntegrity)) {
                        arrayList.add(value.setOnPostExecute(new java.lang.Runnable() { // from class: com.facebook.appevents.ml.ModelManager$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.facebook.appevents.ml.ModelManager.m5144enableMTML$lambda2();
                            }
                        }));
                    }
                }
            }
            if (str == null || i <= 0 || arrayList.isEmpty()) {
                return;
            }
            com.facebook.appevents.ml.ModelManager.TaskHandler.INSTANCE.execute(new com.facebook.appevents.ml.ModelManager.TaskHandler(MTML_USE_CASE, str, null, i, null), arrayList);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: enableMTML$lambda-1, reason: not valid java name */
    public static final void m5143enableMTML$lambda1() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ml.ModelManager.class)) {
            return;
        }
        try {
            com.facebook.appevents.suggestedevents.SuggestedEventsManager suggestedEventsManager = com.facebook.appevents.suggestedevents.SuggestedEventsManager.INSTANCE;
            com.facebook.appevents.suggestedevents.SuggestedEventsManager.enable();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ml.ModelManager.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: enableMTML$lambda-2, reason: not valid java name */
    public static final void m5144enableMTML$lambda2() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ml.ModelManager.class)) {
            return;
        }
        try {
            com.facebook.appevents.integrity.IntegrityManager integrityManager = com.facebook.appevents.integrity.IntegrityManager.INSTANCE;
            com.facebook.appevents.integrity.IntegrityManager.enable();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ml.ModelManager.class);
        }
    }

    private final boolean isLocaleEnglish() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.util.Locale resourceLocale = com.facebook.internal.Utility.getResourceLocale();
            if (resourceLocale != null) {
                java.lang.String language = resourceLocale.getLanguage();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "locale.language");
                if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) language, (java.lang.CharSequence) "en", false, 2, (java.lang.Object) null)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final float[] parseJsonArray(org.json.JSONArray jsonArray) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this) || jsonArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jsonArray.length()];
            int length = jsonArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    try {
                        java.lang.String string = jsonArray.getString(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                        fArr[i] = java.lang.Float.parseFloat(string);
                    } catch (org.json.JSONException unused) {
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return fArr;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File getRuleFile(com.facebook.appevents.ml.ModelManager.Task task) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ml.ModelManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            com.facebook.appevents.ml.ModelManager.TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            if (taskHandler == null) {
                return null;
            }
            return taskHandler.getRuleFile();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ml.ModelManager.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String[] predict(com.facebook.appevents.ml.ModelManager.Task task, float[][] denses, java.lang.String[] texts) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ml.ModelManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(task, "task");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(denses, "denses");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(texts, "texts");
            com.facebook.appevents.ml.ModelManager.TaskHandler taskHandler = taskHandlers.get(task.toUseCase());
            com.facebook.appevents.ml.Model model = taskHandler == null ? null : taskHandler.getModel();
            if (model == null) {
                return null;
            }
            float[] thresholds = taskHandler.getThresholds();
            int length = texts.length;
            int length2 = denses[0].length;
            com.facebook.appevents.ml.MTensor mTensor = new com.facebook.appevents.ml.MTensor(new int[]{length, length2});
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    java.lang.System.arraycopy(denses[i], 0, mTensor.getData(), i * length2, length2);
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            com.facebook.appevents.ml.MTensor predictOnMTML = model.predictOnMTML(mTensor, texts, task.toKey());
            if (predictOnMTML != null && thresholds != null && predictOnMTML.getData().length != 0 && thresholds.length != 0) {
                int i3 = com.facebook.appevents.ml.ModelManager.WhenMappings.$EnumSwitchMapping$0[task.ordinal()];
                if (i3 == 1) {
                    return INSTANCE.processSuggestedEventResult(predictOnMTML, thresholds);
                }
                if (i3 == 2) {
                    return INSTANCE.processIntegrityDetectionResult(predictOnMTML, thresholds);
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ml.ModelManager.class);
            return null;
        }
    }

    private final java.lang.String[] processSuggestedEventResult(com.facebook.appevents.ml.MTensor res, float[] thresholds) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = res.getShape(0);
            int shape2 = res.getShape(1);
            float[] data = res.getData();
            if (shape2 != thresholds.length) {
                return null;
            }
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, shape);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
                java.lang.String str = "other";
                int length = thresholds.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(nextInt * shape2) + i2] >= thresholds[i]) {
                        str = MTML_SUGGESTED_EVENTS_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
            if (array != null) {
                return (java.lang.String[]) array;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final java.lang.String[] processIntegrityDetectionResult(com.facebook.appevents.ml.MTensor res, float[] thresholds) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int shape = res.getShape(0);
            int shape2 = res.getShape(1);
            float[] data = res.getData();
            if (shape2 != thresholds.length) {
                return null;
            }
            kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, shape);
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(until, 10));
            java.util.Iterator<java.lang.Integer> it = until.iterator();
            while (it.hasNext()) {
                int nextInt = ((kotlin.collections.IntIterator) it).nextInt();
                java.lang.String str = "none";
                int length = thresholds.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    if (data[(nextInt * shape2) + i2] >= thresholds[i]) {
                        str = MTML_INTEGRITY_DETECT_PREDICTION.get(i2);
                    }
                    i++;
                    i2 = i3;
                }
                arrayList.add(str);
            }
            java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
            if (array != null) {
                return (java.lang.String[]) array;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: ModelManager.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 *2\u00020\u0001:\u0001*B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010)\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "", "useCase", "", "assetUri", "ruleUri", "versionId", "", com.facebook.appevents.ml.ModelManager.THRESHOLD_KEY, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I[F)V", "getAssetUri", "()Ljava/lang/String;", "setAssetUri", "(Ljava/lang/String;)V", "model", "Lcom/facebook/appevents/ml/Model;", "getModel", "()Lcom/facebook/appevents/ml/Model;", "setModel", "(Lcom/facebook/appevents/ml/Model;)V", "onPostExecute", "Ljava/lang/Runnable;", "ruleFile", "Ljava/io/File;", "getRuleFile", "()Ljava/io/File;", "setRuleFile", "(Ljava/io/File;)V", "getRuleUri", "setRuleUri", "getThresholds", "()[F", "setThresholds", "([F)V", "getUseCase", "setUseCase", "getVersionId", "()I", "setVersionId", "(I)V", "setOnPostExecute", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class TaskHandler {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.facebook.appevents.ml.ModelManager.TaskHandler.Companion INSTANCE = new com.facebook.appevents.ml.ModelManager.TaskHandler.Companion(null);
        private java.lang.String assetUri;
        private com.facebook.appevents.ml.Model model;
        private java.lang.Runnable onPostExecute;
        private java.io.File ruleFile;
        private java.lang.String ruleUri;
        private float[] thresholds;
        private java.lang.String useCase;
        private int versionId;

        public TaskHandler(java.lang.String useCase, java.lang.String assetUri, java.lang.String str, int i, float[] fArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(useCase, "useCase");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetUri, "assetUri");
            this.useCase = useCase;
            this.assetUri = assetUri;
            this.ruleUri = str;
            this.versionId = i;
            this.thresholds = fArr;
        }

        public final java.lang.String getUseCase() {
            return this.useCase;
        }

        public final void setUseCase(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.useCase = str;
        }

        public final java.lang.String getAssetUri() {
            return this.assetUri;
        }

        public final void setAssetUri(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.assetUri = str;
        }

        public final java.lang.String getRuleUri() {
            return this.ruleUri;
        }

        public final void setRuleUri(java.lang.String str) {
            this.ruleUri = str;
        }

        public final int getVersionId() {
            return this.versionId;
        }

        public final void setVersionId(int i) {
            this.versionId = i;
        }

        public final float[] getThresholds() {
            return this.thresholds;
        }

        public final void setThresholds(float[] fArr) {
            this.thresholds = fArr;
        }

        public final java.io.File getRuleFile() {
            return this.ruleFile;
        }

        public final void setRuleFile(java.io.File file) {
            this.ruleFile = file;
        }

        public final com.facebook.appevents.ml.Model getModel() {
            return this.model;
        }

        public final void setModel(com.facebook.appevents.ml.Model model) {
            this.model = model;
        }

        public final com.facebook.appevents.ml.ModelManager.TaskHandler setOnPostExecute(java.lang.Runnable onPostExecute) {
            this.onPostExecute = onPostExecute;
            return this;
        }

        /* compiled from: ModelManager.kt */
        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0004J\u001c\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/ml/ModelManager$TaskHandler$Companion;", "", "()V", "build", "Lcom/facebook/appevents/ml/ModelManager$TaskHandler;", "json", "Lorg/json/JSONObject;", "deleteOldFiles", "", "useCase", "", "versionId", "", com.vungle.ads.internal.presenter.NativeAdPresenter.DOWNLOAD, com.facebook.share.internal.ShareConstants.MEDIA_URI, "name", "onComplete", "Lcom/facebook/appevents/internal/FileDownloadTask$Callback;", "execute", "handler", "master", "slaves", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final com.facebook.appevents.ml.ModelManager.TaskHandler build(org.json.JSONObject json) {
                if (json == null) {
                    return null;
                }
                try {
                    java.lang.String useCase = json.getString(com.facebook.appevents.ml.ModelManager.USE_CASE_KEY);
                    java.lang.String assetUri = json.getString(com.facebook.appevents.ml.ModelManager.ASSET_URI_KEY);
                    java.lang.String optString = json.optString(com.facebook.appevents.ml.ModelManager.RULES_URI_KEY, null);
                    int i = json.getInt(com.facebook.appevents.ml.ModelManager.VERSION_ID_KEY);
                    float[] access$parseJsonArray = com.facebook.appevents.ml.ModelManager.access$parseJsonArray(com.facebook.appevents.ml.ModelManager.INSTANCE, json.getJSONArray(com.facebook.appevents.ml.ModelManager.THRESHOLD_KEY));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    return new com.facebook.appevents.ml.ModelManager.TaskHandler(useCase, assetUri, optString, i, access$parseJsonArray);
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }

            public final void execute(com.facebook.appevents.ml.ModelManager.TaskHandler handler) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "handler");
                execute(handler, kotlin.collections.CollectionsKt.listOf(handler));
            }

            public final void execute(com.facebook.appevents.ml.ModelManager.TaskHandler master, final java.util.List<com.facebook.appevents.ml.ModelManager.TaskHandler> slaves) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(master, "master");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slaves, "slaves");
                deleteOldFiles(master.getUseCase(), master.getVersionId());
                download(master.getAssetUri(), master.getUseCase() + '_' + master.getVersionId(), new com.facebook.appevents.internal.FileDownloadTask.Callback() { // from class: com.facebook.appevents.ml.ModelManager$TaskHandler$Companion$$ExternalSyntheticLambda1
                    @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
                    public final void onComplete(java.io.File file) {
                        com.facebook.appevents.ml.ModelManager.TaskHandler.Companion.m5146execute$lambda1(slaves, file);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: execute$lambda-1, reason: not valid java name */
            public static final void m5146execute$lambda1(java.util.List slaves, java.io.File file) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slaves, "$slaves");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
                final com.facebook.appevents.ml.Model build = com.facebook.appevents.ml.Model.INSTANCE.build(file);
                if (build != null) {
                    java.util.Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        final com.facebook.appevents.ml.ModelManager.TaskHandler taskHandler = (com.facebook.appevents.ml.ModelManager.TaskHandler) it.next();
                        com.facebook.appevents.ml.ModelManager.TaskHandler.INSTANCE.download(taskHandler.getRuleUri(), taskHandler.getUseCase() + '_' + taskHandler.getVersionId() + "_rule", new com.facebook.appevents.internal.FileDownloadTask.Callback() { // from class: com.facebook.appevents.ml.ModelManager$TaskHandler$Companion$$ExternalSyntheticLambda0
                            @Override // com.facebook.appevents.internal.FileDownloadTask.Callback
                            public final void onComplete(java.io.File file2) {
                                com.facebook.appevents.ml.ModelManager.TaskHandler.Companion.m5147execute$lambda1$lambda0(com.facebook.appevents.ml.ModelManager.TaskHandler.this, build, file2);
                            }
                        });
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: execute$lambda-1$lambda-0, reason: not valid java name */
            public static final void m5147execute$lambda1$lambda0(com.facebook.appevents.ml.ModelManager.TaskHandler slave, com.facebook.appevents.ml.Model model, java.io.File file) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(slave, "$slave");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
                slave.setModel(model);
                slave.setRuleFile(file);
                java.lang.Runnable runnable = slave.onPostExecute;
                if (runnable == null) {
                    return;
                }
                runnable.run();
            }

            private final void deleteOldFiles(java.lang.String useCase, int versionId) {
                java.io.File[] listFiles;
                com.facebook.appevents.ml.Utils utils = com.facebook.appevents.ml.Utils.INSTANCE;
                java.io.File mlDir = com.facebook.appevents.ml.Utils.getMlDir();
                if (mlDir == null || (listFiles = mlDir.listFiles()) == null || listFiles.length == 0) {
                    return;
                }
                java.lang.String str = useCase + '_' + versionId;
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    java.io.File file = listFiles[i];
                    i++;
                    java.lang.String name = file.getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
                    if (kotlin.text.StringsKt.startsWith$default(name, useCase, false, 2, (java.lang.Object) null) && !kotlin.text.StringsKt.startsWith$default(name, str, false, 2, (java.lang.Object) null)) {
                        file.delete();
                    }
                }
            }

            private final void download(java.lang.String uri, java.lang.String name, com.facebook.appevents.internal.FileDownloadTask.Callback onComplete) {
                com.facebook.appevents.ml.Utils utils = com.facebook.appevents.ml.Utils.INSTANCE;
                java.io.File file = new java.io.File(com.facebook.appevents.ml.Utils.getMlDir(), name);
                if (uri == null || file.exists()) {
                    onComplete.onComplete(file);
                } else {
                    new com.facebook.appevents.internal.FileDownloadTask(uri, file, onComplete).execute(new java.lang.String[0]);
                }
            }
        }
    }
}
