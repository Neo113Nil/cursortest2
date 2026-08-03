package com.google.firebase.crashlytics.ndk;

/* loaded from: classes3.dex */
class SessionMetadataJsonSerializer {
    private SessionMetadataJsonSerializer() {
    }

    static java.lang.String serializeBeginSession(java.lang.String str, java.lang.String str2, long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("session_id", str);
        hashMap.put("generator", str2);
        hashMap.put("started_at_seconds", java.lang.Long.valueOf(j));
        return new org.json.JSONObject(hashMap).toString();
    }

    static java.lang.String serializeSessionApp(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.String str5, java.lang.String str6) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("app_identifier", str);
        hashMap.put("version_code", str2);
        hashMap.put("version_name", str3);
        hashMap.put("install_uuid", str4);
        hashMap.put("delivery_mechanism", java.lang.Integer.valueOf(i));
        hashMap.put("development_platform", emptyIfNull(str5));
        hashMap.put("development_platform_version", emptyIfNull(str6));
        return new org.json.JSONObject(hashMap).toString();
    }

    static java.lang.String serializeSessionOs(java.lang.String str, java.lang.String str2, boolean z) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("version", str);
        hashMap.put("build_version", str2);
        hashMap.put("is_rooted", java.lang.Boolean.valueOf(z));
        return new org.json.JSONObject(hashMap).toString();
    }

    static java.lang.String serializeSessionDevice(int i, java.lang.String str, int i2, long j, long j2, boolean z, int i3, java.lang.String str2, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("arch", java.lang.Integer.valueOf(i));
        hashMap.put("build_model", str);
        hashMap.put("available_processors", java.lang.Integer.valueOf(i2));
        hashMap.put("total_ram", java.lang.Long.valueOf(j));
        hashMap.put("disk_space", java.lang.Long.valueOf(j2));
        hashMap.put("is_emulator", java.lang.Boolean.valueOf(z));
        hashMap.put("state", java.lang.Integer.valueOf(i3));
        hashMap.put("build_manufacturer", str2);
        hashMap.put("build_product", str3);
        return new org.json.JSONObject(hashMap).toString();
    }

    private static java.lang.String emptyIfNull(java.lang.String str) {
        return str == null ? "" : str;
    }
}
