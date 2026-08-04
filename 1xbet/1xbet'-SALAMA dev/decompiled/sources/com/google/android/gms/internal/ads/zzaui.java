package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes.dex */
public final class zzaui {
    protected volatile Boolean zzb;
    private final zzavr zze;
    private static final ConditionVariable zzc = new ConditionVariable();
    protected static volatile zzfoc zza = null;
    private static volatile Random zzd = null;

    public zzaui(zzavr zzavrVar) {
        this.zze = zzavrVar;
        zzavrVar.zzj().execute(new zzauh(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzaui.class) {
                    try {
                        if (zzd == null) {
                            zzd = new Random();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i7, int i8, long j, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzaqx zzaqxVarZza = zzarb.zza();
            zzaqxVarZza.zza(this.zze.zza.getPackageName());
            zzaqxVarZza.zze(j);
            if (str != null) {
                zzaqxVarZza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzaqxVarZza.zzf(stringWriter.toString());
                zzaqxVarZza.zzd(exc.getClass().getName());
            }
            zzfoa zzfoaVarZza = zza.zza(((zzarb) zzaqxVarZza.zzbr()).zzaV());
            zzfoaVarZza.zza(i7);
            if (i8 != -1) {
                zzfoaVarZza.zzb(i8);
            }
            zzfoaVarZza.zzc();
        } catch (Exception unused) {
        }
    }
}
