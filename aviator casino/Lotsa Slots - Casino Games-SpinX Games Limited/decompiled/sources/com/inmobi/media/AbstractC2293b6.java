package com.inmobi.media;

/* renamed from: com.inmobi.media.b6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2293b6 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5116a = 0;

    public static byte[] a(java.lang.String str) {
        int i;
        if (str != null) {
            int length = str.length() % 4;
            i = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i = 0;
        }
        java.lang.String valueOf = java.lang.String.valueOf(str != null ? kotlin.text.StringsKt.reversed((java.lang.CharSequence) str).toString() : null);
        for (int i2 = 0; i2 < i; i2++) {
            valueOf = ((java.lang.Object) valueOf) + com.ironsource.X3.j.b;
        }
        byte[] bytes = valueOf.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return android.util.Base64.decode(bytes, 2);
    }

    public static java.lang.String a(java.lang.String data, byte[] bArr) {
        byte[] bArr2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("b6", "TAG");
        javax.crypto.spec.SecretKeySpec secretKeySpec = new javax.crypto.spec.SecretKeySpec(bArr, "AES");
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/ECB/PKCS7Padding");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cipher, "getInstance(...)");
            cipher.init(1, secretKeySpec);
            byte[] bytes = data.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            bArr2 = cipher.doFinal(bytes);
        } catch (java.lang.Throwable th) {
            android.util.Log.d("b6", "SDK encountered unexpected error in getting encrypted AES bytes; " + th.getMessage());
            bArr2 = null;
        }
        byte[] encode = android.util.Base64.encode(bArr2, 2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        java.lang.String str = new java.lang.String(encode, kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("b6", "TAG");
        return str;
    }
}
