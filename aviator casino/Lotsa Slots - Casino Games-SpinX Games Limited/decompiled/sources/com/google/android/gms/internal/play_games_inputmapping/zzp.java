package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public abstract class zzp<API extends com.google.android.gms.internal.play_games_inputmapping.zzao<API>> {
    private final com.google.android.gms.internal.play_games_inputmapping.zzbc zza;

    protected zzp(com.google.android.gms.internal.play_games_inputmapping.zzbc zzbcVar) {
        this.zza = zzbcVar;
    }

    private static void zzg(java.lang.String str, com.google.android.gms.internal.play_games_inputmapping.zzba zzbaVar) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new java.util.Date(java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(zzbaVar.zzf()))));
        sb.append(": logging error [");
        com.google.android.gms.internal.play_games_inputmapping.zzaf zzg = zzbaVar.zzg();
        if (zzg != com.google.android.gms.internal.play_games_inputmapping.zzaf.zza) {
            sb.append(zzg.zza());
            sb.append('.');
            sb.append(zzg.zzb());
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            sb.append(zzg.zzc());
        }
        sb.append("]: ");
        sb.append(str);
        java.lang.System.err.println(sb);
        java.lang.System.err.flush();
    }

    public abstract com.google.android.gms.internal.play_games_inputmapping.zzao zza(java.util.logging.Level level);

    public final com.google.android.gms.internal.play_games_inputmapping.zzao zzb() {
        return zza(java.util.logging.Level.WARNING);
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzao zzc() {
        return zza(java.util.logging.Level.INFO);
    }

    protected final java.lang.String zzd() {
        return this.zza.zza();
    }

    protected final boolean zze(java.util.logging.Level level) {
        return this.zza.zzb(level);
    }

    final void zzf(com.google.android.gms.internal.play_games_inputmapping.zzba zzbaVar) {
        try {
            com.google.android.gms.internal.play_games_inputmapping.zzdu zzc = com.google.android.gms.internal.play_games_inputmapping.zzdu.zzc();
            try {
                if (zzc.zzb() <= 100) {
                    this.zza.zzc(zzbaVar);
                } else {
                    zzg("unbounded recursion in log statement", zzbaVar);
                }
                if (zzc != null) {
                    zzc.close();
                }
            } finally {
            }
        } catch (java.lang.RuntimeException e) {
            try {
                this.zza.zzd(e, zzbaVar);
            } catch (com.google.android.gms.internal.play_games_inputmapping.zzbd e2) {
                throw e2;
            } catch (java.lang.RuntimeException e3) {
                java.lang.String name = e3.getClass().getName();
                java.lang.String message = e3.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 2 + java.lang.String.valueOf(message).length());
                sb.append(name);
                sb.append(": ");
                sb.append(message);
                zzg(sb.toString(), zzbaVar);
                try {
                    e3.printStackTrace(java.lang.System.err);
                } catch (java.lang.RuntimeException unused) {
                }
            }
        }
    }
}
