package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzat extends java.io.IOException {
    public final boolean zza;
    public final int zzb;

    protected zzat(java.lang.String str, java.lang.Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static com.google.android.gms.internal.ads.zzat zza(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.gms.internal.ads.zzat(str, th, true, 0);
    }

    public static com.google.android.gms.internal.ads.zzat zzb(java.lang.String str, java.lang.Throwable th) {
        return new com.google.android.gms.internal.ads.zzat(str, th, true, 1);
    }

    public static com.google.android.gms.internal.ads.zzat zzc(java.lang.String str) {
        return new com.google.android.gms.internal.ads.zzat(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
        java.lang.String message = super.getMessage();
        java.lang.String concat = message != null ? message.concat(io.ktor.sse.ServerSentEventKt.SPACE) : "";
        boolean z = this.zza;
        int i = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(concat.length() + 20 + java.lang.String.valueOf(z).length() + 11 + java.lang.String.valueOf(i).length() + 1);
        sb.append(concat);
        sb.append("{contentIsMalformed=");
        sb.append(z);
        sb.append(", dataType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
