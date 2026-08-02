package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzga {
    private final com.android.volley.RequestQueue zza;
    private final com.google.android.libraries.places.internal.zzlc zzb;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zzd(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.android.volley.VolleyError volleyError) {
        try {
            taskCompletionSource.trySetException(com.google.android.libraries.places.internal.zzfu.zza(volleyError));
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            com.google.android.libraries.places.internal.zznb.zzb(e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzb(java.lang.Class cls, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, org.json.JSONObject jSONObject) {
        try {
            try {
                taskCompletionSource.trySetResult((com.google.android.libraries.places.internal.zzgj) this.zzb.zza(jSONObject.toString(), cls));
            } catch (com.google.android.libraries.places.internal.zzgk e) {
                taskCompletionSource.trySetException(new com.google.android.gms.common.api.ApiException(new com.google.android.gms.common.api.Status(8, e.getMessage())));
            }
        } catch (java.lang.Error | java.lang.RuntimeException e2) {
            com.google.android.libraries.places.internal.zznb.zzb(e2);
            throw e2;
        }
    }

    public final com.google.android.gms.tasks.Task zza(com.google.android.libraries.places.internal.zzgi zzgiVar, final java.lang.Class cls) {
        java.lang.String zzd = zzgiVar.zzd();
        java.util.Map zzc = zzgiVar.zzc();
        com.google.android.gms.tasks.CancellationToken zzb = zzgiVar.zzb();
        final com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = zzb != null ? new com.google.android.gms.tasks.TaskCompletionSource(zzb) : new com.google.android.gms.tasks.TaskCompletionSource();
        final com.google.android.libraries.places.internal.zzfw zzfwVar = new com.google.android.libraries.places.internal.zzfw(this, 0, zzd, null, new com.android.volley.Response.Listener() { // from class: com.google.android.libraries.places.internal.zzfy
            @Override // com.android.volley.Response.Listener
            public final /* synthetic */ void onResponse(java.lang.Object obj) {
                com.google.android.libraries.places.internal.zzga.this.zzb(cls, taskCompletionSource, (org.json.JSONObject) obj);
            }
        }, new com.android.volley.Response.ErrorListener() { // from class: com.google.android.libraries.places.internal.zzfx
            @Override // com.android.volley.Response.ErrorListener
            public final /* synthetic */ void onErrorResponse(com.android.volley.VolleyError volleyError) {
                com.google.android.libraries.places.internal.zzga.zzd(com.google.android.gms.tasks.TaskCompletionSource.this, volleyError);
            }
        }, zzc);
        if (zzb != null) {
            zzb.onCanceledRequested(new com.google.android.gms.tasks.OnTokenCanceledListener() { // from class: com.google.android.libraries.places.internal.zzfz
                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final /* synthetic */ void onCanceled() {
                    com.android.volley.toolbox.JsonObjectRequest.this.cancel();
                }
            });
        }
        this.zza.add(zzfwVar);
        return taskCompletionSource.getTask();
    }

    zzga(com.android.volley.RequestQueue requestQueue, com.google.android.libraries.places.internal.zzlc zzlcVar) {
        this.zza = requestQueue;
        this.zzb = zzlcVar;
    }
}
