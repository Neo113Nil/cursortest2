package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzafs {
    private final ByteArrayOutputStream zza;
    private final DataOutputStream zzb;

    public zzafs() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.zza = byteArrayOutputStream;
        this.zzb = new DataOutputStream(byteArrayOutputStream);
    }

    private static void zzb(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(zzafr zzafrVar) {
        this.zza.reset();
        try {
            zzb(this.zzb, zzafrVar.zza);
            zzb(this.zzb, zzafrVar.zzb);
            this.zzb.writeLong(zzafrVar.zzc);
            this.zzb.writeLong(zzafrVar.zzd);
            this.zzb.write(zzafrVar.zze);
            this.zzb.flush();
            return this.zza.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }
}
