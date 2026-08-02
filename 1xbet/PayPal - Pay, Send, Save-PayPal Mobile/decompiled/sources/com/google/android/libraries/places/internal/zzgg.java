package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzgg {
    private final com.android.volley.RequestQueue zza;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzd(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.android.volley.VolleyError volleyError) {
        com.google.android.gms.common.api.ApiException zza;
        try {
            if (volleyError.networkResponse != null) {
                int i = volleyError.networkResponse.statusCode;
                if (i == 400) {
                    zza = new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.INVALID_REQUEST, "The provided parameters are invalid (did you include a max width or height?)."));
                } else if (i == 403) {
                    zza = new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(com.google.android.libraries.places.api.net.PlacesStatusCodes.REQUEST_DENIED, "The provided API key is invalid."));
                }
                taskCompletionSource.trySetException(zza);
            }
            zza = com.google.android.libraries.places.internal.zzfu.zza(volleyError);
            taskCompletionSource.trySetException(zza);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zze(com.google.android.libraries.places.internal.zzkm zzkmVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, android.graphics.Bitmap bitmap) {
        try {
            zzkmVar.zzb(bitmap);
            taskCompletionSource.trySetResult(zzkmVar.zza());
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    public final com.google.android.gms.tasks.Task zzb(com.google.android.libraries.places.internal.zzgi zzgiVar, final com.google.android.libraries.places.internal.zzkm zzkmVar) {
        java.lang.String zzd = zzgiVar.zzd();
        java.util.Map zzc = zzgiVar.zzc();
        com.google.android.gms.tasks.CancellationToken zzb = zzgiVar.zzb();
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = zzb != null ? new com.google.android.gms.tasks.TaskCompletionSource(zzb) : new com.google.android.gms.tasks.TaskCompletionSource();
        final com.google.android.libraries.places.internal.zzgc zzgcVar = new com.google.android.libraries.places.internal.zzgc(this, zzd, new com.android.volley.Response.Listener() { // from class: com.google.android.libraries.places.internal.zzge
            @Override // com.android.volley.Response.Listener
            public final /* synthetic */ void onResponse(java.lang.Object obj) {
                com.google.android.libraries.places.internal.zzgg.zze(com.google.android.libraries.places.internal.zzkm.this, taskCompletionSource, (android.graphics.Bitmap) obj);
            }
        }, 0, 0, android.widget.ImageView.ScaleType.CENTER, android.graphics.Bitmap.Config.ARGB_8888, new com.android.volley.Response.ErrorListener() { // from class: com.google.android.libraries.places.internal.zzgd
            @Override // com.android.volley.Response.ErrorListener
            public final /* synthetic */ void onErrorResponse(com.android.volley.VolleyError volleyError) {
                com.google.android.libraries.places.internal.zzgg.zzd(com.google.android.gms.tasks.TaskCompletionSource.this, volleyError);
            }
        }, zzc);
        if (zzb != null) {
            zzb.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzgf
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    com.android.volley.toolbox.ImageRequest.this.cancel();
                }
            });
        }
        this.zza.add(zzgcVar);
        return taskCompletionSource.getTask();
    }

    zzgg(com.android.volley.RequestQueue requestQueue) {
        this.zza = requestQueue;
    }
}
