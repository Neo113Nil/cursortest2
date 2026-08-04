package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.P;
import android.os.Environment;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class zzbaw {
    private final zzbbc zza;
    private final zzbbd.zzt.zza zzb;
    private final boolean zzc;

    private zzbaw() {
        this.zzb = zzbbd.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbbc();
    }

    public static zzbaw zza() {
        return new zzbaw();
    }

    private final synchronized String zzd(int i7) {
        StringBuilder sb;
        String strZzah = this.zzb.zzah();
        o.f1952C.j.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(this.zzb.zzbr().zzaV(), 3);
        sb = new StringBuilder("id=");
        sb.append(strZzah);
        sb.append(",timestamp=");
        sb.append(jElapsedRealtime);
        sb.append(",event=");
        sb.append(i7 - 1);
        sb.append(",data=");
        sb.append(strEncodeToString);
        sb.append("\n");
        return sb.toString();
    }

    private final synchronized void zze(int i7) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfon.zza(zzfom.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                fileOutputStream.write(zzd(i7).getBytes());
            } catch (IOException unused) {
                J.k("Could not write Clearcut to file.");
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                    J.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused3) {
            J.k("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i7) {
        zzbbd.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(P.y());
        zzbba zzbbaVar = new zzbba(this.zza, this.zzb.zzbr().zzaV(), null);
        int i8 = i7 - 1;
        zzbbaVar.zza(i8);
        zzbbaVar.zzc();
        J.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i8, 10))));
    }

    public final synchronized void zzb(zzbav zzbavVar) {
        if (this.zzc) {
            try {
                zzbavVar.zza(this.zzb);
            } catch (NullPointerException e7) {
                o.f1952C.f1961g.zzw(e7, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i7) {
        if (this.zzc) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzff)).booleanValue()) {
                zze(i7);
            } else {
                zzf(i7);
            }
        }
    }

    public zzbaw(zzbbc zzbbcVar) {
        this.zzb = zzbbd.zzt.zzj();
        this.zza = zzbbcVar;
        this.zzc = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfe)).booleanValue();
    }
}
