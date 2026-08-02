package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public abstract class zzbce {
    static /* synthetic */ java.lang.String zzb(int i, int i2, byte b, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + b + java.lang.String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }

    public abstract void zza(byte[] bArr, int i, int i2) throws java.io.IOException;
}
