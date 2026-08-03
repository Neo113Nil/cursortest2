package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzzo extends com.google.android.gms.internal.ads.zzat {
    public final com.google.android.gms.internal.ads.zzgwm zzc;

    public zzzo(java.lang.String str, android.net.Uri uri, java.util.List list) {
        super(str, null, false, 1);
        this.zzc = com.google.android.gms.internal.ads.zzgwm.zzq(list);
    }

    @Override // com.google.android.gms.internal.ads.zzat, java.lang.Throwable
    public final java.lang.String getMessage() {
        com.google.android.gms.internal.ads.zzgwm zzgwmVar = this.zzc;
        java.lang.String message = super.getMessage();
        if (zzgwmVar.isEmpty()) {
            return message;
        }
        int length = message.length();
        java.lang.String valueOf = java.lang.String.valueOf(zzgwmVar);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 17 + java.lang.String.valueOf(valueOf).length());
        sb.append(message);
        sb.append("\nsniff failures: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
