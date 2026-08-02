package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzgm implements com.google.android.libraries.places.api.net.Pagination {
    private final com.google.android.libraries.places.api.net.PlacesClient zza;
    private final com.google.android.libraries.places.internal.zzmy zzb;
    private final com.google.android.libraries.places.api.net.SearchByTextRequest.Builder zzc;
    private java.lang.String zze;
    private int zzg;
    private java.lang.Integer zzd = null;
    private boolean zzf = false;

    public zzgm(com.google.android.libraries.places.api.net.PlacesClient placesClient, com.google.android.libraries.places.api.net.SearchByTextRequest searchByTextRequest, java.lang.String str, com.google.android.libraries.places.internal.zzmy zzmyVar, int i) {
        this.zza = placesClient;
        this.zzg = i;
        this.zzc = searchByTextRequest.zzc();
        this.zze = str;
        this.zzb = zzmyVar;
    }

    @Override // com.google.android.libraries.places.api.net.Pagination
    public final com.google.android.gms.tasks.Task<com.google.android.libraries.places.api.net.SearchResponse> fetchNextPage() {
        if (this.zzf) {
            throw new java.lang.IllegalStateException("Too many concurrent requests");
        }
        this.zzf = true;
        java.lang.String str = this.zze;
        if (str == null) {
            return com.google.android.gms.tasks.Tasks.forResult(com.google.android.libraries.places.api.net.SearchByTextResponse.newInstance(com.google.common.collect.ImmutableList.of()));
        }
        com.google.android.libraries.places.api.net.SearchByTextRequest.Builder builder = this.zzc;
        builder.zza(str);
        java.lang.Integer num = this.zzd;
        if (num != null) {
            builder.setMaxResultCount(num);
        }
        builder.zzb(this.zzg);
        return this.zza.zzi(builder.build(), this.zzb).onSuccessTask(new com.google.android.gms.tasks.SuccessContinuation() { // from class: com.google.android.libraries.places.internal.zzgl
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final /* synthetic */ com.google.android.gms.tasks.Task then(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzgm.this.zza((com.google.android.libraries.places.api.net.SearchByTextResponse) obj);
            }
        });
    }

    @Override // com.google.android.libraries.places.api.net.Pagination
    public final void setPageSize(java.lang.Integer num) {
        if (num != null) {
            boolean z = false;
            if (num.intValue() > 0 && num.intValue() <= 20) {
                z = true;
            }
            com.google.common.base.Preconditions.checkArgument(z, "Page size must be in the range of %s to %s, inclusive, but was: %s.", 1, 20, num);
        }
        this.zzd = num;
    }

    final /* synthetic */ com.google.android.gms.tasks.Task zza(com.google.android.libraries.places.api.net.SearchByTextResponse searchByTextResponse) {
        this.zze = searchByTextResponse.zza();
        this.zzf = false;
        this.zzg++;
        return com.google.android.gms.tasks.Tasks.forResult(searchByTextResponse);
    }

    @Override // com.google.android.libraries.places.api.net.Pagination
    public final boolean hasNextPage() {
        return this.zze != null;
    }

    @Override // com.google.android.libraries.places.api.net.Pagination
    public final java.lang.Integer getPageSize() {
        return this.zzd;
    }
}
