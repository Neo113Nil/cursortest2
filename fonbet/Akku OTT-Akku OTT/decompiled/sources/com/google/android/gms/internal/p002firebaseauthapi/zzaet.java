package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.media3.common.util.e;

/* loaded from: classes4.dex */
public class zzaet {
    final zzafe zza;
    private final String zzb;

    public zzaet(String str, zzafe zzafeVar) {
        this.zzb = str;
        this.zza = zzafeVar;
    }

    public final String zza(String str, String str2) {
        return e.a(this.zzb, str, "?key=", str2);
    }
}
