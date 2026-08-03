package com.helpshift.util;

/* loaded from: classes5.dex */
public class Utils {
    public static final int FALLBACK_ACTIVE_REMOTE_FETCH_INTERVAL = 60000;
    public static final int FALLBACK_BASE_POLLING_INTERVAL = 5000;
    public static final int FALLBACK_MAX_POLLING_INTERVAL = 60000;
    public static final int FALLBACK_PASSIVE_REMOTE_FETCH_INTERVAL = 300000;
    public static final java.lang.String ORIGIN_LOGIN_WITH_ANONYMOUS_USER = "sdkx_login_with_anonymous_user";
    public static final java.lang.String ORIGIN_LOGIN_WITH_USER = "sdkx_login_with_user";
    public static final java.lang.String ORIGIN_POLLER = "sdkx_polling";
    public static final java.lang.String ORIGIN_REGISTER_PUSH_TOKEN = "sdkx_register_push_token";
    public static final java.lang.String ORIGIN_REQUEST_UNREAD_COUNT = "sdkx_request_unread_message_count";
    public static final java.lang.String SDK_WILL_RESPECT_PREVIOUSLY_LOGGED_IN_USER = ". SDK will respect previously logged in user.";
    private static final java.lang.String TAG = "Utils";
    public static final long TIME_24HRS_MILLIS = 86400000;
    public static final long TIME_7DAYS_MILLIS = 604800000;
    private static java.util.concurrent.ScheduledExecutorService scheduledExecutorService;

    public static void setScheduledExecutorService(java.util.concurrent.ScheduledExecutorService scheduledExecutorService2) {
        scheduledExecutorService = scheduledExecutorService2;
    }

