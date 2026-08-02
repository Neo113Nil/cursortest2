package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zznm {
    private ArrayList<zznp> zza = new ArrayList<>();
    private zzng zzb = zzng.zza;
    private Integer zzc = null;

    public final zznm zza(zzbr zzbrVar, int i7, String str, String str2) {
        ArrayList<zznp> arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zznp(zzbrVar, i7, str, str2));
        return this;
    }

    public final zznm zza(zzng zzngVar) {
        if (this.zza != null) {
            this.zzb = zzngVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zznm zza(int i7) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i7);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zznn zza() {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList<zznp> arrayList = this.zza;
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    zznp zznpVar = arrayList.get(i7);
                    i7++;
                    if (zznpVar.zza() == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zznn zznnVar = new zznn(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
            this.zza = null;
            return zznnVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
