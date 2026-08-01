package com.fyber.inneractive.sdk.cache;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f5210a;

    public o(Context context) {
        this.f5210a = context.getSharedPreferences("DtResponseHeaders", 0);
    }

    public final void a(HashMap hashMap) {
        SharedPreferences.Editor edit = this.f5210a.edit();
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            if (value == null) {
                edit.remove(str);
            } else if (value instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                edit.putInt(str, ((Integer) value).intValue());
            } else if (value instanceof Float) {
                edit.putFloat(str, ((Float) value).floatValue());
            } else if (value instanceof Long) {
                edit.putLong(str, ((Long) value).longValue());
            } else if (value instanceof String) {
                edit.putString(str, (String) value);
            } else if (value instanceof Set) {
                HashSet hashSet = new HashSet();
                for (Object obj : (Set) value) {
                    if (obj instanceof String) {
                        hashSet.add((String) obj);
                    }
                }
                edit.putStringSet(str, hashSet);
            } else {
                edit.putString(str, value.toString());
            }
        }
        edit.apply();
    }
}
