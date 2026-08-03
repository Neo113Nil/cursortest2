package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzbh extends com.google.android.gms.internal.ads.zzauh {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ java.util.Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbh(com.google.android.gms.ads.internal.util.zzbl zzblVar, int i, java.lang.String str, com.google.android.gms.internal.ads.zzatj zzatjVar, com.google.android.gms.internal.ads.zzati zzatiVar, byte[] bArr, java.util.Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, zzatjVar, zzatiVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
        java.util.Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzate
    public final java.util.Map zzm() throws com.google.android.gms.internal.ads.zzasm {
        java.util.Map map = this.zzb;
        return map == null ? java.util.Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzate
    public final byte[] zzn() throws com.google.android.gms.internal.ads.zzasm {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzauh, com.google.android.gms.internal.ads.zzate
    protected final /* bridge */ /* synthetic */ void zzs(java.lang.Object obj) {
        zzs((java.lang.String) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzauh
    /* renamed from: zzz */
    public final void zzs(java.lang.String str) {
        this.zzc.zze(str);
        super.zzs(str);
    }
}
