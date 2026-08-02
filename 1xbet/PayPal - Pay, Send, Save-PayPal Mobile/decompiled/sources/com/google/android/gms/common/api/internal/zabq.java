package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
public final class zabq implements com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.common.api.internal.zau {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.Api.Client zac;
    private final com.google.android.gms.common.api.internal.ApiKey zad;
    private final com.google.android.gms.common.api.internal.zaad zae;
    private final int zah;
    private final com.google.android.gms.common.api.internal.zact zai;
    private boolean zaj;
    private final java.util.Queue zab = new java.util.LinkedList();
    private final java.util.Set zaf = new java.util.HashSet();
    private final java.util.Map zag = new java.util.HashMap();
    private final java.util.List zak = new java.util.ArrayList();
    private com.google.android.gms.common.ConnectionResult zal = null;
    private int zam = 0;

    public zabq(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager, com.google.android.gms.common.api.GoogleApi googleApi) {
        this.zaa = googleApiManager;
        com.google.android.gms.common.api.Api.Client zab = googleApi.zab(googleApiManager.zar.getLooper(), this);
        this.zac = zab;
        this.zad = googleApi.getApiKey();
        this.zae = new com.google.android.gms.common.api.internal.zaad();
        this.zah = googleApi.zaa();
        if (zab.requiresSignIn()) {
            this.zai = googleApi.zac(googleApiManager.zai, googleApiManager.zar);
        } else {
            this.zai = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final com.google.android.gms.common.Feature zaC(com.google.android.gms.common.Feature[] featureArr) {
        if (featureArr == null || featureArr.length == 0) {
            return null;
        }
        com.google.android.gms.common.Feature[] availableFeatures = this.zac.getAvailableFeatures();
        if (availableFeatures == null) {
            availableFeatures = new com.google.android.gms.common.Feature[0];
        }
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(availableFeatures.length);
        for (com.google.android.gms.common.Feature feature : availableFeatures) {
            arrayMap.put(feature.getName(), java.lang.Long.valueOf(feature.getVersion()));
        }
        for (com.google.android.gms.common.Feature feature2 : featureArr) {
            java.lang.Long l = (java.lang.Long) arrayMap.get(feature2.getName());
            if (l == null || l.longValue() < feature2.getVersion()) {
                return feature2;
            }
        }
        return null;
    }

    private final void zaD(com.google.android.gms.common.ConnectionResult connectionResult) {
        java.util.Iterator it = this.zaf.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.zal) it.next()).zac(this.zad, connectionResult, com.google.android.gms.common.internal.Objects.equal(connectionResult, com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS) ? this.zac.getEndpointPackageName() : null);
        }
        this.zaf.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaE(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        zaF(status, null, false);
    }

