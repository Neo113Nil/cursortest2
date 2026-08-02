package com.google.android.gms.common.api.internal;

/* loaded from: classes8.dex */
final class zaap extends com.google.android.gms.common.api.internal.zaav {
    final /* synthetic */ com.google.android.gms.common.api.internal.zaaw zaa;
    private final java.util.ArrayList zac;

    @Override // com.google.android.gms.common.api.internal.zaav
    public final void zaa() {
        com.google.android.gms.common.api.internal.zabi zabiVar;
        com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor;
        com.google.android.gms.common.api.internal.zabi zabiVar2;
        com.google.android.gms.common.api.internal.zaaw zaawVar = this.zaa;
        zabiVar = zaawVar.zaa;
        zabiVar.zag.zad = com.google.android.gms.common.api.internal.zaaw.zao(zaawVar);
        java.util.ArrayList arrayList = this.zac;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.common.api.Api.Client client = (com.google.android.gms.common.api.Api.Client) arrayList.get(i);
            com.google.android.gms.common.api.internal.zaaw zaawVar2 = this.zaa;
            iAccountAccessor = zaawVar2.zao;
            zabiVar2 = zaawVar2.zaa;
            client.getRemoteService(iAccountAccessor, zabiVar2.zag.zad);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaap(com.google.android.gms.common.api.internal.zaaw zaawVar, java.util.ArrayList arrayList) {
        super(zaawVar, null);
        this.zaa = zaawVar;
        this.zac = arrayList;
    }
}
