package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzls {
    public static java.lang.String zza(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        android.content.res.Resources resources = context.getResources();
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = com.google.android.gms.measurement.internal.zzht.zza(context);
        }
        return com.google.android.gms.measurement.internal.zzht.zzb("google_app_id", resources, str2);
    }

    public static java.lang.Object zzb(java.lang.Object obj) {
        java.lang.Throwable th;
        java.io.ObjectInputStream objectInputStream;
        java.io.ObjectOutputStream objectOutputStream;
        try {
            if (obj != null) {
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    objectOutputStream = new java.io.ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                        try {
                            java.lang.Object readObject = objectInputStream.readObject();
                            objectOutputStream.close();
                            objectInputStream.close();
                            return readObject;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            if (objectOutputStream != null) {
                                objectOutputStream.close();
                            }
                            if (objectInputStream == null) {
                                throw th;
                            }
                            objectInputStream.close();
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        objectInputStream = null;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    objectInputStream = null;
                    objectOutputStream = null;
                }
            }
        } catch (java.io.IOException | java.lang.ClassNotFoundException unused) {
        }
        return null;
    }

    public static java.lang.String zzc(java.lang.String str, java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(strArr2);
        int min = java.lang.Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            java.lang.String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }
}
