package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzauh extends com.google.android.gms.internal.ads.zzate {
    private final java.lang.Object zza;
    private final com.google.android.gms.internal.ads.zzatj zzb;

    public zzauh(int i, java.lang.String str, com.google.android.gms.internal.ads.zzatj zzatjVar, com.google.android.gms.internal.ads.zzati zzatiVar) {
        super(i, str, zzatiVar);
        this.zza = new java.lang.Object();
        this.zzb = zzatjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzate
    protected final com.google.android.gms.internal.ads.zzatk zzr(com.google.android.gms.internal.ads.zzata zzataVar) {
        java.lang.String str;
        java.lang.String str2;
        try {
            byte[] bArr = zzataVar.zzb;
            java.util.Map map = zzataVar.zzc;
            java.lang.String str3 = com.google.android.exoplayer2.C.ISO88591_NAME;
            if (map != null && (str2 = (java.lang.String) map.get("Content-Type")) != null) {
                java.lang.String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    java.lang.String[] split2 = split[i].trim().split(com.ironsource.X3.j.b, 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new java.lang.String(bArr, str3);
        } catch (java.io.UnsupportedEncodingException unused) {
            str = new java.lang.String(zzataVar.zzb);
        }
        return com.google.android.gms.internal.ads.zzatk.zza(str, com.google.android.gms.internal.ads.zzaub.zza(zzataVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzate
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(java.lang.String str) {
        com.google.android.gms.internal.ads.zzatj zzatjVar;
        synchronized (this.zza) {
            zzatjVar = this.zzb;
        }
        zzatjVar.zza(str);
    }
}
