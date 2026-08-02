package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
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
                    } finally {
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
            zzaqx zza2 = zzarb.zza();
            zza2.zza(this.zze.zza.getPackageName());
            zza2.zze(j);
            if (str != null) {
                zza2.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zza2.zzf(stringWriter.toString());
                zza2.zzd(exc.getClass().getName());
            }
            zzfoa zza3 = zza.zza(((zzarb) zza2.zzbr()).zzaV());
            zza3.zza(i7);
            if (i8 != -1) {
                zza3.zzb(i8);
            }
            zza3.zzc();
        } catch (Exception unused) {
        }
    }
}
