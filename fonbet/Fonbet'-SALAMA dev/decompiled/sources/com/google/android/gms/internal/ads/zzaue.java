package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzaue implements zzfnv {
    final /* synthetic */ zzflx zza;

    public zzaue(zzaug zzaugVar, zzflx zzflxVar) {
        this.zza = zzflxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnv
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