    private final void zaF(com.google.android.gms.common.api.Status status, java.lang.Exception exc, boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        if ((status == null) == (exc == null)) {
            throw new java.lang.IllegalArgumentException("Status XOR exception should be null");
        }
        java.util.Iterator it = this.zab.iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.internal.zai zaiVar = (com.google.android.gms.common.api.internal.zai) it.next();
            if (!z || zaiVar.zac == 2) {
                if (status != null) {
                    zaiVar.zad(status);
                } else {
                    zaiVar.zae(exc);
                }
                it.remove();
            }
        }
    }

    private final void zaG() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.zab);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.common.api.internal.zai zaiVar = (com.google.android.gms.common.api.internal.zai) arrayList.get(i);
            if (!this.zac.isConnected()) {
                return;
            }
            if (zaM(zaiVar)) {
                this.zab.remove(zaiVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaH() {
        zan();
        zaD(com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS);
        zaL();
        java.util.Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.api.internal.zaci zaciVar = (com.google.android.gms.common.api.internal.zaci) it.next();
            if (zaC(zaciVar.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    zaciVar.zaa.registerListener(this.zac, new com.google.android.gms.tasks.TaskCompletionSource<>());
                } catch (android.os.DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.zac.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (android.os.RemoteException unused2) {
                    it.remove();
                }
            }
        }
        zaG();
        zaJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaI(int i) {
        zan();
        this.zaj = true;
        this.zae.zae(i, this.zac.getLastDisconnectMessage());
        com.google.android.gms.common.api.internal.ApiKey apiKey = this.zad;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zar.sendMessageDelayed(android.os.Message.obtain(googleApiManager.zar, 9, apiKey), 5000L);
        com.google.android.gms.common.api.internal.ApiKey apiKey2 = this.zad;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zar.sendMessageDelayed(android.os.Message.obtain(googleApiManager2.zar, 11, apiKey2), 120000L);
        this.zaa.zak.zac();
        java.util.Iterator it = this.zag.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.internal.zaci) it.next()).zac.run();
        }
    }

    private final void zaJ() {
        this.zaa.zar.removeMessages(12, this.zad);
        com.google.android.gms.common.api.internal.ApiKey apiKey = this.zad;
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zar.sendMessageDelayed(googleApiManager.zar.obtainMessage(12, apiKey), this.zaa.zae);
    }

    private final void zaK(com.google.android.gms.common.api.internal.zai zaiVar) {
        zaiVar.zag(this.zae, zaA());
        try {
            zaiVar.zaf(this);
        } catch (android.os.DeadObjectException unused) {
            onConnectionSuspended(1);
            this.zac.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void zaL() {
        if (this.zaj) {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zar.removeMessages(11, this.zad);
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
            googleApiManager2.zar.removeMessages(9, this.zad);
            this.zaj = false;
        }
    }

    private final boolean zaM(com.google.android.gms.common.api.internal.zai zaiVar) {
        if (!(zaiVar instanceof com.google.android.gms.common.api.internal.zac)) {
            zaK(zaiVar);
            return true;
        }
        com.google.android.gms.common.api.internal.zac zacVar = (com.google.android.gms.common.api.internal.zac) zaiVar;
        com.google.android.gms.common.Feature zaC = zaC(zacVar.zab(this));
        if (zaC == null) {
            zaK(zaiVar);
            return true;
        }
        android.util.Log.w("GoogleApiManager", this.zac.getClass().getName() + " could not execute call because it requires feature (" + zaC.getName() + ", " + zaC.getVersion() + ").");
        if (!this.zaa.zas || !zacVar.zaa(this)) {
            zacVar.zae(new com.google.android.gms.common.api.UnsupportedApiCallException(zaC));
            return true;
        }
        com.google.android.gms.common.api.internal.zabs zabsVar = new com.google.android.gms.common.api.internal.zabs(this.zad, zaC, null);
        int indexOf = this.zak.indexOf(zabsVar);
        if (indexOf >= 0) {
            com.google.android.gms.common.api.internal.zabs zabsVar2 = (com.google.android.gms.common.api.internal.zabs) this.zak.get(indexOf);
            this.zaa.zar.removeMessages(15, zabsVar2);
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zar.sendMessageDelayed(android.os.Message.obtain(googleApiManager.zar, 15, zabsVar2), 5000L);
            return false;
        }
        this.zak.add(zabsVar);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zar.sendMessageDelayed(android.os.Message.obtain(googleApiManager2.zar, 15, zabsVar), 5000L);
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager3 = this.zaa;
        googleApiManager3.zar.sendMessageDelayed(android.os.Message.obtain(googleApiManager3.zar, 16, zabsVar), 120000L);
        com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(2, null);
        if (zaN(connectionResult)) {
            return false;
        }
        this.zaa.zaE(connectionResult, this.zah);
        return false;
    }

    private final boolean zaN(com.google.android.gms.common.ConnectionResult connectionResult) {
        synchronized (com.google.android.gms.common.api.internal.GoogleApiManager.zac) {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            if (googleApiManager.zao == null || !googleApiManager.zap.contains(this.zad)) {
                return false;
            }
            this.zaa.zao.zah(connectionResult, this.zah);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zaO(boolean z) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        if (!this.zac.isConnected() || !this.zag.isEmpty()) {
            return false;
        }
        if (!this.zae.zag()) {
            this.zac.disconnect("Timing out service connection.");
            return true;
        }
        if (!z) {
            return false;
        }
        zaJ();
        return false;
    }

    static /* synthetic */ void zal(com.google.android.gms.common.api.internal.zabq zabqVar, com.google.android.gms.common.api.internal.zabs zabsVar) {
        if (zabqVar.zak.contains(zabsVar) && !zabqVar.zaj) {
            if (zabqVar.zac.isConnected()) {
                zabqVar.zaG();
            } else {
                zabqVar.zao();
            }
        }
    }

    static /* synthetic */ void zam(com.google.android.gms.common.api.internal.zabq zabqVar, com.google.android.gms.common.api.internal.zabs zabsVar) {
        com.google.android.gms.common.Feature feature;
        com.google.android.gms.common.Feature[] zab;
        if (zabqVar.zak.remove(zabsVar)) {
            zabqVar.zaa.zar.removeMessages(15, zabsVar);
            zabqVar.zaa.zar.removeMessages(16, zabsVar);
            feature = zabsVar.zab;
            java.util.ArrayList arrayList = new java.util.ArrayList(zabqVar.zab.size());
            for (com.google.android.gms.common.api.internal.zai zaiVar : zabqVar.zab) {
                if ((zaiVar instanceof com.google.android.gms.common.api.internal.zac) && (zab = ((com.google.android.gms.common.api.internal.zac) zaiVar).zab(zabqVar)) != null && com.google.android.gms.common.util.ArrayUtils.contains(zab, feature)) {
                    arrayList.add(zaiVar);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                com.google.android.gms.common.api.internal.zai zaiVar2 = (com.google.android.gms.common.api.internal.zai) arrayList.get(i);
                zabqVar.zab.remove(zaiVar2);
                zaiVar2.zae(new com.google.android.gms.common.api.UnsupportedApiCallException(feature));
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(android.os.Bundle bundle) {
        if (android.os.Looper.myLooper() == this.zaa.zar.getLooper()) {
            zaH();
        } else {
            this.zaa.zar.post(new com.google.android.gms.common.api.internal.zabm(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(com.google.android.gms.common.ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        if (android.os.Looper.myLooper() == this.zaa.zar.getLooper()) {
            zaI(i);
        } else {
            this.zaa.zar.post(new com.google.android.gms.common.api.internal.zabn(this, i));
        }
    }

    public final boolean zaA() {
        return this.zac.requiresSignIn();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean zaB() {
        return zaO(true);
    }

    public final com.google.android.gms.common.ConnectionResult zad() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        return this.zal;
    }

    public final void zan() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        this.zal = null;
    }

    public final void zao() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.zac.isConnected() || this.zac.isConnecting()) {
            return;
        }
        try {
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            int zab = googleApiManager.zak.zab(googleApiManager.zai, this.zac);
            if (zab != 0) {
                com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(zab, null);
                android.util.Log.w("GoogleApiManager", "The service for " + this.zac.getClass().getName() + " is not available: " + connectionResult.toString());
                zar(connectionResult, null);
                return;
            }
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
            com.google.android.gms.common.api.Api.Client client = this.zac;
            com.google.android.gms.common.api.internal.zabu zabuVar = new com.google.android.gms.common.api.internal.zabu(googleApiManager2, client, this.zad);
            if (client.requiresSignIn()) {
                ((com.google.android.gms.common.api.internal.zact) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zai)).zae(zabuVar);
            }
            try {
                this.zac.connect(zabuVar);
            } catch (java.lang.SecurityException e) {
                zar(new com.google.android.gms.common.ConnectionResult(10), e);
            }
        } catch (java.lang.IllegalStateException e2) {
            zar(new com.google.android.gms.common.ConnectionResult(10), e2);
        }
    }

    public final void zap(com.google.android.gms.common.api.internal.zai zaiVar) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.zac.isConnected()) {
            if (zaM(zaiVar)) {
                zaJ();
                return;
            } else {
                this.zab.add(zaiVar);
                return;
            }
        }
        this.zab.add(zaiVar);
        com.google.android.gms.common.ConnectionResult connectionResult = this.zal;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zao();
        } else {
            zar(this.zal, null);
        }
    }

    public final void zar(com.google.android.gms.common.ConnectionResult connectionResult, java.lang.Exception exc) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        com.google.android.gms.common.api.internal.zact zactVar = this.zai;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        this.zaa.zak.zac();
        zaD(connectionResult);
        if ((this.zac instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            this.zaa.zaf = true;
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            googleApiManager.zar.sendMessageDelayed(googleApiManager.zar.obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zab);
            return;
        }
        if (this.zab.isEmpty()) {
            this.zal = connectionResult;
            return;
        }
        if (exc != null) {
            com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
            zaF(null, exc, false);
            return;
        }
        if (!this.zaa.zas) {
            zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zaF(this.zad, connectionResult));
            return;
        }
        zaF(com.google.android.gms.common.api.internal.GoogleApiManager.zaF(this.zad, connectionResult), null, true);
        if (this.zab.isEmpty() || zaN(connectionResult) || this.zaa.zaE(connectionResult, this.zah)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.zaj = true;
        }
        if (!this.zaj) {
            zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zaF(this.zad, connectionResult));
            return;
        }
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager2 = this.zaa;
        googleApiManager2.zar.sendMessageDelayed(android.os.Message.obtain(googleApiManager2.zar, 9, this.zad), 5000L);
    }

    public final void zas(com.google.android.gms.common.ConnectionResult connectionResult) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        com.google.android.gms.common.api.Api.Client client = this.zac;
        client.disconnect("onSignInFailed for " + client.getClass().getName() + " with " + java.lang.String.valueOf(connectionResult));
        zar(connectionResult, null);
    }

    public final void zat(com.google.android.gms.common.api.internal.zal zalVar) {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        this.zaf.add(zalVar);
    }

    public final void zau() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.zaj) {
            zao();
        }
    }

    public final void zav() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        zaE(com.google.android.gms.common.api.internal.GoogleApiManager.zaa);
        this.zae.zaf();
        for (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey : (com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[]) this.zag.keySet().toArray(new com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey[0])) {
            zap(new com.google.android.gms.common.api.internal.zah(listenerKey, new com.google.android.gms.tasks.TaskCompletionSource()));
        }
        zaD(new com.google.android.gms.common.ConnectionResult(4));
        if (this.zac.isConnected()) {
            this.zac.onUserSignOut(new com.google.android.gms.common.api.internal.zabp(this));
        }
    }

    public final void zaw() {
        com.google.android.gms.common.internal.Preconditions.checkHandlerThread(this.zaa.zar);
        if (this.zaj) {
            zaL();
            com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
            zaE(googleApiManager.zaj.isGooglePlayServicesAvailable(googleApiManager.zai) == 18 ? new com.google.android.gms.common.api.Status(21, "Connection timed out waiting for Google Play services update to complete.") : new com.google.android.gms.common.api.Status(22, "API failed to connect while resuming due to an unknown error."));
            this.zac.disconnect("Timing out connection while resuming.");
        }
    }

    final boolean zaz() {
        return this.zac.isConnected();
    }

    final void zaq() {
        this.zam++;
    }

    public final java.util.Map zah() {
        return this.zag;
    }

    public final com.google.android.gms.common.api.Api.Client zaf() {
        return this.zac;
    }

    final int zac() {
        return this.zam;
    }

    public final int zab() {
        return this.zah;
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api api, boolean z) {
        throw null;
    }
}
