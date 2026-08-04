package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public class zzet {
    public final int zzd;

    public static String zze(int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i7 >> 24) & 255));
        sb.append((char) ((i7 >> 16) & 255));
        sb.append((char) ((i7 >> 8) & 255));
        sb.append((char) (i7 & 255));
        return sb.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}
