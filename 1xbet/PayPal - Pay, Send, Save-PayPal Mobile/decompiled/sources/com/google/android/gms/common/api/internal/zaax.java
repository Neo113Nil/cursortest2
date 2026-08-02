package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
public final class zaax implements com.google.android.gms.common.api.internal.zabf {

    @org.checkerframework.checker.initialization.qual.NotOnlyInitialized
    private final com.google.android.gms.common.api.internal.zabi zaa;

    @Override // com.google.android.gms.common.api.internal.zabf
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaa(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        this.zaa.zag.zaa.add(apiMethodImpl);
        return apiMethodImpl;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zab(com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        throw new java.lang.IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
        java.util.Iterator it = this.zaa.zaa.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.Api.Client) it.next()).disconnect();
        }
        this.zaa.zag.zad = java.util.Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        this.zaa.zaj();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(android.os.Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(com.google.android.gms.common.ConnectionResult connectionResult, com.google.android.gms.common.api.Api api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        return true;
    }

    public zaax(com.google.android.gms.common.api.internal.zabi zabiVar) {
        this.zaa = zabiVar;
    }
}
