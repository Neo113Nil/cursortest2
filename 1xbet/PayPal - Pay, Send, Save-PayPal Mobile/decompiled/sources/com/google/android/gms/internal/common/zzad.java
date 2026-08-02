package com.google.android.gms.internal.common;

/* loaded from: classes4.dex */
public final class zzad extends com.google.android.gms.internal.common.zzaa {
    public zzad() {
        super(4);
    }

    public final com.google.android.gms.internal.common.zzad zzb(java.lang.Object obj) {
        super.zza(obj);
        return this;
    }

    public final com.google.android.gms.internal.common.zzad zzc(java.util.Iterator it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }

    public final com.google.android.gms.internal.common.zzah zzd() {
        this.zzc = true;
        return com.google.android.gms.internal.common.zzah.zzq(this.zza, this.zzb);
    }

    zzad(int i) {
        super(4);
    }
}
