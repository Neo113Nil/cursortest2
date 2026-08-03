package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgty {
    private final com.google.android.gms.internal.ads.zzgtx zza;

    private zzgty(com.google.android.gms.internal.ads.zzgtx zzgtxVar) {
        int i = com.google.android.gms.internal.ads.zzgsw.zzb;
        this.zza = zzgtxVar;
    }

    public static com.google.android.gms.internal.ads.zzgty zza(final com.google.android.gms.internal.ads.zzgsx zzgsxVar) {
        return new com.google.android.gms.internal.ads.zzgty(new com.google.android.gms.internal.ads.zzgtx() { // from class: com.google.android.gms.internal.ads.zzgtv
            @Override // com.google.android.gms.internal.ads.zzgtx
            public final /* synthetic */ java.util.Iterator zza(com.google.android.gms.internal.ads.zzgty zzgtyVar, java.lang.CharSequence charSequence) {
                return new com.google.android.gms.internal.ads.zzgtp(zzgtyVar, charSequence, com.google.android.gms.internal.ads.zzgsx.this);
            }
        });
    }

    public static com.google.android.gms.internal.ads.zzgty zzb(java.util.regex.Pattern pattern) {
        final com.google.android.gms.internal.ads.zzgtc zzgtcVar = new com.google.android.gms.internal.ads.zzgtc(pattern);
        com.google.android.gms.internal.ads.zzgtj.zzf(!((com.google.android.gms.internal.ads.zzgtb) zzgtcVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzgtcVar);
        return new com.google.android.gms.internal.ads.zzgty(new com.google.android.gms.internal.ads.zzgtx() { // from class: com.google.android.gms.internal.ads.zzgtt
            @Override // com.google.android.gms.internal.ads.zzgtx
            public final /* synthetic */ java.util.Iterator zza(com.google.android.gms.internal.ads.zzgty zzgtyVar, java.lang.CharSequence charSequence) {
                return new com.google.android.gms.internal.ads.zzgtq(zzgtyVar, charSequence, com.google.android.gms.internal.ads.zzgsz.this.zza(charSequence));
            }
        });
    }

    public static com.google.android.gms.internal.ads.zzgty zzc(int i) {
        final int i2 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE;
        return new com.google.android.gms.internal.ads.zzgty(new com.google.android.gms.internal.ads.zzgtx(i2) { // from class: com.google.android.gms.internal.ads.zzgtu
            @Override // com.google.android.gms.internal.ads.zzgtx
            public final /* synthetic */ java.util.Iterator zza(com.google.android.gms.internal.ads.zzgty zzgtyVar, java.lang.CharSequence charSequence) {
                return new com.google.android.gms.internal.ads.zzgtr(zzgtyVar, charSequence, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final java.util.Iterator zzf(java.lang.CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final java.lang.Iterable zzd(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        return new com.google.android.gms.internal.ads.zzgts(this, charSequence);
    }

    public final java.util.List zze(java.lang.CharSequence charSequence) {
        charSequence.getClass();
        java.util.Iterator zzf = zzf(charSequence);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (zzf.hasNext()) {
            arrayList.add((java.lang.String) zzf.next());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }
}
