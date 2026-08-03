package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgba implements androidx.datastore.core.Serializer {
    public static final com.google.android.gms.internal.ads.zzgba zza = new com.google.android.gms.internal.ads.zzgba();
    private static final com.google.android.gms.internal.ads.zzgax zzb;

    static {
        com.google.android.gms.internal.ads.zzgax zzd = com.google.android.gms.internal.ads.zzgax.zzd();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzd, "getDefaultInstance(...)");
        zzb = zzd;
    }

    private zzgba() {
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ java.lang.Object getDefaultValue() {
        return zzb;
    }

    @Override // androidx.datastore.core.Serializer
    public final java.lang.Object readFrom(java.io.InputStream inputStream, kotlin.coroutines.Continuation continuation) {
        try {
            com.google.android.gms.internal.ads.zzgax zzc = com.google.android.gms.internal.ads.zzgax.zzc(inputStream);
            kotlin.jvm.internal.Intrinsics.checkNotNull(zzc);
            return zzc;
        } catch (java.lang.Exception unused) {
            return zzb;
        }
    }

    @Override // androidx.datastore.core.Serializer
    public final /* synthetic */ java.lang.Object writeTo(java.lang.Object obj, java.io.OutputStream outputStream, kotlin.coroutines.Continuation continuation) {
        ((com.google.android.gms.internal.ads.zzgax) obj).zzaO(outputStream);
        return kotlin.Unit.INSTANCE;
    }
}
