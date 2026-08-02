package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public abstract class z {
    public static java.lang.String a(com.dyneti.android.dyscan.y yVar) {
        int length;
        java.lang.String str = yVar.b;
        if (str == null || (length = str.length()) <= 10) {
            return null;
        }
        java.lang.String substring = yVar.b.substring(6, length - 4);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(substring);
        sb.append("c1e197d2addaa3cf");
        try {
            byte[] digest = java.security.MessageDigest.getInstance("SHA-256").digest(sb.toString().getBytes(java.nio.charset.StandardCharsets.UTF_8));
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            for (byte b : digest) {
                sb2.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b)));
            }
            return sb2.toString().substring(0, 8);
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}
