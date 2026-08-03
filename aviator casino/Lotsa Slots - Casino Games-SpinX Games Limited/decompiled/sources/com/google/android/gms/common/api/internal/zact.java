package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
public final class zact extends com.google.android.gms.signin.internal.zac implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener {
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zaa = com.google.android.gms.signin.zad.zac;
    private final android.content.Context zab;
    private final android.os.Handler zac;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder zad;
    private final java.util.Set zae;
    private final com.google.android.gms.common.internal.ClientSettings zaf;
    private com.google.android.gms.signin.zae zag;
    private com.google.android.gms.common.api.internal.zacs zah;

    public zact(android.content.Context context, android.os.Handler handler, com.google.android.gms.common.internal.ClientSettings clientSettings) {
        com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder = zaa;
        this.zab = context;
        this.zac = handler;
        this.zaf = (com.google.android.gms.common.internal.ClientSettings) com.google.android.gms.common.internal.Preconditions.checkNotNull(clientSettings, "ClientSettings must not be null");
        this.zae = clientSettings.getRequiredScopes();
        this.zad = abstractClientBuilder;
    }

    static /* bridge */ /* synthetic */ void zad(com.google.android.gms.common.api.internal.zact zactVar, com.google.android.gms.signin.internal.zak zakVar) {
        com.google.android.gms.common.ConnectionResult zaa2 = zakVar.zaa();
        if (zaa2.isSuccess()) {
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) com.google.android.gms.common.internal.Preconditions.checkNotNull(zakVar.zab());
            com.google.android.gms.common.ConnectionResult zaa3 = zavVar.zaa();
            if (!zaa3.isSuccess()) {
                java.lang.String valueOf = java.lang.String.valueOf(java.lang.String.valueOf(zaa3));
                android.util.Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new java.lang.Exception());
                zactVar.zah.zae(zaa3);
                zactVar.zag.disconnect();
                return;
            }
            zactVar.zah.zaf(zavVar.zab(), zactVar.zae);
        } else {
            zactVar.zah.zae(zaa2);
        }
        zactVar.zag.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        this.zag.zad(this);
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.zah.zae(connectionResult);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zah.zag(i);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void zab(com.google.android.gms.signin.internal.zak zakVar) {
        this.zac.post(new com.google.android.gms.common.api.internal.zacr(this, zakVar));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    public final void zae(com.google.android.gms.common.api.internal.zacs zacsVar) {
        com.google.android.gms.signin.zae zaeVar = this.zag;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
        this.zaf.zae(java.lang.Integer.valueOf(java.lang.System.identityHashCode(this)));
        com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder = this.zad;
        android.content.Context context = this.zab;
        android.os.Handler handler = this.zac;
        com.google.android.gms.common.internal.ClientSettings clientSettings = this.zaf;
        this.zag = abstractClientBuilder.buildClient(context, handler.getLooper(), clientSettings, (com.google.android.gms.common.internal.ClientSettings) clientSettings.zaa(), (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) this, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) this);
        this.zah = zacsVar;
        java.util.Set set = this.zae;
        if (set == null || set.isEmpty()) {
            this.zac.post(new com.google.android.gms.common.api.internal.zacq(this));
        } else {
            this.zag.zab();
        }
    }

    public final void zaf() {
        com.google.android.gms.signin.zae zaeVar = this.zag;
        if (zaeVar != null) {
            zaeVar.disconnect();
        }
    }
}
