package com.facebook.appevents.integrity;

/* compiled from: MACARuleMatchingManager.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007J&\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007J\b\u0010\u001c\u001a\u00020\fH\u0002J\u001a\u0010\u001d\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0010\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\"\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u000fH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\""}, d2 = {"Lcom/facebook/appevents/integrity/MACARuleMatchingManager;", "", "()V", "MACARules", "Lorg/json/JSONArray;", "enabled", "", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "", "", "[Ljava/lang/String;", com.ironsource.mediationsdk.metadata.a.j, "", "generateInfo", "params", "Landroid/os/Bundle;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "getKey", "logic", "Lorg/json/JSONObject;", "getMatchPropertyIDs", "getStringArrayList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "jsonArray", "isMatchCCRule", "ruleString", "data", "loadMACARules", "processParameters", "removeGeneratedInfo", "stringComparison", "variable", "values", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MACARuleMatchingManager {
    private static org.json.JSONArray MACARules;
    private static boolean enabled;
    public static final com.facebook.appevents.integrity.MACARuleMatchingManager INSTANCE = new com.facebook.appevents.integrity.MACARuleMatchingManager();
    private static java.lang.String[] keys = {androidx.core.app.NotificationCompat.CATEGORY_EVENT, "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private MACARuleMatchingManager() {
    }

    @kotlin.jvm.JvmStatic
    public static final void enable() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.MACARuleMatchingManager.class)) {
            return;
        }
        try {
            INSTANCE.loadMACARules();
            if (MACARules != null) {
                enabled = true;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.MACARuleMatchingManager.class);
        }
    }

    private final void loadMACARules() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            com.facebook.internal.FetchedAppSettingsManager fetchedAppSettingsManager = com.facebook.internal.FetchedAppSettingsManager.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            com.facebook.internal.FetchedAppSettings queryAppSettings = com.facebook.internal.FetchedAppSettingsManager.queryAppSettings(com.facebook.FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            MACARules = queryAppSettings.getMACARuleMatchingSetting();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getKey(org.json.JSONObject logic) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logic, "logic");
            java.util.Iterator<java.lang.String> keys2 = logic.keys();
            if (keys2.hasNext()) {
                return keys2.next();
            }
            return null;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.MACARuleMatchingManager.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02be A[Catch: all -> 0x03fc, TryCatch #0 {all -> 0x03fc, blocks: (B:6:0x000a, B:9:0x001d, B:13:0x0041, B:15:0x0039, B:24:0x0067, B:25:0x006f, B:28:0x007c, B:32:0x0086, B:34:0x008c, B:36:0x0097, B:38:0x00a6, B:39:0x00ab, B:40:0x00ac, B:41:0x00b1, B:42:0x00b2, B:46:0x00bc, B:52:0x00cc, B:58:0x0262, B:60:0x0268, B:63:0x0272, B:64:0x0276, B:66:0x027c, B:68:0x0284, B:70:0x0293, B:77:0x02a5, B:78:0x02aa, B:80:0x02ab, B:81:0x02b0, B:83:0x00d6, B:87:0x00e0, B:89:0x00e6, B:91:0x00f3, B:93:0x0104, B:94:0x0109, B:95:0x010a, B:96:0x010f, B:97:0x0110, B:103:0x02be, B:105:0x02c4, B:109:0x02cf, B:110:0x02d3, B:112:0x02d9, B:114:0x02e1, B:116:0x02f0, B:122:0x0301, B:123:0x0306, B:125:0x0307, B:126:0x030c, B:129:0x011a, B:133:0x0124, B:135:0x012a, B:137:0x0135, B:139:0x0144, B:140:0x0149, B:141:0x014a, B:142:0x014f, B:143:0x0150, B:147:0x01fe, B:150:0x015a, B:154:0x01e3, B:158:0x0164, B:162:0x01be, B:166:0x016e, B:170:0x0178, B:174:0x0244, B:178:0x0182, B:182:0x018c, B:188:0x03b7, B:190:0x0196, B:194:0x0215, B:198:0x01a0, B:202:0x01aa, B:206:0x0230, B:208:0x01b4, B:212:0x01cf, B:216:0x01d9, B:220:0x01f4, B:224:0x020b, B:228:0x0226, B:232:0x023a, B:236:0x0255, B:240:0x02b1, B:244:0x030d, B:248:0x0317, B:250:0x031d, B:252:0x0328, B:256:0x0339, B:257:0x033e, B:258:0x033f, B:259:0x0344, B:260:0x0345, B:264:0x034f, B:266:0x035d, B:272:0x03a2, B:274:0x0367, B:278:0x0371, B:280:0x0382, B:284:0x038d, B:286:0x0396, B:290:0x03ab, B:294:0x03c0, B:298:0x03c9, B:300:0x03cf, B:302:0x03dc, B:306:0x03ef, B:307:0x03f4, B:308:0x03f5, B:309:0x03fa, B:311:0x0054), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b7 A[Catch: all -> 0x03fc, TryCatch #0 {all -> 0x03fc, blocks: (B:6:0x000a, B:9:0x001d, B:13:0x0041, B:15:0x0039, B:24:0x0067, B:25:0x006f, B:28:0x007c, B:32:0x0086, B:34:0x008c, B:36:0x0097, B:38:0x00a6, B:39:0x00ab, B:40:0x00ac, B:41:0x00b1, B:42:0x00b2, B:46:0x00bc, B:52:0x00cc, B:58:0x0262, B:60:0x0268, B:63:0x0272, B:64:0x0276, B:66:0x027c, B:68:0x0284, B:70:0x0293, B:77:0x02a5, B:78:0x02aa, B:80:0x02ab, B:81:0x02b0, B:83:0x00d6, B:87:0x00e0, B:89:0x00e6, B:91:0x00f3, B:93:0x0104, B:94:0x0109, B:95:0x010a, B:96:0x010f, B:97:0x0110, B:103:0x02be, B:105:0x02c4, B:109:0x02cf, B:110:0x02d3, B:112:0x02d9, B:114:0x02e1, B:116:0x02f0, B:122:0x0301, B:123:0x0306, B:125:0x0307, B:126:0x030c, B:129:0x011a, B:133:0x0124, B:135:0x012a, B:137:0x0135, B:139:0x0144, B:140:0x0149, B:141:0x014a, B:142:0x014f, B:143:0x0150, B:147:0x01fe, B:150:0x015a, B:154:0x01e3, B:158:0x0164, B:162:0x01be, B:166:0x016e, B:170:0x0178, B:174:0x0244, B:178:0x0182, B:182:0x018c, B:188:0x03b7, B:190:0x0196, B:194:0x0215, B:198:0x01a0, B:202:0x01aa, B:206:0x0230, B:208:0x01b4, B:212:0x01cf, B:216:0x01d9, B:220:0x01f4, B:224:0x020b, B:228:0x0226, B:232:0x023a, B:236:0x0255, B:240:0x02b1, B:244:0x030d, B:248:0x0317, B:250:0x031d, B:252:0x0328, B:256:0x0339, B:257:0x033e, B:258:0x033f, B:259:0x0344, B:260:0x0345, B:264:0x034f, B:266:0x035d, B:272:0x03a2, B:274:0x0367, B:278:0x0371, B:280:0x0382, B:284:0x038d, B:286:0x0396, B:290:0x03ab, B:294:0x03c0, B:298:0x03c9, B:300:0x03cf, B:302:0x03dc, B:306:0x03ef, B:307:0x03f4, B:308:0x03f5, B:309:0x03fa, B:311:0x0054), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03a2 A[Catch: all -> 0x03fc, TryCatch #0 {all -> 0x03fc, blocks: (B:6:0x000a, B:9:0x001d, B:13:0x0041, B:15:0x0039, B:24:0x0067, B:25:0x006f, B:28:0x007c, B:32:0x0086, B:34:0x008c, B:36:0x0097, B:38:0x00a6, B:39:0x00ab, B:40:0x00ac, B:41:0x00b1, B:42:0x00b2, B:46:0x00bc, B:52:0x00cc, B:58:0x0262, B:60:0x0268, B:63:0x0272, B:64:0x0276, B:66:0x027c, B:68:0x0284, B:70:0x0293, B:77:0x02a5, B:78:0x02aa, B:80:0x02ab, B:81:0x02b0, B:83:0x00d6, B:87:0x00e0, B:89:0x00e6, B:91:0x00f3, B:93:0x0104, B:94:0x0109, B:95:0x010a, B:96:0x010f, B:97:0x0110, B:103:0x02be, B:105:0x02c4, B:109:0x02cf, B:110:0x02d3, B:112:0x02d9, B:114:0x02e1, B:116:0x02f0, B:122:0x0301, B:123:0x0306, B:125:0x0307, B:126:0x030c, B:129:0x011a, B:133:0x0124, B:135:0x012a, B:137:0x0135, B:139:0x0144, B:140:0x0149, B:141:0x014a, B:142:0x014f, B:143:0x0150, B:147:0x01fe, B:150:0x015a, B:154:0x01e3, B:158:0x0164, B:162:0x01be, B:166:0x016e, B:170:0x0178, B:174:0x0244, B:178:0x0182, B:182:0x018c, B:188:0x03b7, B:190:0x0196, B:194:0x0215, B:198:0x01a0, B:202:0x01aa, B:206:0x0230, B:208:0x01b4, B:212:0x01cf, B:216:0x01d9, B:220:0x01f4, B:224:0x020b, B:228:0x0226, B:232:0x023a, B:236:0x0255, B:240:0x02b1, B:244:0x030d, B:248:0x0317, B:250:0x031d, B:252:0x0328, B:256:0x0339, B:257:0x033e, B:258:0x033f, B:259:0x0344, B:260:0x0345, B:264:0x034f, B:266:0x035d, B:272:0x03a2, B:274:0x0367, B:278:0x0371, B:280:0x0382, B:284:0x038d, B:286:0x0396, B:290:0x03ab, B:294:0x03c0, B:298:0x03c9, B:300:0x03cf, B:302:0x03dc, B:306:0x03ef, B:307:0x03f4, B:308:0x03f5, B:309:0x03fa, B:311:0x0054), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0261 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0262 A[Catch: all -> 0x03fc, TryCatch #0 {all -> 0x03fc, blocks: (B:6:0x000a, B:9:0x001d, B:13:0x0041, B:15:0x0039, B:24:0x0067, B:25:0x006f, B:28:0x007c, B:32:0x0086, B:34:0x008c, B:36:0x0097, B:38:0x00a6, B:39:0x00ab, B:40:0x00ac, B:41:0x00b1, B:42:0x00b2, B:46:0x00bc, B:52:0x00cc, B:58:0x0262, B:60:0x0268, B:63:0x0272, B:64:0x0276, B:66:0x027c, B:68:0x0284, B:70:0x0293, B:77:0x02a5, B:78:0x02aa, B:80:0x02ab, B:81:0x02b0, B:83:0x00d6, B:87:0x00e0, B:89:0x00e6, B:91:0x00f3, B:93:0x0104, B:94:0x0109, B:95:0x010a, B:96:0x010f, B:97:0x0110, B:103:0x02be, B:105:0x02c4, B:109:0x02cf, B:110:0x02d3, B:112:0x02d9, B:114:0x02e1, B:116:0x02f0, B:122:0x0301, B:123:0x0306, B:125:0x0307, B:126:0x030c, B:129:0x011a, B:133:0x0124, B:135:0x012a, B:137:0x0135, B:139:0x0144, B:140:0x0149, B:141:0x014a, B:142:0x014f, B:143:0x0150, B:147:0x01fe, B:150:0x015a, B:154:0x01e3, B:158:0x0164, B:162:0x01be, B:166:0x016e, B:170:0x0178, B:174:0x0244, B:178:0x0182, B:182:0x018c, B:188:0x03b7, B:190:0x0196, B:194:0x0215, B:198:0x01a0, B:202:0x01aa, B:206:0x0230, B:208:0x01b4, B:212:0x01cf, B:216:0x01d9, B:220:0x01f4, B:224:0x020b, B:228:0x0226, B:232:0x023a, B:236:0x0255, B:240:0x02b1, B:244:0x030d, B:248:0x0317, B:250:0x031d, B:252:0x0328, B:256:0x0339, B:257:0x033e, B:258:0x033f, B:259:0x0344, B:260:0x0345, B:264:0x034f, B:266:0x035d, B:272:0x03a2, B:274:0x0367, B:278:0x0371, B:280:0x0382, B:284:0x038d, B:286:0x0396, B:290:0x03ab, B:294:0x03c0, B:298:0x03c9, B:300:0x03cf, B:302:0x03dc, B:306:0x03ef, B:307:0x03f4, B:308:0x03f5, B:309:0x03fa, B:311:0x0054), top: B:5:0x000a }] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean stringComparison(java.lang.String variable, org.json.JSONObject values, android.os.Bundle data) {
        java.lang.Object obj;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.MACARuleMatchingManager.class)) {
            return false;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variable, "variable");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            java.lang.String key = getKey(values);
            if (key == null) {
                return false;
            }
            java.lang.String obj2 = values.get(key).toString();
            java.util.ArrayList<java.lang.String> stringArrayList = getStringArrayList(values.optJSONArray(key));
            java.lang.Boolean bool = null;
            if (kotlin.jvm.internal.Intrinsics.areEqual(key, "exists")) {
                if (data != null) {
                    bool = java.lang.Boolean.valueOf(data.containsKey(variable));
                }
                return kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(obj2)));
            }
            if (data == null) {
                obj = null;
            } else {
                java.lang.String lowerCase = variable.toLowerCase(java.util.Locale.ROOT);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                obj = data.get(lowerCase);
            }
            if (obj == null) {
                obj = data == null ? null : data.get(variable);
                if (obj == null) {
                    return false;
                }
            }
            switch (key.hashCode()) {
                case -1729128927:
                    if (!key.equals("i_not_contains")) {
                        return false;
                    }
                    java.lang.String obj3 = obj.toString();
                    if (obj3 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase2 = obj3.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    java.lang.String str = lowerCase2;
                    if (obj2 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase3 = obj2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) lowerCase3, false, 2, (java.lang.Object) null);
                case -1179774633:
                    if (!key.equals("is_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case -1039699439:
                    if (!key.equals("not_in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    return stringArrayList.contains(obj.toString());
                case -969266188:
                    if (key.equals("starts_with")) {
                        return kotlin.text.StringsKt.startsWith$default(obj.toString(), obj2, false, 2, (java.lang.Object) null);
                    }
                    return false;
                case -966353971:
                    if (key.equals("regex_match")) {
                        return new kotlin.text.Regex(obj2).matches(obj.toString());
                    }
                    return false;
                case -665609109:
                    if (!key.equals("is_not_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case -567445985:
                    if (key.equals("contains")) {
                        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) obj.toString(), (java.lang.CharSequence) obj2, false, 2, (java.lang.Object) null);
                    }
                    return false;
                case -327990090:
                    if (!key.equals("i_str_neq")) {
                        return false;
                    }
                    java.lang.String obj4 = obj.toString();
                    if (obj4 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase4 = obj4.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase5 = obj2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase5, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase4, lowerCase5)) {
                        return false;
                    }
                case -159812115:
                    if (!key.equals("i_is_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    java.util.ArrayList<java.lang.String> arrayList = stringArrayList;
                    if ((arrayList instanceof java.util.Collection) && arrayList.isEmpty()) {
                        return false;
                    }
                    for (java.lang.String str2 : arrayList) {
                        if (str2 == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        java.lang.String lowerCase6 = str2.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase6, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        java.lang.String obj5 = obj.toString();
                        if (obj5 == null) {
                            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        java.lang.String lowerCase7 = obj5.toLowerCase(java.util.Locale.ROOT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase7, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                        if (kotlin.jvm.internal.Intrinsics.areEqual(lowerCase6, lowerCase7)) {
                        }
                    }
                    return false;
                case -92753547:
                    if (!key.equals("i_str_not_in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                        return false;
                    }
                    java.util.ArrayList<java.lang.String> arrayList2 = stringArrayList;
                    if (!(arrayList2 instanceof java.util.Collection) || !arrayList2.isEmpty()) {
                        for (java.lang.String str3 : arrayList2) {
                            if (str3 == null) {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str3.toLowerCase(java.util.Locale.ROOT), "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            java.lang.String obj6 = obj.toString();
                            if (obj6 == null) {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj6.toLowerCase(java.util.Locale.ROOT), "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                            if (!(!kotlin.jvm.internal.Intrinsics.areEqual(r10, r11))) {
                                return false;
                            }
                        }
                    }
                case 60:
                    if (!key.equals("<")) {
                        return false;
                    }
                    if (java.lang.Double.parseDouble(obj.toString()) < java.lang.Double.parseDouble(obj2)) {
                        return false;
                    }
                case 61:
                    if (!key.equals(com.ironsource.X3.j.b)) {
                        return false;
                    }
                    return kotlin.jvm.internal.Intrinsics.areEqual(obj.toString(), obj2);
                case 62:
                    if (!key.equals(">")) {
                        return false;
                    }
                    if (java.lang.Double.parseDouble(obj.toString()) > java.lang.Double.parseDouble(obj2)) {
                        return false;
                    }
                case 1084:
                    if (!key.equals("!=")) {
                        return false;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(obj.toString(), obj2)) {
                        return false;
                    }
                case 1921:
                    if (!key.equals("<=")) {
                        return false;
                    }
                    if (java.lang.Double.parseDouble(obj.toString()) > java.lang.Double.parseDouble(obj2)) {
                        return false;
                    }
                case 1952:
                    if (!key.equals("==")) {
                        return false;
                    }
                    return kotlin.jvm.internal.Intrinsics.areEqual(obj.toString(), obj2);
                case 1983:
                    if (!key.equals(">=")) {
                        return false;
                    }
                    if (java.lang.Double.parseDouble(obj.toString()) < java.lang.Double.parseDouble(obj2)) {
                        return false;
                    }
                case 3244:
                    if (!key.equals("eq")) {
                        return false;
                    }
                    return kotlin.jvm.internal.Intrinsics.areEqual(obj.toString(), obj2);
                case 3294:
                    if (!key.equals(com.facebook.appevents.UserDataStore.GENDER)) {
                        return false;
                    }
                    if (java.lang.Double.parseDouble(obj.toString()) < java.lang.Double.parseDouble(obj2)) {
                    }
                    break;
                case 3309:
                    if (!key.equals("gt")) {
                        return false;
                    }
                    if (java.lang.Double.parseDouble(obj.toString()) > java.lang.Double.parseDouble(obj2)) {
                    }
                    break;
                case 3365:
                    if (!key.equals(com.unity3d.services.ads.gmascar.utils.ScarConstants.IN_SIGNAL_KEY)) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case 3449:
                    if (!key.equals("le")) {
                        return false;
                    }
                    if (java.lang.Double.parseDouble(obj.toString()) > java.lang.Double.parseDouble(obj2)) {
                    }
                    break;
                case 3464:
                    if (!key.equals("lt")) {
                        return false;
                    }
                    if (java.lang.Double.parseDouble(obj.toString()) < java.lang.Double.parseDouble(obj2)) {
                    }
                    break;
                case 3511:
                    if (!key.equals("ne")) {
                        return false;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(obj.toString(), obj2)) {
                    }
                case 102680:
                    if (!key.equals("gte")) {
                        return false;
                    }
                    if (java.lang.Double.parseDouble(obj.toString()) < java.lang.Double.parseDouble(obj2)) {
                    }
                    break;
                case 107485:
                    if (!key.equals("lte")) {
                        return false;
                    }
                    if (java.lang.Double.parseDouble(obj.toString()) > java.lang.Double.parseDouble(obj2)) {
                    }
                    break;
                case 108954:
                    if (!key.equals("neq")) {
                        return false;
                    }
                    if (kotlin.jvm.internal.Intrinsics.areEqual(obj.toString(), obj2)) {
                    }
                case 127966736:
                    if (!key.equals("i_str_eq")) {
                        return false;
                    }
                    java.lang.String obj7 = obj.toString();
                    if (obj7 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase8 = obj7.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase8, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase9 = obj2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase9, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return kotlin.jvm.internal.Intrinsics.areEqual(lowerCase8, lowerCase9);
                case 127966857:
                    if (!key.equals("i_str_in")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case 363990325:
                    if (!key.equals("i_contains")) {
                        return false;
                    }
                    java.lang.String obj8 = obj.toString();
                    if (obj8 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase10 = obj8.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase10, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    java.lang.String str4 = lowerCase10;
                    if (obj2 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase11 = obj2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase11, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str4, (java.lang.CharSequence) lowerCase11, false, 2, (java.lang.Object) null);
                case 1091487233:
                    if (!key.equals("i_is_not_any")) {
                        return false;
                    }
                    if (stringArrayList != null) {
                    }
                    break;
                case 1918401035:
                    if (!key.equals("not_contains") || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) obj.toString(), (java.lang.CharSequence) obj2, false, 2, (java.lang.Object) null)) {
                        return false;
                    }
                case 1961112862:
                    if (!key.equals("i_starts_with")) {
                        return false;
                    }
                    java.lang.String obj9 = obj.toString();
                    if (obj9 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase12 = obj9.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase12, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    if (obj2 == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    java.lang.String lowerCase13 = obj2.toLowerCase(java.util.Locale.ROOT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase13, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
                    return kotlin.text.StringsKt.startsWith$default(lowerCase12, lowerCase13, false, 2, (java.lang.Object) null);
                default:
                    return false;
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.MACARuleMatchingManager.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.ArrayList<java.lang.String> getStringArrayList(org.json.JSONArray jsonArray) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.MACARuleMatchingManager.class) || jsonArray == null) {
            return null;
        }
        try {
            java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
            int length = jsonArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(jsonArray.get(i).toString());
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.MACARuleMatchingManager.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isMatchCCRule(java.lang.String ruleString, android.os.Bundle data) {
        int length;
        if (!com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.MACARuleMatchingManager.class) && ruleString != null && data != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(ruleString);
                java.lang.String key = getKey(jSONObject);
                if (key == null) {
                    return false;
                }
                java.lang.Object obj = jSONObject.get(key);
                int hashCode = key.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && key.equals("not")) {
                            return !isMatchCCRule(obj.toString(), data);
                        }
                    } else if (key.equals("and")) {
                        org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i = 0;
                            while (true) {
                                int i2 = i + 1;
                                if (!isMatchCCRule(jSONArray.get(i).toString(), data)) {
                                    return false;
                                }
                                if (i2 >= length2) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        return true;
                    }
                } else if (key.equals("or")) {
                    org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            if (isMatchCCRule(jSONArray2.get(i3).toString(), data)) {
                                return true;
                            }
                            if (i4 >= length) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    return false;
                }
                org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return stringComparison(key, jSONObject2, data);
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.MACARuleMatchingManager.class);
            }
        }
        return false;
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getMatchPropertyIDs(android.os.Bundle params) {
        java.lang.String optString;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.MACARuleMatchingManager.class)) {
            return null;
        }
        try {
            org.json.JSONArray jSONArray = MACARules;
            if (jSONArray == null) {
                return okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            java.lang.Integer valueOf = jSONArray == null ? null : java.lang.Integer.valueOf(jSONArray.length());
            if (valueOf != null && valueOf.intValue() == 0) {
                return okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            }
            org.json.JSONArray jSONArray2 = MACARules;
            if (jSONArray2 == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray2.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    java.lang.String optString2 = jSONArray2.optString(i);
                    if (optString2 != null) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(optString2);
                        long optLong = jSONObject.optLong("id");
                        if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && isMatchCCRule(optString, params)) {
                            arrayList.add(java.lang.Long.valueOf(optLong));
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            java.lang.String jSONArray3 = new org.json.JSONArray((java.util.Collection) arrayList).toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray3, "JSONArray(res).toString()");
            return jSONArray3;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.MACARuleMatchingManager.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void processParameters(android.os.Bundle params, java.lang.String event) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.MACARuleMatchingManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            if (!enabled || params == null) {
                return;
            }
            try {
                generateInfo(params, event);
                params.putString("_audiencePropertyIds", getMatchPropertyIDs(params));
                params.putString("cs_maca", "1");
                removeGeneratedInfo(params);
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.MACARuleMatchingManager.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:6:0x000d, B:10:0x0032, B:13:0x004b, B:16:0x0060, B:19:0x0076, B:22:0x0090, B:26:0x0044, B:29:0x002b), top: B:5:0x000d }] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void generateInfo(android.os.Bundle params, java.lang.String event) {
        java.lang.String language;
        java.util.Locale locale;
        java.lang.String country;
        java.lang.String versionName;
        java.lang.String str;
        java.lang.String versionName2;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.MACARuleMatchingManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
            params.putString(androidx.core.app.NotificationCompat.CATEGORY_EVENT, event);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Locale locale2 = com.facebook.internal.Utility.INSTANCE.getLocale();
            java.lang.String str2 = "";
            if (locale2 != null) {
                language = locale2.getLanguage();
                if (language == null) {
                }
                sb.append(language);
                sb.append('_');
                locale = com.facebook.internal.Utility.INSTANCE.getLocale();
                if (locale != null) {
                    country = locale.getCountry();
                    if (country != null) {
                    }
                    sb.append(country);
                    params.putString("_locale", sb.toString());
                    versionName = com.facebook.internal.Utility.INSTANCE.getVersionName();
                    if (versionName == null) {
                        versionName = "";
                    }
                    params.putString("_appVersion", versionName);
                    params.putString("_deviceOS", com.diamondlife.slots.vegas.free.BuildConfig.PLATFORM);
                    params.putString("_platform", "mobile");
                    str = android.os.Build.MODEL;
                    if (str == null) {
                        str = "";
                    }
                    params.putString("_deviceModel", str);
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                    params.putString("_nativeAppID", com.facebook.FacebookSdk.getApplicationId());
                    versionName2 = com.facebook.internal.Utility.INSTANCE.getVersionName();
                    if (versionName2 != null) {
                        str2 = versionName2;
                    }
                    params.putString("_nativeAppShortVersion", str2);
                    params.putString("_timezone", com.facebook.internal.Utility.INSTANCE.getDeviceTimeZoneName());
                    params.putString("_carrier", com.facebook.internal.Utility.INSTANCE.getCarrierName());
                    params.putString("_deviceOSTypeName", com.diamondlife.slots.vegas.free.BuildConfig.PLATFORM);
                    params.putString("_deviceOSVersion", android.os.Build.VERSION.RELEASE);
                    params.putLong("_remainingDiskGB", com.facebook.internal.Utility.INSTANCE.getAvailableExternalStorageGB());
                }
                country = "";
                sb.append(country);
                params.putString("_locale", sb.toString());
                versionName = com.facebook.internal.Utility.INSTANCE.getVersionName();
                if (versionName == null) {
                }
                params.putString("_appVersion", versionName);
                params.putString("_deviceOS", com.diamondlife.slots.vegas.free.BuildConfig.PLATFORM);
                params.putString("_platform", "mobile");
                str = android.os.Build.MODEL;
                if (str == null) {
                }
                params.putString("_deviceModel", str);
                com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
                params.putString("_nativeAppID", com.facebook.FacebookSdk.getApplicationId());
                versionName2 = com.facebook.internal.Utility.INSTANCE.getVersionName();
                if (versionName2 != null) {
                }
                params.putString("_nativeAppShortVersion", str2);
                params.putString("_timezone", com.facebook.internal.Utility.INSTANCE.getDeviceTimeZoneName());
                params.putString("_carrier", com.facebook.internal.Utility.INSTANCE.getCarrierName());
                params.putString("_deviceOSTypeName", com.diamondlife.slots.vegas.free.BuildConfig.PLATFORM);
                params.putString("_deviceOSVersion", android.os.Build.VERSION.RELEASE);
                params.putLong("_remainingDiskGB", com.facebook.internal.Utility.INSTANCE.getAvailableExternalStorageGB());
            }
            language = "";
            sb.append(language);
            sb.append('_');
            locale = com.facebook.internal.Utility.INSTANCE.getLocale();
            if (locale != null) {
            }
            country = "";
            sb.append(country);
            params.putString("_locale", sb.toString());
            versionName = com.facebook.internal.Utility.INSTANCE.getVersionName();
            if (versionName == null) {
            }
            params.putString("_appVersion", versionName);
            params.putString("_deviceOS", com.diamondlife.slots.vegas.free.BuildConfig.PLATFORM);
            params.putString("_platform", "mobile");
            str = android.os.Build.MODEL;
            if (str == null) {
            }
            params.putString("_deviceModel", str);
            com.facebook.FacebookSdk facebookSdk22 = com.facebook.FacebookSdk.INSTANCE;
            params.putString("_nativeAppID", com.facebook.FacebookSdk.getApplicationId());
            versionName2 = com.facebook.internal.Utility.INSTANCE.getVersionName();
            if (versionName2 != null) {
            }
            params.putString("_nativeAppShortVersion", str2);
            params.putString("_timezone", com.facebook.internal.Utility.INSTANCE.getDeviceTimeZoneName());
            params.putString("_carrier", com.facebook.internal.Utility.INSTANCE.getCarrierName());
            params.putString("_deviceOSTypeName", com.diamondlife.slots.vegas.free.BuildConfig.PLATFORM);
            params.putString("_deviceOSVersion", android.os.Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", com.facebook.internal.Utility.INSTANCE.getAvailableExternalStorageGB());
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.MACARuleMatchingManager.class);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void removeGeneratedInfo(android.os.Bundle params) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.integrity.MACARuleMatchingManager.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
            java.lang.String[] strArr = keys;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                java.lang.String str = strArr[i];
                i++;
                params.remove(str);
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.integrity.MACARuleMatchingManager.class);
        }
    }
}
