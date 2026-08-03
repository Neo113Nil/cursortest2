package com.facebook;

/* compiled from: LegacyTokenHelper.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/facebook/LegacyTokenHelper;", "", "context", "Landroid/content/Context;", "cacheKey", "", "(Landroid/content/Context;Ljava/lang/String;)V", "cache", "Landroid/content/SharedPreferences;", "clear", "", "deserializeKey", com.ironsource.X3.i.W, "bundle", "Landroid/os/Bundle;", "load", "save", "serializeKey", "editor", "Landroid/content/SharedPreferences$Editor;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class LegacyTokenHelper {
    public static final java.lang.String APPLICATION_ID_KEY = "com.facebook.TokenCachingStrategy.ApplicationId";
    public static final java.lang.String DECLINED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.DeclinedPermissions";
    public static final java.lang.String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
    public static final java.lang.String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";
    public static final java.lang.String EXPIRED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.ExpiredPermissions";
    private static final long INVALID_BUNDLE_MILLISECONDS = Long.MIN_VALUE;
    private static final java.lang.String IS_SSO_KEY = "com.facebook.TokenCachingStrategy.IsSSO";
    private static final java.lang.String JSON_VALUE = "value";
    private static final java.lang.String JSON_VALUE_ENUM_TYPE = "enumType";
    private static final java.lang.String JSON_VALUE_TYPE = "valueType";
    public static final java.lang.String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";
    public static final java.lang.String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";
    public static final java.lang.String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";
    public static final java.lang.String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";
    private static final java.lang.String TYPE_BOOLEAN = "bool";
    private static final java.lang.String TYPE_BOOLEAN_ARRAY = "bool[]";
    private static final java.lang.String TYPE_BYTE = "byte";
    private static final java.lang.String TYPE_BYTE_ARRAY = "byte[]";
    private static final java.lang.String TYPE_CHAR = "char";
    private static final java.lang.String TYPE_CHAR_ARRAY = "char[]";
    private static final java.lang.String TYPE_DOUBLE = "double";
    private static final java.lang.String TYPE_DOUBLE_ARRAY = "double[]";
    private static final java.lang.String TYPE_ENUM = "enum";
    private static final java.lang.String TYPE_FLOAT = "float";
    private static final java.lang.String TYPE_FLOAT_ARRAY = "float[]";
    private static final java.lang.String TYPE_INTEGER = "int";
    private static final java.lang.String TYPE_INTEGER_ARRAY = "int[]";
    private static final java.lang.String TYPE_LONG = "long";
    private static final java.lang.String TYPE_LONG_ARRAY = "long[]";
    private static final java.lang.String TYPE_SHORT = "short";
    private static final java.lang.String TYPE_SHORT_ARRAY = "short[]";
    private static final java.lang.String TYPE_STRING = "string";
    private static final java.lang.String TYPE_STRING_LIST = "stringList";
    private final android.content.SharedPreferences cache;
    private final java.lang.String cacheKey;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.LegacyTokenHelper.Companion INSTANCE = new com.facebook.LegacyTokenHelper.Companion(null);
    private static final java.lang.String TAG = "LegacyTokenHelper";

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LegacyTokenHelper(android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getApplicationId(android.os.Bundle bundle) {
        return INSTANCE.getApplicationId(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Date getExpirationDate(android.os.Bundle bundle) {
        return INSTANCE.getExpirationDate(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final long getExpirationMilliseconds(android.os.Bundle bundle) {
        return INSTANCE.getExpirationMilliseconds(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Date getLastRefreshDate(android.os.Bundle bundle) {
        return INSTANCE.getLastRefreshDate(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final long getLastRefreshMilliseconds(android.os.Bundle bundle) {
        return INSTANCE.getLastRefreshMilliseconds(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<java.lang.String> getPermissions(android.os.Bundle bundle) {
        return INSTANCE.getPermissions(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.AccessTokenSource getSource(android.os.Bundle bundle) {
        return INSTANCE.getSource(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getToken(android.os.Bundle bundle) {
        return INSTANCE.getToken(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final boolean hasTokenInformation(android.os.Bundle bundle) {
        return INSTANCE.hasTokenInformation(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final void putApplicationId(android.os.Bundle bundle, java.lang.String str) {
        INSTANCE.putApplicationId(bundle, str);
    }

    @kotlin.jvm.JvmStatic
    public static final void putDeclinedPermissions(android.os.Bundle bundle, java.util.Collection<java.lang.String> collection) {
        INSTANCE.putDeclinedPermissions(bundle, collection);
    }

    @kotlin.jvm.JvmStatic
    public static final void putExpirationDate(android.os.Bundle bundle, java.util.Date date) {
        INSTANCE.putExpirationDate(bundle, date);
    }

    @kotlin.jvm.JvmStatic
    public static final void putExpirationMilliseconds(android.os.Bundle bundle, long j) {
        INSTANCE.putExpirationMilliseconds(bundle, j);
    }

    @kotlin.jvm.JvmStatic
    public static final void putExpiredPermissions(android.os.Bundle bundle, java.util.Collection<java.lang.String> collection) {
        INSTANCE.putExpiredPermissions(bundle, collection);
    }

    @kotlin.jvm.JvmStatic
    public static final void putLastRefreshDate(android.os.Bundle bundle, java.util.Date date) {
        INSTANCE.putLastRefreshDate(bundle, date);
    }

    @kotlin.jvm.JvmStatic
    public static final void putLastRefreshMilliseconds(android.os.Bundle bundle, long j) {
        INSTANCE.putLastRefreshMilliseconds(bundle, j);
    }

    @kotlin.jvm.JvmStatic
    public static final void putPermissions(android.os.Bundle bundle, java.util.Collection<java.lang.String> collection) {
        INSTANCE.putPermissions(bundle, collection);
    }

    @kotlin.jvm.JvmStatic
    public static final void putSource(android.os.Bundle bundle, com.facebook.AccessTokenSource accessTokenSource) {
        INSTANCE.putSource(bundle, accessTokenSource);
    }

    @kotlin.jvm.JvmStatic
    public static final void putToken(android.os.Bundle bundle, java.lang.String str) {
        INSTANCE.putToken(bundle, str);
    }

    public LegacyTokenHelper(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        str = (str == null || str.length() == 0) ? DEFAULT_CACHE_KEY : str;
        this.cacheKey = str;
        android.content.Context applicationContext = context.getApplicationContext();
        android.content.SharedPreferences sharedPreferences = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPreferences(this.cacheKey, Context.MODE_PRIVATE)");
        this.cache = sharedPreferences;
    }

    public /* synthetic */ LegacyTokenHelper(android.content.Context context, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str);
    }

    public final android.os.Bundle load() {
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String key : this.cache.getAll().keySet()) {
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                deserializeKey(key, bundle);
            } catch (org.json.JSONException e) {
                com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.CACHE;
                java.lang.String TAG2 = TAG;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.log(loggingBehavior, 5, TAG2, "Error reading cached value for key: '" + ((java.lang.Object) key) + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public final void save(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        android.content.SharedPreferences.Editor editor = this.cache.edit();
        for (java.lang.String key : bundle.keySet()) {
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(editor, "editor");
                serializeKey(key, bundle, editor);
            } catch (org.json.JSONException e) {
                com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.CACHE;
                java.lang.String TAG2 = TAG;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                companion.log(loggingBehavior, 5, TAG2, "Error processing value for key: '" + ((java.lang.Object) key) + "' -- " + e);
                return;
            }
        }
        editor.apply();
    }

    public final void clear() {
        this.cache.edit().clear().apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void serializeKey(java.lang.String key, android.os.Bundle bundle, android.content.SharedPreferences.Editor editor) throws org.json.JSONException {
        org.json.JSONArray jSONArray;
        java.lang.String str;
        java.lang.Object obj = bundle.get(key);
        if (obj == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str2 = null;
        if (obj instanceof java.lang.Byte) {
            jSONObject.put("value", (int) ((java.lang.Number) obj).byteValue());
            str = TYPE_BYTE;
        } else if (obj instanceof java.lang.Short) {
            jSONObject.put("value", (int) ((java.lang.Number) obj).shortValue());
            str = TYPE_SHORT;
        } else if (obj instanceof java.lang.Integer) {
            jSONObject.put("value", ((java.lang.Number) obj).intValue());
            str = TYPE_INTEGER;
        } else if (obj instanceof java.lang.Long) {
            jSONObject.put("value", ((java.lang.Number) obj).longValue());
            str = "long";
        } else if (obj instanceof java.lang.Float) {
            jSONObject.put("value", ((java.lang.Number) obj).floatValue());
            str = TYPE_FLOAT;
        } else if (obj instanceof java.lang.Double) {
            jSONObject.put("value", ((java.lang.Number) obj).doubleValue());
            str = TYPE_DOUBLE;
        } else if (obj instanceof java.lang.Boolean) {
            jSONObject.put("value", ((java.lang.Boolean) obj).booleanValue());
            str = TYPE_BOOLEAN;
        } else if (obj instanceof java.lang.Character) {
            jSONObject.put("value", obj.toString());
            str = TYPE_CHAR;
        } else if (obj instanceof java.lang.String) {
            jSONObject.put("value", obj);
            str = TYPE_STRING;
        } else if (obj instanceof java.lang.Enum) {
            jSONObject.put("value", obj.toString());
            jSONObject.put(JSON_VALUE_ENUM_TYPE, obj.getClass().getName());
            str = TYPE_ENUM;
        } else {
            jSONArray = new org.json.JSONArray();
            int i = 0;
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                while (i < length) {
                    byte b = bArr[i];
                    i++;
                    jSONArray.put((int) b);
                }
                str2 = TYPE_BYTE_ARRAY;
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length;
                while (i < length2) {
                    short s = sArr[i];
                    i++;
                    jSONArray.put((int) s);
                }
                str2 = TYPE_SHORT_ARRAY;
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length;
                while (i < length3) {
                    int i2 = iArr[i];
                    i++;
                    jSONArray.put(i2);
                }
                str2 = TYPE_INTEGER_ARRAY;
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length4 = jArr.length;
                while (i < length4) {
                    long j = jArr[i];
                    i++;
                    jSONArray.put(j);
                }
                str2 = TYPE_LONG_ARRAY;
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                int length5 = fArr.length;
                while (i < length5) {
                    float f = fArr[i];
                    i++;
                    jSONArray.put(f);
                }
                str2 = TYPE_FLOAT_ARRAY;
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length6 = dArr.length;
                while (i < length6) {
                    double d = dArr[i];
                    i++;
                    jSONArray.put(d);
                }
                str2 = TYPE_DOUBLE_ARRAY;
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length7 = zArr.length;
                while (i < length7) {
                    boolean z = zArr[i];
                    i++;
                    jSONArray.put(z);
                }
                str2 = TYPE_BOOLEAN_ARRAY;
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                int length8 = cArr.length;
                while (i < length8) {
                    char c = cArr[i];
                    i++;
                    jSONArray.put(java.lang.String.valueOf(c));
                }
                str2 = TYPE_CHAR_ARRAY;
            } else if (obj instanceof java.util.List) {
                for (java.lang.Object obj2 : (java.util.List) obj) {
                    if (obj2 == null) {
                        obj2 = org.json.JSONObject.NULL;
                    }
                    jSONArray.put(obj2);
                }
                str2 = TYPE_STRING_LIST;
            } else {
                jSONArray = null;
            }
            if (str2 == null) {
                jSONObject.put(JSON_VALUE_TYPE, str2);
                if (jSONArray != null) {
                    jSONObject.putOpt("value", jSONArray);
                }
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "json.toString()");
                editor.putString(key, jSONObject2);
                return;
            }
            return;
        }
        jSONArray = null;
        str2 = str;
        if (str2 == null) {
        }
    }

    private final void deserializeKey(java.lang.String key, android.os.Bundle bundle) throws org.json.JSONException {
        java.lang.String str;
        java.lang.String string;
        java.lang.String string2 = this.cache.getString(key, "{}");
        if (string2 == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(string2);
        java.lang.String string3 = jSONObject.getString(JSON_VALUE_TYPE);
        if (string3 != null) {
            int i = 0;
            switch (string3.hashCode()) {
                case -1573317553:
                    if (string3.equals(TYPE_STRING_LIST)) {
                        org.json.JSONArray jSONArray = jSONObject.getJSONArray("value");
                        int length = jSONArray.length();
                        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(length);
                        if (length > 0) {
                            while (true) {
                                int i2 = i + 1;
                                java.lang.Object obj = jSONArray.get(i);
                                if (obj == org.json.JSONObject.NULL) {
                                    str = null;
                                } else {
                                    if (obj == null) {
                                        throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                    str = (java.lang.String) obj;
                                }
                                arrayList.add(i, str);
                                if (i2 < length) {
                                    i = i2;
                                }
                            }
                        }
                        bundle.putStringArrayList(key, arrayList);
                        return;
                    }
                    return;
                case -1383386164:
                    if (string3.equals(TYPE_BOOLEAN_ARRAY)) {
                        org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                        int length2 = jSONArray2.length();
                        boolean[] zArr = new boolean[length2];
                        int i3 = length2 - 1;
                        if (i3 >= 0) {
                            while (true) {
                                int i4 = i + 1;
                                zArr[i] = jSONArray2.getBoolean(i);
                                if (i4 <= i3) {
                                    i = i4;
                                }
                            }
                        }
                        bundle.putBooleanArray(key, zArr);
                        return;
                    }
                    return;
                case -1374008726:
                    if (string3.equals(TYPE_BYTE_ARRAY)) {
                        org.json.JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                        int length3 = jSONArray3.length();
                        byte[] bArr = new byte[length3];
                        int i5 = length3 - 1;
                        if (i5 >= 0) {
                            while (true) {
                                int i6 = i + 1;
                                bArr[i] = (byte) jSONArray3.getInt(i);
                                if (i6 <= i5) {
                                    i = i6;
                                }
                            }
                        }
                        bundle.putByteArray(key, bArr);
                        return;
                    }
                    return;
                case -1361632968:
                    if (string3.equals(TYPE_CHAR_ARRAY)) {
                        org.json.JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                        int length4 = jSONArray4.length();
                        char[] cArr = new char[length4];
                        int i7 = length4 - 1;
                        if (i7 >= 0) {
                            int i8 = 0;
                            while (true) {
                                int i9 = i8 + 1;
                                java.lang.String string4 = jSONArray4.getString(i8);
                                if (string4 != null && string4.length() == 1) {
                                    cArr[i8] = string4.charAt(0);
                                }
                                if (i9 <= i7) {
                                    i8 = i9;
                                }
                            }
                        }
                        bundle.putCharArray(key, cArr);
                        return;
                    }
                    return;
                case -1325958191:
                    if (string3.equals(TYPE_DOUBLE)) {
                        bundle.putDouble(key, jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case -1097129250:
                    if (string3.equals(TYPE_LONG_ARRAY)) {
                        org.json.JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                        int length5 = jSONArray5.length();
                        long[] jArr = new long[length5];
                        int i10 = length5 - 1;
                        if (i10 >= 0) {
                            while (true) {
                                int i11 = i + 1;
                                jArr[i] = jSONArray5.getLong(i);
                                if (i11 <= i10) {
                                    i = i11;
                                }
                            }
                        }
                        bundle.putLongArray(key, jArr);
                        return;
                    }
                    return;
                case -891985903:
                    if (string3.equals(TYPE_STRING)) {
                        bundle.putString(key, jSONObject.getString("value"));
                        return;
                    }
                    return;
                case -766441794:
                    if (string3.equals(TYPE_FLOAT_ARRAY)) {
                        org.json.JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                        int length6 = jSONArray6.length();
                        float[] fArr = new float[length6];
                        int i12 = length6 - 1;
                        if (i12 >= 0) {
                            while (true) {
                                int i13 = i + 1;
                                fArr[i] = (float) jSONArray6.getDouble(i);
                                if (i13 <= i12) {
                                    i = i13;
                                }
                            }
                        }
                        bundle.putFloatArray(key, fArr);
                        return;
                    }
                    return;
                case 104431:
                    if (string3.equals(TYPE_INTEGER)) {
                        bundle.putInt(key, jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3029738:
                    if (string3.equals(TYPE_BOOLEAN)) {
                        bundle.putBoolean(key, jSONObject.getBoolean("value"));
                        return;
                    }
                    return;
                case 3039496:
                    if (string3.equals(TYPE_BYTE)) {
                        bundle.putByte(key, (byte) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 3052374:
                    if (string3.equals(TYPE_CHAR) && (string = jSONObject.getString("value")) != null && string.length() == 1) {
                        bundle.putChar(key, string.charAt(0));
                        return;
                    }
                    return;
                case 3118337:
                    if (string3.equals(TYPE_ENUM)) {
                        try {
                            java.lang.Class<?> cls = java.lang.Class.forName(jSONObject.getString(JSON_VALUE_ENUM_TYPE));
                            if (cls == null) {
                                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Class<out kotlin.Enum<*>>");
                            }
                            bundle.putSerializable(key, java.lang.Enum.valueOf(cls, jSONObject.getString("value")));
                            return;
                        } catch (java.lang.ClassNotFoundException | java.lang.IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                case 3327612:
                    if (string3.equals("long")) {
                        bundle.putLong(key, jSONObject.getLong("value"));
                        return;
                    }
                    return;
                case 97526364:
                    if (string3.equals(TYPE_FLOAT)) {
                        bundle.putFloat(key, (float) jSONObject.getDouble("value"));
                        return;
                    }
                    return;
                case 100361105:
                    if (string3.equals(TYPE_INTEGER_ARRAY)) {
                        org.json.JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                        int length7 = jSONArray7.length();
                        int[] iArr = new int[length7];
                        int i14 = length7 - 1;
                        if (i14 >= 0) {
                            while (true) {
                                int i15 = i + 1;
                                iArr[i] = jSONArray7.getInt(i);
                                if (i15 <= i14) {
                                    i = i15;
                                }
                            }
                        }
                        bundle.putIntArray(key, iArr);
                        return;
                    }
                    return;
                case 109413500:
                    if (string3.equals(TYPE_SHORT)) {
                        bundle.putShort(key, (short) jSONObject.getInt("value"));
                        return;
                    }
                    return;
                case 1359468275:
                    if (string3.equals(TYPE_DOUBLE_ARRAY)) {
                        org.json.JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                        int length8 = jSONArray8.length();
                        double[] dArr = new double[length8];
                        int i16 = length8 - 1;
                        if (i16 >= 0) {
                            while (true) {
                                int i17 = i + 1;
                                dArr[i] = jSONArray8.getDouble(i);
                                if (i17 <= i16) {
                                    i = i17;
                                }
                            }
                        }
                        bundle.putDoubleArray(key, dArr);
                        return;
                    }
                    return;
                case 2067161310:
                    if (string3.equals(TYPE_SHORT_ARRAY)) {
                        org.json.JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                        int length9 = jSONArray9.length();
                        short[] sArr = new short[length9];
                        int i18 = length9 - 1;
                        if (i18 >= 0) {
                            while (true) {
                                int i19 = i + 1;
                                sArr[i] = (short) jSONArray9.getInt(i);
                                if (i19 <= i18) {
                                    i = i19;
                                }
                            }
                        }
                        bundle.putShortArray(key, sArr);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: LegacyTokenHelper.kt */
    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010(\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020*H\u0007J\u001e\u0010+\u001a\u0004\u0018\u00010,2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010.\u001a\u0004\u0018\u00010,2\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010/\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0007J\u0012\u00100\u001a\u0004\u0018\u00010,2\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020*H\u0007J\u0018\u00102\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001032\u0006\u0010)\u001a\u00020*H\u0007J\u0012\u00104\u001a\u0004\u0018\u0001052\u0006\u0010)\u001a\u00020*H\u0007J\u0012\u00106\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020*H\u0007J\u0012\u00107\u001a\u0002082\b\u0010)\u001a\u0004\u0018\u00010*H\u0007J\u001a\u00109\u001a\u00020:2\u0006\u0010)\u001a\u00020*2\b\u0010;\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u0010<\u001a\u00020:2\u0006\u0010)\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010\u00042\u0006\u0010=\u001a\u00020,H\u0002J\u001e\u0010>\u001a\u00020:2\u0006\u0010)\u001a\u00020*2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040?H\u0007J\u0018\u0010@\u001a\u00020:2\u0006\u0010)\u001a\u00020*2\u0006\u0010;\u001a\u00020,H\u0007J\u0018\u0010A\u001a\u00020:2\u0006\u0010)\u001a\u00020*2\u0006\u0010;\u001a\u00020\nH\u0007J\u001e\u0010B\u001a\u00020:2\u0006\u0010)\u001a\u00020*2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040?H\u0007J\u0018\u0010C\u001a\u00020:2\u0006\u0010)\u001a\u00020*2\u0006\u0010;\u001a\u00020,H\u0007J\u0018\u0010D\u001a\u00020:2\u0006\u0010)\u001a\u00020*2\u0006\u0010;\u001a\u00020\nH\u0007J\u001e\u0010E\u001a\u00020:2\u0006\u0010)\u001a\u00020*2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040?H\u0007J\u0018\u0010F\u001a\u00020:2\u0006\u0010)\u001a\u00020*2\u0006\u0010;\u001a\u000205H\u0007J\u0018\u0010G\u001a\u00020:2\u0006\u0010)\u001a\u00020*2\u0006\u0010;\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0012*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/facebook/LegacyTokenHelper$Companion;", "", "()V", "APPLICATION_ID_KEY", "", "DECLINED_PERMISSIONS_KEY", "DEFAULT_CACHE_KEY", "EXPIRATION_DATE_KEY", "EXPIRED_PERMISSIONS_KEY", "INVALID_BUNDLE_MILLISECONDS", "", "IS_SSO_KEY", "JSON_VALUE", "JSON_VALUE_ENUM_TYPE", "JSON_VALUE_TYPE", "LAST_REFRESH_DATE_KEY", "PERMISSIONS_KEY", "TAG", "kotlin.jvm.PlatformType", "TOKEN_KEY", "TOKEN_SOURCE_KEY", "TYPE_BOOLEAN", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_CHAR", "TYPE_CHAR_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_ENUM", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_SHORT", "TYPE_SHORT_ARRAY", "TYPE_STRING", "TYPE_STRING_LIST", "getApplicationId", "bundle", "Landroid/os/Bundle;", "getDate", "Ljava/util/Date;", com.ironsource.X3.i.W, "getExpirationDate", "getExpirationMilliseconds", "getLastRefreshDate", "getLastRefreshMilliseconds", "getPermissions", "", "getSource", "Lcom/facebook/AccessTokenSource;", "getToken", "hasTokenInformation", "", "putApplicationId", "", "value", "putDate", "date", "putDeclinedPermissions", "", "putExpirationDate", "putExpirationMilliseconds", "putExpiredPermissions", "putLastRefreshDate", "putLastRefreshMilliseconds", "putPermissions", "putSource", "putToken", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final boolean hasTokenInformation(android.os.Bundle bundle) {
            java.lang.String string;
            return (bundle == null || (string = bundle.getString(com.facebook.LegacyTokenHelper.TOKEN_KEY)) == null || string.length() == 0 || bundle.getLong(com.facebook.LegacyTokenHelper.EXPIRATION_DATE_KEY, 0L) == 0) ? false : true;
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getToken(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString(com.facebook.LegacyTokenHelper.TOKEN_KEY);
        }

        @kotlin.jvm.JvmStatic
        public final void putToken(android.os.Bundle bundle, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            bundle.putString(com.facebook.LegacyTokenHelper.TOKEN_KEY, value);
        }

        @kotlin.jvm.JvmStatic
        public final java.util.Date getExpirationDate(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            return getDate(bundle, com.facebook.LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        @kotlin.jvm.JvmStatic
        public final void putExpirationDate(android.os.Bundle bundle, java.util.Date value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            putDate(bundle, com.facebook.LegacyTokenHelper.EXPIRATION_DATE_KEY, value);
        }

        @kotlin.jvm.JvmStatic
        public final long getExpirationMilliseconds(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong(com.facebook.LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        @kotlin.jvm.JvmStatic
        public final void putExpirationMilliseconds(android.os.Bundle bundle, long value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong(com.facebook.LegacyTokenHelper.EXPIRATION_DATE_KEY, value);
        }

        @kotlin.jvm.JvmStatic
        public final java.util.Set<java.lang.String> getPermissions(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(com.facebook.LegacyTokenHelper.PERMISSIONS_KEY);
            if (stringArrayList == null) {
                return null;
            }
            return new java.util.HashSet(stringArrayList);
        }

        @kotlin.jvm.JvmStatic
        public final void putPermissions(android.os.Bundle bundle, java.util.Collection<java.lang.String> value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(com.facebook.LegacyTokenHelper.PERMISSIONS_KEY, new java.util.ArrayList<>(value));
        }

        @kotlin.jvm.JvmStatic
        public final void putDeclinedPermissions(android.os.Bundle bundle, java.util.Collection<java.lang.String> value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(com.facebook.LegacyTokenHelper.DECLINED_PERMISSIONS_KEY, new java.util.ArrayList<>(value));
        }

        @kotlin.jvm.JvmStatic
        public final void putExpiredPermissions(android.os.Bundle bundle, java.util.Collection<java.lang.String> value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            bundle.putStringArrayList(com.facebook.LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY, new java.util.ArrayList<>(value));
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.AccessTokenSource getSource(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            if (bundle.containsKey(com.facebook.LegacyTokenHelper.TOKEN_SOURCE_KEY)) {
                return (com.facebook.AccessTokenSource) bundle.getSerializable(com.facebook.LegacyTokenHelper.TOKEN_SOURCE_KEY);
            }
            return bundle.getBoolean(com.facebook.LegacyTokenHelper.IS_SSO_KEY) ? com.facebook.AccessTokenSource.FACEBOOK_APPLICATION_WEB : com.facebook.AccessTokenSource.WEB_VIEW;
        }

        @kotlin.jvm.JvmStatic
        public final void putSource(android.os.Bundle bundle, com.facebook.AccessTokenSource value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            bundle.putSerializable(com.facebook.LegacyTokenHelper.TOKEN_SOURCE_KEY, value);
        }

        @kotlin.jvm.JvmStatic
        public final java.util.Date getLastRefreshDate(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            return getDate(bundle, com.facebook.LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        @kotlin.jvm.JvmStatic
        public final void putLastRefreshDate(android.os.Bundle bundle, java.util.Date value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            putDate(bundle, com.facebook.LegacyTokenHelper.LAST_REFRESH_DATE_KEY, value);
        }

        @kotlin.jvm.JvmStatic
        public final long getLastRefreshMilliseconds(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getLong(com.facebook.LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        @kotlin.jvm.JvmStatic
        public final void putLastRefreshMilliseconds(android.os.Bundle bundle, long value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putLong(com.facebook.LegacyTokenHelper.LAST_REFRESH_DATE_KEY, value);
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getApplicationId(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            return bundle.getString(com.facebook.LegacyTokenHelper.APPLICATION_ID_KEY);
        }

        @kotlin.jvm.JvmStatic
        public final void putApplicationId(android.os.Bundle bundle, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.putString(com.facebook.LegacyTokenHelper.APPLICATION_ID_KEY, value);
        }

        private final java.util.Date getDate(android.os.Bundle bundle, java.lang.String key) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(key, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new java.util.Date(j);
        }

        private final void putDate(android.os.Bundle bundle, java.lang.String key, java.util.Date date) {
            bundle.putLong(key, date.getTime());
        }
    }
}
