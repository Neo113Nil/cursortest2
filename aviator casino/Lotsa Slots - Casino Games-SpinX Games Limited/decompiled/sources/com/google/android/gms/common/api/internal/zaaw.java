package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
public final class zaaw implements com.google.android.gms.common.api.internal.zabf {
    private final com.google.android.gms.common.api.internal.zabi zaa;
    private final java.util.concurrent.locks.Lock zab;
    private final android.content.Context zac;
    private final com.google.android.gms.common.GoogleApiAvailabilityLight zad;
    private com.google.android.gms.common.ConnectionResult zae;
    private int zaf;
    private int zah;
    private com.google.android.gms.signin.zae zak;
    private boolean zal;
    private boolean zam;
    private boolean zan;
    private com.google.android.gms.common.internal.IAccountAccessor zao;
    private boolean zap;
    private boolean zaq;
    private final com.google.android.gms.common.internal.ClientSettings zar;
    private final java.util.Map zas;
    private final com.google.android.gms.common.api.Api.AbstractClientBuilder zat;
    private int zag = 0;
    private final android.os.Bundle zai = new android.os.Bundle();
    private final java.util.Set zaj = new java.util.HashSet();
    private final java.util.ArrayList zau = new java.util.ArrayList();

    public zaaw(com.google.android.gms.common.api.internal.zabi zabiVar, com.google.android.gms.common.internal.ClientSettings clientSettings, java.util.Map map, com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder, java.util.concurrent.locks.Lock lock, android.content.Context context) {
        this.zaa = zabiVar;
        this.zar = clientSettings;
        this.zas = map;
        this.zad = googleApiAvailabilityLight;
        this.zat = abstractClientBuilder;
        this.zab = lock;
        this.zac = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaA() {
        this.zam = false;
        this.zaa.zag.zad = java.util.Collections.emptySet();
        for (com.google.android.gms.common.api.Api.AnyClientKey anyClientKey : this.zaj) {
            if (!this.zaa.zab.containsKey(anyClientKey)) {
                com.google.android.gms.common.api.internal.zabi zabiVar = this.zaa;
                zabiVar.zab.put(anyClientKey, new com.google.android.gms.common.ConnectionResult(17, null));
            }
        }
    }

    private final void zaB(boolean z) {
        com.google.android.gms.signin.zae zaeVar = this.zak;
        if (zaeVar != null) {
            if (zaeVar.isConnected() && z) {
                zaeVar.zaa();
            }
            zaeVar.disconnect();
            this.zao = null;
        }
    }

    private final void zaC() {
        this.zaa.zai();
        com.google.android.gms.common.api.internal.zabj.zaa().execute(new com.google.android.gms.common.api.internal.zaak(this));
        com.google.android.gms.signin.zae zaeVar = this.zak;
        if (zaeVar != null) {
            if (this.zap) {
                zaeVar.zac((com.google.android.gms.common.internal.IAccountAccessor) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zao), this.zaq);
            }
            zaB(false);
        }
        java.util.Iterator it = this.zaa.zab.keySet().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.Api.Client) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.api.Api.Client) this.zaa.zaa.get((com.google.android.gms.common.api.Api.AnyClientKey) it.next()))).disconnect();
        }
        this.zaa.zah.zab(this.zai.isEmpty() ? null : this.zai);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaD(com.google.android.gms.common.ConnectionResult connectionResult) {
        zaz();
        zaB(!connectionResult.hasResolution());
        this.zaa.zak(connectionResult);
        this.zaa.zah.zaa(connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaE(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api api, boolean z) {
        int priority = api.zac().getPriority();
        if ((!z || connectionResult.hasResolution() || this.zad.getErrorResolutionIntent(connectionResult.getErrorCode()) != null) && (this.zae == null || priority < this.zaf)) {
            this.zae = connectionResult;
            this.zaf = priority;
        }
        com.google.android.gms.common.api.internal.zabi zabiVar = this.zaa;
        zabiVar.zab.put(api.zab(), connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaF() {
        if (this.zah != 0) {
            return;
        }
        if (!this.zam || this.zan) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.zag = 1;
            this.zah = this.zaa.zaa.size();
            for (com.google.android.gms.common.api.Api.AnyClientKey anyClientKey : this.zaa.zaa.keySet()) {
                if (!this.zaa.zab.containsKey(anyClientKey)) {
                    arrayList.add((com.google.android.gms.common.api.Api.Client) this.zaa.zaa.get(anyClientKey));
                } else if (zaH()) {
                    zaC();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.zau.add(com.google.android.gms.common.api.internal.zabj.zaa().submit(new com.google.android.gms.common.api.internal.zaap(this, arrayList)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaG(int i) {
        if (this.zag == i) {
            return true;
        }
        android.util.Log.w("GACConnecting", this.zaa.zag.zaf());
        android.util.Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        android.util.Log.w("GACConnecting", "mRemainingConnections=" + this.zah);
        android.util.Log.e("GACConnecting", "GoogleApiClient connecting is in step " + zaJ(this.zag) + " but received callback for step " + zaJ(i), new java.lang.Exception());
        zaD(new com.google.android.gms.common.ConnectionResult(8, null));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaH() {
        int i = this.zah - 1;
        this.zah = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            android.util.Log.w("GACConnecting", this.zaa.zag.zaf());
            android.util.Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new java.lang.Exception());
            zaD(new com.google.android.gms.common.ConnectionResult(8, null));
            return false;
        }
        com.google.android.gms.common.ConnectionResult connectionResult = this.zae;
        if (connectionResult == null) {
            return true;
        }
        this.zaa.zaf = this.zaf;
        zaD(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaI(com.google.android.gms.common.ConnectionResult connectionResult) {
        return this.zal && !connectionResult.hasResolution();
    }

    private static final java.lang.String zaJ(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    static /* bridge */ /* synthetic */ java.util.Set zao(com.google.android.gms.common.api.internal.zaaw zaawVar) {
        com.google.android.gms.common.internal.ClientSettings clientSettings = zaawVar.zar;
        if (clientSettings == null) {
            return java.util.Collections.emptySet();
        }
        java.util.HashSet hashSet = new java.util.HashSet(clientSettings.getRequiredScopes());
        java.util.Map zad = zaawVar.zar.zad();
        for (com.google.android.gms.common.api.Api api : zad.keySet()) {
            com.google.android.gms.common.api.internal.zabi zabiVar = zaawVar.zaa;
            if (!zabiVar.zab.containsKey(api.zab())) {
                hashSet.addAll(((com.google.android.gms.common.internal.zab) zad.get(api)).zaa);
            }
        }
        return hashSet;
    }

    static /* bridge */ /* synthetic */ void zar(com.google.android.gms.common.api.internal.zaaw zaawVar, com.google.android.gms.signin.internal.zak zakVar) {
        if (zaawVar.zaG(0)) {
            com.google.android.gms.common.ConnectionResult zaa = zakVar.zaa();
            if (!zaa.isSuccess()) {
                if (!zaawVar.zaI(zaa)) {
                    zaawVar.zaD(zaa);
                    return;
                } else {
                    zaawVar.zaA();
                    zaawVar.zaF();
                    return;
                }
            }
            com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) com.google.android.gms.common.internal.Preconditions.checkNotNull(zakVar.zab());
            com.google.android.gms.common.ConnectionResult zaa2 = zavVar.zaa();
            if (!zaa2.isSuccess()) {
                java.lang.String valueOf = java.lang.String.valueOf(java.lang.String.valueOf(zaa2));
                android.util.Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new java.lang.Exception());
                zaawVar.zaD(zaa2);
                return;
            }
            zaawVar.zan = true;
            zaawVar.zao = (com.google.android.gms.common.internal.IAccountAccessor) com.google.android.gms.common.internal.Preconditions.checkNotNull(zavVar.zab());
            zaawVar.zap = zavVar.zac();
            zaawVar.zaq = zavVar.zad();
            zaawVar.zaF();
        }
    }

    private final void zaz() {
        java.util.ArrayList arrayList = this.zau;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((java.util.concurrent.Future) arrayList.get(i)).cancel(true);
        }
        this.zau.clear();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaa(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zaa.zag.zaa.add(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zab(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
        this.zaa.zab.clear();
        this.zam = false;
        com.google.android.gms.common.api.internal.zaas zaasVar = null;
        this.zae = null;
        this.zag = 0;
        this.zal = true;
        this.zan = false;
        this.zap = false;
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z = false;
        for (com.google.android.gms.common.api.Api api : this.zas.keySet()) {
            com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client) com.google.android.gms.common.internal.Preconditions.checkNotNull((com.google.android.gms.common.api.Api.Client) this.zaa.zaa.get(api.zab()));
            z |= api.zac().getPriority() == 1;
            boolean booleanValue = ((java.lang.Boolean) this.zas.get(api)).booleanValue();
            if (client.requiresSignIn()) {
                this.zam = true;
                if (booleanValue) {
                    this.zaj.add(api.zab());
                } else {
                    this.zal = false;
                }
            }
            hashMap.put(client, new com.google.android.gms.common.api.internal.zaal(this, api, booleanValue));
        }
        if (z) {
            this.zam = false;
        }
        if (this.zam) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zar);
            com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zat);
            this.zar.zae(java.lang.Integer.valueOf(java.lang.System.identityHashCode(this.zaa.zag)));
            com.google.android.gms.common.api.internal.zaat zaatVar = new com.google.android.gms.common.api.internal.zaat(this, zaasVar);
            com.google.android.gms.common.api.Api.AbstractClientBuilder abstractClientBuilder = this.zat;
            android.content.Context context = this.zac;
            com.google.android.gms.common.api.internal.zabi zabiVar = this.zaa;
            com.google.android.gms.common.internal.ClientSettings clientSettings = this.zar;
            this.zak = abstractClientBuilder.buildClient(context, zabiVar.zag.getLooper(), clientSettings, (com.google.android.gms.common.internal.ClientSettings) clientSettings.zaa(), (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks) zaatVar, (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener) zaatVar);
        }
        this.zah = this.zaa.zaa.size();
        this.zau.add(com.google.android.gms.common.api.internal.zabj.zaa().submit(new com.google.android.gms.common.api.internal.zaao(this, hashMap)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(android.os.Bundle bundle) {
        if (zaG(1)) {
            if (bundle != null) {
                this.zai.putAll(bundle);
            }
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api api, boolean z) {
        if (zaG(1)) {
            zaE(connectionResult, api, z);
            if (zaH()) {
                zaC();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i) {
        zaD(new com.google.android.gms.common.ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        zaz();
        zaB(true);
        this.zaa.zak(null);
        return true;
    }
}
