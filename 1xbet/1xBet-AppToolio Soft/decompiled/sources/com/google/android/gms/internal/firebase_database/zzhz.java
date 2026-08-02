package com.google.android.gms.internal.firebase_database;

import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes.dex */
public final class zzhz {
    private final zzia zzco;
    private final String zzqo;
    private final String zzqp;

    public zzhz(zzia zziaVar, String str) {
        this(zziaVar, str, null);
    }

    public zzhz(zzia zziaVar, String str, String str2) {
        this.zzco = zziaVar;
        this.zzqo = str;
        this.zzqp = str2;
    }

    private final String zza(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        String str2 = this.zzqp;
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(" - ");
        sb.append(str);
        return sb.toString();
    }

    private static String zzb(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        zze.zza(th, new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public final void info(String str) {
        this.zzco.zzb(zzib.INFO, this.zzqo, zza(str, new Object[0]), System.currentTimeMillis());
    }

    public final void zza(String str, Throwable th) {
        String zza = zza(str, new Object[0]);
        String zzb = zzb(th);
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 1 + String.valueOf(zzb).length());
        sb.append(zza);
        sb.append("\n");
        sb.append(zzb);
        this.zzco.zzb(zzib.ERROR, this.zzqo, sb.toString(), System.currentTimeMillis());
    }

    public final void zza(String str, Throwable th, Object... objArr) {
        if (zzfa()) {
            String zza = zza(str, objArr);
            if (th != null) {
                String zzb = zzb(th);
                StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 1 + String.valueOf(zzb).length());
                sb.append(zza);
                sb.append("\n");
                sb.append(zzb);
                zza = sb.toString();
            }
            this.zzco.zzb(zzib.DEBUG, this.zzqo, zza, System.currentTimeMillis());
        }
    }

    public final void zzb(String str, Throwable th) {
        this.zzco.zzb(zzib.WARN, this.zzqo, zza(str, new Object[0]), System.currentTimeMillis());
    }

    public final boolean zzfa() {
        return this.zzco.zzbn().ordinal() <= zzib.DEBUG.ordinal();
    }
}
