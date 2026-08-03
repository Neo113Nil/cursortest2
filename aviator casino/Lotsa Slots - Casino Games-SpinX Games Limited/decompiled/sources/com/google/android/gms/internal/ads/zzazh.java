package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzazh {
    private static final java.lang.String zza = "zzazh";

    protected static java.util.HashMap zzb(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            return (java.util.HashMap) new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(str.getBytes(), 0))).readObject();
        } catch (java.io.IOException | java.lang.ClassNotFoundException unused) {
            android.util.Log.d(zza, "decode object failure");
            return null;
        }
    }

    public final java.lang.String toString() {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(zza());
            objectOutputStream.close();
            return android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    protected abstract java.util.HashMap zza();
}
