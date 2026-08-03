package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgsx implements com.google.android.gms.internal.ads.zzgtk {
    protected zzgsx() {
    }

    public static com.google.android.gms.internal.ads.zzgsx zzc(char c) {
        return new com.google.android.gms.internal.ads.zzgsu(c);
    }

    @Override // com.google.android.gms.internal.ads.zzgtk
    @java.lang.Deprecated
    public final /* synthetic */ boolean zza(java.lang.Object obj) {
        return zzb(((java.lang.Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
