package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.b;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zznn extends zzos {
    public final zzhe zza;
    public final zzhe zzb;
    public final zzhe zzc;
    public final zzhe zzd;
    public final zzhe zze;
    public final zzhe zzf;
    private final Map zzh;

    public zznn(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzh = new HashMap();
        zzhh zzd = this.zzu.zzd();
        Objects.requireNonNull(zzd);
        this.zza = new zzhe(zzd, "last_delete_stale", 0L);
        zzhh zzd2 = this.zzu.zzd();
        Objects.requireNonNull(zzd2);
        this.zzb = new zzhe(zzd2, "last_delete_stale_batch", 0L);
        zzhh zzd3 = this.zzu.zzd();
        Objects.requireNonNull(zzd3);
        this.zzc = new zzhe(zzd3, "backoff", 0L);
        zzhh zzd4 = this.zzu.zzd();
        Objects.requireNonNull(zzd4);
        this.zzd = new zzhe(zzd4, "last_upload", 0L);
        zzhh zzd5 = this.zzu.zzd();
        Objects.requireNonNull(zzd5);
        this.zze = new zzhe(zzd5, "last_upload_attempt", 0L);
        zzhh zzd6 = this.zzu.zzd();
        Objects.requireNonNull(zzd6);
        this.zzf = new zzhe(zzd6, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbb() {
        return false;
    }

    @WorkerThread
    public final Pair zzc(String str, zzjl zzjlVar) {
        return zzjlVar.zzo(zzjk.AD_STORAGE) ? zzd(str) : new Pair("", Boolean.FALSE);
    }

    @WorkerThread
    @Deprecated
    public final Pair zzd(String str) {
        zznm zznmVar;
        b.a aVar;
        zzg();
        zzic zzicVar = this.zzu;
        long elapsedRealtime = zzicVar.zzaZ().elapsedRealtime();
        zznm zznmVar2 = (zznm) this.zzh.get(str);
        if (zznmVar2 != null && elapsedRealtime < zznmVar2.zzc) {
            return new Pair(zznmVar2.zza, Boolean.valueOf(zznmVar2.zzb));
        }
        long zzl = zzicVar.zzc().zzl(str, zzfy.zza) + elapsedRealtime;
        try {
            try {
                aVar = b.a(zzicVar.zzaY());
            } catch (PackageManager.NameNotFoundException unused) {
                aVar = null;
                if (zznmVar2 != null && elapsedRealtime < zznmVar2.zzc + this.zzu.zzc().zzl(str, zzfy.zzb)) {
                    return new Pair(zznmVar2.zza, Boolean.valueOf(zznmVar2.zzb));
                }
            }
        } catch (Exception e) {
            this.zzu.zzaV().zzj().zzb("Unable to get advertising id", e);
            zznmVar = new zznm("", false, zzl);
        }
        if (aVar == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = aVar.a;
        zznmVar = str2 != null ? new zznm(str2, aVar.b, zzl) : new zznm("", aVar.b, zzl);
        this.zzh.put(str, zznmVar);
        return new Pair(zznmVar.zza, Boolean.valueOf(zznmVar.zzb));
    }

    @WorkerThread
    @Deprecated
    public final String zzf(String str, boolean z) {
        zzg();
        String str2 = z ? (String) zzd(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest zzO = zzpp.zzO();
        if (zzO == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, zzO.digest(str2.getBytes())));
    }
}
