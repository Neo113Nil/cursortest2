package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
final class zaao extends com.google.android.gms.common.api.internal.zaav {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;
    private final java.util.Map zac;

    @Override // com.google.android.gms.common.api.internal.zaav
    public final void zaa() {
        com.google.android.gms.common.GoogleApiAvailabilityLight googleApiAvailabilityLight;
        android.content.Context context;
        boolean z;
        android.content.Context context2;
        com.google.android.gms.common.api.internal.zabi zabiVar;
        com.google.android.gms.signin.zae zaeVar;
        com.google.android.gms.signin.zae zaeVar2;
        com.google.android.gms.common.api.internal.zabi zabiVar2;
        android.content.Context context3;
        boolean z2;
        googleApiAvailabilityLight = this.zaa.zad;
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(googleApiAvailabilityLight);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (com.google.android.gms.common.api.Api.Client client : this.zac.keySet()) {
            if (client.requiresGooglePlayServices()) {
                z2 = ((com.google.android.gms.common.api.internal.zaal) this.zac.get(client)).zac;
                if (!z2) {
                    arrayList.add(client);
                }
            }
            arrayList2.add(client);
        }
        int i = 0;
        int i2 = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i < size) {
                com.google.android.gms.common.api.Api.Client client2 = (com.google.android.gms.common.api.Api.Client) arrayList.get(i);
                context = this.zaa.zac;
                i2 = zalVar.zab(context, client2);
                i++;
                if (i2 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i < size2) {
                com.google.android.gms.common.api.Api.Client client3 = (com.google.android.gms.common.api.Api.Client) arrayList2.get(i);
                context3 = this.zaa.zac;
                i2 = zalVar.zab(context3, client3);
                i++;
                if (i2 == 0) {
                    break;
                }
            }
        }
        if (i2 != 0) {
            com.google.android.gms.common.ConnectionResult connectionResult = new com.google.android.gms.common.ConnectionResult(i2, null);
            com.google.android.gms.common.api.internal.zaaw zaawVar = this.zaa;
            zabiVar2 = zaawVar.zaa;
            zabiVar2.zal(new com.google.android.gms.common.api.internal.zaam(this, zaawVar, connectionResult));
            return;
        }
        com.google.android.gms.common.api.internal.zaaw zaawVar2 = this.zaa;
        z = zaawVar2.zam;
        if (z) {
            zaeVar = zaawVar2.zak;
            if (zaeVar != null) {
                zaeVar2 = zaawVar2.zak;
                zaeVar2.zab();
            }
        }
        for (com.google.android.gms.common.api.Api.Client client4 : this.zac.keySet()) {
            com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks) this.zac.get(client4);
            if (client4.requiresGooglePlayServices()) {
                context2 = this.zaa.zac;
                if (zalVar.zab(context2, client4) != 0) {
                    com.google.android.gms.common.api.internal.zaaw zaawVar3 = this.zaa;
                    zabiVar = zaawVar3.zaa;
                    zabiVar.zal(new com.google.android.gms.common.api.internal.zaan(this, zaawVar3, connectionProgressReportCallbacks));
                }
            }
            client4.connect(connectionProgressReportCallbacks);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaao(com.google.android.gms.common.api.internal.zaaw zaawVar, java.util.Map map) {
        super(zaawVar, null);
        this.zaa = zaawVar;
        this.zac = map;
    }
}
