package com.facebook.appevents;

/* compiled from: UserDataStore.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0007J\b\u0010\"\u001a\u00020\u0004H\u0007J\r\u0010#\u001a\u00020\u0004H\u0001¢\u0006\u0002\b$J\b\u0010%\u001a\u00020!H\u0002J\b\u0010&\u001a\u00020!H\u0007J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0004H\u0002J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0004H\u0002J\u001c\u0010,\u001a\u00020!2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0016H\u0007J\u0012\u0010.\u001a\u00020!2\b\u0010-\u001a\u0004\u0018\u00010/H\u0007Jl\u0010.\u001a\u00020!2\b\u00100\u001a\u0004\u0018\u00010\u00042\b\u00101\u001a\u0004\u0018\u00010\u00042\b\u00102\u001a\u0004\u0018\u00010\u00042\b\u00103\u001a\u0004\u0018\u00010\u00042\b\u00104\u001a\u0004\u0018\u00010\u00042\b\u00105\u001a\u0004\u0018\u00010\u00042\b\u00106\u001a\u0004\u0018\u00010\u00042\b\u00107\u001a\u0004\u0018\u00010\u00042\b\u00108\u001a\u0004\u0018\u00010\u00042\b\u00109\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010:\u001a\u00020!2\b\u0010-\u001a\u0004\u0018\u00010/H\u0002J\u0018\u0010;\u001a\u00020!2\u0006\u0010<\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0012*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/facebook/appevents/UserDataStore;", "", "()V", com.google.ads.mediation.inmobi.InMobiNetworkKeys.CITY, "", com.google.ads.mediation.inmobi.InMobiNetworkKeys.COUNTRY, "DATA_SEPARATOR", "DATE_OF_BIRTH", "EMAIL", "FIRST_NAME", "GENDER", "INTERNAL_USER_DATA_KEY", "LAST_NAME", "MAX_NUM", "", "PHONE", com.google.ads.mediation.inmobi.InMobiNetworkKeys.STATE, "TAG", "kotlin.jvm.PlatformType", "USER_DATA_KEY", "ZIP", "enabledInternalUserData", "", "getEnabledInternalUserData", "()Ljava/util/Map;", "externalHashedUserData", "Ljava/util/concurrent/ConcurrentHashMap;", "initialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "internalHashedUserData", "sharedPreferences", "Landroid/content/SharedPreferences;", "clear", "", "getAllHashedUserData", "getHashedUserData", "getHashedUserData$facebook_core_release", "initAndWait", "initStore", "maybeSHA256Hashed", "", "data", "normalizeData", "type", "setInternalUd", "ud", "setUserDataAndHash", "Landroid/os/Bundle;", "email", "firstName", "lastName", androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE, "dateOfBirth", "gender", "city", "state", "zip", "country", "updateHashUserData", "writeDataIntoCache", com.ironsource.X3.i.W, "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class UserDataStore {
    public static final java.lang.String CITY = "ct";
    public static final java.lang.String COUNTRY = "country";
    private static final java.lang.String DATA_SEPARATOR = ",";
    public static final java.lang.String DATE_OF_BIRTH = "db";
    public static final java.lang.String EMAIL = "em";
    public static final java.lang.String FIRST_NAME = "fn";
    public static final java.lang.String GENDER = "ge";
    private static final java.lang.String INTERNAL_USER_DATA_KEY = "com.facebook.appevents.UserDataStore.internalUserData";
    public static final java.lang.String LAST_NAME = "ln";
    private static final int MAX_NUM = 5;
    public static final java.lang.String PHONE = "ph";
    public static final java.lang.String STATE = "st";
    private static final java.lang.String USER_DATA_KEY = "com.facebook.appevents.UserDataStore.userData";
    public static final java.lang.String ZIP = "zp";
    private static android.content.SharedPreferences sharedPreferences;
    public static final com.facebook.appevents.UserDataStore INSTANCE = new com.facebook.appevents.UserDataStore();
    private static final java.lang.String TAG = "UserDataStore";
    private static final java.util.concurrent.atomic.AtomicBoolean initialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> externalHashedUserData = new java.util.concurrent.ConcurrentHashMap<>();
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> internalHashedUserData = new java.util.concurrent.ConcurrentHashMap<>();

    private UserDataStore() {
    }

    @kotlin.jvm.JvmStatic
    public static final void initStore() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.UserDataStore.class)) {
            return;
        }
        try {
            if (initialized.get()) {
                return;
            }
            INSTANCE.initAndWait();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.UserDataStore.class);
        }
    }

    private final void writeDataIntoCache(final java.lang.String key, final java.lang.String value) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.FacebookSdk.getExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.UserDataStore$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.UserDataStore.m5107writeDataIntoCache$lambda0(key, value);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: writeDataIntoCache$lambda-0, reason: not valid java name */
    public static final void m5107writeDataIntoCache$lambda0(java.lang.String key, java.lang.String value) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.UserDataStore.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "$key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "$value");
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putString(key, value).apply();
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.UserDataStore.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setUserDataAndHash(final android.os.Bundle ud) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.UserDataStore.class)) {
            return;
        }
        try {
            com.facebook.appevents.InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.UserDataStore$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.UserDataStore.m5106setUserDataAndHash$lambda1(ud);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.UserDataStore.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setUserDataAndHash$lambda-1, reason: not valid java name */
    public static final void m5106setUserDataAndHash$lambda1(android.os.Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.UserDataStore.class)) {
            return;
        }
        try {
            if (!initialized.get()) {
                android.util.Log.w(TAG, "initStore should have been called before calling setUserData");
                INSTANCE.initAndWait();
            }
            com.facebook.appevents.UserDataStore userDataStore = INSTANCE;
            userDataStore.updateHashUserData(bundle);
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            userDataStore.writeDataIntoCache(USER_DATA_KEY, com.facebook.internal.Utility.mapToJsonStr(externalHashedUserData));
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            userDataStore.writeDataIntoCache(INTERNAL_USER_DATA_KEY, com.facebook.internal.Utility.mapToJsonStr(internalHashedUserData));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.UserDataStore.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setUserDataAndHash(java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String phone, java.lang.String dateOfBirth, java.lang.String gender, java.lang.String city, java.lang.String state, java.lang.String zip, java.lang.String country) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.UserDataStore.class)) {
            return;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            if (email != null) {
                bundle.putString(EMAIL, email);
            }
            if (firstName != null) {
                bundle.putString(FIRST_NAME, firstName);
            }
            if (lastName != null) {
                bundle.putString(LAST_NAME, lastName);
            }
            if (phone != null) {
                bundle.putString(PHONE, phone);
            }
            if (dateOfBirth != null) {
                bundle.putString(DATE_OF_BIRTH, dateOfBirth);
            }
            if (gender != null) {
                bundle.putString(GENDER, gender);
            }
            if (city != null) {
                bundle.putString(CITY, city);
            }
            if (state != null) {
                bundle.putString("st", state);
            }
            if (zip != null) {
                bundle.putString(ZIP, zip);
            }
            if (country != null) {
                bundle.putString("country", country);
            }
            setUserDataAndHash(bundle);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.UserDataStore.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void clear() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.UserDataStore.class)) {
            return;
        }
        try {
            com.facebook.appevents.InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new java.lang.Runnable() { // from class: com.facebook.appevents.UserDataStore$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    com.facebook.appevents.UserDataStore.m5105clear$lambda2();
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.UserDataStore.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clear$lambda-2, reason: not valid java name */
    public static final void m5105clear$lambda2() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.UserDataStore.class)) {
            return;
        }
        try {
            if (!initialized.get()) {
                android.util.Log.w(TAG, "initStore should have been called before calling setUserData");
                INSTANCE.initAndWait();
            }
            externalHashedUserData.clear();
            android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putString(USER_DATA_KEY, null).apply();
            } else {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                throw null;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.UserDataStore.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getHashedUserData$facebook_core_release() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.UserDataStore.class)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                android.util.Log.w(TAG, "initStore should have been called before calling setUserID");
                INSTANCE.initAndWait();
            }
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            return com.facebook.internal.Utility.mapToJsonStr(externalHashedUserData);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.UserDataStore.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAllHashedUserData() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.UserDataStore.class)) {
            return null;
        }
        try {
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.putAll(externalHashedUserData);
            hashMap.putAll(INSTANCE.getEnabledInternalUserData());
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            return com.facebook.internal.Utility.mapToJsonStr(hashMap);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.UserDataStore.class);
            return null;
        }
    }

    private final java.util.Map<java.lang.String, java.lang.String> getEnabledInternalUserData() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Set<java.lang.String> enabledRuleNames = com.facebook.appevents.aam.MetadataRule.INSTANCE.getEnabledRuleNames();
            for (java.lang.String str : internalHashedUserData.keySet()) {
                if (enabledRuleNames.contains(str)) {
                    hashMap.put(str, internalHashedUserData.get(str));
                }
            }
            return hashMap;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final synchronized void initAndWait() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(com.facebook.FacebookSdk.getApplicationContext());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(FacebookSdk.getApplicationContext())");
            sharedPreferences = defaultSharedPreferences;
            if (defaultSharedPreferences != null) {
                java.lang.String string = defaultSharedPreferences.getString(USER_DATA_KEY, "");
                if (string == null) {
                    string = "";
                }
                android.content.SharedPreferences sharedPreferences2 = sharedPreferences;
                if (sharedPreferences2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                    throw null;
                }
                java.lang.String string2 = sharedPreferences2.getString(INTERNAL_USER_DATA_KEY, "");
                if (string2 == null) {
                    string2 = "";
                }
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> concurrentHashMap = externalHashedUserData;
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                concurrentHashMap.putAll(com.facebook.internal.Utility.jsonStrToMap(string));
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> concurrentHashMap2 = internalHashedUserData;
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                concurrentHashMap2.putAll(com.facebook.internal.Utility.jsonStrToMap(string2));
                atomicBoolean.set(true);
                return;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
            throw null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void updateHashUserData(android.os.Bundle ud) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this) || ud == null) {
            return;
        }
        try {
            for (java.lang.String key : ud.keySet()) {
                java.lang.Object obj = ud.get(key);
                if (obj != null) {
                    java.lang.String obj2 = obj.toString();
                    if (maybeSHA256Hashed(obj2)) {
                        java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> concurrentHashMap = externalHashedUserData;
                        if (obj2 == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        java.lang.String lowerCase = obj2.toLowerCase();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                        concurrentHashMap.put(key, lowerCase);
                    } else {
                        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                        java.lang.String sha256hash = com.facebook.internal.Utility.sha256hash(normalizeData(key, obj2));
                        if (sha256hash != null) {
                            externalHashedUserData.put(key, sha256hash);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setInternalUd(java.util.Map<java.lang.String, java.lang.String> ud) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.UserDataStore.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ud, "ud");
            if (!initialized.get()) {
                INSTANCE.initAndWait();
            }
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : ud.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.String value = entry.getValue();
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.appevents.UserDataStore userDataStore = INSTANCE;
                java.lang.String str = value;
                int i = 1;
                int length = str.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length) {
                    boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str.charAt(!z ? i2 : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        } else {
                            length--;
                        }
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                java.lang.String sha256hash = com.facebook.internal.Utility.sha256hash(userDataStore.normalizeData(key, str.subSequence(i2, length + 1).toString()));
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> concurrentHashMap = internalHashedUserData;
                if (concurrentHashMap.containsKey(key)) {
                    java.lang.String str2 = concurrentHashMap.get(key);
                    java.lang.String[] strArr = null;
                    if (str2 != null) {
                        java.util.List<java.lang.String> split = new kotlin.text.Regex(DATA_SEPARATOR).split(str2, 0);
                        if (split != null) {
                            java.lang.Object[] array = split.toArray(new java.lang.String[0]);
                            if (array == null) {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                            }
                            strArr = (java.lang.String[]) array;
                        }
                    }
                    if (strArr == null) {
                        strArr = new java.lang.String[0];
                    }
                    java.util.Set mutableSetOf = kotlin.collections.SetsKt.mutableSetOf(java.util.Arrays.copyOf(strArr, strArr.length));
                    if (mutableSetOf.contains(sha256hash)) {
                        return;
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    if (strArr.length == 0) {
                        sb.append(sha256hash);
                    } else if (strArr.length < 5) {
                        sb.append(str2);
                        sb.append(DATA_SEPARATOR);
                        sb.append(sha256hash);
                    } else {
                        while (true) {
                            int i3 = i + 1;
                            sb.append(strArr[i]);
                            sb.append(DATA_SEPARATOR);
                            if (i3 >= 5) {
                                break;
                            } else {
                                i = i3;
                            }
                        }
                        sb.append(sha256hash);
                        mutableSetOf.remove(strArr[0]);
                    }
                    internalHashedUserData.put(key, sb.toString());
                } else {
                    concurrentHashMap.put(key, sha256hash);
                }
            }
            com.facebook.appevents.UserDataStore userDataStore2 = INSTANCE;
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            userDataStore2.writeDataIntoCache(INTERNAL_USER_DATA_KEY, com.facebook.internal.Utility.mapToJsonStr(internalHashedUserData));
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.UserDataStore.class);
        }
    }

    private final boolean maybeSHA256Hashed(java.lang.String data) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return new kotlin.text.Regex("[A-Fa-f0-9]{64}").matches(data);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final java.lang.String normalizeData(java.lang.String type, java.lang.String data) {
        java.lang.String str;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.lang.String str2 = data;
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            java.lang.String obj = str2.subSequence(i, length + 1).toString();
            if (obj == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String lowerCase = obj.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            if (kotlin.jvm.internal.Intrinsics.areEqual(EMAIL, type)) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                    return lowerCase;
                }
                android.util.Log.e(TAG, "Setting email failure: this is not a valid email address");
                return "";
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(PHONE, type)) {
                return new kotlin.text.Regex("[^0-9]").replace(lowerCase, "");
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(GENDER, type)) {
                return lowerCase;
            }
            if (lowerCase.length() <= 0) {
                str = "";
            } else {
                if (lowerCase == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                str = lowerCase.substring(0, 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, str) && !kotlin.jvm.internal.Intrinsics.areEqual(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE, str)) {
                android.util.Log.e(TAG, "Setting gender failure: the supported value for gender is f or m");
                return "";
            }
            return str;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
