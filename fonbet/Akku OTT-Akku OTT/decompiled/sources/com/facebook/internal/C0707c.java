package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0707c {
    public static final HashMap a;

    /* renamed from: com.facebook.internal.c$a */
    public static final class a implements h {
        @Override // com.facebook.internal.C0707c.h
        public final void a(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putBoolean(key, ((Boolean) value).booleanValue());
        }
    }

    /* renamed from: com.facebook.internal.c$b */
    public static final class b implements h {
        @Override // com.facebook.internal.C0707c.h
        public final void a(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putInt(key, ((Integer) value).intValue());
        }
    }

    /* renamed from: com.facebook.internal.c$c, reason: collision with other inner class name */
    public static final class C0091c implements h {
        @Override // com.facebook.internal.C0707c.h
        public final void a(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putLong(key, ((Long) value).longValue());
        }
    }

    /* renamed from: com.facebook.internal.c$d */
    public static final class d implements h {
        @Override // com.facebook.internal.C0707c.h
        public final void a(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putDouble(key, ((Double) value).doubleValue());
        }
    }

    /* renamed from: com.facebook.internal.c$e */
    public static final class e implements h {
        @Override // com.facebook.internal.C0707c.h
        public final void a(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString(key, (String) value);
        }
    }

    /* renamed from: com.facebook.internal.c$f */
    public static final class f implements h {
        @Override // com.facebook.internal.C0707c.h
        public final void a(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* renamed from: com.facebook.internal.c$g */
    public static final class g implements h {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.C0707c.h
        public final void a(Bundle bundle, String key, Object value) throws JSONException {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            JSONArray jSONArray = (JSONArray) value;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(key, arrayList);
                return;
            }
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Unexpected type in an array: " + obj.getClass());
                }
                arrayList.add(obj);
            }
            bundle.putStringArrayList(key, arrayList);
        }
    }

    /* renamed from: com.facebook.internal.c$h */
    public interface h {
        void a(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Boolean.class, new a());
        hashMap.put(Integer.class, new b());
        hashMap.put(Long.class, new C0091c());
        hashMap.put(Double.class, new d());
        hashMap.put(String.class, new e());
        hashMap.put(String[].class, new f());
        hashMap.put(JSONArray.class, new g());
    }

    @JvmStatic
    public static final Bundle a(JSONObject jsonObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = jsonObject.get(key);
            if (value != JSONObject.NULL) {
                if (value instanceof JSONObject) {
                    bundle.putBundle(key, a((JSONObject) value));
                } else {
                    h hVar = (h) a.get(value.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException("Unsupported type: " + value.getClass());
                    }
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    hVar.a(bundle, key, value);
                }
            }
        }
        return bundle;
    }
}
