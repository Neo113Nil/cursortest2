package com.tiktok.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class TTKeyValueStore {
    private SharedPreferences preferences;

    public TTKeyValueStore(Context ctx) {
        this.preferences = null;
        try {
            this.preferences = ctx.getApplicationContext().getSharedPreferences(TTConst.TTSDK_KEY_VALUE_STORE, 0);
        } catch (Throwable unused) {
        }
    }

    public String get(String key) {
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences == null) {
            return "";
        }
        return sharedPreferences.getString(key, null);
    }

    public int getInt(String key) {
        return this.preferences.getInt(key, 0);
    }

    public void set(String key, Object value) {
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(key, value.toString()).apply();
    }

    public void set(HashMap<String, Object> data) {
        SharedPreferences sharedPreferences = this.preferences;
        if (sharedPreferences == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (Map.Entry<String, Object> entry : data.entrySet()) {
            edit.putString(entry.getKey(), entry.getValue().toString());
        }
        edit.apply();
    }
}
