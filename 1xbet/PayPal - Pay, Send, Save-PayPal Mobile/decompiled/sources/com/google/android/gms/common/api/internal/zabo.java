package com.google.android.gms.common.api.internal;

/* loaded from: classes3.dex */
final class zabo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabp zaa;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.common.api.Api.Client client;
        com.google.android.gms.common.api.Api.Client client2;
        com.google.android.gms.common.api.internal.zabq zabqVar = this.zaa.zaa;
        client = zabqVar.zac;
        client2 = zabqVar.zac;
        client.disconnect(java.lang.String.valueOf(client2.getClass().getName()).concat(" disconnecting because it was signed out."));
    }

    zabo(com.google.android.gms.common.api.internal.zabp zabpVar) {
        this.zaa = zabpVar;
    }
}
