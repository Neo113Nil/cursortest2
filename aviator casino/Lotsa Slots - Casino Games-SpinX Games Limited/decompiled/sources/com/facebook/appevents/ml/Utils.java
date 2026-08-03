package com.facebook.appevents.ml;

/* compiled from: Utils.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0006H\u0007J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/facebook/appevents/ml/Utils;", "", "()V", "DIR_NAME", "", "getMlDir", "Ljava/io/File;", "normalizeString", "str", "parseModelWeights", "", "Lcom/facebook/appevents/ml/MTensor;", "file", "vectorize", "", "texts", "maxLen", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class Utils {
    private static final java.lang.String DIR_NAME = "facebook_ml/";
    public static final com.facebook.appevents.ml.Utils INSTANCE = new com.facebook.appevents.ml.Utils();

    private Utils() {
    }

    public final int[] vectorize(java.lang.String texts, int maxLen) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(texts, "texts");
            int[] iArr = new int[maxLen];
            java.lang.String normalizeString = normalizeString(texts);
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-8");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
            if (normalizeString == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = normalizeString.getBytes(forName);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            if (maxLen > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i < bytes.length) {
                        iArr[i] = bytes[i] & 255;
                    } else {
                        iArr[i] = 0;
                    }
                    if (i2 >= maxLen) {
                        break;
                    }
                    i = i2;
                }
            }
            return iArr;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.io.File getMlDir() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ml.Utils.class)) {
            return null;
        }
        try {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            java.io.File file = new java.io.File(com.facebook.FacebookSdk.getApplicationContext().getFilesDir(), DIR_NAME);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ml.Utils.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Map<java.lang.String, com.facebook.appevents.ml.MTensor> parseModelWeights(java.io.File file) {
        java.util.Map<java.lang.String, com.facebook.appevents.ml.MTensor> map;
        java.util.Map<java.lang.String, com.facebook.appevents.ml.MTensor> map2 = null;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.ml.Utils.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            try {
                try {
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                    int available = fileInputStream.available();
                    java.io.DataInputStream dataInputStream = new java.io.DataInputStream(fileInputStream);
                    byte[] bArr = new byte[available];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    if (available < 4) {
                        return null;
                    }
                    int i = 0;
                    java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr, 0, 4);
                    wrap.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                    int i2 = wrap.getInt();
                    int i3 = i2 + 4;
                    if (available < i3) {
                        return null;
                    }
                    org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, 4, i2, kotlin.text.Charsets.UTF_8));
                    org.json.JSONArray names = jSONObject.names();
                    int length = names.length();
                    java.lang.String[] strArr = new java.lang.String[length];
                    int i4 = length - 1;
                    if (i4 >= 0) {
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            strArr[i5] = names.getString(i5);
                            if (i6 > i4) {
                                break;
                            }
                            i5 = i6;
                        }
                    }
                    kotlin.collections.ArraysKt.sort((java.lang.Object[]) strArr);
                    java.util.HashMap hashMap = new java.util.HashMap();
                    int i7 = 0;
                    while (i7 < length) {
                        java.lang.String str = strArr[i7];
                        i7++;
                        if (str != null) {
                            org.json.JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            int i8 = length2 - 1;
                            int i9 = 1;
                            if (i8 >= 0) {
                                while (true) {
                                    int i10 = i + 1;
                                    try {
                                        int i11 = jSONArray.getInt(i);
                                        iArr[i] = i11;
                                        i9 *= i11;
                                        if (i10 > i8) {
                                            break;
                                        }
                                        i = i10;
                                    } catch (java.lang.Exception unused) {
                                        return null;
                                    }
                                }
                            }
                            int i12 = i9 * 4;
                            int i13 = i3 + i12;
                            if (i13 > available) {
                                return null;
                            }
                            java.nio.ByteBuffer wrap2 = java.nio.ByteBuffer.wrap(bArr, i3, i12);
                            wrap2.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                            com.facebook.appevents.ml.MTensor mTensor = new com.facebook.appevents.ml.MTensor(iArr);
                            wrap2.asFloatBuffer().get(mTensor.getData(), 0, i9);
                            hashMap.put(str, mTensor);
                            i3 = i13;
                            map2 = null;
                            i = 0;
                        }
                    }
                    return hashMap;
                } catch (java.lang.Exception unused2) {
                    return map2;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                map = null;
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.ml.Utils.class);
                return map;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            map = null;
        }
    }

    public final java.lang.String normalizeString(java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "str");
            java.lang.String str2 = str;
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            java.lang.Object[] array = new kotlin.text.Regex("\\s+").split(str2.subSequence(i, length + 1).toString(), 0).toArray(new java.lang.String[0]);
            if (array != null) {
                java.lang.String join = android.text.TextUtils.join(io.ktor.sse.ServerSentEventKt.SPACE, (java.lang.String[]) array);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(join, "join(\" \", strArray)");
                return join;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
