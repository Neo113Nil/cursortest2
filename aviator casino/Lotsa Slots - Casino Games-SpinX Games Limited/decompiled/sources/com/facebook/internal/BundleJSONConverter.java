package com.facebook.internal;

/* compiled from: BundleJSONConverter.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/BundleJSONConverter;", "", "()V", "SETTERS", "", "Ljava/lang/Class;", "Lcom/facebook/internal/BundleJSONConverter$Setter;", "convertToBundle", "Landroid/os/Bundle;", "jsonObject", "Lorg/json/JSONObject;", "convertToJSON", "bundle", "Setter", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class BundleJSONConverter {
    public static final com.facebook.internal.BundleJSONConverter INSTANCE = new com.facebook.internal.BundleJSONConverter();
    private static final java.util.Map<java.lang.Class<?>, com.facebook.internal.BundleJSONConverter.Setter> SETTERS;

    /* compiled from: BundleJSONConverter.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H&J \u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H&¨\u0006\f"}, d2 = {"Lcom/facebook/internal/BundleJSONConverter$Setter;", "", "setOnBundle", "", "bundle", "Landroid/os/Bundle;", com.ironsource.X3.i.W, "", "value", "setOnJSON", "json", "Lorg/json/JSONObject;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Setter {
        void setOnBundle(android.os.Bundle bundle, java.lang.String key, java.lang.Object value) throws org.json.JSONException;

        void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException;
    }

    private BundleJSONConverter() {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        SETTERS = hashMap;
        hashMap.put(java.lang.Boolean.class, new com.facebook.internal.BundleJSONConverter.Setter() { // from class: com.facebook.internal.BundleJSONConverter.1
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(android.os.Bundle bundle, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                bundle.putBoolean(key, ((java.lang.Boolean) value).booleanValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                json.put(key, value);
            }
        });
        hashMap.put(java.lang.Integer.class, new com.facebook.internal.BundleJSONConverter.Setter() { // from class: com.facebook.internal.BundleJSONConverter.2
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(android.os.Bundle bundle, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                bundle.putInt(key, ((java.lang.Integer) value).intValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                json.put(key, value);
            }
        });
        hashMap.put(java.lang.Long.class, new com.facebook.internal.BundleJSONConverter.Setter() { // from class: com.facebook.internal.BundleJSONConverter.3
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(android.os.Bundle bundle, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                bundle.putLong(key, ((java.lang.Long) value).longValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                json.put(key, value);
            }
        });
        hashMap.put(java.lang.Double.class, new com.facebook.internal.BundleJSONConverter.Setter() { // from class: com.facebook.internal.BundleJSONConverter.4
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(android.os.Bundle bundle, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                bundle.putDouble(key, ((java.lang.Double) value).doubleValue());
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                json.put(key, value);
            }
        });
        hashMap.put(java.lang.String.class, new com.facebook.internal.BundleJSONConverter.Setter() { // from class: com.facebook.internal.BundleJSONConverter.5
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(android.os.Bundle bundle, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                bundle.putString(key, (java.lang.String) value);
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                json.put(key, value);
            }
        });
        hashMap.put(java.lang.String[].class, new com.facebook.internal.BundleJSONConverter.Setter() { // from class: com.facebook.internal.BundleJSONConverter.6
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(android.os.Bundle bundle, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                throw new java.lang.IllegalArgumentException("Unexpected type from JSON");
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.lang.String[] strArr = (java.lang.String[]) value;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    java.lang.String str = strArr[i];
                    i++;
                    jSONArray.put(str);
                }
                json.put(key, jSONArray);
            }
        });
        hashMap.put(org.json.JSONArray.class, new com.facebook.internal.BundleJSONConverter.Setter() { // from class: com.facebook.internal.BundleJSONConverter.7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnBundle(android.os.Bundle bundle, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                org.json.JSONArray jSONArray = (org.json.JSONArray) value;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(key, arrayList);
                    return;
                }
                int length = jSONArray.length();
                if (length > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        java.lang.Object obj = jSONArray.get(i);
                        if (obj instanceof java.lang.String) {
                            arrayList.add(obj);
                            if (i2 >= length) {
                                break;
                            } else {
                                i = i2;
                            }
                        } else {
                            throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("Unexpected type in an array: ", obj.getClass()));
                        }
                    }
                }
                bundle.putStringArrayList(key, arrayList);
            }

            @Override // com.facebook.internal.BundleJSONConverter.Setter
            public void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                throw new java.lang.IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        });
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject convertToJSON(android.os.Bundle bundle) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.lang.String key : bundle.keySet()) {
            java.lang.Object obj = bundle.get(key);
            if (obj != null) {
                if (obj instanceof java.util.List) {
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    java.util.Iterator it = ((java.util.List) obj).iterator();
                    while (it.hasNext()) {
                        jSONArray.put((java.lang.String) it.next());
                    }
                    jSONObject.put(key, jSONArray);
                } else if (obj instanceof android.os.Bundle) {
                    jSONObject.put(key, convertToJSON((android.os.Bundle) obj));
                } else {
                    com.facebook.internal.BundleJSONConverter.Setter setter = SETTERS.get(obj.getClass());
                    if (setter == null) {
                        throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("Unsupported type: ", obj.getClass()));
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                    setter.setOnJSON(jSONObject, key, obj);
                }
            }
        }
        return jSONObject;
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle convertToBundle(org.json.JSONObject jsonObject) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator<java.lang.String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            java.lang.String key = keys.next();
            java.lang.Object value = jsonObject.get(key);
            if (value != org.json.JSONObject.NULL) {
                if (value instanceof org.json.JSONObject) {
                    bundle.putBundle(key, convertToBundle((org.json.JSONObject) value));
                } else {
                    com.facebook.internal.BundleJSONConverter.Setter setter = SETTERS.get(value.getClass());
                    if (setter == null) {
                        throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("Unsupported type: ", value.getClass()));
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
                    setter.setOnBundle(bundle, key, value);
                }
            }
        }
        return bundle;
    }
}
