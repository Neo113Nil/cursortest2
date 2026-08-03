package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzbp {
    public static java.util.List zza(org.json.JSONArray jSONArray, java.util.List list) throws org.json.JSONException {
        if (list == null) {
            list = new java.util.ArrayList();
        }
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                list.add(jSONArray.getString(i));
            }
        }
        return list;
    }

    public static java.util.List zzb(android.util.JsonReader jsonReader) throws java.lang.IllegalStateException, java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static java.util.Map zzc(android.util.JsonReader jsonReader) throws java.io.IOException, java.lang.IllegalStateException {
        java.util.HashMap hashMap = new java.util.HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                hashMap2.put(jsonReader.nextName(), jsonReader.nextString());
            }
            jsonReader.endObject();
            hashMap.put(nextName, hashMap2);
        }
        jsonReader.endObject();
        return hashMap;
    }

    public static org.json.JSONObject zzd(android.util.JsonReader jsonReader) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            android.util.JsonToken peek = jsonReader.peek();
            if (android.util.JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONObject.put(nextName, zze(jsonReader));
            } else if (android.util.JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONObject.put(nextName, zzd(jsonReader));
            } else if (android.util.JsonToken.BOOLEAN.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextBoolean());
            } else if (android.util.JsonToken.NUMBER.equals(peek)) {
                jSONObject.put(nextName, jsonReader.nextDouble());
            } else {
                if (!android.util.JsonToken.STRING.equals(peek)) {
                    java.lang.String valueOf = java.lang.String.valueOf(peek);
                    java.lang.String.valueOf(valueOf);
                    throw new java.lang.IllegalStateException("unexpected json token: ".concat(java.lang.String.valueOf(valueOf)));
                }
                jSONObject.put(nextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static org.json.JSONArray zze(android.util.JsonReader jsonReader) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            android.util.JsonToken peek = jsonReader.peek();
            if (android.util.JsonToken.BEGIN_ARRAY.equals(peek)) {
                jSONArray.put(zze(jsonReader));
            } else if (android.util.JsonToken.BEGIN_OBJECT.equals(peek)) {
                jSONArray.put(zzd(jsonReader));
            } else if (android.util.JsonToken.BOOLEAN.equals(peek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (android.util.JsonToken.NUMBER.equals(peek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!android.util.JsonToken.STRING.equals(peek)) {
                    java.lang.String valueOf = java.lang.String.valueOf(peek);
                    java.lang.String.valueOf(valueOf);
                    throw new java.lang.IllegalStateException("unexpected json token: ".concat(java.lang.String.valueOf(valueOf)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static void zzf(android.util.JsonWriter jsonWriter, org.json.JSONObject jSONObject) throws java.io.IOException {
        try {
            jsonWriter.beginObject();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = jSONObject.get(next);
                if (obj instanceof java.lang.String) {
                    jsonWriter.name(next).value((java.lang.String) obj);
                } else if (obj instanceof java.lang.Number) {
                    jsonWriter.name(next).value((java.lang.Number) obj);
                } else if (obj instanceof java.lang.Boolean) {
                    jsonWriter.name(next).value(((java.lang.Boolean) obj).booleanValue());
                } else if (obj instanceof org.json.JSONObject) {
                    zzf(jsonWriter.name(next), (org.json.JSONObject) obj);
                } else {
                    if (!(obj instanceof org.json.JSONArray)) {
                        java.lang.String valueOf = java.lang.String.valueOf(obj);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new org.json.JSONException(sb.toString());
                    }
                    zzg(jsonWriter.name(next), (org.json.JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (org.json.JSONException e) {
            throw new java.io.IOException(e);
        }
    }

    public static void zzg(android.util.JsonWriter jsonWriter, org.json.JSONArray jSONArray) throws java.io.IOException {
        try {
            jsonWriter.beginArray();
            for (int i = 0; i < jSONArray.length(); i++) {
                java.lang.Object obj = jSONArray.get(i);
                if (obj instanceof java.lang.String) {
                    jsonWriter.value((java.lang.String) obj);
                } else if (obj instanceof java.lang.Number) {
                    jsonWriter.value((java.lang.Number) obj);
                } else if (obj instanceof java.lang.Boolean) {
                    jsonWriter.value(((java.lang.Boolean) obj).booleanValue());
                } else if (obj instanceof org.json.JSONObject) {
                    zzf(jsonWriter, (org.json.JSONObject) obj);
                } else {
                    if (!(obj instanceof org.json.JSONArray)) {
                        java.lang.String valueOf = java.lang.String.valueOf(obj);
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 23);
                        sb.append("unable to write field: ");
                        sb.append(valueOf);
                        throw new org.json.JSONException(sb.toString());
                    }
                    zzg(jsonWriter, (org.json.JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (org.json.JSONException e) {
            throw new java.io.IOException(e);
        }
    }

    public static org.json.JSONObject zzh(org.json.JSONObject jSONObject, java.lang.String str) throws org.json.JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (org.json.JSONException unused) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static org.json.JSONObject zzi(org.json.JSONObject jSONObject, java.lang.String... strArr) {
        org.json.JSONObject zzo = zzo(jSONObject, strArr);
        if (zzo == null) {
            return null;
        }
        return zzo.optJSONObject(strArr[1]);
    }

    public static boolean zzj(boolean z, org.json.JSONObject jSONObject, java.lang.String... strArr) {
        org.json.JSONObject zzo = zzo(jSONObject, strArr);
        if (zzo == null) {
            return false;
        }
        return zzo.optBoolean(strArr[strArr.length - 1], false);
    }

    public static java.lang.String zzk(java.lang.String str, org.json.JSONObject jSONObject, java.lang.String... strArr) {
        org.json.JSONObject zzo = zzo(jSONObject, strArr);
        return zzo == null ? "" : zzo.optString(strArr[0], "");
    }

    public static android.os.Bundle zzl(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        android.os.Bundle bundle = new android.os.Bundle();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.Object opt = jSONObject.opt(next);
            if (opt != null) {
                if (opt instanceof java.lang.Boolean) {
                    bundle.putBoolean(next, ((java.lang.Boolean) opt).booleanValue());
                } else if (opt instanceof java.lang.Double) {
                    bundle.putDouble(next, ((java.lang.Double) opt).doubleValue());
                } else if (opt instanceof java.lang.Integer) {
                    bundle.putInt(next, ((java.lang.Integer) opt).intValue());
                } else if (opt instanceof java.lang.Long) {
                    bundle.putLong(next, ((java.lang.Long) opt).longValue());
                } else if (opt instanceof java.lang.String) {
                    bundle.putString(next, (java.lang.String) opt);
                } else if (opt instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArray = (org.json.JSONArray) opt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i = 0;
                        java.lang.Object obj = null;
                        for (int i2 = 0; obj == null && i2 < length; i2++) {
                            obj = !jSONArray.isNull(i2) ? jSONArray.opt(i2) : null;
                        }
                        if (obj == null) {
                            java.lang.String.valueOf(next);
                            java.lang.String valueOf = java.lang.String.valueOf(next);
                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Expected JSONArray with at least 1 non-null element for key:".concat(valueOf));
                        } else if (obj instanceof org.json.JSONObject) {
                            android.os.Bundle[] bundleArr = new android.os.Bundle[length];
                            while (i < length) {
                                bundleArr[i] = !jSONArray.isNull(i) ? zzl(jSONArray.optJSONObject(i)) : null;
                                i++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (obj instanceof java.lang.Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i < length) {
                                dArr[i] = jSONArray.optDouble(i);
                                i++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (obj instanceof java.lang.CharSequence) {
                            java.lang.String[] strArr = new java.lang.String[length];
                            while (i < length) {
                                strArr[i] = !jSONArray.isNull(i) ? jSONArray.optString(i) : null;
                                i++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (obj instanceof java.lang.Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i < length) {
                                zArr[i] = jSONArray.optBoolean(i);
                                i++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            java.lang.String format = java.lang.String.format("JSONArray with unsupported type %s for key:%s", obj.getClass().getCanonicalName(), next);
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(format);
                        }
                    }
                } else if (opt instanceof org.json.JSONObject) {
                    bundle.putBundle(next, zzl((org.json.JSONObject) opt));
                } else {
                    java.lang.String.valueOf(next);
                    java.lang.String valueOf2 = java.lang.String.valueOf(next);
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unsupported type for key:".concat(valueOf2));
                }
            }
        }
        return bundle;
    }

    public static java.lang.String zzm(com.google.android.gms.internal.ads.zzfkk zzfkkVar) {
        if (zzfkkVar == null) {
            return null;
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            android.util.JsonWriter jsonWriter = new android.util.JsonWriter(stringWriter);
            zzn(jsonWriter, zzfkkVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (java.io.IOException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error when writing JSON.", e);
            return null;
        }
    }

    private static void zzn(android.util.JsonWriter jsonWriter, java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof java.lang.Number) {
            jsonWriter.value((java.lang.Number) obj);
            return;
        }
        if (obj instanceof java.lang.Boolean) {
            jsonWriter.value(((java.lang.Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof java.lang.String) {
            jsonWriter.value((java.lang.String) obj);
            return;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzfkk) {
            zzf(jsonWriter, ((com.google.android.gms.internal.ads.zzfkk) obj).zzd);
            return;
        }
        if (!(obj instanceof java.util.Map)) {
            if (!(obj instanceof java.util.List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                zzn(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (java.util.Map.Entry entry : ((java.util.Map) obj).entrySet()) {
            java.lang.Object key = entry.getKey();
            if (key instanceof java.lang.String) {
                zzn(jsonWriter.name((java.lang.String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    private static org.json.JSONObject zzo(org.json.JSONObject jSONObject, java.lang.String[] strArr) {
        for (int i = 0; i < strArr.length - 1; i = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }
}
