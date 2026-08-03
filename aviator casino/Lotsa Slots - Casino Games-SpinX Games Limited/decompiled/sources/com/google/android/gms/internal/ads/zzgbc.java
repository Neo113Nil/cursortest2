package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgbc implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;

    private zzgbc(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        this.zza = zzindVar;
    }

    public static com.google.android.gms.internal.ads.zzgbc zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2) {
        return new com.google.android.gms.internal.ads.zzgbc(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        final android.content.Context context = ((com.google.android.gms.internal.ads.zzcnq) this.zza).zza();
        com.google.android.gms.internal.ads.zzgbg coroutineScopeProvider = com.google.android.gms.internal.ads.zzcnu.zzc();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        androidx.datastore.core.DataStore create$default = androidx.datastore.core.DataStoreFactory.create$default(androidx.datastore.core.DataStoreFactory.INSTANCE, com.google.android.gms.internal.ads.zzgba.zza, null, null, coroutineScopeProvider.zza(), new kotlin.jvm.functions.Function0() { // from class: com.google.android.gms.internal.ads.zzgbb
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ java.lang.Object invoke() {
                return androidx.datastore.DataStoreFile.dataStoreFile(context, "ad_quality_data.pb");
            }
        }, 6, null);
        com.google.android.gms.internal.ads.zzinc.zzb(create$default);
        return create$default;
    }
}
