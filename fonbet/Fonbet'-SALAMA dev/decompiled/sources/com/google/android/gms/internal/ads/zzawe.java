package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzawe extends zzaxe {
    private static final zzaxf zzh = new zzaxf();
    private final Context zzi;

    public zzawe(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8, Context context) {
        super(zzavrVar, "Ao1l1J/gSn9Cy+MApMOTpHsBjuoY9zqSxq1+8qf+G4tKnVjUtrc2evw0XGJczOw/", "2yEUF0yl11FlF7CO4+/ZW6XNRqnQG1tr8tD2OdUjlVM=", zzarrVar, i7, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        this.zzd.zzn("E");
        AtomicReference zza = zzh.zza(this.zzi.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                try {
                    if (zza.get() == null) {
                        zza.set((String) this.zze.invoke(null, this.zzi));
                    }
                } finally {
                }
            }
        }
        String str = (String) zza.get();
        synchronized (this.zzd) {
            this.zzd.zzn(zzatf.zza(str.getBytes(), true));
        }
    }
}
