package com.google.firebase.crashlytics.internal.metadata;

/* loaded from: classes3.dex */
class KeysMap {
    private final java.util.Map<java.lang.String, java.lang.String> keys = new java.util.HashMap();
    private final int maxEntries;
    private final int maxEntryLength;

    public KeysMap(int i, int i2) {
        this.maxEntries = i;
        this.maxEntryLength = i2;
    }

    public synchronized java.util.Map<java.lang.String, java.lang.String> getKeys() {
        return java.util.Collections.unmodifiableMap(new java.util.HashMap(this.keys));
    }

    public synchronized boolean setKey(java.lang.String str, java.lang.String str2) {
        java.lang.String sanitizeKey = sanitizeKey(str);
        if (this.keys.size() >= this.maxEntries && !this.keys.containsKey(sanitizeKey)) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.maxEntries);
            return false;
        }
        java.lang.String sanitizeString = sanitizeString(str2, this.maxEntryLength);
        if (com.google.firebase.crashlytics.internal.common.CommonUtils.nullSafeEquals(this.keys.get(sanitizeKey), sanitizeString)) {
            return false;
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.keys;
        if (str2 == null) {
            sanitizeString = "";
        }
        map.put(sanitizeKey, sanitizeString);
        return true;
    }

    public synchronized void setKeys(java.util.Map<java.lang.String, java.lang.String> map) {
        int i = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String sanitizeKey = sanitizeKey(entry.getKey());
            if (this.keys.size() >= this.maxEntries && !this.keys.containsKey(sanitizeKey)) {
                i++;
            }
            java.lang.String value = entry.getValue();
            this.keys.put(sanitizeKey, value == null ? "" : sanitizeString(value, this.maxEntryLength));
        }
        if (i > 0) {
            com.google.firebase.crashlytics.internal.Logger.getLogger().w("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.maxEntries);
        }
    }

    private java.lang.String sanitizeKey(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Custom attribute key must not be null.");
        }
        return sanitizeString(str, this.maxEntryLength);
    }

    public static java.lang.String sanitizeString(java.lang.String str, int i) {
        if (str == null) {
            return str;
        }
        java.lang.String trim = str.trim();
        return trim.length() > i ? trim.substring(0, i) : trim;
    }
}
