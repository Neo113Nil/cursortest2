package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzfz {
    public final int zzd;

    public static java.lang.String zze(int i) {
        char c = (char) ((i >> 24) & 255);
        int length = java.lang.String.valueOf(c).length();
        char c2 = (char) ((i >> 16) & 255);
        int length2 = java.lang.String.valueOf(c2).length();
        char c3 = (char) ((i >> 8) & 255);
        char c4 = (char) (i & 255);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length2 + java.lang.String.valueOf(c3).length() + java.lang.String.valueOf(c4).length());
        sb.append(c);
        sb.append(c2);
        sb.append(c3);
        sb.append(c4);
        return sb.toString();
    }

    public java.lang.String toString() {
        return zze(this.zzd);
    }
}
