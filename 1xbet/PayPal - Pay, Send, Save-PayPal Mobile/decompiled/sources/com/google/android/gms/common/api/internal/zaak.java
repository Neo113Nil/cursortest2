package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
final class zaak implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight;
        android.content.Context context;
        com.google.android.gms.common.api.internal.zaaw zaawVar = this.zaa;
        googleApiAvailabilityLight = zaawVar.zad;
        context = zaawVar.zac;
        googleApiAvailabilityLight.cancelAvailabilityErrorNotifications(context);
    }

    zaak(com.google.android.gms.common.api.internal.zaaw zaawVar) {
        this.zaa = zaawVar;
    }
}
