package com.google.android.gms.internal.firebase_auth;

/* loaded from: classes.dex */
public final class zze {
    public static int zza(int i) {
        if (i >= 0 && i <= 6) {
            return i;
        }
        StringBuilder sb = new StringBuilder(49);
        sb.append(i);
        sb.append(" is not a valid enum UserAttributeName");
        throw new IllegalArgumentException(sb.toString());
    }
}
