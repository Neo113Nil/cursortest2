package com.facebook.share.internal;

/* compiled from: CameraEffectJSONUtility.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0007R2\u0010\u0003\u001a&\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/share/internal/CameraEffectJSONUtility;", "", "()V", "SETTERS", "Ljava/util/HashMap;", "Ljava/lang/Class;", "Lcom/facebook/share/internal/CameraEffectJSONUtility$Setter;", "Lkotlin/collections/HashMap;", "convertToCameraEffectArguments", "Lcom/facebook/share/model/CameraEffectArguments;", "jsonObject", "Lorg/json/JSONObject;", "convertToJSON", "arguments", "Setter", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CameraEffectJSONUtility {
    public static final com.facebook.share.internal.CameraEffectJSONUtility INSTANCE = new com.facebook.share.internal.CameraEffectJSONUtility();
    private static final java.util.HashMap<java.lang.Class<?>, com.facebook.share.internal.CameraEffectJSONUtility.Setter> SETTERS = kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to(java.lang.String.class, new com.facebook.share.internal.CameraEffectJSONUtility.Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$1
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(com.facebook.share.model.CameraEffectArguments.Builder builder, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            if (value == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            builder.putArgument(key, (java.lang.String) value);
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            json.put(key, value);
        }
    }), kotlin.TuplesKt.to(java.lang.String[].class, new com.facebook.share.internal.CameraEffectJSONUtility.Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$2
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(com.facebook.share.model.CameraEffectArguments.Builder builder, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            throw new java.lang.IllegalArgumentException("Unexpected type from JSON");
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (value != null) {
                java.lang.String[] strArr = (java.lang.String[]) value;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    java.lang.String str = strArr[i];
                    i++;
                    jSONArray.put(str);
                }
                json.put(key, jSONArray);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String?>");
        }
    }), kotlin.TuplesKt.to(org.json.JSONArray.class, new com.facebook.share.internal.CameraEffectJSONUtility.Setter() { // from class: com.facebook.share.internal.CameraEffectJSONUtility$SETTERS$3
        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnArgumentsBuilder(com.facebook.share.model.CameraEffectArguments.Builder builder, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            if (value != null) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) value;
                java.util.ArrayList arrayList = new java.util.ArrayList();
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
                java.lang.Object[] array = arrayList.toArray(new java.lang.String[0]);
                if (array != null) {
                    builder.putArgument(key, (java.lang.String[]) array);
                    return;
                }
                throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }

        @Override // com.facebook.share.internal.CameraEffectJSONUtility.Setter
        public void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "json");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            throw new java.lang.IllegalArgumentException("JSONArray's are not supported in bundles.");
        }
    }));

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CameraEffectJSONUtility.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&¨\u0006\f"}, d2 = {"Lcom/facebook/share/internal/CameraEffectJSONUtility$Setter;", "", "setOnArgumentsBuilder", "", "builder", "Lcom/facebook/share/model/CameraEffectArguments$Builder;", com.ironsource.X3.i.W, "", "value", "setOnJSON", "json", "Lorg/json/JSONObject;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    interface Setter {
        void setOnArgumentsBuilder(com.facebook.share.model.CameraEffectArguments.Builder builder, java.lang.String key, java.lang.Object value) throws org.json.JSONException;

        void setOnJSON(org.json.JSONObject json, java.lang.String key, java.lang.Object value) throws org.json.JSONException;
    }

    private CameraEffectJSONUtility() {
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject convertToJSON(com.facebook.share.model.CameraEffectArguments arguments) throws org.json.JSONException {
        if (arguments == null) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.lang.String str : arguments.keySet()) {
            java.lang.Object obj = arguments.get(str);
            if (obj != null) {
                com.facebook.share.internal.CameraEffectJSONUtility.Setter setter = SETTERS.get(obj.getClass());
                if (setter == null) {
                    throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("Unsupported type: ", obj.getClass()));
                }
                setter.setOnJSON(jSONObject, str, obj);
            }
        }
        return jSONObject;
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.share.model.CameraEffectArguments convertToCameraEffectArguments(org.json.JSONObject jsonObject) throws org.json.JSONException {
        if (jsonObject == null) {
            return null;
        }
        com.facebook.share.model.CameraEffectArguments.Builder builder = new com.facebook.share.model.CameraEffectArguments.Builder();
        java.util.Iterator<java.lang.String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            java.lang.String key = keys.next();
            java.lang.Object obj = jsonObject.get(key);
            if (obj != org.json.JSONObject.NULL) {
                com.facebook.share.internal.CameraEffectJSONUtility.Setter setter = SETTERS.get(obj.getClass());
                if (setter == null) {
                    throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("Unsupported type: ", obj.getClass()));
                }
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                setter.setOnArgumentsBuilder(builder, key, obj);
            }
        }
        return builder.build();
    }
}