    public static java.lang.String generateRandomString(int i) {
        if (i <= 0) {
            return "";
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        return i > uuid.length() ? uuid : uuid.substring(0, i);
    }

    public static <K, V> V getOrDefault(java.util.Map<K, V> map, K k, V v) {
        V v2;
        return (isEmpty(map) || (v2 = map.get(k)) == null) ? v : v2;
    }

    public static boolean isNotEmpty(java.lang.String str) {
        return !isEmpty(str);
    }

    public static boolean isEmpty(java.lang.String str) {
        return str == null || str.trim().length() == 0;
    }

    public static <K, V> boolean isNotEmpty(java.util.Map<K, V> map) {
        return !isEmpty(map);
    }

    public static <K, V> boolean isEmpty(java.util.Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    public static <T> boolean isEmpty(java.util.List<T> list) {
        return list == null || list.size() == 0;
    }

    public static <T> boolean isEmpty(java.util.Set<T> set) {
        return set == null || set.size() == 0;
    }

    public static <T> boolean isNotEmpty(java.util.List<T> list) {
        return !isEmpty(list);
    }

    public static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static java.lang.String join(java.lang.CharSequence charSequence, java.lang.Iterable<java.lang.String> iterable) {
        if (iterable == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = true;
        for (java.lang.String str : iterable) {
            if (z) {
                z = false;
            } else {
                sb.append(charSequence);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static boolean isToday(long j) {
        return j / 86400000 == java.lang.System.currentTimeMillis() / 86400000;
    }

    public static boolean isInvalidUserId(java.lang.String str) {
        java.lang.String trim = isEmpty(str) ? "" : str.trim();
        return isEmpty(trim) || kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL.equalsIgnoreCase(trim) || com.google.android.gms.ads.AdError.UNDEFINED_DOMAIN.equalsIgnoreCase(trim) || "unknown".equalsIgnoreCase(trim) || "nil".equalsIgnoreCase(trim);
    }

    public static boolean checkValidEmail(java.lang.String str) {
        if (isEmpty(str)) {
            return false;
        }
        int lastIndexOf = str.lastIndexOf(64);
        int lastIndexOf2 = str.lastIndexOf(46);
        return (lastIndexOf == -1 || lastIndexOf2 == -1 || lastIndexOf2 <= lastIndexOf + 1) ? false : true;
    }

    public static void removeEmptyKeyValues(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            if (isEmpty(entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            map.remove((java.lang.String) it.next());
        }
    }

    public static <K, V> void removeNullValues(java.util.Map<K, V> map) {
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                if (entry.getValue() == null) {
                    arrayList.add(entry.getKey());
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                map.remove(it.next());
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in removing null values", e);
        }
    }

    public static void removeEmptyValues(java.util.Collection<java.lang.String> collection) {
        try {
            java.util.Iterator<java.lang.String> it = collection.iterator();
            while (it.hasNext()) {
                if (isEmpty(it.next())) {
                    it.remove();
                }
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error removing empty items from collection", e);
        }
    }

    public static boolean validateUserIdEmailForLogin(java.lang.String str, java.lang.String str2) {
        if (isEmpty(str) && isEmpty(str2)) {
            com.helpshift.log.HSLogger.e(TAG, "Error logging in the user: userId and userEmail both are empty. userId: " + str + " userEmail: " + str2 + SDK_WILL_RESPECT_PREVIOUSLY_LOGGED_IN_USER);
            return false;
        }
        if (isNotEmpty(str) && isInvalidUserId(str)) {
            com.helpshift.log.HSLogger.e(TAG, "Invalid userId: " + str + SDK_WILL_RESPECT_PREVIOUSLY_LOGGED_IN_USER);
            return false;
        }
        if (!isNotEmpty(str2) || checkValidEmail(str2)) {
            return true;
        }
        com.helpshift.log.HSLogger.e(TAG, "Invalid user email: " + str2 + SDK_WILL_RESPECT_PREVIOUSLY_LOGGED_IN_USER);
        return false;
    }

    public static java.lang.String prettyFormatHashMap(java.util.Map<java.lang.String, java.lang.Object> map, int i) {
        if (isEmpty(map)) {
            return "{}";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.lang.String indentation = getIndentation(i);
            sb.append(indentation);
            sb.append("{\n");
            int size = map.entrySet().size();
            int i2 = 0;
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                sb.append(indentation);
                sb.append("  \"");
                sb.append(key);
                sb.append("\": ");
                sb.append(formatValue(value, i + 1));
                i2++;
                if (i2 < size) {
                    sb.append(",");
                }
                sb.append("\n");
            }
            sb.append(indentation);
            sb.append("}");
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in formatting hashmap", e);
        }
        return sb.toString();
    }

    private static java.lang.String formatValue(java.lang.Object obj, int i) {
        if (obj == null) {
            return "null (Type: null)";
        }
        if (obj instanceof java.util.Map) {
            return "(Type: Map)" + prettyFormatHashMap((java.util.Map) obj, i);
        }
        if (obj instanceof java.util.List) {
            return "(Type: List) " + prettyFormatList((java.util.List) obj, i);
        }
        if (obj instanceof java.lang.String) {
            return "\"" + obj + "\" (Type: String)";
        }
        return obj + " (Type: " + obj.getClass().getSimpleName() + ")";
    }

    private static java.lang.String prettyFormatList(java.util.List<java.lang.Object> list, int i) {
        if (list.isEmpty()) {
            return okhttp3.HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[\n");
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (i2 > 0) {
                sb.append(",\n");
            }
            java.lang.String formatValue = formatValue(list.get(i2), i);
            sb.append(getIndentation(i));
            sb.append("  ");
            sb.append(formatValue);
        }
        sb.append("\n");
        sb.append(getIndentation(i - 1));
        sb.append(com.ironsource.X3.j.e);
        return sb.toString();
    }

    private static java.lang.String getIndentation(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        return sb.toString();
    }

    public static java.lang.String getMaskedString(java.lang.String str) {
        if (str == null) {
            return "**null**";
        }
        int length = str.length();
        int ceil = (int) java.lang.Math.ceil(length * 0.25d);
        return str.substring(0, ceil) + "**" + length + "**" + str.substring(length - ceil, length);
    }

    public static java.lang.String getSHAHash(java.lang.String str) {
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA-256").digest(str.getBytes("UTF-8"));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (byte b : digest) {
                sb.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in getting SHA hash", e);
            return "";
        }
    }

    public static java.lang.String getSignatureFromJwtToken(java.lang.String str) {
        if (str == null) {
            return "";
        }
        java.lang.String[] split = str.split("\\.");
        if (split.length != 3) {
            return "";
        }
        return split[2];
    }

    public static java.lang.String getPayloadFromJwtToken(java.lang.String str) {
        if (isEmpty(str)) {
            return "";
        }
        java.lang.String[] split = str.split("\\.");
        return split.length != 3 ? "" : split[1];
    }

    public static boolean isJWTValid(java.lang.String str, com.helpshift.platform.Device device) {
        if (isEmpty(str)) {
            return false;
        }
        java.lang.String[] split = str.split("\\.");
        return split.length == 3 && !isEmpty(device.decodeBase64(split[1]));
    }

    public static org.json.JSONObject getJsonObjectFromJwt(com.helpshift.platform.Device device, java.lang.String str) {
        try {
            return new org.json.JSONObject(device.decodeBase64(getPayloadFromJwtToken(str)));
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in decoding JWT", e);
            return null;
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> getStringMapFromObjectMap(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : map.entrySet()) {
                java.lang.String key = entry.getKey();
                java.lang.Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof java.util.List) {
                        value = new org.json.JSONArray((java.util.Collection) value);
                    }
                    if (value instanceof java.util.Map) {
                        value = new org.json.JSONObject((java.util.Map) value);
                    }
                    hashMap.put(key, java.lang.String.valueOf(value));
                }
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in converting object map to string map", e);
        }
        return hashMap;
    }

    public static void executeWithDelay(java.lang.Runnable runnable, long j) {
        try {
            scheduledExecutorService.schedule(runnable, j, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error scheduling task with delay", e);
            runnable.run();
        }
    }

    public static <K, V> java.util.Map<K, V> getDeepCopy(java.util.Map<K, V> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (map == null) {
            return hashMap;
        }
        try {
            for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                K key = entry.getKey();
                V value = entry.getValue();
                if (value instanceof java.util.Map) {
                    hashMap.put(key, new java.util.HashMap((java.util.Map) value));
                } else if (value instanceof java.util.List) {
                    hashMap.put(key, new java.util.ArrayList((java.util.List) value));
                } else {
                    hashMap.put(key, value);
                }
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error in copying map", e);
        }
        return hashMap;
    }

    public static java.lang.String generateURLStorageKey(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("_");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        return sb.toString().replaceAll("[^a-zA-Z0-9]", "_");
    }

    public static java.lang.String getResourceCacheDirPath(java.lang.String str, java.lang.String str2) {
        return str + java.io.File.separator + "helpshift" + java.io.File.separator + "resource_cache" + java.io.File.separator + str2;
    }

    public static boolean matchUserForNotification(com.helpshift.user.BaseUser baseUser, com.helpshift.platform.Device device, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error matching user", e);
        }
        if (baseUser.isIdentityUser()) {
            java.lang.String accessToken = ((com.helpshift.user.UserWithIdentity) baseUser).getAccessToken();
            if (!isEmpty(accessToken) && !isEmpty(str)) {
                return str.equals(new org.json.JSONObject(device.decodeBase64(accessToken.split("\\.")[1])).optString("a", ""));
            }
            return false;
        }
        java.util.Map<java.lang.String, java.lang.String> userLoginInfo = baseUser.getUserLoginInfo();
        java.lang.String str4 = userLoginInfo.get("userId");
        java.lang.String str5 = userLoginInfo.get("userEmail");
        if (isNotEmpty(str4) && str4.equals(str2)) {
            return true;
        }
        return isNotEmpty(str5) && str5.equals(str3);
    }

    public static java.lang.String decompressZlib(byte[] bArr) {
        java.util.zip.Inflater inflater;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                inflater = new java.util.zip.Inflater();
                inflater.setInput(bArr);
                byteArrayOutputStream = new java.io.ByteArrayOutputStream(bArr.length);
            } catch (java.lang.Throwable th) {
                th = th;
            }
        } catch (java.lang.Exception e) {
            e = e;
        }
        try {
            byte[] bArr2 = new byte[1024];
            while (!inflater.finished()) {
                int inflate = inflater.inflate(bArr2);
                byteArrayOutputStream.write(bArr2, 0, inflate);
                if (inflate == 0 && inflater.needsInput()) {
                    break;
                }
            }
            inflater.end();
            java.lang.String byteArrayOutputStream3 = byteArrayOutputStream.toString("UTF-8");
            closeQuietly(byteArrayOutputStream);
            return byteArrayOutputStream3;
        } catch (java.lang.Exception e2) {
            e = e2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            com.helpshift.log.HSLogger.e(TAG, "Error decompressing zlib payload: ", e);
            closeQuietly(byteArrayOutputStream2);
            return "";
        } catch (java.lang.Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            closeQuietly(byteArrayOutputStream2);
            throw th;
        }
    }

    private Utils() {
    }
}
