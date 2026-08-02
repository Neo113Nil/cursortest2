package com.google.android.gms.internal.firebase_database;

import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzkd {
    private final String zzug;
    private final Map<String, Object> zzuh;

    private zzkd(String str, Map<String, Object> map) {
        this.zzug = str;
        this.zzuh = map;
    }

    public static zzkd zzu(String str) {
        if (!str.startsWith("gauth|")) {
            return null;
        }
        try {
            Map<String, Object> zzv = zzke.zzv(str.substring(6));
            return new zzkd((String) zzv.get("token"), (Map) zzv.get("auth"));
        } catch (IOException e) {
            throw new RuntimeException("Failed to parse gauth token", e);
        }
    }

    public final String getToken() {
        return this.zzug;
    }

    public final Map<String, Object> zzgu() {
        return this.zzuh;
    }
}
