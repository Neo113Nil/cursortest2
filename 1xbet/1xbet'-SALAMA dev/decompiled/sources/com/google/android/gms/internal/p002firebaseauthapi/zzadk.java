package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzadk {
    public static String zza(zzadl zzadlVar, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
            int length = str2.length();
            int i7 = 0;
            while (i7 < length) {
                if (zzi.zza(str2.charAt(i7))) {
                    char[] charArray = str2.toCharArray();
                    while (i7 < length) {
                        char c3 = charArray[i7];
                        if (zzi.zza(c3)) {
                            charArray[i7] = (char) (c3 ^ ' ');
                        }
                        i7++;
                    }
                    return String.valueOf(charArray);
                }
                i7++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            zzadl.zza.c("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }

    public static void zzb(zzadl zzadlVar, String str) {
        zzadlVar.zza(str, null);
    }
}
