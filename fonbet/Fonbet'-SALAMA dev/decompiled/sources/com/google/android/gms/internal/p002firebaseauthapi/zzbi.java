package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class zzbi implements zzce {
    private final OutputStream zza;

    private zzbi(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzce zza(OutputStream outputStream) {
        return new zzbi(outputStream);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zzuo zzuoVar) {
        try {
            ((zzuo) ((zzajy) zzuoVar.zzn().zza().zze())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzce
    public final void zza(zzwa zzwaVar) {
        try {
            zzwaVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
