package com.ironsource;

/* loaded from: classes5.dex */
public class I9 {
    public static synchronized java.lang.String a(java.lang.String str) {
        java.lang.String a2;
        synchronized (com.ironsource.I9.class) {
            a2 = a(com.ironsource.C3127k5.b().c(), str);
        }
        return a2;
    }

    public static synchronized java.lang.String b(java.lang.String str) {
        java.lang.String d;
        synchronized (com.ironsource.I9.class) {
            d = d(com.ironsource.C3127k5.b().c(), str);
        }
        return d;
    }

    public static synchronized java.lang.String c(java.lang.String str) {
        java.lang.String e;
        synchronized (com.ironsource.I9.class) {
            e = e(com.ironsource.C3127k5.b().c(), str);
        }
        return e;
    }

    public static synchronized java.lang.String d(java.lang.String str, java.lang.String str2) {
        synchronized (com.ironsource.I9.class) {
            if (android.text.TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                byte[] c = c(str, str2);
                if (c != null) {
                    return com.ironsource.Q9.a(c);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
            return "";
        }
    }

    public static synchronized java.lang.String e(java.lang.String str, java.lang.String str2) {
        synchronized (com.ironsource.I9.class) {
            if (android.text.TextUtils.isEmpty(str)) {
                return "";
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                return a(str, str2.getBytes("UTF8"));
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                return "";
            }
        }
    }

    public static synchronized java.lang.String a(java.lang.String str, java.lang.String str2) {
        synchronized (com.ironsource.I9.class) {
            if (android.text.TextUtils.isEmpty(str2)) {
                return "";
            }
            try {
                byte[] a2 = com.ironsource.Q9.a(str2);
                if (a2 != null) {
                    return a(str, a2);
                }
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            }
            return "";
        }
    }

    public static synchronized java.lang.String b(java.lang.String str, java.lang.String str2) {
        synchronized (com.ironsource.I9.class) {
            byte[] c = c(str, str2);
            if (c == null) {
                return "";
            }
            return new java.lang.String(c);
        }
    }

    public static synchronized byte[] c(java.lang.String str, java.lang.String str2) {
        synchronized (com.ironsource.I9.class) {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                return null;
            }
            try {
                javax.crypto.spec.SecretKeySpec d = d(str);
                byte[] bArr = new byte[16];
                java.util.Arrays.fill(bArr, (byte) 0);
                javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr);
                byte[] decode = android.util.Base64.decode(str2, 0);
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(2, d, ivParameterSpec);
                return cipher.doFinal(decode);
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception on decryption error: " + e.getMessage());
                return null;
            }
        }
    }

    public static synchronized java.lang.String a(java.lang.String str, byte[] bArr) {
        synchronized (com.ironsource.I9.class) {
            if (android.text.TextUtils.isEmpty(str)) {
                return "";
            }
            if (bArr == null) {
                return "";
            }
            try {
                javax.crypto.spec.SecretKeySpec d = d(str);
                byte[] bArr2 = new byte[16];
                java.util.Arrays.fill(bArr2, (byte) 0);
                javax.crypto.spec.IvParameterSpec ivParameterSpec = new javax.crypto.spec.IvParameterSpec(bArr2);
                javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS7Padding");
                cipher.init(1, d, ivParameterSpec);
                return android.util.Base64.encodeToString(cipher.doFinal(bArr), 0).replaceAll(java.lang.System.getProperty("line.separator"), "");
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
                return "";
            }
        }
    }

    private static javax.crypto.spec.SecretKeySpec d(java.lang.String str) throws java.io.UnsupportedEncodingException {
        byte[] bArr = new byte[32];
        java.util.Arrays.fill(bArr, (byte) 0);
        byte[] bytes = str.getBytes("UTF-8");
        java.lang.System.arraycopy(bytes, 0, bArr, 0, bytes.length < 32 ? bytes.length : 32);
        return new javax.crypto.spec.SecretKeySpec(bArr, "AES");
    }
}
